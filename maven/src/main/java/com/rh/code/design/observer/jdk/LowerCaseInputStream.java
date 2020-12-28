package com.rh.code.design.observer.jdk;

import org.jetbrains.annotations.NotNull;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 转小写输入流
 * jdk中io类中大量使用装饰者
 * 对jdk中的FilterInputStream抽象装饰者编写一个自己的装饰者
 */
class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    /**
     * int c 为读取的内容
     */
    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase(((char) c));
    }

    /**
     * byte[] b 为读取的内容
     */
    @Override
    public int read(@NotNull byte[] b, int off, int len) throws IOException {
        int c = super.read(b, off, len);
        for (int i = off; i < off + c; i++) {
            b[i] = (byte) Character.toLowerCase(((char) b[i]));
        }
        return c;
    }
}

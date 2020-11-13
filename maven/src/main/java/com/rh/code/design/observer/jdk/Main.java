package com.rh.code.design.observer.jdk;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 测试自定义的io类
 * 需要在项目目录下创建一个text.txt文件, 输入大写的内容
 */
class Main {

    public static void main(String[] args) {
        InputStream in = null;
        int c;
        try {
            in = new LowerCaseInputStream( // 装饰类, 将读取的内容转为小写
                    new BufferedInputStream( // 装饰类, 通过缓存优化读取性能
                            new FileInputStream("text.txt") // 被包装类, 具体组件
                    )
            );

            while ((c = in.read()) >= 0) {
                System.out.print(((char) c));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

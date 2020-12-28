package com.rh.code.trycatch;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * try自动关闭资源
 */
public class TryAutoCloseResources {

    public void try_auto_close_resources() throws Exception {
        Demo demo = new Demo();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"))) {
            oos.writeObject(demo);
        }
    }

    public class Demo {
    }

}

/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;

public class Main {
    /*
     * WARNING - void declaration
     */
    public static void main(String[] args2) {
        try {
            Object[] objectArray = new Object[3];
            objectArray[0] = Foreign.VERSION_MAJOR;
            objectArray[1] = Foreign.VERSION_MINOR;
            objectArray[2] = Foreign.VERSION_MICRO;
            System.out.printf("jffi jar version=%d.%d.%d\n", objectArray);
            Foreign f = Foreign.getInstance();
            Object[] objectArray2 = new Object[3];
            objectArray2[0] = Main.v(f, 16);
            objectArray2[1] = Main.v(f, 8);
            objectArray2[2] = Main.v(f, 0);
            System.out.printf("jffi stub version=%d.%d.%d\n", objectArray2);
            System.out.println("memory fault protection enabled=" + Foreign.isMemoryProtectionEnabled());
            System.out.println("stub arch=" + f.getArch());
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = f.getJNIVersion();
            System.out.printf("JNI version=%#x\n", objectArray3);
        }
        catch (Throwable t) {
            void var1_2;
            System.err.println("Error: " + var1_2);
        }
    }

    private static int v(Foreign foreign, int shift) {
        return foreign.getVersion() >> shift & 0xFF;
    }
}


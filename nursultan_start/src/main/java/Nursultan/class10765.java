/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07536
 */
package Nursultan;

import minecraft.class07536;

public class class10765
extends Thread {
    public class10765(String string) {
        super(string);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(Integer.MAX_VALUE);
            }
        }
        catch (InterruptedException interruptedException) {
            class07536.N.warn("Timer hack thread interrupted, that really should not happen");
            return;
        }
    }
}


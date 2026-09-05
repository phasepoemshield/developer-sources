/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11177;

public class class11197
implements AutoCloseable {
    private static byte[] L;
    public static Object[] y;
    public Object N_0;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = false;
        }
    }

    private class11197(boolean bl) {
        this.L();
        this.N_0 = bl;
    }

    static {
        class11197.u();
        class11197.N();
        class11197.y[0] = new class11197(true);
        class11197.y[1] = new class11197(false);
    }

    @Override
    public void close() {
        if (((Boolean)this.N_0).booleanValue()) {
            class11177.y();
        }
    }

    private static void u() {
        L = new byte[1];
        class11197.L[0] = 2;
    }

    private static void N() {
        y = new Object[L[0]];
    }
}


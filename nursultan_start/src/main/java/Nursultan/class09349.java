/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09349 {
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    public class09349() {
        this.i();
    }

    static {
        class09349.u();
        y_0 = new class09349();
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = 0L;
        }
    }

    private static void u() {
    }

    public static class09349 y(long l) {
        ((class09349)class09349.y_0).N_0 = l;
        return (class09349)y_0;
    }

    public class09349 N(long l) {
        this.N_0 = l;
        return this;
    }

    public long N() {
        return (Long)this.N_0;
    }
}


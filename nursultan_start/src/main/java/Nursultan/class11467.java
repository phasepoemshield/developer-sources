/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11467 {
    public Object N_0;

    public class11467() {
        this.u();
        this.N_0 = System.nanoTime();
        this.N();
    }

    private void u() {
        this.N_0 = 0L;
    }

    public long y() {
        return (System.nanoTime() - (Long)this.N_0) / 1000000L;
    }

    public void N() {
        this.N_0 = System.nanoTime();
    }

    public boolean N(long l) {
        return System.nanoTime() - (Long)this.N_0 >= l * 1000000L;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11462 {
    public Object y_0;
    public Object y_1;

    public boolean L() {
        return (Integer)this.y_0 <= 0;
    }

    public int M() {
        return (Integer)this.y_0;
    }

    public class11462(int n, Runnable runnable) {
        this.R();
        this.y_0 = n;
        this.y_1 = runnable;
    }

    public Runnable B() {
        return (Runnable)this.y_1;
    }

    public boolean u() {
        int n = (Integer)this.y_0 - 1;
        this.y_0 = n;
        if (n == 0) {
            ((Runnable)this.y_1).run();
            return true;
        }
        return false;
    }

    private void R() {
        this.y_0 = 0;
    }
}


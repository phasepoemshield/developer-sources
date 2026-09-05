/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09306 {
    public Object y_0;
    public boolean y_init;

    private void L() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = 0;
        }
    }

    public class09306(int n) {
        this.L();
        this.y_0 = n;
    }

    public int y() {
        return (Integer)this.y_0;
    }
}


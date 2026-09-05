/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06709
 */
package minecraft;

import minecraft.class06709;

public abstract class class01303<R extends Runnable>
extends class06709<R> {
    private int N;

    public void M_1(R r) {
        ++this.N;
        try {
            super.M_1(r);
        }
        finally {
            --this.N;
        }
    }

    public class01303(String string) {
        super(string);
    }

    protected boolean yl() {
        return this.N != 0;
    }

    public boolean Y() {
        return this.yl() || super.Y();
    }
}


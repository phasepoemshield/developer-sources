/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07449
 */
package minecraft;

import minecraft.class07079;
import minecraft.class07449;

public class class06282
extends class07449 {
    private final boolean N;
    private int y;

    public void L() {
        this.y = 20;
        this.N(true);
    }

    public class06282(class07079 class070792, boolean bl) {
        super(class070792);
        this.u = class070792;
        this.N = bl;
    }

    public void i() {
        --this.y;
        super.i();
    }

    public void u() {
        this.N(false);
    }

    public boolean y() {
        return this.N && this.y > 0 && super.y();
    }
}


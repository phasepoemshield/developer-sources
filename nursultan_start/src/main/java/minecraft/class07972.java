/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07475
 */
package minecraft;

import minecraft.class07475;
import minecraft.class07999;
import minecraft.class08004;

public class class07972
extends class07999 {
    private final class08004 y;
    private int L;

    @Override
    public void L() {
        super.L();
        this.L = 0;
    }

    public class07972(class08004 class080042, double d, boolean bl) {
        super((class07475)class080042, d, bl);
        this.y = class080042;
    }

    @Override
    public void i() {
        super.i();
        ++this.L;
        if (this.L >= 5 && this.U() < this.E() / 2) {
            this.y.R(true);
        } else {
            this.y.R(false);
        }
    }

    @Override
    public void u() {
        super.u();
        this.y.R(false);
    }
}


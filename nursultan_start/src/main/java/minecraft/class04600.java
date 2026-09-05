/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class04596;
import minecraft.class04626;
import minecraft.class04995;
import minecraft.class06069;

class class04600
extends class04596 {
    private final int L;
    private long u;
    final /* synthetic */ class04626 y;

    public void L() {
        if (this.y.C != null && this.y.method_73183().method_8477(this.y.C) && !this.y.Ng()) {
            this.y.G();
        }
        this.u = this.y.method_73183().N();
    }

    @Override
    public boolean M() {
        return this.y.method_73183().N() > this.u + (long)this.L;
    }

    class04600(class04626 class046262) {
        this.y = class046262;
        super(class046262);
        this.L = class04995.N((class06069)class04626.I(this.y), (int)20, (int)40);
        this.u = -1L;
    }

    @Override
    public boolean Z() {
        return false;
    }
}


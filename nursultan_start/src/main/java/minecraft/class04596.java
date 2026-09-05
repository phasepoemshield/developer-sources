/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07473
 */
package minecraft;

import minecraft.class04626;
import minecraft.class07473;

abstract class class04596
extends class07473 {
    final /* synthetic */ class04626 N;

    public abstract boolean M();

    class04596(class04626 class046262) {
        this.N = class046262;
    }

    public abstract boolean Z();

    public boolean y() {
        return this.Z() && !this.N.P_();
    }

    public boolean N() {
        return this.M() && !this.N.P_();
    }
}


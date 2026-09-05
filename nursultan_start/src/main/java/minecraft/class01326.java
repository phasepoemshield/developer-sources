/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04909
 *  minecraft.class06165
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07475
 *  minecraft.class07999
 */
package minecraft;

import minecraft.class04909;
import minecraft.class06165;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07475;
import minecraft.class07999;

class class01326
extends class07999 {
    final /* synthetic */ class06165 y;

    public void L() {
        this.y.E(false);
        super.L();
    }

    public class01326(class06165 class061652, double d, boolean bl) {
        this.y = class061652;
        super((class07475)class061652, d, bl);
    }

    protected void N(class07438 class074382) {
        if (this.y(class074382)) {
            this.M();
            this.N.method_6121(class01326.N((class07049)this.N), (class07049)class074382);
            this.y.method_5783(class04909.US, 1.0f, 1.0f);
        }
    }

    public boolean N() {
        return !this.y.v() && !this.y.method_6113() && !this.y.method_18276() && !this.y.n() && super.N();
    }
}


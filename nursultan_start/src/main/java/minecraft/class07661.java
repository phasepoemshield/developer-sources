/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class07209;
import minecraft.class07679;

public class class07661
extends class01396<class07679> {
    public void N(class04770 class047702, class07209 class072092) {
        double d = class047702.method_23317() - (double)class072092.method_10263();
        double d2 = class047702.method_23321() - (double)class072092.method_10260();
        double d3 = d * d + d2 * d2;
        this.N_27(class047702, class076792 -> class076792.N(d3));
    }

    public Codec<class07679> N() {
        return class07679.N;
    }
}


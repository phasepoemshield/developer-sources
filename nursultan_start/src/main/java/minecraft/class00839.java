/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class06889
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00811;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06889;

public class class00839
extends class01396<class00811> {
    public void N(class04770 class047702, class06889 class068892) {
        class06889 class068893 = class047702.method_73189();
        this.N_27(class047702, class008112 -> class008112.N(class047702.method_51469(), class068892, class068893));
    }

    public Codec<class00811> N() {
        return class00811.N;
    }
}


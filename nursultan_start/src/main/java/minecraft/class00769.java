/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00779;
import minecraft.class01396;
import minecraft.class04770;

public class class00769
extends class01396<class00779> {
    public void N(class04770 class047702, int n) {
        this.N_27(class047702, class007792 -> class007792.N(n));
    }

    public Codec<class00779> N() {
        return class00779.N;
    }
}


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
import minecraft.class00840;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06889;

public class class00823
extends class01396<class00840> {
    public void N(class04770 class047702, class06889 class068892, int n) {
        this.N_27(class047702, class008402 -> class008402.N(class047702, class068892, n));
    }

    public Codec<class00840> N() {
        return class00840.N;
    }
}


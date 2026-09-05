/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00853;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06584;

public class class00847
extends class01396<class00853> {
    public void N(class04770 class047702, class06584 class065842, int n) {
        this.N_27(class047702, class008532 -> class008532.N(class065842, n));
    }

    public Codec<class00853> N() {
        return class00853.N;
    }
}


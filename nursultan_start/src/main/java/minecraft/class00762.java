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
import minecraft.class00791;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06584;

public class class00762
extends class01396<class00791> {
    public void N(class04770 class047702, class06584 class065842, int n) {
        this.N_27(class047702, class007912 -> class007912.N(class065842, n));
    }

    public Codec<class00791> N() {
        return class00791.N;
    }
}


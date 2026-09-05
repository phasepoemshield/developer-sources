/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class06584
 *  minecraft.class07668
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class06584;
import minecraft.class07668;

public class class07705
extends class01396<class07668> {
    public void N(class04770 class047702, class06584 class065842) {
        this.N_27(class047702, class076682 -> class076682.N(class065842));
    }

    public Codec<class07668> N() {
        return class07668.N;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00826;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class07072;

public class class00842
extends class01396<class00826> {
    public void N(class04770 class047702, class07072 class070722, float f, float f2, boolean bl) {
        this.N_27(class047702, class008262 -> class008262.N(class047702, class070722, f, f2, bl));
    }

    public Codec<class00826> N() {
        return class00826.N;
    }
}


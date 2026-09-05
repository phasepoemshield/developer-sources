/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class07049
 *  minecraft.class07072
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00821;
import minecraft.class00857;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class07049;
import minecraft.class07072;

public class class00827
extends class01396<class00857> {
    public void N(class04770 class047702, class07049 class070492, class07072 class070722, float f, float f2, boolean bl) {
        class05908 class059082 = class00821.y(class047702, class070492);
        this.N_27(class047702, class008572 -> class008572.N(class047702, class059082, class070722, f, f2, bl));
    }

    public Codec<class00857> N() {
        return class00857.N;
    }
}


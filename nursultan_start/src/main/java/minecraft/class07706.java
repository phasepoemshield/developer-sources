/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00821
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class06171
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07677
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class06171;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07677;

public class class07706
extends class01396<class07677> {
    public void N(class04770 class047702, class06171 class061712, class06584 class065842) {
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class061712);
        this.N_27(class047702, class076772 -> class076772.N(class059082, class065842));
    }

    public Codec<class07677> N() {
        return class07677.N;
    }
}


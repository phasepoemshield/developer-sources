/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class07049
 *  minecraft.class08004
 *  minecraft.class08041
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00784;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class07049;
import minecraft.class08004;
import minecraft.class08041;

public class class00781
extends class01396<class00784> {
    public void N(class04770 class047702, class08004 class080042, class08041 class080412) {
        class05908 class059082 = class00821.y(class047702, (class07049)class080042);
        class05908 class059083 = class00821.y(class047702, (class07049)class080412);
        this.N_27(class047702, class007842 -> class007842.N(class059082, class059083));
    }

    public Codec<class00784> N() {
        return class00784.N;
    }
}


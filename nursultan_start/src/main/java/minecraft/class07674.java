/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00821
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class07049;
import minecraft.class07633;
import minecraft.class07669;

public class class07674
extends class01396<class07669> {
    public void N(class04770 class047702, class07633 class076332) {
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class076332);
        this.N_27(class047702, class076692 -> class076692.N(class059082));
    }

    public Codec<class07669> N() {
        return class07669.N;
    }
}


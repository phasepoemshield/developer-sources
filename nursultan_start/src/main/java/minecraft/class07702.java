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
import minecraft.class07691;

public class class07702
extends class01396<class07691> {
    public void N(class04770 class047702, class07049 class070492) {
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class070492);
        this.N_27(class047702, class076912 -> class076912.N(class059082));
    }

    public Codec<class07691> N() {
        return class07691.N;
    }
}


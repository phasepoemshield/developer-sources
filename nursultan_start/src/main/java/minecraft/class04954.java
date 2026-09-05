/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00821
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class04943
 *  minecraft.class05908
 *  minecraft.class06889
 *  minecraft.class07049
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class04943;
import minecraft.class05908;
import minecraft.class06889;
import minecraft.class07049;

public class class04954
extends class01396<class04943> {
    public void N(class04770 class047702, class07049 class070492, class06889 class068892, int n) {
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class070492);
        this.N_27(class047702, class049432 -> class049432.N(class059082, class068892, n));
    }

    public Codec<class04943> N() {
        return class04943.N;
    }
}


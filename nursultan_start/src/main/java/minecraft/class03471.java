/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import minecraft.class01396;
import minecraft.class03488;
import minecraft.class04770;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class06584;

public class class03471
extends class01396<class03488> {
    public void N(class04770 class047702, class05946<class06521<?>> class059462, List<class06584> list) {
        this.N_27(class047702, class034882 -> class034882.y(class059462, list));
    }

    public Codec<class03488> N() {
        return class03488.N;
    }
}


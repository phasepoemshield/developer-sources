/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05912
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05912;
import minecraft.class06584;

public class class05895
extends class01396<class05912> {
    public void N(class04770 class047702, class00500 class005002, class06584 class065842, int n) {
        this.N_27(class047702, class059122 -> class059122.N(class005002, class065842, n));
    }

    public Codec<class05912> N() {
        return class05912.N;
    }
}


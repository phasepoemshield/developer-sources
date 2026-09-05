/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class03729
 *  minecraft.class04770
 *  minecraft.class05946
 *  minecraft.class06516
 *  minecraft.class06521
 *  minecraft.class06912
 *  minecraft.class06915
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class00841;
import minecraft.class01396;
import minecraft.class03729;
import minecraft.class04770;
import minecraft.class05946;
import minecraft.class06516;
import minecraft.class06521;
import minecraft.class06912;
import minecraft.class06915;

public class class00812
extends class01396<class00841> {
    public static class06915<class00841> N(class05946<class06521<?>> class059462) {
        return class06912.M.N((class06516)new class00841(Optional.empty(), class059462));
    }

    public void N(class04770 class047702, class03729<?> class037292) {
        this.N_27(class047702, class008412 -> class008412.N(class037292));
    }

    public Codec<class00841> N() {
        return class00841.N;
    }
}


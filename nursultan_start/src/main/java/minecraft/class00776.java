/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00806;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public class class00776
extends class01396<class00806> {
    public void N(class04770 class047702, @Nullable class07049 class070492) {
        class05908 class059082 = class070492 != null ? class00821.y(class047702, class070492) : null;
        this.N_27(class047702, class008062 -> class008062.N(class047702, class059082));
    }

    public Codec<class00806> N() {
        return class00806.N;
    }
}


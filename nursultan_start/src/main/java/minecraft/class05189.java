/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00821
 *  minecraft.class01396
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class06584
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class04770;
import minecraft.class05202;
import minecraft.class05908;
import minecraft.class06584;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public class class05189
extends class01396<class05202> {
    public void N(class04770 class047702, class06584 class065842, @Nullable class07049 class070492) {
        class05908 class059082 = class00821.y((class04770)class047702, (class07049)class070492);
        this.N_27(class047702, class052022 -> class052022.N(class047702, class065842, class059082));
    }

    public Codec<class05202> N() {
        return class05202.N;
    }
}


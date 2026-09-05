/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00821
 *  minecraft.class01396
 *  minecraft.class02187
 *  minecraft.class04770
 *  minecraft.class05908
 *  minecraft.class06889
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00821;
import minecraft.class01396;
import minecraft.class02187;
import minecraft.class04770;
import minecraft.class05908;
import minecraft.class06889;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public class class02181
extends class01396<class02187> {
    public void N(class04770 class047702, class06889 class068892, @Nullable class07049 class070492) {
        class06889 class068893 = class047702.method_73189();
        class05908 class059082 = class070492 != null ? class00821.y((class04770)class047702, (class07049)class070492) : null;
        this.N_27(class047702, class021872 -> class021872.N(class047702.method_51469(), class068892, class068893, class059082));
    }

    public Codec<class02187> N() {
        return class02187.N;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00891
 *  minecraft.class03543
 *  minecraft.class03855
 *  minecraft.class06034
 *  minecraft.class06050
 *  minecraft.class06052
 *  minecraft.class06055
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00891;
import minecraft.class03543;
import minecraft.class03855;
import minecraft.class06034;
import minecraft.class06050;
import minecraft.class06052;
import minecraft.class06055;

public class class04389
extends class06034 {
    public static final Codec<class04389> L = RecordCodecBuilder.create(instance -> instance.group((App)class06034.M.forGetter(class043892 -> class043892), (App)class06052.L.fieldOf("horizontal_radius_multiplier").forGetter(class043892 -> class043892.u), (App)class06052.L.fieldOf("vertical_radius_multiplier").forGetter(class043892 -> class043892.i), (App)class06052.N((float)-1.0f, (float)1.0f).fieldOf("floor_level").forGetter(class043892 -> class043892.W)).apply(instance, class04389::new));
    public final class06052 u;
    public final class06052 i;
    final class06052 W;

    public class04389(class06034 class060342, class06052 class060522, class06052 class060523, class06052 class060524) {
        this(class060342.y, class060342.B, class060342.Z, class060342.z, class060342.U, (class03543<class00891>)class060342.E, class060522, class060523, class060524);
    }

    public class04389(float f, class03855 class038552, class06052 class060522, class06055 class060552, class03543<class00891> class035432, class06052 class060523, class06052 class060524, class06052 class060525) {
        this(f, class038552, class060522, class060552, class06050.N, class035432, class060523, class060524, class060525);
    }

    public class04389(float f, class03855 class038552, class06052 class060522, class06055 class060552, class06050 class060502, class03543<class00891> class035432, class06052 class060523, class06052 class060524, class06052 class060525) {
        super(f, class038552, class060522, class060552, class060502, class035432);
        this.u = class060523;
        this.i = class060524;
        this.W = class060525;
    }
}


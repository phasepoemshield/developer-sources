/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00891
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03855
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06212
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00891;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03855;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06050;
import minecraft.class06052;
import minecraft.class06055;
import minecraft.class06212;

public class class06034
extends class06212 {
    public static final MapCodec<class06034> M = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(class060342 -> Float.valueOf(class060342.y)), (App)class03855.L.fieldOf("y").forGetter(class060342 -> class060342.B), (App)class06052.L.fieldOf("yScale").forGetter(class060342 -> class060342.Z), (App)class06055.N.fieldOf("lava_level").forGetter(class060342 -> class060342.z), (App)class06050.y.optionalFieldOf("debug_settings", (Object)class06050.N).forGetter(class060342 -> class060342.U), (App)class03541.N((class05946)class04227.Z).fieldOf("replaceable").forGetter(class060342 -> class060342.E)).apply(instance, class06034::new));
    public final class03855 B;
    public final class06052 Z;
    public final class06055 z;
    public final class06050 U;
    public final class03543<class00891> E;

    public class06034(float f, class03855 class038552, class06052 class060522, class06055 class060552, class06050 class060502, class03543<class00891> class035432) {
        super(f);
        this.B = class038552;
        this.Z = class060522;
        this.z = class060552;
        this.U = class060502;
        this.E = class035432;
    }
}


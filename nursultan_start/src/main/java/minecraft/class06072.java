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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00891;
import minecraft.class03543;
import minecraft.class03855;
import minecraft.class06034;
import minecraft.class06037;
import minecraft.class06050;
import minecraft.class06052;
import minecraft.class06055;

public class class06072
extends class06034 {
    public static final Codec<class06072> L = RecordCodecBuilder.create(instance -> instance.group((App)class06034.M.forGetter(class060722 -> class060722), (App)class06052.L.fieldOf("vertical_rotation").forGetter(class060722 -> class060722.u), (App)class06037.N.fieldOf("shape").forGetter(class060722 -> class060722.i)).apply(instance, class06072::new));
    public final class06052 u;
    public final class06037 i;

    public class06072(float f, class03855 class038552, class06052 class060522, class06055 class060552, class06050 class060502, class03543<class00891> class035432, class06052 class060523, class06037 class060372) {
        super(f, class038552, class060522, class060552, class060502, class035432);
        this.u = class060523;
        this.i = class060372;
    }

    public class06072(class06034 class060342, class06052 class060522, class06037 class060372) {
        this(class060342.y, class060342.B, class060342.Z, class060342.z, class060342.U, class060342.E, class060522, class060372);
    }
}


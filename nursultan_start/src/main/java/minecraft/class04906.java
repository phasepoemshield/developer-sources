/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03291
 *  minecraft.class03860
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class03291;
import minecraft.class03860;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04902;
import minecraft.class04939;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07830;

public class class04906
extends class04748 {
    public static final MapCodec<class04906> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04906.N(instance), (App)class04902.field_24990.fieldOf("biome_temp").forGetter(class049062 -> class049062.y), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("large_probability").forGetter(class049062 -> Float.valueOf(class049062.R)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("cluster_probability").forGetter(class049062 -> Float.valueOf(class049062.M))).apply(instance, class04906::new));
    public final class04902 y;
    public final float R;
    public final float M;

    public class04906(class04758 class047582, class04902 class049022, float f, float f2) {
        super(class047582);
        this.y = class049022;
        this.R = f;
        this.M = f2;
    }

    public class04367<?> N() {
        return class04367.U;
    }

    public Optional<class04780> N(class04764 class047642) {
        return class04906.N((class04764)class047642, (class07830)class07830.field_13195, class032912 -> this.N((class03291)class032912, class047642));
    }

    private void N(class03291 class032912, class04764 class047642) {
        class07209 class072092 = new class07209(class047642.B().i(), 90, class047642.B().R());
        class06993 class069932 = class06993.N((class06069)class047642.R());
        class04939.N(class047642.i(), class072092, class069932, (class03860)class032912, (class06069)class047642.R(), this);
    }
}


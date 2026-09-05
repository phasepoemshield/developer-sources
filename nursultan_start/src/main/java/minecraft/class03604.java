/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03336
 *  minecraft.class03368
 *  minecraft.class06069
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class03336;
import minecraft.class03368;
import minecraft.class06069;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public class class03604
implements class03336 {
    public static final MapCodec<class03604> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07001.N.fieldOf("data").forGetter(class036042 -> class036042.y)).apply(instance, class03604::new));
    private final class07001 y;

    public class03604(class07001 class070012) {
        this.y = class070012;
    }

    public class07001 N(class06069 class060692, @Nullable class07001 class070012) {
        return class070012 == null ? this.y.N() : class070012.N(this.y);
    }

    public class03368<?> N() {
        return class03368.L;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00891
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05235
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00891;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class01201
extends class01219 {
    public static final MapCodec<class01201> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.Z).optionalFieldOf("rottable_blocks").forGetter(class012012 -> class012012.y), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("integrity").forGetter(class012012 -> Float.valueOf(class012012.L))).apply(instance, class01201::new));
    private final Optional<class03543<class00891>> y;
    private final float L;

    private class01201(Optional<class03543<class00891>> optional, float f) {
        this.L = f;
        this.y = optional;
    }

    public class01201(float f) {
        this(Optional.empty(), f);
    }

    public class01201(class03543<class00891> class035432, float f) {
        this(Optional.of(class035432), f);
    }

    @Override
    protected class05235<?> N() {
        return class05235.R;
    }

    @Override
    public @Nullable class01228 N(class05487 class054872, class07209 class072092, class07209 class072093, class01228 class012282, class01228 class012283, class01233 class012332) {
        class06069 class060692 = class012332.y(class012283.N());
        if (this.y.isPresent() && !class012282.y().N(this.y.get()) || class060692.z() <= this.L) {
            return class012283;
        }
        return null;
    }
}


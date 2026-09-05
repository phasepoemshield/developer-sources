/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01281;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;

public final class class04891
extends Record {
    private final class01894 location;
    private final Optional<Float> fixedRange;
    public static final Codec<class04891> N = RecordCodecBuilder.create(instance -> instance.group((App)class01894.N.fieldOf("sound_id").forGetter(class04891::N), (App)Codec.FLOAT.lenientOptionalFieldOf("range").forGetter(class04891::y)).apply(instance, class04891::N));
    public static final Codec<class03556<class04891>> y = class01281.N((class05946)class04227.NG, N);
    public static final class02362<ByteBuf, class04891> L = class02362.N((class02362)class01894.y, class04891::N, (class02362)class02389.E.N_33(class02389::N), class04891::y, class04891::N);
    public static final class02362<class04247, class03556<class04891>> u = class02389.N((class05946)class04227.NG, L);

    public class04891(class01894 class018942, Optional<Float> optional) {
        this.location = class018942;
        this.fixedRange = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04891.class, "location;fixedRange", "location", "fixedRange"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04891.class, "location;fixedRange", "location", "fixedRange"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04891.class, "location;fixedRange", "location", "fixedRange"}, this);
    }

    public Optional<Float> y() {
        return this.fixedRange;
    }

    public static class04891 N(class01894 class018942) {
        return new class04891(class018942, Optional.empty());
    }

    public static class04891 N(class01894 class018942, float f) {
        return new class04891(class018942, Optional.of(Float.valueOf(f)));
    }

    public float N(float f) {
        return this.fixedRange.orElse(Float.valueOf(f > 1.0f ? 16.0f * f : 16.0f)).floatValue();
    }

    private static class04891 N(class01894 class018942, Optional<Float> optional) {
        return optional.map(f -> class04891.N(class018942, f.floatValue())).orElseGet(() -> class04891.N(class018942));
    }

    public class01894 N() {
        return this.location;
    }
}


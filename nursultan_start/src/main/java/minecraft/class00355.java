/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01097
 *  minecraft.class01140
 *  minecraft.class01894
 *  minecraft.class03359
 *  minecraft.class07030
 *  minecraft.class07311
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00352;
import minecraft.class00368;
import minecraft.class01097;
import minecraft.class01140;
import minecraft.class01894;
import minecraft.class03359;
import minecraft.class07030;
import minecraft.class07311;
import org.jspecify.annotations.Nullable;

public final class class00355
extends Record
implements class00335 {
    private final class07030 kind;
    private final Optional<class01894> textureOverride;
    private final float animation;
    public static final MapCodec<class00355> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07030.y.fieldOf("kind").forGetter(class00355::y), (App)class01894.N.optionalFieldOf("texture").forGetter(class00355::L), (App)Codec.FLOAT.optionalFieldOf("animation", (Object)Float.valueOf(0.0f)).forGetter(class00355::u)).apply(instance, class00355::new));

    public Optional<class01894> L() {
        return this.textureOverride;
    }

    public class00355(class07030 class070302) {
        this(class070302, Optional.empty(), 0.0f);
    }

    public class00355(class07030 class070302, Optional<class01894> optional, float f) {
        this.kind = class070302;
        this.textureOverride = optional;
        this.animation = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00355.class, "kind;textureOverride;animation", "kind", "textureOverride", "animation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00355.class, "kind;textureOverride;animation", "kind", "textureOverride", "animation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00355.class, "kind;textureOverride;animation", "kind", "textureOverride", "animation"}, this);
    }

    public float u() {
        return this.animation;
    }

    public class07030 y() {
        return this.kind;
    }

    public MapCodec<class00355> N() {
        return N;
    }

    @Override
    public @Nullable class00368<?> N(class00331 class003312) {
        class01097 class010972 = class03359.N((class01140)class003312.y(), (class07030)this.kind);
        class01894 class018943 = this.textureOverride.map(class018942 -> class018942.N(string -> "textures/entity/" + string + ".png")).orElse(null);
        if (class010972 == null) {
            return null;
        }
        class07311 class073112 = class03359.N((class07030)this.kind, (class01894)class018943);
        return new class00352(class010972, this.animation, class073112);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06069
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02538;
import minecraft.class06069;
import minecraft.class06338;

public final class class02535
extends Record {
    private final class02538 type;
    private final float offset;
    private final float scale;
    public static final MapCodec<class02535> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02538.field_51725.fieldOf("type").forGetter(class02535::N), (App)Codec.FLOAT.optionalFieldOf("offset", (Object)Float.valueOf(0.0f)).forGetter(class02535::y), (App)class06338.t.optionalFieldOf("scale", (Object)Float.valueOf(1.0f)).forGetter(class02535::L)).apply(instance, class02535::new)).validate(class025352 -> {
        if (class025352.N() == class02538.field_51723 && class025352.L() != 1.0f) {
            return DataResult.error(() -> "Cannot scale an entity position coordinate source");
        }
        return DataResult.success((Object)class025352);
    });

    public float L() {
        return this.scale;
    }

    public class02535(class02538 class025382, float f, float f2) {
        this.type = class025382;
        this.offset = f;
        this.scale = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02535.class, "type;offset;scale", "type", "offset", "scale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02535.class, "type;offset;scale", "type", "offset", "scale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02535.class, "type;offset;scale", "type", "offset", "scale"}, this);
    }

    public float y() {
        return this.offset;
    }

    public double N(double d, double d2, float f, class06069 class060692) {
        return this.type.N(d, d2, f * this.scale, class060692) + (double)this.offset;
    }

    public class02538 N() {
        return this.type;
    }
}


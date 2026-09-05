/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05855
 *  minecraft.class06246
 *  minecraft.class06254
 *  minecraft.class06270
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class04354;
import minecraft.class05855;
import minecraft.class06246;
import minecraft.class06254;
import minecraft.class06270;
import minecraft.class06338;

public final class class04360
extends Record
implements class06270 {
    private final Map<Integer, Float> advances;
    public static final MapCodec<class04360> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.unboundedMap((Codec)class06338.c, (Codec)Codec.FLOAT).fieldOf("advances").forGetter(class04360::L)).apply(instance, class04360::new));

    public Map<Integer, Float> L() {
        return this.advances;
    }

    public class04360(Map<Integer, Float> map) {
        this.advances = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04360.class, "advances", "advances"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04360.class, "advances", "advances"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04360.class, "advances", "advances"}, this);
    }

    public Either<class06246, class06254> y() {
        return Either.left(class010892 -> new class04354(this.advances));
    }

    public class05855 N() {
        return class05855.field_37904;
    }
}


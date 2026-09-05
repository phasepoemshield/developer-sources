/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class05855
 *  minecraft.class06246
 *  minecraft.class06254
 *  minecraft.class06270
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class05855;
import minecraft.class06246;
import minecraft.class06254;
import minecraft.class06270;

public final class class03487
extends Record
implements class06270 {
    private final class01894 id;
    public static final MapCodec<class03487> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class03487::L)).apply(instance, class03487::new));

    public class01894 L() {
        return this.id;
    }

    public class03487(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03487.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03487.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03487.class, "id", "id"}, this);
    }

    public Either<class06246, class06254> y() {
        return Either.right((Object)new class06254(this.id));
    }

    public class05855 N() {
        return class05855.field_44761;
    }
}


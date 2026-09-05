/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00607;
import minecraft.class00619;
import minecraft.class07536;

public final class class00599<Value, Argument>
extends Record {
    private final Argument argument;
    private final class00619<Value, Argument> modifier;

    public class00599(Argument Argument, class00619<Value, Argument> class006192) {
        this.argument = Argument;
        this.modifier = class006192;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00599.class, "argument;modifier", "argument", "modifier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00599.class, "argument;modifier", "argument", "modifier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00599.class, "argument;modifier", "argument", "modifier"}, this);
    }

    public class00619<Value, Argument> y() {
        return this.modifier;
    }

    public Value N(Value Value) {
        return this.modifier.apply(Value, this.argument);
    }

    private static <Value, Argument> MapCodec<class00599<Value, Argument>> N(class00607<Value> class006072, class00619<Value, Argument> class006192) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class006192.argumentCodec(class006072).fieldOf("argument").forGetter(class00599::N)).apply((Applicative)instance, object -> new class00599(object, class006192)));
    }

    public static <Value> Codec<class00599<Value, ?>> N(class00607<Value> class006072) {
        Codec codec = class006072.N().L().dispatch("modifier", class00599::y, class07536.y_4(class006192 -> class00599.N(class006072, class006192)));
        return Codec.either(class006072.L(), (Codec)codec).xmap(either -> (class00599)((Object)((Object)either.map(object -> new class00599(object, class00619.N()), class005992 -> class005992))), class005992 -> {
            if (class005992.modifier == class00619.N()) {
                return Either.left(class005992.N());
            }
            return Either.right((Object)class005992);
        });
    }

    public Argument N() {
        return this.argument;
    }
}


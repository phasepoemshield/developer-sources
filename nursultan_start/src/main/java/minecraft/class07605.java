/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00607
 *  minecraft.class00619
 *  minecraft.class07536
 *  minecraft.class07576
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.LongSupplier;
import minecraft.class00607;
import minecraft.class00619;
import minecraft.class07536;
import minecraft.class07576;
import minecraft.class07606;

public final class class07605<Value, Argument>
extends Record {
    private final class00619<Value, Argument> modifier;
    private final class07606<Argument> argumentTrack;

    public class07605(class00619<Value, Argument> class006192, class07606<Argument> class076062) {
        this.modifier = class006192;
        this.argumentTrack = class076062;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07605.class, "modifier;argumentTrack", "modifier", "argumentTrack"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07605.class, "modifier;argumentTrack", "modifier", "argumentTrack"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07605.class, "modifier;argumentTrack", "modifier", "argumentTrack"}, this);
    }

    public class07606<Argument> y() {
        return this.argumentTrack;
    }

    public static DataResult<class07605<?, ?>> N(class07605<?, ?> class076052, int n) {
        return class07606.N(class076052.y(), n).map(class076062 -> class076052);
    }

    public class07576<Value, Argument> N(class00607<Value> class006072, Optional<Integer> optional, LongSupplier longSupplier) {
        return new class07576(optional, this.modifier, this.argumentTrack, this.modifier.argumentKeyframeLerp(class006072), longSupplier);
    }

    private static <Value, Argument> MapCodec<class07605<Value, Argument>> N(class00607<Value> class006072, class00619<Value, Argument> class006192) {
        return class07606.N(class006192.argumentCodec(class006072)).xmap(class076062 -> new class07605(class006192, class076062), class07605::y);
    }

    public static <Value> Codec<class07605<Value, ?>> N(class00607<Value> class006072) {
        return class006072.N().L().optionalFieldOf("modifier", (Object)class00619.N()).dispatch(class07605::N, class07536.y_4(class006192 -> class07605.N(class006072, class006192)));
    }

    public class00619<Value, Argument> N() {
        return this.modifier;
    }
}


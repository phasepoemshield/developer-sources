/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01146
 *  minecraft.class05474
 *  minecraft.class07376
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class01146;
import minecraft.class05474;
import minecraft.class07376;

public final class class05967
extends Record {
    private final int minY;
    private final int height;
    private final int noiseSizeHorizontal;
    private final int noiseSizeVertical;
    public static final Codec<class05967> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)class07376.i, (int)class07376.u).fieldOf("min_y").forGetter(class05967::L), (App)Codec.intRange((int)0, (int)class07376.L).fieldOf("height").forGetter(class05967::u), (App)Codec.intRange((int)1, (int)4).fieldOf("size_horizontal").forGetter(class05967::i), (App)Codec.intRange((int)1, (int)4).fieldOf("size_vertical").forGetter(class05967::R)).apply(instance, class05967::new)).comapFlatMap(class05967::N, Function.identity());
    public static final class05967 y = class05967.N(-64, 384, 1, 2);
    public static final class05967 L = class05967.N(0, 128, 1, 2);
    public static final class05967 u = class05967.N(0, 128, 2, 1);
    public static final class05967 i = class05967.N(-64, 192, 1, 2);
    public static final class05967 R = class05967.N(0, 256, 2, 1);

    public int L() {
        return this.minY;
    }

    public class05967(int n, int n2, int n3, int n4) {
        this.minY = n;
        this.height = n2;
        this.noiseSizeHorizontal = n3;
        this.noiseSizeVertical = n4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05967.class, "minY;height;noiseSizeHorizontal;noiseSizeVertical", "minY", "height", "noiseSizeHorizontal", "noiseSizeVertical"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05967.class, "minY;height;noiseSizeHorizontal;noiseSizeVertical", "minY", "height", "noiseSizeHorizontal", "noiseSizeVertical"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05967.class, "minY;height;noiseSizeHorizontal;noiseSizeVertical", "minY", "height", "noiseSizeHorizontal", "noiseSizeVertical"}, this);
    }

    public int i() {
        return this.noiseSizeHorizontal;
    }

    public int u() {
        return this.height;
    }

    public int y() {
        return class01146.L((int)this.i());
    }

    public class05967 N(class05474 class054742) {
        int n = Math.max(this.minY, class054742.method_31607());
        int n2 = Math.min(this.minY + this.height, class054742.method_31600() + 1) - n;
        return new class05967(n, n2, this.noiseSizeHorizontal, this.noiseSizeVertical);
    }

    public int N() {
        return class01146.L((int)this.R());
    }

    public static class05967 N(int n, int n2, int n3, int n4) {
        class05967 class059672 = new class05967(n, n2, n3, n4);
        class05967.N(class059672).error().ifPresent(error -> {
            throw new IllegalStateException(error.message());
        });
        return class059672;
    }

    private static DataResult<class05967> N(class05967 class059672) {
        if (class059672.L() + class059672.u() > class07376.u + 1) {
            return DataResult.error(() -> "min_y + height cannot be higher than: " + (class07376.u + 1));
        }
        if (class059672.u() % 16 != 0) {
            return DataResult.error(() -> "height has to be a multiple of 16");
        }
        if (class059672.L() % 16 != 0) {
            return DataResult.error(() -> "min_y has to be a multiple of 16");
        }
        return DataResult.success((Object)((Object)class059672));
    }

    public int R() {
        return this.noiseSizeVertical;
    }
}


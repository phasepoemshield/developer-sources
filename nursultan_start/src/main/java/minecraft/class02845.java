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
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06338
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06338;
import org.jspecify.annotations.Nullable;

public final class class02845
extends Record {
    private final List<Float> floats;
    private final List<Boolean> flags;
    private final List<String> strings;
    private final List<Integer> colors;
    public static final class02845 N = new class02845(List.of(), List.of(), List.of(), List.of());
    public static final Codec<class02845> y = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(class02845::N), (App)Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(class02845::y), (App)Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(class02845::L), (App)class06338.E.listOf().optionalFieldOf("colors", List.of()).forGetter(class02845::u)).apply(instance, class02845::new));
    public static final class02362<ByteBuf, class02845> L = class02362.N((class02362)class02389.E.N_33(class02389.N()), class02845::N, (class02362)class02389.y.N_33(class02389.N()), class02845::y, (class02362)class02389.s.N_33(class02389.N()), class02845::L, (class02362)class02389.M.N_33(class02389.N()), class02845::u, class02845::new);

    public @Nullable String L(int n) {
        return class02845.N(this.strings, n);
    }

    public List<String> L() {
        return this.strings;
    }

    public class02845(List<Float> list, List<Boolean> list2, List<String> list3, List<Integer> list4) {
        this.floats = list;
        this.flags = list2;
        this.strings = list3;
        this.colors = list4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02845.class, "floats;flags;strings;colors", "floats", "flags", "strings", "colors"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02845.class, "floats;flags;strings;colors", "floats", "flags", "strings", "colors"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02845.class, "floats;flags;strings;colors", "floats", "flags", "strings", "colors"}, this);
    }

    public List<Integer> u() {
        return this.colors;
    }

    public @Nullable Integer u(int n) {
        return class02845.N(this.colors, n);
    }

    public List<Boolean> y() {
        return this.flags;
    }

    public @Nullable Boolean y(int n) {
        return class02845.N(this.flags, n);
    }

    public List<Float> N() {
        return this.floats;
    }

    public @Nullable Float N(int n) {
        return class02845.N(this.floats, n);
    }

    private static <T> @Nullable T N(List<T> list, int n) {
        if (n < 0 || n >= list.size()) {
            return null;
        }
        return list.get(n);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03032
 */
package minecraft;

import com.google.common.primitives.Doubles;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class03032;

public final class class04333
extends Record {
    private final int minSection;
    private final int maxSection;
    private final Optional<double[]> heights;
    private static final Codec<double[]> i = Codec.DOUBLE.listOf().xmap(Doubles::toArray, Doubles::asList);
    public static final Codec<class04333> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("min_section").forGetter(class04333::N), (App)Codec.INT.fieldOf("max_section").forGetter(class04333::y), (App)i.lenientOptionalFieldOf("heights").forGetter(class04333::L)).apply(instance, class04333::new)).validate(class04333::N);

    public Optional<double[]> L() {
        return this.heights;
    }

    public class04333(int n, int n2, Optional<double[]> optional) {
        this.minSection = n;
        this.maxSection = n2;
        this.heights = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04333.class, "minSection;maxSection;heights", "minSection", "maxSection", "heights"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04333.class, "minSection;maxSection;heights", "minSection", "maxSection", "heights"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04333.class, "minSection;maxSection;heights", "minSection", "maxSection", "heights"}, this);
    }

    public int y() {
        return this.maxSection;
    }

    public int N() {
        return this.minSection;
    }

    private static DataResult<class04333> N(class04333 class043332) {
        if (class043332.heights.isPresent() && class043332.heights.get().length != class03032.u) {
            return DataResult.error(() -> "heights has to be of length " + class03032.u);
        }
        return DataResult.success((Object)((Object)class043332));
    }
}


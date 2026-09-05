/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class01975
 *  minecraft.class08880
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class01975;
import minecraft.class08880;

public final class class03607
extends Record {
    private final Optional<class01975> condition;
    private final class08880 variant;
    public static final Codec<class03607> N = RecordCodecBuilder.create(instance -> instance.group((App)class01975.N.optionalFieldOf("when").forGetter(class03607::N), (App)class08880.L.fieldOf("apply").forGetter(class03607::y)).apply(instance, class03607::new));

    public class03607(Optional<class01975> optional, class08880 class088802) {
        this.condition = optional;
        this.variant = class088802;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03607.class, "condition;variant", "condition", "variant"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03607.class, "condition;variant", "condition", "variant"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03607.class, "condition;variant", "condition", "variant"}, this);
    }

    public class08880 y() {
        return this.variant;
    }

    public Optional<class01975> N() {
        return this.condition;
    }

    public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> class005072) {
        return this.condition.map(class019752 -> class019752.N(class005072)).orElse(class005222 -> true);
    }
}


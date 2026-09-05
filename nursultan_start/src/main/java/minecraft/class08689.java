/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06338;

public final class class08689
extends Record {
    private final Optional<Integer> colorWhenUndyed;
    public static final Codec<class08689> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.E.optionalFieldOf("color_when_undyed").forGetter(class08689::N)).apply(instance, class08689::new));

    public class08689(Optional<Integer> optional) {
        this.colorWhenUndyed = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08689.class, "colorWhenUndyed", "colorWhenUndyed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08689.class, "colorWhenUndyed", "colorWhenUndyed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08689.class, "colorWhenUndyed", "colorWhenUndyed"}, this);
    }

    public Optional<Integer> N() {
        return this.colorWhenUndyed;
    }
}


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

public final class class00102
extends Record {
    private final Optional<Integer> maxLines;
    private final Optional<Integer> height;
    public static final int N = 512;
    public static final Codec<class00102> y = RecordCodecBuilder.create(instance -> instance.group((App)class06338.b.optionalFieldOf("max_lines").forGetter(class00102::N), (App)class06338.N((int)1, (int)512).optionalFieldOf("height").forGetter(class00102::y)).apply(instance, class00102::new));

    public class00102(Optional<Integer> optional, Optional<Integer> optional2) {
        this.maxLines = optional;
        this.height = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00102.class, "maxLines;height", "maxLines", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00102.class, "maxLines;height", "maxLines", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00102.class, "maxLines;height", "maxLines", "height"}, this);
    }

    public Optional<Integer> y() {
        return this.height;
    }

    public Optional<Integer> N() {
        return this.maxLines;
    }
}


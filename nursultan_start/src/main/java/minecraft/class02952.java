/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02827
 *  minecraft.class02835
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class02827;
import minecraft.class02835;

public final class class02952
extends Record
implements Predicate<class02827> {
    private final Optional<class02835> shape;
    private final Optional<Boolean> twinkle;
    private final Optional<Boolean> trail;
    public static final Codec<class02952> N = RecordCodecBuilder.create(instance -> instance.group((App)class02835.field_49322.optionalFieldOf("shape").forGetter(class02952::N), (App)Codec.BOOL.optionalFieldOf("has_twinkle").forGetter(class02952::y), (App)Codec.BOOL.optionalFieldOf("has_trail").forGetter(class02952::L)).apply(instance, class02952::new));

    public Optional<Boolean> L() {
        return this.trail;
    }

    public class02952(Optional<class02835> optional, Optional<Boolean> optional2, Optional<Boolean> optional3) {
        this.shape = optional;
        this.twinkle = optional2;
        this.trail = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02952.class, "shape;twinkle;trail", "shape", "twinkle", "trail"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02952.class, "shape;twinkle;trail", "shape", "twinkle", "trail"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02952.class, "shape;twinkle;trail", "shape", "twinkle", "trail"}, this);
    }

    public Optional<Boolean> y() {
        return this.twinkle;
    }

    public Optional<class02835> N() {
        return this.shape;
    }

    @Override
    public boolean test(class02827 class028272) {
        if (this.shape.isPresent() && this.shape.get() != class028272.N()) {
            return false;
        }
        if (this.twinkle.isPresent() && this.twinkle.get().booleanValue() != class028272.i()) {
            return false;
        }
        return !this.trail.isPresent() || this.trail.get().booleanValue() == class028272.u();
    }
}


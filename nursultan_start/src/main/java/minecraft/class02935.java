/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02648
 *  minecraft.class02824
 *  minecraft.class02833
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02648;
import minecraft.class02824;
import minecraft.class02833;
import minecraft.class02918;

public final class class02935
extends Record
implements class02465<class02833> {
    private final Optional<class02648<class02824, class02918>> modifiers;
    public static final Codec<class02935> N = RecordCodecBuilder.create(instance -> instance.group((App)class02648.N(class02918.N).optionalFieldOf("modifiers").forGetter(class02935::N)).apply(instance, class02935::new));

    public class02935(Optional<class02648<class02824, class02918>> optional) {
        this.modifiers = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02935.class, "modifiers", "modifiers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02935.class, "modifiers", "modifiers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02935.class, "modifiers", "modifiers"}, this);
    }

    public class02477<class02833> y() {
        return class02484.b;
    }

    public boolean N(class02833 class028332) {
        return !this.modifiers.isPresent() || this.modifiers.get().test((Iterable)class028332.y());
    }

    public Optional<class02648<class02824, class02918>> N() {
        return this.modifiers;
    }
}


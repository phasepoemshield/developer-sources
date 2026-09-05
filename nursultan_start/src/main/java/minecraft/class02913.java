/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00845
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02648
 *  minecraft.class02830
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00845;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02648;
import minecraft.class02830;
import minecraft.class06584;

public final class class02913
extends Record
implements class02465<class02830> {
    private final Optional<class02648<class06584, class00845>> items;
    public static final Codec<class02913> N = RecordCodecBuilder.create(instance -> instance.group((App)class02648.N((Codec)class00845.N).optionalFieldOf("items").forGetter(class02913::N)).apply(instance, class02913::new));

    public class02913(Optional<class02648<class06584, class00845>> optional) {
        this.items = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02913.class, "items", "items"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02913.class, "items", "items"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02913.class, "items", "items"}, this);
    }

    public class02477<class02830> y() {
        return class02484.D;
    }

    public boolean N(class02830 class028302) {
        return !this.items.isPresent() || this.items.get().test(class028302.L());
    }

    public Optional<class02648<class06584, class00845>> N() {
        return this.items;
    }
}


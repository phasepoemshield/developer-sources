/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00142
 *  minecraft.class02666
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00142;
import minecraft.class00836;
import minecraft.class02666;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;

public final class class00845
extends Record
implements Predicate<class06584> {
    private final Optional<class03543<class06581>> items;
    private final class00836 count;
    private final class00142 components;
    public static final Codec<class00845> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.F).optionalFieldOf("items").forGetter(class00845::N), (App)class00836.u.optionalFieldOf("count", (Object)class00836.L).forGetter(class00845::y), (App)class00142.y.forGetter(class00845::L)).apply(instance, class00845::new));

    public class00142 L() {
        return this.components;
    }

    public class00845(Optional<class03543<class06581>> optional, class00836 class008362, class00142 class001422) {
        this.items = optional;
        this.count = class008362;
        this.components = class001422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00845.class, "items;count;components", "items", "count", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00845.class, "items;count;components", "items", "count", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00845.class, "items;count;components", "items", "count", "components"}, this);
    }

    public class00836 y() {
        return this.count;
    }

    public Optional<class03543<class06581>> N() {
        return this.items;
    }

    @Override
    public boolean test(class06584 class065842) {
        if (this.items.isPresent() && !class065842.N(this.items.get())) {
            return false;
        }
        if (!this.count.u(class065842.c())) {
            return false;
        }
        return this.components.test((class02666)class065842);
    }
}


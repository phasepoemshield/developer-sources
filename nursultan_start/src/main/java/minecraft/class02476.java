/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00836
 *  minecraft.class02666
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00836;
import minecraft.class02484;
import minecraft.class02500;
import minecraft.class02666;

public final class class02476
extends Record
implements class02500 {
    private final class00836 durability;
    private final class00836 damage;
    public static final Codec<class02476> N = RecordCodecBuilder.create(instance -> instance.group((App)class00836.u.optionalFieldOf("durability", (Object)class00836.L).forGetter(class02476::N), (App)class00836.u.optionalFieldOf("damage", (Object)class00836.L).forGetter(class02476::y)).apply(instance, class02476::new));

    public class02476(class00836 class008362, class00836 class008363) {
        this.durability = class008362;
        this.damage = class008363;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02476.class, "durability;damage", "durability", "damage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02476.class, "durability;damage", "durability", "damage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02476.class, "durability;damage", "durability", "damage"}, this);
    }

    public class00836 y() {
        return this.damage;
    }

    public static class02476 N(class00836 class008362) {
        return new class02476(class008362, class00836.L);
    }

    public class00836 N() {
        return this.durability;
    }

    @Override
    public boolean N(class02666 class026662) {
        Integer n = (Integer)class026662.method_58694(class02484.i);
        if (n == null) {
            return false;
        }
        int n2 = (Integer)class026662.a_(class02484.u, (Object)0);
        if (!this.durability.u(n2 - n)) {
            return false;
        }
        return this.damage.u(n.intValue());
    }
}


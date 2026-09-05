/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00836;

public final class class00855
extends Record {
    private final class00836 occupied;
    private final class00836 full;
    private final class00836 empty;
    public static final Codec<class00855> N = RecordCodecBuilder.create(instance -> instance.group((App)class00836.u.optionalFieldOf("occupied", (Object)class00836.L).forGetter(class00855::N), (App)class00836.u.optionalFieldOf("full", (Object)class00836.L).forGetter(class00855::y), (App)class00836.u.optionalFieldOf("empty", (Object)class00836.L).forGetter(class00855::L)).apply(instance, class00855::new));
    public static final class00855 y = new class00855(class00836.L, class00836.L, class00836.L);

    public class00836 L() {
        return this.empty;
    }

    public class00855(class00836 class008362, class00836 class008363, class00836 class008364) {
        this.occupied = class008362;
        this.full = class008363;
        this.empty = class008364;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00855.class, "occupied;full;empty", "occupied", "full", "empty"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00855.class, "occupied;full;empty", "occupied", "full", "empty"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00855.class, "occupied;full;empty", "occupied", "full", "empty"}, this);
    }

    public class00836 y() {
        return this.full;
    }

    public boolean N(int n, int n2, int n3) {
        if (!this.full.u(n)) {
            return false;
        }
        if (!this.empty.u(n2)) {
            return false;
        }
        return this.occupied.u(n3);
    }

    public class00836 N() {
        return this.occupied;
    }
}


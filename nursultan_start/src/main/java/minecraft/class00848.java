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
import java.util.Optional;
import minecraft.class00816;

final class class00848
extends Record {
    private final class00816 x;
    private final class00816 y;
    private final class00816 z;
    public static final Codec<class00848> N = RecordCodecBuilder.create(instance -> instance.group((App)class00816.u.optionalFieldOf("x", (Object)class00816.L).forGetter(class00848::N), (App)class00816.u.optionalFieldOf("y", (Object)class00816.L).forGetter(class00848::y), (App)class00816.u.optionalFieldOf("z", (Object)class00816.L).forGetter(class00848::L)).apply(instance, class00848::new));

    public class00816 L() {
        return this.z;
    }

    private class00848(class00816 class008162, class00816 class008163, class00816 class008164) {
        this.x = class008162;
        this.y = class008163;
        this.z = class008164;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00848.class, "x;y;z", "x", "y", "z"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00848.class, "x;y;z", "x", "y", "z"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00848.class, "x;y;z", "x", "y", "z"}, this);
    }

    public class00816 y() {
        return this.y;
    }

    public boolean N(double d, double d2, double d3) {
        return this.x.u(d) && this.y.u(d2) && this.z.u(d3);
    }

    static Optional<class00848> N(class00816 class008162, class00816 class008163, class00816 class008164) {
        if (class008162.u() && class008163.u() && class008164.u()) {
            return Optional.empty();
        }
        return Optional.of(new class00848(class008162, class008163, class008164));
    }

    public class00816 N() {
        return this.x;
    }
}


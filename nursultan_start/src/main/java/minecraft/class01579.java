/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01471;
import minecraft.class06386;

public final class class01579
extends Record
implements class06386 {
    private final class01471 fluid;
    private final class01471 barrier;
    public static final Codec<class01579> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("fluid").forGetter(class01579::N), (App)class01471.N.fieldOf("barrier").forGetter(class01579::y)).apply(instance, class01579::new));

    public class01579(class01471 class014712, class01471 class014713) {
        this.fluid = class014712;
        this.barrier = class014713;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01579.class, "fluid;barrier", "fluid", "barrier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01579.class, "fluid;barrier", "fluid", "barrier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01579.class, "fluid;barrier", "fluid", "barrier"}, this);
    }

    public class01471 y() {
        return this.barrier;
    }

    public class01471 N() {
        return this.fluid;
    }
}


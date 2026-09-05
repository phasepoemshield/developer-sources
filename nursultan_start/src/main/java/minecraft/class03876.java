/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class05041
 *  minecraft.class05056
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class05041;
import minecraft.class05056;
import org.jspecify.annotations.Nullable;

public final class class03876
extends Record {
    private final class03556<class05056> noiseData;
    private final @Nullable class05041 noise;
    public static final Codec<class03876> N = class05056.u.xmap(class035562 -> new class03876((class03556<class05056>)class035562, null), class03876::y);

    public @Nullable class05041 L() {
        return this.noise;
    }

    public class03876(class03556<class05056> class035562) {
        this(class035562, null);
    }

    public class03876(class03556<class05056> class035562, @Nullable class05041 class050412) {
        this.noiseData = class035562;
        this.noise = class050412;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03876.class, "noiseData;noise", "noiseData", "noise"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03876.class, "noiseData;noise", "noiseData", "noise"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03876.class, "noiseData;noise", "noiseData", "noise"}, this);
    }

    public class03556<class05056> y() {
        return this.noiseData;
    }

    public double N() {
        return this.noise == null ? 2.0 : this.noise.N();
    }

    public double N(double d, double d2, double d3) {
        return this.noise == null ? 0.0 : this.noise.N(d, d2, d3);
    }
}


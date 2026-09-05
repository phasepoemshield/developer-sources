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

public final class class01043
extends Record {
    private final double energyBudget;
    private final double charge;
    public static final Codec<class01043> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.DOUBLE.fieldOf("energy_budget").forGetter(class010432 -> class010432.energyBudget), (App)Codec.DOUBLE.fieldOf("charge").forGetter(class010432 -> class010432.charge)).apply(instance, class01043::new));

    public class01043(double d, double d2) {
        this.energyBudget = d;
        this.charge = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01043.class, "energyBudget;charge", "energyBudget", "charge"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01043.class, "energyBudget;charge", "energyBudget", "charge"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01043.class, "energyBudget;charge", "energyBudget", "charge"}, this);
    }

    public double y() {
        return this.charge;
    }

    public double N() {
        return this.energyBudget;
    }
}


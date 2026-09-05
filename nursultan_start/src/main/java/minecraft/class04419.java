/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class06338;

public final class class04419
extends Record {
    private final class03556<class04748> structure;
    private final int weight;
    public static final Codec<class04419> N = RecordCodecBuilder.create(instance -> instance.group((App)class04748.u.fieldOf("structure").forGetter(class04419::N), (App)class06338.b.fieldOf("weight").forGetter(class04419::y)).apply(instance, class04419::new));

    public class04419(class03556<class04748> class035562, int n) {
        this.structure = class035562;
        this.weight = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04419.class, "structure;weight", "structure", "weight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04419.class, "structure;weight", "structure", "weight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04419.class, "structure;weight", "structure", "weight"}, this);
    }

    public int y() {
        return this.weight;
    }

    public class03556<class04748> N() {
        return this.structure;
    }
}


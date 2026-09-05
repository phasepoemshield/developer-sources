/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01471
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01471;

public final class class03628
extends Record {
    private final class01471 aboveRootProvider;
    private final float aboveRootPlacementChance;
    public static final Codec<class03628> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("above_root_provider").forGetter(class036282 -> class036282.aboveRootProvider), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("above_root_placement_chance").forGetter(class036282 -> Float.valueOf(class036282.aboveRootPlacementChance))).apply(instance, class03628::new));

    public class03628(class01471 class014712, float f) {
        this.aboveRootProvider = class014712;
        this.aboveRootPlacementChance = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03628.class, "aboveRootProvider;aboveRootPlacementChance", "aboveRootProvider", "aboveRootPlacementChance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03628.class, "aboveRootProvider;aboveRootPlacementChance", "aboveRootProvider", "aboveRootPlacementChance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03628.class, "aboveRootProvider;aboveRootPlacementChance", "aboveRootProvider", "aboveRootPlacementChance"}, this);
    }

    public float y() {
        return this.aboveRootPlacementChance;
    }

    public class01471 N() {
        return this.aboveRootProvider;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06009;
import minecraft.class06338;

public final class class05987
extends Record {
    public int waterColor;
    public Optional<Integer> foliageColorOverride;
    public Optional<Integer> dryFoliageColorOverride;
    public Optional<Integer> grassColorOverride;
    public class06009 grassColorModifier;
    public static final Codec<class05987> R = RecordCodecBuilder.create(instance -> instance.group((App)class06338.m.fieldOf("water_color").forGetter(class05987::N), (App)class06338.m.optionalFieldOf("foliage_color").forGetter(class05987::y), (App)class06338.m.optionalFieldOf("dry_foliage_color").forGetter(class05987::L), (App)class06338.m.optionalFieldOf("grass_color").forGetter(class05987::u), (App)class06009.field_26429.optionalFieldOf("grass_color_modifier", (Object)class06009.field_26426).forGetter(class05987::i)).apply(instance, class05987::new));

    public Optional<Integer> L() {
        return this.dryFoliageColorOverride;
    }

    public class05987(int n, Optional<Integer> optional, Optional<Integer> optional2, Optional<Integer> optional3, class06009 class060092) {
        this.waterColor = n;
        this.foliageColorOverride = optional;
        this.dryFoliageColorOverride = optional2;
        this.grassColorOverride = optional3;
        this.grassColorModifier = class060092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05987.class, "waterColor;foliageColorOverride;dryFoliageColorOverride;grassColorOverride;grassColorModifier", "waterColor", "foliageColorOverride", "dryFoliageColorOverride", "grassColorOverride", "grassColorModifier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05987.class, "waterColor;foliageColorOverride;dryFoliageColorOverride;grassColorOverride;grassColorModifier", "waterColor", "foliageColorOverride", "dryFoliageColorOverride", "grassColorOverride", "grassColorModifier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05987.class, "waterColor;foliageColorOverride;dryFoliageColorOverride;grassColorOverride;grassColorModifier", "waterColor", "foliageColorOverride", "dryFoliageColorOverride", "grassColorOverride", "grassColorModifier"}, this);
    }

    public class06009 i() {
        return this.grassColorModifier;
    }

    public Optional<Integer> u() {
        return this.grassColorOverride;
    }

    public Optional<Integer> y() {
        return this.foliageColorOverride;
    }

    public int N() {
        return this.waterColor;
    }
}


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
 *  minecraft.class04891
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class04891;

public final class class01368
extends Record {
    private final class03556<class04891> soundEvent;
    private final double tickChance;
    public static final Codec<class01368> N = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.fieldOf("sound").forGetter(class013682 -> class013682.soundEvent), (App)Codec.DOUBLE.fieldOf("tick_chance").forGetter(class013682 -> class013682.tickChance)).apply(instance, class01368::new));

    public class01368(class03556<class04891> class035562, double d) {
        this.soundEvent = class035562;
        this.tickChance = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01368.class, "soundEvent;tickChance", "soundEvent", "tickChance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01368.class, "soundEvent;tickChance", "soundEvent", "tickChance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01368.class, "soundEvent;tickChance", "soundEvent", "tickChance"}, this);
    }

    public double y() {
        return this.tickChance;
    }

    public class03556<class04891> N() {
        return this.soundEvent;
    }
}


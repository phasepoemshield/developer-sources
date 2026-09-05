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
 *  minecraft.class04909
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04909;

public final class class01374
extends Record {
    private final class03556<class04891> soundEvent;
    private final int tickDelay;
    private final int blockSearchExtent;
    private final double soundPositionOffset;
    public static final Codec<class01374> N = RecordCodecBuilder.create(instance -> instance.group((App)class04891.y.fieldOf("sound").forGetter(class013742 -> class013742.soundEvent), (App)Codec.INT.fieldOf("tick_delay").forGetter(class013742 -> class013742.tickDelay), (App)Codec.INT.fieldOf("block_search_extent").forGetter(class013742 -> class013742.blockSearchExtent), (App)Codec.DOUBLE.fieldOf("offset").forGetter(class013742 -> class013742.soundPositionOffset)).apply(instance, class01374::new));
    public static final class01374 y = new class01374((class03556<class04891>)class04909.B, 6000, 8, 2.0);

    public int L() {
        return this.blockSearchExtent;
    }

    public class01374(class03556<class04891> class035562, int n, int n2, double d) {
        this.soundEvent = class035562;
        this.tickDelay = n;
        this.blockSearchExtent = n2;
        this.soundPositionOffset = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01374.class, "soundEvent;tickDelay;blockSearchExtent;soundPositionOffset", "soundEvent", "tickDelay", "blockSearchExtent", "soundPositionOffset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01374.class, "soundEvent;tickDelay;blockSearchExtent;soundPositionOffset", "soundEvent", "tickDelay", "blockSearchExtent", "soundPositionOffset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01374.class, "soundEvent;tickDelay;blockSearchExtent;soundPositionOffset", "soundEvent", "tickDelay", "blockSearchExtent", "soundPositionOffset"}, this);
    }

    public double u() {
        return this.soundPositionOffset;
    }

    public int y() {
        return this.tickDelay;
    }

    public class03556<class04891> N() {
        return this.soundEvent;
    }
}


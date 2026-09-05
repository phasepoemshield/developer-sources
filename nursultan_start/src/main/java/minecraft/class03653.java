/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00891
 *  minecraft.class01471
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00891;
import minecraft.class01471;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;

public final class class03653
extends Record {
    private final class03543<class00891> canGrowThrough;
    private final class03543<class00891> muddyRootsIn;
    private final class01471 muddyRootsProvider;
    private final int maxRootWidth;
    private final int maxRootLength;
    private final float randomSkewChance;
    public static final Codec<class03653> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.Z).fieldOf("can_grow_through").forGetter(class036532 -> class036532.canGrowThrough), (App)class03541.N((class05946)class04227.Z).fieldOf("muddy_roots_in").forGetter(class036532 -> class036532.muddyRootsIn), (App)class01471.N.fieldOf("muddy_roots_provider").forGetter(class036532 -> class036532.muddyRootsProvider), (App)Codec.intRange((int)1, (int)12).fieldOf("max_root_width").forGetter(class036532 -> class036532.maxRootWidth), (App)Codec.intRange((int)1, (int)64).fieldOf("max_root_length").forGetter(class036532 -> class036532.maxRootLength), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("random_skew_chance").forGetter(class036532 -> Float.valueOf(class036532.randomSkewChance))).apply(instance, class03653::new));

    public class01471 L() {
        return this.muddyRootsProvider;
    }

    public class03653(class03543<class00891> class035432, class03543<class00891> class035433, class01471 class014712, int n, int n2, float f) {
        this.canGrowThrough = class035432;
        this.muddyRootsIn = class035433;
        this.muddyRootsProvider = class014712;
        this.maxRootWidth = n;
        this.maxRootLength = n2;
        this.randomSkewChance = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03653.class, "canGrowThrough;muddyRootsIn;muddyRootsProvider;maxRootWidth;maxRootLength;randomSkewChance", "canGrowThrough", "muddyRootsIn", "muddyRootsProvider", "maxRootWidth", "maxRootLength", "randomSkewChance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03653.class, "canGrowThrough;muddyRootsIn;muddyRootsProvider;maxRootWidth;maxRootLength;randomSkewChance", "canGrowThrough", "muddyRootsIn", "muddyRootsProvider", "maxRootWidth", "maxRootLength", "randomSkewChance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03653.class, "canGrowThrough;muddyRootsIn;muddyRootsProvider;maxRootWidth;maxRootLength;randomSkewChance", "canGrowThrough", "muddyRootsIn", "muddyRootsProvider", "maxRootWidth", "maxRootLength", "randomSkewChance"}, this);
    }

    public int i() {
        return this.maxRootLength;
    }

    public int u() {
        return this.maxRootWidth;
    }

    public class03543<class00891> y() {
        return this.muddyRootsIn;
    }

    public class03543<class00891> N() {
        return this.canGrowThrough;
    }

    public float R() {
        return this.randomSkewChance;
    }
}


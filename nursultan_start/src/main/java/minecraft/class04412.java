/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01281
 *  minecraft.class03532
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04748
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01281;
import minecraft.class03532;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04419;
import minecraft.class04748;
import minecraft.class05946;

public final class class04412
extends Record {
    private final List<class04419> structures;
    private final class03532 placement;
    public static final Codec<class04412> N = RecordCodecBuilder.create(instance -> instance.group((App)class04419.N.listOf().fieldOf("structures").forGetter(class04412::N), (App)class03532.y.fieldOf("placement").forGetter(class04412::y)).apply(instance, class04412::new));
    public static final Codec<class03556<class04412>> y = class01281.N((class05946)class04227.yb, N);

    public class04412(class03556<class04748> class035562, class03532 class035322) {
        this(List.of(new class04419(class035562, 1)), class035322);
    }

    public class04412(List<class04419> list, class03532 class035322) {
        this.structures = list;
        this.placement = class035322;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04412.class, "structures;placement", "structures", "placement"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04412.class, "structures;placement", "structures", "placement"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04412.class, "structures;placement", "structures", "placement"}, this);
    }

    public class03532 y() {
        return this.placement;
    }

    public static class04419 N(class03556<class04748> class035562) {
        return new class04419(class035562, 1);
    }

    public List<class04419> N() {
        return this.structures;
    }

    public static class04419 N(class03556<class04748> class035562, int n) {
        return new class04419(class035562, n);
    }
}


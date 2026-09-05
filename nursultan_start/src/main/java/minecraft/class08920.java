/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00362
 *  minecraft.class06572
 *  minecraft.class08350
 *  minecraft.class08895
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import minecraft.class00362;
import minecraft.class06572;
import minecraft.class08350;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import minecraft.class08912;
import minecraft.class08913;
import minecraft.class08937;

public final class class08920
extends Record
implements class08895 {
    private final class06572 property;
    private final float scale;
    private final List<class08912> entries;
    private final Optional<class08895> fallback;
    public static final MapCodec<class08920> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00362.y.forGetter(class08920::N), (App)Codec.FLOAT.optionalFieldOf("scale", (Object)Float.valueOf(1.0f)).forGetter(class08920::y), (App)class08912.L.listOf().fieldOf("entries").forGetter(class08920::L), (App)class08913.y.optionalFieldOf("fallback").forGetter(class08920::u)).apply(instance, class08920::new));

    public List<class08912> L() {
        return this.entries;
    }

    public class08920(class06572 class065722, float f, List<class08912> list, Optional<class08895> optional) {
        this.property = class065722;
        this.scale = f;
        this.entries = list;
        this.fallback = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08920.class, "property;scale;entries;fallback", "property", "scale", "entries", "fallback"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08920.class, "property;scale;entries;fallback", "property", "scale", "entries", "fallback"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08920.class, "property;scale;entries;fallback", "property", "scale", "entries", "fallback"}, this);
    }

    public Optional<class08895> u() {
        return this.fallback;
    }

    public float y() {
        return this.scale;
    }

    public class06572 N() {
        return this.property;
    }

    public void method_62326(class08350 class083502) {
        this.fallback.ifPresent(class088952 -> class088952.method_62326(class083502));
        this.entries.forEach(class089122 -> class089122.y().method_62326(class083502));
    }

    public MapCodec<class08920> method_65585() {
        return N;
    }

    public class08910 method_65587(class08905 class089052) {
        float[] fArray = new float[this.entries.size()];
        class08910[] class08910Array = new class08910[this.entries.size()];
        ArrayList<class08912> arrayList = new ArrayList<class08912>(this.entries);
        arrayList.sort(class08912.u);
        for (int i = 0; i < arrayList.size(); ++i) {
            class08912 class089122 = (class08912)((Object)arrayList.get(i));
            fArray[i] = class089122.N();
            class08910Array[i] = class089122.y().method_65587(class089052);
        }
        class08910 class089102 = this.fallback.map(class088952 -> class088952.method_65587(class089052)).orElse(class089052.i());
        return new class08937(this.property, this.scale, fArray, class08910Array, class089102);
    }
}


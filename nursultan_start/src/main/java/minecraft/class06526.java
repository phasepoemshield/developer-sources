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
 *  minecraft.class03556
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06338
 *  minecraft.class07304
 *  minecraft.class07323
 *  minecraft.class07491
 *  minecraft.class07693
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
import java.util.Set;
import minecraft.class03556;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06338;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class07304;
import minecraft.class07323;
import minecraft.class07491;
import minecraft.class07693;

public final class class06526
extends Record
implements class05957 {
    private final class03556<class07304> enchantment;
    private final List<Float> values;
    public static final MapCodec<class06526> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07304.L.fieldOf("enchantment").forGetter(class06526::L), (App)class06338.y((Codec)Codec.FLOAT.listOf()).fieldOf("chances").forGetter(class06526::u)).apply(instance, class06526::new));

    public class03556<class07304> L() {
        return this.enchantment;
    }

    public class06526(class03556<class07304> class035562, List<Float> list) {
        this.enchantment = class035562;
        this.values = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06526.class, "enchantment;values", "enchantment", "values"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06526.class, "enchantment;values", "enchantment", "values"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06526.class, "enchantment;values", "enchantment", "values"}, this);
    }

    public List<Float> u() {
        return this.values;
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.U);
    }

    public boolean test(class05908 class059082) {
        class06584 class065842 = (class06584)class059082.L(class06551.U);
        int n = class065842 != null ? class07323.N(this.enchantment, (class06584)class065842) : 0;
        float f = this.values.get(Math.min(n, this.values.size() - 1)).floatValue();
        return class059082.y().z() < f;
    }

    public class05955 N() {
        return class07693.U;
    }

    public static class05952 N(class03556<class07304> class035562, float ... fArray) {
        ArrayList<Float> arrayList = new ArrayList<Float>(fArray.length);
        for (float f : fArray) {
            arrayList.add(Float.valueOf(f));
        }
        return () -> new class06526(class035562, arrayList);
    }
}


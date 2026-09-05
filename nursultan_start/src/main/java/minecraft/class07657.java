/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04711
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06339
 *  minecraft.class06378
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04711;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class07693;

public final class class07657
extends Record
implements class05957 {
    private final class06378 chance;
    public static final MapCodec<class07657> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06339.N.fieldOf("chance").forGetter(class07657::L)).apply(instance, class07657::new));

    public class06378 L() {
        return this.chance;
    }

    public class07657(class06378 class063782) {
        this.chance = class063782;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07657.class, "chance", "chance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07657.class, "chance", "chance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07657.class, "chance", "chance"}, this);
    }

    public static class05952 N(float f) {
        return () -> new class07657((class06378)class04711.N((float)f));
    }

    public class05955 N() {
        return class07693.u;
    }

    public boolean test(class05908 class059082) {
        float f = this.chance.y(class059082);
        return class059082.y().z() < f;
    }

    public static class05952 N(class06378 class063782) {
        return () -> new class07657(class063782);
    }
}


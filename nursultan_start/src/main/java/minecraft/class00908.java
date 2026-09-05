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
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class02532
 *  minecraft.class02546
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
 *  minecraft.class07049
 *  minecraft.class07304
 *  minecraft.class07314
 *  minecraft.class07323
 *  minecraft.class07438
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
import java.util.Set;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class02532;
import minecraft.class02546;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class07049;
import minecraft.class07304;
import minecraft.class07314;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07491;
import minecraft.class07693;

public final class class00908
extends Record
implements class05957 {
    private final float unenchantedChance;
    private final class02546 enchantedChance;
    private final class03556<class07304> enchantment;
    public static final MapCodec<class00908> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("unenchanted_chance").forGetter(class00908::L), (App)class02546.y.fieldOf("enchanted_chance").forGetter(class00908::u), (App)class07304.L.fieldOf("enchantment").forGetter(class00908::i)).apply(instance, class00908::new));

    public float L() {
        return this.unenchantedChance;
    }

    public class00908(float f, class02546 class025462, class03556<class07304> class035562) {
        this.unenchantedChance = f;
        this.enchantedChance = class025462;
        this.enchantment = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00908.class, "unenchantedChance;enchantedChance;enchantment", "unenchantedChance", "enchantedChance", "enchantment"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00908.class, "unenchantedChance;enchantedChance;enchantment", "unenchantedChance", "enchantedChance", "enchantment"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00908.class, "unenchantedChance;enchantedChance;enchantment", "unenchantedChance", "enchantedChance", "enchantment"}, this);
    }

    public class03556<class07304> i() {
        return this.enchantment;
    }

    public class02546 u() {
        return this.enchantedChance;
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.R);
    }

    public boolean test(class05908 class059082) {
        int n;
        class07049 class070492 = (class07049)class059082.L(class06551.R);
        if (class070492 instanceof class07438) {
            class07438 class074382 = (class07438)class070492;
            n = class07323.N(this.enchantment, (class07438)class074382);
        } else {
            n = 0;
        }
        int n2 = n;
        float f = n2 > 0 ? this.enchantedChance.N(n2) : this.unenchantedChance;
        return class059082.y().z() < f;
    }

    public static class05952 N(class01929 class019292, float f, float f2) {
        class01921 class019212 = class019292.y(class04227.yR);
        return () -> new class00908(f, (class02546)new class02532(f + f2, f2), (class03556<class07304>)class019212.y(class07314.j));
    }

    public class05955 N() {
        return class07693.i;
    }
}


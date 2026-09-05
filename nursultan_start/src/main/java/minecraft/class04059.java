/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02142
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02142;
import minecraft.class06386;

public final class class04059
extends Record
implements class06386 {
    private final int chargeCount;
    private final int amountPerCharge;
    private final int spreadAttempts;
    private final int growthRounds;
    private final int spreadRounds;
    private final class02142 extraRareGrowths;
    private final float catalystChance;
    public static final Codec<class04059> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)1, (int)32).fieldOf("charge_count").forGetter(class04059::N), (App)Codec.intRange((int)1, (int)500).fieldOf("amount_per_charge").forGetter(class04059::y), (App)Codec.intRange((int)1, (int)64).fieldOf("spread_attempts").forGetter(class04059::L), (App)Codec.intRange((int)0, (int)8).fieldOf("growth_rounds").forGetter(class04059::i), (App)Codec.intRange((int)0, (int)8).fieldOf("spread_rounds").forGetter(class04059::R), (App)class02142.L.fieldOf("extra_rare_growths").forGetter(class04059::M), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("catalyst_chance").forGetter(class04059::B)).apply(instance, class04059::new));

    public int L() {
        return this.spreadAttempts;
    }

    public class02142 M() {
        return this.extraRareGrowths;
    }

    public class04059(int n, int n2, int n3, int n4, int n5, class02142 class021422, float f) {
        this.chargeCount = n;
        this.amountPerCharge = n2;
        this.spreadAttempts = n3;
        this.growthRounds = n4;
        this.spreadRounds = n5;
        this.extraRareGrowths = class021422;
        this.catalystChance = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04059.class, "chargeCount;amountPerCharge;spreadAttempts;growthRounds;spreadRounds;extraRareGrowths;catalystChance", "chargeCount", "amountPerCharge", "spreadAttempts", "growthRounds", "spreadRounds", "extraRareGrowths", "catalystChance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04059.class, "chargeCount;amountPerCharge;spreadAttempts;growthRounds;spreadRounds;extraRareGrowths;catalystChance", "chargeCount", "amountPerCharge", "spreadAttempts", "growthRounds", "spreadRounds", "extraRareGrowths", "catalystChance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04059.class, "chargeCount;amountPerCharge;spreadAttempts;growthRounds;spreadRounds;extraRareGrowths;catalystChance", "chargeCount", "amountPerCharge", "spreadAttempts", "growthRounds", "spreadRounds", "extraRareGrowths", "catalystChance"}, this);
    }

    public float B() {
        return this.catalystChance;
    }

    public int i() {
        return this.growthRounds;
    }

    public int y() {
        return this.amountPerCharge;
    }

    public int N() {
        return this.chargeCount;
    }

    public int R() {
        return this.spreadRounds;
    }
}


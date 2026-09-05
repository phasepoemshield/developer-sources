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
 *  minecraft.class06338
 *  minecraft.class07078
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class04513;
import minecraft.class06338;
import minecraft.class07078;

public final class class04502
extends Record {
    final class03556<class04513> normal;
    final class03556<class04513> ominous;
    final int targetCooldownLength;
    final int requiredPlayerRange;
    public static final MapCodec<class04502> i = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04513.L.optionalFieldOf("normal_config", (Object)class03556.N((Object)((Object)class04513.N))).forGetter(class04502::N), (App)class04513.L.optionalFieldOf("ominous_config", (Object)class03556.N((Object)((Object)class04513.N))).forGetter(class04502::y), (App)class06338.T.optionalFieldOf("target_cooldown_length", (Object)36000).forGetter(class04502::L), (App)Codec.intRange((int)1, (int)128).optionalFieldOf("required_player_range", (Object)14).forGetter(class04502::u)).apply(instance, class04502::new));
    public static final class04502 R = new class04502((class03556<class04513>)class03556.N((Object)((Object)class04513.N)), (class03556<class04513>)class03556.N((Object)((Object)class04513.N)), 36000, 14);

    public int L() {
        return this.targetCooldownLength;
    }

    public class04502(class03556<class04513> class035562, class03556<class04513> class035563, int n, int n2) {
        this.normal = class035562;
        this.ominous = class035563;
        this.targetCooldownLength = n;
        this.requiredPlayerRange = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04502.class, "normal;ominous;targetCooldownLength;requiredPlayerRange", "normal", "ominous", "targetCooldownLength", "requiredPlayerRange"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04502.class, "normal;ominous;targetCooldownLength;requiredPlayerRange", "normal", "ominous", "targetCooldownLength", "requiredPlayerRange"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04502.class, "normal;ominous;targetCooldownLength;requiredPlayerRange", "normal", "ominous", "targetCooldownLength", "requiredPlayerRange"}, this);
    }

    public int u() {
        return this.requiredPlayerRange;
    }

    public class03556<class04513> y() {
        return this.ominous;
    }

    public class03556<class04513> N() {
        return this.normal;
    }

    public class04502 N(class07078<?> class070782) {
        return new class04502((class03556<class04513>)class03556.N((Object)((Object)((class04513)((Object)this.normal.N())).N(class070782))), (class03556<class04513>)class03556.N((Object)((Object)((class04513)((Object)this.ominous.N())).N(class070782))), this.targetCooldownLength, this.requiredPlayerRange);
    }
}


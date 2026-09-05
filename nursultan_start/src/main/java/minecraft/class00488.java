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
 *  minecraft.class01762
 *  minecraft.class01787
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01762;
import minecraft.class01787;
import minecraft.class03748;

public final class class00488
extends Record {
    final int value;
    final boolean locked;
    final Optional<class00392> display;
    final Optional<class01762> numberFormat;
    public static final MapCodec<class00488> i = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.optionalFieldOf("Score", (Object)0).forGetter(class00488::N), (App)Codec.BOOL.optionalFieldOf("Locked", (Object)false).forGetter(class00488::y), (App)class03748.N.optionalFieldOf("display").forGetter(class00488::L), (App)class01787.y.optionalFieldOf("format").forGetter(class00488::u)).apply(instance, class00488::new));

    public Optional<class00392> L() {
        return this.display;
    }

    public class00488(int n, boolean bl, Optional<class00392> optional, Optional<class01762> optional2) {
        this.value = n;
        this.locked = bl;
        this.display = optional;
        this.numberFormat = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00488.class, "value;locked;display;numberFormat", "value", "locked", "display", "numberFormat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00488.class, "value;locked;display;numberFormat", "value", "locked", "display", "numberFormat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00488.class, "value;locked;display;numberFormat", "value", "locked", "display", "numberFormat"}, this);
    }

    public Optional<class01762> u() {
        return this.numberFormat;
    }

    public boolean y() {
        return this.locked;
    }

    public int N() {
        return this.value;
    }
}


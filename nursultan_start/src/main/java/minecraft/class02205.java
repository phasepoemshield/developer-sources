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
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
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
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class07491;
import minecraft.class07693;

public final class class02205
extends Record
implements class05957 {
    private final boolean active;
    public static final MapCodec<class02205> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.fieldOf("active").forGetter(class02205::i)).apply(instance, class02205::new));

    public static class05952 L() {
        return () -> new class02205(true);
    }

    public class02205(boolean bl) {
        this.active = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02205.class, "active", "active"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02205.class, "active", "active"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02205.class, "active", "active"}, this);
    }

    public boolean i() {
        return this.active;
    }

    public static class05952 u() {
        return () -> new class02205(false);
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.m);
    }

    public class05955 N() {
        return class07693.j;
    }

    public boolean test(class05908 class059082) {
        return (Boolean)class059082.y(class06551.m) == this.active;
    }
}


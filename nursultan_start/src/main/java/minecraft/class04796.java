/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05338
 *  minecraft.class05908
 *  minecraft.class05952
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class07491
 *  minecraft.class07693
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class05338;
import minecraft.class05908;
import minecraft.class05952;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class07491;
import minecraft.class07693;

public final class class04796
extends Record
implements class05957 {
    private final class06378 provider;
    private final class05338 range;
    public static final MapCodec<class04796> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06339.N.fieldOf("value").forGetter(class04796::L), (App)class05338.N.fieldOf("range").forGetter(class04796::u)).apply(instance, class04796::new));

    public class06378 L() {
        return this.provider;
    }

    public class04796(class06378 class063782, class05338 class053382) {
        this.provider = class063782;
        this.range = class053382;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04796.class, "provider;range", "provider", "range"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04796.class, "provider;range", "provider", "range"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04796.class, "provider;range", "provider", "range"}, this);
    }

    public class05338 u() {
        return this.range;
    }

    public Set<class07491<?>> y() {
        return Sets.union((Set)this.provider.y(), (Set)this.range.N());
    }

    public boolean test(class05908 class059082) {
        return this.range.y(class059082, this.provider.N(class059082));
    }

    public class05955 N() {
        return class07693.b;
    }

    public static class05952 N(class06378 class063782, class05338 class053382) {
        return () -> new class04796(class063782, class053382);
    }
}


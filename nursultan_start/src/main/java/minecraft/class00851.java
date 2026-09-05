/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01400
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05908
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06551
 *  minecraft.class07491
 *  minecraft.class07670
 *  minecraft.class07693
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.Set;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01400;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05908;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06551;
import minecraft.class07491;
import minecraft.class07670;
import minecraft.class07693;

public final class class00851
extends Record
implements class05957 {
    private final class03556<class00891> block;
    private final Optional<class01400> properties;
    public static final MapCodec<class00851> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.b().fieldOf("block").forGetter(class00851::L), (App)class01400.N.optionalFieldOf("properties").forGetter(class00851::u)).apply(instance, class00851::new)).validate(class00851::N);

    public class03556<class00891> L() {
        return this.block;
    }

    public class00851(class03556<class00891> class035562, Optional<class01400> optional) {
        this.block = class035562;
        this.properties = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00851.class, "block;properties", "block", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00851.class, "block;properties", "block", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00851.class, "block;properties", "block", "properties"}, this);
    }

    public Optional<class01400> u() {
        return this.properties;
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.Z);
    }

    public class05955 N() {
        return class07693.Z;
    }

    private static DataResult<class00851> N(class00851 class008512) {
        return class008512.u().flatMap(class014002 -> class014002.N(((class00891)class008512.L().N()).E())).map(string -> DataResult.error(() -> "Block " + String.valueOf(class008512.L()) + " has no property" + string)).orElse(DataResult.success((Object)((Object)class008512)));
    }

    public static class07670 N(class00891 class008912) {
        return new class07670(class008912);
    }

    public boolean test(class05908 class059082) {
        class00500 class005002 = (class00500)class059082.L(class06551.Z);
        return class005002 != null && class005002.N(this.block) && (this.properties.isEmpty() || this.properties.get().N(class005002));
    }
}


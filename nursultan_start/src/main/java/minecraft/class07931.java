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
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class07905;
import minecraft.class07920;
import minecraft.class07941;
import org.jspecify.annotations.Nullable;

public final class class07931<Params, Result>
extends Record {
    private final String description;
    private final Optional<class07920<Params>> params;
    private final Optional<class07941<Result>> result;

    public Optional<class07920<Params>> L() {
        return this.params;
    }

    public class07931(String string, @Nullable class07920<Params> class079202, @Nullable class07941<Result> class079412) {
        this(string, Optional.ofNullable(class079202), Optional.ofNullable(class079412));
    }

    public class07931(String string, Optional<class07920<Params>> optional, Optional<class07941<Result>> optional2) {
        this.description = string;
        this.params = optional;
        this.result = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07931.class, "description;params;result", "description", "params", "result"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07931.class, "description;params;result", "description", "params", "result"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07931.class, "description;params;result", "description", "params", "result"}, this);
    }

    private static <Params> Codec<Optional<class07920<Params>>> i() {
        return class07920.N().codec().listOf().xmap(class07931::N, class07931::N);
    }

    public Optional<class07941<Result>> u() {
        return this.result;
    }

    public String y() {
        return this.description;
    }

    private static <Params> Optional<class07920<Params>> N(List<class07920<Params>> list) {
        return list.isEmpty() ? Optional.empty() : Optional.of((class07920)((Object)list.getFirst()));
    }

    private static <Params> List<class07920<Params>> N(Optional<class07920<Params>> optional) {
        if (optional.isPresent()) {
            return List.of(optional.get());
        }
        return List.of();
    }

    public class07905<Params, Result> N(class01894 class018942) {
        return new class07905(class018942, this);
    }

    static <Params, Result> MapCodec<class07931<Params, Result>> N() {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("description").forGetter(class07931::y), (App)class07931.i().fieldOf("params").forGetter(class07931::L), (App)class07941.N().optionalFieldOf("result").forGetter(class07931::u)).apply(instance, class07931::new));
    }
}


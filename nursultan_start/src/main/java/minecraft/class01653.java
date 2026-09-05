/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04208
 *  minecraft.class06953
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04208;
import minecraft.class06953;

public final class class01653
extends Record {
    final Optional<class06953> body;
    final Optional<class06953> cape;
    final Optional<class06953> elytra;
    final Optional<class04208> model;
    public static final class01653 i = new class01653(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    public static final MapCodec<class01653> R = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06953.N.optionalFieldOf("texture").forGetter(class01653::N), (App)class06953.N.optionalFieldOf("cape").forGetter(class01653::y), (App)class06953.N.optionalFieldOf("elytra").forGetter(class01653::L), (App)class04208.field_62533.optionalFieldOf("model").forGetter(class01653::u)).apply(instance, class01653::N));
    public static final class02362<ByteBuf, class01653> M = class02362.N((class02362)class06953.L.N_33(class02389::N), class01653::N, (class02362)class06953.L.N_33(class02389::N), class01653::y, (class02362)class06953.L.N_33(class02389::N), class01653::L, (class02362)class04208.field_62534.N_33(class02389::N), class01653::u, class01653::N);

    public Optional<class06953> L() {
        return this.elytra;
    }

    public class01653(Optional<class06953> optional, Optional<class06953> optional2, Optional<class06953> optional3, Optional<class04208> optional4) {
        this.body = optional;
        this.cape = optional2;
        this.elytra = optional3;
        this.model = optional4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01653.class, "body;cape;elytra;model", "body", "cape", "elytra", "model"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01653.class, "body;cape;elytra;model", "body", "cape", "elytra", "model"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01653.class, "body;cape;elytra;model", "body", "cape", "elytra", "model"}, this);
    }

    public Optional<class04208> u() {
        return this.model;
    }

    public Optional<class06953> y() {
        return this.cape;
    }

    public Optional<class06953> N() {
        return this.body;
    }

    public static class01653 N(Optional<class06953> optional, Optional<class06953> optional2, Optional<class06953> optional3, Optional<class04208> optional4) {
        if (optional.isEmpty() && optional2.isEmpty() && optional3.isEmpty() && optional4.isEmpty()) {
            return i;
        }
        return new class01653(optional, optional2, optional3, optional4);
    }
}


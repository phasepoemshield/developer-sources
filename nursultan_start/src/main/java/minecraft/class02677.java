/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.PropertyMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02689;
import minecraft.class06338;

public final class class02677
extends Record {
    final Optional<String> name;
    final Optional<UUID> id;
    final PropertyMap properties;
    public static final class02677 u = new class02677(Optional.empty(), Optional.empty(), PropertyMap.EMPTY);
    static final MapCodec<class02677> i = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06338.K.optionalFieldOf("name").forGetter(class02677::N), (App)class01487.N.optionalFieldOf("id").forGetter(class02677::y), (App)class06338.q.optionalFieldOf("properties", (Object)PropertyMap.EMPTY).forGetter(class02677::L)).apply(instance, class02677::new));
    public static final class02362<ByteBuf, class02677> R = class02362.N((class02362)class02389.w.N_33(class02389::N), class02677::N, (class02362)class01487.M.N_33(class02389::N), class02677::y, (class02362)class02389.d, class02677::L, class02677::new);

    public PropertyMap L() {
        return this.properties;
    }

    protected class02677(Optional<String> optional, Optional<UUID> optional2, PropertyMap propertyMap) {
        this.name = optional;
        this.id = optional2;
        this.properties = propertyMap;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02677.class, "name;id;properties", "name", "id", "properties"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02677.class, "name;id;properties", "name", "id", "properties"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02677.class, "name;id;properties", "name", "id", "properties"}, this);
    }

    public GameProfile u() {
        return class02689.N(this.name, this.id, this.properties);
    }

    public Optional<UUID> y() {
        return this.id;
    }

    public Optional<String> N() {
        return this.name;
    }
}


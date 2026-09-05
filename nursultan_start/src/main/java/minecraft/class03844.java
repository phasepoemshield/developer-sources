/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class03812;
import minecraft.class06338;

final class class03844
extends Record {
    private final UUID id;
    private final String url;
    private final Instant time;
    private final Optional<String> hash;
    private final Either<String, class03812> errorOrFileInfo;
    public static final Codec<class03844> N = RecordCodecBuilder.create(instance -> instance.group((App)class01487.u.fieldOf("id").forGetter(class03844::N), (App)Codec.STRING.fieldOf("url").forGetter(class03844::y), (App)class06338.l.fieldOf("time").forGetter(class03844::L), (App)Codec.STRING.optionalFieldOf("hash").forGetter(class03844::u), (App)Codec.mapEither((MapCodec)Codec.STRING.fieldOf("error"), (MapCodec)class03812.N.fieldOf("file")).forGetter(class03844::i)).apply(instance, class03844::new));

    public Instant L() {
        return this.time;
    }

    class03844(UUID uUID, String string, Instant instant, Optional<String> optional, Either<String, class03812> either) {
        this.id = uUID;
        this.url = string;
        this.time = instant;
        this.hash = optional;
        this.errorOrFileInfo = either;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03844.class, "id;url;time;hash;errorOrFileInfo", "id", "url", "time", "hash", "errorOrFileInfo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03844.class, "id;url;time;hash;errorOrFileInfo", "id", "url", "time", "hash", "errorOrFileInfo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03844.class, "id;url;time;hash;errorOrFileInfo", "id", "url", "time", "hash", "errorOrFileInfo"}, this);
    }

    public Either<String, class03812> i() {
        return this.errorOrFileInfo;
    }

    public Optional<String> u() {
        return this.hash;
    }

    public String y() {
        return this.url;
    }

    public UUID N() {
        return this.id;
    }
}


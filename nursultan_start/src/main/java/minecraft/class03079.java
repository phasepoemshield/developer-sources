/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.google.common.primitives.Longs
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03397
 *  minecraft.class03934
 *  minecraft.class06338
 */
package minecraft;

import com.google.common.primitives.Ints;
import com.google.common.primitives.Longs;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import java.time.Instant;
import minecraft.class03048;
import minecraft.class03056;
import minecraft.class03397;
import minecraft.class03934;
import minecraft.class06338;

public final class class03079
extends Record {
    private final String content;
    private final Instant timeStamp;
    private final long salt;
    private final class03048 lastSeen;
    public static final MapCodec<class03079> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("content").forGetter(class03079::N), (App)class06338.l.fieldOf("time_stamp").forGetter(class03079::y), (App)Codec.LONG.fieldOf("salt").forGetter(class03079::L), (App)class03048.N.optionalFieldOf("last_seen", (Object)class03048.y).forGetter(class03079::u)).apply(instance, class03079::new));

    public long L() {
        return this.salt;
    }

    public class03079(String string, Instant instant, long l, class03048 class030482) {
        this.content = string;
        this.timeStamp = instant;
        this.salt = l;
        this.lastSeen = class030482;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03079.class, "content;timeStamp;salt;lastSeen", "content", "timeStamp", "salt", "lastSeen"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03079.class, "content;timeStamp;salt;lastSeen", "content", "timeStamp", "salt", "lastSeen"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03079.class, "content;timeStamp;salt;lastSeen", "content", "timeStamp", "salt", "lastSeen"}, this);
    }

    public class03048 u() {
        return this.lastSeen;
    }

    public Instant y() {
        return this.timeStamp;
    }

    public class03056 N(class03397 class033972) {
        return new class03056(this.content, this.timeStamp, this.salt, this.lastSeen.N(class033972));
    }

    public void N(class03934 class039342) throws SignatureException {
        class039342.update(Longs.toByteArray((long)this.salt));
        class039342.update(Longs.toByteArray((long)this.timeStamp.getEpochSecond()));
        byte[] byArray = this.content.getBytes(StandardCharsets.UTF_8);
        class039342.update(Ints.toByteArray((int)byArray.length));
        class039342.update(byArray);
        this.lastSeen.N(class039342);
    }

    public static class03079 N(String string) {
        return new class03079(string, Instant.now(), 0L, class03048.y);
    }

    public String N() {
        return this.content;
    }
}


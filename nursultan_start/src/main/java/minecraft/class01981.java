/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class01487;

final class class01981
extends Record {
    private final UUID player;
    private final long timestamp;
    public static final Codec<class01981> N = RecordCodecBuilder.create(instance -> instance.group((App)class01487.N.fieldOf("player").forGetter(class01981::N), (App)Codec.LONG.fieldOf("timestamp").forGetter(class01981::y)).apply(instance, class01981::new));

    class01981(UUID uUID, long l) {
        this.player = uUID;
        this.timestamp = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01981.class, "player;timestamp", "player", "timestamp"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01981.class, "player;timestamp", "player", "timestamp"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01981.class, "player;timestamp", "player", "timestamp"}, this);
    }

    public long y() {
        return this.timestamp;
    }

    public UUID N() {
        return this.player;
    }
}


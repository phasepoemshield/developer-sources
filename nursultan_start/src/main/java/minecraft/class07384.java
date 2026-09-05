/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07947
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class07415;
import minecraft.class07947;

public final class class07384
extends Record {
    private final class07947 player;
    final Optional<class07415> message;
    public static final MapCodec<class07384> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07947.N.codec().fieldOf("player").forGetter(class07384::N), (App)class07415.N.optionalFieldOf("message").forGetter(class07384::y)).apply(instance, class07384::new));

    public class07384(class07947 class079472, Optional<class07415> optional) {
        this.player = class079472;
        this.message = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07384.class, "player;message", "player", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07384.class, "player;message", "player", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07384.class, "player;message", "player", "message"}, this);
    }

    public Optional<class07415> y() {
        return this.message;
    }

    public class07947 N() {
        return this.player;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03075
 *  minecraft.class03748
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Instant;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class03075;
import minecraft.class03387;
import minecraft.class03748;
import minecraft.class06338;

public final class class03391
extends Record
implements class03387 {
    private final class00392 message;
    private final Instant timeStamp;
    public static final MapCodec<class03391> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("message").forGetter(class03391::L), (App)class06338.l.fieldOf("time_stamp").forGetter(class03391::u)).apply(instance, class03391::new));

    public class00392 L() {
        return this.message;
    }

    public class03391(class00392 class003922, Instant instant) {
        this.message = class003922;
        this.timeStamp = instant;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03391.class, "message;timeStamp", "message", "timeStamp"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03391.class, "message;timeStamp", "message", "timeStamp"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03391.class, "message;timeStamp", "message", "timeStamp"}, this);
    }

    public class03075 i() {
        return class03075.field_40805;
    }

    public Instant u() {
        return this.timeStamp;
    }

    @Override
    public class00392 N() {
        return this.message;
    }

    @Override
    public boolean N(UUID uUID) {
        return false;
    }
}


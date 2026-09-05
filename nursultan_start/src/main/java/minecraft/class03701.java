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
 *  minecraft.class01372
 *  minecraft.class04673
 *  minecraft.class08510
 *  minecraft.class08511
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01372;
import minecraft.class04673;
import minecraft.class08510;
import minecraft.class08511;

public final class class03701
extends Record {
    private final class08511 x;
    private final class08511 y;
    private final class08511 z;
    private final boolean uvLock;
    public static final MapCodec<class03701> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08511.field_57033.optionalFieldOf("x", (Object)class08511.field_57029).forGetter(class03701::y), (App)class08511.field_57033.optionalFieldOf("y", (Object)class08511.field_57029).forGetter(class03701::L), (App)class08511.field_57033.optionalFieldOf("z", (Object)class08511.field_57029).forGetter(class03701::u), (App)Codec.BOOL.optionalFieldOf("uvlock", (Object)false).forGetter(class03701::i)).apply(instance, class03701::new));
    public static final class03701 y_const = new class03701(class08511.field_57029, class08511.field_57029, class08511.field_57029, false);

    public class03701 L(class08511 class085112) {
        return new class03701(this.x, this.y, class085112, this.uvLock);
    }

    public class08511 L() {
        return this.y;
    }

    public class03701(class08511 class085112, class08511 class085113, class08511 class085114, boolean bl) {
        this.x = class085112;
        this.y = class085113;
        this.z = class085114;
        this.uvLock = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03701.class, "x;y;z;uvLock", "x", "y", "z", "uvLock"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03701.class, "x;y;z;uvLock", "x", "y", "z", "uvLock"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03701.class, "x;y;z;uvLock", "x", "y", "z", "uvLock"}, this);
    }

    public boolean i() {
        return this.uvLock;
    }

    public class08511 u() {
        return this.z;
    }

    public class03701 y(class08511 class085112) {
        return new class03701(this.x, class085112, this.z, this.uvLock);
    }

    public class08511 y() {
        return this.x;
    }

    public class03701 N(boolean bl) {
        return new class03701(this.x, this.y, this.z, bl);
    }

    public class03701 N(class08511 class085112) {
        return new class03701(class085112, this.y, this.z, this.uvLock);
    }

    public class04673 N() {
        class08510 class085102 = class08510.N((class01372)class08511.N((class08511)this.x, (class08511)this.y, (class08511)this.z));
        return this.uvLock ? class085102.N() : class085102;
    }
}


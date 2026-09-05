/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09415
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00926
 *  minecraft.class00949
 *  minecraft.class02689
 */
package minecraft;

import Nursultan.class09415;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00926;
import minecraft.class00949;
import minecraft.class02689;

public final class class06609
extends Record
implements class00926 {
    private final class02689 player;
    private final boolean hat;
    public static final MapCodec<class06609> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02689.N.fieldOf("player").forGetter(class06609::u), (App)Codec.BOOL.optionalFieldOf("hat", (Object)true).forGetter(class06609::i)).apply(instance, class06609::new));

    public String L() {
        return this.player.u().map(string -> "[" + string + " head]").orElse("[unknown player head]");
    }

    public class06609(class02689 class026892, boolean bl) {
        this.player = class026892;
        this.hat = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06609.class, "player;hat", "player", "hat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06609.class, "player;hat", "player", "hat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06609.class, "player;hat", "player", "hat"}, this);
    }

    public boolean i() {
        return this.hat;
    }

    public class02689 u() {
        return this.player;
    }

    public class00949 y() {
        return new class09415(this.player, this.hat);
    }

    public MapCodec<class06609> N() {
        return N;
    }
}


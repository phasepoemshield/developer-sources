/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05220
 *  minecraft.class08734
 *  minecraft.class08752
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class05220;
import minecraft.class08734;
import minecraft.class08752;
import minecraft.class09027;
import minecraft.class09032;
import minecraft.class09039;

public final class class09024
extends Record
implements class09032 {
    private final class09039 common;
    private final class08734 action;
    public static final class08734 N = new class08734(new class09027(class05220.B, 150), Optional.empty());
    public static final MapCodec<class09024> B = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09039.N.forGetter(class09024::H_), (App)class08734.N.optionalFieldOf("action", (Object)N).forGetter(class09024::i)).apply(instance, class09024::new));

    public class09024(class09039 class090392, class08734 class087342) {
        this.common = class090392;
        this.action = class087342;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09024.class, "common;action", "common", "action"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09024.class, "common;action", "common", "action"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09024.class, "common;action", "common", "action"}, this);
    }

    public class08734 i() {
        return this.action;
    }

    @Override
    public Optional<class08752> u() {
        return this.action.y();
    }

    @Override
    public List<class08734> y() {
        return List.of(this.action);
    }

    public MapCodec<class09024> N() {
        return B;
    }

    @Override
    public class09039 H_() {
        return this.common;
    }
}


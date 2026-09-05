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
 *  minecraft.class06338
 *  minecraft.class08734
 *  minecraft.class09039
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class06338;
import minecraft.class08734;
import minecraft.class09019;
import minecraft.class09039;

public final class class09007
extends Record
implements class09019 {
    private final class09039 common;
    private final List<class08734> actions;
    private final Optional<class08734> exitAction;
    private final int columns;
    public static final MapCodec<class09007> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09039.N.forGetter(class09007::H_), (App)class06338.y((Codec)class08734.N.listOf()).fieldOf("actions").forGetter(class09007::i), (App)class08734.N.optionalFieldOf("exit_action").forGetter(class09007::L), (App)class06338.b.optionalFieldOf("columns", (Object)2).forGetter(class09007::y)).apply(instance, class09007::new));

    @Override
    public Optional<class08734> L() {
        return this.exitAction;
    }

    public class09007(class09039 class090392, List<class08734> list, Optional<class08734> optional, int n) {
        this.common = class090392;
        this.actions = list;
        this.exitAction = optional;
        this.columns = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09007.class, "common;actions;exitAction;columns", "common", "actions", "exitAction", "columns"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09007.class, "common;actions;exitAction;columns", "common", "actions", "exitAction", "columns"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09007.class, "common;actions;exitAction;columns", "common", "actions", "exitAction", "columns"}, this);
    }

    public List<class08734> i() {
        return this.actions;
    }

    @Override
    public int y() {
        return this.columns;
    }

    public MapCodec<class09007> N() {
        return N;
    }

    public class09039 H_() {
        return this.common;
    }
}


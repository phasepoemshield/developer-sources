/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
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
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class06338;
import minecraft.class08734;
import minecraft.class09019;
import minecraft.class09039;

public final class class09001
extends Record
implements class09019 {
    private final class09039 common;
    private final Optional<class08734> exitAction;
    private final int columns;
    private final int buttonWidth;
    public static final MapCodec<class09001> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class09039.N.forGetter(class09001::H_), (App)class08734.N.optionalFieldOf("exit_action").forGetter(class09001::L), (App)class06338.b.optionalFieldOf("columns", (Object)2).forGetter(class09001::y), (App)y.optionalFieldOf("button_width", (Object)150).forGetter(class09001::i)).apply(instance, class09001::new));

    @Override
    public Optional<class08734> L() {
        return this.exitAction;
    }

    public class09001(class09039 class090392, Optional<class08734> optional, int n, int n2) {
        this.common = class090392;
        this.exitAction = optional;
        this.columns = n;
        this.buttonWidth = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09001.class, "common;exitAction;columns;buttonWidth", "common", "exitAction", "columns", "buttonWidth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09001.class, "common;exitAction;columns;buttonWidth", "common", "exitAction", "columns", "buttonWidth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09001.class, "common;exitAction;columns;buttonWidth", "common", "exitAction", "columns", "buttonWidth"}, this);
    }

    public int i() {
        return this.buttonWidth;
    }

    @Override
    public int y() {
        return this.columns;
    }

    public MapCodec<class09001> N() {
        return N;
    }

    public class09039 H_() {
        return this.common;
    }
}


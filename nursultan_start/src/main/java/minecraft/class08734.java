/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class09027
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class08752;
import minecraft.class09027;

public final class class08734
extends Record {
    private final class09027 button;
    private final Optional<class08752> action;
    public static final Codec<class08734> N = RecordCodecBuilder.create(instance -> instance.group((App)class09027.y.forGetter(class08734::N), (App)class08752.y.optionalFieldOf("action").forGetter(class08734::y)).apply(instance, class08734::new));

    public class08734(class09027 class090272, Optional<class08752> optional) {
        this.button = class090272;
        this.action = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08734.class, "button;action", "button", "action"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08734.class, "button;action", "button", "action"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08734.class, "button;action", "button", "action"}, this);
    }

    public Optional<class08752> y() {
        return this.action;
    }

    public class09027 N() {
        return this.button;
    }
}


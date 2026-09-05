/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08264;
import minecraft.class08269;

final class class08249
extends Record {
    private final class08264 format;
    private final class08269 entry;
    public static final Codec<class08249> N = RecordCodecBuilder.create(instance -> instance.group((App)class08264.field_53710.fieldOf("format").forGetter(class08249::N), (App)class08269.N.forGetter(class08249::y)).apply(instance, class08249::new));

    class08249(class08264 class082642, class08269 class082692) {
        this.format = class082642;
        this.entry = class082692;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08249.class, "format;entry", "format", "entry"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08249.class, "format;entry", "format", "entry"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08249.class, "format;entry", "format", "entry"}, this);
    }

    public class08269 y() {
        return this.entry;
    }

    public class08264 N() {
        return this.format;
    }
}


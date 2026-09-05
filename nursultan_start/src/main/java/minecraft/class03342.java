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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03371;
import minecraft.class06338;

final class class03342
extends Record {
    private final class03371 type;
    private final String id;
    private final String name;
    public static final MapCodec<class03342> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03371.field_44571.fieldOf("type").forGetter(class03342::N), (App)class06338.w.fieldOf("id").forGetter(class03342::y), (App)Codec.STRING.fieldOf("name").forGetter(class03342::L)).apply(instance, class03342::new));

    public String L() {
        return this.name;
    }

    class03342(class03371 class033712, String string, String string2) {
        this.type = class033712;
        this.id = string;
        this.name = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03342.class, "type;id;name", "type", "id", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03342.class, "type;id;name", "type", "id", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03342.class, "type;id;name", "type", "id", "name"}, this);
    }

    public String y() {
        return this.id;
    }

    public class03371 N() {
        return this.type;
    }
}


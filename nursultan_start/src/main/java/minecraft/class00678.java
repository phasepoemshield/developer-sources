/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class06339
 *  minecraft.class06378
 *  minecraft.class07084
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class06339;
import minecraft.class06378;
import minecraft.class07084;

final class class00678
extends Record {
    private final class03556<class07084> effect;
    private final class06378 duration;
    public static final Codec<class00678> N = RecordCodecBuilder.create(instance -> instance.group((App)class07084.N.fieldOf("type").forGetter(class00678::N), (App)class06339.N.fieldOf("duration").forGetter(class00678::y)).apply(instance, class00678::new));

    class00678(class03556<class07084> class035562, class06378 class063782) {
        this.effect = class035562;
        this.duration = class063782;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00678.class, "effect;duration", "effect", "duration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00678.class, "effect;duration", "effect", "duration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00678.class, "effect;duration", "effect", "duration"}, this);
    }

    public class06378 y() {
        return this.duration;
    }

    public class03556<class07084> N() {
        return this.effect;
    }
}


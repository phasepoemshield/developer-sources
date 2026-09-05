/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02968
 *  minecraft.class06243
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02968;
import minecraft.class06243;

public final class class06264
extends Record {
    private final class06243 hat;
    public static final Codec<class06264> N = RecordCodecBuilder.create(instance -> instance.group((App)class06243.field_55540.optionalFieldOf("hat", (Object)class06243.field_17160).forGetter(class06264::N)).apply(instance, class06264::new));
    public static final class02968<class06264> y = new class02968("villager", N);

    public class06264(class06243 class062432) {
        this.hat = class062432;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06264.class, "hat", "hat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06264.class, "hat", "hat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06264.class, "hat", "hat"}, this);
    }

    public class06243 N() {
        return this.hat;
    }
}


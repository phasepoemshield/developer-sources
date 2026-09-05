/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00395;
import minecraft.class00398;
import minecraft.class00425;

public final class class00391
extends Record
implements class00395 {
    private final class00398 entity;
    public static final MapCodec<class00391> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00398.N.forGetter(class00391::y)).apply(instance, class00391::new));

    public class00391(class00398 class003982) {
        this.entity = class003982;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00391.class, "entity", "entity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00391.class, "entity", "entity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00391.class, "entity", "entity"}, this);
    }

    public class00398 y() {
        return this.entity;
    }

    @Override
    public class00425 N() {
        return class00425.field_24344;
    }
}


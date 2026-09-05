/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08195
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08159;
import minecraft.class08195;

public final class class08179
extends Record
implements class08159 {
    private final class08195 level;
    public static final MapCodec<class08179> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08195.field_63201.fieldOf("level").forGetter(class08179::y)).apply(instance, class08179::new));

    public class08179(class08195 class081952) {
        this.level = class081952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08179.class, "level", "level"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08179.class, "level", "level"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08179.class, "level", "level"}, this);
    }

    public class08195 y() {
        return this.level;
    }

    public MapCodec<class08179> N() {
        return L;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00425;
import minecraft.class03748;

public final class class00401
extends Record
implements class00395 {
    private final class00392 value;
    public static final MapCodec<class00401> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("value").forGetter(class00401::y)).apply(instance, class00401::new));

    public class00401(class00392 class003922) {
        this.value = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00401.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00401.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00401.class, "value", "value"}, this);
    }

    public class00392 y() {
        return this.value;
    }

    @Override
    public class00425 N() {
        return class00425.field_24342;
    }
}


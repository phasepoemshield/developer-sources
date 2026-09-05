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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00647;
import minecraft.class00654;

public final class class00627
extends Record
implements class00647 {
    private final String value;
    public static final MapCodec<class00627> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.fieldOf("value").forGetter(class00627::y)).apply(instance, class00627::new));

    public class00627(String string) {
        this.value = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00627.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00627.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00627.class, "value", "value"}, this);
    }

    public String y() {
        return this.value;
    }

    @Override
    public class00654 N() {
        return class00654.field_21462;
    }
}


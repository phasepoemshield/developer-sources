/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04782
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00213;
import minecraft.class00225;
import minecraft.class04782;

public final class class00193
extends Record
implements class00225 {
    private final class00213 weather;
    public static final MapCodec<class00193> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00213.field_56211.fieldOf("weather").forGetter(class00193::y)).apply(instance, class00193::new));

    public class00193(class00213 class002132) {
        this.weather = class002132;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00193.class, "weather", "weather"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00193.class, "weather", "weather"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00193.class, "weather", "weather"}, this);
    }

    @Override
    public void y(class04782 class047822) {
        class047822.method_14195();
    }

    public class00213 y() {
        return this.weather;
    }

    @Override
    public void N(class04782 class047822) {
        this.weather.N(class047822);
    }

    public MapCodec<class00193> N() {
        return L;
    }
}


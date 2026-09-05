/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02546
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02536;
import minecraft.class02546;
import minecraft.class06069;

public final class class02527
extends Record
implements class02536 {
    private final class02546 value;
    public static final MapCodec<class02527> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("value").forGetter(class02527::y)).apply(instance, class02527::new));

    public class02527(class02546 class025462) {
        this.value = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02527.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02527.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02527.class, "value", "value"}, this);
    }

    public class02546 y() {
        return this.value;
    }

    public MapCodec<class02527> N() {
        return N;
    }

    @Override
    public float N(int n, class06069 class060692, float f) {
        return f + this.value.N(n);
    }
}


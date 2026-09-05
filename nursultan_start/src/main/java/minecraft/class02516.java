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
 *  minecraft.class02546
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02546;

public final class class02516
extends Record
implements class02546 {
    private final List<Float> values;
    private final class02546 fallback;
    public static final MapCodec<class02516> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.listOf().fieldOf("values").forGetter(class02516::y), (App)class02546.y.fieldOf("fallback").forGetter(class02516::L)).apply(instance, class02516::new));

    public class02546 L() {
        return this.fallback;
    }

    public class02516(List<Float> list, class02546 class025462) {
        this.values = list;
        this.fallback = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02516.class, "values;fallback", "values", "fallback"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02516.class, "values;fallback", "values", "fallback"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02516.class, "values;fallback", "values", "fallback"}, this);
    }

    public List<Float> y() {
        return this.values;
    }

    public MapCodec<class02516> N() {
        return L;
    }

    public float N(int n) {
        return n <= this.values.size() ? this.values.get(n - 1).floatValue() : this.fallback.N(n);
    }
}


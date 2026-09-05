/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02536
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

public final class class08150
extends Record
implements class02536 {
    private final class02546 base;
    private final class02546 exponent;
    public static final MapCodec<class08150> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("base").forGetter(class08150::y), (App)class02546.y.fieldOf("exponent").forGetter(class08150::L)).apply(instance, class08150::new));

    public class02546 L() {
        return this.exponent;
    }

    public class08150(class02546 class025462, class02546 class025463) {
        this.base = class025462;
        this.exponent = class025463;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08150.class, "base;exponent", "base", "exponent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08150.class, "base;exponent", "base", "exponent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08150.class, "base;exponent", "base", "exponent"}, this);
    }

    public class02546 y() {
        return this.base;
    }

    public MapCodec<class08150> N() {
        return N;
    }

    public float N(int n, class06069 class060692, float f) {
        return (float)((double)f * Math.pow(this.base.N(n), this.exponent.N(n)));
    }
}


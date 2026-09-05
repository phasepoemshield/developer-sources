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

public final class class02544
extends Record
implements class02536 {
    private final class02546 factor;
    public static final MapCodec<class02544> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("factor").forGetter(class02544::y)).apply(instance, class02544::new));

    public class02544(class02546 class025462) {
        this.factor = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02544.class, "factor", "factor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02544.class, "factor", "factor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02544.class, "factor", "factor"}, this);
    }

    public class02546 y() {
        return this.factor;
    }

    public MapCodec<class02544> N() {
        return N;
    }

    public float N(int n, class06069 class060692, float f) {
        return f * this.factor.N(n);
    }
}


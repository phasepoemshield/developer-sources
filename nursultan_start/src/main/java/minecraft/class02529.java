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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02546;

public final class class02529
extends Record
implements class02546 {
    private final class02546 base;
    private final class02546 power;
    public static final MapCodec<class02529> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("base").forGetter(class02529::y), (App)class02546.y.fieldOf("power").forGetter(class02529::L)).apply(instance, class02529::new));

    public class02546 L() {
        return this.power;
    }

    public class02529(class02546 class025462, class02546 class025463) {
        this.base = class025462;
        this.power = class025463;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02529.class, "base;power", "base", "power"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02529.class, "base;power", "base", "power"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02529.class, "base;power", "base", "power"}, this);
    }

    public class02546 y() {
        return this.base;
    }

    public MapCodec<class02529> N() {
        return L;
    }

    public float N(int n) {
        return (float)Math.pow(this.base.N(n), this.power.N(n));
    }
}


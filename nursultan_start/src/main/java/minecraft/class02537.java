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

public final class class02537
extends Record
implements class02546 {
    private final class02546 numerator;
    private final class02546 denominator;
    public static final MapCodec<class02537> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("numerator").forGetter(class02537::y), (App)class02546.y.fieldOf("denominator").forGetter(class02537::L)).apply(instance, class02537::new));

    public class02546 L() {
        return this.denominator;
    }

    public class02537(class02546 class025462, class02546 class025463) {
        this.numerator = class025462;
        this.denominator = class025463;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02537.class, "numerator;denominator", "numerator", "denominator"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02537.class, "numerator;denominator", "numerator", "denominator"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02537.class, "numerator;denominator", "numerator", "denominator"}, this);
    }

    public class02546 y() {
        return this.numerator;
    }

    public MapCodec<class02537> N() {
        return L;
    }

    public float N(int n) {
        float f = this.denominator.N(n);
        if (f == 0.0f) {
            return 0.0f;
        }
        return this.numerator.N(n) / f;
    }
}


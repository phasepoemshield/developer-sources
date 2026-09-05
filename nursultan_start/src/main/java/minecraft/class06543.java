/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05298
 *  minecraft.class05849
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06338
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08038
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05298;
import minecraft.class05849;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06338;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08038;

public final class class06543
extends Record {
    private final float minRange;
    private final float maxRange;
    private final float minCreativeRange;
    private final float maxCreativeRange;
    private final float hitboxMargin;
    private final float mobFactor;
    public static final Codec<class06543> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.N((float)0.0f, (float)64.0f).optionalFieldOf("min_reach", (Object)Float.valueOf(0.0f)).forGetter(class06543::N), (App)class06338.N((float)0.0f, (float)64.0f).optionalFieldOf("max_reach", (Object)Float.valueOf(3.0f)).forGetter(class06543::y), (App)class06338.N((float)0.0f, (float)64.0f).optionalFieldOf("min_creative_reach", (Object)Float.valueOf(0.0f)).forGetter(class06543::L), (App)class06338.N((float)0.0f, (float)64.0f).optionalFieldOf("max_creative_reach", (Object)Float.valueOf(5.0f)).forGetter(class06543::u), (App)class06338.N((float)0.0f, (float)1.0f).optionalFieldOf("hitbox_margin", (Object)Float.valueOf(0.3f)).forGetter(class06543::i), (App)Codec.floatRange((float)0.0f, (float)2.0f).optionalFieldOf("mob_factor", (Object)Float.valueOf(1.0f)).forGetter(class06543::R)).apply(instance, class06543::new));
    public static final class02362<ByteBuf, class06543> y = class02362.N((class02362)class02389.E, class06543::N, (class02362)class02389.E, class06543::y, (class02362)class02389.E, class06543::L, (class02362)class02389.E, class06543::u, (class02362)class02389.E, class06543::i, (class02362)class02389.E, class06543::R, class06543::new);

    public float L() {
        return this.minCreativeRange;
    }

    public class06543(float f, float f2, float f3, float f4, float f5, float f6) {
        this.minRange = f;
        this.maxRange = f2;
        this.minCreativeRange = f3;
        this.maxCreativeRange = f4;
        this.hitboxMargin = f5;
        this.mobFactor = f6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06543.class, "minRange;maxRange;minCreativeRange;maxCreativeRange;hitboxMargin;mobFactor", "minRange", "maxRange", "minCreativeRange", "maxCreativeRange", "hitboxMargin", "mobFactor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06543.class, "minRange;maxRange;minCreativeRange;maxCreativeRange;hitboxMargin;mobFactor", "minRange", "maxRange", "minCreativeRange", "maxCreativeRange", "hitboxMargin", "mobFactor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06543.class, "minRange;maxRange;minCreativeRange;maxCreativeRange;hitboxMargin;mobFactor", "minRange", "maxRange", "minCreativeRange", "maxCreativeRange", "hitboxMargin", "mobFactor"}, this);
    }

    public float i() {
        return this.hitboxMargin;
    }

    public float u() {
        return this.maxCreativeRange;
    }

    public float y() {
        return this.maxRange;
    }

    public float y(class07049 class070492) {
        if (class070492 instanceof class08036) {
            return ((class08036)class070492).method_68878() ? this.maxCreativeRange : this.maxRange;
        }
        return this.maxRange * this.mobFactor;
    }

    public float N(class07049 class070492) {
        if (class070492 instanceof class08036) {
            class08036 class080362 = (class08036)class070492;
            if (class080362.method_7325()) {
                return 0.0f;
            }
            return class080362.method_68878() ? this.minCreativeRange : this.minRange;
        }
        return this.minRange * this.mobFactor;
    }

    public static class06543 N(class07438 class074382) {
        return new class06543(0.0f, (float)class074382.method_45325(class05298.E), 0.0f, (float)class074382.method_45325(class05298.E), 0.0f, 1.0f);
    }

    public boolean N(class07438 class074382, class00734 class007342, double d) {
        return this.N(class074382, arg_0 -> ((class00734)class007342).i(arg_0), d);
    }

    public boolean N(class07438 class074382, class06889 class068892) {
        return this.N(class074382, arg_0 -> ((class06889)class068892).M(arg_0), 0.0);
    }

    private boolean N(class07438 class074382, ToDoubleFunction<class06889> toDoubleFunction, double d) {
        double d2 = Math.sqrt(toDoubleFunction.applyAsDouble(class074382.method_33571()));
        double d3 = (double)(this.N((class07049)class074382) - this.hitboxMargin) - d;
        double d4 = (double)(this.y((class07049)class074382) + this.hitboxMargin) + d;
        return d2 >= d3 && d2 <= d4;
    }

    public class07089 N(class07049 class070492, float f, Predicate<class07049> predicate) {
        class06145 class0614522;
        Either var4 = class08038.N((class07049)class070492, (class06543)this, predicate, (class05849)class05849.field_17559);
        if (var4.left().isPresent()) {
            return (class07089)var4.left().get();
        }
        Collection var5 = (Collection)var4.right().get();
        class06145 class061453 = null;
        class06889 class068892 = class070492.method_5836(f);
        double d = Double.MAX_VALUE;
        for (class06145 class0614522 : var5) {
            double d2 = class068892.M(class0614522.y());
            if (!(d2 < d)) continue;
            d = d2;
            class061453 = class0614522;
        }
        if (class061453 != null) {
            return class061453;
        }
        class06889 class068893 = class070492.method_75117();
        class0614522 = class070492.method_5836(f).i(class068893);
        return class06183.N((class06889)class0614522, (class07211)class07211.N((class06889)class068893), (class07209)class07209.method_49638((class00737)class0614522));
    }

    public float N() {
        return this.minRange;
    }

    public float R() {
        return this.mobFactor;
    }
}


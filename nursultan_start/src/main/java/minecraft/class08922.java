/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00331
 *  minecraft.class00333
 *  minecraft.class00335
 *  minecraft.class00368
 *  minecraft.class01894
 *  minecraft.class02028
 *  minecraft.class08350
 *  minecraft.class08517
 *  minecraft.class08529
 *  minecraft.class08838
 *  minecraft.class08895
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00331;
import minecraft.class00333;
import minecraft.class00335;
import minecraft.class00368;
import minecraft.class01894;
import minecraft.class02028;
import minecraft.class08350;
import minecraft.class08517;
import minecraft.class08529;
import minecraft.class08838;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08910;
import minecraft.class08930;

public final class class08922
extends Record
implements class08895 {
    private final class01894 base;
    private final class00335 specialModel;
    public static final MapCodec<class08922> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("base").forGetter(class08922::N), (App)class00333.y.fieldOf("model").forGetter(class08922::y)).apply(instance, class08922::new));

    public class08922(class01894 class018942, class00335 class003352) {
        this.base = class018942;
        this.specialModel = class003352;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08922.class, "base;specialModel", "base", "specialModel"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08922.class, "base;specialModel", "base", "specialModel"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08922.class, "base;specialModel", "base", "specialModel"}, this);
    }

    public class00335 y() {
        return this.specialModel;
    }

    public class01894 N() {
        return this.base;
    }

    private class08517 N(class08905 class089052) {
        class02028 class020282 = class089052.N();
        class08529 class085292 = class020282.N(this.base);
        class08838 class088382 = class085292.B();
        return class08517.N((class02028)class020282, (class08529)class085292, (class08838)class088382);
    }

    public void method_62326(class08350 class083502) {
        class083502.markDependency(this.base);
    }

    public MapCodec<class08922> method_65585() {
        return N;
    }

    public class08910 method_65587(class08905 class089052) {
        class00368 class003682 = this.specialModel.N((class00331)class089052);
        if (class003682 == null) {
            return class089052.i();
        }
        class08517 class085172 = this.N(class089052);
        return new class08930(class003682, class085172);
    }
}


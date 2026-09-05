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
 *  minecraft.class01894
 *  minecraft.class02028
 *  minecraft.class04673
 *  minecraft.class08350
 *  minecraft.class08431
 *  minecraft.class08503
 *  minecraft.class08511
 *  minecraft.class08856
 *  minecraft.class08877
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02028;
import minecraft.class03701;
import minecraft.class04673;
import minecraft.class08350;
import minecraft.class08431;
import minecraft.class08503;
import minecraft.class08511;
import minecraft.class08856;
import minecraft.class08877;

public final class class03674
extends Record
implements class08856 {
    private final class01894 modelLocation;
    private final class03701 modelState;
    public static final MapCodec<class03674> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("model").forGetter(class03674::N), (App)class03701.N.forGetter(class03674::y)).apply(instance, class03674::new));
    public static final Codec<class03674> y = N.codec();

    public class03674 L(class08511 class085112) {
        return this.N(this.modelState.L(class085112));
    }

    public class03674(class01894 class018942) {
        this(class018942, class03701.y_const);
    }

    public class03674(class01894 class018942, class03701 class037012) {
        this.modelLocation = class018942;
        this.modelState = class037012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03674.class, "modelLocation;modelState", "modelLocation", "modelState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03674.class, "modelLocation;modelState", "modelLocation", "modelState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03674.class, "modelLocation;modelState", "modelLocation", "modelState"}, this);
    }

    public class03701 y() {
        return this.modelState;
    }

    public class03674 y(class08511 class085112) {
        return this.N(this.modelState.y(class085112));
    }

    public class03674 N(class01894 class018942) {
        return new class03674(class018942, this.modelState);
    }

    public class01894 N() {
        return this.modelLocation;
    }

    public class03674 N(boolean bl) {
        return this.N(this.modelState.N(bl));
    }

    public class08877 N(class02028 class020282) {
        return class08431.N((class02028)class020282, (class01894)this.modelLocation, (class04673)this.modelState.N());
    }

    public class03674 N(class08511 class085112) {
        return this.N(this.modelState.N(class085112));
    }

    public class03674 N(class08503 class085032) {
        return (class03674)((Object)class085032.apply((Object)this));
    }

    public class03674 N(class03701 class037012) {
        return new class03674(this.modelLocation, class037012);
    }

    public void method_62326(class08350 class083502) {
        class083502.markDependency(this.modelLocation);
    }
}


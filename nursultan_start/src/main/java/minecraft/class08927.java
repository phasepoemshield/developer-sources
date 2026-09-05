/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00203
 *  minecraft.class01929
 *  minecraft.class03448
 *  minecraft.class08350
 *  minecraft.class08542
 *  minecraft.class08546
 *  minecraft.class08559
 *  minecraft.class08895
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00203;
import minecraft.class01929;
import minecraft.class03448;
import minecraft.class08350;
import minecraft.class08542;
import minecraft.class08546;
import minecraft.class08559;
import minecraft.class08895;
import minecraft.class08905;
import minecraft.class08909;
import minecraft.class08910;
import minecraft.class08913;
import minecraft.class08917;
import minecraft.class08939;
import org.jspecify.annotations.Nullable;

public final class class08927
extends Record
implements class08895 {
    private final class08909 property;
    private final class08895 onTrue;
    private final class08895 onFalse;
    public static final MapCodec<class08927> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class08917.y.forGetter(class08927::N), (App)class08913.y.fieldOf("on_true").forGetter(class08927::y), (App)class08913.y.fieldOf("on_false").forGetter(class08927::L)).apply(instance, class08927::new));

    public class08895 L() {
        return this.onFalse;
    }

    public class08927(class08909 class089092, class08895 class088952, class08895 class088953) {
        this.property = class089092;
        this.onTrue = class088952;
        this.onFalse = class088953;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08927.class, "property;onTrue;onFalse", "property", "onTrue", "onFalse"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08927.class, "property;onTrue;onFalse", "property", "onTrue", "onFalse"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08927.class, "property;onTrue;onFalse", "property", "onTrue", "onFalse"}, this);
    }

    public class08895 y() {
        return this.onTrue;
    }

    private class08559 N(class08909 class089092, @Nullable class00203 class002032) {
        if (class002032 == null) {
            return class089092;
        }
        class08546 class085462 = new class08546(class034482 -> class08927.y(class089092, class002032, class034482));
        return (class065842, class034482, class074382, n, class036622) -> (class034482 == null ? class089092 : (class08559)class085462.N((class08542)class034482)).method_65638(class065842, class034482, class074382, n, class036622);
    }

    private static <T extends class08909> T y(T t, class00203 class002032, class03448 class034482) {
        return class002032.N(t.N().codec(), t, (class01929)class034482.method_30349()).result().orElse(t);
    }

    public class08909 N() {
        return this.property;
    }

    public void method_62326(class08350 class083502) {
        this.onTrue.method_62326(class083502);
        this.onFalse.method_62326(class083502);
    }

    public MapCodec<class08927> method_65585() {
        return N;
    }

    public class08910 method_65587(class08905 class089052) {
        return new class08939(this.N(this.property, class089052.R()), this.onTrue.method_65587(class089052), this.onFalse.method_65587(class089052));
    }
}


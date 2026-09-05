/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00336
 *  minecraft.class00372
 *  minecraft.class02477
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class04206
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08938
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00336;
import minecraft.class00372;
import minecraft.class02477;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class04206;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08938;
import org.jspecify.annotations.Nullable;

public final class class00223<T>
extends Record
implements class00372<T> {
    private final class02477<T> componentType;
    private static final class00336<? extends class00223<?>, ?> y = class00223.i();

    public static <T> class00336<class00223<T>, T> L() {
        return y;
    }

    public class00223(class02477<T> class024772) {
        this.componentType = class024772;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00223.class, "componentType", "componentType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00223.class, "componentType", "componentType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00223.class, "componentType", "componentType"}, this);
    }

    private static <T> class00336<class00223<T>, T> i() {
        MapCodec mapCodec = class04206.NW.T().validate(class024772 -> {
            if (class024772.u()) {
                return DataResult.error(() -> "Component can't be serialized");
            }
            return DataResult.success((Object)class024772);
        }).dispatchMap("component", class089382 -> ((class00223)class089382.N()).componentType, class024772 -> class00336.N((Codec)class024772.L()).xmap(list -> new class08938(new class00223(class024772), list), class08938::y));
        return new class00336(mapCodec);
    }

    public class02477<T> u() {
        return this.componentType;
    }

    public @Nullable T y(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return (T)class065842.method_58694(this.componentType);
    }

    public Codec<T> y() {
        return this.componentType.L();
    }

    public class00336<class00223<T>, T> N() {
        return class00223.L();
    }
}


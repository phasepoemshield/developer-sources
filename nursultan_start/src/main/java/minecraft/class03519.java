/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10209
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00751
 *  minecraft.class01278
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02042
 *  minecraft.class02055
 *  minecraft.class05946
 *  minecraft.class06338
 *  net.fabricmc.fabric.mixin.resource.conditions.RegistryOpsAccessor
 */
package minecraft;

import Nursultan.class10209;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01278;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class03515;
import minecraft.class03529;
import minecraft.class03542;
import minecraft.class05946;
import minecraft.class06338;
import net.fabricmc.fabric.mixin.resource.conditions.RegistryOpsAccessor;

public class class03519<T>
extends class01278<T>
implements RegistryOpsAccessor {
    private final class03542 y;

    public static <E, O> RecordCodecBuilder<O, class02055<E>> L(class05946<? extends class00751<? extends E>> class059462) {
        return class06338.N((T dynamicOps) -> {
            if (dynamicOps instanceof class03519) {
                return ((class03519)dynamicOps).y.N(class059462).map(class035152 -> DataResult.success(class035152.y(), (Lifecycle)class035152.L())).orElseGet(() -> DataResult.error(() -> "Unknown registry: " + String.valueOf(class059462)));
            }
            return DataResult.error(() -> "Not a registry ops");
        }).forGetter(object -> null);
    }

    private class03519(DynamicOps<T> dynamicOps, class03542 class035422) {
        super(dynamicOps);
        this.y = class035422;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        class03519 class035192 = (class03519)((Object)object);
        return this.N.equals((Object)class035192.N) && this.y.equals(class035192.y);
    }

    public int hashCode() {
        return this.N.hashCode() * 31 + this.y.hashCode();
    }

    public static <E, O> RecordCodecBuilder<O, class03529<E>> u(class05946<E> class059462) {
        return class06338.N(arg_0 -> class03519.N(class05946.N((class01894)class059462.y()), class059462, arg_0)).forGetter(object -> null);
    }

    public <E> Optional<class02055<E>> y(class05946<? extends class00751<? extends E>> class059462) {
        return this.y.N(class059462).map(class03515::y);
    }

    public <E> Optional<class02042<E>> N(class05946<? extends class00751<? extends E>> class059462) {
        return this.y.N(class059462).map(class03515::N);
    }

    public <U> class03519<U> N(DynamicOps<U> dynamicOps) {
        if (dynamicOps == this.N) {
            return this;
        }
        return new class03519<U>(dynamicOps, this.y);
    }

    public static <T> Dynamic<T> N(Dynamic<T> dynamic, class01929 class019292) {
        return new Dynamic((DynamicOps)class019292.N(dynamic.getOps()), dynamic.getValue());
    }

    public static <T> class03519<T> N(DynamicOps<T> dynamicOps, class03542 class035422) {
        return new class03519<T>(dynamicOps, class035422);
    }

    public static <T> class03519<T> N(DynamicOps<T> dynamicOps, class01929 class019292) {
        return class03519.N(dynamicOps, (class03542)new class10209(class019292));
    }

    private static /* synthetic */ DataResult N(class05946 class059462, class05946 class059463, DynamicOps dynamicOps) {
        if (dynamicOps instanceof class03519) {
            return ((class03519)dynamicOps).y.N(class059462).flatMap(class035152 -> class035152.y().N(class059463)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Can't find value: " + String.valueOf(class059463)));
        }
        return DataResult.error(() -> "Not a registry ops");
    }

    public /* synthetic */ class03542 getRegistryInfoGetter() {
        return this.y;
    }
}


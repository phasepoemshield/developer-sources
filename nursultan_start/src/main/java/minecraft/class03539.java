/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02055
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02055;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class05946;

public final class class03539<E>
implements Codec<class03556<E>> {
    private final class05946<? extends class00751<E>> N;

    private class03539(class05946<? extends class00751<E>> class059462) {
        this.N = class059462;
    }

    public String toString() {
        return "RegistryFixedCodec[" + String.valueOf(this.N) + "]";
    }

    public <T> DataResult<Pair<class03556<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        Optional optional;
        if (dynamicOps instanceof class03519 && (optional = ((class03519)dynamicOps).y(this.N)).isPresent()) {
            return class01894.N.decode(dynamicOps, t).flatMap(pair -> {
                class01894 class018942 = (class01894)pair.getFirst();
                return ((class02055)optional.get()).N(class05946.N(this.N, (class01894)class018942)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Failed to get element " + String.valueOf(class018942))).map(class035292 -> Pair.of((Object)class035292, (Object)pair.getSecond())).setLifecycle(Lifecycle.stable());
            });
        }
        return DataResult.error(() -> "Can't access registry " + String.valueOf(this.N));
    }

    public static <E> class03539<E> N(class05946<? extends class00751<E>> class059462) {
        return new class03539<E>(class059462);
    }

    public <T> DataResult<T> encode(class03556<E> class035562, DynamicOps<T> dynamicOps, T t) {
        Optional optional;
        if (dynamicOps instanceof class03519 && (optional = ((class03519)dynamicOps).N(this.N)).isPresent()) {
            if (!class035562.N(optional.get())) {
                return DataResult.error(() -> "Element " + String.valueOf(class035562) + " is not valid in current registry set");
            }
            return (DataResult)class035562.u().map(class059462 -> class01894.N.encode((Object)class059462.N(), dynamicOps, t), object -> DataResult.error(() -> "Elements from registry " + String.valueOf(this.N) + " can't be serialized to a value"));
        }
        return DataResult.error(() -> "Can't access registry " + String.valueOf(this.N));
    }
}


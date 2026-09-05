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
 *  minecraft.class02042
 *  minecraft.class02055
 *  minecraft.class03519
 *  minecraft.class03556
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
import minecraft.class02042;
import minecraft.class02055;
import minecraft.class03519;
import minecraft.class03556;
import minecraft.class05946;

public final class class01281<E>
implements Codec<class03556<E>> {
    private final class05946<? extends class00751<E>> N;
    private final Codec<E> y;
    private final boolean L;

    private class01281(class05946<? extends class00751<E>> class059462, Codec<E> codec, boolean bl) {
        this.N = class059462;
        this.y = codec;
        this.L = bl;
    }

    public String toString() {
        return "RegistryFileCodec[" + String.valueOf(this.N) + " " + String.valueOf(this.y) + "]";
    }

    public <T> DataResult<Pair<class03556<E>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        if (dynamicOps instanceof class03519) {
            Optional optional = ((class03519)dynamicOps).y(this.N);
            if (optional.isEmpty()) {
                return DataResult.error(() -> "Registry does not exist: " + String.valueOf(this.N));
            }
            class02055 class020552 = (class02055)optional.get();
            DataResult dataResult = class01894.N.decode(dynamicOps, t);
            if (dataResult.result().isEmpty()) {
                if (!this.L) {
                    return DataResult.error(() -> "Inline definitions not allowed here");
                }
                return this.y.decode(dynamicOps, t).map(pair -> pair.mapFirst(class03556::N));
            }
            Pair pair2 = (Pair)dataResult.result().get();
            class05946 class059462 = class05946.N(this.N, (class01894)((class01894)pair2.getFirst()));
            return class020552.N(class059462).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Failed to get element " + String.valueOf(class059462))).map(class035292 -> Pair.of((Object)class035292, (Object)pair2.getSecond())).setLifecycle(Lifecycle.stable());
        }
        return this.y.decode(dynamicOps, t).map(pair -> pair.mapFirst(class03556::N));
    }

    public static <E> class01281<E> N(class05946<? extends class00751<E>> class059462, Codec<E> codec) {
        return class01281.N(class059462, codec, true);
    }

    public static <E> class01281<E> N(class05946<? extends class00751<E>> class059462, Codec<E> codec, boolean bl) {
        return new class01281<E>(class059462, codec, bl);
    }

    public <T> DataResult<T> encode(class03556<E> class035562, DynamicOps<T> dynamicOps, T t) {
        Optional optional;
        if (dynamicOps instanceof class03519 && (optional = ((class03519)dynamicOps).N(this.N)).isPresent()) {
            if (!class035562.N((class02042)optional.get())) {
                return DataResult.error(() -> "Element " + String.valueOf(class035562) + " is not valid in current registry set");
            }
            return (DataResult)class035562.u().map(class059462 -> class01894.N.encode((Object)class059462.N(), dynamicOps, t), object2 -> this.y.encode(object2, dynamicOps, t));
        }
        return this.y.encode(class035562.N(), dynamicOps, t);
    }
}


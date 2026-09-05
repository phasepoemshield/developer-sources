/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09547
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00751
 *  minecraft.class02063
 *  minecraft.class03519
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class09547;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class02063;
import minecraft.class03519;
import minecraft.class05946;

public interface class01929
extends class02063 {
    default public Stream<class01921<?>> L() {
        return this.y().map(this::y);
    }

    default public Lifecycle u() {
        return this.L().map(class01921::R).reduce(Lifecycle.stable(), Lifecycle::add);
    }

    public Stream<class05946<? extends class00751<?>>> y();

    default public <T> class01921<T> y(class05946<? extends class00751<? extends T>> class059462) {
        return this.method_46759(class059462).orElseThrow(() -> new IllegalStateException("Registry " + String.valueOf(class059462.N()) + " not found"));
    }

    public static class01929 N(Stream<class01921<?>> stream) {
        Map<class05946, class01921> map = stream.collect(Collectors.toUnmodifiableMap(class01921::i, class019212 -> class019212));
        return new class09547(map);
    }

    default public <V> class03519<V> N(DynamicOps<V> dynamicOps) {
        return class03519.N(dynamicOps, (class01929)this);
    }

    public <T> Optional<? extends class01921<T>> method_46759(class05946<? extends class00751<? extends T>> var1);
}


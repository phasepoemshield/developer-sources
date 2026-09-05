/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class01921
 *  minecraft.class02038
 *  minecraft.class02042
 *  minecraft.class02061
 *  minecraft.class03529
 *  minecraft.class04147
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01921;
import minecraft.class02038;
import minecraft.class02042;
import minecraft.class02061;
import minecraft.class03529;
import minecraft.class04147;
import minecraft.class05946;

final class class02066<T>
extends Record {
    final class05946<? extends class00751<? extends T>> key;
    private final Lifecycle lifecycle;
    private final Map<class05946<T>, class04147<T>> values;

    public Map<class05946<T>, class04147<T>> L() {
        return this.values;
    }

    class02066(class05946<? extends class00751<? extends T>> class059462, Lifecycle lifecycle, Map<class05946<T>, class04147<T>> map) {
        this.key = class059462;
        this.lifecycle = lifecycle;
        this.values = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02066.class, "key;lifecycle;values", "key", "lifecycle", "values"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02066.class, "key;lifecycle;values", "key", "lifecycle", "values"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02066.class, "key;lifecycle;values", "key", "lifecycle", "values"}, this);
    }

    public Lifecycle y() {
        return this.lifecycle;
    }

    public class05946<? extends class00751<? extends T>> N() {
        return this.key;
    }

    public class01921<T> N(class02038 class020382) {
        Map<Object, class03529> map = this.values.entrySet().stream().collect(Collectors.toUnmodifiableMap(Map.Entry::getKey, entry -> {
            class04147 class041472 = (class04147)entry.getValue();
            class03529 class035292 = class041472.y().orElseGet(() -> class03529.N_40((class02042)class020382.N(), (class05946)((class05946)entry.getKey())));
            class035292.y(class041472.N().N());
            return class035292;
        }));
        return class02061.N(this.key, (Lifecycle)this.lifecycle, (class02042)class020382.N(), map);
    }
}


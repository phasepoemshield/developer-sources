/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00203
 *  minecraft.class00336
 *  minecraft.class00366
 *  minecraft.class00372
 *  minecraft.class01929
 *  minecraft.class03448
 *  minecraft.class08350
 *  minecraft.class08542
 *  minecraft.class08546
 *  minecraft.class08900
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Iterator;
import java.util.List;
import minecraft.class00203;
import minecraft.class00336;
import minecraft.class00366;
import minecraft.class00372;
import minecraft.class01929;
import minecraft.class03448;
import minecraft.class08350;
import minecraft.class08542;
import minecraft.class08546;
import minecraft.class08900;
import minecraft.class08905;
import minecraft.class08910;
import minecraft.class08928;
import minecraft.class08940;
import org.jspecify.annotations.Nullable;

public final class class08938<P extends class00372<T>, T>
extends Record {
    private final P property;
    private final List<class08940<T>> cases;
    public static final MapCodec<class08938<?, ?>> N = class00366.y.dispatchMap("property", class089382 -> class089382.N().N(), class00336::N);

    public class08938(P p, List<class08940<T>> list) {
        this.property = p;
        this.cases = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08938.class, "property;cases", "property", "cases"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08938.class, "property;cases", "property", "cases"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08938.class, "property;cases", "property", "cases"}, this);
    }

    public List<class08940<T>> y() {
        return this.cases;
    }

    private /* synthetic */ void N(class00203 class002032, class03448 class034482, Object2ObjectMap object2ObjectMap, Object object2, class08910 class089102) {
        class002032.N(this.property.y(), object2, (class01929)class034482.method_30349()).ifSuccess(object -> object2ObjectMap.put(object, (Object)class089102));
    }

    private class08900<T> N(Object2ObjectMap<T, class08910> object2ObjectMap, @Nullable class00203 class002032) {
        if (class002032 == null) {
            return (object, class034482) -> (class08910)object2ObjectMap.get(object);
        }
        class08910 class089102 = (class08910)object2ObjectMap.defaultReturnValue();
        class08546 class085462 = new class08546(class034482 -> {
            Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(object2ObjectMap.size());
            object2ObjectOpenHashMap.defaultReturnValue((Object)class089102);
            object2ObjectMap.forEach((arg_0, arg_1) -> this.N(class002032, class034482, (Object2ObjectMap)object2ObjectOpenHashMap, arg_0, arg_1));
            return object2ObjectOpenHashMap;
        });
        return (object, class034482) -> {
            if (class034482 == null) {
                return (class08910)object2ObjectMap.get(object);
            }
            if (object == null) {
                return class089102;
            }
            return (class08910)((Object2ObjectMap)class085462.N((class08542)class034482)).get(object);
        };
    }

    public void N(class08350 class083502) {
        Iterator<class08940<T>> iterator = this.cases.iterator();
        while (iterator.hasNext()) {
            iterator.next().y().method_62326(class083502);
        }
    }

    public P N() {
        return this.property;
    }

    public class08910 N(class08905 class089052, class08910 class089102) {
        Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap();
        for (class08940<T> class089402 : this.cases) {
            class08910 class089103 = class089402.y().method_65587(class089052);
            for (T t : class089402.N()) {
                object2ObjectOpenHashMap.put(t, (Object)class089103);
            }
        }
        object2ObjectOpenHashMap.defaultReturnValue((Object)class089102);
        return new class08928<T>(this.property, this.N((Object2ObjectMap<T, class08910>)object2ObjectOpenHashMap, class089052.R()));
    }
}


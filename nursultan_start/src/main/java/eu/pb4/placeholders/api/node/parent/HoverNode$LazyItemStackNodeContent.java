/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DynamicOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02678
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06584
 */
package eu.pb4.placeholders.api.node.parent;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02678;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06584;

public final class HoverNode$LazyItemStackNodeContent<T>
extends Record {
    final class01894 identifier;
    final int count;
    final DynamicOps<T> ops;
    final T componentMap;

    public T componentMap() {
        return this.componentMap;
    }

    public HoverNode$LazyItemStackNodeContent(class01894 class018942, int n, DynamicOps<T> dynamicOps, T t) {
        this.identifier = class018942;
        this.count = n;
        this.ops = dynamicOps;
        this.componentMap = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{HoverNode$LazyItemStackNodeContent.class, "identifier;count;ops;componentMap", "identifier", "count", "ops", "componentMap"}, this, object);
    }

    public String toString() {
        return "HoverNode$LazyItemStackNodeContent{id=" + this.identifier.toString() + ",count=" + this.count + ",ops=[" + this.ops.toString() + "],components={" + this.componentMap.toString() + "}}";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{HoverNode$LazyItemStackNodeContent.class, "identifier;count;ops;componentMap", "identifier", "count", "ops", "componentMap"}, this);
    }

    public int count() {
        return this.count;
    }

    public DynamicOps<T> ops() {
        return this.ops;
    }

    public class01894 identifier() {
        return this.identifier;
    }

    public class06584 toVanilla(class01929 class019292) {
        class06584 class065842 = new class06584((class03556)class019292.y(class04227.F).y(class05946.N((class05946)class04227.F, (class01894)this.identifier)));
        class065842.i(this.count);
        if (this.componentMap != null) {
            class065842.N((class02678)((Pair)class02678.y.decode((DynamicOps)class019292.N(this.ops), this.componentMap).getOrThrow()).getFirst());
        }
        return class065842;
    }
}


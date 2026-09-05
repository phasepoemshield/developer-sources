/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.util.Pair
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00622
 */
package minecraft;

import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00622;

final class class00228
extends Record {
    private final OpticFinder<?> itemFinder;
    private final OpticFinder<Pair<String, String>> itemIdFinder;

    class00228(OpticFinder<?> opticFinder, OpticFinder<Pair<String, String>> opticFinder2) {
        this.itemFinder = opticFinder;
        this.itemIdFinder = opticFinder2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00228.class, "itemFinder;itemIdFinder", "itemFinder", "itemIdFinder"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00228.class, "itemFinder;itemIdFinder", "itemFinder", "itemIdFinder"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00228.class, "itemFinder;itemIdFinder", "itemFinder", "itemIdFinder"}, this);
    }

    public OpticFinder<Pair<String, String>> y() {
        return this.itemIdFinder;
    }

    public String N(Typed<?> typed2) {
        return typed2.getOptionalTyped(this.itemFinder).flatMap(typed -> typed.getOptional(this.itemIdFinder)).map(Pair::getSecond).map(class00622::N).orElse("");
    }

    public OpticFinder<?> N() {
        return this.itemFinder;
    }
}


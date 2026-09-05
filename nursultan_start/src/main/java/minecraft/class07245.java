/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class04907
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class04907;
import minecraft.class07280;

public final class class07245
extends Record
implements class00381<class07280> {
    private final Object2IntMap<class04907<?>> stats;
    private static final class02362<class04247, Object2IntMap<class04907<?>>> L = class02389.N(Object2IntOpenHashMap::new, (class02362)class04907.P, (class02362)class02389.B);
    public static final class02362<class04247, class07245> N = L.N_10(class07245::new, class07245::N);

    public class07245(Object2IntMap<class04907<?>> object2IntMap) {
        this.stats = object2IntMap;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07245.class, "stats", "stats"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07245.class, "stats", "stats"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07245.class, "stats", "stats"}, this);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public Object2IntMap<class04907<?>> N() {
        return this.stats;
    }

    public class02897<class07245> method_65080() {
        return class04248.i;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00837
 *  minecraft.class00845
 *  minecraft.class06584
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00837;
import minecraft.class00845;
import minecraft.class06584;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;

public final class class07044
extends Record {
    private final class00845 predicate;
    public static final class07044 N = new class07044(class00837.N().y());
    public static final Codec<class07044> y = class00845.N.xmap(class07044::new, class07044::N);
    public static final String L = "lock";

    public class07044(class00845 class008452) {
        this.predicate = class008452;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07044.class, "predicate", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07044.class, "predicate", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07044.class, "predicate", "predicate"}, this);
    }

    public void N(class08329 class083292) {
        if (this != N) {
            class083292.N(L, y, (Object)this);
        }
    }

    public class00845 N() {
        return this.predicate;
    }

    public boolean N(class08036 class080362) {
        return class080362.method_7325() || this.N(class080362.method_6047());
    }

    public static class07044 N(class08299 class082992) {
        return class082992.N(L, y).orElse(N);
    }

    public boolean N(class06584 class065842) {
        return this.predicate.test(class065842);
    }
}


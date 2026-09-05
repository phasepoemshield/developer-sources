/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class06516
 *  minecraft.class06583
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06338;
import minecraft.class06516;
import minecraft.class06583;
import minecraft.class06912;

public final class class06915<T extends class06516>
extends Record {
    private final class06583<T> trigger;
    private final T triggerInstance;
    private static final MapCodec<class06915<?>> u = class06338.N((String)"trigger", (String)"conditions", class06912.N, class06915::N, class06915::N);
    public static final Codec<class06915<?>> N = u.codec();

    public class06915(class06583<T> class065832, T t) {
        this.trigger = class065832;
        this.triggerInstance = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06915.class, "trigger;triggerInstance", "trigger", "triggerInstance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06915.class, "trigger;triggerInstance", "trigger", "triggerInstance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06915.class, "trigger;triggerInstance", "trigger", "triggerInstance"}, this);
    }

    public T y() {
        return this.triggerInstance;
    }

    public class06583<T> N() {
        return this.trigger;
    }

    private static <T extends class06516> Codec<class06915<T>> N(class06583<T> class065832) {
        return class065832.N().xmap(class065162 -> new class06915<class06516>((class06583<class06516>)class065832, (class06516)class065162), class06915::y);
    }
}


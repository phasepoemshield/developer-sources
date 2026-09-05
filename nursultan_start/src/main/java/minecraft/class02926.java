/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02465
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02827
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02465;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02827;
import minecraft.class02952;

public final class class02926
extends Record
implements class02465<class02827> {
    private final class02952 predicate;
    public static final Codec<class02926> N = class02952.N.xmap(class02926::new, class02926::N);

    public class02926(class02952 class029522) {
        this.predicate = class029522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02926.class, "predicate", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02926.class, "predicate", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02926.class, "predicate", "predicate"}, this);
    }

    public class02477<class02827> y() {
        return class02484.Ns;
    }

    public boolean N(class02827 class028272) {
        return this.predicate.test(class028272);
    }

    public class02952 N() {
        return this.predicate;
    }
}


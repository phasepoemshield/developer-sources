/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class03979<A>
extends Record {
    private final MapCodec<A> codec;

    public class03979(MapCodec<A> mapCodec) {
        this.codec = mapCodec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03979.class, "codec", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03979.class, "codec", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03979.class, "codec", "codec"}, this);
    }

    public static <A> class03979<A> N(MapCodec<A> mapCodec) {
        return new class03979<A>(mapCodec);
    }

    public MapCodec<A> N() {
        return this.codec;
    }
}


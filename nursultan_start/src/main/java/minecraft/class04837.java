/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04794
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04794;

public final class class04837
extends Record {
    private final MapCodec<? extends class04794> codec;

    public class04837(MapCodec<? extends class04794> mapCodec) {
        this.codec = mapCodec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04837.class, "codec", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04837.class, "codec", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04837.class, "codec", "codec"}, this);
    }

    public MapCodec<? extends class04794> N() {
        return this.codec;
    }
}


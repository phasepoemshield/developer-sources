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
import minecraft.class06348;

public final class class06353
extends Record {
    private final MapCodec<? extends class06348> codec;

    public class06353(MapCodec<? extends class06348> mapCodec) {
        this.codec = mapCodec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06353.class, "codec", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06353.class, "codec", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06353.class, "codec", "codec"}, this);
    }

    public MapCodec<? extends class06348> N() {
        return this.codec;
    }
}


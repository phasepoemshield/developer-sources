/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00299;
import minecraft.class02362;
import minecraft.class04247;

public final class class00319<T extends class00299>
extends Record {
    private final MapCodec<T> codec;
    private final class02362<class04247, T> streamCodec;

    public class00319(MapCodec<T> mapCodec, class02362<class04247, T> class023622) {
        this.codec = mapCodec;
        this.streamCodec = class023622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00319.class, "codec;streamCodec", "codec", "streamCodec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00319.class, "codec;streamCodec", "codec", "streamCodec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00319.class, "codec;streamCodec", "codec", "streamCodec"}, this);
    }

    public class02362<class04247, T> y() {
        return this.streamCodec;
    }

    public MapCodec<T> N() {
        return this.codec;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06338;

public final class class08569
extends Record {
    private final String suffix;
    public static final Codec<class08569> N = class06338.X.xmap(class08569::new, class08569::N);
    public static final class02362<ByteBuf, class08569> y = class02389.s.N_10(class08569::new, class08569::N);

    public class08569(String string) {
        if (!class01894.Z((String)string)) {
            throw new IllegalArgumentException("Invalid string to use as a resource path element: " + string);
        }
        this.suffix = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08569.class, "suffix", "suffix"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08569.class, "suffix", "suffix"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08569.class, "suffix", "suffix"}, this);
    }

    public String N() {
        return this.suffix;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;

public final class class02716
extends Record {
    private final int rgb;
    public static final Codec<class02716> N = Codec.INT.xmap(class02716::new, class02716::N);
    public static final class02362<ByteBuf, class02716> y = class02389.M.N_10(class02716::new, class02716::N);
    public static final class02716 L = new class02716(4603950);

    public class02716(int n) {
        this.rgb = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02716.class, "rgb", "rgb"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02716.class, "rgb", "rgb"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02716.class, "rgb", "rgb"}, this);
    }

    public int N() {
        return this.rgb;
    }
}


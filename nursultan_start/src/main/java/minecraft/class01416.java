/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00522
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00522;
import minecraft.class01426;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class08092;

final class class01416
extends Record
implements class01426 {
    private final String value;
    public static final Codec<class01416> N = Codec.STRING.xmap(class01416::new, class01416::N);
    public static final class02362<ByteBuf, class01416> y = class02389.s.N_10(class01416::new, class01416::N);

    class01416(String string) {
        this.value = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01416.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01416.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01416.class, "value", "value"}, this);
    }

    public String N() {
        return this.value;
    }

    @Override
    public <T extends Comparable<T>> boolean N(class00522<?, ?> class005222, class08092<T> class080922) {
        Comparable comparable = class005222.L(class080922);
        Optional optional = class080922.y(this.value);
        return optional.isPresent() && comparable.compareTo((Comparable)optional.get()) == 0;
    }
}


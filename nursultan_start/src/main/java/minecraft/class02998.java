/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.EncoderException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class04247
 *  minecraft.class04383
 */
package minecraft;

import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class04247;
import minecraft.class04383;

public final class class02998<T>
extends Record {
    final int id;
    private final class04383<T> serializer;
    final T value;

    public T L() {
        return this.value;
    }

    public class02998(int n, class04383<T> class043832, T t) {
        this.id = n;
        this.serializer = class043832;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02998.class, "id;serializer;value", "id", "serializer", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02998.class, "id;serializer;value", "id", "serializer", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02998.class, "id;serializer;value", "id", "serializer", "value"}, this);
    }

    public class04383<T> y() {
        return this.serializer;
    }

    public void N(class04247 class042472) {
        int n = class02154.y(this.serializer);
        if (n < 0) {
            throw new EncoderException("Unknown serializer type " + String.valueOf(this.serializer));
        }
        class042472.writeByte(this.id);
        class042472.L(n);
        this.serializer.codec().encode((Object)class042472, this.value);
    }

    public int N() {
        return this.id;
    }

    public static class02998<?> N(class04247 class042472, int n) {
        int n2 = class042472.E();
        class04383 var3 = class02154.N((int)n2);
        if (var3 == null) {
            throw new DecoderException("Unknown serializer type " + n2);
        }
        return class02998.N(class042472, n, var3);
    }

    private static <T> class02998<T> N(class04247 class042472, int n, class04383<T> class043832) {
        return new class02998<Object>(n, class043832, class043832.codec().decode((Object)class042472));
    }

    public static <T> class02998<T> N(class02131<T> class021312, T t) {
        class04383 class043832 = class021312.y();
        return new class02998<Object>(class021312.N(), class043832, class043832.method_12714(t));
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class02908<A, T>
extends Record {
    private final Codec<A> codec;
    private final A value;
    private final DynamicOps<T> ops;

    public A L() {
        return this.value;
    }

    class02908(Codec<A> codec, A a, DynamicOps<T> dynamicOps) {
        this.codec = codec;
        this.value = a;
        this.ops = dynamicOps;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class02908) {
            class02908 class029082 = (class02908)((Object)object);
            return this.codec == class029082.codec && this.value.equals(class029082.value) && this.ops.equals(class029082.ops);
        }
        return false;
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02908.class, "codec;value;ops", "codec", "value", "ops"}, this);
    }

    public int hashCode() {
        int n = System.identityHashCode(this.codec);
        n = 31 * n + this.value.hashCode();
        n = 31 * n + this.ops.hashCode();
        return n;
    }

    public DynamicOps<T> u() {
        return this.ops;
    }

    public Codec<A> y() {
        return this.codec;
    }

    public DataResult<T> N() {
        return this.codec.encodeStart(this.ops, this.value);
    }
}


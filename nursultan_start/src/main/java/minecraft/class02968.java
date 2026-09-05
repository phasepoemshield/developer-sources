/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10082
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import Nursultan.class10082;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class02968<T>
extends Record {
    private final String name;
    private final Codec<T> codec;

    public class02968(String string, Codec<T> codec) {
        this.name = string;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02968.class, "name;codec", "name", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02968.class, "name;codec", "name", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02968.class, "name;codec", "name", "codec"}, this);
    }

    public Codec<T> y() {
        return this.codec;
    }

    public String N() {
        return this.name;
    }

    public class10082<T> N(T t) {
        return new class10082(this, t);
    }
}


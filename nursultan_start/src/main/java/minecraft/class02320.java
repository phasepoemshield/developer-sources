/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02339;

final class class02320
extends Record {
    private final class01894 id;
    private final Codec<? extends class02339> codec;

    class02320(class01894 class018942, Codec<? extends class02339> codec) {
        this.id = class018942;
        this.codec = codec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02320.class, "id;codec", "id", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02320.class, "id;codec", "id", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02320.class, "id;codec", "id", "codec"}, this);
    }

    public Codec<? extends class02339> y() {
        return this.codec;
    }

    public class01894 N() {
        return this.id;
    }
}


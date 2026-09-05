/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class02362;

public final class class01668<B extends class00667, T extends class01659>
extends Record {
    private final class01666<T> type;
    private final class02362<B, T> codec;

    public class01668(class01666<T> class016662, class02362<B, T> class023622) {
        this.type = class016662;
        this.codec = class023622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01668.class, "type;codec", "type", "codec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01668.class, "type;codec", "type", "codec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01668.class, "type;codec", "type", "codec"}, this);
    }

    public class02362<B, T> y() {
        return this.codec;
    }

    public class01666<T> N() {
        return this.type;
    }
}


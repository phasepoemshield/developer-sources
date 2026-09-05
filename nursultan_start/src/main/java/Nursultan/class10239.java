/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01255
 *  minecraft.class02819
 *  minecraft.class03764
 *  minecraft.class05946
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01255;
import minecraft.class02819;
import minecraft.class03764;
import minecraft.class05946;

public final class class10239
extends Record {
    public final class05946<class01255> key;
    public final class01255 value;

    public class01255 L() {
        return this.value;
    }

    public class10239(class05946<class01255> class059462, class01255 class012552) {
        this.key = class059462;
        this.value = class012552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10239.class, "key;value", "key", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10239.class, "key;value", "key", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10239.class, "key;value", "key", "value"}, this);
    }

    public class05946<class01255> y() {
        return this.key;
    }

    public class02819 N() {
        return new class02819(Optional.empty(), class03764.N(this.key, (class01255)this.value));
    }
}


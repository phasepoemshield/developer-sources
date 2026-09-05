/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00751;
import minecraft.class05946;

public class class01012<T>
extends Record {
    final class05946<? extends class00751<T>> key;
    private final class00751<T> value;

    public class01012<T> L() {
        return new class01012<T>(this.key, this.value.W());
    }

    public class01012(class05946<? extends class00751<T>> class059462, class00751<T> class007512) {
        this.key = class059462;
        this.value = class007512;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01012.class, "key;value", "key", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01012.class, "key;value", "key", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01012.class, "key;value", "key", "value"}, this);
    }

    public class00751<T> y() {
        return this.value;
    }

    public class05946<? extends class00751<T>> N() {
        return this.key;
    }

    private static <T> class01012<T> N(class05946<? extends class00751<?>> class059462, class00751<?> class007512) {
        return new class01012(class059462, class007512);
    }

    public static <T, R extends class00751<? extends T>> class01012<T> N(Map.Entry<? extends class05946<? extends class00751<?>>, R> entry) {
        return class01012.N(entry.getKey(), (class00751)entry.getValue());
    }
}


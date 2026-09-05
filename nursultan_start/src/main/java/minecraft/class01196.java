/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class00751;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class05946;

public final class class01196<T>
extends Record {
    private final class05946<? extends class00751<T>> key;
    final Map<class03530<T>, List<class03556<T>>> tags;

    public class01196(class05946<? extends class00751<T>> class059462, Map<class03530<T>, List<class03556<T>>> map) {
        this.key = class059462;
        this.tags = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01196.class, "key;tags", "key", "tags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01196.class, "key;tags", "key", "tags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01196.class, "key;tags", "key", "tags"}, this);
    }

    public Map<class03530<T>, List<class03556<T>>> y() {
        return this.tags;
    }

    public class05946<? extends class00751<T>> N() {
        return this.key;
    }
}


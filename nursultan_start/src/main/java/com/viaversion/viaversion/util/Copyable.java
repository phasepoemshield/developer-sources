/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 */
package com.viaversion.viaversion.util;

import com.viaversion.nbt.tag.Tag;
import java.lang.reflect.Array;

public interface Copyable {
    public static <T> T copy(T object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Tag) {
            Tag tag = (Tag)object;
            return (T)tag.copy();
        }
        if (object instanceof Copyable) {
            Copyable copyable = (Copyable)object;
            return (T)copyable.copy();
        }
        if (object.getClass().isArray()) {
            Class<?> componentType = object.getClass().getComponentType();
            int length = Array.getLength(object);
            Object copy = Array.newInstance(componentType, length);
            if (componentType.isPrimitive()) {
                for (int i = 0; i < length; ++i) {
                    Array.set(copy, i, Array.get(object, i));
                }
            } else {
                for (int i = 0; i < length; ++i) {
                    Array.set(copy, i, Copyable.copy(Array.get(object, i)));
                }
            }
            return (T)copy;
        }
        return object;
    }

    public Object copy();
}


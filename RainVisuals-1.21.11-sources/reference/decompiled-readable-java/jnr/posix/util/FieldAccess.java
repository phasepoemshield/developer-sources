/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

import java.lang.reflect.Field;

public class FieldAccess {
    /*
     * WARNING - void declaration
     */
    public static Field getProtectedField(Class klass, String fieldName) {
        void var2_2;
        Field field = null;
        try {
            field = klass.getDeclaredField(fieldName);
            field.setAccessible(true);
        }
        catch (Exception exception) {
        }
        return var2_2;
    }

    public static Object getProtectedFieldValue(Class klass, String fieldName, Object instance) {
        try {
            Field f = FieldAccess.getProtectedField(klass, fieldName);
            return f.get(instance);
        }
        catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}


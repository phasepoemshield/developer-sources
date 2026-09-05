/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09956;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class09951 {
    public static String y(Class<?> clazz, String string) {
        for (Field field : clazz.getDeclaredFields()) {
            class09956 class099562 = field.getAnnotation(class09956.class);
            if (class099562 == null || !class099562.N().equals(string) && !class099562.y().equals(string)) continue;
            return field.getName();
        }
        throw new IllegalStateException("Could not find field mapping for " + string + " in class " + clazz.getName());
    }

    public static String N(Class<?> clazz, String string) {
        for (Method method : clazz.getDeclaredMethods()) {
            class09956 class099562 = method.getAnnotation(class09956.class);
            if (class099562 == null || !class099562.N().equals(string) && !class099562.y().equals(string)) continue;
            return method.getName();
        }
        throw new IllegalStateException("Could not find mapping for " + string + " in class " + clazz.getName());
    }
}


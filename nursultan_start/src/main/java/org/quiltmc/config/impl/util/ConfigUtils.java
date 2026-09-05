/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.exceptions.TrackedValueException
 *  org.quiltmc.config.api.values.CompoundConfigValue
 *  org.quiltmc.config.api.values.ConfigSerializableObject
 */
package org.quiltmc.config.impl.util;

import org.quiltmc.config.api.exceptions.TrackedValueException;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.ConfigSerializableObject;

public final class ConfigUtils {
    private static final Class[] VALID_VALUE_CLASSES = new Class[]{Integer.TYPE, Integer.class, Long.TYPE, Long.class, Float.TYPE, Float.class, Double.TYPE, Double.class, Boolean.TYPE, Boolean.class, String.class};

    public static boolean isValidValue(Object object) {
        if (object == null) {
            return false;
        }
        if (object instanceof ConfigSerializableObject) {
            return true;
        }
        if (object instanceof CompoundConfigValue) {
            while (object instanceof CompoundConfigValue) {
                object = ((CompoundConfigValue)object).getDefaultValue();
            }
            return ConfigUtils.isValidValue(object);
        }
        return ConfigUtils.isValidValueClass(object.getClass());
    }

    public static boolean isValidValueClass(Class clazz) {
        if (clazz.isEnum()) {
            return true;
        }
        Class[] classArray = VALID_VALUE_CLASSES;
        int n = VALID_VALUE_CLASSES.length;
        for (int i = 0; i < n; ++i) {
            if (classArray[i] != clazz) continue;
            return true;
        }
        return false;
    }

    public static void assertValueType(Object object) {
        if (object != null) {
            if (ConfigUtils.isValidValue(object)) {
                return;
            }
            throw new TrackedValueException("Cannot create value of type '" + object.getClass() + "'");
        }
        throw new TrackedValueException("Cannot create value with null default value");
    }
}


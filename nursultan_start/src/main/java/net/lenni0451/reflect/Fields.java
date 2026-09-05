/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.lenni0451.reflect.exceptions.MethodNotFoundException
 */
package net.lenni0451.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import javax.annotation.Nullable;
import net.lenni0451.reflect.JVMConstants;
import net.lenni0451.reflect.JavaBypass;
import net.lenni0451.reflect.Methods;
import net.lenni0451.reflect.accessor.UnsafeAccess;
import net.lenni0451.reflect.exceptions.MethodNotFoundException;
import net.lenni0451.reflect.utils.FieldInitializer;

public class Fields {
    private static final MethodHandle getDeclaredFields0 = FieldInitializer.reqInit(() -> {
        if (JVMConstants.OPENJ9_RUNTIME) {
            return Methods.getDeclaredMethod(Class.class, JVMConstants.METHOD_Class_getDeclaredFields0, new Class[0]);
        }
        return Methods.getDeclaredMethod(Class.class, JVMConstants.METHOD_Class_getDeclaredFields0, Boolean.TYPE);
    }, JavaBypass.TRUSTED_LOOKUP::unreflect, () -> new MethodNotFoundException(Class.class.getName(), JVMConstants.METHOD_Class_getDeclaredFields0, new String[]{JVMConstants.OPENJ9_RUNTIME ? "" : "boolean"}));

    public static long offset(Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            return UnsafeAccess.staticFieldOffset(field);
        }
        return UnsafeAccess.objectFieldOffset(field);
    }

    public static Object instance(Object instance, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            return UnsafeAccess.staticFieldBase(field);
        }
        return instance;
    }

    public static Field[] getDeclaredFields(Class<?> clazz) {
        if (JVMConstants.OPENJ9_RUNTIME) {
            return getDeclaredFields0.invokeExact(clazz);
        }
        return getDeclaredFields0.invokeExact(clazz, false);
    }

    @Nullable
    public static Field getDeclaredField(Class<?> clazz, String name) {
        for (Field field : Fields.getDeclaredFields(clazz)) {
            if (!field.getName().equals(name)) continue;
            return field;
        }
        return null;
    }

    public static boolean getBoolean(Object instance, Field field) {
        return UnsafeAccess.getBoolean(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setBoolean(Object instance, Field field, boolean value) {
        UnsafeAccess.putBoolean(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyBoolean(Object instance, Object target, Field field) {
        Fields.setBoolean(target, field, Fields.getBoolean(instance, field));
    }

    public static byte getByte(Object instance, Field field) {
        return UnsafeAccess.getByte(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setByte(Object instance, Field field, byte value) {
        UnsafeAccess.putByte(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyByte(Object instance, Object target, Field field) {
        Fields.setByte(target, field, Fields.getByte(instance, field));
    }

    public static short getShort(Object instance, Field field) {
        return UnsafeAccess.getShort(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setShort(Object instance, Field field, short value) {
        UnsafeAccess.putShort(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyShort(Object instance, Object target, Field field) {
        Fields.setShort(target, field, Fields.getShort(instance, field));
    }

    public static char getChar(Object instance, Field field) {
        return UnsafeAccess.getChar(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setChar(Object instance, Field field, char value) {
        UnsafeAccess.putChar(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyChar(Object instance, Object target, Field field) {
        Fields.setChar(target, field, Fields.getChar(instance, field));
    }

    public static int getInt(Object instance, Field field) {
        return UnsafeAccess.getInt(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setInt(Object instance, Field field, int value) {
        UnsafeAccess.putInt(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyInt(Object instance, Object target, Field field) {
        Fields.setInt(target, field, Fields.getInt(instance, field));
    }

    public static long getLong(Object instance, Field field) {
        return UnsafeAccess.getLong(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setLong(Object instance, Field field, long value) {
        UnsafeAccess.putLong(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyLong(Object instance, Object target, Field field) {
        Fields.setLong(target, field, Fields.getLong(instance, field));
    }

    public static float getFloat(Object instance, Field field) {
        return UnsafeAccess.getFloat(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setFloat(Object instance, Field field, float value) {
        UnsafeAccess.putFloat(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyFloat(Object instance, Object target, Field field) {
        Fields.setFloat(target, field, Fields.getFloat(instance, field));
    }

    public static double getDouble(Object instance, Field field) {
        return UnsafeAccess.getDouble(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setDouble(Object instance, Field field, double value) {
        UnsafeAccess.putDouble(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyDouble(Object instance, Object target, Field field) {
        Fields.setDouble(target, field, Fields.getDouble(instance, field));
    }

    public static <T> T getObject(Object instance, Field field) {
        return (T)UnsafeAccess.getObject(Fields.instance(instance, field), Fields.offset(field));
    }

    public static void setObject(Object instance, Field field, Object value) {
        UnsafeAccess.putObject(Fields.instance(instance, field), Fields.offset(field), value);
    }

    public static void copyObject(Object instance, Object target, Field field) {
        Fields.setObject(target, field, Fields.getObject(instance, field));
    }

    public static <T> T get(Object instance, Field field) {
        if (field.getType().equals(Boolean.TYPE)) {
            return (T)Boolean.valueOf(Fields.getBoolean(instance, field));
        }
        if (field.getType().equals(Byte.TYPE)) {
            return (T)Byte.valueOf(Fields.getByte(instance, field));
        }
        if (field.getType().equals(Short.TYPE)) {
            return (T)Short.valueOf(Fields.getShort(instance, field));
        }
        if (field.getType().equals(Character.TYPE)) {
            return (T)Character.valueOf(Fields.getChar(instance, field));
        }
        if (field.getType().equals(Integer.TYPE)) {
            return (T)Integer.valueOf(Fields.getInt(instance, field));
        }
        if (field.getType().equals(Long.TYPE)) {
            return (T)Long.valueOf(Fields.getLong(instance, field));
        }
        if (field.getType().equals(Float.TYPE)) {
            return (T)Float.valueOf(Fields.getFloat(instance, field));
        }
        if (field.getType().equals(Double.TYPE)) {
            return (T)Double.valueOf(Fields.getDouble(instance, field));
        }
        return Fields.getObject(instance, field);
    }

    public static <T> void set(Object instance, Field field, T value) {
        if (field.getType().equals(Boolean.TYPE)) {
            Fields.setBoolean(instance, field, (Boolean)value);
        } else if (field.getType().equals(Byte.TYPE)) {
            Fields.setByte(instance, field, (Byte)value);
        } else if (field.getType().equals(Short.TYPE)) {
            Fields.setShort(instance, field, (Short)value);
        } else if (field.getType().equals(Character.TYPE)) {
            Fields.setChar(instance, field, ((Character)value).charValue());
        } else if (field.getType().equals(Integer.TYPE)) {
            Fields.setInt(instance, field, (Integer)value);
        } else if (field.getType().equals(Long.TYPE)) {
            Fields.setLong(instance, field, (Long)value);
        } else if (field.getType().equals(Float.TYPE)) {
            Fields.setFloat(instance, field, ((Float)value).floatValue());
        } else if (field.getType().equals(Double.TYPE)) {
            Fields.setDouble(instance, field, (Double)value);
        } else {
            Fields.setObject(instance, field, value);
        }
    }

    public static <T> void copy(Object instance, Object target, Field field) {
        if (field.getType().equals(Boolean.TYPE)) {
            Fields.copyBoolean(instance, target, field);
        } else if (field.getType().equals(Byte.TYPE)) {
            Fields.copyByte(instance, target, field);
        } else if (field.getType().equals(Short.TYPE)) {
            Fields.copyShort(instance, target, field);
        } else if (field.getType().equals(Character.TYPE)) {
            Fields.copyChar(instance, target, field);
        } else if (field.getType().equals(Integer.TYPE)) {
            Fields.copyInt(instance, target, field);
        } else if (field.getType().equals(Long.TYPE)) {
            Fields.copyLong(instance, target, field);
        } else if (field.getType().equals(Float.TYPE)) {
            Fields.copyFloat(instance, target, field);
        } else if (field.getType().equals(Double.TYPE)) {
            Fields.copyDouble(instance, target, field);
        } else {
            Fields.copyObject(instance, target, field);
        }
    }
}


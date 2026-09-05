/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.magic;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import javax.annotation.Nullable;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.api.DeserializationException;

public class TypeMagic {
    private static Map<Class<?>, Class<?>> concreteClasses = new HashMap();

    static {
        concreteClasses.put(Map.class, HashMap.class);
        concreteClasses.put(Set.class, HashSet.class);
        concreteClasses.put(Collection.class, ArrayList.class);
        concreteClasses.put(List.class, ArrayList.class);
        concreteClasses.put(Queue.class, ArrayDeque.class);
        concreteClasses.put(Deque.class, ArrayDeque.class);
    }

    public static <U> U createAndCastCarefully(Type type) throws DeserializationException {
        return TypeMagic.createAndCast(TypeMagic.classForType(type));
    }

    @Nullable
    public static Class<?> classForType(Type type) {
        Object object;
        Object object2;
        if (type instanceof Class) {
            return (Class)type;
        }
        if (type instanceof ParameterizedType) {
            object2 = ((ParameterizedType)type).getRawType();
            if (object2 instanceof Class) {
                return (Class)object2;
            }
            object = type.getTypeName();
            int n = ((String)object).indexOf(60);
            if (n >= 0) {
                object = ((String)object).substring(0, n);
            }
            try {
                return Class.forName((String)object);
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        if (type instanceof WildcardType) {
            object2 = ((WildcardType)type).getUpperBounds();
            if (((Type[])object2).length == 0) {
                return Object.class;
            }
            return TypeMagic.classForType(object2[0]);
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof GenericArrayType) {
            object2 = (GenericArrayType)type;
            object = TypeMagic.classForType(object2.getGenericComponentType());
            try {
                Class<?> clazz = Class.forName("[L" + ((Class)object).getCanonicalName() + ";");
                return clazz;
            }
            catch (ClassNotFoundException classNotFoundException) {
                return Object[].class;
            }
        }
        return null;
    }

    @Nullable
    public static <U> U createAndCast(Type type) {
        try {
            return (U)TypeMagic.createAndCast(TypeMagic.classForType(type), false);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static <U> U createAndCast(Class<U> clazz, boolean bl) throws DeserializationException {
        GenericDeclaration genericDeclaration;
        if (clazz.isInterface() && (genericDeclaration = concreteClasses.get(clazz)) != null) {
            try {
                return TypeMagic.createAndCast(genericDeclaration);
            }
            catch (Throwable throwable) {
                return null;
            }
        }
        genericDeclaration = null;
        try {
            genericDeclaration = clazz.getConstructor(new Class[0]);
        }
        catch (Throwable throwable) {
            try {
                genericDeclaration = clazz.getDeclaredConstructor(new Class[0]);
            }
            catch (Throwable throwable2) {
                if (bl) {
                    throw new DeserializationException("Class " + clazz.getCanonicalName() + " doesn't have a no-arg constructor, so an instance can't be created.");
                }
                return null;
            }
        }
        try {
            boolean bl2 = ((AccessibleObject)((Object)genericDeclaration)).isAccessible();
            if (!bl2) {
                ((Constructor)genericDeclaration).setAccessible(true);
            }
            Object t = ((Constructor)genericDeclaration).newInstance(new Object[0]);
            if (!bl2) {
                ((Constructor)genericDeclaration).setAccessible(false);
            }
            return (U)t;
        }
        catch (Throwable throwable) {
            if (bl) {
                throw new DeserializationException("An error occurred while creating an object.", throwable);
            }
            return null;
        }
    }

    public static <T> T shoehorn(Object object) {
        return (T)object;
    }
}


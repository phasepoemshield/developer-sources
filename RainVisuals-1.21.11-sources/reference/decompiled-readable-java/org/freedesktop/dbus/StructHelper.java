/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.freedesktop.dbus.ArrayFrob;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.types.DBusStructType;
import org.freedesktop.dbus.types.Variant;

public final class StructHelper {
    /*
     * WARNING - void declaration
     */
    public static <T extends Struct> List<T> convertToStructList(List<Object[]> _obj, Class<T> _structType) throws IllegalArgumentException, InvocationTargetException, InstantiationException, SecurityException, NoSuchMethodException, IllegalAccessException {
        void var2_2;
        ArrayList result = new ArrayList();
        StructHelper.convertToStructCollection(_obj, _structType, result);
        return var2_2;
    }

    private StructHelper() {
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Struct> T createStruct(Class<?>[] _constructorArgs, Object _values, Class<T> _classToConstruct) throws IllegalArgumentException, InstantiationException, NoSuchMethodException, InvocationTargetException, SecurityException, IllegalAccessException {
        block9: {
            block8: {
                if (_constructorArgs == null) break block8;
                if (_classToConstruct == null) break block8;
                if (_values != null) break block9;
            }
            return null;
        }
        try {
            Constructor<T> declaredConstructor = _classToConstruct.getDeclaredConstructor(_constructorArgs);
            declaredConstructor.setAccessible(true);
            if (_values instanceof Object[]) {
                Object[] oa = (Object[])_values;
                return (T)((Struct)declaredConstructor.newInstance(oa));
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = _values;
            return (T)((Struct)declaredConstructor.newInstance(objectArray));
        }
        catch (NoSuchMethodException | SecurityException _ex) {
            int i = 0;
            while (i < _constructorArgs.length) {
                void var4_6;
                Class<?> class1 = _constructorArgs[i];
                if (ArrayFrob.getWrapperToPrimitiveTypes().containsKey(class1)) {
                    _constructorArgs[i] = ArrayFrob.getWrapperToPrimitiveTypes().get(class1);
                    return StructHelper.createStruct(_constructorArgs, _values, _classToConstruct);
                }
                ++var4_6;
            }
            throw new NoSuchMethodException("Cannot find suitable constructor for arguments " + Arrays.toString(_constructorArgs) + " in class " + String.valueOf(_classToConstruct) + ".");
        }
    }

    public static <T extends Struct> void convertToStructCollection(Collection<Object[]> _input, Class<T> _structType, Collection<T> _result) throws InvocationTargetException, IllegalArgumentException, InstantiationException, NoSuchMethodException, SecurityException, IllegalAccessException {
        Objects.requireNonNull(_structType, "Struct class required");
        Objects.requireNonNull(_result, "Collection for result storage required");
        Objects.requireNonNull(_input, "Input data required");
        Class[] constructorArgClasses = (Class[])Arrays.stream(_structType.getDeclaredFields()).filter(f -> f.isAnnotationPresent(Position.class)).sorted((f1, f2) -> Integer.compare(f1.getAnnotation(Position.class).value(), f2.getAnnotation(Position.class).value())).map(Field::getType).toArray(Class[]::new);
        for (Object[] object : _input) {
            if (constructorArgClasses.length != object.length) {
                throw new IllegalArgumentException("Struct length does not match argument length");
            }
            T x = StructHelper.createStruct(constructorArgClasses, object, _structType);
            _result.add(x);
        }
    }

    public static <T extends Struct> T createStructFromVariant(Variant<?> _variant, Class<T> _structClass) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, SecurityException {
        block5: {
            block4: {
                if (_variant == null) break block4;
                if (_structClass != null) break block5;
            }
            return null;
        }
        if (_variant.getType() instanceof DBusStructType && _variant.getValue() instanceof Object[]) {
            Class[] argTypes = (Class[])Arrays.stream((Object[])_variant.getValue()).map(Object::getClass).toArray(Class[]::new);
            return StructHelper.createStruct(argTypes, _variant.getValue(), _structClass);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static <T extends Struct> Set<T> convertToStructSet(Set<Object[]> _obj, Class<T> _structType) throws IllegalAccessException, SecurityException, IllegalArgumentException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        void var2_2;
        LinkedHashSet result = new LinkedHashSet();
        StructHelper.convertToStructCollection(_obj, _structType, result);
        return var2_2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.lenni0451.reflect.exceptions.ConstructorNotFoundException
 */
package net.lenni0451.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import javax.annotation.Nullable;
import net.lenni0451.reflect.Constructors;
import net.lenni0451.reflect.Fields;
import net.lenni0451.reflect.JVMConstants;
import net.lenni0451.reflect.exceptions.ConstructorNotFoundException;
import net.lenni0451.reflect.exceptions.FieldNotFoundException;
import net.lenni0451.reflect.utils.FieldInitializer;

public class Enums {
    private static final Field enumVarsField = FieldInitializer.reqOptInit(JVMConstants.OPENJ9_RUNTIME, () -> Fields.getDeclaredField(Class.class, JVMConstants.FIELD_Class_EnumVars), () -> new FieldNotFoundException(Class.class.getName(), JVMConstants.FIELD_Class_EnumVars));
    private static final Field enumConstantsField = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> Fields.getDeclaredField(Class.class, JVMConstants.FIELD_Class_enumConstants), () -> new FieldNotFoundException(Class.class.getName(), JVMConstants.FIELD_Class_enumConstants));
    private static final Field enumConstantDirectoryField = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> Fields.getDeclaredField(Class.class, JVMConstants.FIELD_Class_enumConstantDirectory), () -> new FieldNotFoundException(Class.class.getName(), JVMConstants.FIELD_Class_enumConstantDirectory));

    public static <T extends Enum<T>> T newInstance(Class<T> enumClass, String name, int ordinal, Class<?>[] argumentTypes, Object[] arguments) {
        Class[] types = new Class[arguments.length + 2];
        types[0] = String.class;
        types[1] = Integer.TYPE;
        System.arraycopy(argumentTypes, 0, types, 2, argumentTypes.length);
        Object[] args = new Object[arguments.length + 2];
        args[0] = name;
        args[1] = ordinal;
        System.arraycopy(arguments, 0, args, 2, arguments.length);
        Constructor<T> constructor = Constructors.getDeclaredConstructor(enumClass, types);
        if (constructor == null) {
            throw new ConstructorNotFoundException(enumClass.getSimpleName(), (Class[])argumentTypes);
        }
        return (T)((Enum)Constructors.invoke(constructor, args));
    }

    public static <T extends Enum<T>> void addEnumInstance(Class<T> enumClass, T enumValue) {
        Field values = Fields.getDeclaredField(enumClass, JVMConstants.FIELD_Enum_$VALUES);
        Object[] valuesArray = (Object[])Fields.getObject(null, values);
        valuesArray = Arrays.copyOf(valuesArray, valuesArray.length + 1);
        valuesArray[valuesArray.length - 1] = enumValue;
        Fields.setObject(null, values, valuesArray);
        Enums.clearEnumCache(enumClass);
    }

    public static void clearEnumCache(Class<?> enumClass) {
        if (JVMConstants.OPENJ9_RUNTIME) {
            Fields.setObject(enumClass, enumVarsField, null);
        } else {
            Fields.setObject(enumClass, enumConstantsField, null);
            Fields.setObject(enumClass, enumConstantDirectoryField, null);
        }
    }

    @Nullable
    public static Object valueOfIgnoreCase(Class<?> enumClass, String name) {
        for (Object constant : enumClass.getEnumConstants()) {
            Enum enumConstant = (Enum)constant;
            if (!enumConstant.name().equalsIgnoreCase(name)) continue;
            return constant;
        }
        return null;
    }
}


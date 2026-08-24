/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionHelper {
    private static final RecordHelper RECORD_HELPER;

    /*
     * WARNING - void declaration
     */
    private static void appendExecutableParameters(AccessibleObject executable, StringBuilder stringBuilder) {
        stringBuilder.append('(');
        Class<?>[] parameters = executable instanceof Method ? ((Method)executable).getParameterTypes() : ((Constructor)executable).getParameterTypes();
        int i = 0;
        while (i < parameters.length) {
            void var3_3;
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(parameters[i].getSimpleName());
            ++var3_3;
        }
        stringBuilder.append(')');
    }

    private ReflectionHelper() {
    }

    public static String[] getRecordComponentNames(Class<?> raw) {
        return RECORD_HELPER.getRecordComponentNames(raw);
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var0;
        RecordHelper instance;
        try {
            instance = new RecordSupportedHelper();
        }
        catch (NoSuchMethodException e) {
            instance = new RecordNotSupportedHelper();
        }
        RECORD_HELPER = var0;
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> raw) {
        return RECORD_HELPER.getCanonicalRecordConstructor(raw);
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        }
        catch (Exception exception) {
            return "Failed making constructor '" + ReflectionHelper.constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + exception.getMessage();
        }
    }

    public static String getAccessibleObjectDescription(AccessibleObject object, boolean uppercaseFirstLetter) {
        String string;
        String description;
        if (object instanceof Field) {
            description = "field '" + ReflectionHelper.fieldToString((Field)object) + "'";
        } else if (object instanceof Method) {
            Method method = (Method)object;
            StringBuilder methodSignatureBuilder = new StringBuilder(method.getName());
            ReflectionHelper.appendExecutableParameters(method, methodSignatureBuilder);
            String methodSignature = methodSignatureBuilder.toString();
            description = "method '" + method.getDeclaringClass().getName() + "#" + methodSignature + "'";
        } else {
            description = object instanceof Constructor ? "constructor '" + ReflectionHelper.constructorToString((Constructor)object) + "'" : "<unknown AccessibleObject> " + object.toString();
        }
        if (uppercaseFirstLetter) {
            if (Character.isLowerCase(description.charAt(0))) {
                string = Character.toUpperCase(description.charAt(0)) + description.substring(1);
            }
        }
        return string;
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder stringBuilder = new StringBuilder(constructor.getDeclaringClass().getName());
        ReflectionHelper.appendExecutableParameters(constructor, stringBuilder);
        return stringBuilder.toString();
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException exception) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", exception);
    }

    private static RuntimeException createExceptionForRecordReflectionException(ReflectiveOperationException exception) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", exception);
    }

    public static boolean isRecord(Class<?> raw) {
        return RECORD_HELPER.isRecord(raw);
    }

    /*
     * WARNING - void declaration
     */
    public static void makeAccessible(AccessibleObject object) throws JsonIOException {
        try {
            object.setAccessible(true);
        }
        catch (Exception exception) {
            void var1_1;
            String description = ReflectionHelper.getAccessibleObjectDescription(object, false);
            throw new JsonIOException("Failed making " + description + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.", (Throwable)var1_1);
        }
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static Method getAccessor(Class<?> raw, Field field) {
        return RECORD_HELPER.getAccessor(raw, field);
    }

    private static abstract class RecordHelper {
        abstract String[] getRecordComponentNames(Class<?> var1);

        public abstract Method getAccessor(Class<?> var1, Field var2);

        abstract boolean isRecord(Class<?> var1);

        abstract <T> Constructor<T> getCanonicalRecordConstructor(Class<T> var1);

        private RecordHelper() {
        }
    }

    private static class RecordNotSupportedHelper
    extends RecordHelper {
        @Override
        <T> Constructor<T> getCanonicalRecordConstructor(Class<T> raw) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override
        public Method getAccessor(Class<?> raw, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override
        String[] getRecordComponentNames(Class<?> clazz) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        private RecordNotSupportedHelper() {
        }

        @Override
        boolean isRecord(Class<?> clazz) {
            return false;
        }
    }

    private static class RecordSupportedHelper
    extends RecordHelper {
        private final Method getName;
        private final Method getRecordComponents;
        private final Method getType;
        private final Method isRecord = Class.class.getMethod("isRecord", new Class[0]);

        /*
         * WARNING - void declaration
         */
        @Override
        String[] getRecordComponentNames(Class<?> raw) {
            try {
                void var3_4;
                Object[] recordComponents = (Object[])this.getRecordComponents.invoke(raw, new Object[0]);
                String[] componentNames = new String[recordComponents.length];
                int i = 0;
                while (i < recordComponents.length) {
                    void var4_5;
                    componentNames[i] = (String)this.getName.invoke(recordComponents[i], new Object[0]);
                    ++var4_5;
                }
                return var3_4;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(reflectiveOperationException);
            }
        }

        private RecordSupportedHelper() throws NoSuchMethodException {
            this.getRecordComponents = Class.class.getMethod("getRecordComponents", new Class[0]);
            Class<?> classRecordComponent = this.getRecordComponents.getReturnType().getComponentType();
            this.getName = classRecordComponent.getMethod("getName", new Class[0]);
            this.getType = classRecordComponent.getMethod("getType", new Class[0]);
        }

        @Override
        public Method getAccessor(Class<?> raw, Field field) {
            try {
                return raw.getMethod(field.getName(), new Class[0]);
            }
            catch (ReflectiveOperationException e) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        @Override
        boolean isRecord(Class<?> raw) {
            try {
                return (Boolean)this.isRecord.invoke(raw, new Object[0]);
            }
            catch (ReflectiveOperationException e) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(e);
            }
        }

        /*
         * WARNING - void declaration
         */
        @Override
        public <T> Constructor<T> getCanonicalRecordConstructor(Class<T> raw) {
            try {
                void var3_4;
                Object[] recordComponents = (Object[])this.getRecordComponents.invoke(raw, new Object[0]);
                Class[] recordComponentTypes = new Class[recordComponents.length];
                int i = 0;
                while (i < recordComponents.length) {
                    void var4_5;
                    recordComponentTypes[i] = (Class)this.getType.invoke(recordComponents[i], new Object[0]);
                    ++var4_5;
                }
                return raw.getDeclaredConstructor((Class<?>)var3_4);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                throw ReflectionHelper.createExceptionForRecordReflectionException(reflectiveOperationException);
            }
        }
    }
}


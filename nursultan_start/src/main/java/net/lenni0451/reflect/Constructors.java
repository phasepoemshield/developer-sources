/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  net.lenni0451.reflect.exceptions.ConstructorInvocationException
 *  net.lenni0451.reflect.exceptions.MethodNotFoundException
 */
package net.lenni0451.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import javax.annotation.Nullable;
import net.lenni0451.reflect.Classes;
import net.lenni0451.reflect.JVMConstants;
import net.lenni0451.reflect.JavaBypass;
import net.lenni0451.reflect.Methods;
import net.lenni0451.reflect.exceptions.ConstructorInvocationException;
import net.lenni0451.reflect.exceptions.FieldNotFoundException;
import net.lenni0451.reflect.exceptions.MethodNotFoundException;
import net.lenni0451.reflect.utils.FieldInitializer;

public class Constructors {
    private static final MethodHandle getDeclaredConstructors0 = FieldInitializer.reqInit(() -> {
        if (JVMConstants.OPENJ9_RUNTIME) {
            return Methods.getDeclaredMethod(Class.class, JVMConstants.METHOD_Class_getDeclaredConstructors0, new Class[0]);
        }
        return Methods.getDeclaredMethod(Class.class, JVMConstants.METHOD_Class_getDeclaredConstructors0, Boolean.TYPE);
    }, JavaBypass.TRUSTED_LOOKUP::unreflect, () -> new MethodNotFoundException(Class.class.getName(), JVMConstants.METHOD_Class_getDeclaredConstructors0, new String[]{JVMConstants.OPENJ9_RUNTIME ? "" : "boolean"}));
    private static final Class<?> MemberName = FieldInitializer.condInit(!JVMConstants.OPENJ9_RUNTIME, () -> Classes.forName(JVMConstants.CLASS_MemberName));
    private static final Class<?> DirectMethodHandle_Constructor = FieldInitializer.condInit(!JVMConstants.OPENJ9_RUNTIME, () -> Classes.forName(JVMConstants.CLASS_DirectMethodHandle_Constructor));
    private static final Class<?> MethodHandleNatives_Constants = FieldInitializer.condInit(!JVMConstants.OPENJ9_RUNTIME, () -> Classes.forName(JVMConstants.CLASS_MethodHandleNatives_Constants));
    private static final MethodHandle getInitMethod = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> JavaBypass.TRUSTED_LOOKUP.findGetter(DirectMethodHandle_Constructor, "initMethod", MemberName), handle -> handle.asType(MethodType.methodType(Object.class, MethodHandle.class)), () -> new FieldNotFoundException(DirectMethodHandle_Constructor.getName(), "initMethod"));
    private static final MethodHandle getFlags = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> JavaBypass.TRUSTED_LOOKUP.findGetter(MemberName, JVMConstants.FIELD_MemberName_flags, Integer.TYPE), handle -> handle.asType(MethodType.methodType(Integer.TYPE, Object.class)), () -> new FieldNotFoundException(MemberName.getName(), JVMConstants.FIELD_MemberName_flags));
    private static final MethodHandle setFlags = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> JavaBypass.TRUSTED_LOOKUP.findSetter(MemberName, JVMConstants.FIELD_MemberName_flags, Integer.TYPE), handle -> handle.asType(MethodType.methodType(Void.TYPE, Object.class, Integer.TYPE)), () -> new FieldNotFoundException(MemberName.getName(), JVMConstants.FIELD_MemberName_flags));
    private static final Integer MN_IS_METHOD = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> JavaBypass.TRUSTED_LOOKUP.findStaticGetter(MethodHandleNatives_Constants, JVMConstants.FIELD_MethodHandleNatives_Constants_MN_IS_METHOD, Integer.TYPE), handle -> handle.invokeExact(), () -> new FieldNotFoundException(MethodHandleNatives_Constants.getName(), JVMConstants.FIELD_MethodHandleNatives_Constants_MN_IS_METHOD));
    private static final Integer MN_IS_CONSTRUCTOR = FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, () -> JavaBypass.TRUSTED_LOOKUP.findStaticGetter(MethodHandleNatives_Constants, JVMConstants.FIELD_MethodHandleNatives_Constants_MN_IS_CONSTRUCTOR, Integer.TYPE), handle -> handle.invokeExact(), () -> new FieldNotFoundException(MethodHandleNatives_Constants.getName(), JVMConstants.FIELD_MethodHandleNatives_Constants_MN_IS_CONSTRUCTOR));
    private static final MethodHandle getDirectMethod = (MethodHandle)FieldInitializer.reqOptInit(!JVMConstants.OPENJ9_RUNTIME, FieldInitializer.ThrowingSupplier.getFirst(() -> MethodHandles.insertArguments(JavaBypass.TRUSTED_LOOKUP.findVirtual(MethodHandles.Lookup.class, JVMConstants.METHOD_MethodHandles_Lookup_getDirectMethod, MethodType.methodType(MethodHandle.class, Byte.TYPE, Class.class, MemberName, Class.class)).asType(MethodType.methodType(MethodHandle.class, MethodHandles.Lookup.class, Byte.TYPE, Class.class, Object.class, Class.class)), 4, MethodHandles.Lookup.class), () -> MethodHandles.insertArguments(JavaBypass.TRUSTED_LOOKUP.findVirtual(MethodHandles.Lookup.class, JVMConstants.METHOD_MethodHandles_Lookup_getDirectMethod, MethodType.methodType(MethodHandle.class, Byte.TYPE, Class.class, MemberName, MethodHandles.Lookup.class)).asType(MethodType.methodType(MethodHandle.class, MethodHandles.Lookup.class, Byte.TYPE, Class.class, Object.class, MethodHandles.Lookup.class)), 4, JavaBypass.TRUSTED_LOOKUP)), () -> new MethodNotFoundException(MethodHandles.Lookup.class.getName(), JVMConstants.METHOD_MethodHandles_Lookup_getDirectMethod, new String[]{"byte", Class.class.getName(), MemberName.getName(), MethodHandles.Lookup.class.getName()}));

    public static <T> Constructor<T>[] getDeclaredConstructors(Class<T> clazz) {
        if (JVMConstants.OPENJ9_RUNTIME) {
            return getDeclaredConstructors0.invokeExact(clazz);
        }
        return getDeclaredConstructors0.invokeExact(clazz, false);
    }

    @Nullable
    public static <T> Constructor<T> getDeclaredConstructor(Class<T> clazz, Class<?> ... parameterTypes) {
        for (Constructor<T> constructor : Constructors.getDeclaredConstructors(clazz)) {
            if (!Arrays.equals(constructor.getParameterTypes(), parameterTypes)) continue;
            return constructor;
        }
        return null;
    }

    public static <T> T invoke(Constructor<T> constructor, Object ... args) {
        try {
            return (T)JavaBypass.TRUSTED_LOOKUP.unreflectConstructor(constructor).asSpreader(Object[].class, args.length).invoke(args);
        }
        catch (Throwable t) {
            throw new ConstructorInvocationException(constructor).cause(t);
        }
    }

    public static MethodHandle makeInvokable(MethodHandle handle) {
        if (JVMConstants.OPENJ9_RUNTIME) {
            throw new UnsupportedOperationException("This method is not supported on OpenJ9 runtime");
        }
        if (!DirectMethodHandle_Constructor.isInstance(handle)) {
            throw new IllegalArgumentException("The method handle must be a DirectMethodHandle$Constructor");
        }
        Object memberName = getInitMethod.invokeExact(handle);
        int flags = getFlags.invokeExact(memberName);
        flags &= ~MN_IS_CONSTRUCTOR.intValue();
        setFlags.invokeExact(memberName, flags |= MN_IS_METHOD.intValue());
        return getDirectMethod.invokeExact(JavaBypass.TRUSTED_LOOKUP, (byte)5, handle.type().returnType(), memberName);
    }
}


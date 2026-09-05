/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.lenni0451.reflect.exceptions.MethodInvocationException
 *  net.lenni0451.reflect.exceptions.MethodNotFoundException
 */
package net.lenni0451.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.lenni0451.reflect.JVMConstants;
import net.lenni0451.reflect.JavaBypass;
import net.lenni0451.reflect.exceptions.MethodInvocationException;
import net.lenni0451.reflect.exceptions.MethodNotFoundException;
import net.lenni0451.reflect.utils.FieldInitializer;

public class Methods {
    private static final MethodHandle getDeclaredMethods0 = FieldInitializer.reqInit(() -> {
        if (JVMConstants.OPENJ9_RUNTIME) {
            return Class.class.getDeclaredMethod(JVMConstants.METHOD_Class_getDeclaredMethods0, new Class[0]);
        }
        return Class.class.getDeclaredMethod(JVMConstants.METHOD_Class_getDeclaredMethods0, Boolean.TYPE);
    }, JavaBypass.TRUSTED_LOOKUP::unreflect, () -> new MethodNotFoundException(Class.class.getName(), JVMConstants.METHOD_Class_getDeclaredMethods0, new String[]{JVMConstants.OPENJ9_RUNTIME ? "" : "boolean"}));

    public static Method[] getDeclaredMethods(Class<?> clazz) {
        if (JVMConstants.OPENJ9_RUNTIME) {
            return getDeclaredMethods0.invokeExact(clazz);
        }
        return getDeclaredMethods0.invokeExact(clazz, false);
    }

    @Nullable
    public static Method getDeclaredMethod(Class<?> clazz, String name, Class<?> ... parameterTypes) {
        for (Method method : Methods.getDeclaredMethods(clazz)) {
            if (!method.getName().equals(name) || !Arrays.equals(method.getParameterTypes(), parameterTypes)) continue;
            return method;
        }
        return null;
    }

    public static <T> T invoke(@Nullable Object instance, Method method, Object ... args) {
        try {
            if (Modifier.isStatic(method.getModifiers())) {
                return (T)JavaBypass.TRUSTED_LOOKUP.unreflect(method).invokeWithArguments(args);
            }
            return (T)JavaBypass.TRUSTED_LOOKUP.unreflect(method).bindTo(instance).invokeWithArguments(args);
        }
        catch (Throwable t) {
            throw new MethodInvocationException(method).cause(t);
        }
    }

    public static <I extends S, S, T> T invokeSuper(@Nonnull I instance, @Nonnull Class<S> superClass, Method method, Object ... args) {
        if (Modifier.isStatic(method.getModifiers())) {
            throw new IllegalArgumentException("Cannot invoke static super method");
        }
        try {
            return (T)JavaBypass.TRUSTED_LOOKUP.unreflectSpecial(method, superClass).bindTo(instance).invokeWithArguments(args);
        }
        catch (Throwable t) {
            throw new MethodInvocationException(method).cause(t);
        }
    }
}


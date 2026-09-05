/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  net.lenni0451.reflect.Classes$MR
 *  net.lenni0451.reflect.exceptions.MethodInvocationException
 */
package net.lenni0451.reflect;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import net.lenni0451.reflect.Classes;
import net.lenni0451.reflect.JVMConstants;
import net.lenni0451.reflect.JavaBypass;
import net.lenni0451.reflect.Methods;
import net.lenni0451.reflect.accessor.UnsafeAccess;
import net.lenni0451.reflect.exceptions.MethodInvocationException;
import net.lenni0451.reflect.utils.FieldInitializer;

/*
 * Exception performing whole class analysis ignored.
 */
public class Classes {
    private static final MethodHandle getDeclaredClasses0 = FieldInitializer.reqInit(() -> Methods.getDeclaredMethod(Class.class, JVMConstants.METHOD_Class_getDeclaredClasses0, new Class[0]), JavaBypass.TRUSTED_LOOKUP::unreflect, () -> new MethodInvocationException(Class.class.getName(), JVMConstants.METHOD_Class_getDeclaredClasses0));
    private static final MethodHandle ensureInitialized = FieldInitializer.optInit(() -> Methods.getDeclaredMethod(MethodHandles.Lookup.class, JVMConstants.METHOD_MethodHandles_Lookup_ensureInitialized, Class.class), JavaBypass.TRUSTED_LOOKUP::unreflect);

    public static Class<?>[] getDeclaredClasses(Class<?> clazz) {
        return getDeclaredClasses0.invokeExact(clazz);
    }

    @Nullable
    public static Class<?> getDeclaredClass(Class<?> clazz, String simpleName) {
        for (Class<?> c : Classes.getDeclaredClasses(clazz)) {
            if (!c.getSimpleName().equals(simpleName)) continue;
            return c;
        }
        return null;
    }

    public static void ensureInitialized(Class<?> clazz) {
        try {
            UnsafeAccess.ensureClassInitialized(clazz);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            if (ensureInitialized != null) {
                ensureInitialized.invokeExact(JavaBypass.TRUSTED_LOOKUP.in(clazz), clazz);
                return;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            Classes.forName(clazz.getName(), true, clazz.getClassLoader());
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    @Nullable
    public static Class<?> byName(String name) {
        try {
            return Class.forName(name);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    @Nullable
    public static Class<?> byName(String name, boolean initialize) {
        return Classes.byName(name, initialize, Classes.getCallerClass(1).getClassLoader());
    }

    @Nullable
    public static Class<?> byName(String name, ClassLoader loader) {
        return Classes.byName(name, true, loader);
    }

    @Nullable
    public static Class<?> byName(String name, boolean initialize, ClassLoader loader) {
        try {
            return Class.forName(name, initialize, loader);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    @Nonnull
    public static Class<?> forName(String name) {
        return Class.forName(name);
    }

    @Nonnull
    public static Class<?> forName(String name, boolean initialize) {
        return Classes.forName(name, initialize, Classes.getCallerClass(1).getClassLoader());
    }

    @Nonnull
    public static Class<?> forName(String name, ClassLoader loader) {
        return Classes.forName(name, true, loader);
    }

    @Nonnull
    public static Class<?> forName(String name, boolean initialize, ClassLoader loader) {
        return Class.forName(name, initialize, loader);
    }

    public static Class<?> find(String name, boolean initialize, Iterable<ClassLoader> loaders) {
        for (ClassLoader loader : loaders) {
            try {
                return Class.forName(name, initialize, loader);
            }
            catch (ClassNotFoundException classNotFoundException) {
            }
        }
        throw new ClassNotFoundException(name);
    }

    public static Class<?> find(String name, boolean initialize, ClassLoader ... loaders) {
        for (ClassLoader loader : loaders) {
            try {
                return Class.forName(name, initialize, loader);
            }
            catch (ClassNotFoundException classNotFoundException) {
            }
        }
        throw new ClassNotFoundException(name);
    }

    public static Class<?> getCallerClass(int depth) {
        return MR.getCallerClass((int)depth);
    }
}


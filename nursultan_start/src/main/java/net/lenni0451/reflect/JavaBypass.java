/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.lenni0451.reflect;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import javax.annotation.Nullable;
import net.lenni0451.reflect.Fields;
import net.lenni0451.reflect.JVMConstants;
import net.lenni0451.reflect.utils.FieldInitializer;
import sun.misc.Unsafe;
import sun.reflect.ReflectionFactory;

public class JavaBypass {
    public static final Unsafe UNSAFE = JavaBypass.getUnsafe();
    public static final MethodHandles.Lookup TRUSTED_LOOKUP = JavaBypass.getTrustedLookup();
    @Nullable
    public static final Object INTERNAL_UNSAFE = JavaBypass.getInternalUnsafe();

    public static Unsafe getUnsafe() {
        return FieldInitializer.process(() -> FieldInitializer.reqInit(() -> {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (!field.getType().equals(Unsafe.class)) continue;
                field.setAccessible(true);
                return (Unsafe)field.get(null);
            }
            return null;
        }, () -> new IllegalStateException("Unsafe field not found or was null")), cause -> new IllegalStateException("Unable to get unsafe instance", (Throwable)cause));
    }

    public static MethodHandles.Lookup getTrustedLookup() {
        return FieldInitializer.process(() -> (MethodHandles.Lookup)FieldInitializer.reqInit(FieldInitializer.ThrowingSupplier.getFirst(() -> {
            MethodHandles.Lookup lookup = (MethodHandles.Lookup)ReflectionFactory.getReflectionFactory().newConstructorForSerialization(MethodHandles.Lookup.class, MethodHandles.Lookup.class.getDeclaredConstructor(Class.class)).newInstance(MethodHandles.Lookup.class);
            return lookup.findStaticGetter(MethodHandles.Lookup.class, JVMConstants.FIELD_MethodHandles_Lookup_IMPL_LOOKUP, MethodHandles.Lookup.class).invokeExact();
        }, () -> {
            MethodHandles.lookup();
            Field lookupField = MethodHandles.Lookup.class.getDeclaredField(JVMConstants.FIELD_MethodHandles_Lookup_IMPL_LOOKUP);
            long lookupFieldOffset = UNSAFE.staticFieldOffset(lookupField);
            return (MethodHandles.Lookup)UNSAFE.getObject(UNSAFE.staticFieldBase(lookupField), lookupFieldOffset);
        }), () -> new IllegalStateException("Lookup field was null")), cause -> new IllegalStateException("Unable to get trusted lookup instance", (Throwable)cause));
    }

    @Nullable
    public static Object getInternalUnsafe() {
        return FieldInitializer.process(() -> FieldInitializer.condReqInit(() -> Class.forName(JVMConstants.CLASS_INTERNAL_Unsafe), unsafeClass -> {
            for (Field field : unsafeClass.getDeclaredFields()) {
                if (!field.getType().equals(unsafeClass)) continue;
                return TRUSTED_LOOKUP.unreflectGetter(field).invoke();
            }
            return null;
        }, () -> new IllegalStateException("Internal unsafe field not found or was null")), cause -> new IllegalStateException("Unable to get internal unsafe instance", (Throwable)cause));
    }

    public static void clearReflectionFilter() throws ClassNotFoundException {
        Class<?> reflectionClass;
        try {
            reflectionClass = Class.forName(JVMConstants.CLASS_INTERNAL_Reflection);
        }
        catch (Throwable t) {
            reflectionClass = Class.forName(JVMConstants.CLASS_SUN_Reflection);
        }
        Fields.setObject(null, Fields.getDeclaredField(reflectionClass, JVMConstants.FIELD_Reflection_fieldFilterMap), null);
        Fields.setObject(null, Fields.getDeclaredField(reflectionClass, JVMConstants.FIELD_Reflection_methodFilterMap), null);
    }
}


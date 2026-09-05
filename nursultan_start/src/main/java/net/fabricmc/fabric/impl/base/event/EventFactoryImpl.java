/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.MapMaker
 *  minecraft.class01894
 *  net.fabricmc.fabric.api.event.Event
 */
package net.fabricmc.fabric.impl.base.event;

import com.google.common.collect.MapMaker;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;
import minecraft.class01894;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.base.event.ArrayBackedEvent;

public final class EventFactoryImpl {
    private static final Set<ArrayBackedEvent<?>> ARRAY_BACKED_EVENTS = Collections.newSetFromMap(new MapMaker().weakKeys().makeMap());

    /*
     * WARNING - void declaration
     */
    private static <T> T buildEmptyInvoker(Class<T> clazz, Function<T[], T> function) {
        void var3_6;
        MethodHandle methodHandle;
        Method method2 = null;
        for (Method method3 : clazz.getMethods()) {
            if ((method3.getModifiers() & 0x802) != 0) continue;
            if (method2 != null) {
                throw new IllegalStateException("Multiple virtual methods in " + String.valueOf(clazz) + "; cannot build empty invoker!");
            }
            method2 = method3;
        }
        if (method2 == null) {
            throw new IllegalStateException("No virtual methods in " + String.valueOf(clazz) + "; cannot build empty invoker!");
        }
        Object var3_4 = null;
        try {
            methodHandle = MethodHandles.lookup().unreflect(method2);
            MethodType methodType = methodHandle.type().dropParameterTypes(0, 1);
            if (methodType.returnType() != Void.TYPE) {
                MethodType methodType2 = MethodType.genericMethodType(methodType.parameterCount()).changeReturnType(methodType.returnType()).insertParameterTypes(0, methodHandle.type().parameterType(0));
                MethodHandle methodHandle2 = MethodHandles.explicitCastArguments(methodHandle, methodType2);
                Object[] objectArray2 = new Object[methodHandle.type().parameterCount()];
                objectArray2[0] = function.apply((Object[][])((Object[])Array.newInstance(clazz, 0)));
                Object object = methodHandle2.invokeWithArguments(objectArray2);
            }
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
        methodHandle = var3_6;
        return (T)Proxy.newProxyInstance(EventFactoryImpl.class.getClassLoader(), new Class[]{clazz}, (object2, method, objectArray) -> methodArray);
    }

    public static void ensureNoDuplicates(class01894[] class01894Array) {
        for (int i = 0; i < class01894Array.length; ++i) {
            for (int j = i + 1; j < class01894Array.length; ++j) {
                if (!class01894Array[i].equals((Object)class01894Array[j])) continue;
                throw new IllegalArgumentException("Duplicate event phase: " + String.valueOf(class01894Array[i]));
            }
        }
    }

    private EventFactoryImpl() {
    }

    public static void ensureContainsDefault(class01894[] class01894Array) {
        for (class01894 class018942 : class01894Array) {
            if (!class018942.equals((Object)Event.DEFAULT_PHASE)) continue;
            return;
        }
        throw new IllegalArgumentException("The event phases must contain Event.DEFAULT_PHASE.");
    }

    public static void invalidate() {
        ARRAY_BACKED_EVENTS.forEach(ArrayBackedEvent::update);
    }

    public static <T> Event<T> createArrayBacked(Class<? super T> clazz, Function<T[], T> function) {
        ArrayBackedEvent<? super T> arrayBackedEvent = new ArrayBackedEvent<T>(clazz, function);
        ARRAY_BACKED_EVENTS.add(arrayBackedEvent);
        return arrayBackedEvent;
    }
}


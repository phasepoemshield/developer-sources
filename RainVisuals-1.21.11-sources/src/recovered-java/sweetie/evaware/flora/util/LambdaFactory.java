/*
 * Decompiled with CFR 0.152.
 */
package sweetie.evaware.flora.util;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.function.Consumer;

public class LambdaFactory {
    private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();

    public static <T> Consumer<T> create(Object instance, Method method, Class<T> eventType) {
        try {
            MethodHandles.Lookup caller = MethodHandles.privateLookupIn(instance.getClass(), LOOKUP);
            MethodHandle handle = caller.unreflect(method);
            CallSite site = LambdaMetafactory.metafactory(caller, "accept", MethodType.methodType(Consumer.class, instance.getClass()), MethodType.methodType(Void.TYPE, Object.class), handle, MethodType.methodType(Void.TYPE, eventType));
            return site.getTarget().invoke(instance);
        }
        catch (Throwable e) {
            throw new RuntimeException("Flora: Unable to bind " + method.getName(), e);
        }
    }
}


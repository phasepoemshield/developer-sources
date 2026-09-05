/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11808
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11795;
import Nursultan.class11808;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11779
implements class11808 {
    public static Object[] y;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;

    public class11777 L() {
        return (class11777)((Object)this.L_2);
    }

    public Class<?> M() {
        return (Class)this.L_1;
    }

    public class11779(class11795 class117952, Class<?> clazz, Object object, Method method) {
        this.W();
        if (method.getAnnotation(class11782.class) == null) {
            throw new RuntimeException("Method %s is not annotated with @EventHandler".formatted(new Object[]{method.getName()}));
        }
        class11782 class117822 = method.getAnnotation(class11782.class);
        this.L_0 = method.getParameters()[0].getType();
        this.L_1 = object.getClass();
        this.L_2 = class117822.y();
        this.L_3 = class117822.u();
        this.L_4 = class117822.N();
        this.L_5 = class117822.L();
        try {
            String string = method.getName();
            MethodHandles.Lookup lookup = class117952.create((Method)y[1], clazz);
            MethodType methodType = MethodType.methodType(Void.TYPE, method.getParameters()[0].getType());
            MethodHandle methodHandle = lookup.findVirtual(clazz, string, methodType);
            MethodType methodType2 = MethodType.methodType(Consumer.class, clazz);
            CallSite callSite = LambdaMetafactory.metafactory(lookup, "accept", methodType2, MethodType.methodType(Void.TYPE, Object.class), methodHandle, methodType);
            this.L_6 = callSite.getTarget().invoke(object);
        }
        catch (Throwable throwable) {
            ((Logger)y[0]).error((Object)throwable, throwable);
        }
    }

    static {
        class11779.Z();
        class11779.y[0] = LogManager.getLogger(String.class);
        try {
            class11779.y[1] = MethodHandles.class.getDeclaredMethod("privateLookupIn", Class.class, MethodHandles.Lookup.class);
        }
        catch (Throwable throwable) {
            ((Logger)y[0]).error((Object)throwable, throwable);
        }
    }

    private static void Z() {
        y = new Object[]{null, null};
    }

    public boolean i() {
        return (Boolean)this.L_3;
    }

    public Class<?> u() {
        return (Class)this.L_0;
    }

    public Class<?>[] y() {
        return (Class[])this.L_5;
    }

    public Consumer<Object> N() {
        return (Consumer)this.L_6;
    }

    private void W() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_3 = false;
        }
    }

    public Class<?>[] R() {
        return (Class[])this.L_4;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Foreign;
import com.kenai.jffi.Platform;
import com.kenai.jffi.Type;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class InvokeDynamicSupport {
    public static Invoker getFastNumericInvoker(CallContext callContext, long function) {
        Platform.CPU cpu = Platform.getPlatform().getCPU();
        if (!(callContext.getReturnType() instanceof Type.Builtin)) {
            return null;
        }
        if ((callContext.flags & 1) != 0) {
            return null;
        }
        if (callContext.getParameterCount() > 6) {
            return null;
        }
        boolean isFastInt = false;
        boolean isFastLong = false;
        switch (callContext.getReturnType().type()) {
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: {
                isFastInt = true;
                isFastLong = cpu.dataModel == 64;
                break;
            }
            case 14: {
                isFastInt = cpu.dataModel == 32;
                isFastLong = cpu.dataModel == 64;
                break;
            }
            case 11: 
            case 12: {
                isFastLong = true;
                break;
            }
            case 13: {
                return null;
            }
            case 0: {
                isFastLong = true;
                isFastInt = true;
            }
        }
        isFastInt &= cpu == Platform.CPU.I386 || cpu == Platform.CPU.X86_64;
        isFastLong &= cpu == Platform.CPU.I386 || cpu == Platform.CPU.X86_64;
        block15: for (int i = 0; i < callContext.getParameterCount() && (isFastInt || isFastLong); ++i) {
            if (!(callContext.getParameterType(i) instanceof Type.Builtin)) {
                return null;
            }
            switch (callContext.getParameterType(i).type()) {
                case 5: 
                case 6: 
                case 7: 
                case 8: 
                case 9: 
                case 10: {
                    isFastLong &= cpu.dataModel == 64;
                    continue block15;
                }
                case 11: 
                case 12: {
                    isFastInt = false;
                    continue block15;
                }
                case 14: {
                    isFastInt &= cpu.dataModel == 32;
                    isFastLong &= cpu.dataModel == 64;
                    continue block15;
                }
                case 13: {
                    return null;
                }
                default: {
                    isFastLong = false;
                    isFastInt = false;
                }
            }
        }
        Class<Number> nativeIntClass = isFastInt ? Integer.TYPE : Long.TYPE;
        String methodName = (isFastInt ? "invokeI" : (isFastLong ? "invokeL" : "invokeN")) + callContext.getParameterCount();
        if ((callContext.flags & 2) != 0 && (isFastInt || isFastLong)) {
            methodName = methodName + "NoErrno";
        }
        Object[] params = new Class[2 + callContext.getParameterCount()];
        params[0] = Long.TYPE;
        params[1] = Long.TYPE;
        Arrays.fill(params, 2, params.length, nativeIntClass);
        try {
            Method method = Foreign.class.getDeclaredMethod(methodName, (Class<?>[])params);
            JSR292 jsr292 = JSR292.INSTANCE;
            Object methodHandle = jsr292.insertArguments(jsr292.unreflect(method), 0, callContext.getAddress(), function);
            return new Invoker(method, methodHandle);
        }
        catch (Throwable ex) {
            return null;
        }
    }

    private InvokeDynamicSupport() {
    }

    public static final class Invoker {
        private final Object methodHandle;
        private final Method method;

        public Method getMethod() {
            return this.method;
        }

        Invoker(Method method, Object methodHandle) {
            this.method = method;
            this.methodHandle = methodHandle;
        }

        public Object getMethodHandle() {
            return this.methodHandle;
        }
    }

    static final class JSR292 {
        private final Method unreflect;
        static final JSR292 INSTANCE = JSR292.getInstance();
        private final Method insertArguments;
        private final Class methodHandles;
        private final Object lookup;

        JSR292(Object lookup, Method unreflect, Class methodHandles, Method insertArguments) {
            this.lookup = lookup;
            this.unreflect = unreflect;
            this.methodHandles = methodHandles;
            this.insertArguments = insertArguments;
        }

        /*
         * WARNING - void declaration
         */
        private static JSR292 getInstance() {
            try {
                void var5_6;
                void var1_2;
                void var4_5;
                Class<?> lookupClass = Class.forName("java.lang.invoke.MethodHandles$Lookup");
                Class<?> methodHandlesClass = Class.forName("java.lang.invoke.MethodHandles");
                Class<?> methodHandleClass = Class.forName("java.lang.invoke.MethodHandle");
                Method lookupMethod = methodHandlesClass.getDeclaredMethod("lookup", new Class[0]);
                Class[] classArray = new Class[1];
                classArray[0] = Method.class;
                Method unreflect = lookupClass.getDeclaredMethod("unreflect", classArray);
                Class[] classArray2 = new Class[3];
                classArray2[0] = methodHandleClass;
                classArray2[1] = Integer.TYPE;
                classArray2[2] = Object[].class;
                Method insertArguments = methodHandlesClass.getDeclaredMethod("insertArguments", classArray2);
                Object lookup = lookupMethod.invoke(methodHandlesClass, new Object[0]);
                return new JSR292(lookup, (Method)var4_5, (Class)var1_2, (Method)var5_6);
            }
            catch (Throwable throwable) {
                return null;
            }
        }

        static boolean isAvailable() {
            return INSTANCE != null;
        }

        public Object unreflect(Method m) throws Exception {
            Object[] objectArray = new Object[1];
            objectArray[0] = m;
            return this.unreflect.invoke(this.lookup, objectArray);
        }

        /*
         * WARNING - void declaration
         */
        public Object insertArguments(Object methodHandle, int index, Object ... values2) throws Exception {
            void var3_3;
            Object[] objectArray = new Object[3];
            objectArray[0] = methodHandle;
            objectArray[1] = index;
            objectArray[2] = var3_3;
            return this.insertArguments.invoke((Object)this.methodHandles, objectArray);
        }
    }
}


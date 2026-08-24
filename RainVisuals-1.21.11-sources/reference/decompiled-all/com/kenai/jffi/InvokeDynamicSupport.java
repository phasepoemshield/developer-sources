package com.kenai.jffi;

import java.lang.reflect.Method;
import java.util.Arrays;

// $VF: Compiled from InvokeDynamicSupport.java
public final class InvokeDynamicSupport {
   public static InvokeDynamicSupport.Invoker getFastNumericInvoker(CallContext callContext, long function) {
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
         case 0:
            isFastLong = true;
            isFastInt = true;
         case 1:
         case 2:
         case 3:
         case 4:
         default:
            break;
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
            isFastInt = true;
            isFastLong = cpu.dataModel == 64;
            break;
         case 11:
         case 12:
            isFastLong = true;
            break;
         case 13:
            return null;
         case 14:
            isFastInt = cpu.dataModel == 32;
            isFastLong = cpu.dataModel == 64;
      }

      isFastInt &= cpu == Platform.CPU.I386 || cpu == Platform.CPU.X86_64;
      isFastLong &= cpu == Platform.CPU.I386 || cpu == Platform.CPU.X86_64;

      for (int i = 0; i < callContext.getParameterCount() && (isFastInt || isFastLong); i++) {
         if (!(callContext.getParameterType(i) instanceof Type.Builtin)) {
            return null;
         }

         switch (callContext.getParameterType(i).type()) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
               isFastLong &= cpu.dataModel == 64;
               break;
            case 11:
            case 12:
               isFastInt = false;
               break;
            case 13:
               return null;
            case 14:
               isFastInt &= cpu.dataModel == 32;
               isFastLong &= cpu.dataModel == 64;
               break;
            default:
               isFastLong = false;
               isFastInt = false;
         }
      }

      Class nativeIntClass = isFastInt ? int.class : long.class;
      String methodName = (isFastInt ? "invokeI" : (isFastLong ? "invokeL" : "invokeN")) + callContext.getParameterCount();
      if ((callContext.flags & 2) != 0 && (isFastInt || isFastLong)) {
         methodName = methodName + "NoErrno";
      }

      Class[] params = new Class[2 + callContext.getParameterCount()];
      params[0] = long.class;
      params[1] = long.class;
      Arrays.fill(params, 2, params.length, nativeIntClass);

      try {
         Method method = Foreign.class.getDeclaredMethod(methodName, params);
         InvokeDynamicSupport.JSR292 jsr292 = InvokeDynamicSupport.JSR292.INSTANCE;
         Object methodHandle = jsr292.insertArguments(jsr292.unreflect(method), 0, callContext.getAddress(), function);
         return new InvokeDynamicSupport.Invoker(method, methodHandle);
      } catch (Throwable ex) {
         return null;
      }
   }

   private InvokeDynamicSupport() {
   }

   // $VF: Compiled from InvokeDynamicSupport.java
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

   // $VF: Compiled from InvokeDynamicSupport.java
   static final class JSR292 {
      private final Method unreflect;
      static final InvokeDynamicSupport.JSR292 INSTANCE = getInstance();
      private final Method insertArguments;
      private final Class methodHandles;
      private final Object lookup;

      JSR292(Object insertArguments, Method lookup, Class methodHandles, Method unreflect) {
         this.lookup = lookup;
         this.unreflect = unreflect;
         this.methodHandles = methodHandles;
         this.insertArguments = insertArguments;
      }

      private static InvokeDynamicSupport.JSR292 getInstance() {
         try {
            Class lookupClass = Class.forName("java.lang.invoke.MethodHandles$Lookup");
            Class methodHandlesClass = Class.forName("java.lang.invoke.MethodHandles");
            Class methodHandleClass = Class.forName("java.lang.invoke.MethodHandle");
            Method lookupMethod = methodHandlesClass.getDeclaredMethod("lookup");
            Method unreflect = lookupClass.getDeclaredMethod("unreflect", Method.class);
            Method insertArguments = methodHandlesClass.getDeclaredMethod("insertArguments", methodHandleClass, int.class, Object[].class);
            Object lookup = lookupMethod.invoke(methodHandlesClass);
            return new InvokeDynamicSupport.JSR292(lookup, unreflect, methodHandlesClass, insertArguments);
         } catch (Throwable var7) {
            return null;
         }
      }

      static boolean isAvailable() {
         return INSTANCE != null;
      }

      public Object unreflect(Method m) throws Exception {
         return this.unreflect.invoke(this.lookup, m);
      }

      public Object insertArguments(Object index, int methodHandle, Object... values) throws Exception {
         return this.insertArguments.invoke(this.methodHandles, methodHandle, index, values);
      }
   }
}

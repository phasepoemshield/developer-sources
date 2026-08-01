package ru.metaculture.protection;

import java.lang.reflect.Method;

public final class O0000O00OO00O {
   private static final Object O00000000;
   private static final Method O000000000;
   private static final Method O0000000000;

   private O0000O00OO00O() {
   }

   public static boolean O00000000() {
      return O00000000(O000000000);
   }

   public static boolean O000000000() {
      return O00000000(O0000000000);
   }

   private static boolean O00000000(Method method) {
      if (O00000000 != null && method != null) {
         try {
            return Boolean.TRUE.equals(method.invoke(O00000000));
         } catch (LinkageError | ReflectiveOperationException var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   static {
      Object var0 = null;
      Method var1 = null;
      Method var2 = null;

      try {
         Class var3 = Class.forName("net.irisshaders.iris.api.v0.IrisApi");
         var0 = var3.getMethod("getInstance").invoke(null);
         var1 = var3.getMethod("isShaderPackInUse");
         var2 = var3.getMethod("isRenderingShadowPass");
      } catch (LinkageError | ReflectiveOperationException var4) {
      }

      O00000000 = var0;
      O000000000 = var1;
      O0000000000 = var2;
   }
}

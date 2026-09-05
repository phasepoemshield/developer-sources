package ru.metaculture.protection;

import java.lang.reflect.Method;

public final class NnuVnuNVV {
   private static final boolean UuUVuuUu;
   private static final Object C00OOC00oO;
   private static final Method uUnuvNvvNU;
   private static final Method vVvUvVVuuNvV;

   private NnuVnuNVV() {
   }

   public static boolean UuUVuuUu() {
      return uUnuvNvvNU() == UuvNnuv.TRUE;
   }

   public static boolean C00OOC00oO() {
      return vVvUvVVuuNvV() == UuvNnuv.TRUE;
   }

   public static UuvNnuv uUnuvNvvNU() {
      return UuUVuuUu(uUnuvNvvNU);
   }

   public static UuvNnuv vVvUvVVuuNvV() {
      return UuUVuuUu(vVvUvVVuuNvV);
   }

   public static boolean uNNnnnuuuN() {
      return uUnuvNvvNU().UuUVuuUu() && vVvUvVVuuNvV().UuUVuuUu();
   }

   private static UuvNnuv UuUVuuUu(Method var0) {
      if (!UuUVuuUu) {
         return UuvNnuv.FALSE;
      } else if (C00OOC00oO != null && var0 != null) {
         try {
            return UuvNnuv.UuUVuuUu(true, true, var0.invoke(C00OOC00oO) instanceof Boolean var2 ? var2 : null);
         } catch (LinkageError | RuntimeException | ReflectiveOperationException var3) {
            return UuvNnuv.UNKNOWN;
         }
      } else {
         return UuvNnuv.UNKNOWN;
      }
   }

   static {
      boolean var0 = false;
      Object var1 = null;
      Method var2 = null;
      Method var3 = null;

      try {
         Class var4 = Class.forName("net.irisshaders.iris.api.v0.IrisApi");
         var0 = true;
         var1 = var4.getMethod("getInstance").invoke(null);
         var2 = var4.getMethod("isShaderPackInUse");
         var3 = var4.getMethod("isRenderingShadowPass");
      } catch (ClassNotFoundException var5) {
      } catch (LinkageError | RuntimeException | ReflectiveOperationException var6) {
         var0 = true;
      }

      UuUVuuUu = var0;
      C00OOC00oO = var1;
      uUnuvNvvNU = var2;
      vVvUvVVuuNvV = var3;
   }
}

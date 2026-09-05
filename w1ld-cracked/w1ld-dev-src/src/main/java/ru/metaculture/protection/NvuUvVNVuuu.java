package ru.metaculture.protection;

import java.util.List;
import org.wild.module.api.Module;

public final class NvuUvVNVuuu {
   private static final List<UvUuUvUVUU> UuUVuuUu = List.of(new nUvUnuNNNnUN(), new nvnUNvNUNv());

   private NvuUvVNVuuu() {
   }

   public static UvUuUvUVUU UuUVuuUu(Module var0) {
      for (UvUuUvUVUU var2 : UuUVuuUu) {
         if (var2.UuUVuuUu(var0)) {
            return var2;
         }
      }

      return null;
   }

   public static boolean C00OOC00oO(Module var0) {
      return UuUVuuUu(var0) != null;
   }

   public static VvvVunn UuUVuuUu(Module var0, uVUvuUUNVUv var1, nUvnuVnNUU var2) {
      return new VvvVunn(
         var0,
         var1.vNVuvnUUnuUn(),
         var1.UvnvNVnnnnNU() - var2.UvnvNVnnnnNU() - var2.UuUVuuUu(10.0F),
         var1.uVUVnuvnuVuv(),
         var2.UvnvNVnnnnNU() + var1.NVNnnvnuunNv(),
         var1.NVNnnvnuunNv() + var2.UuUVuuUu(20.0F)
      );
   }

   public static void UuUVuuUu(vNvvVnNuUVvv var0) {
      uUnuvNvvNU(var0);

      for (UvUuUvUVUU var2 : UuUVuuUu) {
         var2.UuUVuuUu(var0);
      }
   }

   public static void C00OOC00oO(vNvvVnNuUVvv var0) {
      uUnuvNvvNU(var0);

      for (UvUuUvUVUU var2 : UuUVuuUu) {
         var2.C00OOC00oO(var0);
      }
   }

   public static void uUnuvNvvNU(vNvvVnNuUVvv var0) {
      for (UvUuUvUVUU var2 : UuUVuuUu) {
         var2.uUnuvNvvNU(var0);
      }
   }

   public static void UuUVuuUu(Module var0, vNvvVnNuUVvv var1, Cc0cOoOcC0o var2, Cc0cOoOcC0o var3) {
      UvUuUvUVUU var4 = UuUVuuUu(var0);
      if (var4 != null) {
         var4.UuUVuuUu(var0, var1, var2, var3);
      }
   }

   public static void UuUVuuUu(List<NVUVNNunvvNN> var0, vNvvVnNuUVvv var1, VvvVunn var2, nUvnuVnNUU var3) {
      UvUuUvUVUU var4 = UuUVuuUu(var2.UuUVuuUu());
      if (var4 != null) {
         var4.UuUVuuUu(var0, var1, var2, var3);
      }
   }

   public static boolean UuUVuuUu(vNvvVnNuUVvv var0, CCCo0o0cCCo var1, nUvnuVnNUU var2, float var3, float var4, double var5) {
      for (UvUuUvUVUU var8 : UuUVuuUu) {
         if (var8.UuUVuuUu(var0, var1, var2, var3, var4, var5)) {
            return true;
         }
      }

      return false;
   }

   public static boolean UuUVuuUu(vNvvVnNuUVvv var0, float var1, float var2) {
      for (UvUuUvUVUU var4 : UuUVuuUu) {
         if (var4.UuUVuuUu(var0, var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public static boolean vVvUvVVuuNvV(vNvvVnNuUVvv var0) {
      boolean var1 = false;

      for (UvUuUvUVUU var3 : UuUVuuUu) {
         if (var3.vVvUvVVuuNvV(var0)) {
            var1 = true;
         }
      }

      return var1;
   }

   public static boolean UuUVuuUu(vNvvVnNuUVvv var0, int var1) {
      for (UvUuUvUVUU var3 : UuUVuuUu) {
         if (var3.UuUVuuUu(var0, var1)) {
            return true;
         }
      }

      return false;
   }

   public static boolean UuUVuuUu(vNvvVnNuUVvv var0, char var1) {
      for (UvUuUvUVUU var3 : UuUVuuUu) {
         if (var3.UuUVuuUu(var0, var1)) {
            return true;
         }
      }

      return false;
   }
}

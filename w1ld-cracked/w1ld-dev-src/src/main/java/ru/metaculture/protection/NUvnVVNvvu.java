package ru.metaculture.protection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class NUvnVVNvvu {
   private static final Map<Class<? extends VunUNUNVUnv>, NUvnVVNvvu.NVnVnNnN[]> UuUVuuUu = new ConcurrentHashMap<>();
   private static boolean C00OOC00oO = false;
   private static int uUnuvNvvNU = 0;

   public static void UuUVuuUu(Object var0) {
      for (Method var4 : var0.getClass().getDeclaredMethods()) {
         if (!UuUVuuUu(var4)) {
            UuUVuuUu(var4, var0);
         }
      }
   }

   public static void C00OOC00oO(Object var0) {
      for (Entry var2 : UuUVuuUu.entrySet()) {
         NUvnVVNvvu.NVnVnNnN[] var3 = (NUvnVVNvvu.NVnVnNnN[])var2.getValue();
         int var4 = 0;

         for (int var5 = 0; var5 < var3.length; var5++) {
            if (!var3[var5].UuUVuuUu().equals(var0)) {
               var4++;
            }
         }

         if (var4 != var3.length) {
            if (var4 == 0) {
               UuUVuuUu.remove(var2.getKey(), var3);
            } else {
               NUvnVVNvvu.NVnVnNnN[] var8 = new NUvnVVNvvu.NVnVnNnN[var4];
               int var6 = 0;

               for (int var7 = 0; var7 < var3.length; var7++) {
                  if (!var3[var7].UuUVuuUu().equals(var0)) {
                     var8[var6++] = var3[var7];
                  }
               }

               UuUVuuUu.put((Class<? extends VunUNUNVUnv>)var2.getKey(), var8);
            }
         }
      }

      UuUVuuUu(true);
   }

   private static void UuUVuuUu(Method var0, Object var1) {
      try {
         Class var2 = var0.getParameterTypes()[0];
         NUvnVVNvvu.NVnVnNnN var3 = new NUvnVVNvvu.NVnVnNnN(var1, var0, var0.getAnnotation(vuVvUNNvVNV.class).UuUVuuUu());
         if (!var3.C00OOC00oO().isAccessible()) {
            var3.C00OOC00oO().setAccessible(true);
         }

         NUvnVVNvvu.NVnVnNnN[] var4 = UuUVuuUu.get(var2);
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.length; var5++) {
               if (var4[var5].equals(var3)) {
                  return;
               }
            }

            NUvnVVNvvu.NVnVnNnN[] var7 = new NUvnVVNvvu.NVnVnNnN[var4.length + 1];
            System.arraycopy(var4, 0, var7, 0, var4.length);
            var7[var4.length] = var3;
            UuUVuuUu.put(var2, UuUVuuUu(var7));
         } else {
            UuUVuuUu.put(var2, new NUvnVVNvvu.NVnVnNnN[]{var3});
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }
   }

   public static void UuUVuuUu(boolean var0) {
      if (!var0) {
         UuUVuuUu.clear();
      } else {
         for (Entry var2 : UuUVuuUu.entrySet()) {
            NUvnVVNvvu.NVnVnNnN[] var3 = (NUvnVVNvvu.NVnVnNnN[])var2.getValue();
            if (var3 == null || var3.length == 0) {
               UuUVuuUu.remove(var2.getKey(), var3);
            }
         }
      }
   }

   private static boolean UuUVuuUu(Method var0) {
      return var0.getParameterTypes().length != 1 || !var0.isAnnotationPresent(vuVvUNNvVNV.class);
   }

   public static void UuUVuuUu() {
   }

   public static VunUNUNVUnv UuUVuuUu(VunUNUNVUnv var0) {
      NUvnVVNvvu.NVnVnNnN[] var1 = UuUVuuUu.get(var0.getClass());
      if (var1 != null && var1.length > 0) {
         if (var0 instanceof UnuNvnVUUunn var2) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               UuUVuuUu(var1[var3], var0);
               if (var2.vVvUvVVuuNvV()) {
                  break;
               }
            }
         } else {
            for (int var4 = 0; var4 < var1.length; var4++) {
               UuUVuuUu(var1[var4], var0);
            }
         }
      }

      return var0;
   }

   private static NUvnVVNvvu.NVnVnNnN[] UuUVuuUu(NUvnVVNvvu.NVnVnNnN[] var0) {
      Arrays.sort(var0, (var0x, var1) -> Integer.compare(UuUVuuUu(var0x.uUnuvNvvNU()), UuUVuuUu(var1.uUnuvNvvNU())));
      return var0;
   }

   private static int UuUVuuUu(byte var0) {
      for (int var1 = 0; var1 < nuvNNvvNNUU.nuUnNvnuUu.length; var1++) {
         if (nuvNNvvNNUU.nuUnNvnuUu[var1] == var0) {
            return var1;
         }
      }

      return nuvNNvvNNUU.nuUnNvnuUu.length;
   }

   private static void UuUVuuUu(NUvnVVNvvu.NVnVnNnN var0, VunUNUNVUnv var1) {
      try {
         var0.C00OOC00oO().invoke(var0.UuUVuuUu(), var1);
      } catch (IllegalArgumentException | IllegalAccessException var4) {
         System.err
            .println(
               "[EventManager] Failed to invoke "
                  + var0.C00OOC00oO().getName()
                  + " on "
                  + var0.UuUVuuUu().getClass().getSimpleName()
                  + ": "
                  + var4.getMessage()
            );
      } catch (InvocationTargetException var5) {
         Throwable var3 = var5.getCause();
         System.err
            .println(
               "[EventManager] Exception in handler "
                  + var0.C00OOC00oO().getName()
                  + " on "
                  + var0.UuUVuuUu().getClass().getSimpleName()
                  + ": "
                  + (var3 != null ? var3.getMessage() : var5.getMessage())
            );
         if (var3 != null) {
            var3.printStackTrace();
         }
      }
   }

   static final class NVnVnNnN {
      private final Object UuUVuuUu;
      private final Method C00OOC00oO;
      private final byte uUnuvNvvNU;

      public NVnVnNnN(Object var1, Method var2, byte var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
      }

      public Object UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public Method C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public byte uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            NUvnVVNvvu.NVnVnNnN var2 = (NUvnVVNvvu.NVnVnNnN)var1;
            return this.uUnuvNvvNU == var2.uUnuvNvvNU && this.UuUVuuUu.equals(var2.UuUVuuUu) && this.C00OOC00oO.equals(var2.C00OOC00oO);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.UuUVuuUu, this.C00OOC00oO, this.uUnuvNvvNU);
      }
   }
}

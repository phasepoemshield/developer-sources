package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_310;
import net.minecraft.class_412;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_9812;

public final class nvnvNnuUVNV {
   private static final long UuUVuuUu = 3500L;
   private static final Object C00OOC00oO = new Object();
   private static volatile long uUnuvNvvNU;
   private static volatile class_642 vVvUvVVuuNvV;
   private static volatile boolean uNNnnnuuuN;
   private static volatile class_642 nuUnNvnuUu;

   private nvnvNnuUVNV() {
   }

   public static void UuUVuuUu(class_642 var0, class_9812 var1) {
      if (var1 != null && var1.comp_2853() != null) {
         String var2;
         try {
            var2 = UuUVuuUu(var1.comp_2853().getString());
         } catch (Throwable var10) {
            return;
         }

         if (C00OOC00oO(var2)) {
            class_642 var3 = var0;
            if (var0 == null) {
               class_310 var4 = class_310.method_1551();
               if (var4 != null) {
                  try {
                     var3 = var4.method_1558();
                  } catch (Throwable var9) {
                     var3 = null;
                  }
               }
            }

            if (var3 == null) {
               var3 = nuUnNvnuUu;
            }

            if (var3 != null) {
               class_642 var11;
               try {
                  var11 = UuUVuuUu(var3);
               } catch (Throwable var8) {
                  return;
               }

               synchronized (C00OOC00oO) {
                  vVvUvVVuuNvV = var11;
                  uUnuvNvvNU = System.currentTimeMillis() + 3500L;
                  uNNnnnuuuN = true;
               }
            }
         }
      }
   }

   public static void UuUVuuUu(class_310 var0) {
      if (uNNnnnuuuN && var0 != null) {
         try {
            C00OOC00oO(var0);
         } catch (Throwable var13) {
         }

         if (var0.field_1755 instanceof class_419) {
            class_642 var1;
            long var2;
            synchronized (C00OOC00oO) {
               if (!uNNnnnuuuN) {
                  return;
               }

               var2 = uUnuvNvvNU;
               var1 = vVvUvVVuuNvV;
            }

            if (System.currentTimeMillis() >= var2) {
               if (var0.method_1562() == null) {
                  if (var1 != null && var1.field_3761 != null && !var1.field_3761.isBlank()) {
                     try {
                        class_639 var15 = class_639.method_2950(var1.field_3761);
                        class_412.method_36877(C00OOC00oO(), var0, var15, var1, false, null);
                     } catch (Throwable var11) {
                     } finally {
                        UuUVuuUu();
                     }
                  } else {
                     UuUVuuUu();
                  }
               }
            }
         }
      }
   }

   public static void UuUVuuUu() {
      synchronized (C00OOC00oO) {
         uNNnnnuuuN = false;
         uUnuvNvvNU = 0L;
         vVvUvVVuuNvV = null;
      }
   }

   public static void C00OOC00oO(class_310 var0) {
      if (var0 != null) {
         try {
            if (var0.method_1562() == null) {
               return;
            }

            class_642 var1 = var0.method_1558();
            if (var1 == null || var1.field_3761 == null || var1.field_3761.isBlank()) {
               return;
            }

            nuUnNvnuUu = UuUVuuUu(var1);
         } catch (Throwable var2) {
         }
      }
   }

   private static class_642 UuUVuuUu(class_642 var0) {
      class_642 var1 = new class_642(var0.field_3752, var0.field_3761, var0.method_55616());
      var1.method_2996(var0);
      return var1;
   }

   private static class_437 C00OOC00oO() {
      return (class_437)(UnHook.uVunuUNVVUUV ? new class_500(new class_442()) : new uNuVuVnNnu(new VvVVnnNNNuV()));
   }

   private static String UuUVuuUu(String var0) {
      return var0 != null && !var0.isBlank() ? var0.replaceAll("§.", "").replace('§', ' ').toLowerCase(Locale.ROOT).trim() : "";
   }

   private static boolean C00OOC00oO(String var0) {
      return var0 == null
         ? false
         : var0.contains("слишком много перемещаетесь между серверами")
            || var0.contains("ошибка сетевого протокола")
            || var0.contains("network protocol error")
            || var0.contains("too many server transfers")
            || var0.contains("too many moves between servers");
   }
}

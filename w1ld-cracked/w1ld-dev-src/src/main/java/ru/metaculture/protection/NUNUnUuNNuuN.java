package ru.metaculture.protection;

import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_310;

public final class NUNUnUuNNuuN {
   private static volatile String UuUVuuUu = "";
   private static volatile String C00OOC00oO = "";
   private static volatile String uUnuvNvvNU = "";
   private static volatile long vVvUvVVuuNvV;

   private NUNUnUuNNuuN() {
   }

   public static void UuUVuuUu(String var0, String var1) {
      UuUVuuUu = C00OOC00oO(var0);
      C00OOC00oO = var1 == null ? "" : var1.trim();
   }

   public static void UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_1548() != null) {
         List var1 = vNnUUnNVvvV.UuUVuuUu(UuUVuuUu());
         if (!var1.isEmpty()) {
            String var2 = vNnUUnNVvvV.C00OOC00oO(UuUVuuUu());
            vNnUUnNVvvV.NVnVnNnN var3 = var1.stream()
               .filter(var1x -> var1x.id().equals(var2))
               .findFirst()
               .orElseGet(
                  () -> var1.stream().filter(var0xx -> var0xx.lastUsedAt() > 0L).max(Comparator.comparingLong(vNnUUnNVvvV.NVnVnNnN::lastUsedAt)).orElse(null)
               );
            if (var3 != null && !var3.name().isBlank()) {
               UuUVuuUu(var3.name(), var3.password());
               if (!var3.name().equals(var0.method_1548().method_1676())) {
                  uUNNNVNVvNV.UuUVuuUu(var0);
                  boolean var4 = false;
                  if ("PREMIUM".equalsIgnoreCase(var3.type())) {
                     var4 = uUNNNVNVvNV.UuUVuuUu(var0, var3.name());
                  }

                  if (!var4) {
                     uUNNNVNVvNV.C00OOC00oO(var0, var3.name());
                  }
               }
            }
         }
      }
   }

   public static void C00OOC00oO(class_310 var0) {
      if (var0 != null && var0.method_1548() != null) {
         String var1 = C00OOC00oO(var0.method_1548().method_1676());
         if (!var1.isEmpty()) {
            Thread var2 = new Thread(() -> {
               String var1x;
               try {
                  var1x = UuUVuuUu(var1);
               } catch (Throwable var8) {
                  return;
               }

               if (!var1x.isEmpty()) {
                  String var2x = var1.toLowerCase(Locale.ROOT) + ":" + Integer.toHexString(var1x.hashCode());
                  long var3 = System.currentTimeMillis();
                  synchronized (NUNUnUuNNuuN.class) {
                     if (var2x.equals(uUnuvNvvNU) && var3 - vVvUvVVuuNvV < 4500L) {
                        return;
                     }

                     uUnuvNvvNU = var2x;
                     vVvUvVVuuNvV = var3;
                  }

                  try {
                     Thread.sleep(1600L);
                  } catch (InterruptedException var7) {
                     Thread.currentThread().interrupt();
                     return;
                  }

                  class_310 var10 = class_310.method_1551();
                  if (var10 != null) {
                     var10.execute(() -> {
                        if (var10.field_1724 != null && var10.field_1724.field_3944 != null && var10.method_1548() != null) {
                           if (var1.equalsIgnoreCase(C00OOC00oO(var10.method_1548().method_1676()))) {
                              var10.field_1724.field_3944.method_45730("login " + var1x);
                           }
                        }
                     });
                  }
               }
            }, "Wild Alt AutoLogin");
            var2.setDaemon(true);
            var2.start();
         }
      }
   }

   private static String UuUVuuUu(String var0) {
      if (var0.isEmpty()) {
         return "";
      } else if (var0.equalsIgnoreCase(UuUVuuUu) && !C00OOC00oO.isEmpty()) {
         return C00OOC00oO;
      } else {
         for (vNnUUnNVvvV.NVnVnNnN var3 : vNnUUnNVvvV.UuUVuuUu(UuUVuuUu())) {
            if ("CRACKED".equalsIgnoreCase(var3.type()) && var0.equalsIgnoreCase(var3.name())) {
               return var3.password() == null ? "" : var3.password().trim();
            }
         }

         return "";
      }
   }

   private static File UuUVuuUu() {
      return NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nuUnNvnuUu != null
         ? new File(NVnVnNnN.UuUVuuUu.nuUnNvnuUu, "accounts.json")
         : new File(NVnVnNnN.C00OOC00oO(), "accounts.json");
   }

   private static String C00OOC00oO(String var0) {
      return var0 == null ? "" : var0.trim();
   }
}

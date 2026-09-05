package ru.metaculture.protection;

import java.util.Set;

public final class WVWvvVvwWWw {
   private static boolean UuUVuuUu;
   private static final Set<String> C00OOC00oO = Set.of(
      "Adaptive Mica Plate",
      "Velvet Module Card",
      "Nebula Panel Bloom",
      "Aurora Button Pulse",
      "Entity Aura Mask",
      "Holographic Nametag",
      "Trail Energy Ribbon",
      "Magnetic Rim Glow",
      "Pulse Health Ribbon",
      "Phase Chams Film",
      "Prism Sky Wash",
      "Menu Mica Backdrop",
      "Vivid Veil"
   );

   private WVWvvVvwWWw() {
   }

   public static synchronized void UuUVuuUu(nvvuUNnNvN var0, oo0OOO00o0O var1) {
      if (!UuUVuuUu && var0 != null && var1 != null) {
         UuUVuuUu = true;
         lllilIiI11l var2 = lllilIiI11l.UuUVuuUu();
         var2.UuUVuuUu(var0);
         uNNnUu.UuUVuuUu().UuUVuuUu(var1);
         NuVunNnUvvN.UuUVuuUu().UuUVuuUu(var1, var0);

         for (nNVvuuVvnvV.nvnNNunvv var4 : nNVvuuVvnvV.UuUVuuUu) {
            try {
               nuVVnvn var5 = nNVvuuVvnvV.UuUVuuUu(var4, var0);
               if (var5 != null) {
                  var5.UuUVuuUu(var4.target().UuUVuuUu());
                  NNnUUVVnuUV var6 = var1.UuUVuuUu(var5);
                  if (!var6.ok()) {
                     System.out.println("[FoundryBootstrap] skipped failed preset " + var4.title() + ": " + var6.error());
                  } else {
                     uNNnUu.UuUVuuUu().UuUVuuUu(var4.title(), var5, var6, uNNnUu.nvnNNunvv.PRESET);
                  }
               }
            } catch (Throwable var12) {
               System.out.println("[FoundryBootstrap] failed to publish preset " + var4.title() + ": " + var12.getMessage());
            }
         }

         for (VUvUNNUvvNVN var15 : var2.C00OOC00oO()) {
            try {
               if (!UuUVuuUu(var15)) {
                  nuVVnvn var17 = var2.UuUVuuUu(var15.UuUVuuUu(), var0);
                  if (var17 != null) {
                     NNnUUVVnuUV var19 = var1.UuUVuuUu(var17);
                     if (!var19.ok()) {
                        System.out.println("[FoundryBootstrap] skipped failed slot " + var15.C00OOC00oO() + ": " + var19.error());
                     } else {
                        uNNnUu.UuUVuuUu().UuUVuuUu(var15.C00OOC00oO(), var17, var19, C00OOC00oO(var15));
                     }
                  }
               }
            } catch (Throwable var11) {
               System.out.println("[FoundryBootstrap] failed to publish " + var15.C00OOC00oO() + ": " + var11.getMessage());
            }
         }

         for (VnuVUNUv var20 : VnuVUNUv.values()) {
            VUvUNNUvvNVN var7 = var2.uUnuvNvvNU(var20);
            if (var7 != null) {
               try {
                  nuVVnvn var8 = var2.UuUVuuUu(var7.UuUVuuUu(), var0);
                  if (var8 != null) {
                     var8.UuUVuuUu(var20.UuUVuuUu());
                     NNnUUVVnuUV var9 = var1.UuUVuuUu(var8);
                     if (!var9.ok()) {
                        System.out.println("[FoundryBootstrap] skipped failed bound target " + var20.UuUVuuUu() + ": " + var9.error());
                     } else {
                        uNNnUu.UuUVuuUu().UuUVuuUu(var20, var8, var9);
                     }
                  }
               } catch (Throwable var10) {
                  System.out.println("[FoundryBootstrap] failed to publish " + var20.UuUVuuUu() + ": " + var10.getMessage());
               }
            }
         }
      }
   }

   public static Set<String> UuUVuuUu() {
      return C00OOC00oO;
   }

   private static boolean UuUVuuUu(VUvUNNUvvNVN var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = uNNnUu.vuuuNvNuv(var0.C00OOC00oO());
         return C00OOC00oO.contains(var1);
      }
   }

   private static uNNnUu.nvnNNunvv C00OOC00oO(VUvUNNUvvNVN var0) {
      if (var0 == null) {
         return uNNnUu.nvnNNunvv.USER;
      } else {
         String var1 = var0.vNUvnnVnUvu();
         if ("preset".equalsIgnoreCase(var1)) {
            return uNNnUu.nvnNNunvv.PRESET;
         } else {
            return !"imported".equalsIgnoreCase(var1) && !"shared".equalsIgnoreCase(var1) ? uNNnUu.nvnNNunvv.USER : uNNnUu.nvnNNunvv.IMPORTED;
         }
      }
   }
}

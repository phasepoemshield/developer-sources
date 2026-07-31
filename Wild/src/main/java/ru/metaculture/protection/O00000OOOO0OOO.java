package ru.metaculture.protection;

import java.util.Set;

public final class O00000OOOO0OOO {
   private static boolean O00000000;
   private static final Set<String> O000000000 = Set.of(
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

   private O00000OOOO0OOO() {
   }

   public static synchronized void O00000000(O00000OOO0OOO o00000OOO0OOO, ShaderSourceBuilder o00000OOO00OOO) {
      if (!O00000000 && o00000OOO0OOO != null && o00000OOO00OOO != null) {
         O00000000 = true;
         O00000OOOOO000 var2 = O00000OOOOO000.O00000000();
         var2.O00000000(o00000OOO0OOO);
         O00000OOOO0O00.O00000000().O00000000(o00000OOO00OOO);
         O00000OOOO000O.O00000000().O00000000(o00000OOO00OOO, o00000OOO0OOO);

         for (O00000OOO0O00.W304 var4 : O00000OOO0O00.O00000000) {
            try {
               O00000OOO0OO00 var5 = O00000OOO0O00.O00000000(var4, o00000OOO0OOO);
               if (var5 != null) {
                  var5.O00000000(var4.target().O00000000());
                  O00000OOO00OO0 var6 = o00000OOO00OOO.O00000000(var5);
                  if (!var6.ok()) {
                     System.out.println("[FoundryBootstrap] skipped failed preset " + var4.title() + ": " + var6.error());
                  } else {
                     O00000OOOO0O00.O00000000().O00000000(var4.title(), var5, var6, O00000OOOO0O00.W313.PRESET);
                  }
               }
            } catch (Throwable var12) {
               System.out.println("[FoundryBootstrap] failed to publish preset " + var4.title() + ": " + var12.getMessage());
            }
         }

         for (O00000OOOOO00 var15 : var2.O000000000()) {
            try {
               if (!O00000000(var15)) {
                  O00000OOO0OO00 var17 = var2.O00000000(var15.O00000000(), o00000OOO0OOO);
                  if (var17 != null) {
                     O00000OOO00OO0 var19 = o00000OOO00OOO.O00000000(var17);
                     if (!var19.ok()) {
                        System.out.println("[FoundryBootstrap] skipped failed slot " + var15.O000000000() + ": " + var19.error());
                     } else {
                        O00000OOOO0O00.O00000000().O00000000(var15.O000000000(), var17, var19, O000000000(var15));
                     }
                  }
               }
            } catch (Throwable var11) {
               System.out.println("[FoundryBootstrap] failed to publish " + var15.O000000000() + ": " + var11.getMessage());
            }
         }

         for (O00000OOOO00O var20 : O00000OOOO00O.values()) {
            O00000OOOOO00 var7 = var2.O0000000000(var20);
            if (var7 != null) {
               try {
                  O00000OOO0OO00 var8 = var2.O00000000(var7.O00000000(), o00000OOO0OOO);
                  if (var8 != null) {
                     var8.O00000000(var20.O00000000());
                     O00000OOO00OO0 var9 = o00000OOO00OOO.O00000000(var8);
                     if (!var9.ok()) {
                        System.out.println("[FoundryBootstrap] skipped failed bound target " + var20.O00000000() + ": " + var9.error());
                     } else {
                        O00000OOOO0O00.O00000000().O00000000(var20, var8, var9);
                     }
                  }
               } catch (Throwable var10) {
                  System.out.println("[FoundryBootstrap] failed to publish " + var20.O00000000() + ": " + var10.getMessage());
               }
            }
         }
      }
   }

   public static Set<String> O00000000() {
      return O000000000;
   }

   private static boolean O00000000(O00000OOOOO00 o00000OOOOO00) {
      if (o00000OOOOO00 == null) {
         return false;
      } else {
         String var1 = O00000OOOO0O00.O00000000000OO(o00000OOOOO00.O000000000());
         return O000000000.contains(var1);
      }
   }

   private static O00000OOOO0O00.W313 O000000000(O00000OOOOO00 o00000OOOOO00) {
      if (o00000OOOOO00 == null) {
         return O00000OOOO0O00.W313.USER;
      } else {
         String var1 = o00000OOOOO00.O00000000000O();
         if ("preset".equalsIgnoreCase(var1)) {
            return O00000OOOO0O00.W313.PRESET;
         } else {
            return !"imported".equalsIgnoreCase(var1) && !"shared".equalsIgnoreCase(var1) ? O00000OOOO0O00.W313.USER : O00000OOOO0O00.W313.IMPORTED;
         }
      }
   }
}

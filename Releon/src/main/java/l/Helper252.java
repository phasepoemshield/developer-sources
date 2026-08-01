package l;

public final class Helper252 {
   private static boolean wingsVisible = false;
   private static boolean swordVisible = false;
   private static boolean hatVisible = false;
   private static String currentWingsType = "";
   private static String currentSwordType = "";
   private static String currentHatType = "";

   private Helper252() {
   }

   public static void method2520(boolean var0, String var1) {
      wingsVisible = var0;
      currentWingsType = var1;
      if (var0) {
         method2523(var1);
      } else {
         method2526();
      }
   }

   public static void method2521(boolean var0, String var1) {
      swordVisible = var0;
      currentSwordType = var1;
      if (var0) {
         method2524(var1);
      } else {
         method2527();
      }
   }

   public static void method2522(boolean var0, String var1) {
      hatVisible = var0;
      currentHatType = var1;
      if (var0) {
         method2525(var1);
      } else {
         method2528();
      }
   }

   private static void method2523(String var0) {
      try {
         Class var1 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var2 = var1.getMethod("getAvatar").invoke(null);
         if (var2 == null) {
            Helper211.method1810("No Figura avatar loaded, cannot add wings");
            return;
         }

         String var3 = method2530(var0);
         try {
            method2529(var2, var3);
         } catch (Exception var9) {
            var9.printStackTrace();
         }
         Helper211.method1807("Wings applied to current avatar: " + var0);
      } catch (ClassNotFoundException var4) {
         Helper211.method1810("Figura is not loaded");
      } catch (ReflectiveOperationException var5) {
         Helper211.method1811("Failed to apply wings to avatar", var5);
      }
   }

   private static void method2524(String var0) {
      try {
         Class var1 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var2 = var1.getMethod("getAvatar").invoke(null);
         if (var2 == null) {
            Helper211.method1810("No Figura avatar loaded, cannot add sword");
            return;
         }

         String var3 = method2536(var0);
         try {
            method2529(var2, var3);
         } catch (Exception var9) {
            var9.printStackTrace();
         }
         Helper211.method1807("Sword applied to current avatar: " + var0);
      } catch (ClassNotFoundException var4) {
         Helper211.method1810("Figura is not loaded");
      } catch (ReflectiveOperationException var5) {
         Helper211.method1811("Failed to apply sword to avatar", var5);
      }
   }

   private static void method2525(String var0) {
      try {
         Class var1 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var2 = var1.getMethod("getAvatar").invoke(null);
         if (var2 == null) {
            Helper211.method1810("No Figura avatar loaded, cannot add hat");
            return;
         }

         String var3 = method2542(var0);
         try {
            method2529(var2, var3);
         } catch (Exception var9) {
            var9.printStackTrace();
         }
         Helper211.method1807("Hat applied to current avatar: " + var0);
      } catch (ClassNotFoundException var4) {
         Helper211.method1810("Figura is not loaded");
      } catch (ReflectiveOperationException var5) {
         Helper211.method1811("Failed to apply hat to avatar", var5);
      }
   }

   private static void method2526() {
      try {
         Class var0 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var1 = var0.getMethod("getAvatar").invoke(null);
         if (var1 != null) {
            String var2 = "if releon_wings then releon_wings:setVisible(false) end";
            method2529(var1, var2);
            Helper211.method1807("Wings removed from avatar");
         }
      } catch (Exception var3) {
         Helper211.method1811("Failed to remove wings", var3);
      }
   }

   private static void method2527() {
      try {
         Class var0 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var1 = var0.getMethod("getAvatar").invoke(null);
         if (var1 != null) {
            String var2 = "if releon_sword then releon_sword:setVisible(false) end";
            method2529(var1, var2);
            Helper211.method1807("Sword removed from avatar");
         }
      } catch (Exception var3) {
         Helper211.method1811("Failed to remove sword", var3);
      }
   }

   private static void method2528() {
      try {
         Class var0 = Class.forName("org.figuramc.figura.avatar.AvatarManager");
         Object var1 = var0.getMethod("getAvatar").invoke(null);
         if (var1 != null) {
            String var2 = "if releon_hat then releon_hat:setVisible(false) end";
            method2529(var1, var2);
            Helper211.method1807("Hat removed from avatar");
         }
      } catch (Exception var3) {
         Helper211.method1811("Failed to remove hat", var3);
      }
   }

   private static void method2529(Object var0, String var1) throws Exception {
      Object var2 = var0.getClass().getMethod("luaRuntime").invoke(var0);
      if (var2 == null) {
         Helper211.method1810("Avatar has no Lua runtime");
      } else {
         var2.getClass().getMethod("load", String.class, String.class).invoke(var2, "releon_cosmetics", var1);
      }
   }

   private static String method2530(String var0) {
      String var1 = switch (var0) {
         case "Strike" -> method2531();
         case "Simple" -> method2535();
         case "Aly" -> method2532();
         case "Harpy" -> method2534();
         case "Devilsknife" -> method2533();
         case "Феникс" -> method2531();
         case "Драконьи" -> method2532();
         case "Демонические" -> method2533();
         case "Бабочка" -> method2534();
         case "Механические" -> method2535();
         default -> method2531();
      };
      return "-- Создаем крылья для текущего аватара\nif not releon_wings then\n    releon_wings = models:newPart(\"releon_wings\", \"Body\")\nend\n\n"
         + var1
         + "\nreleon_wings:setVisible(true)\n\n-- Анимация крыльев\nlocal wing_time = 0\nfunction events.tick()\n    wing_time = wing_time + 0.1\n    if releon_wings_left and releon_wings_right then\n        local flap = math.sin(wing_time) * 15\n        releon_wings_left:setRot(0, 0, flap)\n        releon_wings_right:setRot(0, 0, -flap)\n    end\nend\n";
   }

   private static String method2531() {
      return "-- Феникс крылья (огненные)\nreleon_wings_left = releon_wings:newPart(\"left_wing\")\nreleon_wings_left:setPos(-4, 6, 2)\nreleon_wings_left:newBlock(\"wing_base\"):setPos(0, 0, 0):setSize(1, 8, 4):setColor(1, 0.5, 0)\nreleon_wings_left:newBlock(\"wing_tip\"):setPos(0, -8, 0):setSize(1, 6, 3):setColor(1, 0.3, 0)\n\nreleon_wings_right = releon_wings:newPart(\"right_wing\")\nreleon_wings_right:setPos(4, 6, 2)\nreleon_wings_right:newBlock(\"wing_base\"):setPos(0, 0, 0):setSize(1, 8, 4):setColor(1, 0.5, 0)\nreleon_wings_right:newBlock(\"wing_tip\"):setPos(0, -8, 0):setSize(1, 6, 3):setColor(1, 0.3, 0)\n";
   }

   private static String method2532() {
      return "-- Драконьи крылья\nreleon_wings_left = releon_wings:newPart(\"left_wing\")\nreleon_wings_left:setPos(-4, 6, 2)\nreleon_wings_left:newBlock(\"wing_base\"):setPos(0, 0, 0):setSize(1, 10, 5):setColor(0.2, 0.2, 0.2)\nreleon_wings_left:newBlock(\"wing_membrane\"):setPos(0, -5, 0):setSize(0.5, 8, 6):setColor(0.4, 0, 0)\n\nreleon_wings_right = releon_wings:newPart(\"right_wing\")\nreleon_wings_right:setPos(4, 6, 2)\nreleon_wings_right:newBlock(\"wing_base\"):setPos(0, 0, 0):setSize(1, 10, 5):setColor(0.2, 0.2, 0.2)\nreleon_wings_right:newBlock(\"wing_membrane\"):setPos(0, -5, 0):setSize(0.5, 8, 6):setColor(0.4, 0, 0)\n";
   }

   private static String method2533() {
      return "-- Демонические крылья\nreleon_wings_left = releon_wings:newPart(\"left_wing\")\nreleon_wings_left:setPos(-4, 6, 2)\nreleon_wings_left:newBlock(\"wing_base\"):setPos(0, 0, 0):setSize(1, 9, 4):setColor(0.1, 0, 0.1)\nreleon_wings_left:newBlock(\"wing_spike\"):setPos(0, -9, 0):setSize(0.5, 3, 1):setColor(0.5, 0, 0)\n\nreleon_wings_right = releon_wings:newPart(\"right_wing\")\nreleon_wings_right:setPos(4, 6, 2)\nreleon_wings_right:newBlock(\"wing_base\"):setPos(0, 0, 0):setSize(1, 9, 4):setColor(0.1, 0, 0.1)\nreleon_wings_right:newBlock(\"wing_spike\"):setPos(0, -9, 0):setSize(0.5, 3, 1):setColor(0.5, 0, 0)\n";
   }

   private static String method2534() {
      return "-- Крылья бабочки\nreleon_wings_left = releon_wings:newPart(\"left_wing\")\nreleon_wings_left:setPos(-4, 6, 2)\nreleon_wings_left:newBlock(\"wing_upper\"):setPos(0, 0, 0):setSize(0.5, 6, 5):setColor(1, 0.5, 0.8)\nreleon_wings_left:newBlock(\"wing_lower\"):setPos(0, -6, 0):setSize(0.5, 4, 4):setColor(0.8, 0.3, 0.6)\n\nreleon_wings_right = releon_wings:newPart(\"right_wing\")\nreleon_wings_right:setPos(4, 6, 2)\nreleon_wings_right:newBlock(\"wing_upper\"):setPos(0, 0, 0):setSize(0.5, 6, 5):setColor(1, 0.5, 0.8)\nreleon_wings_right:newBlock(\"wing_lower\"):setPos(0, -6, 0):setSize(0.5, 4, 4):setColor(0.8, 0.3, 0.6)\n";
   }

   private static String method2535() {
      return "-- Механические крылья\nreleon_wings_left = releon_wings:newPart(\"left_wing\")\nreleon_wings_left:setPos(-4, 6, 2)\nreleon_wings_left:newBlock(\"wing_frame\"):setPos(0, 0, 0):setSize(1, 8, 1):setColor(0.5, 0.5, 0.5)\nreleon_wings_left:newBlock(\"wing_panel\"):setPos(0, -4, 0):setSize(0.5, 7, 4):setColor(0.7, 0.7, 0.8)\n\nreleon_wings_right = releon_wings:newPart(\"right_wing\")\nreleon_wings_right:setPos(4, 6, 2)\nreleon_wings_right:newBlock(\"wing_frame\"):setPos(0, 0, 0):setSize(1, 8, 1):setColor(0.5, 0.5, 0.5)\nreleon_wings_right:newBlock(\"wing_panel\"):setPos(0, -4, 0):setSize(0.5, 7, 4):setColor(0.7, 0.7, 0.8)\n";
   }

   private static String method2536(String var0) {
      String var1 = switch (var0) {
         case "Катана" -> method2537();
         case "Огненный меч" -> method2538();
         case "Ледяной меч" -> method2539();
         case "Световой меч" -> method2540();
         case "Тёмный клинок" -> method2541();
         default -> method2537();
      };
      return "-- Создаем меч для текущего аватара\nif not releon_sword then\n    releon_sword = models:newPart(\"releon_sword\", \"RightArm\")\nend\n\n"
         + var1
         + "\nreleon_sword:setVisible(true)\n\n-- Анимация меча при атаке\nfunction events.entity_init()\n    if player then\n        local old_swing = player.isSwingingArm\n        player.isSwingingArm = function(...)\n            local result = old_swing(...)\n            if result and releon_sword then\n                -- Эффект свечения при ударе\n                releon_sword:setLight(15)\n            else\n                releon_sword:setLight(0)\n            end\n            return result\n        end\n    end\nend\n";
   }

   private static String method2537() {
      return "-- Катана\nreleon_sword:newBlock(\"handle\"):setPos(0, -8, 0):setSize(1, 6, 1):setColor(0.1, 0.1, 0.1)\nreleon_sword:newBlock(\"guard\"):setPos(0, -2, 0):setSize(3, 0.5, 1):setColor(0.8, 0.8, 0)\nreleon_sword:newBlock(\"blade\"):setPos(0, 4, 0):setSize(0.5, 12, 0.5):setColor(0.9, 0.9, 1)\n";
   }

   private static String method2538() {
      return "-- Огненный меч\nreleon_sword:newBlock(\"handle\"):setPos(0, -8, 0):setSize(1, 6, 1):setColor(0.3, 0.1, 0)\nreleon_sword:newBlock(\"guard\"):setPos(0, -2, 0):setSize(3, 0.5, 1):setColor(1, 0.5, 0)\nreleon_sword:newBlock(\"blade\"):setPos(0, 4, 0):setSize(0.8, 12, 0.8):setColor(1, 0.3, 0):setLight(10)\n";
   }

   private static String method2539() {
      return "-- Ледяной меч\nreleon_sword:newBlock(\"handle\"):setPos(0, -8, 0):setSize(1, 6, 1):setColor(0.5, 0.7, 0.9)\nreleon_sword:newBlock(\"guard\"):setPos(0, -2, 0):setSize(3, 0.5, 1):setColor(0.7, 0.9, 1)\nreleon_sword:newBlock(\"blade\"):setPos(0, 4, 0):setSize(0.6, 12, 0.6):setColor(0.8, 0.95, 1):setLight(8)\n";
   }

   private static String method2540() {
      return "-- Световой меч\nreleon_sword:newBlock(\"handle\"):setPos(0, -8, 0):setSize(1.5, 6, 1.5):setColor(0.2, 0.2, 0.2)\nreleon_sword:newBlock(\"blade\"):setPos(0, 4, 0):setSize(0.5, 14, 0.5):setColor(0, 1, 1):setLight(15)\n";
   }

   private static String method2541() {
      return "-- Тёмный клинок\nreleon_sword:newBlock(\"handle\"):setPos(0, -8, 0):setSize(1, 6, 1):setColor(0.1, 0, 0.1)\nreleon_sword:newBlock(\"guard\"):setPos(0, -2, 0):setSize(3, 0.5, 1):setColor(0.3, 0, 0.3)\nreleon_sword:newBlock(\"blade\"):setPos(0, 4, 0):setSize(0.7, 12, 0.7):setColor(0.2, 0, 0.2):setLight(5)\n";
   }

   private static String method2542(String var0) {
      byte var3 = -1;
      var0.hashCode();
      switch (var3) {
         default:
            String var1 = method2543();
            return "-- Создаем шляпу для текущего аватара\nif not releon_hat then\n    releon_hat = models:newPart(\"releon_hat\", \"Head\")\nend\n\n"
               + var1
               + "\nreleon_hat:setVisible(true)\n";
      }
   }

   private static String method2543() {
      return "-- Шляпа мага\nreleon_hat:newBlock(\"brim\"):setPos(0, 8, 0):setSize(10, 0.5, 10):setColor(0.2, 0, 0.5)\nreleon_hat:newBlock(\"cone_base\"):setPos(0, 9, 0):setSize(6, 4, 6):setColor(0.3, 0, 0.6)\nreleon_hat:newBlock(\"cone_mid\"):setPos(0, 13, 0):setSize(4, 4, 4):setColor(0.3, 0, 0.6)\nreleon_hat:newBlock(\"cone_top\"):setPos(0, 17, 0):setSize(2, 3, 2):setColor(0.3, 0, 0.6)\nreleon_hat:newBlock(\"star\"):setPos(0, 20, 0):setSize(1, 1, 1):setColor(1, 1, 0):setLight(10)\n";
   }

   public static boolean method2544() {
      return wingsVisible;
   }

   public static boolean method2545() {
      return swordVisible;
   }

   public static boolean method2546() {
      return hatVisible;
   }

   public static String method2547() {
      return currentWingsType;
   }

   public static String method2548() {
      return currentSwordType;
   }

   public static String method2549() {
      return currentHatType;
   }
}

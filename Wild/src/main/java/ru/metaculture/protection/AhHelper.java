package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.Slot;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AhHelper",
   O000000000 = "Помощник на аукционе",
   O0000000000 = Category.Misc
)
public class AhHelper extends Module {
   public static KeybindSetting O000000000O = new KeybindSetting("Поиск предмета в руке", -1);
   public static BooleanSetting O000000000O0 = new BooleanSetting("Показ самых дешевых предметов", true);
   public static BooleanSetting O000000000O00 = new BooleanSetting("Показывать по ценам", true);
   public static final List<Integer> O000000000O000 = new ArrayList<>();
   private static AhHelper O000000000O00O;
   private static String O000000000O0O = "";
   private static long O000000000O0O0;
   private static boolean O000000000O0OO;
   private static boolean O000000000OO;
   private static boolean O000000000OO0;
   private static long O000000000OO00;
   private final O0000O00O000 O000000000OO0O = new O0000O00O000();

   public AhHelper() {
      O000000000O00O = this;
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      O0000000000OOO();
      if (O0000000000.player != null && O000000000O0.O0000000000()) {
         if (O0000000000.currentScreen instanceof HandledScreen var2) {
            if (O00000000(var2)) {
               this.O0000000000(var2);
            } else {
               O000000000O000.clear();
            }
         } else {
            O000000000O000.clear();
         }
      } else {
         O000000000O000.clear();
      }
   }

   public static boolean O00000000(HandledScreen<?> handledScreen) {
      if (handledScreen == null) {
         return false;
      } else {
         String var1 = O0000000000(handledScreen.getTitle().getString());
         return O000000000(var1);
      }
   }

   public static boolean O000000000(HandledScreen<?> handledScreen) {
      if (handledScreen == null) {
         return false;
      } else {
         String var1 = O0000000000(handledScreen.getTitle().getString());
         return var1.contains("поиск:")
            || var1.contains("search:")
            || var1.contains("п:")
            || var1.contains("漢:")
            || var1.contains("\ud83d\udd0e")
            || var1.contains("\ud83d\udd0d");
      }
   }

   private static boolean O000000000(String string) {
      return string.contains("аукцион")
         || string.contains("auction")
         || string.contains("поиск:")
         || string.contains("search:")
         || string.contains("п:")
         || string.contains("漢:")
         || string.contains("\ud83d\udd0e:")
         || string.contains("\ud83d\udd0d:");
   }

   private static String O0000000000(String string) {
      return string == null
         ? ""
         : string.replaceAll("(?i)§.", "").replace(' ', ' ').replace('：', ':').replaceAll("\\s*:\\s*", ":").trim().toLowerCase(Locale.ROOT);
   }

   private void O0000000000(HandledScreen<?> handledScreen) {
      O000000000O000.clear();
      int[] var2 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
      int[] var3 = new int[]{-1, -1, -1, -1};

      for (Slot var5 : handledScreen.getScreenHandler().slots) {
         if (!O00000000(handledScreen, var5)) {
            int var6 = O000000OOOO0O.O000000000(var5);
            if (var6 > 0) {
               for (int var7 = 0; var7 < 4; var7++) {
                  if (var6 < var2[var7]) {
                     for (int var8 = 3; var8 > var7; var8--) {
                        var2[var8] = var2[var8 - 1];
                        var3[var8] = var3[var8 - 1];
                     }

                     var2[var7] = var6;
                     var3[var7] = var5.id;
                     break;
                  }
               }
            }
         }
      }

      for (int var9 = 0; var9 < 4; var9++) {
         if (var3[var9] != -1) {
            O000000000O000.add(var3[var9]);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (this.O000000000OO0O.O00000000000(300L) && o0000000O0O0.O00000000000() == O000000000O.O0000000000()) {
         this.O0000000000OO0();
         this.O000000000OO0O.O00000000();
      }
   }

   private void O0000000000OO0() {
      if (O0000000000.player != null) {
         ItemStack var1 = O0000000000.player.getMainHandStack();
         if (!var1.isEmpty()) {
            String var2 = this.O00000000000(var1.getName().getString());
            String var3 = this.O00000000(var2);
            if (!var3.equals(var2)) {
               O0000000000.player.networkHandler.sendChatCommand("ah search " + var3);
            } else {
               if (var2.isEmpty()) {
                  var2 = var1.getItem().getName().getString();
               }

               if (!var2.isEmpty()) {
                  O0000000000.player.networkHandler.sendChatCommand("ah search " + var2);
               }
            }
         }
      }
   }

   private String O00000000000(String string) {
      return string == null
         ? ""
         : string.replaceAll("(?i)§.", "")
            .replaceAll("(?i)&.", "")
            .replaceAll("\\[[^\\]]*]", " ")
            .replaceAll("[★✦✧✪✫✬✭✮✯✰❄☃⚒☠❤❣♕♛♜♞♟]", " ")
            .replace("xxx", " ")
            .replaceAll("\\s+", " ")
            .trim();
   }

   public String O00000000(String string) {
      if (string == null) {
         return "";
      } else if (string.contains("Рассадник монстров")) {
         return "Спавнер";
      } else if (string.contains("TIER WHITE")) {
         return "вайт";
      } else if (string.contains("TIER BLACK")) {
         return "блэк";
      } else {
         return string.contains("Прогрузчик чанков [1x1]") ? "Прогрузчик чанков" : string;
      }
   }

   public static void O00000000(String string, long l) {
      O000000000O0O = O000000000000(string);
      O000000000O0O0 = l;
      O000000000O0OO = !O000000000O0O.isEmpty() && l > 0L;
      O000000000OO = true;
      O000000000OO0 = false;
      O000000000OO00 = System.currentTimeMillis();
   }

   public static void O00000000(long l) {
      O000000000O0O = "";
      O000000000O0O0 = l;
      O000000000O0OO = l > 0L;
      O000000000OO = false;
      O000000000OO0 = false;
      O000000000OO00 = System.currentTimeMillis();
   }

   public static void O0000000000O0() {
      O000000000O0O = "";
      O000000000O0O0 = 0L;
      O000000000O0OO = false;
      O000000000OO = false;
      O000000000OO0 = false;
      O000000000OO00 = 0L;
      O000000000O000.clear();
   }

   public static boolean O0000000000O00() {
      return O000000000O0OO;
   }

   public static String O0000000000O0O() {
      return O000000000O0O;
   }

   public static long O0000000000OO() {
      return O000000000O0O0;
   }

   public static boolean O00000000(HandledScreen<?> handledScreen, Slot slot) {
      if (O000000000O00O == null || !O000000000O00O.O0000000000000 || !O000000000O00.O0000000000() || !O000000000O0OO) {
         return false;
      } else if (handledScreen != null && slot != null && slot.hasStack() && O00000000000(handledScreen)) {
         if (O0000000000.player != null && slot.inventory == O0000000000.player.getInventory()) {
            return false;
         } else {
            int var2 = O000000OOOO0O.O000000000(slot);
            return var2 <= 0 ? false : var2 > O000000000O0O0;
         }
      } else {
         return false;
      }
   }

   private static void O0000000000OOO() {
      if (O000000000O0OO) {
         if (O0000000000.currentScreen instanceof HandledScreen var0) {
            if (O00000000000(var0)) {
               O000000000OO0 = true;
            } else {
               if (O000000000OO0 || System.currentTimeMillis() - O000000000OO00 > 5000L) {
                  O0000000000O0();
               }
            }
         } else {
            if (O000000000OO0 || System.currentTimeMillis() - O000000000OO00 > 5000L) {
               O0000000000O0();
            }
         }
      }
   }

   private static boolean O00000000000(HandledScreen<?> handledScreen) {
      return O000000000OO ? O000000000(handledScreen) : O00000000(handledScreen);
   }

   private static String O000000000000(String string) {
      return string == null
         ? ""
         : string.replaceAll("(?i)§.", "")
            .replaceAll("(?i)&.", "")
            .replace(' ', ' ')
            .replace('_', ' ')
            .replace('-', ' ')
            .replaceAll("(?i)\\bminecraft:", "")
            .replaceAll("[^\\p{L}\\p{N}: ]", " ")
            .replaceAll("\\s+", " ")
            .trim()
            .toLowerCase(Locale.ROOT);
   }
}

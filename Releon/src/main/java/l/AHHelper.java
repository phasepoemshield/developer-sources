package l;

import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.util.InputUtil.Type;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.TooltipContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.MathHelper;

public class AHHelper extends Helper242 {
   private static final long PULSE_MS = 900L;
   private static final float PULSE_MIN = 0.35F;
   private static final float PULSE_MAX = 1.0F;
   private static final long RESCAN_DEBOUNCE_MS = 90L;
   private static final long RESCAN_INTERVAL_MS = 650L;
   private static final int CONTAINER_Y_LIMIT = 168;
   private static final long STORAGE_CLICK_DELAY_MS = 60100L;
   private static final Pattern NUMBER_PATTERN = Pattern.compile("(\\d{1,3}(?:[,.]\\d{3})+|\\d+[,.]\\d+|\\d+)");
   private static final Pattern SECTION_COLOR_PATTERN = Pattern.compile("\\u00A7[0-9A-FK-ORa-fk-or]");
   private static final Pattern AMP_COLOR_PATTERN = Pattern.compile("&[0-9A-FK-ORa-fk-or]");
   private static final Pattern BRACKET_CONTENT_PATTERN = Pattern.compile("\\([^)]*\\)|\\[[^\\]]*\\]|\\{[^}]*\\}");
   private static final Pattern AUCTION_QUERY_CLEANUP = Pattern.compile("[^\\p{L}\\p{N}\\s]+");
   private final Setting9 findFromHandBind = new Setting9("Поиск предмета", "Ищет предмет из руки на аукционе");
   private final Setting3 itemReListingSetting = new Setting3("Перевыставление предметов", "Автоматически забирает предмет из хранилища")
      .method2201(false);
   private final Setting7 cheapestColor = new Setting7("Цвет минимальной цены", "Подсветка лота с минимальной общей ценой").method2555(-18355);
   private final Setting7 economicColor = new Setting7("Цвет лучшей цены за штуку", "Подсветка лота с лучшей ценой за штуку").method2555(-46261);
   private Slot cheapestSlot;
   private Slot bestPerItemSlot;
   private String searchedItemName;
   private int screenSyncId = -1;
   private long lastScanAt;
   private boolean dirty;
   private long lastStorageClick = -1L;

   public AHHelper() {
      super("AHHelper", "AH Helper", Helper269.PLAYER);
      this.setup(new Helper264[]{this.findFromHandBind, this.itemReListingSetting, this.cheapestColor, this.economicColor});
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3896() == Helper385.RECEIVE
         && var1.method3895() instanceof ScreenHandlerSlotUpdateS2CPacket
         && mc.currentScreen instanceof GenericContainerScreen var2
         && this.method2579(var2)) {
         this.dirty = true;
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.currentScreen instanceof GenericContainerScreen var2 && this.method2579(var2)) {
         if (this.itemReListingSetting.method2200()) {
            this.method2568(var2);
         }

         long var6 = System.currentTimeMillis();
         int var5 = var2.getScreenHandler().syncId;
         if (var5 != this.screenSyncId) {
            this.screenSyncId = var5;
            this.dirty = true;
            this.cheapestSlot = null;
            this.bestPerItemSlot = null;
         }

         if (this.dirty && var6 - this.lastScanAt >= 90L || var6 - this.lastScanAt >= 650L) {
            this.method2569(var2);
         }
      } else {
         this.method2584();
      }
   }

   @Helper104
   public void method2566(Event17 var1) {
      if (this.method2583(this.findFromHandBind.getKey(), var1)) {
         this.method2581();
      }
   }

   @Helper104
   public void method2567(Event5 var1) {
      if (mc.currentScreen instanceof GenericContainerScreen var2 && this.method2579(var2)) {
         if (var1.method3656() != null) {
            int var7 = (var2.width - var1.method3658()) / 2;
            int var4 = (var2.height - var1.method3659()) / 2;
            int var5 = this.method2577(this.cheapestColor.method2553());
            int var6 = this.method2577(this.economicColor.method2553());
            if (this.cheapestSlot != null && this.cheapestSlot.hasStack()) {
               this.method2578(var1, var7, var4, this.cheapestSlot, var5);
            }

            if (this.bestPerItemSlot != null && this.bestPerItemSlot.hasStack()) {
               this.method2578(var1, var7, var4, this.bestPerItemSlot, var6);
            }
         }
      }
   }

   private void method2568(GenericContainerScreen var1) {
      if (mc.interactionManager != null && mc.player != null) {
         String var2 = var1.getTitle() == null ? "" : var1.getTitle().getString();
         String var3 = var2.toLowerCase(Locale.ROOT);
         if (var3.contains("хранилище") || var3.contains("storage")) {
            long var4 = System.currentTimeMillis();
            if (var4 - this.lastStorageClick >= 60100L) {
               DefaultedList var6 = var1.getScreenHandler().slots;
               if (var6.size() > 52) {
                  Slot var7 = (Slot)var6.get(52);
                  if (var7 != null && var7.hasStack()) {
                     mc.interactionManager.clickSlot(var1.getScreenHandler().syncId, 52, 0, SlotActionType.QUICK_MOVE, mc.player);
                     this.lastStorageClick = var4;
                  }
               }
            }
         }
      }
   }

   private void method2569(GenericContainerScreen var1) {
      if (mc.player == null) {
         this.method2584();
      } else {
         DefaultedList var2 = var1.getScreenHandler().slots;
         int[] var3 = new int[var2.size()];
         int[] var4 = new int[var2.size()];
         Slot var5 = null;
         int var6 = Integer.MAX_VALUE;

         for (int var7 = 0; var7 < var2.size(); var7++) {
            Slot var8 = (Slot)var2.get(var7);
            ItemStack var9 = var8.getStack();
            if (!var9.isEmpty() && var8.inventory != mc.player.getInventory() && var8.y < 168) {
               int var10 = this.method2570(var9);
               int var11 = Math.max(1, var9.getCount());
               var3[var7] = var10;
               var4[var7] = var11;
               if (var10 >= 0 && var10 < var6) {
                  var6 = var10;
                  var5 = var8;
               }
            } else {
               var3[var7] = -1;
               var4[var7] = 0;
            }
         }

         Slot var17 = null;
         double var18 = Double.POSITIVE_INFINITY;
         int var19 = Integer.MAX_VALUE;

         for (int var20 = 0; var20 < var2.size(); var20++) {
            int var12 = var3[var20];
            if (var12 >= 0) {
               Slot var13 = (Slot)var2.get(var20);
               if (var13 != var5) {
                  int var14 = Math.max(1, var4[var20]);
                  double var15 = (double)var12 / var14;
                  if (var15 < var18 - 1.0E-9 || Math.abs(var15 - var18) <= 1.0E-9 && var12 < var19) {
                     var18 = var15;
                     var19 = var12;
                     var17 = var13;
                  }
               }
            }
         }

         this.cheapestSlot = var5;
         this.bestPerItemSlot = var17;
         this.dirty = false;
         this.lastScanAt = System.currentTimeMillis();
      }
   }

   private int method2570(ItemStack var1) {
      try {
         int var2 = Math.max(1, var1.getCount());
         List<net.minecraft.text.Text> var3 = var1.getTooltip(TooltipContext.DEFAULT, mc.player, TooltipType.BASIC);
         StringBuilder var4 = new StringBuilder();
         if (var3 != null && !var3.isEmpty()) {
            for (Text var6 : var3) {
               if (var6 != null) {
                  var4.append(this.method2580(var6.getString())).append(' ');
               }
            }
         } else {
            var4.append(this.method2580(var1.getName().getString()));
         }

         return this.method2571(var4.toString(), var2);
      } catch (Throwable var7) {
         return -1;
      }
   }

   private int method2571(String var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         String var3 = var1.toLowerCase(Locale.ROOT);
         Matcher var4 = NUMBER_PATTERN.matcher(var1);
         int var5 = -1;
         long var6 = -1L;
         long var8 = -1L;

         while (var4.find()) {
            int var10 = var4.start(1);
            int var11 = var4.end(1);
            int var12 = this.method2574(var3, var11);
            long var13 = this.method2573(var3, var12);
            long var15 = this.method2575(var4.group(1), var13);
            if (var15 > 0L) {
               int var17 = Math.max(0, var10 - 52);
               int var18 = Math.min(var3.length(), var11 + 52);
               String var19 = var3.substring(var17, var18);
               boolean var20 = this.method2572(var19);
               boolean var21 = var19.contains(" per ")
                  || var19.contains(" each ")
                  || var19.contains("/шт")
                  || var19.contains("за 1")
                  || var19.contains("за шт");
               boolean var22 = var19.contains("total")
                  || var19.contains("price")
                  || var19.contains("цена")
                  || var19.contains("цену")
                  || var19.contains("стоим")
                  || var19.contains("итог")
                  || var19.contains("монет")
                  || var19.contains("$")
                  || var19.contains("₽");
               int var23 = var20 ? 3 : 1;
               if (var22) {
                  var23 += 3;
               }

               if (var21) {
                  var23++;
               }

               long var24 = var21 ? var15 * var2 : var15;
               if (var24 > 0L) {
                  if (var24 > var8) {
                     var8 = var24;
                  }

                  if (var23 > var5 || var23 == var5 && var24 > var6) {
                     var5 = var23;
                     var6 = var24;
                  }
               }
            }
         }

         long var26 = var6 > 0L ? var6 : var8;
         if (var26 <= 0L) {
            return -1;
         } else {
            return var26 > 2147483647L ? Integer.MAX_VALUE : (int)var26;
         }
      } else {
         return -1;
      }
   }

   private boolean method2572(String var1) {
      return var1.contains("price")
         || var1.contains("total")
         || var1.contains("buy")
         || var1.contains("sell")
         || var1.contains("coin")
         || var1.contains("coins")
         || var1.contains("auction")
         || var1.contains("ah")
         || var1.contains("цена")
         || var1.contains("стоим")
         || var1.contains("куп")
         || var1.contains("прод")
         || var1.contains("монет")
         || var1.contains("аукц")
         || var1.contains("лот")
         || var1.contains("руб")
         || var1.contains("$")
         || var1.contains("₽");
   }

   private long method2573(String var1, int var2) {
      if (var2 >= var1.length()) {
         return 1L;
      } else {
         char var3 = Character.toLowerCase(var1.charAt(var2));
         char var4 = var2 + 1 < var1.length() ? Character.toLowerCase(var1.charAt(var2 + 1)) : 0;
         if (var3 != 'k' && var3 != 1082) {
            return 1L;
         } else {
            return var4 != 'k' && var4 != 1082 ? 1000L : 1000000L;
         }
      }
   }

   private int method2574(String var1, int var2) {
      int var3;
      for (var3 = var2; var3 < var1.length(); var3++) {
         char var4 = var1.charAt(var3);
         if (!Character.isWhitespace(var4) && var4 != ':' && var4 != '=' && var4 != '-') {
            break;
         }
      }

      return var3;
   }

   private long method2575(String var1, long var2) {
      if (var1 != null && !var1.isBlank()) {
         String var4 = var1.trim().replace(" ", "").replace("_", "");
         boolean var5 = var4.matches("\\d{1,3}([,.]\\d{3})+");
         if (var5) {
            String var14 = var4.replace(",", "").replace(".", "");
            long var15 = this.method2576(var14);
            if (var15 <= 0L) {
               return -1L;
            } else if (var2 <= 1L) {
               return var15;
            } else {
               return var15 >= Long.MAX_VALUE / var2 ? Long.MAX_VALUE : var15 * var2;
            }
         } else {
            boolean var6 = var4.indexOf(46) >= 0;
            boolean var7 = var4.indexOf(44) >= 0;
            if (var6 || var7) {
               String var8 = var4.replace(',', '.');

               try {
                  double var9 = Double.parseDouble(var8);
                  if (!(var9 > 0.0)) {
                     return -1L;
                  }

                  double var11 = var9 * var2;
                  if (var11 >= 9.223372E18F) {
                     return Long.MAX_VALUE;
                  }

                  return Math.round(var11);
               } catch (NumberFormatException var13) {
               }
            }

            long var16 = this.method2576(var4);
            if (var16 <= 0L) {
               return -1L;
            } else if (var2 <= 1L) {
               return var16;
            } else {
               return var16 >= Long.MAX_VALUE / var2 ? Long.MAX_VALUE : var16 * var2;
            }
         }
      } else {
         return -1L;
      }
   }

   private long method2576(String var1) {
      long var2 = 0L;

      for (int var4 = 0; var4 < var1.length(); var4++) {
         char var5 = var1.charAt(var4);
         if (var5 >= '0' && var5 <= '9') {
            var2 = var2 * 10L + (var5 - '0');
         }
      }

      return var2;
   }

   private int method2577(int var1) {
      long var2 = System.currentTimeMillis();
      float var4 = (float)(var2 % 900L) / 900.0F;
      float var5 = 0.5F - 0.5F * MathHelper.cos(var4 * (float) (Math.PI * 2));
      float var6 = MathHelper.clamp(0.35F + 0.65F * var5, 0.0F, 1.0F);
      int var7 = MathHelper.clamp((int)(255.0F * var6 * 0.85F), 40, 220);
      return var7 << 24 | var1 & 16777215;
   }

   private void method2578(Event5 var1, int var2, int var3, Slot var4, int var5) {
      int var6 = var2 + var4.x;
      int var7 = var3 + var4.y;
      var1.method3656().fill(var6, var7, var6 + 16, var7 + 16, var5);
      int var8 = var5 >> 16 & 0xFF;
      int var9 = var5 >> 8 & 0xFF;
      int var10 = var5 & 0xFF;
      int var11 = -603979776 | var8 << 16 | var9 << 8 | var10;
      var1.method3656().fill(var6, var7, var6 + 16, var7 + 1, var11);
      var1.method3656().fill(var6, var7 + 15, var6 + 16, var7 + 16, var11);
      var1.method3656().fill(var6, var7, var6 + 1, var7 + 16, var11);
      var1.method3656().fill(var6 + 15, var7, var6 + 16, var7 + 16, var11);
   }

   private boolean method2579(GenericContainerScreen var1) {
      if (mc.player == null) {
         return false;
      } else {
         String var2 = var1.getTitle() == null ? "" : var1.getTitle().getString().toLowerCase(Locale.ROOT);
         if (!var2.contains("аук") && !var2.contains("поиск") && !var2.contains("auction") && !var2.contains("market")) {
            DefaultedList<net.minecraft.screen.slot.Slot> var3 = var1.getScreenHandler().slots;
            int var4 = 0;

            for (Slot var6 : var3) {
               if (var6.inventory != mc.player.getInventory() && var6.hasStack()) {
                  if (var4 >= 5) {
                     break;
                  }

                  var4++;

                  try {
                     List<net.minecraft.text.Text> var7 = var6.getStack().getTooltip(TooltipContext.DEFAULT, mc.player, TooltipType.BASIC);
                     boolean var8 = false;
                     boolean var9 = false;

                     for (Text var11 : var7) {
                        String var12 = var11.getString().toLowerCase(Locale.ROOT);
                        if (var12.contains("цена") || var12.contains("price") || var12.contains("$ ")) {
                           var8 = true;
                        }

                        if (var12.contains("продавец") || var12.contains("seller")) {
                           var9 = true;
                        }
                     }

                     if (var8 && var9) {
                        return true;
                     }
                  } catch (Throwable var13) {
                  }
               }
            }

            return false;
         } else {
            return true;
         }
      }
   }

   private String method2580(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         String var2 = Formatting.strip(var1);
         return var2 == null ? var1 : var2;
      } else {
         return "";
      }
   }

   private void method2581() {
      if (mc.player != null && mc.getNetworkHandler() != null) {
         ItemStack var1 = mc.player.getMainHandStack();
         if (var1 != null && !var1.isEmpty()) {
            String var2 = this.method2582(var1.getName().getString());
            if (var2.isBlank()) {
               var2 = this.method2580(var1.getName().getString());
            }

            if (var2 != null && !var2.isBlank()) {
               this.searchedItemName = var2;
               mc.getNetworkHandler().sendChatMessage("/ah search " + var2);
               mc.player.sendMessage(Text.literal("AH Helper: /ah search " + var2), true);
               this.dirty = true;
            } else {
               mc.player.sendMessage(Text.literal("AH Helper: имя предмета пустое"), true);
            }
         } else {
            mc.player.sendMessage(Text.literal("AH Helper: нет предмета в руке"), true);
         }
      }
   }

   private String method2582(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = this.method2580(var1);
         var2 = SECTION_COLOR_PATTERN.matcher(var2).replaceAll(" ");
         var2 = AMP_COLOR_PATTERN.matcher(var2).replaceAll(" ");
         var2 = BRACKET_CONTENT_PATTERN.matcher(var2).replaceAll(" ");
         var2 = AUCTION_QUERY_CLEANUP.matcher(var2).replaceAll(" ");
         var2 = var2.replace(' ', ' ');
         return var2.trim().replaceAll("\\s{2,}", " ");
      } else {
         return "";
      }
   }

   private boolean method2583(int var1, Event17 var2) {
      if (var1 < 0 || var2.method3910() != 1) {
         return false;
      } else {
         return var2.method3909() != var1 ? false : var2.method3908() == Type.KEYSYM || var2.method3908() == Type.MOUSE;
      }
   }

   private void method2584() {
      this.cheapestSlot = null;
      this.bestPerItemSlot = null;
      this.searchedItemName = null;
      this.screenSyncId = -1;
      this.lastScanAt = 0L;
      this.dirty = false;
   }
}

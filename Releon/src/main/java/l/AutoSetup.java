package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fat.releon.Releon;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class AutoSetup extends Helper242 {
   private static AutoSetup instance;
   private final Setting9 setupBind = new Setting9("Бинд AutoParser", "Запустить или перезапустить автопарсер цен").method2706(-1);
   private final Setting2 discountPercent = new Setting2("Скидка парсера", "Скидка от найденной минимальной цены (%)")
      .method2086(50.0F)
      .method2079(10, 90);
   private boolean isSettingUp = false;
   private int currentItemIndex = 0;
   private final Helper333 pageTimer = Helper333.method3308();
   private final Helper333 refreshTimer = Helper333.method3308();
   private final Helper333 retryTimer = Helper333.method3308();
   private GenericContainerScreen currentAuctionScreen = null;
   private String currentItemId = "";
   private int bestPricePerItem = Integer.MAX_VALUE;
   private boolean waitingForAuction = false;
   private boolean retrying = false;
   private int refreshCount = 0;
   private long lastParserTickMs = 0L;
   private boolean standaloneRegistered = false;
   private final List<Helper438> itemSearchList = new ArrayList<>();
   static final Path CONFIG_PATH = Paths.get("AutoSetupConfig.json");
   static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   static final Pattern PRICE_PATTERN = Pattern.compile("Цен[аaAАыЫ]?:?\\s*([\\d,\\s\\.]+)", 2);

   public AutoSetup() {
      super("AutoSetup", "Auto Setup", Helper269.MISC);
      this.setup(new Helper264[]{this.setupBind, this.discountPercent});
      this.method4562();
      instance = this;
   }

   public static AutoSetup method4556() {
      return instance;
   }

   public static AutoSetup method4557() {
      if (instance == null) {
         instance = new AutoSetup();
      }

      return instance;
   }

   public boolean method4558() {
      return this.isSettingUp;
   }

   public int method4559() {
      return this.discountPercent.method2080();
   }

   public void method4560(int var1) {
      this.discountPercent.method2086(Math.max(10, Math.min(90, var1)));
   }

   private void method4561(int var1, int var2, SlotActionType var3) {
      if (mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var1, var2, var3, mc.player);
      }
   }

   private void method4562() {
      this.itemSearchList.add(new Helper438("golden_apple", "гэпл"));
      this.itemSearchList.add(new Helper438("enchanted_golden_apple", "чарка"));
      this.itemSearchList.add(new Helper438("elytra", "элитры"));
      this.itemSearchList.add(new Helper438("netherite_ingot", "незеритовый слиток"));
      this.itemSearchList.add(new Helper438("spawner", "спавнер"));
      this.itemSearchList.add(new Helper438("diamond", "алмаз"));
      this.itemSearchList.add(new Helper438("beacon", "маяк"));
      this.itemSearchList.add(new Helper438("sniffer_egg", "яйцо нюхача"));
      this.itemSearchList.add(new Helper438("trial_key", "ключ испытаний"));
      this.itemSearchList.add(new Helper438("dragon_head", "голова дракона"));
      this.itemSearchList.add(new Helper438("villager_spawn_egg", "яйцо жителя"));
      this.itemSearchList.add(new Helper438("dynamite_black", "блэк"));
      this.itemSearchList.add(new Helper438("dynamite_white", "вайт"));
      this.itemSearchList.add(new Helper438("silver", "серебро"));
      this.itemSearchList.add(new Helper438("bochya_aura", "божья аура"));
      this.itemSearchList.add(new Helper438("bochye_kasanie", "божье касание"));
      this.itemSearchList.add(new Helper438("trapka", "трапка"));
      this.itemSearchList.add(new Helper438("sphere_beast", "сфера бестии"));
      this.itemSearchList.add(new Helper438("otmichka_cferam", "отмычка к сферам"));
      this.itemSearchList.add(new Helper438("sphere_satyr", "сфера сатира"));
      this.itemSearchList.add(new Helper438("sphere_chaos", "сфера хаоса"));
      this.itemSearchList.add(new Helper438("sphere_ares", "сфера ареса"));
      this.itemSearchList.add(new Helper438("sphere_hydra", "сфера гидры"));
      this.itemSearchList.add(new Helper438("sphere_titan", "сфера титана"));
      this.itemSearchList.add(new Helper438("talisman_demon", "талисман Демона"));
      this.itemSearchList.add(new Helper438("talisman_discord", "талисман Раздор"));
      this.itemSearchList.add(new Helper438("talisman_rage", "ярости"));
      this.itemSearchList.add(new Helper438("talisman_crusher", "талисман крушителя"));
      this.itemSearchList.add(new Helper438("talisman_tyrant", "тиран"));
      this.itemSearchList.add(new Helper438("potion_assassin", "зелье ассасина"));
      this.itemSearchList.add(new Helper438("potion_holy_water", "святая вода"));
      this.itemSearchList.add(new Helper438("potion_paladin", "зелье палладина"));
      this.itemSearchList.add(new Helper438("potion_sleeping", "снотворное"));
      this.itemSearchList.add(new Helper438("potion_clapper", "хлопушка"));
      this.itemSearchList.add(new Helper438("potion_wrath", "зелье гнева"));
      this.itemSearchList.add(new Helper438("potion_radiation", "зелье радиации"));
      this.itemSearchList
         .add(
            new Helper438("crusher_mace", "булава")
               .method4553("булава крушителя", "оригинальный предмет")
               .method4555("острота", 7)
               .method4555("небесная кара", 7)
               .method4555("бич членистоногих", 7)
               .method4555("плотность", 5)
               .method4555("пробитие", 3)
               .method4555("разящий клинок", 3)
               .method4555("заговор огня", 2)
               .method4555("добыча", 5)
               .method4555("прочность", 5)
               .method4555("починка", 1)
               .method4555("опытный", 3)
               .method4555("вампиризм", 2)
               .method4555("окисление", 2)
               .method4555("яд", 3)
               .method4555("детекция", 3)
         );
      this.itemSearchList
         .add(
            new Helper438("crusher_sword", "меч")
               .method4553("меч крушителя", "оригинальный предмет")
               .method4555("острота", 7)
               .method4555("небесная кара", 7)
               .method4555("бич членистоногих", 7)
               .method4555("разящий клинок", 3)
               .method4555("заговор огня", 2)
               .method4555("добыча", 5)
               .method4555("прочность", 5)
               .method4555("починка", 1)
               .method4555("опытный", 3)
               .method4555("вампиризм", 2)
               .method4555("окисление", 2)
               .method4555("яд", 3)
               .method4555("детекция", 3)
         );
      this.itemSearchList
         .add(
            new Helper438("crusher_pickaxe", "кирка крушителя")
               .method4553("оригинальный предмет")
               .method4555("удача", 5)
               .method4555("эффективность", 10)
               .method4555("прочность", 5)
               .method4555("починка", 1)
               .method4555("бульдозер", 2)
               .method4555("опытный", 3)
               .method4555("магнит", 1)
               .method4555("авто-плавка", 1)
               .method4555("паутина", 1)
               .method4555("пингер", 1)
         );
      this.itemSearchList
         .add(
            new Helper438("crusher_leggings", "поножи крушителя")
               .method4553("оригинальный предмет")
               .method4555("защита", 5)
               .method4555("взрывоустойчивость", 5)
               .method4555("огнеупорноость", 5)
               .method4555("защита от снарядов", 5)
               .method4555("прочность", 5)
               .method4555("починка", 1)
         );
      this.itemSearchList
         .add(
            new Helper438("crusher_chestplate", "нагрудник крушителя")
               .method4553("оригинальный предмет")
               .method4555("защита", 5)
               .method4555("взрывоустойчивость", 5)
               .method4555("огнеупорноость", 5)
               .method4555("защита от снарядов", 5)
               .method4555("прочность", 5)
               .method4555("починка", 1)
         );
      this.itemSearchList
         .add(
            new Helper438("crusher_helmet", "шлем крушителя")
               .method4553("оригинальный предмет")
               .method4555("защита", 5)
               .method4555("взрывоустойчивость", 5)
               .method4555("огнеупорноость", 5)
               .method4555("защита от снарядов", 5)
               .method4555("подводное дыхание", 3)
               .method4555("подводник", 1)
               .method4555("прочность", 5)
               .method4555("починка", 1)
         );
      this.itemSearchList
         .add(
            new Helper438("crusher_boots", "ботинки крушителя")
               .method4555("защита", 5)
               .method4555("взрывоустойчивость", 5)
               .method4555("огнеупорноость", 5)
               .method4555("защита от снарядов", 5)
               .method4555("невесомость", 4)
               .method4555("скорость души", 3)
               .method4555("подводная ходьба", 3)
               .method4555("прочность", 5)
               .method4555("починка", 1)
         );
   }

   @Override
   public void deactivate() {
      this.method4566();
      super.deactivate();
   }

   @Helper104
   public void method4563(Event17 var1) {
      if (var1.method3903(this.setupBind.getKey()) && !this.isSettingUp && mc.currentScreen == null) {
         this.method4565();
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      this.method4564();
   }

   public void method4564() {
      long var1 = System.currentTimeMillis();
      if (this.lastParserTickMs != var1) {
         this.lastParserTickMs = var1;
         if (this.isSettingUp) {
            AutoBuy var3 = AutoBuy.method3812();
            if (var3 != null && var3.isState()) {
               if (this.retrying && this.retryTimer.method3318(2000L)) {
                  this.retrying = false;
                  this.method4568();
               }

               if (mc.currentScreen instanceof GenericContainerScreen) {
                  this.currentAuctionScreen = (GenericContainerScreen)mc.currentScreen;
                  if (this.waitingForAuction) {
                     this.waitingForAuction = false;
                     this.retrying = false;
                     this.refreshCount = 0;
                     this.bestPricePerItem = Integer.MAX_VALUE;
                     this.pageTimer.method3310();
                     this.refreshTimer.method3310();
                     Notifications.method1666().method1668("§aМеню открыто, начинаю сканирование...", 1000L);
                  }

                  if (!this.waitingForAuction && !this.retrying && this.pageTimer.method3314() < 1000L) {
                     this.method4569();
                     if (this.refreshTimer.method3318(2000L)) {
                        this.method4570();
                        this.refreshTimer.method3310();
                        this.refreshCount++;
                        Notifications.method1666().method1668("§eОбновление страницы #" + this.refreshCount, 1000L);
                     }
                  } else if (!this.waitingForAuction && !this.retrying && this.pageTimer.method3314() >= 1000L) {
                     this.method4571();
                  }
               } else {
                  if (!this.waitingForAuction && !this.retrying && this.isSettingUp && this.currentItemIndex < this.itemSearchList.size()) {
                     Notifications.method1666().method1668("§cМеню не открыто, повтор через 2 сек...", 1000L);
                     this.retrying = true;
                     this.retryTimer.method3310();
                  }

                  this.currentAuctionScreen = null;
               }
            } else {
               this.method4566();
            }
         }
      }
   }

   public void method4565() {
      AutoBuy var1 = AutoBuy.method3812();
      if (var1 != null && var1.isState()) {
         this.method4573();
         this.isSettingUp = true;
         this.currentItemIndex = 0;
         this.retrying = false;
         Notifications.method1666().method1668("§aЗапущена автонастройка цен...", 2000L);
         this.method4567();
      } else {
         Notifications.method1666().method1668("§cСначала включи AutoBuy!", 3000L);
      }
   }

   public void method4566() {
      this.isSettingUp = false;
      this.waitingForAuction = false;
      this.retrying = false;
      this.currentAuctionScreen = null;
      this.method4574();
   }

   private void method4567() {
      if (this.currentItemIndex >= this.itemSearchList.size()) {
         this.method4572();
      } else {
         this.method4568();
      }
   }

   private void method4568() {
      Helper438 var1 = this.itemSearchList.get(this.currentItemIndex);
      this.currentItemId = var1.itemId;
      String var2 = var1.searchTerm;
      Notifications.method1666().method1668("§eПоиск: " + var2 + " (" + (this.currentItemIndex + 1) + "/" + this.itemSearchList.size() + ")", 2000L);
      if (mc.player != null) {
         mc.player.networkHandler.sendChatCommand("ah search " + var2);
      }

      this.waitingForAuction = true;
      this.bestPricePerItem = Integer.MAX_VALUE;
   }

   private void method4569() {
      if (this.currentAuctionScreen != null) {
         GenericContainerScreenHandler var1 = this.currentAuctionScreen.getScreenHandler();

         for (int var2 = 0; var2 < var1.slots.size(); var2++) {
            Slot var3 = var1.getSlot(var2);
            if (var3.inventory != mc.player.getInventory()) {
               ItemStack var4 = var3.getStack();
               if (!var4.isEmpty()) {
                  String var5 = var4.getName().getString().toLowerCase();
                  if (!var5.contains("обновить") && !var5.contains("refresh")) {
                     List var6 = this.method4583(var4);
                     Helper438 var7 = this.itemSearchList.get(this.currentItemIndex);
                     if (this.method4576(var4, var6, var7)) {
                        int var8 = this.method4582(var6);
                        if (var8 > 0) {
                           int var9 = var4.getCount();
                           int var10 = var8 / var9;
                           if (var10 < this.bestPricePerItem) {
                              this.bestPricePerItem = var10;
                              Notifications.method1666()
                                 .method1668(
                                    "§aНовая мин. цена: " + this.method4584(var10) + " за шт (всего " + this.method4584(var8) + " за " + var9 + "шт)", 2000L
                                 );
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private void method4570() {
      if (this.currentAuctionScreen != null) {
         GenericContainerScreenHandler var1 = this.currentAuctionScreen.getScreenHandler();

         for (Slot var3 : var1.slots) {
            ItemStack var4 = var3.getStack();
            String var5 = this.method4581(var4.getName().getString());
            if (var5.contains("обновить") || var5.contains("refresh")) {
               this.method4561(var3.id, 0, SlotActionType.PICKUP);
               break;
            }
         }
      }
   }

   private void method4571() {
      if (this.bestPricePerItem != Integer.MAX_VALUE && this.bestPricePerItem > 0) {
         AutoBuy var1 = AutoBuy.method3812();
         int var2 = var1 == null ? this.discountPercent.method2080() : var1.method3815();
         int var3 = (int)(this.bestPricePerItem * (1.0 - var2 / 100.0));
         if (var3 < 0) {
            var3 = 0;
         }

         this.method4575(this.currentItemId, var3);
         Notifications.method1666().method1668("§aУстановлена цена " + this.method4584(var3) + " за шт для " + this.currentItemId, 3000L);
      } else {
         Notifications.method1666().method1668("§cНе найдена цена для " + this.currentItemId, 2000L);
      }

      if (mc.currentScreen != null) {
         mc.currentScreen.close();
      }

      this.currentItemIndex++;
      new Thread(() -> {
         try {
            Thread.sleep(500L);
            mc.execute(() -> {
               if (this.currentItemIndex < this.itemSearchList.size()) {
                  this.method4567();
               } else {
                  this.method4572();
               }
            });
         } catch (Exception var2x) {
         }
      }).start();
   }

   private void method4572() {
      this.isSettingUp = false;
      this.waitingForAuction = false;
      this.retrying = false;
      if (mc.currentScreen != null) {
         mc.currentScreen.close();
      }

      Notifications.method1666().method1668("§aАвтонастройка завершена! Цены сохранены.", 3000L);
      this.method4574();
   }

   private void method4573() {
      if (!this.isState() && !this.standaloneRegistered && Releon.method71() != null && Releon.method71().method15() != null) {
         Releon.method71().method15().method1016(this);
         this.standaloneRegistered = true;
      }
   }

   private void method4574() {
      if (this.standaloneRegistered && Releon.method71() != null && Releon.method71().method15() != null) {
         Releon.method71().method15().method1018(this);
         this.standaloneRegistered = false;
      }
   }

   private void method4575(String var1, int var2) {
      AutoBuy var3 = AutoBuy.method3812();
      if (var3 != null) {
         var3.method3818(var1, var2);
      }
   }

   private boolean method4576(ItemStack var1, List<String> var2, Helper438 var3) {
      if (var3.requiredKeywords.isEmpty() && var3.requiredEnchantments.isEmpty() && var3.requiredLoreEnchantments.isEmpty()) {
         return true;
      } else {
         StringBuilder var4 = new StringBuilder(this.method4581(var1.getName().getString()));

         for (String var6 : var2) {
            var4.append(' ').append(this.method4581(var6));
         }

         for (String var13 : var3.requiredKeywords) {
            if (!var4.toString().contains(this.method4581(var13))) {
               return false;
            }
         }

         for (Entry var14 : var3.requiredLoreEnchantments.entrySet()) {
            if (!this.method4577(var1, var2, (String)var14.getKey(), (Integer)var14.getValue())) {
               return false;
            }
         }

         if (!var3.requiredEnchantments.isEmpty()) {
            ItemEnchantmentsComponent var12 = var1.get(DataComponentTypes.ENCHANTMENTS);
            if (var12 == null || var12.isEmpty()) {
               return false;
            }

            HashMap<String, Integer> var15 = new HashMap<>();

            for (RegistryEntry var8 : var12.getEnchantments()) {
               String var9 = var8.getIdAsString();
               if (var9 != null) {
                  var15.put(this.method4581(var9.replace("minecraft:", "")), var12.getLevel(var8));
               }
            }

            for (Entry var17 : var3.requiredEnchantments.entrySet()) {
               int var18 = var15.getOrDefault(this.method4581((String)var17.getKey()), 0);
               if (var18 < (Integer)var17.getValue()) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean method4577(ItemStack var1, List<String> var2, String var3, int var4) {
      String var5 = this.method4579(var3);
      if (var5 != null && this.method4578(var1, var5, var4)) {
         return true;
      } else {
         String var6 = this.method4581(var3);

         for (String var8 : var2) {
            String var9 = this.method4581(var8);
            if (var9.contains(var6)) {
               String[] var10 = var9.split("\\s+");

               for (String var14 : var10) {
                  int var15 = this.method4580(var14);
                  if (var15 >= var4) {
                     return true;
                  }
               }

               if (var4 <= 1) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private boolean method4578(ItemStack var1, String var2, int var3) {
      ItemEnchantmentsComponent var4 = var1.get(DataComponentTypes.ENCHANTMENTS);
      if (var4 != null && !var4.isEmpty()) {
         String var5 = this.method4581(var2);

         for (RegistryEntry var7 : var4.getEnchantments()) {
            String var8 = var7.getIdAsString();
            if (var8 != null) {
               String var9 = this.method4581(var8.replace("minecraft:", ""));
               if (var9.equals(var5) && var4.getLevel(var7) >= var3) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private String method4579(String var1) {
      String var2 = this.method4581(var1);

      return switch (var2) {
         case "защита" -> "protection";
         case "взрывоустойчивость" -> "blast_protection";
         case "огнеупорность", "огнеупорноость" -> "fire_protection";
         case "защита от снарядов" -> "projectile_protection";
         case "подводное дыхание" -> "respiration";
         case "подводник" -> "aqua_affinity";
         case "прочность" -> "unbreaking";
         case "починка" -> "mending";
         case "эффективность" -> "efficiency";
         case "удача" -> "fortune";
         case "невесомость" -> "feather_falling";
         case "скорость души" -> "soul_speed";
         case "подводная ходьба" -> "depth_strider";
         default -> {
            String var4 = this.method4581(var1);
            yield var4.matches("[a-z0-9_]+") ? var4 : null;
         }
      };
   }

   private int method4580(String var1) {
      String var2 = var1.replaceAll("\\D", "");
      if (!var2.isEmpty()) {
         try {
            return Integer.parseInt(var2);
         } catch (NumberFormatException var8) {
         }
      }

      String var3 = var1.toUpperCase(Locale.ROOT).replaceAll("[^IVXLCDM]", "");
      if (var3.isEmpty()) {
         return 0;
      } else {
         short var4 = 0;
         short var5 = 0;

         for (int var6 = var3.length() - 1; var6 >= 0; var6--) {
            short var7 = switch (var3.charAt(var6)) {
               case 'C' -> 100;
               case 'D' -> 500;
               default -> 0;
               case 'I' -> 1;
               case 'L' -> 50;
               case 'M' -> 1000;
               case 'V' -> 5;
               case 'X' -> 10;
            };
            if (var7 < var5) {
               var4 -= var7;
            } else {
               var4 += var7;
               var5 = var7;
            }
         }

         return var4;
      }
   }

   private String method4581(String var1) {
      return Formatting.strip(var1 == null ? "" : var1).toLowerCase(Locale.ROOT).replace('ё', 'е').trim();
   }

   private int method4582(List<String> var1) {
      for (String var3 : var1) {
         String var4 = Formatting.strip(var3);
         if (var4 != null) {
            Matcher var5 = PRICE_PATTERN.matcher(var4);
            if (var5.find()) {
               try {
                  String var6 = var5.group(1).replaceAll("[,\\s\\.]", "");
                  return Integer.parseInt(var6);
               } catch (Exception var7) {
               }
            }
         }
      }

      return 0;
   }

   private List<String> method4583(ItemStack var1) {
      LoreComponent var2 = var1.get(DataComponentTypes.LORE);
      return var2 != null ? var2.lines().stream().map(Text::getString).toList() : Collections.emptyList();
   }

   private String method4584(int var1) {
      if (var1 >= 1000000) {
         return String.format("%.1fM", var1 / 1000000.0F);
      } else {
         return var1 >= 1000 ? String.format("%.1fK", var1 / 1000.0F) : String.valueOf(var1);
      }
   }
}

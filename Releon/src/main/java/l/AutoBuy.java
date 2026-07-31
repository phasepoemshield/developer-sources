package l;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.component.type.LoreComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class AutoBuy extends Helper242 {
   private static AutoBuy instance;
   private static final Helper464 AUCTION_PURCHASE_HISTORY_WINDOW = new Helper464();
   private static int auctionHistoryBackgroundWidth = 176;
   private static int auctionHistoryBackgroundHeight = 166;
   private final Setting9 menuKey = new Setting9("Открыть меню", "Открыть меню").method2706(-1);
   private final Setting9 autoBuyBind = new Setting9("Бинд на включение ", "Включить AutoBuy").method2706(-1);
   private final Setting9 autoSetupBind = new Setting9("Автопарсер ", "Запустить AutoSetup").method2706(-1);
   private final Setting2 updateDelay = new Setting2("Задержка обновления", "Задержка обновления (мс)").method2086(500.0F).method2079(100, 2000);
   private final Setting2 anarchyChangeDelay = new Setting2("Менять анархию каждые", "Менять анархию каждые (мин)").method2086(5.0F).method2079(3, 10);
   private final Setting2 clickDelay = new Setting2("Задержка между кликами", "Задержка между кликами (мс)").method2086(200.0F).method2079(50, 500);
   private final Setting2 parserDiscountPercent = new Setting2("Процент скидки", "Скидка AutoParser (%)").method2086(50.0F).method2079(10, 90);
   private volatile boolean autoBuyEnabled = false;
   final Map<String, Helper381> targets = new LinkedHashMap<>();
   private volatile boolean isScanning = false;
   private volatile boolean isBuying = false;
   private volatile boolean waitingForPurchaseConfirm = false;
   private volatile boolean hasClickedThisTick = false;
   private volatile boolean autoBuyStartPending = false;
   private volatile boolean auctionOpenPending = false;
   private volatile int auctionOpenRequestId = 0;
   private volatile Thread auctionOpenThread = null;
   private volatile long suppressAuctionUntilMs = 0L;
   private int purchasesOnCurrentAnarchy = 0;
   private long lastPurchaseResultMs = 0L;
   private ItemStack pendingPurchaseStack = ItemStack.EMPTY;
   private String pendingPurchaseName = "";
   private int pendingPurchaseTotal = 0;
   private int pendingPurchaseCount = 0;
   private static final int PURCHASES_BEFORE_ANARCHY_CHANGE = 5;
   private static final long AUCTION_OPEN_AFTER_ANARCHY_MS = 9000L;
   private final Helper333 scanWatch = Helper333.method3308();
   private final Helper333 updateWatch = Helper333.method3308();
   private final Helper333 anarchyWatch = Helper333.method3308();
   private final Helper333 clickCooldown = Helper333.method3308();
   private GenericContainerScreen currentAuctionScreen = null;
   private final List<Integer> allAnarchies = new ArrayList<>();
   static final Path CONFIG_PATH = Paths.get("Releon", "AutoBuyConfig.json");
   static final Path LEGACY_CONFIG_PATH = Paths.get("AutoBuyConfig.json");
   static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
   static final Pattern PRICE_PATTERN = Pattern.compile("Цен[аaAАыЫ]?:?\\s*([\\d,\\s\\.]+)", 2);

   public AutoBuy() {
      super("AutoBuy", "Auto Buy", Helper269.MISC);
      this.setup(
         new Helper264[]{
            this.menuKey, this.autoBuyBind, this.autoSetupBind, this.updateDelay, this.anarchyChangeDelay, this.clickDelay, this.parserDiscountPercent
         }
      );
      this.method3819();
      this.method3820();
      this.method3863();
      instance = this;
   }

   public static AutoBuy method3812() {
      return instance;
   }

   @Override
   public boolean isEnabled() {
      return this.isState();
   }

   public Collection<Helper381> method3813() {
      return this.targets.values();
   }

   public void method3814() {
      if (!this.isState()) {
         Notifications.method1666().method1668("§cСначала включи AutoBuy", 2000L);
      } else if (mc.player != null) {
         AutoSetup var1 = AutoSetup.method4557();
         if (var1.method4558()) {
            Notifications.method1666().method1668("В§eAutoParser СѓР¶Рµ Р·Р°РїСѓС‰РµРЅ", 1200L);
         } else {
            this.method3826();
            mc.execute(var1::method4565);
         }
      }
   }

   public int method3815() {
      return this.parserDiscountPercent.method2080();
   }

   public void method3816(int var1) {
      this.parserDiscountPercent.method2086(Math.max(10, Math.min(90, var1)));
      Notifications.method1666().method1668("§aСкидка AutoParser: " + this.method3815() + "%", 1200L);
   }

   private void method3817(int var1, int var2, SlotActionType var3) {
      if (mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var1, var2, var3, mc.player);
      }
   }

   public void method3818(String var1, int var2) {
      Helper381 var3 = this.targets.get(var1);
      if (var3 != null) {
         var3.buyPrice = var2;
         this.method3862();
         Notifications.method1666().method1668("§aЦена для " + var3.displayName + " установлена: " + this.method3861(var2), 2000L);
      }
   }

   private void method3819() {
      for (int var1 = 103; var1 <= 112; var1++) {
         this.allAnarchies.add(var1);
      }

      for (int var2 = 208; var2 <= 231; var2++) {
         this.allAnarchies.add(var2);
      }

      for (int var3 = 305; var3 <= 319; var3++) {
         this.allAnarchies.add(var3);
      }

      for (int var4 = 504; var4 <= 512; var4++) {
         this.allAnarchies.add(var4);
      }

      for (int var5 = 901; var5 <= 904; var5++) {
         this.allAnarchies.add(var5);
      }
   }

   private void method3820() {
      this.method3821("golden_apple", "Золотое яблоко", Items.GOLDEN_APPLE, 0);
      this.method3821("enchanted_golden_apple", "Зач. яблоко", Items.ENCHANTED_GOLDEN_APPLE, 0);
      this.method3821("elytra", "Элитры", Items.ELYTRA, 0);
      this.method3821("netherite_ingot", "Незерит слиток", Items.NETHERITE_INGOT, 0);
      this.method3821("spawner", "Спавнер", Items.SPAWNER, 0);
      this.method3821("diamond", "Алмаз", Items.DIAMOND, 0);
      this.method3821("beacon", "Маяк", Items.BEACON, 0);
      this.method3821("sniffer_egg", "Яйцо нюхача", Items.SNIFFER_EGG, 0);
      this.method3821("trial_key", "Ключ испытаний", Items.TRIAL_KEY, 0);
      this.method3821("dragon_head", "Голова дракона", Items.DRAGON_HEAD, 0);
      this.method3821("villager_spawn_egg", "Яйцо крестьянина", Items.VILLAGER_SPAWN_EGG, 0);
      this.method3823(
         "dynamite_black", "Динамит BLACK", Items.TNT, List.of("Этот динамит взрывается", "в 10 раз сильнее обычного", "и способен взорвать обсидиан"), 0
      );
      this.method3822("crusher_mace", "Булава Крушителя", Items.MACE, 0)
         .method3795("оригинальный предмет")
         .method3796("острота", 7)
         .method3796("небесная кара", 7)
         .method3796("бич членистоногих", 7)
         .method3796("плотность", 5)
         .method3796("пробитие", 3)
         .method3796("разящий клинок", 3)
         .method3796("заговор огня", 2)
         .method3796("добыча", 5)
         .method3796("прочность", 5)
         .method3796("починка", 1)
         .method3796("опытный", 3)
         .method3796("вампиризм", 2)
         .method3796("окисление", 2)
         .method3796("яд", 3)
         .method3796("детекция", 3);
      this.method3822("crusher_sword", "Меч Крушителя", Items.NETHERITE_SWORD, 0)
         .method3795("оригинальный предмет")
         .method3796("острота", 7)
         .method3796("небесная кара", 7)
         .method3796("бич членистоногих", 7)
         .method3796("разящий клинок", 3)
         .method3796("заговор огня", 2)
         .method3796("добыча", 5)
         .method3796("прочность", 5)
         .method3796("починка", 1)
         .method3796("опытный", 3)
         .method3796("вампиризм", 2)
         .method3796("окисление", 2)
         .method3796("яд", 3)
         .method3796("детекция", 3);
      this.method3823("dynamite_white", "Динамит WHITE", Items.TNT, List.of("Этот динамит взрывается", "в 10 раз сильнее обычного"), 0);
      this.method3823("silver", "Серебро", Items.IRON_NUGGET, List.of("Это валюта для покупки", "отмычек к тайникам", "у Знахаря (/warp stash)"), 0);
      this.method3823("trapka", "Трапка", Items.NETHERITE_SCRAP, List.of("Нерушимая клетка"), 0);
      this.method3823("sphere_beast", "Сфера Бестии", Items.PLAYER_HEAD, List.of("вериная дикая мощь", "Обостряет реакции", "Укрепляя ваше тело."), 0);
      this.method3823("sphere_satyr", "Сфера Сатира", Items.PLAYER_HEAD, List.of("Шёпот Сатира звучит", "Ускоряя расправу", "Но сковывая прыжок."), 0);
      this.method3823("sphere_chaos", "Сфера Хаоса", Items.PLAYER_HEAD, List.of("Хаос искажает реальность"), 0);
      this.method3823("sphere_ares", "Сфера Ареса", Items.PLAYER_HEAD, List.of("Дух Ареса пылает внутри"), 0);
      this.method3823("sphere_hydra", "Сфера Гидры", Items.PLAYER_HEAD, List.of("Живучесть темных глубин"), 0);
      this.method3823("sphere_titan", "Сфера Титана", Items.PLAYER_HEAD, List.of("Мощь Титанов крепка"), 0);
      this.method3823(
         "talisman_demon", "Талисман Демона", Items.TOTEM_OF_UNDYING, List.of("Печать разжигает ярость", "Ускоряя удары сердца", "И силу каждой атаки."), 0
      );
      this.method3823(
         "talisman_discord", "Талисман Раздора", Items.TOTEM_OF_UNDYING, List.of("Раздор жаждет хаоса", "Даруя безумный темп", "Но разрушая броню."), 0
      );
      this.method3823("talisman_rage", "Талисман Ярости", Items.TOTEM_OF_UNDYING, List.of("Чистая, дикая агрессия"), 0);
      this.method3823("talisman_crusher", "Талисман Крушителя", Items.TOTEM_OF_UNDYING, List.of("Легендарный символ"), 0);
      this.method3823("talisman_tyrant", "Талисман Тирана", Items.TOTEM_OF_UNDYING, List.of("Тиран подавляет слабых"), 0);
      this.method3822("potion_assassin", "[★] Зелье Ассасина", Items.SPLASH_POTION, 0);
      this.method3822("potion_holy_water", "[★] Святая вода", Items.SPLASH_POTION, 0);
      this.method3822("potion_paladin", "[★] Зелье Палладина", Items.SPLASH_POTION, 0);
      this.method3822("potion_sleeping", "[★] Снотворное", Items.SPLASH_POTION, 0);
      this.method3822("potion_clapper", "[★] Хлопушка", Items.SPLASH_POTION, 0);
      this.method3822("potion_wrath", "[★] Зелье Гнева", Items.SPLASH_POTION, 0);
      this.method3822("potion_radiation", "[★] Зелье Радиации", Items.SPLASH_POTION, 0);
      this.method3822("otmichka_cferam", "[★] Отмычка к сферам", Items.TRIPWIRE_HOOK, 0);
      this.method3822("bochya_aura", "[★] Божья Аура", Items.PHANTOM_MEMBRANE, 0);
      this.method3822("bochye_kasanie", "[★] Божье Касание", Items.GOLDEN_PICKAXE, 0);
      this.method3822("crusher_pickaxe", "Кирка Крушителя", Items.NETHERITE_PICKAXE, 0)
         .method3795("оригинальный предмет")
         .method3796("удача", 5)
         .method3796("эффективность", 10)
         .method3796("прочность", 5)
         .method3796("починка", 1)
         .method3796("бульдозер", 2)
         .method3796("опытный", 3)
         .method3796("магнит", 1)
         .method3796("авто-плавка", 1)
         .method3796("паутина", 1)
         .method3796("пингер", 1);
      this.method3822("crusher_leggings", "Поножи Крушителя", Items.NETHERITE_LEGGINGS, 0)
         .method3795("оригинальный предмет")
         .method3796("защита", 5)
         .method3796("взрывоустойчивость", 5)
         .method3796("огнеупорность", 5)
         .method3796("защита от снарядов", 5)
         .method3796("прочность", 5)
         .method3796("починка", 1);
      this.method3822("crusher_chestplate", "Нагрудник Крушителя", Items.NETHERITE_CHESTPLATE, 0)
         .method3795("оригинальный предмет")
         .method3796("защита", 5)
         .method3796("взрывоустойчивость", 5)
         .method3796("огнеупорность", 5)
         .method3796("защита от снарядов", 5)
         .method3796("прочность", 5)
         .method3796("починка", 1);
      this.method3822("crusher_helmet", "Шлем Крушителя", Items.NETHERITE_HELMET, 0)
         .method3795("оригинальный предмет")
         .method3796("защита", 5)
         .method3796("взрывоустойчивость", 5)
         .method3796("огнеупорность", 5)
         .method3796("защита от снарядов", 5)
         .method3796("подводное дыхание", 3)
         .method3796("подводник", 1)
         .method3796("прочность", 5)
         .method3796("починка", 1);
      this.method3822("crusher_boots", "Ботинки Крушителя", Items.NETHERITE_BOOTS, 0)
         .method3795("оригинальный предмет")
         .method3796("защита", 5)
         .method3796("взрывоустойчивость", 5)
         .method3796("огнеупорность", 5)
         .method3796("защита от снарядов", 5)
         .method3796("невесомость", 4)
         .method3796("скорость души", 3)
         .method3796("подводная ходьба", 3)
         .method3796("прочность", 5)
         .method3796("починка", 1);
   }

   private Helper381 method3821(String var1, String var2, Item var3, int var4) {
      Helper381 var5 = new Helper381(var1, var2, new ItemStack(var3), null, var4, false, true);
      this.targets.put(var1, var5);
      return var5;
   }

   private Helper381 method3822(String var1, String var2, Item var3, int var4) {
      Helper381 var5 = new Helper381(var1, var2, new ItemStack(var3), null, var4, true, false);
      this.targets.put(var1, var5);
      return var5;
   }

   private Helper381 method3823(String var1, String var2, Item var3, List<String> var4, int var5) {
      Helper381 var6 = new Helper381(var1, var2, new ItemStack(var3), var4, var5, false, false);
      this.targets.put(var1, var6);
      return var6;
   }

   @Override
   public void activate() {
      super.activate();
      this.anarchyWatch.method3310();
      this.clickCooldown.method3310();
      this.method3825();
   }

   @Override
   public void deactivate() {
      this.method3862();
      this.method3827(false);
      AutoSetup var1 = AutoSetup.method4556();
      if (var1 != null) {
         var1.method4566();
      }

      super.deactivate();
   }

   @Helper104
   public void method3824(Event17 var1) {
      if (var1.method3903(this.menuKey.getKey())) {
         this.method3860();
      }

      if (this.isState()) {
         if (var1.method3903(this.autoSetupBind.getKey())) {
            this.method3814();
         }

         if (var1.method3903(this.autoBuyBind.getKey()) && !this.autoBuyStartPending) {
            if (this.autoBuyEnabled) {
               this.method3827(true);
               Notifications.method1666().method1668("§cAutoBuy выключен", 2000L);
               return;
            }

            this.method3825();
         }
      }
   }

   private void method3825() {
      if (this.isState()) {
         if (mc.player != null && !this.autoBuyEnabled && !this.autoBuyStartPending) {
            this.autoBuyEnabled = true;
            this.waitingForPurchaseConfirm = false;
            this.isBuying = false;
            this.isScanning = false;
            this.hasClickedThisTick = false;
            this.autoBuyStartPending = true;
            this.anarchyWatch.method3310();
            this.clickCooldown.method3310();
            Notifications.method1666().method1668("§aAutoBuy включен", 2000L);
            this.method3831(250L);
            this.autoBuyStartPending = false;
         }
      }
   }

   private void method3826() {
      this.auctionOpenRequestId++;
      Thread var1 = this.auctionOpenThread;
      if (var1 != null) {
         var1.interrupt();
         this.auctionOpenThread = null;
      }

      this.auctionOpenPending = false;
      this.waitingForPurchaseConfirm = false;
      this.isBuying = false;
      this.isScanning = false;
      this.hasClickedThisTick = false;
      this.currentAuctionScreen = null;
      if (mc.currentScreen != null) {
         mc.currentScreen.close();
      }
   }

   private void method3827(boolean var1) {
      this.auctionOpenRequestId++;
      Thread var2 = this.auctionOpenThread;
      if (var2 != null) {
         var2.interrupt();
         this.auctionOpenThread = null;
      }

      this.autoBuyEnabled = false;
      this.isScanning = false;
      this.isBuying = false;
      this.waitingForPurchaseConfirm = false;
      this.hasClickedThisTick = false;
      this.autoBuyStartPending = false;
      this.auctionOpenPending = false;
      this.method3854();
      this.currentAuctionScreen = null;
      this.suppressAuctionUntilMs = System.currentTimeMillis() + 5000L;
      this.method3841();
      this.method3842(this.auctionOpenRequestId, this.suppressAuctionUntilMs);
      if (!var1) {
         this.purchasesOnCurrentAnarchy = 0;
      }
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString();
         if (this.method3828(var4)) {
            this.method3829(var4);
         }

         if ((var4.contains("не хватает") || var4.contains("Monet") || var4.contains("монет")) && this.waitingForPurchaseConfirm) {
            this.waitingForPurchaseConfirm = false;
            this.isBuying = false;
            this.hasClickedThisTick = false;
            this.method3854();
            Notifications.method1666().method1668("§cНе хватает денег!", 2000L);
            this.method3831(2000L);
         }
      }
   }

   private boolean method3828(String var1) {
      return var1.contains("Вы успешно купили") || var1.contains("куплен") || var1.contains("Этот товар уже купили");
   }

   private void method3829(String var1) {
      if (this.autoBuyEnabled) {
         long var2 = System.currentTimeMillis();
         if (var2 - this.lastPurchaseResultMs >= 500L) {
            this.lastPurchaseResultMs = var2;
            this.waitingForPurchaseConfirm = false;
            this.isBuying = false;
            this.hasClickedThisTick = false;
            if (!this.method3855(var1) && !this.pendingPurchaseName.isEmpty()) {
               Helper464.method4960(this.pendingPurchaseStack, this.pendingPurchaseName, this.pendingPurchaseTotal, this.pendingPurchaseCount);
            }

            this.method3854();
            this.purchasesOnCurrentAnarchy++;
            Notifications.method1666().method1668("§aПопытка покупки §7(" + this.purchasesOnCurrentAnarchy + "/5)", 1000L);
            if (this.purchasesOnCurrentAnarchy >= 5) {
               this.purchasesOnCurrentAnarchy = 0;
               this.method3830();
            } else {
               this.method3831(1500L);
            }
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (!this.autoBuyEnabled) {
         if (System.currentTimeMillis() < this.suppressAuctionUntilMs) {
            this.method3841();
         }
      } else {
         AutoSetup var2 = AutoSetup.method4556();
         if (var2 != null && var2.method4558()) {
            this.isScanning = false;
            this.currentAuctionScreen = null;
         } else {
            if (this.autoBuyEnabled
               && !this.isBuying
               && !this.waitingForPurchaseConfirm
               && this.anarchyWatch.method3318((long)this.anarchyChangeDelay.method2082() * 60L * 1000L)) {
               this.method3830();
               this.anarchyWatch.method3310();
            }

            if (!this.waitingForPurchaseConfirm && !this.isBuying) {
               if (mc.currentScreen instanceof GenericContainerScreen var3) {
                  String var5 = var3.getTitle().getString().toLowerCase();
                  if (!method3833(mc, var3)) {
                     this.isScanning = false;
                     this.currentAuctionScreen = null;
                     return;
                  }

                  this.currentAuctionScreen = var3;
                  this.isScanning = true;
               } else {
                  this.isScanning = false;
                  this.currentAuctionScreen = null;
               }

               if (this.isScanning && this.currentAuctionScreen != null) {
                  if (this.scanWatch.method3318(50L)) {
                     this.method3843();
                     this.scanWatch.method3310();
                  }

                  if (this.updateWatch.method3318((long)this.updateDelay.method2082())) {
                     this.method3858();
                     this.updateWatch.method3310();
                  }
               }
            }
         }
      }
   }

   private void method3830() {
      if (mc.player != null && !this.allAnarchies.isEmpty()) {
         Random var1 = new Random();
         int var2 = this.allAnarchies.get(var1.nextInt(this.allAnarchies.size()));
         mc.player.networkHandler.sendChatCommand("an" + var2);
         Notifications.method1666().method1668("§eСмена анархии на /an" + var2, 2000L);
         this.method3831(9000L);
      }
   }

   private void method3831(long var1) {
      if (this.autoBuyEnabled) {
         int var3 = ++this.auctionOpenRequestId;
         this.auctionOpenPending = true;
         Thread var4 = this.auctionOpenThread;
         if (var4 != null) {
            var4.interrupt();
         }

         Thread var5 = new Thread(() -> {
            try {
               Thread.sleep(var1);
               if (var3 != this.auctionOpenRequestId || !this.autoBuyEnabled) {
                  return;
               }

               for (int var4x = 0; var4x < 5; var4x++) {
                  boolean var5x = var4x == 4;
                  mc.execute(() -> {
                     if (var3 == this.auctionOpenRequestId) {
                        if (mc.player != null && this.autoBuyEnabled) {
                           AutoSetup var3xx = AutoSetup.method4556();
                           if (var3xx != null && var3xx.method4558()) {
                              this.auctionOpenPending = false;
                           } else if (this.method3832()) {
                              this.auctionOpenPending = false;
                           } else if (var3 == this.auctionOpenRequestId && this.autoBuyEnabled) {
                              mc.player.networkHandler.sendChatCommand("ah");
                              if (var5x) {
                                 this.auctionOpenPending = false;
                              }
                           } else {
                              this.auctionOpenPending = false;
                           }
                        } else {
                           this.auctionOpenPending = false;
                        }
                     }
                  });
                  if (var5x) {
                     return;
                  }

                  if (var3 != this.auctionOpenRequestId) {
                     return;
                  }

                  Thread.sleep(2000L);
               }
            } catch (InterruptedException var6) {
               if (var3 == this.auctionOpenRequestId) {
                  this.auctionOpenPending = false;
               }
            } catch (Exception var7) {
               mc.execute(() -> {
                  if (var3 == this.auctionOpenRequestId) {
                     this.auctionOpenPending = false;
                  }
               });
            }
         }, "AutoBuy-AuctionOpen");
         this.auctionOpenThread = var5;
         var5.start();
      }
   }

   private boolean method3832() {
      return mc.currentScreen instanceof GenericContainerScreen var1 ? method3833(mc, var1) : false;
   }

   private static boolean method3833(MinecraftClient var0, GenericContainerScreen var1) {
      String var2 = Formatting.strip(var1.getTitle().getString());
      String var3 = var2 == null ? "" : var2.toLowerCase(Locale.ROOT);
      if (!var3.contains("аукцион")
         && !var3.contains("аук")
         && !var3.contains("поиск")
         && !var3.contains("рынок")
         && !var3.contains("лот")
         && !var3.contains("auction")
         && !var3.contains("market")
         && !var3.contains("/ah")) {
         int var4 = 0;

         for (Slot var6 : var1.getScreenHandler().slots) {
            if (var0.player == null || var6.inventory != var0.player.getInventory()) {
               ItemStack var7 = var6.getStack();
               if (!var7.isEmpty() && Helper303.method2998(var7) > 0) {
                  if (++var4 >= 2) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static void method3834(DrawContext var0, int var1, int var2) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3.currentScreen instanceof GenericContainerScreen var4 && method3833(var3, var4)) {
         auctionHistoryBackgroundWidth = var1;
         auctionHistoryBackgroundHeight = var2;
         AUCTION_PURCHASE_HISTORY_WINDOW.method4961(
            var0, method3839(var3), method3840(var3), 0.0F, var3.getWindow().getScaledWidth(), var3.getWindow().getScaledHeight(), var1, var2
         );
      }
   }

   public static boolean method3835(double var0) {
      MinecraftClient var2 = MinecraftClient.getInstance();
      return var2.currentScreen instanceof GenericContainerScreen var3 && method3833(var2, var3)
         ? AUCTION_PURCHASE_HISTORY_WINDOW.method4962(
            method3839(var2),
            method3840(var2),
            var0,
            var2.getWindow().getScaledWidth(),
            var2.getWindow().getScaledHeight(),
            auctionHistoryBackgroundWidth,
            auctionHistoryBackgroundHeight
         )
         : false;
   }

   public static boolean method3836(double var0, double var2, int var4) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      return var5.currentScreen instanceof GenericContainerScreen var6 && method3833(var5, var6)
         ? AUCTION_PURCHASE_HISTORY_WINDOW.method4963(
            var0,
            var2,
            var4,
            var5.getWindow().getScaledWidth(),
            var5.getWindow().getScaledHeight(),
            auctionHistoryBackgroundWidth,
            auctionHistoryBackgroundHeight
         )
         : false;
   }

   public static boolean method3837(double var0, double var2, int var4) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      return var5.currentScreen instanceof GenericContainerScreen var6 && method3833(var5, var6)
         ? AUCTION_PURCHASE_HISTORY_WINDOW.method4964(
            var0,
            var2,
            var4,
            var5.getWindow().getScaledWidth(),
            var5.getWindow().getScaledHeight(),
            auctionHistoryBackgroundWidth,
            auctionHistoryBackgroundHeight
         )
         : false;
   }

   public static boolean method3838(double var0, double var2, int var4) {
      return AUCTION_PURCHASE_HISTORY_WINDOW.method4965(var0, var2, var4);
   }

   private static int method3839(MinecraftClient var0) {
      return (int)(var0.mouse.getX() * var0.getWindow().getScaledWidth() / var0.getWindow().getWidth());
   }

   private static int method3840(MinecraftClient var0) {
      return (int)(var0.mouse.getY() * var0.getWindow().getScaledHeight() / var0.getWindow().getHeight());
   }

   private void method3841() {
      if (this.method3832() && mc.currentScreen != null) {
         mc.currentScreen.close();
      }
   }

   private void method3842(int var1, long var2) {
      new Thread(() -> {
         try {
            while (System.currentTimeMillis() < var2 && var1 == this.auctionOpenRequestId && !this.autoBuyEnabled) {
               Thread.sleep(100L);
               mc.execute(() -> {
                  if (!this.autoBuyEnabled && var1 == this.auctionOpenRequestId && System.currentTimeMillis() < this.suppressAuctionUntilMs) {
                     this.method3841();
                  }
               });
            }
         } catch (InterruptedException var5) {
         }
      }, "AutoBuy-AuctionCloseGuard").start();
   }

   private void method3843() {
      if (this.currentAuctionScreen != null && !this.isBuying && !this.waitingForPurchaseConfirm) {
         GenericContainerScreenHandler var1 = this.currentAuctionScreen.getScreenHandler();

         for (int var2 = 0; var2 < var1.slots.size(); var2++) {
            Slot var3 = var1.getSlot(var2);
            if (var3.inventory != mc.player.getInventory()) {
               ItemStack var4 = var3.getStack();
               if (!var4.isEmpty() && !this.method3857(var4)) {
                  this.method3844(var3, var4);
                  if (this.isBuying) {
                     break;
                  }
               }
            }
         }
      }
   }

   private void method3844(Slot var1, ItemStack var2) {
      List var3 = this.method3859(var2);
      int var4 = this.method3856(var3);
      if (var4 > 0) {
         int var5 = var2.getCount();
         int var6 = var4 / var5;
         String var7 = Formatting.strip(var2.getName().getString()).toLowerCase();

         for (Helper381 var9 : this.targets.values()) {
            if (var9.buyPrice > 0) {
               boolean var10 = false;
               if (var9.loreKeywords != null && !var9.loreKeywords.isEmpty()) {
                  var10 = this.method3845(var3, var9.loreKeywords);
               }

               if (!var10 && var9.method3803()) {
                  String var11 = Formatting.strip(var9.displayName).toLowerCase();
                  if (var7.contains(var11)) {
                     var10 = true;
                  }
               }

               if (!var10 && var9.method3804() && var2.getItem() == var9.displayStack.getItem()) {
                  var10 = true;
               }

               if (var10 && !this.method3846(var2, var3, var9)) {
                  var10 = false;
               }

               if (var10 && var6 <= var9.buyPrice) {
                  this.method3852(var1, var9, var4, var6, var5);
                  break;
               }
            }
         }
      }
   }

   private boolean method3845(List<String> var1, List<String> var2) {
      if (var1 != null && var2 != null) {
         int var3 = 0;

         for (String var5 : var2) {
            String var6 = Formatting.strip(var5);
            if (var6 != null) {
               for (String var8 : var1) {
                  String var9 = Formatting.strip(var8);
                  if (var9 != null && var9.contains(var6)) {
                     var3++;
                     break;
                  }
               }
            }
         }

         return var3 >= var2.size();
      } else {
         return false;
      }
   }

   private boolean method3846(ItemStack var1, List<String> var2, Helper381 var3) {
      if (var3.requiredKeywords.isEmpty() && var3.requiredLoreEnchantments.isEmpty()) {
         return true;
      } else {
         StringBuilder var4 = new StringBuilder(this.method3851(var1.getName().getString()));

         for (String var6 : var2) {
            var4.append(' ').append(this.method3851(var6));
         }

         for (String var9 : var3.requiredKeywords) {
            if (!var4.toString().contains(this.method3851(var9))) {
               return false;
            }
         }

         for (Entry var10 : var3.requiredLoreEnchantments.entrySet()) {
            if (!this.method3847(var1, var2, (String)var10.getKey(), (Integer)var10.getValue())) {
               return false;
            }
         }

         return true;
      }
   }

   private boolean method3847(ItemStack var1, List<String> var2, String var3, int var4) {
      String var5 = this.method3849(var3);
      if (var5 != null && this.method3848(var1, var5, var4)) {
         return true;
      } else {
         String var6 = this.method3851(var3);

         for (String var8 : var2) {
            String var9 = this.method3851(var8);
            if (var9.contains(var6)) {
               for (String var13 : var9.split("\\s+")) {
                  int var14 = this.method3850(var13);
                  if (var14 >= var4) {
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

   private boolean method3848(ItemStack var1, String var2, int var3) {
      ItemEnchantmentsComponent var4 = var1.get(DataComponentTypes.ENCHANTMENTS);
      if (var4 != null && !var4.isEmpty()) {
         String var5 = this.method3851(var2);

         for (RegistryEntry var7 : var4.getEnchantments()) {
            String var8 = var7.getIdAsString();
            if (var8 != null) {
               String var9 = this.method3851(var8.replace("minecraft:", ""));
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

   private String method3849(String var1) {
      String var2 = this.method3851(var1);

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
            String var4 = this.method3851(var1);
            yield var4.matches("[a-z0-9_]+") ? var4 : null;
         }
      };
   }

   private int method3850(String var1) {
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

   private String method3851(String var1) {
      return Formatting.strip(var1 == null ? "" : var1).toLowerCase(Locale.ROOT).replace('ё', 'е').trim();
   }

   private void method3852(Slot var1, Helper381 var2, int var3, int var4, int var5) {
      if (!this.isBuying && !this.waitingForPurchaseConfirm) {
         if (this.clickCooldown.method3318((long)this.clickDelay.method2082())) {
            this.isBuying = true;
            this.clickCooldown.method3310();
            this.method3853(var1.getStack(), var2.displayName, var3, var5);
            this.method3817(var1.id, 0, SlotActionType.QUICK_MOVE);
            this.waitingForPurchaseConfirm = true;
            Notifications.method1666().method1668(String.format("§eПокупка: %s x%d за %d$", var2.displayName, var5, var3), 3000L);
            new Thread(() -> {
               try {
                  Thread.sleep(500L);
                  if (this.waitingForPurchaseConfirm) {
                     mc.execute(() -> {
                        this.waitingForPurchaseConfirm = false;
                        this.isBuying = false;
                        this.method3854();
                        Notifications.method1666().method1668("§cТаймаут покупки", 2000L);
                     });
                  }
               } catch (Exception var2x) {
               }
            }).start();
         }
      }
   }

   private void method3853(ItemStack var1, String var2, int var3, int var4) {
      this.pendingPurchaseStack = var1 == null ? ItemStack.EMPTY : var1.copy();
      if (!this.pendingPurchaseStack.isEmpty()) {
         this.pendingPurchaseStack.setCount(1);
      }

      this.pendingPurchaseName = var2 == null ? "" : var2;
      this.pendingPurchaseTotal = var3;
      this.pendingPurchaseCount = Math.max(1, var4);
   }

   private void method3854() {
      this.pendingPurchaseStack = ItemStack.EMPTY;
      this.pendingPurchaseName = "";
      this.pendingPurchaseTotal = 0;
      this.pendingPurchaseCount = 0;
   }

   private boolean method3855(String var1) {
      return var1 != null && var1.contains("Этот товар уже купили");
   }

   private int method3856(List<String> var1) {
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

   private boolean method3857(ItemStack var1) {
      String var2 = var1.getName().getString().toLowerCase();
      return var2.contains("обновить") || var2.contains("refresh");
   }

   private void method3858() {
      if (this.currentAuctionScreen != null && !this.isBuying && !this.waitingForPurchaseConfirm) {
         GenericContainerScreenHandler var1 = this.currentAuctionScreen.getScreenHandler();

         for (Slot var3 : var1.slots) {
            if (this.method3857(var3.getStack())) {
               this.method3817(var3.id, 0, SlotActionType.PICKUP);
               break;
            }
         }
      }
   }

   private List<String> method3859(ItemStack var1) {
      LoreComponent var2 = var1.get(DataComponentTypes.LORE);
      return var2 != null ? var2.lines().stream().map(Text::getString).toList() : Collections.emptyList();
   }

   private void method3860() {
      Widget16.INSTANCE.method2889();
   }

   String method3861(int var1) {
      if (var1 >= 1000000) {
         return String.format("%.1fM", var1 / 1000000.0F);
      } else {
         return var1 >= 1000 ? String.format("%.1fK", var1 / 1000.0F) : String.valueOf(var1);
      }
   }

   void method3862() {
      try {
         if (CONFIG_PATH.getParent() != null) {
            Files.createDirectories(CONFIG_PATH.getParent());
         }

         HashMap var1 = new HashMap();
         HashMap var2 = new HashMap();
         this.targets.values().forEach(var1x -> {
            if (var1x.buyPrice > 0) {
               var2.put(var1x.id, var1x.buyPrice);
            }
         });
         var1.put("buyPrices", var2);
         var1.put("parserDiscountPercent", this.method3815());
         String var3 = GSON.toJson(var1);
         Files.writeString(CONFIG_PATH, var3);
      } catch (Exception var4) {
      }
   }

   private void method3863() {
      this.method3864();
      if (Files.exists(CONFIG_PATH)) {
         try {
            String var1 = Files.readString(CONFIG_PATH);
            if (var1 == null || var1.trim().isEmpty() || !var1.trim().startsWith("{")) {
               return;
            }

            Map var2 = (Map)GSON.fromJson(var1, new Helper370(this).getType());
            if (var2 != null) {
               Map var3 = (Map)var2.get("buyPrices");
               if (var3 != null) {
                  this.targets.values().forEach(var2x -> var2x.buyPrice = this.method3865(var3.get(var2x.id), 0));
               }

               this.parserDiscountPercent.method2086(this.method3865(var2.get("parserDiscountPercent"), this.parserDiscountPercent.method2080()));
            }
         } catch (Exception var4) {
         }
      }
   }

   private void method3864() {
      if (!Files.exists(CONFIG_PATH) && Files.exists(LEGACY_CONFIG_PATH)) {
         try {
            if (CONFIG_PATH.getParent() != null) {
               Files.createDirectories(CONFIG_PATH.getParent());
            }

            Files.copy(LEGACY_CONFIG_PATH, CONFIG_PATH);
         } catch (Exception var2) {
         }
      }
   }

   private int method3865(Object var1, int var2) {
      if (var1 instanceof Number var6) {
         return var6.intValue();
      } else {
         if (var1 instanceof String var3) {
            try {
               return Integer.parseInt(var3);
            } catch (NumberFormatException var5) {
            }
         }

         return var2;
      }
   }
}

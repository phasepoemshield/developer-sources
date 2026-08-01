package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.ingame.CraftingScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "MoneyFarm",
   O0000000000 = Category.Misc,
   O000000000 = "Крафтит и продает изумрудные предметы"
)
public class MoneyFarm extends Module {
   private static final String O000000000O = "Изумрудный меч";
   private static final String O000000000O0 = "Изумрудная кирка";
   private static final String O000000000O00 = "Дерево";
   private static final int O000000000O000 = 5;
   private static final long O000000000O00O = 250L;
   private static final long O000000000O0O = 1200L;
   private static final long O000000000O0O0 = 7000L;
   private static final long O000000000O0OO = 5000L;
   private static final int O000000000OO = 9;
   private static final int O000000000OO0 = 20;
   private final ModeSetting O000000000OO00 = new ModeSetting("Предмет", "Изумрудный меч", "Изумрудный меч", "Изумрудная кирка");
   private final TextSetting O000000000OO0O = new TextSetting("Цена продажи", "40000").O00000000(32);
   private final TextSetting O000000000OOO = new TextSetting("Макс. цена дерева", "0").O00000000(32);
   private final NumberSetting O000000000OOO0 = new NumberSetting("Задержка (мс)", 100.0F, 50.0F, 5000.0F, 50.0F, false);
   private final BooleanSetting O000000000OOOO = new BooleanSetting("Авто-покупка", true);
   private final BooleanSetting O00000000O = new BooleanSetting("Авто-продажа", false);
   private final BooleanSetting O00000000O0 = new BooleanSetting("Уведомления", true);
   private MoneyFarm.W94 O00000000O00 = MoneyFarm.W94.IDLE;
   private final O0000O00O0000 O00000000O000 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O0000 = new O0000O00O0000();
   private final O0000O00O0000 O00000000O000O = new O0000O00O0000();
   private final O0000O00O0000 O00000000O00O = new O0000O00O0000();
   private final O0000O00O0000 O00000000O00O0 = new O0000O00O0000();
   private BlockPos O00000000O00OO;
   private MoneyFarm.W93 O00000000O0O = MoneyFarm.W93.ITEM;
   private int O00000000O0O0 = 0;
   private int O00000000O0O00 = 0;
   private int O00000000O0O0O = 0;
   private int O00000000O0OO = 0;
   private int O00000000O0OO0 = 0;
   private boolean O00000000O0OOO = false;
   private boolean O00000000OO = false;
   private boolean O00000000OO0 = false;
   private boolean O00000000OO00 = false;
   private boolean O00000000OO000 = false;
   private boolean O00000000OO00O = false;
   private int O00000000OO0O = 0;
   private int O00000000OO0O0 = 0;
   private int O00000000OO0OO = 0;
   private int O00000000OOO = 0;
   private boolean O00000000OOO0 = false;
   private int O00000000OOO00 = 0;
   private long O00000000OOO0O = 0L;
   private long O00000000OOOO = 0L;

   public MoneyFarm() {
      this.O00000000(
         new Setting[]{
            this.O000000000OO00, this.O000000000OO0O, this.O000000000OOO, this.O000000000OOO0, this.O000000000OOOO, this.O00000000O, this.O00000000O0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O0000000O0();
   }

   @Override
   public void O000000000() {
      int var1 = this.O00000000O0O0;
      this.O0000000O0();
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && o0000000O000OO.O000000000000().equals(O0000000O000OO.W24.RECEIVE)) {
         if (o0000000O000OO.O00000000000() instanceof GameMessageS2CPacket var2) {
            String var6 = var2.content().getString();
            String var4 = this.O000000000000(var6);
            if (var4.contains("не удалось выставить") && var4.contains("освободите хранилище")) {
               this.O00000000O0OOO = true;
               this.O00000000OO = false;
               this.O00000000OO000 = true;
            } else {
               if (var4.contains("у вас купили") && var4.contains(this.O000000000000(this.O00000000OOO00()))) {
                  this.O00000000OO0 = true;
                  this.O00000000OO0OO++;
                  this.O00000000OOO = Math.max(0, this.O00000000OOO - 1);
                  this.O00000000O0O0O = 0;
                  this.O00000000O0O00 = 0;
                  this.O00000000OOO0 = false;
                  this.O00000000OOOO = System.currentTimeMillis();
               }

               if ((var4.contains("выставлен") || var4.contains("выставлено") || var4.contains("успешно выстав")) && var4.contains("продаж")) {
                  int var5 = this.O00000000OO0O0 > 0 ? this.O00000000OO0O0 : 1;
                  this.O00000000O0OOO = false;
                  this.O00000000OO = true;
                  this.O00000000O0OO += var5;
                  this.O00000000OOO += var5;
                  this.O00000000OO0OO = Math.max(0, this.O00000000OO0OO - var5);
                  this.O00000000OOO0 = true;
                  this.O00000000OO0O0 = 0;
                  this.O00000000OOOO = System.currentTimeMillis();
               }

               if (var4.contains("вы успешно купили")
                  && (
                     this.O00000000O00 == MoneyFarm.W94.BUY_WOOD_WAITING_CONFIRM
                        || this.O00000000O00 == MoneyFarm.W94.BUY_WOOD_CONFIRMING
                        || this.O00000000O00 == MoneyFarm.W94.BUY_WOOD_CLOSING
                  )) {
                  this.O00000000OO00 = true;
               }
            }
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         this.O0000000O();
         if (this.O00000000O0OOO && this.O00000000O00 == MoneyFarm.W94.IDLE) {
            this.O00000000O0O00();
         }

         switch (this.O00000000O00) {
            case IDLE:
               this.O0000000000O0();
               break;
            case BUY_WOOD_SEARCHING:
               this.O0000000000O00();
               break;
            case BUY_WOOD_WAITING_AUCTION:
               this.O0000000000O0O();
               break;
            case BUY_WOOD_READING_AUCTION:
               this.O0000000000OO();
               break;
            case BUY_WOOD_WAITING_CONFIRM:
               this.O0000000000OO0();
               break;
            case BUY_WOOD_CONFIRMING:
               this.O0000000000OOO();
               break;
            case BUY_WOOD_CLOSING:
               this.O000000000O();
               break;
            case BUY_OPENING_SHOP:
               this.O000000000O0();
               break;
            case BUY_WAITING_SHOP:
               this.O000000000O00();
               break;
            case BUY_FIND_GOLD_INGOT:
               this.O000000000O000();
               break;
            case BUY_WAITING_EMERALD_MENU:
               this.O000000000O00O();
               break;
            case BUY_FIND_EMERALD:
               this.O000000000O0O();
               break;
            case BUY_WAITING_CONFIRM:
               this.O000000000O0O0();
               break;
            case BUY_CLICK_LIME_PANE:
               this.O000000000O0OO();
               break;
            case BUY_CLOSING_SHOP:
               this.O000000000OO();
               break;
            case CHECK_SELL_GUI_OPENING:
               this.O000000000OO0();
               break;
            case CHECK_SELL_GUI_WAITING:
               this.O000000000OO00();
               break;
            case CHECK_SELL_GUI_READING:
               this.O000000000OO0O();
               break;
            case FINDING_CRAFTING_TABLE:
               this.O000000000OOO();
               break;
            case AIMING_CRAFTING_TABLE:
               this.O000000000OOO0();
               break;
            case OPENING_CRAFTING_TABLE:
               this.O000000000OOOO();
               break;
            case PLACING_ITEMS:
               this.O00000000O();
               break;
            case TAKING_RESULT:
               this.O00000000O0();
               break;
            case CLOSING_CRAFTING:
               this.O00000000O00();
               break;
            case SELLING:
               this.O00000000O000();
               break;
            case WAITING_SELL_RESULT:
               this.O00000000O0000();
               break;
            case RESALE_SEARCH_OWN_AH:
               this.O00000000O000O();
               break;
            case RESALE_WAITING_OWN_AH:
               this.O00000000O00O();
               break;
            case RESALE_TAKE_ITEM:
               this.O00000000O00O0();
               break;
            case RESALE_CLOSING:
               this.O00000000O00OO();
               break;
            case RESALE_SELLING:
               this.O00000000O0O();
               break;
            case RESALE_WAIT_SELL_RESULT:
               this.O00000000O0O0();
         }
      }
   }

   private void O0000000000O0() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (this.O00000000O0OOO) {
            this.O00000000O0O00();
         } else {
            if (this.O00000000O.O0000000000() && this.O00000000OO0OO > 0) {
               this.O00000000OO0 = false;
               if (!this.O00000000OOO0) {
                  this.O00000000O00 = MoneyFarm.W94.CHECK_SELL_GUI_OPENING;
                  this.O00000000O000.O00000000();
                  return;
               }

               if (this.O00000000O0O0O() > 0 && this.O00000000OO0O() >= this.O00000000O0O0O()) {
                  this.O00000000O00 = MoneyFarm.W94.SELLING;
                  this.O00000000O000.O00000000();
                  return;
               }
            } else {
               if (this.O00000000O.O0000000000() && this.O00000000OOO > 0 && System.currentTimeMillis() - this.O00000000OOOO >= 5000L) {
                  this.O00000000O0O00();
                  return;
               }

               if (this.O00000000O.O0000000000() && this.O00000000OOO > 0) {
                  return;
               }

               if (this.O00000000O.O0000000000() && !this.O00000000OOO0) {
                  this.O00000000O00 = MoneyFarm.W94.CHECK_SELL_GUI_OPENING;
                  this.O00000000O000.O00000000();
                  return;
               }
            }

            if (this.O00000000O.O0000000000() && this.O00000000OOO == 0 && this.O00000000O0O0O() > 0 && this.O00000000OO0O() >= this.O00000000O0O0O()) {
               this.O00000000O00 = MoneyFarm.W94.SELLING;
               this.O00000000O000.O00000000();
            } else if (!this.O00000000O.O0000000000() || !this.O00000000OOO0 || this.O00000000O0O0O() > 0) {
               if (this.O00000000O.O0000000000() && this.O00000000OOO0 && this.O00000000O0O0O() > 0 && this.O00000000OO0O() >= this.O00000000O0O0O()) {
                  if (this.O00000000OO0O() > 0) {
                     this.O00000000O00 = MoneyFarm.W94.SELLING;
                  }

                  this.O00000000O000.O00000000();
               } else if (this.O000000000OOOO.O0000000000() && this.O00000000O0OO0()) {
                  this.O00000000O00 = MoneyFarm.W94.BUY_OPENING_SHOP;
                  this.O00000000O000.O00000000();
               } else if (this.O00000000O0OOO()) {
                  if (this.O00000000OO()) {
                     this.O00000000O0O = MoneyFarm.W93.STICKS;
                     this.O00000000O00 = MoneyFarm.W94.FINDING_CRAFTING_TABLE;
                     this.O00000000O000.O00000000();
                  } else if (this.O00000000OO0()) {
                     this.O00000000O0O = MoneyFarm.W93.PLANKS;
                     this.O00000000O00 = MoneyFarm.W94.FINDING_CRAFTING_TABLE;
                     this.O00000000O000.O00000000();
                  } else {
                     if (this.O000000000OOOO.O0000000000() && this.O00000000OOOO0() > 0L) {
                        this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_SEARCHING;
                        this.O00000000O000.O00000000();
                     }
                  }
               } else if (this.O00000000O0OO()) {
                  this.O00000000O0O = MoneyFarm.W93.ITEM;
                  this.O00000000O00 = MoneyFarm.W94.FINDING_CRAFTING_TABLE;
                  this.O00000000O000.O00000000();
               }
            }
         }
      }
   }

   private void O0000000000O00() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO()) && O0000000000.currentScreen == null) {
         long var1 = this.O00000000OOOO0();
         if (var1 <= 0L) {
            this.O00000000000("§cМаксимальная цена дерева не задана.");
         } else {
            this.O00000000("Дерево");
            this.O00000000O0OO0 = 0;
            this.O00000000OO00 = false;
            this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_WAITING_AUCTION;
            this.O00000000O000.O00000000();
            this.O00000000O000O.O00000000();
            this.O00000000O00O.O00000000();
            this.O00000000O00O0.O00000000();
         }
      }
   }

   private void O0000000000O0O() {
      if (!(O0000000000.currentScreen instanceof GenericContainerScreen var1 && (AhHelper.O00000000(var1) || this.O00000000000O(var1)))) {
         if (this.O00000000O000.O000000000000(10000L)) {
            this.O00000000000("§cТаймаут поиска дерева.");
         }
      } else {
         this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_READING_AUCTION;
         this.O00000000O000.O00000000();
      }
   }

   private void O0000000000OO() {
      if (this.O00000000O000.O000000000000(150L)) {
         if (!(O0000000000.currentScreen instanceof GenericContainerScreen var1)) {
            if (this.O00000000O000.O000000000000(10000L)) {
               this.O0000000O00();
            }
         } else if (this.O00000000000O(var1)) {
            this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_CONFIRMING;
            this.O00000000O000.O00000000();
         } else if (!AhHelper.O00000000(var1)) {
            if (this.O00000000O000.O000000000000(10000L)) {
               this.O0000000O000();
               this.O00000000000("§cОткрылся не экран аукциона при покупке дерева.");
            }
         } else {
            long var12 = this.O00000000OOOO0();
            boolean var4 = this.O0000000000000(var1);
            ScreenHandler var5 = var1.getScreenHandler();
            boolean var6 = false;

            for (int var7 = 0; var7 < Math.min(45, var5.slots.size()); var7++) {
               Slot var8 = var5.getSlot(var7);
               if (this.O00000000(var8) && (var4 || this.O0000000000(var8))) {
                  long var9 = O000000OOOO0O.O000000000(var8);
                  String var11 = O000000OOOO0O.O00000000(var8);
                  if ((O0000000000.player == null || var11 == null || !var11.equalsIgnoreCase(O0000000000.player.getName().getString()))
                     && var9 > 0L
                     && var9 <= var12) {
                     var6 = true;
                     if (this.O00000000O00O.O000000000000(Math.max(50L, this.O00000000OOOOO()))) {
                        O0000000000.interactionManager.clickSlot(var5.syncId, var7, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                        this.O00000000O00O.O00000000();
                        this.O00000000O00O0.O00000000();
                        this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_WAITING_CONFIRM;
                        this.O00000000O000.O00000000();
                        return;
                     }
                     break;
                  }
               }
            }

            if (!var6 && this.O00000000O000O.O000000000000(250L)) {
               if (var5.slots.size() > 49) {
                  O0000000000.interactionManager.clickSlot(var5.syncId, 49, 0, SlotActionType.PICKUP, O0000000000.player);
                  this.O00000000O000O.O00000000();
               } else {
                  this.O0000000O000();
                  this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_SEARCHING;
                  this.O00000000O000.O00000000();
               }
            } else if (this.O00000000O000.O000000000000(10000L)) {
               this.O0000000O000();
               this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_SEARCHING;
               this.O00000000O000.O00000000();
            } else {
               this.O00000000O0OO0++;
            }
         }
      }
   }

   private void O0000000000OO0() {
      if (this.O00000000O000.O000000000000(50L)) {
         if (this.O00000000OO00) {
            this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_CLOSING;
            this.O00000000O000.O00000000();
         } else if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            if (this.O00000000000O(var1)) {
               this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_CONFIRMING;
               this.O00000000O000.O00000000();
            } else {
               if (this.O00000000O000.O000000000000(4000L)) {
                  this.O0000000O000();
                  this.O00000000000("§cПодтверждение покупки дерева не открылось.");
               }
            }
         } else {
            if (this.O00000000O000.O000000000000(4000L)) {
               this.O00000000000("§cПодтверждение покупки дерева не открылось.");
            }
         }
      }
   }

   private void O0000000000OOO() {
      if (this.O00000000O000.O000000000000(50L)) {
         if (this.O00000000OO00) {
            this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_CLOSING;
            this.O00000000O000.O00000000();
         } else if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            int var3 = this.O00000000(var1.getScreenHandler());
            if (var3 != -1 && this.O00000000O00O0.O000000000000(Math.max(50L, this.O00000000OOOOO()))) {
               this.O00000000(var1, var3, 0, SlotActionType.PICKUP);
               this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_CLOSING;
               this.O00000000O000.O00000000();
               this.O00000000O00O0.O00000000();
            } else {
               if (this.O00000000O000.O000000000000(5000L)) {
                  this.O0000000O000();
                  this.O00000000000("§cКнопка подтверждения покупки дерева не найдена.");
               }
            }
         } else {
            this.O00000000O00 = MoneyFarm.W94.BUY_WOOD_CLOSING;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O000000000O() {
      if (this.O00000000O000.O000000000000(300L)) {
         this.O0000000O000();
         if (this.O00000000OO00) {
         }

         this.O0000000O00();
      }
   }

   private void O000000000O0() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (this.O0000000000(150L)) {
            O0000000000.player.networkHandler.sendChatCommand("shop");
            this.O00000000O00 = MoneyFarm.W94.BUY_WAITING_SHOP;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O000000000O00() {
      if (O0000000000.currentScreen instanceof GenericContainerScreen) {
         this.O00000000O00 = MoneyFarm.W94.BUY_FIND_GOLD_INGOT;
         this.O00000000O000.O00000000();
      } else {
         if (this.O00000000O000.O000000000000(10000L)) {
            this.O00000000000("§cТаймаут магазина.");
         }
      }
   }

   private void O000000000O000() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            int var3 = this.O00000000(var1, Items.GOLD_INGOT);
            if (var3 != -1) {
               this.O00000000(var1, var3, 0, SlotActionType.PICKUP);
               this.O00000000O00 = MoneyFarm.W94.BUY_WAITING_EMERALD_MENU;
               this.O00000000O000.O00000000();
            } else {
               if (this.O00000000O000.O000000000000(5000L)) {
                  this.O0000000O000();
                  this.O00000000000("§cЗолотой слиток не найден.");
               }
            }
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O000000000O00O() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (!(O0000000000.currentScreen instanceof GenericContainerScreen)) {
            this.O0000000O00();
         } else {
            this.O00000000O00 = MoneyFarm.W94.BUY_FIND_EMERALD;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O000000000O0O() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            int var3 = this.O000000000000O(var1);
            if (var3 != -1) {
               this.O00000000(var1, var3, 1, SlotActionType.PICKUP);
               this.O00000000O00 = MoneyFarm.W94.BUY_WAITING_CONFIRM;
               this.O00000000O000.O00000000();
            } else {
               if (this.O00000000O000.O000000000000(5000L)) {
                  this.O0000000O000();
                  this.O00000000000("§cИзумруд не найден.");
               }
            }
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O000000000O0O0() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (!this.O00000000O0OO0()) {
            this.O00000000O00 = MoneyFarm.W94.BUY_CLOSING_SHOP;
            this.O00000000O000.O00000000();
         } else if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            if (this.O00000000000O(var1)) {
               this.O00000000O00 = MoneyFarm.W94.BUY_CLICK_LIME_PANE;
               this.O00000000O000.O00000000();
            } else {
               if (this.O00000000O000.O000000000000(5000L)) {
                  this.O0000000O000();
                  this.O00000000000("§cПодтверждение покупки изумрудов не открылось.");
               }
            }
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O000000000O0OO() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (!this.O00000000O0OO0()) {
            this.O00000000O00 = MoneyFarm.W94.BUY_CLOSING_SHOP;
            this.O00000000O000.O00000000();
         } else if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            if (!this.O00000000000O(var1)) {
               this.O00000000O00 = MoneyFarm.W94.BUY_WAITING_CONFIRM;
               this.O00000000O000.O00000000();
            } else {
               int var3 = this.O00000000(var1.getScreenHandler());
               if (var3 != -1) {
                  this.O00000000(var1, var3, 0, SlotActionType.PICKUP);
                  this.O00000000O00 = MoneyFarm.W94.BUY_CLOSING_SHOP;
                  this.O00000000O000.O00000000();
               } else {
                  if (this.O00000000O000.O000000000000(5000L)) {
                     this.O0000000O000();
                     this.O00000000000("§cЛаймовая панель не найдена.");
                  }
               }
            }
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O000000000OO() {
      if (this.O0000000000(150L)) {
         this.O0000000O00();
      }
   }

   private void O000000000OO0() {
      if (this.O00000000O000.O000000000000(50L) && O0000000000.currentScreen == null) {
         long var1 = this.O00000000OOOO();
         if (var1 <= 0L) {
            this.O00000000000("§cЦена продажи не задана.");
         } else if (this.O00000000OOO()) {
            this.O00000000OOO0();
            this.O00000000(var1);
            this.O00000000O00 = MoneyFarm.W94.CHECK_SELL_GUI_WAITING;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O000000000OO00() {
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O00000000000O0(var1)) {
         this.O00000000O00 = MoneyFarm.W94.CHECK_SELL_GUI_READING;
         this.O00000000O000.O00000000();
      } else {
         if (this.O00000000O000.O000000000000(7000L)) {
            this.O0000000O000();
            this.O00000000000("§cSellgui не открылся для проверки слотов.");
         }
      }
   }

   private void O000000000OO0O() {
      if (this.O00000000O000.O000000000000(150L)) {
         if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O00000000000O0(var1)) {
            int var3 = this.O0000000000(var1);
            this.O00000000O0O0O = var3;
            if (this.O00000000OO0OO > 0) {
               this.O00000000OO0OO = var3;
            }

            this.O00000000OOO0 = true;
            this.O00000000O0O00 = 0;
            this.O0000000O000();
            if (var3 <= 0) {
               this.O00000000O0O00();
            } else {
               this.O00000000O00 = MoneyFarm.W94.IDLE;
               this.O00000000O000.O00000000();
            }
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O000000000OOO() {
      if (this.O0000000000(150L)) {
         if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
            this.O00000000O00OO = this.O00000000OO0OO();
            if (this.O00000000O00OO == null) {
               this.O00000000000("§cВерстак рядом не найден.");
            } else {
               this.O00000000O00 = MoneyFarm.W94.AIMING_CRAFTING_TABLE;
               this.O00000000O000.O00000000();
            }
         }
      }
   }

   private void O000000000OOO0() {
      if (this.O00000000O00OO != null && this.O00000000(this.O00000000O00OO)) {
         O000000O0O00OO var1 = this.O00000000(Vec3d.ofCenter(this.O00000000O00OO));
         O000000O0O0O0.O00000000(var1, 45.0F, 45.0F, 30.0F, 30.0F, 4, 5, false);
         if (!(new O000000O0O00OO(O0000000000.player).O00000000(var1) > 4.0F) && this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
            BlockHitResult var2 = new BlockHitResult(Vec3d.ofCenter(this.O00000000O00OO), this.O000000000(this.O00000000O00OO), this.O00000000O00OO, false);
            O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var2);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            this.O00000000O00 = MoneyFarm.W94.OPENING_CRAFTING_TABLE;
            this.O00000000O000.O00000000();
         }
      } else {
         this.O00000000O00 = MoneyFarm.W94.FINDING_CRAFTING_TABLE;
         this.O00000000O000.O00000000();
      }
   }

   private void O000000000OOOO() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO())) {
         if (O0000000000.currentScreen instanceof CraftingScreen) {
            this.O00000000O00 = MoneyFarm.W94.PLACING_ITEMS;
            this.O00000000O000.O00000000();
         } else {
            if (this.O00000000O000.O000000000000(5000L)) {
               this.O00000000000("§cВерстак не открылся.");
            }
         }
      }
   }

   private void O00000000O() {
      if (this.O00000000O000.O000000000000(50L)) {
         if (O0000000000.currentScreen instanceof CraftingScreen var1) {
            CraftingScreenHandler var4 = (CraftingScreenHandler)var1.getScreenHandler();
            int var3 = var4.syncId;
            switch (this.O00000000O0O) {
               case ITEM:
                  if (this.O00000000OOO0O()) {
                     this.O00000000(var4, var3, Items.EMERALD, 2);
                     this.O00000000(var4, var3, Items.EMERALD, 5);
                     this.O00000000(var4, var3, Items.STICK, 8);
                  } else {
                     this.O00000000(var4, var3, Items.EMERALD, 1);
                     this.O00000000(var4, var3, Items.EMERALD, 2);
                     this.O00000000(var4, var3, Items.EMERALD, 3);
                     this.O00000000(var4, var3, Items.STICK, 5);
                     this.O00000000(var4, var3, Items.STICK, 8);
                  }
                  break;
               case PLANKS:
                  this.O00000000(var4, var3, this::O0000000000, 1);
                  break;
               case STICKS:
                  this.O00000000(var4, var3, this::O000000000, 2);
                  this.O00000000(var4, var3, this::O000000000, 5);
            }

            this.O00000000O00 = MoneyFarm.W94.TAKING_RESULT;
            this.O00000000O000.O00000000();
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O00000000O0() {
      if (this.O00000000O000.O000000000000(50L)) {
         if (O0000000000.currentScreen instanceof CraftingScreen var1) {
            O0000000000.interactionManager
               .clickSlot(((CraftingScreenHandler)var1.getScreenHandler()).syncId, 0, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
            if (this.O00000000O0O == MoneyFarm.W93.ITEM) {
               this.O00000000O0O0++;
               this.O00000000O0O00++;
            } else if (this.O00000000O0O == MoneyFarm.W93.PLANKS) {
            }

            this.O00000000O00 = MoneyFarm.W94.CLOSING_CRAFTING;
            this.O00000000O000.O00000000();
         } else {
            this.O0000000O00();
         }
      }
   }

   private void O00000000O00() {
      if (this.O00000000O000.O000000000000(50L)) {
         this.O0000000O000();
         if (this.O00000000O0O == MoneyFarm.W93.ITEM && this.O00000000O.O0000000000()) {
            int var1 = this.O00000000O0O0O();
            int var2 = this.O00000000OO0O();
            if (var1 > 0 && var2 < var1) {
               this.O00000000O00 = this.O00000000O0OO() ? MoneyFarm.W94.FINDING_CRAFTING_TABLE : MoneyFarm.W94.IDLE;
            } else {
               this.O00000000O00 = MoneyFarm.W94.SELLING;
            }
         } else {
            this.O00000000O00 = MoneyFarm.W94.IDLE;
         }

         this.O00000000O000.O00000000();
      }
   }

   private void O00000000O000() {
      if (this.O00000000O000.O000000000000(50L)) {
         if (this.O00000000O0OOO) {
            this.O00000000O0O00();
         } else {
            long var1 = this.O00000000OOOO();
            if (var1 <= 0L) {
               this.O00000000000("§cЦена продажи не задана.");
            } else if (!this.O00000000OO00O()) {
               this.O00000000O00 = MoneyFarm.W94.IDLE;
               this.O00000000O000.O00000000();
            } else if (O0000000000.currentScreen instanceof GenericContainerScreen var3 && this.O00000000000O0(var3)) {
               this.O00000000(var3, false);
            } else if (O0000000000.currentScreen != null) {
               this.O0000000O000();
               this.O00000000O000.O00000000();
            } else if (this.O00000000OOO()) {
               this.O00000000OOO0();
               this.O00000000OO = false;
               this.O00000000O0OOO = false;
               this.O00000000(var1);
               this.O00000000O00 = MoneyFarm.W94.WAITING_SELL_RESULT;
               this.O00000000O000.O00000000();
            }
         }
      }
   }

   private void O00000000O0000() {
      if (this.O00000000O0OOO) {
         this.O00000000O0O00();
      } else if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O00000000000O0(var1)) {
         this.O00000000(var1, false);
      } else if (this.O00000000OO) {
         this.O00000000OO = false;
         this.O00000000O0O00 = 0;
         this.O00000000O00 = MoneyFarm.W94.IDLE;
         this.O00000000O000.O00000000();
      } else {
         if (this.O00000000O000.O000000000000(7000L)) {
            this.O0000000O000();
            this.O00000000O00 = this.O00000000OO00O() ? MoneyFarm.W94.SELLING : MoneyFarm.W94.IDLE;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O00000000O000O() {
      if (this.O00000000O000.O000000000000(this.O00000000OOOOO()) && O0000000000.currentScreen == null) {
         if (!this.O00000000OO000 && this.O00000000OO00O()) {
            this.O00000000O00 = MoneyFarm.W94.RESALE_SELLING;
            this.O00000000O000.O00000000();
         } else {
            this.O00000000OO000 = false;
            String var1 = O0000000000.player.getName().getString();
            this.O000000000(var1);
            this.O00000000O0OO0 = 0;
            this.O00000000O00 = MoneyFarm.W94.RESALE_WAITING_OWN_AH;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O00000000O00O() {
      if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O0000000000O(var1)) {
         this.O00000000O00 = MoneyFarm.W94.RESALE_TAKE_ITEM;
         this.O00000000O000.O00000000();
      } else {
         if (this.O00000000O000.O000000000000(10000L)) {
            this.O00000000000("§cТаймаут поиска своих товаров.");
         }
      }
   }

   private void O00000000O00O0() {
      if (this.O00000000O000.O000000000000(200L)) {
         if (O0000000000.currentScreen instanceof GenericContainerScreen var1) {
            if (!this.O0000000000O(var1)) {
               if (this.O00000000O000.O000000000000(10000L)) {
                  this.O0000000O000();
                  this.O00000000O00 = MoneyFarm.W94.RESALE_SEARCH_OWN_AH;
                  this.O00000000O000.O00000000();
               }
            } else {
               int var3 = this.O000000000000(var1);
               if (var3 != -1) {
                  this.O00000000(var1, var3, 0, SlotActionType.QUICK_MOVE);
                  this.O00000000O0OO0 = 0;
                  this.O00000000O000.O00000000();
               } else if (this.O00000000O0OO0++ < 2) {
                  this.O00000000O000.O00000000();
               } else {
                  this.O0000000O000();
                  if (this.O00000000OO00O()) {
                     this.O00000000OOO = 0;
                     this.O00000000O00 = MoneyFarm.W94.RESALE_SELLING;
                  } else {
                     this.O00000000O0OOO = false;
                     this.O00000000O0OO = 0;
                     this.O00000000OOO = 0;
                     this.O00000000O00 = MoneyFarm.W94.IDLE;
                  }

                  this.O00000000O000.O00000000();
               }
            }
         } else {
            this.O00000000O00 = MoneyFarm.W94.RESALE_SEARCH_OWN_AH;
            this.O00000000O000.O00000000();
         }
      }
   }

   private int O00000000(GenericContainerScreen genericContainerScreen) {
      int var2 = 0;
      int var3 = this.O00000000000OO(genericContainerScreen);

      for (int var4 = 0; var4 < var3; var4++) {
         Slot var5 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var4);
         if (var5.hasStack() && this.O00000000(var5.getStack(), true)) {
            var2++;
         }
      }

      return var2;
   }

   private void O00000000O00OO() {
      if (this.O00000000O000.O000000000000(300L)) {
         this.O0000000O000();
         this.O00000000O00 = MoneyFarm.W94.RESALE_SELLING;
         this.O00000000O000.O00000000();
      }
   }

   private void O00000000O0O() {
      if (this.O00000000O000.O000000000000(50L)) {
         if (this.O00000000O0OOO) {
            this.O00000000O0O00();
         } else {
            long var1 = this.O00000000OOOO();
            if (var1 <= 0L) {
               this.O00000000000("§cЦена продажи не задана.");
            } else if (!this.O00000000OO00O()) {
               this.O00000000O00 = MoneyFarm.W94.RESALE_SEARCH_OWN_AH;
               this.O00000000O000.O00000000();
            } else if (O0000000000.currentScreen instanceof GenericContainerScreen var3 && this.O00000000000O0(var3)) {
               this.O00000000(var3, true);
            } else if (O0000000000.currentScreen != null) {
               this.O0000000O000();
               this.O00000000O000.O00000000();
            } else if (this.O00000000OOO()) {
               this.O00000000OOO0();
               this.O00000000OO = false;
               this.O00000000O0OOO = false;
               this.O00000000(var1);
               this.O00000000O00 = MoneyFarm.W94.RESALE_WAIT_SELL_RESULT;
               this.O00000000O000.O00000000();
            }
         }
      }
   }

   private void O00000000O0O0() {
      if (this.O00000000OO0) {
         this.O00000000OO0 = false;
      }

      if (this.O00000000O0OOO) {
         this.O00000000O0O00();
      } else if (O0000000000.currentScreen instanceof GenericContainerScreen var1 && this.O00000000000O0(var1)) {
         this.O00000000(var1, true);
      } else if (this.O00000000OO) {
         this.O00000000OO = false;
         this.O00000000O0OO = 0;
         this.O00000000O00 = MoneyFarm.W94.IDLE;
         this.O00000000O000.O00000000();
      } else {
         if (this.O00000000O000.O000000000000(7000L)) {
            this.O0000000O000();
            this.O00000000O00 = this.O00000000OO00O() ? MoneyFarm.W94.RESALE_SELLING : MoneyFarm.W94.IDLE;
            this.O00000000O000.O00000000();
         }
      }
   }

   private void O00000000O0O00() {
      this.O00000000O00 = MoneyFarm.W94.RESALE_SEARCH_OWN_AH;
      this.O00000000O0OOO = false;
      this.O00000000OO = false;
      this.O00000000OO000 = true;
      this.O00000000O0O00 = 0;
      this.O00000000O0O0O = 0;
      this.O00000000OOO = 0;
      this.O00000000OO0OO = 0;
      this.O00000000OOO0 = false;
      this.O00000000O000.O00000000();
   }

   private void O00000000(CraftingScreenHandler craftingScreenHandler, int i, Item item, int j) {
      this.O00000000(craftingScreenHandler, i, (Predicate<ItemStack>)(itemStack -> itemStack.isOf(item)), j);
   }

   private void O00000000(CraftingScreenHandler craftingScreenHandler, int i, Predicate<ItemStack> predicate, int j) {
      int var5 = -1;

      for (int var6 = 10; var6 < craftingScreenHandler.slots.size(); var6++) {
         Slot var7 = craftingScreenHandler.getSlot(var6);
         if (var7.hasStack() && predicate.test(var7.getStack())) {
            var5 = var6;
            break;
         }
      }

      if (var5 != -1) {
         O0000000000.interactionManager.clickSlot(i, var5, 0, SlotActionType.PICKUP, O0000000000.player);
         O0000000000.interactionManager.clickSlot(i, j, 1, SlotActionType.PICKUP, O0000000000.player);
         O0000000000.interactionManager.clickSlot(i, var5, 0, SlotActionType.PICKUP, O0000000000.player);
      }
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, boolean bl) {
      ScreenHandler var3 = genericContainerScreen.getScreenHandler();
      int var4 = this.O00000000000OO(genericContainerScreen);
      if (this.O00000000OO00O) {
         if (this.O00000000O000.O000000000000(1500L)) {
            this.O0000000O000();
         }
      } else {
         int var5 = 0;

         for (int var6 = this.O0000000000(bl); var5 < 4 && this.O00000000OO0O < var6; var5++) {
            int var7 = this.O000000000(genericContainerScreen);
            int var8 = this.O00000000(var3, var4);
            if (var7 == -1 || var8 == -1) {
               break;
            }

            O0000000000.interactionManager.clickSlot(var3.syncId, var8, 0, SlotActionType.PICKUP, O0000000000.player);
            O0000000000.interactionManager.clickSlot(var3.syncId, var7, 0, SlotActionType.PICKUP, O0000000000.player);
            this.O00000000OO0O++;
         }

         if (var5 > 0) {
            this.O00000000O000.O00000000();
         } else if (this.O00000000OO0O <= 0) {
            this.O0000000O000();
            this.O00000000O00 = bl ? MoneyFarm.W94.RESALE_SEARCH_OWN_AH : MoneyFarm.W94.IDLE;
            this.O00000000O000.O00000000();
         } else {
            int var9 = this.O00000000000(genericContainerScreen);
            if (var9 != -1) {
               this.O00000000(genericContainerScreen, var9, 0, SlotActionType.PICKUP);
               this.O00000000OO00O = true;
               this.O00000000OO0O0 = this.O00000000OO0O;
               this.O00000000O000.O00000000();
            } else {
               if (this.O00000000O000.O000000000000(3000L)) {
                  this.O0000000O000();
                  this.O00000000O00 = bl ? MoneyFarm.W94.RESALE_SELLING : MoneyFarm.W94.SELLING;
                  this.O00000000O000.O00000000();
               }
            }
         }
      }
   }

   private int O0000000000(boolean bl) {
      if (bl) {
         return Integer.MAX_VALUE;
      } else {
         return this.O00000000OO0OO > 0 ? this.O00000000OO0OO : Math.max(0, this.O00000000O0O0O);
      }
   }

   private int O000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = Math.min(9, this.O00000000000OO(genericContainerScreen));

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3);
         if (!var4.hasStack()) {
            return var3;
         }
      }

      return -1;
   }

   private int O0000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = 0;
      int var3 = Math.min(9, this.O00000000000OO(genericContainerScreen));

      for (int var4 = 0; var4 < var3; var4++) {
         Slot var5 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var4);
         if (!var5.hasStack()) {
            var2++;
         }
      }

      return var2;
   }

   private int O00000000O0O0O() {
      return this.O00000000OO0OO > 0 ? this.O00000000OO0OO : this.O00000000O0O0O;
   }

   private int O00000000(ScreenHandler screenHandler, int i) {
      for (int var3 = i; var3 < screenHandler.slots.size(); var3++) {
         Slot var4 = screenHandler.getSlot(var3);
         if (var4.hasStack() && this.O00000000(var4.getStack(), true)) {
            return var3;
         }
      }

      return -1;
   }

   private int O00000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000000OO(genericContainerScreen);
      int var3 = -1;

      for (int var4 = var2 - 1; var4 >= 0; var4--) {
         Slot var5 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var4);
         if (var5.hasStack()) {
            ItemStack var6 = var5.getStack();
            String var7 = this.O000000000000(var6.getName().getString());
            if (var6.isOf(Items.LIME_DYE)
               || var6.isOf(Items.GREEN_DYE)
               || var6.isOf(Items.LIME_STAINED_GLASS_PANE)
               || var6.isOf(Items.GREEN_STAINED_GLASS_PANE)) {
               return var4;
            }

            if (var7.contains("выстав") || var7.contains("продать") || var7.contains("подтверд")) {
               var3 = var4;
            }
         }
      }

      return var3;
   }

   private boolean O00000000O0OO() {
      return !this.O00000000O0OO0() && !this.O00000000O0OOO();
   }

   private boolean O00000000O0OO0() {
      return this.O00000000(Items.EMERALD) < this.O00000000OO00();
   }

   private boolean O00000000O0OOO() {
      return this.O00000000(Items.STICK) < this.O00000000OO000();
   }

   private boolean O00000000OO() {
      return this.O00000000(this::O000000000) > 0;
   }

   private boolean O00000000OO0() {
      return this.O00000000(this::O0000000000) > 0;
   }

   private int O00000000(Predicate<ItemStack> predicate) {
      if (O0000000000.player == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < 36; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            if (!var4.isEmpty() && predicate.test(var4)) {
               var2 += var4.getCount();
            }
         }

         return var2;
      }
   }

   private int O00000000OO00() {
      return this.O00000000OOO0O() ? 2 : 3;
   }

   private int O00000000OO000() {
      return this.O00000000OOO0O() ? 1 : 2;
   }

   private int O00000000(Item item) {
      if (O0000000000.player == null) {
         return 0;
      } else {
         int var2 = 0;

         for (int var3 = 0; var3 < 36; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            if (!var4.isEmpty() && var4.isOf(item)) {
               var2 += var4.getCount();
            }
         }

         return var2;
      }
   }

   private boolean O00000000OO00O() {
      return this.O00000000OO0O() > 0;
   }

   private int O00000000OO0O() {
      if (O0000000000.player == null) {
         return 0;
      } else {
         int var1 = 0;

         for (int var2 = 0; var2 < 36; var2++) {
            ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
            if (this.O00000000(var3, true)) {
               var1 += Math.max(1, var3.getCount());
            }
         }

         return var1;
      }
   }

   private boolean O00000000OO0O0() {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.player.playerScreenHandler != null) {
         if (this.O00000000(O0000000000.player.getMainHandStack(), true)) {
            return true;
         } else {
            for (int var1 = 0; var1 < 9; var1++) {
               if (this.O00000000(O0000000000.player.getInventory().getStack(var1), true)) {
                  O0000000000.player.getInventory().setSelectedSlot(var1);
                  return true;
               }
            }

            int var3 = O0000000000.player.getInventory().getSelectedSlot();

            for (int var2 = 9; var2 < 36; var2++) {
               if (this.O00000000(O0000000000.player.getInventory().getStack(var2), true)) {
                  O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, var3, SlotActionType.SWAP, O0000000000.player);
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O00000000(ItemStack itemStack, boolean bl) {
      if (itemStack != null && !itemStack.isEmpty()) {
         String var3 = this.O000000000000(itemStack.getName().getString());
         if (var3.contains(this.O000000000000(this.O00000000OOO00()))) {
            return true;
         } else if (!bl) {
            return false;
         } else {
            return this.O00000000OOO0O() ? itemStack.isOf(Items.DIAMOND_SWORD) : itemStack.isOf(Items.DIAMOND_PICKAXE);
         }
      } else {
         return false;
      }
   }

   private int O000000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000000OO(genericContainerScreen);

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3);
         if (this.O00000000(var4) && this.O00000000(var4.getStack(), true)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean O00000000(Slot slot) {
      return slot != null && slot.hasStack() ? !this.O00000000000(slot.getStack()) : false;
   }

   private int O000000000(Slot slot) {
      return slot != null && slot.hasStack() ? Math.max(1, slot.getStack().getCount()) : 1;
   }

   private boolean O0000000000(Slot slot) {
      if (slot != null && slot.hasStack()) {
         ItemStack var2 = slot.getStack();
         return this.O00000000000(var2) ? false : this.O00000000(var2) || this.O000000000000(var2.getName().getString()).contains(this.O000000000000("Дерево"));
      } else {
         return false;
      }
   }

   private boolean O0000000000000(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else {
         String var2 = this.O000000000000(genericContainerScreen.getTitle().getString());
         return var2.contains(this.O000000000000("Дерево"));
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack == null || itemStack.isEmpty()) {
         return false;
      } else if (itemStack.isOf(Items.STICK)) {
         return true;
      } else {
         String var2 = Registries.ITEM.getId(itemStack.getItem()).getPath();
         String var3 = this.O000000000000(itemStack.getName().getString());
         return var2.contains("log")
            || var2.contains("wood")
            || var2.contains("planks")
            || var3.contains("дерев")
            || var3.contains("древес")
            || var3.contains("палк");
      }
   }

   private boolean O000000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         String var2 = Registries.ITEM.getId(itemStack.getItem()).getPath();
         return var2.endsWith("_planks");
      } else {
         return false;
      }
   }

   private boolean O0000000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         String var2 = Registries.ITEM.getId(itemStack.getItem()).getPath();
         return var2.endsWith("_log") || var2.endsWith("_wood") || var2.endsWith("_stem") || var2.endsWith("_hyphae");
      } else {
         return false;
      }
   }

   private boolean O00000000000(ItemStack itemStack) {
      return itemStack.isOf(Items.GREEN_STAINED_GLASS_PANE)
         || itemStack.isOf(Items.BLACK_STAINED_GLASS_PANE)
         || itemStack.isOf(Items.LIME_STAINED_GLASS_PANE)
         || itemStack.isOf(Items.RED_STAINED_GLASS_PANE)
         || itemStack.isOf(Items.AIR);
   }

   private int O00000000(GenericContainerScreen genericContainerScreen, Item item, String string) {
      String var4 = this.O000000000000(string);

      for (int var5 = 0; var5 < ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size(); var5++) {
         Slot var6 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var5);
         if (var6.hasStack()) {
            ItemStack var7 = var6.getStack();
            if (var7.isOf(item) && this.O000000000000(var7.getName().getString()).contains(var4)) {
               return var5;
            }
         }
      }

      return -1;
   }

   private int O000000000000O(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O00000000000OO(genericContainerScreen);

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3);
         if (var4.hasStack()) {
            ItemStack var5 = var4.getStack();
            String var6 = this.O000000000000(var5.getName().getString());
            if (var5.isOf(Items.EMERALD)) {
               return var3;
            }

            if (var5.isOf(Items.PAPER) && (var6.contains("изумруд") || var6.contains("emerald"))) {
               return var3;
            }
         }
      }

      return -1;
   }

   private int O00000000(GenericContainerScreen genericContainerScreen, Item item) {
      int var3 = this.O00000000000OO(genericContainerScreen);

      for (int var4 = 0; var4 < var3; var4++) {
         Slot var5 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var4);
         if (var5.hasStack() && var5.getStack().isOf(item)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean O00000000000O(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else {
         String var2 = this.O000000000000(genericContainerScreen.getTitle().getString());
         if (var2.contains("подтверждение покупки")) {
            return this.O00000000(genericContainerScreen.getScreenHandler()) != -1;
         } else {
            ScreenHandler var3 = genericContainerScreen.getScreenHandler();
            return this.O00000000(var3) != -1 && this.O000000000(var3);
         }
      }
   }

   private boolean O00000000000O0(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen == null) {
         return false;
      } else {
         String var2 = this.O000000000000(genericContainerScreen.getTitle().getString());
         return var2.contains("продажа") || var2.contains("sellgui") || var2.contains("sell gui");
      }
   }

   private int O00000000(ScreenHandler screenHandler) {
      int var2 = Math.min(screenHandler.slots.size(), Math.max(0, screenHandler.slots.size() - 36));

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         ItemStack var4 = screenHandler.getSlot(var3).getStack();
         String var5 = this.O000000000000(var4.getName().getString());
         if (var5.contains("купить")
            || var4.isOf(Items.LIME_STAINED_GLASS_PANE)
            || var4.isOf(Items.GREEN_STAINED_GLASS_PANE)
            || var4.isOf(Items.GREEN_CONCRETE)
            || var4.isOf(Items.LIME_CONCRETE)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean O000000000(ScreenHandler screenHandler) {
      int var2 = Math.min(screenHandler.slots.size(), Math.max(0, screenHandler.slots.size() - 36));

      for (int var3 = 0; var3 < var2; var3++) {
         ItemStack var4 = screenHandler.getSlot(var3).getStack();
         if (var4.isOf(Items.RED_STAINED_GLASS_PANE) || var4.isOf(Items.RED_CONCRETE)) {
            return true;
         }
      }

      return false;
   }

   private void O00000000(GenericContainerScreen genericContainerScreen, int i, int j, SlotActionType slotActionType) {
      O0000000000.interactionManager
         .clickSlot(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId, i, j, slotActionType, O0000000000.player);
   }

   private int O00000000000OO(GenericContainerScreen genericContainerScreen) {
      int var2 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getRows();
      int var3 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private BlockPos O00000000OO0OO() {
      if (O0000000000.player != null && O0000000000.world != null) {
         BlockPos var1 = O0000000000.player.getBlockPos();
         BlockPos var2 = null;
         double var3 = Double.MAX_VALUE;

         for (BlockPos var6 : BlockPos.iterate(var1.add(-5, -5, -5), var1.add(5, 5, 5))) {
            BlockPos var7 = var6.toImmutable();
            if (this.O00000000(var7)) {
               double var8 = O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(var7));
               if (var8 < var3) {
                  var3 = var8;
                  var2 = var7;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   private boolean O00000000(BlockPos blockPos) {
      return O0000000000.world != null && O0000000000.world.getBlockState(blockPos).isOf(Blocks.CRAFTING_TABLE);
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      if (O0000000000.player == null) {
         return new O000000O0O00OO(0.0F, 0.0F);
      } else {
         Vec3d var2 = O0000000000.player.getEyePos();
         double var3 = vec3d.x - var2.x;
         double var5 = vec3d.y - var2.y;
         double var7 = vec3d.z - var2.z;
         float var9 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
         float var10 = (float)(-Math.toDegrees(Math.atan2(var5, Math.sqrt(var3 * var3 + var7 * var7))));
         return new O000000O0O00OO(var9, var10);
      }
   }

   private Direction O000000000(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getPos();
      Vec3d var3 = Vec3d.ofCenter(blockPos);
      double var4 = var2.x - var3.x;
      double var6 = var2.z - var3.z;
      if (Math.abs(var4) > Math.abs(var6)) {
         return var4 > 0.0 ? Direction.EAST : Direction.WEST;
      } else {
         return var6 > 0.0 ? Direction.SOUTH : Direction.NORTH;
      }
   }

   private void O00000000(String string) {
      if (O0000000000.player != null && string != null && !string.isBlank()) {
         O0000000000.player.networkHandler.sendChatCommand("ah search " + string.trim());
      }
   }

   private void O000000000(String string) {
      if (O0000000000.player != null && string != null && !string.isBlank()) {
         O0000000000.player.networkHandler.sendChatCommand("ah " + string.trim());
      }
   }

   private boolean O0000000000O(GenericContainerScreen genericContainerScreen) {
      if (genericContainerScreen != null && O0000000000.player != null) {
         String var2 = this.O000000000000(genericContainerScreen.getTitle().getString());
         String var3 = this.O000000000000(O0000000000.player.getName().getString());
         return AhHelper.O00000000(genericContainerScreen)
            || var2.contains(var3)
            || var2.contains("мои товары")
            || var2.contains("мои предметы")
            || var2.contains("поиск:");
      } else {
         return false;
      }
   }

   private boolean O00000000OOO() {
      return System.currentTimeMillis() - this.O00000000OOO0O >= 1200L;
   }

   private void O00000000(long l) {
      O0000000000.player.networkHandler.sendChatCommand("ah sellgui " + l);
      this.O00000000OOO0O = System.currentTimeMillis();
   }

   private void O00000000OOO0() {
      this.O00000000OO00O = false;
      this.O00000000OO0O = 0;
      this.O00000000OO0O0 = 0;
      if (this.O00000000OO0OO < 0) {
         this.O00000000OO0OO = 0;
      }
   }

   private String O00000000OOO00() {
      return this.O00000000OOO0O() ? "Изумрудный меч" : "Изумрудная кирка";
   }

   private boolean O00000000OOO0O() {
      return this.O000000000OO00.O000000000("Изумрудный меч");
   }

   private long O00000000OOOO() {
      return this.O0000000000(this.O000000000OO0O.O0000000000());
   }

   private long O00000000OOOO0() {
      return this.O0000000000(this.O000000000OOO.O0000000000());
   }

   private long O0000000000(String string) {
      if (string == null) {
         return 0L;
      } else {
         String var2 = string.toLowerCase(Locale.ROOT).replace(" ", "").replace("_", "").replace(",", "").replace(".", "");
         long var3 = 1L;
         if (var2.endsWith("тысяч")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 5);
         } else if (var2.endsWith("тысячи")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 6);
         } else if (var2.endsWith("тысяча")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 6);
         } else if (var2.endsWith("тыс")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 3);
         } else if (var2.endsWith("k") || var2.endsWith("к")) {
            var3 = 1000L;
            var2 = var2.substring(0, var2.length() - 1);
         } else if (var2.endsWith("m") || var2.endsWith("м")) {
            var3 = 1000000L;
            var2 = var2.substring(0, var2.length() - 1);
         }

         String var5 = var2.replaceAll("[^0-9]", "");
         if (var5.isEmpty()) {
            return 0L;
         } else {
            try {
               return Math.multiplyExact(Long.parseLong(var5), var3);
            } catch (NumberFormatException | ArithmeticException var7) {
               return 0L;
            }
         }
      }
   }

   private String O000000000(long l) {
      return l <= 0L ? "0" : Long.toString(l);
   }

   private long O00000000OOOOO() {
      return Math.max(50L, (long)Math.round(this.O000000000OOO0.O0000000000()));
   }

   private void O0000000O() {
      if (this.O00000000O0000.O000000000000(10000L)) {
         ThreadLocalRandom var1 = ThreadLocalRandom.current();
         float var2 = var1.nextFloat() * 10.0F - 5.0F;
         float var3 = var1.nextFloat() * 6.0F - 3.0F;
         O0000000000.player.setYaw(O0000000000.player.getYaw() + var2);
         O0000000000.player.setPitch(Math.max(-90.0F, Math.min(90.0F, O0000000000.player.getPitch() + var3)));
         this.O00000000O0000.O00000000();
      }
   }

   private void O0000000O0() {
      this.O00000000O00 = MoneyFarm.W94.IDLE;
      this.O00000000O00OO = null;
      this.O00000000O0O = MoneyFarm.W93.ITEM;
      this.O00000000O0O0 = 0;
      this.O00000000O0O00 = 0;
      this.O00000000O0O0O = 0;
      this.O00000000O0OO = 0;
      this.O00000000O0OO0 = 0;
      this.O00000000O0OOO = false;
      this.O00000000OO = false;
      this.O00000000OO0 = false;
      this.O00000000OO00 = false;
      this.O00000000OO000 = false;
      this.O00000000OO00O = false;
      this.O00000000OO0O = 0;
      this.O00000000OO0O0 = 0;
      this.O00000000OO0OO = 0;
      this.O00000000OOO = 0;
      this.O00000000OOO0 = false;
      this.O00000000OOO00 = 0;
      this.O00000000OOO0O = 0L;
      this.O00000000OOOO = 0L;
      this.O00000000O000.O00000000();
      this.O00000000O0000.O00000000();
      this.O00000000O000O.O00000000();
      this.O00000000O00O.O00000000();
      this.O00000000O00O0.O00000000();
   }

   private void O00000000000(String string) {
      this.O0000000000000(string);
      this.O0000000O00();
   }

   private void O0000000O00() {
      this.O00000000O00 = MoneyFarm.W94.IDLE;
      this.O00000000OOO00 = 0;
      this.O00000000O000.O00000000();
   }

   private void O0000000O000() {
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }
   }

   private boolean O0000000000(long l) {
      if (O0000000000.currentScreen == null) {
         this.O00000000OOO00 = 0;
         return true;
      } else if (!this.O00000000O000.O000000000000(l)) {
         return false;
      } else {
         this.O0000000O000();
         this.O00000000OOO00++;
         if (this.O00000000OOO00 >= 20) {
            O0000000000.setScreen(null);
            this.O00000000OOO00 = 0;
            return true;
         } else {
            this.O00000000O000.O00000000();
            return false;
         }
      }
   }

   private String O000000000000(String string) {
      return string == null ? "" : string.replaceAll("(?i)§.", "").replaceAll("(?i)&.", "").toLowerCase(Locale.ROOT).trim();
   }

   private void O0000000000000(String string) {
      if (this.O00000000O0.O0000000000() && O0000000000.player != null) {
         ChatUtil.O00000000("§8[§aMoneyFarm§8] §f" + string);
      }
   }

   static enum W93 {
      ITEM,
      PLANKS,
      STICKS;
   }

   static enum W94 {
      IDLE,
      BUY_WOOD_SEARCHING,
      BUY_WOOD_WAITING_AUCTION,
      BUY_WOOD_READING_AUCTION,
      BUY_WOOD_WAITING_CONFIRM,
      BUY_WOOD_CONFIRMING,
      BUY_WOOD_CLOSING,
      BUY_OPENING_SHOP,
      BUY_WAITING_SHOP,
      BUY_FIND_GOLD_INGOT,
      BUY_WAITING_EMERALD_MENU,
      BUY_FIND_EMERALD,
      BUY_WAITING_CONFIRM,
      BUY_CLICK_LIME_PANE,
      BUY_CLOSING_SHOP,
      CHECK_SELL_GUI_OPENING,
      CHECK_SELL_GUI_WAITING,
      CHECK_SELL_GUI_READING,
      FINDING_CRAFTING_TABLE,
      AIMING_CRAFTING_TABLE,
      OPENING_CRAFTING_TABLE,
      PLACING_ITEMS,
      TAKING_RESULT,
      CLOSING_CRAFTING,
      SELLING,
      WAITING_SELL_RESULT,
      RESALE_SEARCH_OWN_AH,
      RESALE_WAITING_OWN_AH,
      RESALE_TAKE_ITEM,
      RESALE_CLOSING,
      RESALE_SELLING,
      RESALE_WAIT_SELL_RESULT;
   }
}

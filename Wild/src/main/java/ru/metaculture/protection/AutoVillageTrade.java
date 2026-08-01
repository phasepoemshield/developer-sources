package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import lombok.Generated;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.gui.screen.ingame.MerchantScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.SelectMerchantTradeC2SPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.MerchantScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoVillageTrade",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически покупает товары у жителей",
   O00000000000 = {O0000000OO0OOO.VIP}
)
public class AutoVillageTrade extends Module {
   private static final String O000000000O00 = "Золотой слиток";
   private static final String O000000000O000 = "Редстоун";
   private static final String O000000000O00O = "Лазурит";
   private static final String O000000000O0O = "Жемчуг Эндера";
   private static final String O000000000O0O0 = "Бутылочка опыта";
   private static final String O000000000O0OO = "Стекло";
   private static final String O000000000OO = "Бирка";
   private static final String O000000000OO0 = "Стрелы";
   private static final String O000000000OO00 = "Хлеб";
   private static final String O000000000OO0O = "Золотая морковь";
   private static final String O000000000OOO = "Кварцевый блок";
   private static final String O000000000OOO0 = "Седло";
   private static final long O000000000OOOO = 10000L;
   private static final int O00000000O = 2;
   private static final int O00000000O0 = 64;
   private static final long O00000000O00 = 2500L;
   private static final long O00000000O000 = 10000L;
   public final ModeSetting O000000000O = new ModeSetting(
      "Что покупать",
      "Золотой слиток",
      "Золотой слиток",
      "Редстоун",
      "Лазурит",
      "Жемчуг Эндера",
      "Бутылочка опыта",
      "Стекло",
      "Бирка",
      "Стрелы",
      "Хлеб",
      "Золотая морковь",
      "Кварцевый блок",
      "Седло"
   );
   private final NumberSetting O00000000O0000 = new NumberSetting("Макс. цена", 64.0F, 1.0F, 64.0F, 1.0F, false);
   private final NumberSetting O00000000O000O = new NumberSetting("Запас изумрудов", 64.0F, 0.0F, 2304.0F, 64.0F, false);
   private final NumberSetting O00000000O00O = new NumberSetting("Радиус жителя", 4.0F, 2.0F, 8.0F, 0.5F, false);
   private final NumberSetting O00000000O00O0 = new NumberSetting("Задержка (мс)", 120.0F, 50.0F, 1000.0F, 10.0F, false);
   private final NumberSetting O00000000O00OO = new NumberSetting("КД рескана (сек)", 45.0F, 5.0F, 300.0F, 5.0F, false);
   private final BooleanSetting O00000000O0O = new BooleanSetting("Авто-изумруды", true);
   private final KeybindSetting O00000000O0O0 = new KeybindSetting("Точка", -1);
   private final KeybindSetting O00000000O0O00 = new KeybindSetting("Сундук", -1);
   private final O0000000OOOO00 O00000000O0O0O = new O0000000OOOO00("Сброс точек", 0, this::O0000000000OOO) {
      @Override
      public void O00000000000() {
         AutoVillageTrade.this.O0000000000OO0();
      }
   };
   public final BooleanSetting O000000000O0 = new BooleanSetting("Не отображать экран", false);
   private static BlockPos O00000000O0OO;
   private static BlockPos O00000000O0OO0;
   private static BlockPos O00000000O0OOO;
   private final O000000OO O00000000OO = new O000000OO();
   private final O0000O00O0000 O00000000OO0 = new O0000O00O0000();
   private final O0000O00O000 O00000000OO00 = new O0000O00O000();
   private final Map<UUID, AutoVillageTrade.W78> O00000000OO000 = new HashMap<>();
   private final List<BlockPos> O00000000OO00O = new ArrayList<>();
   private AutoVillageTrade.W76 O00000000OO0O = AutoVillageTrade.W76.IDLE;
   private UUID O00000000OO0O0;
   private int O00000000OO0OO = -1;
   private int O00000000OOO;
   private int O00000000OOO0;
   private int O00000000OOO00;
   private long O00000000OOO0O;
   private long O00000000OOOO;
   private BlockPos O00000000OOOO0;
   private int O00000000OOOOO = -1;
   private Boolean O0000000O;
   private Boolean O0000000O0;
   private String O0000000O00 = "Золотой слиток";
   private int O0000000O000 = -1;
   private int O0000000O0000;
   private int O0000000O00000 = -1;
   private long O0000000O0000O;
   private Screen O0000000O000O;

   public AutoVillageTrade() {
      this.O00000000(
         new Setting[]{
            this.O00000000O0O0,
            this.O00000000O0O00,
            this.O00000000O0O0O,
            this.O000000000O,
            this.O00000000O0000,
            this.O00000000O000O,
            this.O00000000O00O,
            this.O00000000O00O0,
            this.O00000000O00OO,
            this.O00000000O0O,
            this.O000000000O0
         }
      );
   }

   public AutoVillageTrade.W77 O00000000(VillagerEntity villagerEntity) {
      if (this.O0000000000000 && villagerEntity != null) {
         AutoVillageTrade.W78 var2 = this.O00000000OO000.get(villagerEntity.getUuid());
         if (var2 != null && var2.O00000000000OO && var2.O0000000000000 != Integer.MAX_VALUE) {
            int var3 = Math.max(0, (var2.O00000000000O0 - var2.O00000000000O) * var2.O000000000000O);
            boolean var4 = !var2.O0000000000O && var2.O0000000000000 <= this.O00000000OOO0O() && var3 > 0;
            ItemStack var5 = new ItemStack(this.O00000000OOO(), Math.max(1, Math.min(99, var3)));
            return new AutoVillageTrade.W77(var5, var2.O0000000000000, var2.O000000000000O, var3, var4);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O00000000000(false);
      this.O0000000O00 = this.O000000000O.O0000000000();
      this.O00000000O0O0O();
      this.O00000000O0O0();
      if (this.O00000000OO00O.isEmpty()) {
         this.O000000000("Установи две точки маршрута через бинд «Точка».");
      } else {
         this.O00000000O0000();
      }
   }

   @Override
   public void O000000000() {
      this.O00000000O0O00();
      this.O00000000O0OO();
      this.O00000000OO.O00000000();
      this.O00000000000(true);
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O0O0 o0000000O0O0) {
      if (O0000000000.player != null && this.O00000000OO00.O00000000000(300L)) {
         if (o0000000O0O0.O00000000000() == this.O00000000O0O00.O0000000000()) {
            this.O0000000000OO();
            this.O00000000OO00.O00000000();
         } else if (o0000000O0O0.O00000000000() == this.O00000000O0O0.O0000000000()) {
            if (this.O00000000OOO00 == 0) {
               O00000000O0OO = O0000000000.player.getBlockPos();
               O00000000O0OO0 = null;
               this.O00000000OOO00 = 1;
               this.O000000000("Точка 1: " + O00000000O0OO.toShortString());
            } else if (this.O00000000OOO00 == 1) {
               O00000000O0OO0 = O0000000000.player.getBlockPos();
               this.O00000000OOO00 = 2;
               this.O000000000("Точка 2: " + O00000000O0OO0.toShortString());
            } else {
               O00000000O0OO = O0000000000.player.getBlockPos();
               O00000000O0OO0 = null;
               this.O00000000OOO00 = 1;
               this.O000000000("Точки сброшены. Точка 1: " + O00000000O0OO.toShortString());
            }

            this.O00000000O0O0();
            if (this.O0000000000000 && !this.O00000000OO00O.isEmpty()) {
               this.O00000000O0000();
            }

            this.O00000000OO00.O00000000();
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00OO o0000000O00OO) {
      if (this.O000000000O0.O0000000000() && this.O00000000(o0000000O00OO.O0000000000())) {
         this.O0000000O000O = o0000000O00OO.O0000000000();
         o0000000O00OO.O00000000000();
      }
   }

   private void O0000000000OO() {
      if (O0000000000.crosshairTarget instanceof BlockHitResult var1 && O0000000000.world != null) {
         BlockPos var3 = var1.getBlockPos();
         if (!this.O000000000000(var3)) {
            this.O000000000("Это не сундук и не бочка.");
         } else {
            O00000000O0OOO = var3;
            this.O000000000("Сундук для складирования установлен: " + var3.toShortString());
         }
      } else {
         this.O000000000("Наведи прицел на сундук или бочку.");
      }
   }

   void O0000000000OO0() {
      O00000000O0OO = null;
      O00000000O0OO0 = null;
      this.O00000000OOO00 = 0;
      this.O00000000OO00O.clear();
      this.O00000000OO000.clear();
      this.O00000000OO0O0 = null;
      this.O00000000OO0OO = -1;
      this.O00000000OOO = 0;
      this.O00000000OOOO0 = null;
      this.O00000000OOOOO = -1;
      this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
      this.O00000000O0OOO();
      this.O00000000O0O00();
      this.O00000000OO0.O00000000();
      this.O000000000("Точки маршрута сброшены.");
   }

   private String O0000000000OOO() {
      if (O00000000O0OO == null && O00000000O0OO0 == null) {
         return "Точки не заданы";
      } else {
         return O00000000O0OO0 == null ? "Сбросить 1 точку" : "Сбросить 2 точки";
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null && O0000000000.getNetworkHandler() != null) {
         if (PlayerHelper.O0000000000O0()) {
            this.O00000000O0O00();
            this.O00000000OO.O00000000();
         } else {
            if (this.O00000000OO00O.isEmpty()) {
               this.O00000000O0O0();
               if (this.O00000000OO00O.isEmpty()) {
                  return;
               }

               this.O00000000O0000();
            }

            if (!this.O000000000O.O0000000000().equals(this.O0000000O00)) {
               this.O0000000O00 = this.O000000000O.O0000000000();
               this.O00000000OO000.clear();
               this.O00000000O0OOO();
               this.O00000000O0000();
            } else {
               switch (this.O00000000OO0O) {
                  case IDLE:
                     this.O000000000O();
                     break;
                  case SCAN_ROUTE:
                     this.O000000000O0();
                     break;
                  case OPEN_SCAN:
                     this.O00000000(AutoVillageTrade.W76.WAIT_SCAN_SCREEN);
                     break;
                  case WAIT_SCAN_SCREEN:
                     this.O00000000(AutoVillageTrade.W76.READ_SCAN_SCREEN, AutoVillageTrade.W76.SCAN_ROUTE);
                     break;
                  case READ_SCAN_SCREEN:
                     this.O000000000O000();
                     break;
                  case CLOSE_SCAN_SCREEN:
                     this.O000000000(AutoVillageTrade.W76.SCAN_ROUTE);
                     break;
                  case MOVE_TO_TRADE:
                     this.O000000000O00();
                     break;
                  case OPEN_TRADE:
                     this.O00000000(AutoVillageTrade.W76.WAIT_TRADE_SCREEN);
                     break;
                  case WAIT_TRADE_SCREEN:
                     this.O00000000(AutoVillageTrade.W76.BUY_TRADE, AutoVillageTrade.W76.IDLE);
                     break;
                  case BUY_TRADE:
                     this.O000000000O00O();
                     break;
                  case CLOSE_TRADE_SCREEN:
                     this.O000000000(AutoVillageTrade.W76.IDLE);
                     break;
                  case MOVE_TO_STORAGE:
                     this.O000000000O0O0();
                     break;
                  case OPEN_STORAGE:
                     this.O000000000O0OO();
                     break;
                  case WAIT_STORAGE_SCREEN:
                     this.O000000000OO();
                     break;
                  case PUT_STORAGE:
                     this.O000000000OO0();
                     break;
                  case BUY_EMERALDS_OPEN_SHOP:
                     this.O000000000OO0O();
                     break;
                  case BUY_EMERALDS_WAIT_SHOP:
                     this.O000000000OOO();
                     break;
                  case BUY_EMERALDS_FIND_GOLD:
                     this.O000000000OOO0();
                     break;
                  case BUY_EMERALDS_WAIT_MENU:
                     this.O000000000OOOO();
                     break;
                  case BUY_EMERALDS_FIND_EMERALD:
                     this.O00000000O();
                     break;
                  case BUY_EMERALDS_WAIT_CONFIRM:
                     this.O00000000O0();
                     break;
                  case BUY_EMERALDS_CONFIRM:
                     this.O00000000O00();
                     break;
                  case BUY_EMERALDS_CLOSE:
                     this.O00000000O000();
                     break;
                  case WAIT_RESTOCK:
                     this.O000000000OO00();
               }
            }
         }
      }
   }

   private void O000000000O() {
      if (this.O00000000OO00()) {
         this.O000000000O0O();
      } else if (!this.O00000000O0O.O0000000000() || !this.O00000000OO0O()) {
         AutoVillageTrade.W78 var1 = this.O00000000O00O0();
         if (var1 != null) {
            this.O00000000OO0O0 = var1.O00000000;
            this.O00000000OO0OO = var1.O000000000000;
            this.O00000000OO0O = AutoVillageTrade.W76.MOVE_TO_TRADE;
            this.O00000000OO0.O00000000();
         } else if (this.O00000000O00O()) {
            this.O00000000O0000();
         } else {
            this.O00000000OO0O = AutoVillageTrade.W76.WAIT_RESTOCK;
            this.O00000000OO0.O00000000();
         }
      } else if (!this.O00000000OO000()) {
         this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_OPEN_SHOP;
         this.O00000000OO0.O00000000();
      }
   }

   private void O000000000O0() {
      if (this.O00000000OOO >= this.O00000000OO00O.size()) {
         this.O00000000O000O();
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      } else {
         BlockPos var1 = this.O00000000OO00O.get(this.O00000000OOO);
         this.O00000000(var1, 0);
         if (this.O00000000(var1, 1.2)) {
            VillagerEntity var2 = this.O00000000000(var1);
            if (var2 == null) {
               this.O00000000OOO++;
            } else {
               this.O00000000OO0O0 = var2.getUuid();
               this.O00000000OO0OO = -1;
               this.O00000000O0O00();
               this.O00000000OO0O = AutoVillageTrade.W76.OPEN_SCAN;
               this.O00000000OO0.O00000000();
            }
         }
      }
   }

   private void O000000000O00() {
      AutoVillageTrade.W78 var1 = this.O00000000O00OO();
      if (var1 == null) {
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
      } else if (this.O000000000(Items.EMERALD) < Math.max(1, var1.O0000000000000)) {
         if (!this.O00000000OO0O0()) {
            this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
            this.O00000000OO0.O00000000();
         } else if (!this.O00000000OO000()) {
            this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_OPEN_SHOP;
            this.O00000000OO0.O00000000();
         }
      } else {
         VillagerEntity var2 = this.O00000000(var1.O00000000);
         if (var2 != null) {
            var1.O000000000 = var2.getBlockPos();
            var1.O0000000000 = var2.getId();
         }

         this.O00000000(var1.O000000000, 2);
         if (this.O00000000(var1.O000000000, (double)(this.O00000000O00O.O0000000000() + 0.5F))) {
            this.O00000000O0O00();
            this.O00000000OO0O = AutoVillageTrade.W76.OPEN_TRADE;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O00000000(AutoVillageTrade.W76 o00000000) {
      VillagerEntity var2 = this.O00000000(this.O00000000OO0O0);
      if (var2 != null && var2.isAlive()) {
         if (O0000000000.player.squaredDistanceTo(var2.getPos()) > this.O00000000(this.O00000000O00O.O0000000000() + 1.0F)) {
            this.O00000000O0O();
            this.O00000000OO0O = o00000000 == AutoVillageTrade.W76.WAIT_SCAN_SCREEN ? AutoVillageTrade.W76.SCAN_ROUTE : AutoVillageTrade.W76.IDLE;
            this.O00000000OO0.O00000000();
         } else {
            O000000O0O00OO var3 = this.O00000000(var2.getEyePos());
            this.O00000000OO.O00000000(var3, 45.0F, 45.0F, 2, 15);
            if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 7.0F)) {
               if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
                  O0000000000.interactionManager.interactEntity(O0000000000.player, var2, Hand.MAIN_HAND);
                  O0000000000.player.swingHand(Hand.MAIN_HAND);
                  this.O00000000OO0O = o00000000;
                  this.O00000000OO0.O00000000();
               }
            }
         }
      } else {
         this.O00000000O0O();
         this.O00000000OO0O = o00000000 == AutoVillageTrade.W76.WAIT_SCAN_SCREEN ? AutoVillageTrade.W76.SCAN_ROUTE : AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      }
   }

   private void O00000000(AutoVillageTrade.W76 o00000000, AutoVillageTrade.W76 o000000002) {
      if (O0000000000.player.currentScreenHandler instanceof MerchantScreenHandler) {
         this.O00000000OO0O = o00000000;
         this.O00000000OO0.O00000000();
      } else {
         if (this.O00000000OO0.O000000000000(2500L)) {
            this.O00000000O0O();
            this.O00000000OO0O = o000000002;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O000000000O000() {
      if (O0000000000.player.currentScreenHandler instanceof MerchantScreenHandler var1) {
         this.O00000000(this.O00000000OO0O0, var1.getRecipes());
         this.O00000000O0OOO();
         this.O00000000OO0O = AutoVillageTrade.W76.CLOSE_SCAN_SCREEN;
         this.O00000000OO0.O00000000();
      } else {
         this.O00000000OO0O = AutoVillageTrade.W76.SCAN_ROUTE;
         this.O00000000OO0.O00000000();
      }
   }

   private void O000000000O00O() {
      if (!(O0000000000.player.currentScreenHandler instanceof MerchantScreenHandler var1)) {
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      } else {
         AutoVillageTrade.W78 var5 = this.O00000000(this.O00000000OO0O0, var1.getRecipes());
         if (var5 != null && var5.O00000000000OO && var5.O000000000000 >= 0 && !var5.O0000000000O && var5.O0000000000000 <= this.O00000000OOO0O()) {
            this.O00000000OO0OO = var5.O000000000000;
            if (this.O000000000(Items.EMERALD) < var5.O0000000000000) {
               this.O00000000O0OOO();
               if (!this.O00000000OO0O0()) {
                  this.O00000000OO0O = AutoVillageTrade.W76.CLOSE_TRADE_SCREEN;
                  this.O00000000OO0.O00000000();
               } else if (!this.O00000000OO000()) {
                  this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_OPEN_SHOP;
                  this.O00000000OO0.O00000000();
               }
            } else if (this.O0000000000(this.O00000000OOO())) {
               if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
                  var1.setRecipeIndex(this.O00000000OO0OO);
                  var1.switchTo(this.O00000000OO0OO);
                  O0000000000.getNetworkHandler().sendPacket(new SelectMerchantTradeC2SPacket(this.O00000000OO0OO));
                  Slot var3 = var1.getSlot(2);
                  if (var3.hasStack() && var3.getStack().isOf(this.O00000000OOO())) {
                     int var4 = Math.max(1, var3.getStack().getCount());
                     O0000000000.interactionManager.clickSlot(var1.syncId, 2, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
                     var5.O0000000000O0O += var4;
                     var5.O0000000000OO = var5.O0000000000OO + var5.O0000000000000;
                     var5.O0000000000O00 = System.currentTimeMillis();
                     this.O00000000OO0.O00000000();
                  } else {
                     this.O00000000OO0.O00000000();
                  }
               }
            } else {
               if (O00000000O0OOO != null && this.O000000000(this.O00000000OOO()) > 0) {
                  this.O00000000O0OOO();
                  this.O000000000O0O();
               } else {
                  this.O000000000("Инвентарь заполнен. Установи сундук для складирования.");
                  this.O00000000O0OOO();
                  this.O00000000OO0O = AutoVillageTrade.W76.CLOSE_TRADE_SCREEN;
               }

               this.O00000000OO0.O00000000();
            }
         } else {
            this.O00000000O0OOO();
            this.O00000000OO0O = AutoVillageTrade.W76.CLOSE_TRADE_SCREEN;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O000000000(AutoVillageTrade.W76 o00000000) {
      if (this.O00000000OO0.O000000000000(150L)) {
         if (this.O00000000OO0()) {
            this.O00000000O0OOO();
            this.O00000000OO0.O00000000();
         } else {
            this.O00000000OO0O = o00000000;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O000000000O0O() {
      if (O00000000O0OOO == null) {
         this.O000000000("Сундук для складирования не установлен.");
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      } else if (!this.O000000000000(O00000000O0OOO)) {
         this.O000000000("Сундук для складирования недоступен.");
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      } else {
         this.O00000000O0O00();
         this.O00000000O0OOO();
         this.O0000000O000 = -1;
         this.O0000000O0000 = 0;
         this.O00000000OO0O = AutoVillageTrade.W76.MOVE_TO_STORAGE;
         this.O00000000OO0.O00000000();
      }
   }

   private void O000000000O0O0() {
      if (O00000000O0OOO != null && this.O000000000000(O00000000O0OOO)) {
         this.O00000000(O00000000O0OOO, 2);
         if (this.O00000000(O00000000O0OOO, 3.5)) {
            this.O00000000O0O00();
            this.O00000000OO0O = AutoVillageTrade.W76.OPEN_STORAGE;
            this.O00000000OO0.O00000000();
         }
      } else {
         this.O000000000("Сундук для складирования недоступен.");
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      }
   }

   private void O000000000O0OO() {
      if (O00000000O0OOO == null || !this.O000000000000(O00000000O0OOO)) {
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      } else if (this.O00000000OO() != null) {
         this.O00000000OO0O = AutoVillageTrade.W76.PUT_STORAGE;
         this.O00000000OO0.O00000000();
      } else if (this.O00000000O0OO0()) {
         this.O00000000OO0.O00000000();
      } else {
         O000000O0O00OO var1 = this.O00000000(Vec3d.ofCenter(O00000000O0OOO));
         this.O00000000OO.O00000000(var1, 35.0F, 35.0F, 4, 15);
         if (!(new O000000O0O00OO(O0000000000.player).O00000000(var1) > 4.0F)) {
            if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
               this.O0000000000000(O00000000O0OOO);
               this.O00000000OO0O = AutoVillageTrade.W76.WAIT_STORAGE_SCREEN;
               this.O00000000OO0.O00000000();
            }
         }
      }
   }

   private void O000000000OO() {
      if (this.O00000000OO() != null) {
         this.O00000000OO0O = AutoVillageTrade.W76.PUT_STORAGE;
         this.O00000000OO0.O00000000();
      } else {
         if (this.O00000000OO0.O000000000000(2500L)) {
            this.O00000000OO0O = AutoVillageTrade.W76.OPEN_STORAGE;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O000000000OO0() {
      GenericContainerScreen var1 = this.O00000000OO();
      if (var1 == null) {
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
      } else {
         int var2 = this.O000000000(this.O00000000OOO());
         if (var2 <= 0) {
            this.O00000000O0OOO();
            this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
            this.O00000000OO0.O00000000();
         } else if (this.O00000000OO0.O000000000000(150L)) {
            if (this.O0000000O000 == var2) {
               this.O0000000O0000++;
               if (this.O0000000O0000 >= 5) {
                  this.O000000000("Сундук заполнен или предмет не перекладывается.");
                  this.O00000000O0OOO();
                  this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
                  this.O00000000OO0.O00000000();
                  return;
               }
            } else {
               this.O0000000O0000 = 0;
            }

            int var3 = this.O00000000(var1);
            if (var3 == -1) {
               this.O00000000O0OOO();
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            } else {
               this.O0000000O000 = var2;
               O0000000000.interactionManager
                  .clickSlot(((GenericContainerScreenHandler)var1.getScreenHandler()).syncId, var3, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O00000000OO0.O00000000();
            }
         }
      }
   }

   private void O000000000OO00() {
      BlockPos var1 = this.O00000000OOO0();
      if (var1 != null && !this.O00000000(var1, 1.5)) {
         this.O00000000(var1, 0);
      } else {
         this.O00000000O0O00();
      }

      if (this.O00000000OO0.O000000000000(this.O00000000OOOO0())) {
         this.O00000000O0000();
      }
   }

   private void O000000000OO0O() {
      if (!this.O00000000OO0O0()) {
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
      } else if (!this.O00000000OO000()) {
         if (this.O00000000OO0()) {
            this.O00000000O0OOO();
            this.O00000000OO0.O00000000();
         } else if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
            O0000000000.player.networkHandler.sendChatCommand("shop");
            this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_WAIT_SHOP;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O000000000OOO() {
      if (!this.O00000000OO000()) {
         if (this.O00000000OO() != null) {
            this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_FIND_GOLD;
            this.O00000000OO0.O00000000();
         } else {
            if (this.O00000000OO0.O000000000000(10000L)) {
               this.O000000000("Таймаут открытия /shop.");
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            }
         }
      }
   }

   private void O000000000OOO0() {
      if (!this.O00000000OO000()) {
         if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
            GenericContainerScreen var1 = this.O00000000OO();
            if (var1 == null) {
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            } else {
               int var2 = this.O00000000(var1, Items.GOLD_INGOT);
               if (var2 != -1) {
                  this.O00000000(var1, var2, 0, SlotActionType.PICKUP);
                  this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_WAIT_MENU;
                  this.O00000000OO0.O00000000();
               } else {
                  if (this.O00000000OO0.O000000000000(5000L)) {
                     this.O000000000("В /shop не найден раздел золотого слитка.");
                     this.O00000000O0OOO();
                     this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
                     this.O00000000OO0.O00000000();
                  }
               }
            }
         }
      }
   }

   private void O000000000OOOO() {
      if (!this.O00000000OO000()) {
         if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
            if (this.O00000000OO() == null) {
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            } else {
               this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_FIND_EMERALD;
               this.O00000000OO0.O00000000();
            }
         }
      }
   }

   private void O00000000O() {
      if (!this.O00000000OO000()) {
         if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
            GenericContainerScreen var1 = this.O00000000OO();
            if (var1 == null) {
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            } else {
               int var2 = this.O000000000(var1);
               if (var2 != -1) {
                  this.O00000000(var1, var2, 1, SlotActionType.PICKUP);
                  this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_WAIT_CONFIRM;
                  this.O00000000OO0.O00000000();
               } else {
                  if (this.O00000000OO0.O000000000000(5000L)) {
                     this.O000000000("В /shop не найден слот изумрудов.");
                     this.O00000000O0OOO();
                     this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
                     this.O00000000OO0.O00000000();
                  }
               }
            }
         }
      }
   }

   private void O00000000O0() {
      if (!this.O00000000OO000()) {
         if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
            if (this.O00000000OO() == null) {
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            } else {
               this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_CONFIRM;
               this.O00000000OO0.O00000000();
            }
         }
      }
   }

   private void O00000000O00() {
      if (!this.O00000000OO000()) {
         if (this.O00000000OO0.O000000000000(this.O00000000OOO00())) {
            GenericContainerScreen var1 = this.O00000000OO();
            if (var1 == null) {
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            } else {
               int var2 = this.O00000000(var1.getScreenHandler());
               if (var2 != -1) {
                  this.O0000000O00000 = this.O000000000(Items.EMERALD);
                  this.O00000000(var1, var2, 0, SlotActionType.PICKUP);
                  this.O00000000OO0O = AutoVillageTrade.W76.BUY_EMERALDS_CLOSE;
                  this.O00000000OO0.O00000000();
               } else {
                  if (this.O00000000OO0.O000000000000(5000L)) {
                     this.O000000000("Не найден слот подтверждения покупки изумрудов.");
                     this.O00000000O0OOO();
                     this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
                     this.O00000000OO0.O00000000();
                  }
               }
            }
         }
      }
   }

   private void O00000000O000() {
      if (this.O00000000OO0.O000000000000(250L)) {
         this.O00000000O0OOO();
         if (this.O0000000O00000 < 0 || this.O000000000(Items.EMERALD) > this.O0000000O00000) {
            this.O0000000O00000 = -1;
            if (O00000000O0OOO != null && this.O000000000(this.O00000000OOO()) > 0) {
               this.O000000000O0O();
            } else {
               this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
               this.O00000000OO0.O00000000();
            }
         } else if (this.O00000000OO0.O000000000000(2500L)) {
            this.O000000000("Покупка изумрудов не изменила инвентарь. Повтор временно остановлен.");
            this.O0000000O00000 = -1;
            this.O0000000O0000O = System.currentTimeMillis() + 10000L;
            this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O00000000O0000() {
      this.O00000000OOO0++;
      this.O00000000OOO = 0;
      this.O00000000OO0O0 = null;
      this.O00000000OO0OO = -1;
      this.O00000000OOOO0 = null;
      this.O00000000OO0O = AutoVillageTrade.W76.SCAN_ROUTE;
      this.O00000000OO0.O00000000();
      this.O000000000("Сканирую жителей: " + this.O000000000O.O0000000000() + ".");
   }

   private void O00000000O000O() {
      this.O00000000OOO0O = System.currentTimeMillis();
      this.O0000000000(false);
   }

   private boolean O00000000O00O() {
      if (this.O00000000OO000.isEmpty()) {
         return true;
      } else {
         long var1 = System.currentTimeMillis();
         return var1 - this.O00000000OOO0O >= this.O00000000OOOO0()
            ? true
            : this.O00000000OO000
               .values()
               .stream()
               .anyMatch(o0000000000 -> o0000000000.O0000000000O && var1 - o0000000000.O0000000000O0 >= this.O00000000OOOO0());
      }
   }

   private AutoVillageTrade.W78 O00000000(UUID uUID, TradeOfferList tradeOfferList) {
      if (uUID != null && tradeOfferList != null) {
         AutoVillageTrade.W78 var3 = this.O00000000OO000.computeIfAbsent(uUID, AutoVillageTrade.W78::new);
         VillagerEntity var4 = this.O00000000(uUID);
         if (var4 != null) {
            var3.O0000000000 = var4.getId();
            var3.O000000000 = var4.getBlockPos();
         }

         var3.O00000000000 = this.O00000000OOO0;
         var3.O0000000000O0 = System.currentTimeMillis();
         var3.O00000000000OO = false;
         var3.O000000000000 = -1;
         var3.O0000000000000 = Integer.MAX_VALUE;
         var3.O000000000000O = 1;
         var3.O0000000000O = true;
         Item var5 = this.O00000000OOO();

         for (int var6 = 0; var6 < tradeOfferList.size(); var6++) {
            TradeOffer var7 = (TradeOffer)tradeOfferList.get(var6);
            ItemStack var8 = var7.getSellItem();
            if (!var8.isEmpty() && var8.isOf(var5)) {
               int var9 = this.O00000000(var7);
               int var10 = Math.max(1, var8.getCount());
               boolean var11 = !var3.O00000000000OO || this.O00000000(var9, var10) < this.O00000000(var3.O0000000000000, var3.O000000000000O);
               if (var11) {
                  var3.O00000000000OO = true;
                  var3.O000000000000 = var6;
                  var3.O0000000000000 = var9;
                  var3.O000000000000O = var10;
                  var3.O00000000000O = var7.getUses();
                  var3.O00000000000O0 = var7.getMaxUses();
                  var3.O0000000000O = var7.isDisabled() || var9 > this.O00000000OOO0O();
               }
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private int O00000000(TradeOffer tradeOffer) {
      int var2 = 0;
      ItemStack var3 = tradeOffer.getDisplayedFirstBuyItem();
      ItemStack var4 = tradeOffer.getDisplayedSecondBuyItem();
      if (!var3.isEmpty() && var3.isOf(Items.EMERALD)) {
         var2 += var3.getCount();
      }

      if (!var4.isEmpty() && var4.isOf(Items.EMERALD)) {
         var2 += var4.getCount();
      }

      return var2 <= 0 ? Integer.MAX_VALUE : var2;
   }

   private AutoVillageTrade.W78 O00000000O00O0() {
      int var1 = this.O000000000(Items.EMERALD);
      boolean var2 = this.O00000000OO0O0();
      return this.O00000000OO000
         .values()
         .stream()
         .filter(
            o0000000000 -> o0000000000.O00000000000OO
               && !o0000000000.O0000000000O
               && o0000000000.O000000000000 >= 0
               && o0000000000.O0000000000000 <= this.O00000000OOO0O()
         )
         .filter(o0000000000 -> var1 >= o0000000000.O0000000000000 || var2)
         .min(
            Comparator.<AutoVillageTrade.W78>comparingDouble(o0000000000 -> this.O00000000(o0000000000.O0000000000000, o0000000000.O000000000000O))
               .thenComparingDouble(o0000000000 -> this.O00000000000O(o0000000000.O000000000))
         )
         .orElse(null);
   }

   private VillagerEntity O00000000000(BlockPos blockPos) {
      VillagerEntity var2 = null;
      double var3 = Double.MAX_VALUE;
      double var5 = this.O00000000(this.O00000000O00O.O0000000000());

      for (Entity var8 : O0000000000.world.getEntities()) {
         if (var8 instanceof VillagerEntity var9 && var9.isAlive()) {
            AutoVillageTrade.W78 var10 = this.O00000000OO000.get(var9.getUuid());
            if (var10 == null || var10.O00000000000 != this.O00000000OOO0) {
               double var11 = this.O00000000(blockPos.getX() + 0.5 - var9.getX())
                  + this.O00000000(blockPos.getY() + 0.5 - var9.getY())
                  + this.O00000000(blockPos.getZ() + 0.5 - var9.getZ());
               if (!(var11 > var5) && !(var11 >= var3)) {
                  var2 = var9;
                  var3 = var11;
               }
            }
         }
      }

      return var2;
   }

   private VillagerEntity O00000000(UUID uUID) {
      if (uUID != null && O0000000000.world != null) {
         for (Entity var3 : O0000000000.world.getEntities()) {
            if (var3 instanceof VillagerEntity var4 && uUID.equals(var4.getUuid())) {
               return var4;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private AutoVillageTrade.W78 O00000000O00OO() {
      return this.O00000000OO0O0 == null ? null : this.O00000000OO000.get(this.O00000000OO0O0);
   }

   private void O00000000O0O() {
      if (this.O00000000OO0O0 != null) {
         AutoVillageTrade.W78 var1 = this.O00000000OO000.computeIfAbsent(this.O00000000OO0O0, AutoVillageTrade.W78::new);
         var1.O0000000000O = true;
         var1.O0000000000O0 = System.currentTimeMillis();
         var1.O00000000000 = this.O00000000OOO0;
      }
   }

   private void O00000000O0O0() {
      this.O00000000OO00O.clear();
      if (O00000000O0OO != null && O00000000O0OO0 != null) {
         int var1 = O00000000O0OO0.getX() - O00000000O0OO.getX();
         int var2 = O00000000O0OO0.getZ() - O00000000O0OO.getZ();
         int var3 = Math.max(Math.abs(var1), Math.abs(var2));
         if (var3 == 0) {
            this.O00000000OO00O.add(O00000000O0OO);
         } else {
            for (int var4 = 0; var4 <= var3; var4++) {
               int var5 = O00000000O0OO.getX() + Math.round(var1 * ((float)var4 / var3));
               int var6 = O00000000O0OO.getZ() + Math.round(var2 * ((float)var4 / var3));
               BlockPos var7 = new BlockPos(var5, O00000000O0OO.getY(), var6);
               if (this.O00000000OO00O.isEmpty() || !this.O00000000OO00O.get(this.O00000000OO00O.size() - 1).equals(var7)) {
                  this.O00000000OO00O.add(var7);
               }
            }
         }
      }
   }

   private void O00000000(BlockPos blockPos, int i) {
      IBaritone var3 = BaritoneAPI.getProvider().getPrimaryBaritone();
      if (!blockPos.equals(this.O00000000OOOO0) || i != this.O00000000OOOOO || !var3.getCustomGoalProcess().isActive()) {
         this.O00000000OOOO0 = blockPos;
         this.O00000000OOOOO = i;
         if (i > 0) {
            var3.getCustomGoalProcess().setGoalAndPath(new GoalNear(blockPos, i));
         } else {
            var3.getCustomGoalProcess().setGoalAndPath(new GoalBlock(blockPos));
         }
      }
   }

   private void O00000000O0O00() {
      this.O00000000OOOO0 = null;
      this.O00000000OOOOO = -1;

      try {
         BaritoneAPI.getProvider().getPrimaryBaritone().getPathingBehavior().cancelEverything();
      } catch (Throwable var2) {
      }
   }

   private void O00000000O0O0O() {
      this.O0000000O = (Boolean)BaritoneAPI.getSettings().allowBreak.value;
      this.O0000000O0 = (Boolean)BaritoneAPI.getSettings().allowPlace.value;
      BaritoneAPI.getSettings().allowBreak.value = false;
      BaritoneAPI.getSettings().allowPlace.value = false;
   }

   private void O00000000O0OO() {
      if (this.O0000000O != null) {
         BaritoneAPI.getSettings().allowBreak.value = this.O0000000O;
      }

      if (this.O0000000O0 != null) {
         BaritoneAPI.getSettings().allowPlace.value = this.O0000000O0;
      }

      this.O0000000O = null;
      this.O0000000O0 = null;
   }

   private int O00000000(GenericContainerScreen genericContainerScreen, Item item) {
      int var3 = this.O0000000000(genericContainerScreen);

      for (int var4 = 0; var4 < var3; var4++) {
         Slot var5 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var4);
         if (var5.hasStack() && var5.getStack().isOf(item)) {
            return var4;
         }
      }

      return -1;
   }

   private int O00000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O0000000000(genericContainerScreen);
      DefaultedList var3 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots;

      for (int var4 = var2; var4 < var3.size(); var4++) {
         Slot var5 = (Slot)var3.get(var4);
         if (var5.hasStack() && var5.getStack().isOf(this.O00000000OOO())) {
            return var4;
         }
      }

      return -1;
   }

   private int O000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = this.O0000000000(genericContainerScreen);

      for (int var3 = 0; var3 < var2; var3++) {
         Slot var4 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getSlot(var3);
         if (var4.hasStack()) {
            ItemStack var5 = var4.getStack();
            String var6 = this.O00000000(var5.getName().getString());
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

   private int O00000000(ScreenHandler screenHandler) {
      int var2 = Math.min(screenHandler.slots.size(), Math.max(0, screenHandler.slots.size() - 36));

      for (int var3 = var2 - 1; var3 >= 0; var3--) {
         ItemStack var4 = screenHandler.getSlot(var3).getStack();
         String var5 = this.O00000000(var4.getName().getString());
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

   private void O00000000(GenericContainerScreen genericContainerScreen, int i, int j, SlotActionType slotActionType) {
      O0000000000.interactionManager
         .clickSlot(((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).syncId, i, j, slotActionType, O0000000000.player);
   }

   private int O0000000000(GenericContainerScreen genericContainerScreen) {
      int var2 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).getRows();
      int var3 = ((GenericContainerScreenHandler)genericContainerScreen.getScreenHandler()).slots.size();
      return Math.max(0, Math.min(var2 * 9, var3));
   }

   private boolean O000000000000(BlockPos blockPos) {
      return O0000000000.world != null && blockPos != null
         ? O0000000000.world.getBlockEntity(blockPos) instanceof ChestBlockEntity || O0000000000.world.getBlockEntity(blockPos) instanceof BarrelBlockEntity
         : false;
   }

   private void O0000000000000(BlockPos blockPos) {
      if (O0000000000.player != null && O0000000000.interactionManager != null && blockPos != null) {
         Direction var2 = this.O000000000000O(blockPos);
         Vec3d var3 = new Vec3d(
            blockPos.getX() + 0.5 + var2.getOffsetX() * 0.5, blockPos.getY() + 0.5 + var2.getOffsetY() * 0.5, blockPos.getZ() + 0.5 + var2.getOffsetZ() * 0.5
         );
         BlockHitResult var4 = new BlockHitResult(var3, var2, blockPos, false);
         O0000000000.player.swingHand(Hand.MAIN_HAND);
         O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var4);
      }
   }

   private Direction O000000000000O(BlockPos blockPos) {
      Vec3d var2 = Vec3d.ofCenter(blockPos);
      Vec3d var3 = O0000000000.player.getEyePos().subtract(var2);
      return Direction.getFacing(var3.x, var3.y, var3.z);
   }

   private boolean O00000000O0OO0() {
      int var1 = O0000000000.player.getInventory().getSelectedSlot();
      ItemStack var2 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var1);
      if (!this.O00000000(var2)) {
         return false;
      } else {
         for (int var3 = 0; var3 < 9; var3++) {
            ItemStack var4 = (ItemStack)O0000000000.player.getInventory().getMainStacks().get(var3);
            if (var4.isEmpty() || !this.O00000000(var4)) {
               O0000000000.player.getInventory().setSelectedSlot(var3);
               return true;
            }
         }

         return false;
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      if (itemStack != null && !itemStack.isEmpty()) {
         String var2 = itemStack.getName().getString();
         return itemStack.getItem() == Items.TRIPWIRE_HOOK || var2.contains("[★]");
      } else {
         return false;
      }
   }

   private void O00000000O0OOO() {
      if (O0000000000.player != null && (O0000000000.currentScreen != null || ScreenUtil.O00000000(O0000000000))) {
         O0000000000.player.closeHandledScreen();
      }

      this.O0000000O000O = null;
   }

   private GenericContainerScreen O00000000OO() {
      GenericContainerScreen var1 = ScreenUtil.O00000000(O0000000000, this.O0000000O000O, GenericContainerScreen.class);
      if (var1 == null && this.O0000000O000O instanceof GenericContainerScreen) {
         this.O0000000O000O = null;
      }

      return var1;
   }

   private boolean O00000000OO0() {
      return ScreenUtil.O000000000(O0000000000, this.O0000000O000O) || ScreenUtil.O00000000(O0000000000);
   }

   private boolean O00000000(Screen screen) {
      return !(screen instanceof GenericContainerScreen) && !(screen instanceof MerchantScreen)
         ? false
         : this.O00000000OO0O != AutoVillageTrade.W76.IDLE
            && this.O00000000OO0O != AutoVillageTrade.W76.WAIT_RESTOCK
            && this.O00000000OO0O != AutoVillageTrade.W76.SCAN_ROUTE
            && this.O00000000OO0O != AutoVillageTrade.W76.MOVE_TO_TRADE
            && this.O00000000OO0O != AutoVillageTrade.W76.MOVE_TO_STORAGE;
   }

   private boolean O00000000OO00() {
      return O00000000O0OOO != null && this.O000000000(this.O00000000OOO()) > 0 && !this.O0000000000(this.O00000000OOO());
   }

   private boolean O00000000OO000() {
      if (this.O00000000OO00O()) {
         return false;
      } else if (O00000000O0OOO != null && this.O000000000(this.O00000000OOO()) > 0) {
         this.O00000000O0OOO();
         this.O000000000O0O();
         return true;
      } else {
         this.O000000000("Недостаточно места для покупки изумрудов.");
         this.O0000000O0000O = System.currentTimeMillis() + 10000L;
         this.O00000000O0OOO();
         this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
         this.O00000000OO0.O00000000();
         return true;
      }
   }

   private boolean O00000000OO00O() {
      return this.O00000000(Items.EMERALD) >= 64;
   }

   private boolean O00000000OO0O() {
      return this.O00000000OO0OO() ? false : this.O000000000(Items.EMERALD) < this.O00000000OOOO();
   }

   private boolean O00000000OO0O0() {
      return this.O00000000O0O.O0000000000() && !this.O00000000OO0OO();
   }

   private boolean O00000000OO0OO() {
      return System.currentTimeMillis() < this.O0000000O0000O;
   }

   private int O00000000(Item item) {
      if (O0000000000.player == null) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = new ItemStack(item).getMaxCount();

         for (int var4 = 0; var4 < 36; var4++) {
            ItemStack var5 = O0000000000.player.getInventory().getStack(var4);
            if (var5.isEmpty()) {
               var2 += var3;
            } else if (var5.isOf(item)) {
               var2 += Math.max(0, var5.getMaxCount() - var5.getCount());
            }
         }

         return var2;
      }
   }

   private int O000000000(Item item) {
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

   private boolean O0000000000(Item item) {
      for (int var2 = 0; var2 < 36; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (var3.isEmpty()) {
            return true;
         }

         if (var3.isOf(item) && var3.getCount() < var3.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private Item O00000000OOO() {
      String var1 = this.O000000000O.O0000000000();

      return switch (var1) {
         case "Редстоун" -> Items.REDSTONE;
         case "Лазурит" -> Items.LAPIS_LAZULI;
         case "Жемчуг Эндера" -> Items.ENDER_PEARL;
         case "Бутылочка опыта" -> Items.EXPERIENCE_BOTTLE;
         case "Стекло" -> Items.GLASS;
         case "Бирка" -> Items.NAME_TAG;
         case "Стрелы" -> Items.ARROW;
         case "Хлеб" -> Items.BREAD;
         case "Золотая морковь" -> Items.GOLDEN_CARROT;
         case "Кварцевый блок" -> Items.QUARTZ_BLOCK;
         case "Седло" -> Items.SADDLE;
         default -> Items.GOLD_INGOT;
      };
   }

   private void O0000000000(boolean bl) {
      long var2 = System.currentTimeMillis();
      if (bl || var2 - this.O00000000OOOO >= 1000L) {
         this.O00000000OOOO = var2;
         List var4 = this.O00000000OO000
            .values()
            .stream()
            .filter(o0000000000 -> o0000000000.O00000000000OO)
            .sorted(
               Comparator.<AutoVillageTrade.W78>comparingDouble(o0000000000 -> this.O00000000(o0000000000.O0000000000000, o0000000000.O000000000000O))
                  .thenComparingInt(o0000000000 -> o0000000000.O0000000000)
            )
            .toList();
         if (var4.isEmpty()) {
            this.O000000000("Скан завершен: подходящих сделок нет.");
         } else {
            AutoVillageTrade.W78 var5 = (AutoVillageTrade.W78)var4.get(0);
            long var6 = var4.stream().filter(o0000000000 -> !((AutoVillageTrade.W78)o0000000000).O0000000000O && ((AutoVillageTrade.W78)o0000000000).O0000000000000 <= this.O00000000OOO0O()).count();
            this.O000000000(
               "Скан завершен: найдено "
                  + var4.size()
                  + ", доступно сейчас "
                  + var6
                  + ", лучший курс "
                  + var5.O0000000000000
                  + " изумр. за "
                  + var5.O000000000000O
                  + " шт."
            );
         }
      }
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = vec3d.x - var2.x;
      double var5 = vec3d.y - var2.y;
      double var7 = vec3d.z - var2.z;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new O000000O0O00OO(var11, MathHelper.clamp(var12, -90.0F, 90.0F));
   }

   private boolean O00000000(BlockPos blockPos, double d) {
      return this.O00000000000O(blockPos) <= d * d;
   }

   private double O00000000000O(BlockPos blockPos) {
      return O0000000000.player != null && blockPos != null
         ? O0000000000.player.getPos().squaredDistanceTo(blockPos.getX() + 0.5, blockPos.getY(), blockPos.getZ() + 0.5)
         : Double.MAX_VALUE;
   }

   private BlockPos O00000000OOO0() {
      return O00000000O0OO != null && O00000000O0OO0 != null
         ? new BlockPos((O00000000O0OO.getX() + O00000000O0OO0.getX()) / 2, O00000000O0OO.getY(), (O00000000O0OO.getZ() + O00000000O0OO0.getZ()) / 2)
         : O00000000O0OO;
   }

   private double O00000000(int i, int j) {
      return (double)i / Math.max(1, j);
   }

   private double O00000000(double d) {
      return d * d;
   }

   private long O00000000OOO00() {
      return Math.max(50L, (long)Math.round(this.O00000000O00O0.O0000000000()));
   }

   private int O00000000OOO0O() {
      return Math.max(1, Math.round(this.O00000000O0000.O0000000000()));
   }

   private int O00000000OOOO() {
      return Math.max(0, Math.round(this.O00000000O000O.O0000000000()));
   }

   private long O00000000OOOO0() {
      return Math.max(1000L, (long)Math.round(this.O00000000O00OO.O0000000000() * 1000.0F));
   }

   private String O00000000(String string) {
      return string == null ? "" : string.toLowerCase(Locale.ROOT).replace("§", "");
   }

   private void O00000000000(boolean bl) {
      this.O00000000OO0O = AutoVillageTrade.W76.IDLE;
      this.O00000000OO0O0 = null;
      this.O00000000OO0OO = -1;
      this.O00000000OOO = 0;
      this.O00000000OOOO0 = null;
      this.O00000000OOOOO = -1;
      this.O0000000O000 = -1;
      this.O0000000O0000 = 0;
      this.O0000000O00000 = -1;
      this.O0000000O0000O = 0L;
      this.O0000000O000O = null;
      if (bl) {
         this.O00000000OO00O.clear();
      }

      this.O00000000OO0.O00000000();
   }

   private void O000000000(String string) {
      ChatUtil.O00000000("§8[§aAutoVillageTrade§8] §f" + string);
   }

   @Generated
   public static BlockPos O0000000000O0() {
      return O00000000O0OO;
   }

   @Generated
   public static void O00000000(BlockPos blockPos) {
      O00000000O0OO = blockPos;
   }

   @Generated
   public static BlockPos O0000000000O00() {
      return O00000000O0OO0;
   }

   @Generated
   public static void O000000000(BlockPos blockPos) {
      O00000000O0OO0 = blockPos;
   }

   @Generated
   public static BlockPos O0000000000O0O() {
      return O00000000O0OOO;
   }

   @Generated
   public static void O0000000000(BlockPos blockPos) {
      O00000000O0OOO = blockPos;
   }

   static enum W76 {
      IDLE,
      SCAN_ROUTE,
      OPEN_SCAN,
      WAIT_SCAN_SCREEN,
      READ_SCAN_SCREEN,
      CLOSE_SCAN_SCREEN,
      MOVE_TO_TRADE,
      OPEN_TRADE,
      WAIT_TRADE_SCREEN,
      BUY_TRADE,
      CLOSE_TRADE_SCREEN,
      MOVE_TO_STORAGE,
      OPEN_STORAGE,
      WAIT_STORAGE_SCREEN,
      PUT_STORAGE,
      BUY_EMERALDS_OPEN_SHOP,
      BUY_EMERALDS_WAIT_SHOP,
      BUY_EMERALDS_FIND_GOLD,
      BUY_EMERALDS_WAIT_MENU,
      BUY_EMERALDS_FIND_EMERALD,
      BUY_EMERALDS_WAIT_CONFIRM,
      BUY_EMERALDS_CONFIRM,
      BUY_EMERALDS_CLOSE,
      WAIT_RESTOCK;
   }

   public record W77(ItemStack itemStack, int price, int itemCount, int availableAmount, boolean ready) {
   }

   static final class W78 {
      final UUID O00000000;
      BlockPos O000000000;
      int O0000000000;
      int O00000000000 = -1;
      int O000000000000 = -1;
      int O0000000000000 = Integer.MAX_VALUE;
      int O000000000000O = 1;
      int O00000000000O;
      int O00000000000O0;
      boolean O00000000000OO;
      boolean O0000000000O = true;
      long O0000000000O0;
      long O0000000000O00;
      int O0000000000O0O;
      int O0000000000OO;

      private W78(UUID uUID) {
         this.O00000000 = uUID;
      }
   }
}

package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import net.minecraft.block.entity.BrewingStandBlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.screen.BrewingStandScreenHandler;
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

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "AutoPottBot",
   O0000000000 = Category.Misc,
   O000000000 = ""
)
public class AutoPottBot extends Module {
   private static final long O000000000OO0O = 20000L;
   private static final long O000000000OOO = 1500L;
   private static final long O000000000OOO0 = 4000L;
   private static final long O000000000OOOO = 1600L;
   private static final long O00000000O = 8000L;
   private static final long O00000000O0 = 15000L;
   private static final int O00000000O00 = 3;
   private static final int O00000000O000 = 4;
   private static final int O00000000O0000 = 5;
   private static final int O00000000O000O = 3;
   private static final int O00000000O00O = 3;
   private static final int O00000000O00O0 = 5;
   public static volatile boolean O000000000O;
   public static volatile String O000000000O0 = "—";
   public static volatile int O000000000O00;
   public static volatile int O000000000O000;
   public static volatile int O000000000O00O;
   public static volatile int O000000000O0O;
   public static volatile int O000000000O0O0;
   public static volatile int O000000000O0OO;
   public static volatile int[] O000000000OO = new int[7];
   public static volatile List<AutoPottBot.W73> O000000000OO0 = List.of();
   public static volatile List<String> O000000000OO00 = List.of();
   private final BooleanSetting O00000000O00OO = new BooleanSetting("Зелье силы", true);
   private final BooleanSetting O00000000O0O = new BooleanSetting("Зелье скорости", false);
   private final BooleanSetting O00000000O0O0 = new BooleanSetting("Зелье огнестойкости", false);
   private final GroupSetting O00000000O0O00 = new GroupSetting("Варить", this.O00000000O00OO, this.O00000000O0O, this.O00000000O0O0);
   private final NumberSetting O00000000O0O0O = new NumberSetting("Задержка кликов", 120.0F, 30.0F, 600.0F, 10.0F, false);
   private final NumberSetting O00000000O0OO = new NumberSetting("Радиус варок", 4.5F, 2.0F, 6.0F, 0.5F, false);
   private final BooleanSetting O00000000O0OO0 = new BooleanSetting("Наполнять бутылки", true);
   private final NumberSetting O00000000O0OOO = new NumberSetting("Буфер воды", 12.0F, 3.0F, 24.0F, 1.0F, false);
   private final BooleanSetting O00000000OO = new BooleanSetting("Складывать в сундук", true);
   private final O0000O00O0000 O00000000OO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO00 = new O0000O00O0000();
   private final Map<BlockPos, AutoPottBot.W72> O00000000OO000 = new LinkedHashMap<>();
   private final Map<String, Long> O00000000OO00O = new HashMap<>();
   private AutoPottBot.W69 O00000000OO0O = AutoPottBot.W69.SCAN;
   private BlockPos O00000000OO0O0;
   private BlockPos O00000000OO0OO;
   private BlockPos O00000000OOO;
   private int O00000000OOO0;
   private int O00000000OOO00;
   private int O00000000OOO0O;
   private long O00000000OOOO;
   private int O00000000OOOO0;

   public AutoPottBot() {
      this.O00000000(new Setting[]{this.O00000000O0O00, this.O00000000O0O0O, this.O00000000O0OO, this.O00000000O0OO0, this.O00000000O0OOO, this.O00000000OO});
   }

   @Override
   public void O00000000() {
      this.O0000000000O0();
      O000000000O = true;
      super.O00000000();
   }

   @Override
   public void O000000000() {
      O000000000O = false;
      if (O0000000000.player != null
         && (
            O0000000000.player.currentScreenHandler instanceof BrewingStandScreenHandler
               || O0000000000.player.currentScreenHandler instanceof GenericContainerScreenHandler
         )) {
         O0000000000.player.closeHandledScreen();
      }

      this.O0000000000O0();
      super.O000000000();
   }

   private void O0000000000O0() {
      this.O00000000OO0O = AutoPottBot.W69.SCAN;
      this.O00000000OO0O0 = null;
      this.O00000000OO0OO = null;
      this.O00000000OOO = null;
      this.O00000000OOOO = 0L;
      this.O00000000OOO00 = 0;
      this.O00000000OOOO0 = 0;
      this.O00000000OO000.clear();
      this.O00000000OO00O.clear();
      this.O00000000OO0.O00000000();
      this.O00000000OO00.O00000000();
      O000000000OO0 = List.of();
      O000000000OO00 = List.of();
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         this.O0000000000O00();
         switch (this.O00000000OO0O) {
            case SCAN:
               this.O0000000000O0O();
               break;
            case OPENING:
               this.O0000000000OO0();
               break;
            case SERVICING:
               this.O0000000000OOO();
               break;
            case CLOSING:
               this.O000000000O();
               break;
            case FILL_WATER:
               this.O000000000O0();
               break;
            case DEPOSIT_OPEN:
               this.O000000000O0O0();
               break;
            case DEPOSIT_MOVE:
               this.O000000000O0OO();
         }

         this.O00000000O00();
      }
   }

   private void O0000000000O00() {
      long var1 = System.currentTimeMillis();
      int var3 = (int)Math.ceil(this.O00000000O0OO.O0000000000() + 4.0);
      BlockPos var4 = O0000000000.player.getBlockPos();

      for (int var5 = -var3; var5 <= var3; var5++) {
         for (int var6 = -var3; var6 <= var3; var6++) {
            for (int var7 = -var3; var7 <= var3; var7++) {
               BlockPos var8 = var4.add(var5, var6, var7);
               if (O0000000000.world.getBlockEntity(var8) instanceof BrewingStandBlockEntity) {
                  AutoPottBot.W72 var9 = this.O00000000OO000.get(var8);
                  if (var9 == null) {
                     this.O00000000OO000.put(var8.toImmutable(), new AutoPottBot.W72(var8.toImmutable()));
                  } else {
                     var9.O00000000000OO = var1;
                  }
               }
            }
         }
      }

      Iterator var10 = this.O00000000OO000.entrySet().iterator();

      while (var10.hasNext()) {
         AutoPottBot.W72 var11 = (AutoPottBot.W72)((Entry)var10.next()).getValue();
         if (O0000000000.world.getBlockEntity(var11.O00000000) instanceof BrewingStandBlockEntity) {
            var11.O00000000000OO = var1;
         } else if (var1 - var11.O00000000000OO > 8000L) {
            var10.remove();
         }
      }
   }

   private void O0000000000O0O() {
      if (!(O0000000000.player.currentScreenHandler instanceof BrewingStandScreenHandler)
         && !(O0000000000.player.currentScreenHandler instanceof GenericContainerScreenHandler)) {
         if (this.O00000000OO.O0000000000() && this.O000000000OOO0() <= 3 && this.O000000000OOOO() > 0) {
            BlockPos var1 = this.O00000000O0();
            if (var1 != null) {
               this.O00000000OO0OO = var1;
               this.O00000000OO0O = AutoPottBot.W69.DEPOSIT_OPEN;
               this.O00000000OO00.O00000000();
               this.O00000000OO0.O00000000();
               return;
            }
         }

         if (this.O00000000O0OO0.O0000000000()
            && this.O000000000(Items.GLASS_BOTTLE) > 0
            && this.O00000000O() < 3
            && System.currentTimeMillis() >= this.O00000000OOOO) {
            int var7 = this.O000000000O00();
            int var2 = this.O00000000O();
            int var3 = Math.min((int)this.O00000000O0OOO.O0000000000(), Math.max(3, var7));
            int var4 = Math.max(0, this.O000000000OOO0() - 5);
            int var5 = Math.min(var3, var2 + var4);
            if (var7 > 0 && var5 > var2) {
               BlockPos var6 = this.O000000000O000();
               if (var6 != null) {
                  if (this.O000000000O00O()) {
                     this.O00000000OOO = var6;
                     this.O00000000OOO0 = var5;
                     this.O00000000OOO00 = 0;
                     this.O00000000OOO0O = var2;
                     this.O00000000OO0O = AutoPottBot.W69.FILL_WATER;
                     this.O00000000OO0.O00000000();
                     return;
                  }

                  this.O00000000("Бутылочки в хотбар");
               }
            }
         }

         AutoPottBot.W72 var8 = this.O0000000000OO();
         if (var8 != null) {
            this.O00000000OO0O0 = var8.O00000000;
            this.O00000000OO0O = AutoPottBot.W69.OPENING;
            this.O00000000OO00.O00000000();
            this.O00000000OO0.O00000000();
         }
      } else {
         O0000000000.player.closeHandledScreen();
      }
   }

   private AutoPottBot.W72 O0000000000OO() {
      long var1 = System.currentTimeMillis();
      Vec3d var3 = O0000000000.player.getEyePos();
      double var4 = this.O00000000O0OO.O0000000000() * this.O00000000O0OO.O0000000000();
      boolean var6 = this.O000000000OO0O();
      AutoPottBot.W72 var7 = null;
      int var8 = -1;
      double var9 = Double.MAX_VALUE;

      for (AutoPottBot.W72 var12 : this.O00000000OO000.values()) {
         double var13 = Vec3d.ofCenter(var12.O00000000).squaredDistanceTo(var3);
         if (!(var13 > var4) && var1 >= var12.O00000000000O0 && (!var12.O0000000000000 || var1 >= var12.O00000000000O)) {
            int var15 = this.O00000000(var12, var6);
            if (var15 > 0 && (var15 > var8 || var15 == var8 && var13 < var9)) {
               var7 = var12;
               var8 = var15;
               var9 = var13;
            }
         }
      }

      return var7;
   }

   private int O00000000(AutoPottBot.W72 o000000000000, boolean bl) {
      return switch (o000000000000.O0000000000) {
         case UNKNOWN -> 2;
         case EMPTY -> bl ? 1 : 0;
         case WATER, AWKWARD, BASE -> 3;
         case FINAL -> 4;
         default -> 0;
      };
   }

   private void O0000000000OO0() {
      if (O0000000000.player.currentScreenHandler instanceof BrewingStandScreenHandler) {
         this.O00000000OO0O = AutoPottBot.W69.SERVICING;
         this.O00000000OO0.O00000000();
      } else if (this.O00000000OO0O0 == null || !(O0000000000.world.getBlockEntity(this.O00000000OO0O0) instanceof BrewingStandBlockEntity)) {
         this.O00000000OO0O = AutoPottBot.W69.SCAN;
      } else if (this.O00000000OO00.O0000000000000(1600L)) {
         AutoPottBot.W72 var1 = this.O00000000OO000.get(this.O00000000OO0O0);
         if (var1 != null) {
            var1.O00000000000O0 = System.currentTimeMillis() + 4500L;
         }

         this.O00000000OO0O = AutoPottBot.W69.SCAN;
      } else {
         if (this.O00000000OO0.O0000000000000(450L)) {
            this.O0000000000(this.O00000000OO0O0);
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O0000000000OOO() {
      if (O0000000000.player.currentScreenHandler instanceof BrewingStandScreenHandler var1) {
         AutoPottBot.W72 var6 = this.O00000000OO000.get(this.O00000000OO0O0);
         if (var6 == null) {
            this.O00000000OO0O = AutoPottBot.W69.CLOSING;
         } else if (this.O00000000OO0.O0000000000000((long)this.O00000000O0O0O.O0000000000())) {
            this.O00000000OO0.O00000000();
            AutoPottBot.W68 var3 = this.O00000000(var1, var6);
            switch (var3) {
               case CONTINUE:
               default:
                  break;
               case BREW_STARTED:
                  long var7 = System.currentTimeMillis();
                  var6.O0000000000000 = true;
                  var6.O000000000000O = var7;
                  var6.O00000000000O = var7 + 20000L;
                  var6.O00000000000O0 = var6.O00000000000O;
                  this.O00000000OO0O = AutoPottBot.W69.CLOSING;
                  break;
               case DONE:
                  long var4 = var6.O0000000000 == AutoPottBot.W71.EMPTY ? 4000L : 1500L;
                  var6.O00000000000O0 = System.currentTimeMillis() + var4;
                  this.O00000000OO0O = AutoPottBot.W69.CLOSING;
            }
         }
      } else {
         this.O00000000OO0O = AutoPottBot.W69.SCAN;
      }
   }

   private AutoPottBot.W68 O00000000(BrewingStandScreenHandler brewingStandScreenHandler, AutoPottBot.W72 o000000000000) {
      boolean var3 = !brewingStandScreenHandler.getSlot(3).getStack().isEmpty();
      int var4 = this.O000000000(brewingStandScreenHandler, o000000000000);
      boolean var5 = var4 >= 0;
      o000000000000.O00000000000 = var5;
      o000000000000.O000000000000 = var5 ? Math.min(3, var4 + (var3 ? 1 : 0)) : 0;
      o000000000000.O0000000000 = this.O00000000(var4, var3);
      if (var3) {
         o000000000000.O0000000000000 = true;
         if (o000000000000.O00000000000O == 0L) {
            o000000000000.O000000000000O = System.currentTimeMillis();
            o000000000000.O00000000000O = o000000000000.O000000000000O + 20000L;
         }

         return AutoPottBot.W68.DONE;
      } else {
         o000000000000.O0000000000000 = false;
         if (o000000000000.O0000000000 == AutoPottBot.W71.OTHER) {
            return AutoPottBot.W68.DONE;
         } else if (o000000000000.O0000000000 == AutoPottBot.W71.FINAL) {
            if (this.O000000000OOO0() <= 0) {
               return AutoPottBot.W68.DONE;
            } else {
               for (int var10 = 0; var10 < 3; var10++) {
                  if (!brewingStandScreenHandler.getSlot(var10).getStack().isEmpty()) {
                     this.O00000000(var10);
                  }
               }

               o000000000000.O00000000000 = false;
               o000000000000.O000000000000 = 0;
               o000000000000.O0000000000 = AutoPottBot.W71.EMPTY;
               return AutoPottBot.W68.CONTINUE;
            }
         } else {
            if (!var5) {
               AutoPottBot.W70 var6 = this.O000000000OOO();
               if (var6 == null) {
                  return AutoPottBot.W68.DONE;
               }

               o000000000000.O000000000 = var6;
            }

            if (brewingStandScreenHandler.getFuel() <= 0 && brewingStandScreenHandler.getSlot(4).getStack().isEmpty() && this.O00000000(Items.BLAZE_POWDER, 4)) {
               return AutoPottBot.W68.CONTINUE;
            } else {
               if (this.O00000000(brewingStandScreenHandler)) {
                  int var8 = this.O00000000((Predicate<ItemStack>)(itemStack -> this.O00000000(itemStack, Potions.WATER)));
                  if (var8 != -1) {
                     this.O00000000(var8);
                     return AutoPottBot.W68.CONTINUE;
                  }

                  if (this.O000000000(brewingStandScreenHandler) == 0) {
                     return AutoPottBot.W68.DONE;
                  }
               }

               AutoPottBot.W70 var9 = o000000000000.O000000000 != null ? o000000000000.O000000000 : this.O000000000OOO();
               if (var9 == null) {
                  return AutoPottBot.W68.DONE;
               } else {
                  o000000000000.O000000000 = var9;

                  Item var7 = switch (o000000000000.O0000000000) {
                     case WATER -> Items.NETHER_WART;
                     case AWKWARD -> var9.O000000000;
                     case BASE -> var9.O0000000000;
                     default -> null;
                  };
                  if (var7 == null) {
                     return AutoPottBot.W68.DONE;
                  } else if (!this.O00000000(var7)) {
                     return AutoPottBot.W68.DONE;
                  } else {
                     return this.O00000000(var7, 3) ? AutoPottBot.W68.BREW_STARTED : AutoPottBot.W68.DONE;
                  }
               }
            }
         }
      }
   }

   private void O000000000O() {
      O0000000000.player.closeHandledScreen();
      this.O00000000OO0O0 = null;
      this.O00000000OO0O = AutoPottBot.W69.SCAN;
   }

   private void O000000000O0() {
      if (!(O0000000000.player.currentScreenHandler instanceof BrewingStandScreenHandler)
         && !(O0000000000.player.currentScreenHandler instanceof GenericContainerScreenHandler)) {
         if (this.O00000000O() < this.O00000000OOO0 && this.O000000000(Items.GLASS_BOTTLE) > 0) {
            if (this.O00000000OOO00 > this.O00000000OOO0 * 2 + 20) {
               if (this.O00000000O() <= this.O00000000OOO0O) {
                  this.O00000000OOOO = System.currentTimeMillis() + 6000L;
                  this.O00000000("Источник воды недосягаем");
               }

               this.O00000000OO0O = AutoPottBot.W69.SCAN;
            } else {
               if (this.O00000000OOO == null || !this.O00000000(this.O00000000OOO)) {
                  this.O00000000OOO = this.O000000000O000();
                  if (this.O00000000OOO == null) {
                     this.O00000000OO0O = AutoPottBot.W69.SCAN;
                     return;
                  }
               }

               if (!this.O000000000O0O()) {
                  this.O00000000OO0O = AutoPottBot.W69.SCAN;
               } else if (this.O00000000OO0.O0000000000000((long)this.O00000000O0O0O.O0000000000())) {
                  this.O00000000OO0.O00000000();
                  this.O000000000(this.O00000000OOO);
                  O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
                  this.O00000000OOO00++;
               }
            }
         } else {
            this.O00000000OO0O = AutoPottBot.W69.SCAN;
         }
      } else {
         O0000000000.player.closeHandledScreen();
      }
   }

   private int O000000000O00() {
      int var1 = 0;

      for (AutoPottBot.W72 var3 : this.O00000000OO000.values()) {
         if (var3.O0000000000 == AutoPottBot.W71.EMPTY || var3.O0000000000 == AutoPottBot.W71.UNKNOWN) {
            var1++;
         }
      }

      return var1 * 3;
   }

   private BlockPos O000000000O000() {
      BlockPos var1 = O0000000000.player.getBlockPos();
      int var2 = (int)Math.ceil(this.O00000000O0OO.O0000000000());
      double var3 = this.O00000000O0OO.O0000000000() * this.O00000000O0OO.O0000000000();
      Vec3d var5 = O0000000000.player.getEyePos();
      BlockPos var6 = null;
      double var7 = Double.MAX_VALUE;

      for (int var9 = -var2; var9 <= var2; var9++) {
         for (int var10 = -var2; var10 <= var2; var10++) {
            for (int var11 = -var2; var11 <= var2; var11++) {
               BlockPos var12 = var1.add(var9, var10, var11);
               if (this.O00000000(var12)) {
                  double var13 = Vec3d.ofCenter(var12).squaredDistanceTo(var5);
                  if (var13 <= var3 && var13 < var7) {
                     var7 = var13;
                     var6 = var12.toImmutable();
                  }
               }
            }
         }
      }

      return var6;
   }

   private boolean O00000000(BlockPos blockPos) {
      FluidState var2 = O0000000000.world.getFluidState(blockPos);
      return var2.isStill() && var2.isIn(FluidTags.WATER);
   }

   private boolean O000000000O00O() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).getItem() == Items.GLASS_BOTTLE) {
            return true;
         }
      }

      return false;
   }

   private boolean O000000000O0O() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).getItem() == Items.GLASS_BOTTLE) {
            if (O0000000000.player.getInventory().getSelectedSlot() != var1) {
               O0000000000.player.getInventory().setSelectedSlot(var1);
            }

            return true;
         }
      }

      return false;
   }

   private void O000000000(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double var3 = blockPos.getX() + 0.5 - var2.x;
      double var5 = blockPos.getY() + 0.5 - var2.y;
      double var7 = blockPos.getZ() + 0.5 - var2.z;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.toDegrees(Math.atan2(var7, var3)) - 90.0);
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      O0000000000.player.setYaw(var11);
      O0000000000.player.setPitch(Math.max(-90.0F, Math.min(90.0F, var12)));
   }

   private void O00000000(String string) {
      long var2 = System.currentTimeMillis();
      Long var4 = this.O00000000OO00O.get(string);
      if (var4 == null || var2 - var4 > 15000L) {
         this.O00000000OO00O.put(string, var2);
         ChatUtil.O00000000("§8[AutoPottBot] §c" + string);
      }
   }

   private void O000000000O0O0() {
      if (O0000000000.player.currentScreenHandler instanceof GenericContainerScreenHandler) {
         this.O00000000OO0O = AutoPottBot.W69.DEPOSIT_MOVE;
         this.O00000000OO0.O00000000();
      } else if (this.O00000000OO0OO == null || !(O0000000000.world.getBlockEntity(this.O00000000OO0OO) instanceof ChestBlockEntity)) {
         this.O00000000OO0O = AutoPottBot.W69.SCAN;
      } else if (this.O00000000OO00.O0000000000000(1600L)) {
         this.O00000000OO0O = AutoPottBot.W69.SCAN;
      } else {
         if (this.O00000000OO0.O0000000000000(450L)) {
            this.O0000000000(this.O00000000OO0OO);
            this.O00000000OO0.O00000000();
         }
      }
   }

   private void O000000000O0OO() {
      if (O0000000000.player.currentScreenHandler instanceof GenericContainerScreenHandler var1) {
         if (this.O00000000OO0.O0000000000000((long)this.O00000000O0O0O.O0000000000())) {
            this.O00000000OO0.O00000000();
            int var4 = var1.getRows() * 9;

            for (int var3 = var4; var3 < var1.slots.size(); var3++) {
               if (this.O0000000000(((Slot)var1.slots.get(var3)).getStack())) {
                  this.O00000000(var3, 0, SlotActionType.QUICK_MOVE);
                  return;
               }
            }

            O0000000000.player.closeHandledScreen();
            this.O00000000OO0OO = null;
            this.O00000000OO0O = AutoPottBot.W69.SCAN;
         }
      } else {
         this.O00000000OO0O = AutoPottBot.W69.SCAN;
      }
   }

   private List<AutoPottBot.W70> O000000000OO() {
      ArrayList var1 = new ArrayList(3);
      if (this.O00000000O00OO.O0000000000()) {
         var1.add(AutoPottBot.W70.STRENGTH);
      }

      if (this.O00000000O0O.O0000000000()) {
         var1.add(AutoPottBot.W70.SWIFTNESS);
      }

      if (this.O00000000O0O0.O0000000000()) {
         var1.add(AutoPottBot.W70.FIRE_RESISTANCE);
      }

      return var1;
   }

   private Map<Item, Integer> O000000000OO0() {
      HashMap var1 = new HashMap();

      for (AutoPottBot.W72 var3 : this.O00000000OO000.values()) {
         if (var3.O00000000000 && var3.O000000000 != null) {
            if (var3.O000000000000 < 1) {
               O00000000(var1, Items.NETHER_WART, 1);
            }

            if (var3.O000000000000 < 2) {
               O00000000(var1, var3.O000000000.O000000000, 1);
            }

            if (var3.O000000000000 < 3) {
               O00000000(var1, var3.O000000000.O0000000000, 1);
            }
         }
      }

      return var1;
   }

   private List<AutoPottBot.W70> O000000000OO00() {
      Map var1 = this.O000000000OO0();
      int var2 = this.O00000000O();
      ArrayList var3 = new ArrayList(3);

      for (AutoPottBot.W70 var5 : this.O000000000OO()) {
         int var6 = this.O000000000(Items.NETHER_WART) - (int)(Integer)var1.getOrDefault(Items.NETHER_WART, 0);
         int var7 = this.O000000000(var5.O000000000) - (int)(Integer)var1.getOrDefault(var5.O000000000, 0);
         int var8 = this.O000000000(var5.O0000000000) - (int)(Integer)var1.getOrDefault(var5.O0000000000, 0);
         if (var2 >= 1 && var6 >= 1 && var7 >= 1 && var8 >= 1) {
            var3.add(var5);
         }
      }

      return var3;
   }

   private boolean O000000000OO0O() {
      return !this.O000000000OO00().isEmpty();
   }

   private AutoPottBot.W70 O000000000OOO() {
      List var1 = this.O000000000OO00();
      if (var1.isEmpty()) {
         return null;
      } else {
         AutoPottBot.W70 var2 = (AutoPottBot.W70)var1.get(Math.floorMod(this.O00000000OOOO0, var1.size()));
         this.O00000000OOOO0++;
         return var2;
      }
   }

   private int O000000000(BrewingStandScreenHandler brewingStandScreenHandler, AutoPottBot.W72 o000000000000) {
      RegistryEntry var3 = null;
      int var4 = 0;

      for (int var5 = 0; var5 < 3; var5++) {
         ItemStack var6 = brewingStandScreenHandler.getSlot(var5).getStack();
         if (var6.getItem() == Items.POTION) {
            var4++;
            if (var3 == null) {
               var3 = this.O000000000(var6);
            }
         }
      }

      if (var4 == 0 || var3 == null) {
         return -1;
      } else if (this.O00000000(var3, Potions.WATER)) {
         return 0;
      } else if (this.O00000000(var3, Potions.AWKWARD)) {
         return 1;
      } else {
         for (AutoPottBot.W70 var8 : AutoPottBot.W70.values()) {
            if (this.O00000000(var3, var8.O000000000000)) {
               o000000000000.O000000000 = var8;
               return 3;
            }

            if (this.O00000000(var3, var8.O00000000000)) {
               o000000000000.O000000000 = var8;
               return 2;
            }
         }

         return -2;
      }
   }

   private AutoPottBot.W71 O00000000(int i, boolean bl) {
      return switch (i) {
         case -1 -> AutoPottBot.W71.EMPTY;
         case 0 -> AutoPottBot.W71.WATER;
         case 1 -> AutoPottBot.W71.AWKWARD;
         case 2 -> AutoPottBot.W71.BASE;
         case 3 -> AutoPottBot.W71.FINAL;
         default -> AutoPottBot.W71.OTHER;
      };
   }

   private boolean O00000000(BrewingStandScreenHandler brewingStandScreenHandler) {
      for (int var2 = 0; var2 < 3; var2++) {
         if (brewingStandScreenHandler.getSlot(var2).getStack().isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private int O000000000(BrewingStandScreenHandler brewingStandScreenHandler) {
      int var2 = 0;

      for (int var3 = 0; var3 < 3; var3++) {
         if (!brewingStandScreenHandler.getSlot(var3).getStack().isEmpty()) {
            var2++;
         }
      }

      return var2;
   }

   private boolean O00000000(Item item, int i) {
      int var3 = this.O00000000((Predicate<ItemStack>)(itemStack -> itemStack.getItem() == item));
      if (var3 == -1) {
         return false;
      } else {
         this.O00000000(var3, 0, SlotActionType.PICKUP);
         this.O00000000(i, 1, SlotActionType.PICKUP);
         this.O00000000(var3, 0, SlotActionType.PICKUP);
         return true;
      }
   }

   private int O00000000(Predicate<ItemStack> predicate) {
      ScreenHandler var2 = O0000000000.player.currentScreenHandler;

      for (int var3 = 5; var3 < var2.slots.size(); var3++) {
         ItemStack var4 = ((Slot)var2.slots.get(var3)).getStack();
         if (!var4.isEmpty() && predicate.test(var4)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean O00000000(Item item) {
      return this.O00000000((Predicate<ItemStack>)(itemStack -> itemStack.getItem() == item)) != -1;
   }

   private boolean O00000000(ItemStack itemStack, RegistryEntry<Potion> registryEntry) {
      if (itemStack.getItem() != Items.POTION) {
         return false;
      } else {
         RegistryEntry var3 = this.O000000000(itemStack);
         return var3 != null && this.O00000000(var3, registryEntry);
      }
   }

   private boolean O00000000(ItemStack itemStack) {
      return itemStack.getItem() == Items.POTION || itemStack.getItem() == Items.SPLASH_POTION || itemStack.getItem() == Items.LINGERING_POTION;
   }

   private RegistryEntry<Potion> O000000000(ItemStack itemStack) {
      PotionContentsComponent var2 = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
      return var2 != null && !var2.potion().isEmpty() ? (RegistryEntry)var2.potion().get() : null;
   }

   private boolean O00000000(RegistryEntry<Potion> registryEntry, RegistryEntry<Potion> registryEntry2) {
      return registryEntry == registryEntry2
         || registryEntry.getKey().isPresent()
            && registryEntry2.getKey().isPresent()
            && ((RegistryKey)registryEntry.getKey().get()).equals(registryEntry2.getKey().get());
   }

   private int O000000000OOO0() {
      int var1 = 0;

      for (int var2 = 0; var2 < O0000000000.player.getInventory().size(); var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isEmpty()) {
            var1++;
         }
      }

      return var1;
   }

   private boolean O0000000000(ItemStack itemStack) {
      if (!this.O00000000(itemStack)) {
         return false;
      } else {
         RegistryEntry var2 = this.O000000000(itemStack);
         return var2 == null ? false : !this.O00000000(var2, Potions.WATER) && !this.O00000000(var2, Potions.AWKWARD);
      }
   }

   private int O000000000OOOO() {
      int var1 = 0;

      for (int var2 = 0; var2 < O0000000000.player.getInventory().size(); var2++) {
         if (this.O0000000000(O0000000000.player.getInventory().getStack(var2))) {
            var1++;
         }
      }

      return var1;
   }

   private int O000000000(Item item) {
      int var2 = 0;

      for (int var3 = 0; var3 < O0000000000.player.getInventory().size(); var3++) {
         ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
         if (var4.getItem() == item) {
            var2 += var4.getCount();
         }
      }

      return var2;
   }

   private int O00000000O() {
      int var1 = 0;

      for (int var2 = 0; var2 < O0000000000.player.getInventory().size(); var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (var3.getItem() == Items.POTION) {
            RegistryEntry var4 = this.O000000000(var3);
            if (var4 != null && this.O00000000(var4, Potions.WATER)) {
               var1 += var3.getCount();
            }
         }
      }

      return var1;
   }

   private BlockPos O00000000O0() {
      BlockPos var1 = O0000000000.player.getBlockPos();
      int var2 = (int)Math.ceil(this.O00000000O0OO.O0000000000() + 1.0);
      BlockPos var3 = null;
      double var4 = Double.MAX_VALUE;
      Vec3d var6 = O0000000000.player.getEyePos();

      for (int var7 = -var2; var7 <= var2; var7++) {
         for (int var8 = -var2; var8 <= var2; var8++) {
            for (int var9 = -var2; var9 <= var2; var9++) {
               BlockPos var10 = var1.add(var7, var8, var9);
               if (O0000000000.world.getBlockEntity(var10) instanceof ChestBlockEntity) {
                  double var11 = Vec3d.ofCenter(var10).squaredDistanceTo(var6);
                  if (var11 < var4) {
                     var4 = var11;
                     var3 = var10.toImmutable();
                  }
               }
            }
         }
      }

      return var3;
   }

   private void O0000000000(BlockPos blockPos) {
      Vec3d var2 = new Vec3d(blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5);
      BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, blockPos, false);
      O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var3);
   }

   private void O00000000(int i) {
      this.O00000000(i, 0, SlotActionType.QUICK_MOVE);
   }

   private void O00000000(int i, int j, SlotActionType slotActionType) {
      O0000000000.interactionManager.clickSlot(O0000000000.player.currentScreenHandler.syncId, i, j, slotActionType, O0000000000.player);
   }

   private void O00000000O00() {
      long var1 = System.currentTimeMillis();
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      ArrayList var6 = new ArrayList(this.O00000000OO000.size());

      for (AutoPottBot.W72 var8 : this.O00000000OO000.values()) {
         if (var8.O0000000000 == AutoPottBot.W71.FINAL) {
            var5++;
         } else if (var8.O0000000000000 && var1 < var8.O00000000000O) {
            var3++;
         } else if (var8.O0000000000 != AutoPottBot.W71.OTHER) {
            var4++;
         }

         var6.add(new AutoPottBot.W73(var8.O000000000(), var8.O00000000(), var8.O00000000(var1), var8.O000000000(var1)));
      }

      var6.sort((o0000000000000, o00000000000002) -> Float.compare(((AutoPottBot.W73)o00000000000002).progress(), ((AutoPottBot.W73)o0000000000000).progress()));
      O000000000OO = new int[]{
         this.O00000000O(),
         this.O000000000(Items.NETHER_WART),
         this.O000000000(Items.BLAZE_POWDER),
         this.O000000000(Items.GLOWSTONE_DUST),
         this.O000000000(Items.SUGAR),
         this.O000000000(Items.MAGMA_CREAM),
         this.O000000000(Items.REDSTONE)
      };
      O000000000O0OO = this.O000000000(Items.GLASS_BOTTLE);
      O000000000O00 = this.O00000000OO000.size();
      O000000000O000 = var3;
      O000000000O00O = var4;
      O000000000O0O = var5;
      O000000000O0O0 = this.O00000000O000();
      O000000000OO0 = var6;
      O000000000O0 = this.O00000000OO0O.O00000000;
      O000000000OO00 = this.O00000000O0000();
      this.O00000000O000O();
   }

   private int O00000000O000() {
      List var1 = this.O000000000OO();
      if (var1.isEmpty()) {
         return 0;
      } else {
         Map var2 = this.O000000000OO0();
         int var3 = this.O00000000O();
         int var4 = Math.max(0, this.O000000000(Items.NETHER_WART) - (int)(Integer)var2.getOrDefault(Items.NETHER_WART, 0));
         int var5 = 0;

         for (AutoPottBot.W70 var7 : (List<AutoPottBot.W70>)var1) {
            int var8 = this.O000000000(var7.O000000000) - (int)(Integer)var2.getOrDefault(var7.O000000000, 0);
            int var9 = this.O000000000(var7.O0000000000) - (int)(Integer)var2.getOrDefault(var7.O0000000000, 0);
            var5 += Math.max(0, Math.min(var8, var9));
         }

         var5 = Math.min(var5, var4);
         return Math.max(0, Math.min(var3, var5 * 3));
      }
   }

   private List<String> O00000000O0000() {
      List var1 = this.O000000000OO();
      if (var1.isEmpty()) {
         return List.of("Не выбрано зелье");
      } else {
         Map var2 = this.O000000000OO0();
         ArrayList var3 = new ArrayList();
         if (this.O00000000O() < 1) {
            boolean var4 = this.O00000000O0OO0.O0000000000() && this.O000000000(Items.GLASS_BOTTLE) > 0;
            if (!var4) {
               var3.add(this.O000000000(Items.GLASS_BOTTLE) > 0 ? "Источник воды" : "Вода / Бутылочки");
            }
         }

         if (this.O000000000(Items.NETHER_WART) - (int)(Integer)var2.getOrDefault(Items.NETHER_WART, 0) < 1) {
            var3.add("Адский нарост");
         }

         for (AutoPottBot.W70 var5 : (List<AutoPottBot.W70>)var1) {
            if (this.O000000000(var5.O000000000) - (int)(Integer)var2.getOrDefault(var5.O000000000, 0) < 1) {
               O00000000(var3, var5.O000000000.getName().getString());
            }

            if (this.O000000000(var5.O0000000000) - (int)(Integer)var2.getOrDefault(var5.O0000000000, 0) < 1) {
               O00000000(var3, var5.O0000000000.getName().getString());
            }
         }

         if (this.O000000000(Items.BLAZE_POWDER) <= 0) {
            O00000000(var3, "Огненный порошок (топливо)");
         }

         return var3;
      }
   }

   private void O00000000O000O() {
      boolean var1 = false;

      for (AutoPottBot.W72 var3 : this.O00000000OO000.values()) {
         if (var3.O0000000000 == AutoPottBot.W71.EMPTY || var3.O0000000000 == AutoPottBot.W71.UNKNOWN) {
            var1 = true;
            break;
         }
      }

      if (var1 && !O000000000OO00.isEmpty()) {
         long var7 = System.currentTimeMillis();

         for (String var5 : O000000000OO00) {
            Long var6 = this.O00000000OO00O.get(var5);
            if (var6 == null || var7 - var6 > 15000L) {
               this.O00000000OO00O.put(var5, var7);
               ChatUtil.O00000000("§8[AutoPottBot] §cНе хватает: §f" + var5);
            }
         }
      }
   }

   private static void O00000000(Map<Item, Integer> map, Item item, int i) {
      map.merge(item, i, Integer::sum);
   }

   private static void O00000000(List<String> list, String string) {
      if (!list.contains(string)) {
         list.add(string);
      }
   }

   static enum W68 {
      CONTINUE,
      BREW_STARTED,
      DONE;
   }

   static enum W69 {
      SCAN("Поиск"),
      OPENING("Открытие"),
      SERVICING("Загрузка"),
      CLOSING("Закрытие"),
      FILL_WATER("Налив воды"),
      DEPOSIT_OPEN("Сундук"),
      DEPOSIT_MOVE("Разгрузка");

      final String O00000000;

      private W69(String string2) {
         this.O00000000 = string2;
      }
   }

   static enum W70 {
      STRENGTH("Сила", Items.BLAZE_POWDER, Items.GLOWSTONE_DUST, Potions.STRENGTH, Potions.STRONG_STRENGTH, 14042437),
      SWIFTNESS("Скорость", Items.SUGAR, Items.GLOWSTONE_DUST, Potions.SWIFTNESS, Potions.STRONG_SWIFTNESS, 5227511),
      FIRE_RESISTANCE("Огнестойкость", Items.MAGMA_CREAM, Items.REDSTONE, Potions.FIRE_RESISTANCE, Potions.LONG_FIRE_RESISTANCE, 16750592);

      final String O00000000;
      final Item O000000000;
      final Item O0000000000;
      final RegistryEntry<Potion> O00000000000;
      final RegistryEntry<Potion> O000000000000;
      final int O0000000000000;

      private W70(String string2, Item item, Item item2, RegistryEntry<Potion> registryEntry, RegistryEntry<Potion> registryEntry2, int j) {
         this.O00000000 = string2;
         this.O000000000 = item;
         this.O0000000000 = item2;
         this.O00000000000 = registryEntry;
         this.O000000000000 = registryEntry2;
         this.O0000000000000 = j;
      }
   }

   static enum W71 {
      UNKNOWN,
      EMPTY,
      WATER,
      AWKWARD,
      BASE,
      FINAL,
      OTHER;
   }

   static final class W72 {
      final BlockPos O00000000;
      AutoPottBot.W70 O000000000;
      AutoPottBot.W71 O0000000000 = AutoPottBot.W71.UNKNOWN;
      boolean O00000000000;
      int O000000000000;
      boolean O0000000000000;
      long O000000000000O;
      long O00000000000O;
      long O00000000000O0;
      long O00000000000OO = System.currentTimeMillis();

      W72(BlockPos blockPos) {
         this.O00000000 = blockPos;
      }

      float O00000000(long l) {
         if (this.O0000000000 == AutoPottBot.W71.FINAL) {
            return 1.0F;
         } else if (this.O0000000000000 && this.O00000000000O > this.O000000000000O) {
            float var3 = (float)(l - this.O000000000000O) / (float)(this.O00000000000O - this.O000000000000O);
            return var3 < 0.0F ? 0.0F : Math.min(var3, 1.0F);
         } else {
            return 0.0F;
         }
      }

      int O00000000() {
         if (this.O0000000000 == AutoPottBot.W71.FINAL) {
            return 5954680;
         } else {
            return this.O000000000 != null ? this.O000000000.O0000000000000 : 9868960;
         }
      }

      String O000000000() {
         return this.O000000000 != null ? this.O000000000.O00000000 : "—";
      }

      String O000000000(long l) {
         if (this.O0000000000 == AutoPottBot.W71.FINAL) {
            return this.O000000000() + " ✓";
         } else if (this.O0000000000000 && l < this.O00000000000O) {
            return this.O000000000() + " " + (int)(this.O00000000(l) * 100.0F) + "%";
         } else if (this.O0000000000 == AutoPottBot.W71.EMPTY) {
            return "Свободна";
         } else {
            return this.O0000000000 == AutoPottBot.W71.UNKNOWN ? "…" : this.O000000000() + " готова";
         }
      }
   }

   public record W73(String name, int color, float progress, String label) {
   }
}

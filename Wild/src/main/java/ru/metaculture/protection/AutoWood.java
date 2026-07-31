package ru.metaculture.protection;

import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.pathing.goals.GoalBlock;
import baritone.api.pathing.goals.GoalNear;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Queue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.entity.SignBlockEntity;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoWood",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически выращивает и добывает дерево"
)
public class AutoWood extends Module {
   public ModeSetting O000000000O = new ModeSetting("Что добывать", "Тёмный дуб", "Тропик дерево", "Тёмный дуб", "Еловое дерево");
   public ModeSetting O000000000O0 = new ModeSetting("Что делать с деревом", "Ничего", "Ничего", "Продавать на ауке", "Складывать в сундук");
   public NumberSetting O000000000O00 = new NumberSetting("Порог дерева", 64.0F, 64.0F, 640.0F, 64.0F, false)
      .O00000000(() -> this.O000000000O0.O000000000("Ничего"));
   public BooleanSetting O000000000O000 = new BooleanSetting("Чинить топор", false);
   public NumberSetting O000000000O00O = new NumberSetting("Порог для починки топора", 300.0F, 100.0F, 2031.0F, 100.0F, false)
      .O00000000(() -> !this.O000000000O000.O0000000000());
   public BooleanSetting O000000000O0O = new BooleanSetting("Пополнять муку из сундука", true);
   public NumberSetting O000000000O0O0 = new NumberSetting("Радиус поиска сундуков", 12.0F, 4.0F, 40.0F, 1.0F, false);
   private static final double O000000000O0OO = 4.5;
   private static final int O000000000OO = 6;
   private static final int O000000000OO0 = 64;
   private static final int O000000000OO00 = 128;
   private AutoWood.W79 O000000000OO0O = AutoWood.W79.SETUP;
   private final List<List<BlockPos>> O000000000OOO = new ArrayList<>();
   private boolean O000000000OOO0 = false;
   private BlockPos O000000000OOOO = null;
   private int O00000000O = 0;
   private int O00000000O0 = -1;
   private BlockPos O00000000O00 = null;
   private int O00000000O000 = 0;
   private AutoWood.W82 O00000000O0000 = AutoWood.W82.NONE;
   private int O00000000O000O = 0;
   private boolean O00000000O00O = false;
   private boolean O00000000O00O0 = false;
   private IBaritone O00000000O00OO;
   private AutoWood.W81 O00000000O0O = AutoWood.W81.NONE;
   private AutoWood.W80 O00000000O0O0 = AutoWood.W80.FIND_CHEST;
   private BlockPos O00000000O0O00 = null;
   private boolean O00000000O0O0O = false;
   private boolean O00000000O0OO = false;
   private int O00000000O0OO0 = 0;
   private boolean O00000000O0OOO = false;
   private int O00000000OO = -1;
   private int O00000000OO0 = -1;
   private float O00000000OO00 = 0.0F;
   private final O0000O00O0000 O00000000OO000 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO00O = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO0O = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO0O0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OO0OO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOO = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOO0 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOO00 = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOO0O = new O0000O00O0000();
   private final O0000O00O0000 O00000000OOOO = new O0000O00O0000();
   private final Queue<Runnable> O00000000OOOO0 = new ArrayDeque<>();

   public AutoWood() {
      this.O00000000(
         new Setting[]{
            this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O, this.O000000000O0O0
         }
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O00000000O00OO = BaritoneAPI.getProvider().getPrimaryBaritone();
      this.O000000000OO0O = AutoWood.W79.SETUP;
      this.O000000000OOO.clear();
      this.O000000000OOO0 = false;
      this.O000000000OOOO = null;
      this.O00000000O = 0;
      this.O00000000O0 = -1;
      this.O00000000O00 = null;
      this.O00000000O0000 = AutoWood.W82.NONE;
      this.O00000000O000O = 0;
      this.O00000000O00O = false;
      this.O00000000O00O0 = false;
      this.O00000000O0O00();
      this.O00000000O000 = 0;
   }

   @Override
   public void O000000000() {
      if (O0000000000.player != null && this.O00000000O0OOO) {
         try {
            O0000000000.interactionManager
               .clickSlot(O0000000000.player.playerScreenHandler.syncId, 45, this.O00000000OO, SlotActionType.SWAP, O0000000000.player);
            if (this.O00000000OO >= 0) {
               O0000000000.player.getInventory().setSelectedSlot(this.O00000000OO);
            }

            O0000000000.player.setPitch(this.O00000000OO00);
         } catch (Exception var2) {
         }
      }

      this.O00000000O0OOO = false;
      if (this.O00000000O00OO != null) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
      }

      this.O00000000O0O00();
      this.O00000000O0000 = AutoWood.W82.NONE;
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (!PlayerHelper.O0000000000O0()) {
            if (this.O00000000O0O != AutoWood.W81.NONE && O0000000000.currentScreen instanceof GenericContainerScreen var2) {
               if (this.O00000000O0O == AutoWood.W81.DEPOSIT) {
                  this.O000000000(var2);
               } else {
                  this.O00000000(var2);
               }
            } else if (this.O00000000O0O != AutoWood.W81.NONE) {
               this.O000000000OOO();
            } else if (this.O00000000O0000 != AutoWood.W82.NONE) {
               this.O000000000O0O();
            } else if (O0000000000.currentScreen == null) {
               if (!this.O000000000OOO0) {
                  this.O0000000000OOO();
               } else if (this.O000000000O000.O0000000000() && this.O00000000O0O0O() != -1) {
                  this.O00000000O0O = AutoWood.W81.REPAIR;
                  this.O000000000OO0O();
               } else if (this.O000000000O000()) {
                  this.O00000000O0000 = AutoWood.W82.EQUIP;
                  this.O00000000O000O = 0;
               } else if (this.O000000000O00O()) {
                  this.O00000000O0O = AutoWood.W81.DEPOSIT;
                  this.O000000000OO0O();
               } else {
                  this.O00000000O000++;
                  if (this.O000000000OO0O == AutoWood.W79.WAIT_FELL || this.O00000000O000 >= 2) {
                     switch (this.O000000000OO0O) {
                        case FARM:
                           this.O000000000O();
                           break;
                        case WAIT_FELL:
                           this.O000000000O00();
                           break;
                        default:
                           this.O000000000OO0O = AutoWood.W79.FARM;
                     }
                  }
               }
            }
         }
      }
   }

   private Item O0000000000O0() {
      String var1 = this.O000000000O.O0000000000();

      return switch (var1) {
         case "Тропик дерево" -> Items.JUNGLE_SAPLING;
         case "Еловое дерево" -> Items.SPRUCE_SAPLING;
         default -> Items.DARK_OAK_SAPLING;
      };
   }

   private Block O0000000000O00() {
      String var1 = this.O000000000O.O0000000000();

      return switch (var1) {
         case "Тропик дерево" -> Blocks.JUNGLE_SAPLING;
         case "Еловое дерево" -> Blocks.SPRUCE_SAPLING;
         default -> Blocks.DARK_OAK_SAPLING;
      };
   }

   private Block O0000000000O0O() {
      String var1 = this.O000000000O.O0000000000();

      return switch (var1) {
         case "Тропик дерево" -> Blocks.JUNGLE_LOG;
         case "Еловое дерево" -> Blocks.SPRUCE_LOG;
         default -> Blocks.DARK_OAK_LOG;
      };
   }

   private Block O0000000000OO() {
      String var1 = this.O000000000O.O0000000000();

      return switch (var1) {
         case "Тропик дерево" -> Blocks.JUNGLE_LEAVES;
         case "Еловое дерево" -> Blocks.SPRUCE_LEAVES;
         default -> Blocks.DARK_OAK_LEAVES;
      };
   }

   private Item O0000000000OO0() {
      String var1 = this.O000000000O.O0000000000();

      return switch (var1) {
         case "Тропик дерево" -> Items.JUNGLE_LOG;
         case "Еловое дерево" -> Items.SPRUCE_LOG;
         default -> Items.DARK_OAK_LOG;
      };
   }

   private void O0000000000OOO() {
      this.O000000000OOO.clear();
      ArrayList var1 = new ArrayList();
      this.O00000000(this.O0000000000O00(), var1, false);
      this.O00000000(this.O0000000000O0O(), var1, true);
      if (this.O000000000OOO.isEmpty()) {
         ChatUtil.O00000000("§c[AutoWood] §fПоставьте саженцы квадратами 2×2 рядом с собой и включите модуль");
         this.a_();
      } else {
         this.O000000000OOOO = O0000000000.player.getBlockPos();
         this.O000000000OOO0 = true;
         this.O000000000OO0O = AutoWood.W79.FARM;
         this.O00000000O = 0;
         this.O00000000O000 = 0;
         ChatUtil.O00000000("§a[AutoWood] §fНайдено площадок 2×2: " + this.O000000000OOO.size());
      }
   }

   private void O00000000(Block block, List<BlockPos> list, boolean bl) {
      BlockPos var4 = O0000000000.player.getBlockPos();

      for (BlockPos var6 : BlockPos.iterate(var4.add(-6, -3, -6), var4.add(6, 3, 6))) {
         if (this.O00000000(var6, block)) {
            BlockPos var7 = var6.toImmutable();
            if (!bl || O0000000000.world.getBlockState(var7.down()).getBlock() != block) {
               List var8 = List.of(var7, var7.east(), var7.south(), var7.east().south());
               boolean var9 = false;

               for (BlockPos var11 : (List<BlockPos>)var8) {
                  if (list.contains(var11)) {
                     var9 = true;
                     break;
                  }
               }

               if (!var9) {
                  boolean var13 = true;
                  Iterator var14 = var8.iterator();

                  while (true) {
                     if (var14.hasNext()) {
                        BlockPos var12 = (BlockPos)var14.next();
                        if (this.O000000000000O(var12)) {
                           continue;
                        }

                        var13 = false;
                     }

                     if (var13) {
                        this.O000000000OOO.add(new ArrayList<>(var8));
                        list.addAll(var8);
                     }
                     break;
                  }
               }
            }
         }
      }
   }

   private boolean O00000000(BlockPos blockPos, Block block) {
      return O0000000000.world.getBlockState(blockPos).getBlock() == block
         && O0000000000.world.getBlockState(blockPos.east()).getBlock() == block
         && O0000000000.world.getBlockState(blockPos.south()).getBlock() == block
         && O0000000000.world.getBlockState(blockPos.east().south()).getBlock() == block;
   }

   private void O000000000O() {
      boolean var1 = false;

      for (int var2 = 0; var2 < this.O000000000OOO.size(); var2++) {
         if (this.O00000000(var2)) {
            var1 = true;
            if (this.O000000000(var2)) {
               return;
            }
         }
      }

      if (!var1) {
         for (List var3 : this.O000000000OOO) {
            for (BlockPos var5 : (List<BlockPos>)var3) {
               BlockState var6 = O0000000000.world.getBlockState(var5);
               if (var6.getBlock() != this.O0000000000O00()) {
                  this.O00000000(var5, var6);
                  return;
               }
            }
         }

         this.O00000000O00 = null;
         this.O000000000O0();
      }
   }

   private boolean O00000000(int i) {
      for (BlockPos var3 : this.O000000000OOO.get(i)) {
         if (O0000000000.world.getBlockState(var3).getBlock() == this.O0000000000O0O()) {
            return true;
         }
      }

      return false;
   }

   private void O00000000(BlockPos blockPos, BlockState blockState) {
      if (blockState.getBlock() == this.O0000000000OO()) {
         this.O00000000(blockPos);
      } else {
         this.O00000000O00 = null;
         if (!blockState.isReplaceable()) {
            if (this.O00000000OOOO.O000000000000(15000L)) {
               ChatUtil.O00000000("§e[AutoWood] §fМесто посадки занято посторонним блоком, жду освобождения");
               this.O00000000OOOO.O00000000();
            }
         } else {
            int var3 = this.O000000000(this.O0000000000O0());
            if (var3 == -1) {
               var3 = this.O0000000000(this.O0000000000O0());
            }

            if (var3 == -1) {
               if (this.O00000000OOOO.O000000000000(15000L)) {
                  ChatUtil.O00000000("§e[AutoWood] §fНет саженцев в инвентаре, жду дроп с листвы");
                  this.O00000000OOOO.O00000000();
               }
            } else if (this.O0000000000000(blockPos.down())) {
               int var4 = O0000000000.player.getInventory().getSelectedSlot();
               O0000000000.player.getInventory().setSelectedSlot(var3);
               this.O000000000000(blockPos.down());
               O0000000000.player.getInventory().setSelectedSlot(var4);
               this.O00000000O000 = 0;
            }
         }
      }
   }

   private void O00000000(BlockPos blockPos) {
      BlockHitResult var2 = this.O00000000000O(blockPos);
      if (var2 == null) {
         this.O00000000O00 = null;
      } else {
         O000000O0O00OO var3 = this.O00000000(var2.getPos());
         O000000O0O0O0.O00000000(var3, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
         if (!(new O000000O0O00OO(O0000000000.player).O00000000(var3) > 6.0F)) {
            if (!blockPos.equals(this.O00000000O00)) {
               O0000000000.interactionManager.attackBlock(blockPos, var2.getSide());
               this.O00000000O00 = blockPos;
            } else {
               O0000000000.interactionManager.updateBlockBreakingProgress(blockPos, var2.getSide());
            }

            O0000000000.player.swingHand(Hand.MAIN_HAND);
         }
      }
   }

   private void O000000000O0() {
      if (!this.O000000000OOO.isEmpty()) {
         int var1 = this.O000000000OOO.size();

         for (int var2 = 0; var2 < var1; var2++) {
            int var3 = (this.O00000000O + var2) % var1;
            BlockPos var4 = null;

            for (BlockPos var6 : this.O000000000OOO.get(var3)) {
               if (O0000000000.world.getBlockState(var6).getBlock() == this.O0000000000O00()) {
                  var4 = var6;
                  break;
               }
            }

            if (var4 != null) {
               int var7 = this.O000000000(Items.BONE_MEAL);
               if (var7 == -1) {
                  var7 = this.O0000000000(Items.BONE_MEAL);
               }

               if (var7 == -1) {
                  if (this.O000000000O0O.O0000000000()) {
                     this.O00000000O0O = AutoWood.W81.BONEMEAL;
                     this.O000000000OO0O();
                     return;
                  }

                  ChatUtil.O00000000("§c[AutoWood] §fЗакончилась костная мука — выключаюсь");
                  this.a_();
                  return;
               }

               if (!this.O0000000000000(var4)) {
                  return;
               }

               int var8 = O0000000000.player.getInventory().getSelectedSlot();
               O0000000000.player.getInventory().setSelectedSlot(var7);
               this.O000000000000(var4);
               O0000000000.player.getInventory().setSelectedSlot(var8);
               this.O00000000O = (var3 + 1) % var1;
               this.O00000000O000 = 0;
               return;
            }
         }
      }
   }

   private boolean O000000000(int i) {
      BlockPos var2 = null;
      BlockHitResult var3 = null;

      for (BlockPos var5 : this.O000000000OOO.get(i)) {
         if (O0000000000.world.getBlockState(var5).getBlock() == this.O0000000000O0O()) {
            BlockHitResult var6 = this.O00000000000O(var5);
            if (var6 != null) {
               var2 = var5;
               var3 = var6;
               break;
            }
         }
      }

      if (var2 == null) {
         return false;
      } else {
         if (!(O0000000000.player.getMainHandStack().getItem() instanceof AxeItem)) {
            int var7 = this.O00000000O0OO();
            if (var7 == -1) {
               if (this.O00000000OOOO.O000000000000(15000L)) {
                  ChatUtil.O00000000("§e[AutoWood] §fНет топора в хотбаре, жду");
                  this.O00000000OOOO.O00000000();
               }

               return true;
            }

            O0000000000.player.getInventory().setSelectedSlot(var7);
         }

         O000000O0O00OO var8 = this.O00000000(var3.getPos());
         O000000O0O0O0.O00000000(var8, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
         if (new O000000O0O00OO(O0000000000.player).O00000000(var8) > 6.0F) {
            return true;
         } else {
            O0000000000.interactionManager.attackBlock(var2, var3.getSide());
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            this.O00000000O0 = i;
            this.O00000000OOO.O00000000();
            this.O000000000OO0O = AutoWood.W79.WAIT_FELL;
            this.O00000000O000 = 0;
            return true;
         }
      }
   }

   private void O000000000O00() {
      if (this.O00000000O0 < 0 || this.O00000000O0 >= this.O000000000OOO.size()) {
         this.O000000000OO0O = AutoWood.W79.FARM;
      } else if (!this.O00000000(this.O00000000O0)) {
         this.O00000000O0 = -1;
         this.O000000000OO0O = AutoWood.W79.FARM;
         this.O00000000O000 = 0;
      } else {
         if (this.O00000000OOO.O000000000000(2000L)) {
            this.O000000000OO0O = AutoWood.W79.FARM;
            this.O00000000O000 = 0;
         }
      }
   }

   private boolean O000000000O000() {
      if (!this.O000000000O0.O000000000("Продавать на ауке")) {
         return false;
      } else if (this.O000000000OO0O != AutoWood.W79.FARM) {
         return false;
      } else {
         if (this.O00000000O00O) {
            if (!this.O00000000OOO00.O000000000000(30000L)) {
               return false;
            }

            this.O00000000O00O = false;
         }

         return this.O00000000(this.O0000000000OO0()) >= (int)this.O000000000O00.O0000000000();
      }
   }

   private boolean O000000000O00O() {
      if (!this.O000000000O0.O000000000("Складывать в сундук")) {
         return false;
      } else if (this.O000000000OO0O != AutoWood.W79.FARM) {
         return false;
      } else {
         if (this.O00000000O00O0) {
            if (!this.O00000000OOO0O.O000000000000(30000L)) {
               return false;
            }

            this.O00000000O00O0 = false;
         }

         return this.O00000000(this.O0000000000OO0()) >= (int)this.O000000000O00.O0000000000();
      }
   }

   private void O000000000O0O() {
      switch (this.O00000000O0000) {
         case EQUIP:
            this.O000000000O0O0();
            break;
         case COMMAND:
            this.O000000000O0OO();
            break;
         case CONFIRM:
            this.O000000000OO();
            break;
         case WAIT_RESULT:
            this.O000000000OO0();
            break;
         default:
            this.O000000000OO00();
      }
   }

   private void O000000000O0O0() {
      if (O0000000000.currentScreen != null) {
         O0000000000.player.closeHandledScreen();
      } else if (this.O00000000(this.O0000000000OO0()) < 64) {
         this.O000000000OO00();
      } else {
         int var1 = -1;
         int var2 = 0;

         for (int var3 = 0; var3 < 9; var3++) {
            ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
            if (var4.getItem() == this.O0000000000OO0() && var4.getCount() > var2) {
               var1 = var3;
               var2 = var4.getCount();
            }
         }

         if (var1 != -1) {
            O0000000000.player.getInventory().setSelectedSlot(var1);
            if (O0000000000.player.getMainHandStack().getItem() == this.O0000000000OO0()) {
               this.O00000000O0000 = AutoWood.W82.COMMAND;
               this.O00000000OOO0.O00000000();
            }
         } else {
            int var7 = -1;
            var2 = 0;

            for (int var8 = 9; var8 < 36; var8++) {
               ItemStack var5 = O0000000000.player.getInventory().getStack(var8);
               if (var5.getItem() == this.O0000000000OO0() && var5.getCount() > var2) {
                  var7 = var8;
                  var2 = var5.getCount();
               }
            }

            if (var7 == -1) {
               this.O000000000OO00();
            } else {
               int var9 = this.O00000000OO000();
               if (var9 == -1) {
                  var9 = 0;
               }

               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var7, var9, SlotActionType.SWAP, O0000000000.player);
            }
         }
      }
   }

   private void O000000000O0OO() {
      if (O0000000000.player.getMainHandStack().getItem() != this.O0000000000OO0()) {
         this.O00000000O0000 = AutoWood.W82.EQUIP;
      } else if (O0000000000.currentScreen != null) {
         O0000000000.player.closeHandledScreen();
      } else {
         O0000000000.player.networkHandler.sendChatCommand("ah sell auto");
         this.O00000000OOO0.O00000000();
         this.O00000000O0000 = AutoWood.W82.CONFIRM;
      }
   }

   private void O000000000OO() {
      if (this.O00000000OOO0.O000000000000(1000L)) {
         O0000000000.player.networkHandler.sendChatCommand("ah sell auto confirm");
         this.O00000000OOO0.O00000000();
         this.O00000000O0000 = AutoWood.W82.WAIT_RESULT;
      }
   }

   private void O000000000OO0() {
      if (O0000000000.player.getMainHandStack().getItem() != this.O0000000000OO0()) {
         this.O00000000O000O = 0;
         if (this.O00000000(this.O0000000000OO0()) >= 64) {
            this.O00000000O0000 = AutoWood.W82.EQUIP;
         } else {
            this.O000000000OO00();
         }
      } else {
         if (this.O00000000OOO0.O000000000000(6000L)) {
            this.O00000000O000O++;
            if (this.O00000000O000O >= 3) {
               ChatUtil.O00000000("§c[AutoWood] §fНе удалось продать дерево на аукционе, попробую позже");
               this.O00000000O00O = true;
               this.O00000000OOO00.O00000000();
               this.O000000000OO00();
            } else {
               this.O00000000O0000 = AutoWood.W82.COMMAND;
               this.O00000000OOO0.O00000000();
            }
         }
      }
   }

   private void O000000000OO00() {
      this.O00000000O0000 = AutoWood.W82.NONE;
      this.O00000000O000 = 0;
   }

   private void O000000000OO0O() {
      this.O00000000O0O0O = false;
      this.O00000000O0OO = false;
      this.O00000000O0OO0 = 0;
      this.O00000000O0O00 = null;
      this.O00000000O0OOO = false;
      this.O00000000OO0 = -1;
      this.O00000000OOOO0.clear();
      this.O00000000OO000.O00000000();
      this.O00000000OO00O.O00000000();
      this.O00000000OO0O.O00000000();
      this.O00000000OO0O0.O00000000();
      switch (this.O00000000O0O) {
         case REPAIR:
            this.O00000000O0O0 = this.O00000000(Items.EXPERIENCE_BOTTLE) > 0 ? AutoWood.W80.REPAIRING : AutoWood.W80.FIND_CHEST;
            break;
         case BONEMEAL:
            this.O00000000O0O0 = this.O00000000O0OOO() ? AutoWood.W80.CRAFTING : AutoWood.W80.FIND_CHEST;
            break;
         default:
            this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
      }
   }

   private void O000000000OOO() {
      if (O0000000000.currentScreen == null || O0000000000.currentScreen instanceof GenericContainerScreen) {
         switch (this.O00000000O0O0) {
            case FIND_CHEST:
               this.O000000000OOO0();
               break;
            case GOING:
               this.O000000000OOOO();
               break;
            case ROTATING:
               this.O00000000O();
               break;
            case OPENING:
               this.O00000000O0();
               break;
            case WAIT_GUI:
               this.O00000000O00();
               break;
            case CRAFTING:
               this.O00000000O0000();
               break;
            case REPAIRING:
               this.O00000000O00O();
               break;
            case RETURNING:
               this.O00000000O00OO();
               break;
            default:
               this.O00000000O0O0();
         }
      }
   }

   private void O000000000OOO0() {
      this.O00000000O0O00 = this.O000000000(this.O00000000O0O);
      if (this.O00000000O0O00 == null) {
         this.O000000000(
            "§c[AutoWood] §fНе найден сундук «"
               + this.O0000000000(this.O00000000O0O)
               + "» в радиусе "
               + (int)this.O000000000O0O0.O0000000000()
               + " бл. — выключаюсь"
         );
      } else {
         if (this.O000000000000O(this.O00000000O0O00) && this.O00000000000(this.O00000000O0O00)) {
            this.O00000000O0O0 = AutoWood.W80.ROTATING;
            this.O00000000OO000.O00000000();
         } else {
            this.O00000000O0O0O = true;
            this.O00000000O0O0 = AutoWood.W80.GOING;
            this.O00000000OO00O.O00000000();
            this.O00000000OO0O.O00000000();
         }
      }
   }

   private void O000000000OOOO() {
      if (this.O00000000O0O00 != null && this.O0000000000(this.O00000000O0O00)) {
         double var1 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O00000000O0O00));
         if (var1 <= 4.5 && this.O00000000000(this.O00000000O0O00)) {
            if (this.O00000000O00OO != null) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
            }

            this.O00000000O0O0 = AutoWood.W80.ROTATING;
            this.O00000000OO000.O00000000();
         } else {
            if (this.O00000000O00OO != null && (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO00O.O000000000000(1500L))) {
               this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalNear(this.O00000000O0O00, 2));
               this.O00000000OO00O.O00000000();
            }

            if (this.O00000000OO0O.O000000000000(15000L)) {
               this.O000000000("§c[AutoWood] §fНе удалось дойти до сундука «" + this.O0000000000(this.O00000000O0O) + "»");
            }
         }
      } else {
         this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
      }
   }

   private void O00000000O() {
      if (this.O00000000O0O00 == null) {
         this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
      } else {
         if (this.O0000000000000(this.O00000000O0O00)) {
            this.O00000000O0O0 = AutoWood.W80.OPENING;
            this.O00000000OO000.O00000000();
         }
      }
   }

   private void O00000000O0() {
      if (this.O00000000OO000.O000000000000(200L)) {
         this.O000000000000(this.O00000000O0O00);
         this.O00000000O0O0 = AutoWood.W80.WAIT_GUI;
         this.O00000000OO000.O00000000();
      }
   }

   private void O00000000O00() {
      if (!(O0000000000.currentScreen instanceof GenericContainerScreen)) {
         if (this.O00000000OO000.O000000000000(2500L)) {
            this.O00000000O0OO0++;
            if (this.O00000000O0OO0 > 3) {
               this.O000000000("§c[AutoWood] §fНе удалось открыть сундук «" + this.O0000000000(this.O00000000O0O) + "»");
            } else {
               this.O00000000O0O0 = AutoWood.W80.ROTATING;
               this.O00000000OO000.O00000000();
            }
         }
      }
   }

   private void O00000000(GenericContainerScreen genericContainerScreen) {
      GenericContainerScreenHandler var2 = (GenericContainerScreenHandler)genericContainerScreen.getScreenHandler();
      int var3 = var2.slots.size() - 36;
      if (var3 <= 0) {
         this.O00000000("§c[AutoWood] §fСундук «" + this.O0000000000(this.O00000000O0O) + "» пуст — выключаюсь");
      } else if (this.O00000000OO0O0.O000000000000(120L)) {
         if (this.O00000000(this.O00000000O0O)) {
            this.O00000000O000();
         } else {
            int var4 = this.O00000000(var2, var3, this.O00000000O0O);
            if (var4 == -1) {
               if (this.O00000000O0OO) {
                  this.O00000000O000();
               } else {
                  this.O00000000("§c[AutoWood] §fВ сундуке «" + this.O0000000000(this.O00000000O0O) + "» нет нужных предметов — выключаюсь");
               }
            } else {
               O0000000000.interactionManager.clickSlot(var2.syncId, var4, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O00000000O0OO = true;
               this.O00000000OO0O0.O00000000();
            }
         }
      }
   }

   private void O000000000(GenericContainerScreen genericContainerScreen) {
      GenericContainerScreenHandler var2 = (GenericContainerScreenHandler)genericContainerScreen.getScreenHandler();
      int var3 = var2.slots.size() - 36;
      if (var3 <= 0) {
         if (O0000000000.player != null) {
            O0000000000.player.closeHandledScreen();
         }

         this.O00000000O0O();
      } else if (this.O00000000OO0O0.O000000000000(120L)) {
         for (int var4 = var3; var4 < var2.slots.size(); var4++) {
            ItemStack var5 = ((Slot)var2.slots.get(var4)).getStack();
            if (var5.getItem() == this.O0000000000OO0() && this.O00000000(var2, var3, var5)) {
               O0000000000.interactionManager.clickSlot(var2.syncId, var4, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
               this.O00000000O0OO = true;
               this.O00000000OO0O0.O00000000();
               return;
            }
         }

         if (!this.O00000000O0OO) {
            this.O00000000O00O0 = true;
            this.O00000000OOO0O.O00000000();
            ChatUtil.O00000000("§c[AutoWood] §fСундук «лут/дерево» переполнен — некуда складывать, попробую позже");
         }

         if (O0000000000.player != null) {
            O0000000000.player.closeHandledScreen();
         }

         this.O00000000O0O();
      }
   }

   private boolean O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, ItemStack itemStack) {
      for (int var4 = 0; var4 < i; var4++) {
         ItemStack var5 = ((Slot)genericContainerScreenHandler.slots.get(var4)).getStack();
         if (var5.isEmpty()) {
            return true;
         }

         if (var5.getItem() == itemStack.getItem() && var5.getCount() < var5.getMaxCount()) {
            return true;
         }
      }

      return false;
   }

   private boolean O00000000(AutoWood.W81 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> this.O00000000(Items.EXPERIENCE_BOTTLE) >= 64;
         case BONEMEAL -> this.O00000000O0OO0() >= 128;
         default -> true;
      };
   }

   private int O00000000(GenericContainerScreenHandler genericContainerScreenHandler, int i, AutoWood.W81 o0000000000) {
      for (int var4 = 0; var4 < i; var4++) {
         ItemStack var5 = ((Slot)genericContainerScreenHandler.slots.get(var4)).getStack();
         if (!var5.isEmpty() && this.O00000000(var5.getItem(), o0000000000)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean O00000000(Item item, AutoWood.W81 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> item == Items.EXPERIENCE_BOTTLE;
         case BONEMEAL -> item == Items.BONE_MEAL || item == Items.BONE || item == Items.BONE_BLOCK;
         default -> false;
      };
   }

   private void O00000000O000() {
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }
      this.O00000000O0O0 = switch (this.O00000000O0O) {
         case REPAIR -> AutoWood.W80.REPAIRING;
         case BONEMEAL -> AutoWood.W80.CRAFTING;
         default -> AutoWood.W80.RETURNING;
      };
      if (this.O00000000O0O0 == AutoWood.W80.RETURNING) {
         this.O00000000OO00O.O00000000();
         this.O00000000OO0O.O00000000();
      }

      this.O00000000OO000.O00000000();
      this.O00000000OO0O0.O00000000();
      this.O00000000OOOO0.clear();
   }

   private void O00000000(String string) {
      if (O0000000000.player != null) {
         O0000000000.player.closeHandledScreen();
      }

      this.O000000000(string);
   }

   private void O00000000O0000() {
      if (O0000000000.currentScreen == null) {
         if (!this.O00000000OOOO0.isEmpty()) {
            if (this.O00000000OO0O0.O000000000000(90L)) {
               this.O00000000OOOO0.poll().run();
               this.O00000000OO0O0.O00000000();
            }
         } else if (this.O00000000(Items.BONE_MEAL) >= 128) {
            this.O00000000O0O();
         } else {
            int var1 = this.O00000000OO();
            if (var1 == -1) {
               if (this.O00000000(Items.BONE_MEAL) == 0) {
                  this.O000000000("§c[AutoWood] §fКостная мука закончилась и крафтить не из чего — выключаюсь");
               } else {
                  this.O00000000O0O();
               }
            } else {
               int var2 = O0000000000.player.playerScreenHandler.syncId;
               this.O00000000OOOO0.add(() -> O0000000000.interactionManager.clickSlot(var2, var1, 0, SlotActionType.PICKUP, O0000000000.player));
               this.O00000000OOOO0.add(() -> O0000000000.interactionManager.clickSlot(var2, 1, 0, SlotActionType.PICKUP, O0000000000.player));
               this.O00000000OOOO0.add(() -> O0000000000.interactionManager.clickSlot(var2, 0, 0, SlotActionType.QUICK_MOVE, O0000000000.player));
               this.O00000000OOOO0.add(this::O00000000O000O);
            }
         }
      }
   }

   private void O00000000O000O() {
      int var1 = O0000000000.player.playerScreenHandler.syncId;

      for (int var2 = 1; var2 <= 4; var2++) {
         if (((Slot)O0000000000.player.playerScreenHandler.slots.get(var2)).hasStack()) {
            O0000000000.interactionManager.clickSlot(var1, var2, 0, SlotActionType.QUICK_MOVE, O0000000000.player);
         }
      }

      if (!O0000000000.player.playerScreenHandler.getCursorStack().isEmpty()) {
         int var3 = this.O00000000OO0();
         if (var3 != -1) {
            O0000000000.interactionManager.clickSlot(var1, var3, 0, SlotActionType.PICKUP, O0000000000.player);
         }
      }
   }

   private void O00000000O00O() {
      if (O0000000000.currentScreen == null) {
         int var1 = O0000000000.player.playerScreenHandler.syncId;
         if (!this.O00000000O0OOO) {
            int var4 = this.O00000000O0O0O();
            if (var4 == -1) {
               this.O00000000O0O();
            } else if (this.O00000000(Items.EXPERIENCE_BOTTLE) == 0) {
               this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
            } else if (!O0000000000.player.getOffHandStack().isEmpty()) {
               int var5 = this.O00000000OO0();
               if (var5 == -1) {
                  this.O000000000("§c[AutoWood] §fОсвободите офф-хенд или место в инвентаре для починки");
               } else {
                  O0000000000.interactionManager.clickSlot(var1, 45, 0, SlotActionType.PICKUP, O0000000000.player);
                  O0000000000.interactionManager.clickSlot(var1, var5, 0, SlotActionType.PICKUP, O0000000000.player);
               }
            } else {
               this.O00000000OO = var4;
               this.O00000000OO00 = O0000000000.player.getPitch();
               O0000000000.player.getInventory().setSelectedSlot(var4);
               O0000000000.interactionManager.clickSlot(var1, 45, var4, SlotActionType.SWAP, O0000000000.player);
               if (!this.O00000000O00O0()) {
                  O0000000000.interactionManager.clickSlot(var1, 45, var4, SlotActionType.SWAP, O0000000000.player);
                  O0000000000.player.getInventory().setSelectedSlot(var4);
                  this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
               } else {
                  this.O00000000O0OOO = true;
                  this.O00000000OO0 = -1;
                  this.O00000000OO0OO.O00000000();
                  this.O00000000OO000.O00000000();
               }
            }
         } else {
            ItemStack var2 = O0000000000.player.getOffHandStack();
            if (!var2.isEmpty() && var2.isDamageable() && var2.getDamage() != 0) {
               if (O0000000000.player.getMainHandStack().getItem() != Items.EXPERIENCE_BOTTLE && !this.O00000000O00O0()) {
                  this.O0000000000(var1);
                  this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
               } else {
                  int var3 = var2.getDamage();
                  if (this.O00000000OO0 == -1) {
                     this.O00000000OO0 = var3;
                  }

                  if (var3 < this.O00000000OO0) {
                     this.O00000000OO0 = var3;
                     this.O00000000OO0OO.O00000000();
                  } else if (this.O00000000OO0OO.O000000000000(4000L)) {
                     this.O0000000000(var1);
                     this.O000000000("§c[AutoWood] §fТопор не чинится (нет «Починки»?)");
                     return;
                  }

                  if (this.O00000000OO000.O000000000000(120L)) {
                     O0000000000.player.setPitch(90.0F);
                     O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
                     O0000000000.player.swingHand(Hand.MAIN_HAND);
                     this.O00000000OO000.O00000000();
                  }
               }
            } else {
               this.O0000000000(var1);
            }
         }
      }
   }

   private void O0000000000(int i) {
      O0000000000.interactionManager.clickSlot(i, 45, this.O00000000OO, SlotActionType.SWAP, O0000000000.player);
      if (this.O00000000OO >= 0) {
         O0000000000.player.getInventory().setSelectedSlot(this.O00000000OO);
      }

      O0000000000.player.setPitch(this.O00000000OO00);
      if (!O0000000000.player.getOffHandStack().isEmpty()) {
         int var2 = this.O00000000OO0();
         if (var2 != -1) {
            O0000000000.interactionManager.clickSlot(i, 45, 0, SlotActionType.PICKUP, O0000000000.player);
            O0000000000.interactionManager.clickSlot(i, var2, 0, SlotActionType.PICKUP, O0000000000.player);
         }
      }

      this.O00000000O0OOO = false;
      this.O00000000O0O();
   }

   private boolean O00000000O00O0() {
      int var1 = this.O00000000OO00();
      if (var1 == -1) {
         return false;
      } else {
         if (var1 >= 36 && var1 <= 44) {
            O0000000000.player.getInventory().setSelectedSlot(var1 - 36);
         } else {
            O0000000000.interactionManager
               .clickSlot(
                  O0000000000.player.playerScreenHandler.syncId,
                  var1,
                  O0000000000.player.getInventory().getSelectedSlot(),
                  SlotActionType.SWAP,
                  O0000000000.player
               );
         }

         return true;
      }
   }

   private void O00000000O00OO() {
      if (this.O00000000O0O0O && this.O000000000OOOO != null && this.O00000000O00OO != null) {
         if (!O0000000000.player.getBlockPos().equals(this.O000000000OOOO)
            && !(O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(this.O000000000OOOO)) <= 0.7)) {
            if (!this.O00000000O00OO.getCustomGoalProcess().isActive() || this.O00000000OO00O.O000000000000(1500L)) {
               this.O00000000O00OO.getCustomGoalProcess().setGoalAndPath(new GoalBlock(this.O000000000OOOO));
               this.O00000000OO00O.O00000000();
            }

            if (this.O00000000OO0O.O000000000000(20000L)) {
               this.O00000000O00OO.getPathingBehavior().cancelEverything();
               this.O00000000O0O0();
            }
         } else {
            this.O00000000O00OO.getPathingBehavior().cancelEverything();
            this.O00000000O0O0();
         }
      } else {
         this.O00000000O0O0();
      }
   }

   private void O00000000O0O() {
      this.O00000000O0O0 = AutoWood.W80.RETURNING;
      this.O00000000OO00O.O00000000();
      this.O00000000OO0O.O00000000();
   }

   private void O00000000O0O0() {
      if (this.O00000000O00OO != null) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
      }

      this.O00000000O0O00();
      this.O000000000OO0O = AutoWood.W79.FARM;
      this.O00000000O000 = 0;
   }

   private void O000000000(String string) {
      ChatUtil.O00000000(string);
      if (this.O00000000O00OO != null) {
         this.O00000000O00OO.getPathingBehavior().cancelEverything();
      }

      this.O00000000O0O00();
      this.a_();
   }

   private void O00000000O0O00() {
      this.O00000000O0O = AutoWood.W81.NONE;
      this.O00000000O0O0 = AutoWood.W80.FIND_CHEST;
      this.O00000000O0O00 = null;
      this.O00000000O0O0O = false;
      this.O00000000O0OO = false;
      this.O00000000O0OO0 = 0;
      this.O00000000O0OOO = false;
      this.O00000000OO = -1;
      this.O00000000OO0 = -1;
      this.O00000000OOOO0.clear();
   }

   private int O00000000O0O0O() {
      if (!this.O000000000O000.O0000000000()) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            ItemStack var2 = O0000000000.player.getInventory().getStack(var1);
            if (!var2.isEmpty() && var2.isDamageable() && var2.getItem() instanceof AxeItem) {
               int var3 = var2.getMaxDamage() - var2.getDamage();
               if (var3 <= (int)this.O000000000O00O.O0000000000()) {
                  return var1;
               }
            }
         }

         return -1;
      }
   }

   private int O00000000O0OO() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).getItem() instanceof AxeItem) {
            return var1;
         }
      }

      return -1;
   }

   private int O00000000(Item item) {
      int var2 = 0;

      for (int var3 = 0; var3 < 36; var3++) {
         ItemStack var4 = O0000000000.player.getInventory().getStack(var3);
         if (var4.getItem() == item) {
            var2 += var4.getCount();
         }
      }

      return var2;
   }

   private int O00000000O0OO0() {
      return this.O00000000(Items.BONE_MEAL) + this.O00000000(Items.BONE) * 3 + this.O00000000(Items.BONE_BLOCK) * 9;
   }

   private boolean O00000000O0OOO() {
      return this.O00000000(Items.BONE) > 0 || this.O00000000(Items.BONE_BLOCK) > 0;
   }

   private int O00000000OO() {
      for (int var1 = 9; var1 <= 44; var1++) {
         Item var2 = ((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).getStack().getItem();
         if (var2 == Items.BONE || var2 == Items.BONE_BLOCK) {
            return var1;
         }
      }

      return -1;
   }

   private int O00000000OO0() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (!((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).hasStack()) {
            return var1;
         }
      }

      return -1;
   }

   private int O00000000OO00() {
      for (int var1 = 9; var1 <= 44; var1++) {
         if (((Slot)O0000000000.player.playerScreenHandler.slots.get(var1)).getStack().getItem() == Items.EXPERIENCE_BOTTLE) {
            return var1;
         }
      }

      return -1;
   }

   private BlockPos O000000000(AutoWood.W81 o0000000000) {
      if (O0000000000.world != null && O0000000000.player != null) {
         BlockPos var2 = this.O000000000OOOO != null ? this.O000000000OOOO : O0000000000.player.getBlockPos();
         int var3 = (int)this.O000000000O0O0.O0000000000();
         BlockPos var4 = null;
         double var5 = Double.MAX_VALUE;

         for (BlockPos var8 : BlockPos.iterate(var2.add(-var3, -5, -var3), var2.add(var3, 5, var3))) {
            if (this.O0000000000(var8) && this.O00000000(var8, o0000000000)) {
               double var9 = O0000000000.player.getPos().distanceTo(Vec3d.ofCenter(var8));
               if (var9 < var5) {
                  var5 = var9;
                  var4 = var8.toImmutable();
               }
            }
         }

         return var4;
      } else {
         return null;
      }
   }

   private boolean O00000000(BlockPos blockPos, AutoWood.W81 o0000000000) {
      String var3 = this.O000000000(blockPos).toLowerCase(Locale.ROOT);
      if (var3.isEmpty()) {
         return false;
      } else {
         String[] var4;
         String[] var5;
         switch (o0000000000) {
            case REPAIR:
               var4 = new String[]{"опыт"};
               var5 = new String[]{"кост", "мука"};
               break;
            case BONEMEAL:
               var4 = new String[]{"кост", "мука"};
               var5 = new String[]{"опыт", "лут", "дерев"};
               break;
            case DEPOSIT:
               var4 = new String[]{"лут", "дерев"};
               var5 = new String[]{"опыт", "кост", "мука"};
               break;
            default:
               return false;
         }

         boolean var6 = false;

         for (String var10 : var4) {
            if (var3.contains(var10)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            return false;
         } else {
            for (String var14 : var5) {
               if (var3.contains(var14)) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   private String O000000000(BlockPos blockPos) {
      if (blockPos != null && O0000000000.world != null) {
         SignBlockEntity var2 = null;
         double var3 = Double.MAX_VALUE;
         BlockPos var5 = blockPos.add(-1, -1, -1);
         BlockPos var6 = blockPos.add(1, 1, 1);

         for (BlockPos var8 : BlockPos.iterate(var5, var6)) {
            if (O0000000000.world.getBlockEntity(var8) instanceof SignBlockEntity var10) {
               double var11 = var8.getSquaredDistance(blockPos);
               if (var11 < var3) {
                  var3 = var11;
                  var2 = var10;
               }
            }
         }

         return var2 == null ? "" : this.O00000000(var2);
      } else {
         return "";
      }
   }

   private String O00000000(SignBlockEntity signBlockEntity) {
      StringBuilder var2 = new StringBuilder();

      for (Text var6 : signBlockEntity.getFrontText().getMessages(false)) {
         var2.append(var6.getString()).append(' ');
      }

      for (Text var10 : signBlockEntity.getBackText().getMessages(false)) {
         var2.append(var10.getString()).append(' ');
      }

      return var2.toString().replaceAll("§.", "").trim();
   }

   private boolean O0000000000(BlockPos blockPos) {
      if (O0000000000.world == null) {
         return false;
      } else {
         BlockEntity var2 = O0000000000.world.getBlockEntity(blockPos);
         return var2 instanceof ChestBlockEntity || var2 instanceof BarrelBlockEntity || var2 instanceof ShulkerBoxBlockEntity;
      }
   }

   private boolean O00000000000(BlockPos blockPos) {
      return this.O00000000000O(blockPos) != null;
   }

   private String O0000000000(AutoWood.W81 o0000000000) {
      return switch (o0000000000) {
         case REPAIR -> "опыт";
         case BONEMEAL -> "костная мука";
         case DEPOSIT -> "лут/дерево";
         default -> "";
      };
   }

   private void O000000000000(BlockPos blockPos) {
      Vec3d var2 = this.O00000000(blockPos, Direction.UP);
      BlockHitResult var3 = new BlockHitResult(var2, Direction.UP, blockPos, false);
      O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var3);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
   }

   private boolean O0000000000000(BlockPos blockPos) {
      O000000O0O00OO var2 = this.O00000000(this.O00000000(blockPos, Direction.UP));
      O000000O0O0O0.O00000000(var2, 65.0F, 65.0F, 65.0F, 65.0F, 2, 20, false);
      return new O000000O0O00OO(O0000000000.player).O00000000(var2) <= 6.0F;
   }

   private Vec3d O00000000(BlockPos blockPos, Direction direction) {
      return new Vec3d(
         blockPos.getX() + 0.5 + direction.getOffsetX() * 0.5,
         blockPos.getY() + 0.5 + direction.getOffsetY() * 0.5,
         blockPos.getZ() + 0.5 + direction.getOffsetZ() * 0.5
      );
   }

   private O000000O0O00OO O00000000(Vec3d vec3d) {
      if (O0000000000.player == null) {
         return new O000000O0O00OO(0.0F, 0.0F);
      } else {
         Vec3d var2 = O0000000000.player.getEyePos();
         double var3 = vec3d.x - var2.x;
         double var5 = vec3d.y - var2.y;
         double var7 = vec3d.z - var2.z;
         double var9 = Math.sqrt(var3 * var3 + var7 * var7);
         float var11 = (float)Math.toDegrees(Math.atan2(-var3, var7));
         float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
         return new O000000O0O00OO(var11, var12);
      }
   }

   private boolean O000000000000O(BlockPos blockPos) {
      return O0000000000.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter(blockPos)) <= 20.25;
   }

   private BlockHitResult O00000000000O(BlockPos blockPos) {
      Vec3d var2 = O0000000000.player.getEyePos();
      double[] var3 = new double[]{0.5, 0.2, 0.8};

      for (double var7 : var3) {
         for (double var12 : var3) {
            for (double var17 : var3) {
               Vec3d var19 = new Vec3d(blockPos.getX() + var7, blockPos.getY() + var12, blockPos.getZ() + var17);
               BlockHitResult var20 = O0000000000.world.raycast(new RaycastContext(var2, var19, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
               if (var20.getType() == Type.BLOCK && var20.getBlockPos().equals(blockPos)) {
                  return var20;
               }
            }
         }
      }

      return null;
   }

   private int O000000000(Item item) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).getItem() == item) {
            return var2;
         }
      }

      return -1;
   }

   private int O0000000000(Item item) {
      int var2 = -1;

      for (int var3 = 9; var3 < 36; var3++) {
         if (O0000000000.player.getInventory().getStack(var3).getItem() == item) {
            var2 = var3;
            break;
         }
      }

      if (var2 == -1) {
         return -1;
      } else {
         int var4 = this.O00000000OO000();
         if (var4 == -1) {
            return -1;
         } else {
            O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var2, var4, SlotActionType.SWAP, O0000000000.player);
            return var4;
         }
      }
   }

   private int O00000000OO000() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (O0000000000.player.getInventory().getStack(var1).isEmpty()) {
            return var1;
         }
      }

      for (int var3 = 0; var3 < 9; var3++) {
         Item var2 = O0000000000.player.getInventory().getStack(var3).getItem();
         if (!(var2 instanceof AxeItem)
            && var2 != this.O0000000000O0()
            && var2 != Items.BONE_MEAL
            && var2 != Items.BONE
            && var2 != Items.BONE_BLOCK
            && var2 != Items.EXPERIENCE_BOTTLE) {
            return var3;
         }
      }

      return -1;
   }

   static enum W79 {
      SETUP,
      FARM,
      WAIT_FELL;
   }

   static enum W80 {
      FIND_CHEST,
      GOING,
      ROTATING,
      OPENING,
      WAIT_GUI,
      CRAFTING,
      REPAIRING,
      RETURNING;
   }

   static enum W81 {
      NONE,
      REPAIR,
      BONEMEAL,
      DEPOSIT;
   }

   static enum W82 {
      NONE,
      EQUIP,
      COMMAND,
      CONFIRM,
      WAIT_RESULT;
   }
}

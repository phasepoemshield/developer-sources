package l;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class AppleFarm extends Helper242 {
   private static final String MINE_TARGETS_LEAVES = "oak_leaves spruce_leaves birch_leaves jungle_leaves acacia_leaves dark_oak_leaves cherry_leaves mangrove_leaves";
   private static final String MINE_TARGETS_LOGS = "oak_log spruce_log birch_log jungle_log acacia_log dark_oak_log cherry_log mangrove_log";
   private static final int OFFHAND_SLOT_ID = 45;
   private static final String REPAIR_BOTTLE_LORE_MARKER = "полностью ремонтирует";
   private final Setting5 breakMode = new Setting5("Режим рубки", "Движок рубки дерева").method2381("На месте", "Baritone").method2383("На месте");
   private final Setting3 autoStop = new Setting3("Авто-стоп", "Останавливать Baritone после рубки")
      .method2201(true)
      .method2199(() -> this.breakMode.method2385("Baritone"));
   private final Setting2 actionDelayMs = new Setting2("Задержка действий (мс)", "Задержка между действиями фермы").method2086(1.0F).method2079(0, 500);
   private final Setting2 commandDelayMs = new Setting2("Задержка команд (мс)", "Задержка между командами #mine").method2086(600.0F).method2079(0, 2000);
   private final Setting2 breakStepDelayMs = new Setting2("Задержка ломания (мс)", "Задержка между шагами локального ломания")
      .method2086(1.0F)
      .method2079(0, 250);
   private final Setting2 toolSwitchDelayMs = new Setting2("Задержка смены инструмента (мс)", "Минимальная задержка между сменой инструмента")
      .method2086(80.0F)
      .method2079(0, 1000);
   private final Setting2 scanRadius = new Setting2("Радиус сканирования", "Радиус поиска дерева").method2086(6.0F).method2079(1, 10);
   private final Setting2 scanHeight = new Setting2("Высота сканирования", "Высота поиска дерева").method2086(20.0F).method2079(1, 40);
   private final Setting2 maxDistance = new Setting2("Макс. дистанция", "Максимальная дистанция от точки фермы").method2086(5.0F).method2079(1, 12);
   private final Setting2 breakRange = new Setting2("Дистанция ломания", "Максимальная дистанция локального ломания")
      .method2086(5.5F)
      .method2078(1.0F, 6.0F);
   private final Setting2 rotateStepYaw = new Setting2("Поворот Yaw", "Шаг поворота по Yaw за тик").method2086(180.0F).method2078(1.0F, 180.0F);
   private final Setting2 rotateStepPitch = new Setting2("Поворот Pitch", "Шаг поворота по Pitch за тик").method2086(180.0F).method2078(1.0F, 180.0F);
   private final Setting2 aimToleranceDeg = new Setting2("Допуск ломания", "Допуск наведения при ломании (в градусах)")
      .method2086(20.0F)
      .method2078(1.0F, 45.0F);
   private final Setting2 interactAimToleranceDeg = new Setting2("Допуск взаимодействия", "Допуск наведения при установке/взаимодействии (в градусах)")
      .method2086(16.0F)
      .method2078(1.0F, 45.0F);
   private final Setting3 autoRepairHoe = new Setting3("Авто-починка мотыги", "Чинит мотыгу ремонтным пузырем опыта при низкой прочности")
      .method2201(true);
   private final Setting2 repairThresholdPercent = new Setting2("Порог починки (%)", "Начинать починку, когда прочность мотыги ниже процента")
      .method2086(15.0F)
      .method2078(1.0F, 95.0F);
   private final Setting2 repairUseDelayMs = new Setting2("Задержка починки (мс)", "Задержка между использованием ремонтного пузыря")
      .method2086(500.0F)
      .method2079(100, 5000);
   private final Helper339 actionTimer = new Helper339();
   private final Helper339 commandTimer = new Helper339();
   private final Helper339 notifyTimer = new Helper339();
   private final Helper339 toolSwitchTimer = new Helper339();
   private final Helper339 breakTimer = new Helper339();
   private final Helper339 repairTimer = new Helper339();
   private BlockPos farmPos;
   private BlockPos currentBreakTarget;
   private Direction currentBreakSide;
   private boolean miningActive;
   private boolean baritoneAvailable;
   private boolean repairingHoe;
   private int repairHoeSourceSlotId = -1;
   private int repairHoeSourceHotbarSlot = -1;

   public AppleFarm() {
      super("AppleFarm", "Apple Farm", Helper269.MISC);
      this.setup(
         new Helper264[]{
            this.breakMode,
            this.autoStop,
            this.actionDelayMs,
            this.commandDelayMs,
            this.breakStepDelayMs,
            this.toolSwitchDelayMs,
            this.scanRadius,
            this.scanHeight,
            this.maxDistance,
            this.breakRange,
            this.rotateStepYaw,
            this.rotateStepPitch,
            this.aimToleranceDeg,
            this.interactAimToleranceDeg,
            this.autoRepairHoe,
            this.repairThresholdPercent,
            this.repairUseDelayMs
         }
      );
   }

   @Override
   public void activate() {
      super.activate();
      this.miningActive = false;
      this.currentBreakTarget = null;
      this.currentBreakSide = null;
      this.repairingHoe = false;
      this.repairHoeSourceSlotId = -1;
      this.repairHoeSourceHotbarSlot = -1;
      this.actionTimer.method3358();
      this.commandTimer.method3360(this.commandDelayMs.method2080());
      this.notifyTimer.method3360(3000L);
      this.toolSwitchTimer.method3360(this.toolSwitchDelayMs.method2080());
      this.breakTimer.method3360(this.breakStepDelayMs.method2080());
      this.repairTimer.method3360(50L);
      this.baritoneAvailable = this.method4684();
      if (this.breakMode.method2385("Baritone") && !this.baritoneAvailable) {
         this.method906("Baritone not found in runtime. Put Baritone into mods folder or switch Break Mode to Static.");
         this.setState(false);
      } else {
         this.farmPos = this.resolveFarmPos();
         if (this.farmPos == null) {
            this.method906("Failed to resolve farm point. Look at plantable ground and enable TreeBot again.");
            this.setState(false);
         } else {
            if (this.breakMode.method2385("Baritone")) {
               this.sendBaritone("#set autoTool true");
               this.sendBaritone("#set allowBreak true");
            }

            this.method906("TreeBot enabled at " + this.farmPos.toShortString() + " in " + this.breakMode.method2386() + " mode.");
         }
      }
   }

   @Override
   public void deactivate() {
      super.deactivate();
      if (this.breakMode.method2385("Baritone") && this.baritoneAvailable && this.miningActive && this.autoStop.method2200()) {
         this.sendBaritone("#stop");
      }

      this.method4652();
      this.miningActive = false;
      this.currentBreakTarget = null;
      this.currentBreakSide = null;
      this.farmPos = null;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         if (this.farmPos == null) {
            this.farmPos = this.resolveFarmPos();
            if (this.farmPos == null) {
               return;
            }
         }

         if (mc.player.squaredDistanceTo(this.farmPos.toCenterPos()) > (double)this.maxDistance.method2080() * this.maxDistance.method2080()) {
            if (this.notifyTimer.method3356(2500.0)) {
               this.method906("TreeBot: too far from farm point, move closer.");
               this.notifyTimer.method3358();
            }

            if (this.breakMode.method2385("Baritone") && this.miningActive && this.autoStop.method2200()) {
               this.sendBaritone("#stop");
               this.miningActive = false;
            }
         } else if (!this.method4649()) {
            boolean var2 = this.method4673();
            if (var2) {
               if (this.breakMode.method2385("Baritone")) {
                  this.method4647();
                  this.method4648();
               } else {
                  this.method4648();
               }
            } else {
               this.currentBreakTarget = null;
               this.currentBreakSide = null;
               if (this.breakMode.method2385("Baritone") && this.miningActive && this.autoStop.method2200()) {
                  this.sendBaritone("#stop");
                  this.miningActive = false;
               }

               if (this.actionTimer.method3356(this.actionDelayMs.method2080())) {
                  this.actionTimer.method3358();
                  if (!this.method4674()) {
                     if (!this.method4668() && this.notifyTimer.method3356(2500.0)) {
                        Item var3 = this.method4675();
                        if (var3 == Items.AIR) {
                           this.method906("TreeBot: no sapling in inventory.");
                        } else {
                           this.method906("TreeBot: missing sapling " + var3.getName().getString());
                        }

                        this.notifyTimer.method3358();
                     }
                  } else {
                     if (!this.method4669() && this.notifyTimer.method3356(2500.0)) {
                        this.method906("TreeBot: no bone meal, waiting for natural growth.");
                        this.notifyTimer.method3358();
                     }
                  }
               }
            }
         }
      }
   }

   private void method4647() {
      if (this.commandTimer.method3356(this.commandDelayMs.method2080())) {
         this.sendBaritone(
            "#mine 1 "
               + (
                  this.method4679()
                     ? "oak_leaves spruce_leaves birch_leaves jungle_leaves acacia_leaves dark_oak_leaves cherry_leaves mangrove_leaves"
                     : "oak_log spruce_log birch_log jungle_log acacia_log dark_oak_log cherry_log mangrove_log"
               )
         );
         this.miningActive = true;
         this.commandTimer.method3358();
      }
   }

   private void method4648() {
      if (this.breakTimer.method3356(this.breakStepDelayMs.method2080())) {
         if (this.currentBreakTarget == null || !this.method4677(this.currentBreakTarget)) {
            Helper443 var1 = this.method4678();
            if (var1 == null) {
               this.currentBreakTarget = null;
               this.currentBreakSide = null;
               return;
            }

            this.currentBreakTarget = var1.method4644();
            this.currentBreakSide = var1.method4645();
         }

         if (this.currentBreakTarget != null && this.currentBreakSide != null) {
            if (this.method4681(this.currentBreakTarget, this.currentBreakSide)) {
               this.method4683(this.currentBreakTarget);
               mc.interactionManager.updateBlockBreakingProgress(this.currentBreakTarget, this.currentBreakSide);
               mc.player.swingHand(Hand.MAIN_HAND);
               this.breakTimer.method3358();
            }
         }
      }
   }

   private boolean method4649() {
      if (!this.autoRepairHoe.method2200()) {
         this.method4652();
         return false;
      } else if (this.repairingHoe) {
         return this.method4650();
      } else {
         Slot var1 = this.method4658();
         if (var1 == null) {
            return false;
         } else {
            this.method4657();
            if (!this.method4662()) {
               if (this.notifyTimer.method3356(2500.0)) {
                  this.method906("TreeBot: no experience bottle for hoe auto-repair.");
                  this.notifyTimer.method3358();
               }

               return true;
            } else if (!this.method4651(var1)) {
               if (this.notifyTimer.method3356(2500.0)) {
                  this.method906("TreeBot: failed to move hoe to offhand for repair.");
                  this.notifyTimer.method3358();
               }

               return true;
            } else {
               this.repairingHoe = true;
               this.repairTimer.method3360(50L);
               return this.method4650();
            }
         }
      }
   }

   private boolean method4650() {
      ItemStack var1 = mc.player.getOffHandStack();
      if (!this.method4660(var1)) {
         this.method4653();
         return false;
      } else if (!this.method4659(var1)) {
         this.method4652();
         return true;
      } else {
         this.method4657();
         if (!this.repairTimer.method3356(50.0)) {
            return true;
         } else {
            Helper442 var2 = this.method4654();
            if (var2.method4642() == -1) {
               if (this.notifyTimer.method3356(2500.0)) {
                  this.method906(var2.method4643());
                  this.notifyTimer.method3358();
               }

               this.repairTimer.method3358();
               return true;
            } else {
               this.method4655(var2.method4642());
               this.repairTimer.method3358();
               return true;
            }
         }
      }
   }

   private boolean method4651(Slot var1) {
      this.repairHoeSourceSlotId = -1;
      this.repairHoeSourceHotbarSlot = -1;
      if (var1.id == 45) {
         return true;
      } else {
         this.repairHoeSourceSlotId = var1.id;
         if (var1.id >= 36 && var1.id <= 44) {
            this.repairHoeSourceHotbarSlot = var1.id - 36;
         }

         Helper66.method691(var1, Hand.OFF_HAND, false, true);
         return this.method4660(mc.player.getOffHandStack());
      }
   }

   private void method4652() {
      if (this.repairingHoe && mc.player != null && mc.interactionManager != null) {
         if (this.repairHoeSourceSlotId != -1 && this.method4660(mc.player.getOffHandStack())) {
            Slot var1 = this.method4667(this.repairHoeSourceSlotId);
            if (var1 != null) {
               Helper66.method691(var1, Hand.OFF_HAND, false, true);
            }
         }

         this.method4653();
      } else {
         this.method4653();
      }
   }

   private void method4653() {
      this.repairingHoe = false;
      this.repairHoeSourceSlotId = -1;
      this.repairHoeSourceHotbarSlot = -1;
   }

   private Helper442 method4654() {
      int var1 = this.findHotbarSlot(var1x -> this.method4663(var1x) && this.method4665(var1x));
      if (var1 == -1) {
         var1 = this.findHotbarSlot(var1x -> this.method4663(var1x));
      }

      if (var1 != -1) {
         return new Helper442(var1, "");
      } else {
         int var2 = this.method4672(var1x -> this.method4663(var1x) && this.method4665(var1x));
         if (var2 == -1) {
            var2 = this.method4672(var1x -> this.method4663(var1x));
         }

         if (var2 == -1) {
            String var4 = this.method4662() ? "TreeBot: experience bottle is on cooldown." : "TreeBot: no experience bottle for hoe auto-repair.";
            return new Helper442(-1, var4);
         } else {
            int var3 = this.method4666();
            if (var3 == -1) {
               return new Helper442(-1, "TreeBot: no safe hotbar slot for repair bottle.");
            } else {
               mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var2, var3, SlotActionType.SWAP, mc.player);
               return new Helper442(var3, "");
            }
         }
      }
   }

   private void method4655(int var1) {
      int var2 = mc.player.getInventory().selectedSlot;
      Helper66.method696(var1);
      this.method4656();
      ActionResult var3 = mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
      mc.player.swingHand(Hand.MAIN_HAND);
      if (var2 != var1) {
         Helper66.method696(var2);
      }

      if (!var3.isAccepted() && this.notifyTimer.method3356(2500.0)) {
         this.method906("TreeBot: failed to use experience bottle.");
         this.notifyTimer.method3358();
      }
   }

   private void method4656() {
      float var1 = mc.player.getYaw();
      mc.player.setYaw(var1);
      mc.player.setPitch(90.0F);
      mc.player.setHeadYaw(var1);
      mc.player.setBodyYaw(var1);
   }

   private void method4657() {
      this.currentBreakTarget = null;
      this.currentBreakSide = null;
      if (this.breakMode.method2385("Baritone") && this.baritoneAvailable && this.miningActive) {
         this.sendBaritone("#stop");
         this.miningActive = false;
      }
   }

   private Slot method4658() {
      Slot var1 = this.method4667(45);
      return var1 != null && this.method4659(var1.getStack())
         ? var1
         : Helper66.method720().filter(var0 -> var0.id != 45).filter(var1x -> this.method4659(var1x.getStack())).findFirst().orElse(null);
   }

   private boolean method4659(ItemStack var1) {
      return this.method4660(var1) && this.method4661(var1) < this.repairThresholdPercent.method2082();
   }

   private boolean method4660(ItemStack var1) {
      return !var1.isEmpty() && var1.isDamageable() && var1.getItem() instanceof HoeItem;
   }

   private float method4661(ItemStack var1) {
      return var1.isDamageable() && var1.getMaxDamage() > 0 ? (var1.getMaxDamage() - var1.getDamage()) * 100.0F / var1.getMaxDamage() : 100.0F;
   }

   private boolean method4662() {
      if (this.method4664(mc.player.getOffHandStack())) {
         return true;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (this.method4664(mc.player.getInventory().getStack(var1))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean method4663(ItemStack var1) {
      return this.method4664(var1) && !mc.player.getItemCooldownManager().isCoolingDown(var1);
   }

   private boolean method4664(ItemStack var1) {
      return !var1.isEmpty() && var1.getItem() == Items.EXPERIENCE_BOTTLE;
   }

   private boolean method4665(ItemStack var1) {
      if (!this.method4664(var1)) {
         return false;
      } else {
         NbtComponent var2 = var1.get(DataComponentTypes.CUSTOM_DATA);
         return var2 != null && var2.toString().contains("полностью ремонтирует");
      }
   }

   private int method4666() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (var1 != this.repairHoeSourceHotbarSlot) {
            Item var2 = mc.player.getInventory().getStack(var1).getItem();
            if (var2 == Items.AIR) {
               return var1;
            }

            if (!this.method4671(var2)) {
               return var1;
            }
         }
      }

      return -1;
   }

   private Slot method4667(int var1) {
      return Helper66.method720().filter(var1x -> var1x.id == var1).findFirst().orElse(null);
   }

   private boolean method4668() {
      Item var1 = this.method4675();
      if (var1 == Items.AIR) {
         return false;
      } else if (mc.world.getBlockState(this.farmPos).isIn(BlockTags.SAPLINGS)) {
         return true;
      } else if (!this.canPlantAt(this.farmPos)) {
         return false;
      } else {
         BlockPos var2 = this.farmPos.down();
         BlockHitResult var3 = new BlockHitResult(var2.toCenterPos(), Direction.UP, var2, false);
         return this.interactWithItemOnBlock(var1, var3);
      }
   }

   private boolean method4669() {
      int var1 = mc.player.getInventory().selectedSlot;
      int var2 = this.findHotbarSlot(Items.BONE_MEAL);
      if (var2 == -1) {
         int var3 = this.findInventorySlot(Items.BONE_MEAL);
         if (var3 == -1) {
            return false;
         }

         int var4 = this.method4670();
         if (var4 == -1) {
            return false;
         }

         mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var3, var4, SlotActionType.SWAP, mc.player);
         var2 = var4;
      }

      Helper66.method696(var2);
      BlockHitResult var5 = new BlockHitResult(this.farmPos.toCenterPos(), Direction.UP, this.farmPos, false);
      if (!this.method4682(var5.getPos(), this.interactAimToleranceDeg.method2082())) {
         if (var1 != var2) {
            Helper66.method696(var1);
         }

         return false;
      } else {
         ActionResult var6 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var5);
         mc.player.swingHand(Hand.MAIN_HAND);
         if (var1 != var2) {
            Helper66.method696(var1);
         }

         return var6.isAccepted();
      }
   }

   private int method4670() {
      for (int var1 = 0; var1 < 9; var1++) {
         Item var2 = mc.player.getInventory().getStack(var1).getItem();
         if (var2 == Items.AIR) {
            return var1;
         }

         if (!this.method4671(var2)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean method4671(Item var1) {
      return var1 == Items.DIAMOND_AXE
         || var1 == Items.NETHERITE_AXE
         || var1 == Items.DIAMOND_HOE
         || var1 == Items.NETHERITE_HOE
         || var1 == Items.BONE_MEAL
         || var1 == Items.EXPERIENCE_BOTTLE
         || var1 == Items.OAK_SAPLING
         || var1 == Items.SPRUCE_SAPLING
         || var1 == Items.BIRCH_SAPLING
         || var1 == Items.JUNGLE_SAPLING
         || var1 == Items.ACACIA_SAPLING
         || var1 == Items.DARK_OAK_SAPLING
         || var1 == Items.CHERRY_SAPLING
         || var1 == Items.MANGROVE_PROPAGULE;
   }

   private int findInventorySlot(Item var1) {
      for (int var2 = 9; var2 < 36; var2++) {
         if (mc.player.getInventory().getStack(var2).getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int method4672(Predicate<ItemStack> var1) {
      for (int var2 = 9; var2 < 36; var2++) {
         if (var1.test(mc.player.getInventory().getStack(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private boolean interactWithItemOnBlock(Item var1, BlockHitResult var2) {
      if (!this.method4682(var2.getPos(), this.interactAimToleranceDeg.method2082())) {
         return false;
      } else {
         int var3 = this.findHotbarSlot(var1);
         if (var3 == -1) {
            return false;
         } else {
            int var4 = mc.player.getInventory().selectedSlot;
            if (var4 != var3) {
               Helper66.method696(var3);
            }

            ActionResult var5 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var2);
            mc.player.swingHand(Hand.MAIN_HAND);
            if (var4 != var3) {
               Helper66.method696(var4);
            }

            return var5.isAccepted();
         }
      }
   }

   private boolean method4673() {
      int var1 = this.scanRadius.method2080();
      int var2 = this.scanHeight.method2080();

      for (int var3 = -var1; var3 <= var1; var3++) {
         for (int var4 = -var1; var4 <= var1; var4++) {
            for (int var5 = 0; var5 <= var2; var5++) {
               BlockPos var6 = this.farmPos.add(var3, var5, var4);
               BlockState var7 = mc.world.getBlockState(var6);
               if (var7.isIn(BlockTags.LOGS) || var7.isIn(BlockTags.LEAVES)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean method4674() {
      return mc.world.getBlockState(this.farmPos).isIn(BlockTags.SAPLINGS);
   }

   private boolean canPlantAt(BlockPos var1) {
      BlockState var2 = mc.world.getBlockState(var1);
      if (!var2.isAir() && !var2.isReplaceable()) {
         return false;
      } else {
         BlockState var3 = mc.world.getBlockState(var1.down());
         return var3.isIn(BlockTags.DIRT) || var3.isOf(Blocks.GRASS_BLOCK) || var3.isOf(Blocks.FARMLAND) || var3.isOf(Blocks.MUD);
      }
   }

   private BlockPos resolveFarmPos() {
      if (mc.crosshairTarget instanceof BlockHitResult var1 && var1.getType() == Type.BLOCK) {
         BlockPos var5 = var1.getBlockPos();
         BlockPos var3 = var5.up();
         if (this.canPlantAt(var3)) {
            return var3;
         }

         if (this.canPlantAt(var5)) {
            return var5;
         }
      }

      BlockPos var4 = mc.player.getBlockPos().offset(mc.player.getHorizontalFacing());
      return this.canPlantAt(var4) ? var4 : null;
   }

   private Item method4675() {
      return this.method4676();
   }

   private Item method4676() {
      List var1 = List.of(
         Items.OAK_SAPLING,
         Items.SPRUCE_SAPLING,
         Items.BIRCH_SAPLING,
         Items.JUNGLE_SAPLING,
         Items.ACACIA_SAPLING,
         Items.DARK_OAK_SAPLING,
         Items.CHERRY_SAPLING,
         Items.MANGROVE_PROPAGULE
      );
      Slot var2 = Helper66.method707(var1x -> var1.contains(var1x.getStack().getItem()));
      return var2 != null ? var2.getStack().getItem() : Items.AIR;
   }

   private boolean method4677(BlockPos var1) {
      if (var1 == null) {
         return false;
      } else {
         BlockState var2 = mc.world.getBlockState(var1);
         if (!var2.isIn(BlockTags.LOGS) && !var2.isIn(BlockTags.LEAVES)) {
            return false;
         } else {
            Direction var3 = this.method4680(var1);
            if (var3 == null) {
               return false;
            } else {
               this.currentBreakSide = var3;
               return mc.player.squaredDistanceTo(var1.toCenterPos()) <= this.breakRange.method2082() * this.breakRange.method2082();
            }
         }
      }
   }

   private Helper443 method4678() {
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      int var3 = this.scanRadius.method2080();
      int var4 = this.scanHeight.method2080();

      for (int var5 = -var3; var5 <= var3; var5++) {
         for (int var6 = -var3; var6 <= var3; var6++) {
            for (int var7 = 0; var7 <= var4; var7++) {
               BlockPos var8 = this.farmPos.add(var5, var7, var6);
               BlockState var9 = mc.world.getBlockState(var8);
               double var10 = mc.player.squaredDistanceTo(var8.toCenterPos());
               if (!(var10 > this.breakRange.method2082() * this.breakRange.method2082())) {
                  Direction var12 = this.method4680(var8);
                  if (var12 != null) {
                     Helper443 var13 = new Helper443(var8, var12, var10);
                     if (var9.isIn(BlockTags.LOGS)) {
                        var1.add(var13);
                     } else if (var9.isIn(BlockTags.LEAVES)) {
                        var2.add(var13);
                     }
                  }
               }
            }
         }
      }

      Comparator var14 = Comparator.comparingDouble(Helper443::method4646);
      Helper443 var15 = (Helper443)var2.stream().min(var14).orElse(null);
      return var15 != null ? var15 : (Helper443)var1.stream().min(var14).orElse(null);
   }

   private boolean method4679() {
      int var1 = this.scanRadius.method2080();
      int var2 = this.scanHeight.method2080();

      for (int var3 = -var1; var3 <= var1; var3++) {
         for (int var4 = -var1; var4 <= var1; var4++) {
            for (int var5 = 0; var5 <= var2; var5++) {
               BlockPos var6 = this.farmPos.add(var3, var5, var4);
               if (mc.world.getBlockState(var6).isIn(BlockTags.LEAVES)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private Direction method4680(BlockPos var1) {
      Vec3d var2 = mc.player.getEyePos();
      Vec3d var3 = var1.toCenterPos();

      for (Direction var7 : Direction.values()) {
         Vec3d var8 = var3.add(var7.getOffsetX() * 0.499, var7.getOffsetY() * 0.499, var7.getOffsetZ() * 0.499);
         BlockHitResult var9 = mc.world.raycast(new RaycastContext(var2, var8, ShapeType.OUTLINE, FluidHandling.NONE, mc.player));
         if (var9 != null && var9.getType() == Type.BLOCK && var9.getBlockPos().equals(var1)) {
            return var9.getSide();
         }
      }

      return null;
   }

   private boolean method4681(BlockPos var1, Direction var2) {
      Vec3d var3 = mc.player.getEyePos();
      Vec3d var4 = var1.toCenterPos().add(var2.getOffsetX() * 0.5, var2.getOffsetY() * 0.5, var2.getOffsetZ() * 0.5);
      return this.method4682(var4, this.aimToleranceDeg.method2082());
   }

   private boolean method4682(Vec3d var1, float var2) {
      Vec3d var3 = mc.player.getEyePos();
      Vec3d var4 = var1.subtract(var3);
      double var5 = Math.sqrt(var4.x * var4.x + var4.z * var4.z);
      float var7 = (float)(Math.toDegrees(Math.atan2(var4.z, var4.x)) - 90.0);
      float var8 = (float)(-Math.toDegrees(Math.atan2(var4.y, var5)));
      float var9 = MathHelper.wrapDegrees(var7 - mc.player.getYaw());
      float var10 = MathHelper.wrapDegrees(var8 - mc.player.getPitch());
      float var11 = mc.player.getYaw() + MathHelper.clamp(var9, -this.rotateStepYaw.method2082(), this.rotateStepYaw.method2082());
      float var12 = mc.player.getPitch() + MathHelper.clamp(var10, -this.rotateStepPitch.method2082(), this.rotateStepPitch.method2082());
      var12 = MathHelper.clamp(var12, -90.0F, 90.0F);
      mc.player.setYaw(var11);
      mc.player.setPitch(var12);
      mc.player.setHeadYaw(var11);
      mc.player.setBodyYaw(var11);
      return Math.abs(var9) <= var2 && Math.abs(var10) <= var2;
   }

   private void method4683(BlockPos var1) {
      if (this.toolSwitchTimer.method3356(this.toolSwitchDelayMs.method2080())) {
         BlockState var2 = mc.world.getBlockState(var1);
         int var3 = -1;
         float var4 = 1.0F;

         for (int var5 = 0; var5 < 9; var5++) {
            ItemStack var6 = mc.player.getInventory().getStack(var5);
            float var7 = var6.getMiningSpeedMultiplier(var2);
            if (var7 > var4) {
               var4 = var7;
               var3 = var5;
            }
         }

         if (var3 != -1 && var3 != mc.player.getInventory().selectedSlot) {
            Helper66.method696(var3);
            this.toolSwitchTimer.method3358();
         }
      }
   }

   private int findHotbarSlot(Item var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (mc.player.getInventory().getStack(var2).getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int findHotbarSlot(Predicate<ItemStack> var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.test(mc.player.getInventory().getStack(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private void sendBaritone(String var1) {
      if (mc.player != null && mc.player.networkHandler != null) {
         mc.player.networkHandler.sendChatMessage(var1);
      }
   }

   private boolean method4684() {
      try {
         Class.forName("baritone.api.BaritoneAPI");
         return true;
      } catch (Throwable var2) {
         return false;
      }
   }
}

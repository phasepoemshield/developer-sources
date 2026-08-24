package moscow.rockstar.module.player;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import lombok.Generated;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.InputEvent;
import moscow.rockstar.systems.event.impl.render.Render3DEvent;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.systems.notifications.NotificationType;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.config.settings.StringSetting;
import moscow.rockstar.util.colors.ColorRGBA;
import moscow.rockstar.util.colors.Colors;
import moscow.rockstar.util.game.EntityUtility;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.inventory.ItemSlot;
import moscow.rockstar.util.inventory.group.SlotGroups;
import moscow.rockstar.util.inventory.slots.HotbarSlot;
import moscow.rockstar.util.inventory.slots.InventorySlot;
import moscow.rockstar.util.math.MathUtility;
import moscow.rockstar.util.render.Draw3DUtility;
import moscow.rockstar.util.rotations.MoveCorrection;
import moscow.rockstar.util.rotations.Rotation;
import moscow.rockstar.util.rotations.RotationMath;
import moscow.rockstar.util.rotations.RotationPriority;
import moscow.rockstar.util.time.Timer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BrewingStandBlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.gui.screen.ingame.BrewingStandScreen;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.ItemEntity;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.screen.BrewingStandScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
@ModuleInfo(name = "Auto Farm", category = ModuleCategory.PLAYER, desc = "Универсальный модуль для автоматической фермы")
public class AutoFarm extends BaseModule {
   private static final double CROP_ACTION_RANGE_SQUARED = 6.25;
   private static final double CROP_DROP_RANGE_SQUARED = 2.25;
   private static final double CROP_WALK_STOP_RANGE_SQUARED = 1.0;
   private static final long CROP_BONE_MEAL_DELAY_MS = 35L;
   private static final int CROP_BONE_MEAL_BURST = 4;
   private static final int CROP_REPLANT_RESERVE = 16;

   private final ModeSetting mode = new ModeSetting(this, "Режим");
   private final ModeSetting.Value apple = new ModeSetting.Value(this.mode, "Яблоки").select();
   private final ModeSetting.Value sword = new ModeSetting.Value(this.mode, "Мечи");
   private final ModeSetting.Value potion = new ModeSetting.Value(this.mode, "Зелья");
   private final ModeSetting.Value potionCombiner = new ModeSetting.Value(this.mode, "Комбайнер зелий");
   private final ModeSetting.Value autoSell = new ModeSetting.Value(this.mode, "Автопродажа");
   private final ModeSetting.Value crop = new ModeSetting.Value(this.mode, "Культуры");

   private final SliderSetting appleBonemealDelay = new SliderSetting(this, "Задержка костной муки", () -> !this.isApple())
      .step(10.0F)
      .min(0.0F)
      .max(1000.0F)
      .currentValue(150.0F)
      .suffix("мс");

   private final StringSetting swordPrice = new StringSetting(this, "Цена меча", () -> !this.isSword()).text("15000");
   private final SliderSetting swordRelistCooldown = new SliderSetting(this, "Кулдаун перевыставления", () -> !this.isSword())
      .step(5.0F)
      .min(5.0F)
      .max(300.0F)
      .currentValue(60.0F)
      .suffix("сек");
   private final BooleanSetting swordCraftAll = new BooleanSetting(this, "Крафтить все", () -> !this.isSword());

   private final ModeSetting potionBrew = new ModeSetting(this, "Зелье для варки", () -> !this.isPotion());
   private final ModeSetting.Value potionStrength = new ModeSetting.Value(this.potionBrew, "Сила").select();
   private final ModeSetting.Value potionSpeed = new ModeSetting.Value(this.potionBrew, "Скорость");
   private final ModeSetting.Value potionFireResistance = new ModeSetting.Value(this.potionBrew, "Огнеупорность");
   private final ModeSetting.Value potionInvisibility = new ModeSetting.Value(this.potionBrew, "Невидимость");
   private final ModeSetting.Value potionRegen = new ModeSetting.Value(this.potionBrew, "Регенерация");
   private final ModeSetting.Value potionHealing = new ModeSetting.Value(this.potionBrew, "Лечение");
   private final ModeSetting.Value potionStrongHealing = new ModeSetting.Value(this.potionBrew, "Сильное лечение");
   private final ModeSetting potionStackMode = new ModeSetting(this, "Режим стаковки", () -> !this.isPotion());
   private final ModeSetting.Value potionStackMultiple = new ModeSetting.Value(this.potionStackMode, "Множественная").select();
   private final ModeSetting.Value potionStackSingle = new ModeSetting.Value(this.potionStackMode, "Одиночная");
   private final BooleanSetting potionEnhance = new BooleanSetting(this, "Улучшение", () -> !this.isPotion() || this.potionInvisibility.isSelected());
   private final BooleanSetting potionUseChests = new BooleanSetting(this, "Использовать сундуки", () -> !this.isPotion()).enabled(true);
   private final BooleanSetting potionTargetEsp = new BooleanSetting(this, "Целевой ESP", () -> !this.isPotion()).enabled(true);
   private final SliderSetting potionDelay = new SliderSetting(this, "Задержка", "Задержка между действиями", () -> !this.isPotion())
      .step(10.0F)
      .min(0.0F)
      .max(1500.0F)
      .currentValue(250.0F)
      .suffix("мс");
   private final SliderSetting potionSingleStackDelay = new SliderSetting(
      this, "Задержка одиночной стаковки", "Задержка для одиночной стаковки", () -> !this.isPotion() || !this.potionStackSingle.isSelected()
   )
      .step(10.0F)
      .min(50.0F)
      .max(2000.0F)
      .currentValue(250.0F)
      .suffix("мс");

   private final ModeSetting combinerPotions = new ModeSetting(this, "Зелья для комбайнера", () -> !this.isPotionCombiner());
   private final ModeSetting.Value combinerStrength = new ModeSetting.Value(this.combinerPotions, "Сила").select();
   private final ModeSetting.Value combinerSpeed = new ModeSetting.Value(this.combinerPotions, "Скорость");
   private final ModeSetting.Value combinerStrengthSpeed = new ModeSetting.Value(this.combinerPotions, "Сила + Скорость");
   private final BooleanSetting combinerAutoOpen = new BooleanSetting(this, "Автооткрытие", () -> !this.isPotionCombiner()).enabled(true);
   private final BooleanSetting combinerAutoExp = new BooleanSetting(this, "Автоопыт", () -> !this.isPotionCombiner());
   private final SliderSetting combinerRefillTo = new SliderSetting(this, "Дозаправка до", () -> !this.isPotionCombiner() || !this.combinerAutoExp.isEnabled())
      .step(1.0F)
      .min(5.0F)
      .max(100.0F)
      .currentValue(40.0F);

   private final StringSetting autoSellQuantity = new StringSetting(this, "Количество для продажи", () -> !this.isAutoSell()).text("64");
   private final StringSetting autoSellPrice = new StringSetting(this, "Цена продажи", () -> !this.isAutoSell()).text("10000");
   private final SliderSetting autoSellRelistCooldown = new SliderSetting(this, "Кулдаун перевыставления", () -> !this.isAutoSell())
      .step(5.0F)
      .min(5.0F)
      .max(300.0F)
      .currentValue(60.0F)
      .suffix("сек");
   private final BooleanSetting autoSellConfirm = new BooleanSetting(this, "Подтверждение", () -> !this.isAutoSell());

   private final ModeSetting cropType = new ModeSetting(this, "Тип культуры", () -> !this.isCrop());
   private final ModeSetting.Value cropNetherWart = new ModeSetting.Value(this.cropType, "Адский нарост").select();
   private final ModeSetting.Value cropWheat = new ModeSetting.Value(this.cropType, "Пшеница");
   private final ModeSetting.Value cropCarrots = new ModeSetting.Value(this.cropType, "Морковь");
   private final ModeSetting.Value cropPotatoes = new ModeSetting.Value(this.cropType, "Картофель");
   private final ModeSetting.Value cropBeetroots = new ModeSetting.Value(this.cropType, "Свекла");
   private final ModeSetting.Value cropSugarCane = new ModeSetting.Value(this.cropType, "Сахарный тростник");
   private final SliderSetting cropScanRadius = new SliderSetting(this, "Радиус сканирования", () -> !this.isCrop())
      .step(2.0F)
      .min(8.0F)
      .max(64.0F)
      .currentValue(24.0F);
   private final SliderSetting cropVerticalRange = new SliderSetting(this, "Вертикальный диапазон", () -> !this.isCrop())
      .step(1.0F)
      .min(1.0F)
      .max(8.0F)
      .currentValue(3.0F);
   private final BooleanSetting cropReplant = new BooleanSetting(this, "Пересаживать", () -> !this.isCrop()).enabled(true);
   private final BooleanSetting cropUseHoe = new BooleanSetting(this, "Использовать мотыгу", () -> !this.isCrop()).enabled(true);
   private final BooleanSetting cropPickup = new BooleanSetting(this, "Подбирать", () -> !this.isCrop()).enabled(true);
   private final BooleanSetting cropAutoDeposit = new BooleanSetting(this, "Автовклад", () -> !this.isCrop()).enabled(true);
   private final BooleanSetting cropTargetEsp = new BooleanSetting(this, "Целевой ESP", () -> !this.isCrop()).enabled(true);
   private final SliderSetting cropActionDelay = new SliderSetting(this, "Задержка действия", () -> !this.isCrop())
      .step(10.0F)
      .min(0.0F)
      .max(500.0F)
      .currentValue(80.0F)
      .suffix("ms");

   private final Timer actionTimer = new Timer();
   private final Timer sellTimer = new Timer();
   private final Timer warnTimer = new Timer();
   private BlockPos currentTarget;
   private BlockPos currentChest;
   private BlockPos appleDirt;
   private BlockPos pendingReplant;
   private PotionDepositState potionDepositState = PotionDepositState.NONE;
   private boolean cropWalking;
   private Vec3d cropWalkTarget;
   private double cropWalkStopRangeSquared;

   private final EventListener<Render3DEvent> onRender3D = event -> {
      if (!EntityUtility.isInGame() || this.currentTarget == null) {
         return;
      }

      if (!(this.isCrop() && this.cropTargetEsp.isEnabled()) && !(this.isPotion() && this.potionTargetEsp.isEnabled())) {
         return;
      }

      this.drawTarget(event, this.currentTarget, this.isPotion() ? new ColorRGBA(255.0F, 196.0F, 64.0F) : new ColorRGBA(120.0F, 220.0F, 96.0F));
   };

   private final EventListener<InputEvent> onInput = event -> {
      if (!this.cropWalking || this.cropWalkTarget == null || mc.player == null || mc.currentScreen != null) {
         return;
      }

      if (mc.player.squaredDistanceTo(this.cropWalkTarget) <= this.cropWalkStopRangeSquared) {
         this.stopCropWalking();
         return;
      }

      event.setForward(1.0F);
      event.setStrafe(0.0F);
      event.setSprint(true);
      event.setJump(mc.player.horizontalCollision && mc.player.isOnGround());
   };

   @Override
   public void tick() {
      if (mc.player == null || mc.world == null || mc.interactionManager == null || mc.player.networkHandler == null) {
         return;
      }

      if (!this.isCrop()) {
         this.stopCropWalking();
      }

      if (this.isApple()) {
         this.handleAppleFarm();
      } else if (this.isSword()) {
         this.handleSwordFarmSafely();
      } else if (this.isPotion()) {
         this.handlePotionFarm();
      } else if (this.isPotionCombiner()) {
         this.handlePotionCombiner();
      } else if (this.isAutoSell()) {
         this.handleAutoSell();
      } else if (this.isCrop()) {
         this.handleCropFarm();
      }
   }

   @Override
   public void onDisable() {
      this.currentTarget = null;
      this.currentChest = null;
      this.appleDirt = null;
      this.pendingReplant = null;
      this.potionDepositState = PotionDepositState.NONE;
      this.stopCropWalking();
   }

   private void handleAppleFarm() {
      if (this.appleDirt == null || !this.isAppleDirt(this.appleDirt)) {
         List<BlockPos> dirt = this.findAppleDirtBlocks();
         if (dirt.isEmpty()) {
            this.warn("modules.apple_farm.no_dirt");
            return;
         }

         if (dirt.size() > 1) {
            this.warn("modules.apple_farm.multiple_dirt");
            return;
         }

         this.appleDirt = dirt.getFirst();
      }

      BlockPos saplingPos = this.appleDirt.up();
      BlockState saplingState = mc.world.getBlockState(saplingPos);
      this.currentTarget = saplingPos;
      if (saplingState.isAir()) {
         if (!this.ensureHotbarItem(stack -> stack.getItem() == Items.OAK_SAPLING)) {
            this.warn("modules.apple_farm.no_sapling");
            return;
         }

         this.useBlock(this.appleDirt, Direction.UP, Hand.MAIN_HAND);
         return;
      }

      if (saplingState.getBlock() == Blocks.OAK_SAPLING) {
         if (!this.ensureHotbarItem(stack -> stack.getItem() == Items.BONE_MEAL)) {
            this.warn("modules.apple_farm.no_bonemeal");
            return;
         }

         if (this.actionTimer.finished((long)this.appleBonemealDelay.getCurrentValue())) {
            this.useBlock(saplingPos, Direction.UP, Hand.MAIN_HAND);
            this.actionTimer.reset();
         }

         return;
      }

      BlockPos treeBlock = this.findTreeBlock(saplingPos);
      if (treeBlock != null) {
         this.currentTarget = treeBlock;
         if (this.ensureHotbarItem(this::isAxeOrHoe) && this.actionTimer.finished(120L)) {
            this.breakBlock(treeBlock);
            this.actionTimer.reset();
         }
      }
   }

   private void handleCropFarm() {
      if (this.cropAutoDeposit.isEnabled()
         && (mc.currentScreen instanceof GenericContainerScreen || this.isInventoryFull() && this.hasDepositableSelectedCropItems())) {
         this.depositSelectedCrops();
         return;
      }

      if (this.cropPickup.isEnabled() && this.moveToNearestDrop()) {
         return;
      }

      if (this.tryReplantPending()) {
         return;
      }

      if (this.tryBoneMealSelectedCrop()) {
         return;
      }

      BlockPos target = this.findCropTarget();
      this.currentTarget = target;
      if (target == null) {
         if (this.tryReplantNearPlayer()) {
            return;
         }

         if (this.cropAutoDeposit.isEnabled() && this.hasDepositableSelectedCropItems()) {
            this.depositSelectedCrops();
         } else {
            this.stopCropWalking();
         }

         return;
      }

      if (!this.isInCropActionRange(target)) {
         this.walkToCropTarget(target);
         return;
      }

      this.stopCropWalking();
      if (!this.actionTimer.finished((long)this.cropActionDelay.getCurrentValue())) {
         return;
      }

      if (this.cropUseHoe.isEnabled()) {
         this.ensureHotbarItem(this::isHoe);
      }

      this.pendingReplant = target.toImmutable();
      this.breakBlock(target);
      this.actionTimer.reset();
   }

   private void handlePotionFarm() {
      if (this.potionDepositState == PotionDepositState.OPEN_CHEST || this.potionDepositState == PotionDepositState.DEPOSIT) {
         this.depositPotionsToChest();
         return;
      }

      if (!(mc.currentScreen instanceof BrewingStandScreen) || !(mc.player.currentScreenHandler instanceof BrewingStandScreenHandler brew)) {
         BrewingStandBlockEntity stand = this.findBlockEntity(BrewingStandBlockEntity.class, 5.0);
         if (stand != null && this.actionTimer.finished(300L)) {
            this.currentTarget = stand.getPos();
            this.useBlock(stand.getPos(), Direction.UP, Hand.MAIN_HAND);
            this.actionTimer.reset();
         }

         return;
      }

      this.currentTarget = ((BrewingStandScreenHandler)mc.player.currentScreenHandler).slots.getFirst().inventory instanceof BrewingStandBlockEntity stand
         ? stand.getPos()
         : this.currentTarget;

      if (!this.actionTimer.finished((long)this.potionDelay.getCurrentValue())) {
         return;
      }

      if (brew.getFuel() <= 0 && brew.getSlot(4).getStack().isEmpty()) {
         this.moveOneIngredient(Items.BLAZE_POWDER, 4);
         return;
      }

      if (this.fillPotionBottles(brew)) {
         return;
      }

      Item ingredient = this.nextPotionIngredient(brew);
      if (ingredient != null) {
         this.moveOneIngredient(ingredient, 3);
         return;
      }

      if (this.isPotionComplete(brew)) {
         this.lootPotions(brew);
         if (this.potionUseChests.isEnabled()) {
            this.potionDepositState = PotionDepositState.OPEN_CHEST;
         }
      }
   }

   private void handlePotionCombiner() {
      if (this.combinerAutoOpen.isEnabled() && mc.currentScreen == null) {
         ChestBlockEntity chest = this.findBlockEntity(ChestBlockEntity.class, 5.0);
         if (chest != null && this.actionTimer.finished(350L)) {
            this.currentTarget = chest.getPos();
            this.useBlock(chest.getPos(), Direction.UP, Hand.MAIN_HAND);
            this.actionTimer.reset();
         }

         return;
      }

      if (!(mc.currentScreen instanceof GenericContainerScreen) || !(mc.player.currentScreenHandler instanceof GenericContainerScreenHandler handler)) {
         return;
      }

      if (!this.actionTimer.finished(150L)) {
         return;
      }

      Potion wanted = this.selectedCombinerPotion();
      int moved = 0;
      for (int i = handler.getInventory().size(); i < handler.slots.size(); i++) {
         ItemStack stack = handler.getSlot(i).getStack();
         if (this.isPotionStack(stack) && this.matchesPotion(stack, wanted)) {
            mc.interactionManager.clickSlot(handler.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
            moved++;
            if (this.combinerStrengthSpeed.isSelected() && moved < 2) {
               continue;
            }
            break;
         }
      }

      if (this.combinerAutoExp.isEnabled() && this.countItem(Items.EXPERIENCE_BOTTLE) < this.combinerRefillTo.getCurrentValue()) {
         this.moveFirstContainerItem(handler, stack -> stack.getItem() == Items.EXPERIENCE_BOTTLE);
      }

      this.actionTimer.reset();
   }

   private void handleAutoSell() {
      if (mc.currentScreen instanceof GenericContainerScreen && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler handler) {
         if (this.autoSellConfirm.isEnabled() && this.clickFirstContainerItem(handler, stack -> stack.getItem() == Items.LIME_DYE)) {
            return;
         }

         this.clickFirstContainerItem(handler, stack -> stack.getName().getString().toLowerCase().contains("storage"));
         return;
      }

      ItemStack hand = mc.player.getMainHandStack();
      if (hand.isEmpty()) {
         this.warn("modules.auto_sell.no_item_in_hand");
         return;
      }

      if (this.sellTimer.finished((long)(this.autoSellRelistCooldown.getCurrentValue() * 1000.0F))) {
         mc.player.networkHandler.sendChatCommand("ah sell " + this.sanitized(this.autoSellPrice.getText()));
         this.sellTimer.reset();
      }
   }

   private void handleSwordFarmSafely() {
      try {
         this.handleSwordFarm();
      } catch (RuntimeException exception) {
         Rockstar.LOGGER.warn("AutoFarm sword mode failed", exception);
         this.warn("modules.sword_farm.error");
      }
   }

   private void handleSwordFarm() {
      boolean hasSword = this.hasItem(this::isSwordStack);
      boolean hasStick = this.hasItem(stack -> stack.getItem() == Items.STICK);
      boolean hasDiamonds = this.countItem(Items.DIAMOND) >= 2;

      if (!hasSword && !hasStick) {
         this.warn("modules.sword_farm.no_sticks");
         return;
      }

      if (!hasSword && !hasDiamonds) {
         this.warn("modules.sword_farm.no_diamonds");
         return;
      }

      if (!this.ensureHotbarItem(this::isSwordStack)) {
         if (this.swordCraftAll.isEnabled() && mc.currentScreen instanceof GenericContainerScreen && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler handler) {
            if (!this.moveFirstContainerItem(handler, this::isSwordStack)) {
               this.warn("modules.sword_farm.no_sword");
            }

            return;
         }

         this.warn("modules.sword_farm.no_sword");
         return;
      }

      if (this.sellTimer.finished((long)(this.swordRelistCooldown.getCurrentValue() * 1000.0F))) {
         mc.player.networkHandler.sendChatCommand("ah sell " + this.sanitized(this.swordPrice.getText()));
         this.sellTimer.reset();
      }
   }

   private BlockPos findCropTarget() {
      int radius = (int)this.cropScanRadius.getCurrentValue();
      int vertical = (int)this.cropVerticalRange.getCurrentValue();
      BlockPos origin = mc.player.getBlockPos();
      BlockPos best = null;
      double bestDistance = Double.MAX_VALUE;

      for (int x = -radius; x <= radius; x++) {
         for (int y = -vertical; y <= vertical; y++) {
            for (int z = -radius; z <= radius; z++) {
               BlockPos pos = origin.add(x, y, z);
               if (!this.isReadyCrop(pos)) {
                  continue;
               }

               double distance = mc.player.squaredDistanceTo(pos.toCenterPos());
               if (distance < bestDistance) {
                  best = pos;
                  bestDistance = distance;
               }
            }
         }
      }

      return best;
   }

   private boolean isReadyCrop(BlockPos pos) {
      BlockState state = mc.world.getBlockState(pos);
      Block block = state.getBlock();
      if (this.cropNetherWart.isSelected()) {
         return block == Blocks.NETHER_WART && state.get(NetherWartBlock.AGE) >= 3;
      }

      if (this.cropSugarCane.isSelected()) {
         return block == Blocks.SUGAR_CANE && mc.world.getBlockState(pos.down()).getBlock() == Blocks.SUGAR_CANE;
      }

      if (block instanceof CropBlock cropBlock && this.isSelectedCropBlock(block)) {
         return cropBlock.getAge(state) >= cropBlock.getMaxAge();
      }

      return false;
   }

   private boolean tryBoneMealSelectedCrop() {
      if (!this.hasItem(stack -> stack.getItem() == Items.BONE_MEAL)) {
         return false;
      }

      BlockPos target = this.findBoneMealTarget();
      if (target == null) {
         return false;
      }

      this.currentTarget = target;
      if (!this.isInCropActionRange(target)) {
         this.walkToCropTarget(target);
         return true;
      }

      this.stopCropWalking();
      long boneMealDelay = Math.min((long)this.cropActionDelay.getCurrentValue(), CROP_BONE_MEAL_DELAY_MS);
      if (!this.actionTimer.finished(boneMealDelay)) {
         return true;
      }

      if (!this.ensureHotbarItem(stack -> stack.getItem() == Items.BONE_MEAL)) {
         return false;
      }

      int used = 0;
      for (int i = 0; i < CROP_BONE_MEAL_BURST; i++) {
         BlockPos inRangeTarget = this.findBoneMealTarget(this::isInCropActionRange);
         if (inRangeTarget == null) {
            break;
         }

         this.currentTarget = inRangeTarget;
         this.useBlock(inRangeTarget, Direction.UP, Hand.MAIN_HAND);
         used++;
      }

      if (used > 0) {
         this.actionTimer.reset();
         return true;
      }

      return false;
   }

   private BlockPos findBoneMealTarget() {
      return this.findBoneMealTarget(pos -> true);
   }

   private BlockPos findBoneMealTarget(Predicate<BlockPos> filter) {
      int radius = (int)this.cropScanRadius.getCurrentValue();
      int vertical = (int)this.cropVerticalRange.getCurrentValue();
      BlockPos origin = mc.player.getBlockPos();
      BlockPos best = null;
      double bestDistance = Double.MAX_VALUE;

      for (int x = -radius; x <= radius; x++) {
         for (int y = -vertical; y <= vertical; y++) {
            for (int z = -radius; z <= radius; z++) {
               BlockPos pos = origin.add(x, y, z);
               if (!this.isBoneMealableSelectedCrop(pos)) {
                  continue;
               }

               if (!filter.test(pos)) {
                  continue;
               }

               double distance = mc.player.squaredDistanceTo(pos.toCenterPos());
               if (distance < bestDistance) {
                  best = pos;
                  bestDistance = distance;
               }
            }
         }
      }

      return best;
   }

   private boolean isBoneMealableSelectedCrop(BlockPos pos) {
      BlockState state = mc.world.getBlockState(pos);
      Block block = state.getBlock();
      if (!(block instanceof CropBlock cropBlock) || !this.isSelectedCropBlock(block)) {
         return false;
      }

      return cropBlock.getAge(state) < cropBlock.getMaxAge();
   }

   private boolean isSelectedCropBlock(Block block) {
      return this.cropWheat.isSelected() && block == Blocks.WHEAT
         || this.cropCarrots.isSelected() && block == Blocks.CARROTS
         || this.cropPotatoes.isSelected() && block == Blocks.POTATOES
         || this.cropBeetroots.isSelected() && block == Blocks.BEETROOTS;
   }

   private boolean tryReplantPending() {
      if (!this.cropReplant.isEnabled() || this.pendingReplant == null) {
         return false;
      }

      Item seed = this.seedForCurrentCrop();
      if (seed == null) {
         this.pendingReplant = null;
         return false;
      }

      BlockPos target = this.pendingReplant;
      if (!this.isInCropActionRange(target)) {
         this.currentTarget = target;
         this.walkToCropTarget(target);
         return true;
      }

      BlockState state = mc.world.getBlockState(target);
      if (!state.isAir()) {
         if (this.isSelectedPlantedCrop(state.getBlock())) {
            this.pendingReplant = null;
         }

         return false;
      }

      if (!this.actionTimer.finished((long)this.cropActionDelay.getCurrentValue())) {
         this.currentTarget = target;
         this.stopCropWalking();
         return true;
      }

      if (this.tryPlantCropAt(target, seed)) {
         this.pendingReplant = null;
         return true;
      }

      return false;
   }

   private boolean isSelectedPlantedCrop(Block block) {
      return this.isSelectedCropBlock(block)
         || this.cropNetherWart.isSelected() && block == Blocks.NETHER_WART
         || this.cropSugarCane.isSelected() && block == Blocks.SUGAR_CANE;
   }

   private boolean tryReplantNearPlayer() {
      if (!this.cropReplant.isEnabled() || !this.actionTimer.finished((long)this.cropActionDelay.getCurrentValue())) {
         return false;
      }

      Item seed = this.seedForCurrentCrop();
      if (seed == null) {
         return false;
      }

      BlockPos origin = mc.player.getBlockPos();
      int radius = (int)this.cropScanRadius.getCurrentValue();
      int vertical = (int)this.cropVerticalRange.getCurrentValue();
      BlockPos best = null;
      double bestDistance = Double.MAX_VALUE;
      for (int x = -radius; x <= radius; x++) {
         for (int y = -vertical; y <= vertical; y++) {
            for (int z = -radius; z <= radius; z++) {
               BlockPos pos = origin.add(x, y, z);
               double distance = mc.player.squaredDistanceTo(pos.toCenterPos());
               if (!this.isPlantableCropSpot(pos, seed)) {
                  continue;
               }

               if (distance < bestDistance) {
                  best = pos;
                  bestDistance = distance;
               }
            }
         }
      }

      if (best != null) {
         this.currentTarget = best;
         if (!this.isInCropActionRange(best)) {
            this.walkToCropTarget(best);
            return true;
         }

         this.stopCropWalking();
         return this.tryPlantCropAt(best, seed);
      }

      return false;
   }

   private boolean tryPlantCropAt(BlockPos pos, Item seed) {
      if (!this.isPlantableCropSpot(pos, seed) || !this.ensureHotbarItem(stack -> stack.getItem() == seed)) {
         return false;
      }

      this.currentTarget = pos;
      this.stopCropWalking();
      this.useBlock(pos.down(), Direction.UP, Hand.MAIN_HAND);
      this.actionTimer.reset();
      return true;
   }

   private boolean isPlantableCropSpot(BlockPos pos, Item seed) {
      if (!mc.world.getBlockState(pos).isAir()) {
         return false;
      }

      Block support = mc.world.getBlockState(pos.down()).getBlock();
      return this.canPlantOn(support, seed) && (seed != Items.SUGAR_CANE || this.hasAdjacentWater(pos.down()));
   }

   private boolean canPlantOn(Block blockBelow, Item seed) {
      if (seed == Items.NETHER_WART) {
         return blockBelow == Blocks.SOUL_SAND;
      }

      if (seed == Items.SUGAR_CANE) {
         return blockBelow == Blocks.SAND || blockBelow == Blocks.DIRT || blockBelow == Blocks.GRASS_BLOCK || blockBelow == Blocks.MUD;
      }

      return blockBelow == Blocks.FARMLAND;
   }

   private boolean hasAdjacentWater(BlockPos pos) {
      for (Direction direction : Direction.Type.HORIZONTAL) {
         if (mc.world.getFluidState(pos.offset(direction)).isOf(Fluids.WATER)) {
            return true;
         }
      }

      return false;
   }

   private Item seedForCurrentCrop() {
      if (this.cropNetherWart.isSelected()) {
         return Items.NETHER_WART;
      } else if (this.cropWheat.isSelected()) {
         return Items.WHEAT_SEEDS;
      } else if (this.cropCarrots.isSelected()) {
         return Items.CARROT;
      } else if (this.cropPotatoes.isSelected()) {
         return Items.POTATO;
      } else if (this.cropBeetroots.isSelected()) {
         return Items.BEETROOT_SEEDS;
      } else if (this.cropSugarCane.isSelected()) {
         return Items.SUGAR_CANE;
      }

      return null;
   }

   private void depositSelectedCrops() {
      if (mc.currentScreen instanceof GenericContainerScreen && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler handler) {
         if (!this.depositOneSelectedCropStack(handler)) {
            mc.player.closeHandledScreen();
         }

         return;
      }

      if (!this.hasDepositableSelectedCropItems()) {
         this.currentChest = null;
         this.stopCropWalking();
         return;
      }

      ChestBlockEntity chest = this.findCropDepositChest();
      if (chest == null) {
         this.stopCropWalking();
         this.warn("modules.crop_farm.no_chest");
         return;
      }

      this.currentChest = chest.getPos();
      this.currentTarget = this.currentChest;
      if (!this.isInCropActionRange(this.currentChest)) {
         this.walkToCropTarget(this.currentChest);
         return;
      }

      this.stopCropWalking();
      if (this.actionTimer.finished(300L)) {
         this.useBlock(this.currentChest, Direction.UP, Hand.MAIN_HAND);
         this.actionTimer.reset();
      }
   }

   private boolean depositOneSelectedCropStack(GenericContainerScreenHandler handler) {
      int containerSize = handler.getInventory().size();
      int emptyContainerSlot = this.findEmptyContainerSlot(handler, containerSize);

      for (int i = containerSize; i < handler.slots.size(); i++) {
         ItemStack stack = handler.getSlot(i).getStack();
         if (!this.isSelectedCropItem(stack) || !this.canDepositCropStack(stack, emptyContainerSlot != -1)) {
            continue;
         }

         int reserveInThisStack = this.getReserveInStack(stack);
         if (reserveInThisStack > 0) {
            mc.interactionManager.clickSlot(handler.syncId, i, 0, SlotActionType.PICKUP, mc.player);
            for (int reserve = 0; reserve < reserveInThisStack; reserve++) {
               mc.interactionManager.clickSlot(handler.syncId, i, 1, SlotActionType.PICKUP, mc.player);
            }

            mc.interactionManager.clickSlot(handler.syncId, emptyContainerSlot, 0, SlotActionType.PICKUP, mc.player);
         } else {
            mc.interactionManager.clickSlot(handler.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
         }

         this.actionTimer.reset();
         return true;
      }

      return false;
   }

   private boolean canDepositCropStack(ItemStack stack, boolean hasEmptyContainerSlot) {
      if (!this.shouldReserveCropItem(stack.getItem())) {
         return true;
      }

      int total = this.countItem(stack.getItem());
      if (total - stack.getCount() >= CROP_REPLANT_RESERVE) {
         return true;
      }

      return hasEmptyContainerSlot && total > CROP_REPLANT_RESERVE;
   }

   private int getReserveInStack(ItemStack stack) {
      if (!this.shouldReserveCropItem(stack.getItem())) {
         return 0;
      }

      return Math.max(0, CROP_REPLANT_RESERVE - (this.countItem(stack.getItem()) - stack.getCount()));
   }

   private int findEmptyContainerSlot(GenericContainerScreenHandler handler, int containerSize) {
      for (int i = 0; i < containerSize; i++) {
         if (handler.getSlot(i).getStack().isEmpty()) {
            return i;
         }
      }

      return -1;
   }

   private boolean shouldReserveCropItem(Item item) {
      return item == Items.CARROT || item == Items.POTATO || item == Items.NETHER_WART || item == Items.SUGAR_CANE;
   }

   private boolean isSelectedCropItem(ItemStack stack) {
      Item item = stack.getItem();
      return this.cropNetherWart.isSelected() && item == Items.NETHER_WART
         || this.cropWheat.isSelected() && item == Items.WHEAT
         || this.cropCarrots.isSelected() && item == Items.CARROT
         || this.cropPotatoes.isSelected() && item == Items.POTATO
         || this.cropBeetroots.isSelected() && item == Items.BEETROOT
         || this.cropSugarCane.isSelected() && item == Items.SUGAR_CANE;
   }

   private boolean hasSelectedCropItems() {
      return this.hasItem(this::isSelectedCropItem);
   }

   private boolean hasDepositableSelectedCropItems() {
      Item selected = this.selectedCropDepositItem();
      if (selected == null) {
         return false;
      }

      int count = this.countItem(selected);
      return this.shouldReserveCropItem(selected) ? count > CROP_REPLANT_RESERVE : count > 0;
   }

   private Item selectedCropDepositItem() {
      if (this.cropNetherWart.isSelected()) {
         return Items.NETHER_WART;
      } else if (this.cropWheat.isSelected()) {
         return Items.WHEAT;
      } else if (this.cropCarrots.isSelected()) {
         return Items.CARROT;
      } else if (this.cropPotatoes.isSelected()) {
         return Items.POTATO;
      } else if (this.cropBeetroots.isSelected()) {
         return Items.BEETROOT;
      } else if (this.cropSugarCane.isSelected()) {
         return Items.SUGAR_CANE;
      }

      return null;
   }

   private boolean isInCropActionRange(BlockPos pos) {
      return pos != null && mc.player.squaredDistanceTo(pos.toCenterPos()) <= CROP_ACTION_RANGE_SQUARED;
   }

   private void walkToCropTarget(BlockPos pos) {
      this.walkTo(this.getCropWalkTarget(pos), CROP_WALK_STOP_RANGE_SQUARED);
   }

   private boolean walkTo(Vec3d target, double stopRangeSquared) {
      if (target == null || mc.currentScreen != null) {
         this.stopCropWalking();
         return false;
      }

      if (mc.player.squaredDistanceTo(target) <= stopRangeSquared) {
         this.stopCropWalking();
         return false;
      }

      Vec3d delta = target.subtract(mc.player.getPos());
      float yaw = (float)Math.toDegrees(Math.atan2(delta.z, delta.x)) - 90.0F;
      Rockstar.getInstance()
         .getRotationHandler()
         .rotate(new Rotation(yaw, mc.player.getPitch()), MoveCorrection.DIRECT, 85.0F, 85.0F, 120.0F, RotationPriority.NORMAL);
      mc.options.forwardKey.setPressed(true);
      mc.options.sprintKey.setPressed(true);
      mc.options.jumpKey.setPressed(mc.player.horizontalCollision && mc.player.isOnGround());
      this.cropWalkTarget = target;
      this.cropWalkStopRangeSquared = stopRangeSquared;
      this.cropWalking = true;
      return true;
   }

   private void stopCropWalking() {
      if (!this.cropWalking) {
         this.cropWalkTarget = null;
         this.cropWalkStopRangeSquared = 0.0;
         return;
      }

      mc.options.forwardKey.setPressed(false);
      mc.options.sprintKey.setPressed(false);
      mc.options.jumpKey.setPressed(false);
      this.cropWalkTarget = null;
      this.cropWalkStopRangeSquared = 0.0;
      this.cropWalking = false;
   }

   private Vec3d getCropWalkTarget(BlockPos pos) {
      BlockPos standPos = this.findCropStandPos(pos);
      return standPos == null ? pos.toCenterPos() : Vec3d.ofBottomCenter(standPos);
   }

   private BlockPos findCropStandPos(BlockPos pos) {
      BlockPos best = null;
      double bestDistance = Double.MAX_VALUE;

      for (Direction direction : Direction.Type.HORIZONTAL) {
         BlockPos candidate = pos.offset(direction);
         if (!this.canStandAt(candidate)) {
            continue;
         }

         double distance = mc.player.squaredDistanceTo(Vec3d.ofBottomCenter(candidate));
         if (distance < bestDistance) {
            best = candidate;
            bestDistance = distance;
         }
      }

      return best;
   }

   private boolean canStandAt(BlockPos pos) {
      return mc.world.getBlockState(pos).getCollisionShape(mc.world, pos).isEmpty()
         && mc.world.getBlockState(pos.up()).getCollisionShape(mc.world, pos.up()).isEmpty()
         && !mc.world.getBlockState(pos.down()).getCollisionShape(mc.world, pos.down()).isEmpty();
   }

   private ChestBlockEntity findCropDepositChest() {
      BlockPos origin = mc.player.getBlockPos();
      int radius = (int)Math.ceil(this.cropScanRadius.getCurrentValue());
      int vertical = Math.max(4, (int)this.cropVerticalRange.getCurrentValue() + 2);
      ChestBlockEntity best = null;
      double bestDistance = Double.MAX_VALUE;

      for (int x = -radius; x <= radius; x++) {
         for (int y = -vertical; y <= vertical; y++) {
            for (int z = -radius; z <= radius; z++) {
               BlockPos pos = origin.add(x, y, z);
               BlockEntity entity = mc.world.getBlockEntity(pos);
               if (!(entity instanceof ChestBlockEntity chest)) {
                  continue;
               }

               double distance = mc.player.squaredDistanceTo(pos.toCenterPos());
               if (distance < bestDistance) {
                  best = chest;
                  bestDistance = distance;
               }
            }
         }
      }

      return best;
   }

   private boolean moveToNearestDrop() {
      double pickupRange = Math.max(6.0, this.cropScanRadius.getCurrentValue());
      ItemEntity drop = mc.world
         .getEntitiesByClass(ItemEntity.class, mc.player.getBoundingBox().expand(pickupRange), entity -> this.isSelectedCropItem(entity.getStack()))
         .stream()
         .min(Comparator.comparingDouble(entity -> entity.squaredDistanceTo(mc.player)))
         .orElse(null);
      if (drop == null) {
         return false;
      }

      Vec3d dropPos = drop.getPos().add(0.0, 0.25, 0.0);
      Rockstar.getInstance()
         .getRotationHandler()
         .rotate(RotationMath.getRotationTo(dropPos), MoveCorrection.SILENT, 60.0F, 60.0F, 60.0F, RotationPriority.NORMAL);
      if (drop.squaredDistanceTo(mc.player) > CROP_DROP_RANGE_SQUARED) {
         this.currentTarget = drop.getBlockPos();
         this.walkTo(dropPos, CROP_DROP_RANGE_SQUARED);
         return true;
      }

      this.stopCropWalking();
      return false;
   }

   private Item nextPotionIngredient(BrewingStandScreenHandler brew) {
      if (this.allPotionSlotsAre(brew, Potions.WATER.value())) {
         return Items.NETHER_WART;
      }

      if (this.allPotionSlotsAre(brew, Potions.AWKWARD.value())) {
         if (this.potionStrength.isSelected()) {
            return Items.BLAZE_POWDER;
         } else if (this.potionSpeed.isSelected()) {
            return Items.SUGAR;
         } else if (this.potionFireResistance.isSelected()) {
            return Items.MAGMA_CREAM;
         } else if (this.potionInvisibility.isSelected()) {
            return Items.GOLDEN_CARROT;
         } else if (this.potionRegen.isSelected()) {
            return Items.GHAST_TEAR;
         } else if (this.potionHealing.isSelected() || this.potionStrongHealing.isSelected()) {
            return Items.GLISTERING_MELON_SLICE;
         }
      }

      if (this.potionInvisibility.isSelected() && this.allPotionSlotsAre(brew, Potions.NIGHT_VISION.value())) {
         return Items.FERMENTED_SPIDER_EYE;
      }

      if (this.potionEnhance.isEnabled()) {
         if (this.allPotionSlotsAre(brew, Potions.STRENGTH.value()) || this.allPotionSlotsAre(brew, Potions.SWIFTNESS.value()) || this.allPotionSlotsAre(brew, Potions.HEALING.value())) {
            return Items.GLOWSTONE_DUST;
         }

         if (this.allPotionSlotsAre(brew, Potions.FIRE_RESISTANCE.value()) || this.allPotionSlotsAre(brew, Potions.REGENERATION.value())) {
            return Items.REDSTONE;
         }
      }

      if (this.potionStrongHealing.isSelected() && this.allPotionSlotsAre(brew, Potions.HEALING.value())) {
         return Items.GLOWSTONE_DUST;
      }

      return null;
   }

   private boolean isPotionComplete(BrewingStandScreenHandler brew) {
      if (this.potionStrength.isSelected()) {
         return this.allPotionSlotsAre(brew, this.potionEnhance.isEnabled() ? Potions.STRONG_STRENGTH.value() : Potions.STRENGTH.value());
      } else if (this.potionSpeed.isSelected()) {
         return this.allPotionSlotsAre(brew, this.potionEnhance.isEnabled() ? Potions.STRONG_SWIFTNESS.value() : Potions.SWIFTNESS.value());
      } else if (this.potionFireResistance.isSelected()) {
         return this.allPotionSlotsAre(brew, this.potionEnhance.isEnabled() ? Potions.LONG_FIRE_RESISTANCE.value() : Potions.FIRE_RESISTANCE.value());
      } else if (this.potionInvisibility.isSelected()) {
         return this.allPotionSlotsAre(brew, Potions.INVISIBILITY.value());
      } else if (this.potionRegen.isSelected()) {
         return this.allPotionSlotsAre(brew, this.potionEnhance.isEnabled() ? Potions.LONG_REGENERATION.value() : Potions.REGENERATION.value());
      } else if (this.potionHealing.isSelected()) {
         return this.allPotionSlotsAre(brew, this.potionEnhance.isEnabled() ? Potions.STRONG_HEALING.value() : Potions.HEALING.value());
      } else if (this.potionStrongHealing.isSelected()) {
         return this.allPotionSlotsAre(brew, Potions.STRONG_HEALING.value());
      }

      return false;
   }

   private boolean fillPotionBottles(BrewingStandScreenHandler brew) {
      int limit = this.potionStackSingle.isSelected() ? 1 : 3;
      for (int i = 0; i < limit; i++) {
         if (brew.getSlot(i).getStack().isEmpty()) {
            int bottle = this.findWaterBottleSlot(brew);
            if (bottle != -1) {
               InventoryUtility.quickMove(bottle);
               this.actionTimer.reset();
               return true;
            }
         }
      }

      return false;
   }

   private int findWaterBottleSlot(BrewingStandScreenHandler brew) {
      for (int i = 5; i < brew.slots.size(); i++) {
         ItemStack stack = brew.getSlot(i).getStack();
         if (stack.getItem() == Items.POTION && this.matchesPotion(stack, Potions.WATER.value())) {
            return i;
         }
      }

      return -1;
   }

   private void moveOneIngredient(Item item, int slot) {
      int found = InventoryUtility.findItemInContainer(item);
      if (found == -1) {
         this.warn("potion_farm.no_item_title");
         return;
      }

      InventoryUtility.swapOneItem(found, slot);
      this.actionTimer.reset();
   }

   private boolean allPotionSlotsAre(BrewingStandScreenHandler brew, Potion potion) {
      int limit = this.potionStackSingle.isSelected() ? 1 : 3;
      for (int i = 0; i < limit; i++) {
         ItemStack stack = brew.getSlot(i).getStack();
         if (!this.isPotionStack(stack) || !this.matchesPotion(stack, potion)) {
            return false;
         }
      }

      return true;
   }

   private boolean matchesPotion(ItemStack stack, Potion potion) {
      Potion stackPotion = this.getPotion(stack);
      return stackPotion != null && stackPotion == potion;
   }

   private Potion getPotion(ItemStack stack) {
      PotionContentsComponent component = stack.get(DataComponentTypes.POTION_CONTENTS);
      if (component == null || component.potion().isEmpty()) {
         return null;
      }

      RegistryEntry<Potion> entry = component.potion().get();
      return entry.value();
   }

   private boolean isPotionStack(ItemStack stack) {
      return stack.getItem() == Items.POTION || stack.getItem() == Items.SPLASH_POTION || stack.getItem() == Items.LINGERING_POTION;
   }

   private void lootPotions(BrewingStandScreenHandler brew) {
      int limit = this.potionStackSingle.isSelected() ? 1 : 3;
      for (int i = 0; i < limit; i++) {
         if (!brew.getSlot(i).getStack().isEmpty()) {
            InventoryUtility.quickMove(i);
         }
      }

      this.actionTimer.reset();
   }

   private void depositPotionsToChest() {
      if (this.potionDepositState == PotionDepositState.OPEN_CHEST) {
         if (mc.currentScreen != null) {
            mc.player.closeHandledScreen();
            return;
         }

         ChestBlockEntity chest = this.findBlockEntity(ChestBlockEntity.class, 5.0);
         if (chest != null && this.actionTimer.finished(300L)) {
            this.currentTarget = chest.getPos();
            this.useBlock(chest.getPos(), Direction.UP, Hand.MAIN_HAND);
            this.potionDepositState = PotionDepositState.DEPOSIT;
            this.actionTimer.reset();
         } else if (chest == null) {
            this.warn("modules.crop_farm.no_chest");
            this.potionDepositState = PotionDepositState.NONE;
         }

         return;
      }

      if (mc.currentScreen instanceof GenericContainerScreen && mc.player.currentScreenHandler instanceof GenericContainerScreenHandler handler) {
         boolean moved = false;
         for (int i = handler.getInventory().size(); i < handler.slots.size(); i++) {
            ItemStack stack = handler.getSlot(i).getStack();
            if (this.isPotionStack(stack)) {
               mc.interactionManager.clickSlot(handler.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
               moved = true;
               break;
            }
         }

         if (!moved) {
            mc.player.closeHandledScreen();
            this.potionDepositState = PotionDepositState.NONE;
         }
      }
   }

   private Potion selectedCombinerPotion() {
      if (this.combinerSpeed.isSelected()) {
         return Potions.SWIFTNESS.value();
      }

      return Potions.STRENGTH.value();
   }

   private boolean moveFirstContainerItem(GenericContainerScreenHandler handler, Predicate<ItemStack> predicate) {
      for (int i = 0; i < handler.getInventory().size(); i++) {
         if (predicate.test(handler.getSlot(i).getStack())) {
            mc.interactionManager.clickSlot(handler.syncId, i, 0, SlotActionType.QUICK_MOVE, mc.player);
            this.actionTimer.reset();
            return true;
         }
      }

      return false;
   }

   private boolean clickFirstContainerItem(GenericContainerScreenHandler handler, Predicate<ItemStack> predicate) {
      for (int i = 0; i < handler.getInventory().size(); i++) {
         if (predicate.test(handler.getSlot(i).getStack())) {
            mc.interactionManager.clickSlot(handler.syncId, i, 0, SlotActionType.PICKUP, mc.player);
            this.actionTimer.reset();
            return true;
         }
      }

      return false;
   }

   private List<BlockPos> findAppleDirtBlocks() {
      BlockPos origin = mc.player.getBlockPos();
      return BlockPos.stream(origin.add(-4, -2, -4), origin.add(4, 2, 4))
         .map(BlockPos::toImmutable)
         .filter(this::isAppleDirt)
         .filter(pos -> mc.player.squaredDistanceTo(pos.toCenterPos()) <= 16.0)
         .toList();
   }

   private boolean isAppleDirt(BlockPos pos) {
      Block block = mc.world.getBlockState(pos).getBlock();
      return (block == Blocks.DIRT || block == Blocks.GRASS_BLOCK) && mc.world.getBlockState(pos.up()).isAir();
   }

   private BlockPos findTreeBlock(BlockPos root) {
      return BlockPos.stream(root.add(-4, 0, -4), root.add(4, 8, 4))
         .map(BlockPos::toImmutable)
         .filter(pos -> {
            BlockState state = mc.world.getBlockState(pos);
            return state.isIn(BlockTags.LOGS) || state.isIn(BlockTags.LEAVES);
         })
         .min(Comparator.comparingDouble(pos -> mc.player.squaredDistanceTo(pos.toCenterPos())))
         .orElse(null);
   }

   private boolean ensureHotbarItem(Predicate<ItemStack> predicate) {
      if (predicate.test(mc.player.getMainHandStack())) {
         return true;
      }

      HotbarSlot hotbar = SlotGroups.hotbar().findItem(predicate);
      if (hotbar != null) {
         InventoryUtility.selectHotbarSlot(hotbar);
         return true;
      }

      InventorySlot inventory = SlotGroups.inventory().findItem(predicate);
      if (inventory != null) {
         inventory.swapTo(InventoryUtility.getCurrentHotbarSlot());
         return true;
      }

      return false;
   }

   private boolean hasItem(Predicate<ItemStack> predicate) {
      return SlotGroups.inventory().and(SlotGroups.hotbar()).and(SlotGroups.offhand()).findItem(predicate) != null;
   }

   private int countItem(Item item) {
      return SlotGroups.inventory().and(SlotGroups.hotbar()).and(SlotGroups.offhand()).countItems(item);
   }

   private boolean isHoe(ItemStack stack) {
      return stack.getItem() == Items.WOODEN_HOE
         || stack.getItem() == Items.STONE_HOE
         || stack.getItem() == Items.IRON_HOE
         || stack.getItem() == Items.GOLDEN_HOE
         || stack.getItem() == Items.DIAMOND_HOE
         || stack.getItem() == Items.NETHERITE_HOE;
   }

   private boolean isAxeOrHoe(ItemStack stack) {
      Item item = stack.getItem();
      return this.isHoe(stack)
         || item == Items.WOODEN_AXE
         || item == Items.STONE_AXE
         || item == Items.IRON_AXE
         || item == Items.GOLDEN_AXE
         || item == Items.DIAMOND_AXE
         || item == Items.NETHERITE_AXE;
   }

   private boolean isSwordStack(ItemStack stack) {
      return stack != null && !stack.isEmpty() && stack.getItem() instanceof SwordItem;
   }

   private void useBlock(BlockPos pos, Direction direction, Hand hand) {
      Vec3d hitVec = Vec3d.ofCenter(pos).add(direction.getOffsetX() * 0.5, direction.getOffsetY() * 0.5, direction.getOffsetZ() * 0.5);
      Rockstar.getInstance()
         .getRotationHandler()
         .rotate(RotationMath.getRotationTo(hitVec), MoveCorrection.SILENT, 180.0F, 180.0F, 180.0F, RotationPriority.USE_ITEM);
      mc.interactionManager.interactBlock(mc.player, hand, new BlockHitResult(hitVec, direction, pos, false));
      mc.player.swingHand(hand);
   }

   private void breakBlock(BlockPos pos) {
      Vec3d hitVec = Vec3d.ofCenter(pos);
      Direction direction = this.getHitDirection(pos);
      Rockstar.getInstance()
         .getRotationHandler()
         .rotate(RotationMath.getRotationTo(hitVec), MoveCorrection.SILENT, 180.0F, 120.0F, 180.0F, RotationPriority.NORMAL);
      mc.interactionManager.attackBlock(pos, direction);
      mc.interactionManager.updateBlockBreakingProgress(pos, direction);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private Direction getHitDirection(BlockPos pos) {
      Vec3d eyes = mc.player.getEyePos();
      if (pos.getY() > eyes.y) {
         return Direction.DOWN;
      }

      return Direction.UP;
   }

   private boolean isInventoryFull() {
      return mc.player.getInventory().getEmptySlot() == -1;
   }

   private <T extends BlockEntity> T findBlockEntity(Class<T> clazz, double range) {
      BlockPos origin = mc.player.getBlockPos();
      int radius = (int)Math.ceil(range);
      T best = null;
      double bestDistance = Double.MAX_VALUE;

      for (int x = -radius; x <= radius; x++) {
         for (int y = -radius; y <= radius; y++) {
            for (int z = -radius; z <= radius; z++) {
               BlockPos pos = origin.add(x, y, z);
               BlockEntity entity = mc.world.getBlockEntity(pos);
               if (!clazz.isInstance(entity)) {
                  continue;
               }

               double distance = mc.player.squaredDistanceTo(pos.toCenterPos());
               if (distance <= range * range && distance < bestDistance) {
                  best = clazz.cast(entity);
                  bestDistance = distance;
               }
            }
         }
      }

      return best;
   }

   private String sanitized(String value) {
      if (value == null) {
         return "1";
      }

      String digits = value.replaceAll("[^0-9]", "");
      return digits.isBlank() ? "1" : digits;
   }

   private void warn(String key) {
      if (this.warnTimer.finished(3000L)) {
         Rockstar.getInstance().getNotificationManager().addNotificationOther(NotificationType.ERROR, "Auto Farm", Localizator.translate(key));
         this.warnTimer.reset();
      }
   }

   private void drawTarget(Render3DEvent event, BlockPos pos, ColorRGBA color) {
      MatrixStack matrices = event.getMatrices();
      Camera camera = mc.gameRenderer.getCamera();
      Vec3d cameraPos = camera.getPos();
      matrices.push();
      matrices.translate(-cameraPos.getX(), -cameraPos.getY(), -cameraPos.getZ());
      RenderSystem.enableBlend();
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE);
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      BufferBuilder buffer = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      Box box = new Box(pos).expand(0.02);
      Draw3DUtility.renderFilledBox(matrices, buffer, box, color.withAlpha(35.0F));
      BuiltBuffer built = buffer.endNullable();
      if (built != null) {
         BufferRenderer.drawWithGlobalProgram(built);
      }

      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
      RenderSystem.disableBlend();
      matrices.pop();
   }

   private boolean isApple() {
      return this.mode.is(this.apple);
   }

   private boolean isSword() {
      return this.mode.is(this.sword);
   }

   private boolean isPotion() {
      return this.mode.is(this.potion);
   }

   private boolean isPotionCombiner() {
      return this.mode.is(this.potionCombiner);
   }

   private boolean isAutoSell() {
      return this.mode.is(this.autoSell);
   }

   private boolean isCrop() {
      return this.mode.is(this.crop);
   }

   @Generated
   public ModeSetting getMode() {
      return this.mode;
   }

   private enum PotionDepositState {
      NONE,
      OPEN_CHEST,
      DEPOSIT
   }
}

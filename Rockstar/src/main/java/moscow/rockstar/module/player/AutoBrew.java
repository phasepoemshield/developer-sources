package moscow.rockstar.module.player;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.systems.notifications.NotificationType;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.inventory.InventoryUtility;
import moscow.rockstar.util.time.Timer;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BrewingStandBlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.gui.screen.ingame.BrewingStandScreen;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.screen.BrewingStandScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

@ModuleInfo(name = "Auto Brew", category = ModuleCategory.PLAYER, desc = "Автоматическое варение зелий")
public class AutoBrew extends BaseModule {
   private final ModeSetting brew = new ModeSetting(this, "Зелье");
   private final ModeSetting.Value strength = new ModeSetting.Value(this.brew, "Сила").select();
   private final ModeSetting.Value speed = new ModeSetting.Value(this.brew, "Скорость");
   private final ModeSetting.Value fireResistance = new ModeSetting.Value(this.brew, "Огнеупорность");
   private final ModeSetting.Value invisibility = new ModeSetting.Value(this.brew, "Невидимость");
   private final BooleanSetting enhance = new BooleanSetting(this, "Улучшение (огненный порошок)");
   private final SliderSetting delay = new SliderSetting(this, "Задержка")
      .step(10.0F)
      .min(100.0F)
      .max(1000.0F)
      .currentValue(100.0F);
   private final Timer actionTimer = new Timer();
   private final Timer moveTimer = new Timer();
   private BrewState state = BrewState.IDLE;
   private BrewingStandBlockEntity activeStand;
   private ChestBlockEntity activeChest;
   private final List<BlockPos> finishedStands = new ArrayList<>();
   private List<BrewingStandBlockEntity> nearbyStands = new ArrayList<>();
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (mc.player == null || mc.world == null) {
         return;
      }

      if (mc.currentScreen instanceof BrewingStandScreen) {
         this.state = BrewState.BREWING;
      }

      switch (this.state) {
         case IDLE -> this.findStand();
         case OPENING -> this.openStand();
         case BREWING -> this.handleBrewing();
         case DEPOSITING -> this.deposit();
         case CLOSING -> this.close();
      }
   };

   @Override
   public void onDisable() {
      this.state = BrewState.IDLE;
      this.activeStand = null;
      this.activeChest = null;
      this.nearbyStands.clear();
      this.finishedStands.clear();
   }

   private void findStand() {
      if (!this.actionTimer.finished(1000L)) {
         return;
      }

      if (this.nearbyStands.isEmpty()) {
         this.nearbyStands = this.findBrewingStands();
      }

      if (!this.nearbyStands.isEmpty()) {
         this.activeStand = this.nearbyStands.removeFirst();
         this.state = BrewState.OPENING;
         this.actionTimer.reset();
      }
   }

   private void openStand() {
      if (!this.actionTimer.finished(500L) || this.activeStand == null) {
         return;
      }

      BlockPos pos = this.activeStand.getPos();
      Vec3d hit = Vec3d.ofCenter(pos);
      mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, new BlockHitResult(hit, Direction.UP, pos, false));
      this.actionTimer.reset();
   }

   private void handleBrewing() {
      ScreenHandler handler = mc.player.currentScreenHandler;
      if (!(handler instanceof BrewingStandScreenHandler brewHandler)) {
         this.state = BrewState.IDLE;
         return;
      }

      if (brewHandler.getFuel() > 0 && brewHandler.getSlot(3).getStack().getItem() != Items.AIR) {
         return;
      }

      if (brewHandler.getSlot(4).getStack().isEmpty() && brewHandler.getFuel() == 0) {
         if (!this.moveIngredient(Items.BLAZE_POWDER, 4)) {
            return;
         }
      }

      for (int i = 0; i < 3; i++) {
         if (!brewHandler.getSlot(i).getStack().isEmpty()) {
            continue;
         }

         int bottleSlot = this.findWaterBottleSlot(brewHandler);
         if (bottleSlot == -1) {
            return;
         }

         this.clickSlot(bottleSlot);
      }

      if (brewHandler.getSlot(3).getStack().isEmpty()) {
         if (this.hasPotion(brewHandler, Potions.WATER.value())) {
            if (!this.moveIngredient(Items.NETHER_WART, 3)) {
               this.notifyMissing(Items.NETHER_WART);
            }
         } else if (this.strength.isSelected() && this.hasPotion(brewHandler, Potions.AWKWARD.value())) {
            this.moveIngredient(Items.BLAZE_POWDER, 3);
         } else if (this.speed.isSelected() && this.hasPotion(brewHandler, Potions.AWKWARD.value())) {
            this.moveIngredient(Items.SUGAR, 3);
         } else if (this.fireResistance.isSelected() && this.hasPotion(brewHandler, Potions.AWKWARD.value())) {
            this.moveIngredient(Items.MAGMA_CREAM, 3);
         } else if (this.invisibility.isSelected() && this.hasPotion(brewHandler, Potions.AWKWARD.value())) {
            this.moveIngredient(Items.GOLDEN_CARROT, 3);
         }

         if (this.hasPotion(brewHandler, Potions.STRENGTH.value()) || this.hasPotion(brewHandler, Potions.SWIFTNESS.value())) {
            this.moveIngredient(Items.GLOWSTONE_DUST, 3);
         }

         if (this.hasPotion(brewHandler, Potions.FIRE_RESISTANCE.value())) {
            this.moveIngredient(Items.REDSTONE, 3);
         }

         if (this.invisibility.isSelected() && this.hasPotion(brewHandler, Potions.NIGHT_VISION.value())) {
            this.moveIngredient(Items.FERMENTED_SPIDER_EYE, 3);
         }

         if (this.invisibility.isSelected()
            && this.hasPotion(brewHandler, Potions.INVISIBILITY.value())
            && this.enhance.isEnabled()) {
            this.moveIngredient(Items.REDSTONE, 3);
         }

         if (this.isBatchComplete(brewHandler)) {
            this.lootBrewingStand(brewHandler);
            this.state = BrewState.DEPOSITING;
            this.actionTimer.reset();
         }
      }
   }

   private void deposit() {
      if (mc.player.currentScreenHandler instanceof BrewingStandScreenHandler) {
         if (this.actionTimer.finished(200L)) {
            mc.player.closeHandledScreen();
            this.actionTimer.reset();
         }

         return;
      }

      if (this.activeChest == null) {
         List<ChestBlockEntity> chests = this.findChests();
         if (chests.isEmpty()) {
            this.state = BrewState.CLOSING;
            this.actionTimer.reset();
            return;
         }

         this.activeChest = chests.getFirst();
      }

      if (!(mc.player.currentScreenHandler instanceof GenericContainerScreenHandler)) {
         if (this.actionTimer.finished(500L)) {
            BlockPos pos = this.activeChest.getPos();
            mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, new BlockHitResult(Vec3d.ofCenter(pos), Direction.UP, pos, false));
            this.actionTimer.reset();
         }

         return;
      }

      if (!this.actionTimer.finished(200L)) {
         return;
      }

      this.depositInventory();
      this.state = BrewState.CLOSING;
      this.actionTimer.reset();
   }

   private void close() {
      if (this.actionTimer.finished(500L)) {
         mc.player.closeHandledScreen();
         if (this.activeStand != null) {
            this.finishedStands.add(this.activeStand.getPos());
         }

         this.state = BrewState.IDLE;
         this.activeStand = null;
         this.activeChest = null;
         this.actionTimer.reset();
      }
   }

   private boolean moveIngredient(Item item, int brewSlot) {
      int slot = InventoryUtility.findItemInContainer(item);
      if (slot == -1) {
         Rockstar.getInstance().getNotificationManager().addNotification(NotificationType.ERROR, "AutoBrew: missing " + item.getName().getString());
         this.disable();
         return false;
      }

      if (!this.moveTimer.finished((long)(this.delay.getCurrentValue() * 2.0F))) {
         return false;
      }

      int syncId = mc.player.currentScreenHandler.syncId;
      mc.interactionManager.clickSlot(syncId, slot, 0, SlotActionType.PICKUP, mc.player);
      mc.interactionManager.clickSlot(syncId, brewSlot, 0, SlotActionType.PICKUP, mc.player);
      if (!mc.player.currentScreenHandler.getCursorStack().isEmpty()) {
         mc.interactionManager.clickSlot(syncId, slot, 0, SlotActionType.PICKUP, mc.player);
      }

      mc.player.closeHandledScreen();
      this.moveTimer.reset();
      return true;
   }

   private void clickSlot(int slot) {
      mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, slot, 0, SlotActionType.PICKUP, mc.player);
   }

   private void lootBrewingStand(BrewingStandScreenHandler brewHandler) {
      for (int i = 0; i < 3; i++) {
         if (!brewHandler.getSlot(i).getStack().isEmpty()) {
            this.clickSlot(i);
         }
      }
   }

   private void depositInventory() {
      if (!(mc.player.currentScreenHandler instanceof GenericContainerScreenHandler handler)) {
         return;
      }

      for (int i = 0; i < handler.slots.size(); i++) {
         ItemStack stack = handler.getSlot(i).getStack();
         if (stack.isEmpty() || handler.getSlot(i).inventory == mc.player.getInventory()) {
            continue;
         }

         if (this.isPotion(stack) || this.isIngredient(stack)) {
            this.clickSlot(i);
         }
      }
   }

   private boolean isBatchComplete(BrewingStandScreenHandler brewHandler) {
      return this.hasPotion(brewHandler, Potions.STRONG_STRENGTH.value())
         || this.hasPotion(brewHandler, Potions.STRONG_SWIFTNESS.value())
         || this.hasPotion(brewHandler, Potions.LONG_FIRE_RESISTANCE.value())
         || this.invisibility.isSelected() && this.hasPotion(brewHandler, Potions.INVISIBILITY.value())
         || this.invisibility.isSelected()
            && this.enhance.isEnabled()
            && this.hasPotion(brewHandler, Potions.LONG_INVISIBILITY.value());
   }

   private boolean isPotion(ItemStack stack) {
      return stack.isOf(Items.POTION) || stack.isOf(Items.SPLASH_POTION) || stack.isOf(Items.LINGERING_POTION);
   }

   private boolean isIngredient(ItemStack stack) {
      Item item = stack.getItem();
      return item == Items.NETHER_WART
         || item == Items.BLAZE_POWDER
         || item == Items.SUGAR
         || item == Items.MAGMA_CREAM
         || item == Items.GLOWSTONE_DUST
         || item == Items.REDSTONE
         || item == Items.GOLDEN_CARROT
         || item == Items.FERMENTED_SPIDER_EYE;
   }

   private boolean hasPotion(BrewingStandScreenHandler brewHandler, Potion potion) {
      for (int i = 0; i < 3; i++) {
         ItemStack stack = brewHandler.getSlot(i).getStack();
         if (stack.getItem() != Items.POTION) {
            return false;
         }

         PotionContentsComponent contents = stack.get(DataComponentTypes.POTION_CONTENTS);
         if (contents == null || contents.potion().isEmpty()) {
            return false;
         }

         if (contents.potion().get().value() != potion) {
            return false;
         }
      }

      return true;
   }

   private int findWaterBottleSlot(BrewingStandScreenHandler brewHandler) {
      for (int i = 5; i < 41; i++) {
         ItemStack stack = brewHandler.getSlot(i).getStack();
         if (stack.getItem() != Items.POTION) {
            continue;
         }

         PotionContentsComponent contents = stack.get(DataComponentTypes.POTION_CONTENTS);
         if (contents != null && contents.potion().isPresent() && contents.potion().get().value() == Potions.WATER.value()) {
            return i;
         }
      }

      return -1;
   }

   private List<BrewingStandBlockEntity> findBrewingStands() {
      List<BrewingStandBlockEntity> stands = new ArrayList<>();
      BlockPos origin = BlockPos.ofFloored(mc.player.getPos());
      for (int x = -10; x <= 10; x++) {
         for (int y = -10; y <= 10; y++) {
            for (int z = -10; z <= 10; z++) {
               BlockPos pos = origin.add(x, y, z);
               if (this.finishedStands.contains(pos)) {
                  continue;
               }

               BlockEntity entity = mc.world.getBlockEntity(pos);
               if (entity instanceof BrewingStandBlockEntity stand) {
                  stands.add(stand);
               }
            }
         }
      }

      return stands;
   }

   private List<ChestBlockEntity> findChests() {
      List<ChestBlockEntity> chests = new ArrayList<>();
      BlockPos origin = BlockPos.ofFloored(mc.player.getPos());
      for (int x = -10; x <= 10; x++) {
         for (int y = -10; y <= 10; y++) {
            for (int z = -10; z <= 10; z++) {
               BlockEntity entity = mc.world.getBlockEntity(origin.add(x, y, z));
               if (entity instanceof ChestBlockEntity chest) {
                  chests.add(chest);
               }
            }
         }
      }

      chests.sort(Comparator.comparingDouble(chest -> chest.getPos().getSquaredDistance(origin)));
      return chests;
   }

   private void notifyMissing(Item item) {
      Rockstar.getInstance().getNotificationManager().addNotification(NotificationType.ERROR, "AutoBrew: need " + item.getName().getString());
   }

   private enum BrewState {
      IDLE,
      OPENING,
      BREWING,
      DEPOSITING,
      CLOSING
   }
}

package fat.releon.teremok.impl.player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Predicate;
import l.Helper104;
import l.Helper242;
import l.Helper264;
import l.Helper269;
import l.Event8;
import l.Helper66;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public class FarmCarrot extends Helper242 {
   Map<BlockPos, BlockState> renderBlocks = new HashMap<>();
   Set<BlockPos> notifiedBlocks = new CopyOnWriteArraySet<>();
   long lastScanTime = 0L;
   int checkCounter = 0;
   int tunnelBreakCooldown = 0;
   BlockPos farmPos;

   public FarmCarrot() {
      super("FarmCarrot", "FarmCarrot", Helper269.PLAYER);
      this.setup(new Helper264[0]);
   }

   @Override
   public void activate() {
      super.activate();
      this.farmPos = null;
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.farmPos = null;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.state && mc.player != null && mc.world != null && mc.interactionManager != null) {
         if (this.farmPos == null || !this.isFarmTarget(this.farmPos)) {
            this.farmPos = this.resolveFarmPos();
            if (this.farmPos == null) {
               this.switchToHoe();
               return;
            }
         }

         BlockPos var2 = this.farmPos;
         if (this.isCarrotGrown(var2.up())) {
            this.breakCarrot(var2.up());
         } else if (mc.world.getBlockState(var2.up()).isOf(Blocks.CARROTS)) {
            this.useBoneMealOnCarrot(var2);
         } else {
            this.placeCarrot(var2);
         }
      }
   }

   private Item getCarrotItem() {
      return this.findHotbarSlot(Items.CARROT) != -1 ? Items.CARROT : Items.AIR;
   }

   private int findHotbarSlot(Item var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (mc.player.getInventory().getStack(var2).getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private boolean useBoneMealOnCarrot(BlockPos var1) {
      if (var1 != null && mc.world.getBlockState(var1.up()).isOf(Blocks.CARROTS)) {
         BlockHitResult var2 = new BlockHitResult(var1.up().toCenterPos(), Direction.UP, var1.up(), false);
         return this.interactWithItemOnBlock(Items.BONE_MEAL, var2);
      } else {
         return false;
      }
   }

   private int findInventorySlot(Item var1) {
      for (int var2 = 9; var2 < 36; var2++) {
         if (mc.player.getInventory().getStack(var2).getItem() == var1) {
            return var2;
         }
      }

      return -1;
   }

   private int findEmptyHotbarSlot() {
      int var1 = this.findHoeHotbarSlot();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var2 != var1 && mc.player.getInventory().getStack(var2).isEmpty()) {
            return var2;
         }
      }

      return -1;
   }

   private int prepareHotbarSlot(Item var1) {
      int var2 = this.findHotbarSlot(var1);
      if (var2 != -1) {
         return var2;
      } else {
         int var3 = this.findInventorySlot(var1);
         if (var3 == -1) {
            return -1;
         } else {
            int var4 = this.findEmptyHotbarSlot();
            if (var4 == -1) {
               var4 = this.findReplaceableHotbarSlot();
            }

            if (var4 == -1) {
               return -1;
            } else {
               mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var3, var4, SlotActionType.SWAP, mc.player);
               return var4;
            }
         }
      }
   }

   private int findReplaceableHotbarSlot() {
      int var1 = this.findHoeHotbarSlot();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var2 != var1) {
            Item var3 = mc.player.getInventory().getStack(var2).getItem();
            if (var3 != Items.CARROT && var3 != Items.BONE_MEAL) {
               return var2;
            }
         }
      }

      return -1;
   }

   private int findHoeHotbarSlot() {
      return this.findHotbarSlot(var0 -> var0.getItem() instanceof HoeItem);
   }

   private void switchToHoe() {
      int var1 = this.findHoeHotbarSlot();
      if (var1 != -1 && mc.player.getInventory().selectedSlot != var1) {
         Helper66.method696(var1);
      }
   }

   private int findHotbarSlot(Predicate<ItemStack> var1) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (var1.test(mc.player.getInventory().getStack(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private boolean interactWithItemOnBlock(Item var1, BlockHitResult var2) {
      int var3 = this.prepareHotbarSlot(var1);
      if (var3 == -1) {
         return false;
      } else {
         int var4 = mc.player.getInventory().selectedSlot;
         if (var4 != var3) {
            Helper66.method696(var3);
         }

         this.lookDown();
         ActionResult var5 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var2);
         mc.player.swingHand(Hand.MAIN_HAND);
         if (var4 != var3) {
            Helper66.method696(var4);
         }

         this.switchToHoe();
         return var5.isAccepted();
      }
   }

   private boolean isCarrotGrown(BlockPos var1) {
      BlockState var2 = mc.world.getBlockState(var1);
      return var2.isOf(Blocks.CARROTS) && var2.get(Properties.AGE_7) >= 7;
   }

   private void breakCarrot(BlockPos var1) {
      this.switchToHoe();
      this.lookDown();
      mc.interactionManager.updateBlockBreakingProgress(var1, Direction.UP);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private void lookDown() {
      float var1 = mc.player.getYaw();
      mc.player.setYaw(var1);
      mc.player.setPitch(90.0F);
      mc.player.setHeadYaw(var1);
      mc.player.setBodyYaw(var1);
   }

   private boolean placeCarrot(BlockPos var1) {
      Item var2 = this.getCarrotItem();
      if (var2 == Items.AIR) {
         return false;
      } else if (var1 == null) {
         return false;
      } else if (mc.world.getBlockState(var1.up()).isOf(Blocks.CARROTS)) {
         return true;
      } else if (!this.canPlantAt(var1)) {
         return false;
      } else {
         BlockHitResult var3 = new BlockHitResult(var1.toCenterPos().add(0.0, 0.5, 0.0), Direction.UP, var1, false);
         return this.interactWithItemOnBlock(var2, var3);
      }
   }

   private boolean canPlantAt(BlockPos var1) {
      return var1 == null ? false : mc.world.getBlockState(var1).isOf(Blocks.FARMLAND) && mc.world.getBlockState(var1.up()).isAir();
   }

   private BlockPos resolveFarmPos() {
      BlockPos var1 = mc.player.getBlockPos();
      BlockPos var2 = null;
      double var3 = Double.MAX_VALUE;

      for (int var5 = -2; var5 <= 2; var5++) {
         for (int var6 = -2; var6 <= 1; var6++) {
            for (int var7 = -2; var7 <= 2; var7++) {
               BlockPos var8 = var1.add(var5, var6, var7);
               if (this.isFarmTarget(var8)) {
                  double var9 = mc.player.squaredDistanceTo(var8.toCenterPos());
                  if (var9 < var3) {
                     var3 = var9;
                     var2 = var8;
                  }
               }
            }
         }
      }

      return var2;
   }

   private boolean isFarmTarget(BlockPos var1) {
      return var1 == null ? false : this.canPlantAt(var1) || mc.world.getBlockState(var1.up()).isOf(Blocks.CARROTS);
   }
}

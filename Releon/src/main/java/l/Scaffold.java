package l;

import java.util.Arrays;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.Full;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Scaffold extends Helper242 {
   private static final List<Block> BLACKLIST = Arrays.asList(
      Blocks.CHEST,
      Blocks.ENDER_CHEST,
      Blocks.TRAPPED_CHEST,
      Blocks.SAND,
      Blocks.CRAFTING_TABLE,
      Blocks.FURNACE,
      Blocks.STONE_PRESSURE_PLATE,
      Blocks.OAK_PRESSURE_PLATE,
      Blocks.BIRCH_PRESSURE_PLATE,
      Blocks.SPRUCE_PRESSURE_PLATE,
      Blocks.JUNGLE_PRESSURE_PLATE,
      Blocks.ACACIA_PRESSURE_PLATE,
      Blocks.DARK_OAK_PRESSURE_PLATE,
      Blocks.CRIMSON_PRESSURE_PLATE,
      Blocks.WARPED_PRESSURE_PLATE
   );
   private final Helper339 placeTimer = new Helper339();
   private int originalSlot = -1;
   private int tickDelay = 0;

   public Scaffold() {
      super("Scaffold", "Scaffold", Helper269.MOVEMENT);
   }

   @Override
   public void activate() {
      if (mc.player != null && mc.world != null) {
         this.originalSlot = mc.player.getInventory().selectedSlot;
         this.tickDelay = 0;
         this.placeTimer.method3360(50L);
         super.activate();
      }
   }

   @Override
   public void deactivate() {
      if (mc.player != null && this.originalSlot != -1) {
         mc.player.getInventory().selectedSlot = this.originalSlot;
      }

      this.originalSlot = -1;
      this.tickDelay = 0;
      super.deactivate();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         if (mc.currentScreen == null) {
            if (this.tickDelay > 0) {
               this.tickDelay--;
            } else {
               BlockPos var2 = this.method2060();
               if (mc.world.getBlockState(var2).isReplaceable()) {
                  int var3 = this.method2061();
                  if (var3 != -1) {
                     if (mc.player.getInventory().selectedSlot != var3) {
                        mc.player.getInventory().selectedSlot = var3;
                     }

                     if (this.placeTimer.method3356(50.0)) {
                        BlockHitResult var4 = this.method2065(var2);
                        if (var4 != null) {
                           this.method2066(var4.getPos());
                           ActionResult var5 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var4);
                           if (var5.isAccepted()) {
                              mc.player.swingHand(Hand.MAIN_HAND);
                              this.placeTimer.method3358();
                              this.tickDelay = 1;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private BlockPos method2060() {
      Vec3d var1 = mc.player.getVelocity();
      int var2 = MathHelper.clamp((int)Math.round(var1.x), -1, 1);
      int var3 = MathHelper.clamp((int)Math.round(var1.z), -1, 1);
      return mc.player.getBlockPos().add(var2, -1, var3);
   }

   private int method2061() {
      int var1 = this.method2062();
      if (var1 != -1) {
         return var1;
      } else {
         int var2 = this.method2063();
         if (var2 == -1) {
            return -1;
         } else {
            int var3 = mc.player.getInventory().selectedSlot;
            mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var2, var3, SlotActionType.SWAP, mc.player);
            return var3;
         }
      }
   }

   private int method2062() {
      for (int var1 = 0; var1 < 9; var1++) {
         if (this.method2064(mc.player.getInventory().getStack(var1))) {
            return var1;
         }
      }

      return -1;
   }

   private int method2063() {
      for (int var1 = 9; var1 < 36; var1++) {
         if (this.method2064(mc.player.getInventory().getStack(var1))) {
            return var1;
         }
      }

      return -1;
   }

   private boolean method2064(ItemStack var1) {
      return !var1.isEmpty() && var1.getItem() instanceof BlockItem var2 && !BLACKLIST.contains(var2.getBlock());
   }

   private BlockHitResult method2065(BlockPos var1) {
      Direction[] var2 = new Direction[]{Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};

      for (Direction var6 : var2) {
         BlockPos var7 = var1.offset(var6);
         if (!mc.world.getBlockState(var7).isReplaceable()) {
            Vec3d var8 = Vec3d.ofCenter(var7).add(Vec3d.of(var6.getVector()).multiply(0.5));
            return new BlockHitResult(var8, var6.getOpposite(), var7, false);
         }
      }

      return null;
   }

   private void method2066(Vec3d var1) {
      Vec3d var2 = mc.player.getEyePos();
      Vec3d var3 = var1.subtract(var2);
      double var4 = Math.sqrt(var3.x * var3.x + var3.z * var3.z);
      float var6 = (float)Math.toDegrees(Math.atan2(var3.z, var3.x)) - 90.0F;
      float var7 = (float)(-Math.toDegrees(Math.atan2(var3.y, Math.max(var4, 0.001))));
      var7 = MathHelper.clamp(var7, -90.0F, 90.0F);
      mc.player.setYaw(var6);
      mc.player.setPitch(var7);
      mc.player.prevYaw = var6;
      mc.player.prevPitch = var7;
      mc.player.setHeadYaw(var6);
      mc.player.prevHeadYaw = var6;
      mc.player.setBodyYaw(var6);
      mc.player.prevBodyYaw = var6;
      mc.player
         .networkHandler
         .sendPacket(new Full(mc.player.getX(), mc.player.getY(), mc.player.getZ(), var6, var7, mc.player.isOnGround(), mc.player.horizontalCollision));
   }
}

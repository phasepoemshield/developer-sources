package fat.releon.teremok.impl.player;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import l.Helper104;
import l.Notifications;
import l.BlockEspHelper;
import l.Helper242;
import l.Helper264;
import l.Helper269;
import l.Event8;
import l.Helper56;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.registry.Registries;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;

public class BaseFinder extends Helper242 {
   Set<String> blocksToHighlight = new CopyOnWriteArraySet<>();
   Map<BlockPos, BlockState> renderBlocks = new HashMap<>();
   Set<BlockPos> notifiedBlocks = new CopyOnWriteArraySet<>();
   long lastScanTime = 0L;
   int checkCounter = 0;
   int tunnelBreakCooldown = 0;
   boolean tunnelingActive = false;
   boolean foundBlockEspTarget = false;
   BlockPos targetBlock = null;

   public BaseFinder() {
      super("BaseFinder", "BaseFinder", Helper269.PLAYER);
      this.setup(new Helper264[0]);
   }

   public Set<String> getBlocksToHighlight() {
      return this.blocksToHighlight;
   }

   @Override
   public void activate() {
      super.activate();
      this.renderBlocks.clear();
      this.notifiedBlocks.clear();
      this.tunnelBreakCooldown = 0;
      this.tunnelingActive = false;
      this.foundBlockEspTarget = false;
      this.targetBlock = null;
   }

   @Override
   public void deactivate() {
      super.deactivate();
      this.renderBlocks.clear();
      this.notifiedBlocks.clear();
      this.stopBaritoneTunnel();
      this.sendBaritone("#set allowBreak true");
      this.targetBlock = null;
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (!this.state || mc.player == null || mc.world == null || mc.interactionManager == null) {
         this.stopBaritoneTunnel();
         this.stopTunnelMovement();
      } else if (!this.foundBlockEspTarget) {
         BlockPos var2 = this.findBlockEspTargetNearby();
         if (var2 != null) {
            this.foundBlockEspTarget = true;
            this.targetBlock = var2.toImmutable();
            this.stopBaritoneTunnel();
            this.stopTunnelMovement();
            BlockPos var3 = this.findWalkPosNear(this.targetBlock);
            if (var3 != null) {
               this.sendBaritone("#set allowBreak false");
               this.goToTarget(var3);
            }

            this.notifyFoundBlock(this.targetBlock);
         } else {
            if (!this.foundBlockEspTarget && !this.tunnelingActive) {
               this.sendBaritone("#set allowBreak true");
               this.sendBaritone("#tunnel");
               this.tunnelingActive = true;
            }
         }
      }
   }

   private BlockPos getTunnelTarget() {
      if (mc.player != null && mc.world != null) {
         Direction var1 = this.getForwardDirection();
         BlockPos var2 = mc.player.getBlockPos().offset(var1);
         BlockPos var3 = var2.up();
         if (this.isBreakableTunnelBlock(var2)) {
            return var2;
         } else {
            return this.isBreakableTunnelBlock(var3) ? var3 : null;
         }
      } else {
         return null;
      }
   }

   private boolean isBreakableTunnelBlock(BlockPos var1) {
      BlockState var2 = mc.world.getBlockState(var1);
      Block var3 = var2.getBlock();
      return !var2.isAir()
         && !var2.getFluidState().isStill()
         && var3 != Blocks.BEDROCK
         && var3 != Blocks.BARRIER
         && var3 != Blocks.END_PORTAL
         && var3 != Blocks.END_PORTAL_FRAME
         && var3 != Blocks.NETHER_PORTAL;
   }

   private boolean shouldStopForHazard() {
      if (mc.player != null && mc.world != null) {
         Direction var1 = this.getForwardDirection();
         BlockPos var2 = mc.player.getBlockPos().offset(var1);
         BlockPos var3 = var2.up();
         BlockPos var4 = var2.down();
         return false;
      } else {
         return true;
      }
   }

   private Direction getForwardDirection() {
      float var1 = mc.player.getYaw();
      int var2 = MathHelper.floor(var1 * 4.0F / 360.0F + 0.5) & 3;

      return switch (var2) {
         case 0 -> Direction.SOUTH;
         case 1 -> Direction.WEST;
         case 2 -> Direction.NORTH;
         default -> Direction.EAST;
      };
   }

   private void sendBaritone(String var1) {
      if (mc.player != null && mc.player.networkHandler != null) {
         mc.player.networkHandler.sendChatMessage(var1);
      }
   }

   private void stopBaritoneTunnel() {
      if (this.tunnelingActive) {
         this.sendBaritone("#stop");
         this.tunnelingActive = false;
      }
   }

   private void stopTunnelMovement() {
      if (mc.options != null) {
         mc.options.forwardKey.setPressed(false);
         mc.options.sprintKey.setPressed(false);
      }
   }

   private BlockPos findBlockEspTargetNearby() {
      BlockEspHelper var1 = BlockEspHelper.method2008();
      if (mc.crosshairTarget instanceof BlockHitResult var2
         && var2.getType() == Type.BLOCK
         && this.shouldStopForBlock(mc.world.getBlockState(var2.getBlockPos()).getBlock())) {
         return var2.getBlockPos();
      } else {
         Set var17 = var1 != null ? var1.getBlocksToHighlight() : Set.of();
         BlockPos var18 = mc.player.getBlockPos();
         BlockPos var4 = null;
         double var5 = Double.MAX_VALUE;
         byte var7 = 6;
         byte var8 = 3;

         for (int var9 = -var7; var9 <= var7; var9++) {
            for (int var10 = -var8; var10 <= var8; var10++) {
               for (int var11 = -var7; var11 <= var7; var11++) {
                  BlockPos var12 = var18.add(var9, var10, var11);
                  Block var13 = mc.world.getBlockState(var12).getBlock();
                  String var14 = Registries.BLOCK.getId(var13).toString();
                  if (this.shouldStopForBlock(var13) || var17.contains(var14)) {
                     double var15 = mc.player.squaredDistanceTo(var12.toCenterPos());
                     if (var15 < var5) {
                        var5 = var15;
                        var4 = var12.toImmutable();
                     }
                  }
               }
            }
         }

         return var4;
      }
   }

   private void goToTarget(BlockPos var1) {
      if (var1 != null) {
         this.sendBaritone("#goto " + var1.getX() + " " + var1.getY() + " " + var1.getZ());
      }
   }

   private BlockPos findWalkPosNear(BlockPos var1) {
      BlockPos var2 = null;
      double var3 = Double.MAX_VALUE;

      for (Direction var6 : net.minecraft.util.math.Direction.Type.HORIZONTAL) {
         BlockPos var7 = var1.offset(var6);
         if (this.canStandAt(var7)) {
            double var8 = mc.player.squaredDistanceTo(var7.toCenterPos());
            if (var8 < var3) {
               var3 = var8;
               var2 = var7.toImmutable();
            }
         }
      }

      return var2;
   }

   private boolean canStandAt(BlockPos var1) {
      return var1 != null && mc.world != null
         ? mc.world.getBlockState(var1).isAir() && mc.world.getBlockState(var1.up()).isAir() && !mc.world.getBlockState(var1.down()).isAir()
         : false;
   }

   private boolean shouldStopForBlock(Block var1) {
      return var1 == Blocks.CHEST || var1 == Blocks.TRAPPED_CHEST || var1 == Blocks.BARREL || var1 == Blocks.ENDER_CHEST || var1 instanceof ShulkerBoxBlock;
   }

   private void notifyFoundBlock(BlockPos var1) {
      Notifications.method1666().method1670("НАЙДЕНА БАЗА " + var1.getX() + " " + var1.getY() + " " + var1.getZ(), 3000L, Helper56.SOFT_NOTIFICATION);
   }
}

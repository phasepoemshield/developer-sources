package l;

import java.time.Instant;
import java.util.BitSet;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.network.message.LastSeenMessageList.Acknowledgment;
import net.minecraft.network.packet.c2s.play.ChatMessageC2SPacket;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class AutoFortuna extends Helper242 {
   private static final String TREASURY_MESSAGE = "+ 7 слота в хранилище (+1)";
   private final Helper339 stopWatch = new Helper339();
   private final Helper339 notifyWatch = new Helper339();
   private BlockPos lastPlacedPos;
   private boolean breakNext;
   private boolean sentCommand;
   private boolean cycleCompleted;

   public AutoFortuna() {
      super("AutoFortuna", "Auto Fortuna", Helper269.MISC);
   }

   @Override
   public void activate() {
      this.sentCommand = false;
      this.cycleCompleted = false;
      this.breakNext = false;
      this.lastPlacedPos = null;
      this.stopWatch.method3358();
      this.notifyWatch.method3358();
      super.activate();
   }

   @Override
   public void deactivate() {
      this.sentCommand = false;
      this.cycleCompleted = false;
      super.deactivate();
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (mc.player != null && var1.method3896() == Helper385.RECEIVE) {
         if (var1.method3895() instanceof GameMessageS2CPacket var2) {
            String var4 = var2.content().getString().toLowerCase();
            if (var4.contains("+ 7 слота в хранилище (+1)")) {
               this.method2608("/clan disband yes");
               this.method2609();
            }
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         BlockPos var2 = this.method2610();
         if (var2 != null) {
            this.lastPlacedPos = var2;
            this.breakNext = true;
         }

         if (this.breakNext && this.lastPlacedPos != null) {
            this.lookDown();
            if (mc.world.getBlockState(this.lastPlacedPos).isReplaceable()) {
               this.breakNext = false;
               this.lastPlacedPos = null;
               this.cycleCompleted = true;
               if (!this.sentCommand) {
                  this.method2608("/clan create s216");
                  this.sentCommand = true;
               }
            } else {
               this.method2607(this.lastPlacedPos, Direction.UP);
            }
         } else {
            byte var3 = 50;
            if (var3 <= 0 || this.stopWatch.method3356(var3)) {
               int var4 = Helper66.method716(var0 -> mc.player.getInventory().getStack(var0).getItem() == Items.REDSTONE);
               if (var4 == -1) {
                  if (this.notifyWatch.method3356(1000.0)) {
                     Notifications.method1666().method1668("Нужен в хотбаре редстоун", 1000L);
                     this.notifyWatch.method3358();
                  }
               } else {
                  BlockPos var5 = this.method2606(var4);
                  if (var5 != null) {
                     this.lastPlacedPos = var5;
                     this.breakNext = true;
                  }

                  this.stopWatch.method3358();
               }
            }
         }
      }
   }

   private BlockPos method2606(int var1) {
      BlockPos var2 = mc.player.getBlockPos();
      if (!mc.world.getBlockState(var2).isReplaceable()) {
         return null;
      } else {
         int var3 = mc.player.getInventory().selectedSlot;
         mc.player.getInventory().selectedSlot = var1;
         this.lookDown();
         boolean var4 = false;

         for (Direction var8 : Direction.values()) {
            BlockPos var9 = var2.offset(var8);
            if (!mc.world.getBlockState(var9).isReplaceable()) {
               Direction var10 = var8.getOpposite();
               Vec3d var11 = new Vec3d(
                  var9.getX() + 0.5 + var10.getOffsetX() * 0.5, var9.getY() + 0.5 + var10.getOffsetY() * 0.5, var9.getZ() + 0.5 + var10.getOffsetZ() * 0.5
               );
               BlockHitResult var12 = new BlockHitResult(var11, var10, var9, false);
               ActionResult var13 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var12);
               if (var13.isAccepted()) {
                  mc.player.swingHand(Hand.MAIN_HAND);
                  var4 = true;
                  break;
               }
            }
         }

         mc.player.getInventory().selectedSlot = var3;
         return var4 ? var2 : null;
      }
   }

   private void method2607(BlockPos var1, Direction var2) {
      this.lookDown();
      mc.interactionManager.attackBlock(var1, var2);
      mc.interactionManager.updateBlockBreakingProgress(var1, var2);
      mc.player.swingHand(Hand.MAIN_HAND);
   }

   private void method2608(String var1) {
      mc.player.networkHandler.sendPacket(new ChatMessageC2SPacket(var1, Instant.now(), 0L, null, new Acknowledgment(0, new BitSet())));
   }

   private void method2609() {
      this.sentCommand = false;
      this.cycleCompleted = false;
      this.breakNext = false;
      this.lastPlacedPos = null;
      this.stopWatch.method3358();
   }

   private void lookDown() {
      mc.player.setPitch(90.0F);
   }

   private BlockPos method2610() {
      BlockPos var1 = mc.player.getBlockPos();
      BlockPos var2 = null;
      double var3 = Double.MAX_VALUE;

      for (int var5 = -1; var5 <= 0; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            for (int var7 = -1; var7 <= 1; var7++) {
               BlockPos var8 = var1.add(var6, var5, var7);
               if (mc.world.getBlockState(var8).isOf(Blocks.REDSTONE_WIRE)) {
                  double var9 = var8.getSquaredDistance(var1);
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
}

package l;

import net.minecraft.block.Block;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.SlimeBlock;
import net.minecraft.block.SnowBlock;
import net.minecraft.client.gui.screen.ingame.ShulkerBoxScreen;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class HighJump extends Helper242 {
   private final Setting5 modeSetting = new Setting5("Режим", "Режим прыжка").method2381("Shulker", "FunTime", "FunTime Snow").method2383("Always");
   private boolean wasInShulkerScreen = false;
   private boolean wasOnSlimeBlock = false;
   private final Helper339 timer = new Helper339();

   public HighJump() {
      super("HighJump", "HighJump", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.modeSetting});
   }

   @Helper104
   private void method2709(Event8 var1) {
      if (this.modeSetting.method2385("Shulker") && mc.currentScreen instanceof ShulkerBoxScreen) {
         new Helper339();
         float var3 = 0.2F;
         mc.player.addVelocity(0.0, var3, 0.0);
      }

      if (this.modeSetting.method2385("FunTime Soul Sand") && mc.player.isTouchingWater() && !mc.player.isSubmergedInWater()) {
         mc.player.addVelocity(0.0, 0.56, 0.0);
      }

      if (this.modeSetting.method2385("FunTime Snow")) {
         if (mc.player == null || mc.world == null) {
            return;
         }

         BlockPos var2 = mc.player.getBlockPos();
         Block var8 = mc.world.getBlockState(var2).getBlock();
         if (mc.player.isOnGround() && var8 instanceof SnowBlock) {
            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.ABORT_DESTROY_BLOCK, var2.up(), Direction.UP));
            mc.player.jump();
            Vec3d var4 = mc.player.getVelocity();
            mc.player.setVelocity(0.0, 0.6, 0.0);
         }
      }

      if (this.modeSetting.method2385("Boat")) {
         if (mc.currentScreen instanceof ShulkerBoxScreen) {
            float var7 = (float)Math.toRadians(mc.player.getYaw());
            double var9 = -Math.sin(var7) * 1.0;
            double var5 = Math.cos(var7) * 1.0;
            mc.player.addVelocity(0.0, 1.0, 0.0);
            mc.player.setPos(mc.player.getX(), mc.player.getY() + 0.24, mc.player.getZ());
         }

         if (mc.currentScreen instanceof ShulkerBoxScreen) {
            this.wasInShulkerScreen = true;
         } else if (this.wasInShulkerScreen && mc.currentScreen == null && this.method2710()) {
            this.wasInShulkerScreen = false;
         }
      }

      if (this.modeSetting.method2385("Slime Boost")) {
         if (mc.player.isOnGround() && this.method2711()) {
            this.wasOnSlimeBlock = true;
         } else if (this.wasOnSlimeBlock && !mc.player.isOnGround() && mc.player.getVelocity().getY() > 0.0) {
            mc.player.addVelocity(0.0, 0.5, 0.0);
            this.wasOnSlimeBlock = false;
         } else if (!this.method2711()) {
            this.wasOnSlimeBlock = false;
         }
      }
   }

   private boolean method2710() {
      BlockPos var1 = mc.player.getBlockPos();

      for (int var2 = -1; var2 <= 1; var2++) {
         for (int var3 = -1; var3 <= 1; var3++) {
            for (int var4 = -1; var4 <= 1; var4++) {
               BlockPos var5 = var1.add(var2, var3, var4);
               if (mc.world.getBlockState(var5).getBlock() instanceof ShulkerBoxBlock) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private boolean method2711() {
      BlockPos var1 = mc.player.getBlockPos();
      BlockPos var2 = var1.down();
      return mc.world.getBlockState(var2).getBlock() instanceof SlimeBlock;
   }

   public Setting5 method2712() {
      return this.modeSetting;
   }

   public boolean method2713() {
      return this.wasInShulkerScreen;
   }

   public boolean method2714() {
      return this.wasOnSlimeBlock;
   }

   public Helper339 method2715() {
      return this.timer;
   }
}

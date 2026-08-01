package ru.metaculture.protection;

import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Direction.Axis;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Scaffold",
   O000000000 = "Ставит блоки под себя, пойдет под сервера с мини играми",
   O0000000000 = Category.Misc
)
public class Scaffold extends Module {
   private BlockPos O000000000O = null;
   private Direction O000000000O0 = null;

   @Override
   public void O00000000() {
      this.O000000000O = null;
      this.O000000000O0 = null;
      super.O00000000();
   }

   @Override
   public void O000000000() {
      O0000000000.options.leftKey.setPressed(false);
      O0000000000.options.rightKey.setPressed(false);
      O0000000000.options.sneakKey.setPressed(false);
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         this.O0000000000O0();
         this.O0000000000O00();
         if (this.O000000000O != null && this.O000000000O0 != null && this.O0000000000O0O()) {
            O000000O0OO0OO.O00000000(this.O000000000O, this.O000000000O0);
            if (this.O000000000(this.O000000000O, this.O000000000O0)) {
               this.O00000000(this.O000000000O, this.O000000000O0);
            }
         }
      }
   }

   private void O0000000000O0() {
      BlockPos var1 = BlockPos.ofFloored(O0000000000.player.getPos().add(0.0, -1.0, 0.0));
      if (!O0000000000.world.getBlockState(var1).isReplaceable()) {
         this.O000000000O = null;
         this.O000000000O0 = null;
      } else {
         Direction[] var2 = new Direction[]{Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};

         for (Direction var6 : var2) {
            BlockPos var7 = var1.offset(var6);
            BlockState var8 = O0000000000.world.getBlockState(var7);
            if (!var8.isReplaceable() && var8.getFluidState().isEmpty()) {
               this.O000000000O = var7;
               this.O000000000O0 = var6.getOpposite();
               return;
            }
         }
      }
   }

   private void O00000000(BlockPos blockPos, Direction direction) {
      Vec3d var3 = O0000000000.player.getEyePos();
      double var4 = blockPos.getX() + 0.5 + direction.getOffsetX() * 0.5;
      double var6 = blockPos.getY() + 0.5 + direction.getOffsetY() * 0.5;
      double var8 = blockPos.getZ() + 0.5 + direction.getOffsetZ() * 0.5;
      if (direction.getAxis() != Axis.X) {
         var4 = MathHelper.clamp(var3.x, blockPos.getX() + 0.15, blockPos.getX() + 0.85);
      }

      if (direction.getAxis() != Axis.Y) {
         var6 = MathHelper.clamp(var3.y - 1.2, blockPos.getY() + 0.15, blockPos.getY() + 0.85);
      }

      if (direction.getAxis() != Axis.Z) {
         var8 = MathHelper.clamp(var3.z, blockPos.getZ() + 0.15, blockPos.getZ() + 0.85);
      }

      Vec3d var10 = new Vec3d(var4, var6, var8);
      BlockHitResult var11 = new BlockHitResult(var10, direction, blockPos, false);
      O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var11);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
      this.O000000000O = null;
      this.O000000000O0 = null;
   }

   private boolean O000000000(BlockPos blockPos, Direction direction) {
      float var3 = O000000O0O00O.O0000000000;
      float var4 = O000000O0O00O.O00000000000;
      Vec3d var5 = O0000000000.player.getEyePos();
      Vec3d var6 = this.O00000000(var4, var3);
      double var7 = blockPos.getX() + 0.5 + direction.getOffsetX() * 0.5;
      double var9 = blockPos.getY() + 0.5 + direction.getOffsetY() * 0.5;
      double var11 = blockPos.getZ() + 0.5 + direction.getOffsetZ() * 0.5;
      if (direction.getAxis() != Axis.X) {
         var7 = MathHelper.clamp(var5.x, blockPos.getX() + 0.15, blockPos.getX() + 0.85);
      }

      if (direction.getAxis() != Axis.Y) {
         var9 = MathHelper.clamp(var5.y - 1.2, blockPos.getY() + 0.15, blockPos.getY() + 0.85);
      }

      if (direction.getAxis() != Axis.Z) {
         var11 = MathHelper.clamp(var5.z, blockPos.getZ() + 0.15, blockPos.getZ() + 0.85);
      }

      Vec3d var13 = new Vec3d(var7, var9, var11).subtract(var5).normalize();
      double var14 = var6.dotProduct(var13);
      return var14 > 0.95;
   }

   private void O0000000000O00() {
      if (O0000000000.options.backKey.isPressed() && this.O0000000000O0O() && !O0000000000.options.jumpKey.isPressed()) {
         O0000000000.options.leftKey.setPressed(false);
         O0000000000.options.rightKey.setPressed(false);
         BlockPos var1 = BlockPos.ofFloored(O0000000000.player.getX(), O0000000000.player.getY() - 0.5, O0000000000.player.getZ());
         boolean var2 = O0000000000.world.getBlockState(var1).isReplaceable();
         O0000000000.options.sneakKey.setPressed(var2);
      } else {
         O0000000000.options.leftKey.setPressed(O0000000000.options.leftKey.isPressed());
         O0000000000.options.rightKey.setPressed(O0000000000.options.rightKey.isPressed());
         O0000000000.options.sneakKey.setPressed(O0000000000.options.sneakKey.isPressed());
      }
   }

   private boolean O0000000000O0O() {
      return O0000000000.player.getMainHandStack().getItem() instanceof BlockItem || O0000000000.player.getOffHandStack().getItem() instanceof BlockItem;
   }

   private Vec3d O00000000(float f, float g) {
      float var3 = f * (float) (Math.PI / 180.0);
      float var4 = -g * (float) (Math.PI / 180.0);
      float var5 = MathHelper.cos(var4);
      float var6 = MathHelper.sin(var4);
      float var7 = MathHelper.cos(var3);
      float var8 = MathHelper.sin(var3);
      return new Vec3d(var6 * var7, -var8, var5 * var7);
   }
}

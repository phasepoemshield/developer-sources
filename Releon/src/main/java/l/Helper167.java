package l;

import net.minecraft.client.input.Input;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Helper167 extends Input {
   public boolean forceSafeWalk = false;
   public float movementForward;
   public float movementSideways;
   public PlayerInput playerInput;
   public static final double MAX_WALKING_SPEED = 0.121;

   public Helper167(PlayerInput var1) {
      this.playerInput = var1;
   }

   public void method1382() {
      if (this.playerInput.forward() != this.playerInput.backward()) {
         this.movementForward = this.playerInput.forward() ? 1.0F : -1.0F;
      } else {
         this.movementForward = 0.0F;
      }

      if (this.playerInput.left() == this.playerInput.right()) {
         this.movementSideways = 0.0F;
      } else {
         this.movementSideways = this.playerInput.left() ? 1.0F : -1.0F;
      }

      if (this.playerInput.sneak()) {
         this.movementSideways *= 0.3F;
         this.movementForward *= 0.3F;
      }
   }

   @Override
   public String toString() {
      return "SimulatedPlayerInput(forwards={"
         + this.playerInput.forward()
         + "}, backwards={"
         + this.playerInput.backward()
         + "}, left={"
         + this.playerInput.left()
         + "}, right={"
         + this.playerInput.right()
         + "}, jumping={"
         + this.playerInput.jump()
         + "}, sprinting="
         + this.playerInput.sprint()
         + ", slowDown="
         + this.playerInput.sneak()
         + ")";
   }

   public static Helper167 method1383(PlayerInput var0) {
      return new Helper167(var0);
   }

   public static Helper167 method1384(PlayerEntity var0) {
      Vec3d var1 = var0.getPos().subtract(new Vec3d(var0.prevX, var0.prevY, var0.prevZ));
      double var2 = var1.horizontalLengthSquared();
      PlayerInput var4 = new PlayerInput(false, false, false, false, !var0.isOnGround(), var0.isSneaking(), var2 >= 0.014641);
      if (var2 > 0.0025000000000000005) {
         double var5 = Helper165.method1367(var1, var0.getYaw());
         double var7 = MathHelper.wrapDegrees(var5);
         var4 = Helper165.method1369(var4, var7);
      }

      return new Helper167(var4);
   }
}

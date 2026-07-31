package l;

import java.util.Random;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Jesus extends Helper242 {
   private final Random random = new Random();

   public Jesus() {
      super("Jesus", "Jesus", Helper269.MOVEMENT);
      this.setup(new Helper264[0]);
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         boolean var2 = mc.player.isTouchingWater() && !mc.player.isSubmergedInWater();
         boolean var3 = mc.player.isInLava();
         if (var2 || var3) {
            Vec3d var4 = mc.player.getVelocity();
            double var5 = 0.23;
            double var7 = 0.4F;
            if (mc.player.input.movementForward == 0.0F && mc.player.input.movementSideways == 0.0F) {
               var4 = new Vec3d(0.0, var4.y, 0.0);
            } else {
               float var9 = mc.player.getYaw();
               double var10 = mc.player.input.movementForward * 0.98;
               double var12 = mc.player.input.movementSideways * 0.98;
               double var14 = -Math.sin(Math.toRadians(var9)) * var10 + Math.cos(Math.toRadians(var9)) * var12;
               double var16 = Math.cos(Math.toRadians(var9)) * var10 + Math.sin(Math.toRadians(var9)) * var12;
               double var18 = Math.sqrt(var14 * var14 + var16 * var16);
               if (var18 > 1.0) {
                  var14 /= var18;
                  var16 /= var18;
               }

               var4 = var4.add(var14 * var5 * 0.1, 0.0, var16 * var5 * 0.1);
            }

            double var22 = 0.001;
            if (mc.options.jumpKey.isPressed()) {
               float var11 = Helper351.INSTANCE.method3483().method3334();
               float var23 = var11 >= 0.0F ? MathHelper.clamp(var11 / 45.0F, 1.0F, 2.5F) : 0.9F;
               var22 = var7 * var23 * 0.08;
            } else if (mc.options.sneakKey.isPressed()) {
               var22 = -var7 * 0.12;
            }

            var4 = new Vec3d(var4.x, var22, var4.z);
            mc.player.increaseStat(Stats.JUMP, 0);
            mc.player.setVelocity(var4);
         }
      }
   }
}

package l;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class WaterSpeed extends Helper242 {
   private final Setting5 modeSetting = new Setting5("Режим", "Выберите режим обхода").method2381("FunTime").method2383("FunTime");

   public WaterSpeed() {
      super("WaterSpeed", "Water Speed", Helper269.MOVEMENT);
      this.setup(new Helper264[]{this.modeSetting});
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null) {
         if (this.modeSetting.method2385("FunTime") && mc.player.isSwimming()) {
            Vec3d var2 = mc.player.getVelocity();
            double var3 = 0.0;
            double var5 = 0.7F;
            double var7 = 0.4F;
            if (mc.player.input.movementForward != 0.0F || mc.player.input.movementSideways != 0.0F) {
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

               var2 = var2.add(var14 * var3, 0.0, var16 * var3);
            }

            if (mc.options.jumpKey.isPressed()) {
               float var20 = Helper351.INSTANCE.method3483().method3334();
               float var21 = var20 >= 0.0F ? MathHelper.clamp(var20 / 45.0F, 1.0F, 2.5F) : 0.9F;
               var2 = var2.add(0.0, var5 * var21 * 0.08, 0.0);
            } else if (mc.options.sneakKey.isPressed()) {
               var2 = var2.add(0.0, -var7 * 0.12, 0.0);
            }

            mc.player.setVelocity(var2);
         }
      }
   }
}

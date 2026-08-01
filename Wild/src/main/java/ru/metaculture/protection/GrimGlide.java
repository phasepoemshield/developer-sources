package ru.metaculture.protection;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.OnGroundOnly;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "GrimGlide",
   O0000000000 = Category.Movement,
   O000000000 = "Обход Grim при полёте на элитрах",
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.GRIM}
)
public class GrimGlide extends Module {
   public final NumberSetting O000000000O = new NumberSetting("Скорость", 1.0F, 1.0F, 2.0F, 0.05F, false);
   private int O000000000O0;
   private boolean O000000000O00;
   private boolean O000000000O000;

   public GrimGlide() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O000OO o0000000O000OO) {
      if (O0000000000.player != null && !this.O000000000O000) {
         if (!o0000000O000OO.O0000000000() && o0000000O000OO.O00000000000() instanceof PlayerPositionLookS2CPacket) {
            this.O000000000O0 = 2;
            this.O000000000O00 = true;
         }

         if (o0000000O000OO.O0000000000() && o0000000O000OO.O00000000000() instanceof PlayerMoveC2SPacket) {
            if (O0000000000.player.isGliding() && this.O000000000O0 == 0 && !this.O000000000O00) {
               this.O000000000O000 = true;
               O0000000000.getNetworkHandler().sendPacket(new OnGroundOnly(true, true));
               this.O000000000O000 = false;
               o0000000O000OO.O000000000();
            }

            this.O000000000O00 = false;
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0O0O0 o0000000O0O0O0) {
      if (O0000000000.player != null) {
         if (this.O000000000O0 > 0) {
            this.O000000000O0--;
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O0OOO0 o0000000O0OOO0) {
      if (O0000000000.player != null) {
         Vec3d var2 = O0000000000.player.getVelocity();
         Vec3d var3 = O0000000000.player.getRotationVector();
         float var4 = O0000000000.player.getPitch() * (float) (Math.PI / 180.0);
         double var5 = Math.sqrt(var3.x * var3.x + var3.z * var3.z);
         double var7 = var2.horizontalLength();
         boolean var9 = O0000000000.player.getVelocity().y <= 0.0;
         double var10 = var9 && O0000000000.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
            ? Math.min(O0000000000.player.getFinalGravity(), 0.01)
            : O0000000000.player.getFinalGravity();
         double var12 = MathHelper.square(Math.cos(var4));
         var2 = var2.add(0.0, var10 * (-1.0 + var12 * 0.75), 0.0);
         if (var2.y < 0.0 && var5 > 0.0) {
            double var14 = var2.y * -0.1 * var12;
            var2 = var2.add(var3.x * var14 / var5, var14, var3.z * var14 / var5);
         }

         if (var4 < 0.0F && var5 > 0.0) {
            double var26 = var7 * -MathHelper.sin(var4) * 0.04F;
            var2 = var2.add(-var3.x * var26 / var5, var26 * 3.2, -var3.z * var26 / var5);
         }

         if (var5 > 0.0) {
            var2 = var2.add((var3.x / var5 * var7 - var2.x) * 0.1, 0.0, (var3.z / var5 * var7 - var2.z) * 0.1);
         }

         double var16 = Math.toRadians(O0000000000.player.getYaw());
         double var18 = -Math.sin(var16);
         double var20 = Math.cos(var16);
         float var22 = this.O000000000O.O0000000000();
         if (this.O000000000O0 >= 1) {
            double var23 = 0.09F * var22;
            o0000000O0OOO0.O00000000(var2.multiply(0.99F, 0.98F, 0.99F).add(var18 * var23, 0.03F * var22, var20 * var23));
         } else {
            float var27 = MathHelper.clamp(0.3F * var22, 0.3F, 0.85F);
            o0000000O0OOO0.O00000000(var2.multiply(var27, var27, var27));
         }
      }
   }
}

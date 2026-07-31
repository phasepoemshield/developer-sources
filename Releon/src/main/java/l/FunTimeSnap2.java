package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class FunTimeSnap2 extends Helper353 {
   public static final FunTimeSnap2 INSTANCE = new FunTimeSnap2();

   public FunTimeSnap2() {
      super("FunTimeSnap");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      Helper331 var6 = Releon.method71().method33().method3250();
      if (var5 != null && mc.player != null) {
         Helper336 var7 = Helper349.method3470(var1, var2);
         float var8 = var7.method3333();
         float var9 = var7.method3334();
         float var10 = this.method3554(var8, var9);
         Helper326 var11 = var5.getConfig();
         float var12 = Math.abs(var8 / var10) * 40.0F;
         float var13 = Math.abs(var9 / var10) * 0.0F;
         if (var11 != null && var6.method3283(var11, 1)) {
            var12 = Math.abs(var8 / var10) * 65.0F;
         }

         float var14 = this.method3550(0.003F, 1.3F, true);
         float var15 = this.method3550(0.003F, 0.8F, true);
         if (!var6.method3288().method3356(300.0)) {
            if (var6.method3291() % 2 == 0 && var6.method3291() > 0) {
               if (!var6.method3288().method3356(250.0)) {
                  var14 = this.method3550(0.003F, -12.3F, true);
                  var15 = this.method3550(0.003F, -5.8F, true);
               }
            } else {
               var14 = this.method3550(0.003F, 12.3F, true);
               var15 = this.method3550(0.003F, 5.8F, true);
            }

            if (var6.method3291() % 30 == 0 && var6.method3291() > 0) {
               mc.player.swingHand(Hand.MAIN_HAND);
            }
         }

         return new Helper336(
            var1.method3333() + MathHelper.clamp(var8, -var12, var12) + var14, MathHelper.clamp(mc.player.getPitch(), -90.0F, 90.0F) + var15
         );
      } else {
         return var1;
      }
   }

   @Override
   public Vec3d method3149() {
      return Vec3d.ZERO;
   }

   private float method3550(float var1, float var2, boolean var3) {
      double var4 = (float)System.currentTimeMillis() * var1;
      return (float)((var3 ? Math.cos(var4) : Math.sin(var4)) * var2);
   }
}

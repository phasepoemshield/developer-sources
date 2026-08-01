package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class ReallyWorld extends Helper353 {
   public ReallyWorld() {
      super("ReallyWorld");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper331 var5 = Releon.method71().method33().method3250();
      Aura var6 = Aura.getInstance();
      if (var4 != null) {
         Vec3d var7 = Helper319.method3162(var4, 1.0F, 3.5F);
         var2 = Helper349.method3471(var7);
      }

      int var24 = var5.method3291();
      Helper339 var8 = var5.method3288();
      Helper336 var9 = Helper349.method3470(var1, var2);
      float var10 = var9.method3333();
      float var11 = var9.method3334();
      float var12 = (float)Math.hypot(Math.abs(var10), Math.abs(var11));
      boolean var13 = var4 != null && var5.method3283(var6.getConfig(), 0);
      float var14 = 1.0F;
      float var15 = 1.0F;
      float var16 = var13 ? var14 : var15;
      float var17 = Math.abs(var10 / var12) * 180.0F;
      float var18 = Math.abs(var11 / var12) * 180.0F;
      float var19 = var13 ? 0.0F : (float)(-6.0 * Math.cos(System.currentTimeMillis() / 12.0));
      float var20 = var13 ? 0.0F : (float)(6.0 * Math.sin(System.currentTimeMillis() / 21.0));
      if (!var6.isState() || var4 == null) {
         var16 = 1.0F;
         var19 = 0.0F;
         var20 = 0.0F;
      }

      float var21 = MathHelper.clamp(var10, -var17, var17);
      float var22 = MathHelper.clamp(var11, -var18, var18);
      Helper336 var23 = new Helper336(var1.method3333(), var1.method3334());
      var23.method3335(MathHelper.lerp(this.method3575(var16, var16 + 0.2F), var1.method3333(), var1.method3333() + var21) + var19);
      var23.method3336(MathHelper.lerp(this.method3575(var16, var16 + 0.2F), var1.method3334(), var1.method3334() + var22) + var20);
      if (var24 > 0 && var24 % 50 == 0 && !var8.method3356(200.0)) {
         var23.method3336(MathHelper.lerp(0.55F, var1.method3334(), var1.method3334() - 90.0F) + var20);
      }

      return var23;
   }

   private float method3575(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

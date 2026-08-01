package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Matrix2 extends Helper353 {
   public Matrix2() {
      super("Matrix");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper331 var6 = Releon.method71().method33().method3250();
      Aura var7 = Aura.getInstance();
      Helper339 var8 = var6.method3288();
      Helper336 var9 = Helper349.method3470(var1, var2);
      float var10 = var9.method3333();
      float var11 = var9.method3334();
      float var12 = (float)Math.hypot(Math.abs(var10), Math.abs(var11));
      boolean var13 = var4 != null && var6.method3283(var7.getConfig(), 0);
      float var14 = 1.0F;
      float var15 = this.method3576(0.0F, 0.5F);
      float var16 = var13 ? var14 : var15;
      float var17 = Math.abs(var10 / var12) * (var13 ? 360 : 100);
      float var18 = Math.abs(var11 / var12) * 180.0F;
      float var19 = var13 ? 0.0F : (float)(this.method3576(0.0F, 6.0F) * Math.sin((float)System.currentTimeMillis() / this.method3576(15.0F, 145.0F)));
      float var5 = var13 ? 0.0F : (float)(this.method3576(1.0F, 3.0F) * Math.sin((float)System.currentTimeMillis() / this.method3576(15.0F, 145.0F)));
      if (!var7.isState() || var4 == null) {
         var16 = 0.7F;
         var19 = 0.0F;
         var5 = 0.0F;
      }

      float var21 = MathHelper.clamp(var10, -var17, var17);
      float var22 = MathHelper.clamp(var11, -var18, var18);
      Helper336 var23 = new Helper336(var1.method3333(), var1.method3334());
      var23.method3335(MathHelper.lerp(this.method3576(var16, var16), var1.method3333(), var1.method3333() + var21) + var19);
      var23.method3336(MathHelper.lerp(this.method3576(var16, var16), var1.method3334(), var1.method3334() + var22) + var5);
      return var23;
   }

   private float method3576(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

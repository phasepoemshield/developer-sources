package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Matrix extends Helper353 {
   private boolean isPullingBack = false;
   private long pullBackStartTime = 0L;
   private final SecureRandom random = new SecureRandom();

   public Matrix() {
      super("Matrix");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper331 var5 = Releon.method71().method33().method3250();
      Aura var6 = Aura.getInstance();
      Helper339 var7 = var5.method3288();
      if (var4 != null) {
         Vec3d var8 = Helper319.method3161(var4, 1.0F, 1.2F, 1.0F, 4.0F);
         var2 = Helper349.method3471(var8);
      }

      Helper336 var22 = Helper349.method3470(var1, var2);
      float var9 = var22.method3333();
      float var10 = var22.method3334();
      float var11 = (float)Math.hypot(Math.abs(var9), Math.abs(var10));
      boolean var12 = var4 != null && var5.method3283(var6.getConfig(), 0);
      float var13 = 0.75F;
      float var14 = !var7.method3356(250.0) ? 0.1F : 0.4F;
      if (!var7.method3356(350.0)) {
         var14 = 0.15F;
      }

      if (!var7.method3356(500.0)) {
         var14 = 0.25F;
      }

      float var15 = Math.abs(var9 / var11) * (var12 ? 360 : 100);
      float var16 = Math.abs(var10 / var11) * 180.0F;
      float var17 = var12 ? 0.0F : (float)(3.0 * Math.sin(System.currentTimeMillis() / 85.0));
      float var18 = var12 ? 0.0F : (float)(2.0 * Math.cos(System.currentTimeMillis() / 85.0));
      float var19 = MathHelper.clamp(var9, -var15, var15);
      float var20 = MathHelper.clamp(var10, -var16, var16);
      Helper336 var21 = new Helper336(var1.method3333(), var1.method3334());
      var21.method3335(MathHelper.lerp(this.method3551(var14, var14), var1.method3333(), var1.method3333() + var19) + var17);
      var21.method3336(MathHelper.lerp(this.method3551(var14, var14), var1.method3334(), var1.method3334() + var20) + var18);
      return var21;
   }

   private float method3551(float var1, float var2) {
      return MathHelper.lerp(this.random.nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

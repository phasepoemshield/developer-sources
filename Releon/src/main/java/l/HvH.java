package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class HvH extends Helper353 {
   private static long tickCounter = 0L;
   private float resetProgress = 0.0F;
   private final SecureRandom secureRandom = new SecureRandom();
   private boolean jitterApplied = false;

   public HvH() {
      super("HvH");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      Helper331 var6 = Releon.method71().method33().method3250();
      if (var4 != null) {
         Vec3d var7 = Helper319.method3161(var4, 1.0F, 1.3F, 1.0F, 6.0F);
         var2 = Helper349.method3471(var7);
      }

      boolean var21 = var4 != null && var6.method3283(var5.getConfig(), 0);
      Helper336 var8 = Helper349.method3470(var1, var2);
      float var9 = var8.method3333();
      float var10 = var8.method3334();
      float var11 = (float)Math.hypot(Math.abs(var9), Math.abs(var10));
      float var12 = 1.0F;
      float var13 = var21 ? 0.0F : (float)(5.0 * Math.sin(System.currentTimeMillis() / 45.0));
      float var14 = var21 ? 0.0F : (float)(5.0 * Math.sin(System.currentTimeMillis() / 45.0));
      float var15 = 360.0F;
      float var16 = Math.abs(var9 / var11) * var15;
      float var17 = Math.abs(var10 / var11) * var15;
      float var18 = MathHelper.clamp(var9, -var16, var16);
      float var19 = MathHelper.clamp(var10, -var17, var17);
      Helper336 var20 = new Helper336(var1.method3333(), var1.method3334());
      var20.method3335(MathHelper.lerp(Helper147.method1228(var12, var12 + 0.2F), var1.method3333(), var1.method3333() + var18) + var13);
      var20.method3336(MathHelper.lerp(Helper147.method1228(var12, var12 + 0.2F), var1.method3334(), var1.method3334() + var19) + var14);
      return new Helper336(var20.method3333(), var20.method3334());
   }

   private float method3158(float var1, float var2) {
      return var1 + (float)(this.secureRandom.nextGaussian() * var2);
   }

   private float method3159(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class HolyWorld extends Helper353 {
   private static long tickCounter = 0L;
   private float resetProgress = 0.0F;
   private final SecureRandom secureRandom = new SecureRandom();
   private boolean jitterApplied = false;

   public HolyWorld() {
      super("HolyWorld");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      Helper331 var6 = Releon.method71().method33().method3250();
      boolean var7 = var4 != null && var6.method3283(var5.getConfig(), 0);
      Helper336 var8 = Helper349.method3470(var1, var2);
      float var9 = var8.method3333();
      float var10 = var8.method3334();
      float var11 = (float)Math.hypot(Math.abs(var9), Math.abs(var10));
      float var12 = var7 ? this.method3151(0.86F, 0.96F) : this.method3151(0.1F, 0.4F);
      float var13 = 180.0F;
      float var14 = Math.abs(var9 / var11) * var13;
      float var15 = Math.abs(var10 / var11) * var13;
      float var16 = MathHelper.clamp(var9, -var14, var14);
      float var17 = MathHelper.clamp(var10, -var15, var15);
      Helper336 var18 = new Helper336(var1.method3333(), var1.method3334());
      var18.method3335(MathHelper.lerp(Helper147.method1228(var12, var12 + 0.2F), var1.method3333(), var1.method3333() + var16));
      var18.method3336(MathHelper.lerp(Helper147.method1228(var12, var12 + 0.2F), var1.method3334(), var1.method3334() + var17));
      return new Helper336(var18.method3333(), var18.method3334());
   }

   private float method3150(float var1, float var2) {
      return var1 + (float)(this.secureRandom.nextGaussian() * var2);
   }

   private float method3151(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.1, 0.1, 0.1);
   }
}

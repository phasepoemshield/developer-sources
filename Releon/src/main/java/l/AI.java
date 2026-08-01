package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class AI extends Helper353 {
   private long smoothbackShakeStartMs = -1L;
   private final AtomicLong время = new AtomicLong(0L);

   public AI() {
      super("AI");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper336 var5 = Helper349.method3470(var1, var2);
      float var6 = var5.method3333();
      Aura var7 = Aura.getInstance();
      if (var7 != null && mc.player != null) {
         float var8 = MathHelper.clamp(mc.player.getPitch(), -90.0F, 90.0F);
         boolean var9 = this.method3234(0);
         boolean var10 = var7.isEnabled() && var7.getTarget() != null && var4 != null;
         if (var7.getTarget() == null) {
            if (this.время.get() == 0L) {
               this.время.set(System.currentTimeMillis());
            }

            if (this.smoothbackShakeStartMs < 0L) {
               this.smoothbackShakeStartMs = System.currentTimeMillis();
            }

            float var18 = MathHelper.clamp((float)(System.currentTimeMillis() - this.smoothbackShakeStartMs) / 1000.0F, 0.0F, 1.0F);
            float var19 = 1.0F - var18;
            Helper336 var20 = var2 != null ? var2 : var1;
            Helper336 var21 = Helper349.method3470(var1, var20);
            float var22 = 0.18F + 0.82F * var18;
            float var23 = (float)(10.0 * Math.sin((float)System.currentTimeMillis() / 115.0F)) * var19;
            return new Helper336(var1.method3333() + var21.method3333() * var22 + var23, var8);
         } else {
            this.время.set(0L);
            this.smoothbackShakeStartMs = -1L;
            float var11 = 0.0F;
            if (var7.getTarget() != null && !var9) {
               var11 = (float)(1.5 * Math.sin(System.currentTimeMillis() / 110.0));
            }

            float var12 = var9 ? 0.42F : (this.method3234(1) ? 0.46F : 0.26F);
            if (var9 && !var10) {
               var12 = 0.42F;
            }

            float var13 = var9 ? 55.0F : 35.0F;
            float var14 = MathHelper.clamp(var6, -var13, var13);
            float var15 = var1.method3333() + var14;
            float var16 = MathHelper.clamp(this.method3235(var12, var12 + 0.08F), 0.0F, 1.0F);
            float var17 = MathHelper.lerp(var16, var1.method3333(), var15) + var11;
            return new Helper336(var17, var8);
         }
      } else {
         return var1;
      }
   }

   private boolean method3234(int var1) {
      Aura var2 = Aura.getInstance();
      if (var2 == null) {
         return false;
      } else {
         try {
            Helper331 var3 = Releon.method71().method33().method3250();
            return var3 != null
               && var2.getTarget() != null
               && mc.player != null
               && mc.player.distanceTo(var2.getTarget()) <= var2.getAttackRange().method2082()
               && var2.getConfig() != null
               && var3.method3283(var2.getConfig(), var1);
         } catch (Throwable var4) {
            return false;
         }
      }
   }

   private float method3235(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

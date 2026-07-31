package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class CakeWorld extends Helper353 {
   private final AtomicLong время = new AtomicLong(0L);

   public CakeWorld() {
      super("CakeWorld");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper336 var5 = Helper349.method3470(var1, var2);
      float var6 = var5.method3333();
      float var7 = var5.method3334();
      float var8 = (float)Math.hypot(Math.abs(var6), Math.abs(var7));
      Aura var9 = Aura.getInstance();
      boolean var10 = this.method3147(0);
      boolean var11 = var9.getTarget() != null
         && Helper349.method3474(var1.method3333(), var1.method3334(), var9.getAttackRange().method2082(), var9.getLookRange().method2082(), var9.getTarget());
      if (var9.getTarget() == null) {
         if (this.время.get() == 0L) {
            this.время.set(System.currentTimeMillis());
         }

         if (System.currentTimeMillis() - this.время.get() < 500L) {
            float var12 = (float)(0.0 * Math.cos((float)System.currentTimeMillis() / 10.0F));
            float var13 = (float)(0.0 * Math.sin((float)System.currentTimeMillis() / 10.0F));
            Helper336 var14 = new Helper336(var1.method3333(), var1.method3334());
            var14.method3335(var1.method3333() + var13);
            var14.method3336(MathHelper.clamp(var1.method3334() + var12, -90.0F, 90.0F));
            return var14;
         }
      } else {
         this.время.set(0L);
      }

      float var23 = 0.0F;
      if (var9.getTarget() != null && !var10) {
         var23 = (float)(360.0 * Math.cos(System.currentTimeMillis() / 31.5));
      }

      float var24 = 0.0F;
      if (var9.getTarget() != null && !var10) {
         var24 = (float)(0.0 * Math.sin(System.currentTimeMillis() / 11.5));
      }

      float var25 = var10 ? 0.01F : (this.method3147(1) ? 0.5F : 0.01F);
      if (var10 && !var11) {
         var25 = 0.01F;
      }

      float var15 = Math.abs(var6 / var8) * 180.0F;
      float var16 = Math.abs(var7) * 180.0F;
      float var17 = MathHelper.clamp(var6, -var15, var15);
      float var18 = MathHelper.clamp(var7, -var16, var16);
      float var19 = var1.method3333() + var17;
      Helper336 var20 = new Helper336(var1.method3333(), var1.method3334());
      var20.method3335(MathHelper.lerp(Math.clamp(this.method3148(var25, var25 + 0.2F), 0.0F, 1.0F), var1.method3333(), var19) + var24);
      float var21 = MathHelper.lerp(Math.clamp(this.method3148(var25, var25 + 0.2F), 0.0F, 1.0F), var1.method3334(), var1.method3334() + var18) + var23;
      float var22 = MathHelper.clamp(var21, -90.0F, 90.0F);
      var20.method3336(var22);
      return var20;
   }

   private boolean method3147(int var1) {
      Aura var2 = Aura.getInstance();
      return var2.getTarget() != null && Releon.method71().method33().method3250().method3283(var2.getConfig(), var1);
   }

   private float method3148(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

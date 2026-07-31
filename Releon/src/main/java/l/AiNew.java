package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicLong;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class AiNew extends Helper353 {
   private long smoothbackShakeStartMs = -1L;
   private final AtomicLong время = new AtomicLong(0L);

   public AiNew() {
      super("AiNew");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Helper336 var5 = Helper349.method3470(var1, var2);
      float var6 = var5.method3333();
      float var7 = var5.method3334();
      float var8 = (float)Math.hypot(Math.abs(var6), Math.abs(var7));
      if (var8 < 1.0E-6F) {
         var8 = 1.0F;
      }

      Aura var9 = Aura.getInstance();
      boolean var10 = this.method3478(0);
      boolean var11 = var9.isEnabled() && var9.getTarget() != null && var4 != null;
      if (var9.getTarget() == null) {
         if (this.время.get() == 0L) {
            this.время.set(System.currentTimeMillis());
         }

         if (this.smoothbackShakeStartMs < 0L) {
            this.smoothbackShakeStartMs = System.currentTimeMillis();
         }

         float var23 = Math.clamp((float)(System.currentTimeMillis() - this.smoothbackShakeStartMs) / 200.0F, 0.0F, 1.0F);
         float var24 = 1.0F - var23;
         Helper336 var25 = var2 != null ? var2 : var1;
         Helper336 var26 = Helper349.method3470(var1, var25);
         float var27 = 0.18F + 0.82F * var23;
         float var28 = (float)(10.0 * Math.cos((float)System.currentTimeMillis() / 21.0F)) * var24;
         float var29 = (float)(10.0 * Math.sin((float)System.currentTimeMillis() / 35.0F)) * var24;
         Helper336 var30 = new Helper336(var1.method3333(), var1.method3334());
         var30.method3335(var1.method3333() + var26.method3333() * var27 + var29);
         var30.method3336(Math.clamp(var1.method3334() + var26.method3334() * var27 + var28, -90.0F, 90.0F));
         return var30;
      } else {
         this.время.set(0L);
         this.smoothbackShakeStartMs = -1L;
         float var12 = 0.0F;
         if (var9.getTarget() != null && !var10) {
            var12 = (float)(2.0 * Math.cos(System.currentTimeMillis() / 85.0));
         }

         float var13 = 0.0F;
         if (var9.getTarget() != null && !var10) {
            var13 = (float)(2.0 * Math.sin(System.currentTimeMillis() * 175.0));
         }

         float var14 = var10 ? 0.57F : (this.method3478(0) ? 1.0F : 0.57F);
         if (var10 && !var11) {
            var14 = 0.57F;
         }

         float var15 = Math.abs(var6 / var8) * 180.0F;
         float var16 = Math.abs(var7) * 180.0F;
         float var17 = Mth.clamp(var6, -var15, var15);
         float var18 = Mth.clamp(var7, -var16, var16);
         float var19 = var1.method3333() + var17;
         Helper336 var20 = new Helper336(var1.method3333(), var1.method3334());
         var20.method3335(MathHelper.lerp(Math.clamp(this.method3479(var14, var14 + 0.2F), 0.0F, 1.0F), var1.method3333(), var19) + var13);
         float var21 = MathHelper.lerp(Math.clamp(this.method3479(var14, var14 + 0.2F), 0.0F, 1.0F), var1.method3334(), var1.method3334() + var18)
            + var12 * var13;
         float var22 = Math.clamp(var21, -90.0F, 90.0F);
         var20.method3336(var22);
         return var20;
      }
   }

   private boolean method3478(int var1) {
      Aura var2 = Aura.getInstance();
      Helper331 var3 = Releon.method71().method33().method3250();
      MinecraftClient var4 = MinecraftClient.getInstance();
      return var2 != null && var2.getTarget() != null && var4.player != null
         ? var3 != null
            && var2.getTarget() != null
            && mc.player != null
            && mc.player.distanceTo(var2.getTarget()) <= var2.getAttackRange().method2082()
            && var2.getConfig() != null
            && var3.method3283(var2.getConfig(), var1)
         : false;
   }

   private float method3479(float var1, float var2) {
      return MathHelper.lerp(new SecureRandom().nextFloat(), var1, var2);
   }

   @Override
   public Vec3d method3149() {
      return new Vec3d(0.0, 0.0, 0.0);
   }
}

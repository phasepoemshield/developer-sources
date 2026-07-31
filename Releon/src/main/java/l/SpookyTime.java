package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class SpookyTime extends Helper353 {
   public static final SpookyTime INSTANCE = new SpookyTime();
   private static final long SMOOTHBACK_DURATION_MS = 100L;
   private long smoothbackShakeStartMs = -1L;
   private Helper336 releaseFromAngle;
   private Helper336 releaseToAngle;

   public SpookyTime() {
      super("SpookyTime");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      MinecraftClient var6 = MinecraftClient.getInstance();
      if (var5 != null && var6.player != null) {
         Helper331 var7 = Releon.method71().method33().method3250();
         if (var5.isEnabled() && var5.getTarget() != null && var4 != null && var7 != null) {
            this.smoothbackShakeStartMs = -1L;
            this.releaseFromAngle = null;
            this.releaseToAngle = null;
            Helper326 var22 = var5.getConfig();
            Helper336 var23 = Helper349.method3470(var1, var2);
            float var24 = Math.max((float)Math.hypot(Math.abs(var23.method3333()), Math.abs(var23.method3334())), 1.0E-4F);
            boolean var25 = var7.method3283(var22, 2);
            boolean var26 = var7.method3283(var22, 0);
            boolean var27 = var7.method3283(var22, 5);
            boolean var28 = !var6.player.isOnGround();
            boolean var30 = Helper349.method3474(
               var1.method3333(), var1.method3334(), var5.getAttackRange().method2082(), var5.getLookRange().method2082(), var5.getTarget()
            );
            float var31 = var26 ? 30.0F : (var28 ? Helper147.method1227(13, 35) : Helper147.method1227(15, 33));
            float var32 = var26 ? 25.0F : (var28 ? Helper147.method1227(12, 25) : Helper147.method1227(13, 21));
            float var33 = Math.abs(var23.method3333() / var24) * var31;
            float var34 = Math.abs(var23.method3334() / var24) * var32;
            float var35 = var27 ? (!var30 && var25 ? 0 : Helper147.method1227(0, 0)) : 0.0F;
            float var21 = var27 ? (!var30 && var25 ? 0 : Helper147.method1227(0, 0)) : 0.0F;
            return new Helper336(
               var1.method3333() + Math.min(Math.max(var23.method3333(), -var33), var33) + var21,
               var1.method3334() + Math.min(Math.max(var23.method3334(), -var34), var34) + var35
            );
         } else {
            if (var5.isEnabled() && var5.getTarget() != null) {
               this.smoothbackShakeStartMs = -1L;
               this.releaseFromAngle = null;
               this.releaseToAngle = null;
            } else if (this.smoothbackShakeStartMs < 0L) {
               this.smoothbackShakeStartMs = System.currentTimeMillis();
               this.releaseFromAngle = new Helper336(var1.method3333(), var1.method3334());
               this.releaseToAngle = new Helper336(var6.player.getYaw(), var6.player.getPitch());
            } else if (this.releaseToAngle != null) {
               this.releaseToAngle.method3335(var6.player.getYaw());
               this.releaseToAngle.method3336(var6.player.getPitch());
            }

            Helper336 var8 = this.releaseToAngle != null ? this.releaseToAngle : new Helper336(var6.player.getYaw(), var6.player.getPitch());
            Helper336 var9 = Helper349.method3470(var1, var8);
            float var10 = Math.max((float)Math.hypot(Math.abs(var9.method3333()), Math.abs(var9.method3334())), 1.0E-4F);
            float var11 = 0.0F;
            float var12 = 0.0F;
            float var13 = this.smoothbackShakeStartMs >= 0L
               ? Mth.clamp((float)(System.currentTimeMillis() - this.smoothbackShakeStartMs) / 100.0F, 0.0F, 1.0F)
               : 1.0F;
            float var14 = 1.0F - (float)Math.pow(1.0F - var13, 3.0);
            if (this.smoothbackShakeStartMs >= 0L) {
               float var15 = 1.0F - var13;
               var11 *= var15;
               var12 *= var15;
            }

            float var29 = Mth.lerp(var14, 18.0F, 35.0F);
            float var16 = Mth.lerp(var14, 16.0F, 28.0F);
            float var17 = Math.abs(var9.method3333() / var10) * var29;
            float var18 = Math.abs(var9.method3334() / var10) * var16;
            float var19 = Mth.lerp(var14, 0.28F, 0.35F);
            Helper336 var20 = new Helper336(
               Mth.lerp(var19, var1.method3333(), var1.method3333() + Mth.clamp(var9.method3333(), -var17, var17) + var11),
               Mth.clamp(Mth.lerp(var19, var1.method3334(), var1.method3334() + Mth.clamp(var9.method3334(), -var18, var18) + var12), -90.0F, 90.0F)
            );
            if (this.smoothbackShakeStartMs >= 0L && this.releaseFromAngle != null) {
               var20.method3335(MathHelper.lerpAngleDegrees(var14, this.releaseFromAngle.method3333(), var20.method3333()));
               var20.method3336(Mth.lerp(var14, this.releaseFromAngle.method3334(), var20.method3334()));
               if (var13 >= 1.0F) {
                  this.releaseFromAngle = null;
                  this.releaseToAngle = null;
               }
            }

            return var20;
         }
      } else {
         return var1;
      }
   }

   @Override
   public Vec3d method3149() {
      return Vec3d.ZERO;
   }
}

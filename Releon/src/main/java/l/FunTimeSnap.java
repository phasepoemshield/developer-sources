package l;

import fat.releon.Releon;
import fat.releon.teremok.impl.combat.Aura;
import net.minecraft.entity.Entity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class FunTimeSnap extends Helper353 {
   public static final FunTimeSnap INSTANCE = new FunTimeSnap();
   private static final long SMOOTHBACK_DURATION_MS = 1000L;
   private long smoothbackShakeStartMs = -1L;
   private Helper336 releaseFromTurns = null;
   private Helper336 releaseToTurns = null;

   private FunTimeSnap() {
      super("FunTimeSnap");
   }

   @Override
   public Helper336 method3146(Helper336 var1, Helper336 var2, Vec3d var3, Entity var4) {
      Aura var5 = Aura.getInstance();
      Helper331 var6 = Releon.method71().method33().method3250();
      if (var5 != null && mc.player != null) {
         if (var5.isState() && var5.getTarget() != null && var4 != null && var6.method3283(var5.getConfig(), 1)) {
            this.smoothbackShakeStartMs = -1L;
            this.releaseFromTurns = null;
            this.releaseToTurns = null;
            Helper336 var20 = Helper349.method3470(var1, var2);
            float var21 = var20.method3333();
            float var22 = var20.method3334();
            float var23 = (float)Math.hypot(Math.abs(var21), Math.abs(var22));
            if (var23 < 1.0E-4F) {
               var23 = 1.0E-4F;
            }

            float var24 = Math.abs(var21 / var23) * 130.0F;
            float var25 = Math.abs(var22 / var23) * 130.0F;
            return new Helper336(
               MathHelper.lerp(0.85F, var1.method3333(), var1.method3333() + MathHelper.clamp(var21, -var24, var24)),
               MathHelper.lerp(0.85F, var1.method3334(), var1.method3334() + MathHelper.clamp(var22, -var25, var25))
            );
         } else {
            if (var5.isState() && var5.getTarget() != null) {
               this.smoothbackShakeStartMs = -1L;
               this.releaseFromTurns = null;
               this.releaseToTurns = null;
            } else if (this.smoothbackShakeStartMs < 0L) {
               this.smoothbackShakeStartMs = System.currentTimeMillis();
               this.releaseFromTurns = new Helper336(var1.method3333(), var1.method3334());
               this.releaseToTurns = new Helper336(mc.player.getYaw(), mc.player.getPitch());
            } else if (this.releaseToTurns != null) {
               this.releaseToTurns.method3335(mc.player.getYaw());
               this.releaseToTurns.method3336(mc.player.getPitch());
            }

            Helper336 var7 = this.releaseToTurns != null ? this.releaseToTurns : new Helper336(mc.player.getYaw(), mc.player.getPitch());
            Helper336 var8 = Helper349.method3470(var1, var7);
            float var9 = var8.method3333();
            float var10 = var8.method3334();
            float var11 = (float)Math.hypot(Math.abs(var9), Math.abs(var10));
            if (var11 < 1.0E-4F) {
               var11 = 1.0E-4F;
            }

            float var12 = (float)(Helper147.method1227(1, 2) * Math.sin(System.currentTimeMillis() / 60.0));
            float var13 = (float)(Helper147.method1227(3, 7) * Math.cos(System.currentTimeMillis() / 60.0));
            if (!var5.isState() || var5.getTarget() == null) {
               float var14 = 1.0F - MathHelper.clamp((float)(System.currentTimeMillis() - this.smoothbackShakeStartMs) / 1000.0F, 0.0F, 1.0F);
               var12 *= var14;
               var13 *= var14;
            }

            float var26 = Math.abs(var9 / var11) * (!var6.method3288().method3356(535.0) ? 0.0F : 45.0F);
            float var15 = Math.abs(var10 / var11) * (!var6.method3288().method3356(535.0) ? 0.0F : 45.0F);
            if (var6.method3291() % 15 == 0 && var6.method3291() > 0 && !var6.method3288().method3356(900.0)) {
               var13 = -90.0F;
               if (var6.method3288().method3356(900.0)) {
                  mc.player.swingHand(Hand.MAIN_HAND);
               }
            }

            Helper336 var16 = new Helper336(
               MathHelper.lerp(0.85F, var1.method3333(), var1.method3333() + MathHelper.clamp(var9, -var26, var26) + var12),
               MathHelper.lerp(0.85F, var1.method3334(), var1.method3334() + MathHelper.clamp(var10, -var15, var15) + var13)
            );
            if ((!var5.isState() || var5.getTarget() == null) && this.smoothbackShakeStartMs >= 0L) {
               float var17 = MathHelper.clamp((float)(System.currentTimeMillis() - this.smoothbackShakeStartMs) / 1000.0F, 0.0F, 1.0F);
               Helper336 var18 = this.releaseFromTurns != null ? this.releaseFromTurns : var1;
               if (this.releaseToTurns == null) {
                  ;
               }

               var16.method3335(MathHelper.lerpAngleDegrees(var17, var18.method3333(), var16.method3333()));
               var16.method3336(MathHelper.lerp(var17, var18.method3334(), var16.method3334()));
               if (var17 >= 1.0F) {
                  this.releaseFromTurns = null;
                  this.releaseToTurns = null;
               }
            }

            return var16;
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

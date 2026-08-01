package ru.metaculture.protection;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Items;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "BowHelper",
   O000000000 = "Плавная наводка без тряски",
   O0000000000 = Category.Combat
)
public class BowHelper extends Module {
   public NumberSetting O000000000O = new NumberSetting("Дистанция", 30.0F, 1.0F, 50.0F, 1.0F, false);
   public BooleanSetting O000000000O0 = new BooleanSetting("Игнор друзей", true);
   public static LivingEntity O000000000O00 = null;
   private boolean O000000000O000 = false;

   public BowHelper() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0});
   }

   @Override
   public void O00000000() {
      super.O00000000();
   }

   @Override
   public void O000000000() {
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
         boolean var2 = O0000000000.player.getMainHandStack().getItem() instanceof BowItem
            || O0000000000.player.getOffHandStack().getItem() instanceof BowItem
            || O0000000000.player.getMainHandStack().getItem() instanceof CrossbowItem
            || O0000000000.player.getOffHandStack().getItem() instanceof CrossbowItem;
         if (!var2) {
            this.O0000000000O0();
         } else {
            boolean var3 = O0000000000.player.isUsingItem() && O0000000000.player.getActiveItem().getItem() instanceof BowItem;
            boolean var4 = O0000000000.player.getMainHandStack().isOf(Items.CROSSBOW) && CrossbowItem.isCharged(O0000000000.player.getMainHandStack())
               || O0000000000.player.getOffHandStack().isOf(Items.CROSSBOW) && CrossbowItem.isCharged(O0000000000.player.getOffHandStack());
            if (O000000000O00 != null && !this.O00000000(O000000000O00)) {
               O000000000O00 = null;
            }

            if (O000000000O00 == null) {
               O000000000O00 = this.O0000000000O0O();
            }

            if (O000000000O00 != null) {
               if (!this.O000000000O000) {
                  O000000O0O00O.O00000000 = true;
                  this.O000000000O000 = true;
               }

               if (var3 || var4) {
                  float var5 = this.O0000000000O00();
                  Vec3d var6 = O0000000000.player.getEyePos();
                  Vec3d var7 = O000000000O00.getPos().add(0.0, O000000000O00.getHeight() * 0.5 + 0.1, 0.0);
                  double var8 = O000000000O00.getX() - O000000000O00.lastX;
                  double var10 = O000000000O00.getZ() - O000000000O00.lastZ;
                  double var12 = Math.sqrt(var8 * var8 + var10 * var10);
                  Vec3d var14 = var7;
                  float var15 = 0.0F;

                  for (int var16 = 0; var16 < 3; var16++) {
                     double var17 = Math.cos(Math.toRadians(var15));
                     float var19 = (float)(var5 * Math.max(var17, 0.1));
                     if (var12 > 0.01) {
                        Vec3d var20 = var7;

                        for (int var21 = 0; var21 < 25; var21++) {
                           double var22 = var20.x - var6.x;
                           double var24 = var20.z - var6.z;
                           double var26 = Math.sqrt(var22 * var22 + var24 * var24);
                           double var28 = this.O00000000(var26, var19);
                           var20 = new Vec3d(var7.x + var8 * var28, var7.y, var7.z + var10 * var28);
                        }

                        var14 = var20;
                     }

                     double var31 = var14.x - var6.x;
                     double var33 = var14.z - var6.z;
                     double var34 = Math.sqrt(var31 * var31 + var33 * var33);
                     double var35 = var14.y - var6.y;
                     var15 = this.O00000000(var34, var35, var5);
                  }

                  double var30 = var14.x - var6.x;
                  double var18 = var14.z - var6.z;
                  float var32 = (float)Math.toDegrees(Math.atan2(-var30, var18));
                  O0000000000.player.setYaw(var32);
                  O0000000000.player.setPitch(var15);
                  O0000000000.player.headYaw = var32;
               }
            }
         }
      }
   }

   private void O0000000000O0() {
      if (this.O000000000O000) {
         O0000000000.player.setYaw(O000000O0O00O.O0000000000);
         O0000000000.player.setPitch(O000000O0O00O.O00000000000);
         O0000000000.player.headYaw = O000000O0O00O.O0000000000;
         O000000O0O00O.O00000000 = false;
         this.O000000000O000 = false;
      }

      O000000000O00 = null;
   }

   private float O00000000(double d, double e, float f) {
      if (d < 0.5) {
         return 0.0F;
      } else {
         float var6 = -89.0F;
         float var7 = 89.0F;

         for (int var8 = 0; var8 < 60; var8++) {
            float var9 = (var6 + var7) / 2.0F;
            double var10 = this.O00000000(d, var9, f);
            if (var10 > e) {
               var6 = var9;
            } else {
               var7 = var9;
            }
         }

         return (var6 + var7) / 2.0F;
      }
   }

   private double O00000000(double d, float f, float g) {
      double var5 = Math.toRadians(f);
      double var7 = g * Math.cos(var5);
      double var9 = -g * Math.sin(var5);
      double var11 = 0.0;
      double var13 = 0.0;

      for (int var15 = 0; var15 < 500; var15++) {
         double var16 = var11;
         double var18 = var13;
         var11 += var7;
         var13 += var9;
         var7 *= 0.99;
         var9 *= 0.99;
         var9 -= 0.05;
         if (var11 >= d) {
            double var20 = var11 - var16 > 0.001 ? (d - var16) / (var11 - var16) : 1.0;
            return var18 + (var13 - var18) * var20;
         }
      }

      return var13;
   }

   private double O00000000(double d, float f) {
      double var4 = f;
      double var6 = 0.0;

      for (int var8 = 0; var8 < 500; var8++) {
         var6 += var4;
         var4 *= 0.99;
         if (var6 >= d) {
            return var8 + 1;
         }
      }

      return 500.0;
   }

   private float O0000000000O00() {
      boolean var1 = O0000000000.player.getMainHandStack().getItem() instanceof CrossbowItem
         || O0000000000.player.getOffHandStack().getItem() instanceof CrossbowItem;
      if (var1) {
         return 3.15F;
      } else {
         float var2 = 1.0F;
         if (O0000000000.player.isUsingItem() && O0000000000.player.getActiveItem().getItem() instanceof BowItem) {
            int var3 = O0000000000.player.getItemUseTime();
            float var4 = var3 / 20.0F;
            var2 = MathHelper.clamp((var4 * var4 + var4 * 2.0F) / 3.0F, 0.0F, 1.0F);
         }

         return var2 * 3.0F;
      }
   }

   private boolean O00000000(LivingEntity livingEntity) {
      if (livingEntity instanceof PlayerEntity var2) {
         if (!var2.isAlive()) {
            return false;
         } else {
            return var2.isInvulnerable() ? false : !(O0000000000.player.distanceTo(var2) > this.O000000000O.O0000000000());
         }
      } else {
         return false;
      }
   }

   private LivingEntity O0000000000O0O() {
      float var1 = this.O000000000O.O0000000000();
      PlayerEntity var2 = null;
      double var3 = Double.MAX_VALUE;
      Vec3d var5 = O0000000000.player.getEyePos();
      float var6 = O0000000000.gameRenderer.getCamera().getYaw();
      float var7 = O0000000000.gameRenderer.getCamera().getPitch();
      Vec3d var8 = Vec3d.fromPolar(var7, var6).normalize();

      for (Entity var10 : O0000000000.world.getEntities()) {
         if (var10 instanceof PlayerEntity var11
            && var11 != O0000000000.player
            && var11.isAlive()
            && !var11.isInvulnerable()
            && !var11.isCreative()
            && !(O0000000000.player.distanceTo(var11) > var1)
            && (!this.O000000000O0.O0000000000() || !FriendCommand.O00000000(var11.getName().getString()))) {
            Vec3d var12 = var11.getPos().add(0.0, var11.getHeight() * 0.5, 0.0).subtract(var5).normalize();
            double var13 = Math.acos(MathHelper.clamp(var8.dotProduct(var12), -1.0, 1.0));
            if (var13 < var3) {
               var3 = var13;
               var2 = var11;
            }
         }
      }

      return var2;
   }

   @Override
   public void a_() {
      super.a_();
      if (O0000000000.player != null) {
         this.O0000000000O0();
      }
   }
}

package ru.metaculture.protection;

import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleAccess(
   O0000000000 = {"lichoday"}
)
@ModuleRegister(
   O00000000 = "Speed",
   O000000000 = "Ускоряет вашего персонажа",
   O0000000000 = Category.Movement,
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.MATRIX, O0000000OO0OOO.GRIM}
)
public class Speed extends Module {
   public static ModeSetting O000000000O = new ModeSetting("Режим", "Vanilla", "Vanilla", "ST duel", "HW", "Ares-Entity", "Grim-Entity", "TargetStrafe");
   public static NumberSetting O000000000O0 = new NumberSetting("Пиковая скорость (BPS)", 7.0F, 3.0F, 15.0F, 1.0F, false);
   public static NumberSetting O000000000O00 = new NumberSetting("Сила ускорения", 0.8F, 0.1F, 2.0F, 0.1F, false);
   public static NumberSetting O000000000O000 = new NumberSetting("Радиус стрейфа", 2.0F, 0.5F, 5.0F, 0.1F, false)
      .O00000000(() -> !O000000000O.O000000000("TargetStrafe"));
   public static int O000000000O00O = 1;

   public Speed() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, O000000000O00, O000000000O000});
   }

   @Override
   public void O000000000() {
      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O00O0.O00000000() && O0000000000.player != null && O0000000000.world != null) {
         if (O0000000000.player.horizontalCollision) {
            O000000000O00O = -O000000000O00O;
         }

         String var2 = O000000000O.O0000000000();
         switch (var2) {
            case "Vanilla":
               O0000O00O000OO.O000000000(0.42);
               break;
            case "ST duel":
               this.O00000000(0.16);
               break;
            case "HW":
               this.O00000000(0.1);
               break;
            case "Grim-Entity":
               this.O0000000000O0();
               break;
            case "Ares-Entity":
               this.O0000000000O00();
               break;
            case "TargetStrafe":
               this.O0000000000O0O();
         }
      }
   }

   private void O00000000(double d) {
      if (!O0000000000.player.isOnGround()) {
         Box var3 = O0000000000.player.getBoundingBox().expand(d);
         List var4 = O0000000000.world.getOtherEntities(O0000000000.player, var3);
         int var5 = 0;
         int var6 = 0;

         for (Entity var8 : (Iterable<Entity>)var4) {
            if (var8 instanceof ArmorStandEntity) {
               var5++;
            } else if (var8 instanceof LivingEntity) {
               var6++;
            }

            if (var5 > 1 || var6 > 1) {
               this.O0000000000OO();
               return;
            }
         }
      }
   }

   private void O0000000000O0() {
      double var1 = 6.0E-4F;
      Entity var3 = null;
      double var4 = Double.MAX_VALUE;
      double var6 = 0.2F;

      for (Entity var9 : O0000000000.world.getEntities()) {
         if (var9 != O0000000000.player && var9 instanceof PlayerEntity && var9 == AttackAura.O00000000OO0) {
            double var10 = var9.getX() - O0000000000.player.getX();
            double var12 = var9.getZ() - O0000000000.player.getZ();
            double var14 = var10 * var10 + var12 * var12;
            if (var14 <= var6 && var14 < var4) {
               var4 = var14;
               var3 = var9;
            }
         }
      }

      if (var3 != null) {
         double[] var16 = this.O00000000(O0000000000.player.getPos(), var3.getPos(), var1);
         O0000000000.player.addVelocity(var16[0], 0.0, var16[1]);
         O0000000000.player.velocityModified = true;
      }
   }

   private void O0000000000O00() {
      Entity var1 = null;
      double var2 = Double.MAX_VALUE;
      double var4 = 2.25;

      for (Entity var7 : O0000000000.world.getEntities()) {
         if (var7 != O0000000000.player && var7 instanceof PlayerEntity) {
            double var8 = var7.getX() - O0000000000.player.getX();
            double var10 = var7.getZ() - O0000000000.player.getZ();
            double var12 = var8 * var8 + var10 * var10;
            if (var12 <= var4 && var12 < var2) {
               var2 = var12;
               var1 = var7;
            }
         }
      }

      if (var1 != null && !O0000000000.player.isOnGround()) {
         this.O0000000000OO();
      }
   }

   private void O0000000000O0O() {
      LivingEntity var1 = AttackAura.O00000000OO0;
      if (var1 != null && !O0000000000.player.isOnGround()) {
         Entity var2 = null;
         double var3 = Double.MAX_VALUE;
         double var5 = 2.25;

         for (Entity var8 : O0000000000.world.getEntities()) {
            if (var8 != O0000000000.player && var8 instanceof PlayerEntity) {
               double var9 = var8.getX() - O0000000000.player.getX();
               double var11 = var8.getZ() - O0000000000.player.getZ();
               double var13 = var9 * var9 + var11 * var11;
               if (var13 <= var5 && var13 < var3) {
                  var3 = var13;
                  var2 = var8;
               }
            }
         }

         Vec3d var33 = O0000000000.player.getVelocity();
         double var34 = Math.sqrt(var33.x * var33.x + var33.z * var33.z);
         if (var2 != null) {
            double var10 = 1.0 + O000000000O00.O0000000000() / 10.0;
            var34 *= var10;
         }

         double var35 = O000000000O0.O0000000000() / 20.0;
         if (var34 > var35) {
            var34 = var35;
         }

         if (var34 < 0.15) {
            var34 = 0.15;
         }

         double var12 = O000000000O000.O0000000000();
         double var14 = O0000000000.player.distanceTo(var1);
         double var16 = 0.0;
         double var18 = O000000000O00O;
         if (var14 > var12 + 0.5) {
            var16 = 1.0;
         } else if (var14 < var12 - 0.5) {
            var16 = -1.0;
         }

         double var20 = var1.getX() - O0000000000.player.getX();
         double var22 = var1.getZ() - O0000000000.player.getZ();
         float var24 = (float)(Math.toDegrees(Math.atan2(var22, var20)) - 90.0);
         if (var16 != 0.0) {
            if (var18 > 0.0) {
               var24 += var16 > 0.0 ? -45 : 45;
            } else if (var18 < 0.0) {
               var24 += var16 > 0.0 ? 45 : -45;
            }

            var18 = 0.0;
            var16 = var16 > 0.0 ? 1.0 : -1.0;
         }

         double var25 = Math.sin(Math.toRadians(var24 + 90.0F));
         double var27 = Math.cos(Math.toRadians(var24 + 90.0F));
         double var29 = var16 * var34 * var27 + var18 * var34 * var25;
         double var31 = var16 * var34 * var25 - var18 * var34 * var27;
         O0000000000.player.setVelocity(var29, var33.y, var31);
         O0000000000.player.velocityModified = true;
      }
   }

   private void O0000000000OO() {
      Vec3d var1 = O0000000000.player.getVelocity();
      double var2 = 1.0 + O000000000O00.O0000000000() / 10.0;
      double var4 = O000000000O0.O0000000000() / 20.0;
      double var6 = var1.x;
      double var8 = var1.z;
      double var10 = var6 * var2;
      double var12 = var8 * var2;
      double var14 = Math.sqrt(var10 * var10 + var12 * var12);
      if (var14 > var4) {
         double var16 = var4 / var14;
         var10 *= var16;
         var12 *= var16;
      }

      double var20 = var10 - var6;
      double var18 = var12 - var8;
      O0000000000.player.addVelocity(var20, 0.0, var18);
      O0000000000.player.velocityModified = true;
   }

   private double[] O00000000(Vec3d vec3d, Vec3d vec3d2, double d) {
      double var5 = vec3d2.x - vec3d.x;
      double var7 = vec3d2.z - vec3d.z;
      double var9 = Math.sqrt(var5 * var5 + var7 * var7);
      return var9 == 0.0 ? new double[]{0.0, 0.0} : new double[]{var5 / var9 * d, var7 / var9 * d};
   }
}

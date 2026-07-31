package ru.metaculture.protection;

import java.util.Comparator;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoMace",
   O000000000 = "Автоматический идеальный удар булавой на падении",
   O0000000000 = Category.Combat
)
public class AutoMace extends Module {
   private final NumberSetting O000000000O = new NumberSetting("Дистанция", 4.2F, 2.8F, 6.0F, 0.1F, false);
   private final NumberSetting O000000000O0 = new NumberSetting("Мин. падение", 3.0F, 1.5F, 24.0F, 0.5F, false);
   private final NumberSetting O000000000O00 = new NumberSetting("Точка удара", 1.15F, 0.25F, 3.0F, 0.05F, false);
   private final NumberSetting O000000000O000 = new NumberSetting("Кулдаун", 92.0F, 70.0F, 100.0F, 1.0F, false);
   private final BooleanSetting O000000000O00O = new BooleanSetting("Только игроки", false);
   private final BooleanSetting O000000000O0O = new BooleanSetting("Только булава", true);
   private long O000000000O0O0;

   public AutoMace() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00, this.O000000000O000, this.O000000000O00O, this.O000000000O0O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null) {
         if (!this.O000000000O0O.O0000000000() || O0000000000.player.getMainHandStack().isOf(Items.MACE)) {
            if (!O0000000000.player.isOnGround()
               && !(O0000000000.player.getVelocity().y >= -0.08)
               && !(O0000000000.player.fallDistance < this.O000000000O0.O0000000000())) {
               if (!(O0000000000.player.getAttackCooldownProgress(0.0F) * 100.0F < this.O000000000O000.O0000000000())) {
                  AutoMace.W27 var2 = this.O0000000000O00();
                  if (var2 != null && !(var2.heightToGround > this.O000000000O00.O0000000000()) && var2.ticksToGround <= 4) {
                     LivingEntity var3 = this.O0000000000O0();
                     if (var3 != null && this.O000000000(var3)) {
                        long var4 = System.currentTimeMillis();
                        if (var4 - this.O000000000O0O0 >= 250L) {
                           O0000000000.interactionManager.attackEntity(O0000000000.player, var3);
                           O0000000000.player.swingHand(Hand.MAIN_HAND);
                           this.O000000000O0O0 = var4;
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private LivingEntity O0000000000O0() {
      double var1 = this.O000000000O.O0000000000();
      Box var3 = O0000000000.player.getBoundingBox().expand(var1);
      return O0000000000.world
         .getEntitiesByClass(LivingEntity.class, var3, this::O00000000)
         .stream()
         .min(Comparator.comparingDouble(livingEntity -> O0000000000.player.squaredDistanceTo(livingEntity)))
         .orElse(null);
   }

   private boolean O00000000(LivingEntity livingEntity) {
      if (livingEntity == O0000000000.player || !livingEntity.isAlive() || livingEntity.isSpectator() || livingEntity instanceof ArmorStandEntity) {
         return false;
      } else if (this.O000000000O00O.O0000000000() && !(livingEntity instanceof PlayerEntity)) {
         return false;
      } else {
         double var2 = this.O000000000O.O0000000000();
         return O0000000000.player.squaredDistanceTo(livingEntity) <= var2 * var2;
      }
   }

   private boolean O000000000(LivingEntity livingEntity) {
      Vec3d var2 = O0000000000.player.getEyePos();
      Vec3d var3 = livingEntity.getBoundingBox().getCenter();
      BlockHitResult var4 = O0000000000.world.raycast(new RaycastContext(var2, var3, ShapeType.COLLIDER, FluidHandling.NONE, O0000000000.player));
      return var4.getType() == Type.MISS;
   }

   private AutoMace.W27 O0000000000O00() {
      Vec3d var1 = O0000000000.player.getPos();
      Vec3d var2 = O0000000000.player.getVelocity();
      double var3 = var1.y;

      for (int var5 = 0; var5 < 20; var5++) {
         double var6 = var3 + var2.y;
         Vec3d var8 = new Vec3d(var1.x, var3, var1.z);
         Vec3d var9 = new Vec3d(var1.x, var6, var1.z);
         BlockHitResult var10 = O0000000000.world.raycast(new RaycastContext(var8, var9, ShapeType.COLLIDER, FluidHandling.NONE, O0000000000.player));
         if (var10.getType() == Type.BLOCK) {
            double var11 = Math.max(0.0, O0000000000.player.getY() - var10.getPos().y);
            return new AutoMace.W27(var5 + 1, var11);
         }

         var3 = var6;
         var2 = var2.multiply(0.98, 0.98, 0.98).subtract(0.0, 0.08, 0.0);
      }

      Vec3d var13 = O0000000000.player.getPos();
      Vec3d var14 = var13.subtract(0.0, 32.0, 0.0);
      BlockHitResult var7 = O0000000000.world.raycast(new RaycastContext(var13, var14, ShapeType.COLLIDER, FluidHandling.NONE, O0000000000.player));
      return var7.getType() != Type.BLOCK ? null : new AutoMace.W27(20, Math.max(0.0, O0000000000.player.getY() - var7.getPos().y));
   }

   record W27(int ticksToGround, double heightToGround) {
   }
}

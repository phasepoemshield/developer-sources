package moscow.rockstar.module.movement;

import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.util.game.EntityUtility;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
@ModuleInfo(name = "Speed", category = ModuleCategory.MOVEMENT, desc = "Увеличение скорости передвижения")
public class Speed extends BaseModule {
   private final ModeSetting mode = new ModeSetting(this, "Режим");
   private final ModeSetting.Value entities = new ModeSetting.Value(this.mode, "Сущности").select();
   private final SliderSetting speed = new SliderSetting(this, "Скорость")
      .min(1.0F)
      .max(20.0F)
      .step(0.1F)
      .currentValue(8.0F);
   private final SliderSetting range = new SliderSetting(this, "Дистанция")
      .min(0.5F)
      .max(10.0F)
      .step(0.1F)
      .currentValue(3.0F);
   private final SliderSetting expand = new SliderSetting(this, "Расширение")
      .min(0.1F)
      .max(2.0F)
      .step(0.1F)
      .currentValue(0.5F);
   private final BooleanSetting onlyPlayers = new BooleanSetting(this, "Только игроки").enabled(true);
   private final BooleanSetting requireMoving = new BooleanSetting(this, "Требовать движение").enabled(true);

   @Override
   public void tick() {
      if (mc.player == null || mc.world == null) {
         super.tick();
         return;
      }

      if (this.entities.isSelected()) {
         this.updateEntitySpeed();
      }

      super.tick();
   }

   private void updateEntitySpeed() {
      int collisions = this.countCollisions();
      if (collisions <= 0 || this.requireMoving.isEnabled() && !EntityUtility.isPlayerMoving()) {
         return;
      }

      double finalSpeed = this.speed.getCurrentValue() * 0.01 * collisions;
      if (finalSpeed <= 0.0) {
         return;
      }

      Entity nearest = this.findNearestEntity();
      if (nearest == null) {
         return;
      }

      Vec3d direction = this.getDirectionToPoint(mc.player.getPos(), nearest.getPos(), finalSpeed);
      mc.player.addVelocity(direction.x, 0.0, direction.z);
   }

   private int countCollisions() {
      int collisions = 0;
      Box expandedBox = mc.player.getBoundingBox().expand(this.expand.getCurrentValue());

      for (Entity entity : mc.world.getEntities()) {
         if (this.isValidEntity(entity) && expandedBox.intersects(entity.getBoundingBox())) {
            collisions++;
         }
      }

      return collisions;
   }

   private Entity findNearestEntity() {
      Entity nearest = null;
      double bestSq = Double.MAX_VALUE;
      double maxRangeSq = this.range.getCurrentValue() * this.range.getCurrentValue();

      for (Entity entity : mc.world.getEntities()) {
         if (!this.isValidEntity(entity)) {
            continue;
         }

         double dx = entity.getX() - mc.player.getX();
         double dz = entity.getZ() - mc.player.getZ();
         double distanceSq = dx * dx + dz * dz;
         if (distanceSq <= maxRangeSq && distanceSq < bestSq) {
            bestSq = distanceSq;
            nearest = entity;
         }
      }

      return nearest;
   }

   private boolean isValidEntity(Entity entity) {
      if (entity == mc.player || this.onlyPlayers.isEnabled() && !(entity instanceof PlayerEntity)) {
         return false;
      }

      return entity instanceof LivingEntity || entity instanceof BoatEntity;
   }

   private Vec3d getDirectionToPoint(Vec3d from, Vec3d to, double speed) {
      double dx = to.x - from.x;
      double dz = to.z - from.z;
      double length = Math.sqrt(dx * dx + dz * dz);
      if (length == 0.0) {
         return Vec3d.ZERO;
      }

      return new Vec3d(dx / length * speed, 0.0, dz / length * speed);
   }
}

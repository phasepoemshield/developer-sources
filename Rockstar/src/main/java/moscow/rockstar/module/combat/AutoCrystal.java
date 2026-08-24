package moscow.rockstar.module.combat;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.network.ReceivePacketEvent;
import moscow.rockstar.systems.event.impl.network.SendPacketEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.util.rotations.MoveCorrection;
import moscow.rockstar.util.rotations.Rotation;
import moscow.rockstar.util.rotations.RotationMath;
import moscow.rockstar.util.rotations.RotationPriority;
import moscow.rockstar.util.time.Timer;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ExperienceOrbEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.Difficulty;
import net.minecraft.world.RaycastContext;
import org.jetbrains.annotations.Nullable;

@ModuleInfo(name = "Auto Crystal", category = ModuleCategory.COMBAT, desc = "Автоматическая установка и подрыв кристаллов Эндера")
public class AutoCrystal extends BaseModule {
   private final BooleanSetting place = new BooleanSetting(this, "Установка кристаллов").enable();
   private final Map<Integer, Long> attackedCrystals = new ConcurrentHashMap<>();
   private final Map<BlockPos, Long> placedPositions = new ConcurrentHashMap<>();
   private final Timer breakCooldown = new Timer();
   private final Timer placeCooldown = new Timer();
   private boolean breakQueued;
   @Nullable
   private BlockPos placePos;
   private int syncedSlot = Integer.MIN_VALUE;
   private final EventListener<SendPacketEvent> onSendPacket = event -> {
      if (event.getPacket() instanceof UpdateSelectedSlotC2SPacket packet) {
         this.syncedSlot = packet.getSelectedSlot();
      }
   };
   private final EventListener<ReceivePacketEvent> onReceivePacket = event -> {
      Packet<?> packet = event.getPacket();
      if (packet instanceof EntitySpawnS2CPacket spawnPacket && spawnPacket.getEntityType().equals(EntityType.END_CRYSTAL)) {
         this.tryBreakCrystal();
      }
   };
   private final EventListener<ClientPlayerTickEvent> onTick = event -> {
      if (mc.player == null || mc.world == null) {
         return;
      }

      this.pruneMaps();
      if (this.place.isEnabled()) {
         this.placePos = this.findPlacePos();
         if (this.placePos != null) {
            this.placeCrystal(false);
         }
      }

      this.tryBreakCrystal();
   };

   @Override
   public void onEnable() {
      this.syncedSlot = mc.player != null ? mc.player.getInventory().selectedSlot : Integer.MIN_VALUE;
   }

   @Override
   public void onDisable() {
      this.attackedCrystals.clear();
      this.placedPositions.clear();
      this.placePos = null;
      this.breakQueued = false;
      this.syncedSlot = Integer.MIN_VALUE;
   }

   private void pruneMaps() {
      long now = System.currentTimeMillis();
      prune(this.attackedCrystals, now);
      prune(this.placedPositions, now);
   }

   private static void prune(Map<?, Long> map, long now) {
      Iterator<? extends Map.Entry<?, Long>> iterator = map.entrySet().iterator();
      while (iterator.hasNext()) {
         Map.Entry<?, Long> entry = iterator.next();
         if (now - entry.getValue() > 1500L) {
            iterator.remove();
         }
      }
   }

   private boolean canBreakPlaced(BlockPos pos) {
      long now = System.currentTimeMillis();
      BlockPos immutable = pos.toImmutable();
      for (Map.Entry<BlockPos, Long> entry : this.placedPositions.entrySet()) {
         if (now - entry.getValue() > 1500L) {
            continue;
         }

         BlockPos placed = entry.getKey();
         if (placed.equals(immutable)) {
            return true;
         }

         if (Math.abs(placed.getX() - immutable.getX()) <= 1
            && Math.abs(placed.getZ() - immutable.getZ()) <= 1
            && Math.abs(placed.getY() - immutable.getY()) <= 1) {
            return true;
         }
      }

      return false;
   }

   private void tryBreakCrystal() {
      EndCrystalEntity crystal = this.findBreakTarget();
      if (crystal == null) {
         return;
      }

      if (!this.breakCooldown.finished(45L) || this.breakQueued) {
         if (this.breakQueued) {
            this.breakQueued = false;
         }

         return;
      }

      if (!crystal.isAlive() || this.attackedCrystals.containsKey(crystal.getId())) {
         return;
      }

      Vec3d aim = crystal.getPos().add(0.0, 1.0, 0.0);
      if (mc.player.getEyePos().squaredDistanceTo(aim) > 20.25) {
         return;
      }

      if (!this.canSee(crystal.getPos())) {
         return;
      }

      if (!this.isValidBreakTarget(crystal)) {
         return;
      }

      this.rotateTo(aim);
      this.breakCrystal(crystal);
   }

   private void breakCrystal(EndCrystalEntity crystal) {
      mc.interactionManager.attackEntity(mc.player, crystal);
      mc.player.swingHand(Hand.MAIN_HAND);
      this.attackedCrystals.put(crystal.getId(), System.currentTimeMillis());
      this.breakCooldown.reset();
   }

   private void placeCrystal(boolean fromQueue) {
      if (this.placePos == null) {
         return;
      }

      int crystalSlot = this.findCrystalSlot();
      int previousSlot = mc.player.getInventory().selectedSlot;
      boolean holdingCrystal = mc.player.getMainHandStack().isOf(Items.END_CRYSTAL) || mc.player.getOffHandStack().isOf(Items.END_CRYSTAL);
      if (crystalSlot == -1 && !holdingCrystal) {
         return;
      }

      BlockPos basePos = this.placePos;
      Vec3d hitPos = new Vec3d(basePos.getX() + 0.5, basePos.getY() + 1.0, basePos.getZ() + 0.5);
      if (mc.player.getEyePos().distanceTo(hitPos) > 4.5 || !this.canSee(hitPos)) {
         return;
      }

      if (!mc.world.getBlockState(basePos).isOf(Blocks.OBSIDIAN) && !mc.world.getBlockState(basePos).isOf(Blocks.BEDROCK)) {
         return;
      }

      BlockPos above = basePos.up();
      if (!mc.world.getBlockState(above).isAir()) {
         return;
      }

      Box box = new Box(above);
      for (Entity blocking : mc.world.getOtherEntities(null, box)) {
         if (blocking.isAlive() && !(blocking instanceof ExperienceOrbEntity) && !(blocking instanceof EndCrystalEntity)) {
            return;
         }
      }

      if (this.hasFriendNearby(basePos) || !this.canPlace(basePos) || !this.isSafeDamage(hitPos)) {
         return;
      }

      if (!this.placeCooldown.finished(1L)) {
         return;
      }

      this.rotateTo(hitPos);
      boolean switched = false;
      if (!holdingCrystal) {
         mc.player.getInventory().selectedSlot = crystalSlot;
         this.sendSelectedSlot(crystalSlot);
         switched = true;
      }

      Hand hand = mc.player.getOffHandStack().isOf(Items.END_CRYSTAL) ? Hand.OFF_HAND : Hand.MAIN_HAND;
      BlockHitResult hitResult = new BlockHitResult(hitPos, Direction.UP, basePos, false);
      mc.interactionManager.interactBlock(mc.player, hand, hitResult);
      mc.player.swingHand(Hand.MAIN_HAND);
      this.placedPositions.put(basePos.toImmutable(), System.currentTimeMillis());
      this.placeCooldown.reset();
      if (switched) {
         mc.player.getInventory().selectedSlot = previousSlot;
         this.sendSelectedSlot(previousSlot);
      }

      if (fromQueue) {
         this.breakQueued = false;
      }
   }

   private void sendSelectedSlot(int slot) {
      if (mc.getNetworkHandler() == null || slot < 0 || slot > 8 || slot == this.syncedSlot) {
         return;
      }

      mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(slot));
   }

   private void rotateTo(Vec3d target) {
      Rotation rotation = RotationMath.getRotationTo(target);
      Rockstar.getInstance()
         .getRotationHandler()
         .rotate(rotation, MoveCorrection.SILENT, 180.0F, 180.0F, 180.0F, RotationPriority.MAX);
   }

   private boolean isSafeDamage(Vec3d crystalPos) {
      LivingEntity auraTarget = Rockstar.getInstance().getTargetManager().getLivingTarget();
      if (auraTarget != null && auraTarget.isAlive() && auraTarget != mc.player) {
         if (auraTarget instanceof PlayerEntity player && Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            return this.getMaxDamage(crystalPos) >= 2.0F;
         }

         return this.getTargetDamage(crystalPos, auraTarget) >= 2.0F;
      }

      return this.getMaxDamage(crystalPos) >= 2.0F;
   }

   private float getMaxDamage(Vec3d crystalPos) {
      float max = 0.0F;
      for (PlayerEntity player : mc.world.getPlayers()) {
         if (player == mc.player || !player.isAlive() || Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            continue;
         }

         max = Math.max(max, this.getTargetDamage(crystalPos, player));
      }

      return max;
   }

   private float getTargetDamage(Vec3d crystalPos, LivingEntity target) {
      Vec3d center = target.getBoundingBox().getCenter();
      double distance = center.distanceTo(crystalPos);
      if (distance > 6.0) {
         return 0.0F;
      }

      double exposure = this.hasLineOfSight(crystalPos, center) ? 1.0 : 0.35;
      double attenuation = (1.0 - distance / 6.0) * exposure;
      float damage = (float)((attenuation * attenuation + attenuation) / 2.0 * 7.0 * 12.0 + 1.0);
      Difficulty difficulty = mc.world.getDifficulty();
      damage *= switch (difficulty) {
         case PEACEFUL -> 0.0F;
         case EASY -> 0.5F;
         case HARD -> 1.5F;
         default -> 1.0F;
      };
      float armor = target.getArmor();
      return Math.max(0.0F, damage * (1.0F - Math.min(armor / (armor + 20.0F), 0.8F)));
   }

   private boolean hasLineOfSight(Vec3d from, Vec3d to) {
      return mc.world.raycast(new RaycastContext(from, to, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mc.player)).getType()
         == HitResult.Type.MISS;
   }

   @Nullable
   private EndCrystalEntity findBreakTarget() {
      EndCrystalEntity best = null;
      double bestDistance = Double.MAX_VALUE;
      for (Entity entity : mc.world.getEntities()) {
         if (!(entity instanceof EndCrystalEntity crystal) || !crystal.isAlive() || this.attackedCrystals.containsKey(entity.getId())) {
            continue;
         }

         if (!this.isValidBreakTarget(crystal)) {
            continue;
         }

         Vec3d aim = crystal.getPos().add(0.0, 1.0, 0.0);
         double distance = mc.player.getEyePos().squaredDistanceTo(aim);
         if (distance > 20.25 || !this.canSee(crystal.getPos()) || distance >= bestDistance) {
            continue;
         }

         bestDistance = distance;
         best = crystal;
      }

      return best;
   }

   @Nullable
   private BlockPos findPlacePos() {
      int crystalSlot = this.findCrystalSlot();
      boolean holdingCrystal = mc.player.getMainHandStack().isOf(Items.END_CRYSTAL) || mc.player.getOffHandStack().isOf(Items.END_CRYSTAL);
      if (crystalSlot == -1 && !holdingCrystal) {
         return null;
      }

      BlockPos origin = mc.player.getBlockPos();
      int radius = (int)Math.ceil(4.5);
      float bestDamage = -1.0F;
      double bestDistance = Double.MAX_VALUE;
      BlockPos bestPos = null;
      for (int x = -radius; x <= radius; x++) {
         for (int y = -4; y <= 2; y++) {
            for (int z = -radius; z <= radius; z++) {
               BlockPos base = origin.add(x, y, z);
               Vec3d hitPos = new Vec3d(base.getX() + 0.5, base.getY() + 1.0, base.getZ() + 0.5);
               if (mc.player.getEyePos().distanceTo(hitPos) > 4.5
                  || !this.canSee(hitPos)
                  || !mc.world.getBlockState(base).isOf(Blocks.OBSIDIAN) && !mc.world.getBlockState(base).isOf(Blocks.BEDROCK)
                  || !mc.world.getBlockState(base.up()).isAir()) {
                  continue;
               }

               Box box = new Box(base.up());
               boolean blocked = false;
               for (Entity entity : mc.world.getOtherEntities(null, box)) {
                  if (entity.isAlive() && !(entity instanceof ExperienceOrbEntity) && !(entity instanceof EndCrystalEntity)) {
                     blocked = true;
                     break;
                  }
               }

               if (blocked || this.hasFriendNearby(base) || !this.canPlace(base) || !this.isSafeDamage(hitPos)) {
                  continue;
               }

               float damage = this.getMaxDamage(hitPos);
               double distance = mc.player.squaredDistanceTo(Vec3d.ofCenter(base));
               if (damage > bestDamage || damage == bestDamage && distance < bestDistance) {
                  bestDamage = damage;
                  bestDistance = distance;
                  bestPos = base.toImmutable();
               }
            }
         }
      }

      return bestPos;
   }

   private boolean isValidBreakTarget(EndCrystalEntity crystal) {
      if (crystal == null || !crystal.isAlive()) {
         return false;
      }

      if (mc.player.distanceTo(crystal) > 4.5F) {
         return false;
      }

      if (crystal.getY() - mc.player.getY() < 0.5) {
         return false;
      }

      return !this.hasFriendNearCrystal(crystal);
   }

   private boolean canPlace(BlockPos pos) {
      return pos.getY() + 1.0 - mc.player.getY() >= 0.5;
   }

   private boolean hasFriendNearby(BlockPos pos) {
      Vec3d center = Vec3d.ofCenter(pos.up());
      Box box = new Box(center, center).expand(6.0);
      for (PlayerEntity player : mc.world.getEntitiesByClass(PlayerEntity.class, box, entity -> true)) {
         if (player.isAlive() && Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            return true;
         }
      }

      return false;
   }

   private boolean hasFriendNearCrystal(EndCrystalEntity crystal) {
      Box box = crystal.getBoundingBox().expand(6.0);
      for (PlayerEntity player : mc.world.getEntitiesByClass(PlayerEntity.class, box, entity -> true)) {
         if (player.isAlive() && Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            return true;
         }
      }

      return false;
   }

   private boolean canSee(Vec3d target) {
      Vec3d eyes = mc.player.getEyePos();
      BlockHitResult hit = mc.world.raycast(new RaycastContext(eyes, target, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mc.player));
      return hit.getType() == HitResult.Type.MISS;
   }

   private int findCrystalSlot() {
      for (int i = 0; i < 9; i++) {
         if (mc.player.getInventory().getStack(i).isOf(Items.END_CRYSTAL)) {
            return i;
         }
      }

      return -1;
   }
}

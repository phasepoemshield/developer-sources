package oxxxde

import com.mojang.authlib.GameProfile
import java.util.UUID
import kotakbaz.rain.mixin.LivingEntityInvoker
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.network.OtherClientPlayerEntity
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.Entity.RemovalReason
import net.minecraft.entity.attribute.EntityAttributes
import net.minecraft.entity.damage.DamageSource
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.entity.effect.StatusEffects
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
import net.minecraft.registry.entry.RegistryEntry
import net.minecraft.sound.SoundCategory
import net.minecraft.sound.SoundEvent
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Hand
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult.Type
import net.minecraft.util.math.Box
import net.minecraft.util.math.Vec3d
import net.minecraft.world.RaycastContext
import net.minecraft.world.RaycastContext.FluidHandling
import net.minecraft.world.RaycastContext.ShapeType
import ru.ocz.protection.annotation.Compile
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object اإ : دِ("FakePlayer", ظن.getPLAYER(), "Создание вашей визуальной копии") {
   @JvmStatic
   private OtherClientPlayerEntity fakePlayer;
   private const val LOW_COOLDOWN_DAMAGE: Float = 1.0F
   private final var deathTime: Int
   @JvmStatic
   private ClientWorld fakeWorld;
   @JvmStatic
   private Vec3d lastPlayerPos;
   private const val TELEPORT_DISABLE_DISTANCE_SQUARED: Double = 144.0
   private const val FAKE_ENTITY_ID: Int = -20481
   private final val fakeName: عت = دِ.text$default(اإ.INSTANCE, "Никнейм", "Бровик", 32, null, 8, null)
   private const val TELEPORT_DISABLE_DISTANCE: Double = 12.0
   private final val PROFILE_UUID: UUID
   private const val CRYSTAL_EXPLOSION_POWER: Double = 6.0
   private const val DEATH_DISABLE_TICKS: Int = 10
   private const val TOTEM_HEALTH: Float = 10.0F
   private final val copyInventory: خذ = دِ.boolean$default(اإ.INSTANCE, "Копия инвентаря", false, null, 4, null)
   @JvmStatic
   private ClientWorld lastPlayerWorld;

   private fun spawnFakePlayer() {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         val var7: ClientWorld = ضك.getMc().world
         if (var7 != null) {
            this.removeFakePlayer()
            val fake: OtherClientPlayerEntity = OtherClientPlayerEntity(var7, GameProfile(PROFILE_UUID, this.configuredName()))
            fake.setId(-20481)
            fake.copyPositionAndRotation(var10000 as Entity)
            طث.setYaw(fake as Entity, طث.getYaw(var10000 as Entity))
            طث.setPitch(fake as Entity, طث.getPitch(var10000 as Entity))
            طث.setHeadYaw(fake as LivingEntity, طث.getHeadYaw(var10000 as LivingEntity))
            طث.setBodyYaw(fake as LivingEntity, طث.getBodyYaw(var10000 as LivingEntity))
            fake.setVelocity(Vec3d.ZERO)
            fake.setOnGround(var10000.isOnGround())
            fake.setPose(var10000.getPose())
            (fake as LivingEntity).setSneaking(var10000.isSneaking())
            fake.setSprinting(var10000.isSprinting())
            fake.setSwimming(var10000.isSwimming())
            fake.setInvisible(false)
            fake.setHealth(fake.getMaxHealth())
            fake.hurtTime = 0
            fake.deathTime = 0
            if (copyInventory.getValue()) {
               this.copyInventory(fake, var10000)
            }

            fake.setStackInHand(Hand.OFF_HAND, ItemStack(Items.TOTEM_OF_UNDYING as ItemConvertible))
            var7.addEntity(fake as Entity)
            this.applyBuffs(fake)
            fakeWorld = var7
            fakePlayer = fake
            deathTime = 0
         }
      }
   }

   fun handleExplosion(packet: ExplosionS2CPacket) {
      if (this.isEnabled()) {
         if (fakePlayer != null) {
            val fake: OtherClientPlayerEntity = fakePlayer
            val var10000: ClientWorld = ضك.getMc().world
            if (var10000 != null) {
               if (fake.hurtTime == 0) {
                  val var10001: Vec3d = packet.center()
                  val damage: Float = this.estimateExplosionDamage(var10001, fake)
                  if (!(damage <= 0.0F)) {
                     val var10003: DamageSource = var10000.getDamageSources().generic()
                     this.applySimulatedDamage(fake, damage, var10003)
                  }
               }
            }
         }
      }
   }

   fun playAttackFeedback(cooldown: ClientWorld, world: ClientPlayerEntity, player: Float) {
      world.playSoundFromEntityClient(player as Entity, this.attackSound(player, cooldown), SoundCategory.PLAYERS, 1.0F, 1.0F)
   }

   @JvmStatic
   fun {
      val var10000: UUID = UUID.fromString("66123666-6666-6666-6666-666666666600")
      PROFILE_UUID = var10000
      val var0: Vec3d = Vec3d.ZERO
      lastPlayerPos = var0
   }

   fun calculateExposure(center: Vec3d, fake: OtherClientPlayerEntity): Double {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 == null) {
         0.0
      } else {
         val world: ClientWorld = var10000
         val var13: Box = fake.getBoundingBox()
         val box: Box = var13
         val steps: Int = 3
         var clearRays: Int = 0
         var totalRays: Int = 0

         repeat(steps) { xIndex ->
            repeat(steps) { yIndex ->
               repeat(steps) { zIndex ->
                  val var14: BlockHitResult = world.raycast(
                     RaycastContext(
                        Vec3d(
                           this.lerpBox(box.minX, box.maxX, xIndex, steps),
                           this.lerpBox(box.minY, box.maxY, yIndex, steps),
                           this.lerpBox(box.minZ, box.maxZ, zIndex, steps)
                        ),
                        center,
                        ShapeType.COLLIDER,
                        FluidHandling.NONE,
                        fake as Entity
                     )
                  )
                  if (var14.getType() === Type.MISS) {
                     clearRays++
                  }

                  totalRays++
               }
            }
         }

         if (totalRays == 0) 0.0 else (double)clearRays / totalRays
      }
   }

   fun attackSound(player: ClientPlayerEntity, cooldown: Float): SoundEvent {
      val var10000: SoundEvent
      if (this.shouldPlayCriticalSound(player)) {
         var10000 = SoundEvents.ENTITY_PLAYER_ATTACK_CRIT
      } else if (player.isSprinting() && cooldown >= 0.9F) {
         var10000 = SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK
      } else if (cooldown >= 0.9F) {
         var10000 = SoundEvents.ENTITY_PLAYER_ATTACK_STRONG
      } else {
         var10000 = SoundEvents.ENTITY_PLAYER_ATTACK_WEAK
      }

      var10000
   }

   fun handleAttack(target: Entity): Boolean {
      if (!this.isEnabled()) {
         false
      } else if (fakePlayer == null) {
         false
      } else {
         val fake: OtherClientPlayerEntity = fakePlayer
         if (target.getId() != fake.getId()) {
            false
         } else if (fake.hurtTime != 0) {
            true
         } else {
            val var10000: ClientWorld = ضك.getMc().world
            if (var10000 == null) {
               true
            } else {
               val var8: ClientPlayerEntity = ضك.getMc().player
               if (var8 == null) {
                  true
               } else {
                  val cooldown: Float = var8.getAttackCooldownProgress(0.5F)
                  this.playAttackFeedback(var10000, var8, cooldown)
                  val var9: DamageSource = var8.getDamageSources().playerAttack(var8 as PlayerEntity)
                  this.applySimulatedDamage(fake, if (cooldown >= 0.85F) this.calculateMeleeDamage(var8, fake, cooldown) else 1.0F, var9)
                  var8.resetTicksSince()
                  رظ.INSTANCE.post(ذم(fake as Entity))
                  true
               }
            }
         }
      }
   }

   fun applyLocalHurtFeedback(fake: OtherClientPlayerEntity, damageSource: DamageSource) {
      fake.hurtTime = 10
      val var10001: ClientPlayerEntity = ضك.getMc().player
      fake.animateDamage(if (var10001 != null) طث.getYaw(var10001 as Entity) else طث.getYaw(fake as Entity))
      (fake as LivingEntityInvoker).rain$playHurtSound(damageSource)
   }

   public override fun onDisable() {
      this.removeFakePlayer()
      deathTime = 0
      lastPlayerWorld = null
      val var10000: Vec3d = Vec3d.ZERO
      lastPlayerPos = var10000
   }

   public override fun onEnable() {
      var var1: Vec3d
      run label15@{
         lastPlayerWorld = ضك.getMc().world
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            var1 = طث.getPos(var10000 as Entity)
            if (var1 != null) {
               return@label15
            }
         }

         var1 = Vec3d.ZERO
      }

      lastPlayerPos = var1
      this.spawnFakePlayer()
   }

   fun applySimulatedDamage(damage: OtherClientPlayerEntity, fake: Float, damageSource: DamageSource) {
      if (!(damage <= 0.0F)) {
         val remaining: Float = fake.getHealth() + fake.getAbsorptionAmount() - damage
         this.applyLocalHurtFeedback(fake, damageSource)
         if (remaining > 0.0F) {
            fake.setHealth(remaining)
         } else {
            if (fake.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
               fake.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY)
               fake.setHealth(10.0F)
               val var10000: ClientWorld = ضك.getMc().world
               if (var10000 != null) {
                  var10000.playSoundFromEntityClient(fake as Entity, SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1.0F, 1.0F)
               }

               رظ.INSTANCE.post(رك(fake as PlayerEntity))
            } else {
               fake.setHealth(0.0F)
               fake.deathTime = 1
            }
         }
      }
   }

   fun shouldPlayCriticalSound(player: ClientPlayerEntity): Boolean {
      if (player.fallDistance > 0.0
         && !player.isOnGround()
         && !طث.isClimbing(player as LivingEntity)
         && !player.isTouchingWater()
         && !player.hasVehicle()
         && !player.isSprinting()) {
         val `$this$hasStatusEffect$iv`: LivingEntity = player as LivingEntity
         val var10000: RegistryEntry = StatusEffects.BLINDNESS
         if (!`$this$hasStatusEffect$iv`.hasStatusEffect(var10000)) {
            true
         }
      }

      false
   }

   fun copyInventory(fake: OtherClientPlayerEntity, player: ClientPlayerEntity) {
      fake.setStackInHand(Hand.MAIN_HAND, player.getMainHandStack().copy())
      fake.setStackInHand(Hand.OFF_HAND, player.getOffHandStack().copy())
      fake.getInventory().setStack(36, player.getInventory().getStack(36).copy())
      fake.getInventory().setStack(37, player.getInventory().getStack(37).copy())
      fake.getInventory().setStack(38, player.getInventory().getStack(38).copy())
      fake.getInventory().setStack(39, player.getInventory().getStack(39).copy())
   }

   fun applyBuffs(fake: OtherClientPlayerEntity) {
      fake.addStatusEffect(StatusEffectInstance(StatusEffects.REGENERATION, 9999, 2))
      fake.addStatusEffect(StatusEffectInstance(StatusEffects.ABSORPTION, 9999, 4))
      fake.addStatusEffect(StatusEffectInstance(StatusEffects.RESISTANCE, 9999, 1))
   }

   fun calculateMeleeDamage(fake: ClientPlayerEntity, player: OtherClientPlayerEntity, cooldown: Float): Float {
      var var5: Float = (float)player.getAttributeValue(EntityAttributes.ATTACK_DAMAGE) * (0.2F + cooldown * cooldown * 0.8F)
      if (this.shouldPlayCriticalSound(player)) {
         var5 *= 1.5F
      }

      RangesKt.coerceAtLeast(var5, 0.0F)
   }

   fun estimateExplosionDamage(center: Vec3d, fake: OtherClientPlayerEntity): Float {
      if (ضك.getMc().world == null) {
         0.0F
      } else {
         val distance: Double = center.distanceTo(طث.getPos(fake as Entity))
         if (distance > 12.0) {
            0.0F
         } else {
            val exposure: Double = this.calculateExposure(center, fake)
            if (exposure <= 0.0) {
               0.0F
            } else {
               val impact: Double = RangesKt.coerceAtLeast(1.0 - distance / 12.0, 0.0) * exposure
               RangesKt.coerceAtLeast((float)((impact * impact + impact) / 2.0 * 7.0 * 12.0 + 1.0), 0.0F)
            }
         }
      }
   }

   @Commando
   @Compile
   public fun onUpdate(event: سح) {
      val var2: ClientWorld = ضك.getMc().world
      val var3: ClientPlayerEntity = ضك.getMc().player
      if (lastPlayerWorld != null && !(lastPlayerWorld == var2)) {
         this.setEnabled(false)
      } else if (طث.getPos(var3).squaredDistanceTo(lastPlayerPos) > 144.0) {
         this.setEnabled(false)
      } else {
         lastPlayerWorld = var2
         lastPlayerPos = طث.getPos(var3)
         var var5: OtherClientPlayerEntity = fakePlayer
         if (fakePlayer == null || fakePlayer.isRemoved() || !(var5.getEntityWorld() == var2)) {
            this.spawnFakePlayer()
         }

         var5 = fakePlayer
         if (fakePlayer != null) {
            if (!(fakePlayer.getOffHandStack().getItem() == Items.TOTEM_OF_UNDYING)) {
               var5.setStackInHand(Hand.OFF_HAND, ItemStack(Items.TOTEM_OF_UNDYING))
            }

            if (var5.isAlive() && !(var5.getHealth() <= 0.0F)) {
               deathTime = 0
            } else {
               deathTime++
               if (deathTime > 10) {
                  this.setEnabled(false)
               }
            }
         }
      }
   }

   private fun lerpBox(min: Double, max: Double, index: Int, steps: Int): Double {
      return if (steps <= 1) (min + max) * 0.5 else min + (max - min) * ((double)index / (steps - 1))
   }

   fun isFakePlayer(entity: Entity?): Boolean {
      if (fakePlayer == null) {
         false
      } else {
         val fake: OtherClientPlayerEntity = fakePlayer
         entity != null && entity.getId() == fake.getId()
      }
   }

   private fun removeFakePlayer() {
      if (fakePlayer != null) {
         val fake: OtherClientPlayerEntity = fakePlayer
         if (fakeWorld != null) {
            fakeWorld.removeEntity(fakePlayer.getId(), RemovalReason.DISCARDED)
         }

         fakePlayer.remove(RemovalReason.DISCARDED)
         fakePlayer = null
         fakeWorld = null
      }
   }

   private fun configuredName(): String {
      val var1: java.lang.String = StringsKt.trim(fakeName.getValue()).toString()
      var var10000: java.lang.String = if (var1.length() > 0) var1 else null
      if (var10000 == null) {
         var10000 = "Rain"
      }

      return var10000
   }
}

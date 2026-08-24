package oxxxde

import com.google.common.collect.Multimap
import com.mojang.authlib.GameProfile
import java.util.ArrayList
import net.minecraft.client.network.AbstractClientPlayerEntity
import net.minecraft.client.network.OtherClientPlayerEntity
import net.minecraft.client.render.entity.EntityRenderManager
import net.minecraft.client.render.entity.state.EntityRenderState
import net.minecraft.client.render.entity.state.LivingEntityRenderState
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.EntityPose
import net.minecraft.entity.LivingEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.scoreboard.Scoreboard
import net.minecraft.scoreboard.Team
import net.minecraft.scoreboard.AbstractTeam.VisibilityRule
import net.minecraft.util.math.Vec3d
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object جط : دِ("Souls", ظن.getRENDER(), "Вылет души игрока") {
   private const val HIDE_TEAM: String = "rain_soul_hidden"
   private final val souls: ArrayList<ح> = ArrayList()
   private final var lastHitAt: Long
   private const val DURATION_MS: Long = 1600L
   private const val GHOST_ALPHA_START: Float = 0.65F
   private const val LAST_HIT_WINDOW_MS: Long = 3000L
   @JvmStatic
   private PlayerEntity lastTarget;
   private final val onTotem: خذ = دِ.boolean$default(جط.INSTANCE, "При прожиме тотема", true, null, 4, null)
   private const val FADE_OUT_START: Float = 0.62F
   private const val LIGHT: Int = 15728880
   private const val FADE_OUT_END: Float = 0.94F
   private final val onDeath: خذ = دِ.boolean$default(جط.INSTANCE, "При смерти", true, null, 4, null)
   private const val RISE_HEIGHT: Float = 1.8F
   private const val SPIN_DEGREES: Float = 180.0F

   fun spawnSoul(target: PlayerEntity) {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         val now: Long = System.currentTimeMillis()
         val profile: GameProfile = this.createGhostProfile(target, "rain_soul_$now")
         val ghost: OtherClientPlayerEntity = OtherClientPlayerEntity(var10000, profile)
         val spawnPos: Vec3d = Vec3d(target.getX(), target.getY() + 0.1, target.getZ())
         val yaw: Float = طث.getYaw(target as Entity)
         val pitch: Float = طث.getPitch(target as Entity)
         ghost.copyPositionAndRotation(target as Entity)
         this.applyInitialGhostRotation(ghost, yaw, pitch)
         ghost.setVelocity(Vec3d.ZERO)
         ghost.setCustomName(null)
         ghost.setCustomNameVisible(false)
         ghost.setInvisible(false)
         val var10001: java.lang.String = profile.name()
         this.hideNameTag(var10001)
         souls.add(ح(spawnPos, now, ghost, yaw))
      }
   }

   public override fun onEnable() {
      souls.clear()
      lastTarget = null
      this.clearHideTeam()
      super.onEnable()
   }

   @Commando
   public fun onUpdate(event: سح) {
      val now: Long = System.currentTimeMillis()
      souls.removeIf({ p0: Any ->
         `$tmp0`(p0)
      })
      if (onDeath.getValue() && ضك.getMc().player != null && ضك.getMc().world != null) {
         if (lastTarget != null) {
            val target: PlayerEntity = lastTarget
            val dead: Boolean = !lastTarget.isAlive() || target.getHealth() <= 0.0F
            if (dead && now - lastHitAt <= 3000L) {
               this.spawnSoul(target)
               lastTarget = null
            } else if (dead) {
               lastTarget = null
            }
         }
      }
   }

   private fun soulAlpha(progress: Float): Float {
      return RangesKt.coerceIn(0.65F * (1.0F - this.smootherStep(RangesKt.coerceIn((progress - 0.62F) / 0.32F, 0.0F, 1.0F))), 0.0F, 0.65F)
   }

   private fun easeOutCubic(progress: Float): Float {
      return 1.0F - (1.0F - progress) * (1.0F - progress) * (1.0F - progress)
   }

   private fun smootherStep(progress: Float): Float {
      return progress * progress * progress * (progress * (progress * 6.0F - 15.0F) + 10.0F)
   }

   fun applyInitialGhostRotation(pitch: OtherClientPlayerEntity, ghost: Float, yaw: Float) {
      طث.setYaw(ghost as Entity, yaw)
      طث.setPitch(ghost as Entity, pitch)
      طث.setHeadYaw(ghost as LivingEntity, yaw)
      طث.setBodyYaw(ghost as LivingEntity, yaw)
   }

   fun updateGhostForRender(y: OtherClientPlayerEntity, ghost: Double, x: Double, yaw: Double, z: Float) {
      val position: Vec3d = Vec3d(x, y, z)
      ghost.setPosition(position)
      (ghost as Entity).setPosition(x, y, z)
      (ghost as Entity).refreshPositionAndAngles(x, y, z, yaw, 0.0F)
      (ghost as Entity).setLastPositionAndAngles(position, yaw, 0.0F)
      this.syncPreviousRenderState(ghost, x, y, z, yaw)
      طث.setYaw(ghost as Entity, yaw)
      طث.setPitch(ghost as Entity, 0.0F)
      طث.setHeadYaw(ghost as LivingEntity, yaw)
      طث.setBodyYaw(ghost as LivingEntity, yaw)
      ghost.setVelocity(Vec3d.ZERO)
      ghost.age = 0
      ghost.hurtTime = 0
      ghost.deathTime = 0
      ghost.setMovementSpeed(0.0F)
      ghost.limbAnimator.reset()
      ghost.fallDistance = 0.0
      ghost.setOnGround(true)
      ghost.setPose(EntityPose.STANDING)
      (ghost as LivingEntity).setSneaking(true)
      ghost.setSprinting(false)
      ghost.setSwimming(false)
      ghost.setInvisible(false)
      ghost.setCustomName(null)
      ghost.setCustomNameVisible(false)
   }

   private fun hideNameTag(scoreHolder: String) {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         val var17: Scoreboard = var10000.getScoreboard()
         if (var17 != null) {
            var var18: Team = var17.getTeam("rain_soul_hidden")
            if (var18 == null) {
               var18 = var17.addTeam("rain_soul_hidden")
            }

            var18.setNameTagVisibilityRule(VisibilityRule.NEVER)
            var17.addScoreHolderToTeam(scoreHolder, var18)
            return
         }
      }
   }

   @Commando
   public fun onTotemPop(event: رك) {
      if (onTotem.getValue() && ضك.getMc().world != null && ضك.getMc().player != null) {
         val target: PlayerEntity = event.getPlayer()
         if (!(target == ضك.getMc().player)) {
            this.spawnSoul(target)
         }
      }
   }

   @Commando
   public fun onAttack(event: ذم) {
      if (onDeath.getValue()) {
         val var3: Entity = event.getEntity()
         val var10000: PlayerEntity = var3 as? PlayerEntity
         if ((var3 as? PlayerEntity) != null) {
            if (!(var10000 == ضك.getMc().player)) {
               lastTarget = var10000
               lastHitAt = System.currentTimeMillis()
            }
         }
      }
   }

   fun prepareSoulRenderState(state: EntityRenderState) {
      state.light = 15728880
      state.outlineColor = 0
      state.displayName = null
      state.nameLabelPos = null
      state.leashDatas = null
      state.shadowRadius = 0.0F
      state.shadowPieces.clear()
      state.onFire = false
      state.invisible = true
      if (state is LivingEntityRenderState) {
         (state as LivingEntityRenderState).invisibleToPlayer = false
         (state as LivingEntityRenderState).hurt = false
         (state as LivingEntityRenderState).deathTime = 0.0F
      }
   }

   fun createGhostProfile(target: PlayerEntity, ghostName: java.lang.String): GameProfile {
      if (target is AbstractClientPlayerEntity) {
         val var10000: GameProfile = (target as AbstractClientPlayerEntity).getGameProfile()
         val original: GameProfile = var10000
         val var4: GameProfile = GameProfile(var10000.id(), ghostName)
         val copy: GameProfile = var4
         val var7: جط = INSTANCE

         try {
            val var11: Any = Result.constructor_impl/* $VF was: constructor-impl */(copy.properties().putAll(original.properties() as Multimap))
         } catch (var10: java.lang.Throwable) {
            val `$this$createGhostProfile_u24lambda_u240_u240`: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var10))
         }

         var4
      } else {
         GameProfile(target.getUuid(), ghostName)
      }
   }

   private fun clearHideTeam() {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         val var9: Scoreboard = var10000.getScoreboard()
         if (var9 != null) {
            val var10: Team = var9.getTeam("rain_soul_hidden")
            if (var10 == null) {
               return
            }

            var9.removeTeam(var10)
            return
         }
      }
   }

   fun syncPreviousRenderState(z: OtherClientPlayerEntity, x: Double, ghost: Double, yaw: Double, y: Float) {
      ghost.lastX = x
      ghost.lastY = y
      ghost.lastZ = z
      ghost.lastRenderX = x
      ghost.lastRenderY = y
      ghost.lastRenderZ = z
      ghost.lastYaw = yaw
      ghost.lastPitch = 0.0F
      ghost.lastBodyYaw = yaw
      ghost.lastHeadYaw = yaw
   }

   @Commando
   public fun onEntitySubmit(event: بة) {
      if (ضك.getMc().player != null && ضك.getMc().world != null && !souls.isEmpty()) {
         var var10000: ح = ضك.getMc().getEntityRenderDispatcher()
         val dispatcher: EntityRenderManager = var10000
         val var19: Vec3d = event.getCameraState().pos
         val cameraPos: Vec3d = var19
         val now: Long = System.currentTimeMillis()
         val var20: java.util.Iterator = souls.iterator()
         val iterator: java.util.Iterator = var20

         while (iterator.hasNext()) {
            var10000 = (ح)iterator.next()
            val soul: ح = var10000
            val progress: Float = RangesKt.coerceIn((float)(now - (var10000 as ح).startAt) / (float)1600L, 0.0F, 1.0F)
            if (progress >= 1.0F) {
               iterator.remove()
            } else {
               val eased: Float = this.easeOutCubic(progress)
               val alpha: Float = this.soulAlpha(progress)
               if (!(alpha <= 0.001F)) {
                  val ghostX: Double = soul.getStartPos().x
                  val ghostY: Double = soul.getStartPos().y + eased * 1.8F
                  val ghostZ: Double = soul.getStartPos().z
                  this.updateGhostForRender(soul.getGhost(), ghostX, ghostY, ghostZ, soul.baseYaw + 180.0F * eased)
                  val var22: EntityRenderState = dispatcher.getAndUpdateRenderState(soul.getGhost() as Entity, event.partialTicks)
                  this.prepareSoulRenderState(var22)
                  صد.withAlpha(
                     alpha,
                     { 
                        `$dispatcher`.render(
                           `$state`,
                           `$event`.getCameraState(),
                           `$state`.x - `$cameraPos`.x,
                           `$state`.y - `$cameraPos`.y,
                           `$state`.z - `$cameraPos`.z,
                           `$event`.getMatrices(),
                           `$event`.getCollector()
                        )
                     }
                  )
               }
            }
         }
      }
   }

   public override fun onDisable() {
      souls.clear()
      lastTarget = null
      this.clearHideTeam()
      super.onDisable()
   }
}

package oxxxde

import java.awt.Color
import java.util.ArrayList
import kotlin.random.Random
import net.minecraft.class_2960
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.Identifier
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.EntityHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.hit.HitResult.Type
import net.minecraft.util.math.Direction
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import net.minecraft.world.RaycastContext
import net.minecraft.world.World
import net.minecraft.world.RaycastContext.FluidHandling
import net.minecraft.world.RaycastContext.ShapeType
import org.joml.Quaternionfc
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object دظ : دِ("HitParticles", ظن.getRENDER(), "Частицы при попадании по цели") {
   private final val useClientColor: خذ = دِ.boolean$default(دظ.INSTANCE, "Цвет клиента", true, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   })

   private final val particles: ArrayList<حي> = ArrayList()
   private const val MIN_BOUNCE_SPEED: Double = 0.24
   private const val COLLISION_EPSILON: Double = 0.012
   private const val SIZE_POP_PORTION: Double = 0.16
   private const val ROTATION_DRAG: Double = 0.55
   private const val SETTLE_FRICTION: Double = 0.72
   private const val IMPACT_PULSE_DECAY: Double = 9.0
   private const val MAX_BOUNCES: Int = 4
   private final val FULL_STEP_ROTATION_DECAY: Float = (float)Math.exp(-0.004583333333333333)
   private final val FULL_STEP_IMPACT_DECAY: Float = (float)Math.exp(-0.075)
   private const val APPEAR_PORTION: Double = 0.1
   private const val NANOS_PER_SECOND: Double = 1.0E9
   private final val speed: طُ = INSTANCE.slider("Сила разлёта", 1.5F, 0.6F, 2.0F, 0.05F, "Скорость")

   private final val gravity: طُ = دِ.slider$default(INSTANCE, "Гравитация", 4.0F, 0.0F, 4.0F, 0.1F, null, 32, null).setVisible({ 
      physicsMode.selectedIndex == 1
   })

   private const val SURFACE_FRICTION: Double = 0.74
   private const val MAX_CATCH_UP_TIME: Double = 0.12
   private const val TEXTURE_BUFFER_SIZE: Int = 131072
   private const val MAX_PHYSICS_STEP: Double = 0.008333333333333333
   private final val PARTICLE_TEXTURES: List<class_2960>
   private final val GOLDEN_ANGLE: Double = Math.PI * (3.0 - Math.sqrt(5.0))
   private final val RANDOM_MODE_INDEX: Int
   private const val ANGLE_JITTER: Double = 0.09
   private final val physicsMode: ظي = دِ.mode$default(INSTANCE, "Физика", CollectionsKt.listOf("Взрыв", "Отскоки"), 0, null, 8, null)
   private final val size: طُ = دِ.slider$default(INSTANCE, "Размер", 0.15F, 0.1F, 0.25F, 0.01F, null, 32, null)
   private const val BOUNCE_MODE_INDEX: Int = 1
   private final val particleColor: رت
   private final val lifeTime: طُ = دِ.slider$default(INSTANCE, "Время жизни", 0.8F, 0.5F, 2.0F, 0.05F, null, 32, null)
   private final var renderResources: شً?
   private final val FULL_STEP_GROUND_DRAG: Double = Math.exp(-0.04583333333333333)
   private final val particleType: ظي =
      دِ.mode$default(
         INSTANCE, "Стиль", CollectionsKt.listOf("Доллар", "Свечение", "Сердце", "Молния", "Точка", "Снежинка", "Звезда", "Руб", "Рандом"), 1, null, 8, null
      )
      private final val count: طُ = دِ.slider$default(INSTANCE, "Количество", 20.0F, 1.0F, 40.0F, 1.0F, null, 32, null)
   private const val MAX_PARTICLES: Int = 800
   private const val GROUND_DRAG: Double = 5.5
   private const val FALLBACK_BUFFER_SIZE: Int = 1024

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         if (ضك.getMc().player != null && ضك.getMc().world != null) {
            this.updateParticles()
            if (!particles.isEmpty()) {
               val var10000: GameRenderer = ضك.getMc().gameRenderer
               val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
               val color: Color = this.selectedColor()
               val resources: شً = this.renderResources()
               var `$this$draw$iv`: Int = 0

               for (`$i$f$draw` in particles.size()..`$this$draw$iv`) {
                  val var11: Any = particles.get(`$this$draw$iv`)
                  val particle: حي = var11 as حي
                  if (!((var11 as حي).alpha <= 0.0F) && !((var11 as حي).currentSize <= 0.0F)) {
                     val var10002: VertexConsumer = resources.getConsumers().getBuffer(resources.getLayers()[particle.textureIndex])
                     this.renderParticle(event, var10002, particle, cameraPos, color)
                  }
               }

               resources.getConsumers().draw()
            }
         }
      }
   }

   private fun dragFactor(particle: حي, step: Double): Double {
      return if (step == 0.008333333333333333) particle.fullStepDrag else Math.exp(-particle.drag * step)
   }

   private fun selectedTextureIndex(): Int {
      return if (particleType.selectedIndex == RANDOM_MODE_INDEX)
         Random.Default.nextInt(PARTICLE_TEXTURES.size())
         else
         RangesKt.coerceIn(particleType.selectedIndex, 0, CollectionsKt.getLastIndex(PARTICLE_TEXTURES))
      }

   public override fun onDisable() {
      particles.clear()
      if (renderResources != null) {
         renderResources.close()
      }

      renderResources = null
   }

   fun simulateParticle(elapsedSeconds: حي, player: Double, particle: ClientWorld, world: PlayerEntity) {
      var remaining: Double = elapsedSeconds

      while (remaining > 0.0) {
         val step: Double = Math.min(remaining, 0.008333333333333333)
         when (ظع.$EnumSwitchMapping$0[particle.getPhysics().ordinal()]) {
            1 -> this.simulateFreeParticle(particle, step)
            2 -> this.simulateBouncingParticle(particle, step, world, player)
            else -> throw NoWhenBranchMatchedException()
         }

         particle.rotation = particle.rotation + particle.angularVelocity * (float)step
         val fullStep: Boolean = step == 0.008333333333333333
         particle.angularVelocity = particle.angularVelocity * (if (step == 0.008333333333333333) FULL_STEP_ROTATION_DECAY else (float)Math.exp(-0.55 * step))
         particle.impactPulse = particle.impactPulse * (if (fullStep) FULL_STEP_IMPACT_DECAY else (float)Math.exp(-9.0 * step))
         remaining -= step
      }
   }

   private fun createSpawnMotion(physics: طص, index: Int, particleCount: Int, batchPhase: Double, speedMultiplier: Double): ذط {
      val angle: Double = batchPhase + index * GOLDEN_ANGLE + Random.Default.nextDouble(-0.09, 0.09)
var var10000: ذط
      when (ظع.$EnumSwitchMapping$0[physics.ordinal()]) {
         1 -> {
            val var18: Double = Math.sqrt(
               RangesKt.coerceAtLeast(
                  1.0 - (1.0 - 2.0 * (((double)index + 0.5) / (double)particleCount)) * (1.0 - 2.0 * (((double)index + 0.5) / (double)particleCount)), 0.0
               )
            )
            val var20: Vec3d = Vec3d(Math.cos(angle) * var18, 1.0 - 2.0 * (((double)index + 0.5) / (double)particleCount), Math.sin(angle) * var18).normalize()
            val var10003: Vec3d = var20.multiply(Random.Default.nextDouble(1.5, 2.25) * speedMultiplier).add(0.0, 0.12 * speedMultiplier, 0.0)
            var10000 = ذط(var20, var10003, Random.Default.nextDouble(1.15, 1.65), 0.0, 0.88F, 0.48, 0.58, 0.0, (float)Random.Default.nextDouble(-8.0, 8.0))
         }
         2 -> {
            val vertical: Double = Random.Default.nextDouble(0.48, 1.05) * speedMultiplier
            val horizontal: Double = Random.Default.nextDouble(0.9, 1.55) * speedMultiplier
            val direction: Vec3d = Vec3d(Math.cos(angle), 0.0, Math.sin(angle))
            val var10002: Vec3d = Vec3d(Math.cos(angle) * 0.78, 0.62, Math.sin(angle) * 0.78).normalize()
            var10000 = ذط(
               var10002,
               Vec3d(direction.x * horizontal, vertical, direction.z * horizontal),
               Random.Default.nextDouble(0.14, 0.28),
               2.2,
               1.55F,
               0.7,
               0.24,
               Random.Default.nextDouble(0.52, 0.68),
               (float)Random.Default.nextDouble(-7.0, 7.0)
            )
         }
         else -> throw NoWhenBranchMatchedException()
      }

      return var10000
   }

   private fun secondsToNanos(seconds: Float): Long {
      return (long)(RangesKt.coerceAtLeast(seconds, 0.01F) * (float)1000000000L)
   }

   fun renderParticle(particle: شث, buffer: VertexConsumer, color: حي, event: Vec3d, cameraPos: Color) {
      val alpha: Int = RangesKt.coerceIn((int)(255.0F * particle.alpha), 0, 255)
      val halfSize: Float = particle.currentSize
      event.getMatrices().push()
      event.getMatrices().translate(particle.positionX - cameraPos.x, particle.positionY - cameraPos.y, particle.positionZ - cameraPos.z)
      val var10000: MatrixStack = event.getMatrices()
      val var10001: GameRenderer = ضك.getMc().gameRenderer
      var10000.multiply(طث.getCamera(var10001).getRotation() as Quaternionfc)
      event.getMatrices().multiply(RotationAxis.POSITIVE_Z.rotation(particle.rotation) as Quaternionfc)
      val var9: Entry = event.getMatrices().peek()
      buffer.vertex(var9, -halfSize, halfSize, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0F, 0.0F)
      buffer.vertex(var9, halfSize, halfSize, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0F, 0.0F)
      buffer.vertex(var9, halfSize, -halfSize, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0F, 1.0F)
      buffer.vertex(var9, -halfSize, -halfSize, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0F, 1.0F)
      event.getMatrices().pop()
   }

   public override fun onEnable() {
      particles.clear()
   }

   @Commando
   public fun onAttack(event: ذم) {
      if (this.isEnabled()) {
         if (ضك.getMc().player != null && ضك.getMc().world != null) {
            val entity: Entity = event.getEntity()
            val spawnedAt: HitResult = ضك.getMc().crosshairTarget
            var var10000: Vec3d
            if (spawnedAt is EntityHitResult) {
               if ((spawnedAt as EntityHitResult).getEntity() == entity) {
                  var10000 = طث.getPos(spawnedAt)
               } else {
                  val var5: Vec3d = طث.getPos(entity).add(0.0, (double)طث.getHeight(entity) * 0.5, 0.0)
                  var10000 = var5
               }
            } else {
               var10000 = طث.getPos(entity).add(0.0, (double)طث.getHeight(entity) * 0.5, 0.0)
            }

            val hitPos: Vec3d = var10000
            val var18: Long = System.nanoTime()
            val speedMultiplier: Double = speed.getValue().floatValue()
            val physics: طص = طص.getEntries().get(RangesKt.coerceIn(physicsMode.selectedIndex, 0, CollectionsKt.getLastIndex(طص.getEntries())))
            val particleCount: Int = Math.max(1, (int)count.getValue().floatValue())
            val var19: Double = Random.Default.nextDouble(0.0, Math.PI * 2)

            repeat(particleCount) { var12 ->
               val motion: ذط = INSTANCE.createSpawnMotion(physics, var12, particleCount, var19, speedMultiplier)
               var10000 = hitPos.add(motion.getDirection().multiply(Random.Default.nextDouble(0.035, 0.12)))
                  .add(Random.Default.nextDouble(-0.025, 0.025), Random.Default.nextDouble(-0.02, 0.025), Random.Default.nextDouble(-0.025, 0.025))
                  particles.add(
                  حي(
                     physics,
                     var18,
                     var18,
                     INSTANCE.secondsToNanos(lifeTime.getValue().floatValue() * motion.lifeTimeMultiplier * (float)Random.Default.nextDouble(0.88, 1.12)),
                     size.getValue().floatValue() * (float)Random.Default.nextDouble(0.82, 1.18),
                     INSTANCE.selectedTextureIndex(),
                     motion.drag,
                     (double)gravity.getValue().floatValue() * motion.gravityMultiplier * Random.Default.nextDouble(0.92, 1.08),
                     motion.angularVelocity,
                     motion.fadeStart,
                     motion.shrinkAmount,
                     motion.restitution,
                     var10000.x,
                     var10000.y,
                     var10000.z,
                     motion.getVelocity().x,
                     motion.getVelocity().y,
                     motion.getVelocity().z,
                     Math.exp(-motion.drag * 0.008333333333333333),
                     0.0F,
                     Random.Default.nextFloat() * (float) Math.PI * 2.0F,
                     0.0F,
                     0.0F,
                     0,
                     false,
                     31981568,
                     null
                  )
               )
            }

            if (particles.size() > 800) {
               particles.subList(0, particles.size() - 800).clear()
            }
         }
      }
   }

   fun simulateBouncingParticle(step: حي, world: Double, particle: ClientWorld, player: PlayerEntity) {
      if (particle.grounded) {
         val var37: Double = if (step == 0.008333333333333333) FULL_STEP_GROUND_DRAG else Math.exp(-5.5 * step)
         particle.velocityX = particle.velocityX * var37
         particle.velocityY = 0.0
         particle.velocityZ = particle.velocityZ * var37
         particle.positionX = particle.positionX + particle.velocityX * step
         particle.positionZ = particle.positionZ + particle.velocityZ * step
      } else {
         val drag: Double = this.dragFactor(particle, step)
         particle.velocityX = particle.velocityX * drag
         particle.velocityY = (particle.velocityY - particle.gravity * step) * drag
         particle.velocityZ = particle.velocityZ * drag
         val intendedX: Double = particle.positionX + particle.velocityX * step
         val intendedY: Double = particle.positionY + particle.velocityY * step
         val intendedZ: Double = particle.positionZ + particle.velocityZ * step
         val var10000: BlockHitResult = (world as World)
            .raycast(
               RaycastContext(
                  Vec3d(particle.positionX, particle.positionY, particle.positionZ),
                  Vec3d(intendedX, intendedY, intendedZ),
                  ShapeType.COLLIDER,
                  FluidHandling.NONE,
                  player as Entity
               )
            )
            if (var10000.getType() === Type.MISS) {
            particle.positionX = intendedX
            particle.positionY = intendedY
            particle.positionZ = intendedZ
         } else {
            val var41: Direction = var10000.getSide()
            val var39: Double = var41.getOffsetX()
            val normalY: Double = var41.getOffsetY()
            val normalZ: Double = var41.getOffsetZ()
            val normalVelocity: Double = particle.velocityX * var39 + particle.velocityY * normalY + particle.velocityZ * normalZ
            val surfaceOffset: Double = Math.max(0.012, (double)particle.initialSize * 0.58)
            particle.positionX = var10000.getPos().x + var39 * surfaceOffset
            particle.positionY = var10000.getPos().y + normalY * surfaceOffset
            particle.positionZ = var10000.getPos().z + normalZ * surfaceOffset
            if (!(normalVelocity >= 0.0)) {
               val tangentX: Double = (particle.velocityX - var39 * normalVelocity) * 0.74
               val tangentY: Double = (particle.velocityY - normalY * normalVelocity) * 0.74
               val tangentZ: Double = (particle.velocityZ - normalZ * normalVelocity) * 0.74
               val reboundSpeed: Double = -normalVelocity * particle.restitution
               particle.bounceCount = particle.bounceCount + 1
               particle.impactPulse = 1.0F
               particle.angularVelocity = particle.angularVelocity * -0.72F
               if (!(normalY > 0.5) || !(reboundSpeed < 0.24) && particle.bounceCount < 4) {
                  particle.velocityX = tangentX + var39 * reboundSpeed
                  particle.velocityY = tangentY + normalY * reboundSpeed
                  particle.velocityZ = tangentZ + normalZ * reboundSpeed
               } else {
                  particle.velocityX = tangentX * 0.72
                  particle.velocityY = 0.0
                  particle.velocityZ = tangentZ * 0.72
                  particle.grounded = true
               }
            }
         }
      }
   }

   private fun updateParticles() {
      val now: Long = System.nanoTime()
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         val world: ClientWorld = var10000
         val var25: ClientPlayerEntity = ضك.getMc().player
         if (var25 != null) {
            val player: ClientPlayerEntity = var25
            var writeIndex: Int = 0
            var readIndex: Int = 0

            for (var7 in particles.size()..readIndex) {
               val var26: Any = particles.get(readIndex)
               val particle: حي = var26 as حي
               val ageNanos: Long = RangesKt.coerceAtLeast(now - (var26 as حي).spawnedAtNanos, 0L)
               if (ageNanos < particle.lifeTimeNanos) {
                  if (writeIndex != readIndex) {
                     particles.set(writeIndex, particle)
                  }

                  writeIndex++
                  val progress: Double = RangesKt.coerceIn((double)ageNanos / (double)particle.lifeTimeNanos, 0.0, 1.0)
                  val elapsedSeconds: Double = RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - particle.lastUpdatedAtNanos, 0L) / 1.0E9, 0.12)
                  particle.lastUpdatedAtNanos = now
                  this.simulateParticle(particle, elapsedSeconds, world, player as PlayerEntity)
                  val appear: Double = this.smoothStep(RangesKt.coerceIn(progress / 0.1, 0.0, 1.0))
                  val fade: Double = this.smoothStep(RangesKt.coerceIn((progress - particle.fadeStart) / (1.0 - particle.fadeStart), 0.0, 1.0))
                  val pop: Double = this.easeOutBack(RangesKt.coerceIn(progress / 0.16, 0.0, 1.0))
                  val shrink: Double = 1.0 - progress * particle.shrinkAmount
                  val impactScale: Double = 1.0 + particle.impactPulse * 0.16
                  particle.alpha = RangesKt.coerceIn((float)(appear * (1.0 - fade)), 0.0F, 1.0F)
                  particle.currentSize = RangesKt.coerceAtLeast((float)((double)particle.initialSize * pop * shrink * impactScale), 0.0F)
               }
            }

            if (writeIndex < particles.size()) {
               particles.subList(writeIndex, particles.size()).clear()
            }
         }
      }
   }

   private fun smoothStep(value: Double): Double {
      return value * value * (3.0 - 2.0 * value)
   }

   private fun renderResources(): شً {
      var var10000: شً = renderResources
      if (renderResources == null) {
         val var1: شً = شً()
         renderResources = var1
         var10000 = var1
      }

      return var10000
   }

   private fun simulateFreeParticle(particle: حي, step: Double) {
      val drag: Double = this.dragFactor(particle, step)
      particle.velocityX = particle.velocityX * drag
      particle.velocityY = (particle.velocityY - particle.gravity * step) * drag
      particle.velocityZ = particle.velocityZ * drag
      particle.positionX = particle.positionX + particle.velocityX * step
      particle.positionY = particle.positionY + particle.velocityY * step
      particle.positionZ = particle.positionZ + particle.velocityZ * step
   }

   @JvmStatic
   fun {
      val var10000: دِ = INSTANCE
      val var10002: Color = Color.WHITE
      particleColor = دِ.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
      val var13: Array<Any> = arrayOf("dollar.png", "glow.png", "heart.png", "lightning.png", "point.png", "snowflake.png", "star.png", "starnew.png")
      val `destination$iv$iv`: java.util.Collection = ArrayList(var13.length)

      for (`item$iv$iv` in var13) {
         `destination$iv$iv`.add(Identifier.of("rain", "images/particles/$`item$iv$iv`"))
      }

      PARTICLE_TEXTURES = `destination$iv$iv` as MutableList<Identifier>
      RANDOM_MODE_INDEX = PARTICLE_TEXTURES.size()
   }

   private fun easeOutBack(value: Double): Double {
      return 1.0 + 2.70158 * (value - 1.0) * (value - 1.0) * (value - 1.0) + 1.70158 * (value - 1.0) * (value - 1.0)
   }

   private fun selectedColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else particleColor.getValue()
   }
}

package kotakbaz.rain.module.modules.hud.container

import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.event.events.Render3DEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.WorldParticlesModule$WorldParticle
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotlin.jdk7.AutoCloseableKt
import kotlin.random.Random
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.util.Identifier
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionfc
import oxxxde.شث
import oxxxde.ضب
import oxxxde.ضك
import oxxxde.طث
import oxxxde.ظث
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object HudModule : Module("World Particles", RENDER, "Добавляет летающие частицы в мире") {
   private const val DRIFT_ACCELERATION: Double = 0.055
   @JvmStatic
   private SliderSetting spawnCount = Module.slider$default(HudModule.INSTANCE, "Количество", 15.0F, 1.0F, 30.0F, 1.0F, null, 32, null);
   private final var lastSimulationAtNanos: Long
   private final var spawnCarry: Double
   private const val MAX_PARTICLE_SIZE: Double = 0.22
   private const val VELOCITY_DRAG: Double = 0.3
   @JvmStatic
   private ModeSetting particleType = Module.mode$default(
      HudModule.INSTANCE, "Стиль", CollectionsKt.listOf("Доллар", "Свечение", "Сердце", "Молния", "Точка", "Снежинка", "Звезда", "Руб"), 0, null, 12, null
   );
   private const val RETARGET_END_FRACTION: Float = 0.82F
   private const val SPAWN_HEIGHT: Double = 14.0
   private const val PARTICLE_LIFETIME_SECONDS: Double = 5.0
   private const val PULSE_AMOUNT: Float = 0.035F
   private const val SLOWDOWN_START_FRACTION: Float = 0.78F
   private const val INITIAL_SPEED: Double = 0.36
   private const val MIN_PARTICLE_SIZE: Double = 0.16
   private const val MAX_FRAME_TIME_SECONDS: Double = 0.1
   private const val SIZE_FADE_AMOUNT: Float = 0.35F
   private const val MIN_ROTATION_SPEED: Double = -0.65
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(HudModule.INSTANCE, "Цвет клиента", true, null, 4, null);
   private const val NANOS_PER_SECOND: Double = 1.0E9
   @JvmStatic
   private ClientWorld trackedWorld;
   private const val RETARGET_INTERVAL_NANOS: Long = 700000000L
   private const val SPAWN_RADIUS: Double = 22.0
   private const val APPEAR_FRACTION: Float = 0.14F
   @JvmStatic
   private ColorSetting particleColor;
   private const val RETARGET_DISTANCE_SQUARED: Double = 0.36
   private const val DESPAWN_DISTANCE_SQUARED: Double = 900.0
   private const val ROTATION_DRAG: Double = 0.08
   private const val GRAVITY_ACCELERATION: Double = 0.144
   private const val SIZE_FADE_START: Float = 0.68F
   private const val MAX_SPEED: Double = 0.54
   private final val particles: ArrayList<ضب> = ArrayList()
   private const val MAX_ROTATION_SPEED: Double = 0.65
   private const val MAX_PHYSICS_STEP_SECONDS: Double = 0.008333333333333333
   private const val TARGET_RANGE: Double = 3.2
   private const val STEERING_ACCELERATION: Double = 1.08
   private const val PULSE_SPEED: Double = 2.1
   private const val FADE_FRACTION: Float = 0.3F

   private fun selectedColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else particleColor.getValue()
   }

   public override fun onEnable() {
      this.clearState()
   }

   private fun smootherstep(value: Float): Float {
      return value * value * value * (value * (value * 6.0F - 15.0F) + 10.0F)
   }

   fun randomTargetAround(origin: Vec3d, range: Double): Vec3d {
      val var10000: Vec3d = origin.add(
         (Random.Default.nextDouble() - 0.5) * range, (Random.Default.nextDouble() - 0.5) * range, (Random.Default.nextDouble() - 0.5) * range
      )
      var10000
   }

   private fun clearState() {
      particles.clear()
      trackedWorld = ضك.getMc().world
      lastSimulationAtNanos = 0L
      spawnCarry = 0.0
   }

   fun spawnParticle(playerPos: Vec3d) {
      if (particles.size() < 200) {
         val angle: Double = Random.Default.nextDouble() * Math.PI * 2.0
         val spawnRadius: Double = Math.sqrt(Random.Default.nextDouble()) * 22.0
         val startPos: Vec3d = Vec3d(
            playerPos.x + Math.cos(angle) * spawnRadius, playerPos.y + (Random.Default.nextDouble() - 0.5) * 14.0, playerPos.z + Math.sin(angle) * spawnRadius
         )
         val now: Long = System.nanoTime()
         particles.add(
            WorldParticlesModule$WorldParticle(
               startPos,
               this.randomTargetAround(startPos, 3.2),
               Vec3d((Random.Default.nextDouble() - 0.5) * 0.36, (Random.Default.nextDouble() - 0.5) * 0.36, (Random.Default.nextDouble() - 0.5) * 0.36),
               now,
               now,
               (float)Random.Default.nextDouble(0.16, 0.22),
               Random.Default.nextDouble() * Math.PI * 2.0,
               (float)Random.Default.nextDouble() * (float) (Math.PI * 2),
               (float)Random.Default.nextDouble(-0.65, 0.65),
               0.0F,
               0.0F,
               1536,
               null
            )
         )
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         val var10000: ClientWorld = ضك.getMc().world
         if (var10000 == null) {
            this.clearState()
         } else {
            val var34: ClientPlayerEntity = ضك.getMc().player
            if (var34 != null) {
               if (trackedWorld != var10000) {
                  this.clearState()
                  trackedWorld = var10000
               }

               val now: Long = System.nanoTime()
               val var35: Vec3d = var34.getLerpedPos(event.partialTicks)
               val playerPos: Vec3d = var35
               if (lastSimulationAtNanos == 0L) {
                  lastSimulationAtNanos = now
               } else {
                  val cameraPos: Double = RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - lastSimulationAtNanos, 0L) / 1.0E9, 0.1)

                  // $VF: Unable to resugar Kotlin loop from Java for loop
                  spawnCarry = spawnCarry + cameraPos * spawnCount.getValue().doubleValue() * 10.0
                  while (true) {
                     if (spawnCarry >= 1.0) break
                     this.spawnParticle(playerPos)

                     spawnCarry--
                  }

                  val var36: java.util.Iterator = particles.iterator()
                  val color: java.util.Iterator = var36

                  while (color.hasNext()) {
                     val var37: Any = color.next()
                     if (!this.updateParticle(var37 as WorldParticlesModule$WorldParticle, playerPos, now, cameraPos)) {
                        color.remove()
                     }
                  }

                  lastSimulationAtNanos = now
               }

               if (!particles.isEmpty()) {
                  val var38: GameRenderer = ضك.getMc().gameRenderer
                  val var27: Vec3d = طث.getPos(طث.getCamera(var38))
                  val layer: RenderLayer = RainRenderLayers.getTrailSprite(this.selectedTexture())
                  val var28: Color = this.selectedColor()
                  val var29: AutoCloseable = BufferAllocator(262144) as AutoCloseable
                  var var11: java.lang.Throwable = null

                  try {
                     val var39: Immediate = VertexConsumerProvider.immediate(var29 as BufferAllocator)
                     val var40: VertexConsumer = var39.getBuffer(layer)
                     val buffer: VertexConsumer = var40

                     for (`element$iv` in particles) {
                        val particle: WorldParticlesModule$WorldParticle = `element$iv` as WorldParticlesModule$WorldParticle
                        if (!((`element$iv` as WorldParticlesModule$WorldParticle).alpha <= 0.0F)
                           && !((`element$iv` as WorldParticlesModule$WorldParticle).size <= 0.0F)) {
                           INSTANCE.renderParticle(event, buffer, particle, var27, var28)
                        }
                     }

                     var39.draw(layer)
                  } catch (var24: java.lang.Throwable) {
                     var11 = var24
                     throw var24
                  } finally {
                     AutoCloseableKt.closeFinally(var29, var11)
                  }
               }
            }
         }
      }
   }

   private fun simulateParticle(particle: ضب, ageSeconds: Double, lifeProgress: Float, step: Double) {
      val var10000: Vec3d = particle.getTarget().subtract(particle.getPosition())
      val movementScale: Double = 1.0 - RangesKt.coerceIn((lifeProgress - 0.78F) / 0.22000003F, 0.0F, 1.0F) * 0.65
      val phase: Double = particle.driftPhase
      val var18: Vec3d = Vec3d(
            Math.sin(ageSeconds * 0.85 + phase), Math.sin(ageSeconds * 0.62 + phase * 1.7) * 0.55, Math.cos(ageSeconds * 0.78 + phase * 0.73)
         )
         .multiply(0.055)
         var var10001: Vec3d = particle.getVelocity()
         .add(var10000.multiply(1.08 * movementScale * step))
         .add(var18.multiply(step))
         .add(0.0, -0.144 * movementScale * step, 0.0)
         particle.setVelocity(var10001)
      val maxSpeed: Double = 0.54 * RangesKt.coerceAtLeast(movementScale, 0.35)
      val speedSquared: Double = particle.getVelocity().lengthSquared()
      if (speedSquared > maxSpeed * maxSpeed) {
         var10001 = particle.getVelocity().multiply(maxSpeed / Math.sqrt(speedSquared))
         particle.setVelocity(var10001)
      }

      var10001 = particle.getVelocity().multiply(Math.exp(-0.3 * step))
      particle.setVelocity(var10001)
      var10001 = particle.getPosition().add(particle.getVelocity().multiply(step))
      particle.setPosition(var10001)
      particle.rotation = particle.rotation + particle.angularVelocity * (float)step * (float)movementScale
      particle.angularVelocity = particle.angularVelocity * (float)Math.exp(-0.08 * step)
   }

   @JvmStatic
   fun {
      val var1: Module = INSTANCE
      val var10002: Color = Color.WHITE
      particleColor = Module.color$default(var1, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   fun selectedTexture(): Identifier {
      var var10000: java.lang.String
      when (particleType.selectedIndex) {
         0 -> var10000 = "dollar.png"
         1 -> var10000 = "glow.png"
         2 -> var10000 = "heart.png"
         3 -> var10000 = "lightning.png"
         4 -> var10000 = "point.png"
         5 -> var10000 = "snowflake.png"
         6 -> var10000 = "star.png"
         7 -> var10000 = "starnew.png"
         else -> var10000 = "snowflake.png"
      }

      val var2: Identifier = Identifier.of("rain", "images/particles/$var10000")
      var2
   }

   public override fun onDisable() {
      this.clearState()
   }

   fun updateParticle(playerPos: WorldParticlesModule$WorldParticle, particle: Vec3d, elapsedSeconds: Long, now: Double): Boolean {
      val ageSeconds: Double = RangesKt.coerceAtLeast(now - particle.createdAtNanos, 0L) / 1.0E9
      if (ageSeconds >= 5.0) {
         false
      } else if (playerPos.squaredDistanceTo(particle.getPosition()) > 900.0) {
         false
      } else {
         val lifeProgress: Float = RangesKt.coerceIn((float)(ageSeconds / 5.0), 0.0F, 1.0F)
         val appear: Float = this.smootherstep(RangesKt.coerceIn(lifeProgress / 0.14F, 0.0F, 1.0F))
         val disappear: Float = this.smootherstep(RangesKt.coerceIn((1.0F - lifeProgress) / 0.3F, 0.0F, 1.0F))
         val fadeSize: Float = 1.0F - this.smootherstep(RangesKt.coerceIn((lifeProgress - 0.68F) / 0.32F, 0.0F, 1.0F)) * 0.35F
         val pulse: Float = 1.0F + (float)Math.sin(ageSeconds * 2.1 + particle.driftPhase) * 0.035F
         particle.alpha = appear * disappear
         particle.size = particle.baseSize * (0.72F + appear * 0.28F) * fadeSize * pulse
         val steps: Int = Math.max(1, (int)Math.ceil(elapsedSeconds / 0.008333333333333333))
         val var20: Double = elapsedSeconds / steps

         repeat(steps) { toTarget ->
            INSTANCE.simulateParticle(particle, ageSeconds, lifeProgress, var20)
         }

         val var10000: Vec3d = particle.getTarget().subtract(particle.getPosition())
         if (lifeProgress <= 0.82F && var10000.lengthSquared() < 0.36 && now - particle.lastRetargetAtNanos > 700000000L) {
            particle.setTarget(this.randomTargetAround(particle.getPosition(), 3.2))
            particle.lastRetargetAtNanos = now
         }

         true
      }
   }

   fun renderParticle(event: Render3DEvent, cameraPos: VertexConsumer, particle: WorldParticlesModule$WorldParticle, color: Vec3d, buffer: Color) {
      val alpha: Int = RangesKt.coerceIn((int)(255.0F * particle.alpha), 0, 255)
      val size: Float = particle.size
      event.getMatrices().push()
      event.getMatrices().translate(particle.getPosition().x - cameraPos.x, particle.getPosition().y - cameraPos.y, particle.getPosition().z - cameraPos.z)
      val var10000: MatrixStack = event.getMatrices()
      val var10001: GameRenderer = ضك.getMc().gameRenderer
      var10000.multiply(طث.getCamera(var10001).getRotation() as Quaternionfc)
      event.getMatrices().multiply(RotationAxis.POSITIVE_Z.rotation(particle.rotation) as Quaternionfc)
      val var9: Entry = event.getMatrices().peek()
      buffer.vertex(var9, -size, size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0F, 0.0F)
      buffer.vertex(var9, size, size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0F, 0.0F)
      buffer.vertex(var9, size, -size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0F, 1.0F)
      buffer.vertex(var9, -size, -size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0F, 1.0F)
      event.getMatrices().pop()
   }
}

package oxxxde

import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.event.events.Render3DEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.HitBubblesModule$Particle
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
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
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.LivingEntity
import net.minecraft.util.Identifier
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionf
import org.joml.Quaternionfc
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object سٌ : Module("HitBubbles", RENDER, "Создаёт порталы при ударе") {
   private final val particles: ArrayList<دث> = ArrayList()
   @JvmStatic
   private ColorSetting bubbleColor;
   @JvmStatic
   private ClientWorld trackedWorld;
   @JvmStatic
   private Identifier bubbleTexture;
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });

   fun renderParticle(
      rotationProgress: Render3DEvent,
      event: VertexConsumer,
      scale: HitBubblesModule$Particle,
      cameraPos: Vec3d,
      buffer: Float,
      alphaProgress: Float,
      particle: Float
   ) {
      val baseColor: Color = this.selectedColor()
      val color: Color = Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn((int)(alphaProgress * 255.0F), 0, 255))
      val size: Float = scale / 1.5F
      event.getMatrices().push()
      event.getMatrices().translate(particle.getPosition().x - cameraPos.x, particle.getPosition().y - cameraPos.y, particle.getPosition().z - cameraPos.z)
      event.getMatrices().multiply(particle.spawnRotation as Quaternionfc)
      event.getMatrices().multiply(RotationAxis.POSITIVE_X.rotationDegrees(particle.rotX * rotationProgress) as Quaternionfc)
      event.getMatrices().multiply(RotationAxis.POSITIVE_Y.rotationDegrees(particle.rotY * rotationProgress) as Quaternionfc)
      event.getMatrices().multiply(RotationAxis.POSITIVE_Z.rotationDegrees(rotationProgress * 360.0F * particle.rotZDir) as Quaternionfc)
      val var10000: Entry = event.getMatrices().peek()
      val entry: Entry = var10000
      val var12: Byte = 2

      repeat(var12) { var13 ->
         buffer.vertex(entry, -size, size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(0.0F, 0.0F)
         buffer.vertex(entry, size, size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(1.0F, 0.0F)
         buffer.vertex(entry, size, -size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(1.0F, 1.0F)
         buffer.vertex(entry, -size, -size, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).texture(0.0F, 1.0F)
      }

      event.getMatrices().pop()
   }

   private fun computeRotationProgress(age: Long): Float {
      return this.expoOut(RangesKt.coerceIn((float)age / 5000.0F, 0.0F, 1.0F)) * 2.0F
   }

   private fun computeAlpha(age: Long): Float {
      return if (age <= 1000L)
         this.expoOut(RangesKt.coerceIn((float)age / 1000.0F, 0.0F, 1.0F))
         else
         (if (age <= 1600L) 1.0F - this.expoIn(RangesKt.coerceIn((float)(age - 1000L) / 600.0F, 0.0F, 1.0F)) else 0.0F)
      }

   private fun clearState() {
      particles.clear()
      trackedWorld = ضك.getMc().world
   }

   @Commando
   public fun onUpdate(event: سح) {
      if (this.isEnabled()) {
         val var10000: ClientWorld = ضك.getMc().world
         if (var10000 == null) {
            this.clearState()
         } else {
            if (trackedWorld != var10000) {
               this.clearState()
               trackedWorld = var10000
            }

            val var7: ClientPlayerEntity = ضك.getMc().player
            if (var7 != null) {
               particles.removeIf({ p0: Any ->
                  `$tmp0`(p0)
               })
            }
         }
      }
   }

   @JvmStatic
   fun {
      val var10000: Identifier = Identifier.of("rain", "images/hit/bubble.png")
      bubbleTexture = var10000
      val var0: Module = INSTANCE
      val var10002: Color = Color.WHITE
      bubbleColor = Module.color$default(var0, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
   }

   private fun randomRange(min: Float, max: Float): Float {
      return min + Random.Default.nextFloat() * (max - min)
   }

   public override fun onEnable() {
      this.clearState()
   }

   private fun selectedColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else bubbleColor.getValue()
   }

   private fun expoOut(value: Float): Float {
      return if (value >= 1.0F) 1.0F else 1.0F - (float)Math.pow((double)2.0F, (double)(-10.0F * value))
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         if (!particles.isEmpty()) {
            val var10000: GameRenderer = ضك.getMc().gameRenderer
            val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
            val var3: AutoCloseable = BufferAllocator(262144) as AutoCloseable
            var var4: java.lang.Throwable = null

            try {
               val var31: Immediate = VertexConsumerProvider.immediate(var3 as BufferAllocator)
               val layer: RenderLayer = RainRenderLayers.getTrailSprite(bubbleTexture)
               val var32: VertexConsumer = var31.getBuffer(layer)
               val buffer: VertexConsumer = var32
               val now: Long = System.currentTimeMillis()

               for (`element$iv` in particles) {
                  val particle: HitBubblesModule$Particle = `element$iv` as HitBubblesModule$Particle
                  val age: Long = now - (`element$iv` as HitBubblesModule$Particle).createdAt
                  val alphaProgress: Float = INSTANCE.computeAlpha(age)
                  if (!(alphaProgress <= 0.0F)) {
                     INSTANCE.renderParticle(event, buffer, particle, cameraPos, alphaProgress, alphaProgress, INSTANCE.computeRotationProgress(age))
                  }
               }

               var31.draw(layer)
            } catch (var25: java.lang.Throwable) {
               var4 = var25
               throw var25
            } finally {
               AutoCloseableKt.closeFinally(var3, var4)
            }
         }
      }
   }

   @Commando
   public fun onAttack(event: ذم) {
      if (this.isEnabled()) {
         val var10000: ClientPlayerEntity = ضك.getMc().player
         if (var10000 != null) {
            val direction: Entity = event.getEntity()
            val var9: LivingEntity = direction as? LivingEntity
            if ((direction as? LivingEntity) != null) {
               if (!(var9 == var10000)) {
                  val var10: Vec3d = طث.getPos(var10000 as Entity).subtract(طث.getPos(var9 as Entity))
                  val particlePosition: Vec3d = if (var10.lengthSquared() > 1.0E-6) var10.normalize() else Vec3d(0.0, 0.0, 1.0)
                  val var11: Vec3d = طث.getPos(var9 as Entity)
                     .add(0.0, (double)طث.getHeight(var9 as Entity) / 1.55, 0.0)
                     .add(particlePosition.multiply((double)طث.getWidth(var9 as Entity) / 2.0 + 0.2))
                     val var12: ArrayList = particles
                  val var10003: Long = System.currentTimeMillis()
                  val var10007: GameRenderer = ضك.getMc().gameRenderer
                  var12.add(
                     HitBubblesModule$Particle(
                        var10003,
                        var11,
                        Quaternionf(طث.getCamera(var10007).getRotation() as Quaternionfc),
                        Random.Default.nextFloat() * 20.0F - this.randomRange(-25.0F, 30.0F),
                        Random.Default.nextFloat() * 20.0F - 10.0F,
                        if (Random.Default.nextBoolean()) 1.0F else -1.0F
                     )
                  )
               }
            }
         }
      }
   }

   private fun expoIn(value: Float): Float {
      return if (value <= 0.0F) 0.0F else (float)Math.pow((double)2.0F, (double)(10.0F * value - 10.0F))
   }

   public override fun onDisable() {
      this.clearState()
   }
}

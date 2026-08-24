package oxxxde

import java.awt.Color
import java.util.ArrayList
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
import net.minecraft.util.Identifier
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionfc
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object خي : دِ("Traces", ظن.getRENDER(), "Визуальные следы ходьбы") {
   @JvmStatic
   private ClientWorld trackedWorld;
   private const val TRAIL_Y_OFFSET: Double = 0.05

   private final val useClientColor: خذ = دِ.boolean$default(خي.INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   })

   private final val trailLifetime: طُ = دِ.slider$default(خي.INSTANCE, "Время жизни", 1.5F, 0.5F, 5.0F, 0.1F, null, 32, null)
   private const val BUFFER_SIZE: Int = 262144
   private final val trailPoints: ArrayList<عر> = ArrayList()
   private final val trailColor: رت
   @JvmStatic
   private Identifier texture;
   private const val MAX_POINT_DISTANCE: Double = 3.0
   private const val MIN_DISTANCE_FOR_YAW: Double = 0.01
   private final val stepDistance: طُ = دِ.slider$default(INSTANCE, "Дистанция", 1.5F, 1.0F, 2.5F, 0.1F, null, 32, null)
   private const val TRAIL_SIZE: Float = 1.1F
   @JvmStatic
   private Vec3d lastSelfPosition;

   fun appendTrailPointIfNeeded(currentPos: Vec3d, time: Vec3d, onGround: Vec3d, previousPos: Boolean, velocity: Long) {
      val distance: Double = currentPos.distanceTo(previousPos)
      if (onGround && distance >= stepDistance.getValue().floatValue() && distance <= 3.0) {
         trailPoints.add(عر(currentPos, this.calculateMovementYaw(velocity, previousPos, currentPos), time))
      }
   }

   public override fun onDisable() {
      this.clearState()
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

            val now: Long = System.currentTimeMillis()
            trailPoints.removeIf({ p0: Any ->
               `$tmp0`(p0)
            })
            this.updateSelfTrail(now)
         }
      }
   }

   fun resolveLastPosition(currentPos: Vec3d, onGround: Vec3d, previousPos: Boolean): Vec3d {
      val distance: Double = currentPos.distanceTo(previousPos)
      if (onGround && (!(distance >= stepDistance.getValue().floatValue()) || !(distance <= 3.0))) previousPos else currentPos
   }

   private fun lifetimeMillis(): Long {
      return RangesKt.coerceAtLeast((long)(trailLifetime.getValue().floatValue() * 1000.0F), 1L)
   }

   private fun clearState() {
      trailPoints.clear()
      trackedWorld = null
      lastSelfPosition = null
   }

   fun renderTrailPoint(alpha: شث, green: VertexConsumer, event: عر, buffer: Vec3d, blue: Int, cameraPos: Int, red: Int, point: Int) {
      event.getMatrices().push()
      event.getMatrices().translate(point.getPosition().x - cameraPos.x, point.getPosition().y - cameraPos.y + 0.05, point.getPosition().z - cameraPos.z)
      event.getMatrices().multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-point.yaw + 180.0F) as Quaternionfc)
      event.getMatrices().scale(1.1F, 1.1F, 1.1F)
      val var10000: Entry = event.getMatrices().peek()
      buffer.vertex(var10000, -0.55F, 0.0F, -0.55F).color(red, green, blue, alpha).texture(0.0F, 0.0F)
      buffer.vertex(var10000, 0.55F, 0.0F, -0.55F).color(red, green, blue, alpha).texture(1.0F, 0.0F)
      buffer.vertex(var10000, 0.55F, 0.0F, 0.55F).color(red, green, blue, alpha).texture(1.0F, 1.0F)
      buffer.vertex(var10000, -0.55F, 0.0F, 0.55F).color(red, green, blue, alpha).texture(0.0F, 1.0F)
      event.getMatrices().pop()
   }

   private fun calculateAlpha(progress: Float): Float {
      return if (progress < 0.2F)
         RangesKt.coerceIn(progress / 0.2F, 0.0F, 1.0F)
         else
         (if (progress > 0.8F) RangesKt.coerceIn(1.0F - (progress - 0.8F) / 0.2F, 0.0F, 1.0F) else 1.0F)
      }

   public override fun onEnable() {
      this.clearState()
   }

   private fun updateSelfTrail(now: Long) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         val `$this$updateSelfTrail_u24lambda_u240`: خي = this
         lastSelfPosition = null
      } else {
         val currentPos: Vec3d = طث.getPos(var10000 as Entity)
         val previousPos: Vec3d = lastSelfPosition
         if (lastSelfPosition == null) {
            lastSelfPosition = currentPos
         } else {
            this.appendTrailPointIfNeeded(currentPos, lastSelfPosition, طث.getVelocity(var10000 as Entity), var10000.isOnGround(), now)
            lastSelfPosition = this.resolveLastPosition(previousPos, currentPos, var10000.isOnGround())
         }
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         if (!trailPoints.isEmpty()) {
            val var10000: GameRenderer = ضك.getMc().gameRenderer
            val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
            val now: Long = System.currentTimeMillis()
            val lifetimeMillis: Float = RangesKt.coerceAtLeast((float)this.lifetimeMillis(), 1.0F)
            val selectedColor: Color = if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else trailColor.getValue()
            val layer: RenderLayer = RainRenderLayers.getTrailSprite(texture)
            val allocator: BufferAllocator = BufferAllocator(262144)

            try {
               val var24: Immediate = VertexConsumerProvider.immediate(allocator)
               val var25: VertexConsumer = var24.getBuffer(layer)
               val buffer: VertexConsumer = var25

               for (`element$iv` in trailPoints) {
                  val point: عر = `element$iv` as عر
                  val alphaFactor: Float = INSTANCE.calculateAlpha(RangesKt.coerceAtLeast((float)(now - (`element$iv` as عر).time) / lifetimeMillis, 0.0F))
                  if (!(alphaFactor <= 0.0F)) {
                     val alpha: Int = RangesKt.coerceIn((int)((float)selectedColor.getAlpha() * alphaFactor), 0, 255)
                     if (alpha > 0) {
                        INSTANCE.renderTrailPoint(
                           event, buffer, point, cameraPos, selectedColor.getRed(), selectedColor.getGreen(), selectedColor.getBlue(), alpha
                        )
                     }
                  }
               }

               var24.draw()
            } finally {
               allocator.close()
            }
         }
      }
   }

   @JvmStatic
   fun {
      val var10000: دِ = INSTANCE
      val var10002: Color = Color.WHITE
      trailColor = دِ.color$default(var10000, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
      })
      val var0: Identifier = Identifier.of("rain", "textures/world/trails/trails.png")
      texture = var0
   }

   fun calculateMovementYaw(velocity: Vec3d, previousPos: Vec3d, currentPos: Vec3d): Float {
      if (Math.sqrt(velocity.x * velocity.x + velocity.z * velocity.z) > 0.01) {
         (float)Math.toDegrees(Math.atan2(-velocity.x, velocity.z))
      } else {
         val deltaX: Double = currentPos.x - previousPos.x
         val deltaZ: Double = currentPos.z - previousPos.z
         if (Math.sqrt(deltaX * deltaX + (currentPos.z - previousPos.z) * (currentPos.z - previousPos.z)) > 0.01)
            (float)Math.toDegrees(Math.atan2(-deltaX, deltaZ))
            else
            0.0F
         }
   }
}

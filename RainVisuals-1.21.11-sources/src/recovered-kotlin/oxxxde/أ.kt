package oxxxde

import java.awt.Color
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.command.OrderedRenderCommandQueue
import net.minecraft.client.render.entity.state.LivingEntityRenderState
import net.minecraft.client.render.state.CameraRenderState
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.client.world.ClientWorld
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.Identifier
import org.joml.Vector3f
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object أ : Module("BodyGlow", RENDER, "Мягкая световая аура вокруг модели игрока") {
   @JvmStatic
   private BooleanSetting showOtherPlayers = أ.INSTANCE.boolean("Отображать на других игроках", false, "showOtherPlayers");
   private const val OUTER_ALPHA: Float = 0.42F
   @JvmStatic
   private ColorSetting glowColor = أ.INSTANCE.color("Цвет", Color(255, 232, 96, 210), "glowColor");
   private const val DEPTH_OFFSET: Double = 0.012
   @JvmStatic
   private Identifier glowTexture;
   private const val MAX_DISTANCE_SQUARED: Double = 9216.0
   private const val INNER_ALPHA: Float = 0.28F

   fun emitLayer(up: VertexConsumer, color: Entry, width: Vector3f, height: Vector3f, centerY: Float, right: Float, buffer: Float, pose: Color, alpha: Float) {
      val halfWidth: Float = width * 0.5F
      val halfHeight: Float = height * 0.5F
      val packedAlpha: Int = RangesKt.coerceIn((int)(alpha * 255.0F), 0, 255)
      this.emitVertex(buffer, pose, right, up, centerY, -halfWidth, -halfHeight, 0.0F, 1.0F, color, packedAlpha)
      this.emitVertex(buffer, pose, right, up, centerY, halfWidth, -halfHeight, 1.0F, 1.0F, color, packedAlpha)
      this.emitVertex(buffer, pose, right, up, centerY, halfWidth, halfHeight, 1.0F, 0.0F, color, packedAlpha)
      this.emitVertex(buffer, pose, right, up, centerY, -halfWidth, halfHeight, 0.0F, 0.0F, color, packedAlpha)
   }

   private fun glowPulse(): Float {
      return 0.88F + ((float)Math.sin((double)System.nanoTime() * 1.8E-9) + 1.0F) * 0.5F * 0.12F
   }

   fun shouldRender(entity: Entity?): Boolean {
      if (!this.isEnabled() || شآ.isRenderingPreview()) {
         false
      } else if (glowColor.getValue().getAlpha() <= 0) {
         false
      } else {
         val var10000: PlayerEntity = entity as? PlayerEntity
         if ((entity as? PlayerEntity) == null) {
            false
         } else {
            val var4: ClientPlayerEntity = ضك.getMc().player
            if (var4 == null) {
               false
            } else if (var10000.isAlive() && !var10000.isInvisible() && !var10000.isSpectator()) {
               val var10001: GameRenderer = ضك.getMc().gameRenderer
               if (var10000.squaredDistanceTo(طث.getPos(طث.getCamera(var10001))) > 9216.0) {
                  false
               } else {
                  if (var10000 === var4) !ضك.getMc().options.getPerspective().isFirstPerson() else showOtherPlayers.getValue()
               }
            } else {
               false
            }
         }
      }
   }

   @JvmStatic
   fun {
      val var10000: Identifier = Identifier.of("rain", "images/particles/glow.png")
      glowTexture = var10000
   }

   fun emitVertex(
      v: VertexConsumer,
      horizontal: Entry,
      pose: Vector3f,
      right: Vector3f,
      vertical: Float,
      u: Float,
      alpha: Float,
      color: Float,
      up: Float,
      buffer: Color,
      centerY: Int
   ) {
      buffer.vertex(pose, right.x * horizontal + up.x * vertical, centerY + right.y * horizontal + up.y * vertical, right.z * horizontal + up.z * vertical)
         .texture(u, v)
         .color(color.getRed(), color.getGreen(), color.getBlue(), alpha)
      }
}

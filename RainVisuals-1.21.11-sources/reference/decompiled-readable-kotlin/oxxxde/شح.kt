package oxxxde

import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.JumpCircleModule$Circle
import kotakbaz.rain.module.setting.ClientColorSetting
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
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
import net.minecraft.util.Identifier
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionfc
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object شح : Module("JumpCircle", RENDER, "Визуальные следы при прыжке") {
   @JvmStatic
   private SliderSetting spawnDuration = Module.slider$default(شح.INSTANCE, "Длительность спавна", 5.0F, 1.0F, 20.0F, 1.0F, null, 32, null);
   @JvmStatic
   private SliderSetting lifeTime = Module.slider$default(شح.INSTANCE, "Время жизни", 5.0F, 1.0F, 20.0F, 1.0F, null, 32, null);
   @JvmStatic
   private SliderSetting dieDuration = Module.slider$default(شح.INSTANCE, "Длительность ухода", 5.0F, 1.0F, 20.0F, 1.0F, null, 32, null);
   @JvmStatic
   private ClientColorSetting circleColor = Module.clientColor$default(شح.INSTANCE, "Цвет", Color(255, 255, 255, 255), null, 4, null);
   @JvmStatic
   private Identifier rainTexture;
   @JvmStatic
   private SliderSetting size = Module.slider$default(شح.INSTANCE, "Размер", 2.0F, 1.0F, 6.0F, 0.1F, null, 32, null);
   @JvmStatic
   private Identifier glowingTexture;
   private const val STYLE_GLOWING: Int = 0
   private const val STYLE_RAIN: Int = 1
   @JvmStatic
   private ModeSetting style = Module.mode$default(INSTANCE, "Стиль", CollectionsKt.listOf("Сияющий", "Рэйн"), 0, null, 12, null);
   private final val circles: ArrayList<تط> = ArrayList()
   private const val BUFFER_SIZE: Int = 262144

   @Commando
   public fun onPlayerUpdate(event: سح) {
      if (!circles.isEmpty()) {
         CollectionsKt.removeAll(circles, <unrepresentable>.INSTANCE)
      }
   }

   @JvmStatic
   fun {
      var var1: Identifier = Identifier.of("rain", "textures/world/circle/jump.png")
      glowingTexture = var1
      var1 = Identifier.of("rain", "textures/world/circle/jump2.png")
      rainTexture = var1
   }

   public override fun onDisable() {
      circles.clear()
   }

   private fun spawnCircle(x: Double, y: Double, z: Double) {
      circles.add(JumpCircleModule$Circle(x, y, z, size.getValue().floatValue(), this.lifeTimeMillis(), this.spawnDurationMillis(), this.dieDurationMillis()))
   }

   fun selectedTexture(): Identifier {
      var var10000: Identifier
      when (style.selectedIndex) {
         0 -> var10000 = glowingTexture
         1 -> var10000 = rainTexture
         else -> var10000 = glowingTexture
      }

      var10000
   }

   @Commando
   public fun onJump(event: زش) {
      val player: ClientPlayerEntity = ضك.getMc().player
      if (player != null) {
         this.spawnCircle(player.getX(), player.getY() + 0.125, player.getZ())
      }
   }

   private fun dieDurationMillis(): Long {
      return RangesKt.coerceAtLeast((int)dieDuration.getValue().floatValue(), 1) * 50L
   }

   private fun lifeTimeMillis(): Long {
      return RangesKt.coerceAtLeast((int)lifeTime.getValue().floatValue(), 1) * 50L
   }

   private fun spawnDurationMillis(): Long {
      return RangesKt.coerceAtLeast((int)spawnDuration.getValue().floatValue(), 1) * 50L
   }

   fun renderCircle(
      consumers: JumpCircleModule$Circle, circle: MatrixStack, cameraY: Immediate, cameraX: RenderLayer, layer: Double, cameraZ: Double, matrices: Double
   ) {
      circle.updateAnimations()
      val alphaProgress: Float = circle.alpha()
      if (!(alphaProgress <= 0.0F)) {
         val animatedSize: Float = circle.size * circle.scale()
         if (!(animatedSize <= 0.0F)) {
            val half: Float = animatedSize * 0.5F
            val selectedColor: Color = circleColor.value
            val alpha: Int = RangesKt.coerceIn((int)(alphaProgress * (float)selectedColor.getAlpha()), 0, 255)
            val red: Int = (float)selectedColor.getRed()
            val green: Int = selectedColor.getGreen()
            val blue: Int = selectedColor.getBlue()
            val flipHorizontally: Boolean = style.selectedIndex == 1
            val leftU: Float = if (flipHorizontally) 1.0F else 0.0F
            val rightU: Float = if (flipHorizontally) 0.0F else 1.0F
            matrices.push()
            matrices.translate(circle.x - cameraX, circle.y - cameraY, circle.z - cameraZ)
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(90.0F) as Quaternionfc)
            matrices.translate(-((double)half), -((double)half), 0.01)
            val var10000: Entry = matrices.peek()
            val var89: VertexConsumer = consumers.getBuffer(layer)
            val var90: VertexConsumer = var89.vertex(var10000, 0.0F, 0.0F, 0.0F)
            val var91: VertexConsumer = var90.color((int)red, green, blue, alpha)
            val var92: VertexConsumer = var89.vertex(var10000, animatedSize, 0.0F, 0.0F)
            val var93: VertexConsumer = var92.color((int)red, green, blue, alpha)
            val var94: VertexConsumer = var89.vertex(var10000, animatedSize, animatedSize, 0.0F)
            val var95: VertexConsumer = var94.color((int)red, green, blue, alpha)
            val var96: VertexConsumer = var89.vertex(var10000, 0.0F, animatedSize, 0.0F)
            val var97: VertexConsumer = var96.color((int)red, green, blue, alpha)
            matrices.pop()
         }
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         if (!circles.isEmpty()) {
            val allocator: BufferAllocator = BufferAllocator(262144)

            try {
               val var18: Boolean = true
               val var10000: Immediate = VertexConsumerProvider.immediate(allocator)
               val consumers: Immediate = var10000
               val matrices: MatrixStack = event.getMatrices()
               val var20: GameRenderer = ضك.getMc().gameRenderer
               val cameraPos: Vec3d = طث.getPos(طث.getCamera(var20))
               val layer: RenderLayer = RainRenderLayers.getJumpCircle(this.selectedTexture())

               for (`element$iv` in circles) {
                  val circle: JumpCircleModule$Circle = `element$iv` as JumpCircleModule$Circle
                  val var21: شح = INSTANCE
                  var21.renderCircle(circle, matrices, consumers, layer, cameraPos.x, cameraPos.y, cameraPos.z)
               }

               consumers.draw()
            } finally {
               if (var14) {
                  allocator.close()
               }
            }

            allocator.close()
            val var14: Boolean
         }
      }
   }
}

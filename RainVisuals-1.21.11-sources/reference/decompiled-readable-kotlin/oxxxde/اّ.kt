package oxxxde

import java.awt.Color
import java.util.ArrayList
import kotakbaz.rain.event.events.Render3DEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.TrailsModule$TrailPoint
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.class_243
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.option.GameOptions
import net.minecraft.client.render.Camera
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.Identifier
import net.minecraft.util.math.Box
import net.minecraft.util.math.MathHelper
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionfc
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object اّ : Module("Trails", RENDER, "Визуальный след за игроком") {
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(INSTANCE, "Цвет клиента", false, null, 4, null);
   @JvmStatic
   private Identifier pointTexture;
   @JvmStatic
   private Identifier glowTexture;
   private final val trail: ArrayList<Pair<Long, class_243>> = ArrayList()
   @JvmStatic
   private ColorSetting trailColor;
   @JvmStatic
   private SliderSetting length = Module.slider$default(INSTANCE, "Длина", 0.3F, 0.1F, 2.0F, 0.1F, null, 32, null);
   @JvmStatic
   private SliderSetting size = Module.slider$default(INSTANCE, "Размер", 2.0F, 0.5F, 4.0F, 0.1F, null, 32, null).setVisible({ 
      mode.selectedIndex == 1
   });
   @JvmStatic
   private ModeSetting mode = Module.mode$default(INSTANCE, "Стиль", CollectionsKt.listOf("Линия", "Новый"), 0, null, 12, null);

   public override fun onDisable() {
      trail.clear()
   }

   fun renderLineMode(player: Render3DEvent, lifetimeSeconds: PlayerEntity, event: Double) {
      if (trail.size() >= 2) {
         val var10000: GameRenderer = ضك.getMc().gameRenderer
         val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
         val `$this$mapNotNullTo$iv$iv`: java.lang.Iterable = trail
         val `destination$iv$iv`: java.util.Collection = ArrayList()

         for (`element$iv$iv$iv` in `$this$mapNotNullTo$iv$iv`) {
            val createdAt: Long = ((`element$iv$iv$iv` as Pair).component1() as java.lang.Number).longValue()
            val position: Vec3d = (`element$iv$iv$iv` as Pair).component2() as Vec3d
            val alphaValue: Int = INSTANCE.alpha(createdAt, lifetimeSeconds)
            val var26: TrailsModule$TrailPoint = if (alphaValue <= 0) null else TrailsModule$TrailPoint(position, alphaValue)
            if (var26 != null) {
               `destination$iv$iv`.add(var26)
            }
         }

         val points: java.util.List = `destination$iv$iv` as java.util.List
         if ((`destination$iv$iv` as java.util.List).size() >= 2) {
            this.renderRibbonFill(event, player, cameraPos, points)
            this.renderRibbonLine(event, player, cameraPos, points, false)
            this.renderRibbonLine(event, player, cameraPos, points, true)
         }
      }
   }

   private fun selectedColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else trailColor.getValue()
   }

   fun resolveSpriteTexture(): Identifier {
      if (mode.selectedIndex == 1) glowTexture else pointTexture
   }

   fun renderRibbonFill(event: Render3DEvent, points: PlayerEntity, player: Vec3d, cameraPos: MutableList<TrailsModule$TrailPoint>) {
      val var5: AutoCloseable = BufferAllocator(262144) as AutoCloseable
      var var6: java.lang.Throwable = null

      try {
         val var10000: Immediate = VertexConsumerProvider.immediate(var5 as BufferAllocator)
         val layer: RenderLayer = RainRenderLayers.getHitBoxQuad(true)
         val var34: VertexConsumer = var10000.getBuffer(layer)
         val buffer: VertexConsumer = var34
         val var35: Box = player.getBoundingBox()
         val hitboxHeight: Float = RangesKt.coerceAtLeast((float)طث.getLengthY(var35), طث.getHeight(player as Entity))
         val bottomOffset: Float = 0.02F
         val topOffset: Float = 0.02F
         event.getMatrices().push()
         event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z)
         val var36: Entry = event.getMatrices().peek()
         val entry: Entry = var36
         var `$this$draw$iv`: Int = 0

         for (`layer$iv` in CollectionsKt.getLastIndex(points)..`$this$draw$iv`) {
            val `$i$f$draw`: TrailsModule$TrailPoint = points.get(`$this$draw$iv`) as TrailsModule$TrailPoint
            val next: TrailsModule$TrailPoint = points.get(`$this$draw$iv` + 1) as TrailsModule$TrailPoint
            val currentColor: Color = INSTANCE.tintedColor(`$i$f$draw`.alpha)
            val nextColor: Color = INSTANCE.tintedColor(next.alpha)
            val bottomY: Float = (float)`$i$f$draw`.getPosition().y + bottomOffset
            val topY: Float = (float)`$i$f$draw`.getPosition().y + hitboxHeight - topOffset
            val nextBottomY: Float = (float)next.getPosition().y + bottomOffset
            val nextTopY: Float = (float)next.getPosition().y + hitboxHeight - topOffset
            INSTANCE.addRibbonQuad(
               buffer,
               entry,
               (float)`$i$f$draw`.getPosition().x,
               bottomY,
               (float)`$i$f$draw`.getPosition().z,
               (float)`$i$f$draw`.getPosition().x,
               topY,
               (float)`$i$f$draw`.getPosition().z,
               (float)next.getPosition().x,
               nextTopY,
               (float)next.getPosition().z,
               (float)next.getPosition().x,
               nextBottomY,
               (float)next.getPosition().z,
               currentColor,
               nextColor
            )
         }

         event.getMatrices().pop()
         var10000.draw(layer)
      } catch (var28: java.lang.Throwable) {
         var6 = var28
         throw var28
      } finally {
         AutoCloseableKt.closeFinally(var5, var6)
      }
   }

   private fun maxTrailPoints(): Int {
      return RangesKt.coerceAtLeast((int)(length.getValue().floatValue() * 240.0F), 120)
   }

   public override fun onEnable() {
      trail.clear()
   }

   @JvmStatic
   fun {
      val var1: Module = INSTANCE
      val var10002: Color = Color.WHITE
      trailColor = Module.color$default(var1, "Цвет", var10002, null, 4, null).setVisible({ 
         !useClientColor.getValue()
      })
      val var2: Identifier = Identifier.of("rain", "images/particles/glow.png")
      glowTexture = var2
      val var3: Identifier = Identifier.of("rain", "images/particles/point.png")
      pointTexture = var3
   }

   private fun tintedColor(alpha: Int): Color {
      val baseColor: Color = this.selectedColor()
      return Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn(alpha, 0, 255))
   }

   fun getSmoothPos(partialTicks: PlayerEntity, entity: Float): Vec3d {
      val var10000: Vec3d = entity.getLerpedPos(partialTicks)
      var10000
   }

   fun addRibbonQuad(
      z4: VertexConsumer,
      buffer: Entry,
      endColor: Float,
      y2: Float,
      y1: Float,
      entry: Float,
      z1: Float,
      x2: Float,
      z3: Float,
      y4: Float,
      y3: Float,
      z2: Float,
      startColor: Float,
      x1: Float,
      x4: Color,
      x3: Color
   ) {
      buffer.vertex(entry, x1, y1, z1).color(startColor.getRed(), startColor.getGreen(), startColor.getBlue(), startColor.getAlpha())
      buffer.vertex(entry, x2, y2, z2).color(startColor.getRed(), startColor.getGreen(), startColor.getBlue(), startColor.getAlpha())
      buffer.vertex(entry, x3, y3, z3).color(endColor.getRed(), endColor.getGreen(), endColor.getBlue(), endColor.getAlpha())
      buffer.vertex(entry, x4, y4, z4).color(endColor.getRed(), endColor.getGreen(), endColor.getBlue(), endColor.getAlpha())
   }

   fun renderNewMode(lifetimeSeconds: Render3DEvent, player: PlayerEntity, event: Double) {
      if (!trail.isEmpty()) {
         val var10000: GameRenderer = ضك.getMc().gameRenderer
         val camera: Camera = طث.getCamera(var10000)
         val cameraPos: Vec3d = طث.getPos(camera)
         val layer: RenderLayer = RainRenderLayers.getTrailSprite(this.resolveSpriteTexture())
         val allocator: BufferAllocator = BufferAllocator(262144)

         try {
            val var30: Immediate = VertexConsumerProvider.immediate(allocator)
            val var31: VertexConsumer = var30.getBuffer(layer)
            val buffer: VertexConsumer = var31
            val baseColor: Color = this.selectedColor()
            val `$this$draw$iv`: java.lang.Iterable = trail
            val `index$iv`: Int = 0

            for (`item$iv` in `$this$draw$iv`) {
               if (`index$iv`++ < 0) {
                  CollectionsKt.throwIndexOverflow()
               }

               val entry: Pair = `item$iv` as Pair
               val var33: Vec3d = ((`item$iv` as Pair).second as Vec3d).subtract(cameraPos)
               val alpha: Int = INSTANCE.alpha((entry.first as java.lang.Number).longValue(), lifetimeSeconds)
               if (alpha > 0) {
                  val finalColor: Color = Color(baseColor.getRed(), baseColor.getGreen(), baseColor.getBlue(), RangesKt.coerceIn(alpha, 0, 255))
                  val scale: Float = size.getValue().floatValue()
                  event.getMatrices().push()
                  event.getMatrices().translate(var33.x, var33.y + (double)طث.getHeight(player as Entity) * 0.5, var33.z)
                  event.getMatrices().multiply(camera.getRotation() as Quaternionfc)
                  event.getMatrices().scale(0.1F, 0.1F, 0.1F)
                  val var34: Entry = event.getMatrices().peek()
                  buffer.vertex(var34, -scale, scale, 0.0F)
                     .color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha())
                     .texture(0.0F, 0.0F)
                     buffer.vertex(var34, scale, scale, 0.0F)
                     .color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha())
                     .texture(1.0F, 0.0F)
                     buffer.vertex(var34, scale, -scale, 0.0F)
                     .color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha())
                     .texture(1.0F, 1.0F)
                     buffer.vertex(var34, -scale, -scale, 0.0F)
                     .color(finalColor.getRed(), finalColor.getGreen(), finalColor.getBlue(), finalColor.getAlpha())
                     .texture(0.0F, 1.0F)
                     event.getMatrices().pop()
               }
            }

            var30.draw()
         } finally {
            allocator.close()
         }
      }
   }

   fun renderRibbonLine(event: Render3DEvent, top: PlayerEntity, points: Vec3d, cameraPos: MutableList<TrailsModule$TrailPoint>, player: Boolean) {
      val var6: AutoCloseable = BufferAllocator(262144) as AutoCloseable
      var var7: java.lang.Throwable = null

      try {
         val var10000: Immediate = VertexConsumerProvider.immediate(var6 as BufferAllocator)
         val layer: RenderLayer = RainRenderLayers.getHitBoxLine(3.0)
         val var39: VertexConsumer = var10000.getBuffer(layer)
         val buffer: VertexConsumer = var39
         val var40: Box = player.getBoundingBox()
         val hitboxHeight: Float = RangesKt.coerceAtLeast((float)طث.getLengthY(var40), طث.getHeight(player as Entity))
         val bottomOffset: Float = 0.02F
         val topOffset: Float = 0.02F
         event.getMatrices().push()
         event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z)
         val var41: Entry = event.getMatrices().peek()
         val entry: Entry = var41

         for (`element$iv` in points) {
            val point: TrailsModule$TrailPoint = `element$iv` as TrailsModule$TrailPoint
            val color: Color = INSTANCE.tintedColor((`element$iv` as TrailsModule$TrailPoint).alpha)
            val y: Float = if (top)
               (float)(`element$iv` as TrailsModule$TrailPoint).getPosition().y + hitboxHeight - topOffset
               else
               (float)(`element$iv` as TrailsModule$TrailPoint).getPosition().y + bottomOffset
               val var42: VertexConsumer = buffer.vertex(entry, (float)point.getPosition().x, y, (float)point.getPosition().z)
               .color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
               val var43: VertexConsumer = var42.normal(entry, 0.0F, 1.0F, 0.0F)
            var43.lineWidth(3.0F)
         }

         event.getMatrices().pop()
         var10000.draw(layer)
      } catch (var33: java.lang.Throwable) {
         var7 = var33
         throw var33
      } finally {
         AutoCloseableKt.closeFinally(var6, var7)
      }
   }

   private fun alpha(createdAt: Long, lifetimeSeconds: Double): Int {
      return MathHelper.clamp(
         (int)(
            150.0
               * (
                  if (lifetimeSeconds * 1000.0 <= 0.0)
                     0.0
                     else
                     (lifetimeSeconds * 1000.0 - (double)(System.currentTimeMillis() - createdAt)) / (lifetimeSeconds * 1000.0)
               )
         ),
         0,
         150
      )
   }

   @Commando
   public fun onRender3D(event: شث) {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 != null) {
         if (this.isEnabled()) {
            if (ضك.getMc().world != null) {
               val lifetimeSeconds: Double = length.getValue().floatValue()
               val lifetimeMillis: Long = RangesKt.coerceAtLeast((long)(lifetimeSeconds * 1000.0), 1L)
               val currentTime: Long = System.currentTimeMillis()
               trail.removeIf({ p0: Any ->
                  `$tmp0`(p0)
               })
               val smoothPos: Vec3d = this.getSmoothPos(var10000 as PlayerEntity, event.partialTicks)
               val var11: Pair = CollectionsKt.lastOrNull(trail)
               val lastTrailPos: Vec3d = if (var11 != null) var11.second as Vec3d else null
               if (lastTrailPos == null || lastTrailPos.squaredDistanceTo(smoothPos) > 1.0E-4) {
                  trail.add(currentTime to smoothPos)

                  while (trail.size() > this.maxTrailPoints()) {
                     trail.remove(0)
                  }
               }

               val var12: GameOptions = ضك.getMc().options
               if (!طث.getPerspective(var12).isFirstPerson()) {
                  if (mode.selectedIndex == 0) {
                     this.renderLineMode(event, var10000 as PlayerEntity, lifetimeSeconds)
                  } else {
                     this.renderNewMode(event, var10000 as PlayerEntity, lifetimeSeconds)
                  }
               }
            }
         }
      }
   }
}

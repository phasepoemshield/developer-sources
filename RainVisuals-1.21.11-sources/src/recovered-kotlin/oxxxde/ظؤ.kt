package oxxxde

import com.mojang.blaze3d.opengl.GlStateManager
import java.awt.Color
import kotakbaz.rain.client.draggable.animation.AnimationUtil
import kotakbaz.rain.client.draggable.animation.Easing
import kotakbaz.rain.event.events.Render3DEvent
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.render.TargetEspModule$RingSweepState
import kotakbaz.rain.module.setting.ModeSetting
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.ColorSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.entity.Entity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.util.Identifier
import net.minecraft.util.math.RotationAxis
import net.minecraft.util.math.Vec3d
import org.joml.Quaternionfc
import org.lwjgl.opengl.GL11
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
@RecompileFormat
public object ظؤ : Module("TargetESP", RENDER, "Метка на вашей цели") {
   @JvmStatic
   private SliderSetting ghostsSpeed = ظؤ.INSTANCE.slider("Скорость", 5.0F, 0.2F, 5.0F, 0.05F, "ghostSpeed").setVisible({ 
      INSTANCE.isGhostsStyle()
   });
   @JvmStatic
   private SliderSetting ghostsAlpha = Module.slider$default(ظؤ.INSTANCE, "Прозрачность", 60.0F, 5.0F, 80.0F, 1.0F, null, 32, null).setVisible({ 
      INSTANCE.isGhostsStyle()
   });
   private final val DAMAGE_RED: Color = Color(255, 35, 35, 255)
   private final var circleStep: Float
   private const val RING_BRIGHT_ALPHA: Float = 0.88F
   private final var lastTargetWidth: Float
   @JvmStatic
   private Vec3d lastTargetPos;
   @JvmStatic
   private SliderSetting markerSize = ظؤ.INSTANCE.slider("Размер", 0.9F, 0.5F, 1.0F, 0.05F, "markerSize").setVisible({ 
      !INSTANCE.isRingStyle() && !INSTANCE.isGhostsStyle()
   });
   @JvmStatic
   private Identifier ghostsTexture;
   private const val STYLE_DIAMOND: Int = 1
   private const val RING_RADIUS_MULTIPLIER: Float = 0.8F
   private final var rotation: Float = 1.0F
   private const val RING_OUTLINE_WIDTH: Double = 1.5
   private const val STYLE_RING: Int = 2
   @JvmStatic
   private PlayerEntity displayTarget;
   @JvmStatic
   private SliderSetting speedMod = ظؤ.INSTANCE.slider("Скорость", 1.5F, 0.5F, 2.0F, 0.05F, "ringSpeed").setVisible({ 
      INSTANCE.isRingStyle()
   });
   private const val MARKER_HIT_RED_BLEND: Float = 0.85F
   private final var lastTargetHeight: Float
   @JvmStatic
   private Identifier diamondTexture;
   private final var markerHitStartedAt: Long
   private const val RING_SEGMENTS: Int = 360
   @JvmStatic
   private Identifier circleTexture;
   @JvmStatic
   private ModeSetting style = Module.mode$default(
      ظؤ.INSTANCE, "Стиль", CollectionsKt.listOf("Кругляшок", "Квадрат", "Кольцо", "Современный", "Призраки"), 0, null, 12, null
   );
   @JvmStatic
   private BooleanSetting useClientColor = Module.boolean$default(ظؤ.INSTANCE, "Цвет клиента", false, null, 4, null).setVisible({ 
      ظث.INSTANCE.isEnabled()
   });
   @JvmStatic
   private SliderSetting ghostsCount = Module.slider$default(ظؤ.INSTANCE, "Количество", 2.0F, 1.0F, 2.0F, 1.0F, null, 32, null).setVisible({ 
      INSTANCE.isGhostsStyle()
   });
   private const val STYLE_CIRCLE: Int = 0
   private const val MARKER_HIT_ANIMATION_MILLIS: Long = 520L
   private const val RING_OUTLINE_ALPHA: Float = 0.16F
   private const val RING_ANIMATION_MILLIS: Long = 500L
   private const val BUFFER_SIZE: Int = 262144
   @JvmStatic
   private Identifier modernTexture;
   @JvmStatic
   private SliderSetting ghostsSize = ظؤ.INSTANCE.slider("Размер", 0.08F, 0.05F, 0.1F, 0.01F, "ghostSize").setVisible({ 
      INSTANCE.isGhostsStyle()
   });
   private const val RING_FADE_ALPHA: Float = 0.01F
   private final var flip: Boolean
   private final var rotationSpeed: Float = 1.0F
   private const val STYLE_GHOSTS: Int = 4
   private final var prevCircleStep: Float
   @JvmStatic
   private SliderSetting ghostsLength = Module.slider$default(ظؤ.INSTANCE, "Длина", 40.0F, 16.0F, 45.0F, 1.0F, null, 32, null).setVisible({ 
      INSTANCE.isGhostsStyle()
   });
   @JvmStatic
   private AnimationUtil showAnimation = AnimationUtil();
   private final var prevRotation: Float
   private const val RING_SWEEP_DURATION_MILLIS: Double = 2000.0
   @JvmStatic
   private BooleanSetting hitAnimation = Module.boolean$default(ظؤ.INSTANCE, "Анимация удара", false, null, 4, null).setVisible({ 
      INSTANCE.isMarkerStyle()
   });
   private const val LEGACY_ANIMATION_MILLIS: Long = 120L
   @JvmStatic
   private SliderSetting ghostsRadius = Module.slider$default(ظؤ.INSTANCE, "Радиус", 0.8F, 0.6F, 1.0F, 0.01F, null, 32, null).setVisible({ 
      INSTANCE.isGhostsStyle()
   });
   private const val MARKER_HIT_SHRINK_IN_MILLIS: Long = 70L
   private const val MARKER_HIT_SHRINK: Float = 0.28F
   private const val STYLE_MODERN: Int = 3
   @JvmStatic
   private ColorSetting espColor = Module.color$default(INSTANCE, "Цвет", Color(255, 255, 255, 255), null, 4, null).setVisible({ 
      !useClientColor.getValue() || !ظث.INSTANCE.isEnabled()
   });

   @Commando
   public fun onUpdate(event: سح) {
      ظً.INSTANCE.update()
      val liveTarget: PlayerEntity = this.resolveLiveTarget()
      if (liveTarget != null) {
         displayTarget = liveTarget
      }

      prevRotation = rotation
      prevCircleStep = circleStep
      val show: Boolean = liveTarget != null
      showAnimation.run(if (liveTarget != null) 1.0 else 0.0, if (this.isRingStyle()) 500L else 120L, Easing.SINE_OUT, true)
      if (!show && showAnimation.get() <= 0.0F) {
         displayTarget = null
         this.resetAnimations()
      } else if (displayTarget != null && !(showAnimation.get() <= 0.0F)) {
         if (this.isRingStyle()) {
            circleStep = circleStep + 0.15F * speedMod.getValue().floatValue()
         } else {
            this.updateLegacyAnimation()
         }
      }
   }

   fun renderGhosts(consumers: Render3DEvent, event: Immediate) {
      val progress: Float = RangesKt.coerceIn(showAnimation.get(), 0.0F, 1.0F)
      if (!(progress <= 0.0F)) {
         val color: Color = this.selectedEspColor()
         val var10000: GameRenderer = ضك.getMc().gameRenderer
         val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
         val var43: VertexConsumer = consumers.getBuffer(RainRenderLayers.getTrailSprite(ghostsTexture))
         val buffer: VertexConsumer = var43
         val time: Double = System.currentTimeMillis() * 0.0016 * ghostsSpeed.getValue().doubleValue()
         val streamCount: Int = RangesKt.coerceIn((int)ghostsCount.getValue().floatValue(), 1, 12)
         val trailPoints: Int = RangesKt.coerceIn((int)ghostsLength.getValue().floatValue(), 1, 128)
         val sizeScale: Float = ghostsSize.getValue().floatValue() / 0.13F
         val radiusScale: java.lang.Float = lastTargetWidth
         val radius: Float = radiusScale.floatValue()
         val var42: Double = (if ((if (radius > 0.0F) radiusScale else null) != null) if (radius > 0.0F) radiusScale else null else 0.6F)
            * 1.5F
            * Math.max(0.5F, 1.2F - 0.5F * progress)
            * (ghostsRadius.getValue().floatValue() / 0.6F)
            val heightScale: Double = 1.0
         val alphaMultiplier: Float = RangesKt.coerceIn(ghostsAlpha.getValue().floatValue(), 0.0F, 100.0F) / 100.0F
         val streamSpacing: Double = (Math.PI * 2) / streamCount
         val pointStep: Double = Math.toRadians(2.0)

         repeat(streamCount) { stream ->
            val streamPhase: Double = stream * streamSpacing

            repeat(trailPoints) { i ->
               val trailTick: Float = i * 2.0F
               val angle: Double = time + streamPhase + i * pointStep
               val targetHeight: Double = lastTargetHeight
               val yOffset: Double = lastTargetHeight * 0.5
                  + (
                        lastTargetHeight / 1.5
                           + lastTargetHeight / 3.0 * Math.sin((double)i * pointStep * 0.5 + time * 0.2 + streamPhase * 0.5)
                           - targetHeight * 0.5
                     )
                     * heightScale
                     val coreSize: Float = (0.13F + 0.005F * trailTick) * sizeScale
               val glowSize: Float = (0.7F + 0.005F * trailTick) * sizeScale
               val alpha: Int = RangesKt.coerceIn((int)((float)color.getAlpha() * progress * alphaMultiplier), 0, 255)
               val glowAlpha: Int = RangesKt.coerceIn((int)((float)alpha * 0.05F), 0, 255)
               if (alpha > 0) {
                  event.getMatrices().push()
                  event.getMatrices()
                     .translate(
                        lastTargetPos.x - cameraPos.x + Math.sin(angle) * var42,
                        lastTargetPos.y - cameraPos.y + yOffset,
                        lastTargetPos.z - cameraPos.z - Math.cos(angle) * var42
                     )
                     val var44: MatrixStack = event.getMatrices()
                  val var10001: GameRenderer = ضك.getMc().gameRenderer
                  var44.multiply(طث.getCamera(var10001).getRotation() as Quaternionfc)
                  event.getMatrices().multiply(RotationAxis.POSITIVE_Z.rotationDegrees((float)i * 17.0F) as Quaternionfc)
                  if (glowAlpha > 0) {
                     val var10002: Entry = event.getMatrices().peek()
                     this.emitSprite(buffer, var10002, glowSize * 0.5F, color, glowAlpha)
                  }

                  val var45: Entry = event.getMatrices().peek()
                  this.emitSprite(buffer, var45, coreSize * 0.5F, color, alpha)
                  event.getMatrices().pop()
               }
            }
         }
      }
   }

   fun renderMarker(event: Render3DEvent, consumers: Immediate) {
      val progress: Float = RangesKt.coerceIn(showAnimation.get(), 0.0F, 1.0F)
      if (!(progress <= 0.0F)) {
         val selectedColor: Color = this.selectedEspColor()
         val alpha: Int = RangesKt.coerceIn((int)((float)selectedColor.getAlpha() * progress), 0, 255)
         if (alpha > 0) {
            val hitPulse: Float = this.markerHitPulse()
            val markerColor: Color = this.blendColor(selectedColor, DAMAGE_RED, hitPulse * 0.85F)
            val spin: Float = prevRotation + (rotation - prevRotation) * event.partialTicks
            val animatedSize: Float = markerSize.getValue().floatValue() * (1.0F + 0.5F * (1.0F - progress)) * (1.0F - 0.28F * hitPulse)
            val half: Float = animatedSize * 0.5F
            val var10000: GameRenderer = ضك.getMc().gameRenderer
            val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
            val layer: RenderLayer = RainRenderLayers.getTargetEsp(this.selectedTexture())
            event.getMatrices().push()
            event.getMatrices()
               .translate(lastTargetPos.x - cameraPos.x, lastTargetPos.y - cameraPos.y + (double)(lastTargetHeight * 0.5F), lastTargetPos.z - cameraPos.z)
               val var16: MatrixStack = event.getMatrices()
            val var10001: GameRenderer = ضك.getMc().gameRenderer
            var16.multiply(طث.getCamera(var10001).getRotation() as Quaternionfc)
            event.getMatrices().multiply(RotationAxis.POSITIVE_Z.rotationDegrees(spin) as Quaternionfc)
            event.getMatrices().translate(-((double)half), -((double)half), 0.0)
            val var17: Entry = event.getMatrices().peek()
            val var18: VertexConsumer = consumers.getBuffer(layer)
            var18.vertex(var17, 0.0F, 0.0F, 0.0F).color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha).texture(0.0F, 1.0F)
            var18.vertex(var17, animatedSize, 0.0F, 0.0F).color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha).texture(1.0F, 1.0F)
            var18.vertex(var17, animatedSize, animatedSize, 0.0F)
               .color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha)
               .texture(1.0F, 0.0F)
               var18.vertex(var17, 0.0F, animatedSize, 0.0F)
               .color(markerColor.getRed(), markerColor.getGreen(), markerColor.getBlue(), alpha)
               .texture(0.0F, 0.0F)
               event.getMatrices().pop()
         }
      }
   }

   private fun resolveRingColors(maxSegments: Int): Array<Color> {
      val color: Color = this.selectedEspColor()
      var var3: Int = 0
      val var4: Int = maxSegments + 1
      val var5: Array<Color> = arrayOfNulls(maxSegments + 1)

      while (var3 < var4) {
         var5[var3] = color
         var3++
      }

      return var5
   }

   private fun selectedEspColor(): Color {
      return if (useClientColor.getValue() && ظث.INSTANCE.isEnabled()) ظث.INSTANCE.getClientColor() else espColor.getValue()
   }

   private fun resetAnimations() {
      rotation = 1.0F
      prevRotation = 0.0F
      rotationSpeed = 1.0F
      flip = false
      circleStep = 0.0F
      prevCircleStep = 0.0F
      markerHitStartedAt = 0L
   }

   private fun markerHitPulse(): Float {
      if (!hitAnimation.getValue()) {
         markerHitStartedAt = 0L
         return 0.0F
      } else if (markerHitStartedAt <= 0L) {
         return 0.0F
      } else {
         val elapsed: Long = System.currentTimeMillis() - markerHitStartedAt
         label26@
         if (elapsed >= 520L) {
            markerHitStartedAt = 0L
            return 0.0F
         } else {
            return if (elapsed <= 70L)
               this.smoothStep(RangesKt.coerceIn((float)elapsed / (float)70L, 0.0F, 1.0F))
               else
               1.0F - this.smoothStep(RangesKt.coerceIn((float)(elapsed - 70L) / (float)450L, 0.0F, 1.0F))
            }
      }
   }

   private fun blendColor(from: Color, to: Color, factor: Float): Color {
      val t: Float = RangesKt.coerceIn(factor, 0.0F, 1.0F)
      return Color(
         RangesKt.coerceIn((int)((float)from.getRed() * (1.0F - t) + (float)to.getRed() * t), 0, 255),
         RangesKt.coerceIn((int)((float)from.getGreen() * (1.0F - t) + (float)to.getGreen() * t), 0, 255),
         RangesKt.coerceIn((int)((float)from.getBlue() * (1.0F - t) + (float)to.getBlue() * t), 0, 255),
         from.getAlpha()
      )
   }

   fun ringPoint(maxSegments: Int, radius: Int, segment: Double): Vec3d {
      val angle: Double = Math.min(segment, maxSegments) * (Math.PI * 2) / maxSegments
      Vec3d(Math.cos(angle) * radius, 0.0, -Math.sin(angle) * radius)
   }

   @Commando
   public fun onAttack(event: ذم) {
      if (this.isEnabled()) {
         val var3: Entity = event.getEntity()
         val var10000: PlayerEntity = var3 as? PlayerEntity
         if ((var3 as? PlayerEntity) != null) {
            if (this.isUsableTarget(var10000)) {
               ظً.INSTANCE.track(var10000)
               if (this.isMarkerStyle() && hitAnimation.getValue()) {
                  markerHitStartedAt = System.currentTimeMillis()
               }
            }
         }
      }
   }

   fun emitSprite(buffer: VertexConsumer, half: Entry, alpha: Float, entry: Color, color: Int) {
      buffer.vertex(entry, -half, half, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0F, 0.0F)
      buffer.vertex(entry, half, half, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0F, 0.0F)
      buffer.vertex(entry, half, -half, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(1.0F, 1.0F)
      buffer.vertex(entry, -half, -half, 0.0F).color(color.getRed(), color.getGreen(), color.getBlue(), alpha).texture(0.0F, 1.0F)
   }

   private fun updateTrackedPosition(partialTicks: Float) {
      if (displayTarget != null) {
         val target: PlayerEntity = displayTarget
         if (this.isUsableTarget(displayTarget)) {
            val var10000: Vec3d = target.getLerpedPos(partialTicks)
            lastTargetPos = var10000
            lastTargetHeight = طث.getHeight(target as Entity)
            lastTargetWidth = طث.getWidth(target as Entity)
         }
      }
   }

   private fun smoothStep(value: Float): Float {
      return value * value * (3.0F - 2.0F * value)
   }

   private fun easeInOutQuad(value: Double): Double {
      return if (value < 0.5) 2.0 * value * value else 1.0 - Math.pow(-2.0 * value + 2.0, 2.0) * 0.5
   }

   fun selectedTexture(): Identifier {
      var var10000: Identifier
      when (style.selectedIndex) {
         0 -> var10000 = circleTexture
         1 -> var10000 = diamondTexture
         2 -> var10000 = circleTexture
         3 -> var10000 = modernTexture
         else -> var10000 = circleTexture
      }

      var10000
   }

   @Commando
   public fun onRender3D(event: شث) {
      if (this.isEnabled()) {
         showAnimation.update()
         if (!(showAnimation.get() <= 0.0F)) {
            this.updateTrackedPosition(event.partialTicks)
            val var2: AutoCloseable = BufferAllocator(262144) as AutoCloseable
            var var3: java.lang.Throwable = null

            try {
               val var10000: Immediate = VertexConsumerProvider.immediate(var2 as BufferAllocator)
               val consumers: Immediate = var10000
               if (INSTANCE.isRingStyle()) {
                  val `$this$draw$iv`: RenderLayer = RainRenderLayers.getHitBoxQuad(true)
                  val `$i$f$draw`: RenderLayer = RainRenderLayers.getHitBoxLine(1.5)
                  GlStateManager._enableBlend()
                  GlStateManager._blendFuncSeparate(770, 1, 1, 0)
                  GlStateManager._enableDepthTest()
                  GlStateManager._disableCull()
                  GL11.glEnable(2848)
                  GL11.glHint(3154, 4354)

                  try {
                     val var22: ظؤ = INSTANCE
                     var22.renderRing(event, consumers, `$this$draw$iv`, `$i$f$draw`)
                  } finally {
                     GL11.glDisable(2848)
                     GlStateManager._enableCull()
                     GlStateManager._enableDepthTest()
                     GlStateManager._disableBlend()
                  }
               } else {
                  if (style.selectedIndex == 4) {
                     INSTANCE.renderGhosts(event, var10000)
                  } else {
                     INSTANCE.renderMarker(event, var10000)
                  }

                  var10000.draw()
               }
            } catch (var17: java.lang.Throwable) {
               var3 = var17
               throw var17
            } finally {
               AutoCloseableKt.closeFinally(var2, var3)
            }
         }
      }
   }

   fun resolveLiveTarget(): PlayerEntity {
      val var10000: PlayerEntity = ظً.INSTANCE.currentTarget()
      if (var10000 == null) {
         null
      } else {
         if (!this.isUsableTarget(var10000)) null else var10000
      }
   }

   private fun resolveRingSweep(frameTime: Long, targetHeight: Double): شف {
      val duration: Double = RangesKt.coerceAtLeast(2000.0 / (double)speedMod.getValue().floatValue(), 350.0)
      val var17: Double = this.easeInOutQuad(
         RangesKt.coerceIn(
            if ((double)(frameTime % (long)duration) > duration * 0.5)
               (double)(frameTime % (long)duration) / (duration * 0.5) - 1.0
               else
               1.0 - (double)(frameTime % (long)duration) / (duration * 0.5),
            0.0,
            1.0
         )
      )
      return TargetEspModule$RingSweepState(
         targetHeight * var17,
         targetHeight / 1.2 * (if (var17 > 0.5) 1.0 - var17 else var17) * (if (frameTime % (long)duration > duration * 0.5) -1.0 else 1.0)
      )
   }

   private fun isRingStyle(): Boolean {
      return style.selectedIndex == 2
   }

   public override fun onDisable() {
      displayTarget = null
      val var10000: Vec3d = Vec3d.ZERO
      lastTargetPos = var10000
      lastTargetHeight = 0.0F
      lastTargetWidth = 0.0F
      this.resetAnimations()
      showAnimation.snap(0.0)
   }

   private fun isGhostsStyle(): Boolean {
      return style.selectedIndex == 4
   }

   private fun isMarkerStyle(): Boolean {
      return style.selectedIndex == 0 || style.selectedIndex == 1 || style.selectedIndex == 3
   }

   fun renderRing(outlineLayer: Render3DEvent, fillLayer: Immediate, consumers: RenderLayer, event: RenderLayer) {
      if (displayTarget != null) {
         val target: PlayerEntity = displayTarget
         if (this.isUsableTarget(displayTarget)) {
            val progress: Float = RangesKt.coerceIn(showAnimation.get(), 0.0F, 1.0F)
            if (!(progress <= 0.0F)) {
               val radius: Float = طث.getWidth(target as Entity) * 0.8F
               val sweepState: TargetEspModule$RingSweepState = this.resolveRingSweep(System.currentTimeMillis(), (double)lastTargetHeight)
               val var10000: GameRenderer = ضك.getMc().gameRenderer
               val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
               val centerX: Double = lastTargetPos.x - cameraPos.x
               val centerY: Double = lastTargetPos.y - cameraPos.y
               val centerZ: Double = lastTargetPos.z - cameraPos.z
               val var44: Entry = event.getMatrices().peek()
               val entry: Entry = var44
               val ringColors: Array<Color> = this.resolveRingColors(360)
               val var45: VertexConsumer = consumers.getBuffer(fillLayer)
               val quadBuffer: VertexConsumer = var45
               val brightY: Float = (float)(centerY + sweepState.leadingEdgeY)
               val fadeY: Float = (float)(brightY + sweepState.trailOffset)

               // $VF: Unable to resugar Kotlin loop from Java for loop
               var outlineBuffer: Int = 0
               while (true) {
                  if (outlineBuffer < 360) break
                  val `$this$draw$iv`: Vec3d = this.ringPoint((int)outlineBuffer, 360, (double)radius)
                  val `layer$iv`: Vec3d = this.ringPoint(outlineBuffer + 1, 360, (double)radius)
                  this.drawColoredQuad(
                     quadBuffer,
                     entry,
                     (float)(centerX + `$this$draw$iv`.x),
                     brightY,
                     (float)(centerZ + `$this$draw$iv`.z),
                     بح.INSTANCE.setAlpha(ringColors[outlineBuffer], 0.88F * progress),
                     (float)(centerX + `$this$draw$iv`.x),
                     fadeY,
                     (float)(centerZ + `$this$draw$iv`.z),
                     بح.INSTANCE.setAlpha(ringColors[outlineBuffer], 0.01F * progress),
                     (float)(centerX + `layer$iv`.x),
                     fadeY,
                     (float)(centerZ + `layer$iv`.z),
                     بح.INSTANCE.setAlpha(ringColors[outlineBuffer + 1], 0.01F * progress),
                     (float)(centerX + `layer$iv`.x),
                     brightY,
                     (float)(centerZ + `layer$iv`.z),
                     بح.INSTANCE.setAlpha(ringColors[outlineBuffer + 1], 0.88F * progress)
                  )

                  outlineBuffer++
               }

               consumers.draw(fillLayer)
               val var46: VertexConsumer = consumers.getBuffer(outlineLayer)
               val var34: VertexConsumer = var46

               repeat(360) { var36 ->
                  val var39: Vec3d = this.ringPoint(var36, 360, (double)radius)
                  val var41: Color = بح.INSTANCE.setAlpha(ringColors[var36], 0.16F * progress)
                  val var47: VertexConsumer = var34.vertex(entry, (float)(centerX + var39.x), brightY, (float)(centerZ + var39.z))
                     .color(var41.getRed(), var41.getGreen(), var41.getBlue(), var41.getAlpha())
                     val var48: VertexConsumer = var47.normal(entry, 0.0F, 1.0F, 0.0F)
                  var48.lineWidth(1.5F)
               }

               consumers.draw(outlineLayer)
            }
         }
      }
   }

   fun drawColoredQuad(
      z4: VertexConsumer,
      y3: Entry,
      z3: Float,
      x3: Float,
      y2: Float,
      x2: Color,
      quadBuffer: Float,
      z1: Float,
      color2: Float,
      z2: Color,
      y4: Float,
      y1: Float,
      color4: Float,
      color3: Color,
      entry: Float,
      x1: Float,
      x4: Float,
      color1: Color
   ) {
      quadBuffer.vertex(entry, x1, y1, z1).color(color1.getRed(), color1.getGreen(), color1.getBlue(), color1.getAlpha())
      quadBuffer.vertex(entry, x2, y2, z2).color(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha())
      quadBuffer.vertex(entry, x3, y3, z3).color(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha())
      quadBuffer.vertex(entry, x4, y4, z4).color(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha())
   }

   @JvmStatic
   fun {
      var var1: Identifier = Identifier.of("rain", "textures/world/target/marker.png")
      circleTexture = var1
      var1 = Identifier.of("rain", "textures/world/target/target.png")
      diamondTexture = var1
      var1 = Identifier.of("rain", "textures/world/target/modern.png")
      modernTexture = var1
      var1 = Identifier.of("rain", "textures/world/target/glow.png")
      ghostsTexture = var1
      val var5: Vec3d = Vec3d.ZERO
      lastTargetPos = var5
   }

   fun isUsableTarget(player: PlayerEntity): Boolean {
      !player.isRemoved() && player.isAlive() && !player.isInvisible()
   }

   private fun updateLegacyAnimation() {
      if (showAnimation.get() > 0.8F) {
         rotation = rotation + rotationSpeed
         if (rotation >= 360.0F) {
            rotation -= 360.0F
            prevRotation -= 360.0F
         } else if (rotation <= -360.0F) {
            rotation += 360.0F
            prevRotation += 360.0F
         }

         if (rotationSpeed > 25.0F) {
            flip = true
         }

         if (rotationSpeed < -25.0F) {
            flip = false
         }
      }

      rotationSpeed = (if (flip) rotationSpeed - 0.5F else rotationSpeed + 0.5F) * showAnimation.get()
   }
}

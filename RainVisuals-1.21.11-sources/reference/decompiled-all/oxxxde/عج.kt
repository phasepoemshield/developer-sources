package oxxxde

import java.awt.Color
import kotlin.math.MathKt
import net.minecraft.block.BlockState
import net.minecraft.client.world.ClientWorld
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.hit.HitResult
import net.minecraft.util.hit.HitResult.Type
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Box
import net.minecraft.util.shape.VoxelShape
import net.minecraft.world.BlockView
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object عج : دِ("BlockOverlay", ظن.getRENDER(), "Настраиваемая обводка на блоки") {
   private final val lineWidth: طُ = دِ.slider$default(عج.INSTANCE, "Толщина обводки", 1.5F, 1.0F, 5.0F, 0.1F, null, 32, null)
   private const val BOX_EXPANSION: Double = 0.002
   private const val MOVE_SPEED: Float = 13.0F
   @JvmStatic
   private Box currentBox;
   private final val fill: خذ = دِ.boolean$default(INSTANCE, "Заполнение блока", false, null, 4, null)

   private final val fillOpacity: طُ = دِ.slider$default(INSTANCE, "Прозрачность заполнения", 25.0F, 10.0F, 70.0F, 1.0F, null, 32, null).setVisible({ 
      fill.getValue()
   })

   private final val overlayColor: رت
   private const val MODE_DASHED: String = "Пунктир"
   private const val FADE_SPEED: Float = 10.0F

   private final val outlineMode: ظي = دِ.mode$default(INSTANCE, "Режим обводки", CollectionsKt.listOf("Обводка", "Пунктир"), 0, null, 12, null).setVisible({ 
      outline.getValue()
   })

   private final val outline: خذ = دِ.boolean$default(INSTANCE, "Обводка блока", true, null, 4, null)
   private const val MODE_OUTLINE: String = "Обводка"
   @JvmStatic
   private ClientWorld trackedWorld;
   private final var alpha: Float
   private final val smoothMovement: خذ = دِ.boolean$default(INSTANCE, "Плавное перемещение оверлея", true, null, 4, null)
   private final var lastFrameNanos: Long

   fun targetedBlockBox(world: ClientWorld): Box {
      val state: HitResult = ضك.getMc().crosshairTarget
      val var10000: BlockHitResult = state as? BlockHitResult
      if ((state as? BlockHitResult) == null) {
         null
      } else if (var10000.getType() === Type.BLOCK && !var10000.isAgainstWorldBorder()) {
         val var9: BlockPos = var10000.getBlockPos()
         val var10: BlockState = world.getBlockState(var9)
         if (var10.isAir()) {
            null
         } else {
            val var11: VoxelShape = var10.getOutlineShape(world as BlockView, var9)
            val var12: Box
            if (var11.isEmpty()) {
               var12 = Box(var9)
            } else {
               val var7: Box = var11.getBoundingBox().offset((double)var9.getX(), (double)var9.getY(), (double)var9.getZ())
               var12 = var7
            }

            var12.expand(0.002)
         }
      } else {
         null
      }
   }

   @Commando
   public fun onRender3D(event: شث) {
      val var10000: ClientWorld = ضك.getMc().world
      if (var10000 != null) {
         if (trackedWorld != var10000) {
            this.resetState(var10000)
         }

         val deltaSeconds: Float = this.frameDeltaSeconds()
         val targetBox: Box = this.targetedBlockBox(var10000)
         this.updatePosition(targetBox, deltaSeconds)
         alpha = this.approach(alpha, if (targetBox == null || !fill.getValue() && !outline.getValue()) 0.0F else 1.0F, 10.0F, deltaSeconds)
         val box: Box = currentBox
         if (currentBox != null && !(alpha <= 0.003F)) {
            val baseColor: Color = overlayColor.getValue()
            val animationAlpha: Float = RangesKt.coerceIn(alpha, 0.0F, 1.0F)
            بع.render$default(
               بع.INSTANCE,
               event,
               CollectionsKt.listOf(box),
               if (fill.getValue())
                  Color(
                     baseColor.getRed(),
                     baseColor.getGreen(),
                     baseColor.getBlue(),
                     RangesKt.coerceIn(MathKt.roundToInt(255.0F * (fillOpacity.getValue().floatValue() / 100.0F) * animationAlpha), 0, 255)
                  )
                  else
                  null,
               if (outline.getValue())
                  Color(
                     baseColor.getRed(),
                     baseColor.getGreen(),
                     baseColor.getBlue(),
                     RangesKt.coerceIn(MathKt.roundToInt((float)baseColor.getAlpha() * animationAlpha), 0, 255)
                  )
                  else
                  null,
               lineWidth.getValue().floatValue(),
               outlineMode.getValue() == "Пунктир",
               0.0F,
               64,
               null
            )
         } else {
            if (targetBox == null) {
               currentBox = null
            }
         }
      }
   }

   @JvmStatic
   fun {
      val var10000: دِ = INSTANCE
      val var10002: Color = Color.WHITE
      overlayColor = دِ.color$default(var10000, "Цвет", var10002, null, 4, null)
   }

   fun resetState(world: ClientWorld) {
      trackedWorld = world
      currentBox = null
      alpha = 0.0F
      lastFrameNanos = 0L
   }

   public override fun onEnable() {
      this.resetState(ضك.getMc().world)
   }

   private fun approach(current: Float, target: Float, speed: Float, deltaSeconds: Float): Float {
      return current + (target - current) * this.smoothingFactor(speed, deltaSeconds)
   }

   public fun shouldReplaceVanillaOutline(): Boolean {
      return this.isEnabled()
   }

   fun updatePosition(deltaSeconds: Box, target: Float) {
      if (target != null) {
         val current: Box = currentBox
         if (currentBox != null && smoothMovement.getValue()) {
            val factor: Float = this.smoothingFactor(13.0F, deltaSeconds)
            currentBox = Box(
               this.lerp(current.minX, target.minX, factor),
               this.lerp(current.minY, target.minY, factor),
               this.lerp(current.minZ, target.minZ, factor),
               this.lerp(current.maxX, target.maxX, factor),
               this.lerp(current.maxY, target.maxY, factor),
               this.lerp(current.maxZ, target.maxZ, factor)
            )
         } else {
            currentBox = target
         }
      }
   }

   private fun frameDeltaSeconds(): Float {
      val now: Long = System.nanoTime()
      if (lastFrameNanos == 0L) {
         lastFrameNanos = now
         return 0.016666668F
      } else {
         val delta: Float = (float)RangesKt.coerceAtMost((double)RangesKt.coerceAtLeast(now - lastFrameNanos, 0L) / 1.0E9, 0.1)
         lastFrameNanos = now
         return delta
      }
   }

   public override fun onDisable() {
      this.resetState(null)
   }

   private fun lerp(from: Double, to: Double, factor: Float): Double {
      return from + (to - from) * factor
   }

   private fun smoothingFactor(speed: Float, deltaSeconds: Float): Float {
      return RangesKt.coerceIn((float)(1.0 - Math.exp((double)(-speed * deltaSeconds))), 0.0F, 1.0F)
   }
}

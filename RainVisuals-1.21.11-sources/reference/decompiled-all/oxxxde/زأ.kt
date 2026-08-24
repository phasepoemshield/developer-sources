package oxxxde

import com.mojang.blaze3d.systems.RenderSystem
import java.util.ArrayList
import net.minecraft.client.gui.screen.ChatScreen
import net.minecraft.client.network.ClientPlayerEntity
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.item.ItemRenderState
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.item.ItemStack
import net.minecraft.util.Hand
import org.joml.Matrix4f
import org.joml.Matrix4fc
import org.joml.Vector3f
import org.joml.Vector3fc
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object زأ : دِ("ViewModel", ظن.getRENDER(), "Настраивает размер и положение предметов в руках") {
   private final var renderedRightScale: Float = 1.0F
   private final val leftZ: طُ = دِ.slider$default(زأ.INSTANCE, "Левый Z", 0.0F, -2.0F, 2.0F, 0.01F, null, 32, null)
   private final val leftScale: طُ = زأ.INSTANCE.slider("Размер левого предмета", 1.0F, 0.25F, 2.0F, 0.05F, "leftScale")
   @JvmStatic
   private Hand draggingHand;
   private final var rightScaleUpdatedAt: Long
   private final val rightScale: طُ = زأ.INSTANCE.slider("Размер правого предмета", 1.0F, 0.25F, 2.0F, 0.05F, "rightScale")
   private final val offsetTransform: Matrix4f = Matrix4f()
   private const val RENDERED_BOUNDS_MAX_AGE_NANOS: Long = 250000000L
   private const val MINIMUM_HITBOX_SIZE_PIXELS: Double = 22.0
   private final val xProbeTransform: Matrix4f = Matrix4f()
   private final val currentProjection: ضخ = ضخ()
   private final val xProbeProjection: ضخ = ضخ()
   private final val rightX: طُ = دِ.slider$default(زأ.INSTANCE, "Правый X", 0.0F, -2.0F, 2.0F, 0.001F, null, 32, null)
   private final val offHandBounds: ضآ = ضآ()
   private final val renderedTransform: Matrix4f = Matrix4f()
   private final val remainderTransform: Matrix4f = Matrix4f()
   private final val leftX: طُ = دِ.slider$default(زأ.INSTANCE, "Левый X", 0.0F, -2.0F, 2.0F, 0.001F, null, 32, null)
   @JvmStatic
   private Hand capturedHand;
   private const val HITBOX_PADDING_PIXELS: Double = 6.0
   private const val POSITION_PROBE_DISTANCE: Float = 0.01F
   private final val mainHandBounds: ضآ = ضآ()
   private final val leftY: طُ = دِ.slider$default(زأ.INSTANCE, "Левый Y", 0.0F, -2.0F, 2.0F, 0.001F, null, 32, null)
   private final var dragGrabOffsetX: Double
   private final val rightZ: طُ = دِ.slider$default(زأ.INSTANCE, "Правый Z", 0.0F, -2.0F, 2.0F, 0.01F, null, 32, null)
   private final var capturedTickProgress: Float
   private final val projectedExtent: Vector3f = Vector3f()
   private final var dragGrabOffsetY: Double
   private final val yProbeTransform: Matrix4f = Matrix4f()
   private final val rightY: طُ = دِ.slider$default(زأ.INSTANCE, "Правый Y", 0.0F, -2.0F, 2.0F, 0.001F, null, 32, null)
   private final var renderedLeftScale: Float = 1.0F
   private final val yProbeProjection: ضخ = ضخ()
   private final var leftScaleUpdatedAt: Long
   private const val MIN_JACOBIAN_DETERMINANT: Double = 1.0E-7

   fun positionZ(hand: Hand): طُ {
      if (hand === Hand.MAIN_HAND) rightZ else leftZ
   }

   public fun scrollChatItem(mouseX: Double, mouseY: Double, verticalAmount: Double, screenWidth: Int, screenHeight: Int): Boolean {
      if (this.isEnabled() && verticalAmount != 0.0) {
         val var10000: ظم = this.hoveredTarget(mouseX, mouseY, screenWidth, screenHeight)
         if (var10000 != null) {
            val var11: Hand = var10000.getHand()
            if (var11 != null) {
               val setting: طُ = this.scale(var11)
               setting.setClamped(setting.getValue().floatValue() + (float)Math.signum(verticalAmount) * 0.05F)
               return true
            }
         }

         return false
      } else {
         return false
      }
   }

   public override fun onDisable() {
      this.endChatDrag()
      capturedHand = null
      mainHandBounds.invalidate()
      offHandBounds.invalidate()
   }

   public override fun onEnable() {
      renderedRightScale = rightScale.getValue().floatValue()
      renderedLeftScale = leftScale.getValue().floatValue()
      rightScaleUpdatedAt = System.nanoTime()
      leftScaleUpdatedAt = rightScaleUpdatedAt
      mainHandBounds.invalidate()
      offHandBounds.invalidate()
   }

   @Commando
   public fun onHandOffset(event: سع) {
      if (event.getHand() === Hand.MAIN_HAND) {
         event.getMatrices().translate(rightX.getValue().floatValue(), rightY.getValue().floatValue(), rightZ.getValue().floatValue())
      } else {
         event.getMatrices().translate(leftX.getValue().floatValue(), leftY.getValue().floatValue(), leftZ.getValue().floatValue())
      }
   }

   fun endItemBoundsCapture(hand: Hand) {
      if (capturedHand === hand) {
         capturedHand = null
      }
   }

   private fun smoothScale(current: Float, target: Float, now: Long, previousUpdate: Long): Float {
      if (previousUpdate == 0L) {
         return target
      } else {
         val result: Float = current
            + (target - current) * (float)(1.0 - Math.exp(-RangesKt.coerceIn((double)(now - previousUpdate) / 1.0E9, 0.0, 0.05) * 18.0))
            return if (Math.abs(target - result) < 0.001F) target else result
      }
   }

   fun captureRenderedBounds(state: ItemRenderState, renderedPose: Entry) {
      if (this.isEnabled() && ضك.getMc().currentScreen is ChatScreen) {
         if (capturedHand != null) {
            val hand: Hand = capturedHand
            val bounds: ضآ = this.renderedBounds(capturedHand)
            if (bounds.offsetBaseReady) {
               bounds.offsetBaseReady = false
               val width: Int = ضك.getMc().getWindow().getScaledWidth()
               val height: Int = ضك.getMc().getWindow().getScaledHeight()
               if (width > 0 && height > 0) {
                  val var10000: GameRenderer = ضك.getMc().gameRenderer
                  val var10001: GameRenderer = ضك.getMc().gameRenderer
                  val projectionTan: Double = Math.tan(Math.toRadians((double)var10000.getFov(طث.getCamera(var10001), capturedTickProgress, false) * 0.5))
                  if (Math.abs(projectionTan) <= java.lang.Double.MAX_VALUE && !(projectionTan <= 0.0)) {
                     val settingX: Float = this.positionX(hand).getValue().floatValue()
                     val settingY: Float = this.positionY(hand).getValue().floatValue()
                     val settingZ: Float = this.positionZ(hand).getValue().floatValue()
                     val renderedMatrix: Matrix4f = renderedTransform.set(RenderSystem.getModelViewMatrix() as Matrix4fc)
                        .mul(renderedPose.getPositionMatrix() as Matrix4fc)
                        offsetTransform.set(bounds.offsetBasePose as Matrix4fc).translate(settingX, settingY, settingZ)
                     if (!(Math.abs(offsetTransform.determinant()) < 1.0E-7F)) {
                        remainderTransform.set(offsetTransform as Matrix4fc).invert().mul(renderedMatrix as Matrix4fc)
                        xProbeTransform.set(bounds.offsetBasePose as Matrix4fc)
                           .translate(settingX + 0.01F, settingY, settingZ)
                           .mul(remainderTransform as Matrix4fc)
                           yProbeTransform.set(bounds.offsetBasePose as Matrix4fc)
                           .translate(settingX, settingY + 0.01F, settingZ)
                           .mul(remainderTransform as Matrix4fc)
                           currentProjection.reset()
                        xProbeProjection.reset()
                        yProbeProjection.reset()
                        state.load({ extent: Vector3fc ->
                           projectedExtent.set(extent).mulPosition(`$renderedMatrix` as Matrix4fc)
                           currentProjection.include(projectedExtent, `$halfWidth`, `$halfHeight`, `$projectionTan`)
                           projectedExtent.set(extent).mulPosition(xProbeTransform as Matrix4fc)
                           xProbeProjection.include(projectedExtent, `$halfWidth`, `$halfHeight`, `$projectionTan`)
                           projectedExtent.set(extent).mulPosition(yProbeTransform as Matrix4fc)
                           yProbeProjection.include(projectedExtent, `$halfWidth`, `$halfHeight`, `$projectionTan`)
                        })
                        if (currentProjection.isValid && xProbeProjection.isValid && yProbeProjection.isValid) {
                           val centerX: Double = currentProjection.centerX
                           val centerY: Double = currentProjection.centerY
                           val jacobianXX: Double = (xProbeProjection.centerX - centerX) / 0.01F / width
                           val jacobianYX: Double = (xProbeProjection.centerY - centerY) / 0.01F / height
                           val jacobianXY: Double = (yProbeProjection.centerX - centerX) / 0.01F / width
                           val jacobianYY: Double = (yProbeProjection.centerY - centerY) / 0.01F / height
                           if (Math.abs(jacobianXX) <= java.lang.Double.MAX_VALUE
                              && Math.abs(jacobianYX) <= java.lang.Double.MAX_VALUE
                              && Math.abs(jacobianXY) <= java.lang.Double.MAX_VALUE
                              && Math.abs(jacobianYY) <= java.lang.Double.MAX_VALUE) {
                              bounds.update(
                                 currentProjection.minX / (double)width,
                                 currentProjection.minY / (double)height,
                                 currentProjection.maxX / (double)width,
                                 currentProjection.maxY / (double)height,
                                 centerX / (double)width,
                                 centerY / (double)height,
                                 jacobianXX,
                                 jacobianXY,
                                 jacobianYX,
                                 jacobianYY,
                                 settingX,
                                 settingY
                              )
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   fun handHitbox(screenWidth: Hand, screenHeight: Int, hand: Int): رْ {
      val bounds: ضآ = this.renderedBounds(hand)
      if (!bounds.isFresh()) {
         null
      } else {
         val rawLeft: Double = bounds.minX * screenWidth
         val rawTop: Double = bounds.minY * screenHeight
         val rawRight: Double = bounds.maxX * screenWidth
         val rawBottom: Double = bounds.maxY * screenHeight
         val centerX: Double = (rawLeft + rawRight) * 0.5
         val centerY: Double = (rawTop + rawBottom) * 0.5
         val halfWidth: Double = Math.max((rawRight - rawLeft) * 0.5 + 6.0, 11.0)
         val halfHeight: Double = Math.max((rawBottom - rawTop) * 0.5 + 6.0, 11.0)
         رْ(centerX - halfWidth, centerY - halfHeight, centerX + halfWidth, centerY + halfHeight)
      }
   }

   public fun endChatDrag(): Boolean {
      val wasDragging: Boolean = draggingHand != null
      draggingHand = null
      dragGrabOffsetX = 0.0
      dragGrabOffsetY = 0.0
      return wasDragging
   }

   public fun dragChatItem(mouseX: Double, mouseY: Double, screenWidth: Int, screenHeight: Int): Boolean {
      if (draggingHand == null) {
         return false
      } else {
         val hand: Hand = draggingHand
         if (this.isEnabled() && screenWidth > 0 && screenHeight > 0) {
            val bounds: ضآ = this.renderedBounds(hand)
            if (!bounds.isFresh()) {
               return true
            } else {
               val xSetting: طُ = this.positionX(hand)
               val ySetting: طُ = this.positionY(hand)
               val pendingX: Float = xSetting.getValue().floatValue() - bounds.settingX
               val pendingY: Float = ySetting.getValue().floatValue() - bounds.settingY
               val predictedCenterX: Double = bounds.centerX + bounds.jacobianXX * pendingX + bounds.jacobianXY * pendingY
               val predictedCenterY: Double = bounds.centerY + bounds.jacobianYX * pendingX + bounds.jacobianYY * pendingY
               val desiredCenterX: Double = mouseX / screenWidth - dragGrabOffsetX
               val desiredCenterY: Double = mouseY / screenHeight - dragGrabOffsetY
               val errorX: Double = desiredCenterX - predictedCenterX
               val errorY: Double = desiredCenterY - predictedCenterY
               val determinant: Double = bounds.jacobianXX * bounds.jacobianYY - bounds.jacobianXY * bounds.jacobianYX
               if (Math.abs(determinant) <= java.lang.Double.MAX_VALUE && !(Math.abs(determinant) < 1.0E-7)) {
                  val correctionX: Double = (errorX * bounds.jacobianYY - bounds.jacobianXY * errorY) / determinant
                  val correctionY: Double = (bounds.jacobianXX * errorY - errorX * bounds.jacobianYX) / determinant
                  if (Math.abs(correctionX) <= java.lang.Double.MAX_VALUE && Math.abs(correctionY) <= java.lang.Double.MAX_VALUE) {
                     xSetting.setClamped(xSetting.getValue().floatValue() + (float)correctionX)
                     ySetting.setClamped(ySetting.getValue().floatValue() + (float)correctionY)
                     return true
                  } else {
                     return true
                  }
               } else {
                  return true
               }
            }
         } else {
            this.endChatDrag()
            return false
         }
      }
   }

   fun captureHandOffsetBase(hand: Hand, pose: Entry) {
      if (this.isEnabled() && ضك.getMc().currentScreen is ChatScreen) {
         val bounds: ضآ = this.renderedBounds(hand)
         bounds.offsetBasePose.set(RenderSystem.getModelViewMatrix() as Matrix4fc).mul(pose.getPositionMatrix() as Matrix4fc)
         bounds.offsetBaseReady = true
      }
   }

   fun renderedBounds(hand: Hand): ضآ {
      if (hand === Hand.MAIN_HAND) mainHandBounds else offHandBounds
   }

   private fun hoveredTarget(mouseX: Double, mouseY: Double, screenWidth: Int, screenHeight: Int): ظم? {
      val var10000: ClientPlayerEntity = ضك.getMc().player
      if (var10000 == null) {
         return null
      } else {
         val player: ClientPlayerEntity = var10000
         if (screenWidth > 0 && screenHeight > 0) {
            val `iterator$iv`: java.lang.Iterable = CollectionsKt.listOf(Hand.MAIN_HAND, Hand.OFF_HAND)
            val `minElem$iv`: java.util.Collection = ArrayList()

            for (`element$iv$iv$iv` in `iterator$iv`) {
               val hand: Hand = `element$iv$iv$iv` as Hand
               val hitbox: ItemStack = if (`element$iv$iv$iv` as Hand === Hand.MAIN_HAND) player.getMainHandStack() else player.getOffHandStack()
               val var44: ظم
               if (hitbox.isEmpty()) {
                  var44 = null
               } else {
                  val var45: رْ = INSTANCE.handHitbox(hand, screenWidth, screenHeight)
                  if (var45 == null) {
                     var44 = null
                  } else if (!var45.contains(mouseX, mouseY)) {
                     var44 = null
                  } else {
                     val normalizedDeltaX: Double = (mouseX - var45.centerX) / screenWidth
                     val normalizedDeltaY: Double = (mouseY - var45.centerY) / screenHeight
                     var44 = ظم(hand, var45, normalizedDeltaX * normalizedDeltaX + normalizedDeltaY * normalizedDeltaY)
                  }
               }

               if (var44 != null) {
                  `minElem$iv`.add(var44)
               }
            }

            val var34: java.util.Iterator = (`minElem$iv` as java.util.List).iterator()
            val var46: Any
            if (!var34.hasNext()) {
               var46 = null
            } else {
               var var35: Any = var34.next()
               if (!var34.hasNext()) {
                  var46 = var35
               } else {
                  var var37: Double = (var35 as ظم).distanceSquared

                  do {
                     val var39: Any = var34.next()
                     val var41: Double = (var39 as ظم).distanceSquared
                     if (java.lang.Double.compare(var37, var41) > 0) {
                        var35 = var39
                        var37 = var41
                     }
                  } while (var34.hasNext())

                  var46 = var35
               }
            }

            return var46 as ظم
         } else {
            return null
         }
      }
   }

   fun positionY(hand: Hand): طُ {
      if (hand === Hand.MAIN_HAND) rightY else leftY
   }

   public fun beginChatDrag(mouseX: Double, mouseY: Double, screenWidth: Int, screenHeight: Int): Boolean {
      draggingHand = null
      if (this.isEnabled() && screenWidth > 0 && screenHeight > 0) {
         val var10000: ظم = this.hoveredTarget(mouseX, mouseY, screenWidth, screenHeight)
         if (var10000 == null) {
            return false
         } else {
            draggingHand = var10000.getHand()
            dragGrabOffsetX = mouseX / screenWidth - var10000.getHitbox().centerX / screenWidth
            dragGrabOffsetY = mouseY / screenHeight - var10000.getHitbox().centerY / screenHeight
            return true
         }
      } else {
         return false
      }
   }

   fun scale(hand: Hand): طُ {
      if (hand === Hand.MAIN_HAND) rightScale else leftScale
   }

   fun beginItemBoundsCapture(hand: Hand, tickProgress: Float) {
      capturedHand = hand
      capturedTickProgress = tickProgress
   }

   fun animatedScale(hand: Hand): Float {
      if (!this.isEnabled()) {
         1.0F
      } else {
         val now: Long = System.nanoTime()
         val var10000: Float
         if (hand === Hand.MAIN_HAND) {
            val result: Float = this.smoothScale(renderedRightScale, rightScale.getValue().floatValue(), now, rightScaleUpdatedAt)
            renderedRightScale = result
            rightScaleUpdatedAt = now
            var10000 = result
         } else {
            val var5: Float = this.smoothScale(renderedLeftScale, leftScale.getValue().floatValue(), now, leftScaleUpdatedAt)
            renderedLeftScale = var5
            leftScaleUpdatedAt = now
            var10000 = var5
         }

         var10000
      }
   }

   fun positionX(hand: Hand): طُ {
      if (hand === Hand.MAIN_HAND) rightX else leftX
   }
}

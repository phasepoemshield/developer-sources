package oxxxde

import java.awt.Color
import java.util.HashMap
import java.util.Map.Entry
import kotakbaz.rain.client.draggable.animation.Easing
import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.ui.menu.misc.TextScroller$ScrollState
import org.joml.Vector3f

// $VF: Compiled from heavy
public class بق(durationMs: Long = 3000L, pauseMs: Long = 0L, fadeTransitionMs: Long = 0L) {
   private final val scratchPos: Vector3f
   private final var lastCleanupMs: Long
   public final var fadeTransitionMs: Long
   public final var durationMs: Long
   @Deprecated
   @JvmStatic
   public long STATE_TTL_MS = 15000L;
   @Deprecated
   @JvmStatic
   public float EPSILON = 0.001F;
   @Deprecated
   @JvmStatic
   public long CLEANUP_INTERVAL_MS = 2000L;
   @Deprecated
   @JvmStatic
   public long RETURN_ANIMATION_MS = 220L;
   private final val states: HashMap<Int, ظ>
   @JvmStatic
   private صُ Companion = صُ(null);
   private final var paddingBetweenTexts: Float
   public final var pauseMs: Long

   private fun intersects(drawX: Float, textWidth: Float, clipMinX: Float, clipMaxX: Float, padding: Float): Boolean {
      return drawX < clipMaxX + padding && drawX + textWidth > clipMinX - padding
   }

   private fun updateOffset(state: ظ, hovered: Boolean, cycleDistance: Float, nowNs: Long, safeScale: Float): Float {
      val prevNs: Long = state.lastUpdateNs
      state.lastUpdateNs = nowNs
      state.wrappedThisFrame = false
      if (cycleDistance <= 0.0F) {
         state.offset = 0.0F
         state.hovered = hovered
         return 0.0F
      } else {
         val deltaSec: Float = if (prevNs == 0L) 0.0F else Math.max(0.0F, (float)(nowNs - prevNs) / 1.0E9F)
         val cycleDurationSec: Float = RangesKt.coerceAtLeast((float)this.durationMs * safeScale, 1.0F) / 1000.0F
         val scrollSpeed: Float = if (cycleDurationSec <= 0.0F) cycleDistance else cycleDistance / cycleDurationSec
         if (hovered) {
            if (!state.hovered) {
               state.returnAnimation.snap((double)state.offset)
               if (this.pauseMs > 0L && state.offset <= 0.001F) {
                  state.pauseUntilNs = nowNs + this.pauseMs * 1000000L
               }
            }

            if (nowNs >= state.pauseUntilNs) {
               state.pauseUntilNs = 0L
               state.offset = state.offset + scrollSpeed * deltaSec

               while (state.offset >= cycleDistance) {
                  state.offset = state.offset - cycleDistance
                  state.wrappedThisFrame = true
                  if (this.pauseMs > 0L) {
                     state.offset = 0.0F
                     state.pauseUntilNs = nowNs + this.pauseMs * 1000000L
                     break
                  }
               }
            }
         } else {
            if (state.hovered) {
               state.returnAnimation.snap((double)state.offset)
               state.returnAnimation.run(0.0, 220L, Easing.SINE_OUT)
            }

            state.returnAnimation.update()
            state.offset = state.returnAnimation.get()
            if (Math.abs(state.offset) < 0.001F) {
               state.offset = 0.0F
            }
         }

         val var10001: Float
         if (state.offset <= 0.001F) {
            var10001 = 0.0F
         } else if (this.fadeTransitionMs <= 0L) {
            var10001 = 1.0F
         } else {
            val fadeDistance: Float = RangesKt.coerceAtLeast(scrollSpeed * (float)this.fadeTransitionMs / 1000.0F, 0.001F)
            var10001 = RangesKt.coerceIn(
               Math.min(state.offset / fadeDistance, RangesKt.coerceAtLeast(cycleDistance - state.offset, 0.0F) / fadeDistance), 0.0F, 1.0F
            )
         }

         state.leftFadeBlend = var10001
         state.hovered = hovered
         return state.offset
      }
   }

   private fun drawSingle(
      font: جً,
      text: String,
      drawX: Float,
      drawY: Float,
      size: Float,
      color: Color,
      clipX: Float,
      widthLimit: Float,
      bothSidesFade: Boolean,
      scrollFadeBlend: Float,
      safeScale: Float
   ) {
      var fadeMin: Float = this.toTransformedX(clipX)
      var fadeMax: Float = this.toTransformedX(clipX + widthLimit)
      if (fadeMin > fadeMax) {
         val fadeRange: Float = fadeMin
         fadeMin = fadeMax
         fadeMax = fadeRange
      }

      val baseFadeWidth: Float = Math.max(3.0F * safeScale, Math.min((fadeMax - fadeMin) * 0.14F, 10.0F * safeScale))
      val leftFadeWidth: Float = if (bothSidesFade) baseFadeWidth * scrollFadeBlend else 0.0F
      if (bothSidesFade) {
         font.setFade(fadeMin, fadeMax, leftFadeWidth, baseFadeWidth)
      } else {
         font.setFade(fadeMin, fadeMax, 0.0F, baseFadeWidth)
      }

      try {
         Font.drawText$default(font, text, drawX, drawY, size, color, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
      } finally {
         font.resetFade()
      }
   }

   private fun stateKey(text: String, clipX: Float, y: Float, width: Float, size: Float): Int {
      return 31
            * (
               31 * (31 * (31 * text.hashCode() + java.lang.Float.floatToIntBits(clipX)) + java.lang.Float.floatToIntBits(y))
                  + java.lang.Float.floatToIntBits(width)
            )
         + java.lang.Float.floatToIntBits(size)
      }

   private fun getState(text: String, clipX: Float, y: Float, width: Float, size: Float, nowMs: Long): ظ {
      val key: Int = this.stateKey(text, clipX, y, width, size)
      val `$this$getOrPut$iv`: java.util.Map = this.states
      val `key$iv`: Any = key
      val `value$iv`: Any = `$this$getOrPut$iv`.get(`key$iv`)
      val var10000: Any
      if (`value$iv` == null) {
         val var15: TextScroller$ScrollState = TextScroller$ScrollState()
         `$this$getOrPut$iv`.put(`key$iv`, var15)
         var10000 = var15
      } else {
         var10000 = `value$iv`
      }

      val state: TextScroller$ScrollState = var10000 as TextScroller$ScrollState
      (var10000 as TextScroller$ScrollState).lastSeenMs = nowMs
      return state
   }

   private fun toTransformedX(x: Float): Float {
      this.scratchPos.set(x, 0.0F, 0.0F)
      بد.INSTANCE.transformPosition(this.scratchPos)
      return this.scratchPos.x
   }

   fun بق() {
      this(0L, 0L, 0L, 7, null)
   }

   init {
      super()
      this.durationMs = durationMs
      this.pauseMs = pauseMs
      this.fadeTransitionMs = fadeTransitionMs
      this.states = HashMap<>()
      this.scratchPos = Vector3f()
      this.paddingBetweenTexts = 12.0F
   }

   private fun cleanupStates(nowMs: Long) {
      if (!this.states.isEmpty()) {
         if (nowMs - this.lastCleanupMs >= 2000L) {
            this.lastCleanupMs = nowMs
            val iterator: java.util.Iterator = this.states.entrySet().iterator()

            while (iterator.hasNext()) {
               val var10000: Any = iterator.next()
               if (nowMs - ((var10000 as Entry).getValue() as TextScroller$ScrollState).lastSeenMs > 15000L) {
                  iterator.remove()
               }
            }
         }
      }
   }

   public fun draw(font: جً, text: String, x: Float, y: Float, size: Float, color: Color, width: Float, hovered: Boolean, uiScale: Float = ...) {
      if (text.length() != 0 && !(width <= 0.0F)) {
         val textWidth: Float = Font.getWidth$default(font, text, size, 0.0F, 4, null)
         if (!(textWidth <= width) && !(width <= 0.0F)) {
            val safeScale: Float = RangesKt.coerceAtLeast(uiScale, 0.01F)
            val nowNs: Long = System.nanoTime()
            val nowMs: Long = nowNs / 1000000L
            val cycleDistance: Float = textWidth + Math.max(size, this.paddingBetweenTexts * safeScale)
            val state: TextScroller$ScrollState = this.getState(text, x, y, width, size, nowMs)
            val offset: Float = this.updateOffset(state, hovered, cycleDistance, nowNs, safeScale)
            val scrollFadeBlend: Float = state.leftFadeBlend
            val applyBothSidesFade: Boolean = scrollFadeBlend > 0.001F
            val clipMaxX: Float = x + width
            val visibilityPadding: Float = Math.max(size, this.paddingBetweenTexts * safeScale)
            val firstX: Float = x - offset
            if (this.intersects(x - offset, textWidth, x, clipMaxX, visibilityPadding)) {
               this.drawSingle(font, text, firstX, y, size, color, x, width, applyBothSidesFade, scrollFadeBlend, safeScale)
            }

            if (hovered && cycleDistance > 0.0F) {
               val secondX: Float = firstX + cycleDistance
               if (this.intersects(firstX + cycleDistance, textWidth, x, clipMaxX, visibilityPadding)) {
                  this.drawSingle(font, text, secondX, y, size, color, x, width, applyBothSidesFade, scrollFadeBlend, safeScale)
               }
            }

            this.cleanupStates(nowMs)
         } else {
            font.resetFade()
            Font.drawText$default(font, text, x, y, size, color, 0.0F, 0.0F, 0.0F, 0, 0.0F, 992, null)
         }
      }
   }
}

package oxxxde

import net.minecraft.client.gui.DrawContext

// $VF: Compiled from heavy
public object زَ {
   private const val DURATION_MS: Float = 260.0F
   private final var startMs: Long
   private final var active: Boolean
   public const val MAX_ALPHA: Int = 210

   @JvmStatic
   fun render(width: DrawContext, height: Int, context: Int) {
      if (active) {
         val alpha: Int = (int)(
            210 * (1.0F - بف.INSTANCE.standardDecelerate(RangesKt.coerceIn((float)(System.currentTimeMillis() - startMs) / 260.0F, 0.0F, 1.0F)))
         )
         if (alpha <= 0) {
            active = false
         } else {
            context.fill(0, 0, width, height, alpha shl 24)
         }
      }
   }

   @JvmStatic
   public fun fadeIn() {
      startMs = System.currentTimeMillis()
      active = true
   }
}

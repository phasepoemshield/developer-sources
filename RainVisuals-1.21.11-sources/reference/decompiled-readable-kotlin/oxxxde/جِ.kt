package oxxxde

import kotakbaz.rain.client.render.main.ChromaRenderer
import kotakbaz.rain.client.render.main.scissor.A
import org.joml.Vector3f
import org.joml.Vector4f

// $VF: Compiled from heavy
public object جِ {
   private final val NO_SCISSOR: Vector4f = Vector4f(-100000.0F, -100000.0F, 100000.0F, 100000.0F)
   private final val CACHE_SCISSOR: Vector4f = Vector4f(-1.0F)
   private final val START_POS: Vector3f = Vector3f()
   private final val END_POS: Vector3f = Vector3f()

   public fun start(x: Float, y: Float, width: Float, height: Float) {
      START_POS.set(x, y, 0.0F)
      END_POS.set(x + width, y + height, 0.0F)
      بد.INSTANCE.transformPosition(START_POS)
      بد.INSTANCE.transformPosition(END_POS)
      ChromaRenderer.scissorStack
         .push(A(Math.min(START_POS.x, END_POS.x), Math.min(START_POS.y, END_POS.y), Math.abs(END_POS.x - START_POS.x), Math.abs(END_POS.y - START_POS.y)))
      }

   public fun getCurrentScissorValues(): Vector4f {
      if (ChromaRenderer.scissorStack.current == null) {
         return NO_SCISSOR
      } else {
         val rect: A = ChromaRenderer.scissorStack.current
         val scale: Float = ضك.getMc().getWindow().getScaleFactor()
         val h: Float = ضك.getMc().getWindow().getFramebufferHeight()
         val realX: Float = rect.x() * scale
         val realY: Float = rect.y() * scale
         CACHE_SCISSOR.set(realX, h - (realY + rect.height() * scale), realX + rect.width() * scale, h - realY)
         return CACHE_SCISSOR
      }
   }

   public fun end() {
      ChromaRenderer.scissorStack.pop()
   }
}

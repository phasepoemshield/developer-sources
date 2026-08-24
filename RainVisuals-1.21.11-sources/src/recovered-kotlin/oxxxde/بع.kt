package oxxxde

import java.awt.Color
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.class_238
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
public object بع {
   private const val BUFFER_SIZE: Int = 1048576

   public fun render(
      event: شث,
      boxes: Iterable<class_238>,
      fillColor: Color? = ...,
      outlineColor: Color? = ...,
      lineWidth: Float = ...,
      dashed: Boolean = ...,
      dashLength: Float = ...
   ) {
      val boxList: java.util.List = CollectionsKt.toList(boxes)
      if (!boxList.isEmpty()) {
         if ((if (fillColor != null) fillColor.getAlpha() else 0) > 0 || (if (outlineColor != null) outlineColor.getAlpha() else 0) > 0) {
            val var10000: GameRenderer = ضك.getMc().gameRenderer
            val cameraPos: Vec3d = طث.getPos(طث.getCamera(var10000))
            val var10: AutoCloseable = BufferAllocator(1048576) as AutoCloseable
            var var11: java.lang.Throwable = null

            try {
               val var42: Immediate = VertexConsumerProvider.immediate(var10 as BufferAllocator)
               val quadConsumers: Immediate = var42
               val var43: VertexConsumer = var42.getBuffer(RainRenderLayers.getHitBoxQuad(true))
               val quadBuffer: VertexConsumer = var43
               if (outlineColor != null && outlineColor.getAlpha() > 0 && !dashed) {
                  val var37: AutoCloseable = BufferAllocator(1048576) as AutoCloseable
                  var var38: java.lang.Throwable = null

                  try {
                     val var44: Immediate = VertexConsumerProvider.immediate(var37 as BufferAllocator)
                     val var45: VertexConsumer = var44.getBuffer(RainRenderLayers.getHitBoxLine((double)lineWidth))
                     render$lambda$0$drawBoxes(boxList, cameraPos, fillColor, outlineColor, event, quadBuffer, dashed, lineWidth, dashLength, var45)
                     quadConsumers.draw()
                     var44.draw()
                  } catch (var32: java.lang.Throwable) {
                     var38 = var32
                     throw var32
                  } finally {
                     AutoCloseableKt.closeFinally(var37, var38)
                  }
               } else {
                  render$lambda$0$drawBoxes(boxList, cameraPos, fillColor, outlineColor, event, var43, dashed, lineWidth, dashLength, null)
                  var42.draw()
               }
            } catch (var34: java.lang.Throwable) {
               var11 = var34
               throw var34
            } finally {
               AutoCloseableKt.closeFinally(var10, var11)
            }
         }
      }
   }
}

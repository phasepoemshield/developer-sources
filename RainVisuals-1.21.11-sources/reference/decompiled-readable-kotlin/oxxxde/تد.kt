package oxxxde

import java.awt.Color
import kotakbaz.rain.event.events.Render3DEvent
import kotlin.math.MathKt
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexRendering
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.util.math.Box
import net.minecraft.util.shape.VoxelShapes

// $VF: Compiled from heavy
public object تد {
   private const val MIN_THICKNESS: Float = 0.002F
   private const val THICKNESS_SCALE: Float = 0.005F
   private const val MIN_SEGMENT_LENGTH: Float = 0.001F

   fun emitStripedLine(
      color: VertexConsumer,
      y1: Entry,
      x2: Float,
      gapDistance: Float,
      y2: Float,
      z2: Float,
      lineWidth: Float,
      z1: Float,
      x1: Color,
      buffer: Float,
      entry: Float
   ) {
      if (gapDistance <= 0.0F) {
         this.emitLine(buffer, entry, x1, y1, z1, x2, y2, z2, color, lineWidth)
      } else {
         val dx: Float = x2 - x1
         val dy: Float = y2 - y1
         val dz: Float = z2 - z1
         val totalLength: Float = (float)Math.sqrt((double)(dx * dx + dy * dy + (z2 - z1) * (z2 - z1)))
         if (!(totalLength < 0.001F)) {
            val dashLength: Float = RangesKt.coerceAtLeast(gapDistance, 0.01F)
            if (totalLength <= dashLength * 2.0F) {
               this.emitLine(buffer, entry, x1, y1, z1, x2, y2, z2, color, lineWidth)
            } else {
               val dashCount: Int = Math.max(2, (int)((totalLength + dashLength) / (dashLength * 2.0F)))
               val var28: Float = dashLength + (totalLength - dashLength * dashCount) / (dashCount - 1)

               repeat(dashCount) { var20 ->
                  INSTANCE.emitLine(
                     buffer,
                     entry,
                     x1 + dx * (var28 * (float)var20 / totalLength),
                     y1 + dy * (var28 * (float)var20 / totalLength),
                     z1 + dz * (var28 * (float)var20 / totalLength),
                     x1 + dx * ((if (var20 == dashCount - 1) totalLength else var28 * (float)var20 + dashLength) / totalLength),
                     y1 + dy * ((if (var20 == dashCount - 1) totalLength else var28 * (float)var20 + dashLength) / totalLength),
                     z1 + dz * ((if (var20 == dashCount - 1) totalLength else var28 * (float)var20 + dashLength) / totalLength),
                     color,
                     lineWidth
                  )
               }
            }
         }
      }
   }

   fun emitLine(y2: VertexConsumer, x2: Entry, y1: Float, x1: Float, z2: Float, entry: Float, buffer: Float, z1: Float, color: Color, lineWidth: Float) {
      if (!(lineWidth <= 0.0F)) {
         val dx: Float = Math.abs(x2 - x1)
         val dy: Float = Math.abs(y2 - y1)
         val dz: Float = Math.abs(z2 - z1)
         if (!(dx <= 0.001F) || !(dy <= 0.001F) || !(dz <= 0.001F)) {
            val half: Float = Math.max(lineWidth * 0.005F, 0.002F)
            this.emitSolidBox(
               buffer,
               entry,
               Math.min(x1, x2) - (if (dx <= 0.001F) half else 0.0F),
               Math.min(y1, y2) - (if (dy <= 0.001F) half else 0.0F),
               Math.min(z1, z2) - (if (dz <= 0.001F) half else 0.0F),
               Math.max(x1, x2) + (if (dx <= 0.001F) half else 0.0F),
               Math.max(y1, y2) + (if (dy <= 0.001F) half else 0.0F),
               Math.max(z1, z2) + (if (dz <= 0.001F) half else 0.0F),
               color
            )
         }
      }
   }

   fun emitOutline(x1: VertexConsumer, buffer: Entry, y1: Float, lineWidth: Float, x2: Float, color: Float, z2: Float, y2: Float, z1: Color, entry: Float) {
      this.emitLine(buffer, entry, x1, y1, z1, x2, y1, z1, color, lineWidth)
      this.emitLine(buffer, entry, x2, y1, z1, x2, y1, z2, color, lineWidth)
      this.emitLine(buffer, entry, x2, y1, z2, x1, y1, z2, color, lineWidth)
      this.emitLine(buffer, entry, x1, y1, z2, x1, y1, z1, color, lineWidth)
      this.emitLine(buffer, entry, x1, y2, z1, x2, y2, z1, color, lineWidth)
      this.emitLine(buffer, entry, x2, y2, z1, x2, y2, z2, color, lineWidth)
      this.emitLine(buffer, entry, x2, y2, z2, x1, y2, z2, color, lineWidth)
      this.emitLine(buffer, entry, x1, y2, z2, x1, y2, z1, color, lineWidth)
      this.emitLine(buffer, entry, x1, y1, z1, x1, y2, z1, color, lineWidth)
      this.emitLine(buffer, entry, x2, y1, z1, x2, y2, z1, color, lineWidth)
      this.emitLine(buffer, entry, x1, y1, z2, x1, y2, z2, color, lineWidth)
      this.emitLine(buffer, entry, x2, y1, z2, x2, y2, z2, color, lineWidth)
   }

   fun drawLineBox(buffer: Render3DEvent, color: VertexConsumer, event: Box, lineWidth: Color, box: Float) {
      VertexRendering.drawOutline(event.getMatrices(), buffer, VoxelShapes.cuboid(box), 0.0, 0.0, 0.0, color.getRGB(), RangesKt.coerceAtLeast(lineWidth, 1.0F))
   }

   fun emitSolidBox(y1: VertexConsumer, x1: Entry, buffer: Float, x2: Float, color: Float, y2: Float, z1: Float, entry: Float, z2: Color) {
      this.vertexQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y2, z1, x1, y2, z1, color)
      this.vertexQuad(buffer, entry, x1, y1, z2, x2, y1, z2, x2, y2, z2, x1, y2, z2, color)
      this.vertexQuad(buffer, entry, x1, y1, z1, x1, y1, z2, x1, y2, z2, x1, y2, z1, color)
      this.vertexQuad(buffer, entry, x2, y1, z1, x2, y1, z2, x2, y2, z2, x2, y2, z1, color)
      this.vertexQuad(buffer, entry, x1, y1, z1, x2, y1, z1, x2, y1, z2, x1, y1, z2, color)
      this.vertexQuad(buffer, entry, x1, y2, z1, x2, y2, z1, x2, y2, z2, x1, y2, z2, color)
   }

   fun vertexQuad(
      buffer: VertexConsumer,
      z4: Entry,
      entry: Float,
      z2: Float,
      z1: Float,
      y3: Float,
      y1: Float,
      x3: Float,
      color: Float,
      x2: Float,
      x1: Float,
      x4: Float,
      y4: Float,
      y2: Float,
      z3: Color
   ) {
      buffer.vertex(entry, x1, y1, z1).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
      buffer.vertex(entry, x2, y2, z2).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
      buffer.vertex(entry, x3, y3, z3).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
      buffer.vertex(entry, x4, y4, z4).color(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha())
   }

   fun draw(
      filled: Render3DEvent,
      lineBuffer: VertexConsumer,
      fillAlphaScale: VertexConsumer?,
      event: Box,
      color: Color,
      buffer: Boolean,
      box: Boolean,
      gapDistance: Boolean,
      outlined: Float,
      striped: Float,
      lineWidth: Float
   ) {
      if (color.getAlpha() > 0) {
         val var10000: Entry = event.getMatrices().peek()
         val x1: Float = (float)box.minX
         val y1: Float = (float)box.minY
         val z1: Float = (float)box.minZ
         val x2: Float = (float)box.maxX
         val y2: Float = (float)box.maxY
         val z2: Float = (float)box.maxZ
         if (filled) {
            this.emitSolidBox(
               buffer,
               var10000,
               x1,
               y1,
               z1,
               x2,
               y2,
               z2,
               Color(
                  color.getRed(),
                  color.getGreen(),
                  color.getBlue(),
                  RangesKt.coerceIn(MathKt.roundToInt((float)color.getAlpha() * fillAlphaScale), if (color.getAlpha() > 0) 1 else 0, 255)
               )
            )
         }

         if (outlined) {
            if (lineBuffer != null) {
               INSTANCE.drawLineBox(event, lineBuffer, box, color, lineWidth)
            } else {
               this.emitOutline(buffer, var10000, x1, y1, z1, x2, y2, z2, color, lineWidth)
            }
         }

         if (striped) {
            this.emitStriped(buffer, var10000, x1, y1, z1, x2, y2, z2, color, lineWidth, gapDistance)
         }
      }
   }

   fun emitStriped(
      z1: VertexConsumer,
      y2: Entry,
      z2: Float,
      gapDistance: Float,
      lineWidth: Float,
      y1: Float,
      entry: Float,
      buffer: Float,
      x2: Color,
      x1: Float,
      color: Float
   ) {
      this.emitStripedLine(buffer, entry, x1, y1, z1, x2, y1, z1, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x2, y1, z1, x2, y1, z2, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x2, y1, z2, x1, y1, z2, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x1, y1, z2, x1, y1, z1, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x1, y2, z1, x2, y2, z1, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x2, y2, z1, x2, y2, z2, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x2, y2, z2, x1, y2, z2, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x1, y2, z2, x1, y2, z1, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x1, y1, z1, x1, y2, z1, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x2, y1, z1, x2, y2, z1, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x1, y1, z2, x1, y2, z2, color, lineWidth, gapDistance)
      this.emitStripedLine(buffer, entry, x2, y1, z2, x2, y2, z2, color, lineWidth, gapDistance)
   }
}

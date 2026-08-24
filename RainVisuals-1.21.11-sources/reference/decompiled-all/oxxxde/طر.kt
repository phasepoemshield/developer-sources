package oxxxde

import java.awt.Color
import kotlin.jdk7.AutoCloseableKt
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.client.util.math.MatrixStack.Entry
import net.minecraft.util.math.Vec3d

// $VF: Compiled from heavy
internal object طر {
   private final val hitColor: Color = Color(70, 235, 105, 235)
   private const val END_FADE_SEGMENT_LENGTH: Double = 0.1
   private const val SPHERE_LATITUDE_SEGMENTS: Int = 12
   private const val END_FADE_MAX_DISTANCE: Double = 4.5
   private const val MIN_SEGMENT_LENGTH_SQ: Double = 1.0E-8
   private const val END_FADE_PATH_PORTION: Double = 0.3
   private const val BUFFER_SIZE: Int = 1048576
   private final val missColor: Color = Color(245, 70, 70, 235)
   private const val SPHERE_LONGITUDE_SEGMENTS: Int = 24

   fun spherePoint(latitude: Vec3d, center: Double, radius: Double, longitude: Double): Vec3d {
      val horizontal: Double = Math.cos(latitude) * radius
      Vec3d(center.x + horizontal * Math.cos(longitude), center.y + Math.sin(latitude) * radius, center.z + horizontal * Math.sin(longitude))
   }

   fun addLineVertex(buffer: VertexConsumer, alphaMultiplier: Entry, lineWidth: Vec3d, entry: Vec3d, color: Color, position: Float, normal: Float) {
      buffer.vertex(entry, (float)position.x, (float)position.y, (float)position.z)
         .color(color.getRed(), color.getGreen(), color.getBlue(), RangesKt.coerceIn((int)((float)color.getAlpha() * alphaMultiplier), 0, 255))
         .normal(entry, (float)normal.x, (float)normal.y, (float)normal.z)
         .lineWidth(lineWidth)
      }

   fun render(lineWidth: شث, markerRadius: Vec3d, event: MutableList<بخ>, cameraPos: Float, opacity: Float, predictions: Float) {
      if (!predictions.isEmpty() && !(opacity <= 0.0F)) {
         val clampedOpacity: Float = RangesKt.coerceIn(opacity, 0.0F, 1.0F)
         val var8: AutoCloseable = BufferAllocator(1048576) as AutoCloseable
         var var9: java.lang.Throwable = null

         try {
            var var10000: Immediate = VertexConsumerProvider.immediate(var8 as BufferAllocator)
            val lineLayer: RenderLayer = RainRenderLayers.getHitBoxLine((double)lineWidth)
            val sphereLayer: RenderLayer = RainRenderLayers.getHitBoxQuad(true)
            val var51: VertexConsumer = var10000.getBuffer(sphereLayer)
            val sphereBuffer: VertexConsumer = var51
            event.getMatrices().push()
            event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z)
            val var52: Entry = event.getMatrices().peek()
            val entry: Entry = var52

            for (`element$iv` in predictions) {
               val prediction: بخ = `element$iv` as بخ
               val var23: AutoCloseable = BufferAllocator(1048576) as AutoCloseable
               var var24: java.lang.Throwable = null

               try {
                  var10000 = VertexConsumerProvider.immediate(var23 as BufferAllocator)
                  val var54: VertexConsumer = var10000.getBuffer(lineLayer)
                  val baseColor: Color = if (prediction.hitsTarget) hitColor else missColor
                  val color: Color = Color(
                     baseColor.getRed(),
                     baseColor.getGreen(),
                     baseColor.getBlue(),
                     RangesKt.coerceIn((int)((float)baseColor.getAlpha() * clampedOpacity), 0, 255)
                  )
                  INSTANCE.drawPath(var54, entry, prediction.points, color, lineWidth)
                  var10000.draw(lineLayer)
                  INSTANCE.drawSphere(sphereBuffer, entry, prediction.getImpact().getPosition(), (double)markerRadius, color, clampedOpacity)
               } catch (var42: java.lang.Throwable) {
                  var24 = var42
                  throw var42
               } finally {
                  AutoCloseableKt.closeFinally(var23, var24)
               }
            }

            event.getMatrices().pop()
            var10000.draw(sphereLayer)
         } catch (var44: java.lang.Throwable) {
            var9 = var44
            throw var44
         } finally {
            AutoCloseableKt.closeFinally(var8, var9)
         }
      }
   }

   fun addSphereVertex(latitude: VertexConsumer, opacity: Entry, position: Vec3d, color: Color, entry: Double, buffer: Float) {
      val brightness: Double = 0.72 + 0.28 * ((Math.sin(latitude) + 1.0) * 0.5)
      val shadedColor: Color = Color(
         RangesKt.coerceIn((int)((double)color.getRed() * brightness), 0, 255),
         RangesKt.coerceIn((int)((double)color.getGreen() * brightness), 0, 255),
         RangesKt.coerceIn((int)((double)color.getBlue() * brightness), 0, 255),
         RangesKt.coerceIn((int)(255.0F * opacity), 0, 255)
      )
      buffer.vertex(entry, (float)position.x, (float)position.y, (float)position.z)
         .color(shadedColor.getRed(), shadedColor.getGreen(), shadedColor.getBlue(), shadedColor.getAlpha())
      }

   fun drawPath(color: VertexConsumer, points: Entry, entry: MutableList<Vec3d>, buffer: Color, lineWidth: Float) {
      var totalLength: Int = 0
      val var8: Int = CollectionsKt.getLastIndex(points)
      val fadeDistance: DoubleArray = DoubleArray(var8)

      while (totalLength < var8) {
         fadeDistance[totalLength] = (points.get(totalLength) as Vec3d).distanceTo(points.get(totalLength + 1) as Vec3d)
         totalLength++
      }

      val segmentLengths: DoubleArray = fadeDistance
      val var31: Double = ArraysKt.sum(fadeDistance)
      if (!(var31 <= 0.0)) {
         val var32: Double = RangesKt.coerceAtLeast(Math.min(4.5, var31 * 0.3), 0.001)
         var traveledDistance: Double = 0.0
         var index: Int = 0

         for (var14 in CollectionsKt.getLastIndex(points)..index) {
            val start: Vec3d = points.get(index) as Vec3d
            val var10000: Vec3d = (points.get(index + 1) as Vec3d).subtract(start)
            val delta: Vec3d = var10000
            val segmentLength: Double = segmentLengths[index]
            if (!(segmentLengths[index] <= 0.0)) {
               val subdivisions: Int = if (var31 - (traveledDistance + segmentLength) < var32)
                  RangesKt.coerceAtLeast((int)Math.ceil(segmentLength / 0.1), 1)
                  else
                  1

               repeat(subdivisions) { subdivision ->
                  val progress0: Double = (double)subdivision / subdivisions
                  val progress1: Double = (double)(subdivision + 1) / subdivisions
                  val subStartDistance: Double = traveledDistance + segmentLength * progress0
                  val subEndDistance: Double = traveledDistance + segmentLength * progress1
                  val var10003: Vec3d = start.add(delta.multiply(progress0))
                  val var10004: Vec3d = start.add(delta.multiply(progress1))
                  this.emitLine(
                     buffer,
                     entry,
                     var10003,
                     var10004,
                     color,
                     lineWidth,
                     this.endFadeAlpha(var31 - subStartDistance, var32),
                     this.endFadeAlpha(var31 - subEndDistance, var32)
                  )
               }

               traveledDistance += segmentLength
            }
         }
      }
   }

   private fun endFadeAlpha(remainingDistance: Double, fadeDistance: Double): Float {
      val progress: Float = (float)RangesKt.coerceIn(remainingDistance / fadeDistance, 0.0, 1.0)
      return progress * progress * (3.0F - 2.0F * progress)
   }

   fun drawSphere(entry: VertexConsumer, opacity: Entry, center: Vec3d, buffer: Double, radius: Color, color: Float) {
      repeat(11) { latitudeIndex ->
         val latitude0: Double = (-Math.PI / 2) + Math.PI * latitudeIndex / 12
         val latitude1: Double = (-Math.PI / 2) + Math.PI * (latitudeIndex + 1) / 12

         repeat(23) { longitudeIndex ->
            val longitude0: Double = (Math.PI * 2) * longitudeIndex / 24
            val longitude1: Double = (Math.PI * 2) * (longitudeIndex + 1) / 24
            this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude0, longitude0), color, latitude0, opacity)
            this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude0, longitude1), color, latitude0, opacity)
            this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude1, longitude1), color, latitude1, opacity)
            this.addSphereVertex(buffer, entry, this.spherePoint(center, radius, latitude1, longitude0), color, latitude1, opacity)
         }
      }
   }

   fun emitLine(buffer: VertexConsumer, endAlpha: Entry, startAlpha: Vec3d, entry: Vec3d, end: Color, lineWidth: Float, color: Float, start: Float) {
      var var10000: Vec3d = end.subtract(start)
      if (!(var10000.lengthSquared() <= 1.0E-8)) {
         var10000 = var10000.normalize()
         this.addLineVertex(buffer, entry, start, var10000, color, lineWidth, startAlpha)
         this.addLineVertex(buffer, entry, end, var10000, color, lineWidth, endAlpha)
      }
   }
}

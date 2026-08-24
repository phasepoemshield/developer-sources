package oxxxde

import java.util.ArrayList
import java.util.LinkedHashMap
import net.minecraft.class_1921
import net.minecraft.class_9799
import net.minecraft.client.render.RainRenderLayers
import net.minecraft.client.render.RenderLayer
import net.minecraft.client.render.VertexConsumerProvider
import net.minecraft.client.render.VertexConsumerProvider.Immediate
import net.minecraft.client.util.BufferAllocator
import net.minecraft.util.Identifier

// $VF: Compiled from heavy
private class شً : AutoCloseable {
   private BufferAllocator fallbackBuffer;
   private Immediate consumers;
   private RenderLayer[] layers;
   private final val layerBuffers: LinkedHashMap<class_1921, class_9799>

   init {
      val `$this$forEach$iv`: java.lang.Iterable = دظ.access$getPARTICLE_TEXTURES$p()
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$forEach$iv`, 10))

      for (var7 in `$this$forEach$iv`) {
         `destination$iv$iv`.add(RainRenderLayers.getHitParticle(var7 as Identifier))
      }

      this.layers = (`destination$iv$iv` as java.util.List).toArray(arrayOfNulls(0))
      this.fallbackBuffer = BufferAllocator(1024)
      this.layerBuffers = LinkedHashMap<>(this.layers.length)

      for (var19 in this.layers) {
         this.layerBuffers.put(var19, BufferAllocator(131072))
      }

      val var10001: Immediate = VertexConsumerProvider.immediate(this.layerBuffers, this.fallbackBuffer)
      this.consumers = var10001
   }

   fun getConsumers(): Immediate {
      this.consumers
   }

   public override fun close() {
      this.consumers.draw()
      val var10000: java.util.Collection = this.layerBuffers.values()

      for (`element$iv` in var10000) {
         (`element$iv` as BufferAllocator).close()
      }

      this.fallbackBuffer.close()
   }

   fun getLayers(): Array<RenderLayer> {
      this.layers
   }
}

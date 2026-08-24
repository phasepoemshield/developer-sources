package kotakbaz.rain.client.util.render.engine.dispatcher

import java.util.ArrayDeque
import java.util.EnumMap
import kotakbaz.rain.client.render.main.ChromaRenderer
import kotakbaz.rain.client.render.main.vertex.DrawMode
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder
import kotakbaz.rain.client.util.render.engine.Renderable
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import oxxxde.ان
import oxxxde.تٌ
import oxxxde.سل
import oxxxde.صؤ
import oxxxde.طء

// $VF: Compiled from heavy
public class RenderDispatcher {
   @Deprecated
   @JvmStatic
   public int MAX_POOLED_BATCHES = 64;
   private final val batchPool: ArrayDeque<سل>
   private final val queues: MutableMap<صؤ, MutableList<سل>> = EnumMap(ClientRenderPipeline::class.java) as java.util.Map
   @JvmStatic
   private تٌ Companion = تٌ(null);

   public fun hasQueued(pipeline: صؤ): Boolean {
      val var10000: java.util.List = this.queues.get(pipeline)
      return var10000 != null && !var10000.isEmpty()
   }

   public fun flushPipelineArray(pipelines: Array<out صؤ>) {
      ChromaRenderer.beginDrawScope()

      try {
         val var8: Boolean = true

         for (pipe in pipelines) {
            this.flushPipeline(pipe)
         }
      } finally {
         if (var6) {
            ChromaRenderer.endDrawScope()
         }
      }

      ChromaRenderer.endDrawScope()
      val var6: Boolean
   }

   public fun flushAll() {
      ChromaRenderer.beginDrawScope()

      try {
         for (pipeline in ClientRenderPipeline.getEntries()) {
            this.flushPipeline(pipeline)
         }
      } finally {
         ChromaRenderer.endDrawScope()
      }
   }

   private fun flushPipeline(pipeline: صؤ) {
      val var10000: Any = this.queues.get(pipeline)

      for (batch in var10000 as java.util.List) {
         batch.flush()
         batch.reset()
         if (this.batchPool.size() < 64) {
            this.batchPool.addLast(batch)
         }
      }

      (var10000 as java.util.List).clear()
   }

   public fun flushPipelines(vararg pipelines: صؤ) {
      this.flushPipelineArray(pipelines)
   }

   public fun getBuilder(pipeline: صؤ, renderer: طء, state: Any?): ان? {
      val var10000: Any = this.queues.get(pipeline)
      val queue: java.util.List = var10000 as java.util.List
      if (!(var10000 as java.util.List).isEmpty()) {
         val drawMode: RenderBatch = CollectionsKt.last(queue)
         val vertexFormat: Renderable = drawMode.owner
         if ((vertexFormat === renderer || vertexFormat != null && vertexFormat.canBatchWith(renderer) && renderer.canBatchWith(vertexFormat))
            && renderer.isBatchCompatible(drawMode.state, state)) {
            return drawMode.builder
         }
      }

      val var12: DrawMode = renderer.drawMode()
      if (var12 == null) {
         return null
      } else {
         val var13: VertexFormat = renderer.vertexFormat()
         if (var13 == null) {
            return null
         } else {
            val var11: MeshBuilder = ChromaRenderer.borrowMeshBuilder(var12, var13)
            val var14: RenderBatch = if (this.batchPool.isEmpty()) RenderBatch() else this.batchPool.removeLast()
            queue.add(var14.set(renderer, var11, state))
            return var11
         }
      }
   }
}

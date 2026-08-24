package oxxxde

import java.util.ArrayDeque
import java.util.EnumMap

// $VF: Compiled from heavy
public class بئ {
   @Deprecated
   @JvmStatic
   public int MAX_POOLED_BATCHES = 64;
   private final val batchPool: ArrayDeque<سل>
   private final val queues: MutableMap<صؤ, MutableList<سل>> = EnumMap(صؤ::class.java) as java.util.Map
   @JvmStatic
   private تٌ Companion = تٌ(null);

   public fun hasQueued(pipeline: صؤ): Boolean {
      val var10000: java.util.List = this.queues.get(pipeline)
      return var10000 != null && !var10000.isEmpty()
   }

   public fun flushPipelineArray(pipelines: Array<out صؤ>) {
      ِ.beginDrawScope()

      try {
         val var8: Boolean = true

         for (pipe in pipelines) {
            this.flushPipeline(pipe)
         }
      } finally {
         if (var6) {
            ِ.endDrawScope()
         }
      }

      ِ.endDrawScope()
      val var6: Boolean
   }

   public fun flushAll() {
      ِ.beginDrawScope()

      try {
         for (pipeline in صؤ.getEntries()) {
            this.flushPipeline(pipeline)
         }
      } finally {
         ِ.endDrawScope()
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
         val drawMode: سل = CollectionsKt.last(queue)
         val vertexFormat: طء = drawMode.getOwner()
         if ((vertexFormat === renderer || vertexFormat != null && vertexFormat.canBatchWith(renderer) && renderer.canBatchWith(vertexFormat))
            && renderer.isBatchCompatible(drawMode.state, state)) {
            return drawMode.getBuilder()
         }
      }

      val var12: شم = renderer.drawMode()
      if (var12 == null) {
         return null
      } else {
         val var13: سا = renderer.vertexFormat()
         if (var13 == null) {
            return null
         } else {
            val var11: ان = ِ.borrowMeshBuilder(var12, var13)
            val var14: سل = if (this.batchPool.isEmpty()) سل() else this.batchPool.removeLast()
            queue.add(var14.set(renderer, var11, state))
            return var11
         }
      }
   }
}

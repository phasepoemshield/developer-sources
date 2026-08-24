package kotakbaz.rain.client.util.render.engine.dispatcher

import kotakbaz.rain.client.render.main.ChromaRenderer
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder
import kotakbaz.rain.client.util.render.engine.Renderable
import oxxxde.ان
import oxxxde.اِ
import oxxxde.سل
import oxxxde.طء

// $VF: Compiled from heavy
public class RenderBatch {
   public final var state: Any?
      private set

   private MeshBuilder builder;
   private Renderable owner;

   public final var owner: طء?
      private set

   public fun set(owner: طء, builder: ان, state: Any?): سل {
      this.owner = owner
      this.builder = builder
      this.state = state
      return this
   }

   public final var builder: ان?
      private set

   public fun reset() {
      this.owner = null
      this.builder = null
      this.state = null
   }

   public fun flush() {
      if (this.builder != null) {
         val currentBuilder: MeshBuilder = this.builder
         if (this.owner != null) {
            val currentOwner: Renderable = this.owner

            try {
               val mesh: اِ = currentBuilder.buildNullable()
               if (mesh != null) {
                  currentOwner.renderBatch(mesh, this.state)
               }
            } finally {
               ChromaRenderer.recycleMeshBuilder(this.builder)
            }
         }
      }
   }
}

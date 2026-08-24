package oxxxde

// $VF: Compiled from heavy
public class سل {
   public final var state: Any?
      private set

   public final var builder: ان?
      private set

   public final var owner: طء?
      private set

   fun getOwner(): طء? {
      this.owner
   }

   public fun set(owner: طء, builder: ان, state: Any?): سل {
      this.owner = owner
      this.builder = builder
      this.state = state
      return this
   }

   fun getBuilder(): ان? {
      this.builder
   }

   public fun reset() {
      this.owner = null
      this.builder = null
      this.state = null
   }

   public fun flush() {
      if (this.builder != null) {
         val currentBuilder: ان = this.builder
         if (this.owner != null) {
            val currentOwner: طء = this.owner

            try {
               val mesh: اِ = currentBuilder.buildNullable()
               if (mesh != null) {
                  currentOwner.renderBatch(mesh, this.state)
               }
            } finally {
               ِ.recycleMeshBuilder(this.builder)
            }
         }
      }
   }
}

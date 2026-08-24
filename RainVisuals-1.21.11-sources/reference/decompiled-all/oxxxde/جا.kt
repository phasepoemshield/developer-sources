package oxxxde

import net.minecraft.util.Identifier

// $VF: Compiled from heavy
public data class جا : دغ {
   private Identifier texture;

   public override fun hashCode(): Int {
      return this.texture.hashCode()
   }

   fun copy(texture: Identifier): جا {
      جا(texture)
   }

   fun getTexture(): Identifier {
      this.texture
   }

   fun component1(): Identifier {
      this.texture
   }

   public override fun toString(): String {
      return "ResourceTexture(texture=${this.texture})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label22@
      if (this === other) {
         return true
      } else {
         return other is جا && this.texture == (other as جا).texture
      }
   }

   fun جا(texture: Identifier) {
      this.texture = texture
   }
}

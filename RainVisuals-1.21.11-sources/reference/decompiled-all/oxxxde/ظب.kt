package oxxxde

// $VF: Compiled from heavy
public class ظب {
   private final val glTex: طج?
   private final val textureId: Int

   fun ظب(glTex: طج) {
      this(0, glTex)
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === other) {
         return true
      } else if (other !is ظب) {
         return false
      } else {
         return if (this.glTex == null && (other as ظب).glTex == null) this.textureId == (other as ظب).textureId else this.glTex === (other as ظب).glTex
      }
   }

   public fun hasGlTex(texture: طج): Boolean {
      return this.glTex === texture
   }

   public override fun hashCode(): Int {
      return if (this.glTex != null) System.identityHashCode(this.glTex) else this.textureId
   }

   public fun apply(uniform: خة) {
      if (this.glTex != null) {
         uniform.set(this.glTex)
      } else {
         uniform.set(this.textureId)
      }
   }

   public fun hasTextureId(id: Int): Boolean {
      return this.glTex == null && this.textureId == id
   }

   fun ظب(textureId: Int, glTex: طج) {
      this.textureId = textureId
      this.glTex = glTex
   }

   public constructor(textureId: Int) : this(textureId, null)}

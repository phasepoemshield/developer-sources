package kotakbaz.rain.client.util.render.engine.controls

import kotakbaz.rain.client.render.texture.GlTex
import oxxxde.خة
import oxxxde.طج

// $VF: Compiled from heavy
public class TextureSampler private constructor(textureId: Int, glTex: طج?) {
   private GlTex glTex;
   private final val textureId: Int

   public constructor(glTex: طج) : this(0, glTex)
   public override operator fun equals(other: Any?): Boolean {
      if (this === other) {
         return true
      } else if (other !is TextureSampler) {
         return false
      } else {
         return if (this.glTex == null && (other as TextureSampler).glTex == null)
            this.textureId == (other as TextureSampler).textureId
            else
            this.glTex === (other as TextureSampler).glTex
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

   init {
      this.textureId = textureId
      this.glTex = glTex
   }

   public constructor(textureId: Int) : this(textureId, null)}

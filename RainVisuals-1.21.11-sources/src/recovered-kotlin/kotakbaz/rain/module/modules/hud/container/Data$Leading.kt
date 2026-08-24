package kotakbaz.rain.module.modules.hud.container

import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier
import oxxxde.ضإ
import oxxxde.طظ

// $VF: Compiled from Data.kt
public sealed interface `Data$Leading` {
   // $VF: Compiled from heavy
   public data class Glyph(text: String) : Data$Leading {
      public final val text: String

      public operator fun component1(): String {
         return this.text
      }

      public fun copy(text: String = ...): طظ {
         return Data$Leading.Glyph(text)
      }

      public override fun toString(): String {
         return "Glyph(text=${this.text})"
      }

      init {
         this.text = text
      }

      public override fun hashCode(): Int {
         return this.text.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === other) {
            return true
         } else {
            return other is Data$Leading.Glyph && this.text == (other as Data$Leading.Glyph).text
         }
      }
   }

   // $VF: Compiled from heavy
   public data class Item : Data$Leading {
      private ItemStack stack;

      public override fun toString(): String {
         return "Item(stack=${this.stack})"
      }

      fun Item(stack: ItemStack) {
         this.stack = stack
      }

      fun copy(stack: ItemStack): Data$Leading.Item {
         Data$Leading.Item(stack)
      }

      public override operator fun equals(other: Any?): Boolean {
         label22@
         if (this === other) {
            return true
         } else {
            return other is Data$Leading.Item && this.stack == (other as Data$Leading.Item).stack
         }
      }

      fun component1(): ItemStack {
         this.stack
      }

      fun getStack(): ItemStack {
         this.stack
      }

      public override fun hashCode(): Int {
         return this.stack.hashCode()
      }
   }

   // $VF: Compiled from heavy
   public data class ResourceTexture : Data$Leading {
      private Identifier texture;

      public override fun hashCode(): Int {
         return this.texture.hashCode()
      }

      fun copy(texture: Identifier): Data$Leading.ResourceTexture {
         Data$Leading.ResourceTexture(texture)
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
            return other is Data$Leading.ResourceTexture && this.texture == (other as Data$Leading.ResourceTexture).texture
         }
      }

      fun ResourceTexture(texture: Identifier) {
         this.texture = texture
      }
   }

   // $VF: Compiled from heavy
   public data class Texture(textureId: Int, u: Float, v: Float, texW: Float, texH: Float) : Data$Leading {
      public final val v: Float
      public final val texW: Float
      public final val u: Float
      public final val textureId: Int
      public final val texH: Float

      public override fun toString(): String {
         return "Texture(textureId=${this.textureId}, u=${this.u}, v=${this.v}, texW=${this.texW}, texH=${this.texH})"
      }

      public operator fun component2(): Float {
         return this.u
      }

      public operator fun component1(): Int {
         return this.textureId
      }

      public override fun hashCode(): Int {
         return (
                  ((Integer.hashCode(this.textureId) * 31 + java.lang.Float.hashCode(this.u)) * 31 + java.lang.Float.hashCode(this.v)) * 31
                     + java.lang.Float.hashCode(this.texW)
               )
               * 31
            + java.lang.Float.hashCode(this.texH)
         }

      public operator fun component4(): Float {
         return this.texW
      }

      public override operator fun equals(other: Any?): Boolean {
         label46@
         if (this === other) {
            return true
         } else {
            return other is Data$Leading.Texture
               && this.textureId == (other as Data$Leading.Texture).textureId
               && java.lang.Float.compare(this.u, (other as Data$Leading.Texture).u) == 0
               && java.lang.Float.compare(this.v, (other as Data$Leading.Texture).v) == 0
               && java.lang.Float.compare(this.texW, (other as Data$Leading.Texture).texW) == 0
               && java.lang.Float.compare(this.texH, (other as Data$Leading.Texture).texH) == 0
            }
      }

      init {
         this.textureId = textureId
         this.u = u
         this.v = v
         this.texW = texW
         this.texH = texH
      }

      public operator fun component5(): Float {
         return this.texH
      }

      public fun copy(textureId: Int = ..., u: Float = ..., v: Float = ..., texW: Float = ..., texH: Float = ...): ضإ {
         return Data$Leading.Texture(textureId, u, v, texW, texH)
      }

      public operator fun component3(): Float {
         return this.v
      }
   }
}

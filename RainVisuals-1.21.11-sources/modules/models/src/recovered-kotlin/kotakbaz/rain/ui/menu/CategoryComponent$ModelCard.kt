package kotakbaz.rain.ui.menu

import kotakbaz.rain.client.figura.FiguraAvatarInstaller$AvatarEntry
import oxxxde.ذي
import oxxxde.طن

// $VF: Compiled from heavy
private data class `CategoryComponent$ModelCard`(key: String, avatar: طن) {
   private FiguraAvatarInstaller$AvatarEntry avatar;
   public final val key: String

   init {
      this.key = key
      this.avatar = avatar
   }

   public final val avatar: طن

   public override fun hashCode(): Int {
      return this.key.hashCode() * 31 + this.avatar.hashCode()
   }

   public fun copy(key: String = ..., avatar: طن = ...): ذي {
      return CategoryComponent$ModelCard(key, avatar)
   }

   public override fun toString(): String {
      return "ModelCard(key=${this.key}, avatar=${this.avatar})"
   }

   public operator fun component2(): طن {
      return this.avatar
   }

   public operator fun component1(): String {
      return this.key
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is CategoryComponent$ModelCard
            && this.key == (other as CategoryComponent$ModelCard).key
            && this.avatar == (other as CategoryComponent$ModelCard).avatar
         }
   }
}

package oxxxde

// $VF: Compiled from heavy
private data class ذي {
   public final val avatar: طن
   public final val key: String

   fun ذي(avatar: java.lang.String, key: طن) {
      this.key = key
      this.avatar = avatar
   }

   fun getAvatar(): طن {
      this.avatar
   }

   public override fun hashCode(): Int {
      return this.key.hashCode() * 31 + this.avatar.hashCode()
   }

   public fun copy(key: String = this.key, avatar: طن = this.avatar): ذي {
      return ذي(key, avatar)
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
         return other is ذي && this.key == (other as ذي).key && this.avatar == (other as ذي).avatar
      }
   }
}

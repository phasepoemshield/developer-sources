package oxxxde

// $VF: Compiled from heavy
private data class صظ(label: String, url: String) {
   public final val url: String
   public final val label: String

   public override fun toString(): String {
      return "RemoteAction(label=${this.label}, url=${this.url})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is صظ && this.label == (other as صظ).label && this.url == (other as صظ).url
      }
   }

   public override fun hashCode(): Int {
      return this.label.hashCode() * 31 + this.url.hashCode()
   }

   public fun copy(label: String = this.label, url: String = this.url): صظ {
      return صظ(label, url)
   }

   public operator fun component2(): String {
      return this.url
   }

   init {
      this.label = label
      this.url = url
   }

   public operator fun component1(): String {
      return this.label
   }
}

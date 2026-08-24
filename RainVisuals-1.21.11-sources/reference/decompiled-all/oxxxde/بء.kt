package oxxxde

// $VF: Compiled from heavy
private data class بء(key: String, activations: Int?, remainingActivations: Int? = activations, id: String = "") {
   public final val key: String
   public final val id: String
   public final val remainingActivations: Int?
   public final val activations: Int?

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is بء
            && this.key == (other as بء).key
            && this.activations == (other as بء).activations
            && this.remainingActivations == (other as بء).remainingActivations
            && this.id == (other as بء).id
         }
   }

   public override fun hashCode(): Int {
      return (
               (this.key.hashCode() * 31 + (if (this.activations == null) 0 else this.activations.hashCode())) * 31
                  + (if (this.remainingActivations == null) 0 else this.remainingActivations.hashCode())
            )
            * 31
         + this.id.hashCode()
      }

   public operator fun component3(): Int? {
      return this.remainingActivations
   }

   init {
      super()
      this.key = key
      this.activations = activations
      this.remainingActivations = remainingActivations
      this.id = id
   }

   public operator fun component2(): Int? {
      return this.activations
   }

   public fun copy(key: String = this.key, activations: Int? = this.activations, remainingActivations: Int? = this.remainingActivations, id: String = this.id): بء {
      return بء(key, activations, remainingActivations, id)
   }

   public override fun toString(): String {
      return "GeneratedConfigKey(key=${this.key}, activations=${this.activations}, remainingActivations=${this.remainingActivations}, id=${this.id})"
   }

   public operator fun component4(): String {
      return this.id
   }

   public operator fun component1(): String {
      return this.key
   }
}

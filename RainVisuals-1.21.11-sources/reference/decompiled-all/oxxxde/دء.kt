package oxxxde

// $VF: Compiled from heavy
private data class دء {
   public final val enabled: Boolean?
   public final val settings: List<إ>
   public final val key: Int?
   public final val module: دِ

   public operator fun component1(): دِ {
      return this.module
   }

   public override fun toString(): String {
      return "ModuleUpdate(module=${this.module}, key=${this.key}, enabled=${this.enabled}, settings=${this.settings})"
   }

   fun getModule(): دِ {
      this.module
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is دء
            && this.module == (other as دء).module
            && this.key == (other as دء).key
            && this.enabled == (other as دء).enabled
            && this.settings == (other as دء).settings
         }
   }

   fun دء(module: دِ, enabled: Int?, settings: java.lang.Boolean?, key: MutableList<إ>) {
      this.module = module
      this.key = key
      this.enabled = enabled
      this.settings = settings
   }

   public override fun hashCode(): Int {
      return (
               (this.module.hashCode() * 31 + (if (this.key == null) 0 else this.key.hashCode())) * 31
                  + (if (this.enabled == null) 0 else this.enabled.hashCode())
            )
            * 31
         + this.settings.hashCode()
      }

   public operator fun component3(): Boolean? {
      return this.enabled
   }

   public fun copy(module: دِ = this.module, key: Int? = this.key, enabled: Boolean? = this.enabled, settings: List<إ> = this.settings): دء {
      return دء(module, key, enabled, settings)
   }

   public operator fun component2(): Int? {
      return this.key
   }

   public operator fun component4(): List<إ> {
      return this.settings
   }
}

package oxxxde

// $VF: Compiled from heavy
private data class در {
   public final val bounds: بل
   public final val configName: String

   fun getBounds(): بل {
      this.bounds
   }

   public override fun toString(): String {
      return "ConfigSettingsPopup(configName=${this.configName}, bounds=${this.bounds})"
   }

   public fun copy(configName: String = this.configName, bounds: بل = this.bounds): در {
      return در(configName, bounds)
   }

   public override fun hashCode(): Int {
      return this.configName.hashCode() * 31 + this.bounds.hashCode()
   }

   public operator fun component2(): بل {
      return this.bounds
   }

   public operator fun component1(): String {
      return this.configName
   }

   fun در(configName: java.lang.String, bounds: بل) {
      this.configName = configName
      this.bounds = bounds
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is در && this.configName == (other as در).configName && this.bounds == (other as در).bounds
      }
   }
}

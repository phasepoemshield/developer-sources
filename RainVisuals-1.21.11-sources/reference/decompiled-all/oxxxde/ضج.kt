package oxxxde

// $VF: Compiled from heavy
private data class ضج(clickGuiSettings: List<إ>, modules: List<دء>) {
   public final val modules: List<دء>
   public final val clickGuiSettings: List<إ>

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is ضج && this.clickGuiSettings == (other as ضج).clickGuiSettings && this.modules == (other as ضج).modules
      }
   }

   public fun copy(clickGuiSettings: List<إ> = this.clickGuiSettings, modules: List<دء> = this.modules): ضج {
      return ضج(clickGuiSettings, modules)
   }

   public operator fun component1(): List<إ> {
      return this.clickGuiSettings
   }

   public override fun toString(): String {
      return "RuntimeSnapshot(clickGuiSettings=${this.clickGuiSettings}, modules=${this.modules})"
   }

   public override fun hashCode(): Int {
      return this.clickGuiSettings.hashCode() * 31 + this.modules.hashCode()
   }

   init {
      this.clickGuiSettings = clickGuiSettings
      this.modules = modules
   }

   public operator fun component2(): List<دء> {
      return this.modules
   }
}

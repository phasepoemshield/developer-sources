package oxxxde

// $VF: Compiled from heavy
private data class سص(name: String, address: String) {
   public final val name: String
   public final val address: String

   public override fun toString(): String {
      return "DefaultServer(name=${this.name}, address=${this.address})"
   }

   init {
      this.name = name
      this.address = address
   }

   public fun copy(name: String = this.name, address: String = this.address): سص {
      return سص(name, address)
   }

   public operator fun component2(): String {
      return this.address
   }

   public operator fun component1(): String {
      return this.name
   }

   public override fun hashCode(): Int {
      return this.name.hashCode() * 31 + this.address.hashCode()
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is سص && this.name == (other as سص).name && this.address == (other as سص).address
      }
   }
}

package oxxxde

// $VF: Compiled from heavy
public data class ته(owned: List<ضغ>, receivedSupported: Boolean, received: List<ضٌ>) {
   public final val owned: List<ضغ>
   public final val received: List<ضٌ>
   public final val receivedSupported: Boolean

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ته
            && this.owned == (other as ته).owned
            && this.receivedSupported == (other as ته).receivedSupported
            && this.received == (other as ته).received
         }
   }

   public operator fun component1(): List<ضغ> {
      return this.owned
   }

   public fun copy(owned: List<ضغ> = this.owned, receivedSupported: Boolean = this.receivedSupported, received: List<ضٌ> = this.received): ته {
      return ته(owned, receivedSupported, received)
   }

   public operator fun component3(): List<ضٌ> {
      return this.received
   }

   public override fun hashCode(): Int {
      return (this.owned.hashCode() * 31 + java.lang.Boolean.hashCode(this.receivedSupported)) * 31 + this.received.hashCode()
   }

   public operator fun component2(): Boolean {
      return this.receivedSupported
   }

   init {
      this.owned = owned
      this.receivedSupported = receivedSupported
      this.received = received
   }

   public override fun toString(): String {
      return "CloudConfigLibrary(owned=${this.owned}, receivedSupported=${this.receivedSupported}, received=${this.received})"
   }
}

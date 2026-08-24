package kotakbaz.rain.client.social

import oxxxde.ته
import oxxxde.ضغ
import oxxxde.ضٌ

// $VF: Compiled from heavy
public data class CloudConfigLibrary(owned: List<ضغ>, receivedSupported: Boolean, received: List<ضٌ>) {
   public final val owned: List<ضغ>
   public final val received: List<ضٌ>
   public final val receivedSupported: Boolean

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is CloudConfigLibrary
            && this.owned == (other as CloudConfigLibrary).owned
            && this.receivedSupported == (other as CloudConfigLibrary).receivedSupported
            && this.received == (other as CloudConfigLibrary).received
         }
   }

   public operator fun component1(): List<ضغ> {
      return this.owned
   }

   public fun copy(owned: List<ضغ> = ..., receivedSupported: Boolean = ..., received: List<ضٌ> = ...): ته {
      return CloudConfigLibrary(owned, receivedSupported, received)
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

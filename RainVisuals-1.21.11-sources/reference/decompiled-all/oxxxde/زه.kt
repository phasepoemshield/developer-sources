package oxxxde

// $VF: Compiled from FunTimeEventsApi.kt
private data class زه(events: List<صة>, fetchedAt: Long, systemCountdowns: Map<Int, Int>) {
   public final val events: List<صة>
   public final val systemCountdowns: Map<Int, Int>
   public final val fetchedAt: Long

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is زه
            && this.events == (other as زه).events
            && this.fetchedAt == (other as زه).fetchedAt
            && this.systemCountdowns == (other as زه).systemCountdowns
         }
   }

   public fun copy(events: List<صة> = this.events, fetchedAt: Long = this.fetchedAt, systemCountdowns: Map<Int, Int> = this.systemCountdowns): زه {
      return زه(events, fetchedAt, systemCountdowns)
   }

   public override fun toString(): String {
      return "ParsedResponse(events=${this.events}, fetchedAt=${this.fetchedAt}, systemCountdowns=${this.systemCountdowns})"
   }

   public override fun hashCode(): Int {
      return (this.events.hashCode() * 31 + java.lang.Long.hashCode(this.fetchedAt)) * 31 + this.systemCountdowns.hashCode()
   }

   public operator fun component2(): Long {
      return this.fetchedAt
   }

   public operator fun component3(): Map<Int, Int> {
      return this.systemCountdowns
   }

   init {
      this.events = events
      this.fetchedAt = fetchedAt
      this.systemCountdowns = systemCountdowns
   }

   public operator fun component1(): List<صة> {
      return this.events
   }
}

package kotakbaz.rain.ui.menu

import oxxxde.زه
import oxxxde.صة

// $VF: Compiled from FunTimeEventsApi.kt
private data class `FunTimeEventsApi$ParsedResponse`(events: List<صة>, fetchedAt: Long, systemCountdowns: Map<Int, Int>) {
   public final val events: List<صة>
   public final val systemCountdowns: Map<Int, Int>
   public final val fetchedAt: Long

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is FunTimeEventsApi$ParsedResponse
            && this.events == (other as FunTimeEventsApi$ParsedResponse).events
            && this.fetchedAt == (other as FunTimeEventsApi$ParsedResponse).fetchedAt
            && this.systemCountdowns == (other as FunTimeEventsApi$ParsedResponse).systemCountdowns
         }
   }

   public fun copy(events: List<صة> = ..., fetchedAt: Long = ..., systemCountdowns: Map<Int, Int> = ...): زه {
      return FunTimeEventsApi$ParsedResponse(events, fetchedAt, systemCountdowns)
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

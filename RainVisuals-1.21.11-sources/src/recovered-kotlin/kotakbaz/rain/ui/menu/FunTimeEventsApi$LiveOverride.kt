package kotakbaz.rain.ui.menu

import oxxxde.تن
import oxxxde.صة

// $VF: Compiled from FunTimeEventsApi.kt
private data class `FunTimeEventsApi$LiveOverride`(event: صة, expiresAt: Long) {
   public final val expiresAt: Long
   private FunTimeEventsApi$Event event;

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is FunTimeEventsApi$LiveOverride
            && this.event == (other as FunTimeEventsApi$LiveOverride).event
            && this.expiresAt == (other as FunTimeEventsApi$LiveOverride).expiresAt
         }
   }

   public fun copy(event: صة = ..., expiresAt: Long = ...): تن {
      return FunTimeEventsApi$LiveOverride(event, expiresAt)
   }

   init {
      this.event = event
      this.expiresAt = expiresAt
   }

   public final val event: صة

   public operator fun component2(): Long {
      return this.expiresAt
   }

   public operator fun component1(): صة {
      return this.event
   }

   public override fun toString(): String {
      return "LiveOverride(event=${this.event}, expiresAt=${this.expiresAt})"
   }

   public override fun hashCode(): Int {
      return this.event.hashCode() * 31 + java.lang.Long.hashCode(this.expiresAt)
   }
}

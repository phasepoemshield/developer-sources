package oxxxde

// $VF: Compiled from FunTimeEventsApi.kt
private data class تن {
   public final val expiresAt: Long
   public final val event: صة

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is تن && this.event == (other as تن).event && this.expiresAt == (other as تن).expiresAt
      }
   }

   public fun copy(event: صة = this.event, expiresAt: Long = this.expiresAt): تن {
      return تن(event, expiresAt)
   }

   fun تن(expiresAt: صة, event: Long) {
      this.event = event
      this.expiresAt = expiresAt
   }

   fun getEvent(): صة {
      this.event
   }

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

package kotakbaz.rain.ui.menu

import oxxxde.خَ
import oxxxde.صة

// $VF: Compiled from FunTimeEventsApi.kt
public data class `FunTimeEventsApi$Snapshot`(generation: Long = 0L,
   events: List<صة> = CollectionsKt.emptyList(),
   loading: Boolean = false,
   failed: Boolean = false,
   updatedAt: Long = 0L
) {
   public final val generation: Long
   public final val updatedAt: Long
   public final val loading: Boolean
   public final val failed: Boolean
   public final val events: List<صة>

   public override fun hashCode(): Int {
      return (
               ((java.lang.Long.hashCode(this.generation) * 31 + this.events.hashCode()) * 31 + java.lang.Boolean.hashCode(this.loading)) * 31
                  + java.lang.Boolean.hashCode(this.failed)
            )
            * 31
         + java.lang.Long.hashCode(this.updatedAt)
      }

   init {
      super()
      this.generation = generation
      this.events = events
      this.loading = loading
      this.failed = failed
      this.updatedAt = updatedAt
   }

   public fun copy(generation: Long = ..., events: List<صة> = ..., loading: Boolean = ..., failed: Boolean = ..., updatedAt: Long = ...): خَ {
      return FunTimeEventsApi$Snapshot(generation, events, loading, failed, updatedAt)
   }

   public operator fun component1(): Long {
      return this.generation
   }

   public override fun toString(): String {
      return "Snapshot(generation=${this.generation}, events=${this.events}, loading=${this.loading}, failed=${this.failed}, updatedAt=${this.updatedAt})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is FunTimeEventsApi$Snapshot
            && this.generation == (other as FunTimeEventsApi$Snapshot).generation
            && this.events == (other as FunTimeEventsApi$Snapshot).events
            && this.loading == (other as FunTimeEventsApi$Snapshot).loading
            && this.failed == (other as FunTimeEventsApi$Snapshot).failed
            && this.updatedAt == (other as FunTimeEventsApi$Snapshot).updatedAt
         }
   }

   fun `FunTimeEventsApi$Snapshot`() {
      this(0L, null, false, false, 0L, 31, null)
   }

   public operator fun component2(): List<صة> {
      return this.events
   }

   public operator fun component4(): Boolean {
      return this.failed
   }

   public operator fun component5(): Long {
      return this.updatedAt
   }

   public operator fun component3(): Boolean {
      return this.loading
   }
}

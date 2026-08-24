package kotakbaz.rain.ui.menu

import oxxxde.دك
import oxxxde.شة

// $VF: Compiled from FunTimeEventsApi.kt
private data class `FunTimeEventsApi$Candidate`(id: String, phase: String, status: شة, secondsLeft: Int, loot: String?, system: Boolean) {
   public final val secondsLeft: Int
   public final val system: Boolean
   public final val id: String
   public final val loot: String?
   public final val phase: String
   private FunTimeEventsApi$Status status;

   public override fun toString(): String {
      return "Candidate(id=${this.id}, phase=${this.phase}, status=${this.status}, secondsLeft=${this.secondsLeft}, loot=${this.loot}, system=${this.system})"
   }

   public final val status: شة

   public operator fun component5(): String? {
      return this.loot
   }

   public operator fun component4(): Int {
      return this.secondsLeft
   }

   init {
      this.id = id
      this.phase = phase
      this.status = status
      this.secondsLeft = secondsLeft
      this.loot = loot
      this.system = system
   }

   public operator fun component2(): String {
      return this.phase
   }

   public override operator fun equals(other: Any?): Boolean {
      label52@
      if (this === other) {
         return true
      } else {
         return other is FunTimeEventsApi$Candidate
            && this.id == (other as FunTimeEventsApi$Candidate).id
            && this.phase == (other as FunTimeEventsApi$Candidate).phase
            && this.status === (other as FunTimeEventsApi$Candidate).status
            && this.secondsLeft == (other as FunTimeEventsApi$Candidate).secondsLeft
            && this.loot == (other as FunTimeEventsApi$Candidate).loot
            && this.system == (other as FunTimeEventsApi$Candidate).system
         }
   }

   public fun copy(id: String = ..., phase: String = ..., status: شة = ..., secondsLeft: Int = ..., loot: String? = ..., system: Boolean = ...): دك {
      return FunTimeEventsApi$Candidate(id, phase, status, secondsLeft, loot, system)
   }

   public operator fun component6(): Boolean {
      return this.system
   }

   public operator fun component1(): String {
      return this.id
   }

   public operator fun component3(): شة {
      return this.status
   }

   public override fun hashCode(): Int {
      return (
               (((this.id.hashCode() * 31 + this.phase.hashCode()) * 31 + this.status.hashCode()) * 31 + Integer.hashCode(this.secondsLeft)) * 31
                  + (if (this.loot == null) 0 else this.loot.hashCode())
            )
            * 31
         + java.lang.Boolean.hashCode(this.system)
      }
}

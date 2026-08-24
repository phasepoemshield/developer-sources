package kotakbaz.rain.ui.menu

import oxxxde.بي

// $VF: Compiled from FunTimeEventsApi.kt
private data class `FunTimeEventsApi$CandidateKey`(id: String, phase: String) {
   public final val phase: String
   public final val id: String

   public override fun toString(): String {
      return "CandidateKey(id=${this.id}, phase=${this.phase})"
   }

   init {
      this.id = id
      this.phase = phase
   }

   public fun copy(id: String = ..., phase: String = ...): بي {
      return FunTimeEventsApi$CandidateKey(id, phase)
   }

   public operator fun component2(): String {
      return this.phase
   }

   public operator fun component1(): String {
      return this.id
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is FunTimeEventsApi$CandidateKey
            && this.id == (other as FunTimeEventsApi$CandidateKey).id
            && this.phase == (other as FunTimeEventsApi$CandidateKey).phase
         }
   }

   public override fun hashCode(): Int {
      return this.id.hashCode() * 31 + this.phase.hashCode()
   }
}

package oxxxde

// $VF: Compiled from FunTimeEventsApi.kt
private data class دك {
   public final val secondsLeft: Int
   public final val system: Boolean
   public final val id: String
   public final val loot: String?
   public final val phase: String
   public final val status: شة

   public override fun toString(): String {
      return "Candidate(id=${this.id}, phase=${this.phase}, status=${this.status}, secondsLeft=${this.secondsLeft}, loot=${this.loot}, system=${this.system})"
   }

   fun getStatus(): شة {
      this.status
   }

   public operator fun component5(): String? {
      return this.loot
   }

   public operator fun component4(): Int {
      return this.secondsLeft
   }

   fun دك(phase: java.lang.String, status: java.lang.String, secondsLeft: شة, loot: Int, id: java.lang.String?, system: Boolean) {
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
         return other is دك
            && this.id == (other as دك).id
            && this.phase == (other as دك).phase
            && this.status === (other as دك).status
            && this.secondsLeft == (other as دك).secondsLeft
            && this.loot == (other as دك).loot
            && this.system == (other as دك).system
         }
   }

   public fun copy(
      id: String = this.id,
      phase: String = this.phase,
      status: شة = this.status,
      secondsLeft: Int = this.secondsLeft,
      loot: String? = this.loot,
      system: Boolean = this.system
   ): دك {
      return دك(id, phase, status, secondsLeft, loot, system)
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

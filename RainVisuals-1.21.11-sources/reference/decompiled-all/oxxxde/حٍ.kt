package oxxxde

// $VF: Compiled from FunTimeEventsApi.kt
private data class حٍ(anarchy: Int?, deadlineAt: Long) {
   public final val deadlineAt: Long
   public final val anarchy: Int?

   public operator fun component1(): Int? {
      return this.anarchy
   }

   public override fun toString(): String {
      return "LiveCountdown(anarchy=${this.anarchy}, deadlineAt=${this.deadlineAt})"
   }

   init {
      this.anarchy = anarchy
      this.deadlineAt = deadlineAt
   }

   public operator fun component2(): Long {
      return this.deadlineAt
   }

   public override fun hashCode(): Int {
      return (if (this.anarchy == null) 0 else this.anarchy.hashCode()) * 31 + java.lang.Long.hashCode(this.deadlineAt)
   }

   public fun copy(anarchy: Int? = this.anarchy, deadlineAt: Long = this.deadlineAt): حٍ {
      return حٍ(anarchy, deadlineAt)
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is حٍ && this.anarchy == (other as حٍ).anarchy && this.deadlineAt == (other as حٍ).deadlineAt
      }
   }
}

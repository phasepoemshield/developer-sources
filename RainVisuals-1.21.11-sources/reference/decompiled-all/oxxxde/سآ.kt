package oxxxde

// $VF: Compiled from FunTimeEventsApi.kt
private data class سآ(type: String, id: String?, phase: String?, secondsLeft: Int, loot: String?) {
   public final val phase: String?
   public final val secondsLeft: Int
   public final val loot: String?
   public final val type: String
   public final val id: String?

   init {
      this.type = type
      this.id = id
      this.phase = phase
      this.secondsLeft = secondsLeft
      this.loot = loot
   }

   public override fun toString(): String {
      return "RawEvent(type=${this.type}, id=${this.id}, phase=${this.phase}, secondsLeft=${this.secondsLeft}, loot=${this.loot})"
   }

   public operator fun component5(): String? {
      return this.loot
   }

   public override fun hashCode(): Int {
      return (
               ((this.type.hashCode() * 31 + (if (this.id == null) 0 else this.id.hashCode())) * 31 + (if (this.phase == null) 0 else this.phase.hashCode()))
                     * 31
                  + Integer.hashCode(this.secondsLeft)
            )
            * 31
         + (if (this.loot == null) 0 else this.loot.hashCode())
      }

   public operator fun component4(): Int {
      return this.secondsLeft
   }

   public operator fun component3(): String? {
      return this.phase
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is سآ
            && this.type == (other as سآ).type
            && this.id == (other as سآ).id
            && this.phase == (other as سآ).phase
            && this.secondsLeft == (other as سآ).secondsLeft
            && this.loot == (other as سآ).loot
         }
   }

   public operator fun component1(): String {
      return this.type
   }

   public fun copy(type: String = this.type, id: String? = this.id, phase: String? = this.phase, secondsLeft: Int = this.secondsLeft, loot: String? = this.loot): سآ {
      return سآ(type, id, phase, secondsLeft, loot)
   }

   public operator fun component2(): String? {
      return this.id
   }
}

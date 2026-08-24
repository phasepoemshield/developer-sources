package oxxxde

// $VF: Compiled from heavy
private data class ذق(anarchy: Int, online: Int, capacity: Int, teamSize: Int, slot: Int) {
   public final val online: Int
   public final val anarchy: Int
   public final val capacity: Int
   public final val teamSize: Int
   public final val slot: Int

   public override fun hashCode(): Int {
      return (
               ((Integer.hashCode(this.anarchy) * 31 + Integer.hashCode(this.online)) * 31 + Integer.hashCode(this.capacity)) * 31
                  + Integer.hashCode(this.teamSize)
            )
            * 31
         + Integer.hashCode(this.slot)
      }

   public operator fun component3(): Int {
      return this.capacity
   }

   public override operator fun equals(other: Any?): Boolean {
      label46@
      if (this === other) {
         return true
      } else {
         return other is ذق
            && this.anarchy == (other as ذق).anarchy
            && this.online == (other as ذق).online
            && this.capacity == (other as ذق).capacity
            && this.teamSize == (other as ذق).teamSize
            && this.slot == (other as ذق).slot
         }
   }

   public operator fun component5(): Int {
      return this.slot
   }

   public operator fun component1(): Int {
      return this.anarchy
   }

   init {
      this.anarchy = anarchy
      this.online = online
      this.capacity = capacity
      this.teamSize = teamSize
      this.slot = slot
   }

   public operator fun component2(): Int {
      return this.online
   }

   public operator fun component4(): Int {
      return this.teamSize
   }

   public fun copy(anarchy: Int = this.anarchy, online: Int = this.online, capacity: Int = this.capacity, teamSize: Int = this.teamSize, slot: Int = this.slot): ذق {
      return ذق(anarchy, online, capacity, teamSize, slot)
   }

   public override fun toString(): String {
      return "ServerCandidate(anarchy=${this.anarchy}, online=${this.online}, capacity=${this.capacity}, teamSize=${this.teamSize}, slot=${this.slot})"
   }
}

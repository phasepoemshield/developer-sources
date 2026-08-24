package kotakbaz.rain.ui.inventory

import oxxxde.ذق

// $VF: Compiled from heavy
private data class `FunTimeOnlineHelperController$ServerCandidate`(anarchy: Int, online: Int, capacity: Int, teamSize: Int, slot: Int) {
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
         return other is FunTimeOnlineHelperController$ServerCandidate
            && this.anarchy == (other as FunTimeOnlineHelperController$ServerCandidate).anarchy
            && this.online == (other as FunTimeOnlineHelperController$ServerCandidate).online
            && this.capacity == (other as FunTimeOnlineHelperController$ServerCandidate).capacity
            && this.teamSize == (other as FunTimeOnlineHelperController$ServerCandidate).teamSize
            && this.slot == (other as FunTimeOnlineHelperController$ServerCandidate).slot
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

   public fun copy(anarchy: Int = ..., online: Int = ..., capacity: Int = ..., teamSize: Int = ..., slot: Int = ...): ذق {
      return FunTimeOnlineHelperController$ServerCandidate(anarchy, online, capacity, teamSize, slot)
   }

   public override fun toString(): String {
      return "ServerCandidate(anarchy=${this.anarchy}, online=${this.online}, capacity=${this.capacity}, teamSize=${this.teamSize}, slot=${this.slot})"
   }
}

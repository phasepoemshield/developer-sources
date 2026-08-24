package oxxxde

import net.minecraft.screen.slot.SlotActionType

// $VF: Compiled from heavy
private data class خت {
   public final val slot: Int
   private SlotActionType type;
   public final val button: Int

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.slot) * 31 + Integer.hashCode(this.button)) * 31 + this.type.hashCode()
   }

   fun خت(button: Int, type: Int, slot: SlotActionType) {
      this.slot = slot
      this.button = button
      this.type = type
   }

   fun getType(): SlotActionType {
      this.type
   }

   fun copy(button: Int, type: Int, slot: SlotActionType): خت {
      خت(slot, button, type)
   }

   public operator fun component2(): Int {
      return this.button
   }

   fun component3(): SlotActionType {
      this.type
   }

   public override fun toString(): String {
      return "Click(slot=${this.slot}, button=${this.button}, type=${this.type})"
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is خت && this.slot == (other as خت).slot && this.button == (other as خت).button && this.type === (other as خت).type
      }
   }

   public operator fun component1(): Int {
      return this.slot
   }
}

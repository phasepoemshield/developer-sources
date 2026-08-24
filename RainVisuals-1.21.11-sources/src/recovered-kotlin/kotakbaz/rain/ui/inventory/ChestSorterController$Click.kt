package kotakbaz.rain.ui.inventory

import net.minecraft.screen.slot.SlotActionType

// $VF: Compiled from heavy
private data class `ChestSorterController$Click` {
   private SlotActionType type;
   public final val button: Int
   public final val slot: Int

   fun component3(): SlotActionType {
      this.type
   }

   public operator fun component2(): Int {
      return this.button
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.slot) * 31 + Integer.hashCode(this.button)) * 31 + this.type.hashCode()
   }

   public override fun toString(): String {
      return "Click(slot=${this.slot}, button=${this.button}, type=${this.type})"
   }

   fun getType(): SlotActionType {
      this.type
   }

   fun `ChestSorterController$Click`(button: Int, slot: Int, type: SlotActionType) {
      this.slot = slot
      this.button = button
      this.type = type
   }

   public operator fun component1(): Int {
      return this.slot
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is ChestSorterController$Click
            && this.slot == (other as ChestSorterController$Click).slot
            && this.button == (other as ChestSorterController$Click).button
            && this.type === (other as ChestSorterController$Click).type
         }
   }

   fun copy(button: Int, slot: Int, type: SlotActionType): ChestSorterController$Click {
      ChestSorterController$Click(slot, button, type)
   }
}

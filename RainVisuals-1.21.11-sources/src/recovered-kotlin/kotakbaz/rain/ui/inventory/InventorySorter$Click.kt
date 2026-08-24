package kotakbaz.rain.ui.inventory

import net.minecraft.screen.slot.SlotActionType

// $VF: Compiled from heavy
private data class `InventorySorter$Click` {
   public final val slot: Int
   private SlotActionType type;
   public final val button: Int

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.slot) * 31 + Integer.hashCode(this.button)) * 31 + this.type.hashCode()
   }

   fun `InventorySorter$Click`(button: Int, type: Int, slot: SlotActionType) {
      this.slot = slot
      this.button = button
      this.type = type
   }

   fun getType(): SlotActionType {
      this.type
   }

   fun copy(button: Int, type: Int, slot: SlotActionType): InventorySorter$Click {
      InventorySorter$Click(slot, button, type)
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
         return other is InventorySorter$Click
            && this.slot == (other as InventorySorter$Click).slot
            && this.button == (other as InventorySorter$Click).button
            && this.type === (other as InventorySorter$Click).type
         }
   }

   public operator fun component1(): Int {
      return this.slot
   }
}

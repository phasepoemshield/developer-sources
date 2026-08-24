package oxxxde

import net.minecraft.screen.slot.SlotActionType

// $VF: Compiled from heavy
private data class رُ {
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

   fun رُ(button: Int, slot: Int, type: SlotActionType) {
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
         return other is رُ && this.slot == (other as رُ).slot && this.button == (other as رُ).button && this.type === (other as رُ).type
      }
   }

   fun copy(button: Int, slot: Int, type: SlotActionType): رُ {
      رُ(slot, button, type)
   }
}

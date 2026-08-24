package kotakbaz.rain.ui.inventory

import net.minecraft.item.ItemStack
import oxxxde.رٍ

// $VF: Compiled from heavy
public data class InventorySlotVisual {
   private ItemStack expected;
   private InventorySlotState state;
   public final val available: Boolean
   public final val destination: Int?

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is InventorySlotVisual
            && this.state === (other as InventorySlotVisual).state
            && this.expected == (other as InventorySlotVisual).expected
            && this.destination == (other as InventorySlotVisual).destination
            && this.available == (other as InventorySlotVisual).available
         }
   }

   public operator fun component1(): رٍ {
      return this.state
   }

   fun component2(): ItemStack {
      this.expected
   }

   public override fun toString(): String {
      return "InventorySlotVisual(state=${this.state}, expected=${this.expected}, destination=${this.destination}, available=${this.available})"
   }

   fun InventorySlotVisual(destination: InventorySlotState, available: ItemStack, state: Int?, expected: Boolean) {
      this.state = state
      this.expected = expected
      this.destination = destination
      this.available = available
   }

   fun getExpected(): ItemStack {
      this.expected
   }

   public operator fun component4(): Boolean {
      return this.available
   }

   public override fun hashCode(): Int {
      return ((this.state.hashCode() * 31 + this.expected.hashCode()) * 31 + (if (this.destination == null) 0 else this.destination.hashCode())) * 31
         + java.lang.Boolean.hashCode(this.available)
      }

   public operator fun component3(): Int? {
      return this.destination
   }

   public final val state: رٍ

   fun copy(destination: InventorySlotState, state: ItemStack, available: Int?, expected: Boolean): InventorySlotVisual {
      InventorySlotVisual(state, expected, destination, available)
   }
}

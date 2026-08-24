package oxxxde

import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
public data class سق {
   private ItemStack expected;
   public final val state: رٍ
   public final val available: Boolean
   public final val destination: Int?

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is سق
            && this.state === (other as سق).state
            && this.expected == (other as سق).expected
            && this.destination == (other as سق).destination
            && this.available == (other as سق).available
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

   fun سق(destination: رٍ, available: ItemStack, state: Int?, expected: Boolean) {
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

   fun getState(): رٍ {
      this.state
   }

   fun copy(destination: رٍ, state: ItemStack, available: Int?, expected: Boolean): سق {
      سق(state, expected, destination, available)
   }
}

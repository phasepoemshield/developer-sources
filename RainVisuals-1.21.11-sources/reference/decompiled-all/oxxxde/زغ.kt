package oxxxde

import net.minecraft.item.Item

// $VF: Compiled from heavy
private data class زغ {
   public final val toggle: خذ
   private Item item;
   public final val color: رت

   public override fun toString(): String {
      return "HighlightEntry(item=${this.item}, toggle=${this.toggle}, color=${this.color})"
   }

   public override fun hashCode(): Int {
      return (this.item.hashCode() * 31 + this.toggle.hashCode()) * 31 + this.color.hashCode()
   }

   public operator fun component2(): خذ {
      return this.toggle
   }

   fun getToggle(): خذ {
      this.toggle
   }

   fun getItem(): Item {
      this.item
   }

   public operator fun component3(): رت {
      return this.color
   }

   fun component1(): Item {
      this.item
   }

   fun getColor(): رت {
      this.color
   }

   fun زغ(color: Item, item: خذ, toggle: رت) {
      this.item = item
      this.toggle = toggle
      this.color = color
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is زغ && this.item == (other as زغ).item && this.toggle == (other as زغ).toggle && this.color == (other as زغ).color
      }
   }

   fun copy(item: Item, color: خذ, toggle: رت): زغ {
      زغ(item, toggle, color)
   }
}

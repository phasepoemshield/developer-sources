package oxxxde

// $VF: Compiled from heavy
private data class طد(slot: Int, name: String, text: String) {
   public final val name: String
   public final val text: String
   public final val slot: Int

   init {
      this.slot = slot
      this.name = name
      this.text = text
   }

   public override fun toString(): String {
      return "MenuEntry(slot=${this.slot}, name=${this.name}, text=${this.text})"
   }

   public fun copy(slot: Int = this.slot, name: String = this.name, text: String = this.text): طد {
      return طد(slot, name, text)
   }

   public override operator fun equals(other: Any?): Boolean {
      label34@
      if (this === other) {
         return true
      } else {
         return other is طد && this.slot == (other as طد).slot && this.name == (other as طد).name && this.text == (other as طد).text
      }
   }

   public operator fun component1(): Int {
      return this.slot
   }

   public operator fun component3(): String {
      return this.text
   }

   public override fun hashCode(): Int {
      return (Integer.hashCode(this.slot) * 31 + this.name.hashCode()) * 31 + this.text.hashCode()
   }

   public operator fun component2(): String {
      return this.name
   }
}

package oxxxde

// $VF: Compiled from heavy
public data class غ(c: Char, color: Int) {
   public final val color: Int
   public final val c: Char

   init {
      this.c = c
      this.color = color
   }

   public operator fun component1(): Char {
      return this.c
   }

   public fun copy(c: Char = this.c, color: Int = this.color): غ {
      return غ(c, color)
   }

   public operator fun component2(): Int {
      return this.color
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is غ && this.c == (other as غ).c && this.color == (other as غ).color
      }
   }

   public override fun hashCode(): Int {
      return Character.hashCode(this.c) * 31 + Integer.hashCode(this.color)
   }

   public override fun toString(): String {
      return "ColoredGlyph(c=${this.c}, color=${this.color})"
   }
}

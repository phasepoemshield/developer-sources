package kotlin.text

// $VF: Compiled from Regex.kt
public data class MatchGroup(value: String, range: IntRange) {
   public final val range: IntRange
   public final val value: String

   public operator fun component2(): IntRange {
      return this.range
   }

   public override operator fun equals(other: Any?): Boolean {
      label28@
      if (this === other) {
         return true
      } else {
         return other is MatchGroup && this.value == (other as MatchGroup).value && this.range == (other as MatchGroup).range
      }
   }

   init {
      this.value = value
      this.range = range
   }

   public fun copy(value: String = this.value, range: IntRange = this.range): MatchGroup {
      return MatchGroup(value, range)
   }

   public operator fun component1(): String {
      return this.value
   }

   public override fun toString(): String {
      return "MatchGroup(value=${this.value}, range=${this.range})"
   }

   public override fun hashCode(): Int {
      return this.value.hashCode() * 31 + this.range.hashCode()
   }
}

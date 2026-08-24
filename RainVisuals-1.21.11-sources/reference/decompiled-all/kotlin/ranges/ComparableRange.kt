package kotlin.ranges

// $VF: Compiled from Ranges.kt
private open class ComparableRange<T extends java.lang.Comparable<? super T>>(start: Any, endInclusive: Any) : ClosedRange<T> {
   public open val start: Any
   public open val endInclusive: Any

   public override fun toString(): String {
      return "${this.start}..${this.endInclusive}"
   }

   override fun contains(value: T): Boolean {
      ClosedRange.DefaultImpls.contains(this, (T)value)
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is ComparableRange
         && (
            this.isEmpty() && (other as ComparableRange).isEmpty()
               || this.start == (other as ComparableRange).start && this.endInclusive == (other as ComparableRange).endInclusive
         )
      }

   override fun isEmpty(): Boolean {
      ClosedRange.DefaultImpls.isEmpty(this)
   }

   init {
      this.start = (T)start
      this.endInclusive = (T)endInclusive
   }

   public override fun hashCode(): Int {
      return if (this.isEmpty()) -1 else 31 * this.start.hashCode() + this.endInclusive.hashCode()
   }
}

package kotlin.ranges

// $VF: Compiled from Ranges.kt
private open class ComparableOpenEndRange<T extends java.lang.Comparable<? super T>>(start: Any, endExclusive: Any) : OpenEndRange<T> {
   public open val endExclusive: Any
   public open val start: Any

   public override operator fun equals(other: Any?): Boolean {
      return other is ComparableOpenEndRange
         && (
            this.isEmpty() && (other as ComparableOpenEndRange).isEmpty()
               || this.start == (other as ComparableOpenEndRange).start && this.endExclusive == (other as ComparableOpenEndRange).endExclusive
         )
      }

   override fun isEmpty(): Boolean {
      OpenEndRange.DefaultImpls.isEmpty(this)
   }

   init {
      this.start = (T)start
      this.endExclusive = (T)endExclusive
   }

   public override fun hashCode(): Int {
      return if (this.isEmpty()) -1 else 31 * this.start.hashCode() + this.endExclusive.hashCode()
   }

   override fun contains(value: T): Boolean {
      OpenEndRange.DefaultImpls.contains(this, (T)value)
   }

   public override fun toString(): String {
      return "${this.start}..<${this.endExclusive}"
   }
}

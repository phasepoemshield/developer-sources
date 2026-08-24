package kotlin.collections

// $VF: Compiled from ReversedViews.kt
private open class ReversedListReadOnly<T>(delegate: List<Any>) : AbstractList<T> {
   private final val delegate: List<Any>

   public override operator fun get(index: Int): Any {
      return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index))
   }

   public open val size: Int
      public open get() {
         return this.delegate.size()
      }


   public override fun listIterator(): ListIterator<Any> {
      return this.listIterator(0)
   }

   public override operator fun iterator(): Iterator<Any> {
      return this.listIterator(0)
   }

   public override fun listIterator(index: Int): ListIterator<Any> {
      return       // $VF: Compiled from ReversedViews.kt
object : ListIterator<Any> {
         public final val delegateIterator: ListIterator<Any>

         {
            this.delegateIterator = ReversedListReadOnly.this.delegate
               .listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(ReversedListReadOnly.this, `$index`))
            }

         public override operator fun hasNext(): Boolean {
            return this.delegateIterator.hasPrevious()
         }

         public override operator fun next(): Any {
            return this.delegateIterator.previous()
         }

         override fun add(element: T) {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override fun previousIndex(): Int {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(ReversedListReadOnly.this, this.delegateIterator.nextIndex())
         }

         public override fun previous(): Any {
            return this.delegateIterator.next()
         }

         public override fun nextIndex(): Int {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(ReversedListReadOnly.this, this.delegateIterator.previousIndex())
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public override fun hasPrevious(): Boolean {
            return this.delegateIterator.hasNext()
         }

         override fun set(element: T) {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }
      }
   }

   init {
      this.delegate = delegate
   }
}

package kotlin.collections

// $VF: Compiled from ReversedViews.kt
private class ReversedList<T>(delegate: MutableList<Any>) : AbstractMutableList<T> {
   private final val delegate: MutableList<Any>

   public override operator fun get(index: Int): Any {
      return this.delegate.get(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index))
   }

   public override fun clear() {
      this.delegate.clear()
   }

   public override fun removeAt(index: Int): Any {
      return this.delegate.remove(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index))
   }

   public override fun add(index: Int, element: Any) {
      this.delegate.add(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(this, index), (T)element)
   }

   public override fun listIterator(): MutableListIterator<Any> {
      return this.listIterator(0)
   }

   init {
      this.delegate = delegate
   }

   public open val size: Int
      public open get() {
         return this.delegate.size()
      }


   public override operator fun iterator(): MutableIterator<Any> {
      return this.listIterator(0)
   }

   public override operator fun set(index: Int, element: Any): Any {
      return this.delegate.set(CollectionsKt__ReversedViewsKt.access$reverseElementIndex(this, index), (T)element)
   }

   public override fun listIterator(index: Int): MutableListIterator<Any> {
      return       // $VF: Compiled from ReversedViews.kt
object : MutableListIterator<Any> {
         public final val delegateIterator: MutableListIterator<Any>

         public override operator fun next(): Any {
            return this.delegateIterator.previous()
         }

         public override fun previous(): Any {
            return this.delegateIterator.next()
         }

         public override fun add(element: Any) {
            this.delegateIterator.add((T)element)
            this.delegateIterator.previous()
         }

         public override operator fun hasNext(): Boolean {
            return this.delegateIterator.hasPrevious()
         }

         public override fun previousIndex(): Int {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(ReversedList.this, this.delegateIterator.nextIndex())
         }

         public override fun hasPrevious(): Boolean {
            return this.delegateIterator.hasNext()
         }

         public override fun nextIndex(): Int {
            return CollectionsKt__ReversedViewsKt.access$reverseIteratorIndex(ReversedList.this, this.delegateIterator.previousIndex())
         }

         public override fun set(element: Any) {
            this.delegateIterator.set((T)element)
         }

         {
            this.delegateIterator = ReversedList.this.delegate
               .listIterator(CollectionsKt__ReversedViewsKt.access$reversePositionIndex(ReversedList.this, `$index`))
            }

         public override fun remove() {
            this.delegateIterator.remove()
         }
      }
   }
}

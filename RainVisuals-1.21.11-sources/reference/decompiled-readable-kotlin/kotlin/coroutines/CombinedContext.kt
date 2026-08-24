package kotlin.coroutines

import java.io.Serializable
import kotlin.coroutines.CoroutineContext.Element
import kotlin.coroutines.CoroutineContext.Key
import kotlin.jvm.internal.Ref

// $VF: Compiled from CoroutineContextImpl.kt
@SinceKotlin(version = "1.3")
internal class CombinedContext(left: CoroutineContext, element: Element) : CoroutineContext, Serializable {
   private final val left: CoroutineContext
   private final val element: Element

   public override operator fun <E : Element> get(key: Key<Any>): Any? {
      var cur: CombinedContext = this

      while (true) {
         val next: CoroutineContext.Element = cur.element.get(key)
         if (next != null) {
            return (E)next
         }

         if (cur.left !is CombinedContext) {
            return (E)cur.left.get(key)
         }

         cur = cur.left as CombinedContext
      }
   }

   public override operator fun equals(other: Any?): Boolean {
      return this === other || other is CombinedContext && (other as CombinedContext).size() == this.size() && (other as CombinedContext).containsAll(this)
   }

   public override fun toString(): String {
      return "[${this.fold("", { acc, element ->
         if (acc.length() == 0) element.toString() else "$acc, $element"
      })}]"
   }

   public override fun hashCode(): Int {
      return this.left.hashCode() + this.element.hashCode()
   }

   override fun plus(context: CoroutineContext): CoroutineContext {
      CoroutineContext.DefaultImpls.plus(this, context)
   }

   init {
      this.left = left
      this.element = element
   }

   private fun contains(element: Element): Boolean {
      return this.get(element.key) == element
   }

   private fun writeReplace(): Any {
      val n: Int = this.size()
      val elements: Array<CoroutineContext> = arrayOfNulls(n)
      val index: Ref.IntRef = Ref.IntRef()
      this.fold(Unit.INSTANCE,       // $VF: Compiled from CoroutineContextImpl.kt
{ <anonymous parameter 0>: Unit element: Element ->
         elements[index.element++] = element
      } as (Unit?, CoroutineContext.Element?) -> Unit)
      if (index.element != n) {
         throw IllegalStateException("Check failed.".toString())
      } else {
         return CombinedContext.Serialized(elements)
      }
   }

   private fun size(): Int {
      var cur: CombinedContext = this
      var size: Int = 2

      while (true) {
         val var3: CoroutineContext = cur.left
         val var10000: CombinedContext = cur.left as? CombinedContext
         if ((cur.left as? CombinedContext) == null) {
            return size
         }

         cur = var10000
         size++
      }
   }

   private fun containsAll(context: CombinedContext): Boolean {
      var cur: CombinedContext = context

      while (this.contains(cur.element)) {
         val next: CoroutineContext = cur.left
         if (cur.left !is CombinedContext) {
            return this.contains(next as CoroutineContext.Element)
         }

         cur = cur.left as CombinedContext
      }

      return false
   }

   public override fun <R> fold(initial: Any, operation: (Any, Element) -> Any): Any {
      return (R)operation(this.left.fold(initial, operation), this.element)
   }

   public override fun minusKey(key: Key<*>): CoroutineContext {
      if (this.element.get(key) != null) {
         return this.left
      } else {
         val newLeft: CoroutineContext = this.left.minusKey(key)
         return if (newLeft === this.left) this else (if (newLeft === EmptyCoroutineContext.INSTANCE) this.element else CombinedContext(newLeft, this.element))
      }
   }

   // $VF: Compiled from CoroutineContextImpl.kt
   private class Serialized(vararg elements: Any) : Serializable {
      public final val elements: Array<CoroutineContext>

      init {
         this.elements = elements
      }

      private fun readResolve(): Any {
         var `accumulator$iv`: Any = EmptyCoroutineContext.INSTANCE

         for (`element$iv` in this.elements) {
            `accumulator$iv` = (`accumulator$iv` as CoroutineContext).plus(`element$iv`)
         }

         return `accumulator$iv`
      }

      // $VF: Compiled from CoroutineContextImpl.kt
      public companion object {
         private const val serialVersionUID: Long = 0L
      }
   }
}

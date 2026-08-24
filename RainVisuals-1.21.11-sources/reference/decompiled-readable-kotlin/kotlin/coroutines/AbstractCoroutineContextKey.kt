package kotlin.coroutines

import kotlin.coroutines.CoroutineContext.Element
import kotlin.coroutines.CoroutineContext.Key

// $VF: Compiled from CoroutineContextImpl.kt
@ExperimentalStdlibApi
@SinceKotlin(version = "1.3")
public abstract class AbstractCoroutineContextKey<B extends CoroutineContext.Element, E extends B> : CoroutineContext.Key<E> {
   private final val safeCast: (Element) -> Any?
   private final val topmostKey: Key<*>

   internal fun isSubKey(key: Key<*>): Boolean {
      return key === this || this.topmostKey === key
   }

   open fun AbstractCoroutineContextKey(safeCast: CoroutineContext.Key<B>, baseKey: (CoroutineContext.Element?) -> E) {
      this.safeCast = safeCast
      this.topmostKey = if (baseKey is AbstractCoroutineContextKey) (baseKey as AbstractCoroutineContextKey).topmostKey else baseKey
   }

   internal fun tryCast(element: Element): Any? {
      return (E)(this.safeCast(element) as CoroutineContext.Element)
   }
}

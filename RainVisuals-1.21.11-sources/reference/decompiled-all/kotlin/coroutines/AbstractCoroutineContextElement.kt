package kotlin.coroutines

import kotlin.coroutines.CoroutineContext.Key

// $VF: Compiled from CoroutineContextImpl.kt
@SinceKotlin(version = "1.3")
public abstract class AbstractCoroutineContextElement : CoroutineContext.Element {
   public open val key: Key<*>

   open fun AbstractCoroutineContextElement(key: CoroutineContext.Key<*>) {
      this.key = key
   }

   override fun minusKey(key: CoroutineContext.Key<*>): CoroutineContext {
      CoroutineContext.Element.DefaultImpls.minusKey(this, key)
   }

   override fun <E extends CoroutineContext.Element> get(key: CoroutineContext.Key<E>): E? {
      CoroutineContext.Element.DefaultImpls.get(this, key)
   }

   override fun <R> fold(operation: R, initial: (R?, CoroutineContext.Element?) -> R): R {
      CoroutineContext.Element.DefaultImpls.fold(this, initial, operation)
   }

   override fun plus(context: CoroutineContext): CoroutineContext {
      CoroutineContext.Element.DefaultImpls.plus(this, context)
   }
}

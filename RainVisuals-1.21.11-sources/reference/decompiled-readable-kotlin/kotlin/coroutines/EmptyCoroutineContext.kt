package kotlin.coroutines

import java.io.Serializable
import kotlin.coroutines.CoroutineContext.Element
import kotlin.coroutines.CoroutineContext.Key

// $VF: Compiled from CoroutineContextImpl.kt
@SinceKotlin(version = "1.3")
public object EmptyCoroutineContext : CoroutineContext, Serializable {
   private const val serialVersionUID: Long = 0L

   public override fun <R> fold(initial: Any, operation: (Any, Element) -> Any): Any {
      return (R)initial
   }

   public override fun hashCode(): Int {
      return 0
   }

   public override operator fun plus(context: CoroutineContext): CoroutineContext {
      return context
   }

   public override fun minusKey(key: Key<*>): CoroutineContext {
      return this
   }

   public override fun toString(): String {
      return "EmptyCoroutineContext"
   }

   private fun readResolve(): Any {
      return INSTANCE
   }

   public override operator fun <E : Element> get(key: Key<Any>): Any? {
      return null
   }
}

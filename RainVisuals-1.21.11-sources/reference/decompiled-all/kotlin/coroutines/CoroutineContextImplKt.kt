package kotlin.coroutines

import kotlin.coroutines.CoroutineContext.Element
import kotlin.coroutines.CoroutineContext.Key

// $VF: Compiled from CoroutineContextImpl.kt
@SinceKotlin(version = "1.3")
@ExperimentalStdlibApi
public fun <E : Element> Element.getPolymorphicElement(key: Key<Any>): Any? {
   if (key is AbstractCoroutineContextKey) {
      val var10000: CoroutineContext.Element
      if ((key as AbstractCoroutineContextKey).isSubKey$kotlin_stdlib(`$this$getPolymorphicElement`.key)) {
         val var2: CoroutineContext.Element = (key as AbstractCoroutineContextKey).tryCast$kotlin_stdlib(`$this$getPolymorphicElement`)
         var10000 = if (var2 is CoroutineContext.Element) var2 else null
      } else {
         var10000 = null
      }

      return (E)var10000
   } else {
      return (E)(if (`$this$getPolymorphicElement`.key === key) `$this$getPolymorphicElement` else null)
   }
}

@SinceKotlin(version = "1.3")
@ExperimentalStdlibApi
public fun Element.minusPolymorphicKey(key: Key<*>): CoroutineContext {
   if (key !is AbstractCoroutineContextKey) {
      return if (`$this$minusPolymorphicKey`.key === key) EmptyCoroutineContext.INSTANCE else `$this$minusPolymorphicKey`
   } else {
      return if ((key as AbstractCoroutineContextKey).isSubKey$kotlin_stdlib(`$this$minusPolymorphicKey`.key)
            && (key as AbstractCoroutineContextKey).tryCast$kotlin_stdlib(`$this$minusPolymorphicKey`) != null)
         EmptyCoroutineContext.INSTANCE
         else
         `$this$minusPolymorphicKey`
      }
}

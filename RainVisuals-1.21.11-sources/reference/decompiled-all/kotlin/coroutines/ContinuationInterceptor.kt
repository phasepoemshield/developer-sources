package kotlin.coroutines

import kotlin.coroutines.CoroutineContext.Element

// $VF: Compiled from ContinuationInterceptor.kt
@SinceKotlin(version = "1.3")
public interface ContinuationInterceptor : CoroutineContext.Element {
   @JvmStatic
   ContinuationInterceptor.Key Key = ContinuationInterceptor.Key.$$INSTANCE;

   public open fun releaseInterceptedContinuation(continuation: Continuation<*>) {
   }

   public override fun minusKey(key: kotlin.coroutines.CoroutineContext.Key<*>): CoroutineContext {
   }

   public abstract fun <T> interceptContinuation(continuation: Continuation<Any>): Continuation<Any> {
   }

   public override operator fun <E : Element> get(key: kotlin.coroutines.CoroutineContext.Key<Any>): Any? {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from ContinuationInterceptor.kt
   internal class DefaultImpls {
      @JvmStatic
      fun minusKey(`$this`: ContinuationInterceptor, key: CoroutineContext.Key<*>): CoroutineContext {
         if (key !is AbstractCoroutineContextKey) {
            if (ContinuationInterceptor.Key === key) EmptyCoroutineContext.INSTANCE as CoroutineContext else `$this` as CoroutineContext
         } else {
            if ((key as AbstractCoroutineContextKey).isSubKey$kotlin_stdlib(`$this`.getKey())
                  && (key as AbstractCoroutineContextKey).tryCast$kotlin_stdlib(`$this`) != null)
               EmptyCoroutineContext.INSTANCE as CoroutineContext
               else
               `$this` as CoroutineContext
            }
      }

      @JvmStatic
      fun plus(`$this`: ContinuationInterceptor, context: CoroutineContext): CoroutineContext {
         CoroutineContext.Element.DefaultImpls.plus(`$this`, context)
      }

      @JvmStatic
      fun <E extends CoroutineContext.Element> get(`$this`: ContinuationInterceptor, key: CoroutineContext.Key<E>): E? {
         if (key is AbstractCoroutineContextKey) {
            val var3: CoroutineContext.Element
            if ((key as AbstractCoroutineContextKey).isSubKey$kotlin_stdlib(`$this`.getKey())) {
               val var2: CoroutineContext.Element = (key as AbstractCoroutineContextKey).tryCast$kotlin_stdlib(`$this`)
               var3 = if (var2 is CoroutineContext.Element) var2 else null
            } else {
               var3 = null
            }

            var3
         } else {
            val var10000: CoroutineContext.Element
            if (ContinuationInterceptor.Key === key) {
               var10000 = `$this`
            } else {
               var10000 = null
            }

            var10000
         }
      }

      @JvmStatic
      fun <R> fold(initial: ContinuationInterceptor, operation: R, `$this`: (R?, CoroutineContext.Element?) -> R): R {
         CoroutineContext.Element.DefaultImpls.fold(`$this`, initial, operation)
      }

      @JvmStatic
      fun releaseInterceptedContinuation(continuation: ContinuationInterceptor, `$this`: Continuation<*>) {
      }
   }

   // $VF: Compiled from ContinuationInterceptor.kt
   public companion object Key : CoroutineContext.Key<ContinuationInterceptor>
}

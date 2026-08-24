package kotlin.coroutines

// $VF: Compiled from CoroutineContext.kt
@SinceKotlin(version = "1.3")
public interface CoroutineContext {
   public abstract operator fun <E : kotlin.coroutines.CoroutineContext.Element> get(key: kotlin.coroutines.CoroutineContext.Key<Any>): Any? {
   }

   public abstract fun minusKey(key: kotlin.coroutines.CoroutineContext.Key<*>): CoroutineContext {
   }

   public open operator fun plus(context: CoroutineContext): CoroutineContext {
   }

   public abstract fun <R> fold(initial: Any, operation: (Any, kotlin.coroutines.CoroutineContext.Element) -> Any): Any {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from CoroutineContext.kt
   internal class DefaultImpls {
      @JvmStatic
      fun plus(context: CoroutineContext, `$this`: CoroutineContext): CoroutineContext {
         if (context === EmptyCoroutineContext.INSTANCE)
            `$this`
            else
            context.fold(
               `$this`,
               { acc, element ->
                  val removed: CoroutineContext = acc.minusKey(element.key)
                  var var10000: CoroutineContext
                  if (removed === EmptyCoroutineContext.INSTANCE) {
                     var10000 = element
                  } else {
                     val interceptor: ContinuationInterceptor = removed.get(ContinuationInterceptor.Key)
                     if (interceptor == null) {
                        var10000 = CombinedContext(removed, element)
                     } else {
                        val left: CoroutineContext = removed.minusKey(ContinuationInterceptor.Key)
                        var10000 = if (left === EmptyCoroutineContext.INSTANCE)
                           CombinedContext(element, interceptor)
                           else
                           CombinedContext(CombinedContext(left, element), interceptor)
                        }

                     var10000 = var10000
                  }

                  var10000
               }
            ) as CoroutineContext
         }
   }

   // $VF: Compiled from CoroutineContext.kt
   public interface Element : CoroutineContext {
      public override fun <R> fold(initial: Any, operation: (Any, kotlin.coroutines.CoroutineContext.Element) -> Any): Any {
      }

      public override fun minusKey(key: kotlin.coroutines.CoroutineContext.Key<*>): CoroutineContext {
      }

      public override operator fun <E : kotlin.coroutines.CoroutineContext.Element> get(key: kotlin.coroutines.CoroutineContext.Key<Any>): Any? {
      }

      public val key: kotlin.coroutines.CoroutineContext.Key<*>

      // $VF: Class flags could not be determined
      // $VF: Compiled from CoroutineContext.kt
      internal class DefaultImpls {
         @JvmStatic
         fun plus(`$this`: CoroutineContext.Element, context: CoroutineContext): CoroutineContext {
            CoroutineContext.DefaultImpls.plus(`$this`, context)
         }

         @JvmStatic
         fun minusKey(key: CoroutineContext.Element, `$this`: CoroutineContext.Key<*>): CoroutineContext {
            if (`$this`.key == key) EmptyCoroutineContext.INSTANCE as CoroutineContext else `$this` as CoroutineContext
         }

         @JvmStatic
         fun <R> fold(`$this`: CoroutineContext.Element, operation: R, initial: (R?, CoroutineContext.Element?) -> R): R {
            operation(initial, `$this`)
         }

         @JvmStatic
         fun <E extends CoroutineContext.Element> get(`$this`: CoroutineContext.Element, key: CoroutineContext.Key<E>): E? {
            val var10000: CoroutineContext.Element
            if (`$this`.key == key) {
               var10000 = `$this`
            } else {
               var10000 = null
            }

            var10000
         }
      }
   }

   // $VF: Compiled from CoroutineContext.kt
   public interface Key<E extends CoroutineContext.Element>
}

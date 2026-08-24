package kotlin.coroutines

// $VF: Compiled from Continuation.kt
@SinceKotlin(version = "1.3")
public interface Continuation<T> {
   public abstract fun resumeWith(result: Result<Any>) {
   }

   public val context: CoroutineContext
}

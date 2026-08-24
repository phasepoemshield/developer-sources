package kotlin

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function3

// $VF: Compiled from Continuation.kt
// $VF: local visibility outside of methodSupplier
internal class `DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1` : Continuation<Object> {
   fun `DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1`(
      `$context`: CoroutineContext, var2: DeepRecursiveScopeImpl, var3: Function3, var4: Continuation
   ) {
      this.$context = `$context`
      this.this$0 = var2
      this.$currentFunction$inlined = var3
      this.$cont$inlined = var4
   }

   public open val context: CoroutineContext
      public open get() {
         return this.$context
      }


   public override fun resumeWith(result: Result<Any>) {
      DeepRecursiveScopeImpl.access$setFunction$p(this.this$0, this.$currentFunction$inlined)
      DeepRecursiveScopeImpl.access$setCont$p(this.this$0, this.$cont$inlined)
      DeepRecursiveScopeImpl.access$setResult$p(this.this$0, result)
   }
}

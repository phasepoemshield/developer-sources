package kotlin.coroutines.intrinsics

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.jvm.internal.ContinuationImpl
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.TypeIntrinsics

// $VF: Compiled from IntrinsicsJvm.kt
// $VF: local visibility outside of methodSupplier
internal class `IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2`
   : ContinuationImpl {
   private final var label: Int

   protected override fun invokeSuspend(result: Result<Any?>): Any? {
      var var10000: Any
      when (this.label) {
         0 -> {
            this.label = 1
            ResultKt.throwOnFailure(result)
            val var4: Continuation = this
            var10000 = (TypeIntrinsics.beforeCheckcastToFunctionOfArity(this.$this_createCoroutineUnintercepted$inlined, 1) as Function1)(var4)
         }
         1 -> {
            this.label = 2
            ResultKt.throwOnFailure(result)
            var10000 = result
         }
         else -> throw IllegalStateException("This coroutine had already completed".toString())
      }

      return var10000
   }

   fun `IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2`(
      `$completion`: Continuation, `$context`: CoroutineContext, var3: Function1
   ) {
      super(`$completion`, `$context`)
      this.$this_createCoroutineUnintercepted$inlined = var3
   }
}

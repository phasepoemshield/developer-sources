package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation
import kotlin.jvm.internal.FunctionBase
import kotlin.jvm.internal.Reflection

// $VF: Compiled from ContinuationImpl.kt
@SinceKotlin(version = "1.3")
internal abstract class RestrictedSuspendLambda : RestrictedContinuationImpl, SuspendFunction, FunctionBase {
   public open val arity: Int

   public override fun toString(): String {
      val var10000: java.lang.String
      if (this.getCompletion() == null) {
         var10000 = Reflection.renderLambdaToString(this)
      } else {
         var10000 = super.toString()
      }

      return var10000
   }

   open fun RestrictedSuspendLambda(arity: Int) {
      this(arity, null)
   }

   open fun RestrictedSuspendLambda(completion: Int, arity: Continuation<Object>?) {
      super(completion)
      this.arity = arity
   }
}

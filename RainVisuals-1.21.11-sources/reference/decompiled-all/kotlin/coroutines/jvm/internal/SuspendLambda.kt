package kotlin.coroutines.jvm.internal

import kotlin.coroutines.Continuation
import kotlin.jvm.internal.FunctionBase
import kotlin.jvm.internal.Reflection

// $VF: Compiled from ContinuationImpl.kt
@SinceKotlin(version = "1.3")
internal abstract class SuspendLambda : ContinuationImpl, FunctionBase<Object>, SuspendFunction {
   public open val arity: Int

   open fun SuspendLambda(arity: Int) {
      this(arity, null)
   }

   public override fun toString(): String {
      val var10000: java.lang.String
      if (this.getCompletion() == null) {
         var10000 = Reflection.renderLambdaToString(this)
      } else {
         var10000 = super.toString()
      }

      return var10000
   }

   open fun SuspendLambda(completion: Int, arity: Continuation<Object>?) {
      super(completion)
      this.arity = arity
   }
}

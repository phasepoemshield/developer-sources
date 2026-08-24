package kotlin.reflect

// $VF: Compiled from KFunction.kt
public interface KFunction<R> : KCallable<R>, Function<R> {
   public val isInline: Boolean

   public val isInfix: Boolean

   public val isExternal: Boolean

   public val isSuspend: Boolean

   public val isOperator: Boolean

   // $VF: Class flags could not be determined
   // $VF: Compiled from KFunction.kt
   internal class DefaultImpls
}

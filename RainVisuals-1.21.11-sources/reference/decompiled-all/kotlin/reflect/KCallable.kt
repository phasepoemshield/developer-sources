package kotlin.reflect

// $VF: Compiled from KCallable.kt
public interface KCallable<R> : KAnnotatedElement {
   public val typeParameters: List<KTypeParameter>

   public val isSuspend: Boolean

   public val isFinal: Boolean

   public val isOpen: Boolean

   public val isAbstract: Boolean

   public abstract fun call(vararg args: Any?): Any {
   }

   public val name: String

   public val parameters: List<KParameter>

   public val visibility: KVisibility?

   public abstract fun callBy(args: Map<KParameter, Any?>): Any {
   }

   public val returnType: KType

   // $VF: Class flags could not be determined
   // $VF: Compiled from KCallable.kt
   internal class DefaultImpls
}

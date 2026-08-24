package kotlin.reflect

// $VF: Compiled from KType.kt
public interface KType : KAnnotatedElement {
   public val arguments: List<KTypeProjection>

   public val isMarkedNullable: Boolean

   public val classifier: KClassifier?

   // $VF: Class flags could not be determined
   // $VF: Compiled from KType.kt
   internal class DefaultImpls
}

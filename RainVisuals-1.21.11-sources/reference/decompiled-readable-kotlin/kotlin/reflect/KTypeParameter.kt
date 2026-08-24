package kotlin.reflect

// $VF: Compiled from KTypeParameter.kt
@SinceKotlin(version = "1.1")
public interface KTypeParameter : KClassifier {
   public val isReified: Boolean

   public val upperBounds: List<KType>

   public val variance: KVariance

   public val name: String
}

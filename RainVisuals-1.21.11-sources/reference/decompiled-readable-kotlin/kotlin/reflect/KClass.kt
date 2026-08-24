package kotlin.reflect

// $VF: Compiled from KClass.kt
public interface KClass<T> : KAnnotatedElement, KClassifier, KDeclarationContainer {
   public val visibility: KVisibility?

   public val isSealed: Boolean

   public val isFun: Boolean

   public val qualifiedName: String?

   public val isData: Boolean

   public abstract override operator fun equals(other: Any?): Boolean {
   }

   public val isInner: Boolean

   public val typeParameters: List<KTypeParameter>

   public val isValue: Boolean

   public val isFinal: Boolean

   public val isCompanion: Boolean

   public val nestedClasses: Collection<KClass<*>>

   public val isAbstract: Boolean

   public abstract override fun hashCode(): Int {
   }

   public val objectInstance: Any?

   public val isOpen: Boolean

   public val sealedSubclasses: List<KClass<out Any>>

   public val supertypes: List<KType>

   @SinceKotlin(version = "1.1")
   public abstract fun isInstance(value: Any?): Boolean {
   }

   public val constructors: Collection<KFunction<Any>>

   public val members: Collection<KCallable<*>>

   public val simpleName: String?

   // $VF: Class flags could not be determined
   // $VF: Compiled from KClass.kt
   internal class DefaultImpls
}

package kotlin.reflect

// $VF: Compiled from KProperty.kt
public interface KMutableProperty<V> : KProperty<V> {
   public val setter: kotlin.reflect.KMutableProperty.Setter<Any>

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Setter<V> : KFunction, KProperty.Accessor
}

package kotlin.reflect

import kotlin.jvm.functions.Function2

// $VF: Compiled from KProperty.kt
public interface KMutableProperty1<T, V> : KMutableProperty, KProperty1 {
   public abstract fun set(receiver: Any, value: Any) {
   }

   public val setter: KMutableProperty1.Setter<Any, Any>

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Setter<T, V> : Function2, KMutableProperty.Setter
}

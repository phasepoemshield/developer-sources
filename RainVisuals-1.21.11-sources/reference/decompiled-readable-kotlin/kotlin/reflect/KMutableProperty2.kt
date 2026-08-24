package kotlin.reflect

import kotlin.jvm.functions.Function3

// $VF: Compiled from KProperty.kt
public interface KMutableProperty2<D, E, V> : KMutableProperty, KProperty2 {
   public val setter: KMutableProperty2.Setter<Any, Any, Any>

   public abstract fun set(receiver1: Any, receiver2: Any, value: Any) {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Setter<D, E, V> : KMutableProperty.Setter<V>, Function3<D, E, V, Unit>
}

package kotlin.reflect

import kotlin.jvm.functions.Function1

// $VF: Compiled from KProperty.kt
public interface KMutableProperty0<V> : KMutableProperty, KProperty0 {
   public val setter: KMutableProperty0.Setter<Any>

   public abstract fun set(value: Any) {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Setter<V> : Function1, KMutableProperty.Setter
}

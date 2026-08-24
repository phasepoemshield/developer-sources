package kotlin.reflect

import kotlin.jvm.functions.Function2

// $VF: Compiled from KProperty.kt
public interface KProperty2<D, E, V> : Function2, KProperty {
   public abstract fun get(receiver1: Any, receiver2: Any): Any {
   }

   @SinceKotlin(version = "1.1")
   public abstract fun getDelegate(receiver1: Any, receiver2: Any): Any? {
   }

   public val getter: KProperty2.Getter<Any, Any, Any>

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Getter<D, E, V> : Function2, KProperty.Getter
}

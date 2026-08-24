package kotlin.reflect

import kotlin.jvm.functions.Function1

// $VF: Compiled from KProperty.kt
public interface KProperty1<T, V> : Function1, KProperty {
   @SinceKotlin(version = "1.1")
   public abstract fun getDelegate(receiver: Any): Any? {
   }

   public val getter: KProperty1.Getter<Any, Any>

   public abstract fun get(receiver: Any): Any {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Getter<T, V> : Function1, KProperty.Getter
}

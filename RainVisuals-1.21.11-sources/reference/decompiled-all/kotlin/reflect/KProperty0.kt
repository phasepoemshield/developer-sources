package kotlin.reflect

import kotlin.jvm.functions.Function0

// $VF: Compiled from KProperty.kt
public interface KProperty0<V> : Function0, KProperty {
   @SinceKotlin(version = "1.1")
   public abstract fun getDelegate(): Any? {
   }

   public val getter: KProperty0.Getter<Any>

   public abstract fun get(): Any {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Getter<V> : Function0, KProperty.Getter
}

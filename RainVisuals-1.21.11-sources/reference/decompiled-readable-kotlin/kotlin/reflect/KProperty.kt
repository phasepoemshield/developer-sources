package kotlin.reflect

// $VF: Compiled from KProperty.kt
public interface KProperty<V> : KCallable<V> {
   public val getter: kotlin.reflect.KProperty.Getter<Any>

   public val isLateinit: Boolean

   public val isConst: Boolean

   // $VF: Compiled from KProperty.kt
   public interface Accessor<V> {
      public val property: KProperty<Any>
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from KProperty.kt
   internal class DefaultImpls

   // $VF: Compiled from KProperty.kt
   public interface Getter<V> : KProperty.Accessor<V>, KFunction<V>
}

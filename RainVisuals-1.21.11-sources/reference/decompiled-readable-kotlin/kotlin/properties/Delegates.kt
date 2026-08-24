package kotlin.properties

import kotlin.reflect.KProperty

// $VF: Compiled from Delegates.kt
public object Delegates {
   public inline fun <T> vetoable(initialValue: Any, crossinline onChange: (KProperty<*>, Any, Any) -> Boolean): ReadWriteProperty<Any?, Any> {
      return       // $VF: Compiled from Delegates.kt
object : ObservableProperty<Any> {
         protected override fun beforeChange(property: KProperty<*>, oldValue: Any, newValue: Any): Boolean {
            return onChange(property, oldValue, newValue) as java.lang.Boolean
         }
      } as ReadWriteProperty<Object, T>
   }

   public fun <T : Any> notNull(): ReadWriteProperty<Any?, Any> {
      return NotNullVar()
   }

   public inline fun <T> observable(initialValue: Any, crossinline onChange: (KProperty<*>, Any, Any) -> Unit): ReadWriteProperty<Any?, Any> {
      return       // $VF: Compiled from Delegates.kt
object : ObservableProperty<Any> {
         protected override fun afterChange(property: KProperty<*>, oldValue: Any, newValue: Any) {
            onChange(property, oldValue, newValue)
         }
      } as ReadWriteProperty<Object, T>
   }
}

package kotlin.properties

import kotlin.reflect.KProperty

// $VF: Compiled from Interfaces.kt
@SinceKotlin(version = "1.4")
public fun interface PropertyDelegateProvider<T, D> {
   public abstract operator fun provideDelegate(thisRef: Any, property: KProperty<*>): Any {
   }
}

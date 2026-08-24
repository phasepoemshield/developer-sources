package kotlinx.serialization.internal

import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer

// $VF: Compiled from Platform.common.kt
internal interface SerializerCache<T> {
   public abstract fun get(key: KClass<Any>): KSerializer<Any>? {
   }
}

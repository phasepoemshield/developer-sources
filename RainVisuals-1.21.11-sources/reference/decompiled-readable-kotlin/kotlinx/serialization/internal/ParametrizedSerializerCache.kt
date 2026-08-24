package kotlinx.serialization.internal

import kotlin.reflect.KClass
import kotlin.reflect.KType
import kotlinx.serialization.KSerializer

// $VF: Compiled from Platform.common.kt
internal interface ParametrizedSerializerCache<T> {
   public abstract fun get(key: KClass<Any>, types: List<KType> = ...): Result<KSerializer<Any>?> {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from Platform.common.kt
   internal class DefaultImpls
}

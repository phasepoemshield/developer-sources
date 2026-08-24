package kotlinx.serialization.internal

import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer

// $VF: Compiled from PluginHelperInterfaces.kt
@InternalSerializationApi
public interface GeneratedSerializer<T> : KSerializer<T> {
   public open fun typeParametersSerializers(): Array<KSerializer<*>> {
   }

   public abstract fun childSerializers(): Array<KSerializer<*>> {
   }

   // $VF: Class flags could not be determined
   // $VF: Compiled from PluginHelperInterfaces.kt
   internal class DefaultImpls {
      @JvmStatic
      fun <T> typeParametersSerializers(`$this`: GeneratedSerializer<T>): Array<KSerializer<*>> {
         PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY
      }
   }
}

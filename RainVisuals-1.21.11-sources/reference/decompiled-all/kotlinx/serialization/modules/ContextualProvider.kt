package kotlinx.serialization.modules

import kotlinx.serialization.KSerializer

// $VF: Compiled from SerializersModule.kt
internal sealed class ContextualProvider protected constructor() {
   public abstract operator fun invoke(typeArgumentsSerializers: List<KSerializer<*>>): KSerializer<*> {
   }

   // $VF: Compiled from SerializersModule.kt
   public class Argless(serializer: KSerializer<*>) : ContextualProvider() {
      public final val serializer: KSerializer<*>

      public override operator fun invoke(typeArgumentsSerializers: List<KSerializer<*>>): KSerializer<*> {
         return this.serializer
      }

      init {
         this.serializer = serializer
      }

      public override fun hashCode(): Int {
         return this.serializer.hashCode()
      }

      public override operator fun equals(other: Any?): Boolean {
         return other is ContextualProvider.Argless && (other as ContextualProvider.Argless).serializer == this.serializer
      }
   }

   // $VF: Compiled from SerializersModule.kt
   public class WithTypeArguments(provider: (List<KSerializer<*>>) -> KSerializer<*>) : ContextualProvider() {
      public final val provider: (List<KSerializer<*>>) -> KSerializer<*>

      init {
         this.provider = provider
      }

      public override operator fun invoke(typeArgumentsSerializers: List<KSerializer<*>>): KSerializer<*> {
         return this.provider(typeArgumentsSerializers)
      }
   }
}

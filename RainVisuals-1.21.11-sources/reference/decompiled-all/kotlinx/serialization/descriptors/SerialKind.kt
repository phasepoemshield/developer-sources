package kotlinx.serialization.descriptors

import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from SerialKinds.kt
@ExperimentalSerializationApi
public sealed class SerialKind protected constructor() {
   public override fun hashCode(): Int {
      return this.toString().hashCode()
   }

   public override fun toString(): String {
      val var10000: java.lang.String = (this.getClass()::class).simpleName
      return var10000
   }

   // $VF: Compiled from SerialKinds.kt
   @ExperimentalSerializationApi
   public object CONTEXTUAL : SerialKind()

   // $VF: Compiled from SerialKinds.kt
   @ExperimentalSerializationApi
   public object ENUM : SerialKind()
}

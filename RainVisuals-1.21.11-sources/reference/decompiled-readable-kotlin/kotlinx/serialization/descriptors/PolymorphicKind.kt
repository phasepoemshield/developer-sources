package kotlinx.serialization.descriptors

import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from SerialKinds.kt
@ExperimentalSerializationApi
public sealed class PolymorphicKind protected constructor() : SerialKind() {
   // $VF: Compiled from SerialKinds.kt
   public object OPEN : PolymorphicKind()

   // $VF: Compiled from SerialKinds.kt
   public object SEALED : PolymorphicKind()
}

package kotlinx.serialization.descriptors

import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from SerialKinds.kt
@ExperimentalSerializationApi
public sealed class StructureKind protected constructor() : SerialKind() {
   // $VF: Compiled from SerialKinds.kt
   public object CLASS : StructureKind()

   // $VF: Compiled from SerialKinds.kt
   public object LIST : StructureKind()

   // $VF: Compiled from SerialKinds.kt
   public object MAP : StructureKind()

   // $VF: Compiled from SerialKinds.kt
   public object OBJECT : StructureKind()
}

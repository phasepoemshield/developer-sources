package kotlinx.serialization.internal

import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from CollectionDescriptors.kt
internal class LinkedHashMapClassDesc(keyDesc: SerialDescriptor, valueDesc: SerialDescriptor) : MapLikeDescriptor(
      "kotlin.collections.LinkedHashMap", keyDesc, valueDesc
   )

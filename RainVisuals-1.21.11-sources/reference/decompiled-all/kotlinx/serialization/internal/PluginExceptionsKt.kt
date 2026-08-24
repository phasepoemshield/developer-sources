package kotlinx.serialization.internal

import java.util.ArrayList
import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.MissingFieldException
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from PluginExceptions.kt
@InternalSerializationApi
public fun throwArrayMissingFieldException(seenArray: IntArray, goldenMaskArray: IntArray, descriptor: SerialDescriptor) {
   val missingFields: java.util.List = ArrayList()
   var maskSlot: Int = 0

   for (var5 in goldenMaskArray.length..maskSlot) {
      var missingFieldsBits: Int = goldenMaskArray[maskSlot] and seenArray[maskSlot].inv()
      if ((goldenMaskArray[maskSlot] and seenArray[maskSlot].inv()) != 0) {
         repeat(31) { i ->
            if ((missingFieldsBits and 1) != 0) {
               missingFields.add(descriptor.getElementName(maskSlot * 32 + i))
            }

            missingFieldsBits >>>= 1
         }
      }
   }

   throw MissingFieldException(missingFields, descriptor.serialName)
}

@InternalSerializationApi
public fun throwMissingFieldException(seen: Int, goldenMask: Int, descriptor: SerialDescriptor) {
   val missingFields: java.util.List = ArrayList()
   var missingFieldsBits: Int = goldenMask and seen.inv()

   repeat(31) { i ->
      if ((missingFieldsBits and 1) != 0) {
         missingFields.add(descriptor.getElementName(i))
      }

      missingFieldsBits >>>= 1
   }

   throw MissingFieldException(missingFields, descriptor.serialName)
}

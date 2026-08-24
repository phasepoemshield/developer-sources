package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind

// $VF: Compiled from PluginGeneratedSerialDescriptor.kt
internal fun SerialDescriptor.hashCodeImpl(typeParams: Array<SerialDescriptor>): Int {
   val var21: Int = 31 * `$this$hashCodeImpl`.serialName.hashCode() + Arrays.hashCode(typeParams)
   val elementDescriptors: java.lang.Iterable = elementDescriptors
   var `$i$f$fold`: Int = 1

   for (`element$iv$iv` in elementDescriptors) {
      val var10000: Int = 31 * `$i$f$fold`
      val var20: java.lang.String = (`element$iv$iv` as SerialDescriptor).serialName
      `$i$f$fold` = var10000 + (if (var20 != null) var20.hashCode() else 0)
   }

   var var29: Int = 1

   for (var31 in elementDescriptors) {
      val var38: Int = 31 * var29
      val var37: SerialKind = (var31 as SerialDescriptor).kind
      var29 = var38 + (if (var37 != null) var37.hashCode() else 0)
   }

   return 31 * (31 * var21 + `$i$f$fold`) + var29
}

package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from InlineClassDescriptor.kt
@PublishedApi
internal class InlineClassDescriptor(name: String, generatedSerializer: GeneratedSerializer<*>) : PluginGeneratedSerialDescriptor(name, generatedSerializer, 1) {
   public open val isInline: Boolean = true

   public override fun hashCode(): Int {
      return super.hashCode() * 31
   }

   public override operator fun equals(other: Any?): Boolean {
      val `$this$equalsImpl$iv`: SerialDescriptor = this
      var var10000: Boolean
      if (this === other) {
         var10000 = true
      } else if (other !is InlineClassDescriptor) {
         var10000 = false
      } else if (!(`$this$equalsImpl$iv`.serialName == (other as SerialDescriptor).serialName)) {
         var10000 = false
      } else if (!(other as InlineClassDescriptor).isInline
         || !Arrays.equals(
            this.getTypeParameterDescriptors$kotlinx_serialization_core(),
            (other as InlineClassDescriptor).getTypeParameterDescriptors$kotlinx_serialization_core()
         )) {
         var10000 = false
      } else if (`$this$equalsImpl$iv`.elementsCount != (other as SerialDescriptor).elementsCount) {
         var10000 = false
      } else {
         var `index$iv`: Int = 0
         val var7: Int = `$this$equalsImpl$iv`.elementsCount

         while (true) {
            if (`index$iv` >= var7) {
               var10000 = true
               break
            }

            if (!(`$this$equalsImpl$iv`.getElementDescriptor(`index$iv`).serialName == (other as SerialDescriptor).getElementDescriptor(`index$iv`).serialName)
               )
             {
               var10000 = false
               break
            }

            if (!(`$this$equalsImpl$iv`.getElementDescriptor(`index$iv`).kind == (other as SerialDescriptor).getElementDescriptor(`index$iv`).kind)) {
               var10000 = false
               break
            }

            `index$iv`++
         }
      }

      return var10000
   }
}

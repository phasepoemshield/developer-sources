package kotlinx.serialization.internal

import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer

// $VF: Compiled from Enums.kt
@InternalSerializationApi
internal fun <T : Enum<Any>> createMarkedEnumSerializer(serialName: String, values: Array<Any>, names: Array<String?>, annotations: Array<Array<Annotation>?>): KSerializer<
      Any
   > {
   val descriptor: EnumDescriptor = EnumDescriptor(serialName, values.length)
   var `index$iv`: Int = 0

   for (`item$iv` in values) {
      val var10000: Int = `index$iv`++
      var var22: java.lang.String = ArraysKt.getOrNull(names, var10000)
      if (var22 == null) {
         var22 = `item$iv`.name()
      }

      PluginGeneratedSerialDescriptor.addElement$default(descriptor, var22, false, 2, null)
      val var23: Array<java.lang.annotation.Annotation> = ArraysKt.getOrNull((java.lang.annotation.Annotation[][])(annotations as Array<Any>), var10000)
      if (var23 != null) {
         for (`element$iv` in var23) {
            descriptor.pushAnnotation(`element$iv`)
         }
      }
   }

   return EnumSerializer(serialName, values, descriptor)
}

@InternalSerializationApi
internal fun <T : Enum<Any>> createSimpleEnumSerializer(serialName: String, values: Array<Any>): KSerializer<Any> {
   return EnumSerializer(serialName, values)
}

@InternalSerializationApi
internal fun <T : Enum<Any>> createAnnotatedEnumSerializer(
   serialName: String,
   values: Array<Any>,
   names: Array<String?>,
   entryAnnotations: Array<Array<Annotation>?>,
   classAnnotations: Array<Annotation>?
): KSerializer<Any> {
   val descriptor: EnumDescriptor = EnumDescriptor(serialName, values.length)
   if (classAnnotations != null) {
      for (`element$iv` in classAnnotations) {
         descriptor.pushClassAnnotation(`element$iv`)
      }
   }

   var var25: Int = 0

   for (var28 in values) {
      val var10000: Int = var25++
      var var30: java.lang.String = ArraysKt.getOrNull(names, var10000)
      if (var30 == null) {
         var30 = var28.name()
      }

      PluginGeneratedSerialDescriptor.addElement$default(descriptor, var30, false, 2, null)
      val var31: Array<java.lang.annotation.Annotation> = ArraysKt.getOrNull((java.lang.annotation.Annotation[][])(entryAnnotations as Array<Any>), var10000)
      if (var31 != null) {
         for (`element$iv` in var31) {
            descriptor.pushAnnotation(`element$iv`)
         }
      }
   }

   return EnumSerializer(serialName, values, descriptor)
}

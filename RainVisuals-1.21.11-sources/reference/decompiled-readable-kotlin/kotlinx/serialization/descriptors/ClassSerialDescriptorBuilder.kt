package kotlinx.serialization.descriptors

import java.util.ArrayList
import java.util.HashSet
import kotlinx.serialization.ExperimentalSerializationApi

// $VF: Compiled from SerialDescriptors.kt
public class ClassSerialDescriptorBuilder internal constructor(serialName: String) {
   internal final val elementOptionality: MutableList<Boolean>
   internal final val elementDescriptors: MutableList<SerialDescriptor>
   internal final val elementNames: MutableList<String>
   public final val serialName: String

   @Deprecated(
      message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.",
      level = DeprecationLevel.ERROR
   )
   @ExperimentalSerializationApi
   public final var isNullable: Boolean

   @ExperimentalSerializationApi
   public final var annotations: List<Annotation>

   internal final val elementAnnotations: MutableList<List<Annotation>>
   private final val uniqueNames: MutableSet<String>

   public fun element(elementName: String, descriptor: SerialDescriptor, annotations: List<Annotation> = CollectionsKt.emptyList(), isOptional: Boolean = false) {
      if (!this.uniqueNames.add(elementName)) {
         throw IllegalArgumentException(("Element with name '$elementName' is already registered in ${this.serialName}").toString())
      } else {
         this.elementNames.add(elementName)
         this.elementDescriptors.add(descriptor)
         this.elementAnnotations.add(annotations)
         this.elementOptionality.add(isOptional)
      }
   }

   init {
      this.serialName = serialName
      this.annotations = CollectionsKt.emptyList()
      this.elementNames = ArrayList<>()
      this.uniqueNames = HashSet<>()
      this.elementDescriptors = ArrayList<>()
      this.elementAnnotations = ArrayList<>()
      this.elementOptionality = ArrayList<>()
   }
}

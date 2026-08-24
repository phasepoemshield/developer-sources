package kotlinx.serialization.descriptors

import java.util.ArrayList
import java.util.Arrays
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlinx.serialization.internal.CachedNames
import kotlinx.serialization.internal.Platform_commonKt
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt

// $VF: Compiled from SerialDescriptors.kt
internal class SerialDescriptorImpl(serialName: String,
      kind: SerialKind,
      elementsCount: Int,
      typeParameters: List<SerialDescriptor>,
      builder: ClassSerialDescriptorBuilder
   ) :
   CachedNames,
   SerialDescriptor {
   private final val elementAnnotations: Array<List<Annotation>>
   public open val serialName: String
   public open val kind: SerialKind
   public open val serialNames: Set<String>
   public open val annotations: List<Annotation>

   private final val _hashCode: Int
      private final get() {
         return (this._hashCode$delegate.value as java.lang.Number).intValue()
      }


   private final val typeParametersDescriptors: Array<SerialDescriptor>
   private final val elementNames: Array<String>
   private final val name2Index: Map<String, Int>
   private final val elementDescriptors: Array<SerialDescriptor>
   public open val elementsCount: Int
   private final val elementOptionality: BooleanArray

   public override fun getElementIndex(name: String): Int {
      val var10000: Int = this.name2Index.get(name)
      return var10000 ?: -3
   }

   public override fun getElementAnnotations(index: Int): List<Annotation> {
      return this.elementAnnotations[index]
   }

   public override fun toString(): String {
      return CollectionsKt.joinToString$default(
         RangesKt.until((int)0, (int)this.elementsCount), ", ", "${this.serialName}(", ")", 0, null,       // $VF: Compiled from SerialDescriptors.kt
   { it: Int ->
            return "${SerialDescriptorImpl.this.getElementName(it)}: ${SerialDescriptorImpl.this.getElementDescriptor(it).serialName}"
         } as Function1, 24, null
      )
   }

   public override fun getElementName(index: Int): String {
      return this.elementNames[index]
   }

   override fun isInline(): Boolean {
      SerialDescriptor.DefaultImpls.isInline(this)
   }

   public override operator fun equals(other: Any?): Boolean {
      val `$this$equalsImpl$iv`: SerialDescriptor = this
      var var10000: Boolean
      if (this === other) {
         var10000 = true
      } else if (other !is SerialDescriptorImpl) {
         var10000 = false
      } else if (!(`$this$equalsImpl$iv`.serialName == (other as SerialDescriptor).serialName)) {
         var10000 = false
      } else if (!Arrays.equals(this.typeParametersDescriptors, (other as SerialDescriptorImpl).typeParametersDescriptors)) {
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

   init {
      this.serialName = serialName
      this.kind = kind
      this.elementsCount = elementsCount
      this.annotations = builder.annotations
      this.serialNames = CollectionsKt.toHashSet(builder.elementNames)
      this.elementNames = builder.elementNames.toArray(arrayOfNulls(0))
      this.elementDescriptors = Platform_commonKt.compactArray(builder.elementDescriptors)
      this.elementAnnotations = builder.elementAnnotations.toArray(arrayOfNulls(0))
      this.elementOptionality = CollectionsKt.toBooleanArray(builder.elementOptionality)
      val var18: java.lang.Iterable = ArraysKt.withIndex(this.elementNames)
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var18, 10))

      for (`item$iv$iv` in var18) {
         `destination$iv$iv`.add((`item$iv$iv` as IndexedValue).value to (`item$iv$iv` as IndexedValue).index)
      }

      this.name2Index = MapsKt.toMap(`destination$iv$iv`)
      this.typeParametersDescriptors = Platform_commonKt.compactArray(typeParameters)
      this._hashCode$delegate = LazyKt.lazy(      // $VF: Compiled from SerialDescriptors.kt
{
         return PluginGeneratedSerialDescriptorKt.hashCodeImpl(SerialDescriptorImpl.this, SerialDescriptorImpl.this.typeParametersDescriptors)
      } as Function0)
   }

   override fun isNullable(): Boolean {
      SerialDescriptor.DefaultImpls.isNullable(this)
   }

   public override fun isElementOptional(index: Int): Boolean {
      return this.elementOptionality[index]
   }

   public override fun hashCode(): Int {
      return this._hashCode
   }

   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      return this.elementDescriptors[index]
   }
}

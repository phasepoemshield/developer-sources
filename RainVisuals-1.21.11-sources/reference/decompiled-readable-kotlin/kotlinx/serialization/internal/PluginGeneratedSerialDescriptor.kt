package kotlinx.serialization.internal

import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialKind
import kotlinx.serialization.descriptors.StructureKind

// $VF: Compiled from PluginGeneratedSerialDescriptor.kt
@PublishedApi
internal open class PluginGeneratedSerialDescriptor(serialName: String, generatedSerializer: GeneratedSerializer<*>? = null, elementsCount: Int) :
   SerialDescriptor,
   CachedNames {
   private final val generatedSerializer: GeneratedSerializer<*>?
   private final var indices: Map<String, Int>
   private final val names: Array<String>
   private final var classAnnotations: MutableList<Annotation>?

   internal final val typeParameterDescriptors: Array<SerialDescriptor>
      internal final get() {
         return this.typeParameterDescriptors$delegate.value as Array<SerialDescriptor>
      }


   public final val elementsCount: Int

   private final val childSerializers: Array<KSerializer<*>>
      private final get() {
         return this.childSerializers$delegate.value as Array<KSerializer<*>>
      }


   private final var added: Int

   private final val _hashCode: Int
      private final get() {
         return (this._hashCode$delegate.value as java.lang.Number).intValue()
      }


   private final val elementsOptionality: BooleanArray
   private final val propertiesAnnotations: Array<MutableList<Annotation>?>
   public open val serialName: String

   public override fun toString(): String {
      return CollectionsKt.joinToString$default(
         RangesKt.until((int)0, (int)this.elementsCount),
         ", ",
         "${this.serialName}(",
         ")",
         0,
         null,
               // $VF: Compiled from PluginGeneratedSerialDescriptor.kt
   { i: Int ->
            return "${PluginGeneratedSerialDescriptor.this.getElementName(i)}: ${PluginGeneratedSerialDescriptor.this.getElementDescriptor(i).serialName}"
         } as Function1,
         24,
         null
      )
   }

   public override fun hashCode(): Int {
      return this._hashCode
   }

   public override fun getElementAnnotations(index: Int): List<Annotation> {
      var var10000: Any = this.propertiesAnnotations[index]
      if (this.propertiesAnnotations[index] == null) {
         var10000 = CollectionsKt.emptyList()
      }

      return (java.util.List<java.lang.annotation.Annotation>)var10000
   }

   public override fun isElementOptional(index: Int): Boolean {
      return this.elementsOptionality[index]
   }

   override fun isInline(): Boolean {
      SerialDescriptor.DefaultImpls.isInline(this)
   }

   public override fun getElementIndex(name: String): Int {
      val var10000: Int = this.indices.get(name)
      return var10000 ?: -3
   }

   private fun buildIndices(): Map<String, Int> {
      val indices: HashMap = HashMap()
      var i: Int = 0

      for (var3 in this.names.length..i) {
         indices.put(this.names[i], i)
      }

      return indices
   }

   public fun pushClassAnnotation(a: Annotation) {
      if (this.classAnnotations == null) {
         this.classAnnotations = ArrayList<>(1)
      }

      val var10000: java.util.List = this.classAnnotations
      var10000.add(a)
   }

   public open val kind: SerialKind
      public open get() {
         return StructureKind.CLASS.INSTANCE
      }


   public open val annotations: List<Annotation>
      public open get() {
         var var10000: java.util.List = this.classAnnotations
         if (this.classAnnotations == null) {
            var10000 = CollectionsKt.emptyList()
         }

         return var10000
      }


   public fun addElement(name: String, isOptional: Boolean = false) {
      val var10000: Array<java.lang.String> = this.names
      this.added++
      var10000[this.added] = name
      this.elementsOptionality[this.added] = isOptional
      this.propertiesAnnotations[this.added] = null
      if (this.added == this.elementsCount - 1) {
         this.indices = this.buildIndices()
      }
   }

   init {
      super()
      this.serialName = serialName
      this.generatedSerializer = generatedSerializer
      this.elementsCount = elementsCount
      this.added = -1
      var var4: Int = 0
      val var5: Int = this.elementsCount
      val var6: Array<java.lang.String> = arrayOfNulls(this.elementsCount)

      while (var4 < var5) {
         var6[var4] = "[UNINITIALIZED]"
         var4++
      }

      this.names = var6
      this.propertiesAnnotations = arrayOfNulls(this.elementsCount)
      this.elementsOptionality = BooleanArray(this.elementsCount)
      this.indices = MapsKt.emptyMap()
      this.childSerializers$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION,       // $VF: Compiled from PluginGeneratedSerialDescriptor.kt
{
         val var10000: GeneratedSerializer = PluginGeneratedSerialDescriptor.this.generatedSerializer
         if (var10000 != null) {
            val var1: Array<KSerializer> = var10000.childSerializers()
            if (var1 != null) {
               return var1
            }
         }

         return PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY
      } as Function0)
      this.typeParameterDescriptors$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION,       // $VF: Compiled from PluginGeneratedSerialDescriptor.kt
{
         val var10000: GeneratedSerializer = PluginGeneratedSerialDescriptor.this.generatedSerializer
         if (var10000 != null) {
            val var12: Array<Any> = var10000.typeParametersSerializers()
            if (var12 != null) {
               val `destination$iv$iv`: java.util.Collection = ArrayList(var12.length)

               for (`item$iv$iv` in var12) {
                  `destination$iv$iv`.add(`item$iv$iv`.descriptor)
               }

               return Platform_commonKt.compactArray(`destination$iv$iv` as MutableList<SerialDescriptor>)
            }
         }

         return Platform_commonKt.compactArray(null)
      } as Function0)
      this._hashCode$delegate = LazyKt.lazy(
         LazyThreadSafetyMode.PUBLICATION,
               // $VF: Compiled from PluginGeneratedSerialDescriptor.kt
   {
            return PluginGeneratedSerialDescriptorKt.hashCodeImpl(
               PluginGeneratedSerialDescriptor.this, PluginGeneratedSerialDescriptor.this.typeParameterDescriptors
            )
         } as Function0
      )
   }

   override fun isNullable(): Boolean {
      SerialDescriptor.DefaultImpls.isNullable(this)
   }

   public override operator fun equals(other: Any?): Boolean {
      val `$this$equalsImpl$iv`: SerialDescriptor = this
      var var10000: Boolean
      if (this === other) {
         var10000 = true
      } else if (other !is PluginGeneratedSerialDescriptor) {
         var10000 = false
      } else if (!(`$this$equalsImpl$iv`.serialName == (other as SerialDescriptor).serialName)) {
         var10000 = false
      } else if (!Arrays.equals(this.typeParameterDescriptors, (other as PluginGeneratedSerialDescriptor).typeParameterDescriptors)) {
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

   public override fun getElementName(index: Int): String {
      return this.names[index]
   }

   public fun pushAnnotation(annotation: Annotation) {
      val it: java.util.List = this.propertiesAnnotations[this.added]
      val var10000: java.util.List
      if (this.propertiesAnnotations[this.added] == null) {
         val result: ArrayList = ArrayList(1)
         this.propertiesAnnotations[this.added] = result
         var10000 = result
      } else {
         var10000 = it
      }

      var10000.add(annotation)
   }

   public override fun getElementDescriptor(index: Int): SerialDescriptor {
      return this.childSerializers[index].descriptor
   }

   public open val serialNames: Set<String>
      public open get() {
         return this.indices.keySet()
      }

}

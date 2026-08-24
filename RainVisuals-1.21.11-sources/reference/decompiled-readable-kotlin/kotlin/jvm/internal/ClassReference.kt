package kotlin.jvm.internal

import java.lang.reflect.Constructor
import java.lang.reflect.Method
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function10
import kotlin.jvm.functions.Function11
import kotlin.jvm.functions.Function12
import kotlin.jvm.functions.Function13
import kotlin.jvm.functions.Function14
import kotlin.jvm.functions.Function15
import kotlin.jvm.functions.Function16
import kotlin.jvm.functions.Function17
import kotlin.jvm.functions.Function18
import kotlin.jvm.functions.Function19
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function20
import kotlin.jvm.functions.Function21
import kotlin.jvm.functions.Function22
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.functions.Function5
import kotlin.jvm.functions.Function6
import kotlin.jvm.functions.Function7
import kotlin.jvm.functions.Function8
import kotlin.jvm.functions.Function9
import kotlin.reflect.KCallable
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.KType
import kotlin.reflect.KTypeParameter
import kotlin.reflect.KVisibility

// $VF: Compiled from ClassReference.kt
public class ClassReference(jClass: Class<*>) : ClassBasedDeclarationContainer, KClass {
   public open val jClass: Class<*>

   @SinceKotlin(version = "1.1")
   public open val isAbstract: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public override fun hashCode(): Int {
      return javaObjectType.hashCode()
   }

   @SinceKotlin(version = "1.1")
   public open val isOpen: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.1")
   public open val isData: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public open val members: Collection<KCallable<*>>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.5")
   public open val isValue: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.1")
   public open val visibility: KVisibility?
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.1")
   public open val supertypes: List<KType>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public override fun toString(): String {
      return "${this.jClass.toString()} (Kotlin reflection is not available)"
   }

   @SinceKotlin(version = "1.1")
   public open val isSealed: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public open val qualifiedName: String?
      public open get() {
         return Companion.getClassQualifiedName(this.jClass)
      }


   @SinceKotlin(version = "1.1")
   public open val isCompanion: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public open val objectInstance: Any?
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public override operator fun equals(other: Any?): Boolean {
      return other is ClassReference && javaObjectType == javaObjectType
   }

   @SinceKotlin(version = "1.4")
   public open val isFun: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.1")
   public open val typeParameters: List<KTypeParameter>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.3")
   public open val sealedSubclasses: List<KClass<out Any>>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @JvmStatic
   fun {
      val var18: java.lang.Iterable = CollectionsKt.listOf(
         Function0.class,
         Function1.class,
         Function2.class,
         Function3.class,
         Function4.class,
         Function5.class,
         Function6.class,
         Function7.class,
         Function8.class,
         Function9.class,
         Function10.class,
         Function11.class,
         Function12.class,
         Function13.class,
         Function14.class,
         Function15.class,
         Function16.class,
         Function17.class,
         Function18.class,
         Function19.class,
         Function20.class,
         Function21.class,
         Function22.class
      )
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var18, 10))
      var `$this$associateByTo$iv$iv$iv`: Int = 0

      for (`item$iv$iv` in var18) {
         val `element$iv$iv$iv`: Int = `$this$associateByTo$iv$iv$iv`++
         if (`element$iv$iv$iv` < 0) {
            CollectionsKt.throwIndexOverflow()
         }

         `destination$iv$iv`.add(`item$iv$iv` as Class to `element$iv$iv$iv`)
      }

      FUNCTION_CLASSES = MapsKt.toMap(`destination$iv$iv`)
      val var19: HashMap = HashMap()
      var19.put("boolean", "kotlin.Boolean")
      var19.put("char", "kotlin.Char")
      var19.put("byte", "kotlin.Byte")
      var19.put("short", "kotlin.Short")
      var19.put("int", "kotlin.Int")
      var19.put("float", "kotlin.Float")
      var19.put("long", "kotlin.Long")
      var19.put("double", "kotlin.Double")
      primitiveFqNames = var19
      val var20: HashMap = HashMap()
      var20.put("java.lang.Boolean", "kotlin.Boolean")
      var20.put("java.lang.Character", "kotlin.Char")
      var20.put("java.lang.Byte", "kotlin.Byte")
      var20.put("java.lang.Short", "kotlin.Short")
      var20.put("java.lang.Integer", "kotlin.Int")
      var20.put("java.lang.Float", "kotlin.Float")
      var20.put("java.lang.Long", "kotlin.Long")
      var20.put("java.lang.Double", "kotlin.Double")
      primitiveWrapperFqNames = var20
      val var21: HashMap = HashMap()
      val var25: HashMap = var21
      var21.put("java.lang.Object", "kotlin.Any")
      var21.put("java.lang.String", "kotlin.String")
      var21.put("java.lang.CharSequence", "kotlin.CharSequence")
      var21.put("java.lang.Throwable", "kotlin.Throwable")
      var21.put("java.lang.Cloneable", "kotlin.Cloneable")
      var21.put("java.lang.Number", "kotlin.Number")
      var21.put("java.lang.Comparable", "kotlin.Comparable")
      var21.put("java.lang.Enum", "kotlin.Enum")
      var21.put("java.lang.annotation.Annotation", "kotlin.Annotation")
      var21.put("java.lang.Iterable", "kotlin.collections.Iterable")
      var21.put("java.util.Iterator", "kotlin.collections.Iterator")
      var21.put("java.util.Collection", "kotlin.collections.Collection")
      var21.put("java.util.List", "kotlin.collections.List")
      var21.put("java.util.Set", "kotlin.collections.Set")
      var21.put("java.util.ListIterator", "kotlin.collections.ListIterator")
      var21.put("java.util.Map", "kotlin.collections.Map")
      var21.put("java.util.Map$Entry", "kotlin.collections.Map.Entry")
      var21.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion")
      var21.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion")
      var21.putAll(primitiveFqNames)
      var21.putAll(primitiveWrapperFqNames)
      val var10000: java.util.Collection = primitiveFqNames.values()

      for (var40 in var10000) {
         val var43: java.util.Map = var25
         val var45: java.lang.String = var40 as java.lang.String
         val var53: StringBuilder = StringBuilder().append("kotlin.jvm.internal.")
         val var46: Pair = var53.append(StringsKt.substringAfterLast$default(var45, '.', null, 2, null)).append("CompanionObject").toString() to "$var45.Companion"
         var43.put(var46.first, var46.second)
      }

      for (var35 in FUNCTION_CLASSES.entrySet()) {
         var25.put((var35.getKey() as Class).getName(), "kotlin.Function${(var35.getValue() as java.lang.Number).intValue()}")
      }

      classFqNames = var21
      val var30: java.util.Map = classFqNames
      val var33: java.util.Map = LinkedHashMap(MapsKt.mapCapacity(classFqNames.size()))

      for (var47 in var30.entrySet()) {
         var33.put((var47 as Entry).getKey(), StringsKt.substringAfterLast$default((var47 as Entry).getValue() as java.lang.String, '.', null, 2, null))
      }

      simpleNames = var33
   }

   @SinceKotlin(version = "1.1")
   public open val isFinal: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   private fun error(): Nothing {
      throw KotlinReflectionNotSupportedError()
   }

   public open val nestedClasses: Collection<KClass<*>>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public open val annotations: List<Annotation>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.1")
   public override fun isInstance(value: Any?): Boolean {
      return Companion.isInstance(value, this.jClass)
   }

   public open val constructors: Collection<KFunction<Any>>
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   @SinceKotlin(version = "1.1")
   public open val isInner: Boolean
      public open get() {
         this.error()
         throw KotlinNothingValueException()
      }


   public open val simpleName: String?
      public open get() {
         return Companion.getClassSimpleName(this.jClass)
      }


   init {
      this.jClass = jClass
   }

   // $VF: Compiled from ClassReference.kt
   public companion object {
      private final val FUNCTION_CLASSES: Map<Class<out () -> *>, Int>
      private final val classFqNames: HashMap<String, String>
      private final val primitiveFqNames: HashMap<String, String>
      private final val primitiveWrapperFqNames: HashMap<String, String>
      private final val simpleNames: Map<String, String>

      public fun getClassSimpleName(jClass: Class<*>): String? {
         var var10000: java.lang.String
         if (jClass.isAnonymousClass()) {
            var10000 = null
         } else if (jClass.isLocalClass()) {
            val componentType: java.lang.String = jClass.getSimpleName()
            val var11: Method = jClass.getEnclosingMethod()
            if (var11 != null) {
               var10000 = StringsKt.substringAfter$default(componentType, "${var11.getName()}$", null, 2, null)
               if (var10000 != null) {
                  return var10000
               }
            }

            val var12: Constructor = jClass.getEnclosingConstructor()
            if (var12 != null) {
               var10000 = StringsKt.substringAfter$default(componentType, "${var12.getName()}$", null, 2, null)
            } else {
               var10000 = StringsKt.substringAfter$default(componentType, '$', null, 2, null)
            }
         } else if (jClass.isArray()) {
            val var8: Class = jClass.getComponentType()
            if (var8.isPrimitive()) {
               val var3: java.lang.String = ClassReference.simpleNames.get(var8.getName())
               var10000 = if (var3 != null) "$var3Array" else null
            } else {
               var10000 = null
            }

            if (var10000 == null) {
               var10000 = "Array"
            }
         } else {
            var10000 = ClassReference.simpleNames.get(jClass.getName())
            if (var10000 == null) {
               var10000 = jClass.getSimpleName()
            }
         }

         return var10000
      }

      public fun getClassQualifiedName(jClass: Class<*>): String? {
         var var10000: java.lang.String
         if (jClass.isAnonymousClass()) {
            var10000 = null
         } else if (jClass.isLocalClass()) {
            var10000 = null
         } else if (jClass.isArray()) {
            val componentType: Class = jClass.getComponentType()
            if (componentType.isPrimitive()) {
               val var3: java.lang.String = ClassReference.classFqNames.get(componentType.getName())
               var10000 = if (var3 != null) "$var3Array" else null
            } else {
               var10000 = null
            }

            if (var10000 == null) {
               var10000 = "kotlin.Array"
            }
         } else {
            var10000 = ClassReference.classFqNames.get(jClass.getName())
            if (var10000 == null) {
               var10000 = jClass.getCanonicalName()
            }
         }

         return var10000
      }

      public fun isInstance(value: Any?, jClass: Class<*>): Boolean {
         val var10000: java.util.Map = ClassReference.FUNCTION_CLASSES
         val objectType: Int = var10000.get(jClass) as Int
         return if (objectType != null)
            TypeIntrinsics.isFunctionOfArity(value, objectType.intValue())
            else
            (if (jClass.isPrimitive()) javaObjectType else jClass).isInstance(value)
         }
   }
}

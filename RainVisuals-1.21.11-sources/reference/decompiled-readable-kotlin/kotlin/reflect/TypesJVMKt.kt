package kotlin.reflect

import java.lang.reflect.Modifier
import java.lang.reflect.Type
import java.util.ArrayList
import kotlin.internal.LowPriorityInOverloadResolution
import kotlin.jvm.internal.KTypeBase

// $VF: Compiled from TypesJVM.kt
@ExperimentalStdlibApi
private fun KType.computeJavaType(forceWrapper: Boolean = false): Type {
   val classifier: KClassifier = `$this$computeJavaType`.classifier
   if (classifier is KTypeParameter) {
      return TypeVariableImpl(classifier as KTypeParameter)
   } else if (classifier is KClass) {
      val jClass: Class = if (forceWrapper) javaObjectType else java
      val arguments: java.util.List = `$this$computeJavaType`.arguments
      if (arguments.isEmpty()) {
         return jClass
      } else if (jClass.isArray()) {
         if (jClass.getComponentType().isPrimitive()) {
            return jClass
         } else {
            val var10000: KTypeProjection = CollectionsKt.singleOrNull(arguments)
            if (var10000 == null) {
               throw IllegalArgumentException("kotlin.Array must have exactly one type argument: $`$this$computeJavaType`")
            } else {
               val variance: KVariance = var10000.component1()
val elementType: KType = var10000.component2()
var var9: Type
               when (if (variance == null) -1 else TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
                  -1, 1 -> var9 = jClass
                  0 -> throw NoWhenBranchMatchedException()
                  2, 3 -> {
                     val javaElementType: Type = computeJavaType$default(elementType, false, 1, null)
                     var9 = if (javaElementType is Class) jClass else GenericArrayTypeImpl(javaElementType)
                  }
                  else -> throw NoWhenBranchMatchedException()
               }

               return var9
            }
         }
      } else {
         return createPossiblyInnerType(jClass, arguments)
      }
   } else {
      throw UnsupportedOperationException("Unsupported type classifier: $`$this$computeJavaType`")
   }
}

@ExperimentalStdlibApi
private final val javaType: Type
   private final get() {
      val var10000: KVariance = `$this$javaType`.variance
      if (var10000 == null) {
         return WildcardTypeImpl.Companion.STAR
      } else {
         val var3: KType = `$this$javaType`.type
var var4: Type
         when (TypesJVMKt.WhenMappings.$EnumSwitchMapping$0[var10000.ordinal()]) {
            1 -> var4 = WildcardTypeImpl(null, computeJavaType(var3, true))
            2 -> var4 = computeJavaType(var3, true)
            3 -> var4 = WildcardTypeImpl(computeJavaType(var3, true), null)
            else -> throw NoWhenBranchMatchedException()
         }

         return var4
      }
   }


@ExperimentalStdlibApi
@SinceKotlin(version = "1.4")
@LowPriorityInOverloadResolution
public final val javaType: Type
   public final get() {
      if (`$this$javaType` is KTypeBase) {
         val var1: Type = (`$this$javaType` as KTypeBase).javaType
         if (var1 != null) {
            return var1
         }
      }

      return computeJavaType$default(`$this$javaType`, false, 1, null)
   }


private fun typeToString(type: Type): String {
   var var3: java.lang.String
   if (type is Class) {
      if ((type as Class).isArray()) {
         val unwrap: Sequence = SequencesKt.generateSequence(type, <unrepresentable>.INSTANCE)
         var3 = "${SequencesKt.<Class>last(unwrap).getName()}${StringsKt.repeat("[]", SequencesKt.count(unwrap))}"
      } else {
         var3 = (type as Class).getName()
      }

      var3 = var3
   } else {
      var3 = type.toString()
   }

   return var3
}

@ExperimentalStdlibApi
private fun createPossiblyInnerType(jClass: Class<*>, arguments: List<KTypeProjection>): Type {
   val n: Class = jClass.getDeclaringClass()
   if (n == null) {
      val var28: java.lang.Iterable = arguments
      val var34: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10))

      for (var40 in var28) {
         var34.add(javaType)
      }

      return ParameterizedTypeImpl(jClass, null, var34 as MutableList<Type>)
   } else if (Modifier.isStatic(jClass.getModifiers())) {
      val var53: Type = n
      val var26: java.lang.Iterable = arguments
      val var31: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(arguments, 10))

      for (var37 in var26) {
         var31.add(javaType)
      }

      return ParameterizedTypeImpl(jClass, var53, var31 as MutableList<Type>)
   } else {
      val var25: Int = jClass.getTypeParameters().length
      val var10001: Type = createPossiblyInnerType(n, arguments.subList(var25, arguments.size()))
      val `$this$map$iv`: java.lang.Iterable = arguments.subList(0, var25)
      val `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(`$this$map$iv`, 10))

      for (`item$iv$iv` in `$this$map$iv`) {
         `destination$iv$iv`.add(javaType)
      }

      return ParameterizedTypeImpl(jClass, var10001, `destination$iv$iv` as MutableList<Type>)
   }
}

package kotlinx.serialization.internal

import java.lang.reflect.Field
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.ArrayList
import java.util.Arrays
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Polymorphic
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException

// $VF: Compiled from Platform.kt
private fun Class<*>.companionOrNull(companionName: String): Any? {
   var companion: Field
   try {
      companion = `$this$companionOrNull`.getDeclaredField(companionName)
      companion.setAccessible(true)
      companion = (Field)companion.get(null)
   } catch (var4: java.lang.Throwable) {
      companion = null
   }

   return companion
}

internal fun <T : Any> Class<Any>.constructSerializerForGivenTypeArgs(vararg args: KSerializer<Any?>): KSerializer<Any>? {
   if (`$this$constructSerializerForGivenTypeArgs`.isEnum() && isNotAnnotated(`$this$constructSerializerForGivenTypeArgs`)) {
      return createEnumSerializer(`$this$constructSerializerForGivenTypeArgs`)
   } else {
      if (`$this$constructSerializerForGivenTypeArgs`.isInterface()) {
         val serializer: KSerializer = interfaceSerializer(`$this$constructSerializerForGivenTypeArgs`)
         if (serializer != null) {
            return serializer
         }
      }

      val var7: KSerializer = invokeSerializerOnDefaultCompanion(`$this$constructSerializerForGivenTypeArgs`, Arrays.copyOf(args, args.length))
      if (var7 != null) {
         return var7
      } else {
         var fromNamedCompanion: KSerializer = findObjectSerializer(`$this$constructSerializerForGivenTypeArgs`)
         if (fromNamedCompanion != null) {
            return fromNamedCompanion
         } else {
            fromNamedCompanion = findInNamedCompanion(`$this$constructSerializerForGivenTypeArgs`, Arrays.copyOf(args, args.length))
            if (fromNamedCompanion != null) {
               return fromNamedCompanion
            } else {
               return if (isPolymorphicSerializer(`$this$constructSerializerForGivenTypeArgs`)) PolymorphicSerializer(kotlin) else null
            }
         }
      }
   }
}

private fun <T : Any> invokeSerializerOnCompanion(companion: Any, vararg args: KSerializer<Any?>): KSerializer<Any>? {
   var types: KSerializer
   try {
      val var14: Array<Class>
      if (args.length == 0) {
         var14 = arrayOfNulls(0)
      } else {
         var e: Int = 0
         val var12: Int = args.length
         val var5: Array<Class> = arrayOfNulls(args.length)

         while (e < var12) {
            var5[e] = KSerializer::class.java
            e++
         }

         var14 = var5
      }

      val var11: Any = companion.getClass()
         .getDeclaredMethod("serializer", Arrays.copyOf(var14, var14.length))
         .invoke(companion, Arrays.copyOf(args, args.length))
         types = var11 as? KSerializer
   } catch (var7: NoSuchMethodException) {
      types = null
   } catch (var8: InvocationTargetException) {
      val var10000: java.lang.Throwable = var8.getCause()
      if (var10000 == null) {
         throw var8
      }

      val var13: InvocationTargetException = InvocationTargetException
      var var10003: java.lang.String = var10000.getMessage()
      if (var10003 == null) {
         var10003 = var8.getMessage()
      }

      var13./* $VF: Unable to resugar constructor */<init>(var10000, var10003)
      throw var13
   }

   return types
}

private fun <T : Any> Class<Any>.findNamedCompanionByAnnotation(): Any? {
   var var10000: Class = `$this$findNamedCompanionByAnnotation`.getDeclaredClasses()
   val `$this$firstOrNull$iv`: Array<Any> = var10000 as Array<Any>
   var var4: Int = 0
   val var5: Int = `$this$firstOrNull$iv`.length

   while (true) {
      if (var4 >= var5) {
         var10000 = null
         break
      }

      val `element$iv`: Any = `$this$firstOrNull$iv`[var4]
      if ((`$this$firstOrNull$iv`[var4] as Class).getAnnotation(NamedCompanion.class) != null) {
         var10000 = (Class)`element$iv`
         break
      }

      var4++
   }

   var10000 = var10000
   if (var10000 == null) {
      return null
   } else {
      val var10001: java.lang.String = var10000.getSimpleName()
      return companionOrNull(`$this$findNamedCompanionByAnnotation`, var10001)
   }
}

private fun <T : Any> Class<Any>.interfaceSerializer(): KSerializer<Any>? {
   val serializable: Serializable = `$this$interfaceSerializer`.getAnnotation(Serializable.class)
   return if (serializable != null && !(serializable.with::class == PolymorphicSerializer::class)) null else PolymorphicSerializer(kotlin)
}

private fun <T : Any> invokeSerializerOnDefaultCompanion(jClass: Class<*>, vararg args: KSerializer<Any?>): KSerializer<Any>? {
   val var10000: Any = companionOrNull(jClass, "Companion")
   return if (var10000 == null) null else invokeSerializerOnCompanion(var10000, Arrays.copyOf(args, args.length))
}

internal fun KClass<*>.platformSpecificSerializerNotRegistered(): Nothing {
   Platform_commonKt.serializerNotRegistered(`$this$platformSpecificSerializerNotRegistered`)
   throw KotlinNothingValueException()
}

internal fun <T : Any> KClass<Any>.compiledSerializerImpl(): KSerializer<Any>? {
   return constructSerializerForGivenTypeArgs(`$this$compiledSerializerImpl`)
}

private fun <T : Any> Class<Any>.isNotAnnotated(): Boolean {
   return `$this$isNotAnnotated`.getAnnotation(Serializable.class) == null && `$this$isNotAnnotated`.getAnnotation(Polymorphic.class) == null
}

internal inline fun BooleanArray.getChecked(index: Int): Boolean {
   return `$this$getChecked`[index]
}

internal fun <T : Any> KClass<Any>.constructSerializerForGivenTypeArgs(vararg args: KSerializer<Any?>): KSerializer<Any>? {
   return constructSerializerForGivenTypeArgs(java, Arrays.copyOf(args, args.length))
}

internal fun Class<*>.serializerNotRegistered(): Nothing {
   throw SerializationException(Platform_commonKt.notRegisteredMessage(kotlin))
}

private fun <T : Any> Class<Any>.findInNamedCompanion(vararg args: KSerializer<Any?>): KSerializer<Any>? {
   val namedCompanion: Any = findNamedCompanionByAnnotation(`$this$findInNamedCompanion`)
   if (namedCompanion != null) {
      val var3: KSerializer = invokeSerializerOnCompanion(namedCompanion, Arrays.copyOf(args, args.length))
      if (var3 != null) {
         return var3
      }
   }

   var var15: KSerializer
   try {
      var var10000: Any = `$this$findInNamedCompanion`.getDeclaredClasses()
      val `$this$singleOrNull$iv`: Array<Any> = var10000 as Array<Any>
      var `single$iv`: Any = null
      var `found$iv`: Boolean = false
      var var9: Int = 0
      val var10: Int = `$this$singleOrNull$iv`.length

      while (true) {
         if (var9 >= var10) {
            var10000 = (Class)(if (!`found$iv`) null else `single$iv`)
            break
         }

         val `element$iv`: Any = `$this$singleOrNull$iv`[var9]
         if ((`$this$singleOrNull$iv`[var9] as Class).getSimpleName() == "$serializer") {
            if (`found$iv`) {
               var10000 = null
               break
            }

            `single$iv` = `element$iv`
            `found$iv` = true
         }

         var9++
      }

      run label68@{
         val e: Class = var10000
         if (var10000 != null) {
            val var17: Field = e.getField("INSTANCE")
            if (var17 != null) {
               var10000 = var17.get(null)
               return@label68
            }
         }

         var10000 = null
      }

      var15 = var10000 as? KSerializer
   } catch (var14: NoSuchFieldException) {
      var15 = null
   }

   return var15
}

private fun <T : Any> Class<Any>.findObjectSerializer(): KSerializer<Any>? {
   val var10000: java.lang.String = `$this$findObjectSerializer`.getCanonicalName()
   if (var10000 == null || StringsKt.startsWith$default(var10000, "java.", false, 2, null) || StringsKt.startsWith$default(var10000, "kotlin.", false, 2, null)
      )
    {
      return null
   } else {
      val var26: Array<Field> = `$this$findObjectSerializer`.getDeclaredFields()
      val var14: Array<Any> = var26
      var `$this$singleOrNull$iv`: Any = null
      var `$i$f$singleOrNull`: Boolean = false
      var `single$iv`: Int = 0
      val `found$iv`: Int = var14.length

      while (true) {
         if (`single$iv` >= `found$iv`) {
            var27 = if (!`$i$f$singleOrNull`) null else `$this$singleOrNull$iv`
            break
         }

         val `element$iv`: Any = var14[`single$iv`]
         if ((var14[`single$iv`] as Field).getName() == "INSTANCE"
            && (var14[`single$iv`] as Field).getType() == `$this$findObjectSerializer`
            && Modifier.isStatic((var14[`single$iv`] as Field).getModifiers())) {
            if (`$i$f$singleOrNull`) {
               var27 = null
               break
            }

            `$this$singleOrNull$iv` = `element$iv`
            `$i$f$singleOrNull` = true
         }

         `single$iv`++
      }

      val var28: Field = var27 as Field
      if (var27 as Field == null) {
         return null
      } else {
         val instance: Any = var28.get(null)
         val var29: Array<Method> = `$this$findObjectSerializer`.getMethods()
         val var18: Array<Any> = var29
         var var20: Any = null
         var var21: Boolean = false
         var var22: Int = 0
         val var23: Int = var18.length

         while (true) {
            if (var22 >= var23) {
               var32 = if (!var21) null else var20
               break
            }

            var var24: Any
            run label133@{
               var24 = var18[var22]
               val it: Method = var18[var22] as Method
               if ((var18[var22] as Method).getName() == "serializer") {
                  val var30: Array<Class> = it.getParameterTypes()
                  if (var30.length == 0 && it.getReturnType() == KSerializer::class.java) {
                     var31 = true
                     return@label133
                  }
               }

               var31 = false
            }

            if (var31) {
               if (var21) {
                  var32 = null
                  break
               }

               var20 = var24
               var21 = true
            }

            var22++
         }

         val var33: Method = var32 as Method
         if (var32 as Method == null) {
            return null
         } else {
            val var17: Any = var33.invoke(instance)
            return var17 as? KSerializer
         }
      }
   }
}

private fun <T : Any> Class<Any>.isPolymorphicSerializer(): Boolean {
   if (`$this$isPolymorphicSerializer`.getAnnotation(Polymorphic.class) != null) {
      return true
   } else {
      val serializable: Serializable = `$this$isPolymorphicSerializer`.getAnnotation(Serializable.class)
      return serializable != null && serializable.with::class == PolymorphicSerializer::class
   }
}

private fun <T : Any> Class<Any>.createEnumSerializer(): KSerializer<Any> {
   val constants: Array<Any> = `$this$createEnumSerializer`.getEnumConstants()
   val var10002: java.lang.String = `$this$createEnumSerializer`.getCanonicalName()
   return EnumSerializer(var10002, constants as Array<java.lang.Enum>)
}

internal fun isReferenceArray(rootClass: KClass<Any>): Boolean {
   return java.isArray()
}

internal inline fun <T> Array<Any>.getChecked(index: Int): Any {
   return (T)`$this$getChecked`[index]
}

internal fun <T : Any, E : Any?> ArrayList<Any>.toNativeArrayImpl(eClass: KClass<Any>): Array<Any> {
   val var10001: Any = java.lang.reflect.Array.newInstance(java, `$this$toNativeArrayImpl`.size())
   val var10000: Array<Any> = `$this$toNativeArrayImpl`.toArray(var10001 as Array<Any>)
   return (E[])var10000
}

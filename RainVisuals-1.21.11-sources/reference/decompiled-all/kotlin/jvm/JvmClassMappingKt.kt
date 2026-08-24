@file:JvmName(name = "JvmClassMappingKt")

package kotlin.jvm

import kotlin.internal.InlineOnly
import kotlin.jvm.internal.ClassBasedDeclarationContainer
import kotlin.reflect.KClass

// $VF: Compiled from JvmClassMapping.kt
public final val annotationClass: KClass<out Any>
   public final get() {
      val var10000: Class = `$this$annotationClass`.annotationType()
      val var1: KClass = kotlin
      return var1
   }


public final val javaClass: Class<Any>
   public final inline get() {
      val var10000: Class = `$this$javaClass`.getClass()
      return var10000
   }


public final val java: Class<Any>
   public final get() {
      val var10000: Class = (`$this$java` as ClassBasedDeclarationContainer).jClass
      return var10000
   }


public final val javaObjectType: Class<Any>
   public final get() {
      val thisJClass: Class = (`$this$javaObjectType` as ClassBasedDeclarationContainer).jClass
      if (!thisJClass.isPrimitive()) {
         return thisJClass
      } else {
         var var10000: Class
         run label67@{
            val var2: java.lang.String = thisJClass.getName()
            if (var2 != null) {
               when (var2.hashCode()) {
                  -1325958191 -> {
                     if (var2.equals("double")) {
                        var10000 = java.lang.Double::class.javaObjectType
                        return@label67
                     }
                  }
                  104431 -> {
                     if (var2.equals("int")) {
                        var10000 = Integer::class.javaObjectType
                        return@label67
                     }
                  }
                  3039496 -> {
                     if (var2.equals("byte")) {
                        var10000 = java.lang.Byte::class.javaObjectType
                        return@label67
                     }
                  }
                  3052374 -> {
                     if (var2.equals("char")) {
                        var10000 = Character::class.javaObjectType
                        return@label67
                     }
                  }
                  3327612 -> {
                     if (var2.equals("long")) {
                        var10000 = java.lang.Long::class.javaObjectType
                        return@label67
                     }
                  }
                  3625364 -> {
                     if (var2.equals("void")) {
                        var10000 = Void::class.javaObjectType
                        return@label67
                     }
                  }
                  64711720 -> {
                     if (var2.equals("boolean")) {
                        var10000 = java.lang.Boolean::class.javaObjectType
                        return@label67
                     }
                  }
                  97526364 -> {
                     if (var2.equals("float")) {
                        var10000 = java.lang.Float::class.javaObjectType
                        return@label67
                     }
                  }
                  109413500 -> {
                     if (var2.equals("short")) {
                        var10000 = java.lang.Short::class.javaObjectType
                        return@label67
                     }
                  }
                  else -> {}
               }
            }

            var10000 = thisJClass
         }

         return var10000
      }
   }


@Deprecated(
   message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.",
   replaceWith = @ReplaceWith(expression = "(this as Any).javaClass", imports = {}),
   level = DeprecationLevel.ERROR
)
public final val javaClass: Class<KClass<Any>>
   public final inline get() {
      val var10000: Class = `$this$javaClass`.getClass()
      return var10000
   }


public final val kotlin: KClass<Any>
   public final get() {
      return `$this$kotlin`.kotlin
   }


@SinceKotlin(version = "1.7")
@InlineOnly
public final val declaringJavaClass: Class<Any>
   public final inline get() {
      val var10000: Class = `$this$declaringJavaClass`.getDeclaringClass()
      return var10000
   }


public final val javaPrimitiveType: Class<Any>?
   public final get() {
      val thisJClass: Class = (`$this$javaPrimitiveType` as ClassBasedDeclarationContainer).jClass
      if (thisJClass.isPrimitive()) {
         return thisJClass
      } else {
         val var2: java.lang.String = thisJClass.getName()
         if (var2 != null) {
            when (var2.hashCode()) {
               -2056817302 -> {
                  if (var2.equals("java.lang.Integer")) {
                     return (Class<T>)Int::class.javaPrimitiveType
                  }
               }
               -527879800 -> {
                  if (var2.equals("java.lang.Float")) {
                     return (Class<T>)java.lang.Float::class.javaPrimitiveType
                  }
               }
               -515992664 -> {
                  if (var2.equals("java.lang.Short")) {
                     return (Class<T>)java.lang.Short::class.javaPrimitiveType
                  }
               }
               155276373 -> {
                  if (var2.equals("java.lang.Character")) {
                     return (Class<T>)Character::class.javaPrimitiveType
                  }
               }
               344809556 -> {
                  if (var2.equals("java.lang.Boolean")) {
                     return (Class<T>)java.lang.Boolean::class.javaPrimitiveType
                  }
               }
               398507100 -> {
                  if (var2.equals("java.lang.Byte")) {
                     return (Class<T>)java.lang.Byte::class.javaPrimitiveType
                  }
               }
               398795216 -> {
                  if (var2.equals("java.lang.Long")) {
                     return (Class<T>)java.lang.Long::class.javaPrimitiveType
                  }
               }
               399092968 -> {
                  if (var2.equals("java.lang.Void")) {
                     return (Class<T>)Void::class.javaPrimitiveType
                  }
               }
               761287205 -> {
                  if (var2.equals("java.lang.Double")) {
                     return (Class<T>)java.lang.Double::class.javaPrimitiveType
                  }
               }
               else -> {}
            }
         }

         return null
      }
   }


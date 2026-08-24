package kotlin.internal

import java.lang.reflect.Method
import java.util.regex.MatchResult
import kotlin.random.FallbackThreadLocalRandom
import kotlin.random.Random
import org.jetbrains.annotations.Nullable

// $VF: Compiled from PlatformImplementations.kt
internal open class PlatformImplementations {
   public open fun defaultPlatformRandom(): Random {
      return FallbackThreadLocalRandom()
   }

   public open fun getSuppressed(exception: Throwable): List<Throwable> {
      if (PlatformImplementations.ReflectThrowable.getSuppressed != null) {
         var var10000: java.util.List = (java.util.List)PlatformImplementations.ReflectThrowable.getSuppressed.invoke(exception)
         if (var10000 != null) {
            var10000 = ArraysKt.asList(var10000 as Array<java.lang.Throwable>)
            if (var10000 != null) {
               return var10000
            }
         }
      }

      return CollectionsKt.emptyList()
   }

   public open fun getMatchResultNamedGroup(matchResult: MatchResult, name: String): MatchGroup? {
      throw UnsupportedOperationException("Retrieving groups by name is not supported on this platform.")
   }

   public open fun addSuppressed(cause: Throwable, exception: Throwable) {
      if (PlatformImplementations.ReflectThrowable.addSuppressed != null) {
         PlatformImplementations.ReflectThrowable.addSuppressed.invoke(cause, exception)
      }
   }

   // $VF: Compiled from PlatformImplementations.kt
   private object ReflectThrowable {
      @JvmField
      @Nullable
      public final val getSuppressed: Method?

      @JvmField
      @Nullable
      public final val addSuppressed: Method?

      @JvmStatic
      fun {
         val throwableClass: Class = java.lang.Throwable::class.java
         val throwableMethods: Array<Method> = java.lang.Throwable.class.getMethods()
         var var2: Array<Method> = throwableMethods
         var var3: Int = 0
         var var4: Int = throwableMethods.length

         var var15: Method
         while (true) {
            if (var3 >= var4) {
               var15 = null
               break
            }

            var var5: Method
            run label48@{
               var5 = var2[var3]
               val it: Method = var2[var3]
               if (var2[var3].getName() == "addSuppressed") {
                  val var10000: Array<Class> = it.getParameterTypes()
                  if (ArraysKt.singleOrNull(var10000) == throwableClass) {
                     var14 = true
                     return@label48
                  }
               }

               var14 = false
            }

            if (var14) {
               var15 = var5
               break
            }

            var3++
         }

         addSuppressed = var15
         var2 = throwableMethods
         var3 = 0
         var4 = throwableMethods.length

         while (true) {
            if (var3 >= var4) {
               var15 = null
               break
            }

            val var11: Method = var2[var3]
            if (var2[var3].getName() == "getSuppressed") {
               var15 = var11
               break
            }

            var3++
         }

         getSuppressed = var15
      }
   }
}

package kotlin.random

// $VF: Compiled from PlatformRandom.kt
internal class FallbackThreadLocalRandom : AbstractPlatformRandom {
   private final val implStorage: <unrepresentable> =    // $VF: Compiled from PlatformRandom.kt
object : ThreadLocal<java.util.Random> {
      protected open fun initialValue(): java.util.Random {
         return java.util.Random()
      }
   }

   public open val impl: java.util.Random
      public open get() {
         val var10000: Any = this.implStorage.get()
         return var10000 as java.util.Random
      }

}

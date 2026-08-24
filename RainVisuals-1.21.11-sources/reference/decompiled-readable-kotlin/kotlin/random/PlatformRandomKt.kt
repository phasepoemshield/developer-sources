package kotlin.random

import kotlin.internal.InlineOnly
import kotlin.internal.PlatformImplementationsKt

// $VF: Compiled from PlatformRandom.kt
@InlineOnly
internal inline fun defaultPlatformRandom(): Random {
   return PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom()
}

@SinceKotlin(version = "1.3")
public fun java.util.Random.asKotlinRandom(): Random {
   val var10000: KotlinRandom = `$this$asKotlinRandom` as? KotlinRandom
   if ((`$this$asKotlinRandom` as? KotlinRandom) != null) {
      val var1: Random = var10000.impl
      if (var1 != null) {
         return var1
      }
   }

   return PlatformRandom(`$this$asKotlinRandom`)
}

@SinceKotlin(version = "1.3")
public fun Random.asJavaRandom(): java.util.Random {
   val var10000: AbstractPlatformRandom = `$this$asJavaRandom` as? AbstractPlatformRandom
   if ((`$this$asJavaRandom` as? AbstractPlatformRandom) != null) {
      val var1: java.util.Random = var10000.impl
      if (var1 != null) {
         return var1
      }
   }

   return KotlinRandom(`$this$asJavaRandom`)
}

internal fun doubleFromParts(hi26: Int, low27: Int): Double {
   return (((long)hi26 shl 27) + low27) / 9.007199E15F
}

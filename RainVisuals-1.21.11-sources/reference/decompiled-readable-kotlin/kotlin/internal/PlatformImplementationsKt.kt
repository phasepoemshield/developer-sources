package kotlin.internal

import kotlin.internal.jdk8.JDK8PlatformImplementations
import org.jetbrains.annotations.NotNull

// $VF: Compiled from PlatformImplementations.kt
@JvmField
@NotNull
internal final val IMPLEMENTATIONS: PlatformImplementations

fun {
   val var0: JDK8PlatformImplementations = JDK8PlatformImplementations()

   var var10000: PlatformImplementations
   try {
      var10000 = var0
   } catch (var4: ClassCastException) {
      val var2: ClassLoader = var0.getClass().getClassLoader()
      val var3: ClassLoader = PlatformImplementations.class.getClassLoader()
      if (!(var2 == var3)) {
         throw ClassNotFoundException("Instance class was loaded from a different classloader: $var2, base type classloader: $var3", var4)
      }

      throw var4
   }

   IMPLEMENTATIONS = var10000
}

@SinceKotlin(version = "1.2")
@PublishedApi
internal fun apiVersionIsAtLeast(major: Int, minor: Int, patch: Int): Boolean {
   return KotlinVersion.CURRENT.isAtLeast(major, minor, patch)
}

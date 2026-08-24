package kotlin.internal.jdk8

import java.util.regex.MatchResult
import java.util.regex.Matcher
import kotlin.internal.jdk7.JDK7PlatformImplementations
import kotlin.random.Random
import kotlin.random.jdk8.PlatformThreadLocalRandom
import org.jetbrains.annotations.Nullable

// $VF: Compiled from JDK8PlatformImplementations.kt
internal open class JDK8PlatformImplementations : JDK7PlatformImplementations {
   public override fun defaultPlatformRandom(): Random {
      return if (this.sdkIsNullOrAtLeast(34)) PlatformThreadLocalRandom() else super.defaultPlatformRandom()
   }

   public override fun getMatchResultNamedGroup(matchResult: MatchResult, name: String): MatchGroup? {
      val var10000: Matcher = matchResult as? Matcher
      if ((matchResult as? Matcher) == null) {
         throw UnsupportedOperationException("Retrieving groups by name is not supported on this platform.")
      } else {
         val range: IntRange = IntRange(var10000.start(name), var10000.end(name) - 1)
         val var5: MatchGroup
         if (range.start >= 0) {
            val var10002: java.lang.String = var10000.group(name)
            var5 = MatchGroup(var10002, range)
         } else {
            var5 = null
         }

         return var5
      }
   }

   private fun sdkIsNullOrAtLeast(version: Int): Boolean {
      return JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion == null || JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion >= version
   }

   // $VF: Compiled from JDK8PlatformImplementations.kt
   private object ReflectSdkVersion {
      @Nullable
      @JvmField
      public final val sdkVersion: Int?

      @JvmStatic
      fun {
         var var1: Int
         try {
            var1 = (Integer)Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)
            var1 = var1 as? Int
         } catch (var4: java.lang.Throwable) {
            var1 = null
         }

         sdkVersion = if (var1 != null) (if (var1.intValue() > 0) var1 else null) else null
      }
   }
}

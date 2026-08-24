package kotlin.internal.jdk7

import kotlin.internal.PlatformImplementations
import org.jetbrains.annotations.Nullable

// $VF: Compiled from JDK7PlatformImplementations.kt
internal open class JDK7PlatformImplementations : PlatformImplementations {
   public override fun getSuppressed(exception: Throwable): List<Throwable> {
      val var2: java.util.List
      if (this.sdkIsNullOrAtLeast(19)) {
         val var10000: Array<java.lang.Throwable> = exception.getSuppressed()
         var2 = ArraysKt.asList(var10000)
      } else {
         var2 = super.getSuppressed(exception)
      }

      return var2
   }

   private fun sdkIsNullOrAtLeast(version: Int): Boolean {
      return JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion == null || JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion >= version
   }

   public override fun addSuppressed(cause: Throwable, exception: Throwable) {
      if (this.sdkIsNullOrAtLeast(19)) {
         cause.addSuppressed(exception)
      } else {
         super.addSuppressed(cause, exception)
      }
   }

   // $VF: Compiled from JDK7PlatformImplementations.kt
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

package kotlin.text

import org.jetbrains.annotations.NotNull

// $VF: Compiled from StringBuilderJVM.kt
private object SystemProperties {
   @NotNull
   @JvmField
   public final val LINE_SEPARATOR: String

   @JvmStatic
   fun {
      val var10000: java.lang.String = System.getProperty("line.separator")
      LINE_SEPARATOR = var10000
   }
}

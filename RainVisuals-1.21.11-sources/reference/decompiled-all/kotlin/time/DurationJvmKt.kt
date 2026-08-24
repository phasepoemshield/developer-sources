package kotlin.time

import java.math.RoundingMode
import java.text.DecimalFormat

// $VF: Compiled from DurationJvm.kt
private final val precisionFormats: Array<ThreadLocal<DecimalFormat>>
internal final val durationAssertionsEnabled: Boolean = Duration.class.desiredAssertionStatus()

internal fun formatToExactDecimals(value: Double, decimals: Int): String {
   var var9: DecimalFormat
   if (decimals < precisionFormats.length) {
      val var4: ThreadLocal = precisionFormats[decimals]
      val var5: Any = precisionFormats[decimals].get()
      if (var5 == null) {
         val var8: DecimalFormat = createFormatForDecimals(decimals)
         var4.set(var8)
         var9 = var8
      } else {
         var9 = (DecimalFormat)var5
      }

      var9 = var9
   } else {
      var9 = createFormatForDecimals(decimals)
   }

   val var10: java.lang.String = var9.format(value)
   return var10
}

private fun createFormatForDecimals(decimals: Int): DecimalFormat {
   val var1: DecimalFormat = DecimalFormat("0")
   if (decimals > 0) {
      var1.setMinimumFractionDigits(decimals)
   }

   var1.setRoundingMode(RoundingMode.HALF_UP)
   return var1
}

fun {
   var var0: Int = 0
   val var1: Array<ThreadLocal> = arrayOfNulls(4)

   while (var0 < 4) {
      var1[var0] = ThreadLocal()
      var0++
   }

   precisionFormats = var1
}

internal fun formatUpToDecimals(value: Double, decimals: Int): String {
   val var3: DecimalFormat = createFormatForDecimals(0)
   var3.setMaximumFractionDigits(decimals)
   val var10000: java.lang.String = var3.format(value)
   return var10000
}

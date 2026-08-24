@file:JvmMultifileClass
@file:JvmName("DurationUnitKt")

package kotlin.time

// $VF: Compiled from DurationUnit.kt
open fun DurationUnitKt__DurationUnitKt() {
}

@SinceKotlin(version = "1.5")
internal fun durationUnitByShortName(shortName: String): DurationUnit {
   var var10000: DurationUnit
   when (shortName.hashCode()) {
      100 -> {
         if (!shortName.equals("d")) {
            throw IllegalArgumentException("Unknown duration unit short name: $shortName")
         }

         var10000 = DurationUnit.DAYS
         break
      }
      104 -> {
         if (!shortName.equals("h")) {
            throw IllegalArgumentException("Unknown duration unit short name: $shortName")
         }

         var10000 = DurationUnit.HOURS
         break
      }
      109 -> {
         if (!shortName.equals("m")) {
            throw IllegalArgumentException("Unknown duration unit short name: $shortName")
         }

         var10000 = DurationUnit.MINUTES
         break
      }
      115 -> {
         if (!shortName.equals("s")) {
            throw IllegalArgumentException("Unknown duration unit short name: $shortName")
         }

         var10000 = DurationUnit.SECONDS
         break
      }
      3494 -> {
         if (!shortName.equals("ms")) {
            throw IllegalArgumentException("Unknown duration unit short name: $shortName")
         }

         var10000 = DurationUnit.MILLISECONDS
         break
      }
      3525 -> {
         if (!shortName.equals("ns")) {
            throw IllegalArgumentException("Unknown duration unit short name: $shortName")
         }

         var10000 = DurationUnit.NANOSECONDS
         break
      }
      3742 -> {
         if (shortName.equals("us")) {
            var10000 = DurationUnit.MICROSECONDS
            break
         }

         throw IllegalArgumentException("Unknown duration unit short name: $shortName")
      }
      else -> throw IllegalArgumentException("Unknown duration unit short name: $shortName")
   }

   return var10000
}

@SinceKotlin(version = "1.3")
internal fun DurationUnit.shortName(): String {
   var var10000: java.lang.String
   when (DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0[`$this$shortName`.ordinal()]) {
      1 -> var10000 = "ns"
      2 -> var10000 = "us"
      3 -> var10000 = "ms"
      4 -> var10000 = "s"
      5 -> var10000 = "m"
      6 -> var10000 = "h"
      7 -> var10000 = "d"
      else -> throw IllegalStateException(("Unknown unit: $`$this$shortName`").toString())
   }

   return var10000
}

@SinceKotlin(version = "1.5")
internal fun durationUnitByIsoChar(isoChar: Char, isTimeComponent: Boolean): DurationUnit {
   val var10000: DurationUnit
   if (!isTimeComponent) {
      if (isoChar != 'D') {
         throw IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: $isoChar")
      }

      var10000 = DurationUnit.DAYS
   } else if (isoChar == 'H') {
      var10000 = DurationUnit.HOURS
   } else if (isoChar == 'M') {
      var10000 = DurationUnit.MINUTES
   } else {
      if (isoChar != 'S') {
         throw IllegalArgumentException("Invalid duration ISO time unit: $isoChar")
      }

      var10000 = DurationUnit.SECONDS
   }

   return var10000
}

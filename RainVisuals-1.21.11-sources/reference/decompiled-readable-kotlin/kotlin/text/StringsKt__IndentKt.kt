@file:JvmMultifileClass
@file:JvmName("StringsKt")

package kotlin.text

import java.util.ArrayList
import kotlin.internal.IntrinsicConstEvaluation
import kotlin.internal.PlatformImplementationsKt
import kotlin.jvm.functions.Function1

// $VF: Compiled from Indent.kt
private fun String.indentWidth(): Int {
   val `$this$indexOfFirst$iv`: java.lang.CharSequence = `$this$indentWidth`
   var var3: Int = 0
   val var4: Int = `$this$indexOfFirst$iv`.length()

   var var10000: Int
   while (true) {
      if (var3 >= var4) {
         var10000 = -1
         break
      }

      if (!CharsKt.isWhitespace(`$this$indexOfFirst$iv`.charAt(var3))) {
         var10000 = var3
         break
      }

      var3++
   }

   return if (var10000 == -1) `$this$indentWidth`.length() else var10000
}

@IntrinsicConstEvaluation
public fun String.trimMargin(marginPrefix: String = "|"): String {
   return StringsKt.replaceIndentByMargin(`$this$trimMargin`, "", marginPrefix)
}

public fun String.replaceIndentByMargin(newIndent: String = "", marginPrefix: String = "|"): String {
   if (StringsKt.isBlank(marginPrefix)) {
      throw IllegalArgumentException("marginPrefix must be non-blank string.".toString())
   } else {
      val var40: java.util.List = StringsKt.lines(`$this$replaceIndentByMargin`)
      val `resultSizeEstimate$iv`: Int = `$this$replaceIndentByMargin`.length() + newIndent.length() * var40.size()
      val `indentAddFunction$iv`: Function1 = getIndentFunction$StringsKt__IndentKt(newIndent)
      val `lastIndex$iv`: Int = CollectionsKt.getLastIndex(var40)
      val `$this$mapIndexedNotNullTo$iv$iv$iv`: java.lang.Iterable = var40
      val `destination$iv$iv$iv`: java.util.Collection = ArrayList()
      var `index$iv$iv$iv$iv`: Int = 0

      for (`item$iv$iv$iv$iv` in `$this$mapIndexedNotNullTo$iv$iv$iv`) {
         val var19: Int = `index$iv$iv$iv$iv`++
         if (var19 < 0) {
            CollectionsKt.throwIndexOverflow()
         }

         val `value$iv`: java.lang.String = `item$iv$iv$iv$iv` as java.lang.String
         var var47: java.lang.String
         if ((var19 == 0 || var19 == `lastIndex$iv`) && StringsKt.isBlank(`item$iv$iv$iv$iv` as java.lang.String)) {
            var47 = null
         } else {
            run label97@{
               val `$this$indexOfFirst$iv`: java.lang.CharSequence = `value$iv`
               var `index$iv`: Int = 0
               val var31: Int = `$this$indexOfFirst$iv`.length()

               while (true) {
                  if (`index$iv` >= var31) {
                     var45 = -1
                     break
                  }

                  if (!CharsKt.isWhitespace(`$this$indexOfFirst$iv`.charAt(`index$iv`))) {
                     var45 = `index$iv`
                     break
                  }

                  `index$iv`++
               }

               if (var45 == -1) {
                  var47 = null
               } else if (StringsKt.startsWith$default(`value$iv`, marginPrefix, var45, false, 4, null)) {
                  val var44: Int = var45 + marginPrefix.length()
                  var47 = `value$iv`.substring(var44)
               } else {
                  var47 = null
               }

               if (var47 != null) {
                  var47 = `indentAddFunction$iv`(var47) as java.lang.String
                  if (var47 != null) {
                     return@label97
                  }
               }

               var47 = `value$iv`
            }
         }

         if (var47 != null) {
            `destination$iv$iv$iv`.add(var47)
         }
      }

      val var39: java.lang.String = (CollectionsKt.joinTo$default(
            `destination$iv$iv$iv` as java.util.List, StringBuilder(`resultSizeEstimate$iv`), "\n", null, null, 0, null, null, 124, null
         ) as StringBuilder)
         .toString()
         return var39
   }
}

@IntrinsicConstEvaluation
public fun String.trimIndent(): String {
   return StringsKt.replaceIndent(`$this$trimIndent`, "")
}

private fun getIndentFunction(indent: String): (String) -> String {
   return if (indent.length() == 0) { line ->
      line
   } else    // $VF: Compiled from Indent.kt
{ line: String ->
      return "$indent$line"
   } as Function1
}

private inline fun List<String>.reindent(resultSizeEstimate: Int, indentAddFunction: (String) -> String, indentCutFunction: (String) -> String?): String {
   val lastIndex: Int = CollectionsKt.getLastIndex(`$this$reindent`)
   val `$this$mapIndexedNotNullTo$iv$iv`: java.lang.Iterable = `$this$reindent`
   val `destination$iv$iv`: java.util.Collection = ArrayList()
   var `index$iv$iv$iv`: Int = 0

   for (`item$iv$iv$iv` in `$this$mapIndexedNotNullTo$iv$iv`) {
      val var17: Int = `index$iv$iv$iv`++
      if (var17 < 0) {
         if (!PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0)) {
            throw ArithmeticException("Index overflow has happened.")
         }

         CollectionsKt.throwIndexOverflow()
      }

      val value: java.lang.String = `item$iv$iv$iv` as java.lang.String
      var var29: java.lang.String
      if ((var17 == 0 || var17 == lastIndex) && StringsKt.isBlank(`item$iv$iv$iv` as java.lang.String)) {
         var29 = null
      } else {
         run label57@{
            var29 = indentCutFunction(value) as java.lang.String
            if (var29 != null) {
               var29 = indentAddFunction(var29) as java.lang.String
               if (var29 != null) {
                  return@label57
               }
            }

            var29 = value
         }
      }

      if (var29 != null) {
         `destination$iv$iv`.add(var29)
      }
   }

   val var6: java.lang.String = (CollectionsKt.joinTo$default(
         `destination$iv$iv` as java.util.List, StringBuilder(resultSizeEstimate), "\n", null, null, 0, null, null, 124, null
      ) as StringBuilder)
      .toString()
      return var6
}

public fun String.prependIndent(indent: String = "    "): String {
   return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence(`$this$prependIndent`),    // $VF: Compiled from Indent.kt
{ it: String ->
      return if (StringsKt.isBlank(it)) (if (it.length() < indent.length()) indent else it) else "$indent$it"
   } as Function1), "\n", null, null, 0, null, null, 62, null)
}

public fun String.replaceIndent(newIndent: String = ""): String {
   val lines: java.util.List = StringsKt.lines(`$this$replaceIndent`)
   var `$i$f$reindent`: java.lang.Iterable = lines
   var `lastIndex$iv`: java.util.Collection = ArrayList()

   for (`$this$mapIndexedNotNullTo$iv$iv$iv` in `$i$f$reindent`) {
      if (!StringsKt.isBlank(`$this$mapIndexedNotNullTo$iv$iv$iv` as java.lang.String)) {
         `lastIndex$iv`.add(`$this$mapIndexedNotNullTo$iv$iv$iv`)
      }
   }

   `$i$f$reindent` = `lastIndex$iv` as java.util.List
   `lastIndex$iv` = ArrayList(CollectionsKt.collectionSizeOrDefault(`lastIndex$iv` as java.util.List, 10))

   for (var46 in `$i$f$reindent`) {
      `lastIndex$iv`.add(indentWidth$StringsKt__IndentKt(var46 as java.lang.String))
   }

   val var10000: Int = CollectionsKt.minOrNull(`lastIndex$iv`)
   val minCommonIndent: Int = var10000 ?: 0
   val var35: Int = `$this$replaceIndent`.length() + newIndent.length() * lines.size()
   val var37: Function1 = getIndentFunction$StringsKt__IndentKt(newIndent)
   val var41: Int = CollectionsKt.getLastIndex(lines)
   val var47: java.lang.Iterable = lines
   val var49: java.util.Collection = ArrayList()
   var `index$iv$iv$iv$iv`: Int = 0

   for (`item$iv$iv$iv$iv` in var47) {
      val var19: Int = `index$iv$iv$iv$iv`++
      if (var19 < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      val `value$iv`: java.lang.String = `item$iv$iv$iv$iv` as java.lang.String
      var var54: java.lang.String
      if ((var19 == 0 || var19 == var41) && StringsKt.isBlank(`item$iv$iv$iv$iv` as java.lang.String)) {
         var54 = null
      } else {
         run label88@{
            val var53: java.lang.String = StringsKt.drop(`value$iv`, minCommonIndent)
            if (var53 != null) {
               var54 = var37(var53) as java.lang.String
               if (var54 != null) {
                  return@label88
               }
            }

            var54 = `value$iv`
         }
      }

      if (var54 != null) {
         var49.add(var54)
      }
   }

   val var32: java.lang.String = (CollectionsKt.joinTo$default(var49 as java.util.List, StringBuilder(var35), "\n", null, null, 0, null, null, 124, null) as StringBuilder)
      .toString()
      return var32
}

open fun StringsKt__IndentKt() {
}

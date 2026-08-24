@file:JvmMultifileClass
@file:JvmName("ArraysKt")

package kotlin.collections

import java.util.ArrayList
import java.util.Arrays
import kotlin.collections.unsigned.UArraysKt
import kotlin.internal.InlineOnly

// $VF: Compiled from Arrays.kt
public fun <T> Array<out Array<out Any>>.flatten(): List<Any> {
   val var2: Array<Any> = `$this$flatten` as Array<Any>
   var var3: Int = 0

   for (var6 in var2) {
      var3 += (var6 as Array<Any>).length
   }

   val result: ArrayList = ArrayList(var3)

   for (var14 in `$this$flatten` as Array<Any>) {
      CollectionsKt.addAll(result, var14)
   }

   return result
}

public fun <T, R> Array<out Pair<Any, Any>>.unzip(): Pair<List<Any>, List<Any>> {
   val listT: ArrayList = ArrayList(`$this$unzip`.length)
   val listR: ArrayList = ArrayList(`$this$unzip`.length)

   for (pair in `$this$unzip`) {
      listT.add(pair.first)
      listR.add(pair.second)
   }

   return listT to listR
}

private fun <T> Array<out Any>.contentDeepToStringInternal(result: StringBuilder, processed: MutableList<Array<*>>) {
   if (processed.contains(`$this$contentDeepToStringInternal`)) {
      result.append("[...]")
   } else {
      processed.add(`$this$contentDeepToStringInternal`)
      result.append('[')
      var i: Int = 0

      for (var4 in `$this$contentDeepToStringInternal`.length..i) {
         if (i != 0) {
            result.append(", ")
         }

         val element: Any = `$this$contentDeepToStringInternal`[i]
         val var6: Any = `$this$contentDeepToStringInternal`[i]
         if (`$this$contentDeepToStringInternal`[i] == null) {
            result.append("null")
         } else if (var6 is Array<Any>) {
            contentDeepToStringInternal$ArraysKt__ArraysKt(element as Array<Any>, result, processed)
         } else if (var6 is ByteArray) {
            val var10001: java.lang.String = Arrays.toString(element as ByteArray)
            result.append(var10001)
         } else if (var6 is ShortArray) {
            val var7: java.lang.String = Arrays.toString(element as ShortArray)
            result.append(var7)
         } else if (var6 is IntArray) {
            val var8: java.lang.String = Arrays.toString(element as IntArray)
            result.append(var8)
         } else if (var6 is LongArray) {
            val var9: java.lang.String = Arrays.toString(element as LongArray)
            result.append(var9)
         } else if (var6 is FloatArray) {
            val var10: java.lang.String = Arrays.toString(element as FloatArray)
            result.append(var10)
         } else if (var6 is DoubleArray) {
            val var11: java.lang.String = Arrays.toString(element as DoubleArray)
            result.append(var11)
         } else if (var6 is CharArray) {
            val var12: java.lang.String = Arrays.toString(element as CharArray)
            result.append(var12)
         } else if (var6 is BooleanArray) {
            val var13: java.lang.String = Arrays.toString(element as BooleanArray)
            result.append(var13)
         } else if (var6 is UByteArray) {
            result.append(
               UArraysKt.contentToString_2csIQuQ/* $VF was: contentToString-2csIQuQ */(
                  if (element as UByteArray != null) (element as UByteArray).unbox_impl/* $VF was: unbox-impl */() else null
               )
            )
         } else if (var6 is UShortArray) {
            result.append(
               UArraysKt.contentToString_d_6D3K8/* $VF was: contentToString-d-6D3K8 */(
                  if (element as UShortArray != null) (element as UShortArray).unbox_impl/* $VF was: unbox-impl */() else null
               )
            )
         } else if (var6 is UIntArray) {
            result.append(
               UArraysKt.contentToString_XUkPCBk/* $VF was: contentToString-XUkPCBk */(
                  if (element as UIntArray != null) (element as UIntArray).unbox_impl/* $VF was: unbox-impl */() else null
               )
            )
         } else if (var6 is ULongArray) {
            result.append(
               UArraysKt.contentToString_uLth9ew/* $VF was: contentToString-uLth9ew */(
                  if (element as ULongArray != null) (element as ULongArray).unbox_impl/* $VF was: unbox-impl */() else null
               )
            )
         } else {
            result.append(element.toString())
         }
      }

      result.append(']')
      processed.remove(CollectionsKt.getLastIndex(processed))
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun <C, R> Any.ifEmpty(defaultValue: () -> Any): Any where C : Array<*>, C : Any {
   return (R)(if (`$this$ifEmpty`.length == 0) defaultValue() else `$this$ifEmpty`)
}

@JvmName(name = "contentDeepEquals")
@SinceKotlin(version = "1.3")
@PublishedApi
internal fun <T> Array<out Any>?.contentDeepEqualsImpl(other: Array<out Any>?): Boolean {
   if (`$this$contentDeepEqualsImpl` === other) {
      return true
   } else if (`$this$contentDeepEqualsImpl` != null && other != null && `$this$contentDeepEqualsImpl`.length == other.length) {
      var i: Int = 0

      for (var3 in `$this$contentDeepEqualsImpl`.length..i) {
         val v1: Any = `$this$contentDeepEqualsImpl`[i]
         val v2: Any = other[i]
         if (v1 != other[i]) {
            if (v1 == null || v2 == null) {
               return false
            }

            if (v1 is Array<Any> && v2 is Array<Any>) {
               if (!ArraysKt.contentDeepEquals(v1 as Array<Any>, v2 as Array<Any>)) {
                  return false
               }
            } else if (v1 is ByteArray && v2 is ByteArray) {
               if (!Arrays.equals(v1 as ByteArray, v2 as ByteArray)) {
                  return false
               }
            } else if (v1 is ShortArray && v2 is ShortArray) {
               if (!Arrays.equals(v1 as ShortArray, v2 as ShortArray)) {
                  return false
               }
            } else if (v1 is IntArray && v2 is IntArray) {
               if (!Arrays.equals(v1 as IntArray, v2 as IntArray)) {
                  return false
               }
            } else if (v1 is LongArray && v2 is LongArray) {
               if (!Arrays.equals(v1 as LongArray, v2 as LongArray)) {
                  return false
               }
            } else if (v1 is FloatArray && v2 is FloatArray) {
               if (!Arrays.equals(v1 as FloatArray, v2 as FloatArray)) {
                  return false
               }
            } else if (v1 is DoubleArray && v2 is DoubleArray) {
               if (!Arrays.equals(v1 as DoubleArray, v2 as DoubleArray)) {
                  return false
               }
            } else if (v1 is CharArray && v2 is CharArray) {
               if (!Arrays.equals(v1 as CharArray, v2 as CharArray)) {
                  return false
               }
            } else if (v1 is BooleanArray && v2 is BooleanArray) {
               if (!Arrays.equals(v1 as BooleanArray, v2 as BooleanArray)) {
                  return false
               }
            } else if (v1 is UByteArray && v2 is UByteArray) {
               if (!UArraysKt.contentEquals_kV0jMPg/* $VF was: contentEquals-kV0jMPg */(
                  (v1 as UByteArray).unbox_impl/* $VF was: unbox-impl */(), (v2 as UByteArray).unbox_impl/* $VF was: unbox-impl */()
               )) {
                  return false
               }
            } else if (v1 is UShortArray && v2 is UShortArray) {
               if (!UArraysKt.contentEquals_FGO6Aew/* $VF was: contentEquals-FGO6Aew */(
                  (v1 as UShortArray).unbox_impl/* $VF was: unbox-impl */(), (v2 as UShortArray).unbox_impl/* $VF was: unbox-impl */()
               )) {
                  return false
               }
            } else if (v1 is UIntArray && v2 is UIntArray) {
               if (!UArraysKt.contentEquals_KJPZfPQ/* $VF was: contentEquals-KJPZfPQ */(
                  (v1 as UIntArray).unbox_impl/* $VF was: unbox-impl */(), (v2 as UIntArray).unbox_impl/* $VF was: unbox-impl */()
               )) {
                  return false
               }
            } else if (v1 is ULongArray && v2 is ULongArray) {
               if (!UArraysKt.contentEquals_lec5QzE/* $VF was: contentEquals-lec5QzE */(
                  (v1 as ULongArray).unbox_impl/* $VF was: unbox-impl */(), (v2 as ULongArray).unbox_impl/* $VF was: unbox-impl */()
               )) {
                  return false
               }
            } else if (!(v1 == v2)) {
               return false
            }
         }
      }

      return true
   } else {
      return false
   }
}

@InlineOnly
@SinceKotlin(version = "1.3")
public inline fun Array<*>?.isNullOrEmpty(): Boolean {
   contract {
      returns(false) implies (this != null)
   }

   return `$this$isNullOrEmpty` == null || `$this$isNullOrEmpty`.length == 0
}

@SinceKotlin(version = "1.3")
@JvmName(name = "contentDeepToString")
@PublishedApi
internal fun <T> Array<out Any>?.contentDeepToStringImpl(): String {
   if (`$this$contentDeepToStringImpl` == null) {
      return "null"
   } else {
      val var2: StringBuilder = StringBuilder(RangesKt.coerceAtMost(`$this$contentDeepToStringImpl`.length, 429496729) * 5 + 2)
      contentDeepToStringInternal$ArraysKt__ArraysKt(`$this$contentDeepToStringImpl`, var2, ArrayList<>())
      val var10000: java.lang.String = var2.toString()
      return var10000
   }
}

open fun ArraysKt__ArraysKt() {
}

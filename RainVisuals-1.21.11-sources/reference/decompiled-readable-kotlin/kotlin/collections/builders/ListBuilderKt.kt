package kotlin.collections.builders

import java.util.Arrays

// $VF: Compiled from ListBuilder.kt
private fun <T> Array<Any>.subarrayContentEquals(offset: Int, length: Int, other: List<*>): Boolean {
   if (length != other.size()) {
      return false
   } else {
      repeat(length) { i ->
         if (!(`$this$subarrayContentEquals`[offset + i] == other.get(i))) {
            return false
         }
      }

      return true
   }
}

internal fun <E> Array<Any>.resetAt(index: Int) {
   `$this$resetAt`[index] = null
}

internal fun <T> Array<Any>.copyOfUninitializedElements(newSize: Int): Array<Any> {
   val var10000: Array<Any> = Arrays.copyOf(`$this$copyOfUninitializedElements`, newSize)
   return (T[])var10000
}

private fun <T> Array<out Any>.subarrayContentToString(offset: Int, length: Int, thisCollection: Collection<Any>): String {
   val sb: StringBuilder = StringBuilder(2 + length * 3)
   sb.append("[")

   repeat(length) { i ->
      if (i > 0) {
         sb.append(", ")
      }

      val nextElement: Any = `$this$subarrayContentToString`[offset + i]
      if (`$this$subarrayContentToString`[offset + i] === thisCollection) {
         sb.append("(this Collection)")
      } else {
         sb.append(nextElement)
      }
   }

   sb.append("]")
   val var10000: java.lang.String = sb.toString()
   return var10000
}

internal fun <E> arrayOfUninitializedElements(size: Int): Array<Any> {
   if (size < 0) {
      throw IllegalArgumentException("capacity must be non-negative.".toString())
   } else {
      return (E[])arrayOfNulls(size)
   }
}

private fun <T> Array<Any>.subarrayContentHashCode(offset: Int, length: Int): Int {
   var result: Int = 1

   repeat(length) { i ->
      result = result * 31 + (if (`$this$subarrayContentHashCode`[offset + i] != null) `$this$subarrayContentHashCode`[offset + i].hashCode() else 0)
   }

   return result
}

internal fun <E> Array<Any>.resetRange(fromIndex: Int, toIndex: Int) {
   for (index in fromIndex..toIndex) {
      resetAt(`$this$resetRange`, index)
   }
}

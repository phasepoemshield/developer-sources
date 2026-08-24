package kotlin.enums

import java.io.Serializable

// $VF: Compiled from EnumEntries.kt
@SinceKotlin(version = "1.8")
private class EnumEntriesList<T extends java.lang.Enum<T>>(vararg entries: Any) : AbstractList<T>, Serializable, EnumEntries {
   private final val entries: Array<Any>

   private fun writeReplace(): Any {
      return EnumEntriesSerializationProxy<>(this.entries)
   }

   public open operator fun contains(element: Any): Boolean {
      return ArraysKt.getOrNull(this.entries, element.ordinal()) as java.lang.Enum === element
   }

   public open operator fun get(index: Int): Any {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.entries.length)
      return this.entries[index]
   }

   public open val size: Int
      public open get() {
         return this.entries.length
      }


   init {
      this.entries = (T[])entries
   }

   public open fun lastIndexOf(element: Any): Int {
      return this.indexOf((Object)element)
   }

   public open fun indexOf(element: Any): Int {
      val ordinal: Int = element.ordinal()
      return if (ArraysKt.getOrNull(this.entries, ordinal) as java.lang.Enum === element) ordinal else -1
   }
}

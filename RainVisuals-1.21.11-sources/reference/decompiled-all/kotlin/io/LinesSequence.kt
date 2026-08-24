package kotlin.io

import java.io.BufferedReader
import java.util.NoSuchElementException

// $VF: Compiled from ReadWrite.kt
private class LinesSequence(reader: BufferedReader) : Sequence<java.lang.String> {
   private final val reader: BufferedReader

   init {
      this.reader = reader
   }

   public override operator fun iterator(): Iterator<String> {
      return       // $VF: Compiled from ReadWrite.kt
object : Iterator<String> {
         private final var nextValue: String?
         private final var done: Boolean

         public override operator fun hasNext(): Boolean {
            if (this.nextValue == null && !this.done) {
               this.nextValue = LinesSequence.this.reader.readLine()
               if (this.nextValue == null) {
                  this.done = true
               }
            }

            return this.nextValue != null
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public open operator fun next(): String {
            if (!this.hasNext()) {
               throw NoSuchElementException()
            } else {
               val answer: java.lang.String = this.nextValue
               this.nextValue = null
               return answer
            }
         }
      }
   }
}

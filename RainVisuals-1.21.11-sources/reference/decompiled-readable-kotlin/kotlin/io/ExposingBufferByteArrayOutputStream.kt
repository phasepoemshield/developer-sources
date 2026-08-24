package kotlin.io

import java.io.ByteArrayOutputStream

// $VF: Compiled from FileReadWrite.kt
private class ExposingBufferByteArrayOutputStream(size: Int) : ByteArrayOutputStream(size) {
   public final val buffer: ByteArray
      public final get() {
         val var10000: ByteArray = this.buf
         return var10000
      }

}

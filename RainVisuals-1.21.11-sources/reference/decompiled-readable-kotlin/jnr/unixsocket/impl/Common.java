package jnr.unixsocket.impl;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import jnr.constants.platform.Errno;
import jnr.enxio.channels.Native;
import jnr.enxio.channels.NativeException;

// $VF: Compiled from Common.java
final class Common {
   private int _fd = -1;

   Common(int fd) {
      this._fd = fd;
   }

   int write(ByteBuffer src) throws IOException {
      int r = src.remaining();
      ByteBuffer buffer = ByteBuffer.allocate(r);
      buffer.put(src);
      ((Buffer)buffer).position(0);
      int n = Native.write(this._fd, buffer);
      if (n >= 0) {
         if (n < r) {
            ((Buffer)src).position(src.position() - (r - n));
         }

         return n;
      } else {
         Errno lastError = Native.getLastError();
         switch (lastError) {
            case EAGAIN:
            case EWOULDBLOCK:
               ((Buffer)src).position(src.position() - r);
               return 0;
            default:
               throw new NativeException(Native.getLastErrorString(), lastError);
         }
      }
   }

   long read(ByteBuffer[] length, int dsts, int offset) throws IOException {
      long total = 0L;

      for (int i = 0; i < length; i++) {
         ByteBuffer dst = dsts[offset + i];
         long read = this.read(dst);
         if (read == -1L) {
            return read;
         }

         total += read;
      }

      return total;
   }

   int getFD() {
      return this._fd;
   }

   long write(ByteBuffer[] srcs, int length, int offset) throws IOException {
      long result = 0L;

      for (int index = offset; index < length; index++) {
         ByteBuffer buffer = srcs[index];
         int remaining = buffer.remaining();
         int written = 0;

         int w;
         do {
            w = this.write(buffer);
            written += w;
         } while (w != 0 && written != remaining);

         result += written;
         if (written < remaining) {
            break;
         }
      }

      return result;
   }

   void setFD(int fd) {
      this._fd = fd;
   }

   int read(ByteBuffer dst) throws IOException {
      ByteBuffer buffer = ByteBuffer.allocate(dst.remaining());
      int n = Native.read(this._fd, buffer);
      ((Buffer)buffer).flip();
      dst.put(buffer);
      switch (n) {
         case -1:
            Errno lastError = Native.getLastError();
            switch (lastError) {
               case EAGAIN:
               case EWOULDBLOCK:
                  return 0;
               default:
                  throw new NativeException(Native.getLastErrorString(), lastError);
            }
         case 0:
            return -1;
         default:
            return n;
      }
   }
}

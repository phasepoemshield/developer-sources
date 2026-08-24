package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from AFCore.java
class AFCore extends CleanableState {
   private boolean cleanFd;
   private static final String PROP_TL_BUFFER_MAX_CAPACITY = "org.newsclub.net.unix.thread-local-buffer.max-capacity";
   private static final int TL_BUFFER_MIN_CAPACITY = 8192;
   private final AtomicBoolean closed = new AtomicBoolean(false);
   private static final int TL_BUFFER_MAX_CAPACITY = Integer.parseInt(
      System.getProperty("org.newsclub.net.unix.thread-local-buffer.max-capacity", Integer.toString(1048576))
   );
   private boolean blocking = true;
   private final boolean datagramMode;
   private static final ThreadLocal<ByteBuffer> TL_BUFFER = new ThreadLocal<>();
   final FileDescriptor fd;
   final AncillaryDataSupport ancillaryDataSupport;

   int read(ByteBuffer dst, ByteBuffer socketAddressBuffer, int options) throws IOException {
      int remaining = dst.remaining();
      if (remaining == 0) {
         return 0;
      }

      FileDescriptor fdesc = this.validFdOrException();
      int dstPos = dst.position();
      boolean direct = dst.isDirect();
      ByteBuffer buf;
      int pos;
      if (direct) {
         buf = dst;
         pos = dstPos;
      } else {
         buf = this.getThreadLocalDirectByteBuffer(remaining);
         remaining = Math.min(remaining, buf.remaining());
         pos = buf.position();
      }

      if (!this.blocking) {
         options |= 4;
      }

      int count = NativeUnixSocket.receive(fdesc, buf, pos, remaining, socketAddressBuffer, options, this.ancillaryDataSupport, 0);
      if (count == -1) {
         return count;
      }

      if (direct) {
         if (count < 0) {
            throw new IllegalStateException();
         }

         ((Buffer)dst).position(pos + count);
      } else {
         int oldLimit = buf.limit();
         if (count < oldLimit) {
            ((Buffer)buf).limit(count);
         }

         try {
            while (buf.hasRemaining()) {
               dst.put(buf);
            }
         } finally {
            if (count < oldLimit) {
               ((Buffer)buf).limit(oldLimit);
            }
         }
      }

      return count;
   }

   void disableCleanFd() {
      this.cleanFd = false;
   }

   @Override
   protected final void doClean() {
      if (this.fd != null && this.fd.valid() && this.cleanFd) {
         try {
            this.doClose();
         } catch (IOException var2) {
         }
      }

      if (this.ancillaryDataSupport != null) {
         this.ancillaryDataSupport.close();
      }
   }

   int read(ByteBuffer dst) throws IOException {
      return this.read(dst, null, 0);
   }

   synchronized FileDescriptor validFd() {
      if (this.isClosed()) {
         return null;
      }

      FileDescriptor descriptor = this.fd;
      return descriptor != null && descriptor.valid() ? descriptor : null;
   }

   int write(ByteBuffer target, SocketAddress src, int options) throws IOException {
      int remaining = src.remaining();
      if (remaining == 0) {
         return 0;
      }

      FileDescriptor fdesc = this.validFdOrException();
      ByteBuffer addressTo;
      int addressToLen;
      if (target == null) {
         addressTo = null;
         addressToLen = 0;
      } else {
         addressTo = AFSocketAddress.SOCKETADDRESS_BUFFER_TL.get();
         addressToLen = AFSocketAddress.unwrapAddressDirectBufferInternal(addressTo, target);
      }

      if (!this.blocking) {
         options |= 4;
      }

      int pos = src.position();
      boolean isDirect = src.isDirect();
      ByteBuffer buf;
      int bufPos;
      if (isDirect) {
         buf = src;
         bufPos = pos;
      } else {
         buf = this.getThreadLocalDirectByteBuffer(remaining);
         remaining = Math.min(remaining, buf.remaining());
         bufPos = buf.position();

         while (src.hasRemaining() && buf.hasRemaining()) {
            buf.put(src);
         }

         ((Buffer)buf).position(bufPos);
      }

      if (this.datagramMode) {
         options |= 16;
      }

      int written = NativeUnixSocket.send(fdesc, buf, bufPos, remaining, addressTo, addressToLen, options, this.ancillaryDataSupport);
      ((Buffer)src).position(pos + written);
      return written;
   }

   void implConfigureBlocking(boolean block) throws IOException {
      NativeUnixSocket.configureBlocking(this.validFdOrException(), block);
      this.blocking = block;
   }

   boolean isClosed() {
      return this.closed.get();
   }

   AFCore(Object observed, FileDescriptor fd) {
      this(observed, fd, null, false);
   }

   int write(ByteBuffer src) throws IOException {
      return this.write(src, null, 0);
   }

   boolean isBlocking() {
      return this.blocking;
   }

   FileDescriptor validFdOrException() throws SocketException {
      FileDescriptor fdesc = this.validFd();
      if (fdesc == null) {
         this.closed.set(true);
         throw new SocketClosedException("Not open");
      } else {
         return fdesc;
      }
   }

   ByteBuffer getThreadLocalDirectByteBuffer(int capacity) {
      if (capacity > TL_BUFFER_MAX_CAPACITY && TL_BUFFER_MAX_CAPACITY > 0) {
         return ByteBuffer.allocateDirect(capacity);
      }

      if (capacity < 8192) {
         capacity = 8192;
      }

      ByteBuffer buffer = TL_BUFFER.get();
      if (buffer == null || capacity > buffer.capacity()) {
         buffer = ByteBuffer.allocateDirect(capacity);
         TL_BUFFER.set(buffer);
      }

      ((Buffer)buffer).clear();
      return buffer;
   }

   AFCore(Object fd, FileDescriptor observed, AncillaryDataSupport datagramMode, boolean ancillaryDataSupport) {
      super(observed);
      this.cleanFd = true;
      this.datagramMode = datagramMode;
      this.ancillaryDataSupport = ancillaryDataSupport;
      this.fd = fd == null ? new FileDescriptor() : fd;
   }

   void doClose() throws IOException {
      if (this.closed.compareAndSet(false, true)) {
         NativeUnixSocket.close(this.fd);
      }
   }
}

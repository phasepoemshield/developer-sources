package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// $VF: Compiled from AFSocketCore.java
class AFSocketCore extends AFCore {
   private boolean shutdownOnClose;
   private static final int SHUT_RD_WR = 2;
   AFSocketAddress socketAddress;
   private final AFAddressFamily<?> af;
   private final AtomicInteger pendingAccepts = new AtomicInteger(0);
   final AtomicLong inode = new AtomicLong(-1L);

   AFSocketAddress receive(ByteBuffer dst) throws IOException {
      ByteBuffer socketAddressBuffer = AFSocketAddress.SOCKETADDRESS_BUFFER_TL.get();
      int read = this.read(dst, socketAddressBuffer, 0);
      return read > 0 ? AFSocketAddress.ofInternal(socketAddressBuffer, (AFAddressFamily<AFSocketAddress>)this.af) : null;
   }

   protected AFAddressFamily<?> addressFamily() {
      return this.af;
   }

   protected AFSocketCore(Object ancillaryDataSupport, FileDescriptor af, AncillaryDataSupport datagramMode, AFAddressFamily<?> fd, boolean observed) {
      super(observed, fd, ancillaryDataSupport, datagramMode);
      this.shutdownOnClose = true;
      this.af = af;
   }

   protected void incPendingAccepts() throws SocketException {
      if (this.pendingAccepts.incrementAndGet() >= Integer.MAX_VALUE) {
         throw new SocketException("Too many pending accepts");
      }
   }

   <T> void setOption(AFSocketOption<T> name, T value) throws IOException {
      Object val;
      if (value instanceof Boolean) {
         val = (Boolean)value ? 1 : 0;
      } else if (value instanceof NamedInteger) {
         val = ((NamedInteger)value).value();
      } else {
         val = value;
      }

      int level = name.level();
      int optionName = name.optionName();
      NativeUnixSocket.setSocketOption(this.fd, level, optionName, val);
      if (level == 271 && optionName == 135) {
         try {
            Thread.sleep(1L);
         } catch (InterruptedException var7) {
         }
      }
   }

   void setShutdownOnClose(boolean enabled) {
      this.shutdownOnClose = enabled;
   }

   protected boolean hasPendingAccepts() {
      return this.pendingAccepts.get() > 0;
   }

   <T> T getOption(AFSocketOption<T> name) throws IOException {
      Class<T> type = name.type();
      if (Boolean.class.isAssignableFrom(type)) {
         return (T)NativeUnixSocket.getSocketOption(this.fd, name.level(), name.optionName(), Integer.class) != 0;
      }

      if (NamedInteger.HasOfValue.class.isAssignableFrom(type)) {
         int v = NativeUnixSocket.getSocketOption(this.fd, name.level(), name.optionName(), Integer.class);

         try {
            return (T)type.getMethod("ofValue", int.class).invoke(null, v);
         } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException var5) {
            throw new IOException("Value casting problem", var5);
         }
      } else {
         return NativeUnixSocket.getSocketOption(this.fd, name.level(), name.optionName(), type);
      }
   }

   @Override
   protected void doClose() throws IOException {
      if (this.isShutdownOnClose()) {
         NativeUnixSocket.shutdown(this.fd, 2);
         this.unblockAccepts();
      }

      super.doClose();
   }

   protected void decPendingAccepts() throws SocketException {
      this.pendingAccepts.decrementAndGet();
   }

   boolean isShutdownOnClose() {
      return this.shutdownOnClose;
   }

   boolean isConnected(boolean boundOk) {
      try {
         if (this.fd.valid()) {
            switch (NativeUnixSocket.socketStatus(this.fd)) {
               case 1:
                  if (boundOk) {
                     return true;
                  }
                  break;
               case 2:
                  return true;
            }
         }

         return false;
      } catch (IOException e) {
         throw new IllegalStateException(e);
      }
   }

   protected void unblockAccepts() {
   }
}

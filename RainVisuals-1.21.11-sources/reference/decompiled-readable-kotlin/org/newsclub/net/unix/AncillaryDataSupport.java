package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// $VF: Compiled from AncillaryDataSupport.java
final class AncillaryDataSupport implements Closeable {
   private static final FileDescriptor[] NO_FILE_DESCRIPTORS = new FileDescriptor[0];
   private static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocate(0);
   private final List<FileDescriptor[]> receivedFileDescriptors;
   private int[] tipcDestName;
   private final Map<FileDescriptor, Integer> openReceivedFileDescriptors = Collections.synchronizedMap(new HashMap<>());
   private ByteBuffer ancillaryReceiveBuffer;
   @SuppressFBWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
   int[] pendingFileDescriptors;
   private static final int MIN_ANCBUF_LEN = NativeUnixSocket.isLoaded() ? NativeUnixSocket.ancillaryBufMinLen() : 0;
   private int[] tipcErrorInfo;

   boolean hasOutboundFileDescriptors() {
      return this.pendingFileDescriptors != null;
   }

   void receiveFileDescriptors(int[] fds) throws IOException {
      if (fds != null && fds.length != 0) {
         int fdsLength = fds.length;
         FileDescriptor[] descriptors = new FileDescriptor[fdsLength];

         for (int i = 0; i < fdsLength; i++) {
            final FileDescriptor fdesc = new FileDescriptor();
            NativeUnixSocket.initFD(fdesc, fds[i]);
            descriptors[i] = fdesc;
            this.openReceivedFileDescriptors.put(fdesc, fds[i]);
            Closeable cleanup = new Closeable()            // $VF: Compiled from AncillaryDataSupport.java
 {
               @Override
               public void close() throws IOException {
                  AncillaryDataSupport.access$000(AncillaryDataSupport.this).remove(fdesc);
               }
            };

            try {
               NativeUnixSocket.attachCloseable(fdesc, cleanup);
            } catch (SocketException var8) {
            }
         }

         this.receivedFileDescriptors.add(descriptors);
      }
   }

   void setAncillaryReceiveBufferSize(int size) {
      if (size != this.ancillaryReceiveBuffer.capacity()) {
         if (size <= 0) {
            this.ancillaryReceiveBuffer = EMPTY_BUFFER;
         } else {
            this.setAncillaryReceiveBufferSize0(Math.max(256, Math.min(MIN_ANCBUF_LEN, size)));
         }
      }
   }

   void setOutboundFileDescriptors(FileDescriptor... fdescs) throws IOException {
      int[] fds;
      if (fdescs != null && fdescs.length != 0) {
         int numFdescs = fdescs.length;
         fds = new int[numFdescs];

         for (int i = 0; i < numFdescs; i++) {
            FileDescriptor fdesc = fdescs[i];
            fds[i] = NativeUnixSocket.getFD(fdesc);
         }
      } else {
         fds = null;
      }

      this.setOutboundFileDescriptors(fds);
   }

   void setOutboundFileDescriptors(int[] fds) {
      this.pendingFileDescriptors = fds != null && fds.length != 0 ? fds : null;
   }

   public void ensureAncillaryReceiveBufferSize(int minSize) {
      if (minSize > 0) {
         if (this.ancillaryReceiveBuffer.capacity() < minSize) {
            this.setAncillaryReceiveBufferSize(minSize);
         }
      }
   }

   AncillaryDataSupport() {
      this.receivedFileDescriptors = Collections.synchronizedList(new ArrayList<>());
      this.ancillaryReceiveBuffer = EMPTY_BUFFER;
      this.pendingFileDescriptors = null;
      this.tipcErrorInfo = null;
      this.tipcDestName = null;
   }

   void setTipcErrorInfo(int dataLength, int errorCode) {
      if (errorCode == 0 && dataLength == 0) {
         this.tipcErrorInfo = null;
      } else {
         this.tipcErrorInfo = new int[]{errorCode, dataLength};
      }
   }

   int getAncillaryReceiveBufferSize() {
      return this.ancillaryReceiveBuffer.capacity();
   }

   int[] getTIPCDestName() {
      int[] addr = this.tipcDestName;
      this.tipcDestName = null;
      return addr;
   }

   int[] getTIPCErrorInfo() {
      int[] info = this.tipcErrorInfo;
      this.tipcErrorInfo = null;
      return info;
   }

   void setAncillaryReceiveBufferSize0(int size) {
      this.ancillaryReceiveBuffer = ByteBuffer.allocateDirect(size);
   }

   @Override
   public void close() {
      synchronized (this.openReceivedFileDescriptors) {
         for (FileDescriptor desc : this.openReceivedFileDescriptors.keySet()) {
            if (desc.valid()) {
               try {
                  NativeUnixSocket.close(desc);
               } catch (Exception var6) {
               }
            }
         }
      }
   }

   void clearReceivedFileDescriptors() {
      this.receivedFileDescriptors.clear();
   }

   FileDescriptor[] getReceivedFileDescriptors() {
      if (this.receivedFileDescriptors.isEmpty()) {
         return NO_FILE_DESCRIPTORS;
      }

      List<FileDescriptor[]> copy = new ArrayList<>(this.receivedFileDescriptors);
      if (copy.isEmpty()) {
         return NO_FILE_DESCRIPTORS;
      }

      this.receivedFileDescriptors.removeAll(copy);
      int count = 0;

      for (FileDescriptor[] offset : copy) {
         count += offset.length;
      }

      if (count == 0) {
         return NO_FILE_DESCRIPTORS;
      }

      FileDescriptor[] var7 = new FileDescriptor[count];
      int var8 = 0;

      for (FileDescriptor[] fds : copy) {
         System.arraycopy(fds, 0, var7, var8, fds.length);
         var8 += fds.length;
      }

      return var7;
   }

   void setTipcDestName(int b, int c, int a) {
      if (a == 0 && b == 0 && c == 0) {
         this.tipcDestName = null;
      } else {
         this.tipcDestName = new int[]{a, b, c};
      }
   }
}

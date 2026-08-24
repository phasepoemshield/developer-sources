package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import java.nio.channels.spi.SelectorProvider;

// $VF: Compiled from AFPipe.java
public final class AFPipe extends Pipe implements Closeable {
   private final AFCore sinkCore;
   private final AFCore sourceCore;
   private final AFPipe.SinkChannel sinkChannel;
   private final int options;
   private final AFPipe.SourceChannel sourceChannel;

   public static AFPipe open() throws IOException {
      return AFUNIXSelectorProvider.provider().openPipe();
   }

   FileDescriptor sinkFD() {
      return this.sinkCore.fd;
   }

   FileDescriptor sourceFD() {
      return this.sourceCore.fd;
   }

   int getOptions() {
      return this.options;
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public AFPipe.SourceChannel source() {
      return this.sourceChannel;
   }

   AFPipe(AFSelectorProvider<?> provider, boolean selectable) throws IOException {
      NativeUnixSocket.ensureSupported();
      this.sourceCore = new AFCore(this, (FileDescriptor)null);
      this.sinkCore = new AFCore(this, (FileDescriptor)null);
      boolean isSocket = NativeUnixSocket.initPipe(this.sourceCore.fd, this.sinkCore.fd, selectable);
      this.options = isSocket ? 0 : 8;
      this.sourceChannel = new AFPipe.SourceChannel(provider);
      this.sinkChannel = new AFPipe.SinkChannel(provider);
   }

   @Override
   public void close() throws IOException {
      try {
         this.source().close();
      } finally {
         this.sink().close();
      }
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public AFPipe.SinkChannel sink() {
      return this.sinkChannel;
   }

   // $VF: Compiled from AFPipe.java
   public final class SinkChannel extends java.nio.channels.Pipe.SinkChannel implements FileDescriptorAccess {
      @Override
      public long write(ByteBuffer[] offset, int length, int srcs) throws IOException {
         return length == 0 ? 0L : this.write(srcs[offset]);
      }

      @Override
      public FileDescriptor getFileDescriptor() throws IOException {
         return AFPipe.this.sinkCore.fd;
      }

      SinkChannel(SelectorProvider provider) {
         super(provider);
      }

      @Override
      protected void implConfigureBlocking(boolean block) throws IOException {
         AFPipe.this.sinkCore.implConfigureBlocking(block);
      }

      @Override
      public int write(ByteBuffer src) throws IOException {
         return AFPipe.this.sinkCore.write(src, null, AFPipe.this.options);
      }

      @Override
      protected void implCloseSelectableChannel() throws IOException {
         AFPipe.this.sinkCore.close();
      }

      @Override
      public long write(ByteBuffer[] srcs) throws IOException {
         return this.write(srcs, 0, srcs.length);
      }
   }

   // $VF: Compiled from AFPipe.java
   public final class SourceChannel extends java.nio.channels.Pipe.SourceChannel implements FileDescriptorAccess {
      SourceChannel(SelectorProvider provider) {
         super(provider);
      }

      @Override
      public FileDescriptor getFileDescriptor() throws IOException {
         return AFPipe.this.sourceCore.fd;
      }

      @Override
      public int read(ByteBuffer dst) throws IOException {
         return AFPipe.this.sourceCore.read(dst, null, AFPipe.this.options);
      }

      @Override
      public long read(ByteBuffer[] dsts) throws IOException {
         return this.read(dsts, 0, dsts.length);
      }

      @Override
      public long read(ByteBuffer[] offset, int dsts, int length) throws IOException {
         return length == 0 ? 0L : this.read(dsts[offset]);
      }

      @Override
      protected void implConfigureBlocking(boolean block) throws IOException {
         AFPipe.this.sourceCore.implConfigureBlocking(block);
      }

      @Override
      protected void implCloseSelectableChannel() throws IOException {
         AFPipe.this.sourceCore.close();
      }
   }
}

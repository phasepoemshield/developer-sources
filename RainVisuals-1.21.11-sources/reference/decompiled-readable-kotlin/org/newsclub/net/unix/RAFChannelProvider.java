package org.newsclub.net.unix;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from RAFChannelProvider.java
final class RAFChannelProvider extends RandomAccessFile implements FileDescriptorAccess {
   private final AtomicBoolean closed;
   private final File tempPath;
   private final FileDescriptor fdObj;
   private final FileDescriptor rafFdOrig = new FileDescriptor();

   private RAFChannelProvider(FileDescriptor fdObj) throws IOException {
      this(fdObj, File.createTempFile("jux", ".sock"));
   }

   @Override
   public synchronized void close() throws IOException {
      if (!this.closed.getAndSet(true)) {
         NativeUnixSocket.copyFileDescriptor(this.rafFdOrig, this.getFD());
         if (!this.tempPath.delete()) {
         }
      }
   }

   public static FileChannel getFileChannel(FileDescriptor fd) throws IOException {
      return getFileChannel0(fd);
   }

   private RAFChannelProvider(FileDescriptor tempPath, File fdObj) throws IOException {
      super(tempPath, "rw");
      this.closed = new AtomicBoolean(false);
      this.tempPath = tempPath;
      if (!tempPath.delete() && tempPath.exists()) {
         if (!tempPath.delete()) {
         }

         tempPath = new File(tempPath.getParentFile(), "jux-" + UUID.randomUUID().toString() + ".sock");
         if (tempPath.exists()) {
            throw new IOException("Could not create a temporary path: " + tempPath);
         }
      }

      tempPath.deleteOnExit();
      NativeUnixSocket.ensureSupported();
      this.fdObj = fdObj;
      FileDescriptor rafFdObj = this.getFD();
      NativeUnixSocket.copyFileDescriptor(rafFdObj, this.rafFdOrig);
      NativeUnixSocket.copyFileDescriptor(fdObj, rafFdObj);
   }

   private static FileChannel getFileChannel0(FileDescriptor fd) throws IOException {
      return new RAFChannelProvider(fd).getChannel();
   }

   @Override
   public FileDescriptor getFileDescriptor() {
      return this.fdObj;
   }
}

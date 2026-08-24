package org.freedesktop.dbus.spi.message;

import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.Optional;

// $VF: Compiled from ISocketProvider.java
public interface ISocketProvider {
   default Optional<FileDescriptor> createFileDescriptor(int _fd) {
      return Optional.empty();
   }

   default Optional<Integer> getFileDescriptorValue(FileDescriptor _fd) {
      return Optional.empty();
   }

   boolean isFileDescriptorPassingSupported();

   IMessageWriter createWriter(SocketChannel var1) throws IOException;

   void setFileDescriptorSupport(boolean var1);

   IMessageReader createReader(SocketChannel var1) throws IOException;
}

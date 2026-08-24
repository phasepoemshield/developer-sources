package org.freedesktop.dbus.spi.message;

import java.io.IOException;
import java.nio.channels.SocketChannel;

// $VF: Compiled from DefaultSocketProvider.java
final class DefaultSocketProvider implements ISocketProvider {
   static final ISocketProvider INSTANCE = new DefaultSocketProvider();

   @Override
   public void setFileDescriptorSupport(boolean _support) {
   }

   @Override
   public boolean isFileDescriptorPassingSupported() {
      return false;
   }

   @Override
   public IMessageReader createReader(SocketChannel _socket) throws IOException {
      return new InputStreamMessageReader(_socket);
   }

   private DefaultSocketProvider() {
   }

   @Override
   public IMessageWriter createWriter(SocketChannel _socket) throws IOException {
      return new OutputStreamMessageWriter(_socket);
   }
}

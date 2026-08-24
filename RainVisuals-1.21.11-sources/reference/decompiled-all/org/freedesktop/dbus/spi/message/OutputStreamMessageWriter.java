package org.freedesktop.dbus.spi.message;

import java.nio.channels.SocketChannel;
import java.util.List;
import org.freedesktop.dbus.FileDescriptor;

// $VF: Compiled from OutputStreamMessageWriter.java
public class OutputStreamMessageWriter extends AbstractOutputStreamMessageWriter {
   @Override
   protected void writeFileDescriptors(SocketChannel _filedescriptors, List<FileDescriptor> _outputChannel) {
   }

   public OutputStreamMessageWriter(SocketChannel _out) {
      super(_out, DefaultSocketProvider.INSTANCE);
   }
}

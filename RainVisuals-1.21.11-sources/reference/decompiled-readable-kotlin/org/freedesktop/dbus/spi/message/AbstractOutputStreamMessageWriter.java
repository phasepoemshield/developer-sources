package org.freedesktop.dbus.spi.message;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.Objects;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.utils.Hexdump;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from AbstractOutputStreamMessageWriter.java
public abstract class AbstractOutputStreamMessageWriter implements IMessageWriter {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final ISocketProvider socketProviderImpl;
   private final SocketChannel outputChannel;

   protected abstract void writeFileDescriptors(SocketChannel var1, List<FileDescriptor> var2) throws IOException;

   protected AbstractOutputStreamMessageWriter(SocketChannel _out, ISocketProvider _socketProviderImpl) {
      this.outputChannel = Objects.requireNonNull(_out, "SocketChannel required");
      this.socketProviderImpl = Objects.requireNonNull(_socketProviderImpl, "ISocketProvider implementation required");
   }

   @Override
   public boolean isClosed() {
      return !this.outputChannel.isOpen();
   }

   @Override
   public void close() throws IOException {
      this.logger.debug("Closing Message Writer");
      if (this.outputChannel.isOpen()) {
         this.outputChannel.close();
         this.logger.debug("Message Writer closed");
      }
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " [outputChannel=" + this.outputChannel + ", socketProviderImpl=" + this.socketProviderImpl + "]";
   }

   @Override
   public final void writeMessage(Message _msg) throws IOException {
      this.logger.debug("<= {}", _msg);
      if (null != _msg) {
         if (null == _msg.getWireData()) {
            this.logger.warn("Message {} wire-data was null!", _msg);
         } else {
            if (this.socketProviderImpl.isFileDescriptorPassingSupported()) {
               this.writeFileDescriptors(this.outputChannel, _msg.getFiledescriptors());
            }

            for (byte[] buf : _msg.getWireData()) {
               if (this.logger.isTraceEnabled()) {
                  this.logger.trace("{}", null == buf ? "(buffer was null)" : Hexdump.format(buf));
               }

               if (null == buf) {
                  break;
               }

               this.outputChannel.write(ByteBuffer.wrap(buf));
            }

            this.logger.trace("Message sent: {}", _msg);
         }
      }
   }

   protected Logger getLogger() {
      return this.logger;
   }

   protected ISocketProvider getSocketProviderImpl() {
      return this.socketProviderImpl;
   }
}

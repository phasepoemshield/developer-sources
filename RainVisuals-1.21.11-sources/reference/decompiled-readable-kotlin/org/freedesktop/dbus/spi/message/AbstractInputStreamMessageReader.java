package org.freedesktop.dbus.spi.message;

import java.io.EOFException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.MessageProtocolVersionException;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MessageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from AbstractInputStreamMessageReader.java
public abstract class AbstractInputStreamMessageReader implements IMessageReader {
   private byte[] header;
   private final byte[] buf;
   private final int[] len;
   private byte[] body;
   private final ISocketProvider socketProviderImpl;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final SocketChannel inputChannel;
   private final byte[] tbuf;

   protected AbstractInputStreamMessageReader(SocketChannel _socketProviderImpl, ISocketProvider _in) {
      this.socketProviderImpl = Objects.requireNonNull(_socketProviderImpl, "ISocketProvider implementation required");
      this.inputChannel = Objects.requireNonNull(_in, "SocketChannel required");
      this.len = new int[4];
      this.tbuf = new byte[4];
      this.buf = new byte[12];
      this.len[1] = 0;
      this.len[0] = 0;
   }

   protected ISocketProvider getSocketProviderImpl() {
      return this.socketProviderImpl;
   }

   @Override
   public void close() throws IOException {
      if (this.inputChannel.isOpen()) {
         this.logger.trace("Closing Message Reader");
         this.inputChannel.close();
      }
   }

   protected Logger getLogger() {
      return this.logger;
   }

   @Override
   public final Message readMessage() throws DBusException, IOException {
      if (this.len[0] < 12) {
         try {
            ByteBuffer protoVer = ByteBuffer.wrap(this.buf, this.len[0], 12 - this.len[0]);
            int endian = this.inputChannel.read(protoVer);
            if (endian < 0) {
               throw new EOFException("(1) Underlying transport returned " + endian);
            }

            this.len[0] = this.len[0] + endian;
         } catch (SocketTimeoutException var20) {
            return null;
         }
      }

      if (this.len[0] == 0) {
         return null;
      }

      if (this.len[0] < 12) {
         this.logger.trace("Only got {} of 12 bytes of header", this.len[0]);
         return null;
      }

      byte var21 = this.buf[3];
      if (var21 > 1) {
         throw new MessageProtocolVersionException(String.format("Protocol version %s is unsupported", var21));
      }

      if (this.len[1] < 4) {
         try {
            SocketTimeoutException _ex = this.inputChannel.read(ByteBuffer.wrap(this.tbuf, this.len[1], 4 - this.len[1]));
            if (_ex < 0) {
               throw new EOFException("(2) Underlying transport returned " + _ex);
            }

            this.len[1] = this.len[1] + _ex;
         } catch (SocketTimeoutException var19) {
            return null;
         }
      }

      if (this.len[1] < 4) {
         this.logger.trace("Only got {} of 4 bytes of header", this.len[1]);
         return null;
      }

      byte var23 = this.buf[0];
      int headerlen;
      if (this.header == null) {
         headerlen = (int)Message.demarshallint(this.tbuf, 0, var23, 4);
         int type = headerlen & 7;
         if (type != 0) {
            headerlen += 8 - type;
         }
      } else {
         headerlen = this.header.length - 8;
      }

      if (this.header == null) {
         this.header = new byte[headerlen + 8];
         System.arraycopy(this.tbuf, 0, this.header, 0, 4);
         this.len[2] = 0;
      }

      if (this.len[2] < headerlen) {
         try {
            int var24 = this.inputChannel.read(ByteBuffer.wrap(this.header, 8 + this.len[2], headerlen - this.len[2]));
            if (var24 < 0) {
               throw new EOFException("(3) Underlying transport returned " + var24);
            }

            this.len[2] = this.len[2] + var24;
         } catch (SocketTimeoutException var18) {
            return null;
         }
      }

      if (this.len[2] < headerlen) {
         this.logger.trace("Only got {} of {} bytes of header", this.len[2], headerlen);
         return null;
      }

      byte var25 = this.buf[1];
      if (this.body == null) {
         this.body = new byte[(int)Message.demarshallint(this.buf, 4, var23, 4)];
         this.len[3] = 0;
      }

      if (this.len[3] < this.body.length) {
         try {
            int _ex = this.inputChannel.read(ByteBuffer.wrap(this.body, this.len[3], this.body.length - this.len[3]));
            if (_ex < 0) {
               throw new EOFException("(4) Underlying transport returned " + _ex);
            }

            this.len[3] = this.len[3] + _ex;
         } catch (SocketTimeoutException var17) {
            return null;
         }
      }

      if (this.len[3] < this.body.length) {
         this.logger.trace("Only got {} of {} bytes of body", this.len[3], this.body.length);
         return null;
      }

      try {
         List<FileDescriptor> var26 = null;
         if (this.socketProviderImpl.isFileDescriptorPassingSupported()) {
            var26 = this.readFileDescriptors(this.inputChannel);
         }

         Message m = MessageFactory.createMessage(var25, this.buf, this.header, this.body, var26);
         this.logger.debug("=> {}", m);
         return m;
      } catch (DBusException | RuntimeException var15) {
         this.logger.warn("Exception while creating message.", var15);
         throw var15;
      } finally {
         Arrays.fill(this.tbuf, (byte)0);
         this.len[1] = 0;
         this.body = null;
         this.header = null;
         Arrays.fill(this.buf, (byte)0);
         this.len[0] = 0;
      }
   }

   protected abstract List<FileDescriptor> readFileDescriptors(SocketChannel var1) throws DBusException;

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " [inputChannel=" + this.inputChannel + ", socketProviderImpl=" + this.socketProviderImpl + "]";
   }

   @Override
   public boolean isClosed() {
      return !this.inputChannel.isOpen();
   }
}

package org.freedesktop.dbus.connections.transports;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicLong;
import org.freedesktop.dbus.messages.MessageFactory;
import org.freedesktop.dbus.spi.message.IMessageReader;
import org.freedesktop.dbus.spi.message.IMessageWriter;
import org.freedesktop.dbus.spi.message.ISocketProvider;

// $VF: Compiled from TransportConnection.java
public class TransportConnection implements Closeable {
   private final long id;
   private final MessageFactory messageFactory;
   private final ISocketProvider socketProviderImpl;
   private final IMessageReader reader;
   private static final AtomicLong TRANSPORT_ID_GENERATOR = new AtomicLong(0L);
   private final IMessageWriter writer;
   private final SocketChannel channel;

   public SocketChannel getChannel() {
      return this.channel;
   }

   public TransportConnection(
      MessageFactory _reader, SocketChannel _socketProviderImpl, ISocketProvider _channel, IMessageWriter _writer, IMessageReader _factory
   ) {
      this.id = TRANSPORT_ID_GENERATOR.incrementAndGet();
      this.messageFactory = _factory;
      this.channel = _channel;
      this.socketProviderImpl = _socketProviderImpl;
      this.writer = _writer;
      this.reader = _reader;
   }

   public IMessageWriter getWriter() {
      return this.writer;
   }

   public IMessageReader getReader() {
      return this.reader;
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + " [id=" + this.id + ", channel=" + this.channel + ", writer=" + this.writer + ", reader=" + this.reader + "]";
   }

   public long getId() {
      return this.id;
   }

   @Override
   public void close() throws IOException {
      if (this.reader != null) {
         this.reader.close();
      }

      if (this.writer != null) {
         this.writer.close();
      }

      if (this.channel != null) {
         this.channel.close();
      }
   }

   public ISocketProvider getSocketProviderImpl() {
      return this.socketProviderImpl;
   }

   public MessageFactory getMessageFactory() {
      return this.messageFactory;
   }
}

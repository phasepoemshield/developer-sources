package org.freedesktop.dbus.connections.transports;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.Objects;
import java.util.Optional;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.SASL;
import org.freedesktop.dbus.connections.config.SaslConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.exceptions.AuthenticationException;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.InvalidBusAddressException;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MessageFactory;
import org.freedesktop.dbus.spi.message.IMessageReader;
import org.freedesktop.dbus.spi.message.IMessageWriter;
import org.freedesktop.dbus.spi.message.ISocketProvider;
import org.freedesktop.dbus.spi.message.InputStreamMessageReader;
import org.freedesktop.dbus.spi.message.OutputStreamMessageWriter;
import org.freedesktop.dbus.utils.IThrowingSupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from AbstractTransport.java
public abstract class AbstractTransport implements Closeable {
   private final TransportConfig config;
   private boolean fileDescriptorSupported;
   private final ServiceLoader<ISocketProvider> spiLoader = ServiceLoader.load(ISocketProvider.class, AbstractTransport.class.getClassLoader());
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final BusAddress address;
   private TransportConnection transportConnection;
   private final long transportId;
   private static final AtomicLong TRANSPORT_ID_GENERATOR = new AtomicLong(0L);
   private final MessageFactory messageFactory;

   public boolean isFileDescriptorSupported() {
      return this.fileDescriptorSupported;
   }

   protected BusAddress getAddress() {
      return this.address;
   }

   private void runCallback(Consumer<AbstractTransport> _callback) {
      Optional.ofNullable(_callback).ifPresent(c -> c.accept(this));
   }

   public synchronized boolean isConnected() {
      return this.transportConnection != null
         && this.transportConnection.getWriter() != null
         && !this.transportConnection.getWriter().isClosed()
         && this.transportConnection.getReader() != null
         && !this.transportConnection.getReader().isClosed();
   }

   public void setPreConnectCallback(Consumer<AbstractTransport> _run) {
      this.config.setPreConnectCallback(_run);
   }

   protected abstract SocketChannel connectImpl() throws IOException;

   protected SaslConfig getSaslConfig() {
      return this.config.getSaslConfig();
   }

   public final boolean isListening() {
      return this.getAddress().isListeningSocket();
   }

   public TransportConfig getTransportConfig() {
      return this.config;
   }

   public void writeMessage(Message _msg) throws IOException {
      if (!this.fileDescriptorSupported && 104 == _msg.getType()) {
         throw new IllegalArgumentException("File descriptors are not supported!");
      }

      if (this.transportConnection.getWriter() != null && !this.transportConnection.getWriter().isClosed()) {
         this.transportConnection.getWriter().writeMessage(_msg);
      } else {
         throw new IOException("OutputWriter already closed or null");
      }
   }

   protected abstract void bindImpl() throws IOException;

   protected AbstractTransport(BusAddress _address, TransportConfig _config) {
      this.transportId = TRANSPORT_ID_GENERATOR.incrementAndGet();
      this.address = Objects.requireNonNull(_address, "BusAddress required");
      this.config = Objects.requireNonNull(_config, "Config required");
      if (_address.isListeningSocket()) {
         this.config.getSaslConfig().setMode(SASL.SaslMode.SERVER);
      } else {
         this.config.getSaslConfig().setMode(SASL.SaslMode.CLIENT);
      }

      this.config.getSaslConfig().setGuid(this.address.getGuid());
      this.config.getSaslConfig().setFileDescriptorSupport(this.hasFileDescriptorSupport());
      this.messageFactory = new MessageFactory(this.config.getEndianess());
   }

   protected abstract boolean isBound();

   private void authenticate(SocketChannel _sock) throws IOException {
      SASL sasl = new SASL(this.config.getSaslConfig());

      try {
         if (!sasl.auth(_sock, this)) {
            throw new AuthenticationException("Failed to authenticate");
         }
      } catch (IOException var4) {
         _sock.close();
         throw var4;
      }

      this.fileDescriptorSupported = sasl.isFileDescriptorSupported();
   }

   public final TransportConnection listen() throws IOException {
      if (!this.getAddress().isListeningSocket()) {
         throw new InvalidBusAddressException("Cannot listen on client connection address (try use connect() instead)");
      }

      if (!this.isBound()) {
         this.bindImpl();
         this.runCallback(this.config.getAfterBindCallback());
      }

      this.transportConnection = this.internalConnect(this::acceptImpl);
      return this.transportConnection;
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
      sb.append(" [id=").append(this.transportId).append(", ");
      if (this.transportConnection != null) {
         sb.append("connectionId=").append(this.transportConnection.getId()).append(", ");
      }

      sb.append("address=").append(this.address).append("]");
      return sb.toString();
   }

   public MessageFactory getMessageFactory() {
      return this.messageFactory;
   }

   public TransportConnection getTransportConnection() {
      return this.transportConnection;
   }

   protected abstract SocketChannel acceptImpl() throws IOException;

   @Override
   public final void close() throws IOException {
      if (this.transportConnection != null) {
         this.transportConnection.close();
         this.transportConnection = null;
      }

      this.getLogger().debug("Disconnecting Transport: {}", this);
      this.closeTransport();
   }

   private TransportConnection createInputOutput(SocketChannel _socket) {
      IMessageReader reader = null;
      IMessageWriter writer = null;
      ISocketProvider providerImpl = null;

      try {
         for (ISocketProvider provider : this.spiLoader) {
            this.logger.debug("Found ISocketProvider {}", provider);
            provider.setFileDescriptorSupport(this.hasFileDescriptorSupport() && this.fileDescriptorSupported);
            reader = provider.createReader(_socket);
            writer = provider.createWriter(_socket);
            if (reader != null && writer != null) {
               this.logger.debug("Using ISocketProvider {}", provider);
               providerImpl = provider;
               break;
            }
         }
      } catch (ServiceConfigurationError var7) {
         this.logger.error("Could not initialize service provider", var7);
      } catch (IOException var8) {
         this.logger.error("Could not initialize alternative message reader/writer", var8);
      }

      if (reader == null || writer == null) {
         this.logger.debug("No alternative ISocketProvider found, using built-in implementation");
         reader = new InputStreamMessageReader(_socket);
         writer = new OutputStreamMessageWriter(_socket);
         this.fileDescriptorSupported = false;
      }

      return new TransportConnection(this.messageFactory, _socket, providerImpl, writer, reader);
   }

   protected abstract boolean hasFileDescriptorSupport();

   public Message readMessage() throws DBusException, IOException {
      if (this.transportConnection.getReader() != null && !this.transportConnection.getReader().isClosed()) {
         return this.transportConnection.getReader().readMessage();
      } else {
         throw new IOException("InputReader already closed or null");
      }
   }

   protected abstract void closeTransport() throws IOException;

   private TransportConnection internalConnect(IThrowingSupplier<SocketChannel, IOException> _channelProvider) throws IOException {
      this.runCallback(this.config.getPreConnectCallback());
      SocketChannel channel = _channelProvider.get();
      this.authenticate(channel);
      return this.createInputOutput(channel);
   }

   protected Logger getLogger() {
      return this.logger;
   }

   public final SocketChannel connect() throws IOException {
      if (this.getAddress().isListeningSocket()) {
         throw new InvalidBusAddressException("Cannot connect when using listening address (try use listen() instead)");
      }

      this.transportConnection = this.internalConnect(this::connectImpl);
      return this.transportConnection.getChannel();
   }
}

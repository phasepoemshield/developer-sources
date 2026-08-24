package org.freedesktop.dbus.bin;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.connections.transports.TransportBuilder;
import org.freedesktop.dbus.connections.transports.TransportConnection;
import org.freedesktop.dbus.exceptions.AuthenticationException;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.InvalidBusAddressException;
import org.freedesktop.dbus.exceptions.SocketClosedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from EmbeddedDBusDaemon.java
public class EmbeddedDBusDaemon implements Closeable {
   private DBusDaemon daemon;
   private Consumer<AbstractTransport> connectCallback;
   private final AtomicBoolean closed = new AtomicBoolean(false);
   private CountDownLatch startupLatch = new CountDownLatch(1);
   private static final Logger LOGGER = LoggerFactory.getLogger(EmbeddedDBusDaemon.class);
   private String unixSocketFileGroup;
   private TransportBuilder.SaslAuthMode saslAuthMode;
   private Consumer<AbstractTransport> bindCallback;
   private String unixSocketFileOwner;
   private final BusAddress address;
   private PosixFilePermission[] unixSocketFilePermissions;

   public void setSaslAuthMode(TransportBuilder.SaslAuthMode _saslAuthMode) {
      this.saslAuthMode = _saslAuthMode;
   }

   public synchronized boolean isRunning() {
      return this.startupLatch.getCount() == 0L && this.daemon != null && this.daemon.isRunning();
   }

   public void setBindCallback(Consumer<AbstractTransport> _callback) {
      this.bindCallback = _callback;
   }

   public void startInBackgroundAndWait() throws IllegalStateException {
      this.startInBackground();

      try {
         this.startupLatch.await();
      } catch (InterruptedException _ex) {
         Thread.currentThread().interrupt();
         throw new IllegalStateException("Interrupted while waiting for daemon to start");
      }
   }

   private void startListening() throws DBusException, IOException {
      if (!TransportBuilder.getRegisteredBusTypes().contains(this.address.getBusType())) {
         throw new IllegalArgumentException("Unknown or unsupported address type: " + this.address.getType());
      }

      LOGGER.debug("About to initialize transport on: {}", this.address);

      try (AbstractTransport transport = TransportBuilder.create(this.address)
            .configure()
            .withUnixSocketFileOwner(this.unixSocketFileOwner)
            .withUnixSocketFileGroup(this.unixSocketFileGroup)
            .withUnixSocketFilePermissions(this.unixSocketFilePermissions)
            .withPreConnectCallback(this.connectCallback)
            .withAfterBindCallback(x -> {
               if (this.bindCallback != null) {
                  this.bindCallback.accept(x);
               }

               this.startupLatch.countDown();
            })
            .withAutoConnect(false)
            .configureSasl()
            .withAuthMode(this.getSaslAuthMode())
            .back()
            .back()
            .build()) {
         this.setDaemonAndStart(transport);

         do {
            try {
               LOGGER.debug("Begin listening to: {}", transport);
               TransportConnection _ex = transport.listen();
               this.daemon.addSock(_ex);
            } catch (AuthenticationException var5) {
               LOGGER.error("Authentication failed", var5);
            } catch (SocketClosedException var6) {
               LOGGER.debug("Connection closed", var6);
            }
         } while (this.daemon.isRunning());
      }
   }

   public EmbeddedDBusDaemon(String _address) throws InvalidBusAddressException {
      this(BusAddress.of(_address));
   }

   public void startInBackground() {
      Thread thread = new Thread(this::startInForeground);
      String threadName = this.address.toString().replaceAll("^([^,]+),.+", "$1");
      thread.setName("EmbeddedDBusDaemon-" + threadName);
      thread.setDaemon(true);
      thread.setUncaughtExceptionHandler((th, ex) -> LOGGER.error("Got uncaught exception", ex));
      thread.start();
   }

   public Consumer<AbstractTransport> getConnectCallback() {
      return this.connectCallback;
   }

   public void setConnectCallback(Consumer<AbstractTransport> _connectCallback) {
      this.connectCallback = _connectCallback;
   }

   public void setUnixSocketOwner(String _owner) {
      this.unixSocketFileOwner = _owner;
   }

   public Consumer<AbstractTransport> getBindCallback() {
      return this.bindCallback;
   }

   public void setUnixSocketGroup(String _group) {
      this.unixSocketFileGroup = _group;
   }

   @Override
   public synchronized void close() throws IOException {
      this.closed.set(true);
      this.startupLatch = new CountDownLatch(1);
      if (this.daemon != null) {
         this.daemon.close();

         try {
            this.daemon.join(5000L);
         } catch (InterruptedException var2) {
            LOGGER.debug("Interrupted while waiting for daemon thread to terminate");
            Thread.currentThread().interrupt();
         }

         this.daemon = null;
      }
   }

   public void setUnixSocketPermissions(PosixFilePermission... _permissions) {
      this.unixSocketFilePermissions = _permissions;
   }

   public void startInBackgroundAndWait(long _maxWaitMillis) throws IllegalStateException {
      this.startInBackground();

      try {
         if (!this.startupLatch.await(_maxWaitMillis, TimeUnit.MILLISECONDS)) {
            throw new IllegalStateException("Daemon not started after " + _maxWaitMillis + " milliseconds");
         }
      } catch (InterruptedException _ex) {
         Thread.currentThread().interrupt();
         throw new IllegalStateException("Startup of daemon interrupted");
      }
   }

   public void startInForeground() {
      try {
         this.closed.set(false);
         this.startListening();
      } catch (IOException | DBusException var2) {
         if (!this.closed.get()) {
            throw new RuntimeException(var2);
         }
      }
   }

   public TransportBuilder.SaslAuthMode getSaslAuthMode() {
      return this.saslAuthMode;
   }

   public EmbeddedDBusDaemon(BusAddress _address) {
      this.address = BusAddress.of(Objects.requireNonNull(_address, "Address required"));
   }

   private synchronized void setDaemonAndStart(AbstractTransport _transport) {
      this.daemon = new DBusDaemon(_transport);
      this.daemon.start();
   }
}

package org.freedesktop.dbus.connections.base;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.ClosedByInterruptException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.freedesktop.dbus.DBusCallInfo;
import org.freedesktop.dbus.DBusMatchRule;
import org.freedesktop.dbus.RemoteObject;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.IDisconnectAction;
import org.freedesktop.dbus.connections.IDisconnectCallback;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.connections.transports.TransportBuilder;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.exceptions.FatalDBusException;
import org.freedesktop.dbus.exceptions.NotConnected;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.DBusSigHandler;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.messages.Error;
import org.freedesktop.dbus.messages.ExportedObject;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MessageFactory;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.messages.MethodReturn;
import org.freedesktop.dbus.messages.ObjectTree;
import org.freedesktop.dbus.utils.NameableThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from AbstractConnectionBase.java
public abstract sealed class AbstractConnectionBase implements Closeable permits ConnectionMethodInvocation {
   private final ObjectTree objectTree;
   private final Map<DBusMatchRule, Queue<DBusSigHandler<DBusSignal>>> genericHandledSignals;
   private final PendingCallbackManager callbackManager;
   private final Map<String, ExportedObject> exportedObjects;
   private final Map<Long, MethodCall> pendingCalls;
   private final BusAddress busAddress;
   private final Map<DBusInterface, RemoteObject> importedObjects;
   private static final Map<Thread, DBusCallInfo> INFOMAP = new ConcurrentHashMap<>();
   private final Map<DBusMatchRule, Queue<DBusSigHandler<? extends DBusSignal>>> handledSignals;
   private AbstractTransport transport;
   private volatile boolean disconnecting;
   private final ReceivingService receivingService;
   private final FallbackContainer fallbackContainer;
   private Optional<IDisconnectCallback> disconnectCallback;
   private final ExecutorService senderService;
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final Queue<Error> pendingErrorQueue;
   private final MessageFactory messageFactory;
   private final IncomingMessageThread readerThread;

   protected Map<Thread, DBusCallInfo> getInfoMap() {
      return INFOMAP;
   }

   private void sendMessageInternally(Message _message) {
      try {
         if (!this.isConnected()) {
            throw new NotConnected("Disconnected");
         }

         if (_message instanceof DBusSignal ds) {
            if (_message.getEndianess() == 0) {
               _message.updateEndianess(this.getMessageFactory().getEndianess());
            }

            ds.appendbody(this);
         }

         if (_message instanceof MethodCall var12 && 0 == (_message.getFlags() & 1) && null != this.getPendingCalls()) {
            synchronized (this.getPendingCalls()) {
               this.getPendingCalls().put(_message.getSerial(), var12);
            }
         }

         this.getLogger().trace("Writing message to connection {}: {}", this.getTransport(), _message);
         this.getTransport().writeMessage(_message);
      } catch (Exception var10) {
         Exception _ex = var10;
         this.getLogger().trace("Exception while sending message.", var10);
         if (_message instanceof MethodCall ioe && var10 instanceof DBusExecutionException) {
            try {
               ioe.setReply(this.getMessageFactory().createError(_message, _ex));
            } catch (DBusException var8) {
               this.getLogger().trace("Could not set message reply", var8);
            }
         } else if (_message instanceof MethodCall mc) {
            try {
               this.getLogger().info("Setting reply to {} as an error", _message);
               mc.setReply(this.getMessageFactory().createError(_message, new DBusExecutionException("Message Failed to Send: " + _ex.getMessage())));
            } catch (DBusException var7) {
               this.getLogger().trace("Could not set message reply", var7);
            }
         } else if (_message instanceof MethodReturn) {
            try {
               this.getTransport().writeMessage(this.getMessageFactory().createError(_message, _ex));
            } catch (IOException | DBusException var6) {
               this.getLogger().debug("Error writing method return to transport", var6);
            }
         }

         if (var10 instanceof IOException var13) {
            this.getLogger().debug("Fatal IOException while sending message, disconnecting", var10);
            this.internalDisconnect(var13);
         }
      }
   }

   protected FallbackContainer getFallbackContainer() {
      return this.fallbackContainer;
   }

   protected Queue<Error> getPendingErrorQueue() {
      return this.pendingErrorQueue;
   }

   protected Map<DBusMatchRule, Queue<DBusSigHandler<DBusSignal>>> getGenericHandledSignals() {
      return this.genericHandledSignals;
   }

   public void setDisconnectCallback(IDisconnectCallback _disconnectCallback) {
      this.disconnectCallback = Optional.ofNullable(_disconnectCallback);
   }

   public abstract String getMachineId();

   public abstract DBusInterface getExportedObject(String var1, String var2) throws DBusException;

   protected PendingCallbackManager getCallbackManager() {
      return this.callbackManager;
   }

   public void unExportObject(String _objectpath) {
      synchronized (this.getExportedObjects()) {
         this.getExportedObjects().remove(_objectpath);
         this.getObjectTree().remove(_objectpath);
      }
   }

   public void sendMessage(Message _message) {
      if (!this.isConnected()) {
         throw new NotConnected("Cannot send message: Not connected");
      }

      Runnable runnable = () -> this.sendMessageInternally(_message);
      this.senderService.execute(runnable);
   }

   protected BusAddress getBusAddress() {
      return this.busAddress;
   }

   protected synchronized void disconnect(IDisconnectAction _before, IDisconnectAction _after) {
      if (_before != null) {
         _before.perform();
      }

      this.internalDisconnect(null);
      if (_after != null) {
         _after.perform();
      }
   }

   protected Logger getLogger() {
      return this.logger;
   }

   public abstract <T extends DBusInterface> T getExportedObject(String var1, String var2, Class<T> var3) throws DBusException;

   protected AbstractTransport getTransport() {
      return this.transport;
   }

   protected Map<DBusInterface, RemoteObject> getImportedObjects() {
      return this.importedObjects;
   }

   public IDisconnectCallback getDisconnectCallback() {
      return this.disconnectCallback.orElse(null);
   }

   protected Map<Long, MethodCall> getPendingCalls() {
      return this.pendingCalls;
   }

   protected final synchronized void internalDisconnect(IOException _connectionError) {
      if (!this.isConnected()) {
         this.getLogger().debug("Ignoring disconnect, already disconnected");
      } else {
         this.disconnecting = true;
         this.getLogger().debug("Disconnecting Abstract Connection");
         this.disconnectCallback
            .ifPresent(cb -> Optional.ofNullable(_connectionError).ifPresentOrElse(cb::disconnectOnError, () -> cb.requestedDisconnect(null)));
         this.readerThread.terminate();
         this.receivingService.shutdown(10, TimeUnit.SECONDS);
         this.getLogger().debug("Notifying {} method call(s) to stop waiting for replies", this.getPendingCalls().size());
         Exception interrupt = _connectionError == null ? new IOException("Disconnecting") : _connectionError;

         for (MethodCall _ex : this.getPendingCalls().values()) {
            try {
               _ex.setReply(this.getMessageFactory().createError(_ex, interrupt));
            } catch (DBusException var7) {
               this.getLogger().debug("Cannot set method reply to error", var7);
            }
         }

         this.getLogger().debug("Shutting down SenderService");
         List<Runnable> var8 = this.senderService.shutdownNow();
         if (_connectionError == null) {
            for (Runnable runnable : var8) {
               runnable.run();
            }
         } else if (!var8.isEmpty()) {
            this.getLogger().debug("Will not send {} messages due to connection closed by IOException", var8.size());
         }

         try {
            if (this.transport != null) {
               this.transport.close();
               this.transport = null;
            }
         } catch (IOException var6) {
            this.getLogger().debug("Exception while disconnecting transport.", var6);
         }

         this.receivingService.shutdownNow();
         this.disconnecting = false;
      }
   }

   protected void listen() throws IOException {
      this.readerThread.start();
   }

   public BusAddress getAddress() {
      return this.busAddress;
   }

   protected AbstractConnectionBase(TransportConfig _transportConfig, ReceivingServiceConfig _rsCfg) throws DBusException {
      this.exportedObjects = Collections.synchronizedMap(new HashMap<>());
      this.importedObjects = new ConcurrentHashMap<>();
      this.getExportedObjects().put(null, new ExportedObject(new GlobalHandler(this), false));
      this.disconnectCallback = Optional.ofNullable(null);
      this.disconnecting = false;
      this.handledSignals = new ConcurrentHashMap<>();
      this.genericHandledSignals = new ConcurrentHashMap<>();
      this.pendingCalls = Collections.synchronizedMap(new LinkedHashMap<>());
      this.callbackManager = new PendingCallbackManager();
      this.pendingErrorQueue = new ConcurrentLinkedQueue<>();
      TransportBuilder transportBuilder = TransportBuilder.create(_transportConfig);
      this.busAddress = transportBuilder.getAddress();
      String senderThreadName = "DBus Sender Thread-";
      String rcvSvcName = "";
      if (this.logger.isDebugEnabled()) {
         senderThreadName = "DBus Sender Thread: " + this.busAddress.isListeningSocket() + ", ";
         rcvSvcName = "RcvSvc: " + this.busAddress.isListeningSocket() + " ";
      }

      this.receivingService = new ReceivingService(rcvSvcName, _rsCfg);
      this.senderService = Executors.newFixedThreadPool(1, new NameableThreadFactory(senderThreadName, true));
      this.objectTree = new ObjectTree();
      this.fallbackContainer = new FallbackContainer();
      this.readerThread = Objects.requireNonNull(this.createReaderThread(this.busAddress), "Reader thread required");

      try {
         this.transport = transportBuilder.build();
         this.messageFactory = Optional.ofNullable(this.transport).map(AbstractTransport::getMessageFactory).orElseThrow();
      } catch (IOException | DBusException var8) {
         this.logger.debug("Error creating transport", var8);
         if (var8 instanceof IOException ioe) {
            this.internalDisconnect(ioe);
         }

         throw new DBusException("Failed to connect to bus: " + var8.getMessage(), var8);
      }
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "[address=" + this.busAddress + "]";
   }

   public ObjectTree getObjectTree() {
      return this.objectTree;
   }

   @Override
   public void close() throws IOException {
      this.disconnect();
   }

   protected synchronized Map<String, ExportedObject> getExportedObjects() {
      return this.exportedObjects;
   }

   public TransportConfig getTransportConfig() {
      return this.getTransport().getTransportConfig();
   }

   protected Map<DBusMatchRule, Queue<DBusSigHandler<? extends DBusSignal>>> getHandledSignals() {
      return this.handledSignals;
   }

   public static DBusCallInfo getCallInfo() {
      return INFOMAP.get(Thread.currentThread());
   }

   public synchronized void disconnect() {
      this.getLogger().debug("Disconnect called");
      this.internalDisconnect(null);
   }

   Message readIncoming() throws DBusException {
      if (!this.isConnected()) {
         return null;
      }

      Message m = null;

      try {
         m = this.getTransport().readMessage();
      } catch (IOException var3) {
         if (var3 instanceof EOFException || var3 instanceof ClosedByInterruptException) {
            this.disconnectCallback.ifPresent(cb -> cb.clientDisconnect());
            if (this.disconnecting || this.getBusAddress().isListeningSocket()) {
               return null;
            }
         }

         if (this.isConnected()) {
            throw new FatalDBusException(var3);
         }
      }

      return m;
   }

   public String getExportedObject(DBusInterface _interface) throws DBusException {
      Optional<Entry<String, ExportedObject>> foundInterface = this.getExportedObjects()
         .entrySet()
         .stream()
         .filter(e -> _interface.equals(e.getValue().getObject().get()))
         .findFirst();
      if (foundInterface.isPresent()) {
         return foundInterface.get().getKey();
      }

      RemoteObject rObj = this.getImportedObjects().get(_interface);
      if (rObj != null) {
         String s = rObj.getObjectPath();
         if (s != null) {
            return s;
         }
      }

      throw new DBusException("Not an object exported or imported by this connection");
   }

   public MessageFactory getMessageFactory() {
      return this.messageFactory;
   }

   public DBusExecutionException getError() {
      Error poll = this.getPendingErrorQueue().poll();
      return poll != null ? poll.getException() : null;
   }

   public boolean isConnected() {
      return this.transport != null && this.transport.isConnected();
   }

   protected abstract IncomingMessageThread createReaderThread(BusAddress var1);

   public boolean connect() throws IOException {
      if (!this.getTransport().isConnected()) {
         return this.getTransport().isListening() ? this.getTransport().listen() != null : this.getTransport().connect() != null;
      } else {
         return false;
      }
   }

   protected ReceivingService getReceivingService() {
      return this.receivingService;
   }
}

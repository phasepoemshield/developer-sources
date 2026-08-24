/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.base;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.channels.ClosedByInterruptException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
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
import org.freedesktop.dbus.connections.base.FallbackContainer;
import org.freedesktop.dbus.connections.base.GlobalHandler;
import org.freedesktop.dbus.connections.base.IncomingMessageThread;
import org.freedesktop.dbus.connections.base.PendingCallbackManager;
import org.freedesktop.dbus.connections.base.ReceivingService;
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

/*
 * Uses 'sealed' constructs - enablewith --sealed true
 */
public abstract class AbstractConnectionBase
implements Closeable {
    private final ObjectTree objectTree;
    private final Map<DBusMatchRule, Queue<DBusSigHandler<DBusSignal>>> genericHandledSignals;
    private final PendingCallbackManager callbackManager;
    private final Map<String, ExportedObject> exportedObjects;
    private final Map<Long, MethodCall> pendingCalls;
    private final BusAddress busAddress;
    private final Map<DBusInterface, RemoteObject> importedObjects;
    private static final Map<Thread, DBusCallInfo> INFOMAP = new ConcurrentHashMap<Thread, DBusCallInfo>();
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    private void sendMessageInternally(Message _message) {
        block22: {
            try {
                if (!this.isConnected()) {
                    throw new NotConnected("Disconnected");
                }
                if (_message instanceof DBusSignal) {
                    ds = (DBusSignal)_message;
                    if (_message.getEndianess() == 0) {
                        _message.updateEndianess(this.getMessageFactory().getEndianess());
                    }
                    ds.appendbody(this);
                }
                if (_message instanceof MethodCall) {
                    mc = (MethodCall)_message;
                    if (0 == (_message.getFlags() & 1)) {
                        if (null != this.getPendingCalls()) {
                            var3_4 = this.getPendingCalls();
                            synchronized (var3_4) {
                                this.getPendingCalls().put(_message.getSerial(), mc);
                            }
                        }
                    }
                }
                this.getLogger().trace("Writing message to connection {}: {}", (Object)this.getTransport(), (Object)_message);
                this.getTransport().writeMessage(_message);
            }
            catch (Exception _ex) {
                this.getLogger().trace("Exception while sending message.", _ex);
                if (!(_message instanceof MethodCall)) ** GOTO lbl-1000
                mc = (MethodCall)_message;
                if (_ex instanceof DBusExecutionException) {
                    try {
                        mc.setReply(this.getMessageFactory().createError(_message, _ex));
                    }
                    catch (DBusException _exDe) {
                        this.getLogger().trace("Could not set message reply", _exDe);
                    }
                } else if (_message instanceof MethodCall) {
                    mc = (MethodCall)_message;
                    try {
                        this.getLogger().info("Setting reply to {} as an error", (Object)_message);
                        mc.setReply(this.getMessageFactory().createError(_message, new DBusExecutionException("Message Failed to Send: " + _ex.getMessage())));
                    }
                    catch (DBusException _exDe) {
                        this.getLogger().trace("Could not set message reply", _exDe);
                    }
                } else if (_message instanceof MethodReturn) {
                    try {
                        this.getTransport().writeMessage(this.getMessageFactory().createError(_message, _ex));
                    }
                    catch (IOException | DBusException _exIo) {
                        this.getLogger().debug("Error writing method return to transport", (Throwable)var5_10);
                    }
                }
                if (!(_ex instanceof IOException)) break block22;
                ioe = (IOException)_ex;
                this.getLogger().debug("Fatal IOException while sending message, disconnecting", (Throwable)var2_3);
                this.internalDisconnect((IOException)var3_5);
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void unExportObject(String _objectpath) {
        Map<String, ExportedObject> map = this.getExportedObjects();
        synchronized (map) {
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

    /*
     * WARNING - void declaration
     */
    protected final synchronized void internalDisconnect(IOException _connectionError) {
        if (!this.isConnected()) {
            this.getLogger().debug("Ignoring disconnect, already disconnected");
            return;
        }
        this.disconnecting = true;
        this.getLogger().debug("Disconnecting Abstract Connection");
        this.disconnectCallback.ifPresent(cb -> Optional.ofNullable(_connectionError).ifPresentOrElse(cb::disconnectOnError, () -> cb.requestedDisconnect(null)));
        this.readerThread.terminate();
        this.receivingService.shutdown(10, TimeUnit.SECONDS);
        this.getLogger().debug("Notifying {} method call(s) to stop waiting for replies", (Object)this.getPendingCalls().size());
        IOException interrupt = _connectionError == null ? new IOException("Disconnecting") : _connectionError;
        Iterator<MethodCall> iterator2 = this.getPendingCalls().values().iterator();
        while (iterator2.hasNext()) {
            MethodCall mthCall = iterator2.next();
            try {
                mthCall.setReply(this.getMessageFactory().createError(mthCall, interrupt));
            }
            catch (DBusException _ex) {
                this.getLogger().debug("Cannot set method reply to error", _ex);
            }
        }
        this.getLogger().debug("Shutting down SenderService");
        List<Runnable> remainingMsgsToSend = this.senderService.shutdownNow();
        if (_connectionError == null) {
            for (Runnable runnable : remainingMsgsToSend) {
                runnable.run();
            }
        } else if (!remainingMsgsToSend.isEmpty()) {
            this.getLogger().debug("Will not send {} messages due to connection closed by IOException", (Object)remainingMsgsToSend.size());
        }
        try {
            if (this.transport != null) {
                this.transport.close();
                this.transport = null;
            }
        }
        catch (IOException _ex) {
            void var4_5;
            this.getLogger().debug("Exception while disconnecting transport.", (Throwable)var4_5);
        }
        this.receivingService.shutdownNow();
        this.disconnecting = false;
    }

    protected void listen() throws IOException {
        this.readerThread.start();
    }

    public BusAddress getAddress() {
        return this.busAddress;
    }

    /*
     * WARNING - void declaration
     */
    protected AbstractConnectionBase(TransportConfig _transportConfig, ReceivingServiceConfig _rsCfg) throws DBusException {
        this.exportedObjects = Collections.synchronizedMap(new HashMap());
        this.importedObjects = new ConcurrentHashMap<DBusInterface, RemoteObject>();
        this.getExportedObjects().put(null, new ExportedObject(new GlobalHandler(this), false));
        this.disconnectCallback = Optional.ofNullable(null);
        this.disconnecting = false;
        this.handledSignals = new ConcurrentHashMap<DBusMatchRule, Queue<DBusSigHandler<? extends DBusSignal>>>();
        this.genericHandledSignals = new ConcurrentHashMap<DBusMatchRule, Queue<DBusSigHandler<DBusSignal>>>();
        this.pendingCalls = Collections.synchronizedMap(new LinkedHashMap());
        this.callbackManager = new PendingCallbackManager();
        this.pendingErrorQueue = new ConcurrentLinkedQueue<Error>();
        TransportBuilder transportBuilder = TransportBuilder.create(_transportConfig);
        this.busAddress = transportBuilder.getAddress();
        Object senderThreadName = "DBus Sender Thread-";
        Object rcvSvcName = "";
        if (this.logger.isDebugEnabled()) {
            senderThreadName = "DBus Sender Thread: " + this.busAddress.isListeningSocket() + ", ";
            rcvSvcName = "RcvSvc: " + this.busAddress.isListeningSocket() + " ";
        }
        this.receivingService = new ReceivingService((String)rcvSvcName, _rsCfg);
        this.senderService = Executors.newFixedThreadPool(1, new NameableThreadFactory((String)senderThreadName, true));
        this.objectTree = new ObjectTree();
        this.fallbackContainer = new FallbackContainer();
        this.readerThread = Objects.requireNonNull(this.createReaderThread(this.busAddress), "Reader thread required");
        try {
            this.transport = transportBuilder.build();
            this.messageFactory = Optional.ofNullable(this.transport).map(AbstractTransport::getMessageFactory).orElseThrow();
        }
        catch (IOException | DBusException _ex) {
            void var6_6;
            this.logger.debug("Error creating transport", _ex);
            if (_ex instanceof IOException) {
                IOException iOException = (IOException)_ex;
                this.internalDisconnect(iOException);
            }
            throw new DBusException("Failed to connect to bus: " + _ex.getMessage(), (Throwable)var6_6);
        }
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[address=" + String.valueOf(this.busAddress) + "]";
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

    /*
     * WARNING - void declaration
     */
    Message readIncoming() throws DBusException {
        void var1_1;
        block6: {
            if (!this.isConnected()) {
                return null;
            }
            Message m = null;
            try {
                m = this.getTransport().readMessage();
            }
            catch (IOException _exIo) {
                void var2_2;
                block8: {
                    block9: {
                        block7: {
                            if (_exIo instanceof EOFException) break block7;
                            if (!(_exIo instanceof ClosedByInterruptException)) break block8;
                        }
                        this.disconnectCallback.ifPresent(cb -> cb.clientDisconnect());
                        if (this.disconnecting) break block9;
                        if (!this.getBusAddress().isListeningSocket()) break block8;
                    }
                    return null;
                }
                if (!this.isConnected()) break block6;
                throw new FatalDBusException((Throwable)var2_2);
            }
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public String getExportedObject(DBusInterface _interface) throws DBusException {
        Optional<Map.Entry> foundInterface = this.getExportedObjects().entrySet().stream().filter(e -> _interface.equals(((ExportedObject)e.getValue()).getObject().get())).findFirst();
        if (foundInterface.isPresent()) {
            return (String)foundInterface.get().getKey();
        }
        RemoteObject rObj = this.getImportedObjects().get(_interface);
        if (rObj != null) {
            String s = rObj.getObjectPath();
            if (s != null) {
                void var4_4;
                return var4_4;
            }
        }
        throw new DBusException("Not an object exported or imported by this connection");
    }

    public MessageFactory getMessageFactory() {
        return this.messageFactory;
    }

    public DBusExecutionException getError() {
        Error poll = this.getPendingErrorQueue().poll();
        if (poll != null) {
            return poll.getException();
        }
        return null;
    }

    public boolean isConnected() {
        return this.transport != null && this.transport.isConnected();
    }

    protected abstract IncomingMessageThread createReaderThread(BusAddress var1);

    public boolean connect() throws IOException {
        if (!this.getTransport().isConnected()) {
            if (this.getTransport().isListening()) {
                return this.getTransport().listen() != null;
            }
            return this.getTransport().connect() != null;
        }
        return false;
    }

    protected ReceivingService getReceivingService() {
        return this.receivingService;
    }
}


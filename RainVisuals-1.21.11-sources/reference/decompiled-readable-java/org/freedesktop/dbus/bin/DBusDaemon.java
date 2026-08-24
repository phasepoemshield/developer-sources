/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.bin;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.LambdaMetafactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.bin.EmbeddedDBusDaemon;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.connections.transports.TransportBuilder;
import org.freedesktop.dbus.connections.transports.TransportConnection;
import org.freedesktop.dbus.errors.AccessDenied;
import org.freedesktop.dbus.errors.MatchRuleInvalid;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.FatalException;
import org.freedesktop.dbus.interfaces.Introspectable;
import org.freedesktop.dbus.interfaces.Peer;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MessageFactory;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;
import org.freedesktop.dbus.utils.AddressBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBusDaemon
extends Thread
implements Closeable {
    private final Map<String, ConnectionStruct> names;
    private final BlockingDeque<Pair<Message, WeakReference<ConnectionStruct>>> inqueue;
    private static final String DBUS_BUSNAME = "org.freedesktop.DBus";
    private final BlockingDeque<Pair<Message, WeakReference<ConnectionStruct>>> outqueue;
    public static final int QUEUE_POLL_WAIT = 500;
    private static final Logger LOGGER = LoggerFactory.getLogger(DBusDaemon.class);
    private final List<ConnectionStruct> sigrecips;
    private final DBusServer dbusServer;
    private static final String DBUS_BUSPATH = "/org/freedesktop/DBus";
    private final AtomicBoolean run;
    private final AbstractTransport transport;
    private final AtomicInteger nextUnique;
    private final Map<ConnectionStruct, DBusDaemonReaderThread> conns = new ConcurrentHashMap<ConnectionStruct, DBusDaemonReaderThread>();
    private final DBusDaemonSenderThread sender;

    private void send(ConnectionStruct _connStruct, Message _msg, boolean _head) {
        block10: {
            block7: {
                if (_connStruct != null) break block7;
                LOGGER.trace("Queuing message {} for all connections", (Object)_msg);
                for (ConnectionStruct d : this.conns.keySet()) {
                    block9: {
                        block8: {
                            if (d.connection == null || d.connection.getChannel() == null) break block8;
                            if (d.connection.getChannel().isConnected()) break block9;
                        }
                        LOGGER.debug("Ignoring broadcast message for disconnected connection {}: {}", (Object)d.connection, (Object)_msg);
                        continue;
                    }
                    if (_head) {
                        this.outqueue.addFirst(new Pair<Message, WeakReference<ConnectionStruct>>(_msg, new WeakReference<ConnectionStruct>(d)));
                        continue;
                    }
                    this.outqueue.addLast(new Pair<Message, WeakReference<ConnectionStruct>>(_msg, new WeakReference<ConnectionStruct>(d)));
                }
                break block10;
            }
            LOGGER.trace("Queuing message {} for {}", (Object)_msg, (Object)_connStruct.unique);
            if (_head) {
                this.outqueue.addFirst(new Pair<Message, WeakReference<ConnectionStruct>>(_msg, new WeakReference<ConnectionStruct>(_connStruct)));
            } else {
                this.outqueue.addLast(new Pair<Message, WeakReference<ConnectionStruct>>(_msg, new WeakReference<ConnectionStruct>(_connStruct)));
            }
        }
    }

    public static void version() {
        System.out.println("D-Bus Java Version: " + System.getProperty("Version"));
        System.exit(1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void close() {
        this.run.set(false);
        if (!this.conns.isEmpty()) {
            HashSet<ConnectionStruct> connections = new HashSet<ConnectionStruct>(this.conns.keySet());
            Iterator iterator2 = connections.iterator();
            while (iterator2.hasNext()) {
                void var3_4;
                ConnectionStruct c = (ConnectionStruct)iterator2.next();
                this.removeConnection((ConnectionStruct)var3_4);
            }
        }
        this.sender.terminate();
        if (this.transport != null) {
            LOGGER.debug("Terminating transport {}", (Object)this.transport);
            try {
                this.transport.close();
            }
            catch (IOException _ex) {
                void var1_2;
                LOGGER.debug("Error closing transport", (Throwable)var1_2);
            }
        }
        this.interrupt();
    }

    public static void syntax() {
        System.out.println("Syntax: DBusDaemon [--version] [-v] [--help] [-h] [--listen address] [-l address] [--print-address] [-r] [--pidfile file] [-p file] [--addressfile file] [--auth-mode AUTH_ANONYMOUS|AUTH_COOKIE|AUTH_EXTERNAL] [-m AUTH_ANONYMOUS|AUTH_COOKIE|AUTH_EXTERNAL][-a file] [--unix] [-u] [--tcp] [-t] ");
        System.exit(1);
    }

    public static void saveFile(String _data, String _file) throws IOException {
        try (PrintWriter w = new PrintWriter(new FileOutputStream(_file));){
            w.println(_data);
        }
    }

    private static void logMessage(String _logStr, Message _m, String _connUniqueId) {
        Object logMsg = _m;
        if (_m != null && Introspectable.class.getName().equals(_m.getInterface()) && !LOGGER.isTraceEnabled()) {
            logMsg = "<Introspection data only visible in loglevel trace>";
        }
        if (LOGGER.isTraceEnabled()) {
            LOGGER.trace(_logStr, logMsg, (Object)_connUniqueId);
        } else {
            LOGGER.debug(_logStr, (Object)_m, (Object)_connUniqueId);
        }
    }

    public synchronized boolean isRunning() {
        return this.run.get();
    }

    public DBusDaemon(AbstractTransport _transport) {
        this.names = Collections.synchronizedMap(new HashMap());
        this.outqueue = new LinkedBlockingDeque<Pair<Message, WeakReference<ConnectionStruct>>>();
        this.inqueue = new LinkedBlockingDeque<Pair<Message, WeakReference<ConnectionStruct>>>();
        this.sigrecips = new ArrayList<ConnectionStruct>();
        this.dbusServer = new DBusServer();
        this.sender = new DBusDaemonSenderThread();
        this.run = new AtomicBoolean(false);
        this.nextUnique = new AtomicInteger(0);
        this.setName(this.getClass().getSimpleName() + "-Thread");
        this.transport = _transport;
        this.names.put(DBUS_BUSNAME, null);
    }

    private static /* synthetic */ boolean lambda$main$1(String selectedMode, TransportBuilder.SaslAuthMode e) {
        return e.name().toLowerCase().matches(selectedMode.toLowerCase());
    }

    private static /* synthetic */ IllegalArgumentException lambda$main$2(String selectedMode) {
        return new IllegalArgumentException("Auth mode '" + selectedMode + "' unsupported");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void removeConnection(ConnectionStruct _c) {
        DBusDaemonReaderThread oldThread = this.conns.remove(_c);
        if (oldThread != null) {
            LOGGER.debug("Terminating reader thread for {}", (Object)_c);
            oldThread.terminate();
            try {
                if (_c.connection != null) {
                    _c.connection.close();
                    LOGGER.debug("Terminated connection {}", (Object)_c.connection);
                }
            }
            catch (IOException _exIo) {
                LOGGER.debug("Error while closing socketchannel", _exIo);
            }
        }
        LOGGER.debug("Removing signal destination {}", (Object)_c);
        Object object = this.sigrecips;
        synchronized (object) {
            if (this.sigrecips.removeIf(e -> e.equals(_c))) {
                LOGGER.debug("Removed one or more signal destinations for {}", (Object)_c);
            }
        }
        LOGGER.debug("Removing name registration for {}", (Object)_c);
        object = this.names;
        synchronized (object) {
            ArrayList<String> toRemove = new ArrayList<String>();
            for (Map.Entry<String, ConnectionStruct> e2 : this.names.entrySet()) {
                if (e2.getValue() != _c) continue;
                toRemove.add(e2.getKey());
            }
            for (String name : toRemove) {
                this.names.remove(name);
                try {
                    this.send(null, new DBus.NameOwnerChanged(DBUS_BUSPATH, name, _c.unique, ""));
                }
                catch (DBusException _ex) {
                    LOGGER.debug("Unable to change owner", _ex);
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void main(String[] _args) throws Exception {
        addr = null;
        pidfile = null;
        addrfile = null;
        authModeStr = null;
        printaddress = false;
        unix = true;
        tcp = false;
        try {
            i = 0;
            while (i < _args.length) {
                block19: {
                    block27: {
                        block26: {
                            block25: {
                                block24: {
                                    block23: {
                                        block22: {
                                            block21: {
                                                block20: {
                                                    block18: {
                                                        if (!"--help".equals(_args[i]) && !"-h".equals(_args[i])) break block18;
                                                        DBusDaemon.syntax();
                                                        break block19;
                                                    }
                                                    if (!"--version".equals(_args[i]) && !"-v".equals(_args[i])) break block20;
                                                    DBusDaemon.version();
                                                    break block19;
                                                }
                                                if (!"--listen".equals(_args[i]) && !"-l".equals(_args[i])) break block21;
                                                addr = _args[++i];
                                                break block19;
                                            }
                                            if (!"--pidfile".equals(_args[i]) && !"-p".equals(_args[i])) break block22;
                                            pidfile = _args[++i];
                                            break block19;
                                        }
                                        if (!"--addressfile".equals(_args[i]) && !"-a".equals(_args[i])) break block23;
                                        addrfile = _args[++i];
                                        break block19;
                                    }
                                    if ("--print-address".equals(_args[i])) break block24;
                                    if (!"-r".equals(_args[i])) break block25;
                                }
                                printaddress = true;
                                break block19;
                            }
                            if ("--unix".equals(_args[i])) break block26;
                            if (!"-u".equals(_args[i])) break block27;
                        }
                        unix = true;
                        tcp = false;
                        break block19;
                    }
                    if ("--tcp".equals(_args[i])) ** GOTO lbl58
                    if ("-t".equals(_args[i])) {
lbl58:
                        // 2 sources

                        tcp = true;
                        unix = false;
                    } else if ("--auth-mode".equals(_args[i]) || "-m".equals(_args[i])) {
                        authModeStr = _args[++i];
                    } else {
                        DBusDaemon.syntax();
                    }
                }
                ++_ex;
            }
        }
        catch (ArrayIndexOutOfBoundsException _ex) {
            DBusDaemon.syntax();
        }
        if (null == addr && unix) {
            addr = TransportBuilder.createDynamicSession("UNIX", true);
        } else if (null == addr && tcp) {
            addr = TransportBuilder.createDynamicSession("TCP", true);
        }
        address = BusAddress.of(addr);
        if (printaddress) {
            System.out.println(addr);
        }
        saslAuthMode = null;
        if (authModeStr != null) {
            selectedMode = authModeStr;
            saslAuthMode = Arrays.stream(TransportBuilder.SaslAuthMode.values()).filter((Predicate<TransportBuilder.SaslAuthMode>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$main$1(java.lang.String org.freedesktop.dbus.connections.transports.TransportBuilder$SaslAuthMode ), (Lorg/freedesktop/dbus/connections/transports/TransportBuilder$SaslAuthMode;)Z)(selectedMode)).findFirst().orElseThrow((Supplier<IllegalArgumentException>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, lambda$main$2(java.lang.String ), ()Ljava/lang/IllegalArgumentException;)(selectedMode));
        }
        if (null != addrfile) {
            DBusDaemon.saveFile(addr, addrfile);
        }
        if (null != pidfile) {
            DBusDaemon.saveFile(System.getProperty("Pid"), pidfile);
        }
        DBusDaemon.LOGGER.info("Binding to {}", (Object)addr);
        daemon = new EmbeddedDBusDaemon(address);
        try {
            daemon.setSaslAuthMode(saslAuthMode);
            daemon.startInForeground();
        }
        catch (Throwable var11_13) {
            try {
                var10_12.close();
            }
            catch (Throwable var12_14) {
                var11_13.addSuppressed(var12_14);
            }
            throw var11_13;
        }
        daemon.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        this.run.set(true);
        this.sender.start();
        block7: while (this.isRunning()) {
            try {
                void var5_7;
                void var3_5;
                MessageFactory messageFactory;
                Message m;
                ConnectionStruct connectionStruct;
                Pair<Message, WeakReference<ConnectionStruct>> pollFirst;
                block17: {
                    block18: {
                        pollFirst = this.inqueue.take();
                        connectionStruct = (ConnectionStruct)((WeakReference)pollFirst.second).get();
                        if (connectionStruct == null) continue;
                        m = (Message)pollFirst.first;
                        DBusDaemon.logMessage("<inqueue> Got message {} from {}", m, connectionStruct.unique);
                        messageFactory = connectionStruct.connection.getMessageFactory();
                        if (null != connectionStruct.unique) break block17;
                        if (!(m instanceof MethodCall)) break block18;
                        if (!DBUS_BUSNAME.equals(m.getDestination())) break block18;
                        if ("Hello".equals(m.getName())) break block17;
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = "You must send a Hello message";
                    this.send(connectionStruct, messageFactory.createError(DBUS_BUSNAME, null, "org.freedesktop.DBus.Error.AccessDenied", m.getSerial(), "s", objectArray));
                    continue;
                }
                try {
                    if (null != connectionStruct.unique) {
                        m.setSource(connectionStruct.unique);
                        LOGGER.trace("Updated source to {}", (Object)connectionStruct.unique);
                    }
                }
                catch (DBusException _ex) {
                    LOGGER.debug("Error setting source", _ex);
                    Object[] objectArray = new Object[1];
                    objectArray[0] = "Sending message failed";
                    this.send(connectionStruct, messageFactory.createError(DBUS_BUSNAME, null, "org.freedesktop.DBus.Error.GeneralError", m.getSerial(), "s", objectArray));
                }
                if (DBUS_BUSNAME.equals(m.getDestination())) {
                    this.dbusServer.handleMessage(connectionStruct, (Message)pollFirst.first);
                    continue;
                }
                if (m instanceof DBusSignal) {
                    List<ConnectionStruct> list = this.sigrecips;
                    // MONITORENTER : list
                    ArrayList<ConnectionStruct> l = new ArrayList<ConnectionStruct>(this.sigrecips);
                    // MONITOREXIT : list2
                    ArrayList<ConnectionStruct> list2 = l;
                    Iterator iterator2 = list2.iterator();
                    while (true) {
                        if (!iterator2.hasNext()) continue block7;
                        ConnectionStruct connectionStruct2 = (ConnectionStruct)iterator2.next();
                        this.send(connectionStruct2, m);
                    }
                }
                ConnectionStruct dest = this.names.get(m.getDestination());
                if (null == dest) {
                    Object[] objectArray = new Object[1];
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = var3_5.getDestination();
                    objectArray[0] = String.format("The name `%s' does not exist", objectArray2);
                    this.send(connectionStruct, messageFactory.createError(DBUS_BUSNAME, null, "org.freedesktop.DBus.Error.ServiceUnknown", m.getSerial(), "s", objectArray));
                    continue;
                }
                this.send((ConnectionStruct)var5_7, (Message)var3_5);
            }
            catch (DBusException dBusException) {
                LOGGER.debug("Error processing connection", dBusException);
            }
            catch (InterruptedException interruptedException) {
                LOGGER.debug("Interrupted");
                this.close();
                this.interrupt();
            }
        }
    }

    void addSock(TransportConnection _s) {
        LOGGER.debug("New Client");
        ConnectionStruct c = new ConnectionStruct(_s);
        DBusDaemonReaderThread r = new DBusDaemonReaderThread(c);
        this.conns.put(c, r);
        r.start();
    }

    private void send(ConnectionStruct _connStruct, Message _msg) {
        this.send(_connStruct, _msg, false);
    }

    public class DBusDaemonSenderThread
    extends Thread {
        private final Logger logger = LoggerFactory.getLogger(this.getClass());
        private final AtomicBoolean running = new AtomicBoolean(false);

        /*
         * WARNING - void declaration
         */
        @Override
        public void run() {
            this.logger.debug(">>>> Sender thread started <<<<");
            this.running.set(true);
            while (DBusDaemon.this.isRunning() && this.running.get()) {
                this.logger.trace("Acquiring lock on outqueue and blocking for data");
                try {
                    Pair<Message, WeakReference<ConnectionStruct>> pollFirst = DBusDaemon.this.outqueue.take();
                    if (pollFirst == null) continue;
                    ConnectionStruct connectionStruct = (ConnectionStruct)((WeakReference)pollFirst.second).get();
                    if (connectionStruct != null) {
                        if (connectionStruct.connection.getChannel().isConnected()) {
                            this.logger.debug("<outqueue> Got message {} for {}", pollFirst.first, (Object)connectionStruct.unique);
                            try {
                                connectionStruct.connection.getWriter().writeMessage((Message)pollFirst.first);
                            }
                            catch (IOException _ex) {
                                this.logger.debug("Disconnecting client due to previous exception", _ex);
                                DBusDaemon.this.removeConnection(connectionStruct);
                            }
                            continue;
                        }
                        this.logger.warn("Connection to {} broken", (Object)connectionStruct.connection);
                        DBusDaemon.this.removeConnection(connectionStruct);
                        continue;
                    }
                    this.logger.info("Discarding {} connection reaped", pollFirst.first);
                }
                catch (InterruptedException _ex) {
                    void var1_2;
                    this.logger.debug("Got interrupted", (Throwable)var1_2);
                    Thread.currentThread().interrupt();
                }
            }
            this.logger.debug(">>>> Sender Thread terminated <<<<");
        }

        public DBusDaemonSenderThread() {
            this.setName(this.getClass().getSimpleName().replace('$', '-'));
        }

        public synchronized void terminate() {
            this.running.set(false);
            this.interrupt();
        }
    }

    public static class ConnectionStruct {
        private String unique;
        private final TransportConnection connection;

        ConnectionStruct(TransportConnection _c) {
            this.connection = _c;
        }

        public String toString() {
            return null == this.unique ? ":?-?" : this.unique;
        }
    }

    static class Pair<A, B> {
        private final A first;
        private final B second;

        public int hashCode() {
            Object[] objectArray = new Object[2];
            objectArray[0] = this.first;
            objectArray[1] = this.second;
            return Objects.hash(objectArray);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object _obj) {
            if (this == _obj) {
                return true;
            }
            if (!(_obj instanceof Pair)) {
                return false;
            }
            Pair other = (Pair)_obj;
            if (!Objects.equals(this.first, other.first)) return false;
            if (!Objects.equals(this.second, other.second)) return false;
            return true;
        }

        Pair(A _first, B _second) {
            this.first = _first;
            this.second = _second;
        }
    }

    public class DBusDaemonReaderThread
    extends Thread {
        private final WeakReference<ConnectionStruct> weakconn;
        private final Logger logger = LoggerFactory.getLogger(this.getClass());
        private ConnectionStruct conn;
        private final AtomicBoolean running = new AtomicBoolean(false);

        @Override
        public void run() {
            this.logger.debug(">>>> Reader Thread started <<<<");
            this.running.set(true);
            while (DBusDaemon.this.isRunning() && this.running.get()) {
                Message m;
                block4: {
                    m = null;
                    try {
                        m = this.conn.connection.getReader().readMessage();
                    }
                    catch (IOException _ex) {
                        LOGGER.debug("Error reading message", _ex);
                        DBusDaemon.this.removeConnection(this.conn);
                    }
                    catch (DBusException _ex) {
                        LOGGER.debug("", _ex);
                        if (!(_ex instanceof FatalException)) break block4;
                        DBusDaemon.this.removeConnection(this.conn);
                    }
                }
                if (null == m) continue;
                DBusDaemon.logMessage("Read {} from {}", m, this.conn.unique);
                DBusDaemon.this.inqueue.add(new Pair<Message, WeakReference<ConnectionStruct>>(m, this.weakconn));
            }
            this.conn = null;
            this.logger.debug(">>>> Reader Thread terminated <<<<");
        }

        public void terminate() {
            this.running.set(false);
        }

        public DBusDaemonReaderThread(ConnectionStruct _conn) {
            this.conn = _conn;
            this.weakconn = new WeakReference<ConnectionStruct>(_conn);
            this.setName(this.getClass().getSimpleName());
        }
    }

    public class DBusServer
    implements Introspectable,
    Peer,
    DBus {
        private final String machineId = AddressBuilder.createMachineId();
        private ConnectionStruct connStruct;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public UInt32 RequestName(String _name, UInt32 _flags) {
            int rv;
            boolean exists = false;
            Map<String, ConnectionStruct> map = DBusDaemon.this.names;
            synchronized (map) {
                exists = DBusDaemon.this.names.containsKey(_name);
                if (!exists) {
                    DBusDaemon.this.names.put(_name, this.connStruct);
                }
            }
            if (exists) {
                rv = 3;
            } else {
                LOGGER.info("Client {} acquired name {}", (Object)this.connStruct.unique, (Object)_name);
                rv = 1;
                try {
                    DBusDaemon.this.send(this.connStruct, this.generateNameAcquiredSignal(this.connStruct.connection, _name));
                    DBusDaemon.this.send(null, this.generatedNameOwnerChangedSignal(this.connStruct.connection, _name, "", this.connStruct.unique));
                }
                catch (DBusException _ex) {
                    LOGGER.debug("", _ex);
                }
            }
            return new UInt32(rv);
        }

        @Override
        public String[] ListActivatableNames() {
            return null;
        }

        @Override
        public void Ping() {
        }

        @Override
        public UInt32 GetConnectionUnixUser(String _connectionName) {
            return new UInt32(0L);
        }

        @Override
        public String[] ListQueuedOwners(String _name) {
            return new String[0];
        }

        @Override
        public String GetMachineId() {
            return this.machineId;
        }

        @Override
        public void UpdateActivationEnvironment(Map<String, String>[] _environment) {
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         */
        @Override
        public UInt32 ReleaseName(String _name) {
            void var3_4;
            boolean exists = false;
            Map<String, ConnectionStruct> map = DBusDaemon.this.names;
            synchronized (map) {
                if (DBusDaemon.this.names.containsKey(_name) && DBusDaemon.this.names.get(_name).equals(this.connStruct)) {
                    exists = DBusDaemon.this.names.remove(_name) != null;
                }
            }
            if (!exists) {
                rv = 2;
            } else {
                LOGGER.info("Client {} acquired name {}", (Object)this.connStruct.unique, (Object)_name);
                rv = 1;
                try {
                    DBusDaemon.this.send(this.connStruct, new DBus.NameLost(DBusDaemon.DBUS_BUSPATH, _name));
                    DBusDaemon.this.send(null, new DBus.NameOwnerChanged(DBusDaemon.DBUS_BUSPATH, _name, this.connStruct.unique, ""));
                }
                catch (DBusException _ex) {
                    void var4_6;
                    LOGGER.debug("", (Throwable)var4_6);
                }
            }
            return new UInt32((long)var3_4);
        }

        @Override
        public boolean isRemote() {
            return false;
        }

        @Override
        public UInt32 StartServiceByName(String _name, UInt32 _flags) {
            return new UInt32(0L);
        }

        @Override
        public Byte[] GetConnectionSELinuxSecurityContext(String _args) {
            return new Byte[0];
        }

        private DBusSignal generateNameAcquiredSignal(TransportConnection _connection, String _name) throws DBusException {
            Object[] objectArray = new Object[1];
            objectArray[0] = _name;
            return _connection.getMessageFactory().createSignal(DBusDaemon.DBUS_BUSNAME, DBusDaemon.DBUS_BUSPATH, DBusDaemon.DBUS_BUSNAME, "NameAcquired", "s", objectArray);
        }

        @Override
        public String getObjectPath() {
            return null;
        }

        @Override
        public String Introspect() {
            return "<!DOCTYPE node PUBLIC \"-//freedesktop//DTD D-BUS Object Introspection 1.0//EN\"\n\"http://www.freedesktop.org/standards/dbus/1.0/introspect.dtd\">\n<node>\n  <interface name=\"org.freedesktop.DBus.Introspectable\">\n    <method name=\"Introspect\">\n      <arg name=\"data\" direction=\"out\" type=\"s\"/>\n    </method>\n  </interface>\n  <interface name=\"org.freedesktop.DBus\">\n    <method name=\"RequestName\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"in\" type=\"u\"/>\n      <arg direction=\"out\" type=\"u\"/>\n    </method>\n    <method name=\"ReleaseName\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"u\"/>\n    </method>\n    <method name=\"StartServiceByName\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"in\" type=\"u\"/>\n      <arg direction=\"out\" type=\"u\"/>\n    </method>\n    <method name=\"Hello\">\n      <arg direction=\"out\" type=\"s\"/>\n    </method>\n    <method name=\"NameHasOwner\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"b\"/>\n    </method>\n    <method name=\"ListNames\">\n      <arg direction=\"out\" type=\"as\"/>\n    </method>\n    <method name=\"ListActivatableNames\">\n      <arg direction=\"out\" type=\"as\"/>\n    </method>\n    <method name=\"AddMatch\">\n      <arg direction=\"in\" type=\"s\"/>\n    </method>\n    <method name=\"RemoveMatch\">\n      <arg direction=\"in\" type=\"s\"/>\n    </method>\n    <method name=\"GetNameOwner\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"s\"/>\n    </method>\n    <method name=\"ListQueuedOwners\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"as\"/>\n    </method>\n    <method name=\"GetConnectionUnixUser\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"u\"/>\n    </method>\n    <method name=\"GetConnectionUnixProcessID\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"u\"/>\n    </method>\n    <method name=\"GetConnectionSELinuxSecurityContext\">\n      <arg direction=\"in\" type=\"s\"/>\n      <arg direction=\"out\" type=\"ay\"/>\n    </method>\n    <method name=\"ReloadConfig\">\n    </method>\n    <signal name=\"NameOwnerChanged\">\n      <arg type=\"s\"/>\n      <arg type=\"s\"/>\n      <arg type=\"s\"/>\n    </signal>\n    <signal name=\"NameLost\">\n      <arg type=\"s\"/>\n    </signal>\n    <signal name=\"NameAcquired\">\n      <arg type=\"s\"/>\n    </signal>\n  </interface>\n</node>";
        }

        @Override
        public Map<String, Variant<?>> GetConnectionCredentials(String _busName) {
            return null;
        }

        @Override
        public UInt32 GetConnectionUnixProcessID(String _connectionName) {
            return new UInt32(0L);
        }

        @Override
        public String[] ListNames() {
            Set<String> nss = DBusDaemon.this.names.keySet();
            String[] stringArray = nss.toArray(new String[0]);
            return stringArray;
        }

        /*
         * WARNING - void declaration
         */
        private void handleMessage(ConnectionStruct _connStruct, Message _msg) throws DBusException {
            block9: {
                LOGGER.trace("Handling message {}  from {}", (Object)_msg, (Object)_connStruct.unique);
                if (!(_msg instanceof MethodCall)) {
                    return;
                }
                Object[] args2 = _msg.getParameters();
                Class[] cs = new Class[args2.length];
                for (int i = 0; i < cs.length; ++i) {
                    cs[i] = args2[i].getClass();
                }
                Method meth = null;
                Object rv = null;
                MessageFactory messageFactory = _connStruct.connection.getMessageFactory();
                try {
                    meth = DBusServer.class.getMethod(_msg.getName(), cs);
                    try {
                        this.connStruct = _connStruct;
                        rv = meth.invoke((Object)DBusDaemon.this.dbusServer, args2);
                        if (null == rv) {
                            DBusDaemon.this.send(_connStruct, messageFactory.createMethodReturn(DBusDaemon.DBUS_BUSNAME, (MethodCall)_msg, null, new Object[0]), true);
                            break block9;
                        }
                        String sig = Marshalling.getDBusType(meth.getGenericReturnType())[0];
                        Object[] objectArray = new Object[1];
                        objectArray[0] = rv;
                        DBusDaemon.this.send(_connStruct, messageFactory.createMethodReturn(DBusDaemon.DBUS_BUSNAME, (MethodCall)_msg, sig, objectArray), true);
                    }
                    catch (InvocationTargetException _exIte) {
                        void _exDnEe;
                        LOGGER.debug("", _exIte);
                        DBusDaemon.this.send(_connStruct, messageFactory.createError(DBusDaemon.DBUS_BUSNAME, _msg, _exDnEe.getCause()));
                    }
                    catch (DBusExecutionException _exDnEe) {
                        void _ex;
                        LOGGER.debug("", _exDnEe);
                        DBusDaemon.this.send(_connStruct, messageFactory.createError(DBusDaemon.DBUS_BUSNAME, _msg, (Throwable)_ex));
                    }
                    catch (Exception _ex) {
                        LOGGER.debug("", _ex);
                        Object[] objectArray = new Object[1];
                        objectArray[0] = "An error occurred while calling " + _msg.getName();
                        DBusDaemon.this.send(_connStruct, messageFactory.createError(DBusDaemon.DBUS_BUSNAME, _connStruct.unique, "org.freedesktop.DBus.Error.GeneralError", _msg.getSerial(), "s", objectArray));
                    }
                }
                catch (NoSuchMethodException _exNsm) {
                    void var2_2;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = "This service does not support " + var2_2.getName();
                    DBusDaemon.this.send(_connStruct, messageFactory.createError(DBusDaemon.DBUS_BUSNAME, _connStruct.unique, "org.freedesktop.DBus.Error.UnknownMethod", _msg.getSerial(), "s", objectArray));
                }
            }
        }

        @Override
        public void RemoveMatch(String _matchrule) throws MatchRuleInvalid {
            LOGGER.trace("Removing match rule: {}", (Object)_matchrule);
        }

        @Override
        public String GetNameOwner(String _name) {
            String string;
            ConnectionStruct owner = DBusDaemon.this.names.get(_name);
            if (null == owner) {
                String o = "";
            } else {
                string = owner.unique;
            }
            return string;
        }

        private DBusSignal generatedNameOwnerChangedSignal(TransportConnection _connection, String _name, String _oldOwner, String _newOwner) throws DBusException {
            Object[] objectArray = new Object[3];
            objectArray[0] = _name;
            objectArray[1] = _oldOwner;
            objectArray[2] = _newOwner;
            return _connection.getMessageFactory().createSignal(DBusDaemon.DBUS_BUSNAME, DBusDaemon.DBUS_BUSPATH, DBusDaemon.DBUS_BUSNAME, "NameOwnerChanged", "sss", objectArray);
        }

        @Override
        public boolean NameHasOwner(String _name) {
            return DBusDaemon.this.names.containsKey(_name);
        }

        @Override
        public Byte[] GetAdtAuditSessionData(String _busName) {
            return null;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        @Override
        public void AddMatch(String _matchrule) throws MatchRuleInvalid {
            LOGGER.trace("Adding match rule: {}", (Object)_matchrule);
            List<ConnectionStruct> list = DBusDaemon.this.sigrecips;
            synchronized (list) {
                if (!DBusDaemon.this.sigrecips.contains(this.connStruct)) {
                    DBusDaemon.this.sigrecips.add(this.connStruct);
                }
            }
        }

        @Override
        public String GetId() {
            return null;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         */
        @Override
        public String Hello() {
            ConnectionStruct connectionStruct = this.connStruct;
            synchronized (connectionStruct) {
                if (null != this.connStruct.unique) {
                    throw new AccessDenied("Connection has already sent a Hello message");
                }
                this.connStruct.unique = ":1." + DBusDaemon.this.nextUnique.incrementAndGet();
            }
            DBusDaemon.this.names.put(this.connStruct.unique, this.connStruct);
            LOGGER.info("Client {} registered", (Object)this.connStruct.unique);
            try {
                DBusDaemon.this.send(this.connStruct, this.generateNameAcquiredSignal(this.connStruct.connection, this.connStruct.unique));
                DBusDaemon.this.send(null, this.generatedNameOwnerChangedSignal(this.connStruct.connection, this.connStruct.unique, "", this.connStruct.unique));
            }
            catch (DBusException _ex) {
                void var1_2;
                LOGGER.debug("", (Throwable)var1_2);
            }
            return this.connStruct.unique;
        }
    }
}


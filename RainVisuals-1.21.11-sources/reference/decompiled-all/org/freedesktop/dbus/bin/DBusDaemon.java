package org.freedesktop.dbus.bin;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.freedesktop.dbus.Marshalling;
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

// $VF: Compiled from DBusDaemon.java
public class DBusDaemon extends Thread implements Closeable {
   private final Map<String, DBusDaemon.ConnectionStruct> names;
   private final BlockingDeque<DBusDaemon.Pair<Message, WeakReference<DBusDaemon.ConnectionStruct>>> inqueue;
   private static final String DBUS_BUSNAME = "org.freedesktop.DBus";
   private final BlockingDeque<DBusDaemon.Pair<Message, WeakReference<DBusDaemon.ConnectionStruct>>> outqueue;
   public static final int QUEUE_POLL_WAIT = 500;
   private static final Logger LOGGER = LoggerFactory.getLogger(DBusDaemon.class);
   private final List<DBusDaemon.ConnectionStruct> sigrecips;
   private final DBusDaemon.DBusServer dbusServer;
   private static final String DBUS_BUSPATH = "/org/freedesktop/DBus";
   private final AtomicBoolean run;
   private final AbstractTransport transport;
   private final AtomicInteger nextUnique;
   private final Map<DBusDaemon.ConnectionStruct, DBusDaemon.DBusDaemonReaderThread> conns = new ConcurrentHashMap<>();
   private final DBusDaemon.DBusDaemonSenderThread sender;

   private void send(DBusDaemon.ConnectionStruct _connStruct, Message _msg, boolean _head) {
      if (_connStruct == null) {
         LOGGER.trace("Queuing message {} for all connections", _msg);

         for (DBusDaemon.ConnectionStruct d : this.conns.keySet()) {
            if (d.connection == null || d.connection.getChannel() == null || !d.connection.getChannel().isConnected()) {
               LOGGER.debug("Ignoring broadcast message for disconnected connection {}: {}", d.connection, _msg);
            } else if (_head) {
               this.outqueue.addFirst(new DBusDaemon.Pair<>(_msg, new WeakReference<>(d)));
            } else {
               this.outqueue.addLast(new DBusDaemon.Pair<>(_msg, new WeakReference<>(d)));
            }
         }
      } else {
         LOGGER.trace("Queuing message {} for {}", _msg, _connStruct.unique);
         if (_head) {
            this.outqueue.addFirst(new DBusDaemon.Pair<>(_msg, new WeakReference<>(_connStruct)));
         } else {
            this.outqueue.addLast(new DBusDaemon.Pair<>(_msg, new WeakReference<>(_connStruct)));
         }
      }
   }

   public static void version() {
      System.out.println("D-Bus Java Version: " + System.getProperty("Version"));
      System.exit(1);
   }

   @Override
   public void close() {
      this.run.set(false);
      if (!this.conns.isEmpty()) {
         for (DBusDaemon.ConnectionStruct c : new HashSet<>(this.conns.keySet())) {
            this.removeConnection(c);
         }
      }

      this.sender.terminate();
      if (this.transport != null) {
         LOGGER.debug("Terminating transport {}", this.transport);

         try {
            this.transport.close();
         } catch (IOException var4) {
            LOGGER.debug("Error closing transport", var4);
         }
      }

      this.interrupt();
   }

   public static void syntax() {
      System.out
         .println(
            "Syntax: DBusDaemon [--version] [-v] [--help] [-h] [--listen address] [-l address] [--print-address] [-r] [--pidfile file] [-p file] [--addressfile file] [--auth-mode AUTH_ANONYMOUS|AUTH_COOKIE|AUTH_EXTERNAL] [-m AUTH_ANONYMOUS|AUTH_COOKIE|AUTH_EXTERNAL][-a file] [--unix] [-u] [--tcp] [-t] "
         );
      System.exit(1);
   }

   public static void saveFile(String _data, String _file) throws IOException {
      try (PrintWriter w = new PrintWriter(new FileOutputStream(_file))) {
         w.println(_data);
      }
   }

   private static void logMessage(String _m, Message _logStr, String _connUniqueId) {
      Object logMsg = _m;
      if (_m != null && Introspectable.class.getName().equals(_m.getInterface()) && !LOGGER.isTraceEnabled()) {
         logMsg = "<Introspection data only visible in loglevel trace>";
      }

      if (LOGGER.isTraceEnabled()) {
         LOGGER.trace(_logStr, logMsg, _connUniqueId);
      } else {
         LOGGER.debug(_logStr, _m, _connUniqueId);
      }
   }

   public synchronized boolean isRunning() {
      return this.run.get();
   }

   public DBusDaemon(AbstractTransport _transport) {
      this.names = Collections.synchronizedMap(new HashMap<>());
      this.outqueue = new LinkedBlockingDeque<>();
      this.inqueue = new LinkedBlockingDeque<>();
      this.sigrecips = new ArrayList<>();
      this.dbusServer = new DBusDaemon.DBusServer();
      this.sender = new DBusDaemon.DBusDaemonSenderThread();
      this.run = new AtomicBoolean(false);
      this.nextUnique = new AtomicInteger(0);
      this.setName(this.getClass().getSimpleName() + "-Thread");
      this.transport = _transport;
      this.names.put("org.freedesktop.DBus", null);
   }

   private void removeConnection(DBusDaemon.ConnectionStruct _c) {
      DBusDaemon.DBusDaemonReaderThread oldThread = this.conns.remove(_c);
      if (oldThread != null) {
         LOGGER.debug("Terminating reader thread for {}", _c);
         oldThread.terminate();

         try {
            if (_c.connection != null) {
               _c.connection.close();
               LOGGER.debug("Terminated connection {}", _c.connection);
            }
         } catch (IOException var10) {
            LOGGER.debug("Error while closing socketchannel", var10);
         }
      }

      LOGGER.debug("Removing signal destination {}", _c);
      synchronized (this.sigrecips) {
         if (this.sigrecips.removeIf(e -> e.equals(_c))) {
            LOGGER.debug("Removed one or more signal destinations for {}", _c);
         }
      }

      LOGGER.debug("Removing name registration for {}", _c);
      synchronized (this.names) {
         List<String> toRemove = new ArrayList();

         for (Entry<String, DBusDaemon.ConnectionStruct> name : this.names.entrySet()) {
            if (name.getValue() == _c) {
               toRemove.add((String)name.getKey());
            }
         }

         for (String var15 : toRemove) {
            this.names.remove(var15);

            try {
               this.send(null, new DBus.NameOwnerChanged("/org/freedesktop/DBus", var15, _c.unique, ""));
            } catch (DBusException var9) {
               LOGGER.debug("Unable to change owner", var9);
            }
         }
      }
   }

   public static void main(String[] _args) throws Exception {
      String addr = null;
      String pidfile = null;
      String addrfile = null;
      String authModeStr = null;
      boolean printaddress = false;
      boolean unix = true;
      boolean tcp = false;

      try {
         for (int address = 0; address < _args.length; address++) {
            if ("--help".equals(_args[address]) || "-h".equals(_args[address])) {
               syntax();
            } else if ("--version".equals(_args[address]) || "-v".equals(_args[address])) {
               version();
            } else if ("--listen".equals(_args[address]) || "-l".equals(_args[address])) {
               addr = _args[++address];
            } else if ("--pidfile".equals(_args[address]) || "-p".equals(_args[address])) {
               pidfile = _args[++address];
            } else if ("--addressfile".equals(_args[address]) || "-a".equals(_args[address])) {
               addrfile = _args[++address];
            } else if ("--print-address".equals(_args[address]) || "-r".equals(_args[address])) {
               printaddress = true;
            } else if ("--unix".equals(_args[address]) || "-u".equals(_args[address])) {
               unix = true;
               tcp = false;
            } else if ("--tcp".equals(_args[address]) || "-t".equals(_args[address])) {
               tcp = true;
               unix = false;
            } else if (!"--auth-mode".equals(_args[address]) && !"-m".equals(_args[address])) {
               syntax();
            } else {
               authModeStr = _args[++address];
            }
         }
      } catch (ArrayIndexOutOfBoundsException var15) {
         syntax();
      }

      if (null == addr && unix) {
         addr = TransportBuilder.createDynamicSession("UNIX", true);
      } else if (null == addr && tcp) {
         addr = TransportBuilder.createDynamicSession("TCP", true);
      }

      BusAddress var16 = BusAddress.of(addr);
      if (printaddress) {
         System.out.println(addr);
      }

      TransportBuilder.SaslAuthMode saslAuthMode = null;
      if (authModeStr != null) {
         String daemon = authModeStr;
         saslAuthMode = Arrays.stream(TransportBuilder.SaslAuthMode.values())
            .filter(e -> e.name().toLowerCase().matches(daemon.toLowerCase()))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Auth mode '" + daemon + "' unsupported"));
      }

      if (null != addrfile) {
         saveFile(addr, addrfile);
      }

      if (null != pidfile) {
         saveFile(System.getProperty("Pid"), pidfile);
      }

      LOGGER.info("Binding to {}", addr);

      try (EmbeddedDBusDaemon var17 = new EmbeddedDBusDaemon(var16)) {
         var17.setSaslAuthMode(saslAuthMode);
         var17.startInForeground();
      }
   }

   @Override
   public void run() {
      this.run.set(true);
      this.sender.start();

      while (this.isRunning()) {
         try {
            DBusDaemon.Pair<Message, WeakReference<DBusDaemon.ConnectionStruct>> _ex = this.inqueue.take();
            DBusDaemon.ConnectionStruct connectionStruct = (DBusDaemon.ConnectionStruct)((WeakReference)_ex.second).get();
            if (connectionStruct != null) {
               Message m = (Message)_ex.first;
               logMessage("<inqueue> Got message {} from {}", m, connectionStruct.unique);
               MessageFactory messageFactory = connectionStruct.connection.getMessageFactory();
               if (null != connectionStruct.unique
                  || m instanceof MethodCall && "org.freedesktop.DBus".equals(m.getDestination()) && "Hello".equals(m.getName())) {
                  try {
                     if (null != connectionStruct.unique) {
                        m.setSource(connectionStruct.unique);
                        LOGGER.trace("Updated source to {}", connectionStruct.unique);
                     }
                  } catch (DBusException var10) {
                     LOGGER.debug("Error setting source", var10);
                     this.send(
                        connectionStruct,
                        messageFactory.createError(
                           "org.freedesktop.DBus", null, "org.freedesktop.DBus.Error.GeneralError", m.getSerial(), "s", "Sending message failed"
                        )
                     );
                  }

                  if ("org.freedesktop.DBus".equals(m.getDestination())) {
                     this.dbusServer.handleMessage(connectionStruct, (Message)_ex.first);
                  } else if (m instanceof DBusSignal) {
                     ArrayList var13;
                     synchronized (this.sigrecips) {
                        var13 = new ArrayList<>(this.sigrecips);
                     }

                     for (DBusDaemon.ConnectionStruct d : var13) {
                        this.send(d, m);
                     }
                  } else {
                     DBusDaemon.ConnectionStruct dest = this.names.get(m.getDestination());
                     if (null == dest) {
                        this.send(
                           connectionStruct,
                           messageFactory.createError(
                              "org.freedesktop.DBus",
                              null,
                              "org.freedesktop.DBus.Error.ServiceUnknown",
                              m.getSerial(),
                              "s",
                              String.format("The name `%s' does not exist", m.getDestination())
                           )
                        );
                     } else {
                        this.send(dest, m);
                     }
                  }
               } else {
                  this.send(
                     connectionStruct,
                     messageFactory.createError(
                        "org.freedesktop.DBus", null, "org.freedesktop.DBus.Error.AccessDenied", m.getSerial(), "s", "You must send a Hello message"
                     )
                  );
               }
            }
         } catch (DBusException var11) {
            LOGGER.debug("Error processing connection", var11);
         } catch (InterruptedException var12) {
            LOGGER.debug("Interrupted");
            this.close();
            this.interrupt();
         }
      }
   }

   void addSock(TransportConnection _s) {
      LOGGER.debug("New Client");
      DBusDaemon.ConnectionStruct c = new DBusDaemon.ConnectionStruct(_s);
      DBusDaemon.DBusDaemonReaderThread r = new DBusDaemon.DBusDaemonReaderThread(c);
      this.conns.put(c, r);
      r.start();
   }

   private void send(DBusDaemon.ConnectionStruct _msg, Message _connStruct) {
      this.send(_connStruct, _msg, false);
   }

   // $VF: Compiled from DBusDaemon.java
   public static class ConnectionStruct {
      private String unique;
      private final TransportConnection connection;

      ConnectionStruct(TransportConnection _c) {
         this.connection = _c;
      }

      @Override
      public String toString() {
         return null == this.unique ? ":?-?" : this.unique;
      }
   }

   // $VF: Compiled from DBusDaemon.java
   public class DBusDaemonReaderThread extends Thread {
      private final WeakReference<DBusDaemon.ConnectionStruct> weakconn;
      private final Logger logger = LoggerFactory.getLogger(this.getClass());
      private DBusDaemon.ConnectionStruct conn;
      private final AtomicBoolean running = new AtomicBoolean(false);

      @Override
      public void run() {
         this.logger.debug(">>>> Reader Thread started <<<<");
         this.running.set(true);

         while (DBusDaemon.this.isRunning() && this.running.get()) {
            Message m = null;

            try {
               m = this.conn.connection.getReader().readMessage();
            } catch (IOException var3) {
               DBusDaemon.LOGGER.debug("Error reading message", var3);
               DBusDaemon.this.removeConnection(this.conn);
            } catch (DBusException var4) {
               DBusDaemon.LOGGER.debug("", var4);
               if (var4 instanceof FatalException) {
                  DBusDaemon.this.removeConnection(this.conn);
               }
            }

            if (null != m) {
               DBusDaemon.logMessage("Read {} from {}", m, this.conn.unique);
               DBusDaemon.this.inqueue.add(new DBusDaemon.Pair<>(m, this.weakconn));
            }
         }

         this.conn = null;
         this.logger.debug(">>>> Reader Thread terminated <<<<");
      }

      public void terminate() {
         this.running.set(false);
      }

      public DBusDaemonReaderThread(DBusDaemon.ConnectionStruct _conn) {
         this.conn = _conn;
         this.weakconn = new WeakReference<>(_conn);
         this.setName(this.getClass().getSimpleName());
      }
   }

   // $VF: Compiled from DBusDaemon.java
   public class DBusDaemonSenderThread extends Thread {
      private final Logger logger = LoggerFactory.getLogger(this.getClass());
      private final AtomicBoolean running = new AtomicBoolean(false);

      @Override
      public void run() {
         this.logger.debug(">>>> Sender thread started <<<<");
         this.running.set(true);

         while (DBusDaemon.this.isRunning() && this.running.get()) {
            this.logger.trace("Acquiring lock on outqueue and blocking for data");

            try {
               DBusDaemon.Pair<Message, WeakReference<DBusDaemon.ConnectionStruct>> _ex = DBusDaemon.this.outqueue.take();
               if (_ex != null) {
                  DBusDaemon.ConnectionStruct connectionStruct = (DBusDaemon.ConnectionStruct)((WeakReference)_ex.second).get();
                  if (connectionStruct != null) {
                     if (connectionStruct.connection.getChannel().isConnected()) {
                        this.logger.debug("<outqueue> Got message {} for {}", _ex.first, connectionStruct.unique);

                        try {
                           connectionStruct.connection.getWriter().writeMessage((Message)_ex.first);
                        } catch (IOException var4) {
                           this.logger.debug("Disconnecting client due to previous exception", var4);
                           DBusDaemon.this.removeConnection(connectionStruct);
                        }
                     } else {
                        this.logger.warn("Connection to {} broken", connectionStruct.connection);
                        DBusDaemon.this.removeConnection(connectionStruct);
                     }
                  } else {
                     this.logger.info("Discarding {} connection reaped", _ex.first);
                  }
               }
            } catch (InterruptedException var5) {
               this.logger.debug("Got interrupted", var5);
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

   // $VF: Compiled from DBusDaemon.java
   public class DBusServer implements Introspectable, Peer, DBus {
      private final String machineId = AddressBuilder.createMachineId();
      private DBusDaemon.ConnectionStruct connStruct;

      @Override
      public UInt32 RequestName(String _flags, UInt32 _name) {
         boolean exists = false;
         synchronized (DBusDaemon.this.names) {
            if (!(exists = DBusDaemon.this.names.containsKey(_name))) {
               DBusDaemon.this.names.put(_name, this.connStruct);
            }
         }

         byte var9;
         if (exists) {
            var9 = 3;
         } else {
            DBusDaemon.LOGGER.info("Client {} acquired name {}", this.connStruct.unique, _name);
            var9 = 1;

            try {
               DBusDaemon.this.send(this.connStruct, this.generateNameAcquiredSignal(this.connStruct.connection, _name));
               DBusDaemon.this.send(null, this.generatedNameOwnerChangedSignal(this.connStruct.connection, _name, "", this.connStruct.unique));
            } catch (DBusException var6) {
               DBusDaemon.LOGGER.debug("", var6);
            }
         }

         return new UInt32(var9);
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

      @Override
      public UInt32 ReleaseName(String _name) {
         boolean exists = false;
         synchronized (DBusDaemon.this.names) {
            if (DBusDaemon.this.names.containsKey(_name) && DBusDaemon.this.names.get(_name).equals(this.connStruct)) {
               exists = DBusDaemon.this.names.remove(_name) != null;
            }
         }

         byte var7;
         if (!exists) {
            var7 = 2;
         } else {
            DBusDaemon.LOGGER.info("Client {} acquired name {}", this.connStruct.unique, _name);
            var7 = 1;

            try {
               DBusDaemon.this.send(this.connStruct, new DBus.NameLost("/org/freedesktop/DBus", _name));
               DBusDaemon.this.send(null, new DBus.NameOwnerChanged("/org/freedesktop/DBus", _name, this.connStruct.unique, ""));
            } catch (DBusException var5) {
               DBusDaemon.LOGGER.debug("", var5);
            }
         }

         return new UInt32(var7);
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

      private DBusSignal generateNameAcquiredSignal(TransportConnection _name, String _connection) throws DBusException {
         return _connection.getMessageFactory()
            .createSignal("org.freedesktop.DBus", "/org/freedesktop/DBus", "org.freedesktop.DBus", "NameAcquired", "s", _name);
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
         return nss.toArray(new String[0]);
      }

      private void handleMessage(DBusDaemon.ConnectionStruct _connStruct, Message _msg) throws DBusException {
         DBusDaemon.LOGGER.trace("Handling message {}  from {}", _msg, _connStruct.unique);
         if (_msg instanceof MethodCall) {
            Object[] args = _msg.getParameters();
            Class<? extends Object>[] cs = new Class[args.length];

            for (Method meth = 0; meth < cs.length; meth++) {
               cs[meth] = args[meth].getClass();
            }

            Method var13 = null;
            Object rv = null;
            MessageFactory messageFactory = _connStruct.connection.getMessageFactory();

            try {
               var13 = DBusDaemon.DBusServer.class.getMethod(_msg.getName(), cs);

               try {
                  this.connStruct = _connStruct;
                  rv = var13.invoke(DBusDaemon.this.dbusServer, args);
                  if (null == rv) {
                     DBusDaemon.this.send(_connStruct, messageFactory.createMethodReturn("org.freedesktop.DBus", (MethodCall)_msg, null), true);
                  } else {
                     String _exNsm = Marshalling.getDBusType(var13.getGenericReturnType())[0];
                     DBusDaemon.this.send(_connStruct, messageFactory.createMethodReturn("org.freedesktop.DBus", (MethodCall)_msg, _exNsm, rv), true);
                  }
               } catch (InvocationTargetException var9) {
                  DBusDaemon.LOGGER.debug("", var9);
                  DBusDaemon.this.send(_connStruct, messageFactory.createError("org.freedesktop.DBus", _msg, var9.getCause()));
               } catch (DBusExecutionException var10) {
                  DBusDaemon.LOGGER.debug("", var10);
                  DBusDaemon.this.send(_connStruct, messageFactory.createError("org.freedesktop.DBus", _msg, var10));
               } catch (Exception var11) {
                  DBusDaemon.LOGGER.debug("", var11);
                  DBusDaemon.this.send(
                     _connStruct,
                     messageFactory.createError(
                        "org.freedesktop.DBus",
                        _connStruct.unique,
                        "org.freedesktop.DBus.Error.GeneralError",
                        _msg.getSerial(),
                        "s",
                        "An error occurred while calling " + _msg.getName()
                     )
                  );
               }
            } catch (NoSuchMethodException var12) {
               DBusDaemon.this.send(
                  _connStruct,
                  messageFactory.createError(
                     "org.freedesktop.DBus",
                     _connStruct.unique,
                     "org.freedesktop.DBus.Error.UnknownMethod",
                     _msg.getSerial(),
                     "s",
                     "This service does not support " + _msg.getName()
                  )
               );
            }
         }
      }

      @Override
      public void RemoveMatch(String _matchrule) throws MatchRuleInvalid {
         DBusDaemon.LOGGER.trace("Removing match rule: {}", _matchrule);
      }

      @Override
      public String GetNameOwner(String _name) {
         DBusDaemon.ConnectionStruct owner = DBusDaemon.this.names.get(_name);
         String o;
         if (null == owner) {
            o = "";
         } else {
            o = owner.unique;
         }

         return o;
      }

      private DBusSignal generatedNameOwnerChangedSignal(TransportConnection _newOwner, String _connection, String _name, String _oldOwner) throws DBusException {
         return _connection.getMessageFactory()
            .createSignal("org.freedesktop.DBus", "/org/freedesktop/DBus", "org.freedesktop.DBus", "NameOwnerChanged", "sss", _name, _oldOwner, _newOwner);
      }

      @Override
      public boolean NameHasOwner(String _name) {
         return DBusDaemon.this.names.containsKey(_name);
      }

      @Override
      public Byte[] GetAdtAuditSessionData(String _busName) {
         return null;
      }

      @Override
      public void AddMatch(String _matchrule) throws MatchRuleInvalid {
         DBusDaemon.LOGGER.trace("Adding match rule: {}", _matchrule);
         synchronized (DBusDaemon.this.sigrecips) {
            if (!DBusDaemon.this.sigrecips.contains(this.connStruct)) {
               DBusDaemon.this.sigrecips.add(this.connStruct);
            }
         }
      }

      @Override
      public String GetId() {
         return null;
      }

      @Override
      public String Hello() {
         synchronized (this.connStruct) {
            if (null != this.connStruct.unique) {
               throw new AccessDenied("Connection has already sent a Hello message");
            }

            this.connStruct.unique = ":1." + DBusDaemon.this.nextUnique.incrementAndGet();
         }

         DBusDaemon.this.names.put(this.connStruct.unique, this.connStruct);
         DBusDaemon.LOGGER.info("Client {} registered", this.connStruct.unique);

         try {
            DBusDaemon.this.send(this.connStruct, this.generateNameAcquiredSignal(this.connStruct.connection, this.connStruct.unique));
            DBusDaemon.this.send(null, this.generatedNameOwnerChangedSignal(this.connStruct.connection, this.connStruct.unique, "", this.connStruct.unique));
         } catch (DBusException var3) {
            DBusDaemon.LOGGER.debug("", var3);
         }

         return this.connStruct.unique;
      }
   }

   // $VF: Compiled from DBusDaemon.java
   static class Pair<A, B> {
      private final A first;
      private final B second;

      @Override
      public int hashCode() {
         return Objects.hash(this.first, this.second);
      }

      @Override
      public boolean equals(Object _obj) {
         if (this == _obj) {
            return true;
         } else {
            return !(_obj instanceof DBusDaemon.Pair<?, ?> other)
               ? false
               : Objects.equals(this.first, other.first) && Objects.equals(this.second, other.second);
         }
      }

      Pair(A _second, B _first) {
         this.first = _first;
         this.second = _second;
      }
   }
}

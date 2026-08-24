package org.freedesktop.dbus.messages;

import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import org.freedesktop.dbus.DBusMatchRule;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.ObjectPath;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.connections.base.AbstractConnectionBase;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.MessageFormatException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.utils.CommonRegexPattern;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.DBusObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from DBusSignal.java
public class DBusSignal extends Message {
   private boolean bodydone = false;
   private static final Map<String, String> SIGNAL_NAMES = new ConcurrentHashMap<>();
   private static final Map<String, Class<? extends DBusSignal>> CLASS_CACHE = new ConcurrentHashMap<>();
   private byte[] blen;
   private static final Map<Class<? extends DBusSignal>, Type[]> TYPE_CACHE = new ConcurrentHashMap<>();
   private static final Map<Class<? extends DBusSignal>, List<DBusSignal.CachedConstructor>> CACHED_CONSTRUCTORS = new ConcurrentHashMap<>();
   private static final Map<String, String> INT_NAMES = new ConcurrentHashMap<>();
   private Class<? extends DBusSignal> clazz;
   private static final Logger LOGGER = LoggerFactory.getLogger(DBusSignal.class);

   static void addSignalMap(String _dbus, String _java) {
      SIGNAL_NAMES.put(_dbus, _java);
   }

   public DBusSignal createReal(AbstractConnectionBase _conn) throws DBusException {
      String intname = INT_NAMES.get(this.getInterface());
      String signame = SIGNAL_NAMES.get(this.getName());
      if (null == intname) {
         intname = this.getInterface();
      }

      if (null == signame) {
         signame = this.getName();
      }

      if (null == this.clazz) {
         this.clazz = createSignalClass(intname, signame);
      }

      this.logger.debug("Converting signal to type: {}", this.clazz);
      if (!CACHED_CONSTRUCTORS.containsKey(this.clazz)) {
         this.cacheConstructors(this.clazz);
      }

      List<DBusSignal.CachedConstructor> list = CACHED_CONSTRUCTORS.get(this.clazz);
      Constructor<? extends DBusSignal> con = null;
      Type[] types = null;
      Object[] parameters = this.getParameters();
      List<Class<?>> wantedArgs = Arrays.stream(parameters).map(Object::getClass).collect(Collectors.toList());

      for (DBusSignal.CachedConstructor args : list) {
         if (args.matchesParameters(wantedArgs)) {
            con = args.constructor;
            types = args.types;
            break;
         }
      }

      if (con == null) {
         this.logger.warn("Could not find suitable constructor for class {} with argument-types: {}", this.clazz.getName(), wantedArgs);
         return null;
      }

      try {
         Object[] var14 = Marshalling.deSerializeParameters(parameters, types, _conn);
         DBusSignal var13;
         if (null == var14) {
            var13 = (DBusSignal)con.newInstance(this.getPath());
         } else {
            Object[] params = new Object[var14.length + 1];
            params[0] = this.getPath();
            System.arraycopy(var14, 0, params, 1, var14.length);
            var13 = (DBusSignal)con.newInstance(params);
         }

         var13.updateEndianess(_conn.getMessageFactory().getEndianess());
         var13.setHeader(this.getHeader());
         var13.setWireData(this.getWireData());
         var13.setByteCounter(this.getWireData().length);
         return var13;
      } catch (Exception var12) {
         throw new DBusException(var12);
      }
   }

   private static Class<? extends DBusSignal> createSignalClass(String _sigName, String _intName) throws DBusException {
      String name = _intName + "$" + _sigName;
      Class<? extends DBusSignal> c = CLASS_CACHE.get(name);
      if (null == c) {
         c = DBusMatchRule.getCachedSignalType(name);
      }

      if (null != c) {
         return c;
      }

      do {
         try {
            c = Class.forName(name);
         } catch (ClassNotFoundException var5) {
            LOGGER.trace("Class not found for {}", name, var5);
         }

         name = CommonRegexPattern.EXCEPTION_EXTRACT_PATTERN.matcher(name).replaceAll("\\$$1");
      } while (null == c && CommonRegexPattern.EXCEPTION_PARTIAL_PATTERN.matcher(name).matches());

      if (null == c) {
         throw new DBusException("Could not create class from signal " + _intName + "." + _sigName);
      }

      CLASS_CACHE.put(name, c);
      return c;
   }

   protected DBusSignal(byte _objectPath, String _args, Object... _endianess) throws DBusException {
      super(_endianess, (byte)4, (byte)0);
      DBusObjects.requireObjectPath(_objectPath);
      Class<? extends DBusSignal> tc = this.getClass();
      String member = DBusNamingUtil.getSignalName(tc);
      Class<? extends Object> enc = tc.getEnclosingClass();
      if (null != enc && DBusInterface.class.isAssignableFrom(enc) && !enc.getName().equals(enc.getSimpleName())) {
         String iface = DBusNamingUtil.getInterfaceName(enc);
         List<Object> hargs = new ArrayList();
         hargs.add(this.createHeaderArgs((byte)1, "o", _objectPath));
         hargs.add(this.createHeaderArgs((byte)2, "s", iface));
         hargs.add(this.createHeaderArgs((byte)3, "s", member));
         String sig = null;
         if (0 < _args.length) {
            try {
               Type[] _ex = TYPE_CACHE.get(tc);
               if (null == _ex) {
                  Constructor<? extends DBusSignal> con = tc.getDeclaredConstructors()[0];
                  Type[] ts = con.getGenericParameterTypes();
                  _ex = new Type[ts.length - 1];

                  for (int i = 1; i <= _ex.length; i++) {
                     if (ts[i] instanceof TypeVariable) {
                        _ex[i - 1] = ((TypeVariable)ts[i]).getBounds()[0];
                     } else {
                        _ex[i - 1] = ts[i];
                     }
                  }

                  TYPE_CACHE.put(tc, _ex);
               }

               sig = Marshalling.getDBusType(_ex);
               hargs.add(this.createHeaderArgs((byte)8, "g", sig));
               this.setArgs(_args);
            } catch (Exception var14) {
               this.logger.debug("Error adding signal parameters", var14);
               throw new DBusException("Failed to add signal parameters: " + var14.getMessage());
            }
         }

         this.blen = new byte[4];
         this.appendBytes(this.blen);
         this.append("ua(yv)", this.getSerial(), hargs.toArray());
         this.pad((byte)8);
      } else {
         throw new DBusException("Signals must be declared as a member of a class implementing DBusInterface which is the member of a package.");
      }
   }

   private void cacheConstructors(Class<? extends DBusSignal> _clazz) {
      List<DBusSignal.CachedConstructor> list = new ArrayList<>();

      for (Constructor<?> constructor : _clazz.getDeclaredConstructors()) {
         Constructor<? extends DBusSignal> x = constructor;
         list.add(new DBusSignal.CachedConstructor(x));
      }

      CACHED_CONSTRUCTORS.put(_clazz, list);
   }

   DBusSignal() {
   }

   static void addInterfaceMap(String _dbus, String _java) {
      INT_NAMES.put(_dbus, _java);
   }

   protected DBusSignal(String _args, Object... _objectPath) throws DBusException {
      this((byte)0, _objectPath, _args);
   }

   protected DBusSignal(byte _path, String _iface, String _source, String _member, String _args, String _endianess, Object... _sig) throws DBusException {
      super(_endianess, (byte)4, (byte)0);
      if (null != _path && null != _member && null != _iface) {
         List<Object> hargs = new ArrayList();
         hargs.add(this.createHeaderArgs((byte)1, "o", _path));
         hargs.add(this.createHeaderArgs((byte)2, "s", _iface));
         hargs.add(this.createHeaderArgs((byte)3, "s", _member));
         if (null != _source) {
            hargs.add(this.createHeaderArgs((byte)7, "s", _source));
         }

         if (null != _sig) {
            hargs.add(this.createHeaderArgs((byte)8, "g", _sig));
            this.setArgs(_args);
         }

         this.padAndMarshall(hargs, this.getSerial(), _sig, _args);
         this.bodydone = true;
      } else {
         throw new MessageFormatException("Must specify object path, interface and signal name to Signals.");
      }
   }

   public void appendbody(AbstractConnectionBase _conn) throws DBusException {
      if (!this.bodydone) {
         Type[] types = TYPE_CACHE.get(this.getClass());
         Object[] args = Marshalling.convertParameters(this.getParameters(), types, _conn);
         this.setArgs(args);
         String sig = this.getSig();
         long counter = this.getByteCounter();
         if (null != args && 0 < args.length) {
            this.append(sig, args);
         }

         this.marshallint(this.getByteCounter() - counter, this.blen, 0, 4);
         this.bodydone = true;
      }
   }

   // $VF: Compiled from DBusSignal.java
   private static class CachedConstructor {
      private final List<Class<?>> parameterTypes;
      private final Constructor<? extends DBusSignal> constructor;
      private final Type[] types;

      private static <T> Class<T> wrap(Class<T> _clz) {
         return (Class<T>)MethodType.methodType(_clz).wrap().returnType();
      }

      public boolean matchesParameters(List<Class<?>> _wantedArgs) {
         if (this.parameterTypes != null && _wantedArgs != null) {
            if (this.parameterTypes.size() != _wantedArgs.size()) {
               return false;
            }

            for (int i = 0; i < this.parameterTypes.size(); i++) {
               Class<?> class1 = this.parameterTypes.get(i);
               if ((!Enum.class.isAssignableFrom(class1) || !String.class.equals(_wantedArgs.get(i)))
                  && (!DBusInterface.class.isAssignableFrom(class1) || !ObjectPath.class.equals(_wantedArgs.get(i)))
                  && (!Struct.class.isAssignableFrom(class1) || !Object[].class.equals(_wantedArgs.get(i)))
                  && !class1.isAssignableFrom(_wantedArgs.get(i))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }

      private static Type[] createTypes(Constructor<? extends DBusSignal> _constructor) {
         Type[] ts = _constructor.getGenericParameterTypes();
         Type[] types = new Type[ts.length - 1];

         for (int i = 1; i <= types.length; i++) {
            if (ts[i] instanceof TypeVariable) {
               types[i + -1] = ((TypeVariable)ts[i]).getBounds()[0];
            } else {
               types[i + -1] = ts[i];
            }
         }

         return types;
      }

      CachedConstructor(Constructor<? extends DBusSignal> _constructor) {
         this.constructor = _constructor;
         this.parameterTypes = Arrays.stream(this.constructor.getParameterTypes())
            .skip(1L)
            .map(c -> c.isPrimitive() ? wrap((Class<?>)c) : c)
            .collect(Collectors.toList());
         this.types = createTypes(this.constructor);
      }
   }
}

/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.messages;

import java.lang.invoke.MethodType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.utils.CommonRegexPattern;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.DBusObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBusSignal
extends Message {
    private boolean bodydone;
    private static final Map<String, String> SIGNAL_NAMES;
    private static final Map<String, Class<? extends DBusSignal>> CLASS_CACHE;
    private byte[] blen;
    private static final Map<Class<? extends DBusSignal>, Type[]> TYPE_CACHE;
    private static final Map<Class<? extends DBusSignal>, List<CachedConstructor>> CACHED_CONSTRUCTORS;
    private static final Map<String, String> INT_NAMES;
    private Class<? extends DBusSignal> clazz;
    private static final Logger LOGGER;

    static {
        LOGGER = LoggerFactory.getLogger(DBusSignal.class);
        CLASS_CACHE = new ConcurrentHashMap<String, Class<? extends DBusSignal>>();
        TYPE_CACHE = new ConcurrentHashMap<Class<? extends DBusSignal>, Type[]>();
        SIGNAL_NAMES = new ConcurrentHashMap<String, String>();
        INT_NAMES = new ConcurrentHashMap<String, String>();
        CACHED_CONSTRUCTORS = new ConcurrentHashMap<Class<? extends DBusSignal>, List<CachedConstructor>>();
    }

    static void addSignalMap(String _java, String _dbus) {
        SIGNAL_NAMES.put(_dbus, _java);
    }

    /*
     * WARNING - void declaration
     */
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
            this.clazz = DBusSignal.createSignalClass(intname, signame);
        }
        this.logger.debug("Converting signal to type: {}", (Object)this.clazz);
        if (!CACHED_CONSTRUCTORS.containsKey(this.clazz)) {
            this.cacheConstructors(this.clazz);
        }
        List<CachedConstructor> list = CACHED_CONSTRUCTORS.get(this.clazz);
        Constructor<? extends DBusSignal> con = null;
        Type[] types = null;
        Object[] parameters = this.getParameters();
        List<Class<?>> wantedArgs = Arrays.stream(parameters).map(Object::getClass).collect(Collectors.toList());
        Iterator<CachedConstructor> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            CachedConstructor type = iterator2.next();
            if (!type.matchesParameters(wantedArgs)) continue;
            con = type.constructor;
            types = type.types;
            break;
        }
        if (con == null) {
            this.logger.warn("Could not find suitable constructor for class {} with argument-types: {}", (Object)this.clazz.getName(), (Object)wantedArgs);
            return null;
        }
        try {
            void _ex;
            DBusSignal s;
            Object[] args2 = Marshalling.deSerializeParameters(parameters, types, _conn);
            if (null == args2) {
                Object[] objectArray = new Object[1];
                objectArray[0] = this.getPath();
                s = con.newInstance(objectArray);
            } else {
                void var11_12;
                Object[] params = new Object[args2.length + 1];
                params[0] = this.getPath();
                System.arraycopy(args2, 0, params, 1, args2.length);
                s = con.newInstance((Object[])var11_12);
            }
            s.updateEndianess(_conn.getMessageFactory().getEndianess());
            s.setHeader(this.getHeader());
            s.setWireData(this.getWireData());
            _ex.setByteCounter(this.getWireData().length);
            return iterator2;
        }
        catch (Exception exception) {
            throw new DBusException(exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static Class<? extends DBusSignal> createSignalClass(String _intName, String _sigName) throws DBusException {
        void var3_3;
        void var2_2;
        Object name = _intName + "$" + _sigName;
        Class<DBusSignal> c = CLASS_CACHE.get(name);
        if (null == c) {
            c = DBusMatchRule.getCachedSignalType((String)name);
        }
        if (null != c) {
            return c;
        }
        do {
            try {
                c = Class.forName((String)name);
            }
            catch (ClassNotFoundException _exCnf) {
                void var4_4;
                LOGGER.trace("Class not found for {}", name, (Object)var4_4);
            }
            name = CommonRegexPattern.EXCEPTION_EXTRACT_PATTERN.matcher((CharSequence)name).replaceAll("\\$$1");
            if (null != c) break;
        } while (CommonRegexPattern.EXCEPTION_PARTIAL_PATTERN.matcher((CharSequence)name).matches());
        if (null == c) {
            throw new DBusException("Could not create class from signal " + _intName + "." + _sigName);
        }
        CLASS_CACHE.put((String)var2_2, (Class<? extends DBusSignal>)var3_3);
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    protected DBusSignal(byte _endianess, String _objectPath, Object ... _args) throws DBusException {
        super(_endianess, (byte)4, (byte)0);
        void var8_8;
        this.bodydone = false;
        DBusObjects.requireObjectPath(_objectPath);
        Class<?> tc = this.getClass();
        String member = DBusNamingUtil.getSignalName(tc);
        Class<?> enc = tc.getEnclosingClass();
        if (null == enc || !DBusInterface.class.isAssignableFrom(enc) || enc.getName().equals(enc.getSimpleName())) {
            throw new DBusException("Signals must be declared as a member of a class implementing DBusInterface which is the member of a package.");
        }
        String iface = DBusNamingUtil.getInterfaceName(enc);
        ArrayList<Object[]> hargs = new ArrayList<Object[]>();
        hargs.add(this.createHeaderArgs((byte)1, "o", _objectPath));
        hargs.add(this.createHeaderArgs((byte)2, "s", iface));
        hargs.add(this.createHeaderArgs((byte)3, "s", member));
        String sig = null;
        if (0 < _args.length) {
            try {
                Type[] types = TYPE_CACHE.get(tc);
                if (null == types) {
                    Constructor<?> con = tc.getDeclaredConstructors()[0];
                    Type[] ts = con.getGenericParameterTypes();
                    types = new Type[ts.length - 1];
                    int i = 1;
                    while (i <= types.length) {
                        void var13_14;
                        if (ts[i] instanceof TypeVariable) {
                            types[i - 1] = ((TypeVariable)ts[i]).getBounds()[0];
                        } else {
                            types[var13_14 - true] = ts[var13_14];
                        }
                        ++var13_14;
                    }
                    TYPE_CACHE.put(tc, types);
                }
                sig = Marshalling.getDBusType(types);
                hargs.add(this.createHeaderArgs((byte)8, "g", sig));
                this.setArgs(_args);
            }
            catch (Exception _ex) {
                void var10_11;
                this.logger.debug("Error adding signal parameters", _ex);
                throw new DBusException("Failed to add signal parameters: " + var10_11.getMessage());
            }
        }
        this.blen = new byte[4];
        this.appendBytes(this.blen);
        Object[] objectArray = new Object[2];
        objectArray[0] = this.getSerial();
        objectArray[1] = var8_8.toArray();
        this.append("ua(yv)", objectArray);
        this.pad((byte)8);
    }

    private void cacheConstructors(Class<? extends DBusSignal> _clazz) {
        ArrayList<CachedConstructor> list = new ArrayList<CachedConstructor>();
        Constructor<?>[] constructorArray = _clazz.getDeclaredConstructors();
        int n = constructorArray.length;
        for (int i = 0; i < n; ++i) {
            Constructor<?> constructor;
            Constructor<?> x = constructor = constructorArray[i];
            list.add(new CachedConstructor(x));
        }
        CACHED_CONSTRUCTORS.put(_clazz, list);
    }

    DBusSignal() {
        this.bodydone = false;
    }

    static void addInterfaceMap(String _java, String _dbus) {
        INT_NAMES.put(_dbus, _java);
    }

    protected DBusSignal(String _objectPath, Object ... _args) throws DBusException {
        this(0, _objectPath, _args);
    }

    /*
     * WARNING - void declaration
     */
    protected DBusSignal(byte _endianess, String _source, String _path, String _iface, String _member, String _sig, Object ... _args) throws DBusException {
        void var7_7;
        void var6_6;
        block6: {
            block5: {
                super(_endianess, (byte)4, (byte)0);
                this.bodydone = false;
                if (null == _path) break block5;
                if (null == _member) break block5;
                if (null != _iface) break block6;
            }
            throw new MessageFormatException("Must specify object path, interface and signal name to Signals.");
        }
        ArrayList<Object> hargs = new ArrayList<Object>();
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
        this.padAndMarshall(hargs, this.getSerial(), (String)var6_6, (Object[])var7_7);
        this.bodydone = true;
    }

    public void appendbody(AbstractConnectionBase _conn) throws DBusException {
        if (this.bodydone) {
            return;
        }
        Type[] types = TYPE_CACHE.get(this.getClass());
        Object[] args2 = Marshalling.convertParameters(this.getParameters(), types, _conn);
        this.setArgs(args2);
        String sig = this.getSig();
        long counter = this.getByteCounter();
        if (null != args2) {
            if (0 < args2.length) {
                this.append(sig, args2);
            }
        }
        this.marshallint(this.getByteCounter() - counter, this.blen, 0, 4);
        this.bodydone = true;
    }

    private static class CachedConstructor {
        private final List<Class<?>> parameterTypes;
        private final Constructor<? extends DBusSignal> constructor;
        private final Type[] types;

        private static <T> Class<T> wrap(Class<T> _clz) {
            return MethodType.methodType(_clz).wrap().returnType();
        }

        /*
         * WARNING - void declaration
         */
        public boolean matchesParameters(List<Class<?>> _wantedArgs) {
            block10: {
                block9: {
                    if (this.parameterTypes == null) break block9;
                    if (_wantedArgs != null) break block10;
                }
                return false;
            }
            if (this.parameterTypes.size() != _wantedArgs.size()) {
                return false;
            }
            int i = 0;
            while (i < this.parameterTypes.size()) {
                void var2_2;
                block12: {
                    Class<?> class1;
                    block14: {
                        block13: {
                            block11: {
                                class1 = this.parameterTypes.get(i);
                                if (!Enum.class.isAssignableFrom(class1)) break block11;
                                if (String.class.equals(_wantedArgs.get(i))) break block12;
                            }
                            if (!DBusInterface.class.isAssignableFrom(class1)) break block13;
                            if (ObjectPath.class.equals(_wantedArgs.get(i))) break block12;
                        }
                        if (!Struct.class.isAssignableFrom(class1)) break block14;
                        if (Object[].class.equals(_wantedArgs.get(i))) break block12;
                    }
                    if (!class1.isAssignableFrom(_wantedArgs.get(i))) {
                        return false;
                    }
                }
                ++var2_2;
            }
            return true;
        }

        /*
         * WARNING - void declaration
         */
        private static Type[] createTypes(Constructor<? extends DBusSignal> _constructor) {
            void var2_2;
            Type[] ts = _constructor.getGenericParameterTypes();
            Type[] types = new Type[ts.length - 1];
            int i = 1;
            while (i <= types.length) {
                void var3_3;
                types[i + -1] = ts[i] instanceof TypeVariable ? ((TypeVariable)ts[i]).getBounds()[0] : ts[var3_3];
                ++var3_3;
            }
            return var2_2;
        }

        CachedConstructor(Constructor<? extends DBusSignal> _constructor) {
            this.constructor = _constructor;
            this.parameterTypes = Arrays.stream(this.constructor.getParameterTypes()).skip(1L).map(c -> {
                if (c.isPrimitive()) {
                    return CachedConstructor.wrap(c);
                }
                return c;
            }).collect(Collectors.toList());
            this.types = CachedConstructor.createTypes(this.constructor);
        }
    }
}


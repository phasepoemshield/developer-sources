/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.freedesktop.dbus.ArrayFrob;
import org.freedesktop.dbus.Container;
import org.freedesktop.dbus.DBusMap;
import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.FileDescriptor;
import org.freedesktop.dbus.ObjectPath;
import org.freedesktop.dbus.Struct;
import org.freedesktop.dbus.Tuple;
import org.freedesktop.dbus.annotations.Position;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.connections.base.AbstractConnectionBase;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.DBusSerializable;
import org.freedesktop.dbus.types.DBusListType;
import org.freedesktop.dbus.types.DBusMapType;
import org.freedesktop.dbus.types.DBusStructType;
import org.freedesktop.dbus.types.UInt16;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.UInt64;
import org.freedesktop.dbus.types.Variant;
import org.freedesktop.dbus.utils.LoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Marshalling {
    private static final Logger LOGGER = LoggerFactory.getLogger(Marshalling.class);
    private static final String MTH_NAME_DESERIALIZE = "deserialize";
    private static final Map<Class<?>, Byte> CLASS_TO_ARGUMENTTYPE;
    private static final String ERROR_MULTI_VALUED_ARRAY = "Multi-valued array types not permitted";
    private static final Map<Type, String[]> TYPE_CACHE;

    /*
     * WARNING - void declaration
     */
    public static String getDBusType(Type[] _javaType) throws DBusException {
        void var1_1;
        StringBuilder sb = new StringBuilder();
        Type[] typeArray = _javaType;
        int n = typeArray.length;
        for (int i = 0; i < n; ++i) {
            Type t = typeArray[i];
            String[] stringArray = Marshalling.getDBusType(t);
            int n2 = stringArray.length;
            for (int j = 0; j < n2; ++j) {
                String s = stringArray[j];
                sb.append(s);
            }
        }
        return var1_1.toString();
    }

    private Marshalling() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Object[] convertParameters(Object[] _parameters, Type[] _types, String[] _customSignatures, AbstractConnectionBase _conn) throws DBusException {
        if (_parameters == null) {
            return null;
        }
        parameters = _parameters;
        types = _types;
        lastCustomSig = 0;
        i = 0;
        while (i < parameters.length) {
            block6: {
                block9: {
                    block8: {
                        block7: {
                            if (null == parameters[i]) break block6;
                            v0 = new Object[3];
                            v0[0] = i;
                            v0[1] = parameters[i];
                            v0[2] = types[i];
                            Marshalling.LOGGER.trace("Converting {} from '{}' to {}", v0);
                            var11_11 /* !! */  = parameters[i];
                            if (!(var11_11 /* !! */  instanceof DBusSerializable)) break block7;
                            ds = (DBusSerializable)var11_11 /* !! */ ;
                            var11_11 /* !! */  = parameters[i].getClass().getDeclaredMethods();
                            var12_12 = var11_11 /* !! */ .length;
                            for (var13_14 = 0; var13_14 < var12_12; ++var13_14) {
                                m = var11_11 /* !! */ [var13_14];
                                if (!m.getName().equals("deserialize")) continue;
                                newtypes = m.getParameterTypes();
                                expand = new Type[types.length + newtypes.length - 1];
                                System.arraycopy(types, 0, expand, 0, i);
                                System.arraycopy(newtypes, 0, expand, i, newtypes.length);
                                System.arraycopy(types, i + 1, expand, i + newtypes.length, types.length - i - 1);
                                types = expand;
                                newparams = ds.serialize();
                                exparams = new Object[parameters.length + newparams.length - 1];
                                System.arraycopy(parameters, 0, exparams, 0, i);
                                System.arraycopy(newparams, 0, exparams, i, newparams.length);
                                System.arraycopy(parameters, i + 1, exparams, i + ((void)var17_19).length, parameters.length - i - 1);
                                parameters = var18_20;
                            }
                            --i;
                            break block6;
                        }
                        var11_11 /* !! */  = parameters[i];
                        if (!(var11_11 /* !! */  instanceof Tuple)) break block8;
                        tup = (Tuple)newtypes;
                        newtypes = ((ParameterizedType)types[i]).getActualTypeArguments();
                        expand = new Type[types.length + newtypes.length - 1];
                        System.arraycopy(types, 0, expand, 0, i);
                        System.arraycopy(newtypes, 0, expand, i, newtypes.length);
                        System.arraycopy(types, i + 1, expand, i + newtypes.length, types.length - i - 1);
                        types = expand;
                        newparams = tup.getParameters();
                        exparams = new Object[parameters.length + newparams.length - 1];
                        System.arraycopy(parameters, 0, exparams, 0, i);
                        System.arraycopy(newparams, 0, exparams, i, newparams.length);
                        System.arraycopy(parameters, i + 1, exparams, i + newparams.length, parameters.length - i - 1);
                        parameters = var14_16;
                        LoggingHelper.logIf(Marshalling.LOGGER.isTraceEnabled(), (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$convertParameters$0(java.lang.Object[] java.lang.reflect.Type[] ), ()V)((Object[])var14_16, (Type[])var12_13));
                        --i;
                        break block6;
                    }
                    if (!(types[i] instanceof TypeVariable) || parameters[i] instanceof Variant) break block9;
                    if (_customSignatures == null) ** GOTO lbl-1000
                    if (_customSignatures.length <= 0) ** GOTO lbl-1000
                    if (_customSignatures.length > lastCustomSig) {
                        parameters[i] = new Variant<Object>(parameters[i], _customSignatures[lastCustomSig]);
                        ++lastCustomSig;
                    } else lbl-1000:
                    // 3 sources

                    {
                        parameters[i] = new Variant<Object>(parameters[i]);
                    }
                    break block6;
                }
                var11_11 /* !! */  = parameters[var7_7];
                if (var11_11 /* !! */  instanceof DBusInterface) {
                    var10_10 = (DBusInterface)var11_11 /* !! */ ;
                    var4_4[var7_7] = var3_3.getExportedObject(var10_10);
                }
            }
            ++var7_7;
        }
        return var4_4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    static Object deSerializeParameter(Object _parameter, Type _type, AbstractConnectionBase _conn) throws Exception {
        block40: {
            block44: {
                block43: {
                    block42: {
                        block41: {
                            block39: {
                                block38: {
                                    block37: {
                                        block33: {
                                            block35: {
                                                block36: {
                                                    block34: {
                                                        Marshalling.LOGGER.trace("Deserializing from {} to {}", (Object)_parameter.getClass(), (Object)_type);
                                                        parameter /* !! */  = _parameter;
                                                        if (_type instanceof TypeVariable) {
                                                            if (parameter /* !! */  instanceof Variant) {
                                                                variant = (Variant)parameter /* !! */ ;
                                                                parameter /* !! */  = variant.getValue();
                                                                Marshalling.LOGGER.trace("Type is variant, unwrapping to {}", (Object)parameter /* !! */ );
                                                            }
                                                        }
                                                        if (_type instanceof Class && ((Class)_type).isArray() && ((Class)_type).getComponentType().equals(Type.class)) {
                                                            if (parameter /* !! */  instanceof String) {
                                                                rv = new ArrayList<Type>();
                                                                Marshalling.getJavaType((String)parameter /* !! */ , rv, -1);
                                                                parameter /* !! */  = rv.toArray(new Type[0]);
                                                            }
                                                        }
                                                        if (parameter /* !! */  instanceof ObjectPath) {
                                                            op = (ObjectPath)parameter /* !! */ ;
                                                            Marshalling.LOGGER.trace("Parameter is ObjectPath");
                                                            parameter /* !! */  = _type instanceof Class && DBusInterface.class.isAssignableFrom((Class)_type) ? _conn.getExportedObject(op.getSource(), op.getPath(), (Class)_type) : new DBusPath(op.getPath());
                                                        }
                                                        if (parameter /* !! */  instanceof String) {
                                                            str = (String)parameter /* !! */ ;
                                                            if (_type instanceof Class && Enum.class.isAssignableFrom((Class)_type)) {
                                                                Marshalling.LOGGER.trace("Type seems to be an enum");
                                                                parameter /* !! */  = Enum.valueOf((Class)_type, str);
                                                            }
                                                        }
                                                        if (parameter /* !! */  instanceof Object[]) {
                                                            objArr = parameter /* !! */ ;
                                                            if (_type instanceof Class && Struct.class.isAssignableFrom((Class)_type)) {
                                                                Marshalling.LOGGER.trace("Creating Struct {} from {}", (Object)_type, (Object)parameter /* !! */ );
                                                                ts = Container.getTypeCache(_type);
                                                                if (ts == null) {
                                                                    fs = ((Class)_type).getDeclaredFields();
                                                                    ts = new Type[fs.length];
                                                                    var7_8 = fs;
                                                                    var8_13 = var7_8.length;
                                                                    for (var9_17 = 0; var9_17 < var8_13; ++var9_17) {
                                                                        f = var7_8[var9_17];
                                                                        p = f.getAnnotation(Position.class);
                                                                        if (null == p) continue;
                                                                        ts[var11_26.value()] = f.getGenericType();
                                                                    }
                                                                    Container.putTypeCache(_type, (Type[])ts);
                                                                }
                                                                parameter /* !! */  = Marshalling.deSerializeParameters(objArr, (Type[])ts, _conn);
                                                                fs = ((Class)_type).getDeclaredConstructors();
                                                                var7_9 = fs.length;
                                                                for (var8_13 = 0; var8_13 < var7_9; ++var8_13) {
                                                                    con = fs[var8_13];
                                                                    try {
                                                                        parameter /* !! */  = con.newInstance(objArr);
                                                                        break;
                                                                    }
                                                                    catch (IllegalArgumentException _exIa) {
                                                                        Marshalling.LOGGER.trace("Could not create new instance", _exIa);
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (parameter /* !! */  instanceof Object[]) {
                                                            oa = parameter /* !! */ ;
                                                            Marshalling.LOGGER.trace("Parameter is object array");
                                                            ts = new Type[oa.length];
                                                            Arrays.fill(ts, parameter /* !! */ .getClass().getComponentType());
                                                            parameter /* !! */  = Marshalling.deSerializeParameters(oa, (Type[])ts, _conn);
                                                        }
                                                        if (!(parameter /* !! */  instanceof List)) break block33;
                                                        Marshalling.LOGGER.trace("Parameter is List");
                                                        if (!(_type instanceof ParameterizedType)) break block34;
                                                        pt = (ParameterizedType)_type;
                                                        type2 = pt.getActualTypeArguments()[0];
                                                        break block35;
                                                    }
                                                    if (!(_type instanceof GenericArrayType)) break block36;
                                                    gat = (GenericArrayType)_type;
                                                    type2 = gat.getGenericComponentType();
                                                    break block35;
                                                }
                                                if (!(_type instanceof Class)) ** GOTO lbl-1000
                                                clz = (Class)_type;
                                                if (((Class)_type).isArray()) {
                                                    type2 = clz.getComponentType();
                                                } else lbl-1000:
                                                // 2 sources

                                                {
                                                    type2 = null;
                                                }
                                            }
                                            if (null != type2) {
                                                parameter /* !! */  = Marshalling.deSerializeParameters((List)parameter /* !! */ , type2, _conn);
                                            }
                                        }
                                        if (_type.equals(Float.class)) break block37;
                                        if (!_type.equals(Float.TYPE)) break block38;
                                    }
                                    if (!(parameter /* !! */  instanceof Float)) {
                                        parameter /* !! */  = Float.valueOf(((Number)parameter /* !! */ ).floatValue());
                                        Marshalling.LOGGER.trace("Parameter is float of value: {}", (Object)parameter /* !! */ );
                                    }
                                }
                                if (parameter /* !! */  instanceof Object[]) break block39;
                                if (parameter /* !! */  instanceof List) break block39;
                                if (!parameter /* !! */ .getClass().isArray()) break block40;
                            }
                            if (!(_type instanceof ParameterizedType)) break block41;
                            pt = (ParameterizedType)_type;
                            parameter /* !! */  = ArrayFrob.convert(parameter /* !! */ , (Class)pt.getRawType());
                            break block40;
                        }
                        if (!(_type instanceof GenericArrayType)) break block42;
                        gat = (GenericArrayType)_type;
                        ct = gat.getGenericComponentType();
                        cc = null;
                        if (ct instanceof Class) {
                            pt = (Class)ct;
                            cc = o;
                        }
                        if (ct instanceof ParameterizedType) {
                            o = (ParameterizedType)ct;
                            cc = (Class)o.getRawType();
                        }
                        o = Array.newInstance(cc, 0);
                        parameter /* !! */  = ArrayFrob.convert(parameter /* !! */ , o.getClass());
                        break block40;
                    }
                    if (!(_type instanceof Class)) break block40;
                    clz = (Class)_type;
                    if (!((Class)_type).isArray()) break block40;
                    cc = clz.getComponentType();
                    if (cc.equals(Float.class)) break block43;
                    if (!cc.equals(Float.TYPE)) break block44;
                }
                if (parameter /* !! */  instanceof double[]) {
                    dbArr = (double[])parameter /* !! */ ;
                    var9_22 = new float[dbArr.length];
                    for (var10_25 = 0; var10_25 < ((void)o).length; ++var10_25) {
                        var9_22[var10_25] = (float)var8_15[var10_25];
                    }
                    parameter /* !! */  = (Type[])var9_22;
                }
            }
            var8_16 = Array.newInstance(var7_12, 0);
            parameter /* !! */  = ArrayFrob.convert(parameter /* !! */ , var8_16.getClass());
        }
        if (parameter /* !! */  instanceof DBusMap) {
            dmap = (DBusMap)parameter /* !! */ ;
            Marshalling.LOGGER.trace("Deserializing a Map");
            if (_type instanceof ParameterizedType) {
                i = (ParameterizedType)_type;
                maptypes = i.getActualTypeArguments();
            } else {
                maptypes = parameter /* !! */ .getClass().getTypeParameters();
            }
            i = 0;
            while (i < dmap.entries.length) {
                dmap.entries[i][0] = Marshalling.deSerializeParameter(dmap.entries[var6_7][0], (Type)var5_5[0], (AbstractConnectionBase)var2_2);
                var4_4.entries[var6_7][1] = Marshalling.deSerializeParameter(var4_4.entries[var6_7][1], (Type)var5_5[1], (AbstractConnectionBase)var2_2);
                ++var6_7;
            }
        }
        return var3_3;
    }

    public static int getJavaType(String _dbusType, List<Type> _resultValue, int _limit) throws DBusException {
        if (null == _dbusType || _dbusType.isEmpty() || 0 == _limit) {
            return 0;
        }
        try {
            int idx;
            block22: for (idx = 0; idx < _dbusType.length() && (-1 == _limit || _limit > _resultValue.size()); ++idx) {
                switch (_dbusType.charAt(idx)) {
                    case '(': {
                        int structIdx = idx + 1;
                        int structLen = 1;
                        while (structLen > 0) {
                            if (')' == _dbusType.charAt(structIdx)) {
                                --structLen;
                            } else if ('(' == _dbusType.charAt(structIdx)) {
                                ++structLen;
                            }
                            ++structIdx;
                        }
                        ArrayList<Type> contained = new ArrayList();
                        int javaType = Marshalling.getJavaType(_dbusType.substring(idx + 1, structIdx - 1), contained, -1);
                        _resultValue.add(new DBusStructType(contained.toArray(new Type[0])));
                        idx = structIdx - 1;
                        continue block22;
                    }
                    case 'a': {
                        int javaType;
                        ArrayList<Type> contained;
                        if ('{' == _dbusType.charAt(idx + 1)) {
                            contained = new ArrayList();
                            javaType = Marshalling.getJavaType(_dbusType.substring(idx + 2), contained, 2);
                            _resultValue.add(new DBusMapType((Type)contained.get(0), (Type)contained.get(1)));
                            idx += javaType + 2;
                            continue block22;
                        }
                        contained = new ArrayList();
                        javaType = Marshalling.getJavaType(_dbusType.substring(idx + 1), contained, 1);
                        _resultValue.add(new DBusListType((Type)contained.get(0)));
                        idx += javaType;
                        continue block22;
                    }
                    case 'v': {
                        _resultValue.add((Type)((Object)Variant.class));
                        continue block22;
                    }
                    case 'b': {
                        _resultValue.add((Type)((Object)Boolean.class));
                        continue block22;
                    }
                    case 'n': {
                        _resultValue.add((Type)((Object)Short.class));
                        continue block22;
                    }
                    case 'y': {
                        _resultValue.add((Type)((Object)Byte.class));
                        continue block22;
                    }
                    case 'o': {
                        _resultValue.add((Type)((Object)DBusPath.class));
                        continue block22;
                    }
                    case 'q': {
                        _resultValue.add((Type)((Object)UInt16.class));
                        continue block22;
                    }
                    case 'i': {
                        _resultValue.add((Type)((Object)Integer.class));
                        continue block22;
                    }
                    case 'u': {
                        _resultValue.add((Type)((Object)UInt32.class));
                        continue block22;
                    }
                    case 'x': {
                        _resultValue.add((Type)((Object)Long.class));
                        continue block22;
                    }
                    case 't': {
                        _resultValue.add((Type)((Object)UInt64.class));
                        continue block22;
                    }
                    case 'd': {
                        _resultValue.add((Type)((Object)Double.class));
                        continue block22;
                    }
                    case 'f': {
                        _resultValue.add((Type)((Object)Float.class));
                        continue block22;
                    }
                    case 's': {
                        _resultValue.add((Type)((Object)CharSequence.class));
                        continue block22;
                    }
                    case 'h': {
                        _resultValue.add((Type)((Object)FileDescriptor.class));
                        continue block22;
                    }
                    case 'g': {
                        _resultValue.add((Type)((Object)Type[].class));
                        continue block22;
                    }
                    case '{': {
                        _resultValue.add((Type)((Object)Map.Entry.class));
                        ArrayList<Type> contained = new ArrayList<Type>();
                        int javaType = Marshalling.getJavaType(_dbusType.substring(idx + 1), contained, 2);
                        idx += javaType + 1;
                        continue block22;
                    }
                    default: {
                        throw new DBusException(String.format("Failed to parse DBus type signature: %s (%s).", _dbusType, Character.valueOf(_dbusType.charAt(idx))));
                    }
                }
            }
            return idx;
        }
        catch (IndexOutOfBoundsException _ex) {
            LOGGER.debug("Failed to parse DBus type signature.", _ex);
            throw new DBusException("Failed to parse DBus type signature: " + _dbusType);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static String[] getDBusType(Type _javaType) throws DBusException {
        void var1_1;
        String[] cached = TYPE_CACHE.get(_javaType);
        if (null != cached) {
            return cached;
        }
        cached = Marshalling.getDBusType(_javaType, false);
        TYPE_CACHE.put(_javaType, cached);
        return var1_1;
    }

    public static String[] getDBusType(Type _dataType, boolean _basic) throws DBusException {
        return Marshalling.recursiveGetDBusType(new StringBuffer[10], _dataType, _basic, 0);
    }

    /*
     * WARNING - void declaration
     */
    static List<Object> deSerializeParameters(List<Object> _parameters, Type _type, AbstractConnectionBase _conn) throws Exception {
        List<Object> list;
        LOGGER.trace("Deserializing from {} to {}", (Object)_parameters, (Object)_type);
        if (_parameters == null) {
            return null;
        }
        int i = 0;
        while (i < _parameters.size()) {
            void var3_3;
            if (_parameters.get(i) != null) {
                _parameters.set(i, Marshalling.deSerializeParameter(_parameters.get(i), _type, _conn));
            }
            ++var3_3;
        }
        return list;
    }

    public static Object[] convertParameters(Object[] _parameters, Type[] _types, AbstractConnectionBase _conn) throws DBusException {
        return Marshalling.convertParameters(_parameters, _types, null, _conn);
    }

    /*
     * WARNING - void declaration
     */
    public static Object[] deSerializeParameters(Object[] _parameters, Type[] _types, AbstractConnectionBase _conn) throws Exception {
        void var3_3;
        Type type;
        LoggingHelper.logIf(LOGGER.isTraceEnabled(), () -> LOGGER.trace("Deserializing from {} to {} ", (Object)Arrays.deepToString(_parameters), (Object)Arrays.deepToString(_types)));
        if (null == _parameters) {
            return null;
        }
        Object[] parameters = _parameters;
        Type[] types = _types;
        if (types.length == 1) {
            ParameterizedType pt;
            type = types[0];
            if (type instanceof ParameterizedType && Tuple.class.isAssignableFrom((Class)(pt = (ParameterizedType)type).getRawType())) {
                types = pt.getActualTypeArguments();
            }
        }
        if (types.length == 1) {
            Class clz;
            type = types[0];
            if (type instanceof Class && Tuple.class.isAssignableFrom(clz = (Class)type)) {
                String typeName = types[0].getTypeName();
                Constructor<?>[] constructors = Class.forName(typeName).getDeclaredConstructors();
                if (constructors.length != 1) {
                    throw new DBusException("Error deserializing message: We had a Tuple type but wrong number of constructors for this Tuple. There should be exactly one.");
                }
                if (constructors[0].getParameterCount() != parameters.length) {
                    throw new DBusException("Error deserializing message: We had a Tuple type but it had wrong number of constructor arguments. The number of constructor arguments should match the number of parameters to deserialize.");
                }
                Object obj = constructors[0].newInstance(parameters);
                Object[] objectArray = new Object[1];
                objectArray[0] = obj;
                return objectArray;
            }
        }
        int i = 0;
        while (i < parameters.length) {
            void var5_8;
            if (i >= types.length) {
                if (LOGGER.isDebugEnabled()) {
                    LOGGER.error("Parameter length differs, expected {} but got {}", (Object)parameters.length, (Object)types.length);
                    for (int j = 0; j < parameters.length; ++j) {
                        LOGGER.error("Error, Parameters differ: {}, '{}'", (Object)j, parameters[j]);
                    }
                }
                throw new DBusException("Error deserializing message: number of parameters didn't match receiving signature");
            }
            if (null != parameters[i]) {
                Type constructors;
                if (types[i] instanceof Class && DBusSerializable.class.isAssignableFrom((Class)types[i]) || (constructors = types[i]) instanceof ParameterizedType && DBusSerializable.class.isAssignableFrom((Class)(type = (ParameterizedType)constructors).getRawType())) {
                    Class dsc = types[i] instanceof Class ? (Class)types[i] : (Class)((ParameterizedType)types[i]).getRawType();
                    Method[] methodArray = dsc.getDeclaredMethods();
                    int n = methodArray.length;
                    for (int j = 0; j < n; ++j) {
                        Method m = methodArray[j];
                        if (!m.getName().equals(MTH_NAME_DESERIALIZE)) continue;
                        Type[] newtypes = m.getGenericParameterTypes();
                        try {
                            void var15_20;
                            void var14_19;
                            Object[] sub = new Object[newtypes.length];
                            System.arraycopy(parameters, i, sub, 0, newtypes.length);
                            sub = Marshalling.deSerializeParameters(sub, newtypes, _conn);
                            DBusSerializable sz = (DBusSerializable)dsc.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            m.invoke((Object)sz, sub);
                            Object[] compress = new Object[parameters.length - newtypes.length + 1];
                            System.arraycopy(parameters, 0, compress, 0, i);
                            compress[i] = var14_19;
                            System.arraycopy(parameters, i + newtypes.length, var15_20, i + 1, parameters.length - i - newtypes.length);
                            parameters = var15_20;
                            continue;
                        }
                        catch (ArrayIndexOutOfBoundsException _ex) {
                            void var12_16;
                            LOGGER.debug("", _ex);
                            Object[] objectArray = new Object[2];
                            objectArray[0] = parameters.length - i;
                            objectArray[1] = ((void)var12_16).length;
                            throw new DBusException(String.format("Not enough elements to create custom object from serialized data (%s < %s).", objectArray));
                        }
                    }
                } else {
                    void var2_2;
                    void var4_4;
                    var3_3[var5_8] = Marshalling.deSerializeParameter(var3_3[var5_8], (Type)var4_4[var5_8], (AbstractConnectionBase)var2_2);
                }
            }
            ++var5_8;
        }
        return var3_3;
    }

    static {
        TYPE_CACHE = new ConcurrentHashMap<Type, String[]>();
        CLASS_TO_ARGUMENTTYPE = new LinkedHashMap();
        CLASS_TO_ARGUMENTTYPE.put(Boolean.class, (byte)98);
        CLASS_TO_ARGUMENTTYPE.put(Boolean.TYPE, (byte)98);
        CLASS_TO_ARGUMENTTYPE.put(Byte.class, (byte)121);
        CLASS_TO_ARGUMENTTYPE.put(Byte.TYPE, (byte)121);
        CLASS_TO_ARGUMENTTYPE.put(Short.class, (byte)110);
        CLASS_TO_ARGUMENTTYPE.put(Short.TYPE, (byte)110);
        CLASS_TO_ARGUMENTTYPE.put(Integer.class, (byte)105);
        CLASS_TO_ARGUMENTTYPE.put(Integer.TYPE, (byte)105);
        CLASS_TO_ARGUMENTTYPE.put(Long.class, (byte)120);
        CLASS_TO_ARGUMENTTYPE.put(Long.TYPE, (byte)120);
        CLASS_TO_ARGUMENTTYPE.put(Double.class, (byte)100);
        CLASS_TO_ARGUMENTTYPE.put(Double.TYPE, (byte)100);
        if (AbstractConnection.FLOAT_SUPPORT) {
            CLASS_TO_ARGUMENTTYPE.put(Float.class, (byte)102);
            CLASS_TO_ARGUMENTTYPE.put(Float.TYPE, (byte)102);
        } else {
            CLASS_TO_ARGUMENTTYPE.put(Float.class, (byte)100);
            CLASS_TO_ARGUMENTTYPE.put(Float.TYPE, (byte)100);
        }
        CLASS_TO_ARGUMENTTYPE.put(UInt16.class, (byte)113);
        CLASS_TO_ARGUMENTTYPE.put(UInt32.class, (byte)117);
        CLASS_TO_ARGUMENTTYPE.put(UInt64.class, (byte)116);
        CLASS_TO_ARGUMENTTYPE.put(CharSequence.class, (byte)115);
        CLASS_TO_ARGUMENTTYPE.put(Variant.class, (byte)118);
        CLASS_TO_ARGUMENTTYPE.put(FileDescriptor.class, (byte)104);
        CLASS_TO_ARGUMENTTYPE.put(DBusInterface.class, (byte)111);
        CLASS_TO_ARGUMENTTYPE.put(DBusPath.class, (byte)111);
        CLASS_TO_ARGUMENTTYPE.put(ObjectPath.class, (byte)111);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String[] recursiveGetDBusType(StringBuffer[] _out, Type _dataType, boolean _basic, int _level) throws DBusException {
        void var3_3;
        StringBuffer[] stringBufferArray;
        void var1_1;
        block38: {
            String[] stringArray;
            int n;
            Type[] ts3;
            block51: {
                int s4;
                Field[] j2;
                block52: {
                    int _ex2;
                    Type[] t2;
                    block47: {
                        Type[] newtypes;
                        block43: {
                            Class dataTypeClazz;
                            block50: {
                                block49: {
                                    block44: {
                                        ParameterizedType p;
                                        block48: {
                                            block46: {
                                                block45: {
                                                    block42: {
                                                        block41: {
                                                            void var5_13;
                                                            block40: {
                                                                block39: {
                                                                    if (_out.length <= _level) {
                                                                        StringBuffer[] newout = new StringBuffer[_out.length];
                                                                        System.arraycopy(_out, 0, newout, 0, _out.length);
                                                                        _out = newout;
                                                                    }
                                                                    if (null == _out[_level]) {
                                                                        _out[_level] = new StringBuffer();
                                                                    } else {
                                                                        _out[_level].delete(0, _out[_level].length());
                                                                    }
                                                                    if (_basic && !(_dataType instanceof Class)) {
                                                                        throw new DBusException(String.valueOf(_dataType) + " is not a basic type");
                                                                    }
                                                                    if (!(_dataType instanceof TypeVariable)) break block39;
                                                                    _out[_level].append('v');
                                                                    break block38;
                                                                }
                                                                if (!(_dataType instanceof GenericArrayType)) break block40;
                                                                GenericArrayType gat = (GenericArrayType)_dataType;
                                                                _out[_level].append('a');
                                                                String[] s2 = Marshalling.recursiveGetDBusType(_out, gat.getGenericComponentType(), false, _level + 1);
                                                                if (s2.length != 1) {
                                                                    throw new DBusException(ERROR_MULTI_VALUED_ARRAY);
                                                                }
                                                                _out[_level].append(s2[0]);
                                                                break block38;
                                                            }
                                                            if (_dataType instanceof Class && DBusSerializable.class.isAssignableFrom((Class)_dataType)) break block41;
                                                            if (!(_dataType instanceof ParameterizedType)) break block42;
                                                            ParameterizedType pt = (ParameterizedType)_dataType;
                                                            if (!DBusSerializable.class.isAssignableFrom((Class)var5_13.getRawType())) break block42;
                                                        }
                                                        newtypes = null;
                                                        if (_dataType instanceof Class) {
                                                            Class clz = (Class)_dataType;
                                                            var10_21 = clz.getDeclaredMethods();
                                                            var11_28 = var10_21.length;
                                                            for (var12_33 = 0; var12_33 < var11_28; ++var12_33) {
                                                                m = var10_21[var12_33];
                                                                if (!m.getName().equals(MTH_NAME_DESERIALIZE)) continue;
                                                                newtypes = m.getGenericParameterTypes();
                                                            }
                                                        } else {
                                                            var10_21 = ((Class)((ParameterizedType)_dataType).getRawType()).getDeclaredMethods();
                                                            var11_28 = var10_21.length;
                                                            for (var12_33 = 0; var12_33 < var11_28; ++var12_33) {
                                                                m = var10_21[var12_33];
                                                                if (!m.getName().equals(MTH_NAME_DESERIALIZE)) continue;
                                                                newtypes = m.getGenericParameterTypes();
                                                            }
                                                        }
                                                        if (null == newtypes) {
                                                            throw new DBusException("Serializable classes must implement a deserialize method");
                                                        }
                                                        break block43;
                                                    }
                                                    if (!(_dataType instanceof ParameterizedType)) break block44;
                                                    p = (ParameterizedType)_dataType;
                                                    if (!p.getRawType().equals(Map.class)) break block45;
                                                    _out[_level].append("a{");
                                                    Type[] t2 = p.getActualTypeArguments();
                                                    try {
                                                        void _ex2;
                                                        String[] s3 = Marshalling.recursiveGetDBusType(_out, t2[0], true, _level + 1);
                                                        if (s3.length != 1) {
                                                            throw new DBusException(ERROR_MULTI_VALUED_ARRAY);
                                                        }
                                                        _out[_level].append(s3[0]);
                                                        s3 = Marshalling.recursiveGetDBusType(_out, t2[1], false, _level + 1);
                                                        if (((void)_ex2).length != 1) {
                                                            throw new DBusException(ERROR_MULTI_VALUED_ARRAY);
                                                        }
                                                        _out[_level].append((String)_ex2[0]);
                                                    }
                                                    catch (ArrayIndexOutOfBoundsException _ex2) {
                                                        LOGGER.debug("", _ex2);
                                                        throw new DBusException("Map must have 2 parameters");
                                                    }
                                                    _out[_level].append('}');
                                                    break block38;
                                                }
                                                if (!List.class.isAssignableFrom((Class)p.getRawType())) break block46;
                                                t2 = p.getActualTypeArguments();
                                                _ex2 = t2.length;
                                                break block47;
                                            }
                                            if (!p.getRawType().equals(Variant.class)) break block48;
                                            _out[_level].append('v');
                                            break block38;
                                        }
                                        if (DBusInterface.class.isAssignableFrom((Class)p.getRawType())) {
                                            _out[_level].append('o');
                                            break block38;
                                        } else if (Struct.class.isAssignableFrom((Class)p.getRawType())) {
                                            _out[_level].append('(');
                                            break block38;
                                        } else {
                                            if (!Tuple.class.isAssignableFrom((Class)p.getRawType())) {
                                                throw new DBusException("Exporting non-exportable parameterized type " + String.valueOf(_dataType));
                                            }
                                            Type[] ts2 = p.getActualTypeArguments();
                                            ArrayList vs = new ArrayList();
                                            Type[] j2 = ts2;
                                            int n2 = j2.length;
                                            int s4 = 0;
                                            while (true) {
                                                if (s4 >= n2) {
                                                    return vs.toArray(new String[0]);
                                                }
                                                Type t3 = j2[s4];
                                                Collections.addAll(vs, Marshalling.recursiveGetDBusType(_out, t3, false, _level + 1));
                                                ++s4;
                                            }
                                        }
                                    }
                                    if (!(_dataType instanceof Class)) break block38;
                                    dataTypeClazz = (Class)_dataType;
                                    if (!dataTypeClazz.isArray()) break block49;
                                    if (Type.class.equals(((Class)_dataType).getComponentType())) {
                                        _out[_level].append('g');
                                        break block38;
                                    } else {
                                        void ts3;
                                        _out[_level].append('a');
                                        String[] s5 = Marshalling.recursiveGetDBusType(_out, ((Class)_dataType).getComponentType(), false, _level + 1);
                                        if (s5.length != 1) {
                                            throw new DBusException(ERROR_MULTI_VALUED_ARRAY);
                                        }
                                        _out[_level].append((String)ts3[0]);
                                    }
                                    break block38;
                                }
                                if (!Struct.class.isAssignableFrom((Class)_dataType)) break block50;
                                _out[_level].append('(');
                                ts3 = Container.getTypeCache(_dataType);
                                if (null != ts3) break block51;
                                Field[] fs = ((Class)_dataType).getDeclaredFields();
                                ts3 = new Type[fs.length];
                                j2 = fs;
                                n = j2.length;
                                s4 = 0;
                                break block52;
                            }
                            if (Enum.class.isAssignableFrom(dataTypeClazz)) {
                                _out[_level].append('s');
                                break block38;
                            } else {
                                boolean bl;
                                boolean found = false;
                                for (Map.Entry<Class<?>, Byte> entry : CLASS_TO_ARGUMENTTYPE.entrySet()) {
                                    void var7_42;
                                    if (!entry.getKey().isAssignableFrom((Class<?>)var7_42)) continue;
                                    _out[_level].append((char)entry.getValue().byteValue());
                                    bl = true;
                                    break;
                                }
                                if (!bl) {
                                    throw new DBusException("Exporting non-exportable type: " + String.valueOf(var1_1));
                                }
                            }
                            break block38;
                        }
                        String[] sigs = new String[newtypes.length];
                        int j2 = 0;
                        while (true) {
                            if (j2 >= sigs.length) {
                                return sigs;
                            }
                            String[] ss = Marshalling.recursiveGetDBusType(_out, newtypes[j2], false, _level + 1);
                            if (1 != ss.length) {
                                throw new DBusException("Serializable classes must serialize to native DBus types");
                            }
                            sigs[j2] = ss[0];
                            ++j2;
                        }
                    }
                    for (int j2 = 0; j2 < _ex2; ++j2) {
                        Type t4 = t2[j2];
                        if (Type.class.equals((Object)t4)) {
                            _out[_level].append('g');
                            continue;
                        }
                        String[] s4 = Marshalling.recursiveGetDBusType(_out, t4, false, _level + 1);
                        if (s4.length != 1) {
                            throw new DBusException(ERROR_MULTI_VALUED_ARRAY);
                        }
                        _out[_level].append('a');
                        _out[_level].append(s4[0]);
                    }
                    break block38;
                }
                while (s4 < n) {
                    void t;
                    stringArray = j2[s4];
                    Position position = stringArray.getAnnotation(Position.class);
                    if (null != position) {
                        ts3[position.value()] = stringArray.getGenericType();
                    }
                    ++t;
                }
                Container.putTypeCache(_dataType, ts3);
            }
            Type[] typeArray = ts3;
            int j2 = typeArray.length;
            for (n = 0; n < j2; ++n) {
                Type type = typeArray[n];
                if (type == null) continue;
                stringArray = Marshalling.recursiveGetDBusType(_out, type, false, _level + 1);
                int n3 = stringArray.length;
                for (int i = 0; i < n3; ++i) {
                    String string = stringArray[i];
                    _out[_level].append(string);
                }
            }
            _out[_level].append(')');
        }
        LOGGER.trace("Converted Java type: {} to D-Bus Type: {}", (Object)var1_1, (Object)stringBufferArray[var3_3]);
        String[] stringArray = new String[1];
        stringArray[0] = stringBufferArray[var3_3].toString();
        return stringArray;
    }

    private static /* synthetic */ void lambda$convertParameters$0(Object[] exparams, Type[] expand) {
        LOGGER.trace("New params: {}, new types: {}", (Object)Arrays.deepToString(exparams), (Object)Arrays.deepToString(expand));
    }
}


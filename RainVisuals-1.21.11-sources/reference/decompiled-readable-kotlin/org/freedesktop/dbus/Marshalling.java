package org.freedesktop.dbus;

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
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
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

// $VF: Compiled from Marshalling.java
public final class Marshalling {
   private static final Logger LOGGER = LoggerFactory.getLogger(Marshalling.class);
   private static final String MTH_NAME_DESERIALIZE = "deserialize";
   private static final Map<Class<?>, Byte> CLASS_TO_ARGUMENTTYPE = new LinkedHashMap<>();
   private static final String ERROR_MULTI_VALUED_ARRAY = "Multi-valued array types not permitted";
   private static final Map<Type, String[]> TYPE_CACHE = new ConcurrentHashMap<>();

   public static String getDBusType(Type[] _javaType) throws DBusException {
      StringBuilder sb = new StringBuilder();

      for (Type t : _javaType) {
         for (String s : getDBusType(t)) {
            sb.append(s);
         }
      }

      return sb.toString();
   }

   private Marshalling() {
   }

   public static Object[] convertParameters(Object[] _customSignatures, Type[] _parameters, String[] _conn, AbstractConnectionBase _types) throws DBusException {
      if (_parameters == null) {
         return null;
      }

      Object[] parameters = _parameters;
      Type[] types = _types;
      int lastCustomSig = 0;

      for (int i = 0; i < parameters.length; i++) {
         if (null != parameters[i]) {
            LOGGER.trace("Converting {} from '{}' to {}", i, parameters[i], types[i]);
            if (!(parameters[i] instanceof DBusSerializable ds)) {
               Type[] newtypes = (Type[])parameters[i];
               if (newtypes instanceof Tuple) {
                  Tuple tup = (Tuple)newtypes;
                  Type[] var22 = ((ParameterizedType)types[i]).getActualTypeArguments();
                  Type[] var23 = new Type[types.length + var22.length - 1];
                  System.arraycopy(types, 0, var23, 0, i);
                  System.arraycopy(var22, 0, var23, i, var22.length);
                  System.arraycopy(types, i + 1, var23, i + var22.length, types.length - i - 1);
                  types = var23;
                  Object[] var24 = tup.getParameters();
                  Object[] var25 = new Object[parameters.length + var24.length - 1];
                  System.arraycopy(parameters, 0, var25, 0, i);
                  System.arraycopy(var24, 0, var25, i, var24.length);
                  System.arraycopy(parameters, i + 1, var25, i + var24.length, parameters.length - i - 1);
                  parameters = var25;
                  LoggingHelper.logIf(
                     LOGGER.isTraceEnabled(), () -> LOGGER.trace("New params: {}, new types: {}", Arrays.deepToString(var25), Arrays.deepToString(var23))
                  );
                  i--;
               } else if (types[i] instanceof TypeVariable && !(parameters[i] instanceof Variant)) {
                  if (_customSignatures != null && _customSignatures.length > 0 && _customSignatures.length > lastCustomSig) {
                     parameters[i] = new Variant<>(parameters[i], _customSignatures[lastCustomSig]);
                     lastCustomSig++;
                  } else {
                     parameters[i] = new Variant<>(parameters[i]);
                  }
               } else if (parameters[i] instanceof DBusInterface di) {
                  parameters[i] = _conn.getExportedObject(di);
               }
            } else {
               for (Method exparams : parameters[i].getClass().getDeclaredMethods()) {
                  if (exparams.getName().equals("deserialize")) {
                     Type[] newtypes = exparams.getParameterTypes();
                     Type[] expand = new Type[types.length + newtypes.length - 1];
                     System.arraycopy(types, 0, expand, 0, i);
                     System.arraycopy(newtypes, 0, expand, i, newtypes.length);
                     System.arraycopy(types, i + 1, expand, i + newtypes.length, types.length - i - 1);
                     types = expand;
                     Object[] newparams = ds.serialize();
                     Object[] exparamsx = new Object[parameters.length + newparams.length - 1];
                     System.arraycopy(parameters, 0, exparamsx, 0, i);
                     System.arraycopy(newparams, 0, exparamsx, i, newparams.length);
                     System.arraycopy(parameters, i + 1, exparamsx, i + newparams.length, parameters.length - i - 1);
                     parameters = exparamsx;
                  }
               }

               i--;
            }
         }
      }

      return parameters;
   }

   static Object deSerializeParameter(Object _parameter, Type _conn, AbstractConnectionBase _type) throws Exception {
      LOGGER.trace("Deserializing from {} to {}", _parameter.getClass(), _type);
      Object parameter = _parameter;
      if (_type instanceof TypeVariable && parameter instanceof Variant<?> dmap) {
         parameter = dmap.getValue();
         LOGGER.trace("Type is variant, unwrapping to {}", parameter);
      }

      if (_type instanceof Class && ((Class)_type).isArray() && ((Class)_type).getComponentType().equals(Type.class) && parameter instanceof String) {
         List<Type> var13 = new ArrayList();
         getJavaType((String)parameter, var13, -1);
         parameter = var13.toArray(new Type[0]);
      }

      if (parameter instanceof ObjectPath var14) {
         LOGGER.trace("Parameter is ObjectPath");
         if (_type instanceof Class && DBusInterface.class.isAssignableFrom((Class<?>)_type)) {
            parameter = _conn.getExportedObject(var14.getSource(), var14.getPath(), (Class)_type);
         } else {
            parameter = new DBusPath(var14.getPath());
         }
      }

      if (parameter instanceof String var15 && _type instanceof Class && Enum.class.isAssignableFrom((Class<?>)_type)) {
         LOGGER.trace("Type seems to be an enum");
         parameter = Enum.valueOf((Class)_type, var15);
      }

      if (parameter instanceof Object[] var16 && _type instanceof Class && Struct.class.isAssignableFrom((Class<?>)_type)) {
         LOGGER.trace("Creating Struct {} from {}", _type, parameter);
         Type[] maptypes = Container.getTypeCache(_type);
         if (maptypes == null) {
            Field[] i = ((Class)_type).getDeclaredFields();
            maptypes = new Type[i.length];

            for (Field ix : i) {
               Position p = ix.getAnnotation(Position.class);
               if (null != p) {
                  maptypes[p.value()] = ix.getGenericType();
               }
            }

            Container.putTypeCache(_type, maptypes);
         }

         parameter = deSerializeParameters(var16, maptypes, _conn);

         for (Constructor<?> var38 : ((Class)_type).getDeclaredConstructors()) {
            try {
               parameter = var38.newInstance(var16);
               break;
            } catch (IllegalArgumentException var12) {
               LOGGER.trace("Could not create new instance", var12);
            }
         }
      }

      if (parameter instanceof Object[] var17) {
         LOGGER.trace("Parameter is object array");
         Type[] var21 = new Type[var17.length];
         Arrays.fill(var21, parameter.getClass().getComponentType());
         parameter = deSerializeParameters(var17, var21, _conn);
      }

      if (parameter instanceof List) {
         LOGGER.trace("Parameter is List");
         Type type2;
         if (_type instanceof ParameterizedType var22) {
            type2 = var22.getActualTypeArguments()[0];
         } else if (_type instanceof GenericArrayType var26) {
            type2 = var26.getGenericComponentType();
         } else if (_type instanceof Class var31 && ((Class)_type).isArray()) {
            type2 = var31.getComponentType();
         } else {
            type2 = null;
         }

         if (null != type2) {
            parameter = deSerializeParameters((List<Object>)parameter, type2, _conn);
         }
      }

      if ((_type.equals(Float.class) || _type.equals(float.class)) && !(parameter instanceof Float)) {
         parameter = ((Number)parameter).floatValue();
         LOGGER.trace("Parameter is float of value: {}", parameter);
      }

      if (parameter instanceof Object[] || parameter instanceof List || parameter.getClass().isArray()) {
         if (_type instanceof ParameterizedType var19) {
            parameter = ArrayFrob.convert(parameter, (Class<? extends Object>)var19.getRawType());
         } else if (_type instanceof GenericArrayType var23) {
            Type var32 = var23.getGenericComponentType();
            Class<?> var35 = null;
            if (var32 instanceof Class) {
               Object o = (Class)var32;
               var35 = o;
            }

            if (var32 instanceof ParameterizedType var40) {
               var35 = (Class)var40.getRawType();
            }

            Object var41 = Array.newInstance((Class<?>)var35, 0);
            parameter = ArrayFrob.convert(parameter, (Class<? extends Object>)var41.getClass());
         } else if (_type instanceof Class<?> var27 && ((Class)_type).isArray()) {
            Class<?> var33 = var27.getComponentType();
            if ((var33.equals(Float.class) || var33.equals(float.class)) && parameter instanceof double[] var36) {
               float[] var42 = new float[var36.length];

               for (int var43 = 0; var43 < var36.length; var43++) {
                  var42[var43] = (float)var36[var43];
               }

               parameter = var42;
            }

            Object var37 = Array.newInstance(var33, 0);
            parameter = ArrayFrob.convert(parameter, (Class<? extends Object>)var37.getClass());
         }
      }

      if (parameter instanceof DBusMap<?, ?> var20) {
         LOGGER.trace("Deserializing a Map");
         Type[] var24;
         if (_type instanceof int var28) {
            var24 = var28.getActualTypeArguments();
         } else {
            var24 = parameter.getClass().getTypeParameters();
         }

         for (int var29 = 0; var29 < var20.entries.length; var29++) {
            var20.entries[var29][0] = deSerializeParameter(var20.entries[var29][0], var24[0], _conn);
            var20.entries[var29][1] = deSerializeParameter(var20.entries[var29][1], var24[1], _conn);
         }
      }

      return parameter;
   }

   public static int getJavaType(String _resultValue, List<Type> _dbusType, int _limit) throws DBusException {
      if (null != _dbusType && !_dbusType.isEmpty() && 0 != _limit) {
         try {
            int idx;
            for (idx = 0; idx < _dbusType.length() && (-1 == _limit || _limit > _resultValue.size()); idx++) {
               switch (_dbusType.charAt(idx)) {
                  case '(': {
                     int structIdx = idx + 1;

                     for (int structLen = 1; structLen > 0; structIdx++) {
                        if (')' == _dbusType.charAt(structIdx)) {
                           structLen--;
                        } else if ('(' == _dbusType.charAt(structIdx)) {
                           structLen++;
                        }
                     }

                     List<Type> contained = new ArrayList<>();
                     int javaType = getJavaType(_dbusType.substring(idx + 1, structIdx - 1), contained, -1);
                     _resultValue.add(new DBusStructType(contained.toArray(new Type[0])));
                     idx = structIdx - 1;
                     break;
                  }
                  case 'a':
                     if ('{' == _dbusType.charAt(idx + 1)) {
                        List<Type> containedx = new ArrayList<>();
                        int javaTypex = getJavaType(_dbusType.substring(idx + 2), containedx, 2);
                        _resultValue.add(new DBusMapType(containedx.get(0), containedx.get(1)));
                        idx += javaTypex + 2;
                     } else {
                        List<Type> containedx = new ArrayList<>();
                        int javaTypex = getJavaType(_dbusType.substring(idx + 1), containedx, 1);
                        _resultValue.add(new DBusListType(containedx.get(0)));
                        idx += javaTypex;
                     }
                     break;
                  case 'b':
                     _resultValue.add(Boolean.class);
                     break;
                  case 'd':
                     _resultValue.add(Double.class);
                     break;
                  case 'f':
                     _resultValue.add(Float.class);
                     break;
                  case 'g':
                     _resultValue.add(Type[].class);
                     break;
                  case 'h':
                     _resultValue.add(FileDescriptor.class);
                     break;
                  case 'i':
                     _resultValue.add(Integer.class);
                     break;
                  case 'n':
                     _resultValue.add(Short.class);
                     break;
                  case 'o':
                     _resultValue.add(DBusPath.class);
                     break;
                  case 'q':
                     _resultValue.add(UInt16.class);
                     break;
                  case 's':
                     _resultValue.add(CharSequence.class);
                     break;
                  case 't':
                     _resultValue.add(UInt64.class);
                     break;
                  case 'u':
                     _resultValue.add(UInt32.class);
                     break;
                  case 'v':
                     _resultValue.add(Variant.class);
                     break;
                  case 'x':
                     _resultValue.add(Long.class);
                     break;
                  case 'y':
                     _resultValue.add(Byte.class);
                     break;
                  case '{': {
                     _resultValue.add(Entry.class);
                     List<Type> contained = new ArrayList<>();
                     int javaType = getJavaType(_dbusType.substring(idx + 1), contained, 2);
                     idx += javaType + 1;
                     break;
                  }
                  default:
                     throw new DBusException(String.format("Failed to parse DBus type signature: %s (%s).", _dbusType, _dbusType.charAt(idx)));
               }
            }

            return idx;
         } catch (IndexOutOfBoundsException _ex) {
            LOGGER.debug("Failed to parse DBus type signature.", _ex);
            throw new DBusException("Failed to parse DBus type signature: " + _dbusType);
         }
      } else {
         return 0;
      }
   }

   public static String[] getDBusType(Type _javaType) throws DBusException {
      String[] cached = TYPE_CACHE.get(_javaType);
      if (null != cached) {
         return cached;
      }

      cached = getDBusType(_javaType, false);
      TYPE_CACHE.put(_javaType, cached);
      return cached;
   }

   public static String[] getDBusType(Type _basic, boolean _dataType) throws DBusException {
      return recursiveGetDBusType(new StringBuffer[10], _dataType, _basic, 0);
   }

   static List<Object> deSerializeParameters(List<Object> _parameters, Type _conn, AbstractConnectionBase _type) throws Exception {
      LOGGER.trace("Deserializing from {} to {}", _parameters, _type);
      if (_parameters == null) {
         return null;
      }

      for (int i = 0; i < _parameters.size(); i++) {
         if (_parameters.get(i) != null) {
            _parameters.set(i, deSerializeParameter(_parameters.get(i), _type, _conn));
         }
      }

      return _parameters;
   }

   public static Object[] convertParameters(Object[] _parameters, Type[] _types, AbstractConnectionBase _conn) throws DBusException {
      return convertParameters(_parameters, _types, null, _conn);
   }

   public static Object[] deSerializeParameters(Object[] _conn, Type[] _types, AbstractConnectionBase _parameters) throws Exception {
      LoggingHelper.logIf(
         LOGGER.isTraceEnabled(), () -> LOGGER.trace("Deserializing from {} to {} ", Arrays.deepToString(_parameters), Arrays.deepToString(_types))
      );
      if (null == _parameters) {
         return null;
      }

      Object[] parameters = _parameters;
      Type[] types = _types;
      if (types.length == 1 && types[0] instanceof ParameterizedType i && Tuple.class.isAssignableFrom((Class<?>)i.getRawType())) {
         types = i.getActualTypeArguments();
      }

      if (types.length == 1 && types[0] instanceof Class<?> var17 && Tuple.class.isAssignableFrom(var17)) {
         String var22 = types[0].getTypeName();
         Constructor<?>[] var24 = Class.forName(var22).getDeclaredConstructors();
         if (var24.length != 1) {
            throw new DBusException(
               "Error deserializing message: We had a Tuple type but wrong number of constructors for this Tuple. There should be exactly one."
            );
         }

         if (var24[0].getParameterCount() != parameters.length) {
            throw new DBusException(
               "Error deserializing message: We had a Tuple type but it had wrong number of constructor arguments. The number of constructor arguments should match the number of parameters to deserialize."
            );
         }

         Object var25 = var24[0].newInstance(parameters);
         return new Object[]{var25};
      } else {
         for (int var18 = 0; var18 < parameters.length; var18++) {
            if (var18 >= types.length) {
               if (LOGGER.isDebugEnabled()) {
                  LOGGER.error("Parameter length differs, expected {} but got {}", parameters.length, types.length);

                  for (int var21 = 0; var21 < parameters.length; var21++) {
                     LOGGER.error("Error, Parameters differ: {}, '{}'", var21, parameters[var21]);
                  }
               }

               throw new DBusException("Error deserializing message: number of parameters didn't match receiving signature");
            }

            if (null != parameters[var18]) {
               if (types[var18] instanceof Class && DBusSerializable.class.isAssignableFrom((Class<?>)types[var18])
                  || types[var18] instanceof ParameterizedType var20 && DBusSerializable.class.isAssignableFrom((Class<?>)var20.getRawType())) {
                  if (!(types[var18] instanceof Class<? extends DBusSerializable> dsc)) {
                     dsc = (Class<? extends DBusSerializable>)((ParameterizedType)types[var18]).getRawType();
                  }

                  for (Method m : dsc.getDeclaredMethods()) {
                     if (m.getName().equals("deserialize")) {
                        Type[] newtypes = m.getGenericParameterTypes();

                        try {
                           Object[] _ex = new Object[newtypes.length];
                           System.arraycopy(parameters, var18, _ex, 0, newtypes.length);
                           _ex = deSerializeParameters(_ex, newtypes, _conn);
                           DBusSerializable sz = dsc.getDeclaredConstructor().newInstance();
                           m.invoke(sz, _ex);
                           Object[] compress = new Object[parameters.length - newtypes.length + 1];
                           System.arraycopy(parameters, 0, compress, 0, var18);
                           compress[var18] = sz;
                           System.arraycopy(parameters, var18 + newtypes.length, compress, var18 + 1, parameters.length - var18 - newtypes.length);
                           parameters = compress;
                        } catch (ArrayIndexOutOfBoundsException var16) {
                           LOGGER.debug("", var16);
                           throw new DBusException(
                              String.format(
                                 "Not enough elements to create custom object from serialized data (%s < %s).", parameters.length - var18, newtypes.length
                              )
                           );
                        }
                     }
                  }
               } else {
                  parameters[var18] = deSerializeParameter(parameters[var18], types[var18], _conn);
               }
            }
         }

         return parameters;
      }
   }

   static {
      CLASS_TO_ARGUMENTTYPE.put(Boolean.class, (byte)98);
      CLASS_TO_ARGUMENTTYPE.put(boolean.class, (byte)98);
      CLASS_TO_ARGUMENTTYPE.put(Byte.class, (byte)121);
      CLASS_TO_ARGUMENTTYPE.put(byte.class, (byte)121);
      CLASS_TO_ARGUMENTTYPE.put(Short.class, (byte)110);
      CLASS_TO_ARGUMENTTYPE.put(short.class, (byte)110);
      CLASS_TO_ARGUMENTTYPE.put(Integer.class, (byte)105);
      CLASS_TO_ARGUMENTTYPE.put(int.class, (byte)105);
      CLASS_TO_ARGUMENTTYPE.put(Long.class, (byte)120);
      CLASS_TO_ARGUMENTTYPE.put(long.class, (byte)120);
      CLASS_TO_ARGUMENTTYPE.put(Double.class, (byte)100);
      CLASS_TO_ARGUMENTTYPE.put(double.class, (byte)100);
      if (AbstractConnection.FLOAT_SUPPORT) {
         CLASS_TO_ARGUMENTTYPE.put(Float.class, (byte)102);
         CLASS_TO_ARGUMENTTYPE.put(float.class, (byte)102);
      } else {
         CLASS_TO_ARGUMENTTYPE.put(Float.class, (byte)100);
         CLASS_TO_ARGUMENTTYPE.put(float.class, (byte)100);
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

   private static String[] recursiveGetDBusType(StringBuffer[] _out, Type _level, boolean _dataType, int _basic) throws DBusException {
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
         throw new DBusException(_dataType + " is not a basic type");
      }

      if (_dataType instanceof TypeVariable) {
         _out[_level].append('v');
      } else if (_dataType instanceof GenericArrayType var18) {
         _out[_level].append('a');
         String[] var25 = recursiveGetDBusType(_out, var18.getGenericComponentType(), false, _level + 1);
         if (var25.length != 1) {
            throw new DBusException("Multi-valued array types not permitted");
         }

         _out[_level].append(var25[0]);
      } else {
         if (_dataType instanceof Class && DBusSerializable.class.isAssignableFrom((Class<?>)_dataType)
            || _dataType instanceof ParameterizedType pt && DBusSerializable.class.isAssignableFrom((Class<?>)pt.getRawType())) {
            Type[] var24 = null;
            if (_dataType instanceof Class<?> var32) {
               for (Method var54 : var32.getDeclaredMethods()) {
                  if (var54.getName().equals("deserialize")) {
                     var24 = var54.getGenericParameterTypes();
                  }
               }
            } else {
               for (Method var55 : ((Class)((ParameterizedType)_dataType).getRawType()).getDeclaredMethods()) {
                  if (var55.getName().equals("deserialize")) {
                     var24 = var55.getGenericParameterTypes();
                  }
               }
            }

            if (null == var24) {
               throw new DBusException("Serializable classes must implement a deserialize method");
            }

            String[] var33 = new String[var24.length];

            for (int var40 = 0; var40 < var33.length; var40++) {
               String[] var46 = recursiveGetDBusType(_out, var24[var40], false, _level + 1);
               if (1 != var46.length) {
                  throw new DBusException("Serializable classes must serialize to native DBus types");
               }

               var33[var40] = var46[0];
            }

            return var33;
         }

         if (!(_dataType instanceof ParameterizedType p)) {
            if (_dataType instanceof Class<?> dataTypeClazz) {
               if (dataTypeClazz.isArray()) {
                  if (Type.class.equals(((Class)_dataType).getComponentType())) {
                     _out[_level].append('g');
                  } else {
                     _out[_level].append('a');
                     String[] var21 = recursiveGetDBusType(_out, ((Class)_dataType).getComponentType(), false, _level + 1);
                     if (var21.length != 1) {
                        throw new DBusException("Multi-valued array types not permitted");
                     }

                     _out[_level].append(var21[0]);
                  }
               } else if (Struct.class.isAssignableFrom((Class<?>)_dataType)) {
                  _out[_level].append('(');
                  Type[] var22 = Container.getTypeCache(_dataType);
                  if (null == var22) {
                     Field[] var29 = ((Class)_dataType).getDeclaredFields();
                     var22 = new Type[var29.length];

                     for (Field var52 : var29) {
                        Position p = var52.getAnnotation(Position.class);
                        if (null != p) {
                           var22[p.value()] = var52.getGenericType();
                        }
                     }

                     Container.putTypeCache(_dataType, var22);
                  }

                  for (Type var49 : var22) {
                     if (var49 != null) {
                        for (String s : recursiveGetDBusType(_out, var49, false, _level + 1)) {
                           _out[_level].append(s);
                        }
                     }
                  }

                  _out[_level].append(')');
               } else if (Enum.class.isAssignableFrom(dataTypeClazz)) {
                  _out[_level].append('s');
               } else {
                  boolean var23 = false;

                  for (Entry var37 : CLASS_TO_ARGUMENTTYPE.entrySet()) {
                     if (((Class)var37.getKey()).isAssignableFrom(dataTypeClazz)) {
                        _out[_level].append((char)((Byte)var37.getValue()).byteValue());
                        var23 = true;
                        break;
                     }
                  }

                  if (!var23) {
                     throw new DBusException("Exporting non-exportable type: " + _dataType);
                  }
               }
            }
         } else if (p.getRawType().equals(Map.class)) {
            _out[_level].append("a{");
            Type[] var20 = p.getActualTypeArguments();

            try {
               String[] var27 = recursiveGetDBusType(_out, var20[0], true, _level + 1);
               if (var27.length != 1) {
                  throw new DBusException("Multi-valued array types not permitted");
               }

               _out[_level].append(var27[0]);
               ArrayIndexOutOfBoundsException _ex = recursiveGetDBusType(_out, var20[1], false, _level + 1);
               if (((Object[])_ex).length != 1) {
                  throw new DBusException("Multi-valued array types not permitted");
               }

               _out[_level].append(((Object[])_ex)[0]);
            } catch (ArrayIndexOutOfBoundsException var17) {
               LOGGER.debug("", var17);
               throw new DBusException("Map must have 2 parameters");
            }

            _out[_level].append('}');
         } else if (List.class.isAssignableFrom((Class<?>)p.getRawType())) {
            for (Type t : p.getActualTypeArguments()) {
               if (Type.class.equals(t)) {
                  _out[_level].append('g');
               } else {
                  String[] tx = recursiveGetDBusType(_out, t, false, _level + 1);
                  if (tx.length != 1) {
                     throw new DBusException("Multi-valued array types not permitted");
                  }

                  _out[_level].append('a');
                  _out[_level].append(tx[0]);
               }
            }
         } else if (p.getRawType().equals(Variant.class)) {
            _out[_level].append('v');
         } else if (DBusInterface.class.isAssignableFrom((Class<?>)p.getRawType())) {
            _out[_level].append('o');
         } else {
            if (!Struct.class.isAssignableFrom((Class<?>)p.getRawType())) {
               if (!Tuple.class.isAssignableFrom((Class<?>)p.getRawType())) {
                  throw new DBusException("Exporting non-exportable parameterized type " + _dataType);
               }

               Type[] var19 = p.getActualTypeArguments();
               List<String> var26 = new ArrayList();

               for (Type f : var19) {
                  Collections.addAll(var26, recursiveGetDBusType(_out, f, false, _level + 1));
               }

               return var26.toArray(new String[0]);
            }

            _out[_level].append('(');
         }
      }

      LOGGER.trace("Converted Java type: {} to D-Bus Type: {}", _dataType, _out[_level]);
      return new String[]{_out[_level].toString()};
   }
}

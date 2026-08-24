package org.freedesktop.dbus;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.slf4j.LoggerFactory;

// $VF: Compiled from ArrayFrob.java
public final class ArrayFrob {
   private static final Map<Class<?>, Class<?>> PRIMITIVE_TO_WRAPPER = new ConcurrentHashMap<>();
   private static final Map<Class<?>, Class<?>> WRAPPER_TO_PRIMITIVE = new ConcurrentHashMap<>();

   public static <T> T[] delist(List<T> _c, Class<T> _l) throws IllegalArgumentException {
      return (T[])_l.toArray((T[])((Object[])Array.newInstance(_c, 0)));
   }

   public static <T> List<T> listify(Object _o) throws IllegalArgumentException {
      if (_o instanceof Object[]) {
         return listify((T[])((Object[])_o));
      }

      if (!_o.getClass().isArray()) {
         throw new IllegalArgumentException("Not an array");
      }

      List<T> l = new ArrayList<>(Array.getLength(_o));

      for (int i = 0; i < Array.getLength(_o); i++) {
         l.add((T)Array.get(_o, i));
      }

      return l;
   }

   static {
      PRIMITIVE_TO_WRAPPER.put(boolean.class, Boolean.class);
      PRIMITIVE_TO_WRAPPER.put(byte.class, Byte.class);
      PRIMITIVE_TO_WRAPPER.put(short.class, Short.class);
      PRIMITIVE_TO_WRAPPER.put(char.class, Character.class);
      PRIMITIVE_TO_WRAPPER.put(int.class, Integer.class);
      PRIMITIVE_TO_WRAPPER.put(long.class, Long.class);
      PRIMITIVE_TO_WRAPPER.put(float.class, Float.class);
      PRIMITIVE_TO_WRAPPER.put(double.class, Double.class);
      WRAPPER_TO_PRIMITIVE.put(Boolean.class, boolean.class);
      WRAPPER_TO_PRIMITIVE.put(Byte.class, byte.class);
      WRAPPER_TO_PRIMITIVE.put(Short.class, short.class);
      WRAPPER_TO_PRIMITIVE.put(Character.class, char.class);
      WRAPPER_TO_PRIMITIVE.put(Integer.class, int.class);
      WRAPPER_TO_PRIMITIVE.put(Long.class, long.class);
      WRAPPER_TO_PRIMITIVE.put(Float.class, float.class);
      WRAPPER_TO_PRIMITIVE.put(Double.class, double.class);
   }

   public static <T> Object unwrap(T[] _ns) throws IllegalArgumentException {
      Class<? extends T[]> ac = (Class<? extends T[]>)_ns.getClass();
      Class<T> cc = (Class<T>)ac.getComponentType();
      Class<? extends Object> ncc = WRAPPER_TO_PRIMITIVE.get(cc);
      if (null == ncc) {
         throw new IllegalArgumentException("Not a wrapper type");
      }

      Object o = Array.newInstance(ncc, _ns.length);

      for (int i = 0; i < _ns.length; i++) {
         Array.set(o, i, _ns[i]);
      }

      return o;
   }

   public static <T> T[] wrap(Object _o) throws IllegalArgumentException {
      Class<? extends Object> ac = (Class<? extends Object>)_o.getClass();
      if (!ac.isArray()) {
         throw new IllegalArgumentException("Not an array");
      }

      Class<? extends Object> cc = (Class<? extends Object>)ac.getComponentType();
      Class<? extends Object> ncc = PRIMITIVE_TO_WRAPPER.get(cc);
      if (null == ncc) {
         throw new IllegalArgumentException("Not a primitive type");
      }

      T[] ns = (Object[])Array.newInstance(ncc, Array.getLength(_o));

      for (int i = 0; i < ns.length; i++) {
         ns[i] = Array.get(_o, i);
      }

      return (T[])ns;
   }

   public static Map<Class<?>, Class<?>> getPrimitiveToWrapperTypes() {
      return Collections.unmodifiableMap(PRIMITIVE_TO_WRAPPER);
   }

   public static Map<Class<?>, Class<?>> getWrapperToPrimitiveTypes() {
      return Collections.unmodifiableMap(WRAPPER_TO_PRIMITIVE);
   }

   public static <T> List<T> listify(T[] _ns) throws IllegalArgumentException {
      return Arrays.asList(_ns);
   }

   public static Object[] type(Object[] _old, Class<Object> _c) {
      Object[] ns = (Object[])Array.newInstance(_c, _old.length);
      System.arraycopy(_old, 0, ns, 0, ns.length);
      return ns;
   }

   public static Object convert(Object _o, Class<? extends Object> _c) throws IllegalArgumentException {
      try {
         if (List.class.equals(_c) && _o instanceof List) {
            return _o;
         }

         if (List.class.equals(_c) && _o.getClass().isArray()) {
            return listify(_o);
         }

         if (_o.getClass().isArray() && _c.isArray() && _o.getClass().getComponentType().equals(_c.getComponentType())) {
            return _o;
         }

         if (_o.getClass().isArray() && _c.isArray() && _o.getClass().getComponentType().isPrimitive()) {
            return wrap(_o);
         }

         if (_o.getClass().isArray() && _c.isArray() && _c.getComponentType().isPrimitive()) {
            return unwrap((Object[])_o);
         }

         if (_o instanceof List && _c.isArray() && _c.getComponentType().isPrimitive()) {
            return delistprimitive((List<?>)_o, _c.getComponentType());
         }

         if (_o instanceof List && _c.isArray()) {
            return delist((List<?>)_o, _c.getComponentType());
         }

         if (_o.getClass().isArray() && _c.isArray()) {
            return type((Object[])_o, (Class<Object>)_c.getComponentType());
         }
      } catch (Exception _ex) {
         LoggerFactory.getLogger(ArrayFrob.class).debug("Cannot convert object.", _ex);
         throw new IllegalArgumentException(_ex);
      }

      throw new IllegalArgumentException(String.format("Not An Expected Convertion type from %s to %s", _o.getClass(), _c));
   }

   private ArrayFrob() {
   }

   public static <T> Object delistprimitive(List<T> _c, Class<T> _l) throws IllegalArgumentException {
      Object o = Array.newInstance(_c, _l.size());

      for (int i = 0; i < _l.size(); i++) {
         Array.set(o, i, _l.get(i));
      }

      return o;
   }
}

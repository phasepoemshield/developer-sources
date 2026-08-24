package org.freedesktop.dbus.types;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.utils.DBusObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from Variant.java
public class Variant<T> {
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final Type type;
   private final T value;
   private final String sig;

   @Override
   public String toString() {
      return "[" + this.value + "]";
   }

   public T getValue() {
      return this.value;
   }

   public Type getType() {
      return this.type;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.value);
   }

   public Variant(T _value, Type _type) throws IllegalArgumentException {
      DBusObjects.requireNotNull(_value, () -> new IllegalArgumentException("Can't wrap Null in a Variant"));
      this.type = _type;

      try {
         String[] _ex = Marshalling.getDBusType(_type);
         if (_ex.length != 1) {
            throw new IllegalArgumentException("Can't wrap a multi-valued type in a Variant: " + _type);
         }

         this.sig = _ex[0];
      } catch (DBusException var4) {
         this.logger.debug("Cannot create variant", var4);
         throw new IllegalArgumentException(String.format("Can't wrap %s in an unqualified Variant (%s).", _type, var4.getMessage()));
      }

      this.value = _value;
   }

   @Override
   public boolean equals(Object _obj) {
      if (this == _obj) {
         return true;
      } else {
         return !(_obj instanceof Variant<?> other) ? false : Objects.equals(this.value, other.value);
      }
   }

   public String getSig() {
      return this.sig;
   }

   public Variant(T _value) throws IllegalArgumentException {
      DBusObjects.requireNotNull(_value, () -> new IllegalArgumentException("Can't wrap Null in a Variant"));
      this.type = _value.getClass();

      try {
         String[] _ex = Marshalling.getDBusType(_value.getClass(), true);
         if (_ex.length != 1) {
            throw new IllegalArgumentException("Can't wrap a multi-valued type in a Variant: " + this.type);
         }

         this.sig = _ex[0];
      } catch (DBusException var3) {
         this.logger.debug("Cannot create variant", var3);
         throw new IllegalArgumentException(String.format("Can't wrap %s in an unqualified Variant (%s).", _value.getClass(), var3.getMessage()));
      }

      this.value = _value;
   }

   public Variant(T _sig, String _value) throws IllegalArgumentException {
      DBusObjects.requireNotNull(_value, () -> new IllegalArgumentException("Can't wrap Null in a Variant"));
      this.sig = _sig;

      try {
         List<Type> _ex = new ArrayList();
         Marshalling.getJavaType(_sig, _ex, 1);
         if (_ex.size() != 1) {
            throw new IllegalArgumentException("Can't wrap multiple or no types in a Variant: " + _sig);
         }

         this.type = (Type)_ex.get(0);
      } catch (DBusException var4) {
         this.logger.debug("Cannot create variant", var4);
         throw new IllegalArgumentException(String.format("Can''t wrap %s in an unqualified Variant (%s).", _sig, var4.getMessage()));
      }

      this.value = _value;
   }
}

package org.freedesktop.dbus.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

// $VF: Compiled from DBusListType.java
public class DBusListType implements ParameterizedType {
   private final Type v;

   @Override
   public Type getOwnerType() {
      return null;
   }

   @Override
   public Type[] getActualTypeArguments() {
      return new Type[]{this.v};
   }

   public DBusListType(Type _v) {
      this.v = _v;
   }

   @Override
   public Type getRawType() {
      return List.class;
   }
}

package org.freedesktop.dbus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.freedesktop.dbus.annotations.Position;
import org.slf4j.LoggerFactory;

// $VF: Compiled from Container.java
public abstract class Container {
   private static final Map<Type, Type[]> TYPE_CACHE = new HashMap<>();
   private Object[] parameters = null;

   static Type[] getTypeCache(Type _k) {
      return TYPE_CACHE.get(_k);
   }

   @Override
   public final boolean equals(Object _other) {
      if (this == _other) {
         return true;
      } else if (_other == null) {
         return false;
      } else if (_other instanceof Container cont) {
         return this.getClass().equals(cont.getClass()) ? Arrays.equals(this.getParameters(), cont.getParameters()) : false;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int prime = 31;
      int result = 1;
      return 31 * result + Arrays.deepHashCode(this.parameters);
   }

   static void putTypeCache(Type _k, Type[] _v) {
      TYPE_CACHE.put(_k, _v);
   }

   public final Object[] getParameters() {
      if (null != this.parameters) {
         return this.parameters;
      }

      this.setup();
      return this.parameters;
   }

   @Override
   public final String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.getClass().getName()).append("<");
      if (null == this.parameters) {
         this.setup();
      }

      if (0 == this.parameters.length) {
         return sb.append(">").toString();
      }

      sb.append(Arrays.stream(this.parameters).map(Objects::toString).collect(Collectors.joining(", ")));
      return sb.append(">").toString();
   }

   Container() {
   }

   private void setup() {
      Field[] fs = this.getClass().getDeclaredFields();
      Object[] args = new Object[fs.length];
      int diff = 0;

      for (Field f : fs) {
         if (!f.isAnnotationPresent(Position.class)) {
            diff++;
         } else {
            Position p = f.getAnnotation(Position.class);
            f.setAccessible(true);

            try {
               args[p.value()] = f.get(this);
            } catch (IllegalAccessException var10) {
               LoggerFactory.getLogger(this.getClass()).trace("Could not set value", var10);
            }
         }
      }

      this.parameters = new Object[args.length - diff];
      System.arraycopy(args, 0, this.parameters, 0, this.parameters.length);
   }
}

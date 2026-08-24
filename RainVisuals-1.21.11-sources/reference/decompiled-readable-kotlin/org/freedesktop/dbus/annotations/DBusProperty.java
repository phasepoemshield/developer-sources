package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.freedesktop.dbus.types.Variant;

// $VF: Compiled from DBusProperty.java
@Repeatable(DBusProperties.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DBusProperty {
   String name();

   DBusProperty.Access access() default DBusProperty.Access.READ_WRITE;

   Class<?> type() default Variant.class;

   // $VF: Compiled from DBusProperty.java
   enum Access {
      READ("read"),
      READ_WRITE("readwrite"),
      WRITE("write");

      private final String accessName;

      Access(String _accessName) {
         this.accessName = _accessName;
      }

      public String getAccessName() {
         return this.accessName;
      }
   }
}

package org.freedesktop.dbus.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// $VF: Compiled from PropertiesEmitsChangedSignal.java
@DBusInterfaceName("org.freedesktop.DBus.Property.EmitsChangedSignal")
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PropertiesEmitsChangedSignal {
   PropertiesEmitsChangedSignal.EmitChangeSignal value();

   // $VF: Compiled from PropertiesEmitsChangedSignal.java
   enum EmitChangeSignal {
      FALSE,
      CONST,
      INVALIDATES,
      TRUE;

      @Override
      public String toString() {
         return this.name().toLowerCase();
      }
   }
}

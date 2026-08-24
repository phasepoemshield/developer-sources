package org.freedesktop.dbus.interfaces;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.Variant;

// $VF: Compiled from Properties.java
@DBusInterfaceName("org.freedesktop.DBus.Properties")
public interface Properties extends DBusInterface {
   <A> A Get(String var1, String var2);

   Map<String, Variant<?>> GetAll(String var1);

   <A> void Set(String var1, String var2, A var3);

   // $VF: Compiled from Properties.java
   class PropertiesChanged extends DBusSignal {
      private final List<String> propertiesRemoved;
      private final String interfaceName;
      private final Map<String, Variant<?>> propertiesChanged;

      public List<String> getPropertiesRemoved() {
         return this.propertiesRemoved;
      }

      public Map<String, Variant<?>> getPropertiesChanged() {
         return this.propertiesChanged;
      }

      public String getInterfaceName() {
         return this.interfaceName;
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName()
            + "[propertiesChanged="
            + this.propertiesChanged
            + ", propertiesRemoved="
            + this.propertiesRemoved
            + ", interfaceName='"
            + this.interfaceName
            + "']";
      }

      public PropertiesChanged(String _propertiesRemoved, String _interfaceName, Map<String, Variant<?>> _propertiesChanged, List<String> _path) throws DBusException {
         super(_path, _interfaceName, _propertiesChanged, _propertiesRemoved);
         this.propertiesChanged = _propertiesChanged;
         this.propertiesRemoved = _propertiesRemoved;
         this.interfaceName = _interfaceName;
      }
   }
}

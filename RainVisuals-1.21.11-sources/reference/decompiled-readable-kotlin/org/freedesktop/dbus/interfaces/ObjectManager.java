package org.freedesktop.dbus.interfaces;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.Variant;

// $VF: Compiled from ObjectManager.java
@DBusInterfaceName("org.freedesktop.DBus.ObjectManager")
public interface ObjectManager extends DBusInterface {
   Map<DBusPath, Map<String, Map<String, Variant<?>>>> GetManagedObjects();

   // $VF: Compiled from ObjectManager.java
   class InterfacesAdded extends DBusSignal {
      public final DBusPath signalSource;
      public final String objectPath;
      public final Map<String, Map<String, Variant<?>>> interfaces;

      public DBusPath getSignalSource() {
         return this.signalSource;
      }

      public String getObjectPath() {
         return this.objectPath;
      }

      public Map<String, Map<String, Variant<?>>> getInterfaces() {
         return this.interfaces;
      }

      public InterfacesAdded(String _source, DBusPath _objectPath, Map<String, Map<String, Variant<?>>> _interfaces) throws DBusException {
         super(_objectPath, _source, _interfaces);
         this.objectPath = _objectPath;
         this.signalSource = _source;
         this.interfaces = _interfaces;
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName()
            + "[signalSource="
            + this.signalSource
            + ", objectPath='"
            + this.objectPath
            + "', interfaces="
            + this.interfaces
            + "]";
      }
   }

   // $VF: Compiled from ObjectManager.java
   class InterfacesRemoved extends DBusSignal {
      public final String objectPath;
      public final List<String> interfaces;
      public final DBusPath signalSource;

      public DBusPath getSignalSource() {
         return this.signalSource;
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName()
            + "[signalSource="
            + this.signalSource
            + ", objectPath='"
            + this.objectPath
            + "', interfaces="
            + this.interfaces
            + "]";
      }

      public InterfacesRemoved(String _objectPath, DBusPath _source, List<String> _interfaces) throws DBusException {
         super(_objectPath, _source, _interfaces);
         this.objectPath = _objectPath;
         this.signalSource = _source;
         this.interfaces = _interfaces;
      }

      public List<String> getInterfaces() {
         return this.interfaces;
      }

      public String getObjectPath() {
         return this.objectPath;
      }
   }
}

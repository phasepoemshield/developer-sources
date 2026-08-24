package org.freedesktop.dbus.interfaces;

import java.util.Map;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.errors.MatchRuleInvalid;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.types.Variant;

// $VF: Compiled from DBus.java
@DBusInterfaceName("org.freedesktop.DBus")
public interface DBus extends DBusInterface {
   int DBUS_REQUEST_NAME_REPLY_IN_QUEUE = 2;
   int DBUS_RELEASE_NAME_REPLY_NON_EXISTANT = 2;
   int DBUS_RELEASE_NAME_REPLY_RELEASED = 1;
   int DBUS_REQUEST_NAME_REPLY_ALREADY_OWNER = 4;
   int DBUS_START_REPLY_SUCCESS = 1;
   int DBUS_NAME_FLAG_DO_NOT_QUEUE = 4;
   int DBUS_NAME_FLAG_REPLACE_EXISTING = 2;
   int DBUS_START_REPLY_ALREADY_RUNNING = 2;
   int DBUS_REQUEST_NAME_REPLY_PRIMARY_OWNER = 1;
   int DBUS_RELEASE_NAME_REPLY_NOT_OWNER = 3;
   int DBUS_NAME_FLAG_ALLOW_REPLACEMENT = 1;
   int DBUS_REQUEST_NAME_REPLY_EXISTS = 3;

   UInt32 RequestName(String var1, UInt32 var2);

   void UpdateActivationEnvironment(Map<String, String>[] var1);

   boolean NameHasOwner(String var1);

   String[] ListActivatableNames();

   String[] ListNames();

   UInt32 StartServiceByName(String var1, UInt32 var2);

   UInt32 GetConnectionUnixUser(String var1);

   UInt32 ReleaseName(String var1);

   Byte[] GetAdtAuditSessionData(String var1);

   Map<String, Variant<?>> GetConnectionCredentials(String var1);

   void RemoveMatch(String var1) throws MatchRuleInvalid;

   String GetNameOwner(String var1);

   UInt32 GetConnectionUnixProcessID(String var1);

   String GetId();

   void AddMatch(String var1) throws MatchRuleInvalid;

   Byte[] GetConnectionSELinuxSecurityContext(String var1);

   String Hello();

   String[] ListQueuedOwners(String var1);

   // $VF: Compiled from DBus.java
   class NameAcquired extends DBusSignal {
      public final String name;

      public NameAcquired(String _path, String _name) throws DBusException {
         super(_path, _name);
         this.name = _name;
      }
   }

   // $VF: Compiled from DBus.java
   class NameLost extends DBusSignal {
      public final String name;

      public NameLost(String _name, String _path) throws DBusException {
         super(_path, _name);
         this.name = _name;
      }
   }

   // $VF: Compiled from DBus.java
   class NameOwnerChanged extends DBusSignal {
      public final String oldOwner;
      public final String name;
      public final String newOwner;

      public NameOwnerChanged(String _newOwner, String _name, String _path, String _oldOwner) throws DBusException {
         super(_path, _name, _oldOwner, _newOwner);
         this.name = _name;
         this.oldOwner = _oldOwner;
         this.newOwner = _newOwner;
      }
   }
}

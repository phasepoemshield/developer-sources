package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.annotations.DBusInterfaceName;

// $VF: Compiled from Peer.java
@DBusInterfaceName("org.freedesktop.DBus.Peer")
public interface Peer extends DBusInterface {
   void Ping();

   String GetMachineId();
}

package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.types.UInt32;

// $VF: Compiled from Monitoring.java
@DBusInterfaceName("org.freedesktop.DBus.Monitoring.BecomeMonitor")
public interface Monitoring {
   void BecomeMonitor(String[] var1, UInt32 var2);
}

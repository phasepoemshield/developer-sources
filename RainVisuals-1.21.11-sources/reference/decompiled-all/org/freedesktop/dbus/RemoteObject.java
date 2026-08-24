package org.freedesktop.dbus;

import org.freedesktop.dbus.interfaces.DBusInterface;

// $VF: Compiled from RemoteObject.java
public class RemoteObject {
   private final Class<? extends DBusInterface> iface;
   private final String objectpath;
   private final boolean autostart;
   private final String busname;

   @Override
   public boolean equals(Object _o) {
      if (!(_o instanceof RemoteObject them)) {
         return false;
      } else if (!them.objectpath.equals(this.objectpath)) {
         return false;
      } else if (null == this.busname && null != them.busname) {
         return false;
      } else if (null != this.busname && null == them.busname) {
         return false;
      } else if (null != them.busname && !them.busname.equals(this.busname)) {
         return false;
      } else if (null == this.iface && null != them.iface) {
         return false;
      } else {
         return null != this.iface && null == them.iface ? false : null == them.iface || them.iface.equals(this.iface);
      }
   }

   @Override
   public String toString() {
      return this.busname + ":" + this.objectpath + ":" + this.iface;
   }

   public String getBusName() {
      return this.busname;
   }

   public RemoteObject(String _iface, String _busname, Class<? extends DBusInterface> _autostart, boolean _objectpath) {
      this.busname = _busname;
      this.objectpath = _objectpath;
      this.iface = _iface;
      this.autostart = _autostart;
   }

   public String getObjectPath() {
      return this.objectpath;
   }

   public boolean isAutostart() {
      return this.autostart;
   }

   @Override
   public int hashCode() {
      return (null == this.busname ? 0 : this.busname.hashCode()) + this.objectpath.hashCode() + (null == this.iface ? 0 : this.iface.hashCode());
   }

   public Class<? extends DBusInterface> getInterface() {
      return this.iface;
   }
}

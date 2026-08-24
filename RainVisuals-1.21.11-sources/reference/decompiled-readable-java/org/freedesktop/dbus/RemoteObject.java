/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import org.freedesktop.dbus.interfaces.DBusInterface;

public class RemoteObject {
    private final Class<? extends DBusInterface> iface;
    private final String objectpath;
    private final boolean autostart;
    private final String busname;

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object _o) {
        void var2_2;
        if (!(_o instanceof RemoteObject)) {
            return false;
        }
        RemoteObject them = (RemoteObject)_o;
        if (!them.objectpath.equals(this.objectpath)) {
            return false;
        }
        if (null == this.busname) {
            if (null != them.busname) {
                return false;
            }
        }
        if (null != this.busname) {
            if (null == them.busname) {
                return false;
            }
        }
        if (null != them.busname) {
            if (!them.busname.equals(this.busname)) {
                return false;
            }
        }
        if (null == this.iface) {
            if (null != them.iface) {
                return false;
            }
        }
        if (null != this.iface) {
            if (null == them.iface) {
                return false;
            }
        }
        if (null != var2_2.iface) {
            if (!var2_2.iface.equals(this.iface)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.busname + ":" + this.objectpath + ":" + String.valueOf(this.iface);
    }

    public String getBusName() {
        return this.busname;
    }

    public RemoteObject(String _busname, String _objectpath, Class<? extends DBusInterface> _iface, boolean _autostart) {
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

    public int hashCode() {
        return (null == this.busname ? 0 : this.busname.hashCode()) + this.objectpath.hashCode() + (null == this.iface ? 0 : this.iface.hashCode());
    }

    public Class<? extends DBusInterface> getInterface() {
        return this.iface;
    }
}


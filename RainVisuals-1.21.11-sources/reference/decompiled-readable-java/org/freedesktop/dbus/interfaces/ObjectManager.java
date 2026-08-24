/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.interfaces;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.DBusPath;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.Variant;

@DBusInterfaceName(value="org.freedesktop.DBus.ObjectManager")
public interface ObjectManager
extends DBusInterface {
    public Map<DBusPath, Map<String, Map<String, Variant<?>>>> GetManagedObjects();

    public static class InterfacesAdded
    extends DBusSignal {
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

        /*
         * WARNING - void declaration
         */
        public InterfacesAdded(String _objectPath, DBusPath _source, Map<String, Map<String, Variant<?>>> _interfaces) throws DBusException {
            void var3_3;
            Object[] objectArray = new Object[2];
            objectArray[0] = _source;
            objectArray[1] = _interfaces;
            super(_objectPath, objectArray);
            this.objectPath = _objectPath;
            this.signalSource = _source;
            this.interfaces = var3_3;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "[signalSource=" + String.valueOf(this.signalSource) + ", objectPath='" + this.objectPath + "', interfaces=" + String.valueOf(this.interfaces) + "]";
        }
    }

    public static class InterfacesRemoved
    extends DBusSignal {
        public final String objectPath;
        public final List<String> interfaces;
        public final DBusPath signalSource;

        public DBusPath getSignalSource() {
            return this.signalSource;
        }

        @Override
        public String toString() {
            return this.getClass().getSimpleName() + "[signalSource=" + String.valueOf(this.signalSource) + ", objectPath='" + this.objectPath + "', interfaces=" + String.valueOf(this.interfaces) + "]";
        }

        /*
         * WARNING - void declaration
         */
        public InterfacesRemoved(String _objectPath, DBusPath _source, List<String> _interfaces) throws DBusException {
            void var3_3;
            Object[] objectArray = new Object[2];
            objectArray[0] = _source;
            objectArray[1] = _interfaces;
            super(_objectPath, objectArray);
            this.objectPath = _objectPath;
            this.signalSource = _source;
            this.interfaces = var3_3;
        }

        public List<String> getInterfaces() {
            return this.interfaces;
        }

        public String getObjectPath() {
            return this.objectPath;
        }
    }
}


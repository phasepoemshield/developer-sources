/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.interfaces;

import java.util.List;
import java.util.Map;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.types.Variant;

@DBusInterfaceName(value="org.freedesktop.DBus.Properties")
public interface Properties
extends DBusInterface {
    public <A> A Get(String var1, String var2);

    public Map<String, Variant<?>> GetAll(String var1);

    public <A> void Set(String var1, String var2, A var3);

    public static class PropertiesChanged
    extends DBusSignal {
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
            return this.getClass().getSimpleName() + "[propertiesChanged=" + String.valueOf(this.propertiesChanged) + ", propertiesRemoved=" + String.valueOf(this.propertiesRemoved) + ", interfaceName='" + this.interfaceName + "']";
        }

        /*
         * WARNING - void declaration
         */
        public PropertiesChanged(String _path, String _interfaceName, Map<String, Variant<?>> _propertiesChanged, List<String> _propertiesRemoved) throws DBusException {
            void var2_2;
            Object[] objectArray = new Object[3];
            objectArray[0] = _interfaceName;
            objectArray[1] = _propertiesChanged;
            objectArray[2] = _propertiesRemoved;
            super(_path, objectArray);
            this.propertiesChanged = _propertiesChanged;
            this.propertiesRemoved = _propertiesRemoved;
            this.interfaceName = var2_2;
        }
    }
}


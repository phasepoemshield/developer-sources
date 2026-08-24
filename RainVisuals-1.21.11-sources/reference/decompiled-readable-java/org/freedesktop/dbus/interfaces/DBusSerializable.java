/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.exceptions.DBusException;

public interface DBusSerializable {
    public Object[] serialize() throws DBusException;
}


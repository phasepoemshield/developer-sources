/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.interfaces;

import org.freedesktop.dbus.messages.DBusSignal;

public interface DBusSigHandler<T extends DBusSignal> {
    public void handle(T var1);
}


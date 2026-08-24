/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.interfaces;

public interface DBusInterface {
    public String getObjectPath();

    default public boolean isRemote() {
        return false;
    }
}


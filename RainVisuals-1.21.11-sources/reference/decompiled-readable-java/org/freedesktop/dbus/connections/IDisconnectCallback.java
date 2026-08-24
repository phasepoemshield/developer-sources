/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections;

import java.io.IOException;

public interface IDisconnectCallback {
    default public void disconnectOnError(IOException _ex) {
    }

    default public void requestedDisconnect(Integer _connectionId) {
    }

    default public void exceptionOnTerminate(IOException _ex) {
    }

    default public void clientDisconnect() {
    }
}


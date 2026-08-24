/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.exceptions;

public class InvalidBusAddressException
extends IllegalStateException {
    private static final long serialVersionUID = 1L;

    public InvalidBusAddressException(String _s) {
        super(_s);
    }

    public InvalidBusAddressException() {
    }

    public InvalidBusAddressException(Throwable _cause) {
        super(_cause);
    }

    public InvalidBusAddressException(String _message, Throwable _cause) {
        super(_message, _cause);
    }
}


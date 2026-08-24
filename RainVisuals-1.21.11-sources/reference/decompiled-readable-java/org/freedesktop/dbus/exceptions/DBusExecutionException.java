/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.exceptions;

public class DBusExecutionException
extends RuntimeException {
    private String type;
    private static final long serialVersionUID = 6327661667731344250L;

    public DBusExecutionException(String _message, Throwable _cause) {
        super(_message, _cause);
    }

    public void setType(String _type) {
        this.type = _type;
    }

    public DBusExecutionException(String _message) {
        super(_message);
    }

    public String getType() {
        if (null == this.type) {
            return this.getClass().getName();
        }
        return this.type;
    }
}


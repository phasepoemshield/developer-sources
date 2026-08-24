/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.util.Objects;

public class DBusPath
implements Comparable<DBusPath> {
    private String path;

    public String getPath() {
        return this.path;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object _other) {
        if (!(_other instanceof DBusPath)) return false;
        DBusPath dp = (DBusPath)_other;
        if (this.getPath() == null) return false;
        if (!this.getPath().equals(dp.getPath())) return false;
        return true;
    }

    @Override
    public int compareTo(DBusPath _that) {
        block3: {
            block2: {
                if (this.getPath() == null) break block2;
                if (_that != null) break block3;
            }
            return 0;
        }
        return this.getPath().compareTo(_that.getPath());
    }

    public DBusPath(String _path) {
        this.setPath(_path);
    }

    public void setPath(String _path) {
        this.path = _path;
    }

    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        Object[] objectArray = new Object[1];
        objectArray[0] = this.path;
        int n = 31 * result + Objects.hash(objectArray);
        return n;
    }

    public String toString() {
        return this.getPath();
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.config;

import java.util.OptionalLong;
import org.freedesktop.dbus.connections.SASL;

public class SaslConfig {
    private int authMode = 0;
    private boolean fileDescriptorSupport;
    private String guid;
    private SASL.SaslMode mode = SASL.SaslMode.CLIENT;
    private boolean strictCookiePermissions;
    private OptionalLong saslUid = OptionalLong.empty();

    public void setFileDescriptorSupport(boolean _fileDescriptorSupport) {
        this.fileDescriptorSupport = _fileDescriptorSupport;
    }

    public OptionalLong getSaslUid() {
        return this.saslUid;
    }

    public void setAuthMode(int _types) {
        this.authMode = _types;
    }

    SaslConfig() {
    }

    public boolean isStrictCookiePermissions() {
        return this.strictCookiePermissions;
    }

    public boolean isFileDescriptorSupport() {
        return this.fileDescriptorSupport;
    }

    public String getGuid() {
        return this.guid;
    }

    public int getAuthMode() {
        return this.authMode;
    }

    public SASL.SaslMode getMode() {
        return this.mode;
    }

    public void setStrictCookiePermissions(boolean _strictCookiePermissions) {
        this.strictCookiePermissions = _strictCookiePermissions;
    }

    public void setMode(SASL.SaslMode _mode) {
        this.mode = _mode;
    }

    public void setSaslUid(OptionalLong _saslUid) {
        this.saslUid = _saslUid;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " [mode=" + String.valueOf((Object)this.mode) + ", authMode=" + this.authMode + ", guid=" + this.guid + ", saslUid=" + String.valueOf(this.saslUid) + ", strictCookiePermissions=" + this.strictCookiePermissions + ", fileDescriptorSupport=" + this.fileDescriptorSupport + "]";
    }

    public void setGuid(String _guid) {
        this.guid = _guid;
    }
}


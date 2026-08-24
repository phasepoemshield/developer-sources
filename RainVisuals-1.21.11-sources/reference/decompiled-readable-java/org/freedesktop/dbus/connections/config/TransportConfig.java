/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.config;

import java.nio.file.attribute.PosixFilePermission;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.config.SaslConfig;
import org.freedesktop.dbus.connections.impl.BaseConnectionBuilder;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.utils.Util;

public final class TransportConfig {
    private int timeout = 10000;
    private byte endianess = BaseConnectionBuilder.getSystemEndianness();
    private Map<String, Object> additionalConfig = new LinkedHashMap<String, Object>();
    private boolean autoConnect = true;
    private String fileOwner;
    private Consumer<AbstractTransport> afterBindCallback;
    private BusAddress busAddress;
    private String fileGroup;
    private boolean registerSelf = true;
    private Set<PosixFilePermission> fileUnixPermissions;
    private Consumer<AbstractTransport> preConnectCallback;
    private SaslConfig saslConfig;

    public int getTimeout() {
        return this.timeout;
    }

    public void setFileOwner(String _fileOwner) {
        this.fileOwner = _fileOwner;
    }

    public String getFileGroup() {
        return this.fileGroup;
    }

    public void setListening(boolean _listen) {
        this.updateBusAddress(_listen);
    }

    public Consumer<AbstractTransport> getAfterBindCallback() {
        return this.afterBindCallback;
    }

    public Set<PosixFilePermission> getFileUnixPermissions() {
        return this.fileUnixPermissions;
    }

    public String getFileOwner() {
        return this.fileOwner;
    }

    public boolean isListening() {
        return this.busAddress != null && this.busAddress.isListeningSocket();
    }

    public void setRegisterSelf(boolean _registerSelf) {
        this.registerSelf = _registerSelf;
    }

    public void setAutoConnect(boolean _autoConnect) {
        this.autoConnect = _autoConnect;
    }

    public void setBusAddress(BusAddress _busAddress) {
        this.busAddress = Objects.requireNonNull(_busAddress, "BusAddress required");
    }

    public boolean isAutoConnect() {
        return this.autoConnect;
    }

    public BusAddress getBusAddress() {
        return this.busAddress;
    }

    public void setTimeout(int _timeout) {
        this.timeout = _timeout;
    }

    public void setAdditionalConfig(Map<String, Object> _additionalConfig) {
        this.additionalConfig = _additionalConfig;
    }

    public void setFileUnixPermissions(PosixFilePermission ... _permissions) {
        block5: {
            block4: {
                if (Util.isWindows()) {
                    return;
                }
                if (_permissions == null) break block4;
                if (_permissions.length >= 1) break block5;
            }
            return;
        }
        this.fileUnixPermissions = new LinkedHashSet<PosixFilePermission>(Arrays.asList(_permissions));
    }

    public void setFileGroup(String _fileGroup) {
        this.fileGroup = _fileGroup;
    }

    public void setAfterBindCallback(Consumer<AbstractTransport> _afterBindCallback) {
        this.afterBindCallback = _afterBindCallback;
    }

    public void setEndianess(byte _endianess) {
        this.endianess = _endianess;
    }

    public SaslConfig getSaslConfig() {
        if (this.saslConfig == null) {
            this.saslConfig = new SaslConfig();
        }
        return this.saslConfig;
    }

    public TransportConfig() {
        this(null);
    }

    public Map<String, Object> getAdditionalConfig() {
        return this.additionalConfig;
    }

    public Consumer<AbstractTransport> getPreConnectCallback() {
        return this.preConnectCallback;
    }

    public byte getEndianess() {
        return this.endianess;
    }

    void setSaslConfig(SaslConfig _saslCfg) {
        this.saslConfig = _saslCfg;
    }

    void updateBusAddress(boolean _listening) {
        if (this.busAddress == null) {
            return;
        }
        if (!this.busAddress.isListeningSocket() && _listening) {
            this.busAddress.addParameter("listen", "true");
        } else if (this.busAddress.isListeningSocket() && !_listening) {
            this.busAddress.removeParameter("listen");
        }
    }

    public TransportConfig(BusAddress _address) {
        this.busAddress = _address;
    }

    public boolean isRegisterSelf() {
        return this.registerSelf;
    }

    public void setPreConnectCallback(Consumer<AbstractTransport> _preConnectCallback) {
        this.preConnectCallback = _preConnectCallback;
    }
}


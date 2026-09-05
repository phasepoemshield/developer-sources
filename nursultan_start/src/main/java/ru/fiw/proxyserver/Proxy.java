/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
package ru.fiw.proxyserver;

import com.google.gson.annotations.SerializedName;

public class Proxy {
    @SerializedName(value="IP:PORT")
    public String ipPort = "";
    public ProxyType type = ProxyType.SOCKS5;
    public String username = "";
    public String password = "";

    public Proxy() {
    }

    public Proxy(boolean bl, String string, String string2, String string3) {
        this.type = bl ? ProxyType.SOCKS4 : ProxyType.SOCKS5;
        this.ipPort = string;
        this.username = string2;
        this.password = string3;
    }

    public int getPort() {
        return Integer.parseInt(this.ipPort.split(":")[1]);
    }

    public String getIp() {
        return this.ipPort.split(":")[0];
    }

    public enum ProxyType {
        SOCKS4,
        SOCKS5;

    }
}


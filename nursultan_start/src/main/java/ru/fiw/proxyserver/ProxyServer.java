/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05362
 *  net.fabricmc.api.ModInitializer
 */
package ru.fiw.proxyserver;

import minecraft.class05362;
import net.fabricmc.api.ModInitializer;
import ru.fiw.proxyserver.Config;
import ru.fiw.proxyserver.Proxy;

public class ProxyServer
implements ModInitializer {
    public static boolean proxyEnabled;
    public static Proxy proxy;
    public static Proxy lastUsedProxy;
    public static class05362 proxyMenuButton;

    static {
        proxy = new Proxy();
        lastUsedProxy = new Proxy();
    }

    public static String getLastUsedProxyIp() {
        return ProxyServer.lastUsedProxy.ipPort.isEmpty() ? "none" : lastUsedProxy.getIp();
    }

    public void onInitialize() {
        Config.loadConfig();
    }
}


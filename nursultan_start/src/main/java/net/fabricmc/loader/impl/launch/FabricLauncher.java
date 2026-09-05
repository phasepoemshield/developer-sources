/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.loader.impl.launch;

public interface FabricLauncher {
    public String getTargetNamespace();

    public ClassLoader getTargetClassLoader();

    public boolean isDevelopment();
}


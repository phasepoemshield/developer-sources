/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viafabricplus.injection.access.base;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public interface IServerData {
    public void viaFabricPlus$setTranslatingVersion(ProtocolVersion var1);

    public boolean viaFabricPlus$passedDirectConnectScreen();

    public void viaFabricPlus$passDirectConnectScreen(boolean var1);

    public void viaFabricPlus$forceVersion(ProtocolVersion var1);

    public ProtocolVersion viaFabricPlus$forcedVersion();

    public ProtocolVersion viaFabricPlus$translatingVersion();
}


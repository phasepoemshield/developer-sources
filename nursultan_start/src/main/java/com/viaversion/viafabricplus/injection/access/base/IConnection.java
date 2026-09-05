/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viafabricplus.injection.access.base;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;

public interface IConnection {
    public UserConnection viaFabricPlus$getUserConnection();

    public void viaFabricPlus$setUserConnection(UserConnection var1);

    public ProtocolVersion viaFabricPlus$getTargetVersion();

    public void viaFabricPlus$setTargetVersion(ProtocolVersion var1);

    public void viaFabricPlus$setupPreNettyDecryption();
}


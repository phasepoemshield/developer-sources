/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.VersionProvider
 */
package com.viaversion.viaversion.protocol.version;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionProvider;

public class BaseVersionProvider
implements VersionProvider {
    public ProtocolVersion getClosestServerProtocol(UserConnection connection) throws Exception {
        return Via.getAPI().getServerVersion().lowestSupportedProtocolVersion();
    }
}


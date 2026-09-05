/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocol.version.BaseVersionProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.version.BaseVersionProvider;

public final class ViaFabricPlusBaseVersionProvider
extends BaseVersionProvider {
    public ProtocolVersion getClosestServerProtocol(UserConnection userConnection) throws Exception {
        if (userConnection.isClientSide()) {
            return ProtocolTranslator.getTargetVersion(userConnection.getChannel());
        }
        return super.getClosestServerProtocol(userConnection);
    }
}


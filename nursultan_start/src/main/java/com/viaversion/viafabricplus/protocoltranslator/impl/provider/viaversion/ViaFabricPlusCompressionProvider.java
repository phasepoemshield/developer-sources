/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider
 *  minecraft.class00642
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viaversion;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider;
import minecraft.class00642;

public final class ViaFabricPlusCompressionProvider
extends CompressionProvider {
    public void handlePlayCompression(UserConnection userConnection, int n) {
        class00642 class006422 = (class00642)userConnection.getChannel().attr(ProtocolTranslator.CLIENT_CONNECTION_ATTRIBUTE_KEY).get();
        class006422.method_10760(n, true);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.provider.EncryptionProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy;

import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.connection.UserConnection;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.provider.EncryptionProvider;

public final class ViaFabricPlusEncryptionProvider
extends EncryptionProvider {
    public void enableDecryption(UserConnection userConnection) {
        ((IConnection)userConnection.getChannel().attr(ProtocolTranslator.CLIENT_CONNECTION_ATTRIBUTE_KEY).get()).viaFabricPlus$setupPreNettyDecryption();
    }
}


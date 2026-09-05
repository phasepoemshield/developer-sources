/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class06202
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy;

import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.AuthenticationSettings;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viaversion.api.connection.UserConnection;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class06202;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.provider.OldAuthProvider;

public final class ViaFabricPlusOldAuthProvider
extends OldAuthProvider {
    public void sendAuthRequest(UserConnection userConnection, String string) {
        if (!((Boolean)AuthenticationSettings.INSTANCE.verifySessionForOnlineModeServers.getValue()).booleanValue()) {
            return;
        }
        try {
            class06202 class062022 = class06202.Nq();
            class062022.n().L().joinServer(class062022.Ny().y(), class062022.Ny().u(), string);
        }
        catch (Exception exception) {
            ((class00642)userConnection.getChannel().attr(ProtocolTranslator.CLIENT_CONNECTION_ATTRIBUTE_KEY).get()).method_10747(ChatUtil.prefixText((class00392)class00392.L((String)"betacraft.viafabricplus.failed_to_verify_session")));
            ViaFabricPlusImpl.INSTANCE.getLogger().error("Error occurred while calling join server to verify session", (Throwable)exception);
        }
    }
}


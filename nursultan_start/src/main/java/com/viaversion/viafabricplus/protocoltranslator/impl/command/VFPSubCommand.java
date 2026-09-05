/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.command.ViaSubCommand
 *  com.viaversion.viaversion.api.connection.UserConnection
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.command;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.util.ChatUtil;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.command.ViaSubCommand;
import com.viaversion.viaversion.api.connection.UserConnection;

public interface VFPSubCommand
extends ViaSubCommand {
    default public void sendMessage(ViaCommandSender viaCommandSender, String string) {
        super.sendMessage(viaCommandSender, ChatUtil.PREFIX + " " + string, new Object[0]);
    }

    default public UserConnection getUser() {
        return ProtocolTranslator.getPlayNetworkUserConnection();
    }
}


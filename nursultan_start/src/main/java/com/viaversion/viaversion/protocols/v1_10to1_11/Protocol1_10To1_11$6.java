/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.protocols.v1_10to1_11;

import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_10to1_11.Protocol1_10To1_11;

class Protocol1_10To1_11$6
extends PacketHandlers {
    final /* synthetic */ Protocol1_10To1_11 this$0;

    Protocol1_10To1_11$6(Protocol1_10To1_11 protocol1_10To1_11) {
        this.this$0 = protocol1_10To1_11;
    }

    public void register() {
        this.map(Types.STRING);
        this.handler(packetWrapper -> {
            String string = (String)packetWrapper.get(Types.STRING, 0);
            if (string.length() > Protocol1_10To1_11$6.constant$dlo000$viafabricplus$changeMaxChatLength(100)) {
                packetWrapper.set(Types.STRING, 0, (Object)string.substring(0, Protocol1_10To1_11$6.constant$dlo000$viafabricplus$changeMaxChatLength(100)).trim());
            }
        });
    }

    private static int constant$dlo000$viafabricplus$changeMaxChatLength(int n) {
        return MaxChatLength.getChatLength();
    }
}


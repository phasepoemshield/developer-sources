/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class01683
 *  minecraft.class06202
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage
 */
package com.viaversion.viafabricplus.features.limitation.max_chat_length;

import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class01683;
import minecraft.class06202;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage;

public final class MaxChatLength {
    public static final int MAX_CHAT_LENGTH_LATEST = 256;

    public static int getChatLength() {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
            class01683 class016832 = class06202.Nq().NE();
            ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)((IConnection)class016832.M()).viaFabricPlus$getUserConnection().get(ExtensionProtocolMetadataStorage.class);
            if (extensionProtocolMetadataStorage != null && extensionProtocolMetadataStorage.hasServerExtension(ClassicProtocolExtension.LONGER_MESSAGES, new int[0])) {
                return 65534;
            }
            return 64 - (class06202.Nq().Ny().L().length() + 2);
        }
        if (ProtocolTranslator.getTargetVersion().equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            return 512;
        }
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_9_3)) {
            return 100;
        }
        return 256;
    }
}


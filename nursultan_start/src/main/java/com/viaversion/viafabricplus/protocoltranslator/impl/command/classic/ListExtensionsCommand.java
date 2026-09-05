/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.injection.access.base.IExtensionProtocolMetadataStorage
 *  minecraft.class06541
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.command.classic;

import com.viaversion.viafabricplus.injection.access.base.IExtensionProtocolMetadataStorage;
import com.viaversion.viafabricplus.protocoltranslator.impl.command.VFPSubCommand;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import minecraft.class06541;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage;

public final class ListExtensionsCommand
implements VFPSubCommand {
    public String description() {
        return "Shows all classic extensions (only for " + LegacyProtocolVersion.c0_30cpe.getName() + ")";
    }

    public String name() {
        return "listextensions";
    }

    public boolean execute(ViaCommandSender viaCommandSender, String[] stringArray) {
        if (this.getUser() == null || !this.getUser().has(ExtensionProtocolMetadataStorage.class)) {
            this.sendMessage(viaCommandSender, String.valueOf(class06541.field_1061) + "Only for " + LegacyProtocolVersion.c0_30cpe.getName());
            return true;
        }
        ((IExtensionProtocolMetadataStorage)this.getUser().get(ExtensionProtocolMetadataStorage.class)).viaFabricPlus$getServerExtensions().forEach((classicProtocolExtension, n) -> this.sendMessage(viaCommandSender, String.valueOf(class06541.field_1060) + classicProtocolExtension.getName() + String.valueOf(class06541.field_1065) + " v" + n));
        return true;
    }
}


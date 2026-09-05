/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class07689
 *  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.command;

import com.viaversion.viaversion.api.command.ViaCommandSender;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class07689;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;

public final class ViaFabricPlusCommandSender
implements ViaCommandSender {
    private final class07689 source;

    public ViaFabricPlusCommandSender(class07689 class076892) {
        this.source = class076892;
    }

    @Override
    public String getName() {
        return ((FabricClientCommandSource)this.source).getPlayer().method_5477().getString();
    }

    @Override
    public boolean hasPermission(String string) {
        return true;
    }

    @Override
    public void sendMessage(String string) {
        ((FabricClientCommandSource)this.source).sendFeedback(class00392.N((String)string.replace("/viaversion", "/viafabricplus")));
    }

    @Override
    public UUID getUUID() {
        return ((FabricClientCommandSource)this.source).getPlayer().method_5667();
    }
}


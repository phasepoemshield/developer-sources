/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.command.ViaSubCommand
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 */
package com.viaversion.viaversion.commands.defaultsubs;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.command.ViaSubCommand;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListSubCmd
implements ViaSubCommand {
    public String description() {
        return "Shows lists of the versions from logged in players.";
    }

    public String name() {
        return "list";
    }

    public boolean execute(ViaCommandSender sender, String[] args) {
        TreeMap<ProtocolVersion, Set> playerVersions = new TreeMap<ProtocolVersion, Set>(ProtocolVersion::compareTo);
        for (UserConnection userConnection : Via.getManager().getConnectionManager().getConnections()) {
            ProtocolVersion version = userConnection.getProtocolInfo().protocolVersion();
            playerVersions.computeIfAbsent(version, s -> new HashSet()).add(userConnection.getProtocolInfo().getUsername());
        }
        if (playerVersions.isEmpty()) {
            this.sendMessage(sender, "&cNo players found!", new Object[0]);
            return true;
        }
        for (Map.Entry entry : playerVersions.entrySet()) {
            this.sendMessage(sender, "&8[&6%s&8] (&7%d&8): &b%s", new Object[]{((ProtocolVersion)entry.getKey()).getName(), ((Set)entry.getValue()).size(), entry.getValue()});
        }
        playerVersions.clear();
        return true;
    }

    public String usage() {
        return "list";
    }
}


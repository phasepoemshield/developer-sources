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

public class PPSSubCmd
implements ViaSubCommand {
    public String description() {
        return "Shows the packets per second of online players.";
    }

    public String name() {
        return "pps";
    }

    public boolean execute(ViaCommandSender sender, String[] args) {
        TreeMap playerVersions = new TreeMap(ProtocolVersion::compareTo);
        int totalPackets = 0;
        int clients = 0;
        long max = 0L;
        for (UserConnection userConnection : Via.getManager().getConnectionManager().getConnections()) {
            ProtocolVersion playerVersion = userConnection.getProtocolInfo().protocolVersion();
            if (!playerVersions.containsKey(playerVersion)) {
                playerVersions.put(playerVersion, new HashSet());
            }
            if (userConnection.getPacketTracker().getPacketsPerSecond() <= -1) continue;
            ((Set)playerVersions.get(playerVersion)).add(userConnection.getProtocolInfo().getUsername() + " (" + userConnection.getPacketTracker().getPacketsPerSecond() + " PPS)");
            totalPackets += userConnection.getPacketTracker().getPacketsPerSecond();
            if ((long)userConnection.getPacketTracker().getPacketsPerSecond() > max) {
                max = userConnection.getPacketTracker().getPacketsPerSecond();
            }
            ++clients;
        }
        this.sendMessage(sender, "&4Live Packets Per Second", new Object[0]);
        if (clients > 1) {
            this.sendMessage(sender, "&cAverage: &f" + totalPackets / clients, new Object[0]);
            this.sendMessage(sender, "&cHighest: &f" + max, new Object[0]);
        }
        if (clients == 0) {
            this.sendMessage(sender, "&cNo clients to display.", new Object[0]);
        }
        for (Map.Entry entry : playerVersions.entrySet()) {
            this.sendMessage(sender, "&8[&6%s&8]: &b%s", new Object[]{((ProtocolVersion)entry.getKey()).getName(), entry.getValue()});
        }
        playerVersions.clear();
        return true;
    }

    public String usage() {
        return "pps";
    }
}


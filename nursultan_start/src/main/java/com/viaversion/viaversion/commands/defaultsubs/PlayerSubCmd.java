/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.command.ViaSubCommand
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 */
package com.viaversion.viaversion.commands.defaultsubs;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.command.ViaSubCommand;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import java.util.ArrayList;
import java.util.List;

public class PlayerSubCmd
implements ViaSubCommand {
    public String description() {
        return "Shows connection information about one or all players.";
    }

    public String name() {
        return "player";
    }

    public boolean execute(ViaCommandSender sender, String[] args) {
        if (args.length == 0) {
            return false;
        }
        boolean all = args[0].equals("*");
        boolean any = false;
        for (UserConnection connection : Via.getManager().getConnectionManager().getConnections()) {
            ProtocolInfo info = connection.getProtocolInfo();
            if (!args[0].equalsIgnoreCase(info.getUsername()) && !all) continue;
            this.sendMessage(sender, "&7[&6" + info.getUsername() + "&7] UUID: &2" + String.valueOf(info.getUuid()) + " &7Client protocol: &2" + info.protocolVersion().getName() + " &7Server protocol: &2" + info.serverProtocolVersion().getName() + " &7Client: &2" + connection.isClientSide(), new Object[0]);
            any = true;
        }
        if (!any) {
            this.sendMessage(sender, (String)(all ? "&cNo players found!" : "&cNo player found with the name: " + args[0]), new Object[0]);
        }
        return true;
    }

    public List<String> onTabComplete(ViaCommandSender sender, String[] args) {
        if (args.length == 1) {
            String input = args[0].toLowerCase();
            ArrayList<String> matches = new ArrayList<String>();
            for (UserConnection connection : Via.getManager().getConnectionManager().getConnections()) {
                String name = connection.getProtocolInfo().getUsername();
                if (!input.isEmpty() && !name.toLowerCase().startsWith(input)) continue;
                matches.add(name);
            }
            matches.add("*");
            return matches;
        }
        return super.onTabComplete(sender, args);
    }

    public String usage() {
        return "player <name|*>";
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.command.ViaSubCommand
 */
package com.viaversion.viaversion.commands.defaultsubs;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.command.ViaSubCommand;

public class ReloadSubCmd
implements ViaSubCommand {
    public String description() {
        return "Reload the config from the disk.";
    }

    public String name() {
        return "reload";
    }

    public boolean execute(ViaCommandSender sender, String[] args) {
        Via.getManager().getConfigurationProvider().reloadConfigs();
        this.sendMessage(sender, "&6Configuration successfully reloaded! Some config options may require a restart to take effect.", new Object[0]);
        return true;
    }
}


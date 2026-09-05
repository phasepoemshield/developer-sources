/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.util.ChatColorUtil
 */
package com.viaversion.viaversion.api.command;

import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.util.ChatColorUtil;
import java.util.Collections;
import java.util.List;

public interface ViaSubCommand {
    public static String color(String s) {
        return ChatColorUtil.translateAlternateColorCodes((String)s);
    }

    public String description();

    public String name();

    public boolean execute(ViaCommandSender var1, String[] var2);

    default public String permission() {
        return "viaversion.admin." + this.name();
    }

    default public void sendMessage(ViaCommandSender sender, String message, Object ... args) {
        sender.sendMessage(ViaSubCommand.color(args == null ? message : String.format(message, args)));
    }

    default public List<String> onTabComplete(ViaCommandSender sender, String[] args) {
        return Collections.emptyList();
    }

    default public String usage() {
        return this.name();
    }
}


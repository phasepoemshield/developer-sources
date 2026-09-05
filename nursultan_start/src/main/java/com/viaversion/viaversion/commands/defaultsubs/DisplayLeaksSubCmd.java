/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.command.ViaSubCommand
 *  io.netty.util.ResourceLeakDetector
 *  io.netty.util.ResourceLeakDetector$Level
 */
package com.viaversion.viaversion.commands.defaultsubs;

import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.command.ViaSubCommand;
import io.netty.util.ResourceLeakDetector;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayLeaksSubCmd
implements ViaSubCommand {
    public String description() {
        return "Try to hunt memory leaks!";
    }

    public String name() {
        return "displayleaks";
    }

    public boolean execute(ViaCommandSender sender, String[] args) {
        if (args.length == 1) {
            try {
                ResourceLeakDetector.Level level = ResourceLeakDetector.Level.valueOf((String)args[0]);
                ResourceLeakDetector.setLevel((ResourceLeakDetector.Level)level);
                this.sendMessage(sender, "&6Set leak detector level to &2" + String.valueOf(level), new Object[0]);
            }
            catch (IllegalArgumentException e) {
                this.sendMessage(sender, "&cInvalid level (" + Arrays.toString(ResourceLeakDetector.Level.values()) + ")", new Object[0]);
            }
        } else {
            this.sendMessage(sender, "&6Current leak detection level is &2" + String.valueOf(ResourceLeakDetector.getLevel()), new Object[0]);
        }
        return true;
    }

    public List<String> onTabComplete(ViaCommandSender sender, String[] args) {
        if (args.length == 1) {
            return Arrays.stream(ResourceLeakDetector.Level.values()).map(Enum::name).filter(it -> it.startsWith(args[0])).collect(Collectors.toList());
        }
        return super.onTabComplete(sender, args);
    }

    public String usage() {
        return "displayleaks [level]";
    }
}


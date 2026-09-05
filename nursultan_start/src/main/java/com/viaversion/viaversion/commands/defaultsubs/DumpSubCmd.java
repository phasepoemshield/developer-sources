/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.command.ViaCommandSender
 *  com.viaversion.viaversion.api.command.ViaSubCommand
 *  com.viaversion.viaversion.util.DumpUtil
 */
package com.viaversion.viaversion.commands.defaultsubs;

import com.viaversion.viaversion.api.command.ViaCommandSender;
import com.viaversion.viaversion.api.command.ViaSubCommand;
import com.viaversion.viaversion.util.DumpUtil;
import java.util.UUID;

public class DumpSubCmd
implements ViaSubCommand {
    public String description() {
        return "Dump information about your platform implementation, this is helpful if you report bugs.";
    }

    public String name() {
        return "dump";
    }

    public boolean execute(ViaCommandSender sender, String[] args) {
        DumpUtil.postDump((UUID)sender.getUUID()).whenComplete((url, e) -> {
            if (e != null) {
                sender.sendMessage("\u00a74" + e.getMessage());
                return;
            }
            sender.sendMessage("\u00a72We've made a dump with useful information, report your issue and provide this url: " + url);
        });
        return true;
    }
}


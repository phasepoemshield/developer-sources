/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.command;

import com.viaversion.viafabricplus.protocoltranslator.impl.command.VFPSubCommand;
import com.viaversion.viafabricplus.screen.impl.SettingsScreen;
import com.viaversion.viaversion.api.command.ViaCommandSender;

public final class SettingsCommand
implements VFPSubCommand {
    public String description() {
        return "Opens ViaFabricPlus's configuration/options screen";
    }

    public String name() {
        return "settings";
    }

    public boolean execute(ViaCommandSender viaCommandSender, String[] stringArray) {
        SettingsScreen.INSTANCE.open(null);
        return true;
    }
}


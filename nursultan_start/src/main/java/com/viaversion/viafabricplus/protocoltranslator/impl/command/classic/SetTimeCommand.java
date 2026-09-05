/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06541
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.storage.TimeLockStorage
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.command.classic;

import com.viaversion.viafabricplus.protocoltranslator.impl.command.VFPSubCommand;
import com.viaversion.viaversion.api.command.ViaCommandSender;
import minecraft.class06541;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.alpha.a1_0_16_2toa1_0_17_1_0_17_4.storage.TimeLockStorage;

public final class SetTimeCommand
implements VFPSubCommand {
    public String description() {
        return "Changes the time (Only for <= " + LegacyProtocolVersion.a1_0_16toa1_0_16_2.getName() + ")";
    }

    public String name() {
        return "settime";
    }

    public boolean execute(ViaCommandSender viaCommandSender, String[] stringArray) {
        if (this.getUser() == null || !this.getUser().has(TimeLockStorage.class)) {
            this.sendMessage(viaCommandSender, String.valueOf(class06541.field_1061) + "Only for <= " + LegacyProtocolVersion.a1_0_16toa1_0_16_2.getName());
            return true;
        }
        try {
            if (stringArray.length != 1) {
                return false;
            }
            long l = Long.parseLong(stringArray[0]) % 24000L;
            ((TimeLockStorage)this.getUser().get(TimeLockStorage.class)).setTime(l);
            this.sendMessage(viaCommandSender, String.valueOf(class06541.field_1060) + "Time has been set to " + String.valueOf(class06541.field_1065) + l);
        }
        catch (Throwable throwable) {
            return false;
        }
        return true;
    }

    public String usage() {
        return this.name() + " <Time (Long)>";
    }
}


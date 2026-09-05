/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  minecraft.class06202
 *  minecraft.class07282
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viafabricplus.features.networking.remove_signed_commands;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import minecraft.class06202;
import minecraft.class07282;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public final class SignedCommands1_21_6 {
    public static void sendGameMode(class07282 class072822) {
        String string;
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
            String string2 = class06202.Nq().Ny().L();
            string = "gamemode " + string2 + " " + String.valueOf(class072822.N() > 1 ? Integer.valueOf(0) : class072822.y());
        } else {
            string = "gamemode " + class072822.y();
        }
        class06202.Nq().NE().u(string);
    }
}


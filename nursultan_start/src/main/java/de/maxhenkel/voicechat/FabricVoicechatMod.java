/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.integration.ViaVersionCompatibility
 *  de.maxhenkel.voicechat.integration.vanish.VanishIntegration
 *  net.fabricmc.api.ModInitializer
 */
package de.maxhenkel.voicechat;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.integration.ViaVersionCompatibility;
import de.maxhenkel.voicechat.integration.vanish.VanishIntegration;
import net.fabricmc.api.ModInitializer;

public class FabricVoicechatMod
extends Voicechat
implements ModInitializer {
    public void onInitialize() {
        this.initialize();
        ViaVersionCompatibility.register();
        VanishIntegration.init();
    }
}


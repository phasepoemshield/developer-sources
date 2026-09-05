/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class04370
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07018
 *  minecraft.class08429
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 */
package com.viaversion.viafabricplus.visuals.features.force_unicode_font;

import com.viaversion.viafabricplus.ViaFabricPlus;
import com.viaversion.viafabricplus.visuals.features.force_unicode_font.LanguageUtil;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import minecraft.class04370;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07018;
import minecraft.class08429;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public final class UnicodeFontFix1_12_2 {
    private static boolean enabled = false;
    private static Runnable task = null;

    public static void init() {
        ViaFabricPlus.getImpl().registerOnChangeProtocolVersionCallback((protocolVersion, protocolVersion2) -> UnicodeFontFix1_12_2.updateUnicodeFontOverride(protocolVersion2));
        ClientTickEvents.START_CLIENT_TICK.register(class062022 -> {
            if (task != null) {
                task.run();
                task = null;
            }
        });
    }

    public static void updateUnicodeFontOverride(ProtocolVersion protocolVersion) {
        class04370 class043702 = ((class05630)class06202.Nq().i_7).NL();
        if (VisualSettings.INSTANCE.forceUnicodeFontForNonAsciiLanguages.isEnabled(protocolVersion)) {
            class07018 class070182 = class07018.y();
            if (class070182 instanceof class08429) {
                class08429 class084292 = (class08429)class070182;
                enabled = LanguageUtil.isUnicodeFont1_12_2(class084292.N);
                task = () -> class043702.method_41748((Object)enabled);
            }
        } else if (enabled) {
            enabled = false;
            task = () -> class043702.method_41748((Object)false);
        }
    }
}


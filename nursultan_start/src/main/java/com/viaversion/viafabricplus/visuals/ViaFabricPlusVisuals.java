/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.ViaFabricPlusBase
 *  com.viaversion.viafabricplus.api.entrypoint.ViaFabricPlusLoadEntrypoint
 *  com.viaversion.viafabricplus.api.events.LoadingCycleCallback$LoadingCycle
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  minecraft.class06202
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viafabricplus.visuals;

import com.viaversion.viafabricplus.api.ViaFabricPlusBase;
import com.viaversion.viafabricplus.api.entrypoint.ViaFabricPlusLoadEntrypoint;
import com.viaversion.viafabricplus.api.events.LoadingCycleCallback;
import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.visuals.features.classic.creative_menu.GridItemSelectionScreen;
import com.viaversion.viafabricplus.visuals.features.force_unicode_font.UnicodeFontFix1_12_2;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import minecraft.class06202;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public class ViaFabricPlusVisuals
implements ViaFabricPlusLoadEntrypoint {
    public static final ViaFabricPlusVisuals INSTANCE = new ViaFabricPlusVisuals();

    public void onPlatformLoad(ViaFabricPlusBase viaFabricPlusBase) {
        UnicodeFontFix1_12_2.init();
        viaFabricPlusBase.registerLoadingCycleCallback(loadingCycle -> {
            if (loadingCycle == LoadingCycleCallback.LoadingCycle.POST_SETTINGS_LOAD) {
                viaFabricPlusBase.addSettingGroup((SettingGroup)VisualSettings.INSTANCE);
            }
        });
        viaFabricPlusBase.registerOnChangeProtocolVersionCallback((protocolVersion, protocolVersion2) -> class06202.Nq().execute(() -> {
            if (protocolVersion2.olderThanOrEqualTo(LegacyProtocolVersion.c0_28toc0_30)) {
                GridItemSelectionScreen.INSTANCE.itemGrid = null;
            }
        }));
    }
}


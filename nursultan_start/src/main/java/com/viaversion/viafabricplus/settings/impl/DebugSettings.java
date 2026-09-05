/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange
 *  minecraft.class00392
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting;
import com.viaversion.viafabricplus.settings.impl.DebugSettings$1;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange;
import minecraft.class00392;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public final class DebugSettings
extends SettingGroup {
    public static final DebugSettings INSTANCE = new DebugSettings();
    public final BooleanSetting queueConfigPackets = new BooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.queue_config_packets"), Boolean.valueOf(true));
    public final BooleanSetting printNetworkingErrorsToLogs = new BooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.print_networking_errors_to_logs"), Boolean.valueOf(true));
    public final BooleanSetting ignoreFabricSyncErrors = new BooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.ignore_fabric_sync_errors"), Boolean.valueOf(false));
    public final BooleanSetting hideModernJigsawScreenFeatures = new BooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.hide_modern_jigsaw_screen_features"), Boolean.valueOf(true));
    public final BooleanSetting filterNonExistingGlyphs = new DebugSettings$1(this, this, class00392.L((String)"debug_settings.viafabricplus.filter_non_existing_glyphs"), true);
    public final VersionedBooleanSetting dontCreatePacketErrorCrashReports = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.dont_create_packet_error_crash_reports"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_20_3));
    public final VersionedBooleanSetting disableSequencing = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.disable_sequencing"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_18_2));
    public final VersionedBooleanSetting alwaysTickClientPlayer = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.always_tick_client_player"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_8).add(ProtocolVersionRange.andNewer((ProtocolVersion)ProtocolVersion.v1_17)));
    public final VersionedBooleanSetting executeInputsSynchronously = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.execute_inputs_synchronously"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting legacyTabCompletions = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.legacy_tab_completions"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting legacyPaneOutlines = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.legacy_pane_outlines"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting emulateArmorHud = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.emulate_armor_hud"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_8));
    public final VersionedBooleanSetting hideModernCommandBlockScreenFeatures = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.hide_modern_command_block_screen_features"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_8));
    public final VersionedBooleanSetting legacyCropOutlines = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.legacy_crop_outlines"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_8));
    public final VersionedBooleanSetting serversidePlaceSounds = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.serverside_place_sounds"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_8));
    public final VersionedBooleanSetting disableServerPinging = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"debug_settings.viafabricplus.disable_server_pinging"), ProtocolVersionRange.andOlder((ProtocolVersion)LegacyProtocolVersion.b1_7tob1_7_3));

    public DebugSettings() {
        super((class00392)class00392.L((String)"setting_group_name.viafabricplus.debug"));
    }
}


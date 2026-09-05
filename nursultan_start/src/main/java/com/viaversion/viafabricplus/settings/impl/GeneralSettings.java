/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  com.viaversion.viafabricplus.api.settings.type.ModeSetting
 *  minecraft.class00392
 *  minecraft.class05216
 */
package com.viaversion.viafabricplus.settings.impl;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.api.settings.type.ModeSetting;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings$Position;
import minecraft.class00392;
import minecraft.class05216;

public final class GeneralSettings
extends SettingGroup {
    public static final GeneralSettings INSTANCE = new GeneralSettings();
    private final class05216[] ORIENTATION_OPTIONS = new class05216[]{class00392.L((String)"base.viafabricplus.none"), class00392.L((String)"base.viafabricplus.left_top"), class00392.L((String)"base.viafabricplus.right_top"), class00392.L((String)"base.viafabricplus.left_bottom"), class00392.L((String)"base.viafabricplus.right_bottom")};
    public final ModeSetting multiplayerScreenButtonOrientation = new ModeSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.multiplayer_screen_button_orientation"), this.constant$cfo000$nursultan$modifyInit(2), this.ORIENTATION_OPTIONS);
    public final ModeSetting addServerScreenButtonOrientation = new ModeSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.add_server_screen_button_orientation"), 2, this.ORIENTATION_OPTIONS);
    public final ModeSetting directConnectScreenButtonOrientation = new ModeSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.direct_connect_screen_button_orientation"), 2, this.ORIENTATION_OPTIONS);
    public final ModeSetting removeNotAvailableItemsFromCreativeTab = new ModeSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.filter_creative_tabs"), new class05216[]{class00392.L((String)"base.viafabricplus.vanilla_and_modded"), class00392.L((String)"base.viafabricplus.vanilla_only"), class00392.L((String)"base.viafabricplus.off")});
    public final BooleanSetting saveSelectedProtocolVersion = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.save_selected_protocol_version"), Boolean.valueOf(true));
    public final BooleanSetting showClassicLoadingProgressInConnectScreen = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.show_classic_loading_progress"), Boolean.valueOf(true));
    public final BooleanSetting showAdvertisedServerVersion = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.show_advertised_server_version"), Boolean.valueOf(true));
    public final ModeSetting ignorePacketTranslationErrors = new ModeSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.ignore_packet_translation_errors"), new class05216[]{class00392.L((String)"base.viafabricplus.kick"), class00392.L((String)"base.viafabricplus.cancel_and_notify"), class00392.L((String)"base.viafabricplus.cancel")});
    public final BooleanSetting loadSkinsAndSkullsInLegacyVersions = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.load_skins_and_skulls_in_legacy_versions"), Boolean.valueOf(true));
    public final BooleanSetting emulateInventoryActionsInAlphaVersions = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.emulate_inventory_actions_in_alpha_versions"), Boolean.valueOf(true));
    public final BooleanSetting saveScrollPositionInSlotScreens = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.save_scroll_position_in_slot_screens"), Boolean.valueOf(true));
    public final BooleanSetting experimentalBlockConnections = new BooleanSetting((SettingGroup)this, class00392.L((String)"general_settings.viafabricplus.experimental_block_connections"), Boolean.valueOf(false));

    public GeneralSettings() {
        super((class00392)class00392.L((String)"setting_group_name.viafabricplus.general"));
        this.emulateInventoryActionsInAlphaVersions.lockValue();
        this.experimentalBlockConnections.lockValue();
    }

    public static void setOrientation(GeneralSettings$Position generalSettings$Position, int n, int n2, int n3) {
        switch (n) {
            case 1: {
                generalSettings$Position.setPosition(5, 5);
                break;
            }
            case 2: {
                generalSettings$Position.setPosition(n2 - 98 - 5, 5);
                break;
            }
            case 3: {
                generalSettings$Position.setPosition(5, n3 - 20 - 5);
                break;
            }
            case 4: {
                generalSettings$Position.setPosition(n2 - 98 - 5, n3 - 20 - 5);
            }
        }
    }

    private int constant$cfo000$nursultan$modifyInit(int n) {
        return 3;
    }
}


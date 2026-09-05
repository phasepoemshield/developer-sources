/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.api.settings.SettingGroup
 *  com.viaversion.viafabricplus.api.settings.type.BooleanSetting
 *  com.viaversion.viafabricplus.api.settings.type.ModeSetting
 *  com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange
 *  minecraft.class00392
 *  minecraft.class05216
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viafabricplus.visuals.settings;

import com.viaversion.viafabricplus.api.settings.SettingGroup;
import com.viaversion.viafabricplus.api.settings.type.BooleanSetting;
import com.viaversion.viafabricplus.api.settings.type.ModeSetting;
import com.viaversion.viafabricplus.api.settings.type.VersionedBooleanSetting;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersionRange;
import minecraft.class00392;
import minecraft.class05216;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public final class VisualSettings
extends SettingGroup {
    public static final VisualSettings INSTANCE = new VisualSettings();
    public final ModeSetting changeGameMenuScreenLayout = new ModeSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.change_game_menu_screen_layout"), new class05216[]{class00392.L((String)"change_game_menu_screen_layout.viafabricplus.authentic"), class00392.L((String)"change_game_menu_screen_layout.viafabricplus.adjusted"), class00392.L((String)"base.viafabricplus.off")});
    public final BooleanSetting removeBubblePopSound = new BooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.remove_bubble_pop_sound"), Boolean.valueOf(false));
    public final BooleanSetting hideEmptyBubbleIcons = new BooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_empty_bubble_icons"), Boolean.valueOf(false));
    public final BooleanSetting hideVillagerProfession = new BooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_villager_profession"), Boolean.valueOf(false));
    public final VersionedBooleanSetting hideDownloadTerrainScreenTransitionEffects = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_download_terrain_screen_transition_effects"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_20_5));
    public final VersionedBooleanSetting lockBlockingArmRotation = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.lock_blocking_arm_rotation"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_20_2));
    public final VersionedBooleanSetting changeBodyRotationInterpolation = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.change_body_rotation_interpolation"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_19_3));
    public final VersionedBooleanSetting potionEnchantmentGlint = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.potion_enchantment_glint"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_19_3));
    public final VersionedBooleanSetting disableSecureChatWarning = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.disable_secure_chat_warning"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_19));
    public final VersionedBooleanSetting hideSignatureIndicator = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_signature_indicator"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_18_2));
    public final VersionedBooleanSetting replacePetrifiedOakSlab = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.replace_petrified_oak_slab"), ProtocolVersionRange.of((ProtocolVersion)LegacyProtocolVersion.r1_3_1tor1_3_2, (ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting hideFurnaceRecipeBook = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_furnace_recipe_book"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting forceUnicodeFontForNonAsciiLanguages = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.force_unicode_font_for_non_ascii_languages"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting sneakInstantly = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.sneak_instantly"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_12_2));
    public final VersionedBooleanSetting sidewaysBackwardsRunning = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.sideways_backwards_walking"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_11_1));
    public final VersionedBooleanSetting hideCraftingRecipeBook = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_crafting_recipe_book"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_11_1));
    public final VersionedBooleanSetting alwaysRenderCrosshair = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.always_render_crosshair"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_8));
    public final VersionedBooleanSetting swingHandOnItemUse = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.swing_hand_on_item_use"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_7_6));
    public final VersionedBooleanSetting tiltItemPositions = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.tilt_item_positions"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_7_6));
    public final VersionedBooleanSetting enableLegacyTablist = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.enable_legacy_tablist"), ProtocolVersionRange.andOlder((ProtocolVersion)ProtocolVersion.v1_7_6));
    public final VersionedBooleanSetting replaceHurtSoundWithOOFSound = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.replace_hurt_sound_with_oof_sound"), ProtocolVersionRange.andOlder((ProtocolVersion)LegacyProtocolVersion.b1_8tob1_8_1));
    public final VersionedBooleanSetting hideModernHUDElements = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.hide_modern_hud_elements"), ProtocolVersionRange.andOlder((ProtocolVersion)LegacyProtocolVersion.b1_7tob1_7_3));
    public final VersionedBooleanSetting replaceCreativeInventory = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.replace_creative_inventory_with_classic_inventory"), ProtocolVersionRange.andOlder((ProtocolVersion)LegacyProtocolVersion.c0_28toc0_30));
    public final VersionedBooleanSetting oldWalkingAnimation = new VersionedBooleanSetting((SettingGroup)this, class00392.L((String)"visual_settings.viafabricplus.old_walking_animation"), ProtocolVersionRange.andOlder((ProtocolVersion)LegacyProtocolVersion.c0_28toc0_30));

    public VisualSettings() {
        super((class00392)class00392.L((String)"setting_group_name.viafabricplus.visual"));
        this.changeGameMenuScreenLayout.setTooltip(() -> switch (this.changeGameMenuScreenLayout.getIndex()) {
            case 0 -> class00392.L((String)"change_game_menu_screen_layout.viafabricplus.authentic.tooltip");
            case 1 -> class00392.L((String)"change_game_menu_screen_layout.viafabricplus.adjusted.tooltip");
            default -> class00392.L((String)"change_game_menu_screen_layout.viafabricplus.off.tooltip");
        });
        this.changeGameMenuScreenLayout.setValue(1);
        this.hideDownloadTerrainScreenTransitionEffects.setValue((Object)1);
        this.forceUnicodeFontForNonAsciiLanguages.setValue((Object)1);
    }
}


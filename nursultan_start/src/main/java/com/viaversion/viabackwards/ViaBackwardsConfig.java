/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.util.ChatColorUtil
 *  com.viaversion.viaversion.util.Config
 *  com.viaversion.viaversion.util.ConfigSection
 */
package com.viaversion.viabackwards;

import com.viaversion.viabackwards.api.DialogStyleConfig;
import com.viaversion.viaversion.util.ChatColorUtil;
import com.viaversion.viaversion.util.Config;
import com.viaversion.viaversion.util.ConfigSection;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class ViaBackwardsConfig
extends Config
implements com.viaversion.viabackwards.api.ViaBackwardsConfig {
    private boolean addCustomEnchantsToLore;
    private boolean addTeamColorToPrefix;
    private boolean fix1_13FacePlayer;
    private boolean alwaysShowOriginalMobName;
    private boolean fix1_13FormattedInventoryTitles;
    private boolean handlePingsAsInvAcknowledgements;
    private boolean bedrockAtY0;
    private boolean sculkShriekersToCryingObsidian;
    private boolean scaffoldingToWater;
    private boolean mapDarknessEffect;
    private boolean mapCustomModelData;
    private boolean mapDisplayEntities;
    private boolean suppressEmulationWarnings;
    private boolean dialogsViaChests;
    private DialogStyleConfig dialogStyleConfig;
    private boolean codeOfConductAsDialog;
    private boolean passOriginalItemNameToResourcePacks;

    protected String getString(ConfigSection section, String key, String def) {
        return ChatColorUtil.translateAlternateColorCodes((String)section.getString(key, def));
    }

    public void reload() {
        super.reload();
        this.loadFields();
    }

    public ViaBackwardsConfig(File configFile, Logger logger) {
        super(configFile, logger);
    }

    protected void handleConfig(Map<String, Object> map) {
    }

    @Override
    public boolean handlePingsAsInvAcknowledgements() {
        return this.handlePingsAsInvAcknowledgements || Boolean.getBoolean("com.viaversion.handlePingsAsInvAcknowledgements");
    }

    @Override
    public boolean addCustomEnchantsToLore() {
        return this.addCustomEnchantsToLore;
    }

    @Override
    public boolean alwaysShowOriginalMobName() {
        return this.alwaysShowOriginalMobName;
    }

    @Override
    public boolean isFix1_13FacePlayer() {
        return this.fix1_13FacePlayer;
    }

    @Override
    public boolean addTeamColorTo1_13Prefix() {
        return this.addTeamColorToPrefix;
    }

    @Override
    public boolean suppressEmulationWarnings() {
        return this.suppressEmulationWarnings;
    }

    private DialogStyleConfig loadDialogStyleConfig(ConfigSection section) {
        return new DialogStyleConfig(this.getString(section, "page-navigation-title", "&9&lPage navigation"), this.getString(section, "page-navigation-next", "&9Left click: &6Go to next page"), this.getString(section, "page-navigation-previous", "&9Right click: &6Go to previous page"), this.getString(section, "increase-value", "&9Left click: &6Increase value by %s"), this.getString(section, "decrease-value", "&9Right click: &6Decrease value by %s"), this.getString(section, "value-range", "&7(Value between &a%s &7and &a%s&7)"), this.getString(section, "next-option", "&9Left click: &6Go to next option"), this.getString(section, "previous-option", "&9Right click: &6Go to previous option"), this.getString(section, "current-value", "&7Current value: &a%s"), this.getString(section, "edit-value", "&9Left click: &6Edit text"), this.getString(section, "set-text", "&9Left click/close: &6Set text"), this.getString(section, "close", "&9Left click: &6Close"), this.getString(section, "toggle-value", "&9Left click: &6Toggle value"));
    }

    @Override
    public boolean codeOfConductAsDialog() {
        return this.codeOfConductAsDialog;
    }

    private void loadFields() {
        this.addCustomEnchantsToLore = this.getBoolean("add-custom-enchants-into-lore", true);
        this.addTeamColorToPrefix = this.getBoolean("add-teamcolor-to-prefix", true);
        this.fix1_13FacePlayer = this.getBoolean("fix-1_13-face-player", false);
        this.fix1_13FormattedInventoryTitles = this.getBoolean("fix-formatted-inventory-titles", true);
        this.alwaysShowOriginalMobName = this.getBoolean("always-show-original-mob-name", true);
        this.handlePingsAsInvAcknowledgements = this.getBoolean("handle-pings-as-inv-acknowledgements", false);
        this.bedrockAtY0 = this.getBoolean("bedrock-at-y-0", false);
        this.sculkShriekersToCryingObsidian = this.getBoolean("sculk-shriekers-to-crying-obsidian", false);
        this.scaffoldingToWater = this.getBoolean("scaffolding-to-water", false);
        this.mapDarknessEffect = this.getBoolean("map-darkness-effect", true);
        this.mapCustomModelData = this.getBoolean("map-custom-model-data", true);
        this.mapDisplayEntities = this.getBoolean("map-display-entities", true);
        this.suppressEmulationWarnings = this.getBoolean("suppress-emulation-warnings", false);
        this.dialogsViaChests = this.getBoolean("dialogs-via-chests", true);
        this.dialogStyleConfig = this.loadDialogStyleConfig(this.getSection("dialog-style"));
        this.codeOfConductAsDialog = this.getBoolean("code-of-conduct-as-dialog", true);
        this.passOriginalItemNameToResourcePacks = this.getBoolean("pass-original-item-name-to-resource-packs", true);
    }

    @Override
    public boolean bedrockAtY0() {
        return this.bedrockAtY0;
    }

    @Override
    public boolean mapDisplayEntities() {
        return this.mapDisplayEntities;
    }

    @Override
    public boolean mapDarknessEffect() {
        return this.mapDarknessEffect;
    }

    @Override
    public boolean scaffoldingToWater() {
        return this.scaffoldingToWater;
    }

    @Override
    public boolean mapCustomModelData() {
        return this.mapCustomModelData;
    }

    @Override
    public DialogStyleConfig dialogStyleConfig() {
        return this.dialogStyleConfig;
    }

    @Override
    public boolean dialogsViaChests() {
        return this.dialogsViaChests;
    }

    public URL getDefaultConfigURL() {
        return this.getClass().getClassLoader().getResource("assets/viabackwards/config.yml");
    }

    public List<String> getUnsupportedOptions() {
        return Collections.emptyList();
    }

    @Override
    public boolean fix1_13FormattedInventoryTitle() {
        return this.fix1_13FormattedInventoryTitles;
    }

    @Override
    public boolean sculkShriekerToCryingObsidian() {
        return this.sculkShriekersToCryingObsidian;
    }

    public InputStream getDefaultConfigInputStream() {
        return this.getClass().getClassLoader().getResourceAsStream("assets/viabackwards/config.yml");
    }

    @Override
    public boolean passOriginalItemNameToResourcePacks() {
        return this.passOriginalItemNameToResourcePacks;
    }
}


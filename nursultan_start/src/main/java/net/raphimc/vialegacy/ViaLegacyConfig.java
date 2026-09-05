/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.settings.impl.GeneralSettings
 *  com.viaversion.viaversion.util.Config
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package net.raphimc.vialegacy;

import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.util.Config;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class ViaLegacyConfig
extends Config
implements net.raphimc.vialegacy.platform.ViaLegacyConfig {
    private boolean dynamicOnground;
    private boolean ignoreLongChannelNames;
    private boolean legacySkullLoading;
    private boolean legacySkinLoading;
    private boolean soundEmulation;
    private boolean oldBiomes;
    private boolean enableB1_7_3Sprinting;
    private String b1_7_3Motd;
    private int classicChunkRange;
    private boolean enableClassicFly;

    public void reload() {
        super.reload();
        this.loadFields();
    }

    public ViaLegacyConfig(File file, Logger logger) {
        super(file, logger);
    }

    @Override
    public boolean enableB1_7_3Sprinting() {
        return this.enableB1_7_3Sprinting;
    }

    @Override
    public boolean isLegacySkinLoading() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dah000$viafabricplus$replaceWithVFPSetting(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.legacySkinLoading;
    }

    @Override
    public boolean isLegacySkullLoading() {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dah000$viafabricplus$replaceWithVFPSetting(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        return this.legacySkullLoading;
    }

    @Override
    public int getClassicChunkRange() {
        return this.classicChunkRange;
    }

    protected void handleConfig(Map<String, Object> map) {
    }

    private void handler$dah000$viafabricplus$replaceWithVFPSetting(CallbackInfoReturnable callbackInfoReturnable) {
        callbackInfoReturnable.setReturnValue((Object)((Boolean)GeneralSettings.INSTANCE.loadSkinsAndSkullsInLegacyVersions.getValue()));
    }

    private void loadFields() {
        this.dynamicOnground = this.getBoolean("dynamic-onground", true);
        this.ignoreLongChannelNames = this.getBoolean("ignore-long-1_8-channel-names", true);
        this.legacySkullLoading = this.getBoolean("legacy-skull-loading", false);
        this.legacySkinLoading = this.getBoolean("legacy-skin-loading", false);
        this.soundEmulation = this.getBoolean("sound-emulation", true);
        this.oldBiomes = this.getBoolean("old-biomes", true);
        this.enableB1_7_3Sprinting = this.getBoolean("enable-b1_7_3-sprinting", false);
        this.b1_7_3Motd = this.getString("b1_7_3-motd", "The server seems to be running!\nWait 5 seconds between each connection");
        this.classicChunkRange = this.getInt("classic-chunk-range", 10);
        this.enableClassicFly = this.getBoolean("enable-classic-fly", false);
    }

    @Override
    public boolean isOldBiomes() {
        return this.oldBiomes;
    }

    @Override
    public boolean enableClassicFly() {
        return this.enableClassicFly;
    }

    @Override
    public boolean isDynamicOnground() {
        return this.dynamicOnground;
    }

    @Override
    public boolean isSoundEmulation() {
        return this.soundEmulation;
    }

    @Override
    public String getB1_7_3Motd() {
        return this.b1_7_3Motd;
    }

    public URL getDefaultConfigURL() {
        return this.getClass().getClassLoader().getResource("assets/vialegacy/vialegacy.yml");
    }

    public List<String> getUnsupportedOptions() {
        return Collections.emptyList();
    }

    @Override
    public boolean isIgnoreLong1_8ChannelNames() {
        return this.ignoreLongChannelNames;
    }
}


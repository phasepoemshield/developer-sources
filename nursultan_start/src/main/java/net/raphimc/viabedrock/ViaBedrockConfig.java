/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.settings.impl.BedrockSettings
 *  com.viaversion.viaversion.util.Config
 *  net.raphimc.viabedrock.platform.ViaBedrockConfig
 *  net.raphimc.viabedrock.platform.ViaBedrockConfig$BlobCacheMode
 *  net.raphimc.viabedrock.platform.ViaBedrockConfig$PackCacheMode
 */
package net.raphimc.viabedrock;

import com.viaversion.viafabricplus.settings.impl.BedrockSettings;
import com.viaversion.viaversion.util.Config;
import java.io.File;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import net.raphimc.viabedrock.platform.ViaBedrockConfig;

public class ViaBedrockConfig
extends Config
implements net.raphimc.viabedrock.platform.ViaBedrockConfig {
    private boolean enableExperimentalFeatures;
    private ViaBedrockConfig.BlobCacheMode blobCacheMode;
    private boolean translateResourcePacks;
    private String resourcePackHost;
    private int resourcePackPort;
    private String resourcePackUrl;
    private ViaBedrockConfig.PackCacheMode packCacheMode;
    private boolean translateShowCoordinatesGameRule;
    private boolean disableServerBlacklist;

    public void reload() {
        super.reload();
        this.loadFields();
    }

    public ViaBedrockConfig(File file, Logger logger) {
        super(file, logger);
    }

    protected void handleConfig(Map<String, Object> map) {
    }

    private void loadFields() {
        this.enableExperimentalFeatures = this.getBoolean("enable-experimental-features", false);
        this.blobCacheMode = ViaBedrockConfig.BlobCacheMode.byName((String)this.getString("blob-cache", "disk"));
        this.translateResourcePacks = this.getBoolean("translate-resource-packs", true);
        this.resourcePackHost = this.getString("resource-pack-host", "127.0.0.1");
        this.resourcePackPort = this.getInt("resource-pack-port", 0);
        this.resourcePackUrl = this.getString("resource-pack-url", "");
        this.packCacheMode = ViaBedrockConfig.PackCacheMode.byName((String)this.getString("pack-cache", "disk"));
        this.translateShowCoordinatesGameRule = this.getBoolean("translate-show-coordinates-game-rule", false);
        this.disableServerBlacklist = this.getBoolean("disable-server-blacklist", false);
    }

    public boolean shouldTranslateShowCoordinatesGameRule() {
        return this.translateShowCoordinatesGameRule;
    }

    public URL getDefaultConfigURL() {
        return ((Object)((Object)this)).getClass().getClassLoader().getResource("assets/viabedrock/viabedrock.yml");
    }

    public List<String> getUnsupportedOptions() {
        return Collections.emptyList();
    }

    public ViaBedrockConfig.PackCacheMode getPackCacheMode() {
        return this.packCacheMode;
    }

    public String getResourcePackUrl() {
        return this.resourcePackUrl;
    }

    public ViaBedrockConfig.BlobCacheMode getBlobCacheMode() {
        return this.blobCacheMode;
    }

    public int getResourcePackPort() {
        return this.resourcePackPort;
    }

    public String getResourcePackHost() {
        return this.resourcePackHost;
    }

    public boolean shouldTranslateResourcePacks() {
        return this.translateResourcePacks;
    }

    public boolean shouldDisableServerBlacklist() {
        return this.disableServerBlacklist;
    }

    public boolean shouldEnableExperimentalFeatures() {
        return (Boolean)BedrockSettings.INSTANCE.experimentalFeatures.getValue();
    }
}


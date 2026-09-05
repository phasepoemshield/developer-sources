/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.configuration.AbstractViaConfig
 *  com.viaversion.viaversion.util.ConfigSection
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.viaversion;

import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viafabricplus.settings.impl.GeneralSettings;
import com.viaversion.viaversion.configuration.AbstractViaConfig;
import com.viaversion.viaversion.util.ConfigSection;
import java.io.File;
import java.util.List;
import java.util.logging.Logger;

public final class ViaFabricPlusConfig
extends AbstractViaConfig {
    public ViaFabricPlusConfig(File file, Logger logger) {
        super(file, logger);
    }

    protected boolean updateConfig() {
        boolean bl = false;
        ConfigSection configSection = this.originalRootSection();
        if (configSection == null) {
            this.set("fix-infested-block-breaking", false);
            this.set("shield-blocking", false);
            this.set("no-delay-shield-blocking", true);
            this.set("handle-invalid-item-count", true);
            this.set("chunk-border-fix", true);
            bl = true;
        }
        if (bl || !configSection.contains("send-player-details")) {
            this.set("send-player-details", false);
            bl = true;
        }
        return super.updateConfig() || bl;
    }

    public boolean use1_8HitboxMargin() {
        return false;
    }

    public boolean isCheckForUpdates() {
        return false;
    }

    public boolean cancelBlockSounds() {
        if (DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled()) {
            return false;
        }
        return super.cancelBlockSounds();
    }

    public boolean fix1_21PlacementRotation() {
        return false;
    }

    public boolean is1_13TeamColourFix() {
        return false;
    }

    public boolean isSimulatePlayerTick() {
        return false;
    }

    public List<String> getUnsupportedOptions() {
        List list = super.getUnsupportedOptions();
        list.add("simulate-pt");
        list.add("fix-1_21-placement-rotation");
        list.add("team-colour-fix");
        list.add("cancel-swing-in-inventory");
        list.add("use-1_8-hitbox-margin");
        return list;
    }

    public boolean cancelSwingInInventory() {
        return false;
    }

    public boolean isServersideBlockConnections() {
        if (((Boolean)GeneralSettings.INSTANCE.experimentalBlockConnections.getValue()).booleanValue()) {
            return false;
        }
        return super.isServersideBlockConnections();
    }
}


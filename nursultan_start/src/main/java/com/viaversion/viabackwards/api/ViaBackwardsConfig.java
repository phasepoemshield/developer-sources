/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.configuration.Config
 */
package com.viaversion.viabackwards.api;

import com.viaversion.viabackwards.api.DialogStyleConfig;
import com.viaversion.viaversion.api.configuration.Config;

public interface ViaBackwardsConfig
extends Config {
    public boolean handlePingsAsInvAcknowledgements();

    public boolean addCustomEnchantsToLore();

    public boolean alwaysShowOriginalMobName();

    public boolean isFix1_13FacePlayer();

    public boolean addTeamColorTo1_13Prefix();

    public boolean suppressEmulationWarnings();

    public boolean codeOfConductAsDialog();

    public boolean bedrockAtY0();

    public boolean mapDisplayEntities();

    public boolean mapDarknessEffect();

    public boolean scaffoldingToWater();

    public boolean mapCustomModelData();

    public DialogStyleConfig dialogStyleConfig();

    public boolean dialogsViaChests();

    public boolean fix1_13FormattedInventoryTitle();

    public boolean sculkShriekerToCryingObsidian();

    public boolean passOriginalItemNameToResourcePacks();
}


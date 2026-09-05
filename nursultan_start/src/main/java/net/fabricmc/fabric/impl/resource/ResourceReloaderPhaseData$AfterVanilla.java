/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 */
package net.fabricmc.fabric.impl.resource;

import minecraft.class01894;
import net.fabricmc.fabric.impl.resource.ResourceReloaderPhaseData;
import net.fabricmc.fabric.impl.resource.ResourceReloaderPhaseData$VanillaStatus;

class ResourceReloaderPhaseData$AfterVanilla
extends ResourceReloaderPhaseData {
    ResourceReloaderPhaseData$AfterVanilla(class01894 class018942) {
        super(class018942, null);
        this.setVanillaStatus(ResourceReloaderPhaseData$VanillaStatus.VANILLA);
    }

    @Override
    public void markBefore() {
    }

    @Override
    public void markAfter() {
    }
}


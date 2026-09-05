/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01081
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.base.toposort.SortableNode
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.resource;

import minecraft.class01081;
import minecraft.class01894;
import net.fabricmc.fabric.impl.base.toposort.SortableNode;
import net.fabricmc.fabric.impl.resource.ResourceReloaderPhaseData$VanillaStatus;
import org.jspecify.annotations.Nullable;

class ResourceReloaderPhaseData
extends SortableNode<ResourceReloaderPhaseData> {
    final class01894 id;
    class01081 resourceReloader;
    ResourceReloaderPhaseData$VanillaStatus vanillaStatus = ResourceReloaderPhaseData$VanillaStatus.NONE;

    protected void addPreviousNode(ResourceReloaderPhaseData resourceReloaderPhaseData) {
        super.addPreviousNode((SortableNode)resourceReloaderPhaseData);
        if (this.vanillaStatus == ResourceReloaderPhaseData$VanillaStatus.VANILLA || this.vanillaStatus == ResourceReloaderPhaseData$VanillaStatus.BEFORE) {
            resourceReloaderPhaseData.markBefore();
        }
    }

    protected void addSubsequentNode(ResourceReloaderPhaseData resourceReloaderPhaseData) {
        super.addSubsequentNode((SortableNode)resourceReloaderPhaseData);
        if (this.vanillaStatus == ResourceReloaderPhaseData$VanillaStatus.VANILLA || this.vanillaStatus == ResourceReloaderPhaseData$VanillaStatus.AFTER) {
            resourceReloaderPhaseData.markAfter();
        }
    }

    ResourceReloaderPhaseData(class01894 class018942, @Nullable class01081 class010812) {
        this.id = class018942;
        this.resourceReloader = class010812;
    }

    public String getDescription() {
        return this.id.toString();
    }

    void setVanillaStatus(ResourceReloaderPhaseData$VanillaStatus resourceReloaderPhaseData$VanillaStatus) {
        if (this.vanillaStatus == ResourceReloaderPhaseData$VanillaStatus.NONE) {
            this.vanillaStatus = resourceReloaderPhaseData$VanillaStatus;
        }
    }

    void markBefore() {
        boolean bl;
        boolean bl2 = bl = this.vanillaStatus == ResourceReloaderPhaseData$VanillaStatus.AFTER;
        if (this.vanillaStatus != ResourceReloaderPhaseData$VanillaStatus.NONE && !bl) {
            return;
        }
        this.vanillaStatus = ResourceReloaderPhaseData$VanillaStatus.BEFORE;
        for (ResourceReloaderPhaseData resourceReloaderPhaseData : this.previousNodes) {
            resourceReloaderPhaseData.markBefore();
        }
    }

    void markAfter() {
        if (this.vanillaStatus != ResourceReloaderPhaseData$VanillaStatus.NONE) {
            return;
        }
        this.vanillaStatus = ResourceReloaderPhaseData$VanillaStatus.AFTER;
        for (ResourceReloaderPhaseData resourceReloaderPhaseData : this.subsequentNodes) {
            resourceReloaderPhaseData.markAfter();
        }
    }
}


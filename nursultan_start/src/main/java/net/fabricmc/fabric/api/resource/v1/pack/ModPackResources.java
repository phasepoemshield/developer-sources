/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01622
 *  net.fabricmc.loader.api.metadata.ModMetadata
 */
package net.fabricmc.fabric.api.resource.v1.pack;

import minecraft.class01622;
import net.fabricmc.loader.api.metadata.ModMetadata;

public interface ModPackResources
extends class01622 {
    public ModMetadata getFabricModMetadata();

    public ModPackResources createOverlay(String var1);
}


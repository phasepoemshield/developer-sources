/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.datagen.client;

import java.util.Set;
import minecraft.class00891;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.datagen.client.FabricModelProviderDefinitions;

@Environment(value=EnvType.CLIENT)
public interface FabricItemAssetDefinitions
extends FabricModelProviderDefinitions {
    public void fabric_setProcessedBlocks(Set<class00891> var1);
}


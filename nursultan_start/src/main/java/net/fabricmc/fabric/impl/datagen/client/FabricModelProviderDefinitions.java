/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 */
package net.fabricmc.fabric.impl.datagen.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

@Environment(value=EnvType.CLIENT)
public interface FabricModelProviderDefinitions {
    public void setFabricDataOutput(FabricDataOutput var1);
}


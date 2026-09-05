/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10512
 *  minecraft.class01996
 *  minecraft.class05404
 *  minecraft.class05422
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 */
package net.fabricmc.fabric.api.client.datagen.v1.provider;

import Nursultan.class10512;
import minecraft.class01996;
import minecraft.class05404;
import minecraft.class05422;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

@Environment(value=EnvType.CLIENT)
public abstract class FabricModelProvider
extends class10512 {
    public FabricModelProvider(FabricDataOutput fabricDataOutput) {
        super((class01996)fabricDataOutput);
    }

    public abstract void generateBlockStateModels(class05404 var1);

    public abstract void generateItemModels(class05422 var1);
}


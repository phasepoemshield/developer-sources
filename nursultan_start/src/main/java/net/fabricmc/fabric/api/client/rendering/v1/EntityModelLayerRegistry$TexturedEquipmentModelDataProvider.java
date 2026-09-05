/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04806
 *  minecraft.class08118
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class04806;
import minecraft.class08118;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface EntityModelLayerRegistry$TexturedEquipmentModelDataProvider {
    public class08118<class04806> createEquipmentModelData();
}


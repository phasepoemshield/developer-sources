/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class08118
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry$TexturedEquipmentModelDataProvider
 *  net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry$TexturedModelDataProvider
 */
package net.fabricmc.fabric.impl.client.rendering;

import java.util.HashMap;
import java.util.Map;
import minecraft.class01134;
import minecraft.class08118;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

@Environment(value=EnvType.CLIENT)
public final class EntityModelLayerImpl {
    public static final Map<class01134, EntityModelLayerRegistry.TexturedModelDataProvider> PROVIDERS = new HashMap<class01134, EntityModelLayerRegistry.TexturedModelDataProvider>();
    public static final Map<class08118<class01134>, EntityModelLayerRegistry.TexturedEquipmentModelDataProvider> EQUIPMENT_PROVIDERS = new HashMap<class08118<class01134>, EntityModelLayerRegistry.TexturedEquipmentModelDataProvider>();

    private EntityModelLayerImpl() {
    }
}


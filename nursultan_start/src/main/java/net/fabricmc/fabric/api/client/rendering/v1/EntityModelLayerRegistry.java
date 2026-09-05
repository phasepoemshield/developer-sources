/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01134
 *  minecraft.class08118
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.EntityModelLayerImpl
 *  net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import java.util.Objects;
import minecraft.class01134;
import minecraft.class08118;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry$TexturedEquipmentModelDataProvider;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry$TexturedModelDataProvider;
import net.fabricmc.fabric.impl.client.rendering.EntityModelLayerImpl;
import net.fabricmc.fabric.mixin.client.rendering.ModelLayersAccessor;

@Environment(value=EnvType.CLIENT)
public final class EntityModelLayerRegistry {
    private EntityModelLayerRegistry() {
    }

    public static void registerEquipmentModelLayers(class08118<class01134> class081182, EntityModelLayerRegistry$TexturedEquipmentModelDataProvider entityModelLayerRegistry$TexturedEquipmentModelDataProvider) {
        Objects.requireNonNull(class081182, "EquipmentModelData cannot be null");
        Objects.requireNonNull(entityModelLayerRegistry$TexturedEquipmentModelDataProvider, "TexturedEquipmentModelDataProvider cannot be null");
        if (EntityModelLayerImpl.EQUIPMENT_PROVIDERS.putIfAbsent(class081182, entityModelLayerRegistry$TexturedEquipmentModelDataProvider) != null) {
            throw new IllegalArgumentException(String.format("Cannot replace registration for entity equipment model layer \"%s\"", class081182));
        }
        class081182.N(ModelLayersAccessor.getLayers()::add);
    }

    public static void registerModelLayer(class01134 class011342, EntityModelLayerRegistry$TexturedModelDataProvider entityModelLayerRegistry$TexturedModelDataProvider) {
        Objects.requireNonNull(class011342, "EntityModelLayer cannot be null");
        Objects.requireNonNull(entityModelLayerRegistry$TexturedModelDataProvider, "TexturedModelDataProvider cannot be null");
        if (EntityModelLayerImpl.PROVIDERS.putIfAbsent(class011342, entityModelLayerRegistry$TexturedModelDataProvider) != null) {
            throw new IllegalArgumentException(String.format("Cannot replace registration for entity model layer \"%s\"", class011342));
        }
        ModelLayersAccessor.getLayers().add(class011342);
    }
}


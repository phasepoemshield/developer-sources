/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.entity.DimensionData
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.data.entity;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.DimensionData;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface EntityTracker {
    public boolean hasEntity(int var1);

    public void clear();

    @Deprecated
    public UserConnection user();

    public void setCurrentDimensionId(int var1);

    public int currentWorldSectionHeight();

    public @Nullable StoredEntityData entityDataIfPresent(int var1);

    public @Nullable String currentWorld();

    public void setCurrentWorld(String var1);

    public void setClientEntityId(int var1);

    public void clearEntities();

    public void setCurrentMinY(int var1);

    public void setDimensions(Map<String, DimensionData> var1);

    public void setBiomesSent(int var1);

    public @Nullable DimensionData dimensionData(int var1);

    public @Nullable DimensionData dimensionData(String var1);

    public void setInstaBuild(boolean var1);

    public void removeEntity(int var1);

    public boolean canInstaBuild();

    public @Nullable TrackedEntity entity(int var1);

    public @Nullable EntityType entityType(int var1);

    public @Nullable StoredEntityData entityData(int var1);

    public EntityType playerType();

    public void addEntity(int var1, EntityType var2);

    public int biomesSent();

    public int currentDimensionId();

    public int currentMinY();

    public void setCurrentWorldSectionHeight(int var1);

    public int clientEntityId() throws IllegalStateException;

    public boolean hasClientEntityId();
}


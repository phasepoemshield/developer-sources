/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.TrackedEntity
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter.entitydata;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.TrackedEntity;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface EntityDataHandlerEvent {
    default public int index() {
        return this.data().id();
    }

    public EntityData data();

    public void cancel();

    public boolean cancelled();

    public UserConnection user();

    default public boolean hasExtraData() {
        return this.extraData() != null;
    }

    default public void setIndex(int index) {
        this.data().setId(index);
    }

    default public @Nullable EntityType entityType() {
        return this.trackedEntity() != null ? this.trackedEntity().entityType() : null;
    }

    public int entityId();

    public List<EntityData> dataList();

    public @Nullable List<EntityData> extraData();

    public void createExtraData(EntityData var1);

    public @Nullable TrackedEntity trackedEntity();

    public @Nullable EntityData dataAtIndex(int var1);
}


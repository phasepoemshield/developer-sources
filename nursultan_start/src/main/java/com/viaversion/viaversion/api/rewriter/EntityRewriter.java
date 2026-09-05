/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.rewriter.Rewriter;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface EntityRewriter<T extends Protocol<?, ?, ?, ?>>
extends Rewriter<T> {
    public String mappedEntityIdentifier(String var1);

    public void handleEntityData(int var1, List<EntityData> var2, UserConnection var3);

    default public EntityType objectTypeFromId(int type, int data) {
        return this.typeFromId(type);
    }

    public int newEntityId(int var1);

    public EntityType typeFromId(int var1);

    public @Nullable EntityType typeFromId(String var1);

    default public <E extends EntityTracker> E tracker(UserConnection connection) {
        return (E)connection.getEntityTracker(this.protocol().getClass());
    }
}


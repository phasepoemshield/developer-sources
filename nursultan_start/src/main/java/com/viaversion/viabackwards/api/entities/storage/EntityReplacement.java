/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.util.ComponentUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.api.entities.storage;

import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.WrappedEntityData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.util.ComponentUtil;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.Nullable;

public class EntityReplacement {
    private final BackwardsProtocol<?, ?, ?, ?> protocol;
    private final int id;
    private final int replacementId;
    private final String key;
    private ComponentType componentType = ComponentType.NONE;
    private EntityDataCreator defaultData;

    public EntityReplacement tagName() {
        this.componentType = ComponentType.TAG;
        return this;
    }

    public EntityReplacement(BackwardsProtocol<?, ?, ?, ?> protocol, EntityType type, int replacementId) {
        this(protocol, type.name(), type.getId(), replacementId);
    }

    public EntityReplacement(BackwardsProtocol<?, ?, ?, ?> protocol, String key, int id, int replacementId) {
        this.protocol = protocol;
        this.id = id;
        this.replacementId = replacementId;
        this.key = key.toLowerCase(Locale.ROOT);
    }

    public String toString() {
        return "EntityReplacement{protocol=" + String.valueOf(this.protocol) + ", id=" + this.id + ", replacementId=" + this.replacementId + ", key='" + this.key + "', componentType=" + String.valueOf((Object)this.componentType) + ", defaultData=" + String.valueOf(this.defaultData) + "}";
    }

    public @Nullable Object entityName() {
        if (this.componentType == ComponentType.NONE) {
            return null;
        }
        String name = this.protocol.getMappingData().mappedEntityName(this.key);
        if (name == null) {
            return null;
        }
        if (this.componentType == ComponentType.JSON) {
            return ComponentUtil.legacyToJson((String)name);
        }
        if (this.componentType == ComponentType.TAG) {
            return new StringTag(name);
        }
        return name;
    }

    public int typeId() {
        return this.id;
    }

    public @Nullable EntityDataCreator defaultData() {
        return this.defaultData;
    }

    public boolean hasBaseData() {
        return this.defaultData != null;
    }

    public EntityReplacement spawnEntityData(EntityDataCreator handler) {
        this.defaultData = handler;
        return this;
    }

    public boolean isObjectType() {
        return false;
    }

    public EntityReplacement plainName() {
        this.componentType = ComponentType.PLAIN;
        return this;
    }

    public int objectData() {
        return -1;
    }

    public EntityReplacement jsonName() {
        this.componentType = ComponentType.JSON;
        return this;
    }

    public int replacementId() {
        return this.replacementId;
    }

    private static enum ComponentType {
        PLAIN,
        JSON,
        TAG,
        NONE;

    }

    @FunctionalInterface
    public static interface EntityDataCreator {
        public void createData(WrappedEntityData var1);
    }
}


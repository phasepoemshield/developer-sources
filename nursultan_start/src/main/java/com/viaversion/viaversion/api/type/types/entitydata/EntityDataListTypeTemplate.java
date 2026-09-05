/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.type.Type
 */
package com.viaversion.viaversion.api.type.types.entitydata;

import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.type.Type;
import java.util.List;

public abstract class EntityDataListTypeTemplate
extends Type<List<EntityData>> {
    protected EntityDataListTypeTemplate() {
        super("Entity data list", List.class);
    }

    public Class<? extends Type> getBaseClass() {
        return EntityDataListTypeTemplate.class;
    }
}


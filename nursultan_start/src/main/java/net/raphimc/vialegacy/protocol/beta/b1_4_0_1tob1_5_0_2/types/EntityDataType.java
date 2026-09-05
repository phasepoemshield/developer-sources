/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.type.types.entitydata.OldEntityDataType
 *  net.raphimc.vialegacy.protocol.beta.b1_4_0_1tob1_5_0_2.types.EntityDataTypesb1_4
 */
package net.raphimc.vialegacy.protocol.beta.b1_4_0_1tob1_5_0_2.types;

import com.viaversion.viaversion.api.type.types.entitydata.OldEntityDataType;
import net.raphimc.vialegacy.protocol.beta.b1_4_0_1tob1_5_0_2.types.EntityDataTypesb1_4;

public class EntityDataType
extends OldEntityDataType {
    protected com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType getType(int index) {
        return EntityDataTypesb1_4.byId((int)index);
    }
}


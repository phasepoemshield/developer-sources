/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.type.types.entitydata.OldEntityDataType
 *  net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types.EntityDataTypesb1_2
 */
package net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types;

import com.viaversion.viaversion.api.type.types.entitydata.OldEntityDataType;
import net.raphimc.vialegacy.protocol.beta.b1_2_0_2tob1_3_0_1.types.EntityDataTypesb1_2;

public class EntityDataType
extends OldEntityDataType {
    protected com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType getType(int index) {
        return EntityDataTypesb1_2.byId((int)index);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.type.types.entitydata.OldEntityDataType
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.EntityDataTypes1_3_1
 */
package net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types;

import com.viaversion.viaversion.api.type.types.entitydata.OldEntityDataType;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.EntityDataTypes1_3_1;

public class EntityDataType
extends OldEntityDataType {
    protected com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType getType(int index) {
        return EntityDataTypes1_3_1.byId((int)index);
    }
}


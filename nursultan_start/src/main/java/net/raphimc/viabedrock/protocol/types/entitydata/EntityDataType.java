/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.type.types.entitydata.EntityDataTypeTemplate
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.DataItemType
 *  net.raphimc.viabedrock.protocol.types.entitydata.EntityDataTypesBedrock
 */
package net.raphimc.viabedrock.protocol.types.entitydata;

import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.type.types.entitydata.EntityDataTypeTemplate;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.DataItemType;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;
import net.raphimc.viabedrock.protocol.types.entitydata.EntityDataTypesBedrock;

public class EntityDataType
extends EntityDataTypeTemplate {
    public void write(ByteBuf buffer, EntityData value) {
        BedrockTypes.UNSIGNED_VAR_INT.write(buffer, value.id());
        BedrockTypes.UNSIGNED_VAR_INT.write(buffer, value.dataType().typeId());
        value.dataType().type().write(buffer, value.value());
    }

    public EntityData read(ByteBuf buffer) {
        int index = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
        int rawDataItemType = BedrockTypes.UNSIGNED_VAR_INT.read(buffer);
        DataItemType dataItemType = DataItemType.getByValue((int)rawDataItemType, (DataItemType)DataItemType.Unknown);
        if (dataItemType == DataItemType.Unknown) {
            throw new IllegalStateException("Unknown DataItemType: " + rawDataItemType);
        }
        EntityDataTypesBedrock type = EntityDataTypesBedrock.byDataItemType((DataItemType)dataItemType);
        return new EntityData(index, (com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType)type, type.type().read(buffer));
    }
}


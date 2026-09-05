/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.util.EnumUtil
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SerializedAbilitiesData_SerializedAbilitiesLayer
 *  net.raphimc.viabedrock.protocol.model.PlayerAbilities
 *  net.raphimc.viabedrock.protocol.model.PlayerAbilities$AbilitiesLayer
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import net.raphimc.viabedrock.api.util.EnumUtil;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.AbilitiesIndex;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SerializedAbilitiesData_SerializedAbilitiesLayer;
import net.raphimc.viabedrock.protocol.model.PlayerAbilities;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class PlayerAbilitiesType
extends Type<PlayerAbilities> {
    public PlayerAbilitiesType() {
        super(PlayerAbilities.class);
    }

    public void write(ByteBuf buffer, PlayerAbilities value) {
        buffer.writeLongLE(value.entityUniqueId());
        buffer.writeByte((int)value.playerPermission());
        buffer.writeByte((int)value.commandPermission());
        BedrockTypes.UNSIGNED_VAR_INT.writePrimitive(buffer, value.abilityLayers().size());
        for (Map.Entry entry : value.abilityLayers().entrySet()) {
            buffer.writeShortLE(((SerializedAbilitiesData_SerializedAbilitiesLayer)entry.getKey()).getValue());
            buffer.writeIntLE(EnumUtil.getIntBitmaskFromEnumSet((Set)((PlayerAbilities.AbilitiesLayer)entry.getValue()).abilitiesSet(), AbilitiesIndex::getValue));
            buffer.writeIntLE(EnumUtil.getIntBitmaskFromEnumSet((Set)((PlayerAbilities.AbilitiesLayer)entry.getValue()).abilityValues(), AbilitiesIndex::getValue));
            buffer.writeFloatLE(((PlayerAbilities.AbilitiesLayer)entry.getValue()).flySpeed());
            buffer.writeFloatLE(((PlayerAbilities.AbilitiesLayer)entry.getValue()).verticalFlySpeed());
            buffer.writeFloatLE(((PlayerAbilities.AbilitiesLayer)entry.getValue()).walkSpeed());
        }
    }

    public PlayerAbilities read(ByteBuf buffer) {
        long entityUniqueId = buffer.readLongLE();
        byte playerPermission = buffer.readByte();
        byte commandPermission = buffer.readByte();
        int layerCount = BedrockTypes.UNSIGNED_VAR_INT.readPrimitive(buffer);
        EnumMap<SerializedAbilitiesData_SerializedAbilitiesLayer, PlayerAbilities.AbilitiesLayer> abilityLayers = new EnumMap<SerializedAbilitiesData_SerializedAbilitiesLayer, PlayerAbilities.AbilitiesLayer>(SerializedAbilitiesData_SerializedAbilitiesLayer.class);
        for (int i = 0; i < layerCount; ++i) {
            SerializedAbilitiesData_SerializedAbilitiesLayer layer = SerializedAbilitiesData_SerializedAbilitiesLayer.getByValue((int)buffer.readUnsignedShortLE(), (SerializedAbilitiesData_SerializedAbilitiesLayer)SerializedAbilitiesData_SerializedAbilitiesLayer.CustomCache);
            Set abilitiesSet = EnumUtil.getEnumSetFromBitmask(AbilitiesIndex.class, (long)buffer.readUnsignedIntLE(), AbilitiesIndex::getValue);
            Set abilityValues = EnumUtil.getEnumSetFromBitmask(AbilitiesIndex.class, (long)buffer.readUnsignedIntLE(), AbilitiesIndex::getValue);
            float flySpeed = buffer.readFloatLE();
            float verticalFlySpeed = buffer.readFloatLE();
            float walkSpeed = buffer.readFloatLE();
            if (abilityLayers.containsKey(layer)) continue;
            abilityLayers.put(layer, new PlayerAbilities.AbilitiesLayer(abilitiesSet, abilityValues, walkSpeed, flySpeed, verticalFlySpeed));
        }
        return new PlayerAbilities(entityUniqueId, playerPermission, commandPermission, abilityLayers);
    }
}


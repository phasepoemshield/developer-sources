/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.WorldIdentifiers
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.data.DimensionRegistries1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.storage.InventoryTracker1_16
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.WorldIdentifiers;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.Protocol1_15_2To1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.data.AttributeMappings1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.data.DimensionRegistries1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.storage.InventoryTracker1_16;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.Key;
import java.util.UUID;

public class EntityPacketRewriter1_16
extends EntityRewriter<ClientboundPackets1_15, Protocol1_15_2To1_16> {
    private final PacketHandler DIMENSION_HANDLER = wrapper -> {
        String dimensionName;
        WorldIdentifiers map = Via.getConfig().get1_16WorldNamesMap();
        WorldIdentifiers userMap = (WorldIdentifiers)wrapper.user().get(WorldIdentifiers.class);
        if (userMap != null) {
            map = userMap;
        }
        int dimension = (Integer)wrapper.read((Type)Types.INT);
        String outputName = switch (dimension) {
            case -1 -> {
                dimensionName = "minecraft:the_nether";
                yield map.nether();
            }
            case 0 -> {
                dimensionName = "minecraft:overworld";
                yield map.overworld();
            }
            case 1 -> {
                dimensionName = "minecraft:the_end";
                yield map.end();
            }
            default -> {
                ((Protocol1_15_2To1_16)this.protocol).getLogger().warning("Invalid dimension id: " + dimension);
                dimensionName = "minecraft:overworld";
                yield map.overworld();
            }
        };
        wrapper.write(Types.STRING, (Object)dimensionName);
        wrapper.write(Types.STRING, (Object)outputName);
        this.trackWorld(wrapper.user(), outputName);
    };

    public EntityPacketRewriter1_16(Protocol1_15_2To1_16 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_14)Types1_16.ENTITY_DATA_TYPES).byId(arg_0));
        this.registerEntityDataTypeHandler(Types1_16.ENTITY_DATA_TYPES.itemType, Types1_16.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_16.ENTITY_DATA_TYPES.particleType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_16.ABSTRACT_MINECART, 10);
        this.filter().type((EntityType)EntityTypes1_16.ABSTRACT_ARROW).removeIndex(8);
        this.filter().type((EntityType)EntityTypes1_16.WOLF).index(16).handler((event, data) -> {
            byte mask = (Byte)data.value();
            int angerTime = (mask & 2) != 0 ? Integer.MAX_VALUE : 0;
            event.createExtraData(new EntityData(20, Types1_16.ENTITY_DATA_TYPES.varIntType, (Object)angerTime));
        });
    }

    protected void registerPackets() {
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.ADD_GLOBAL_ENTITY, ClientboundPackets1_16.ADD_ENTITY, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            byte type = (Byte)wrapper.read((Type)Types.BYTE);
            if (type != 1) {
                wrapper.cancel();
                return;
            }
            wrapper.user().getEntityTracker(Protocol1_15_2To1_16.class).addEntity(entityId, (EntityType)EntityTypes1_16.LIGHTNING_BOLT);
            wrapper.write(Types.UUID, (Object)UUID.randomUUID());
            wrapper.write((Type)Types.VAR_INT, (Object)EntityTypes1_16.LIGHTNING_BOLT.getId());
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write((Type)Types.INT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
        });
        this.registerTracker(ClientboundPackets1_15.ADD_PLAYER, (EntityType)EntityTypes1_16.PLAYER);
        this.registerSetEntityData(ClientboundPackets1_15.SET_ENTITY_DATA, Types1_14.ENTITY_DATA_LIST, Types1_16.ENTITY_DATA_LIST);
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(EntityPacketRewriter1_16.this.DIMENSION_HANDLER);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    wrapper.write((Type)Types.BYTE, (Object)-1);
                    boolean keepAttributes = wrapper.user().getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_15);
                    String levelType = (String)wrapper.read(Types.STRING);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    wrapper.write((Type)Types.BOOLEAN, (Object)levelType.equals("flat"));
                    wrapper.write((Type)Types.BOOLEAN, (Object)keepAttributes);
                });
            }
        });
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    wrapper.write((Type)Types.BYTE, (Object)-1);
                    wrapper.write(Types.STRING_ARRAY, (Object)DimensionRegistries1_16.getWorldNames());
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)DimensionRegistries1_16.getDimensionsTag());
                });
                this.handler(EntityPacketRewriter1_16.this.DIMENSION_HANDLER);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(EntityPacketRewriter1_16.this.playerTrackerHandler());
                this.handler(wrapper -> {
                    String type = (String)wrapper.read(Types.STRING);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    wrapper.write((Type)Types.BOOLEAN, (Object)type.equals("flat"));
                });
            }
        });
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.UPDATE_ATTRIBUTES, wrapper -> {
            int size;
            wrapper.passthrough((Type)Types.VAR_INT);
            int actualSize = size = ((Integer)wrapper.passthrough((Type)Types.INT)).intValue();
            for (int i = 0; i < size; ++i) {
                int j;
                int modifierSize;
                String key = (String)wrapper.read(Types.STRING);
                String attributeIdentifier = (String)AttributeMappings1_16.attributeIdentifierMappings().get((Object)key);
                if (attributeIdentifier == null && !Key.isValid((String)(attributeIdentifier = Key.namespaced((String)key)))) {
                    if (Via.getConfig().logOtherConversionWarnings()) {
                        ((Protocol1_15_2To1_16)this.protocol).getLogger().warning("Invalid attribute: " + key);
                    }
                    --actualSize;
                    wrapper.read((Type)Types.DOUBLE);
                    modifierSize = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (j = 0; j < modifierSize; ++j) {
                        wrapper.read(Types.UUID);
                        wrapper.read((Type)Types.DOUBLE);
                        wrapper.read((Type)Types.BYTE);
                    }
                    continue;
                }
                wrapper.write(Types.STRING, (Object)attributeIdentifier);
                wrapper.passthrough((Type)Types.DOUBLE);
                modifierSize = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (j = 0; j < modifierSize; ++j) {
                    wrapper.passthrough(Types.UUID);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.BYTE);
                }
            }
            if (size != actualSize) {
                wrapper.set((Type)Types.INT, 0, (Object)actualSize);
            }
        });
        ((Protocol1_15_2To1_16)this.protocol).registerServerbound(ServerboundPackets1_16.SWING, wrapper -> {
            if (!Via.getConfig().cancelSwingInInventory()) {
                return;
            }
            InventoryTracker1_16 inventoryTracker = (InventoryTracker1_16)wrapper.user().get(InventoryTracker1_16.class);
            if (inventoryTracker.isInventoryOpen()) {
                wrapper.cancel();
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_16.getTypeFromId((int)type);
    }
}


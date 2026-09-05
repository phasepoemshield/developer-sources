/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.provider;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities.BannerHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities.BedHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities.CommandBlockHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities.FlowerPotHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities.SkullHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.blockentities.SpawnerHandler;
import com.viaversion.viaversion.util.ComponentUtil;
import java.util.HashMap;
import java.util.Map;

public class BlockEntityProvider
implements Provider {
    private final Map<String, BlockEntityHandler> handlers = new HashMap<String, BlockEntityHandler>();

    public BlockEntityProvider() {
        this.handlers.put("minecraft:flower_pot", new FlowerPotHandler());
        this.handlers.put("minecraft:bed", new BedHandler());
        this.handlers.put("minecraft:banner", new BannerHandler());
        this.handlers.put("minecraft:skull", new SkullHandler());
        this.handlers.put("minecraft:mob_spawner", new SpawnerHandler());
        this.handlers.put("minecraft:command_block", new CommandBlockHandler());
        BlockEntityHandler customNameHandler = (user, tag) -> {
            StringTag name = tag.getStringTag("CustomName");
            if (name != null) {
                name.setValue(ComponentUtil.legacyToJsonString((String)name.getValue()));
            }
            return -1;
        };
        this.handlers.put("minecraft:chest", customNameHandler);
        this.handlers.put("minecraft:dispenser", customNameHandler);
        this.handlers.put("minecraft:dropper", customNameHandler);
        this.handlers.put("minecraft:enchanting_table", customNameHandler);
        this.handlers.put("minecraft:furnace", customNameHandler);
        this.handlers.put("minecraft:hopper", customNameHandler);
        this.handlers.put("minecraft:shulker_box", customNameHandler);
    }

    public int transform(UserConnection user, BlockPosition position, CompoundTag tag, boolean sendUpdate) {
        StringTag idTag = tag.getStringTag("id");
        if (idTag == null) {
            return -1;
        }
        BlockEntityHandler handler = this.handlers.get(idTag.getValue());
        if (handler == null) {
            if (Via.getManager().isDebug()) {
                Protocol1_12_2To1_13.LOGGER.warning("Unhandled BlockEntity " + idTag.getValue() + " full tag: " + String.valueOf(tag));
            }
            return -1;
        }
        int newBlock = handler.transform(user, tag);
        if (sendUpdate && newBlock != -1) {
            this.sendBlockChange(user, position, newBlock);
        }
        return newBlock;
    }

    private void sendBlockChange(UserConnection user, BlockPosition position, int blockId) {
        PacketWrapper wrapper = PacketWrapper.create((PacketType)ClientboundPackets1_13.BLOCK_UPDATE, null, (UserConnection)user);
        wrapper.write(Types.BLOCK_POSITION1_8, (Object)position);
        wrapper.write((Type)Types.VAR_INT, (Object)blockId);
        wrapper.send(Protocol1_12_2To1_13.class);
    }

    @FunctionalInterface
    public static interface BlockEntityHandler {
        public int transform(UserConnection var1, CompoundTag var2);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$EntityType
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.data.ChatItemRewriter
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.data.TranslateRewriter
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter.EntityPacketRewriter1_12
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter.ItemPacketRewriter1_12
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 */
package com.viaversion.viaversion.protocols.v1_11_1to1_12;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.data.ChatItemRewriter;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.data.TranslateRewriter;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.provider.InventoryQuickMoveProvider;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter.EntityPacketRewriter1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter.ItemPacketRewriter1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;

public class Protocol1_11_1To1_12
extends AbstractProtocol<ClientboundPackets1_9_3, ClientboundPackets1_12, ServerboundPackets1_9_3, ServerboundPackets1_12> {
    private final EntityPacketRewriter1_12 entityRewriter = new EntityPacketRewriter1_12(this);
    private final ItemPacketRewriter1_12 itemRewriter = new ItemPacketRewriter1_12(this);

    public Protocol1_11_1To1_12() {
        super(ClientboundPackets1_9_3.class, ClientboundPackets1_12.class, ServerboundPackets1_9_3.class, ServerboundPackets1_12.class);
    }

    public void register(ViaProviders providers) {
        providers.register(InventoryQuickMoveProvider.class, (Provider)new InventoryQuickMoveProvider());
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_12.EntityType.PLAYER));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.SOUND, wrapper -> {
            int soundId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int mappedId = this.getNewSoundId(soundId);
            if (mappedId == -1) {
                wrapper.cancel();
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.CHAT, wrapper -> {
            JsonElement element = (JsonElement)wrapper.passthrough(Types.COMPONENT);
            TranslateRewriter.toClient((UserConnection)wrapper.user(), (JsonElement)element);
            ChatItemRewriter.toClient((JsonElement)element);
            wrapper.set(Types.COMPONENT, 0, (Object)element);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_11_1To1_12.class);
            ChunkType1_9_3 type = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)wrapper.passthrough((Type)type);
            for (int s = 0; s < chunk.getSections().length; ++s) {
                ChunkSection section = chunk.getSections()[s];
                if (section == null) continue;
                DataPalette blocks = section.palette(PaletteType.BLOCKS);
                for (int idx = 0; idx < 4096; ++idx) {
                    int id = blocks.idAt(idx) >> 4;
                    if (id != 26) continue;
                    CompoundTag tag = new CompoundTag();
                    tag.put("color", (Tag)new IntTag(14));
                    tag.put("x", (Tag)new IntTag(ChunkSection.xFromIndex((int)idx) + (chunk.getX() << 4)));
                    tag.put("y", (Tag)new IntTag(ChunkSection.yFromIndex((int)idx) + (s << 4)));
                    tag.put("z", (Tag)new IntTag(ChunkSection.zFromIndex((int)idx) + (chunk.getZ() << 4)));
                    tag.put("id", (Tag)new StringTag("minecraft:bed"));
                    chunk.getBlockEntities().add(tag);
                }
            }
        });
        this.cancelServerbound(ServerboundPackets1_12.CRAFTING_RECIPE_PLACEMENT);
        this.registerServerbound(ServerboundPackets1_12.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    String locale = (String)wrapper.get(Types.STRING, 0);
                    if (locale.length() > 7) {
                        wrapper.set(Types.STRING, 0, (Object)locale.substring(0, 7));
                    }
                });
            }
        });
        this.cancelServerbound(ServerboundPackets1_12.RECIPE_BOOK_UPDATE);
        this.cancelServerbound(ServerboundPackets1_12.SEEN_ADVANCEMENTS);
    }

    public ItemPacketRewriter1_12 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_12 getEntityRewriter() {
        return this.entityRewriter;
    }

    private int getNewSoundId(int id) {
        int newId = id;
        if (id >= 26) {
            newId += 2;
        }
        if (id >= 70) {
            newId += 4;
        }
        if (id >= 74) {
            ++newId;
        }
        if (id >= 143) {
            newId += 3;
        }
        if (id >= 185) {
            ++newId;
        }
        if (id >= 263) {
            newId += 7;
        }
        if (id >= 301) {
            newId += 33;
        }
        if (id >= 317) {
            newId += 2;
        }
        if (id >= 491) {
            newId += 3;
        }
        return newId;
    }
}


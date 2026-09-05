/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.LastDeathPosition
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 */
package com.viaversion.viabackwards.protocol.v1_19to1_18_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.api.rewriters.EnchantmentRewriter;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.Protocol1_19To1_18_2;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.LastDeathPosition;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.rewriter.RecipeRewriter;

public final class BlockItemPacketRewriter1_19
extends BackwardsItemRewriter<ClientboundPackets1_19, ServerboundPackets1_17, Protocol1_19To1_18_2> {
    private final EnchantmentRewriter enchantmentRewriter = new EnchantmentRewriter((BackwardsItemRewriter)this);

    public BlockItemPacketRewriter1_19(Protocol1_19To1_18_2 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        int identifier = item.identifier();
        item = super.handleItemToClient(connection, item);
        if (identifier != 834) {
            return item;
        }
        LastDeathPosition lastDeathPosition = (LastDeathPosition)connection.get(LastDeathPosition.class);
        if (lastDeathPosition == null) {
            return item;
        }
        GlobalBlockPosition position = lastDeathPosition.position();
        CompoundTag lodestonePosTag = new CompoundTag();
        item.tag().putBoolean(this.nbtTagName(), true);
        item.tag().put("LodestonePos", (Tag)lodestonePosTag);
        item.tag().putString("LodestoneDimension", position.dimension());
        lodestonePosTag.putInt("X", position.x());
        lodestonePosTag.putInt("Y", position.y());
        lodestonePosTag.putInt("Z", position.z());
        this.enchantmentRewriter.handleToClient(item);
        return item;
    }

    protected void registerRewrites() {
        this.enchantmentRewriter.registerEnchantment("minecraft:swift_sneak", "\u00a77Swift Sneak");
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        item = super.handleItemToServer(connection, item);
        CompoundTag tag = item.tag();
        if (item.identifier() == 834 && tag != null) {
            if (tag.contains(this.nbtTagName())) {
                tag.remove(this.nbtTagName());
                tag.remove("LodestonePos");
                tag.remove("LodestoneDimension");
            }
            if (tag.isEmpty()) {
                item.setTag(null);
            }
        }
        this.enchantmentRewriter.handleToServer(item);
        return item;
    }

    protected void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_19.UPDATE_RECIPES);
        ((Protocol1_19To1_18_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.MERCHANT_OFFERS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int size = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)size));
                    for (int i = 0; i < size; ++i) {
                        BlockItemPacketRewriter1_19.this.passthroughClientboundItem(wrapper);
                        BlockItemPacketRewriter1_19.this.passthroughClientboundItem(wrapper);
                        Item secondItem = (Item)wrapper.read(Types.ITEM1_13_2);
                        if (secondItem != null) {
                            secondItem = BlockItemPacketRewriter1_19.this.handleItemToClient(wrapper.user(), secondItem);
                            wrapper.write((Type)Types.BOOLEAN, (Object)true);
                            wrapper.write(Types.ITEM1_13_2, (Object)secondItem);
                        } else {
                            wrapper.write((Type)Types.BOOLEAN, (Object)false);
                        }
                        wrapper.passthrough((Type)Types.BOOLEAN);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.INT);
                        wrapper.passthrough((Type)Types.FLOAT);
                        wrapper.passthrough((Type)Types.INT);
                    }
                });
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19.BLOCK_CHANGED_ACK, null, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.VAR_INT);
                this.handler(PacketWrapper::cancel);
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT, (Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ParticleMappings particleMappings;
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == (particleMappings = ((Protocol1_19To1_18_2)BlockItemPacketRewriter1_19.this.protocol).getMappingData().getParticleMappings()).id("sculk_charge")) {
                        wrapper.set((Type)Types.INT, 0, (Object)-1);
                        wrapper.cancel();
                    } else if (id == particleMappings.id("shriek")) {
                        wrapper.set((Type)Types.INT, 0, (Object)-1);
                        wrapper.cancel();
                    } else if (id == particleMappings.id("vibration")) {
                        wrapper.set((Type)Types.INT, 0, (Object)-1);
                        wrapper.cancel();
                    }
                });
                this.handler(((Protocol1_19To1_18_2)BlockItemPacketRewriter1_19.this.protocol).getParticleRewriter().levelParticlesHandler1_13((Type)Types.INT));
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.create((Type)Types.VAR_INT, 0);
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BOOLEAN);
                this.create((Type)Types.VAR_INT, 0);
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.USE_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.create((Type)Types.VAR_INT, 0);
            }
        });
        ((Protocol1_19To1_18_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_17.SET_BEACON, wrapper -> {
            int primaryEffect = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (primaryEffect > 0) {
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
                wrapper.write((Type)Types.VAR_INT, (Object)primaryEffect);
            } else {
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
            }
            int secondaryEffect = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (secondaryEffect > 0) {
                wrapper.write((Type)Types.BOOLEAN, (Object)true);
                wrapper.write((Type)Types.VAR_INT, (Object)secondaryEffect);
            } else {
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
            }
        });
    }
}


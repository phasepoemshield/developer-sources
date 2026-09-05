/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.Protocol1_20_2To1_20_3
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.StringUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.Protocol1_20_2To1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter.RecipeRewriter1_20_2;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_20_3
extends ItemRewriter<ClientboundPacket1_20_2, ServerboundPacket1_20_3, Protocol1_20_2To1_20_3> {
    public BlockItemPacketRewriter1_20_3(Protocol1_20_2To1_20_3 protocol) {
        super((Protocol)protocol, Types.ITEM1_20_2, Types.ITEM1_20_2_ARRAY);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        if (tag != null && item.identifier() == 1047) {
            CompoundTag filteredPages;
            ListTag pages = tag.getListTag("pages", StringTag.class);
            if (pages != null) {
                for (StringTag pageTag : pages) {
                    this.updatePageTag(pageTag);
                }
            }
            if ((filteredPages = tag.getCompoundTag("filtered_pages")) != null) {
                for (String string : filteredPages.keySet()) {
                    this.updatePageTag(filteredPages.getStringTag(string));
                }
            }
        }
        return super.handleItemToClient(connection, item);
    }

    public void registerPackets() {
        ((Protocol1_20_2To1_20_3)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
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
                    int id = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (id == (particleMappings = ((Protocol1_20_2To1_20_3)BlockItemPacketRewriter1_20_3.this.protocol).getMappingData().getParticleMappings()).id("vibration")) {
                        String resourceLocation = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
                        wrapper.write((Type)Types.VAR_INT, (Object)(resourceLocation.equals("block") ? 0 : 1));
                    }
                });
                this.handler(((Protocol1_20_2To1_20_3)BlockItemPacketRewriter1_20_3.this.protocol).getParticleRewriter().levelParticlesHandler1_13((Type)Types.VAR_INT));
            }
        });
        new RecipeRewriter1_20_2<ClientboundPacket1_20_2>(this.protocol){

            public void handleCraftingShaped(PacketWrapper wrapper) {
                int width = (Integer)wrapper.read((Type)Types.VAR_INT);
                int height = (Integer)wrapper.read((Type)Types.VAR_INT);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.write((Type)Types.VAR_INT, (Object)width);
                wrapper.write((Type)Types.VAR_INT, (Object)height);
                int ingredients = height * width;
                for (int i = 0; i < ingredients; ++i) {
                    this.handleIngredient(wrapper);
                }
                this.rewrite(wrapper.user(), (Item)wrapper.passthrough(this.itemType()));
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        }.register(ClientboundPackets1_20_2.UPDATE_RECIPES);
        ((Protocol1_20_2To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.EXPLODE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            int blocks = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < blocks; ++i) {
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough((Type)Types.BYTE);
            }
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.write((Type)Types.VAR_INT, (Object)1);
            wrapper.write((Type)Types1_20_3.PARTICLE, (Object)new Particle(((Protocol1_20_2To1_20_3)this.protocol).getMappingData().getParticleMappings().mappedId("explosion")));
            wrapper.write((Type)Types1_20_3.PARTICLE, (Object)new Particle(((Protocol1_20_2To1_20_3)this.protocol).getMappingData().getParticleMappings().mappedId("explosion_emitter")));
            wrapper.write(Types.STRING, (Object)"minecraft:entity.generic.explode");
            wrapper.write((Type)Types.OPTIONAL_FLOAT, null);
        });
    }

    private void updatePageTag(StringTag pageTag) {
        block2: {
            try {
                JsonElement updatedComponent = ComponentUtil.convertJson((String)pageTag.getValue(), (SerializerVersion)SerializerVersion.V1_19_4, (SerializerVersion)SerializerVersion.V1_20_3);
                pageTag.setValue(updatedComponent.toString());
            }
            catch (Exception e) {
                if (!Via.getConfig().logTextComponentConversionErrors()) break block2;
                ((Protocol1_20_2To1_20_3)this.protocol).getLogger().log(Level.SEVERE, "Error during book conversion: " + StringUtil.forLogging((String)pageTag.getValue()), (Throwable)e);
            }
        }
    }
}


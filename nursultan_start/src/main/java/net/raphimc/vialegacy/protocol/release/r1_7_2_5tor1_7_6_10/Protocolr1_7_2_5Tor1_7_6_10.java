/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.v1_7.ClientboundBaseProtocol1_7
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.util.GameProfileUtil
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.v1_7.ClientboundBaseProtocol1_7;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.util.GameProfileUtil;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ClientboundPackets1_7_2;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.packet.ServerboundPackets1_7_2;
import net.raphimc.vialegacy.protocol.release.r1_7_2_5tor1_7_6_10.rewriter.TextRewriter;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_7_2_5Tor1_7_6_10
extends AbstractProtocol<ClientboundPackets1_7_2, ClientboundPackets1_7_2, ServerboundPackets1_7_2, ServerboundPackets1_7_2> {
    private static final String UUID_PATTERN = "[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}";

    public Protocolr1_7_2_5Tor1_7_6_10() {
        super(ClientboundPackets1_7_2.class, ClientboundPackets1_7_2.class, ServerboundPackets1_7_2.class, ServerboundPackets1_7_2.class);
    }

    protected void registerPackets() {
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(wrapper -> wrapper.set(Types.STRING, 0, (Object)Protocolr1_7_2_5Tor1_7_6_10.fixGameProfileUuid((String)wrapper.get(Types.STRING, 0), (String)wrapper.get(Types.STRING, 1))));
            }
        });
        this.registerClientbound(ClientboundPackets1_7_2.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.create((Type)Types.VAR_INT, 0);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map(Types1_7_6.ENTITY_DATA_LIST);
                this.handler(wrapper -> wrapper.set(Types.STRING, 0, (Object)Protocolr1_7_2_5Tor1_7_6_10.fixGameProfileUuid((String)wrapper.get(Types.STRING, 0), (String)wrapper.get(Types.STRING, 1))));
            }
        });
        this.registerClientbound(ClientboundPackets1_7_2.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING, Types.STRING, TextRewriter::toClient);
            }
        });
        this.registerClientbound(ClientboundPackets1_7_2.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_SHORT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_7_6.NBT);
                this.handler(wrapper -> {
                    BlockPosition pos = (BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_SHORT, 0);
                    short type = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    CompoundTag tag = (CompoundTag)wrapper.get(Types1_7_6.NBT, 0);
                    if (type != 4) {
                        return;
                    }
                    byte skullType = tag.getByte("SkullType");
                    if (skullType != 3) {
                        return;
                    }
                    StringTag extraType = (StringTag)tag.removeUnchecked("ExtraType");
                    if (extraType == null || extraType.getValue().isEmpty()) {
                        return;
                    }
                    if (ViaLegacy.getConfig().isLegacySkullLoading()) {
                        UUID uuid2;
                        GameProfileFetcher gameProfileFetcher = (GameProfileFetcher)Via.getManager().getProviders().get(GameProfileFetcher.class);
                        String skullName = extraType.getValue();
                        CompoundTag newTag = tag.copy();
                        if (gameProfileFetcher.isUuidLoaded(skullName) && gameProfileFetcher.isGameProfileLoaded(uuid2 = gameProfileFetcher.getMojangUuid(skullName))) {
                            GameProfile skullProfile = gameProfileFetcher.getGameProfile(uuid2);
                            if (skullProfile == null) {
                                return;
                            }
                            newTag.put("Owner", (Tag)Protocolr1_7_2_5Tor1_7_6_10.writeGameProfileToTag(skullProfile));
                            wrapper.set(Types1_7_6.NBT, 0, (Object)newTag);
                            return;
                        }
                        gameProfileFetcher.getMojangUuidAsync(skullName).thenAccept(uuid -> {
                            GameProfile skullProfile = gameProfileFetcher.getGameProfile(uuid);
                            if (skullProfile == null) {
                                return;
                            }
                            newTag.put("Owner", (Tag)Protocolr1_7_2_5Tor1_7_6_10.writeGameProfileToTag(skullProfile));
                            try {
                                PacketWrapper updateSkull = PacketWrapper.create((PacketType)ClientboundPackets1_7_2.BLOCK_ENTITY_DATA, (UserConnection)wrapper.user());
                                updateSkull.write(Types1_7_6.BLOCK_POSITION_SHORT, (Object)pos);
                                updateSkull.write((Type)Types.UNSIGNED_BYTE, (Object)type);
                                updateSkull.write(Types1_7_6.NBT, (Object)newTag);
                                updateSkull.send(Protocolr1_7_2_5Tor1_7_6_10.class);
                            }
                            catch (Throwable e) {
                                ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Failed to update skull block entity data for " + skullName, e);
                            }
                        });
                    }
                });
            }
        });
    }

    private static String fixGameProfileUuid(String uuid, String name) {
        String dashedUuid;
        if (uuid.matches(UUID_PATTERN)) {
            return uuid;
        }
        if (uuid.length() == 32 && (dashedUuid = ClientboundBaseProtocol1_7.addDashes((String)uuid)).matches(UUID_PATTERN)) {
            return dashedUuid;
        }
        return GameProfileUtil.getOfflinePlayerUuid((String)name).toString();
    }

    public static CompoundTag writeGameProfileToTag(GameProfile gameProfile) {
        CompoundTag ownerTag = new CompoundTag();
        if (gameProfile.name() != null && !gameProfile.name().isEmpty()) {
            ownerTag.putString("Name", gameProfile.name());
        }
        if (gameProfile.id() != null) {
            ownerTag.putString("Id", gameProfile.id().toString());
        }
        if (gameProfile.properties().length != 0) {
            CompoundTag propertiesTag = new CompoundTag();
            for (Map.Entry entry : gameProfile.propertiesMap().entrySet()) {
                ListTag propertiesList = new ListTag(CompoundTag.class);
                for (GameProfile.Property property : (List)entry.getValue()) {
                    CompoundTag propertyTag = new CompoundTag();
                    propertyTag.putString("Value", property.value());
                    if (property.signature() != null) {
                        propertyTag.putString("Signature", property.signature());
                    }
                    propertiesList.add((Tag)propertyTag);
                }
                propertiesTag.put((String)entry.getKey(), (Tag)propertiesList);
            }
            ownerTag.put("Properties", (Tag)propertiesTag);
        }
        return ownerTag;
    }
}


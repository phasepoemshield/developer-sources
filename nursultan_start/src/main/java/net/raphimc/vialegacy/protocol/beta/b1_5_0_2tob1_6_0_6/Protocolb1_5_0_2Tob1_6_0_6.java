/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.api.data.BlockList1_6
 *  net.raphimc.vialegacy.api.data.ItemList1_6
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.storage.WorldTimeStorage
 *  net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.IdAndData;
import net.raphimc.vialegacy.api.data.BlockList1_6;
import net.raphimc.vialegacy.api.data.ItemList1_6;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.packet.ClientboundPacketsb1_5;
import net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.packet.ServerboundPacketsb1_5;
import net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.storage.WorldTimeStorage;
import net.raphimc.vialegacy.protocol.beta.b1_5_0_2tob1_6_0_6.task.TimeTrackTask;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.packet.ClientboundPacketsb1_7;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.packet.ServerboundPacketsb1_7;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolb1_5_0_2Tob1_6_0_6
extends StatelessProtocol<ClientboundPacketsb1_5, ClientboundPacketsb1_7, ServerboundPacketsb1_5, ServerboundPacketsb1_7> {
    public Protocolb1_5_0_2Tob1_6_0_6() {
        super(ClientboundPacketsb1_5.class, ClientboundPacketsb1_7.class, ServerboundPacketsb1_5.class, ServerboundPacketsb1_7.class);
    }

    public void register(ViaProviders providers) {
        Via.getPlatform().runRepeatingSync((Runnable)new TimeTrackTask(), 1L);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolb1_5_0_2Tob1_6_0_6.class, ClientboundPacketsb1_5::getPacket));
        userConnection.put((StorableObject)new WorldTimeStorage());
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsb1_5.SET_TIME, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.LONG);
                this.handler(wrapper -> {
                    ((WorldTimeStorage)wrapper.user().get(WorldTimeStorage.class)).time = (Long)wrapper.get((Type)Types.LONG, 0);
                });
            }
        });
        this.registerClientbound(ClientboundPacketsb1_5.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.create((Type)Types.BYTE, (byte)0);
            }
        });
        this.registerClientbound(ClientboundPacketsb1_5.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.create((Type)Types.INT, 0);
            }
        });
        this.registerServerbound(ServerboundPacketsb1_7.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read((Type)Types.BYTE);
            }
        });
        this.registerServerbound(ServerboundPacketsb1_7.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_4_2.NBTLESS_ITEM);
                this.handler(wrapper -> {
                    PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)wrapper.user().get(PlayerInfoStorage.class);
                    BlockPosition pos = (BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_UBYTE, 0);
                    IdAndData block = ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getBlockNotNull(pos);
                    Item item = (Item)wrapper.get(Types1_4_2.NBTLESS_ITEM, 0);
                    if (block.getId() == BlockList1_6.bed.blockId()) {
                        boolean isDayTime;
                        boolean isOccupied;
                        boolean isFoot;
                        byte[][] headBlockToFootBlock = new byte[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
                        boolean bl = isFoot = (block.getData() & 8) != 0;
                        if (!isFoot) {
                            int bedDirection = block.getData() & 3;
                            pos = new BlockPosition(pos.x() + headBlockToFootBlock[bedDirection][0], pos.y(), pos.z() + headBlockToFootBlock[bedDirection][1]);
                            block = ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getBlockNotNull(pos);
                            if (block.getId() != BlockList1_6.bed.blockId()) {
                                return;
                            }
                        }
                        boolean bl2 = isOccupied = (block.getData() & 4) != 0;
                        if (isOccupied) {
                            PacketWrapper chat = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.CHAT, (UserConnection)wrapper.user());
                            chat.write(Types1_6_4.STRING, (Object)"This bed is occupied");
                            chat.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                            return;
                        }
                        int dayTime = (int)(((WorldTimeStorage)wrapper.user().get(WorldTimeStorage.class)).time % 24000L);
                        float dayPercent = ((float)dayTime + 1.0f) / 24000.0f - 0.25f;
                        if (dayPercent < 0.0f) {
                            dayPercent += 1.0f;
                        }
                        if (dayPercent > 1.0f) {
                            dayPercent -= 1.0f;
                        }
                        float tempDayPercent = dayPercent;
                        dayPercent = 1.0f - (float)((Math.cos((double)dayPercent * Math.PI) + 1.0) / 2.0);
                        float skyRotation = (float)(1.0 - (Math.cos((double)(dayPercent = tempDayPercent + (dayPercent - tempDayPercent) / 3.0f) * Math.PI * 2.0) * 2.0 + 0.5));
                        if (skyRotation < 0.0f) {
                            skyRotation = 0.0f;
                        }
                        if (skyRotation > 1.0f) {
                            skyRotation = 1.0f;
                        }
                        boolean bl3 = isDayTime = (int)(skyRotation * 11.0f) < 4;
                        if (isDayTime) {
                            PacketWrapper chat = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.CHAT, (UserConnection)wrapper.user());
                            chat.write(Types1_6_4.STRING, (Object)"You can only sleep at night");
                            chat.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                            return;
                        }
                        if (Math.abs(playerInfoStorage.posX - (double)pos.x()) > 3.0 || Math.abs(playerInfoStorage.posY - (double)pos.y()) > 2.0 || Math.abs(playerInfoStorage.posZ - (double)pos.z()) > 3.0) {
                            return;
                        }
                        PacketWrapper useBed = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.PLAYER_SLEEP, (UserConnection)wrapper.user());
                        useBed.write((Type)Types.INT, (Object)playerInfoStorage.entityId);
                        useBed.write((Type)Types.BYTE, (Object)0);
                        useBed.write(Types1_7_6.BLOCK_POSITION_BYTE, (Object)pos);
                        useBed.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                    } else if (block.getId() == BlockList1_6.jukebox.blockId()) {
                        if (block.getData() > 0) {
                            PacketWrapper effect = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.LEVEL_EVENT, (UserConnection)wrapper.user());
                            effect.write((Type)Types.INT, (Object)1005);
                            effect.write(Types1_7_6.BLOCK_POSITION_UBYTE, (Object)pos);
                            effect.write((Type)Types.INT, (Object)0);
                            effect.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                        } else if (item != null && (item.identifier() == ItemList1_6.record13.itemId() || item.identifier() == ItemList1_6.recordCat.itemId())) {
                            PacketWrapper effect = PacketWrapper.create((PacketType)ClientboundPacketsb1_7.LEVEL_EVENT, (UserConnection)wrapper.user());
                            effect.write((Type)Types.INT, (Object)1005);
                            effect.write(Types1_7_6.BLOCK_POSITION_UBYTE, (Object)pos);
                            effect.write((Type)Types.INT, (Object)item.identifier());
                            effect.send(Protocolb1_5_0_2Tob1_6_0_6.class);
                        }
                    }
                });
            }
        });
    }
}


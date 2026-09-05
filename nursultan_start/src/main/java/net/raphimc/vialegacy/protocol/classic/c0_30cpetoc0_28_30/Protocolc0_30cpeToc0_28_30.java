/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_8
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.FixedByteArrayType
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.data.BlockList1_6
 *  net.raphimc.vialegacy.api.model.ChunkCoord
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.Protocola1_0_15Toa1_0_16_2
 *  net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.packet.ClientboundPacketsa1_0_15
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.data.ClassicBlocks
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.model.ClassicLevel
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicBlockRemapper
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicLevelStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicOpLevelStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ExtendedClassicBlocks
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtBlockPermissionsStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage
 *  net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.task.ClassicPingTask
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.types.Types1_1
 *  net.raphimc.vialegacy.protocol.release.r1_6_1tor1_6_2.Protocolr1_6_1Tor1_6_2
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.packet.ClientboundPackets1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30;

import com.viaversion.viafabricplus.features.classic.cpe_extension.CPEAdditions;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_8;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.FixedByteArrayType;
import com.viaversion.viaversion.util.IdAndData;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.BlockList1_6;
import net.raphimc.vialegacy.api.model.ChunkCoord;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.Protocola1_0_15Toa1_0_16_2;
import net.raphimc.vialegacy.protocol.alpha.a1_0_15toa1_0_16_2.packet.ClientboundPacketsa1_0_15;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.data.ClassicBlocks;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.model.ClassicLevel;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.packet.ClientboundPacketsc0_28;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.packet.ServerboundPacketsc0_28;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicBlockRemapper;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicLevelStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicOpLevelStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.storage.ClassicProgressStorage;
import net.raphimc.vialegacy.protocol.classic.c0_28_30toa1_0_15.types.Typesc0_30;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.Protocolc0_30cpeToc0_28_30$Anonymous$b2145db916cf3ad19a64e3a546834baf;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ClassicProtocolExtension;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.data.ExtendedClassicBlocks;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.packet.ClientboundPacketsc0_30cpe;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.packet.ServerboundPacketsc0_30cpe;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtBlockPermissionsStorage;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.storage.ExtensionProtocolMetadataStorage;
import net.raphimc.vialegacy.protocol.classic.c0_30cpetoc0_28_30.task.ClassicPingTask;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.types.Types1_1;
import net.raphimc.vialegacy.protocol.release.r1_6_1tor1_6_2.Protocolr1_6_1Tor1_6_2;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.packet.ClientboundPackets1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class Protocolc0_30cpeToc0_28_30
extends StatelessProtocol<ClientboundPacketsc0_30cpe, ClientboundPacketsc0_28, ServerboundPacketsc0_30cpe, ServerboundPacketsc0_28> {
    public Protocolc0_30cpeToc0_28_30() {
        super(ClientboundPacketsc0_30cpe.class, ClientboundPacketsc0_28.class, ServerboundPacketsc0_30cpe.class, ServerboundPacketsc0_28.class);
    }

    public void register(ViaProviders viaProviders) {
        Via.getPlatform().runRepeatingSync((Runnable)new ClassicPingTask(), 20L);
    }

    public void init(UserConnection userConnection) {
        this.handler$dfk000$viafabricplus$resetSnowing(null);
        userConnection.put((StorableObject)new PreNettySplitter(Protocolc0_30cpeToc0_28_30.class, ClientboundPacketsc0_30cpe::getPacket));
        userConnection.put((StorableObject)new ExtensionProtocolMetadataStorage());
        userConnection.put((StorableObject)new ClassicOpLevelStorage(userConnection, true));
        ClassicBlockRemapper classicBlockRemapper = (ClassicBlockRemapper)userConnection.get(ClassicBlockRemapper.class);
        userConnection.put((StorableObject)new ClassicBlockRemapper(n -> {
            if (ClassicBlocks.MAPPING.containsKey(n)) {
                return (IdAndData)classicBlockRemapper.mapper().get(n);
            }
            ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)userConnection.get(ExtensionProtocolMetadataStorage.class);
            if (extensionProtocolMetadataStorage.hasServerExtension(ClassicProtocolExtension.CUSTOM_BLOCKS, new int[]{1})) {
                return (IdAndData)ExtendedClassicBlocks.MAPPING.get(n);
            }
            return new IdAndData(BlockList1_6.stone.blockId(), 0);
        }, object -> {
            if (ClassicBlocks.REVERSE_MAPPING.containsKey(object)) {
                return classicBlockRemapper.reverseMapper().getInt(object);
            }
            ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)userConnection.get(ExtensionProtocolMetadataStorage.class);
            if (extensionProtocolMetadataStorage.hasServerExtension(ClassicProtocolExtension.CUSTOM_BLOCKS, new int[]{1})) {
                return ExtendedClassicBlocks.REVERSE_MAPPING.getInt(object);
            }
            return 1;
        }));
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsc0_30cpe.LOGIN, packetWrapper -> {
            if (packetWrapper.user().getProtocolInfo().getPipeline().contains(Protocolr1_6_1Tor1_6_2.class)) {
                ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)packetWrapper.user().get(ExtensionProtocolMetadataStorage.class);
                PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_6_4.CUSTOM_PAYLOAD, (UserConnection)packetWrapper.user());
                packetWrapper2.write(Types1_6_4.STRING, (Object)"MC|Brand");
                byte[] byArray = extensionProtocolMetadataStorage.getServerSoftwareName().getBytes(StandardCharsets.UTF_8);
                packetWrapper2.write((Type)Types.SHORT, (Object)((short)byArray.length));
                packetWrapper2.write(Types.REMAINING_BYTES, (Object)byArray);
                packetWrapper.send(Protocolc0_30cpeToc0_28_30.class);
                packetWrapper2.send(Protocolr1_6_1Tor1_6_2.class);
                packetWrapper.cancel();
            }
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXTENSION_PROTOCOL_INFO, null, packetWrapper -> {
            packetWrapper.cancel();
            ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)packetWrapper.user().get(ExtensionProtocolMetadataStorage.class);
            extensionProtocolMetadataStorage.setServerSoftwareName((String)packetWrapper.read(Typesc0_30.STRING));
            extensionProtocolMetadataStorage.setExtensionCount(((Short)packetWrapper.read((Type)Types.SHORT)).shortValue());
            ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)packetWrapper.user().get(ClassicProgressStorage.class);
            classicProgressStorage.progress = 0;
            classicProgressStorage.upperBound = extensionProtocolMetadataStorage.getExtensionCount();
            classicProgressStorage.status = "Receiving extension list...";
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXTENSION_PROTOCOL_ENTRY, null, packetWrapper -> {
            packetWrapper.cancel();
            ExtensionProtocolMetadataStorage extensionProtocolMetadataStorage = (ExtensionProtocolMetadataStorage)packetWrapper.user().get(ExtensionProtocolMetadataStorage.class);
            String string = (String)packetWrapper.read(Typesc0_30.STRING);
            int n = (Integer)packetWrapper.read((Type)Types.INT);
            ClassicProtocolExtension classicProtocolExtension = ClassicProtocolExtension.byName(string);
            if (classicProtocolExtension != null) {
                extensionProtocolMetadataStorage.addServerExtension(classicProtocolExtension, n);
            } else if (Via.getConfig().logOtherConversionWarnings()) {
                ViaLegacy.getPlatform().getLogger().warning("Received unknown classic protocol extension: (" + string + " v" + n + ")");
            }
            extensionProtocolMetadataStorage.incrementReceivedExtensions();
            ClassicProgressStorage classicProgressStorage = (ClassicProgressStorage)packetWrapper.user().get(ClassicProgressStorage.class);
            classicProgressStorage.progress = extensionProtocolMetadataStorage.getReceivedExtensions();
            if (extensionProtocolMetadataStorage.getReceivedExtensions() >= extensionProtocolMetadataStorage.getExtensionCount()) {
                classicProgressStorage.status = "Sending extension list...";
                ArrayList<ClassicProtocolExtension> arrayList = new ArrayList<ClassicProtocolExtension>();
                for (ClassicProtocolExtension classicProtocolExtension2 : ClassicProtocolExtension.values()) {
                    if (!classicProtocolExtension2.isSupported()) continue;
                    arrayList.add(classicProtocolExtension2);
                }
                if (arrayList.contains((Object)ClassicProtocolExtension.BLOCK_PERMISSIONS)) {
                    packetWrapper.user().put((StorableObject)new ExtBlockPermissionsStorage());
                }
                PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ServerboundPacketsc0_30cpe.EXTENSION_PROTOCOL_INFO, (UserConnection)packetWrapper.user());
                packetWrapper2.write(Typesc0_30.STRING, (Object)ViaLegacy.getPlatform().getCpeAppName());
                packetWrapper2.write((Type)Types.SHORT, (Object)((short)arrayList.size()));
                packetWrapper2.sendToServer(Protocolc0_30cpeToc0_28_30.class);
                for (ClassicProtocolExtension classicProtocolExtension3 : arrayList) {
                    ClassicProtocolExtension classicProtocolExtension2;
                    classicProtocolExtension2 = PacketWrapper.create((PacketType)ServerboundPacketsc0_30cpe.EXTENSION_PROTOCOL_ENTRY, (UserConnection)packetWrapper.user());
                    classicProtocolExtension2.write(Typesc0_30.STRING, classicProtocolExtension3.getName());
                    classicProtocolExtension2.write((Type)Types.INT, classicProtocolExtension3.getHighestSupportedVersion());
                    classicProtocolExtension2.sendToServer(Protocolc0_30cpeToc0_28_30.class);
                }
            }
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXT_CUSTOM_BLOCKS_SUPPORT_LEVEL, null, packetWrapper -> {
            packetWrapper.cancel();
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            if (by != 1) {
                ViaLegacy.getPlatform().getLogger().info("Classic server supports CustomBlocks level " + by);
            }
            PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ServerboundPacketsc0_30cpe.EXT_CUSTOM_BLOCKS_SUPPORT_LEVEL, (UserConnection)packetWrapper.user());
            packetWrapper2.write((Type)Types.BYTE, (Object)1);
            packetWrapper2.sendToServer(Protocolc0_30cpeToc0_28_30.class);
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXT_HACK_CONTROL, null, packetWrapper -> {
            packetWrapper.cancel();
            ClassicOpLevelStorage classicOpLevelStorage = (ClassicOpLevelStorage)packetWrapper.user().get(ClassicOpLevelStorage.class);
            boolean bl = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            boolean bl2 = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            boolean bl3 = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            boolean bl4 = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            packetWrapper.read((Type)Types.BOOLEAN);
            packetWrapper.read((Type)Types.SHORT);
            classicOpLevelStorage.updateHax(bl, bl2, bl3, bl4);
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXT_SET_BLOCK_PERMISSION, null, packetWrapper -> {
            packetWrapper.cancel();
            ExtBlockPermissionsStorage extBlockPermissionsStorage = (ExtBlockPermissionsStorage)packetWrapper.user().get(ExtBlockPermissionsStorage.class);
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            boolean bl = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            boolean bl2 = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            if (bl) {
                extBlockPermissionsStorage.addPlaceable((int)by);
            } else {
                extBlockPermissionsStorage.removePlaceable((int)by);
            }
            if (bl2) {
                extBlockPermissionsStorage.addBreakable((int)by);
            } else {
                extBlockPermissionsStorage.removeBreakable((int)by);
            }
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXT_BULK_BLOCK_UPDATE, null, packetWrapper -> {
            packetWrapper.cancel();
            ClassicLevelStorage classicLevelStorage = (ClassicLevelStorage)packetWrapper.user().get(ClassicLevelStorage.class);
            if (classicLevelStorage == null || !classicLevelStorage.hasReceivedLevel()) {
                return;
            }
            ClassicBlockRemapper classicBlockRemapper = (ClassicBlockRemapper)packetWrapper.user().get(ClassicBlockRemapper.class);
            ClassicLevel classicLevel = classicLevelStorage.getClassicLevel();
            int n = (Short)packetWrapper.read((Type)Types.UNSIGNED_BYTE) + 1;
            byte[] byArray = (byte[])packetWrapper.read((Type)new FixedByteArrayType(1024));
            byte[] byArray2 = (byte[])packetWrapper.read((Type)new FixedByteArrayType(256));
            if (packetWrapper.user().getProtocolInfo().getPipeline().contains(Protocola1_0_15Toa1_0_16_2.class)) {
                PacketWrapper packetWrapper2;
                HashMap<ChunkCoord, List> hashMap = new HashMap<ChunkCoord, List>();
                for (int i = 0; i < n; ++i) {
                    int n2 = (byArray[i * 4] & 0xFF) << 24 | (byArray[i * 4 + 1] & 0xFF) << 16 | (byArray[i * 4 + 2] & 0xFF) << 8 | byArray[i * 4 + 3] & 0xFF;
                    packetWrapper2 = new BlockPosition(n2 % classicLevel.getSizeX(), n2 / classicLevel.getSizeX() / classicLevel.getSizeZ(), n2 / classicLevel.getSizeX() % classicLevel.getSizeZ());
                    byte by = byArray2[i];
                    classicLevel.setBlock((BlockPosition)packetWrapper2, (int)by);
                    if (!classicLevelStorage.isChunkLoaded((BlockPosition)packetWrapper2)) continue;
                    IdAndData idAndData = (IdAndData)classicBlockRemapper.mapper().get((int)by);
                    hashMap.computeIfAbsent(new ChunkCoord(packetWrapper2.x() >> 4, packetWrapper2.z() >> 4), chunkCoord -> new ArrayList()).add(new BlockChangeRecord1_8(packetWrapper2.x() & 0xF, packetWrapper2.y(), packetWrapper2.z() & 0xF, idAndData.toRawData()));
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPacketsa1_0_15.CHUNK_BLOCKS_UPDATE, (UserConnection)packetWrapper.user());
                    packetWrapper2.write((Type)Types.INT, (Object)((ChunkCoord)entry.getKey()).chunkX);
                    packetWrapper2.write((Type)Types.INT, (Object)((ChunkCoord)entry.getKey()).chunkZ);
                    packetWrapper2.write(Types1_1.BLOCK_CHANGE_RECORD_ARRAY, (Object)((List)entry.getValue()).toArray(new BlockChangeRecord[0]));
                    packetWrapper2.send(Protocola1_0_15Toa1_0_16_2.class);
                }
            }
        });
        this.registerClientbound(ClientboundPacketsc0_30cpe.EXT_TWO_WAY_PING, ClientboundPacketsc0_28.KEEP_ALIVE, packetWrapper -> {
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            short s = (Short)packetWrapper.read((Type)Types.SHORT);
            if (by == 1) {
                PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ServerboundPacketsc0_30cpe.EXT_TWO_WAY_PING, (UserConnection)packetWrapper.user());
                packetWrapper2.write((Type)Types.BYTE, (Object)by);
                packetWrapper2.write((Type)Types.SHORT, (Object)s);
                packetWrapper2.sendToServer(Protocolc0_30cpeToc0_28_30.class);
            }
        });
        this.registerServerbound(ServerboundPacketsc0_28.LOGIN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ Protocolc0_30cpeToc0_28_30 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.BYTE);
                this.map(Typesc0_30.STRING);
                this.map(Typesc0_30.STRING);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.set((Type)Types.BYTE, 1, (Object)66));
            }
        });
        this.registerServerbound(ServerboundPacketsc0_28.CHAT, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ Protocolc0_30cpeToc0_28_30 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.BYTE);
                this.map(Typesc0_30.STRING);
                this.handler(wrapper -> {
                    ExtensionProtocolMetadataStorage protocolMetadata = (ExtensionProtocolMetadataStorage)wrapper.user().get(ExtensionProtocolMetadataStorage.class);
                    if (!protocolMetadata.hasServerExtension(ClassicProtocolExtension.LONGER_MESSAGES, new int[]{1})) {
                        return;
                    }
                    wrapper.cancel();
                    String message = (String)wrapper.get(Typesc0_30.STRING, 0);
                    while (!message.isEmpty()) {
                        int pos = Math.min(message.length(), 64);
                        String msg = message.substring(0, pos);
                        message = message.substring(pos);
                        PacketWrapper chatMessage = PacketWrapper.create((PacketType)ServerboundPacketsc0_30cpe.CHAT, (UserConnection)wrapper.user());
                        chatMessage.write((Type)Types.BYTE, (Object)((byte)(!message.isEmpty() ? 1 : 0)));
                        chatMessage.write(Typesc0_30.STRING, (Object)msg);
                        chatMessage.sendToServer(Protocolc0_30cpeToc0_28_30.class);
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPacketsc0_28.USE_ITEM_ON, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ Protocolc0_30cpeToc0_28_30 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map(Typesc0_30.BLOCK_POSITION);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    boolean disallow;
                    if (!wrapper.user().has(ExtBlockPermissionsStorage.class)) {
                        return;
                    }
                    ExtBlockPermissionsStorage blockPermissions = (ExtBlockPermissionsStorage)wrapper.user().get(ExtBlockPermissionsStorage.class);
                    ClassicLevel level = ((ClassicLevelStorage)wrapper.user().get(ClassicLevelStorage.class)).getClassicLevel();
                    BlockPosition position = (BlockPosition)wrapper.get(Typesc0_30.BLOCK_POSITION, 0);
                    boolean placeBlock = (Boolean)wrapper.get((Type)Types.BOOLEAN, 0);
                    byte blockId = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    int block = level.getBlock(position);
                    boolean bl = disallow = placeBlock && blockPermissions.isPlacingDenied((int)blockId) || !placeBlock && blockPermissions.isBreakingDenied(block);
                    if (disallow) {
                        wrapper.cancel();
                        PacketWrapper chatMessage = PacketWrapper.create((PacketType)ClientboundPacketsc0_30cpe.CHAT, (UserConnection)wrapper.user());
                        chatMessage.write((Type)Types.BYTE, (Object)0);
                        chatMessage.write(Typesc0_30.STRING, (Object)"&cYou are not allowed to place/break this block");
                        chatMessage.send(Protocolc0_30cpeToc0_28_30.class);
                    } else {
                        block = placeBlock ? blockId : (byte)0;
                        level.setBlock(position, block);
                    }
                    PacketWrapper blockChange = PacketWrapper.create((PacketType)ClientboundPacketsc0_30cpe.BLOCK_UPDATE, (UserConnection)wrapper.user());
                    blockChange.write(Typesc0_30.BLOCK_POSITION, (Object)position);
                    blockChange.write((Type)Types.BYTE, (Object)((byte)block));
                    blockChange.send(Protocolc0_30cpeToc0_28_30.class);
                });
            }
        });
        this.handler$dfk000$viafabricplus$extendPackets(null);
    }

    private void handler$dfk000$viafabricplus$extendPackets(CallbackInfo callbackInfo) {
        this.registerClientbound(CPEAdditions.EXT_WEATHER_TYPE, null, (PacketHandler)new Protocolc0_30cpeToc0_28_30$Anonymous$b2145db916cf3ad19a64e3a546834baf(this));
    }

    private void handler$dfk000$viafabricplus$resetSnowing(CallbackInfo callbackInfo) {
        CPEAdditions.setSnowing((boolean)false);
    }
}


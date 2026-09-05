/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.api.data.ItemList1_6
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.data.AlphaItems
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.AlphaInventoryTracker
 *  net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.InventoryStorage
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ClientboundPacketsb1_1
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ServerboundPacketsb1_1
 *  net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.types.Typesb1_1
 *  net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.types.Typesb1_7_0_3
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.Protocolr1_1Tor1_2_1_3
 *  net.raphimc.vialegacy.protocol.release.r1_2_1_3tor1_2_4_5.packet.ClientboundPackets1_2_1
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.EntityList1_2_4
 *  net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1
 *  net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.IdAndData;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.data.BlockList1_6;
import net.raphimc.vialegacy.api.data.ItemList1_6;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.data.AlphaItems;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.packet.ClientboundPacketsa1_2_6;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.packet.ServerboundPacketsa1_2_6;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.AlphaInventoryProvider;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.provider.TrackingAlphaInventoryProvider;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.AlphaInventoryTracker;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.storage.InventoryStorage;
import net.raphimc.vialegacy.protocol.alpha.a1_2_3_5_1_2_6tob1_0_1_1_1.task.AlphaInventoryUpdateTask;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ClientboundPacketsb1_1;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.packet.ServerboundPacketsb1_1;
import net.raphimc.vialegacy.protocol.beta.b1_1_2tob1_2_0_2.types.Typesb1_1;
import net.raphimc.vialegacy.protocol.beta.b1_7_0_3tob1_8_0_1.types.Typesb1_7_0_3;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.Protocolr1_1Tor1_2_1_3;
import net.raphimc.vialegacy.protocol.release.r1_2_1_3tor1_2_4_5.packet.ClientboundPackets1_2_1;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.data.EntityList1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.PlayerInfoStorage;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocola1_2_3_5_1_2_6Tob1_0_1_1_1
extends StatelessProtocol<ClientboundPacketsa1_2_6, ClientboundPacketsb1_1, ServerboundPacketsa1_2_6, ServerboundPacketsb1_1> {
    public Protocola1_2_3_5_1_2_6Tob1_0_1_1_1() {
        super(ClientboundPacketsa1_2_6.class, ClientboundPacketsb1_1.class, ServerboundPacketsa1_2_6.class, ServerboundPacketsb1_1.class);
    }

    public void register(ViaProviders providers) {
        providers.register(AlphaInventoryProvider.class, (Provider)new TrackingAlphaInventoryProvider());
        Via.getPlatform().runRepeatingSync((Runnable)new AlphaInventoryUpdateTask(), 20L);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class, ClientboundPacketsa1_2_6::getPacket));
        userConnection.put((StorableObject)new InventoryStorage());
        if (((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).usesInventoryTracker()) {
            userConnection.put((StorableObject)new AlphaInventoryTracker(userConnection));
        }
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPacketsa1_2_6.PLAYER_INVENTORY, (ClientboundPacketType)ClientboundPacketsb1_1.CONTAINER_SET_CONTENT, wrapper -> {
            InventoryStorage inventoryStorage = (InventoryStorage)wrapper.user().get(InventoryStorage.class);
            AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)wrapper.user().get(AlphaInventoryTracker.class);
            int type = (Integer)wrapper.read((Type)Types.INT);
            Item[] items = (Item[])wrapper.read(Types1_4_2.NBTLESS_ITEM_ARRAY);
            Item[] windowItems = new Item[45];
            System.arraycopy(inventoryStorage.mainInventory, 0, windowItems, 36, 9);
            System.arraycopy(inventoryStorage.mainInventory, 9, windowItems, 9, 27);
            System.arraycopy(inventoryStorage.craftingInventory, 0, windowItems, 1, 4);
            System.arraycopy(inventoryStorage.armorInventory, 0, windowItems, 5, 4);
            switch (type) {
                case -1: {
                    inventoryStorage.mainInventory = items;
                    if (inventoryTracker != null) {
                        inventoryTracker.setMainInventory(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(items));
                    }
                    System.arraycopy(items, 0, windowItems, 36, 9);
                    System.arraycopy(items, 9, windowItems, 9, 27);
                    break;
                }
                case -2: {
                    inventoryStorage.craftingInventory = items;
                    if (inventoryTracker != null) {
                        inventoryTracker.setCraftingInventory(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(items));
                    }
                    System.arraycopy(items, 0, windowItems, 1, 4);
                    break;
                }
                case -3: {
                    inventoryStorage.armorInventory = items;
                    if (inventoryTracker != null) {
                        inventoryTracker.setArmorInventory(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(items));
                    }
                    System.arraycopy(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.reverseArray(items), 0, windowItems, 5, 4);
                }
            }
            wrapper.write((Type)Types.BYTE, (Object)0);
            wrapper.write(Types1_4_2.NBTLESS_ITEM_ARRAY, (Object)Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(windowItems));
        });
        this.registerClientbound(ClientboundPacketsa1_2_6.SET_HEALTH, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.SHORT);
            }
        });
        this.registerClientbound(ClientboundPacketsa1_2_6.RESPAWN, wrapper -> {
            ((InventoryStorage)wrapper.user().get(InventoryStorage.class)).resetPlayerInventory();
            AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)wrapper.user().get(AlphaInventoryTracker.class);
            if (inventoryTracker != null) {
                inventoryTracker.onRespawn();
            }
        });
        this.registerClientbound(ClientboundPacketsa1_2_6.SET_CARRIED_ITEM, (ClientboundPacketType)ClientboundPacketsb1_1.SET_EQUIPPED_ITEM, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.create((Type)Types.SHORT, (short)0);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    if ((Short)wrapper.get((Type)Types.SHORT, 1) == 0) {
                        wrapper.set((Type)Types.SHORT, 1, (Object)-1);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPacketsa1_2_6.ADD_TO_INVENTORY, null, wrapper -> {
            wrapper.cancel();
            Item item = (Item)wrapper.read(Types1_3_1.NBTLESS_ITEM);
            ((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).addToInventory(wrapper.user(), item);
        });
        this.registerClientbound(ClientboundPacketsa1_2_6.PRE_CHUNK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> ((InventoryStorage)wrapper.user().get(InventoryStorage.class)).unload(((Integer)wrapper.get((Type)Types.INT, 0)).intValue(), ((Integer)wrapper.get((Type)Types.INT, 1)).intValue()));
            }
        });
        this.registerClientbound(ClientboundPacketsa1_2_6.BLOCK_ENTITY_DATA, null, wrapper -> {
            wrapper.cancel();
            InventoryStorage tracker = (InventoryStorage)wrapper.user().get(InventoryStorage.class);
            BlockPosition pos = (BlockPosition)wrapper.read(Types1_7_6.BLOCK_POSITION_SHORT);
            CompoundTag tag = (CompoundTag)wrapper.read(Types1_7_6.NBT);
            if (tag.getInt("x") != pos.x() || tag.getInt("y") != pos.y() || tag.getInt("z") != pos.z()) {
                return;
            }
            IdAndData block = ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getBlockNotNull(pos);
            String blockName = tag.getString("id", "");
            if (block.getId() == BlockList1_6.signPost.blockId() || block.getId() == BlockList1_6.signWall.blockId() || blockName.equals("Sign")) {
                PacketWrapper updateSign = PacketWrapper.create((PacketType)ClientboundPacketsb1_1.UPDATE_SIGN, (UserConnection)wrapper.user());
                updateSign.write(Types1_7_6.BLOCK_POSITION_SHORT, (Object)pos);
                updateSign.write(Typesb1_7_0_3.STRING, (Object)tag.getString("Text1", ""));
                updateSign.write(Typesb1_7_0_3.STRING, (Object)tag.getString("Text2", ""));
                updateSign.write(Typesb1_7_0_3.STRING, (Object)tag.getString("Text3", ""));
                updateSign.write(Typesb1_7_0_3.STRING, (Object)tag.getString("Text4", ""));
                updateSign.send(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class);
            } else if (block.getId() == BlockList1_6.mobSpawner.blockId() || blockName.equals("MobSpawner")) {
                if (wrapper.user().getProtocolInfo().getPipeline().contains(Protocolr1_1Tor1_2_1_3.class)) {
                    PacketWrapper spawnerData = PacketWrapper.create((PacketType)ClientboundPackets1_2_1.BLOCK_ENTITY_DATA, (UserConnection)wrapper.user());
                    spawnerData.write(Types1_7_6.BLOCK_POSITION_SHORT, (Object)pos);
                    spawnerData.write((Type)Types.BYTE, (Object)1);
                    spawnerData.write((Type)Types.INT, (Object)EntityList1_2_4.getEntityId((String)tag.getString("EntityId")));
                    spawnerData.write((Type)Types.INT, (Object)0);
                    spawnerData.write((Type)Types.INT, (Object)0);
                    spawnerData.send(Protocolr1_1Tor1_2_1_3.class);
                }
            } else if (block.getId() == BlockList1_6.chest.blockId() || blockName.equals("Chest")) {
                Item[] chestItems = new Item[27];
                this.readItemsFromTag(tag, chestItems);
                tracker.containers.put(pos, chestItems);
                if (pos.equals((Object)tracker.openContainerPos)) {
                    this.sendWindowItems(wrapper.user(), (byte)55, chestItems);
                }
            } else if (block.getId() == BlockList1_6.furnaceIdle.blockId() || block.getId() == BlockList1_6.furnaceBurning.blockId() || blockName.equals("Furnace")) {
                Item[] furnaceItems = new Item[3];
                this.readItemsFromTag(tag, furnaceItems);
                tracker.containers.put(pos, furnaceItems);
                if (pos.equals((Object)tracker.openContainerPos)) {
                    this.sendWindowItems(wrapper.user(), (byte)44, furnaceItems);
                    this.sendProgressUpdate(wrapper.user(), (short)44, (short)0, tag.getShort("CookTime"));
                    this.sendProgressUpdate(wrapper.user(), (short)44, (short)1, tag.getShort("BurnTime"));
                    this.sendProgressUpdate(wrapper.user(), (short)44, (short)2, this.getBurningTime(furnaceItems[1]));
                }
            } else {
                ViaLegacy.getPlatform().getLogger().warning("Unhandled Complex Entity data: " + String.valueOf(block) + "@" + String.valueOf(pos) + ": '" + String.valueOf(tag) + "'");
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_1.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    short status = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (status == 4) {
                        wrapper.cancel();
                        Item selectedItem = Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.fixItem(((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).getHandItem(wrapper.user()));
                        if (selectedItem == null) {
                            return;
                        }
                        AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)wrapper.user().get(AlphaInventoryTracker.class);
                        if (inventoryTracker != null) {
                            inventoryTracker.onHandItemDrop();
                        }
                        selectedItem.setAmount(1);
                        Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.dropItem(wrapper.user(), selectedItem, false);
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_1.USE_ITEM_ON, wrapper -> {
            InventoryStorage tracker = (InventoryStorage)wrapper.user().get(InventoryStorage.class);
            AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)wrapper.user().get(AlphaInventoryTracker.class);
            BlockPosition pos = (BlockPosition)wrapper.read(Types1_7_6.BLOCK_POSITION_UBYTE);
            short direction = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            Item item = Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.fixItem((Item)wrapper.read(Typesb1_1.NBTLESS_ITEM));
            if (item == null && inventoryTracker != null) {
                item = ((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).getHandItem(wrapper.user());
            }
            wrapper.write((Type)Types.SHORT, (Object)(item == null ? (short)-1 : (short)item.identifier()));
            wrapper.write(Types1_7_6.BLOCK_POSITION_UBYTE, (Object)pos);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)direction);
            if (inventoryTracker != null) {
                inventoryTracker.onBlockPlace(pos, direction);
            }
            if (direction == 255) {
                return;
            }
            IdAndData block = ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getBlockNotNull(pos);
            if (block.getId() != BlockList1_6.furnaceIdle.blockId() && block.getId() != BlockList1_6.furnaceBurning.blockId() && block.getId() != BlockList1_6.chest.blockId() && block.getId() != BlockList1_6.workbench.blockId()) {
                return;
            }
            tracker.openContainerPos = pos;
            Item[] containerItems = (Item[])tracker.containers.get(tracker.openContainerPos);
            if (containerItems == null && block.getId() != BlockList1_6.workbench.blockId()) {
                tracker.openContainerPos = null;
                PacketWrapper chatMessage = PacketWrapper.create((PacketType)ClientboundPacketsb1_1.CHAT, (UserConnection)wrapper.user());
                chatMessage.write(Typesb1_7_0_3.STRING, (Object)"\u00a7cMissing Container");
                chatMessage.send(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class);
                return;
            }
            PacketWrapper openWindow = PacketWrapper.create((PacketType)ClientboundPacketsb1_1.OPEN_SCREEN, (UserConnection)wrapper.user());
            if (block.getId() == BlockList1_6.chest.blockId()) {
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)55);
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)0);
                openWindow.write(Typesb1_7_0_3.STRING, (Object)"Chest");
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)27);
                if (inventoryTracker != null) {
                    inventoryTracker.onWindowOpen(0, 27);
                }
            } else if (block.getId() == BlockList1_6.workbench.blockId()) {
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)33);
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)1);
                openWindow.write(Typesb1_7_0_3.STRING, (Object)"Crafting Table");
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)9);
                if (inventoryTracker != null) {
                    inventoryTracker.onWindowOpen(1, 10);
                }
            } else {
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)44);
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)2);
                openWindow.write(Typesb1_7_0_3.STRING, (Object)"Furnace");
                openWindow.write((Type)Types.UNSIGNED_BYTE, (Object)3);
                if (inventoryTracker != null) {
                    inventoryTracker.onWindowOpen(2, 3);
                }
            }
            openWindow.send(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class);
            if (block.getId() != BlockList1_6.workbench.blockId()) {
                this.sendWindowItems(wrapper.user(), block.getId() == BlockList1_6.chest.blockId() ? (byte)55 : (byte)44, containerItems);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_1.SET_CARRIED_ITEM, wrapper -> {
            InventoryStorage inventoryStorage = (InventoryStorage)wrapper.user().get(InventoryStorage.class);
            short slot = (Short)wrapper.read((Type)Types.SHORT);
            if (slot < 0 || slot > 8) {
                slot = 0;
            }
            inventoryStorage.selectedHotbarSlot = slot;
            Item selectedItem = Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.fixItem(((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).getHandItem(wrapper.user()));
            if (Objects.equals(selectedItem, inventoryStorage.handItem)) {
                wrapper.cancel();
                return;
            }
            inventoryStorage.handItem = selectedItem;
            wrapper.write((Type)Types.INT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)((short)(selectedItem == null ? 0 : selectedItem.identifier())));
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_1.CONTAINER_CLOSE, null, wrapper -> {
            wrapper.cancel();
            ((InventoryStorage)wrapper.user().get(InventoryStorage.class)).openContainerPos = null;
            AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)wrapper.user().get(AlphaInventoryTracker.class);
            if (inventoryTracker != null) {
                inventoryTracker.onWindowClose();
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_1.CONTAINER_CLICK, ServerboundPacketsa1_2_6.BLOCK_ENTITY_DATA, wrapper -> {
            InventoryStorage tracker = (InventoryStorage)wrapper.user().get(InventoryStorage.class);
            AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)wrapper.user().get(AlphaInventoryTracker.class);
            byte windowId = (Byte)wrapper.read((Type)Types.BYTE);
            short slot = (Short)wrapper.read((Type)Types.SHORT);
            byte button = (Byte)wrapper.read((Type)Types.BYTE);
            short action = (Short)wrapper.read((Type)Types.SHORT);
            Item item = Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.fixItem((Item)wrapper.read(Typesb1_1.NBTLESS_ITEM));
            if (inventoryTracker != null) {
                inventoryTracker.onWindowClick(windowId, slot, button, action, item);
            }
            if (windowId != 55 && windowId != 44 || tracker.openContainerPos == null) {
                wrapper.cancel();
                return;
            }
            Object[] containerItems = Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.fixItems(((AlphaInventoryProvider)Via.getManager().getProviders().get(AlphaInventoryProvider.class)).getContainerItems(wrapper.user()));
            if (Arrays.equals((Object[])tracker.containers.get(tracker.openContainerPos), containerItems)) {
                wrapper.cancel();
                return;
            }
            tracker.containers.put(tracker.openContainerPos, containerItems);
            CompoundTag tag = new CompoundTag();
            tag.putString("id", windowId == 55 ? "Chest" : "Furnace");
            tag.putInt("x", tracker.openContainerPos.x());
            tag.putInt("y", tracker.openContainerPos.y());
            tag.putInt("z", tracker.openContainerPos.z());
            this.writeItemsToTag(tag, (Item[])containerItems);
            wrapper.write((Type)Types.INT, (Object)tracker.openContainerPos.x());
            wrapper.write((Type)Types.SHORT, (Object)((short)tracker.openContainerPos.y()));
            wrapper.write((Type)Types.INT, (Object)tracker.openContainerPos.z());
            wrapper.write(Types1_7_6.NBT, (Object)tag);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPacketsb1_1.SIGN_UPDATE, ServerboundPacketsa1_2_6.BLOCK_ENTITY_DATA, wrapper -> {
            BlockPosition pos = (BlockPosition)wrapper.passthrough(Types1_7_6.BLOCK_POSITION_SHORT);
            CompoundTag tag = new CompoundTag();
            tag.putString("id", "Sign");
            tag.putInt("x", pos.x());
            tag.putInt("y", pos.y());
            tag.putInt("z", pos.z());
            tag.putString("Text1", (String)wrapper.read(Typesb1_7_0_3.STRING));
            tag.putString("Text2", (String)wrapper.read(Typesb1_7_0_3.STRING));
            tag.putString("Text3", (String)wrapper.read(Typesb1_7_0_3.STRING));
            tag.putString("Text4", (String)wrapper.read(Typesb1_7_0_3.STRING));
            wrapper.write(Types1_7_6.NBT, (Object)tag);
        });
        this.cancelServerbound((ServerboundPacketType)ServerboundPacketsb1_1.CONTAINER_ACK);
    }

    public static Item copyItem(Item item) {
        return item == null ? null : item.copy();
    }

    public static Item[] copyItems(Item[] items) {
        return (Item[])Arrays.stream(items).map(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1::copyItem).toArray(Item[]::new);
    }

    public static Item fixItem(Item item) {
        if (item == null || !AlphaItems.isValid((int)item.identifier())) {
            return null;
        }
        item.setTag(null);
        return item;
    }

    public static void dropItem(UserConnection user, Item item, boolean flag) {
        double motionY;
        double motionZ;
        double motionX;
        PlayerInfoStorage playerInfoStorage = (PlayerInfoStorage)user.get(PlayerInfoStorage.class);
        double itemX = playerInfoStorage.posX;
        double itemY = playerInfoStorage.posY + (double)1.62f - (double)0.3f + 0.12;
        double itemZ = playerInfoStorage.posZ;
        if (flag) {
            float f2 = ThreadLocalRandom.current().nextFloat() * 0.5f;
            float f1 = (float)((double)ThreadLocalRandom.current().nextFloat() * Math.PI * 2.0);
            motionX = -Math.sin(f1) * (double)f2;
            motionZ = Math.cos(f1) * (double)f2;
            motionY = 0.2f;
        } else {
            motionX = -Math.sin((double)(playerInfoStorage.yaw / 180.0f) * Math.PI) * Math.cos((double)(playerInfoStorage.pitch / 180.0f) * Math.PI) * (double)0.3f;
            motionZ = Math.cos((double)(playerInfoStorage.yaw / 180.0f) * Math.PI) * Math.cos((double)(playerInfoStorage.pitch / 180.0f) * Math.PI) * (double)0.3f;
            motionY = -Math.sin((double)(playerInfoStorage.pitch / 180.0f) * Math.PI) * (double)0.3f + (double)0.1f;
            float f1 = (float)((double)ThreadLocalRandom.current().nextFloat() * Math.PI * 2.0);
            float f2 = 0.02f * ThreadLocalRandom.current().nextFloat();
            motionX += Math.cos(f1) * (double)f2;
            motionY += (double)((ThreadLocalRandom.current().nextFloat() - ThreadLocalRandom.current().nextFloat()) * 0.1f);
            motionZ += Math.sin(f1) * (double)f2;
        }
        PacketWrapper spawnItem = PacketWrapper.create((PacketType)ServerboundPacketsa1_2_6.SPAWN_ITEM, (UserConnection)user);
        spawnItem.write((Type)Types.INT, (Object)0);
        spawnItem.write((Type)Types.SHORT, (Object)((short)item.identifier()));
        spawnItem.write((Type)Types.BYTE, (Object)((byte)item.amount()));
        spawnItem.write((Type)Types.INT, (Object)((int)(itemX * 32.0)));
        spawnItem.write((Type)Types.INT, (Object)((int)(itemY * 32.0)));
        spawnItem.write((Type)Types.INT, (Object)((int)(itemZ * 32.0)));
        spawnItem.write((Type)Types.BYTE, (Object)((byte)(motionX * 128.0)));
        spawnItem.write((Type)Types.BYTE, (Object)((byte)(motionY * 128.0)));
        spawnItem.write((Type)Types.BYTE, (Object)((byte)(motionZ * 128.0)));
        spawnItem.sendToServer(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class);
    }

    public static Item[] fixItems(Item[] items) {
        for (int i = 0; i < items.length; ++i) {
            items[i] = Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.fixItem(items[i]);
        }
        return items;
    }

    private void readItemsFromTag(CompoundTag tag, Item[] items) {
        ListTag itemList = tag.getListTag("Items", CompoundTag.class);
        if (itemList != null) {
            for (CompoundTag itemTag : itemList) {
                items[itemTag.getByte((String)"Slot") & 0xFF] = new DataItem((int)itemTag.getShort("id"), itemTag.getByte("Count"), itemTag.getShort("Damage"), null);
            }
        }
    }

    private void sendWindowItems(UserConnection user, byte windowId, Item[] items) {
        PacketWrapper windowItems = PacketWrapper.create((PacketType)ClientboundPacketsb1_1.CONTAINER_SET_CONTENT, (UserConnection)user);
        windowItems.write((Type)Types.BYTE, (Object)windowId);
        windowItems.write(Types1_4_2.NBTLESS_ITEM_ARRAY, (Object)Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(items));
        windowItems.send(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class);
        AlphaInventoryTracker inventoryTracker = (AlphaInventoryTracker)user.get(AlphaInventoryTracker.class);
        if (inventoryTracker != null) {
            inventoryTracker.setOpenContainerItems(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.copyItems(items));
        }
    }

    private short getBurningTime(Item item) {
        if (item == null) {
            return 0;
        }
        int id = item.identifier();
        if (id == BlockList1_6.bookShelf.blockId() || id == BlockList1_6.chest.blockId() || id == BlockList1_6.fence.blockId() || id == BlockList1_6.jukebox.blockId() || id == BlockList1_6.wood.blockId() || id == BlockList1_6.planks.blockId() || id == BlockList1_6.doorWood.blockId() || id == BlockList1_6.signWall.blockId() || id == BlockList1_6.signPost.blockId() || id == BlockList1_6.workbench.blockId()) {
            return 300;
        }
        if (id == ItemList1_6.stick.itemId()) {
            return 100;
        }
        if (id == ItemList1_6.coal.itemId()) {
            return 1600;
        }
        if (id == ItemList1_6.bucketLava.itemId()) {
            return 20000;
        }
        return 0;
    }

    private void writeItemsToTag(CompoundTag tag, Item[] items) {
        ListTag itemList = new ListTag(CompoundTag.class);
        for (int i = 0; i < items.length; ++i) {
            Item item = items[i];
            if (item == null) continue;
            CompoundTag itemTag = new CompoundTag();
            itemTag.putByte("Slot", (byte)i);
            itemTag.putShort("id", (short)item.identifier());
            itemTag.putByte("Count", (byte)item.amount());
            itemTag.putShort("Damage", item.data());
            itemList.add((Tag)itemTag);
        }
        tag.put("Items", (Tag)itemList);
    }

    private void sendProgressUpdate(UserConnection user, short windowId, short id, short value) {
        PacketWrapper windowProperty = PacketWrapper.create((PacketType)ClientboundPacketsb1_1.CONTAINER_SET_DATA, (UserConnection)user);
        windowProperty.write((Type)Types.UNSIGNED_BYTE, (Object)windowId);
        windowProperty.write((Type)Types.SHORT, (Object)id);
        windowProperty.write((Type)Types.SHORT, (Object)value);
        windowProperty.send(Protocola1_2_3_5_1_2_6Tob1_0_1_1_1.class);
    }

    public static Item[] reverseArray(Item[] array) {
        if (array == null) {
            return null;
        }
        Item[] reversed = new Item[array.length];
        for (int i = 0; i < array.length / 2; ++i) {
            reversed[i] = array[array.length - i - 1];
            reversed[array.length - i - 1] = array[i];
        }
        return reversed;
    }
}


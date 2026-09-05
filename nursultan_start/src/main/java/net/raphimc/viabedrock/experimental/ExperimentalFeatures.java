/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockFace
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.longs.LongArrayList
 *  com.viaversion.viaversion.libs.fastutil.longs.LongList
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.model.container.Container
 *  net.raphimc.viabedrock.api.model.container.player.InventoryContainer
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.experimental.ExperimentalFeatures$1
 *  net.raphimc.viabedrock.experimental.ExperimentalPacketFactory
 *  net.raphimc.viabedrock.experimental.model.inventory.BedrockInventoryTransaction
 *  net.raphimc.viabedrock.experimental.model.inventory.InventoryActionData
 *  net.raphimc.viabedrock.experimental.model.inventory.InventorySource
 *  net.raphimc.viabedrock.experimental.model.inventory.InventoryTransactionData
 *  net.raphimc.viabedrock.experimental.model.inventory.InventoryTransactionData$NormalTransactionData
 *  net.raphimc.viabedrock.experimental.model.inventory.InventoryTransactionData$ReleaseItemTransactionData
 *  net.raphimc.viabedrock.experimental.model.inventory.InventoryTransactionData$UseItemTransactionData
 *  net.raphimc.viabedrock.experimental.model.map.MapDecoration
 *  net.raphimc.viabedrock.experimental.model.map.MapObject
 *  net.raphimc.viabedrock.experimental.model.map.MapTrackedObject
 *  net.raphimc.viabedrock.experimental.model.map.MapTrackedObject$Type
 *  net.raphimc.viabedrock.experimental.rewriter.InventoryTransactionRewriter
 *  net.raphimc.viabedrock.experimental.storage.MapTracker
 *  net.raphimc.viabedrock.experimental.util.JavaMapPaletteUtil
 *  net.raphimc.viabedrock.protocol.data.enums.Direction
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.ItemUseInventoryTransaction_TriggerType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ComplexInventoryTransaction_Type
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerID
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InventorySourceType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InventorySource_InventorySourceFlags
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemReleaseInventoryTransaction_ActionType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemUseInventoryTransaction_ActionType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemUseInventoryTransaction_PredictedResult
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerActionType
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.GameMode
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.InteractionHand
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerActionAction
 *  net.raphimc.viabedrock.protocol.model.BedrockItem
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.InventoryTracker
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.experimental;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockFace;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.longs.LongArrayList;
import com.viaversion.viaversion.libs.fastutil.longs.LongList;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.model.container.Container;
import net.raphimc.viabedrock.api.model.container.player.InventoryContainer;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.experimental.ExperimentalFeatures;
import net.raphimc.viabedrock.experimental.ExperimentalPacketFactory;
import net.raphimc.viabedrock.experimental.model.inventory.BedrockInventoryTransaction;
import net.raphimc.viabedrock.experimental.model.inventory.InventoryActionData;
import net.raphimc.viabedrock.experimental.model.inventory.InventorySource;
import net.raphimc.viabedrock.experimental.model.inventory.InventoryTransactionData;
import net.raphimc.viabedrock.experimental.model.map.MapDecoration;
import net.raphimc.viabedrock.experimental.model.map.MapObject;
import net.raphimc.viabedrock.experimental.model.map.MapTrackedObject;
import net.raphimc.viabedrock.experimental.rewriter.InventoryTransactionRewriter;
import net.raphimc.viabedrock.experimental.storage.MapTracker;
import net.raphimc.viabedrock.experimental.util.JavaMapPaletteUtil;
import net.raphimc.viabedrock.experimental.util.ProtocolUtil;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.Direction;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.ItemUseInventoryTransaction_TriggerType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ClientboundMapItemDataPacket_Type;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ComplexInventoryTransaction_Type;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ContainerID;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InventorySourceType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.InventorySource_InventorySourceFlags;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemReleaseInventoryTransaction_ActionType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemUseInventoryTransaction_ActionType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemUseInventoryTransaction_PredictedResult;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayerActionType;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.GameMode;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.InteractionHand;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.PlayerActionAction;
import net.raphimc.viabedrock.protocol.model.BedrockItem;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.InventoryTracker;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ExperimentalFeatures {
    private static final int MAP_FLAGS_ALL = ClientboundMapItemDataPacket_Type.Creation.getValue() | ClientboundMapItemDataPacket_Type.DecorationUpdate.getValue() | ClientboundMapItemDataPacket_Type.TextureUpdate.getValue();

    public static void registerPacketTranslators(BedrockProtocol protocol) {
        ProtocolUtil.prependServerbound(protocol, ServerboundPackets26_1.PLAYER_ACTION, wrapper -> {
            InventoryTransactionRewriter inventoryTransactionRewriter = (InventoryTransactionRewriter)wrapper.user().get(InventoryTransactionRewriter.class);
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            PlayerActionAction action = PlayerActionAction.values()[(Integer)wrapper.passthrough((Type)Types.VAR_INT)];
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (action == PlayerActionAction.RELEASE_USE_ITEM) {
                InventoryContainer inventoryContainer = inventoryTracker.getInventoryContainer();
                wrapper.clearPacket();
                wrapper.setPacketType((PacketType)ServerboundBedrockPackets.INVENTORY_TRANSACTION);
                BedrockInventoryTransaction inventoryTransaction = new BedrockInventoryTransaction(0, null, null, ComplexInventoryTransaction_Type.ItemReleaseTransaction, (InventoryTransactionData)new InventoryTransactionData.ReleaseItemTransactionData(ItemReleaseInventoryTransaction_ActionType.Release, (int)inventoryContainer.getSelectedHotbarSlot(), inventoryContainer.getSelectedHotbarItem(), ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer().position()));
                wrapper.write(inventoryTransactionRewriter.getInventoryTransactionType(), (Object)inventoryTransaction);
                wrapper.sendToServer(BedrockProtocol.class);
                wrapper.cancel();
            } else if (action == PlayerActionAction.DROP_ITEM || action == PlayerActionAction.DROP_ALL_ITEMS) {
                BedrockItem currentItem = inventoryTracker.getInventoryContainer().getSelectedHotbarItem();
                wrapper.cancel();
                if (currentItem.isEmpty()) {
                    return;
                }
                BedrockItem predictedAmount = currentItem.copy();
                if (action == PlayerActionAction.DROP_ITEM) {
                    predictedAmount.setAmount(1);
                }
                BedrockItem predictedToItem = currentItem.copy();
                if (action == PlayerActionAction.DROP_ITEM) {
                    if (predictedToItem.amount() > 1) {
                        predictedToItem.setAmount(currentItem.amount() - 1);
                    } else {
                        predictedToItem = BedrockItem.empty();
                    }
                } else {
                    predictedToItem = BedrockItem.empty();
                }
                PacketWrapper transactionPacket = PacketWrapper.create((PacketType)ServerboundBedrockPackets.INVENTORY_TRANSACTION, (UserConnection)wrapper.user());
                BedrockInventoryTransaction inventoryTransaction = new BedrockInventoryTransaction(0, null, List.of(new InventoryActionData(new InventorySource(InventorySourceType.WorldInteraction, ContainerID.CONTAINER_ID_NONE.getValue(), InventorySource_InventorySourceFlags.NoFlag), 0, BedrockItem.empty(), predictedAmount), new InventoryActionData(new InventorySource(InventorySourceType.ContainerInventory, ContainerID.CONTAINER_ID_INVENTORY.getValue(), InventorySource_InventorySourceFlags.NoFlag), (int)inventoryTracker.getInventoryContainer().getSelectedHotbarSlot(), currentItem, predictedToItem)), ComplexInventoryTransaction_Type.NormalTransaction, (InventoryTransactionData)new InventoryTransactionData.NormalTransactionData());
                transactionPacket.write(inventoryTransactionRewriter.getInventoryTransactionType(), (Object)inventoryTransaction);
                transactionPacket.sendToServer(BedrockProtocol.class);
            }
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.USE_ITEM, ServerboundBedrockPackets.INVENTORY_TRANSACTION, wrapper -> {
            EntityTracker entityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            InventoryContainer inventoryContainer = ((InventoryTracker)wrapper.user().get(InventoryTracker.class)).getInventoryContainer();
            InventoryTransactionRewriter inventoryTransactionRewriter = (InventoryTransactionRewriter)wrapper.user().get(InventoryTransactionRewriter.class);
            int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.read((Type)Types.VAR_INT);
            wrapper.read((Type)Types.FLOAT);
            wrapper.read((Type)Types.FLOAT);
            if (hand != InteractionHand.MAIN_HAND.ordinal()) {
                wrapper.cancel();
                return;
            }
            BedrockInventoryTransaction inventoryTransaction = new BedrockInventoryTransaction(0, null, null, ComplexInventoryTransaction_Type.ItemUseTransaction, (InventoryTransactionData)new InventoryTransactionData.UseItemTransactionData(ItemUseInventoryTransaction_ActionType.Use, ItemUseInventoryTransaction_TriggerType.Unknown, new BlockPosition(0, 0, 0), 255, (int)inventoryContainer.getSelectedHotbarSlot(), inventoryContainer.getSelectedHotbarItem(), entityTracker.getClientPlayer().position(), Position3f.ZERO, 0, ItemUseInventoryTransaction_PredictedResult.Failure, 0));
            wrapper.write(inventoryTransactionRewriter.getInventoryTransactionType(), (Object)inventoryTransaction);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.USE_ITEM_ON, null, wrapper -> {
            wrapper.cancel();
            ClientPlayerEntity clientPlayer = ((EntityTracker)wrapper.user().get(EntityTracker.class)).getClientPlayer();
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            InventoryTransactionRewriter inventoryTransactionRewriter = (InventoryTransactionRewriter)wrapper.user().get(InventoryTransactionRewriter.class);
            InteractionHand hand = InteractionHand.values()[(Integer)wrapper.read((Type)Types.VAR_INT)];
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_14);
            short faceInt = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
            Direction direction = Direction.getFromVerticalId((int)faceInt);
            if (direction == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown block face id: " + faceInt);
                return;
            }
            BlockFace face = direction.blockFace();
            Position3f clickPosition = new Position3f(((Float)wrapper.read((Type)Types.FLOAT)).floatValue(), ((Float)wrapper.read((Type)Types.FLOAT)).floatValue(), ((Float)wrapper.read((Type)Types.FLOAT)).floatValue());
            boolean insideBlock = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            PacketFactory.sendJavaBlockChangedAck((UserConnection)wrapper.user(), (int)((Integer)wrapper.read((Type)Types.VAR_INT)));
            if (hand != InteractionHand.MAIN_HAND) {
                return;
            }
            ExperimentalPacketFactory.sendBedrockPlayerAction((UserConnection)wrapper.user(), (long)clientPlayer.runtimeId(), (PlayerActionType)PlayerActionType.StartItemUseOn, (BlockPosition)position, (BlockPosition)(insideBlock ? position : position.getRelative(face)), (int)faceInt);
            PacketWrapper transactionPacket = PacketWrapper.create((PacketType)ServerboundBedrockPackets.INVENTORY_TRANSACTION, (UserConnection)wrapper.user());
            BedrockItem predictedToItem = inventoryTracker.getInventoryContainer().getSelectedHotbarItem().copy();
            if (predictedToItem.blockRuntimeId() != 0 && clientPlayer.javaGameMode() != GameMode.CREATIVE) {
                predictedToItem.setAmount(predictedToItem.amount() - 1);
            }
            if (predictedToItem.amount() <= 0) {
                predictedToItem = BedrockItem.empty();
            }
            BedrockInventoryTransaction inventoryTransaction = new BedrockInventoryTransaction(0, null, List.of(new InventoryActionData(new InventorySource(InventorySourceType.ContainerInventory, ContainerID.CONTAINER_ID_INVENTORY.getValue(), InventorySource_InventorySourceFlags.NoFlag), (int)inventoryTracker.getInventoryContainer().getSelectedHotbarSlot(), inventoryTracker.getInventoryContainer().getSelectedHotbarItem(), predictedToItem)), ComplexInventoryTransaction_Type.ItemUseTransaction, (InventoryTransactionData)new InventoryTransactionData.UseItemTransactionData(ItemUseInventoryTransaction_ActionType.Place, ItemUseInventoryTransaction_TriggerType.PlayerInput, position, (int)faceInt, (int)inventoryTracker.getInventoryContainer().getSelectedHotbarSlot(), inventoryTracker.getInventoryContainer().getSelectedHotbarItem(), clientPlayer.position(), clickPosition, chunkTracker.getBlockState(position), ItemUseInventoryTransaction_PredictedResult.Success, 0));
            transactionPacket.write(inventoryTransactionRewriter.getInventoryTransactionType(), (Object)inventoryTransaction);
            transactionPacket.sendToServer(BedrockProtocol.class);
            ExperimentalPacketFactory.sendBedrockPlayerAction((UserConnection)wrapper.user(), (long)clientPlayer.runtimeId(), (PlayerActionType)PlayerActionType.StopItemUseOn, (BlockPosition)position, (BlockPosition)new BlockPosition(0, 0, 0), (int)0);
        });
        protocol.registerClientbound(ClientboundBedrockPackets.INVENTORY_TRANSACTION, null, wrapper -> {
            InventoryTransactionRewriter inventoryTransactionRewriter = (InventoryTransactionRewriter)wrapper.user().get(InventoryTransactionRewriter.class);
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            wrapper.cancel();
            BedrockInventoryTransaction inventoryTransaction = (BedrockInventoryTransaction)wrapper.read(inventoryTransactionRewriter.getInventoryTransactionType());
            if (inventoryTransaction.legacyRequestId() != 0) {
                return;
            }
            if (inventoryTransaction.actions() != null && !inventoryTransaction.actions().isEmpty()) {
                for (InventoryActionData action : inventoryTransaction.actions()) {
                    if (action.source().type() != InventorySourceType.ContainerInventory) continue;
                    Container container = inventoryTracker.getContainerClientbound((byte)action.source().containerId(), null, null);
                    if (container != null) {
                        container.setItem(action.slot(), action.toItem());
                        PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)container);
                        continue;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received inventory action for unknown container ID: " + action.source().containerId());
                }
            }
            switch (1.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$ComplexInventoryTransaction_Type[inventoryTransaction.transactionType().ordinal()]) {
                case 1: {
                    break;
                }
                default: {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received unsupported inventory transaction type: " + String.valueOf(inventoryTransaction.transactionType()));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.MAP_ITEM_DATA, (ClientboundPacketType)ClientboundPackets26_1.MAP_ITEM_DATA, wrapper -> {
            MapObject mapObject;
            MapObject mapObject2;
            MapTracker mapTracker = (MapTracker)wrapper.user().get(MapTracker.class);
            long mapId = (Long)wrapper.read((Type)BedrockTypes.VAR_LONG);
            int typeFlags = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            byte dimension = (Byte)wrapper.read((Type)Types.BYTE);
            boolean locked = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            BlockPosition origin = (BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION);
            LongArrayList trackedEntities = new LongArrayList();
            if ((typeFlags & ClientboundMapItemDataPacket_Type.Creation.getValue()) != 0) {
                int length = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                for (int i = 0; i < length; ++i) {
                    trackedEntities.add(((Long)wrapper.read((Type)BedrockTypes.VAR_LONG)).longValue());
                }
            }
            byte scale = 0;
            if ((typeFlags & MAP_FLAGS_ALL) != 0) {
                scale = (Byte)wrapper.read((Type)Types.BYTE);
            }
            ArrayList<MapDecoration> decorations = new ArrayList<MapDecoration>();
            ArrayList<MapTrackedObject> trackedObjects = new ArrayList<MapTrackedObject>();
            if ((typeFlags & ClientboundMapItemDataPacket_Type.DecorationUpdate.getValue()) != 0) {
                int length = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                block5: for (int i = 0; i < length; ++i) {
                    MapTrackedObject.Type objectType = MapTrackedObject.Type.values()[(Integer)wrapper.read((Type)BedrockTypes.INT_LE)];
                    switch (1.$SwitchMap$net$raphimc$viabedrock$experimental$model$map$MapTrackedObject$Type[objectType.ordinal()]) {
                        case 1: {
                            trackedObjects.add(new MapTrackedObject((BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION)));
                            continue block5;
                        }
                        case 2: {
                            trackedObjects.add(new MapTrackedObject(((Long)wrapper.read((Type)BedrockTypes.VAR_LONG)).longValue()));
                        }
                    }
                }
                int decorLength = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                for (int i = 0; i < decorLength; ++i) {
                    byte iconType = (Byte)wrapper.read((Type)Types.BYTE);
                    byte rotation = (Byte)wrapper.read((Type)Types.BYTE);
                    byte x = (Byte)wrapper.read((Type)Types.BYTE);
                    byte y = (Byte)wrapper.read((Type)Types.BYTE);
                    String name = (String)wrapper.read(BedrockTypes.STRING);
                    int color = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                    decorations.add(new MapDecoration((int)iconType, (int)rotation, (int)x, (int)y, name, color));
                }
            }
            int width = 0;
            int height = 0;
            int xOffset = 0;
            int yOffset = 0;
            int[] colors = new int[]{};
            if ((typeFlags & ClientboundMapItemDataPacket_Type.TextureUpdate.getValue()) != 0) {
                width = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                height = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                xOffset = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                yOffset = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
                int colorsLength = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                colors = new int[colorsLength];
                for (int i = 0; i < colorsLength; ++i) {
                    colors[i] = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
                }
            }
            int nextJavaId = mapTracker.getNextMapId();
            if ((typeFlags & ClientboundMapItemDataPacket_Type.Creation.getValue()) != 0) {
                MapObject existingMap = (MapObject)mapTracker.getMapObjects().get(mapId);
                if (existingMap != null) {
                    existingMap.getTrackedEntities().clear();
                    existingMap.getTrackedEntities().addAll((LongList)trackedEntities);
                } else {
                    mapObject2 = new MapObject(mapId, dimension, locked, origin, (LongList)trackedEntities, scale, trackedObjects, decorations, width, height, xOffset, yOffset, colors, nextJavaId);
                    mapTracker.getMapObjects().put(mapId, (Object)mapObject2);
                }
            }
            if ((typeFlags & ClientboundMapItemDataPacket_Type.DecorationUpdate.getValue()) != 0) {
                MapObject existingMap = (MapObject)mapTracker.getMapObjects().get(mapId);
                if (existingMap != null) {
                    existingMap.getTrackedObjects().clear();
                    existingMap.getTrackedObjects().addAll(trackedObjects);
                    existingMap.getDecorations().clear();
                    existingMap.getDecorations().addAll(decorations);
                } else {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received map decoration update for unknown map id: " + mapId);
                    mapObject2 = new MapObject(mapId, dimension, locked, origin, (LongList)trackedEntities, scale, trackedObjects, decorations, 0, 0, 0, 0, new int[0], nextJavaId);
                    mapTracker.getMapObjects().put(mapId, (Object)mapObject2);
                }
            }
            if ((typeFlags & ClientboundMapItemDataPacket_Type.TextureUpdate.getValue()) != 0) {
                MapObject existingMap = (MapObject)mapTracker.getMapObjects().get(mapId);
                if (existingMap != null) {
                    existingMap.setWidth(width);
                    existingMap.setHeight(height);
                    existingMap.setXOffset(xOffset);
                    existingMap.setYOffset(yOffset);
                    existingMap.setColors(colors);
                } else {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received map texture update for unknown map id: " + mapId);
                    mapObject2 = new MapObject(mapId, dimension, locked, origin, (LongList)trackedEntities, scale, new ArrayList(), new ArrayList(), width, height, xOffset, yOffset, colors, nextJavaId);
                    mapTracker.getMapObjects().put(mapId, (Object)mapObject2);
                }
            }
            if ((mapObject = (MapObject)mapTracker.getMapObjects().get(mapId)) == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received map item data for unknown map id: " + mapId);
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)mapObject.getJavaId());
            wrapper.write((Type)Types.BYTE, (Object)mapObject.getScale());
            wrapper.write((Type)Types.BOOLEAN, (Object)mapObject.isLocked());
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)mapObject.getWidth()));
            if (mapObject.getWidth() > 0) {
                wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)mapObject.getHeight()));
                wrapper.write((Type)Types.BYTE, (Object)((byte)mapObject.getXOffset()));
                wrapper.write((Type)Types.BYTE, (Object)((byte)mapObject.getYOffset()));
                wrapper.write((Type)Types.VAR_INT, (Object)mapObject.getColors().length);
                for (short color : JavaMapPaletteUtil.convertToJavaPalette((int[])mapObject.getColors())) {
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)color);
                }
            }
        });
    }

    public static void registerTasks() {
    }

    public static void registerStorages(UserConnection user) {
        user.put((StorableObject)new InventoryTransactionRewriter(user));
        user.put((StorableObject)new MapTracker(user));
    }
}


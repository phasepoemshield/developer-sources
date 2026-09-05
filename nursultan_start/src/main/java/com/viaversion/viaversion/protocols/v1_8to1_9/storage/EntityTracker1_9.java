/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.legacy.bossbar.BossBar
 *  com.viaversion.viaversion.api.legacy.bossbar.BossColor
 *  com.viaversion.viaversion.api.legacy.bossbar.BossStyle
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.GameMode
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.InventoryTracker
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.storage;

import com.google.common.cache.CacheBuilder;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.legacy.bossbar.BossBar;
import com.viaversion.viaversion.api.legacy.bossbar.BossColor;
import com.viaversion.viaversion.api.legacy.bossbar.BossStyle;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.GameMode;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.BossBarProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.EntityIdProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.InventoryTracker;
import com.viaversion.viaversion.util.ComponentUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class EntityTracker1_9
extends EntityTrackerBase {
    public static final String WITHER_TRANSLATABLE = "{\"translate\":\"entity.WitherBoss.name\"}";
    public static final String DRAGON_TRANSLATABLE = "{\"translate\":\"entity.EnderDragon.name\"}";
    private final Int2ObjectMap<UUID> uuidMap = new Int2ObjectOpenHashMap();
    private final Int2IntMap vehicleMap = new Int2IntOpenHashMap();
    private final Int2ObjectMap<BossBar> bossBarMap = new Int2ObjectOpenHashMap();
    private final IntSet validBlocking = new IntOpenHashSet();
    private final IntSet knownHolograms = new IntOpenHashSet();
    private final Set<BlockPosition> blockInteractions = Collections.newSetFromMap(CacheBuilder.newBuilder().maximumSize(1000L).expireAfterAccess(250L, TimeUnit.MILLISECONDS).build().asMap());
    private boolean blocking;
    private boolean autoTeam;
    private BlockPosition currentlyDigging;
    private boolean teamExists;
    private GameMode gameMode;
    private String currentTeam;
    private int heldItemSlot;
    private Item itemInSecondHand;

    public boolean isBlocking() {
        return this.blocking;
    }

    public EntityTracker1_9(UserConnection userConnection) {
        super(userConnection, (EntityType)EntityTypes1_9.EntityType.PLAYER);
    }

    public int getProvidedEntityId() {
        try {
            return ((EntityIdProvider)Via.getManager().getProviders().get(EntityIdProvider.class)).getEntityId(this.user());
        }
        catch (Exception exception) {
            return this.clientEntityId();
        }
    }

    public void syncShieldWithSword() {
        if (this.user().getProtocolInfo().protocolVersion().newerThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return;
        }
        boolean bl = this.hasSwordInHand();
        if (!bl || this.itemInSecondHand == null) {
            this.setSecondHand((Item)(bl ? new DataItem(442, 1, 0, null) : null));
        }
    }

    public boolean interactedBlockRecently(int n, int n2, int n3) {
        for (BlockPosition blockPosition : this.blockInteractions) {
            if (Math.abs(blockPosition.x() - n) > 1 || Math.abs(blockPosition.y() - n2) > 1 || Math.abs(blockPosition.z() - n3) > 1) continue;
            return true;
        }
        return false;
    }

    public Item getItemInSecondHand() {
        return this.itemInSecondHand;
    }

    public void addBlockInteraction(BlockPosition blockPosition) {
        this.blockInteractions.add(blockPosition);
    }

    public Int2ObjectMap<UUID> getUuidMap() {
        return this.uuidMap;
    }

    public void handleEntityData(int n, List<EntityData> list) {
        EntityType entityType = this.entityType(n);
        if (entityType == null) {
            return;
        }
        for (EntityData entityData : new ArrayList<EntityData>(list)) {
            Object object;
            String string;
            int n2;
            if (entityType == EntityTypes1_9.EntityType.SKELETON && this.getDataByIndex(list, 12) == null) {
                list.add(new EntityData(12, (EntityDataType)EntityDataTypes1_9.BOOLEAN, (Object)true));
            }
            if (entityType == EntityTypes1_9.EntityType.HORSE && entityData.id() == 16 && ((n2 = ((Integer)entityData.value()).intValue()) < 0 || n2 > 3)) {
                entityData.setValue((Object)0);
            }
            if (entityType == EntityTypes1_9.EntityType.PLAYER) {
                if (entityData.id() == 0) {
                    n2 = ((Byte)entityData.getValue()).byteValue();
                    if (n != this.getProvidedEntityId() && Via.getConfig().isShieldBlocking() && this.user().getProtocolInfo().protocolVersion().olderThan(ProtocolVersion.v1_21_4)) {
                        if ((n2 & 0x10) == 16) {
                            if (this.validBlocking.contains(n)) {
                                string = new DataItem(442, 1, 0, null);
                                this.setSecondHand(n, (Item)string);
                            } else {
                                this.setSecondHand(n, null);
                            }
                        } else {
                            this.setSecondHand(n, null);
                        }
                    }
                }
                if (entityData.id() == 12 && Via.getConfig().isLeftHandedHandling()) {
                    list.add(new EntityData(13, (EntityDataType)EntityDataTypes1_9.BYTE, (Object)((byte)(((Byte)entityData.getValue() & 0x80) == 0 ? 1 : 0))));
                }
            }
            if (entityType == EntityTypes1_9.EntityType.ARMOR_STAND && Via.getConfig().isHologramPatch() && entityData.id() == 0 && this.getDataByIndex(list, 10) != null) {
                EntityData entityData2;
                EntityData entityData3 = this.getDataByIndex(list, 10);
                byte by = (Byte)entityData.getValue();
                if ((by & 0x20) == 32 && ((Byte)entityData3.getValue() & 1) == 1 && (entityData2 = this.getDataByIndex(list, 2)) != null && !((String)entityData2.getValue()).isEmpty() && (object = this.getDataByIndex(list, 3)) != null && ((Boolean)object.getValue()).booleanValue() && !this.knownHolograms.contains(n)) {
                    this.knownHolograms.add(n);
                    PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9.MOVE_ENTITY_POS, null, (UserConnection)this.user());
                    packetWrapper.write((Type)Types.VAR_INT, (Object)n);
                    packetWrapper.write((Type)Types.SHORT, (Object)0);
                    packetWrapper.write((Type)Types.SHORT, (Object)((short)(128.0 * (Via.getConfig().getHologramYOffset() * 32.0))));
                    packetWrapper.write((Type)Types.SHORT, (Object)0);
                    packetWrapper.write((Type)Types.BOOLEAN, (Object)true);
                    packetWrapper.scheduleSend(Protocol1_8To1_9.class);
                }
            }
            if (!Via.getConfig().isBossbarPatch() || entityType != EntityTypes1_9.EntityType.ENDER_DRAGON && entityType != EntityTypes1_9.EntityType.WITHER) continue;
            if (entityData.id() == 2) {
                BossBar bossBar = (BossBar)this.bossBarMap.get(n);
                string = (String)entityData.getValue();
                string = string.isEmpty() ? (entityType == EntityTypes1_9.EntityType.ENDER_DRAGON ? DRAGON_TRANSLATABLE : WITHER_TRANSLATABLE) : ComponentUtil.plainToJson((String)string).toString();
                if (bossBar == null) {
                    bossBar = Via.getAPI().legacyAPI().createLegacyBossBar(string, BossColor.PINK, BossStyle.SOLID);
                    this.bossBarMap.put(n, (Object)bossBar);
                    bossBar.addConnection(this.user());
                    bossBar.show();
                    ((BossBarProvider)Via.getManager().getProviders().get(BossBarProvider.class)).handleAdd(this.user(), bossBar.getId());
                    continue;
                }
                bossBar.setTitle(string);
                continue;
            }
            if (entityData.id() != 6 || Via.getConfig().isBossbarAntiflicker()) continue;
            BossBar bossBar = (BossBar)this.bossBarMap.get(n);
            float f = entityType == EntityTypes1_9.EntityType.ENDER_DRAGON ? 200.0f : 300.0f;
            EntityData entityData4 = entityData;
            float f2 = 1.0f;
            float f3 = ((Float)this.redirect$dhh000$viafabricplus$remapNaNToZero(entityData4)).floatValue() / f;
            f2 = this.redirect$dhh000$viafabricplus$removeMin(f3, f2);
            f3 = 0.0f;
            float f4 = this.redirect$dhh000$viafabricplus$removeMax(f3, f2);
            if (bossBar == null) {
                object = entityType == EntityTypes1_9.EntityType.ENDER_DRAGON ? DRAGON_TRANSLATABLE : WITHER_TRANSLATABLE;
                bossBar = Via.getAPI().legacyAPI().createLegacyBossBar((String)object, f4, BossColor.PINK, BossStyle.SOLID);
                this.bossBarMap.put(n, (Object)bossBar);
                bossBar.addConnection(this.user());
                bossBar.show();
                ((BossBarProvider)Via.getManager().getProviders().get(BossBarProvider.class)).handleAdd(this.user(), bossBar.getId());
                continue;
            }
            bossBar.setHealth(f4);
        }
    }

    public void removeEntity(int n) {
        super.removeEntity(n);
        this.vehicleMap.remove(n);
        this.uuidMap.remove(n);
        this.validBlocking.remove(n);
        this.knownHolograms.remove(n);
        BossBar bossBar = (BossBar)this.bossBarMap.remove(n);
        if (bossBar != null) {
            bossBar.hide();
            ((BossBarProvider)Via.getManager().getProviders().get(BossBarProvider.class)).handleRemove(this.user(), bossBar.getId());
        }
    }

    private float redirect$dhh000$viafabricplus$removeMax(float f, float f2) {
        return f2;
    }

    private float redirect$dhh000$viafabricplus$removeMin(float f, float f2) {
        return f;
    }

    private Object redirect$dhh000$viafabricplus$remapNaNToZero(EntityData entityData) {
        if (entityData.getValue() instanceof Float && ((Float)entityData.getValue()).isNaN()) {
            return Float.valueOf(0.0f);
        }
        return entityData.getValue();
    }

    public boolean isAutoTeam() {
        return this.autoTeam;
    }

    public EntityData getDataByIndex(List<EntityData> list, int n) {
        for (EntityData entityData : list) {
            if (n != entityData.id()) continue;
            return entityData;
        }
        return null;
    }

    public boolean isTeamExists() {
        return this.teamExists;
    }

    public Int2ObjectMap<BossBar> getBossBarMap() {
        return this.bossBarMap;
    }

    public BlockPosition getCurrentlyDigging() {
        return this.currentlyDigging;
    }

    public Set<BlockPosition> getBlockInteractions() {
        return this.blockInteractions;
    }

    public void setCurrentlyDigging(BlockPosition blockPosition) {
        this.currentlyDigging = blockPosition;
    }

    public Int2IntMap getVehicleMap() {
        return this.vehicleMap;
    }

    public void setBlocking(boolean bl) {
        this.blocking = bl;
    }

    public void setHeldItemSlot(int n) {
        this.heldItemSlot = n;
    }

    public GameMode getGameMode() {
        return this.gameMode;
    }

    public void sendTeamPacket(boolean bl, boolean bl2) {
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9.SET_PLAYER_TEAM, null, (UserConnection)this.user());
        packetWrapper.write(Types.STRING, (Object)"viaversion");
        if (bl) {
            if (!this.teamExists) {
                packetWrapper.write((Type)Types.BYTE, (Object)0);
                packetWrapper.write(Types.STRING, (Object)"viaversion");
                packetWrapper.write(Types.STRING, (Object)"\u00a7f");
                packetWrapper.write(Types.STRING, (Object)"");
                packetWrapper.write((Type)Types.BYTE, (Object)0);
                packetWrapper.write(Types.STRING, (Object)"");
                packetWrapper.write(Types.STRING, (Object)"never");
                packetWrapper.write((Type)Types.BYTE, (Object)15);
            } else {
                packetWrapper.write((Type)Types.BYTE, (Object)3);
            }
            packetWrapper.write(Types.STRING_ARRAY, (Object)new String[]{this.user().getProtocolInfo().getUsername()});
        } else {
            packetWrapper.write((Type)Types.BYTE, (Object)1);
        }
        this.teamExists = bl;
        if (bl2) {
            packetWrapper.send(Protocol1_8To1_9.class);
        } else {
            packetWrapper.scheduleSend(Protocol1_8To1_9.class);
        }
    }

    public void setCurrentTeam(String string) {
        this.currentTeam = string;
    }

    public String getCurrentTeam() {
        return this.currentTeam;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public void setAutoTeam(boolean bl) {
        this.autoTeam = bl;
    }

    public UUID getEntityUUID(int n2) {
        return (UUID)this.uuidMap.computeIfAbsent(n2, n -> UUID.randomUUID());
    }

    public IntSet getKnownHolograms() {
        return this.knownHolograms;
    }

    public void setSecondHand(Item item) {
        this.setSecondHand(this.clientEntityId(), item);
    }

    public void setSecondHand(int n, Item item) {
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9.SET_EQUIPPED_ITEM, null, (UserConnection)this.user());
        packetWrapper.write((Type)Types.VAR_INT, (Object)n);
        packetWrapper.write((Type)Types.VAR_INT, (Object)1);
        this.itemInSecondHand = item;
        packetWrapper.write(Types.ITEM1_8, (Object)this.itemInSecondHand);
        packetWrapper.scheduleSend(Protocol1_8To1_9.class);
    }

    public IntSet getValidBlocking() {
        return this.validBlocking;
    }

    public boolean hasSwordInHand() {
        InventoryTracker inventoryTracker = (InventoryTracker)this.user().get(InventoryTracker.class);
        int n = this.heldItemSlot + 36;
        int n2 = inventoryTracker.getItemId(0, (short)n);
        return Protocol1_8To1_9.isSword(n2);
    }
}


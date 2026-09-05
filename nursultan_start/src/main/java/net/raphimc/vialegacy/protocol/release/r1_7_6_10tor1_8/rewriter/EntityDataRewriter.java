/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8$EntityType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter.EntityDataRewriter$1
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.ChunkTracker
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_8;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.util.IdAndData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.Protocolr1_7_6_10Tor1_8;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.data.EntityDataIndex1_7_6;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.rewriter.EntityDataRewriter;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.storage.ChunkTracker;

public class EntityDataRewriter {
    private final Protocolr1_7_6_10Tor1_8 protocol;

    public EntityDataRewriter(Protocolr1_7_6_10Tor1_8 protocol) {
        this.protocol = protocol;
    }

    public void transform(UserConnection user, EntityTypes1_8.EntityType type, List<EntityData> list) {
        for (EntityData entry : new ArrayList<EntityData>(list)) {
            EntityDataIndex1_7_6 entityDataIndex = EntityDataIndex1_7_6.searchIndex((EntityTypes1_8.EntityType)type, (int)entry.id());
            try {
                if (entityDataIndex == null) {
                    if (Via.getConfig().logEntityDataErrors()) {
                        ViaLegacy.getPlatform().getLogger().warning("Could not find valid entity data index entry for " + type.name() + ": " + String.valueOf(entry));
                    }
                    list.remove(entry);
                    continue;
                }
                Object value = entry.getValue();
                entry.setTypeAndValue((EntityDataType)entityDataIndex.getOldType(), value);
                entry.setDataTypeUnsafe((EntityDataType)entityDataIndex.getNewType());
                entry.setId(entityDataIndex.getNewIndex());
                if (entityDataIndex == EntityDataIndex1_7_6.ENTITY_AGEABLE_AGE) {
                    entry.setValue((Object)((Integer)value < 0 ? (byte)-1 : 0));
                    continue;
                }
                if (entityDataIndex == EntityDataIndex1_7_6.ITEM_FRAME_ROTATION) {
                    entry.setValue((Object)Integer.valueOf((Byte)value * 2).byteValue());
                    continue;
                }
                if (entityDataIndex == EntityDataIndex1_7_6.ENDERMAN_CARRIED_BLOCK) {
                    byte id = (Byte)value;
                    EntityData blockDataMeta = null;
                    for (EntityData entityData : list) {
                        if (entityData.id() != EntityDataIndex1_7_6.ENDERMAN_CARRIED_BLOCK_DATA.getOldIndex()) continue;
                        blockDataMeta = entityData;
                        list.remove(blockDataMeta);
                        break;
                    }
                    byte data = blockDataMeta != null ? (Byte)blockDataMeta.getValue() : (byte)0;
                    IdAndData block = new IdAndData((int)id, (int)data);
                    ((ChunkTracker)user.get(ChunkTracker.class)).remapBlockParticle(block);
                    entry.setValue((Object)((short)(block.getId() | block.getData() << 12)));
                    continue;
                }
                if (entityDataIndex == EntityDataIndex1_7_6.HUMAN_SKIN_FLAGS) {
                    byte flags = (Byte)value;
                    boolean cape = (flags & 2) == 0;
                    flags = (byte)(cape ? 127 : 126);
                    entry.setValue((Object)flags);
                    continue;
                }
                switch (1.$SwitchMap$com$viaversion$viaversion$api$minecraft$entitydata$types$EntityDataTypes1_8[entityDataIndex.getNewType().ordinal()]) {
                    case 1: {
                        entry.setValue((Object)((Number)value).byteValue());
                        break;
                    }
                    case 2: {
                        entry.setValue((Object)((Number)value).shortValue());
                        break;
                    }
                    case 3: {
                        entry.setValue((Object)((Number)value).intValue());
                        break;
                    }
                    case 4: {
                        entry.setValue((Object)Float.valueOf(((Number)value).floatValue()));
                        break;
                    }
                    case 5: {
                        this.protocol.getItemRewriter().handleItemToClient(user, (Item)value);
                        break;
                    }
                    case 6: 
                    case 7: 
                    case 8: {
                        break;
                    }
                    default: {
                        if (Via.getConfig().logEntityDataErrors()) {
                            ViaLegacy.getPlatform().getLogger().warning("1.7.10 EntityDataRewriter: Unhandled Type: " + String.valueOf(entityDataIndex.getNewType()) + " " + String.valueOf(entry));
                        }
                        list.remove(entry);
                        break;
                    }
                }
            }
            catch (Throwable e) {
                if (Via.getConfig().logEntityDataErrors()) {
                    ViaLegacy.getPlatform().getLogger().log(Level.WARNING, "Error rewriting entity data entry for " + type.name() + ": " + String.valueOf(entry), e);
                }
                list.remove(entry);
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.IdRewriteFunction
 *  com.viaversion.viaversion.rewriter.StatisticsRewriter$1
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.IdRewriteFunction;
import com.viaversion.viaversion.rewriter.StatisticsRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

public class StatisticsRewriter<C extends ClientboundPacketType> {
    private static final int CUSTOM_STATS_CATEGORY = 8;
    private final Protocol<C, ?, ?, ?> protocol;

    public StatisticsRewriter(Protocol<C, ?, ?, ?> protocol) {
        this.protocol = protocol;
    }

    public void register(C packetType) {
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData == null || Mappings.isIntIdIdentity((Mappings)mappingData.getBlockMappings()) && Mappings.isIntIdIdentity((Mappings)mappingData.getItemMappings()) && Mappings.isIntIdIdentity((Mappings)mappingData.getEntityMappings()) && Mappings.isIntIdIdentity((Mappings)mappingData.getStatisticsMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            int size;
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                int categoryId = (Integer)wrapper.read((Type)Types.VAR_INT);
                int statisticId = (Integer)wrapper.read((Type)Types.VAR_INT);
                int value = (Integer)wrapper.read((Type)Types.VAR_INT);
                if (categoryId == 8 && mappingData.getStatisticsMappings() != null) {
                    statisticId = mappingData.getStatisticsMappings().getNewId(statisticId);
                    if (statisticId == -1) {
                        --newSize;
                        continue;
                    }
                } else {
                    IdRewriteFunction statisticsRewriter;
                    RegistryType type = this.getRegistryTypeForStatistic(categoryId);
                    if (type != null && (statisticsRewriter = this.getRewriter(type)) != null) {
                        statisticId = statisticsRewriter.rewrite(statisticId);
                    }
                }
                wrapper.write((Type)Types.VAR_INT, (Object)categoryId);
                wrapper.write((Type)Types.VAR_INT, (Object)statisticId);
                wrapper.write((Type)Types.VAR_INT, (Object)value);
            }
            if (newSize != size) {
                wrapper.set((Type)Types.VAR_INT, 0, (Object)newSize);
            }
        });
    }

    public @Nullable RegistryType getRegistryTypeForStatistic(int statisticsId) {
        return switch (statisticsId) {
            case 0 -> RegistryType.BLOCK;
            case 1, 2, 3, 4, 5 -> RegistryType.ITEM;
            case 6, 7 -> RegistryType.ENTITY;
            default -> null;
        };
    }

    protected @Nullable IdRewriteFunction getRewriter(RegistryType type) {
        return switch (1.$SwitchMap$com$viaversion$viaversion$api$minecraft$RegistryType[type.ordinal()]) {
            case 1 -> {
                if (this.protocol.getMappingData().getBlockMappings() != null) {
                    yield id -> this.protocol.getMappingData().getNewBlockId(id);
                }
                yield null;
            }
            case 2 -> {
                if (this.protocol.getMappingData().getItemMappings() != null) {
                    yield id -> this.protocol.getMappingData().getNewItemId(id);
                }
                yield null;
            }
            case 3 -> {
                if (this.protocol.getEntityRewriter() != null) {
                    yield id -> this.protocol.getEntityRewriter().newEntityId(id);
                }
                yield null;
            }
            default -> throw new IllegalArgumentException("Unknown registry type in statistics packet: " + String.valueOf(type));
        };
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class01339
 *  minecraft.class02682
 *  minecraft.class04425
 *  minecraft.class05474
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07322
 *  minecraft.class07955
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.common.world.ChunkView
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  net.caffeinemc.mods.lithium.mixin.ai.pathing.PathfindingContextAccessor
 */
package net.caffeinemc.mods.lithium.common.ai.pathing;

import minecraft.class00500;
import minecraft.class00554;
import minecraft.class01339;
import minecraft.class02682;
import minecraft.class04425;
import minecraft.class05474;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07322;
import minecraft.class07955;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.common.world.ChunkView;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.mixin.ai.pathing.PathfindingContextAccessor;

public abstract class PathNodeCache {
    private static boolean isChunkSectionDangerousNeighbor(class00554 class005542) {
        return class005542.B().N(class005002 -> PathNodeCache.getNeighborPathNodeType((class01339)class005002) != class04425.field_7);
    }

    public static class04425 getPathNodeType(class00500 class005002) {
        return ((BlockStatePathingCache)class005002).lithium$getPathNodeType();
    }

    public static class04425 getNodeTypeFromNeighbors(class02682 class026822, int n, int n2, int n3, class04425 class044252) {
        class07322 class073222 = class026822.N();
        class00554 class005542 = null;
        if (class073222 instanceof ChunkView) {
            ChunkView chunkView = (ChunkView)class073222;
            if (WorldHelper.areNeighborsWithinSameChunkSection((int)n, (int)n2, (int)n3)) {
                class08050 class080502;
                if (!class073222.method_31601(n2) && (class080502 = chunkView.lithium$getLoadedChunk(Pos.ChunkCoord.fromBlockCoord((int)n), Pos.ChunkCoord.fromBlockCoord((int)n3))) != null) {
                    class005542 = class080502.u()[Pos.SectionYIndex.fromBlockCoord((class05474)class073222, (int)n2)];
                }
                if (class005542 == null || PathNodeCache.isSectionSafeAsNeighbor(class005542)) {
                    return class044252;
                }
            }
        }
        int n4 = n - 1;
        int n5 = n2 - 1;
        int n6 = n3 - 1;
        int n7 = n + 1;
        int n8 = n2 + 1;
        int n9 = n3 + 1;
        for (int i = n4; i <= n7; ++i) {
            for (int j = n5; j <= n8; ++j) {
                for (int k = n6; k <= n9; ++k) {
                    class07218 class072182;
                    class00500 class005002;
                    if (i == n && k == n3) continue;
                    if (class005542 != null) {
                        class005002 = class005542.N(i & 0xF, j & 0xF, k & 0xF);
                    } else {
                        class072182 = ((PathfindingContextAccessor)class026822).getLastNodePos().N(i, j, k);
                        class005002 = class073222.method_8320((class07209)class072182);
                    }
                    if (class005002.P()) continue;
                    class072182 = PathNodeCache.getNeighborPathNodeType((class01339)class005002);
                    if (class072182 == null && (class072182 = class07955.N((class02682)class026822, (int)(i + 1), (int)(j + 1), (int)(k + 1), null)) == null) {
                        class072182 = class04425.field_7;
                    }
                    if (class072182 == class04425.field_7) continue;
                    return class072182;
                }
            }
        }
        return class044252;
    }

    public static class04425 getNeighborPathNodeType(class01339 class013392) {
        return ((BlockStatePathingCache)class013392).lithium$getNeighborPathNodeType();
    }

    public static boolean isSectionSafeAsNeighbor(class00554 class005542) {
        if (class005542.L()) {
            return true;
        }
        if (BlockStateFlags.ENABLED) {
            return !((BlockCountingSection)class005542).lithium$mayContainAny(BlockStateFlags.PATH_NOT_OPEN);
        }
        return !PathNodeCache.isChunkSectionDangerousNeighbor(class005542);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class06092
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.block.BlockCountingSection
 *  net.caffeinemc.mods.lithium.common.block.BlockStateFlags
 */
package net.caffeinemc.mods.lithium.common.entity.movement;

import com.google.common.collect.AbstractIterator;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class06092;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeCaster;
import net.caffeinemc.mods.lithium.common.util.Pos$BlockCoord;
import net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord;
import net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex;

public abstract class ChunkAwareBlockCollisionSweeper<T>
extends AbstractIterator<T> {
    protected final class07218 pos = new class07218();
    protected final class00734 box;
    protected final class00494 shape;
    protected final class07299 world;
    protected final class06092 context;
    protected final int minX;
    protected final int minY;
    protected final int minZ;
    protected final int maxX;
    protected final int maxY;
    protected final int maxZ;
    private int chunkX;
    private int chunkYIndex;
    private int chunkZ;
    protected int cStartX;
    protected int cStartZ;
    protected int cEndX;
    protected int cEndZ;
    protected int cX;
    protected int cY;
    protected int cZ;
    protected int cTotalSize;
    protected int cIterated;
    protected boolean sectionOversizedBlocks;
    private class08050 cachedChunk;
    protected class00554 cachedChunkSection;

    public ChunkAwareBlockCollisionSweeper(class07299 class072992, class07049 class070492, class00734 class007342, boolean bl) {
        this.box = class007342;
        this.shape = class00389.N((class00734)class007342);
        this.context = class070492 == null ? class06092.N() : class06092.N((class07049)class070492);
        this.world = class072992;
        this.minX = class04995.N((double)(class007342.N - 1.0E-7));
        this.maxX = class04995.N((double)(class007342.u + 1.0E-7));
        this.minY = class04995.N((int)class04995.N((double)(class007342.y - 1.0E-7)), (int)Pos$BlockCoord.getMinY((class05474)this.world), (int)Pos$BlockCoord.getMaxYInclusive((class05474)this.world));
        this.maxY = class04995.N((int)class04995.N((double)(class007342.i + 1.0E-7)), (int)Pos$BlockCoord.getMinY((class05474)this.world), (int)Pos$BlockCoord.getMaxYInclusive((class05474)this.world));
        this.minZ = class04995.N((double)(class007342.L - 1.0E-7));
        this.maxZ = class04995.N((double)(class007342.R + 1.0E-7));
        this.chunkX = Pos$ChunkCoord.fromBlockCoord(ChunkAwareBlockCollisionSweeper.expandMin(this.minX));
        this.chunkZ = Pos$ChunkCoord.fromBlockCoord(ChunkAwareBlockCollisionSweeper.expandMin(this.minZ));
        this.cIterated = 0;
        this.cTotalSize = 0;
        --this.chunkX;
    }

    private static boolean hasChunkSectionOversizedBlocks(class08050 class080502, int n) {
        if (BlockStateFlags.ENABLED) {
            class00554 class005542 = class080502.u()[n];
            return class005542 != null && ((BlockCountingSection)class005542).lithium$mayContainAny(BlockStateFlags.OVERSIZED_SHAPE);
        }
        return true;
    }

    protected static class00494 getCollidedShape(class00734 class007342, class00494 class004942, class00494 class004943, int n, int n2, int n3) {
        if (class004943 == class00389.y()) {
            return class007342.N((double)n, (double)n2, (double)n3, (double)n + 1.0, (double)n2 + 1.0, (double)n3 + 1.0) ? class004943.method_1096((double)n, (double)n2, (double)n3) : null;
        }
        if (class004943 instanceof VoxelShapeCaster) {
            if (((VoxelShapeCaster)class004943).intersects(class007342, n, n2, n3)) {
                return class004943.method_1096((double)n, (double)n2, (double)n3);
            }
            return null;
        }
        if (class00389.L((class00494)(class004943 = class004943.method_1096((double)n, (double)n2, (double)n3)), (class00494)class004942, (class07003)class07003.Z)) {
            return class004943;
        }
        return null;
    }

    protected final boolean nextSection() {
        while (true) {
            if (this.cachedChunk != null && this.chunkYIndex < Pos$SectionYIndex.getMaxYSectionIndexInclusive((class05474)this.world) && this.chunkYIndex < Pos$SectionYIndex.fromBlockCoord((class05474)this.world, ChunkAwareBlockCollisionSweeper.expandMax(this.maxY))) {
                ++this.chunkYIndex;
                this.cachedChunkSection = this.cachedChunk.u()[this.chunkYIndex];
            } else {
                if (this.chunkX < Pos$ChunkCoord.fromBlockCoord(ChunkAwareBlockCollisionSweeper.expandMax(this.maxX))) {
                    ++this.chunkX;
                } else if (this.chunkZ < Pos$ChunkCoord.fromBlockCoord(ChunkAwareBlockCollisionSweeper.expandMax(this.maxZ))) {
                    this.chunkX = Pos$ChunkCoord.fromBlockCoord(ChunkAwareBlockCollisionSweeper.expandMin(this.minX));
                    ++this.chunkZ;
                } else {
                    return false;
                }
                this.cachedChunk = this.world.method_8402(this.chunkX, this.chunkZ, class00549.m, false);
                if (this.cachedChunk != null) {
                    this.chunkYIndex = class04995.N((int)Pos$SectionYIndex.fromBlockCoord((class05474)this.world, ChunkAwareBlockCollisionSweeper.expandMin(this.minY)), (int)Pos$SectionYIndex.getMinYSectionIndex((class05474)this.world), (int)Pos$SectionYIndex.getMaxYSectionIndexInclusive((class05474)this.world));
                    this.cachedChunkSection = this.cachedChunk.u()[this.chunkYIndex];
                }
            }
            if (this.cachedChunk == null || this.cachedChunkSection == null || this.cachedChunkSection.L()) continue;
            this.sectionOversizedBlocks = ChunkAwareBlockCollisionSweeper.hasChunkSectionOversizedBlocks(this.cachedChunk, this.chunkYIndex);
            int n = this.sectionOversizedBlocks ? 1 : 0;
            this.cEndX = Math.min(this.maxX + n, Pos$BlockCoord.getMaxInSectionCoord(this.chunkX));
            int n2 = Math.min(this.maxY + n, Pos$BlockCoord.getMaxYInSectionIndex((class05474)this.world, this.chunkYIndex));
            this.cEndZ = Math.min(this.maxZ + n, Pos$BlockCoord.getMaxInSectionCoord(this.chunkZ));
            this.cStartX = Math.max(this.minX - n, Pos$BlockCoord.getMinInSectionCoord(this.chunkX));
            int n3 = Math.max(this.minY - n, Pos$BlockCoord.getMinYInSectionIndex((class05474)this.world, this.chunkYIndex));
            this.cStartZ = Math.max(this.minZ - n, Pos$BlockCoord.getMinInSectionCoord(this.chunkZ));
            this.cX = this.cStartX;
            this.cY = n3;
            this.cZ = this.cStartZ;
            this.cTotalSize = (this.cEndX - this.cStartX + 1) * (n2 - n3 + 1) * (this.cEndZ - this.cStartZ + 1);
            if (this.cTotalSize != 0) break;
        }
        this.cIterated = 0;
        return true;
    }

    protected static boolean canInteractWithBlock(class00500 class005002, int n) {
        return !(n == 1 && !class005002.E() || n == 2 && class005002.i() != class00869.LN);
    }

    private static int expandMin(int n) {
        return n - 1;
    }

    private static int expandMax(int n) {
        return n + 1;
    }
}


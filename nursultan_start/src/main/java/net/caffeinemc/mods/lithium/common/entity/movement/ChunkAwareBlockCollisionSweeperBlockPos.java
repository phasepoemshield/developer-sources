/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07299
 *  minecraft.class07322
 */
package net.caffeinemc.mods.lithium.common.entity.movement;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07299;
import minecraft.class07322;
import net.caffeinemc.mods.lithium.common.entity.movement.ChunkAwareBlockCollisionSweeper;

public class ChunkAwareBlockCollisionSweeperBlockPos
extends ChunkAwareBlockCollisionSweeper<class07218> {
    public ChunkAwareBlockCollisionSweeperBlockPos(class07299 class072992, class07049 class070492, class00734 class007342) {
        super(class072992, class070492, class007342, false);
    }

    public class07218 computeNext() {
        while (this.cIterated < this.cTotalSize || this.nextSection()) {
            class00494 class004942;
            class00500 class005002;
            int n;
            ++this.cIterated;
            int n2 = this.cX;
            int n3 = this.cY++;
            int n4 = this.cZ;
            if (this.cX < this.cEndX) {
                ++this.cX;
            } else if (this.cZ < this.cEndZ) {
                this.cX = this.cStartX;
                ++this.cZ;
            } else {
                this.cX = this.cStartX;
                this.cZ = this.cStartZ;
            }
            if ((n = this.sectionOversizedBlocks ? (n2 < this.minX || n2 > this.maxX ? 1 : 0) + (n3 < this.minY || n3 > this.maxY ? 1 : 0) + (n4 < this.minZ || n4 > this.maxZ ? 1 : 0) : 0) == 3 || !ChunkAwareBlockCollisionSweeperBlockPos.canInteractWithBlock(class005002 = this.cachedChunkSection.N(n2 & 0xF, n3 & 0xF, n4 & 0xF), n)) continue;
            this.pos.N(n2, n3, n4);
            class00494 class004943 = this.context.N(class005002, (class07322)this.world, (class07209)this.pos);
            if (class004943 == null || class004943 == class00389.N() || (class004942 = ChunkAwareBlockCollisionSweeperBlockPos.getCollidedShape(this.box, this.shape, class004943, n2, n3, n4)) == null) continue;
            return this.pos;
        }
        return (class07218)this.endOfData();
    }
}


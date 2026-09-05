/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class00780
 *  minecraft.class03202
 *  minecraft.class04995
 */
package net.caffeinemc.mods.sodium.client.world.biome;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import minecraft.class00780;
import minecraft.class03202;
import minecraft.class04995;
import net.caffeinemc.mods.sodium.client.util.color.BoxBlur;
import net.caffeinemc.mods.sodium.client.util.color.BoxBlur$ColorBuffer;
import net.caffeinemc.mods.sodium.client.world.biome.LevelBiomeSlice;
import net.caffeinemc.mods.sodium.client.world.biome.LevelColorCache$Slice;
import net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext;

public class LevelColorCache {
    private static final int NEIGHBOR_BLOCK_RADIUS = 2;
    private final LevelBiomeSlice biomeData;
    private final Reference2ReferenceOpenHashMap<class03202, LevelColorCache$Slice[]> slices;
    private long populateStamp;
    private final int blendRadius;
    private final BoxBlur$ColorBuffer tempColorBuffer;
    private int minBlockX;
    private int minBlockY;
    private int minBlockZ;
    private int maxBlockX;
    private int maxBlockY;
    private int maxBlockZ;
    private final int sizeXZ;
    private final int sizeY;

    public LevelColorCache(LevelBiomeSlice levelBiomeSlice, int n) {
        this.biomeData = levelBiomeSlice;
        this.blendRadius = n;
        this.sizeXZ = 16 + (2 + this.blendRadius) * 2;
        this.sizeY = 20;
        this.slices = new Reference2ReferenceOpenHashMap();
        this.populateStamp = 1L;
        this.tempColorBuffer = new BoxBlur$ColorBuffer(this.sizeXZ, this.sizeXZ);
    }

    public void update(ChunkRenderContext chunkRenderContext) {
        this.minBlockX = chunkRenderContext.getOrigin().u() - 2;
        this.minBlockY = chunkRenderContext.getOrigin().i() - 2;
        this.minBlockZ = chunkRenderContext.getOrigin().R() - 2;
        this.maxBlockX = chunkRenderContext.getOrigin().M() + 2;
        this.maxBlockY = chunkRenderContext.getOrigin().B() + 2;
        this.maxBlockZ = chunkRenderContext.getOrigin().Z() + 2;
        ++this.populateStamp;
    }

    public int getColor(class03202 class032022, int n, int n2, int n3) {
        n = class04995.N((int)n, (int)this.minBlockX, (int)this.maxBlockX) - this.minBlockX;
        n2 = class04995.N((int)n2, (int)this.minBlockY, (int)this.maxBlockY) - this.minBlockY;
        n3 = class04995.N((int)n3, (int)this.minBlockZ, (int)this.maxBlockZ) - this.minBlockZ;
        if (!this.slices.containsKey((Object)class032022)) {
            this.initializeSlices(class032022);
        }
        LevelColorCache$Slice levelColorCache$Slice = ((LevelColorCache$Slice[])this.slices.get((Object)class032022))[n2];
        if (levelColorCache$Slice.lastPopulateStamp < this.populateStamp) {
            this.updateColorBuffers(n2, class032022, levelColorCache$Slice);
        }
        BoxBlur$ColorBuffer boxBlur$ColorBuffer = levelColorCache$Slice.getBuffer();
        return boxBlur$ColorBuffer.get(n + this.blendRadius, n3 + this.blendRadius);
    }

    private void initializeSlices(class03202 class032022) {
        LevelColorCache$Slice[] levelColorCache$SliceArray = new LevelColorCache$Slice[this.sizeY];
        for (int i = 0; i < this.sizeY; ++i) {
            levelColorCache$SliceArray[i] = new LevelColorCache$Slice(this.sizeXZ);
        }
        this.slices.put((Object)class032022, (Object)levelColorCache$SliceArray);
    }

    public int getBlendRadius() {
        return this.blendRadius;
    }

    private void updateColorBuffers(int n, class03202 class032022, LevelColorCache$Slice levelColorCache$Slice) {
        int n2 = this.minBlockY + n;
        int n3 = this.minBlockZ - this.blendRadius;
        int n4 = this.minBlockX - this.blendRadius;
        int n5 = this.maxBlockZ + this.blendRadius;
        int n6 = this.maxBlockX + this.blendRadius;
        BoxBlur$ColorBuffer boxBlur$ColorBuffer = levelColorCache$Slice.buffer;
        for (int i = n3; i <= n5; ++i) {
            for (int j = n4; j <= n6; ++j) {
                class00780 class007802 = (class00780)this.biomeData.getBiome(j, n2, i).N();
                int n7 = j - n4;
                int n8 = i - n3;
                boxBlur$ColorBuffer.set(n7, n8, class032022.getColor(class007802, (double)j, (double)i));
            }
        }
        if (this.blendRadius > 0) {
            BoxBlur.blur(boxBlur$ColorBuffer.data, this.tempColorBuffer.data, this.sizeXZ, this.sizeXZ, this.blendRadius);
        }
        levelColorCache$Slice.lastPopulateStamp = this.populateStamp;
    }
}


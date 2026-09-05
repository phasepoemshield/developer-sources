/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class01146
 *  minecraft.class03448
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03925
 *  minecraft.class04227
 *  minecraft.class04995
 *  minecraft.class05533
 *  minecraft.class07299
 */
package net.caffeinemc.mods.sodium.client.world.biome;

import minecraft.class00780;
import minecraft.class00795;
import minecraft.class01146;
import minecraft.class03448;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03925;
import minecraft.class04227;
import minecraft.class04995;
import minecraft.class05533;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.world.BiomeSeedProvider;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.client.world.biome.LevelBiomeSlice$BiasMap;
import net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext;
import net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSection;

public class LevelBiomeSlice {
    private static final int SIZE = 12;
    private final class03556<class00780>[] biomes = new class03556[1728];
    private final boolean[] uniform = new boolean[1728];
    private final LevelBiomeSlice$BiasMap bias = new LevelBiomeSlice$BiasMap();
    private long biomeZoomSeed;
    private int blockX;
    private int blockY;
    private int blockZ;

    public void update(class03448 class034482, ChunkRenderContext chunkRenderContext) {
        this.blockX = chunkRenderContext.getOrigin().u() - 16;
        this.blockY = chunkRenderContext.getOrigin().i() - 16;
        this.blockZ = chunkRenderContext.getOrigin().R() - 16;
        this.biomeZoomSeed = BiomeSeedProvider.getBiomeZoomSeed(class034482);
        this.copyBiomeData((class07299)class034482, chunkRenderContext);
        this.calculateBias();
        this.calculateUniform();
    }

    private void calculateUniform() {
        for (int i = 2; i < 10; ++i) {
            for (int j = 2; j < 10; ++j) {
                for (int k = 2; k < 10; ++k) {
                    this.uniform[LevelBiomeSlice.dataArrayIndex((int)i, (int)j, (int)k)] = this.hasUniformNeighbors(i, j, k);
                }
            }
        }
    }

    private static float biasToVector(int n) {
        return (float)n * 9.765625E-4f * 0.9f;
    }

    private void copyBiomeData(class07299 class072992, ChunkRenderContext chunkRenderContext) {
        class03529 class035292 = class072992.method_30349().L(class04227.NA).y(class00795.y);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                for (int k = 0; k < 3; ++k) {
                    this.copySectionBiomeData(chunkRenderContext, i, j, k, (class03556<class00780>)class035292);
                }
            }
        }
    }

    private static int dataArrayIndex(int n, int n2, int n3) {
        return n * 12 * 12 + n2 * 12 + n3;
    }

    private void calculateBias(int n, int n2, int n3, int n4, long l) {
        l = class05533.N((long)l, (long)n2);
        l = class05533.N((long)l, (long)n3);
        l = class05533.N((long)l, (long)n4);
        int n5 = LevelBiomeSlice.getBias(l);
        l = class05533.N((long)l, (long)this.biomeZoomSeed);
        int n6 = LevelBiomeSlice.getBias(l);
        l = class05533.N((long)l, (long)this.biomeZoomSeed);
        int n7 = LevelBiomeSlice.getBias(l);
        this.bias.set(n, n5, n6, n7);
    }

    private void calculateBias() {
        int n = this.blockX >> 2;
        int n2 = this.blockY >> 2;
        int n3 = this.blockZ >> 2;
        long l = this.biomeZoomSeed;
        for (int i = 1; i < 11; ++i) {
            int n4 = n + i;
            long l2 = class05533.N((long)l, (long)n4);
            for (int j = 1; j < 11; ++j) {
                int n5 = n2 + j;
                long l3 = class05533.N((long)l2, (long)n5);
                for (int k = 1; k < 11; ++k) {
                    int n6 = n3 + k;
                    long l4 = class05533.N((long)l3, (long)n6);
                    this.calculateBias(LevelBiomeSlice.dataArrayIndex(i, j, k), n4, n5, n6, l4);
                }
            }
        }
    }

    public class03556<class00780> getBiome(int n, int n2, int n3) {
        int n4 = n - this.blockX;
        int n5 = n2 - this.blockY;
        int n6 = n3 - this.blockZ;
        int n7 = LevelBiomeSlice.dataArrayIndex(class01146.N((int)(n4 - 2)), class01146.N((int)(n5 - 2)), class01146.N((int)(n6 - 2)));
        if (this.uniform[n7]) {
            return this.biomes[n7];
        }
        return this.getBiomeUsingVoronoi(n4, n5, n6);
    }

    private void copySectionBiomeData(ChunkRenderContext chunkRenderContext, int n, int n2, int n3, class03556<class00780> class035562) {
        ClonedChunkSection clonedChunkSection = chunkRenderContext.getSections()[LevelSlice.getLocalSectionIndex(n, n2, n3)];
        class03925<class03556<class00780>> class039252 = clonedChunkSection.getBiomeData();
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                for (int k = 0; k < 4; ++k) {
                    int n4 = n * 4 + i;
                    int n5 = n2 * 4 + j;
                    int n6 = n3 * 4 + k;
                    int n7 = LevelBiomeSlice.dataArrayIndex(n4, n5, n6);
                    this.biomes[n7] = class039252 == null ? class035562 : (class03556)class039252.N(i, j, k);
                }
            }
        }
    }

    private boolean hasUniformNeighbors(int n, int n2, int n3) {
        class00780 class007802 = (class00780)this.biomes[LevelBiomeSlice.dataArrayIndex(n, n2, n3)].N();
        int n4 = n - 1;
        int n5 = n + 1;
        int n6 = n2 - 1;
        int n7 = n2 + 1;
        int n8 = n3 - 1;
        int n9 = n3 + 1;
        for (int i = n4; i <= n5; ++i) {
            for (int j = n6; j <= n7; ++j) {
                for (int k = n8; k <= n9; ++k) {
                    if (this.biomes[LevelBiomeSlice.dataArrayIndex(i, j, k)].N() == class007802) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private class03556<class00780> getBiomeUsingVoronoi(int n, int n2, int n3) {
        int n4 = n - 2;
        int n5 = n2 - 2;
        int n6 = n3 - 2;
        int n7 = class01146.N((int)n4);
        int n8 = class01146.N((int)n5);
        int n9 = class01146.N((int)n6);
        float f = (float)class01146.y((int)n4) * 0.25f;
        float f2 = (float)class01146.y((int)n5) * 0.25f;
        float f3 = (float)class01146.y((int)n6) * 0.25f;
        float f4 = Float.POSITIVE_INFINITY;
        int n10 = 0;
        for (int i = 0; i < 8; ++i) {
            float f5;
            float f6;
            boolean bl = (i & 4) != 0;
            boolean bl2 = (i & 2) != 0;
            boolean bl3 = (i & 1) != 0;
            int n11 = n7 + (bl ? 1 : 0);
            int n12 = n8 + (bl2 ? 1 : 0);
            int n13 = n9 + (bl3 ? 1 : 0);
            float f7 = f - (bl ? 1.0f : 0.0f);
            float f8 = f2 - (bl2 ? 1.0f : 0.0f);
            float f9 = f3 - (bl3 ? 1.0f : 0.0f);
            int n14 = LevelBiomeSlice.dataArrayIndex(n11, n12, n13);
            float f10 = LevelBiomeSlice.biasToVector(this.bias.getX(n14));
            float f11 = LevelBiomeSlice.biasToVector(this.bias.getY(n14));
            float f12 = LevelBiomeSlice.biasToVector(this.bias.getZ(n14));
            float f13 = class04995.z((float)(f7 + f10));
            float f14 = f13 + (f6 = class04995.z((float)(f8 + f11))) + (f5 = class04995.z((float)(f9 + f12)));
            if (!(f4 > f14)) continue;
            n10 = n14;
            f4 = f14;
        }
        return this.biomes[n10];
    }

    private static int getBias(long l) {
        return (int)((l >> 24 & 0x3FFL) - 512L);
    }
}


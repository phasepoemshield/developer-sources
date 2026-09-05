/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ReferenceMap
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00536
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00772
 *  minecraft.class00869
 *  minecraft.class01296
 *  minecraft.class03202
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class05163
 *  minecraft.class05630
 *  minecraft.class05795
 *  minecraft.class06202
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07295
 *  minecraft.class07299
 *  net.fabricmc.fabric.api.blockview.v2.FabricBlockView
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.world;

import it.unimi.dsi.fastutil.ints.Int2ReferenceMap;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00536;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00772;
import minecraft.class00869;
import minecraft.class01296;
import minecraft.class03202;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class05163;
import minecraft.class05630;
import minecraft.class05795;
import minecraft.class06202;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07295;
import minecraft.class07299;
import net.caffeinemc.mods.sodium.client.services.PlatformLevelRenderHooks;
import net.caffeinemc.mods.sodium.client.services.SodiumModelData;
import net.caffeinemc.mods.sodium.client.services.SodiumModelDataContainer;
import net.caffeinemc.mods.sodium.client.world.PalettedContainerROExtension;
import net.caffeinemc.mods.sodium.client.world.SodiumAuxiliaryLightManager;
import net.caffeinemc.mods.sodium.client.world.biome.LevelBiomeSlice;
import net.caffeinemc.mods.sodium.client.world.biome.LevelColorCache;
import net.caffeinemc.mods.sodium.client.world.cloned.ChunkRenderContext;
import net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSection;
import net.caffeinemc.mods.sodium.client.world.cloned.ClonedChunkSectionCache;
import net.fabricmc.fabric.api.blockview.v2.FabricBlockView;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public final class LevelSlice
implements class07295,
FabricBlockView {
    private static final class00772[] LIGHT_TYPES = class00772.values();
    private static final int SECTION_BLOCK_COUNT = 4096;
    private static final int NEIGHBOR_BLOCK_RADIUS = 2;
    private static final int NEIGHBOR_CHUNK_RADIUS = class04995.i((int)2, (int)16) >> 4;
    private static final int SECTION_ARRAY_LENGTH = 1 + NEIGHBOR_CHUNK_RADIUS * 2;
    private static final int SECTION_ARRAY_SIZE = SECTION_ARRAY_LENGTH * SECTION_ARRAY_LENGTH * SECTION_ARRAY_LENGTH;
    private static final int LOCAL_XYZ_BITS = 4;
    private static final class00500 EMPTY_BLOCK_STATE = class00869.N.W();
    private final class03448 level;
    private final LevelBiomeSlice biomeSlice;
    private final LevelColorCache biomeColors;
    private final class00500[][] blockArrays;
    private final SodiumAuxiliaryLightManager[] auxLightManager;
    private final @Nullable class00536[][] lightArrays;
    private final @Nullable Int2ReferenceMap<class00394>[] blockEntityArrays;
    private final @Nullable Int2ReferenceMap<Object>[] blockEntityRenderDataArrays;
    private final SodiumModelDataContainer[] modelMapArrays;
    private int originBlockX;
    private int originBlockY;
    private int originBlockZ;
    private class05163 volume;

    public static ChunkRenderContext prepare(class07299 class072992, class01296 class012962, ClonedChunkSectionCache clonedChunkSectionCache) {
        class00570 class005702 = class072992.method_8497(class012962.method_10263(), class012962.method_10260());
        class00554 class005542 = class005702.u()[class072992.method_31603(class012962.method_10264())];
        if (class005542 == null || class005542.L()) {
            return null;
        }
        class05163 class051632 = new class05163(class012962.u() - 2, class012962.i() - 2, class012962.R() - 2, class012962.M() + 2, class012962.B() + 2, class012962.Z() + 2);
        int n = class012962.method_10263() - NEIGHBOR_CHUNK_RADIUS;
        int n2 = class012962.method_10264() - NEIGHBOR_CHUNK_RADIUS;
        int n3 = class012962.method_10260() - NEIGHBOR_CHUNK_RADIUS;
        int n4 = class012962.method_10263() + NEIGHBOR_CHUNK_RADIUS;
        int n5 = class012962.method_10264() + NEIGHBOR_CHUNK_RADIUS;
        int n6 = class012962.method_10260() + NEIGHBOR_CHUNK_RADIUS;
        ClonedChunkSection[] clonedChunkSectionArray = new ClonedChunkSection[SECTION_ARRAY_SIZE];
        for (int i = n; i <= n4; ++i) {
            for (int j = n3; j <= n6; ++j) {
                for (int k = n2; k <= n5; ++k) {
                    clonedChunkSectionArray[LevelSlice.getLocalSectionIndex((int)(i - n), (int)(k - n2), (int)(j - n3))] = clonedChunkSectionCache.acquire(i, k, j);
                }
            }
        }
        List<?> list = PlatformLevelRenderHooks.getInstance().retrieveChunkMeshAppenders(class072992, class012962.z());
        return new ChunkRenderContext(class012962, clonedChunkSectionArray, class051632, list);
    }

    public int method_31607() {
        return this.level.method_31607();
    }

    public @NonNull class00500 method_8320(class07209 class072092) {
        return this.getBlockState(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public @NonNull class04688 method_8316(class07209 class072092) {
        return this.method_8320(class072092).Y();
    }

    public LevelSlice(class03448 class034482) {
        this.level = class034482;
        this.blockArrays = new class00500[SECTION_ARRAY_SIZE][4096];
        this.lightArrays = new class00536[SECTION_ARRAY_SIZE][LIGHT_TYPES.length];
        this.blockEntityArrays = new Int2ReferenceMap[SECTION_ARRAY_SIZE];
        this.blockEntityRenderDataArrays = new Int2ReferenceMap[SECTION_ARRAY_SIZE];
        this.auxLightManager = new SodiumAuxiliaryLightManager[SECTION_ARRAY_SIZE];
        this.modelMapArrays = new SodiumModelDataContainer[SECTION_ARRAY_SIZE];
        this.biomeSlice = new LevelBiomeSlice();
        this.biomeColors = new LevelColorCache(this.biomeSlice, (Integer)((class05630)class06202.Nq().i_7).a().method_41753());
        for (Object[] objectArray : this.blockArrays) {
            Arrays.fill(objectArray, EMPTY_BLOCK_STATE);
        }
    }

    public void reset() {
        for (int i = 0; i < SECTION_ARRAY_LENGTH; ++i) {
            Arrays.fill(this.lightArrays[i], null);
            this.blockEntityArrays[i] = null;
            this.auxLightManager[i] = null;
            this.blockEntityRenderDataArrays[i] = null;
        }
    }

    public @Nullable Object getBlockEntityRenderData(class07209 class072092) {
        int n;
        int n2;
        if (!this.volume.u(class072092.method_10263(), class072092.method_10264(), class072092.method_10260())) {
            return null;
        }
        int n3 = class072092.method_10263() - this.originBlockX;
        Int2ReferenceMap<Object> int2ReferenceMap = this.blockEntityRenderDataArrays[LevelSlice.getLocalSectionIndex(n3 >> 4, (n2 = class072092.method_10264() - this.originBlockY) >> 4, (n = class072092.method_10260() - this.originBlockZ) >> 4)];
        if (int2ReferenceMap == null) {
            return null;
        }
        return int2ReferenceMap.get(LevelSlice.getLocalBlockIndex(n3 & 0xF, n2 & 0xF, n & 0xF));
    }

    public boolean hasBiomes() {
        return true;
    }

    public float method_24852(class07211 class072112, boolean bl) {
        return this.level.method_24852(class072112, bl);
    }

    public class00394 method_8321(class07209 class072092) {
        return this.getBlockEntity(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public @NonNull class05795 method_22336() {
        throw new UnsupportedOperationException();
    }

    public int method_31605() {
        return this.level.method_31605();
    }

    public int method_22335(class07209 class072092, int n) {
        if (!this.volume.u(class072092.method_10263(), class072092.method_10264(), class072092.method_10260())) {
            return 0;
        }
        int n2 = class072092.method_10263() - this.originBlockX;
        int n3 = class072092.method_10264() - this.originBlockY;
        int n4 = class072092.method_10260() - this.originBlockZ;
        class00536[] class00536Array = this.lightArrays[LevelSlice.getLocalSectionIndex(n2 >> 4, n3 >> 4, n4 >> 4)];
        class00536 class005362 = class00536Array[class00772.field_9284.ordinal()];
        class00536 class005363 = class00536Array[class00772.field_9282.ordinal()];
        int n5 = n2 & 0xF;
        int n6 = n3 & 0xF;
        int n7 = n4 & 0xF;
        int n8 = class005362 == null ? 0 : class005362.N(n5, n6, n7) - n;
        int n9 = class005363 == null ? 0 : class005363.N(n5, n6, n7);
        return Math.max(n9, n8);
    }

    public int method_23752(class07209 class072092, class03202 class032022) {
        return this.biomeColors.getColor(class032022, class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public int method_8314(class00772 class007722, class07209 class072092) {
        int n;
        int n2;
        if (!this.volume.u(class072092.method_10263(), class072092.method_10264(), class072092.method_10260())) {
            return 0;
        }
        int n3 = class072092.method_10263() - this.originBlockX;
        class00536 class005362 = this.lightArrays[LevelSlice.getLocalSectionIndex(n3 >> 4, (n2 = class072092.method_10264() - this.originBlockY) >> 4, (n = class072092.method_10260() - this.originBlockZ) >> 4)][class007722.ordinal()];
        if (class005362 == null) {
            return 0;
        }
        return class005362.N(n3 & 0xF, n2 & 0xF, n & 0xF);
    }

    public class03556 getBiomeFabric(class07209 class072092) {
        return this.biomeSlice.getBiome(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public boolean hasBiomeBlend() {
        return this.biomeColors.getBlendRadius() > 0;
    }

    private void unpackBlockData(class00500[] class00500Array, ChunkRenderContext chunkRenderContext, ClonedChunkSection clonedChunkSection) {
        if (clonedChunkSection.getBlockData() == null) {
            Arrays.fill(class00500Array, EMPTY_BLOCK_STATE);
            return;
        }
        PalettedContainerROExtension<class00500> palettedContainerROExtension = PalettedContainerROExtension.of(clonedChunkSection.getBlockData());
        class01296 class012962 = clonedChunkSection.getPosition();
        if (class012962.equals((Object)chunkRenderContext.getOrigin())) {
            palettedContainerROExtension.sodium$unpack((class00500[])class00500Array);
        } else {
            class05163 class051632 = chunkRenderContext.getVolume();
            int n = Math.max(class051632.B(), class012962.u());
            int n2 = Math.min(class051632.U(), class012962.M());
            int n3 = Math.max(class051632.Z(), class012962.i());
            int n4 = Math.min(class051632.E(), class012962.B());
            int n5 = Math.max(class051632.z(), class012962.R());
            int n6 = Math.min(class051632.W(), class012962.Z());
            palettedContainerROExtension.sodium$unpack((class00500[])class00500Array, n & 0xF, n3 & 0xF, n5 & 0xF, n2 & 0xF, n4 & 0xF, n6 & 0xF);
        }
    }

    private void copySectionData(ChunkRenderContext chunkRenderContext, int n) {
        ClonedChunkSection clonedChunkSection = chunkRenderContext.getSections()[n];
        Objects.requireNonNull(clonedChunkSection, "Chunk section must be non-null");
        this.unpackBlockData(this.blockArrays[n], chunkRenderContext, clonedChunkSection);
        this.lightArrays[n][class00772.field_9282.ordinal()] = clonedChunkSection.getLightArray(class00772.field_9282);
        this.lightArrays[n][class00772.field_9284.ordinal()] = clonedChunkSection.getLightArray(class00772.field_9284);
        this.blockEntityArrays[n] = clonedChunkSection.getBlockEntityMap();
        this.auxLightManager[n] = clonedChunkSection.getAuxLightManager();
        this.blockEntityRenderDataArrays[n] = clonedChunkSection.getBlockEntityRenderDataMap();
        this.modelMapArrays[n] = clonedChunkSection.getModelMap();
    }

    public static int getLocalBlockIndex(int n, int n2, int n3) {
        return n2 << 4 << 4 | n3 << 4 | n;
    }

    public class00500 getBlockState(int n, int n2, int n3) {
        if (!this.volume.u(n, n2, n3)) {
            return EMPTY_BLOCK_STATE;
        }
        int n4 = n - this.originBlockX;
        int n5 = n2 - this.originBlockY;
        int n6 = n3 - this.originBlockZ;
        return this.blockArrays[LevelSlice.getLocalSectionIndex(n4 >> 4, n5 >> 4, n6 >> 4)][LevelSlice.getLocalBlockIndex(n4 & 0xF, n5 & 0xF, n6 & 0xF)];
    }

    public SodiumModelData getPlatformModelData(class07209 class072092) {
        int n;
        int n2;
        if (!this.volume.u(class072092.method_10263(), class072092.method_10264(), class072092.method_10260())) {
            return SodiumModelData.EMPTY;
        }
        int n3 = class072092.method_10263() - this.originBlockX;
        SodiumModelDataContainer sodiumModelDataContainer = this.modelMapArrays[LevelSlice.getLocalSectionIndex(n3 >> 4, (n2 = class072092.method_10264() - this.originBlockY) >> 4, (n = class072092.method_10260() - this.originBlockZ) >> 4)];
        if (sodiumModelDataContainer.isEmpty()) {
            return SodiumModelData.EMPTY;
        }
        return sodiumModelDataContainer.getModelData(class072092);
    }

    public static int getLocalSectionIndex(int n, int n2, int n3) {
        return n2 * SECTION_ARRAY_LENGTH * SECTION_ARRAY_LENGTH + n3 * SECTION_ARRAY_LENGTH + n;
    }

    public void copyData(ChunkRenderContext chunkRenderContext) {
        this.originBlockX = class01296.L((int)(chunkRenderContext.getOrigin().method_10263() - NEIGHBOR_CHUNK_RADIUS));
        this.originBlockY = class01296.L((int)(chunkRenderContext.getOrigin().method_10264() - NEIGHBOR_CHUNK_RADIUS));
        this.originBlockZ = class01296.L((int)(chunkRenderContext.getOrigin().method_10260() - NEIGHBOR_CHUNK_RADIUS));
        this.volume = chunkRenderContext.getVolume();
        for (int i = 0; i < SECTION_ARRAY_LENGTH; ++i) {
            for (int j = 0; j < SECTION_ARRAY_LENGTH; ++j) {
                for (int k = 0; k < SECTION_ARRAY_LENGTH; ++k) {
                    this.copySectionData(chunkRenderContext, LevelSlice.getLocalSectionIndex(i, j, k));
                }
            }
        }
        this.biomeSlice.update(this.level, chunkRenderContext);
        this.biomeColors.update(chunkRenderContext);
    }

    public class00394 getBlockEntity(int n, int n2, int n3) {
        if (!this.volume.u(n, n2, n3)) {
            return null;
        }
        int n4 = n - this.originBlockX;
        int n5 = n2 - this.originBlockY;
        int n6 = n3 - this.originBlockZ;
        Int2ReferenceMap<class00394> int2ReferenceMap = this.blockEntityArrays[LevelSlice.getLocalSectionIndex(n4 >> 4, n5 >> 4, n6 >> 4)];
        if (int2ReferenceMap == null) {
            return null;
        }
        return (class00394)int2ReferenceMap.get(LevelSlice.getLocalBlockIndex(n4 & 0xF, n5 & 0xF, n6 & 0xF));
    }
}


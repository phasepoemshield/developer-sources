/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ReferenceMap
 *  it.unimi.dsi.fastutil.ints.Int2ReferenceMap$Entry
 *  it.unimi.dsi.fastutil.ints.Int2ReferenceMaps
 *  it.unimi.dsi.fastutil.ints.Int2ReferenceOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00536
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00750
 *  minecraft.class00753
 *  minecraft.class00772
 *  minecraft.class00780
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class01807
 *  minecraft.class03556
 *  minecraft.class03925
 *  minecraft.class05163
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07348
 *  minecraft.class07833
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.world.cloned;

import it.unimi.dsi.fastutil.ints.Int2ReferenceMap;
import it.unimi.dsi.fastutil.ints.Int2ReferenceMaps;
import it.unimi.dsi.fastutil.ints.Int2ReferenceOpenHashMap;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00536;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00750;
import minecraft.class00753;
import minecraft.class00772;
import minecraft.class00780;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class01807;
import minecraft.class03556;
import minecraft.class03925;
import minecraft.class05163;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07348;
import minecraft.class07833;
import net.caffeinemc.mods.sodium.client.services.PlatformBlockAccess;
import net.caffeinemc.mods.sodium.client.services.PlatformLevelAccess;
import net.caffeinemc.mods.sodium.client.services.PlatformModelAccess;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.client.services.SodiumModelDataContainer;
import net.caffeinemc.mods.sodium.client.util.iterator.WrappedIterator;
import net.caffeinemc.mods.sodium.client.util.iterator.WrappedIterator$Exception;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;
import net.caffeinemc.mods.sodium.client.world.PalettedContainerROExtension;
import net.caffeinemc.mods.sodium.client.world.SodiumAuxiliaryLightManager;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class ClonedChunkSection {
    private static final class00536 DEFAULT_SKY_LIGHT_ARRAY = new class00536(15);
    private static final class00536 DEFAULT_BLOCK_LIGHT_ARRAY = new class00536(0);
    private static final class07348<class00500> DEFAULT_STATE_CONTAINER = new class07348((Object)class00869.N.W(), class01807.N((class00750)class00891.U));
    private final class01296 pos;
    private final @Nullable Int2ReferenceMap<class00394> blockEntityMap;
    private final @Nullable Int2ReferenceMap<Object> blockEntityRenderDataMap;
    private final @Nullable class00536[] lightDataArrays;
    private final @Nullable SodiumAuxiliaryLightManager auxLightManager;
    private final @Nullable class03925<class00500> blockData;
    private final @Nullable class03925<class03556<class00780>> biomeData;
    private final SodiumModelDataContainer modelMap;
    private long lastUsedTimestamp = Long.MAX_VALUE;

    public ClonedChunkSection(class07299 class072992, class00570 class005702, @Nullable class00554 class005542, class01296 class012962) {
        this.pos = class012962;
        Object object = null;
        class03925 class039252 = null;
        Int2ReferenceMap<class00394> int2ReferenceMap = null;
        Int2ReferenceMap<Object> int2ReferenceMap2 = null;
        SodiumModelDataContainer sodiumModelDataContainer = PlatformModelAccess.getInstance().getModelDataContainer(class072992, class012962);
        this.auxLightManager = PlatformLevelAccess.INSTANCE.getLightManager(class005702, class012962);
        if (class005542 != null) {
            if (!class005542.L()) {
                object = !class072992.method_27982() ? PalettedContainerROExtension.clone(class005542.B()) : ClonedChunkSection.constructDebugWorldContainer(class012962);
                int2ReferenceMap = ClonedChunkSection.tryCopyBlockEntities(class005702, class012962);
                if (int2ReferenceMap != null && PlatformBlockAccess.getInstance().platformHasBlockData()) {
                    int2ReferenceMap2 = ClonedChunkSection.copyBlockEntityRenderData(class072992, int2ReferenceMap);
                }
            }
            class039252 = PalettedContainerROExtension.clone(class005542.Z());
        }
        this.blockData = object;
        this.biomeData = class039252;
        this.modelMap = sodiumModelDataContainer;
        this.blockEntityMap = int2ReferenceMap;
        this.blockEntityRenderDataMap = int2ReferenceMap2;
        this.lightDataArrays = ClonedChunkSection.copyLightData(class072992, class012962);
    }

    public class01296 getPosition() {
        return this.pos;
    }

    private static @NonNull class07348<class00500> constructDebugWorldContainer(class01296 class012962) {
        class07348 class073482;
        block6: {
            block5: {
                if (class012962.method_10264() != 3 && class012962.method_10264() != 4) {
                    return DEFAULT_STATE_CONTAINER;
                }
                class073482 = new class07348((Object)class00869.N.W(), class01807.N((class00750)class00891.U));
                if (class012962.method_10264() != 3) break block5;
                class00500 class005002 = class00869.ZX.W();
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        class073482.y(j, 12, i, (Object)class005002);
                    }
                }
                break block6;
            }
            if (class012962.method_10264() != 4) break block6;
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    class073482.y(j, 6, i, (Object)class07833.N((int)class01296.N((int)class012962.method_10263(), (int)j), (int)class01296.N((int)class012962.method_10260(), (int)i)));
                }
            }
        }
        return class073482;
    }

    public @Nullable Int2ReferenceMap<Object> getBlockEntityRenderDataMap() {
        return this.blockEntityRenderDataMap;
    }

    public @Nullable class00536 getLightArray(class00772 class007722) {
        return this.lightDataArrays[class007722.ordinal()];
    }

    public SodiumAuxiliaryLightManager getAuxLightManager() {
        return this.auxLightManager;
    }

    private static @NonNull class00536[] copyLightData(class07299 class072992, class01296 class012962) {
        class00536[] class00536Array = new class00536[2];
        class00536Array[class00772.field_9282.ordinal()] = ClonedChunkSection.copyLightArray(class072992, class00772.field_9282, class012962);
        if (class072992.method_8597().i()) {
            class00536Array[class00772.field_9284.ordinal()] = ClonedChunkSection.copyLightArray(class072992, class00772.field_9284, class012962);
        }
        return class00536Array;
    }

    public SodiumModelDataContainer getModelMap() {
        return this.modelMap;
    }

    private static @NonNull class00536 copyLightArray(class07299 class072992, class00772 class007722, class01296 class012962) {
        class00536 class005362 = class072992.method_22336().N(class007722).N(class012962);
        if (class005362 == null) {
            class005362 = switch (class007722) {
                default -> throw new MatchException(null, null);
                case class00772.field_9284 -> DEFAULT_SKY_LIGHT_ARRAY;
                case class00772.field_9282 -> DEFAULT_BLOCK_LIGHT_ARRAY;
            };
        }
        return class005362;
    }

    public @Nullable Int2ReferenceMap<class00394> getBlockEntityMap() {
        return this.blockEntityMap;
    }

    private static @Nullable Int2ReferenceMap<class00394> copyBlockEntities(class00570 class005702, class01296 class012962) {
        class05163 class051632 = new class05163(class012962.u(), class012962.i(), class012962.R(), class012962.M(), class012962.B(), class012962.Z());
        Int2ReferenceOpenHashMap int2ReferenceOpenHashMap = null;
        WrappedIterator wrappedIterator = WrappedIterator.create(class005702.o().entrySet());
        while (wrappedIterator.hasNext()) {
            Map.Entry entry = wrappedIterator.next();
            class07209 class072092 = (class07209)entry.getKey();
            class00394 class003942 = (class00394)entry.getValue();
            if (!class051632.y((class00753)class072092)) continue;
            if (int2ReferenceOpenHashMap == null) {
                int2ReferenceOpenHashMap = new Int2ReferenceOpenHashMap();
            }
            int2ReferenceOpenHashMap.put(LevelSlice.getLocalBlockIndex(class072092.method_10263() & 0xF, class072092.method_10264() & 0xF, class072092.method_10260() & 0xF), (Object)class003942);
        }
        if (int2ReferenceOpenHashMap != null) {
            int2ReferenceOpenHashMap.trim();
        }
        return int2ReferenceOpenHashMap;
    }

    private static @Nullable Int2ReferenceMap<class00394> tryCopyBlockEntities(class00570 class005702, class01296 class012962) {
        try {
            return ClonedChunkSection.copyBlockEntities(class005702, class012962);
        }
        catch (WrappedIterator$Exception wrappedIterator$Exception) {
            if (PlatformRuntimeInformation.getInstance().isModInLoadingList("entityculling")) {
                throw new RuntimeException("Failed to iterate block entities! This is *very likely* the fault of the Entity Culling mod, and cannot be fixed by Sodium. See here for more details: https://link.caffeinemc.net/help/sodium/mod-issue/entity-culling/gh-2985", wrappedIterator$Exception);
            }
            throw new RuntimeException("Failed to iterate block entities! This is *very likely* the fault of another misbehaving mod, not Sodium. Please check your mods list.", wrappedIterator$Exception);
        }
    }

    public void setLastUsedTimestamp(long l) {
        this.lastUsedTimestamp = l;
    }

    public long getLastUsedTimestamp() {
        return this.lastUsedTimestamp;
    }

    private static @Nullable Int2ReferenceMap<Object> copyBlockEntityRenderData(class07299 class072992, Int2ReferenceMap<class00394> int2ReferenceMap) {
        Int2ReferenceOpenHashMap int2ReferenceOpenHashMap = null;
        for (Int2ReferenceMap.Entry entry : Int2ReferenceMaps.fastIterable(int2ReferenceMap)) {
            Object object = PlatformLevelAccess.getInstance().getBlockEntityData((class00394)entry.getValue());
            if (object == null) continue;
            if (int2ReferenceOpenHashMap == null) {
                int2ReferenceOpenHashMap = new Int2ReferenceOpenHashMap();
            }
            int2ReferenceOpenHashMap.put(entry.getIntKey(), object);
        }
        if (int2ReferenceOpenHashMap != null) {
            int2ReferenceOpenHashMap.trim();
        }
        return int2ReferenceOpenHashMap;
    }

    public @Nullable class03925<class03556<class00780>> getBiomeData() {
        return this.biomeData;
    }

    public @Nullable class03925<class00500> getBlockData() {
        return this.blockData;
    }
}


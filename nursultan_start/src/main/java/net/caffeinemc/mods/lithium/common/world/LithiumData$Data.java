/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class04227
 *  minecraft.class04877
 *  minecraft.class06584
 *  minecraft.class07623
 *  net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback
 *  net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker
 *  net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker
 */
package net.caffeinemc.mods.lithium.common.world;

import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Objects;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class04227;
import minecraft.class04877;
import minecraft.class06584;
import minecraft.class07623;
import net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback;
import net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.util.deduplication.LithiumInterner;
import net.caffeinemc.mods.lithium.common.world.GameEventDispatcherStorage;

public record LithiumData$Data(GameEventDispatcherStorage gameEventDispatchers, class06584 ominousBanner, ReferenceOpenHashSet<class07623> activeNavigations, LithiumInterner<SectionedBlockChangeTracker> blockChangeTrackers, LithiumInterner<SectionedEntityMovementTracker<?>> entityMovementTrackers, Long2ReferenceOpenHashMap<ChunkSectionChangeCallback> chunkSectionChangeCallbacks) {
    public LithiumData$Data(class01929 class019292) {
        this(new GameEventDispatcherStorage(), ((class01929)Objects.requireNonNullElse(class019292, class01042.y)).method_46759(class04227.NF).map(class04877::N).orElse(null), (ReferenceOpenHashSet<class07623>)new ReferenceOpenHashSet(), new LithiumInterner<SectionedBlockChangeTracker>(), new LithiumInterner(), (Long2ReferenceOpenHashMap<ChunkSectionChangeCallback>)new Long2ReferenceOpenHashMap());
    }
}


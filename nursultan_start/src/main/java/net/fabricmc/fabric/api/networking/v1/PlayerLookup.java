/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00558
 *  minecraft.class00753
 *  minecraft.class02796
 *  minecraft.class04751
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04813
 *  minecraft.class06265
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07321
 *  net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor
 *  net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;
import minecraft.class00394;
import minecraft.class00558;
import minecraft.class00753;
import minecraft.class02796;
import minecraft.class04751;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04813;
import minecraft.class06265;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;
import net.fabricmc.fabric.mixin.networking.accessor.ChunkMapAccessor;
import net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor;

public final class PlayerLookup {
    private PlayerLookup() {
    }

    public static Collection<class04770> all(class02796 class027962) {
        Objects.requireNonNull(class027962, "The server cannot be null");
        if (class027962.Nm() != null) {
            return Collections.unmodifiableCollection(class027962.Nm().v());
        }
        return Collections.emptyList();
    }

    public static Collection<class04770> tracking(class00394 class003942) {
        Objects.requireNonNull(class003942, "BlockEntity cannot be null");
        if (!class003942.l() || class003942.G().method_8608()) {
            throw new IllegalArgumentException("Only supported on server worlds!");
        }
        return PlayerLookup.tracking((class04782)class003942.G(), class003942.d());
    }

    public static Collection<class04770> tracking(class04782 class047822, class07209 class072092) {
        Objects.requireNonNull(class072092, "BlockPos cannot be null");
        return PlayerLookup.tracking(class047822, new class07321(class072092));
    }

    public static Collection<class04770> tracking(class07049 class070492) {
        Objects.requireNonNull(class070492, "Entity cannot be null");
        class00558 class005582 = class070492.method_73183().method_8398();
        if (class005582 instanceof class04751) {
            class06265 class062652 = ((class04751)class005582).L;
            EntityTrackerAccessor entityTrackerAccessor = (EntityTrackerAccessor)((ChunkMapAccessor)class062652).getEntityTrackers().get(class070492.method_5628());
            if (entityTrackerAccessor != null) {
                return entityTrackerAccessor.getPlayersTracking().stream().map(class04813::method_32311).collect(Collectors.toUnmodifiableSet());
            }
            return Collections.emptySet();
        }
        throw new IllegalArgumentException("Only supported on server worlds!");
    }

    public static Collection<class04770> tracking(class04782 class047822, class07321 class073212) {
        Objects.requireNonNull(class047822, "The world cannot be null");
        Objects.requireNonNull(class073212, "The chunk pos cannot be null");
        return class047822.method_14178().L.N(class073212, false);
    }

    public static Collection<class04770> world(class04782 class047822) {
        Objects.requireNonNull(class047822, "The world cannot be null");
        return Collections.unmodifiableCollection(class047822.method_18456());
    }

    public static Collection<class04770> around(class04782 class047822, class00753 class007532, double d) {
        double d2 = d * d;
        return PlayerLookup.world(class047822).stream().filter(class047702 -> class047702.method_5649((double)class007532.method_10263(), (double)class007532.method_10264(), (double)class007532.method_10260()) <= d2).collect(Collectors.toList());
    }

    public static Collection<class04770> around(class04782 class047822, class06889 class068892, double d) {
        double d2 = d * d;
        return PlayerLookup.world(class047822).stream().filter(class047702 -> class047702.method_5707(class068892) <= d2).collect(Collectors.toList());
    }
}


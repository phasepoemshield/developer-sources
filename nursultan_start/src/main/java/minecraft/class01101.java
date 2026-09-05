/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00500
 *  minecraft.class00690
 *  minecraft.class00734
 *  minecraft.class01128
 *  minecraft.class01129
 *  minecraft.class01135
 *  minecraft.class01210
 *  minecraft.class01234
 *  minecraft.class04197
 *  minecraft.class04218
 *  minecraft.class07049
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.entity.PositionedEntityTrackingSection
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 *  net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity
 *  net.caffeinemc.mods.lithium.common.entity.pushable.PushableEntityClassGroup
 *  net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection
 *  net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper
 *  net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker
 *  net.caffeinemc.mods.lithium.common.util.collections.ReferenceMaskedList
 *  net.caffeinemc.mods.lithium.common.world.ClimbingMobCachingSection
 *  net.caffeinemc.mods.lithium.mixin.alloc.entity_iteration.ClassInstanceMultiMapAccessor
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.EntitySectionAccessor
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.EntitySectionAccessor
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00690;
import minecraft.class00734;
import minecraft.class01102;
import minecraft.class01128;
import minecraft.class01129;
import minecraft.class01135;
import minecraft.class01210;
import minecraft.class01234;
import minecraft.class04197;
import minecraft.class04218;
import minecraft.class07049;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.entity.PositionedEntityTrackingSection;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity;
import net.caffeinemc.mods.lithium.common.entity.pushable.PushableEntityClassGroup;
import net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection;
import net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.util.collections.ReferenceMaskedList;
import net.caffeinemc.mods.lithium.common.world.ClimbingMobCachingSection;
import net.caffeinemc.mods.lithium.mixin.alloc.entity_iteration.ClassInstanceMultiMapAccessor;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntitySectionAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01101<T extends class01135>
implements PositionedEntityTrackingSection,
EntityMovementTrackerSection,
ClimbingMobCachingSection,
EntitySectionAccessor,
net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor,
net.caffeinemc.mods.lithium.mixin.util.accessors.EntitySectionAccessor {
    private static final Logger N = LogUtils.getLogger();
    private final class01234<T> y;
    private class01102 L;
    private ReferenceMaskedList u;
    private final ReferenceOpenHashSet i = new ReferenceOpenHashSet(0);
    private final ArrayList[] R = new ArrayList[MovementTrackerHelper.NUM_MOVEMENT_NOTIFYING_CLASSES];
    private final long[] M = new long[MovementTrackerHelper.NUM_MOVEMENT_NOTIFYING_CLASSES];
    private long B;

    public class01102 L() {
        return this.L;
    }

    public class01101(Class<T> clazz, class01102 class011022) {
        this.L = class011022;
        this.y = new class01234(clazz);
    }

    private void i() {
        this.u = new ReferenceMaskedList();
        for (class01135 class011352 : this.y) {
            this.N((class07049)class011352);
        }
    }

    public int u() {
        return this.y.size();
    }

    public boolean y(T t) {
        boolean bl = this.y.remove(t);
        this.N((class01135)t, (CallbackInfoReturnable)null);
        return bl;
    }

    public class01102 y(class01102 class011022) {
        block3: {
            block4: {
                if (this.L.y() == class011022.y()) break block3;
                if (class011022.y()) break block4;
                if (this.i.isEmpty()) break block3;
                for (SectionedEntityMovementTracker sectionedEntityMovementTracker : this.i) {
                    sectionedEntityMovementTracker.onSectionLeftRange((EntityMovementTrackerSection)this);
                }
                break block3;
            }
            if (!this.i.isEmpty()) {
                for (SectionedEntityMovementTracker sectionedEntityMovementTracker : this.i) {
                    sectionedEntityMovementTracker.onSectionEnteredRange((EntityMovementTrackerSection)this);
                }
            }
        }
        return class011022;
    }

    public Stream<T> y() {
        return this.y.stream();
    }

    private void N(class07049 class070492) {
        if (PushableEntityClassGroup.MAYBE_PUSHABLE.contains(class070492)) {
            this.u.add((Object)class070492);
            if (PushableEntityClassGroup.CACHABLE_UNPUSHABILITY.contains(class070492)) {
                FeetBlockCachingEntity feetBlockCachingEntity = (FeetBlockCachingEntity)class070492;
                this.N(feetBlockCachingEntity, feetBlockCachingEntity.lithium$getCachedFeetBlockState());
                feetBlockCachingEntity.lithium$SetClimbingMobCachingSectionUpdateBehavior(true);
            }
        }
    }

    private void N(FeetBlockCachingEntity feetBlockCachingEntity, class00500 class005002) {
        boolean bl = class01101.N(class005002);
        this.u.setVisible((Object)((class07049)feetBlockCachingEntity), bl);
    }

    private void N(class01135 class011352, CallbackInfo callbackInfo) {
        if (this.u != null) {
            if (!this.L.y()) {
                this.R();
            } else {
                this.N((class07049)class011352);
                if (this.u.totalSize() > this.y.size()) {
                    this.R();
                }
            }
        }
    }

    public boolean N(boolean bl) {
        return bl && this.i.isEmpty();
    }

    private static boolean N(class00500 class005002) {
        return class005002 == null || !class005002.N(class01210.yu);
    }

    private void N(class01135 class011352, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.u != null) {
            if (!this.L.y()) {
                this.R();
            } else {
                this.u.remove((Object)((class07049)class011352));
            }
        }
    }

    private Iterator N(class01234 class012342) {
        return ((ClassInstanceMultiMapAccessor)class012342).getAllInstances().iterator();
    }

    public class01102 N(class01102 class011022) {
        class011022 = this.y(class011022);
        class01102 class011023 = this.L;
        this.L = class011022;
        return class011023;
    }

    public <U extends T> class04218 N(class01128<T, U> class011282, class00734 class007342, class04197<? super U> class041972) {
        Collection collection = this.y.N(class011282.s());
        if (collection.isEmpty()) {
            return class04218.field_41283;
        }
        for (class01135 class011352 : collection) {
            class01135 class011353 = (class01135)class011282.N((Object)class011352);
            if (class011353 == null || !class011352.method_5829().L(class007342) || !class041972.accept((Object)class011353).N()) continue;
            return class04218.field_41284;
        }
        return class04218.field_41283;
    }

    public class04218 N(class00734 class007342, class04197<T> class041972) {
        class01234<T> class012342 = this.y;
        Iterator iterator = this.N(class012342);
        while (iterator.hasNext()) {
            class01135 class011352 = (class01135)iterator.next();
            if (!class011352.method_5829().L(class007342) || !class041972.accept((Object)class011352).N()) continue;
            return class04218.field_41284;
        }
        return class04218.field_41283;
    }

    public boolean N() {
        return this.N(this.y.isEmpty());
    }

    public void N(T t) {
        this.y.add(t);
        this.N((class01135)t, (CallbackInfo)null);
    }

    public long lithium$getPos() {
        return this.B;
    }

    public void lithium$removeListener(class01129 class011292, SectionedEntityMovementTracker sectionedEntityMovementTracker) {
        boolean bl = this.i.remove((Object)sectionedEntityMovementTracker);
        if (this.L.y() && bl) {
            sectionedEntityMovementTracker.onSectionLeftRange((EntityMovementTrackerSection)this);
        }
        if (this.N()) {
            class011292.i(this.lithium$getPos());
        }
    }

    public void lithium$addListener(SectionedEntityMovementTracker sectionedEntityMovementTracker) {
        this.i.add((Object)sectionedEntityMovementTracker);
        if (this.L.y()) {
            sectionedEntityMovementTracker.onSectionEnteredRange((EntityMovementTrackerSection)this);
        }
    }

    public long lithium$getChangeTime(int n) {
        return this.M[n];
    }

    private void R() {
        this.u = null;
    }

    public void lithium$setPos(long l) {
        this.B = l;
    }

    public class04218 lithium$collectPushableEntities(class07299 class072992, class07049 class070492, class00734 class007342, EntityPushablePredicate entityPushablePredicate, ArrayList arrayList) {
        Iterator iterator = this.u != null ? this.u.iterator() : this.y.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            class07049 class070493 = (class07049)iterator.next();
            if (!class070493.method_5829().L(class007342) || class070493.method_7325() || class070493 == class070492 || class070493 instanceof class00690) continue;
            ++n;
            if (!entityPushablePredicate.test((Object)class070493)) continue;
            ++n2;
            arrayList.add(class070493);
        }
        if (this.u == null && n >= 25 && n >= n2 * 2) {
            this.i();
        }
        return class04218.field_41283;
    }

    public void lithium$removeListenToMovementOnce(SectionedEntityMovementTracker sectionedEntityMovementTracker, int n) {
        if (this.R[n] != null) {
            this.R[n].remove(sectionedEntityMovementTracker);
        }
    }

    public void lithium$trackEntityMovement(int n, long l) {
        long[] lArray = this.M;
        int n2 = lArray.length;
        int n3 = Integer.numberOfTrailingZeros(n);
        while (n3 < n2) {
            lArray[n3] = l;
            ArrayList arrayList = this.R[n3];
            if (arrayList != null) {
                for (int i = arrayList.size() - 1; i >= 0; --i) {
                    ((SectionedEntityMovementTracker)arrayList.remove(i)).emitEntityMovement(n, (EntityMovementTrackerSection)this);
                }
            }
            int n4 = -2 << n3;
            n3 = Integer.numberOfTrailingZeros(n & n4);
        }
    }

    public void lithium$listenToMovementOnce(SectionedEntityMovementTracker sectionedEntityMovementTracker, int n) {
        if (this.R[n] == null) {
            this.R[n] = new ArrayList();
        }
        this.R[n].add(sectionedEntityMovementTracker);
    }

    public void lithium$onEntityModifiedCachedBlock(FeetBlockCachingEntity feetBlockCachingEntity, class00500 class005002) {
        if (this.u == null) {
            feetBlockCachingEntity.lithium$SetClimbingMobCachingSectionUpdateBehavior(false);
        } else {
            this.N(feetBlockCachingEntity, class005002);
        }
    }

    public /* synthetic */ class01234 getCollection() {
        return this.y;
    }
}


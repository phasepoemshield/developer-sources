/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00379
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00739
 *  minecraft.class00743
 *  minecraft.class00860
 *  minecraft.class00891
 *  minecraft.class01099
 *  minecraft.class01210
 *  minecraft.class04782
 *  minecraft.class05854
 *  minecraft.class06584
 *  minecraft.class06686
 *  minecraft.class06695
 *  minecraft.class06710
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07054
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07478
 *  minecraft.class07482
 *  minecraft.class08036
 *  minecraft.class08044
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumCooldownReceivingInventory
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker
 *  net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory
 *  net.caffeinemc.mods.lithium.common.hopper.HopperCachingState$BlockInventory
 *  net.caffeinemc.mods.lithium.common.hopper.HopperHelper
 *  net.caffeinemc.mods.lithium.common.hopper.InventoryHelper
 *  net.caffeinemc.mods.lithium.common.hopper.LithiumStackList
 *  net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver
 *  net.caffeinemc.mods.lithium.common.services.PlatformModCompat
 *  net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementListener
 *  net.caffeinemc.mods.lithium.common.tracking.entity.SectionedInventoryEntityMovementTracker
 *  net.caffeinemc.mods.lithium.common.tracking.entity.SectionedItemEntityMovementTracker
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage
 *  net.fabricmc.fabric.api.transfer.v1.item.ItemStorage
 *  net.fabricmc.fabric.api.transfer.v1.storage.Storage
 *  net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import minecraft.class00379;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00739;
import minecraft.class00743;
import minecraft.class00860;
import minecraft.class00891;
import minecraft.class01099;
import minecraft.class01210;
import minecraft.class04782;
import minecraft.class05854;
import minecraft.class06584;
import minecraft.class06686;
import minecraft.class06695;
import minecraft.class06710;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07054;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07252;
import minecraft.class07277;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07478;
import minecraft.class07482;
import minecraft.class08036;
import minecraft.class08044;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.api.inventory.LithiumCooldownReceivingInventory;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker;
import net.caffeinemc.mods.lithium.common.hopper.BlockStateOnlyInventory;
import net.caffeinemc.mods.lithium.common.hopper.HopperCachingState;
import net.caffeinemc.mods.lithium.common.hopper.HopperHelper;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.caffeinemc.mods.lithium.common.hopper.UpdateReceiver;
import net.caffeinemc.mods.lithium.common.services.PlatformModCompat;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementListener;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedInventoryEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedItemEntityMovementTracker;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import net.fabricmc.fabric.api.transfer.v1.item.InventoryStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemStorage;
import net.fabricmc.fabric.api.transfer.v1.storage.Storage;
import net.fabricmc.fabric.api.transfer.v1.storage.StorageUtil;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07234
extends class07277
implements class07252,
LithiumInventory,
SleepingBlockEntity,
InventoryChangeListener,
InventoryChangeTracker,
UpdateReceiver,
SectionedEntityMovementListener {
    public static final int N = 8;
    public static final int y = 5;
    private static final int[][] M = new int[54][];
    private static final int B = -1;
    private static final class00392 Z = class00392.L((String)"container.hopper");
    private class00743<class06584> m;
    private int P = -1;
    private long s;
    private class07211 T;
    private long b;
    private long j;
    private long v;
    private HopperCachingState.BlockInventory n = HopperCachingState.BlockInventory.UNKNOWN;
    private HopperCachingState.BlockInventory l = HopperCachingState.BlockInventory.UNKNOWN;
    private class06695 d;
    private class06695 w;
    private LithiumInventory k;
    private LithiumInventory Y;
    private LithiumStackList Q;
    private LithiumStackList O;
    private long g;
    private long I;
    private SectionedItemEntityMovementTracker J;
    private boolean o;
    private class00734 q;
    private long K;
    private SectionedInventoryEntityMovementTracker V;
    private class00734 e;
    private long H;
    private SectionedInventoryEntityMovementTracker c;
    private class00734 X;
    private long a;
    private boolean p;
    private WrappedBlockEntityTickInvokerAccessor F = null;
    private class01099 A = null;

    public class06695 L(class07299 class072992) {
        class06695 class066952 = this.y(class072992);
        if (class066952 != null) {
            return class066952;
        }
        if (this.c == null) {
            this.R(class072992);
        }
        if (this.c.isUnchangedSince(this.a)) {
            this.a = this.s;
            return null;
        }
        this.a = Long.MIN_VALUE;
        this.p = false;
        List list = this.c.getEntities(this.X);
        if (list.isEmpty()) {
            this.a = this.s;
            return null;
        }
        class06695 class066953 = (class06695)list.get(class072992.field_9229.y(list.size()));
        if (class066953 instanceof LithiumInventory) {
            LithiumInventory lithiumInventory = (LithiumInventory)class066953;
            LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory);
            if (class066953 != this.k || this.Q != lithiumStackList) {
                this.N(lithiumInventory);
            }
        }
        return class066953;
    }

    public void L(class00500 class005002) {
        this.N(class005002, null);
        super.L(class005002);
        this.T = (class07211)class005002.L((class08092)class00739.y);
    }

    private static @Nullable class06695 L(class07299 class072992, class07209 class072092, class00500 class005002) {
        class00394 class003942;
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class05854) {
            return ((class05854)class008912).N(class005002, (class07284)class072992, class072092);
        }
        if (class005002.k() && (class003942 = class072992.method_8321(class072092)) instanceof class06695) {
            class06695 class066952 = (class06695)class003942;
            if (class066952 instanceof class00379 && class008912 instanceof class00860) {
                class066952 = class00860.N((class00860)((class00860)class008912), (class00500)class005002, (class07299)class072992, (class07209)class072092, (boolean)true);
            }
            return class066952;
        }
        return null;
    }

    private static class06695 L(class07299 class072992, class07209 class072092, class07234 class072342) {
        return class072342.L(class072992);
    }

    @Override
    protected class00743<class06584> aC_() {
        return this.m;
    }

    private static List L(class07299 class072992, class07252 class072522) {
        if (!(class072522 instanceof class07234)) {
            return class07234.y(class072992, class072522);
        }
        class07234 class072342 = (class07234)class072522;
        if (class072342.J == null) {
            class072342.E();
        }
        long l = InventoryHelper.getLithiumStackList((LithiumInventory)class072342).getModCount();
        if ((class072342.o || class072342.v == l) && class072342.J.isUnchangedSince(class072342.K)) {
            class072342.K = class072342.s;
            return Collections.emptyList();
        }
        class072342.v = l;
        class072342.p = false;
        List list = class072342.J.getEntities(class072342.q);
        class072342.K = class072342.s;
        class072342.o = list.isEmpty();
        return list;
    }

    private void P() {
        if (this.n == HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
            assert (this.d != null);
            ((InventoryChangeTracker)this.d).stopListenForMajorInventoryChanges((InventoryChangeListener)this);
        }
        this.n = HopperCachingState.BlockInventory.UNKNOWN;
        this.d = null;
        this.k = null;
        this.Q = null;
        this.g = 0L;
        class07234 class072342 = this;
        if (class072342 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class072342).wakeUpNow();
        }
    }

    @Override
    public double T() {
        return (double)this.U.method_10263() + 0.5;
    }

    public class07234(class07209 class072092, class00500 class005002) {
        super(class00404.field_11888, class072092, class005002);
        this.m = class00743.method_10213((int)5, (Object)class06584.E);
        this.T = (class07211)class005002.L((class08092)class00739.y);
    }

    private void i(class07299 class072992) {
        assert (class072992 instanceof class04782);
        class07209 class072092 = this.U.method_10093(class07211.field_11036);
        this.e = new class00734((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (double)(class072092.method_10263() + 1), (double)(class072092.method_10264() + 1), (double)(class072092.method_10260() + 1));
        this.V = SectionedInventoryEntityMovementTracker.registerAt((class04782)((class04782)this.z), (class00734)this.e, class06695.class);
        this.H = Long.MIN_VALUE;
    }

    @Override
    public double b() {
        return (double)this.U.method_10264() + 0.5;
    }

    private void s() {
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.V != null) {
                this.V.unRegister(class047822);
                this.V = null;
                this.e = null;
                this.H = 0L;
            }
            if (this.J != null) {
                this.J.unRegister(class047822);
                this.J = null;
                this.q = null;
                this.o = false;
            }
        }
        this.n();
    }

    private void n() {
        if (this.l == HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
            assert (this.w != null);
            ((InventoryChangeTracker)this.w).stopListenForMajorInventoryChanges((InventoryChangeListener)this);
        }
        this.l = HopperCachingState.BlockInventory.UNKNOWN;
        this.w = null;
        this.Y = null;
        this.O = null;
        this.I = 0L;
        class07234 class072342 = this;
        if (class072342 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class072342).wakeUpNow();
        }
    }

    private void m() {
        class07299 class072992 = this.z;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            if (this.c != null) {
                this.c.unRegister(class047822);
                this.c = null;
                this.X = null;
                this.a = 0L;
            }
        }
        this.P();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void t() {
        class06695 class066952;
        if (this.z() || this.G() == null) {
            return;
        }
        class07234 class072342 = this;
        if (!(class072342 instanceof SleepingBlockEntity)) return;
        SleepingBlockEntity sleepingBlockEntity = class072342;
        if (sleepingBlockEntity.isSleeping()) {
            return;
        }
        if (!this.p) {
            this.p = true;
            return;
        }
        class07234 class072343 = this;
        if (!(class072343 instanceof InventoryChangeTracker)) return;
        class072342 = class072343;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)this);
        if (this.l != HopperCachingState.BlockInventory.BLOCK_STATE && lithiumStackList.getFullSlots() != lithiumStackList.size()) {
            if (this.l == HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
                class066952 = this.w;
                if (this.O == null || !(class066952 instanceof InventoryChangeTracker)) return;
                if (this.O.maybeSendsComparatorUpdatesOnFailedExtract() && this.O.getOccupiedSlots() != 0) {
                    ComparatorTracker comparatorTracker;
                    if (!(class066952 instanceof ComparatorTracker) || (comparatorTracker = (ComparatorTracker)class066952).lithium$hasAnyComparatorNearby()) return;
                    bl = true;
                } else {
                    bl = true;
                }
            } else {
                if (this.l != HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY) return;
                class066952 = this.w();
                if (PlatformModCompat.INSTANCE.canHopperInteractWithApiBlockInventory(this, (class00500)class066952, true)) {
                    return;
                }
                bl3 = true;
                class07209 class072092 = this.d().method_10084();
                class00500 class005002 = this.G().method_8320(class072092);
                if (!class005002.W((class07290)((Object)this.G()), class072092) || class005002.N(class01210.LF)) {
                    bl4 = true;
                }
            }
        }
        if (this.n != HopperCachingState.BlockInventory.BLOCK_STATE && 0 < lithiumStackList.getOccupiedSlots()) {
            if (this.n == HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
                class066952 = this.d;
                if (this.Q == null || !(class066952 instanceof InventoryChangeTracker)) return;
                bl2 = true;
            } else {
                if (this.n != HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY) return;
                class066952 = this.w();
                if (PlatformModCompat.INSTANCE.canHopperInteractWithApiBlockInventory(this, (class00500)class066952, false)) {
                    return;
                }
                bl5 = true;
            }
        }
        if (bl) {
            ((InventoryChangeTracker)this.w).listenForContentChangesOnce(this.O, (InventoryChangeListener)this);
        }
        if (bl2) {
            ((InventoryChangeTracker)this.d).listenForContentChangesOnce(this.Q, (InventoryChangeListener)this);
        }
        if (bl5) {
            if (this.c == null) {
                return;
            }
            this.c.listenToEntityMovementOnce((SectionedEntityMovementListener)this);
        }
        if (bl3) {
            if (this.V == null) {
                return;
            }
            this.V.listenToEntityMovementOnce((SectionedEntityMovementListener)this);
        }
        if (bl4) {
            if (this.J == null) return;
            this.J.listenToEntityMovementOnce((SectionedEntityMovementListener)this);
        }
        class072342.listenForContentChangesOnce(lithiumStackList, this);
        sleepingBlockEntity.lithium$startSleeping();
    }

    @Override
    public boolean v() {
        return true;
    }

    @Override
    public double j() {
        return (double)this.U.method_10260() + 0.5;
    }

    private boolean U() {
        return this.P > 8;
    }

    private boolean z() {
        return this.P > 0;
    }

    private class06695 u(class07299 class072992) {
        if (this.V == null) {
            this.i(class072992);
        }
        if (this.V.isUnchangedSince(this.H)) {
            this.H = this.s;
            return null;
        }
        this.H = Long.MIN_VALUE;
        this.p = false;
        List list = this.V.getEntities(this.e);
        if (list.isEmpty()) {
            this.H = this.s;
            return null;
        }
        class06695 class066952 = (class06695)list.get(class072992.field_9229.y(list.size()));
        if (class066952 instanceof LithiumInventory) {
            LithiumInventory lithiumInventory = (LithiumInventory)class066952;
            LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory);
            if (class066952 != this.Y || this.O != lithiumStackList) {
                this.y(lithiumInventory);
            }
        }
        return class066952;
    }

    private boolean u() {
        for (class06584 class065842 : this.m) {
            if (!class065842.R() && class065842.c() == class065842.U()) continue;
            return false;
        }
        return true;
    }

    private void y(LithiumInventory lithiumInventory) {
        LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory);
        this.Y = lithiumInventory;
        this.O = lithiumStackList;
        this.I = lithiumStackList.getModCount() - 1L;
    }

    private static class06695 y(class07299 class072992, class07252 class072522, class07209 class072092, class00500 class005002) {
        if (!(class072522 instanceof class07234)) {
            return class07234.N(class072992, class072522, class072092, class005002);
        }
        class07234 class072342 = (class07234)class072522;
        class06695 class066952 = class072342.y(class072992, class072092, class005002);
        if (class066952 != null) {
            return class066952;
        }
        return class072342.u(class072992);
    }

    private static boolean y(class07234 class072342) {
        return InventoryHelper.getLithiumStackList((LithiumInventory)class072342).getOccupiedSlots() == 0;
    }

    public class06695 y(class07299 class072992) {
        class07211 class072112;
        class07209 class072092;
        class07211 class072113;
        class06695 class066952 = this.d;
        if (this.n == HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY) {
            return null;
        }
        if (this.n == HopperCachingState.BlockInventory.BLOCK_STATE) {
            return class066952;
        }
        if (this.n == HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
            return class066952;
        }
        if (this.n == HopperCachingState.BlockInventory.BLOCK_ENTITY) {
            class072113 = (class00394)Objects.requireNonNull(class066952);
            class072092 = class072113.d();
            class072112 = this.T;
            class07209 class072093 = this.d().method_10093(class072112);
            if (!class072113.k() && class072092.equals((Object)class072093)) {
                LithiumInventory lithiumInventory = this.k;
                if (lithiumInventory != null) {
                    if (InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory) == this.Q) {
                        return lithiumInventory;
                    }
                    this.P();
                } else {
                    return class066952;
                }
            }
        }
        class072113 = this.T;
        class072092 = this.d().method_10093(class072113);
        class072112 = class072992.method_8320(class072092);
        class066952 = class07234.L(class072992, class072092, (class00500)class072112);
        class066952 = HopperHelper.replaceDoubleInventory((class06695)class066952);
        this.N(class066952);
        return class066952;
    }

    private void y(int n) {
        this.N(n, (CallbackInfo)null);
        this.P = n;
    }

    private static boolean y(class06695 class066952, class07211 class072112) {
        for (int n : class07234.N(class066952, class072112)) {
            class06584 class065842 = class066952.method_5438(n);
            if (class065842.c() >= class065842.U()) continue;
            return false;
        }
        return true;
    }

    private static @Nullable class06695 y(class07299 class072992, class07209 class072092, class07234 class072342) {
        return class07234.N(class072992, class072092.method_10093(class072342.T));
    }

    private static class06584 y(@Nullable class06695 class066952, class06695 class066953, class06584 class065842, int n, @Nullable class07211 class072112) {
        class06584 class065843 = class066953.method_5438(n);
        if (class07234.N(class066953, class065842, n, class072112)) {
            int n2;
            boolean bl = false;
            boolean bl2 = class066953.method_5442();
            if (class065843.R()) {
                class066953.method_5447(n, class065842);
                class065842 = class06584.E;
                bl = true;
            } else if (class07234.N(class065843, class065842)) {
                int n3 = class065842.U() - class065843.c();
                n2 = Math.min(class065842.c(), n3);
                class065842.B(n2);
                class065843.M(n2);
                boolean bl3 = bl = n2 > 0;
            }
            if (bl) {
                class07234 class072342;
                if (bl2 && class066953 instanceof class07234 && !(class072342 = (class07234)class066953).U()) {
                    n2 = 0;
                    if (class066952 instanceof class07234) {
                        class07234 class072343 = (class07234)class066952;
                        if (class072342.s >= class072343.s) {
                            n2 = 1;
                        }
                    }
                    class072342.y(8 - n2);
                }
                class066953.method_5431();
            }
        }
        return class065842;
    }

    private static void y(class07299 class072992, class07252 class072522, CallbackInfoReturnable callbackInfoReturnable, class06695 class066952) {
        if (class066952 != null) {
            return;
        }
        class07209 class072092 = class07209.method_49637((double)class072522.T(), (double)(class072522.b() + 1.0), (double)class072522.j());
        Storage var5 = (Storage)ItemStorage.SIDED.find(class072992, class072092, (Object)class07211.field_11033);
        if (var5 != null) {
            long l = StorageUtil.move((Storage)var5, (Storage)InventoryStorage.of((class06695)class072522, (class07211)class07211.field_11036), itemVariant -> true, (long)1L, null);
            callbackInfoReturnable.setReturnValue((Object)(l == 1L ? 1 : 0));
        }
    }

    private static void y(class07299 class072992, class07209 class072092, class07234 class072342, CallbackInfoReturnable callbackInfoReturnable, class06695 class066952) {
        if (class066952 != null) {
            return;
        }
        class07211 class072112 = class072342.T;
        class07209 class072093 = class072092.method_10093(class072112);
        Storage var7 = (Storage)ItemStorage.SIDED.find(class072992, class072093, (Object)class072112.b());
        if (var7 != null) {
            long l = StorageUtil.move((Storage)InventoryStorage.of((class06695)class072342, (class07211)class072112), (Storage)var7, itemVariant -> true, (long)1L, null);
            callbackInfoReturnable.setReturnValue((Object)(l == 1L ? 1 : 0));
        }
    }

    private void y(class06695 class066952) {
        assert (!(class066952 instanceof class07049));
        if (class066952 instanceof LithiumInventory) {
            LithiumInventory lithiumInventory = (LithiumInventory)class066952;
            this.y(lithiumInventory);
        } else {
            this.Y = null;
            this.O = null;
            this.I = 0L;
        }
        if (class066952 instanceof class00394 || class066952 instanceof class06710) {
            this.w = class066952;
            if (class066952 instanceof InventoryChangeTracker) {
                this.l = HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY;
                ((InventoryChangeTracker)class066952).listenForMajorInventoryChanges((InventoryChangeListener)this);
            } else {
                this.l = HopperCachingState.BlockInventory.BLOCK_ENTITY;
            }
        } else if (class066952 == null) {
            this.w = null;
            this.l = HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY;
        } else {
            this.w = class066952;
            this.l = class066952 instanceof BlockStateOnlyInventory ? HopperCachingState.BlockInventory.BLOCK_STATE : HopperCachingState.BlockInventory.UNKNOWN;
        }
    }

    public class06695 y(class07299 class072992, class07209 class072092, class00500 class005002) {
        class06695 class066952 = this.w;
        if (this.l == HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY) {
            return null;
        }
        if (this.l == HopperCachingState.BlockInventory.BLOCK_STATE) {
            return class066952;
        }
        if (this.l == HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY) {
            return class066952;
        }
        if (this.l == HopperCachingState.BlockInventory.BLOCK_ENTITY) {
            class00394 class003942 = (class00394)Objects.requireNonNull(class066952);
            class07209 class072093 = class003942.d();
            if (!class003942.k() && class072093.equals((Object)class072092)) {
                LithiumInventory lithiumInventory = this.Y;
                if (lithiumInventory != null) {
                    if (InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory) == this.O) {
                        return lithiumInventory;
                    }
                    this.n();
                } else {
                    return class066952;
                }
            }
        }
        class066952 = class07234.L(class072992, class072092, class005002);
        class066952 = HopperHelper.replaceDoubleInventory((class06695)class066952);
        this.y(class066952);
        return class066952;
    }

    public static List<class00717> y(class07299 class072992, class07252 class072522) {
        class00734 class007342 = class072522.ae_().u(class072522.T() - 0.5, class072522.b() - 0.5, class072522.j() - 0.5);
        return class072992.N(class00717.class, class007342, class07042.N);
    }

    private void E() {
        class00734 class007342;
        assert (this.z instanceof class04782);
        this.q = class007342 = this.ae_().u((double)this.U.method_10263(), (double)this.U.method_10264(), (double)this.U.method_10260());
        this.J = SectionedItemEntityMovementTracker.registerAt((class04782)((class04782)this.z), (class00734)class007342, class00717.class);
        this.K = Long.MIN_VALUE;
    }

    private static void N(class07299 class072992, class07252 class072522, CallbackInfoReturnable callbackInfoReturnable, class06695 class066952) {
        if (!(class072522 instanceof class07234)) {
            return;
        }
        class07234 class072342 = (class07234)class072522;
        if (class066952 != class072342.Y || class072342.O == null) {
            return;
        }
        LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)class072342);
        LithiumStackList lithiumStackList2 = class072342.O;
        if (lithiumStackList.getModCount() == class072342.j && lithiumStackList2.getModCount() == class072342.I) {
            ComparatorTracker comparatorTracker;
            if (!(class066952 instanceof ComparatorTracker) || (comparatorTracker = (ComparatorTracker)class066952).lithium$hasAnyComparatorNearby()) {
                lithiumStackList2.runComparatorUpdatePatternOnFailedExtract(lithiumStackList2, class066952);
            }
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        int[] nArray = class066952 instanceof class07054 ? ((class07054)class066952).N(class07211.field_11033) : null;
        int n = nArray != null ? nArray.length : class066952.method_5439();
        for (int i = 0; i < n; ++i) {
            int n2 = nArray != null ? nArray[i] : i;
            class06584 class065842 = (class06584)lithiumStackList2.get(n2);
            if (class065842.R() || !class07234.N(class072522, class066952, class065842, n2, class07211.field_11033)) continue;
            class06584 class065843 = class066952.method_5434(n2, 1);
            assert (!class065843.R());
            if (HopperHelper.tryMoveSingleItem((class06695)class072522, (class06584)class065843, null)) {
                class072522.method_5431();
                class066952.method_5431();
                callbackInfoReturnable.setReturnValue((Object)true);
                return;
            }
            class06584 class065844 = (class06584)lithiumStackList2.get(n2);
            if (class065844.R()) {
                class065844 = class065843;
            } else {
                class065844.M(1);
            }
            class066952.method_5447(n2, class065844);
        }
        class072342.j = lithiumStackList.getModCount();
        if (lithiumStackList2 != null) {
            class072342.I = lithiumStackList2.getModCount();
        }
        callbackInfoReturnable.setReturnValue((Object)false);
    }

    private void N(class00500 class005002, CallbackInfo callbackInfo) {
        if (this.z != null && !this.z.method_8608() && class005002.L((class08092)class00739.y) != this.w().L((class08092)class00739.y)) {
            this.W();
        }
    }

    private static boolean N(class07234 class072342) {
        LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)class072342);
        return lithiumStackList.getFullSlots() == lithiumStackList.size();
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07234 class072342, CallbackInfo callbackInfo) {
        class072342.t();
    }

    private void N(LithiumInventory lithiumInventory) {
        LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)lithiumInventory);
        this.k = lithiumInventory;
        this.Q = lithiumStackList;
        this.g = lithiumStackList.getModCount() - 1L;
    }

    public void N(class00743 class007432, CallbackInfo callbackInfo) {
        this.lithium$emitStackListReplaced();
    }

    private static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07234 class072342, BooleanSupplier booleanSupplier, CallbackInfoReturnable callbackInfoReturnable) {
        if (!(class072342.z() || class072342.isSleeping() || ((Boolean)class005002.L((class08092)class00739.L)).booleanValue())) {
            class072342.lithium$startSleeping();
        }
    }

    private void N(class06695 class066952) {
        assert (!(class066952 instanceof class07049));
        if (class066952 instanceof LithiumInventory) {
            LithiumInventory lithiumInventory = (LithiumInventory)class066952;
            this.N(lithiumInventory);
        } else {
            this.k = null;
            this.Q = null;
            this.g = 0L;
        }
        if (class066952 instanceof class00394 || class066952 instanceof class06710) {
            this.d = class066952;
            if (class066952 instanceof InventoryChangeTracker) {
                this.n = HopperCachingState.BlockInventory.REMOVAL_TRACKING_BLOCK_ENTITY;
                ((InventoryChangeTracker)class066952).listenForMajorInventoryChanges((InventoryChangeListener)this);
            } else {
                this.n = HopperCachingState.BlockInventory.BLOCK_ENTITY;
            }
        } else if (class066952 == null) {
            this.d = null;
            this.n = HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY;
        } else {
            this.d = class066952;
            this.n = class066952 instanceof BlockStateOnlyInventory ? HopperCachingState.BlockInventory.BLOCK_STATE : HopperCachingState.BlockInventory.UNKNOWN;
        }
    }

    private void N(int n, CallbackInfo callbackInfo) {
        if (n == 7) {
            if (this.s == Long.MAX_VALUE) {
                this.sleepOnlyCurrentTick();
            } else {
                this.wakeUpNow();
            }
        } else if (n > 0 && this.A != null) {
            this.wakeUpNow();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static class06584 N(@Nullable class06695 class066952, class06695 class066953, class06584 class065842, @Nullable class07211 class072112) {
        if (class066953 instanceof class07054) {
            class07054 class070542 = (class07054)class066953;
            if (class072112 != null) {
                int[] nArray = class070542.N(class072112);
                int n = 0;
                while (n < nArray.length) {
                    if (class065842.R()) return class065842;
                    class065842 = class07234.y(class066952, class066953, class065842, nArray[n], class072112);
                    ++n;
                }
                return class065842;
            }
        }
        int n = class066953.method_5439();
        int n2 = 0;
        while (n2 < n) {
            if (class065842.R()) return class065842;
            class065842 = class07234.y(class066952, class066953, class065842, n2, class072112);
            ++n2;
        }
        return class065842;
    }

    public static boolean N(class06695 class066952, class00717 class007172) {
        boolean bl = false;
        class06584 class065842 = class007172.N().t();
        class06584 class065843 = class07234.N(null, class066952, class065842, null);
        if (class065843.R()) {
            bl = true;
            class007172.N(class06584.E);
            class007172.method_31472();
        } else {
            class007172.N(class065843);
        }
        return bl;
    }

    private static boolean N(class07252 class072522, class06695 class066952, int n, class07211 class072112) {
        class06584 class065842 = class066952.method_5438(n);
        if (!class065842.R() && class07234.N(class072522, class066952, class065842, n, class072112)) {
            int n2 = class065842.c();
            if (class07234.N(class066952, (class06695)class072522, class066952.method_5434(n, 1), null).R()) {
                class066952.method_5431();
                return true;
            }
            class065842.i(n2);
            if (n2 == 1) {
                class066952.method_5447(n, class065842);
            }
        }
        return false;
    }

    public static boolean N(class07299 class072992, class07252 class072522) {
        boolean bl;
        class00500 class005002;
        class07209 class072092 = class07209.method_49637((double)class072522.T(), (double)(class072522.b() + 1.0), (double)class072522.j());
        class00500 class005003 = class005002 = class072992.method_8320(class072092);
        class07209 class072093 = class072092;
        class07252 class072523 = class072522;
        class07299 class072993 = class072992;
        class06695 class066952 = class07234.y(class072993, class072523, class072093, class005003);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class07234.y(class072992, class072522, callbackInfoReturnable, class066952);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (class066952 != null) {
            CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
            class07234.N(class072992, class072522, callbackInfoReturnable2, class066952);
            if (callbackInfoReturnable2.isCancelled()) {
                return callbackInfoReturnable2.getReturnValueZ();
            }
            class07211 class072112 = class07211.field_11033;
            for (int n : class07234.N(class066952, class072112)) {
                if (!class07234.N(class072522, class066952, n, class072112)) continue;
                return true;
            }
            return false;
        }
        boolean bl2 = bl = class072522.v() && class005002.W((class07290)((Object)class072992), class072092) && !class005002.N(class01210.LF);
        if (!bl) {
            class072523 = class072522;
            class072993 = class072992;
            for (class00717 class007172 : class07234.L(class072993, class072523)) {
                if (!class07234.N((class06695)class072522, class007172)) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean N(class06695 class066952, class06584 class065842, int n, @Nullable class07211 class072112) {
        if (!class066952.method_5437(n, class065842)) {
            return false;
        }
        return !(class066952 instanceof class07054) || ((class07054)class066952).N(n, class065842, class072112);
    }

    private static boolean N(class06695 class066952, class06695 class066953, class06584 class065842, int n, class07211 class072112) {
        if (!class066953.N(class066952, n, class065842)) {
            return false;
        }
        return !(class066953 instanceof class07054) || ((class07054)class066953).y(n, class065842, class072112);
    }

    private static @Nullable class06695 N(class07299 class072992, class07252 class072522, class07209 class072092, class00500 class005002) {
        return class07234.N(class072992, class072092, class005002, class072522.T(), class072522.b() + 1.0, class072522.j());
    }

    private static boolean N(class07299 class072992, class07209 class072092, class00500 class005002, class07234 class072342, BooleanSupplier booleanSupplier) {
        if (class072992.method_8608()) {
            return false;
        }
        if (!class072342.z() && ((Boolean)class005002.L((class08092)class00739.L)).booleanValue()) {
            boolean bl = false;
            class07234 class072343 = class072342;
            if (!class07234.y(class072343)) {
                bl = class07234.N(class072992, class072092, class072342);
            }
            if (!class07234.N(class072343 = class072342)) {
                bl |= booleanSupplier.getAsBoolean();
            }
            if (bl) {
                class072342.y(8);
                class07234.N((class07299)class072992, (class07209)class072092, (class00500)class005002);
                return true;
            }
        }
        class07234.N(class072992, class072092, class005002, class072342, booleanSupplier, null);
        return false;
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07234 class072342) {
        --class072342.P;
        class072342.s = class072992.N();
        if (!class072342.z()) {
            class072342.y(0);
            class07234.N(class072992, class072092, class005002, class072342, () -> class07234.N(class072992, (class07252)class072342));
            class07234.N(class072992, class072092, class005002, class072342, null);
        }
    }

    @Override
    protected void N(class08329 class083292) {
        super.N(class083292);
        if (!this.a_(class083292)) {
            class06686.N((class08329)class083292, this.m);
        }
        class083292.N("TransferCooldown", this.P);
    }

    @Override
    protected void N(class08299 class082992) {
        super.N(class082992);
        this.m = class00743.method_10213((int)this.method_5439(), (Object)class06584.E);
        if (!this.c_(class082992)) {
            class06686.N((class08299)class082992, this.m);
        }
        this.P = class082992.N("TransferCooldown", -1);
    }

    private static boolean N(class07299 class072992, class07209 class072092, class07234 class072342) {
        class06695 class066952 = class07234.L(class072992, class072092, class072342);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class07234.y(class072992, class072092, class072342, callbackInfoReturnable, class066952);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueZ();
        }
        if (class066952 == null) {
            return false;
        }
        class07211 class072112 = class072342.T.b();
        CallbackInfoReturnable callbackInfoReturnable2 = new CallbackInfoReturnable("", true);
        class07234.N(class072992, class072092, class072342, callbackInfoReturnable2, class066952);
        if (callbackInfoReturnable2.isCancelled()) {
            return callbackInfoReturnable2.getReturnValueZ();
        }
        if (class07234.y(class066952, class072112)) {
            return false;
        }
        for (int i = 0; i < class072342.method_5439(); ++i) {
            class06584 class065842 = class072342.method_5438(i);
            if (class065842.R()) continue;
            int n = class065842.c();
            if (class07234.N((class06695)class072342, class066952, class072342.method_5434(i, 1), class072112).R()) {
                class066952.method_5431();
                return true;
            }
            class065842.i(n);
            if (n != 1) continue;
            class072342.method_5447(i, class065842);
        }
        return false;
    }

    private static int[] N(class06695 class066952, class07211 class072112) {
        if (class066952 instanceof class07054) {
            class07054 class070542 = (class07054)class066952;
            return class070542.N(class072112);
        }
        int n = class066952.method_5439();
        if (n < M.length) {
            int[] nArray = M[n];
            if (nArray != null) {
                return nArray;
            }
            int[] nArray2 = class07234.N(n);
            class07234.M[n] = nArray2;
            return nArray2;
        }
        return class07234.N(n);
    }

    private static int[] N(int n) {
        int[] nArray = new int[n];
        for (int i = 0; i < nArray.length; ++i) {
            nArray[i] = i;
        }
        return nArray;
    }

    @Override
    protected void N(class00743<class06584> class007432) {
        this.m = class007432;
        this.N(class007432, null);
    }

    public static void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492, class07234 class072342) {
        class00717 class007172;
        if (class070492 instanceof class00717 && !(class007172 = (class00717)class070492).N().R() && class070492.method_5829().u((double)(-class072092.method_10263()), (double)(-class072092.method_10264()), (double)(-class072092.method_10260())).L(class072342.ae_())) {
            class07234.N(class072992, class072092, class005002, class072342, () -> class07234.N((class06695)class072342, class007172));
        }
    }

    @Override
    protected class07482 N(int n, class08044 class080442) {
        return new class07478(n, class080442, (class06695)this);
    }

    public static @Nullable class06695 N(class07299 class072992, class07209 class072092) {
        return class07234.N(class072992, class072092, class072992.method_8320(class072092), (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5);
    }

    private static @Nullable class06695 N(class07299 class072992, class07209 class072092, class00500 class005002, double d, double d2, double d3) {
        class06695 class066952 = class07234.L(class072992, class072092, class005002);
        if (class066952 == null) {
            class066952 = class07234.N(class072992, d, d2, d3);
        }
        return class066952;
    }

    private static @Nullable class06695 N(class07299 class072992, double d, double d2, double d3) {
        List<class07049> var7 = class072992.method_8333(null, new class00734(d - 0.5, d2 - 0.5, d3 - 0.5, d + 0.5, d2 + 0.5, d3 + 0.5), class07042.u);
        if (!var7.isEmpty()) {
            return (class06695)var7.get(class072992.field_9229.y(var7.size()));
        }
        return null;
    }

    private static void N(class07299 class072992, class07209 class072092, class07234 class072342, CallbackInfoReturnable callbackInfoReturnable, class06695 class066952) {
        boolean bl;
        boolean bl2;
        if (class066952 == null || !(class072342 instanceof class07234) || class072342 instanceof class07054) {
            return;
        }
        class07234 class072343 = class072342;
        LithiumStackList lithiumStackList = InventoryHelper.getLithiumStackList((LithiumInventory)class072343);
        if (class072343.k == class066952 && lithiumStackList.getModCount() == class072343.b && class072343.Q != null && class072343.Q.getModCount() == class072343.g) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        boolean bl3 = bl2 = class066952 instanceof class07234 && !((class07234)class066952).U() && class072343.Q != null && class072343.Q.getOccupiedSlots() == 0;
        boolean bl4 = ((LithiumCooldownReceivingInventory)class066952).canReceiveTransferCooldown() && class072343.Q != null ? class072343.Q.getOccupiedSlots() == 0 : (bl = class066952.method_5442());
        if (class072343.k != class066952 || class072343.Q.getFullSlots() != class072343.Q.size()) {
            class07211 class072112 = class072343.T.b();
            int n = lithiumStackList.size();
            for (int i = 0; i < n; ++i) {
                class06584 class065842 = (class06584)lithiumStackList.get(i);
                if (class065842.R() || !HopperHelper.tryMoveSingleItem((class06695)class066952, (class06584)class065842, (class07211)class072112)) continue;
                if (bl2) {
                    class07234 class072344 = (class07234)class066952;
                    int n2 = 8;
                    if (class072344.s >= class072343.s) {
                        n2 = 7;
                    }
                    class072344.y(n2);
                }
                if (bl) {
                    ((LithiumCooldownReceivingInventory)class066952).setTransferCooldown(class072343.s);
                }
                class066952.method_5431();
                callbackInfoReturnable.setReturnValue((Object)true);
                return;
            }
        }
        class072343.b = lithiumStackList.getModCount();
        if (class072343.Q != null) {
            class072343.g = class072343.Q.getModCount();
        }
        callbackInfoReturnable.setReturnValue((Object)false);
    }

    private static boolean N(class06584 class065842, class06584 class065843) {
        return class065842.c() <= class065842.U() && class06584.L((class06584)class065842, (class06584)class065843);
    }

    @Override
    public void method_5447(int n, class06584 class065842) {
        this.y((class08036)null);
        this.aC_().set(n, (Object)class065842);
        class065842.R(this.a_(class065842));
    }

    @Override
    public class06584 method_5434(int n, int n2) {
        this.y((class08036)null);
        return class06686.N(this.aC_(), (int)n, (int)n2);
    }

    public class01099 lithium$getSleepingTicker() {
        return this.A;
    }

    public void lithium$setTickWrapper(WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor) {
        this.F = wrappedBlockEntityTickInvokerAccessor;
        this.lithium$setSleepingTicker(null);
    }

    public void lithium$setSleepingTicker(class01099 class010992) {
        this.A = class010992;
    }

    public WrappedBlockEntityTickInvokerAccessor lithium$getTickWrapper() {
        return this.F;
    }

    public void lithium$handleInventoryRemoved(class06695 class066952) {
        class07234 class072342 = this;
        if (class072342 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class072342).wakeUpNow();
        }
        if (class066952 == this.d) {
            this.P();
        }
        if (class066952 == this.w) {
            this.n();
        }
        if (class066952 == this) {
            this.W();
        }
    }

    public boolean lithium$handleComparatorAdded(class06695 class066952) {
        class07234 class072342;
        if (class066952 == this.w && (class072342 = this) instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class072342).wakeUpNow();
            return true;
        }
        return false;
    }

    public void lithium$handleEntityMovement(Object object) {
        class07234 class072342 = this;
        if (class072342 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class072342).wakeUpNow();
        }
    }

    @Override
    protected class00392 an_() {
        return Z;
    }

    public void lithium$invalidateCacheOnUndirectedNeighborUpdate() {
        if (this.l == HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY || this.l == HopperCachingState.BlockInventory.BLOCK_STATE) {
            this.n();
        }
        if (this.n == HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY || this.n == HopperCachingState.BlockInventory.BLOCK_STATE) {
            this.P();
        }
    }

    public boolean lithium$startSleeping() {
        if (this.isSleeping()) {
            return false;
        }
        WrappedBlockEntityTickInvokerAccessor wrappedBlockEntityTickInvokerAccessor = this.lithium$getTickWrapper();
        if (wrappedBlockEntityTickInvokerAccessor != null) {
            this.lithium$setSleepingTicker(wrappedBlockEntityTickInvokerAccessor.getWrapped());
            wrappedBlockEntityTickInvokerAccessor.callSetWrapped(SleepingBlockEntity.SLEEPING_BLOCK_ENTITY_TICKER);
            this.s = Long.MAX_VALUE;
            return true;
        }
        return false;
    }

    public void lithium$invalidateCacheOnNeighborUpdate(class07211 class072112) {
        boolean bl;
        boolean bl2 = bl = class072112 == class07211.field_11036;
        if (bl || this.w().L((class08092)class00739.y) == class072112) {
            this.lithium$invalidateCacheOnNeighborUpdate(bl);
        }
    }

    public void lithium$invalidateCacheOnNeighborUpdate(boolean bl) {
        if (bl) {
            if (this.l == HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY || this.l == HopperCachingState.BlockInventory.BLOCK_STATE) {
                this.n();
            }
        } else if (this.n == HopperCachingState.BlockInventory.NO_BLOCK_INVENTORY || this.n == HopperCachingState.BlockInventory.BLOCK_STATE) {
            this.P();
        }
    }

    private void W() {
        this.p = false;
        this.m();
        this.s();
    }

    private void R(class07299 class072992) {
        assert (class072992 instanceof class04782);
        class07211 class072112 = this.T;
        class07209 class072092 = this.U.method_10093(class072112);
        this.X = new class00734((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), (double)(class072092.method_10263() + 1), (double)(class072092.method_10264() + 1), (double)(class072092.method_10260() + 1));
        this.c = SectionedInventoryEntityMovementTracker.registerAt((class04782)((class04782)this.z), (class00734)this.X, class06695.class);
        this.a = Long.MIN_VALUE;
    }

    public int method_5439() {
        return this.m.size();
    }

    public /* synthetic */ void setInventoryLithium(class00743 class007432) {
        this.m = class007432;
    }

    public /* synthetic */ class00743 getInventoryLithium() {
        return this.m;
    }

    public void lithium$handleInventoryContentModified(class06695 class066952) {
        class07234 class072342 = this;
        if (class072342 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class072342).wakeUpNow();
        }
    }
}


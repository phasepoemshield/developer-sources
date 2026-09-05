/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09323
 *  Nursultan.class09349
 *  Nursultan.class11938
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Lists
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalLongRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalLongRef
 *  com.mojang.serialization.Codec
 *  minecraft.class00272
 *  minecraft.class00381
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00531
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00558
 *  minecraft.class00570
 *  minecraft.class00608
 *  minecraft.class00611
 *  minecraft.class00616
 *  minecraft.class00690
 *  minecraft.class00695
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class00801
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class00931
 *  minecraft.class01042
 *  minecraft.class01099
 *  minecraft.class01124
 *  minecraft.class01128
 *  minecraft.class01129
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01284
 *  minecraft.class01296
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02265
 *  minecraft.class02733
 *  minecraft.class02755
 *  minecraft.class02796
 *  minecraft.class02827
 *  minecraft.class03106
 *  minecraft.class03556
 *  minecraft.class03697
 *  minecraft.class04206
 *  minecraft.class04218
 *  minecraft.class04227
 *  minecraft.class04358
 *  minecraft.class04540
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04763
 *  minecraft.class04770
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05042
 *  minecraft.class05087
 *  minecraft.class05207
 *  minecraft.class05474
 *  minecraft.class05517
 *  minecraft.class05527
 *  minecraft.class05795
 *  minecraft.class05946
 *  minecraft.class05989
 *  minecraft.class06069
 *  minecraft.class06511
 *  minecraft.class06584
 *  minecraft.class06614
 *  minecraft.class06683
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07376
 *  minecraft.class07769
 *  minecraft.class07830
 *  minecraft.class07878
 *  minecraft.class08036
 *  minecraft.class08050
 *  minecraft.class08057
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions
 *  net.caffeinemc.mods.lithium.common.entity.movement.ChunkAwareBlockCollisionSweeperBlockPos
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 *  net.caffeinemc.mods.lithium.common.hopper.HopperHelper
 *  net.caffeinemc.mods.lithium.common.shapes.VoxelShapeHelper
 *  net.caffeinemc.mods.lithium.common.world.ChunkRandomSource
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  net.caffeinemc.mods.lithium.common.world.LithiumData$Data
 *  net.caffeinemc.mods.lithium.common.world.WorldHelper
 *  net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter
 *  net.caffeinemc.mods.lithium.mixin.util.accessors.LevelAccessor
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget$OnAttachedSet
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo
 *  net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache
 *  org.apache.commons.lang3.mutable.MutableBoolean
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09323;
import Nursultan.class09349;
import Nursultan.class11938;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalLongRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import minecraft.class00272;
import minecraft.class00381;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00531;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00558;
import minecraft.class00570;
import minecraft.class00608;
import minecraft.class00611;
import minecraft.class00616;
import minecraft.class00690;
import minecraft.class00695;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class00801;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class00931;
import minecraft.class01042;
import minecraft.class01099;
import minecraft.class01124;
import minecraft.class01128;
import minecraft.class01129;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01284;
import minecraft.class01296;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02265;
import minecraft.class02733;
import minecraft.class02755;
import minecraft.class02796;
import minecraft.class02827;
import minecraft.class03106;
import minecraft.class03556;
import minecraft.class03697;
import minecraft.class04206;
import minecraft.class04218;
import minecraft.class04227;
import minecraft.class04358;
import minecraft.class04540;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04763;
import minecraft.class04770;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05042;
import minecraft.class05087;
import minecraft.class05207;
import minecraft.class05474;
import minecraft.class05517;
import minecraft.class05527;
import minecraft.class05795;
import minecraft.class05946;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class06511;
import minecraft.class06584;
import minecraft.class06614;
import minecraft.class06683;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07307;
import minecraft.class07309;
import minecraft.class07321;
import minecraft.class07322;
import minecraft.class07328;
import minecraft.class07376;
import minecraft.class07769;
import minecraft.class07830;
import minecraft.class07878;
import minecraft.class08036;
import minecraft.class08050;
import minecraft.class08057;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.entity.LithiumEntityCollisions;
import net.caffeinemc.mods.lithium.common.entity.movement.ChunkAwareBlockCollisionSweeperBlockPos;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.hopper.HopperHelper;
import net.caffeinemc.mods.lithium.common.shapes.VoxelShapeHelper;
import net.caffeinemc.mods.lithium.common.world.ChunkRandomSource;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.common.world.blockentity.BlockEntityGetter;
import net.caffeinemc.mods.lithium.mixin.util.accessors.LevelAccessor;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07299
implements class05474,
class07284,
AutoCloseable,
ChunkRandomSource,
LithiumData,
BlockEntityGetter,
LevelAccessor,
AttachmentTargetImpl,
LoadedChunksCache {
    public static final Codec<class05946<class07299>> field_25178 = class05946.N((class05946)class04227.yg);
    public static final class05946<class07299> field_25179 = class05946.N((class05946)class04227.yg, (class01894)class01894.y((String)"overworld"));
    public static final class05946<class07299> field_25180 = class05946.N((class05946)class04227.yg, (class01894)class01894.y((String)"the_nether"));
    public static final class05946<class07299> field_25181 = class05946.N((class05946)class04227.yg, (class01894)class01894.y((String)"the_end"));
    public static final int field_30965 = 30000000;
    public static final int field_30966 = 512;
    public static final int field_30967 = 32;
    public static final int field_30968 = 15;
    public static final int field_30970 = 20000000;
    public static final int field_30971 = -20000000;
    private static final class04540<class00931> field_61989 = class04540.y().N((Object)new class00931((class07126)class07107.NR, 0.5f, 1.0f)).N((Object)new class00931((class07126)class07107.NZ, 1.0f, 1.0f)).N();
    protected final List<class01099> field_27082;
    protected final class04358 field_38226;
    private final List<class01099> field_27081;
    private boolean field_9249;
    private final Thread field_17086;
    private final boolean field_24496;
    private int field_9226;
    protected int field_9256;
    protected final int field_9238;
    protected float field_9253;
    protected float field_9235;
    protected float field_9251;
    protected float field_9234;
    public final class06069 field_9229;
    @Deprecated
    private final class06069 field_38861;
    private final class03556<class07376> field_36402;
    protected final class05207 field_9232;
    private final boolean field_9236;
    private final class05517 field_20639;
    private final class05946<class07299> field_25176;
    private final class01042 field_42475;
    private final class03697 field_42476;
    private final class06614 field_62535;
    private long field_35455;
    private @Nullable IdentityHashMap dataAttachments = null;
    private @Nullable IdentityHashMap syncedAttachments = null;
    private @Nullable IdentityHashMap attachedChangedListeners = null;
    private final Set loadedChunks = new HashSet();
    private LithiumData.Data storage;
    private static final class00500 OUTSIDE_WORLD_BLOCK = class00869.mh.W();
    private static final class00500 INSIDE_WORLD_DEFAULT_BLOCK = class00869.N.W();
    private int bottomY;
    private int height;
    private int topYInclusive;

    private void handler$ceb000$lithium$updateHopperOnUpdateSuppression(class07209 class072092, class00500 class005002, int n, int n2, CallbackInfoReturnable callbackInfoReturnable, class00570 class005702, class00891 class008912, class00500 class005003, class00500 class005004) {
        HopperHelper.updateHopperOnUpdateSuppression((class07299)this, (class07209)class072092, (int)n, (class00570)class005702, (class005003 != class005004 ? 1 : 0) != 0);
    }

    public Optional method_33594(class07049 class070492, class00494 class004943, class06889 class068892, double d, double d2, double d3) {
        double d4;
        double d5;
        double d6;
        if (class004943.method_1110()) {
            return Optional.empty();
        }
        class00734 class007342 = class004943.method_1107().L(d, d2, d3);
        List var12 = LithiumEntityCollisions.getBlockCollisions((class07299)this, (class07049)class070492, (class00734)class007342);
        if (var12.isEmpty()) {
            return class004943.method_33661(class068892);
        }
        class08057 class080572 = this.method_8621();
        if (class080572 != null && 2.0 + 2.0 * (d6 = Math.max(class007342.y(), class007342.u())) >= class080572.y(d5 = class04995.u((double)0.5, (double)class007342.N, (double)class007342.u), d4 = class04995.u((double)0.5, (double)class007342.L, (double)class007342.R))) {
            var12.removeIf(class004942 -> !class080572.N(class004942.method_1107()));
        }
        ArrayList<class00734> arrayList = new ArrayList<class00734>();
        for (class00494 class004944 : var12) {
            for (class00734 class007343 : class004944.method_1090()) {
                class00734 class007344 = class007343.L(d / 2.0, d2 / 2.0, d3 / 2.0);
                arrayList.add(class007344);
            }
        }
        return VoxelShapeHelper.getClosestPointTo((class06889)class068892, (class00494)class004943, arrayList);
    }

    public class03697 method_48963() {
        return this.field_42476;
    }

    public class01042 method_30349() {
        return this.field_42475;
    }

    public void method_43128(@Nullable class07049 class070492, double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2) {
        this.method_47967(class070492, d, d2, d3, class048912, class049112, f, f2, this.field_38861.B());
    }

    public boolean method_8608() {
        return this.field_9236;
    }

    public int method_31607() {
        return this.bottomY;
    }

    public boolean method_8587(class07049 class070492, class00734 class007342) {
        boolean bl;
        boolean bl2 = bl = !LithiumEntityCollisions.doesBoxCollideWithBlocks((class07299)this, (class07049)class070492, (class00734)class007342);
        if (bl) {
            boolean bl3 = bl = !LithiumEntityCollisions.doesBoxCollideWithHardEntities((class07309)((Object)this), (class07049)class070492, (class00734)class007342);
        }
        if (bl && class070492 != null) {
            bl = !LithiumEntityCollisions.doesBoxCollideWithWorldBorder((class07322)((Object)this), (class07049)class070492, (class00734)class007342);
        }
        return bl;
    }

    public Optional method_51718(class07049 class070492, class00734 class007342) {
        class07209 class072092 = null;
        double d = Double.MAX_VALUE;
        ChunkAwareBlockCollisionSweeperBlockPos chunkAwareBlockCollisionSweeperBlockPos = new ChunkAwareBlockCollisionSweeperBlockPos(this, class070492, class007342);
        while (chunkAwareBlockCollisionSweeperBlockPos.hasNext()) {
            class07209 class072093 = (class07209)chunkAwareBlockCollisionSweeperBlockPos.next();
            double d2 = class072093.method_19770((class00737)class070492.method_73189());
            if (!(d2 < d) && (d2 != d || class072092 != null && class072092.compareTo((class00753)class072093) >= 0)) continue;
            class072092 = class072093.method_10062();
            d = d2;
        }
        return Optional.ofNullable(class072092);
    }

    public class00500 method_8320(class07209 class072092) {
        class00570 class005702 = this.method_8497(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
        class00554[] class00554Array = class005702.u();
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        int n4 = this.method_31602(n2);
        if (n4 < 0 || n4 >= class00554Array.length || class005702.O()) {
            return OUTSIDE_WORLD_BLOCK;
        }
        class00554 class005542 = class00554Array[n4];
        if (class005542 == null || class005542.L()) {
            return INSIDE_WORLD_DEFAULT_BLOCK;
        }
        return class005542.N(n & 0xF, n2 & 0xF, n3 & 0xF);
    }

    @Override
    public @Nullable class02796 method_8503() {
        return null;
    }

    public abstract class05042 method_74854();

    public boolean method_8520(class07209 class072092) {
        return this.method_70745(class072092) == class00801.field_9382;
    }

    public abstract class00616 method_75728();

    @Override
    public void method_8406(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public class04688 method_8316(class07209 class072092) {
        if (!this.method_76805(class072092)) {
            return class04684.N.M();
        }
        return this.method_8500(class072092).method_8316(class072092);
    }

    public class05946<class07299> method_27983() {
        return this.field_25176;
    }

    public abstract class06683 method_8428();

    private boolean wrapOperation$cbp000$lithium$shouldTickBlockPosFilterNull(class07299 class072992, class07209 class072092, Operation operation) {
        if (class072092 == null) {
            return false;
        }
        return (Boolean)operation.call(new Object[]{class072992, class072092});
    }

    public class07299(class05207 class052072, class05946<class07299> class059462, class01042 class010422, class03556<class07376> class035562, boolean bl, boolean bl2, long l, int n) {
        this.field_27082 = Lists.newArrayList();
        this.field_27081 = Lists.newArrayList();
        this.field_9256 = class06069.u().M();
        this.field_9238 = 1013904223;
        this.field_9229 = class06069.u();
        this.field_38861 = class06069.i();
        this.field_9232 = class052072;
        this.field_36402 = class035562;
        this.field_25176 = class059462;
        this.field_9236 = bl;
        this.field_17086 = Thread.currentThread();
        this.field_20639 = new class05517((class05527)this, l);
        this.field_24496 = bl2;
        this.field_38226 = new class04358(this, n);
        this.field_42475 = class010422;
        this.field_62535 = class06614.N((class01042)class010422);
        this.field_42476 = new class03697(class010422);
        this.handler$cak000$lithium$initLithiumData(class052072, class059462, class010422, class035562, bl, bl2, l, n, null);
        this.handler$cdn000$lithium$initHeightCache(class052072, class059462, class010422, class035562, bl, bl2, l, n, null);
    }

    @Override
    public void close() throws IOException {
        this.method_8398().close();
    }

    private void handler$cak000$lithium$initLithiumData(class05207 class052072, class05946 class059462, class01042 class010422, class03556 class035562, boolean bl, boolean bl2, long l, int n, CallbackInfo callbackInfo) {
        this.storage = new LithiumData.Data((class01929)class010422);
    }

    private void handler$cdn000$lithium$initHeightCache(class05207 class052072, class05946 class059462, class01042 class010422, class03556 class035562, boolean bl, boolean bl2, long l, int n, CallbackInfo callbackInfo) {
        this.height = ((class07376)class035562.N()).Z();
        this.bottomY = ((class07376)class035562.N()).B();
        this.topYInclusive = this.bottomY + this.height - 1;
    }

    public class00394 lithium$getLoadedExistingBlockEntity(class07209 class072092) {
        class08050 class080502;
        if (!this.method_31606(class072092) && (this.field_9236 || Thread.currentThread() == this.field_17086) && (class080502 = this.method_8402(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()), class00549.m, false)) != null) {
            return class080502.method_8321(class072092);
        }
        return null;
    }

    private /* synthetic */ Boolean mixinextras$bridge$redirect$cbm000$lithium$optimizedShouldTick$190(LocalLongRef localLongRef, Object[] objectArray) {
        WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_1937, net.minecraft.class_2338]");
        return this.redirect$cbm000$lithium$optimizedShouldTick((class07299)objectArray[0], (class07209)objectArray[1], localLongRef);
    }

    private void acknowledgeSyncedEntry(AttachmentType attachmentType, @Nullable AttachmentChange attachmentChange) {
        if (attachmentChange == null) {
            if (this.syncedAttachments == null) {
                return;
            }
            this.syncedAttachments.remove(attachmentType);
        } else {
            if (this.syncedAttachments == null) {
                this.syncedAttachments = new IdentityHashMap();
            }
            this.syncedAttachments.put(attachmentType, attachmentChange);
        }
    }

    public Map fabric_getAttachments() {
        return this.dataAttachments;
    }

    public boolean fabric_shouldTryToSync() {
        return !this.method_8608();
    }

    public Set fabric_getLoadedChunks() {
        return this.loadedChunks;
    }

    public void fabric_markUnloaded(class00570 class005702) {
        this.loadedChunks.remove(class005702);
    }

    public /* synthetic */ Thread getThread() {
        return this.field_17086;
    }

    private void acknowledgeSynced(AttachmentType attachmentType, Object object, class01929 class019292) {
        class01042 class010422 = class019292 instanceof class01042 ? (class01042)class019292 : this.fabric_getDynamicRegistryManager();
        this.acknowledgeSyncedEntry(attachmentType, AttachmentChange.create((AttachmentTargetInfo)this.fabric_getSyncTargetInfo(), (AttachmentType)attachmentType, (Object)object, (class01042)class010422));
    }

    public boolean hasAttached(AttachmentType attachmentType) {
        return this.dataAttachments != null && this.dataAttachments.containsKey(attachmentType);
    }

    public Event onAttachedSet(AttachmentType attachmentType2) {
        if (this.attachedChangedListeners == null) {
            this.attachedChangedListeners = new IdentityHashMap();
        }
        return this.attachedChangedListeners.computeIfAbsent(attachmentType2, attachmentType -> EventFactory.createArrayBacked(AttachmentTarget.OnAttachedSet.class, onAttachedSetArray -> (object, object2) -> {
            AttachmentTarget.OnAttachedSet[] onAttachedSetArray2 = onAttachedSetArray;
            int n = onAttachedSetArray2.length;
            for (int i = 0; i < n; ++i) {
                onAttachedSetArray2[i].onAttachedSet(object, object2);
            }
        }));
    }

    public @Nullable Object setAttached(AttachmentType attachmentType, @Nullable Object object) {
        Event event;
        Object object2;
        if (object == null) {
            object2 = this.dataAttachments == null ? null : (Object)this.dataAttachments.remove(attachmentType);
        } else {
            if (this.dataAttachments == null) {
                this.dataAttachments = new IdentityHashMap();
            }
            object2 = this.dataAttachments.put(attachmentType, object);
        }
        if (this.attachedChangedListeners != null && (event = (Event)this.attachedChangedListeners.get(attachmentType)) != null) {
            ((AttachmentTarget.OnAttachedSet)event.invoker()).onAttachedSet(object2, object);
        }
        if (!Objects.equals(object2, object)) {
            this.fabric_markChanged(attachmentType);
            if (this.fabric_shouldTryToSync() && attachmentType.isSynced()) {
                event = AttachmentChange.create((AttachmentTargetInfo)this.fabric_getSyncTargetInfo(), (AttachmentType)attachmentType, (Object)object, (class01042)this.fabric_getDynamicRegistryManager());
                this.acknowledgeSyncedEntry(attachmentType, (AttachmentChange)event);
                this.fabric_syncChange(attachmentType, (AttachmentChange)event);
            }
        }
        return object2;
    }

    public class00570 method_8497(int n, int n2) {
        return (class00570)this.method_8402(n, n2, class00549.m, true);
    }

    public @Nullable Object getAttached(AttachmentType attachmentType) {
        return this.dataAttachments == null ? null : this.dataAttachments.get(attachmentType);
    }

    public void method_8533() {
        this.field_9226 = (int)(15.0f - ((Float)this.method_75728().N(class00608.w)).floatValue());
    }

    protected void method_8543() {
        if (this.field_9232.B()) {
            this.field_9235 = 1.0f;
            if (this.field_9232.R()) {
                this.field_9234 = 1.0f;
            }
        }
    }

    public class03556<class07376> method_40134() {
        return this.field_36402;
    }

    public boolean method_63020() {
        return this.method_8597().i() && !this.method_8597().R() && this.method_27983() != field_25181;
    }

    public abstract class03106 method_54719();

    public void method_18471() {
        LocalLongRefImpl localLongRefImpl = new LocalLongRefImpl();
        localLongRefImpl.init(0L);
        this.field_9249 = true;
        if (!this.field_27081.isEmpty()) {
            this.field_27082.addAll(this.field_27081);
            this.field_27081.clear();
        }
        Iterator<class01099> var1 = this.field_27082.iterator();
        boolean bl = this.method_54719().Z();
        while (var1.hasNext()) {
            class01099 class010992 = var1.next();
            if (class010992.method_31704()) {
                var1.remove();
                continue;
            }
            if (!bl) continue;
            class07209 class072092 = class010992.method_31705();
            class07299 class072992 = this;
            LocalLongRefImpl localLongRefImpl2 = localLongRefImpl;
            if (!this.wrapOperation$cbp000$lithium$shouldTickBlockPosFilterNull(class072992, class072092, arg_0 -> this.mixinextras$bridge$redirect$cbm000$lithium$optimizedShouldTick$190((LocalLongRef)localLongRefImpl2, arg_0))) continue;
            class010992.method_31703();
        }
        this.field_9249 = false;
    }

    public long method_8532() {
        long l = this.field_9232.L();
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, l);
        this.handler$cfl000$nursultan$injectGetTimeOfDay(callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueJ();
        }
        return l;
    }

    public boolean method_39425(long l) {
        return true;
    }

    public final boolean method_27982() {
        return this.field_24496;
    }

    public int method_31604(int n) {
        return n + (this.bottomY >> 4);
    }

    public boolean method_8419() {
        return this.method_63020() && (double)this.method_8430(1.0f) > 0.2;
    }

    public class07209 method_8536(int n, int n2, int n3, int n4) {
        this.field_9256 = this.field_9256 * 3 + 1013904223;
        int n5 = this.field_9256 >> 2;
        return new class07209(n + (n5 & 0xF), n2 + (n5 >> 16 & n4), n3 + (n5 >> 8 & 0xF));
    }

    public boolean method_8546() {
        return this.method_63020() && (double)this.method_8478(1.0f) > 0.9;
    }

    public int method_31600() {
        return this.topYInclusive;
    }

    public void method_8455(class07209 class072092, class00891 class008912) {
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (!this.E(class072093)) continue;
            class00500 class005002 = this.method_8320(class072093);
            if (class005002.N(class00869.Ba)) {
                this.method_41410(class005002, class072093, class008912, null, false);
                continue;
            }
            if (!class005002.u((class07290)((Object)this), class072093) || !(class005002 = this.method_8320(class072093 = class072093.method_10093(class072112))).N(class00869.Ba)) continue;
            this.method_41410(class005002, class072093, class008912, null, false);
        }
    }

    public @Nullable class08050 method_8402(int n, int n2, class00549 class005492, boolean bl) {
        class08050 class080502 = this.method_8398().N(n, n2, class005492, bl);
        if (class080502 == null && bl) {
            throw new IllegalStateException("Should always be able to create a chunk!");
        }
        return class080502;
    }

    public boolean method_8501(class07209 class072092, class00500 class005002) {
        return this.method_8652(class072092, class005002, 3);
    }

    public abstract void method_8465(@Nullable class07049 var1, double var2, double var4, double var6, class03556<class04891> var8, class04911 var9, float var10, float var11, long var12);

    public class07376 method_8597() {
        return (class07376)this.field_36402.N();
    }

    public abstract void method_8517(int var1, class07209 var2, int var3);

    public void method_8508(class07209 class072092, class00891 class008912, class07211 class072112, @Nullable class02733 class027332) {
    }

    public boolean method_8505(class07049 class070492, class07209 class072092) {
        return true;
    }

    public void method_8492(class07209 class072092, class00891 class008912, @Nullable class02733 class027332) {
    }

    public void method_41410(class00500 class005002, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
    }

    public abstract void method_8413(class07209 var1, class00500 var2, class00500 var3, int var4);

    public @Nullable class07049 method_66347(UUID uUID) {
        return (class07049)this.method_31592().N(uUID);
    }

    protected abstract class01124<class07049> method_31592();

    public abstract void method_8449(@Nullable class07049 var1, class07049 var2, class03556<class04891> var3, class04911 var4, float var5, float var6, long var7);

    public void method_8452(class07209 class072092, class00891 class008912, @Nullable class02733 class027332) {
    }

    public abstract void method_8454(@Nullable class07049 var1, @Nullable class07072 var2, @Nullable class01284 var3, double var4, double var6, double var8, float var10, boolean var11, class07328 var12, class07126 var13, class07126 var14, class04540<class00931> var15, class03556<class04891> var16);

    public void method_8474(int n, class07209 class072092, int n2) {
    }

    public void method_8421(class07049 class070492, byte by) {
    }

    public void method_48760(class07049 class070492, class07072 class070722) {
    }

    public abstract Collection<class00695> method_65097();

    public void method_66016(class07209 class072092, class00500 class005002, class00500 class005003) {
    }

    public boolean method_8458() {
        return false;
    }

    public abstract @Nullable class07769 method_17891(class02265 var1);

    public void method_8427(class07209 class072092, class00891 class008912, int n, int n2) {
        this.method_8320(class072092).N(this, class072092, n, n2);
    }

    public @Nullable class08036 method_73285(UUID uUID) {
        return this.N(uUID);
    }

    public abstract @Nullable class07049 method_8469(int var1);

    public @Nullable class07049 method_73284(UUID uUID) {
        return this.method_66347(uUID);
    }

    public boolean method_41411(class07209 class072092) {
        return this.method_39425(class07321.N(class072092));
    }

    public abstract void method_27873(class05042 var1);

    public class07074 method_8538(class07080 class070802) {
        class07074 class070742 = class070802.N("Affected level", 1);
        class070742.N("All players", () -> {
            List var1 = this.method_18456();
            return var1.size() + " total; " + var1.stream().map(class08036::method_68877).collect(Collectors.joining(", "));
        });
        class070742.N("Chunk stats", () -> ((class00558)this.method_8398()).N());
        class070742.N("Level dimension", () -> this.method_27983().N().toString());
        try {
            this.field_9232.N(class070742, (class05474)this);
        }
        catch (Throwable throwable) {
            class070742.N("Level Data Unobtainable", throwable);
        }
        return class070742;
    }

    public abstract String method_31419();

    public LithiumData.Data lithium$getData() {
        return this.storage;
    }

    public abstract class06511 method_59547();

    public abstract class00272 method_8433();

    public /* synthetic */ class00611 method_75598() {
        return this.method_75728();
    }

    public int method_8624(class07830 class078302, int n, int n2) {
        int n3 = n < -30000000 || n2 < -30000000 || n >= 30000000 || n2 >= 30000000 ? this.method_8615() + 1 : (this.N(class01296.N((int)n), class01296.N((int)n2)) ? this.method_8497(class01296.N((int)n), class01296.N((int)n2)).N(class078302, n & 0xF, n2 & 0xF) + 1 : this.method_31607());
        return n3;
    }

    public <T extends class07049> void method_18472(Consumer<T> consumer, T t) {
        try {
            consumer.accept(t);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Ticking entity");
            class07074 class070742 = class070802.N("Entity being ticked");
            t.method_5819(class070742);
            throw new class07878(class070802);
        }
    }

    @Override
    public class05087 method_8401() {
        return this.field_9232;
    }

    public void method_71970(class00394 class003942) {
    }

    public abstract class02755 method_61269();

    public /* synthetic */ class08050 method_8392(int n, int n2) {
        return this.method_8497(n, n2);
    }

    public boolean method_31606(class07209 class072092) {
        int n = class072092.method_10264();
        return n < this.bottomY || n > this.topYInclusive;
    }

    private static boolean method_76804(class07209 class072092) {
        int n = class01296.N((int)class072092.method_10263());
        int n2 = class01296.N((int)class072092.method_10260());
        return class07321.L(n, n2);
    }

    public boolean method_24794(class07209 class072092) {
        return !this.method_31606(class072092) && class07299.method_8558(class072092);
    }

    public boolean method_8652(class07209 class072092, class00500 class005002, int n) {
        return this.method_30092(class072092, class005002, n, 512);
    }

    public static boolean method_25953(class07209 class072092) {
        return !class07299.method_25952(class072092.method_10264()) && class07299.method_8558(class072092);
    }

    private static boolean method_8558(class07209 class072092) {
        return class072092.method_10263() >= -30000000 && class072092.method_10260() >= -30000000 && class072092.method_10263() < 30000000 && class072092.method_10260() < 30000000;
    }

    public boolean method_30092(class07209 class072092, class00500 class005002, int n, int n2) {
        if (!this.method_76805(class072092)) {
            return false;
        }
        if (!this.method_8608() && this.method_27982()) {
            return false;
        }
        class00570 class005702 = this.method_8500(class072092);
        class00891 class008912 = class005002.i();
        class00500 class005003 = class005702.N(class072092, class005002, n);
        if (class005003 != null) {
            class00500 class005004 = this.method_8320(class072092);
            if (class005004 == class005002) {
                if (class005003 != class005004) {
                    this.method_16109(class072092, class005003, class005004);
                }
                if ((n & 2) != 0 && (!this.method_8608() || (n & 4) == 0) && (this.method_8608() || class005702.g() != null && class005702.g().N(class04763.field_44856))) {
                    this.method_8413(class072092, class005003, class005002, n);
                }
                if ((n & 1) != 0) {
                    this.method_8408(class072092, class005003.i());
                    if (!this.method_8608() && class005002.v()) {
                        this.method_8455(class072092, class008912);
                    }
                }
                if ((n & 0x10) == 0 && n2 > 0) {
                    int n3 = n & 0xFFFFFFDE;
                    class005003.y((class07284)this, class072092, n3, n2 - 1);
                    class005002.N((class07284)this, class072092, n3, n2 - 1);
                    class005002.y((class07284)this, class072092, n3, n2 - 1);
                }
                this.handler$ceb000$lithium$updateHopperOnUpdateSuppression(class072092, class005002, n, n2, null, class005702, class008912, class005003, class005004);
                this.method_66016(class072092, class005003, class005004);
            }
            return true;
        }
        return false;
    }

    public boolean method_8650(class07209 class072092, boolean bl) {
        class04688 class046882 = this.method_8316(class072092);
        return this.method_8652(class072092, class046882.B(), 3 | (bl ? 64 : 0));
    }

    public void method_16109(class07209 class072092, class00500 class005002, class00500 class005003) {
    }

    private static boolean method_25952(int n) {
        return n < -20000000 || n >= 20000000;
    }

    public boolean method_76805(class07209 class072092) {
        return !this.method_31606(class072092) && class07299.method_76804(class072092);
    }

    public float method_8430(float f) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$cfl000$nursultan$injectGetRainGradient(f, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueF();
        }
        return class04995.B((float)f, (float)this.field_9253, (float)this.field_9235);
    }

    public void method_8496(float f) {
        float f2;
        this.field_9251 = f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        this.field_9234 = f2;
    }

    public boolean method_23886() {
        return !this.method_8597().u() && !this.method_8530();
    }

    public void method_67392(class04891 class048912, class04911 class049112, float f, float f2) {
    }

    public List<class07049> method_8333(@Nullable class07049 class070492, class00734 class007342, Predicate<? super class07049> predicate) {
        class08700.N().R("getEntities");
        ArrayList arrayList = Lists.newArrayList();
        this.method_31592().N(class007342, class070493 -> {
            if (class070493 != class070492 && predicate.test((class07049)class070493)) {
                arrayList.add(class070493);
            }
        });
        for (class00695 class006952 : this.method_65097()) {
            if (class006952 == class070492 || class006952.N == class070492 || !predicate.test((class07049)class006952) || !class007342.L(class006952.method_5829())) continue;
            arrayList.add(class006952);
        }
        return arrayList;
    }

    public void method_8437(@Nullable class07049 class070492, double d, double d2, double d3, float f, class07328 class073282) {
        this.method_8454(class070492, class07307.N(this, class070492), null, d, d2, d3, f, false, class073282, (class07126)class07107.l, (class07126)class07107.G, field_61989, (class03556<class04891>)class04909.EA);
    }

    public boolean method_30093(class07209 class072092, boolean bl, @Nullable class07049 class070492, int n) {
        boolean bl2;
        class00500 class005002 = this.method_8320(class072092);
        if (class005002.P()) {
            return false;
        }
        class04688 class046882 = this.method_8316(class072092);
        if (!(class005002.i() instanceof class05989)) {
            this.N(2001, class072092, class00891.W((class00500)class005002));
        }
        if (bl) {
            class00394 class003942 = class005002.k() ? this.method_8321(class072092) : null;
            class00891.N((class00500)class005002, (class07299)this, (class07209)class072092, (class00394)class003942, (class07049)class070492, (class06584)class06584.E);
        }
        if (bl2 = this.method_30092(class072092, class046882.B(), 3, n)) {
            this.N((class03556)class01194.R, class072092, class01164.N((class07049)class070492, (class00500)class005002));
        }
        return bl2;
    }

    public void method_43129(@Nullable class07049 class070492, class07049 class070493, class04891 class048912, class04911 class049112, float f, float f2) {
        this.method_8449(class070492, class070493, (class03556<class04891>)class04206.y.i((Object)class048912), class049112, f, f2, this.field_38861.B());
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        if (!this.method_76805(class072092)) {
            return null;
        }
        if (!this.method_8608() && Thread.currentThread() != this.field_17086) {
            return null;
        }
        return this.method_8500(class072092).N(class072092, class00531.field_12860);
    }

    public void method_47967(@Nullable class07049 class070492, double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2, long l) {
        this.method_8465(class070492, d, d2, d3, (class03556<class04891>)class04206.y.i((Object)class048912), class049112, f, f2, l);
    }

    public void method_8486(double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2, boolean bl) {
    }

    public void method_55116(class07049 class070492, class04891 class048912, class04911 class049112, float f, float f2) {
    }

    public void method_31595(class07209 class072092, class00500 class005002) {
    }

    public boolean method_38989(class07049 class070492) {
        return true;
    }

    public void method_55117(@Nullable class07049 class070492, @Nullable class07072 class070722, @Nullable class01284 class012842, double d, double d2, double d3, float f, boolean bl, class07328 class073282) {
        this.method_8454(class070492, class070722, class012842, d, d2, d3, f, bl, class073282, (class07126)class07107.l, (class07126)class07107.G, field_61989, (class03556<class04891>)class04909.EA);
    }

    public <T extends class07049> void method_47575(class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate, List<? super T> list, int n) {
        class08700.N().R("getEntities");
        this.method_31592().N(class011282, class007342, class070492 -> {
            if (predicate.test(class070492)) {
                list.add((Object)class070492);
                if (list.size() >= n) {
                    return class04218.field_41284;
                }
            }
            if (class070492 instanceof class00690) {
                for (class00695 class006952 : ((class00690)class070492).E()) {
                    class07049 class070493 = (class07049)class011282.N((Object)class006952);
                    if (class070493 == null || !predicate.test(class070493)) continue;
                    list.add((Object)class070493);
                    if (list.size() < n) continue;
                    return class04218.field_41284;
                }
            }
            return class04218.field_41283;
        });
    }

    public void method_8544(class07209 class072092) {
        if (!this.method_76805(class072092)) {
            return;
        }
        this.method_8500(class072092).N(class072092);
    }

    public void method_46407(@Nullable class07049 class070492, @Nullable class07072 class070722, @Nullable class01284 class012842, class06889 class068892, float f, boolean bl, class07328 class073282) {
        this.method_8454(class070492, class070722, class012842, class068892.N(), class068892.y(), class068892.L(), f, bl, class073282, (class07126)class07107.l, (class07126)class07107.G, field_61989, (class03556<class04891>)class04909.EA);
    }

    public List<class07049> method_66349(class07049 class070492, class00734 class007342) {
        Predicate var6 = class07042.N((class07049)class070492);
        class00734 class007343 = class007342;
        class07049 class070493 = class070492;
        class07299 class072992 = this;
        return this.redirect$boe001$lithium$getOtherPushableEntities(class072992, class070493, class007343, var6);
    }

    public void method_8466(class07126 class071262, boolean bl, boolean bl2, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public boolean method_8530() {
        return !this.method_8597().u() && this.field_9226 < 4;
    }

    public void method_54762(@Nullable class07049 class070492, double d, double d2, double d3, class04891 class048912, class04911 class049112) {
        this.method_43128(class070492, d, d2, d3, class048912, class049112, 1.0f, 1.0f);
    }

    @Override
    public void method_8396(@Nullable class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112, float f, float f2) {
        this.method_43128(class070492, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class048912, class049112, f, f2);
    }

    public void method_17452(class07126 class071262, boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public <T extends class07049> List<T> method_18023(class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate) {
        ArrayList arrayList = Lists.newArrayList();
        this.method_47574(class011282, class007342, predicate, arrayList);
        return arrayList;
    }

    @Override
    public void method_42308(class07211 class072112, class07209 class072092, class07209 class072093, class00500 class005002, int n, int n2) {
        this.field_38226.N(class072112, class005002, class072092, class072093, n, n2);
    }

    public <T extends class07049> void method_47574(class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate, List<? super T> list) {
        this.method_47575(class011282, class007342, predicate, list, Integer.MAX_VALUE);
    }

    public class05042 method_74891(class05042 class050422) {
        class08057 class080572 = this.method_8621();
        if (!class080572.N(class050422.y())) {
            class07209 class072092 = this.N(class07830.field_13197, class07209.method_49637((double)class080572.M(), (double)0.0, (double)class080572.B()));
            return class05042.N((class05946)class050422.N(), (class07209)class072092, (float)class050422.u(), (float)class050422.i());
        }
        return class050422;
    }

    public <T extends class07049> boolean method_74143(class01128<class07049, T> class011282, class00734 class007342, Predicate<? super T> predicate) {
        class08700.N().R("hasEntities");
        MutableBoolean mutableBoolean = new MutableBoolean();
        this.method_31592().N(class011282, class007342, class070492 -> {
            if (predicate.test(class070492)) {
                mutableBoolean.setTrue();
                return class04218.field_41284;
            }
            if (class070492 instanceof class00690) {
                for (class00695 class006952 : ((class00690)class070492).E()) {
                    class07049 class070493 = (class07049)class011282.N((Object)class006952);
                    if (class070493 == null || !predicate.test(class070493)) continue;
                    mutableBoolean.setTrue();
                    return class04218.field_41284;
                }
            }
            return class04218.field_41283;
        });
        return mutableBoolean.isTrue();
    }

    public void method_8524(class07209 class072092) {
        if (this.E(class072092)) {
            this.method_8500(class072092).Z();
        }
    }

    public float method_8478(float f) {
        return class04995.B((float)f, (float)this.field_9251, (float)this.field_9234) * this.method_8430(f);
    }

    public void method_8494(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6) {
    }

    public void method_45446(class07209 class072092, class04891 class048912, class04911 class049112, float f, float f2, boolean bl) {
        this.method_8486((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class048912, class049112, f, f2, bl);
    }

    public void method_31594(class01099 class010992) {
        (this.field_9249 ? this.field_27081 : this.field_27082).add(class010992);
    }

    public void method_8537(@Nullable class07049 class070492, double d, double d2, double d3, float f, boolean bl, class07328 class073282) {
        this.method_8454(class070492, class07307.N(this, class070492), null, d, d2, d3, f, bl, class073282, (class07126)class07107.l, (class07126)class07107.G, field_61989, (class03556<class04891>)class04909.EA);
    }

    public void method_60511(@Nullable class07049 class070492, double d, double d2, double d3, class03556<class04891> class035562, class04911 class049112, float f, float f2) {
        this.method_8465(class070492, d, d2, d3, class035562, class049112, f, f2, this.field_38861.B());
    }

    public boolean method_24368(class07209 class072092, class07049 class070492, class07211 class072112) {
        if (!this.method_76805(class072092)) {
            return false;
        }
        class08050 class080502 = this.method_8402(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()), class00549.m, false);
        if (class080502 == null) {
            return false;
        }
        return class080502.method_8320(class072092).N((class07290)((Object)this), class072092, class070492, class072112);
    }

    public void method_8438(class00394 class003942) {
        class07209 class072092 = class003942.d();
        if (!this.method_76805(class072092)) {
            return;
        }
        this.method_8500(class072092).y(class003942);
    }

    public boolean method_8515(class07209 class072092, class07049 class070492) {
        return this.method_24368(class072092, class070492, class07211.field_11036);
    }

    public void method_8424(boolean bl) {
        this.method_8398().N(bl);
    }

    public boolean method_8477(class07209 class072092) {
        if (!this.method_76805(class072092)) {
            return false;
        }
        return this.method_8398().L(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()));
    }

    public class05795 method_22336() {
        return this.method_8398().L();
    }

    public int method_32891() {
        return this.bottomY >> 4;
    }

    public int method_32890() {
        return (this.topYInclusive >> 4) + 1 - (this.bottomY >> 4);
    }

    @Override
    public long method_39224() {
        return this.field_35455++;
    }

    public int method_31597() {
        return this.topYInclusive >> 4;
    }

    public class06614 method_74142() {
        return this.field_62535;
    }

    public class08050 method_8500(class07209 class072092) {
        return this.method_8402(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10260()), class00549.m, true);
    }

    public boolean method_31601(int n) {
        return n < this.bottomY || n > this.topYInclusive;
    }

    public int method_31603(int n) {
        return n - (this.bottomY >> 4);
    }

    public void fabric_markLoaded(class00570 class005702) {
        this.loadedChunks.add(class005702);
    }

    public void method_8547(double d, double d2, double d3, double d4, double d5, double d6, List<class02827> list) {
    }

    public class05517 method_22385() {
        return this.field_20639;
    }

    public class00801 method_70745(class07209 class072092) {
        if (!this.method_8419()) {
            return class00801.field_9384;
        }
        if (!this.N_17(class072092)) {
            return class00801.field_9384;
        }
        if (this.N(class07830.field_13197, class072092).method_10264() > class072092.method_10264()) {
            return class00801.field_9384;
        }
        return ((class00780)this.i(class072092).N()).N(class072092, this.method_8615());
    }

    public boolean method_35237(class07209 class072092, Predicate<class04688> predicate) {
        return predicate.test(this.method_8316(class072092));
    }

    public void method_8509(int n) {
    }

    public int method_67233(class07209 class072092) {
        return 0;
    }

    public void method_8519(float f) {
        float f2;
        this.field_9253 = f2 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        this.field_9235 = f2;
    }

    public class08050 method_22342(int n, int n2, class00549 class005492) {
        return this.method_8402(n, n2, class005492, true);
    }

    public class07290 method_22338(int n, int n2) {
        return this.method_8402(n, n2, class00549.m, false);
    }

    public int method_8594() {
        return this.field_9226;
    }

    public int method_31605() {
        return this.height;
    }

    @Override
    public class06069 method_8409() {
        return this.field_9229;
    }

    public boolean method_16358(class07209 class072092, Predicate<class00500> predicate) {
        return predicate.test(this.method_8320(class072092));
    }

    public void method_8522(class00381<?> class003812) {
        throw new UnsupportedOperationException("Can't send packets to server unless you're on the client.");
    }

    public int method_31602(int n) {
        return (n >> 4) - (this.bottomY >> 4);
    }

    private void handler$cfl000$nursultan$injectGetTimeOfDay(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.field_9236) {
            class09349 class093492 = class09349.y((long)callbackInfoReturnable.getReturnValueJ());
            class11938.L().L((Object)class093492);
            callbackInfoReturnable.setReturnValue((Object)class093492.N());
        }
    }

    private boolean redirect$cbm000$lithium$optimizedShouldTick(class07299 class072992, class07209 class072092, LocalLongRef localLongRef) {
        if (class072092 == null) {
            return false;
        }
        long l = class07321.N(class072092);
        if (l == localLongRef.get()) {
            return true;
        }
        boolean bl = class072992.method_39425(l);
        if (bl) {
            localLongRef.set(l);
        }
        return bl;
    }

    private void handler$cfl000$nursultan$injectGetRainGradient(float f, CallbackInfoReturnable callbackInfoReturnable) {
        if (this.field_9236) {
            class09323 class093232 = class09323.L();
            class11938.L().L((Object)class093232);
            if (class093232.y()) {
                callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
            }
        }
    }

    private List redirect$boe001$lithium$getOtherPushableEntities(class07299 class072992, class07049 class070492, class00734 class007342, Predicate predicate) {
        if (predicate == Predicates.alwaysFalse()) {
            return Collections.emptyList();
        }
        if (predicate instanceof EntityPushablePredicate) {
            EntityPushablePredicate entityPushablePredicate = (EntityPushablePredicate)predicate;
            class01129 var6 = WorldHelper.getEntityCacheOrNull((class07299)class072992);
            if (var6 != null) {
                return WorldHelper.getPushableEntities((class07299)class072992, (class01129)var6, (class07049)class070492, (class00734)class007342, (EntityPushablePredicate)entityPushablePredicate);
            }
        }
        return class072992.method_8333(class070492, class007342, predicate);
    }

    public boolean fabric_hasPersistentAttachments() {
        return AttachmentSerializingImpl.hasPersistentAttachments((IdentityHashMap)this.dataAttachments);
    }

    public class01042 fabric_getDynamicRegistryManager() {
        return this.method_30349();
    }

    public void fabric_writeAttachmentsToNbt(class08329 class083292) {
        AttachmentSerializingImpl.serializeAttachmentData((class08329)class083292, (IdentityHashMap)this.dataAttachments);
    }

    public void fabric_readAttachmentsFromNbt(class08299 class082992) {
        IdentityHashMap var2 = AttachmentSerializingImpl.deserializeAttachmentData((class08299)class082992);
        if (var2 == null) {
            return;
        }
        this.dataAttachments = var2;
        if (this.fabric_shouldTryToSync() && this.dataAttachments != null) {
            this.dataAttachments.forEach((attachmentType, object) -> {
                if (attachmentType.isSynced()) {
                    this.acknowledgeSynced((AttachmentType)attachmentType, object, class082992.N());
                }
            });
        }
    }

    public void fabric_computeInitialSyncChanges(class04770 class047702, Consumer consumer) {
        if (this.syncedAttachments == null) {
            return;
        }
        for (Map.Entry entry : this.syncedAttachments.entrySet()) {
            if (!((AttachmentTypeImpl)entry.getKey()).syncPredicate().test((Object)this, (Object)class047702)) continue;
            consumer.accept((AttachmentChange)entry.getValue());
        }
    }

    public void lithium$getRandomPosInChunk(int n, int n2, int n3, int n4, class07218 class072182) {
        this.field_9256 = this.field_9256 * 3 + 1013904223;
        int n5 = this.field_9256 >> 2;
        class072182.N(n + (n5 & 0xF), n2 + (n5 >> 16 & n4), n3 + (n5 >> 8 & 0xF));
    }
}


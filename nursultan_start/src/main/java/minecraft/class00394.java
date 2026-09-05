/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09358
 *  Nursultan.class09361
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  minecraft.class00381
 *  minecraft.class01042
 *  minecraft.class01296
 *  minecraft.class01929
 *  minecraft.class02477
 *  minecraft.class02484
 *  minecraft.class02509
 *  minecraft.class02666
 *  minecraft.class02676
 *  minecraft.class02678
 *  minecraft.class02695
 *  minecraft.class03748
 *  minecraft.class04206
 *  minecraft.class04489
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05474
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06704
 *  minecraft.class06960
 *  minecraft.class06990
 *  minecraft.class07001
 *  minecraft.class07074
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class08299
 *  minecraft.class08303
 *  minecraft.class08308
 *  minecraft.class08329
 *  net.caffeinemc.mods.lithium.common.block.entity.SetBlockStateHandlingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker
 *  net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracking
 *  net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget$OnAttachedSet
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.api.blockview.v2.RenderDataBlockEntity
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.networking.v1.PlayerLookup
 *  net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentSync
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$BlockEntityTarget
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09358;
import Nursultan.class09361;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class01042;
import minecraft.class01296;
import minecraft.class01929;
import minecraft.class02477;
import minecraft.class02484;
import minecraft.class02509;
import minecraft.class02666;
import minecraft.class02676;
import minecraft.class02678;
import minecraft.class02695;
import minecraft.class03748;
import minecraft.class04206;
import minecraft.class04489;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05474;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06704;
import minecraft.class06960;
import minecraft.class06990;
import minecraft.class07001;
import minecraft.class07074;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class08299;
import minecraft.class08303;
import minecraft.class08308;
import minecraft.class08329;
import net.caffeinemc.mods.lithium.common.block.entity.SetBlockStateHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.SetChangedHandlingBlockEntity;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracking;
import net.caffeinemc.mods.lithium.common.world.blockentity.SupportCache;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.blockview.v2.RenderDataBlockEntity;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class00394
implements class06960,
SetBlockStateHandlingBlockEntity,
SetChangedHandlingBlockEntity,
ComparatorTracker,
SupportCache,
RenderDataBlockEntity,
AttachmentTargetImpl {
    private static final Codec<class00404<?>> N = class04206.U.T();
    private static final Logger y = LogUtils.getLogger();
    private final class00404<?> u;
    protected @Nullable class07299 z;
    public final class07209 U;
    protected boolean E;
    private class00500 i;
    private class02695 R = class02695.N;
    private @Nullable IdentityHashMap M = null;
    private @Nullable IdentityHashMap B = null;
    private @Nullable IdentityHashMap Z = null;
    private boolean m;
    private static final byte P = -1;
    private static final byte s = 1;
    private static final byte T = 0;
    byte W;

    public class00500 w() {
        return this.i;
    }

    public final class07001 L(class01929 class019292) {
        try (class04495 class044952 = new class04495(this.J(), y);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class019292);
            this.i((class08329)class083032);
            class07001 class070012 = class083032.y();
            return class070012;
        }
    }

    public final void L(class08299 class082992) {
        this.N(class082992);
    }

    public void L(class08329 class083292) {
        this.i(class083292);
        this.M(class083292);
    }

    @Deprecated
    public void L(class00500 class005002) {
        this.N(class005002);
        this.i = class005002;
        this.N(class005002, null);
        this.u((CallbackInfo)null);
    }

    private void L(CallbackInfo callbackInfo) {
        this.lithium$handleSetChanged();
    }

    public final void M(class08329 class083292) {
        this.B(class083292);
        class083292.N("x", this.U.method_10263());
        class083292.N("y", this.U.method_10264());
        class083292.N("z", this.U.method_10260());
    }

    public String Q() {
        return String.valueOf(class04206.U.y(this.O())) + " // " + this.getClass().getCanonicalName();
    }

    public class00394(class00404<?> class004042, class07209 class072092, class00500 class005002) {
        this.u = class004042;
        this.U = class072092.method_10062();
        this.N(class005002);
        this.i = class005002;
        this.N(class004042, class072092, class005002, null);
        this.y(class004042, class072092, class005002, null);
    }

    private void B(class08329 class083292) {
        class00394.N(class083292, this.O());
    }

    public class02695 I() {
        return this.R;
    }

    public class04489 J() {
        return new class09361(this);
    }

    public @Nullable class00381<class07280> i() {
        return null;
    }

    public void i(class08329 class083292) {
        this.N(class083292);
        class083292.N("components", class02695.y, (Object)this.R);
        this.N(class083292, null);
    }

    public boolean l() {
        return this.z != null;
    }

    public class07209 d() {
        return this.U;
    }

    public boolean k() {
        return this.E;
    }

    public final class02695 g() {
        class02676 class026762 = class02695.N();
        class026762.N(this.R);
        this.N(class026762);
        return class026762.N();
    }

    private void u(CallbackInfo callbackInfo) {
        this.lithium$handleSetBlockState();
    }

    public final class07001 u(class01929 class019292) {
        try (class04495 class044952 = new class04495(this.J(), y);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class019292);
            this.R((class08329)class083032);
            class07001 class070012 = class083032.y();
            return class070012;
        }
    }

    public void u(class08329 class083292) {
        this.i(class083292);
        this.B(class083292);
    }

    public final void y(class06584 class065842) {
        this.N(class065842.L(), class065842.u());
    }

    public boolean y(class00500 class005002) {
        return this.u.method_20526(class005002);
    }

    public final void y_1(class08299 class082992) {
        this.N(class082992);
        this.R = class082992.N("components", class02695.y).orElse(class02695.N);
        this.N(class082992, null);
    }

    public final class07001 y_2(class01929 class019292) {
        try (class04495 class044952 = new class04495(this.J(), y);){
            class08303 class083032 = class08303.N((class04490)class044952, (class01929)class019292);
            this.L((class08329)class083032);
            class07001 class070012 = class083032.y();
            return class070012;
        }
    }

    @Deprecated
    public void y(class08329 class083292) {
    }

    private void y(class00404 class004042, class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        this.W = (byte)-1;
    }

    private void y(CallbackInfo callbackInfo) {
        this.W = (byte)-1;
    }

    private void N(AttachmentType attachmentType, @Nullable AttachmentChange attachmentChange) {
        if (attachmentChange == null) {
            if (this.B == null) {
                return;
            }
            this.B.remove(attachmentType);
        } else {
            if (this.B == null) {
                this.B = new IdentityHashMap();
            }
            this.B.put(attachmentType, attachmentChange);
        }
    }

    public static @Nullable class00392 N_10(class08299 class082992, String string) {
        return class082992.N(string, class03748.N).orElse(null);
    }

    public static class07209 N(class07321 class073212, class07001 class070012) {
        int n = class070012.y("x", 0);
        int n2 = class070012.y("y", 0);
        int n3 = class070012.y("z", 0);
        int n4 = class01296.N((int)n);
        int n5 = class01296.N((int)n3);
        if (n4 != class073212.B || n5 != class073212.Z) {
            y.warn("Block entity {} found in a wrong chunk, expected position from chunk {}", (Object)class070012, (Object)class073212);
            n = class073212.N(class01296.y((int)n));
            n3 = class073212.y(class01296.y((int)n3));
        }
        return new class07209(n, n2, n3);
    }

    public static @Nullable class00394 N(class07209 class072092, class00500 class005002, class07001 class070012, class01929 class019292) {
        Object t;
        Object t2;
        class00404 var4 = class070012.N_15("id", N).orElse(null);
        if (var4 == null) {
            y.error("Skipping block entity with invalid type: {}", (Object)class070012.N("id"));
            return null;
        }
        try {
            t2 = var4.method_11032(class072092, class005002);
        }
        catch (Throwable throwable) {
            y.error("Failed to create block entity {} for block {} at position {} ", new Object[]{var4, class072092, class005002, throwable});
            return null;
        }
        class04495 class044952 = new class04495(((class00394)t2).J(), y);
        try {
            ((class00394)t2).y_1(class08308.N((class04490)class044952, (class01929)class019292, (class07001)class070012));
            t = t2;
        }
        catch (Throwable throwable) {
            try {
                try {
                    class044952.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Throwable throwable3) {
                y.error("Failed to load data for block entity {} for block {} at position {}", new Object[]{var4, class072092, class005002, throwable3});
                return null;
            }
        }
        class044952.close();
        return t;
    }

    private void N(AttachmentType attachmentType, Object object, class01929 class019292) {
        class01042 class010422 = class019292 instanceof class01042 ? (class01042)class019292 : this.fabric_getDynamicRegistryManager();
        this.N(attachmentType, AttachmentChange.create((AttachmentTargetInfo)this.fabric_getSyncTargetInfo(), (AttachmentType)attachmentType, (Object)object, (class01042)class010422));
    }

    private void N(class00404 class004042, class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        this.m = this.O().method_20526(class005002);
    }

    private void N(class00500 class005002, CallbackInfo callbackInfo) {
        this.m = this.O().method_20526(class005002);
    }

    private void N(CallbackInfo callbackInfo) {
        class00394 var3;
        if (this.z != null && !this.z.method_8608() && (var3 = this) instanceof InventoryChangeTracker) {
            ((InventoryChangeTracker)var3).lithium$emitRemoved();
        }
    }

    private void N(class00500 class005002) {
        if (!this.y(class005002)) {
            throw new IllegalStateException("Invalid block entity " + this.Q() + " state at " + String.valueOf(this.U) + ", got " + String.valueOf((Object)class005002));
        }
    }

    private void N(class08299 class082992, CallbackInfo callbackInfo) {
        this.fabric_readAttachmentsFromNbt(class082992);
    }

    private void N(class08329 class083292, CallbackInfo callbackInfo) {
        this.fabric_writeAttachmentsToNbt(class083292);
    }

    protected void N(class02676 class026762) {
    }

    public void N(class07209 class072092, class00500 class005002) {
        class00394 var4 = this;
        if (var4 instanceof class06695) {
            class06695 class066952 = (class06695)var4;
            if (this.z != null) {
                class06704.N((class07299)this.z, (class07209)class072092, (class06695)class066952);
            }
        }
    }

    public class07001 N(class01929 class019292) {
        return new class07001();
    }

    public static void N(class08329 class083292, class00404<?> class004042) {
        class083292.N("id", N, class004042);
    }

    public void N(class08329 class083292) {
    }

    protected void N_9(class02666 class026662) {
    }

    public boolean N(int n, int n2) {
        return false;
    }

    public final void N(class02695 class026952, class02678 class026782) {
        HashSet<class02477> hashSet = new HashSet<class02477>();
        hashSet.add(class02484.NB);
        hashSet.add(class02484.Nl);
        class02509 class025092 = class02509.N((class02695)class026952, (class02678)class026782);
        this.N_9((class02666)new class09358(this, hashSet, (class02695)class025092));
        class02678 class026783 = class026782.N(hashSet::contains);
        this.R = class026783.i().N();
    }

    public void N(class02695 class026952) {
        this.R = class026952;
    }

    public void N(class07074 class070742) {
        class070742.N("Name", this::Q);
        class070742.N("Cached block", () -> ((class00500)this.w()).toString());
        if (this.z == null) {
            class070742.N("Block location", () -> String.valueOf(this.U) + " (world missing)");
        } else {
            class070742.N("Actual block", () -> ((class00500)this.z.method_8320(this.U)).toString());
            class07074.N((class07074)class070742, (class05474)this.z, (class07209)this.U);
        }
    }

    protected static void N(class07299 class072992, class07209 class072092, class00500 class005002) {
        class072992.method_8524(class072092);
        if (!class005002.P()) {
            class072992.method_8455(class072092, class005002.i());
        }
    }

    public void N(class08299 class082992) {
    }

    public void N(class07299 class072992) {
        this.z = class072992;
    }

    public void r_() {
        this.y((CallbackInfo)null);
        this.E = true;
        this.N((CallbackInfo)null);
    }

    public void method_5431() {
        if (this.z != null) {
            class00394.N(this.z, this.U, this.i);
        }
        this.L((CallbackInfo)null);
    }

    public boolean lithium$hasAnyComparatorNearby() {
        if (this.W == -1) {
            this.W = ComparatorTracking.findNearbyComparators((class07299)this.z, (class07209)this.U) ? (byte)1 : 0;
        }
        return this.W == 1;
    }

    public void R(class08329 class083292) {
        this.N(class083292);
    }

    public class00404<?> O() {
        return this.u;
    }

    public @Nullable class07299 G() {
        return this.z;
    }

    public void Y() {
        this.E = false;
    }

    public AttachmentTargetInfo fabric_getSyncTargetInfo() {
        return new AttachmentTargetInfo.BlockEntityTarget(this.U);
    }

    public Map fabric_getAttachments() {
        return this.M;
    }

    public boolean fabric_shouldTryToSync() {
        return !this.l() || !this.z.method_8608();
    }

    public void fabric_markChanged(AttachmentType attachmentType) {
        this.method_5431();
    }

    public void method_74589(class04782 class047822, class06990 class069902) {
    }

    public boolean hasAttached(AttachmentType attachmentType) {
        return this.M != null && this.M.containsKey(attachmentType);
    }

    public Event onAttachedSet(AttachmentType attachmentType2) {
        if (this.Z == null) {
            this.Z = new IdentityHashMap();
        }
        return this.Z.computeIfAbsent(attachmentType2, attachmentType -> EventFactory.createArrayBacked(AttachmentTarget.OnAttachedSet.class, onAttachedSetArray -> (object, object2) -> {
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
            object2 = this.M == null ? null : (Object)this.M.remove(attachmentType);
        } else {
            if (this.M == null) {
                this.M = new IdentityHashMap();
            }
            object2 = this.M.put(attachmentType, object);
        }
        if (this.Z != null && (event = (Event)this.Z.get(attachmentType)) != null) {
            ((AttachmentTarget.OnAttachedSet)event.invoker()).onAttachedSet(object2, object);
        }
        if (!Objects.equals(object2, object)) {
            this.fabric_markChanged(attachmentType);
            if (this.fabric_shouldTryToSync() && attachmentType.isSynced()) {
                event = AttachmentChange.create((AttachmentTargetInfo)this.fabric_getSyncTargetInfo(), (AttachmentType)attachmentType, (Object)object, (class01042)this.fabric_getDynamicRegistryManager());
                this.N(attachmentType, (AttachmentChange)event);
                this.fabric_syncChange(attachmentType, (AttachmentChange)event);
            }
        }
        return object2;
    }

    public void fabric_syncChange(AttachmentType attachmentType, AttachmentChange attachmentChange) {
        PlayerLookup.tracking((class00394)this).forEach(class047702 -> {
            if (((AttachmentTypeImpl)attachmentType).syncPredicate().test((Object)this, class047702)) {
                AttachmentSync.trySync((AttachmentChange)attachmentChange, (class04770)class047702);
            }
        });
    }

    public @Nullable Object getAttached(AttachmentType attachmentType) {
        return this.M == null ? null : this.M.get(attachmentType);
    }

    public boolean fabric_hasPersistentAttachments() {
        return AttachmentSerializingImpl.hasPersistentAttachments((IdentityHashMap)this.M);
    }

    public class01042 fabric_getDynamicRegistryManager() {
        return this.z.method_30349();
    }

    public void fabric_writeAttachmentsToNbt(class08329 class083292) {
        AttachmentSerializingImpl.serializeAttachmentData((class08329)class083292, (IdentityHashMap)this.M);
    }

    public void fabric_readAttachmentsFromNbt(class08299 class082992) {
        IdentityHashMap var2 = AttachmentSerializingImpl.deserializeAttachmentData((class08299)class082992);
        if (var2 == null) {
            return;
        }
        this.M = var2;
        if (this.fabric_shouldTryToSync() && this.M != null) {
            this.M.forEach((attachmentType, object) -> {
                if (attachmentType.isSynced()) {
                    this.N((AttachmentType)attachmentType, object, class082992.N());
                }
            });
        }
    }

    public void fabric_computeInitialSyncChanges(class04770 class047702, Consumer consumer) {
        if (this.B == null) {
            return;
        }
        for (Map.Entry entry : this.B.entrySet()) {
            if (!((AttachmentTypeImpl)entry.getKey()).syncPredicate().test((Object)this, (Object)class047702)) continue;
            consumer.accept((AttachmentChange)entry.getValue());
        }
    }

    public boolean lithium$isSupported() {
        return this.m;
    }

    public void lithium$onComparatorAdded(class07211 class072112, int n) {
        byte by = this.W;
        if (class072112.z() != class07185.field_11052 && by != 1 && n >= 1 && n <= 2) {
            this.W = 1;
            class00394 var5 = this;
            if (var5 instanceof InventoryChangeTracker) {
                ((InventoryChangeTracker)var5).lithium$emitFirstComparatorAdded();
            }
        }
    }
}


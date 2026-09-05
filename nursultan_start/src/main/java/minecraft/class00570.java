/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09372
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  it.unimi.dsi.fastutil.shorts.ShortListIterator
 *  minecraft.class00394
 *  minecraft.class00426
 *  minecraft.class00429
 *  minecraft.class00431
 *  minecraft.class00500
 *  minecraft.class00667
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01042
 *  minecraft.class01099
 *  minecraft.class01118
 *  minecraft.class01145
 *  minecraft.class01166
 *  minecraft.class01187
 *  minecraft.class01296
 *  minecraft.class01806
 *  minecraft.class01929
 *  minecraft.class03032
 *  minecraft.class03448
 *  minecraft.class04310
 *  minecraft.class04327
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04643
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04763
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04890
 *  minecraft.class04932
 *  minecraft.class05015
 *  minecraft.class05163
 *  minecraft.class05474
 *  minecraft.class06960
 *  minecraft.class06990
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07074
 *  minecraft.class07117
 *  minecraft.class07190
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07371
 *  minecraft.class07760
 *  minecraft.class07830
 *  minecraft.class07841
 *  minecraft.class08050
 *  minecraft.class08094
 *  minecraft.class08308
 *  minecraft.class08700
 *  net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker
 *  net.caffeinemc.mods.lithium.common.world.chunk.heightmap.CombinedHeightmapUpdate
 *  net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Load
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Unload
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents$Load
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents$Unload
 *  net.fabricmc.fabric.api.networking.v1.PlayerLookup
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentSync
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09372;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortList;
import it.unimi.dsi.fastutil.shorts.ShortListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00394;
import minecraft.class00426;
import minecraft.class00429;
import minecraft.class00431;
import minecraft.class00500;
import minecraft.class00531;
import minecraft.class00549;
import minecraft.class00553;
import minecraft.class00554;
import minecraft.class00562;
import minecraft.class00568;
import minecraft.class00571;
import minecraft.class00667;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01042;
import minecraft.class01099;
import minecraft.class01118;
import minecraft.class01145;
import minecraft.class01166;
import minecraft.class01187;
import minecraft.class01296;
import minecraft.class01806;
import minecraft.class01929;
import minecraft.class03032;
import minecraft.class03448;
import minecraft.class04310;
import minecraft.class04327;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04643;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04763;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04890;
import minecraft.class04932;
import minecraft.class05015;
import minecraft.class05163;
import minecraft.class05474;
import minecraft.class06960;
import minecraft.class06990;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07074;
import minecraft.class07117;
import minecraft.class07190;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07371;
import minecraft.class07760;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class08050;
import minecraft.class08094;
import minecraft.class08308;
import minecraft.class08700;
import net.caffeinemc.mods.lithium.common.block.entity.SleepingBlockEntity;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.common.world.chunk.ChunkStatusTracker;
import net.caffeinemc.mods.lithium.common.world.chunk.heightmap.CombinedHeightmapUpdate;
import net.caffeinemc.mods.lithium.mixin.world.block_entity_ticking.sleeping.WrappedBlockEntityTickInvokerAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents;
import net.fabricmc.fabric.api.networking.v1.PlayerLookup;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentSync;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class00570
extends class08050
implements class05474,
class06960,
AttachmentTargetImpl {
    public static final Logger W = LogUtils.getLogger();
    private static final class01099 P = new class00562();
    private Map<class07209, class00553> s = Maps.newHashMap();
    private boolean T;
    public final class07299 m;
    private @Nullable Supplier<class04763> b;
    private @Nullable class00571 j;
    private Int2ObjectMap<class01166> v;
    private final class04310<class00891> n;
    private final class04310<class04651> t;
    private class00568 G;
    private static final class00500 l = class00869.N.W();
    private static final class04688 d = class04684.N.M();

    public boolean L(int n) {
        return this.m.L(n);
    }

    private <T extends class00394> void L(T t) {
        class01118 class011182 = t.w().N(this.m, t.O());
        if (class011182 == null) {
            this.B(t.d());
        } else {
            this.s.compute(t.d(), (class072092, class005532) -> {
                class01099 class010992 = this.N(t, class011182);
                if (class005532 != null) {
                    this.N(t, class011182, (class07209)class072092, (class00553)class005532, null);
                    class005532.N(class010992);
                    return class005532;
                }
                if (this.V()) {
                    class00553 class005533 = new class00553(class010992);
                    this.N(t, class011182, (class07209)class072092, (class00553)class005532, null, class005533);
                    this.m.method_31594((class01099)class005533);
                    return class005533;
                }
                return null;
            });
        }
    }

    private /* synthetic */ String L(int n, int n2, int n3) throws Exception {
        return class07074.N((class05474)this, (int)n, (int)n2, (int)n3);
    }

    public void L(class04782 class047822) {
        class047822.method_14196().N(this.L);
        class047822.method_14179().N(this.L);
    }

    private @Nullable class00394 M(class07209 class072092) {
        class00500 class005002 = this.method_8320(class072092);
        if (!class005002.k()) {
            return null;
        }
        return ((class07190)class005002.i()).N(class072092, class005002);
    }

    public class04327<class00891> P() {
        return this.n;
    }

    public void K() {
        this.z.values().forEach(class003942 -> {
            class07299 class072992 = this.m;
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.y(class003942, class047822);
            }
            this.m.method_71970(class003942);
            this.L(class003942);
        });
    }

    public int method_31607() {
        return this.m.method_31607();
    }

    public class00500 method_8320(class07209 class072092) {
        class00554 class005542;
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        int n4 = this.method_31602(n2);
        class00554[] class00554Array = this.u();
        if (n4 >= 0 && n4 < class00554Array.length && !(class005542 = class00554Array[n4]).L()) {
            return class005542.N(n & 0xF, n2 & 0xF, n3 & 0xF);
        }
        return l;
    }

    public class04688 method_8316(class07209 class072092) {
        return this.N(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public class00570(class07299 class072992, class07321 class073213, class07371 class073712, class04310<class00891> class043102, class04310<class04651> class043103, long l, class00554 @Nullable [] class00554Array, @Nullable class00571 class005712, @Nullable class03032 class030322) {
        super(class073213, class073712, (class05474)class072992, class072992.method_74142(), l, class00554Array, class030322);
        this.N(class072992, class073213, class073712, class043102, class043103, l, class00554Array, class005712, class030322, null);
        this.G = class073212 -> {};
        this.m = class072992;
        this.v = new Int2ObjectOpenHashMap();
        this.N((CallbackInfo)null);
        for (class07830 class078302 : class07830.values()) {
            if (!class00549.m.i().contains(class078302)) continue;
            this.M.put(class078302, new class07841((class08050)this, class078302));
        }
        this.j = class005712;
        this.n = class043102;
        this.t = class043103;
    }

    public class00570(class04782 class047822, class07361 class073612, @Nullable class00571 class005712) {
        this((class07299)class047822, class073612.R(), class073612.b(), (class04310<class00891>)class073612.K(), (class04310<class04651>)class073612.V(), class073612.n(), class073612.u(), class005712, class073612.v());
        if (!Collections.disjoint(class073612.Z.keySet(), class073612.z.keySet())) {
            W.error("Chunk at {} contains duplicated block entities", (Object)class073612.R());
        }
        for (Object object : class073612.J().values()) {
            this.N((class00394)object);
        }
        this.Z.putAll(class073612.q());
        for (int i = 0; i < class073612.m().length; ++i) {
            this.y[i] = class073612.m()[i];
        }
        this.N_86(class073612.M());
        this.y(class073612.B());
        for (Object object : class073612.i()) {
            if (!class00549.m.i().contains(object.getKey())) continue;
            this.N((class07830)object.getKey(), ((class07841)object.getValue()).N());
        }
        this.B = class073612.B;
        this.N(class073612.t());
        this.Z();
        this.N(class047822, class073612, class005712, null);
    }

    public class00570(class07299 class072992, class07321 class073212) {
        this(class072992, class073212, class07371.N, (class04310<class00891>)new class04310(), (class04310<class04651>)new class04310(), 0L, null, null, null);
    }

    static {
        ChunkStatusTracker.registerLoadCallback((class047822, class005702) -> ((LithiumData)class047822).lithium$getData().gameEventDispatchers().addChunk(class005702.R().y(), class005702.v));
        ChunkStatusTracker.registerUnloadCallback((class047822, class073212) -> ((LithiumData)class047822).lithium$getData().gameEventDispatchers().removeChunk(class073212.y()));
    }

    private void B(class07209 class072092) {
        class00553 class005532 = this.s.remove(class072092);
        if (class005532 != null) {
            class005532.N(P);
        }
    }

    public void I() {
        if (this.j != null) {
            this.j.run(this);
            this.j = null;
        }
    }

    public class07299 J() {
        return this.m;
    }

    public void Z() {
        boolean bl = this.U();
        super.Z();
        if (!bl) {
            this.G.setUnsaved(this.L);
        }
    }

    private boolean V() {
        return this.T || this.m.method_8608();
    }

    public class04327<class04651> s() {
        return this.t;
    }

    public Map<class07209, class00394> o() {
        return this.z;
    }

    public class04763 g() {
        if (this.b == null) {
            return class04763.field_44855;
        }
        return this.b.get();
    }

    public void q() {
        this.z.values().forEach(class00394::r_);
        this.z.clear();
        this.s.values().forEach(class005532 -> class005532.N(P));
        this.s.clear();
    }

    public void u(long l) {
        this.n.y(l);
        this.t.y(l);
    }

    private void u(int n) {
        this.v.remove(n);
        this.N(n, null);
    }

    public void y(class04782 class047822) {
        class047822.method_14196().N(this.L, this.n);
        class047822.method_14179().N(this.L, this.t);
    }

    private <T extends class00394> void y(T t, class04782 class047822) {
        class01187 class011872;
        class00891 class008912 = t.w().i();
        if (class008912 instanceof class07190 && (class011872 = ((class07190)class008912).N(class047822, t)) != null) {
            this.N(class01296.N((int)t.d().method_10264())).N(class011872);
        }
    }

    public void y(class00394 class003942) {
        this.N(class003942);
        if (this.V()) {
            class07299 class072992 = this.m;
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.y(class003942, class047822);
            }
            this.m.method_71970(class003942);
            this.L(class003942);
        }
    }

    public void y(Supplier<class04763> supplier) {
        this.b = supplier;
        this.N(supplier, null);
    }

    public void y(boolean bl) {
        this.T = bl;
    }

    private /* synthetic */ String y(int n, int n2, int n3) throws Exception {
        return class07074.N((class05474)this, (int)n, (int)n2, (int)n3);
    }

    private Object y(Map map, Object object) {
        if (object == class07830.field_13197 || object == class07830.field_13203 || object == class07830.field_13200 || object == class07830.field_13202) {
            return null;
        }
        return map.get(object);
    }

    public class00549 E() {
        return class00549.m;
    }

    private void N(class04782 class047822, class07361 class073612, class00571 class005712, CallbackInfo callbackInfo) {
        AttachmentTargetImpl.transfer((AttachmentTarget)class073612, (AttachmentTarget)this, (boolean)false);
    }

    private void N(class00394 class003942, CallbackInfo callbackInfo, class00394 class003943) {
        if (class003943 != null) {
            if (this.J() instanceof class04782) {
                ((ServerBlockEntityEvents.Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003943, (class04782)this.J());
            } else if (this.J() instanceof class03448) {
                ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003943, (class03448)this.J());
            }
        }
    }

    private Object N(Map map, Object object) {
        Object v = map.remove(object);
        if (v != null) {
            if (this.J() instanceof class04782) {
                ((ServerBlockEntityEvents.Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload((class00394)v, (class04782)this.J());
            } else if (this.J() instanceof class03448) {
                ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload((class00394)v, (class03448)this.J());
            }
        }
        return v;
    }

    public class04688 N(int n, int n2, int n3) {
        int n4 = this.method_31602(n2);
        class00554[] class00554Array = this.u();
        if (n4 >= 0 && n4 < class00554Array.length) {
            return class00554Array[n4].y(n & 0xF, n2 & 0xF, n3 & 0xF);
        }
        return d;
    }

    private Object N_11(Object object, class00394 class003942) {
        if (class003942 != null && class003942 != object) {
            if (this.J() instanceof class04782) {
                ((ServerBlockEntityEvents.Load)ServerBlockEntityEvents.BLOCK_ENTITY_LOAD.invoker()).onLoad(class003942, (class04782)this.J());
            } else if (this.J() instanceof class03448) {
                ((ClientBlockEntityEvents.Load)ClientBlockEntityEvents.BLOCK_ENTITY_LOAD.invoker()).onLoad(class003942, (class03448)this.J());
            }
        }
        return object;
    }

    private void N(class00394 class003942, class01118 class011182, class07209 class072092, class00553 class005532, CallbackInfoReturnable callbackInfoReturnable, class00553 class005533) {
        if (class003942 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class003942).lithium$setTickWrapper((WrappedBlockEntityTickInvokerAccessor)class005533);
        }
    }

    private void N(Supplier supplier, CallbackInfo callbackInfo) {
        class07299 class072992;
        if (supplier != null && (class072992 = this.J()) instanceof class04782) {
            ChunkStatusTracker.onChunkAccessible((class04782)((class04782)class072992), (class00570)this);
        }
    }

    private void N(class07209 class072092, class00500 class005002, int n, CallbackInfoReturnable callbackInfoReturnable, class00394 class003942) {
        class00500 class005003 = this.method_8320(class072092);
        if (class005003 != class005002) {
            class003942.L(class005003);
        }
    }

    private void N(int n, CallbackInfo callbackInfo) {
        if (this.v != null && this.v.isEmpty()) {
            this.N((Int2ObjectMap)null);
        }
    }

    private void N(class00394 class003942, class01118 class011182, class07209 class072092, class00553 class005532, CallbackInfoReturnable callbackInfoReturnable) {
        if (class003942 instanceof SleepingBlockEntity) {
            ((SleepingBlockEntity)class003942).lithium$setTickWrapper((WrappedBlockEntityTickInvokerAccessor)class005532);
        }
    }

    private boolean N(class07841 class078412, int n, int n2, int n3, class00500 class005002) {
        if (class078412 == null) {
            return false;
        }
        return class078412.N(n, n2, n3, class005002);
    }

    private void N(class07209 class072092, class00500 class005002, int n, CallbackInfoReturnable callbackInfoReturnable, int n2, int n3, int n4) {
        class07841 class078412 = (class07841)this.M.get(class07830.field_13197);
        class07841 class078413 = (class07841)this.M.get(class07830.field_13203);
        class07841 class078414 = (class07841)this.M.get(class07830.field_13200);
        class07841 class078415 = (class07841)this.M.get(class07830.field_13202);
        CombinedHeightmapUpdate.updateHeightmaps((class07841)class078412, (class07841)class078413, (class07841)class078414, (class07841)class078415, (class00570)this, (int)n3, (int)n2, (int)n4, (class00500)class005002);
    }

    private void N(class07209 class072092, CallbackInfo callbackInfo, @Nullable class00394 class003942) {
        if (class003942 != null) {
            if (this.J() instanceof class04782) {
                ((ServerBlockEntityEvents.Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, (class04782)this.J());
            } else if (this.J() instanceof class03448) {
                ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, (class03448)this.J());
            }
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (this.v.isEmpty()) {
            this.v = null;
        }
    }

    public void N(Int2ObjectMap int2ObjectMap) {
        ((LithiumData)this.J()).lithium$getData().gameEventDispatchers().replace(this.R().y(), int2ObjectMap);
        this.v = int2ObjectMap;
    }

    private void N(CallbackInfoReturnable callbackInfoReturnable) {
        if (this.v == null) {
            this.N((Int2ObjectMap)new Int2ObjectOpenHashMap(4));
        }
    }

    private void N(class07299 class072992, class07321 class073212, class07371 class073712, class04310 class043102, class04310 class043103, long l, class00554[] class00554Array, class00571 class005712, class03032 class030322, CallbackInfo callbackInfo) {
        this.s = new Object2ObjectOpenHashMap();
    }

    private class00394 N(class07190 class071902, class07209 class072092, class00500 class005002) {
        class00500 class005003 = this.method_8320(class072092);
        if (class005002 == class005003) {
            return class071902.N(class072092, class005002);
        }
        if (class005003.k()) {
            return ((class07190)class005003.i()).N(class072092, class005003);
        }
        return null;
    }

    public void N(class00394 class003942) {
        class07209 class072092 = class003942.d();
        class00500 class005002 = this.method_8320(class072092);
        if (!class005002.k()) {
            W.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{class003942, class072092, class005002});
            return;
        }
        class00500 class005003 = class003942.w();
        if (class005002 != class005003) {
            if (!class003942.O().method_20526(class005002)) {
                W.warn("Trying to set block entity {} at position {}, but state {} does not allow it", new Object[]{class003942, class072092, class005002});
                return;
            }
            if (class005002.i() != class005003.i()) {
                W.warn("Block state mismatch on block entity {} in position {}, {} != {}, updating", new Object[]{class003942, class072092, class005002, class005003});
            }
            class003942.L(class005002);
        }
        class003942.N(this.m);
        class003942.Y();
        class00394 class003943 = (class00394)this.N_11(this.z.put(class072092.method_10062(), class003942), class003942);
        if (class003943 != null && class003943 != class003942) {
            class003943.r_();
            this.N(class003942, null, class003943);
        }
    }

    public @Nullable class07001 N(class07209 class072092, class01929 class019292) {
        class00394 class003942 = this.method_8321(class072092);
        if (class003942 != null && !class003942.k()) {
            class07001 class070012 = class003942.y_2((class01929)this.m.method_30349());
            class070012.N("keepPacked", false);
            return class070012;
        }
        class07001 class070013 = (class07001)this.Z.get(class072092);
        if (class070013 != null) {
            class070013 = class070013.N();
            class070013.N("keepPacked", true);
        }
        return class070013;
    }

    public void N(class07209 class072092) {
        class00394 class003942;
        if (this.V() && (class003942 = (class00394)this.z.remove(class072092)) != null) {
            class07299 class072992 = this.m;
            if (class072992 instanceof class04782) {
                class04782 class047822 = (class04782)class072992;
                this.N(class003942, class047822);
                class047822.method_74535().N(class072092);
            }
            this.N(class072092, null, class003942);
            class003942.r_();
        }
        this.B(class072092);
    }

    private <T extends class00394> void N(T t, class04782 class047822) {
        class01187 class011872;
        class00891 class008912 = t.w().i();
        if (class008912 instanceof class07190 && (class011872 = ((class07190)class008912).N(class047822, t)) != null) {
            int n = class01296.N((int)t.d().method_10264());
            this.N(n).y(class011872);
        }
    }

    public void N(class00667 class006672, Map<class07830, long[]> map, Consumer<class01806> consumer) {
        this.q();
        class04495 class044952 = this.E;
        int n = ((class00554[])class044952).length;
        for (int i = 0; i < n; ++i) {
            class044952[i].N(class006672);
        }
        map.forEach((arg_0, arg_1) -> ((class00570)this).N(arg_0, arg_1));
        this.k();
        class044952 = new class04495(this.Q(), W);
        try {
            consumer.accept((class072092, class004042, class070012) -> {
                class00394 class003942 = this.N(class072092, class00531.field_12860);
                if (class003942 != null && class070012 != null && class003942.O() == class004042) {
                    class003942.y_1(class08308.N((class04490)class044952.N_46(class003942.J()), (class01929)this.m.method_30349(), (class07001)class070012));
                }
            });
        }
        finally {
            class044952.close();
        }
    }

    public void N(class00667 class006672) {
        int n = this.E.length;
        for (int i = 0; i < n; ++i) {
            this.E[i].y(class006672);
        }
    }

    public void N(class00568 class005682) {
        this.G = class005682;
        if (this.U()) {
            class005682.setUnsaved(this.L);
        }
    }

    public class08094 N(long l) {
        return new class08094(this.n.N(l), this.t.N(l));
    }

    public class01166 N(int n) {
        class07299 class072992 = this.m;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            this.N((CallbackInfoReturnable)null);
            return (class01166)this.v.computeIfAbsent(n, n2 -> new class01145(class047822, n, this::u));
        }
        return super.N(n);
    }

    public @Nullable class00500 N(class07209 class072092, class00500 class005002, int n) {
        class07299 class072992;
        class04782 class047822;
        boolean bl;
        int n2;
        int n3;
        int n4 = class072092.method_10264();
        class00554 class005542 = this.y(this.method_31602(n4));
        boolean bl2 = class005542.L();
        if (bl2 && class005002.P()) {
            return null;
        }
        int n5 = class072092.method_10263() & 0xF;
        class00500 class005003 = class005542.N(n5, n3 = n4 & 0xF, n2 = class072092.method_10260() & 0xF, class005002);
        if (class005003 == class005002) {
            return null;
        }
        class00891 class008912 = class005002.i();
        class07830 class078302 = class07830.field_13197;
        Map var18 = this.M;
        class07841 class078412 = (class07841)this.y(var18, class078302);
        this.N(class072092, class005002, n, null, n4, n5, n2);
        class00500 class005004 = class005002;
        int n6 = n2;
        int n7 = n4;
        int n8 = n5;
        Object object = class078412;
        this.N((class07841)object, n8, n7, n6, class005004);
        class07830 class078303 = class07830.field_13203;
        object = this.M;
        class005004 = class005002;
        n6 = n2;
        n7 = n4;
        int n9 = n5;
        object = (class07841)this.y((Map)object, class078303);
        this.N((class07841)object, n9, n7, n6, class005004);
        class07830 class078304 = class07830.field_13200;
        object = this.M;
        class005004 = class005002;
        n6 = n2;
        n7 = n4;
        int n10 = n5;
        object = (class07841)this.y((Map)object, class078304);
        this.N((class07841)object, n10, n7, n6, class005004);
        class07830 class078305 = class07830.field_13202;
        object = this.M;
        class005004 = class005002;
        n6 = n2;
        n7 = n4;
        int n11 = n5;
        object = (class07841)this.y((Map)object, class078305);
        this.N((class07841)object, n11, n7, n6, class005004);
        boolean bl3 = class005542.L();
        if (bl2 != bl3) {
            this.m.method_8398().L().N(class072092, bl3);
            this.m.method_8398().N(this.L.B, class01296.N((int)n4), this.L.Z, bl3);
        }
        if (class05015.N((class00500)class005003, (class00500)class005002)) {
            class04643 class046432 = class08700.N();
            class046432.N("updateSkyLightSources");
            this.B.N((class07290)this, n5, n4, n2);
            class046432.y("queueCheckLight");
            this.m.method_8398().L().N(class072092);
            class046432.L();
        }
        boolean bl4 = !class005003.N(class008912);
        boolean bl5 = (n & 0x40) != 0;
        boolean bl6 = bl = (n & 0x100) == 0;
        if (bl4 && class005003.k() && !class005002.N(class005003)) {
            if (!this.m.method_8608() && bl && (class047822 = this.m.method_8321(class072092)) != null) {
                class047822.N(class072092, class005003);
            }
            this.N(class072092);
        }
        if ((bl4 || class008912 instanceof class07760) && (class072992 = this.m) instanceof class04782) {
            class047822 = (class04782)class072992;
            if ((n & 1) != 0 || bl5) {
                class005003.N(class047822, class072092, bl5);
            }
        }
        if (!class005542.N(n5, n3, n2).N(class008912)) {
            return null;
        }
        if (!this.m.method_8608() && (n & 0x200) == 0) {
            class005002.N(this.m, class072092, class005003, bl5);
        }
        if (class005002.k()) {
            class047822 = this.N(class072092, class00531.field_12859);
            if (class047822 != null && !class047822.y(class005002)) {
                W.warn("Found mismatched block entity @ {}: type = {}, state = {}", new Object[]{class072092, class047822.O().method_53254().B().N(), class005002});
                this.N(class072092);
                class047822 = null;
            }
            if (class047822 == null) {
                object = (class07190)class008912;
                class07209 class072093 = class072092;
                class00500 class005005 = class005002;
                class047822 = this.N((class07190)object, class072093, class005005);
                if (class047822 != null) {
                    this.y((class00394)class047822);
                }
            } else {
                class047822.L(class005002);
                this.N(class072092, class005002, n, null, (class00394)class047822);
                this.L((class00394)class047822);
            }
        }
        this.Z();
        return class005003;
    }

    @Deprecated
    public void N(class07049 class070492) {
    }

    public @Nullable class00394 N(class07209 class072092, class00531 class005312) {
        class00394 class003942;
        class07001 class070012;
        class00394 class003943 = (class00394)this.z.get(class072092);
        if (class003943 == null && (class070012 = (class07001)this.Z.remove(class072092)) != null && (class003942 = this.N(class072092, class070012)) != null) {
            return class003942;
        }
        if (class003943 == null) {
            if (class005312 == class00531.field_12860 && (class003943 = this.M(class072092)) != null) {
                this.y(class003943);
            }
        } else if (class003943.k()) {
            class07209 class072093 = class072092;
            Map var6 = this.z;
            this.N(var6, class072093);
            return null;
        }
        return class003943;
    }

    private <T extends class00394> class01099 N(T t, class01118<T> class011182) {
        return new class09372(this, t, class011182);
    }

    public void N(class04782 class047822) {
        class07321 class073212 = this.R();
        for (int i = 0; i < this.y.length; ++i) {
            ShortList shortList = this.y[i];
            if (shortList == null) continue;
            ShortListIterator shortListIterator = shortList.iterator();
            while (shortListIterator.hasNext()) {
                class00500 class005002;
                class07209 class072092 = class07361.N((short)((Short)shortListIterator.next()), (int)this.method_31604(i), (class07321)class073212);
                class00500 class005003 = this.method_8320(class072092);
                class04688 class046882 = class005003.Y();
                if (!class046882.W()) {
                    class046882.N(class047822, class072092, class005003);
                }
                if (class005003.i() instanceof class07117 || (class005002 = class00891.a_((class00500)class005003, (class07284)class047822, (class07209)class072092)) == class005003) continue;
                class047822.method_8652(class072092, class005002, 276);
            }
            shortList.clear();
        }
        for (ShortList shortList : ImmutableList.copyOf(this.Z.keySet())) {
            this.method_8321((class07209)shortList);
        }
        this.Z.clear();
        this.i.N(this);
    }

    private @Nullable class00394 N(class07209 class072092, class07001 class070012) {
        class00394 class003942;
        class00500 class005002 = this.method_8320(class072092);
        if ("DUMMY".equals(class070012.y("id", ""))) {
            if (class005002.k()) {
                class003942 = ((class07190)class005002.i()).N(class072092, class005002);
            } else {
                class003942 = null;
                W.warn("Tried to load a DUMMY block entity @ {} but found not block entity block {} at location", (Object)class072092, (Object)class005002);
            }
        } else {
            class003942 = class00394.N((class07209)class072092, (class00500)class005002, (class07001)class070012, (class01929)this.m.method_30349());
        }
        if (class003942 != null) {
            class003942.N(this.m);
            this.y(class003942);
        } else {
            W.warn("Tried to load a block entity for block {} but failed at location {}", (Object)class005002, (Object)class072092);
        }
        return class003942;
    }

    boolean R(class07209 class072092) {
        if (!this.m.method_8621().N(class072092)) {
            return false;
        }
        class07299 class072992 = this.m;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            return this.g().N(class04763.field_44856) && class047822.method_37116(class07321.N((class07209)class072092));
        }
        return true;
    }

    public boolean O() {
        return false;
    }

    public boolean fabric_shouldTryToSync() {
        return !this.m.method_8608();
    }

    public void method_74589(class04782 class047822, class06990 class069902) {
        if (!this.M().isEmpty()) {
            class069902.N(class00429.W, () -> {
                ArrayList<class00431> arrayList = new ArrayList<class00431>();
                for (class04932 class049322 : this.M().values()) {
                    class05163 class051632 = class049322.N();
                    List var5 = class049322.Z();
                    ArrayList<class00426> arrayList2 = new ArrayList<class00426>(var5.size());
                    for (int i = 0; i < var5.size(); ++i) {
                        boolean bl = i == 0;
                        arrayList2.add(new class00426(((class04890)var5.get(i)).L(), bl));
                    }
                    arrayList.add(new class00431(class051632, arrayList2));
                }
                return arrayList;
            });
        }
        class069902.N(class00429.E, () -> class047822.method_19495().N(this.L));
    }

    public void fabric_syncChange(AttachmentType attachmentType, AttachmentChange attachmentChange) {
        class07299 class072992 = this.m;
        if (class072992 instanceof class04782) {
            PlayerLookup.tracking((class04782)((class04782)class072992), (class07321)((class08050)this).R()).forEach(class047702 -> {
                if (((AttachmentTypeImpl)attachmentType).syncPredicate().test((Object)this, class047702)) {
                    AttachmentSync.trySync((AttachmentChange)attachmentChange, (class04770)class047702);
                }
            });
        }
    }

    public int method_31604(int n) {
        return this.m.method_31604(n);
    }

    public int method_31600() {
        return this.m.method_31600();
    }

    public boolean method_31606(class07209 class072092) {
        return this.m.method_31606(class072092);
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return this.N(class072092, class00531.field_12859);
    }

    public int method_32891() {
        return this.m.method_32891();
    }

    public int method_32890() {
        return this.m.method_32890();
    }

    public int method_31597() {
        return this.m.method_31597();
    }

    public boolean method_31601(int n) {
        return this.m.method_31601(n);
    }

    public int method_31603(int n) {
        return this.m.method_31603(n);
    }

    public int method_31605() {
        return this.m.method_31605();
    }

    public int method_31602(int n) {
        return this.m.method_31602(n);
    }

    public class01042 fabric_getDynamicRegistryManager() {
        return this.m.method_30349();
    }

    public void fabric_computeInitialSyncChanges(class04770 class047702, Consumer consumer) {
        super.fabric_computeInitialSyncChanges(class047702, consumer);
        Iterator<class00394> var3 = this.o().values().iterator();
        while (var3.hasNext()) {
            ((AttachmentTargetImpl)var3.next()).fabric_computeInitialSyncChanges(class047702, consumer);
        }
    }
}


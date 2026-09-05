/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10870
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.shorts.ShortArrayList
 *  it.unimi.dsi.fastutil.shorts.ShortList
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00529
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00753
 *  minecraft.class00780
 *  minecraft.class00891
 *  minecraft.class01029
 *  minecraft.class01042
 *  minecraft.class01146
 *  minecraft.class01166
 *  minecraft.class01296
 *  minecraft.class01837
 *  minecraft.class01929
 *  minecraft.class02999
 *  minecraft.class03032
 *  minecraft.class03222
 *  minecraft.class03480
 *  minecraft.class03482
 *  minecraft.class03556
 *  minecraft.class04327
 *  minecraft.class04330
 *  minecraft.class04489
 *  minecraft.class04651
 *  minecraft.class04748
 *  minecraft.class04770
 *  minecraft.class04932
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class05527
 *  minecraft.class06614
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07321
 *  minecraft.class07371
 *  minecraft.class07529
 *  minecraft.class07830
 *  minecraft.class07841
 *  minecraft.class07878
 *  minecraft.class08094
 *  minecraft.class08299
 *  minecraft.class08329
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentTarget$OnAttachedSet
 *  net.fabricmc.fabric.api.attachment.v1.AttachmentType
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint
 *  net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl
 *  net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentChange
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo
 *  net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo$ChunkTarget
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10870;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00529;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00753;
import minecraft.class00780;
import minecraft.class00891;
import minecraft.class01029;
import minecraft.class01042;
import minecraft.class01146;
import minecraft.class01166;
import minecraft.class01296;
import minecraft.class01837;
import minecraft.class01929;
import minecraft.class02999;
import minecraft.class03032;
import minecraft.class03222;
import minecraft.class03480;
import minecraft.class03482;
import minecraft.class03556;
import minecraft.class04327;
import minecraft.class04330;
import minecraft.class04489;
import minecraft.class04651;
import minecraft.class04748;
import minecraft.class04770;
import minecraft.class04932;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class05527;
import minecraft.class06614;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07321;
import minecraft.class07371;
import minecraft.class07529;
import minecraft.class07830;
import minecraft.class07841;
import minecraft.class07878;
import minecraft.class08094;
import minecraft.class08299;
import minecraft.class08329;
import net.fabricmc.fabric.api.attachment.v1.AttachmentTarget;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.impl.attachment.AttachmentEntrypoint;
import net.fabricmc.fabric.impl.attachment.AttachmentSerializingImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTargetImpl;
import net.fabricmc.fabric.impl.attachment.AttachmentTypeImpl;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentTargetInfo;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class08050
implements class00529,
class03482,
class05527,
AttachmentTargetImpl {
    public static final int N = -1;
    private static final Logger W = LogUtils.getLogger();
    private static final LongSet m = new LongOpenHashSet();
    protected final @Nullable ShortList[] y;
    private volatile boolean P;
    private volatile boolean s;
    protected final class07321 L;
    private long T;
    @Deprecated
    private @Nullable class01029 b;
    protected @Nullable class01837 u;
    protected final class07371 i;
    protected @Nullable class03032 R;
    protected final Map<class07830, class07841> M = Maps.newEnumMap(class07830.class);
    protected class03480 B;
    private final Map<class04748, class04932> j = Maps.newHashMap();
    private final Map<class04748, LongSet> v = Maps.newHashMap();
    protected final Map<class07209, class07001> Z = Maps.newHashMap();
    protected final Map<class07209, class00394> z = new Object2ObjectOpenHashMap();
    protected final class05474 U;
    protected final class00554[] E;
    private @Nullable IdentityHashMap n = null;
    private @Nullable IdentityHashMap t = null;
    private @Nullable IdentityHashMap G = null;

    public class05474 w() {
        return this;
    }

    public Set<class07209> L() {
        HashSet hashSet = Sets.newHashSet(this.Z.keySet());
        hashSet.addAll(this.z.keySet());
        return hashSet;
    }

    public void L(long l) {
        this.T = l;
    }

    public Map<class04748, class04932> M() {
        return Collections.unmodifiableMap(this.j);
    }

    public abstract class04327<class00891> P();

    public boolean T() {
        return true;
    }

    public class04489 Q() {
        return class08050.N(this.R());
    }

    public int method_31607() {
        return this.U.method_31607();
    }

    public class08050(class07321 class073212, class07371 class073712, class05474 class054742, class06614 class066142, long l, class00554 @Nullable [] class00554Array, @Nullable class03032 class030322) {
        this.L = class073212;
        this.i = class073712;
        this.U = class054742;
        this.E = new class00554[class054742.method_32890()];
        this.T = l;
        this.y = new ShortList[class054742.method_32890()];
        this.R = class030322;
        this.B = new class03480(class054742);
        if (class00554Array != null) {
            if (this.E.length == class00554Array.length) {
                System.arraycopy(class00554Array, 0, this.E, 0, this.E.length);
            } else {
                W.warn("Could not set level chunk sections, array length is {} instead of {}", (Object)class00554Array.length, (Object)this.E.length);
            }
        }
        class08050.N(class066142, this.E);
    }

    public Map<class04748, LongSet> B() {
        return Collections.unmodifiableMap(this.v);
    }

    public void Z() {
        this.P = true;
    }

    public @Nullable class07001 i(class07209 class072092) {
        return this.Z.get(class072092);
    }

    public Collection<Map.Entry<class07830, class07841>> i() {
        return Collections.unmodifiableSet(this.M.entrySet());
    }

    public class07371 b() {
        return this.i;
    }

    public abstract class04327<class04651> s();

    public long n() {
        return this.T;
    }

    public @Nullable class02999 l() {
        return null;
    }

    public boolean d() {
        return this.l() != null;
    }

    public @Nullable ShortList[] m() {
        return this.y;
    }

    public void k() {
        this.B.N(this);
    }

    public boolean t() {
        return this.s;
    }

    public @Nullable class03032 v() {
        return this.R;
    }

    public boolean j() {
        return this.R != null;
    }

    public boolean U() {
        return this.P;
    }

    public boolean z() {
        if (this.P) {
            this.P = false;
            return true;
        }
        return false;
    }

    public class00554[] u() {
        return this.E;
    }

    public void u(class07209 class072092) {
        W.warn("Trying to mark a block for PostProcessing @ {}, but this operation is not supported.", (Object)class072092);
    }

    @Deprecated(forRemoval=true)
    public int y() {
        int n = this.N();
        return n == -1 ? this.method_31607() : class01296.L((int)this.method_31604(n));
    }

    public class00554 y(int n) {
        return this.u()[n];
    }

    public LongSet y(class04748 class047482) {
        return this.v.getOrDefault(class047482, m);
    }

    public void y(long l) {
        this.T += l;
    }

    public boolean y(class07830 class078302) {
        return this.M.get(class078302) != null;
    }

    public void y(Map<class04748, LongSet> map) {
        this.v.clear();
        this.v.putAll(map);
        this.Z();
    }

    public abstract class00549 E();

    public abstract void N(class00394 var1);

    public abstract void N(class07049 var1);

    public static class04489 N(class07321 class073212) {
        return new class10870(class073212);
    }

    public class01837 N_20(Function<class08050, class01837> function) {
        if (this.u == null) {
            this.u = function.apply(this);
        }
        return this.u;
    }

    @Deprecated
    public class01029 N(Supplier<class01029> supplier) {
        if (this.b == null) {
            this.b = supplier.get();
        }
        return this.b;
    }

    public void N(class04330 class043302, class03222 class032222) {
        class07321 class073212 = this.R();
        int n = class01146.N((int)class073212.i());
        int n2 = class01146.N((int)class073212.R());
        class05474 class054742 = this.w();
        for (int i = class054742.method_32891(); i <= class054742.method_31597(); ++i) {
            class00554 class005542 = this.y(this.method_31603(i));
            int n3 = class01146.u((int)i);
            class005542.N(class043302, class032222, n, n3, n2);
        }
    }

    public int N() {
        class00554[] class00554Array = this.u();
        for (int i = class00554Array.length - 1; i >= 0; --i) {
            if (class00554Array[i].L()) continue;
            return i;
        }
        return -1;
    }

    private void N(AttachmentType attachmentType, Object object, class01929 class019292) {
        class01042 class010422 = class019292 instanceof class01042 ? (class01042)class019292 : this.fabric_getDynamicRegistryManager();
        this.N(attachmentType, AttachmentChange.create((AttachmentTargetInfo)this.fabric_getSyncTargetInfo(), (AttachmentType)attachmentType, (Object)object, (class01042)class010422));
    }

    private void N(AttachmentType attachmentType, @Nullable AttachmentChange attachmentChange) {
        if (attachmentChange == null) {
            if (this.t == null) {
                return;
            }
            this.t.remove(attachmentType);
        } else {
            if (this.t == null) {
                this.t = new IdentityHashMap();
            }
            this.t.put(attachmentType, attachmentChange);
        }
    }

    public abstract @Nullable class00500 N(class07209 var1, class00500 var2, int var3);

    public @Nullable class00500 N(class07209 class072092, class00500 class005002) {
        return this.N(class072092, class005002, 3);
    }

    public class01166 N(int n) {
        return class01166.N;
    }

    private static void N(class06614 class066142, class00554[] class00554Array) {
        for (int i = 0; i < class00554Array.length; ++i) {
            if (class00554Array[i] != null) continue;
            class00554Array[i] = new class00554(class066142);
        }
    }

    public final void N(BiConsumer<class07209, class00500> biConsumer) {
        this.N((class00500 class005002) -> class005002.m() != 0, biConsumer);
    }

    public void N(class04748 class047483, long l) {
        this.v.computeIfAbsent(class047483, class047482 -> new LongOpenHashSet()).add(l);
        this.Z();
    }

    public void N_86(Map<class04748, class04932> map) {
        this.j.clear();
        this.j.putAll(map);
        this.Z();
    }

    public void N(class04748 class047482, class04932 class049322) {
        this.j.put(class047482, class049322);
        this.Z();
    }

    public @Nullable class04932 N(class04748 class047482) {
        return this.j.get(class047482);
    }

    public abstract class08094 N(long var1);

    public abstract void N(class07209 var1);

    public void N(ShortList shortList, int n) {
        class08050.N(this.m(), n).addAll(shortList);
    }

    public void N(class07001 class070012) {
        class07209 class072092 = class00394.N((class07321)this.L, (class07001)class070012);
        if (!this.z.containsKey(class072092)) {
            this.Z.put(class072092, class070012);
        }
    }

    public boolean N(int n, int n2) {
        if (n < this.method_31607()) {
            n = this.method_31607();
        }
        if (n2 > this.method_31600()) {
            n2 = this.method_31600();
        }
        for (int i = n; i <= n2; i += 16) {
            if (this.y(this.method_31602(i)).L()) continue;
            return false;
        }
        return true;
    }

    public abstract @Nullable class07001 N(class07209 var1, class01929 var2);

    public class07841 N(class07830 class078303) {
        return this.M.computeIfAbsent(class078303, class078302 -> new class07841(this, class078302));
    }

    public void N(class07830 class078302, long[] lArray) {
        this.N(class078302).N(this, class078302, lArray);
    }

    public static ShortList N(@Nullable ShortList[] shortListArray, int n) {
        ShortList shortList = shortListArray[n];
        if (shortList == null) {
            shortListArray[n] = shortList = new ShortArrayList();
        }
        return shortList;
    }

    public void N(boolean bl) {
        this.s = bl;
        this.Z();
    }

    public int N(class07830 class078302, int n, int n2) {
        class07841 class078412 = this.M.get(class078302);
        if (class078412 == null) {
            if (class07529.ND && this instanceof class00570) {
                W.error("Unprimed heightmap: {} {} {}", new Object[]{class078302, n, n2});
            }
            class07841.N((class08050)this, EnumSet.of(class078302));
            class078412 = this.M.get(class078302);
        }
        return class078412.N(n & 0xF, n2 & 0xF) - 1;
    }

    public void N(Predicate<class00500> predicate, BiConsumer<class07209, class00500> biConsumer) {
        class07218 class072182 = new class07218();
        for (int i = this.method_32891(); i <= this.method_31597(); ++i) {
            class00554 class005542 = this.y(this.method_31603(i));
            if (!class005542.N(predicate)) continue;
            class07209 class072092 = class01296.N((class07321)this.L, (int)i).z();
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    for (int i2 = 0; i2 < 16; ++i2) {
                        class00500 class005002 = class005542.N(i2, j, k);
                        if (!predicate.test(class005002)) continue;
                        biConsumer.accept((class07209)class072182.N((class00753)class072092, i2, j, k), class005002);
                    }
                }
            }
        }
    }

    public class00549 W() {
        class00549 class005492 = this.E();
        class02999 class029992 = this.l();
        if (class029992 != null) {
            return class00549.N((class00549)class029992.N(), (class00549)class005492);
        }
        return class005492;
    }

    public class07321 R() {
        return this.L;
    }

    public boolean G() {
        return !this.B().isEmpty();
    }

    public class03480 Y() {
        return this.B;
    }

    public AttachmentTargetInfo fabric_getSyncTargetInfo() {
        return new AttachmentTargetInfo.ChunkTarget(this.L);
    }

    public Map fabric_getAttachments() {
        return this.n;
    }

    public boolean fabric_shouldTryToSync() {
        return false;
    }

    public void fabric_markChanged(AttachmentType attachmentType) {
        this.Z();
        if (attachmentType.isPersistent() && this.E().equals(class00549.L)) {
            AttachmentEntrypoint.LOGGER.warn("Attaching persistent attachment {} to chunk {} with chunk status EMPTY. Attachment might be discarded.", (Object)attachmentType.identifier(), (Object)this.R());
        }
    }

    public boolean hasAttached(AttachmentType attachmentType) {
        return this.n != null && this.n.containsKey(attachmentType);
    }

    public Event onAttachedSet(AttachmentType attachmentType2) {
        if (this.G == null) {
            this.G = new IdentityHashMap();
        }
        return this.G.computeIfAbsent(attachmentType2, attachmentType -> EventFactory.createArrayBacked(AttachmentTarget.OnAttachedSet.class, onAttachedSetArray -> (object, object2) -> {
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
            object2 = this.n == null ? null : (Object)this.n.remove(attachmentType);
        } else {
            if (this.n == null) {
                this.n = new IdentityHashMap();
            }
            object2 = this.n.put(attachmentType, object);
        }
        if (this.G != null && (event = (Event)this.G.get(attachmentType)) != null) {
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

    public @Nullable Object getAttached(AttachmentType attachmentType) {
        return this.n == null ? null : this.n.get(attachmentType);
    }

    public int method_31605() {
        return this.U.method_31605();
    }

    public class03556<class00780> method_16359(int n, int n2, int n3) {
        try {
            int n4 = class01146.N((int)this.method_31607());
            int n5 = n4 + class01146.N((int)this.method_31605()) - 1;
            int n6 = class04995.N((int)n2, (int)n4, (int)n5);
            int n7 = this.method_31602(class01146.L((int)n6));
            return this.E[n7].L(n & 3, n6 & 3, n3 & 3);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Getting biome");
            class07074 class070742 = class070802.N("Biome being got");
            class070742.N("Location", () -> class07074.N((class05474)this, (int)n, (int)n2, (int)n3));
            throw new class07878(class070802);
        }
    }

    public boolean fabric_hasPersistentAttachments() {
        return AttachmentSerializingImpl.hasPersistentAttachments((IdentityHashMap)this.n);
    }

    public class01042 fabric_getDynamicRegistryManager() {
        throw new UnsupportedOperationException("Chunk does not have a DynamicRegistryManager.");
    }

    public void fabric_writeAttachmentsToNbt(class08329 class083292) {
        AttachmentSerializingImpl.serializeAttachmentData((class08329)class083292, (IdentityHashMap)this.n);
    }

    public void fabric_readAttachmentsFromNbt(class08299 class082992) {
        IdentityHashMap var2 = AttachmentSerializingImpl.deserializeAttachmentData((class08299)class082992);
        if (var2 == null) {
            return;
        }
        this.n = var2;
        if (this.fabric_shouldTryToSync() && this.n != null) {
            this.n.forEach((attachmentType, object) -> {
                if (attachmentType.isSynced()) {
                    this.N((AttachmentType)attachmentType, object, class082992.N());
                }
            });
        }
    }

    public void fabric_computeInitialSyncChanges(class04770 class047702, Consumer consumer) {
        if (this.t == null) {
            return;
        }
        for (Map.Entry entry : this.t.entrySet()) {
            if (!((AttachmentTypeImpl)entry.getKey()).syncPredicate().test((Object)this, (Object)class047702)) continue;
            consumer.accept((AttachmentChange)entry.getValue());
        }
    }
}


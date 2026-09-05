/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09326
 *  Nursultan.class11371
 *  Nursultan.class11396
 *  Nursultan.class11938
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Queues
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.viaversion.viafabricplus.features.world.disable_sequencing.PendingUpdateManager1_18_2
 *  com.viaversion.viafabricplus.injection.access.world.always_tick_entities.IEntity
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  java.lang.MatchException
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00013
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00272
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class00594
 *  minecraft.class00608
 *  minecraft.class00611
 *  minecraft.class00616
 *  minecraft.class00695
 *  minecraft.class00734
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00891
 *  minecraft.class00917
 *  minecraft.class00918
 *  minecraft.class00931
 *  minecraft.class00933
 *  minecraft.class01042
 *  minecraft.class01109
 *  minecraft.class01115
 *  minecraft.class01124
 *  minecraft.class01135
 *  minecraft.class01139
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01284
 *  minecraft.class01315
 *  minecraft.class01683
 *  minecraft.class01688
 *  minecraft.class01834
 *  minecraft.class01909
 *  minecraft.class02265
 *  minecraft.class02417
 *  minecraft.class02566
 *  minecraft.class02755
 *  minecraft.class02827
 *  minecraft.class03063
 *  minecraft.class03106
 *  minecraft.class03202
 *  minecraft.class03358
 *  minecraft.class03556
 *  minecraft.class03767
 *  minecraft.class03989
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04295
 *  minecraft.class04298
 *  minecraft.class04303
 *  minecraft.class04406
 *  minecraft.class04410
 *  minecraft.class04453
 *  minecraft.class04477
 *  minecraft.class04540
 *  minecraft.class04606
 *  minecraft.class04651
 *  minecraft.class04688
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05042
 *  minecraft.class05096
 *  minecraft.class05207
 *  minecraft.class05363
 *  minecraft.class05474
 *  minecraft.class05630
 *  minecraft.class05917
 *  minecraft.class05946
 *  minecraft.class06024
 *  minecraft.class06069
 *  minecraft.class06153
 *  minecraft.class06202
 *  minecraft.class06229
 *  minecraft.class06511
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06683
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class06918
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07062
 *  minecraft.class07072
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07282
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07328
 *  minecraft.class07334
 *  minecraft.class07376
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07713
 *  minecraft.class07769
 *  minecraft.class07878
 *  minecraft.class08036
 *  minecraft.class08050
 *  minecraft.class08057
 *  minecraft.class08542
 *  minecraft.class08546
 *  minecraft.class08694
 *  minecraft.class08700
 *  minecraft.class09033
 *  net.caffeinemc.mods.lithium.common.client.ClientWorldAccessor
 *  net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker
 *  net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder
 *  net.caffeinemc.mods.sodium.client.world.BiomeSeedProvider
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndWorldTick
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartWorldTick
 *  net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09326;
import Nursultan.class11371;
import Nursultan.class11396;
import Nursultan.class11938;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.viaversion.viafabricplus.features.world.disable_sequencing.PendingUpdateManager1_18_2;
import com.viaversion.viafabricplus.injection.access.world.always_tick_entities.IEntity;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00013;
import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00272;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class00594;
import minecraft.class00608;
import minecraft.class00611;
import minecraft.class00616;
import minecraft.class00695;
import minecraft.class00734;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00891;
import minecraft.class00917;
import minecraft.class00918;
import minecraft.class00931;
import minecraft.class00933;
import minecraft.class01042;
import minecraft.class01109;
import minecraft.class01115;
import minecraft.class01124;
import minecraft.class01135;
import minecraft.class01139;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01284;
import minecraft.class01315;
import minecraft.class01683;
import minecraft.class01688;
import minecraft.class01834;
import minecraft.class01909;
import minecraft.class02265;
import minecraft.class02417;
import minecraft.class02566;
import minecraft.class02755;
import minecraft.class02827;
import minecraft.class03063;
import minecraft.class03106;
import minecraft.class03202;
import minecraft.class03358;
import minecraft.class03386;
import minecraft.class03427;
import minecraft.class03443;
import minecraft.class03455;
import minecraft.class03556;
import minecraft.class03767;
import minecraft.class03989;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04295;
import minecraft.class04298;
import minecraft.class04303;
import minecraft.class04406;
import minecraft.class04410;
import minecraft.class04453;
import minecraft.class04477;
import minecraft.class04540;
import minecraft.class04606;
import minecraft.class04651;
import minecraft.class04688;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05042;
import minecraft.class05096;
import minecraft.class05207;
import minecraft.class05363;
import minecraft.class05474;
import minecraft.class05630;
import minecraft.class05917;
import minecraft.class05946;
import minecraft.class06024;
import minecraft.class06069;
import minecraft.class06153;
import minecraft.class06202;
import minecraft.class06229;
import minecraft.class06511;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06683;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class06918;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07062;
import minecraft.class07072;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07282;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07328;
import minecraft.class07334;
import minecraft.class07376;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07713;
import minecraft.class07769;
import minecraft.class07878;
import minecraft.class08036;
import minecraft.class08050;
import minecraft.class08057;
import minecraft.class08542;
import minecraft.class08546;
import minecraft.class08694;
import minecraft.class08700;
import minecraft.class09033;
import net.caffeinemc.mods.lithium.common.client.ClientWorldAccessor;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTracker;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.caffeinemc.mods.sodium.client.world.BiomeSeedProvider;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.impl.client.rendering.ColorResolverRegistryImpl;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class03448
extends class07299
implements class08542<class03448>,
ClientWorldAccessor,
ChunkTrackerHolder,
BiomeSeedProvider {
    private static final Logger M = LogUtils.getLogger();
    public static final class00392 N = class00392.L((String)"multiplayer.status.quitting");
    private static final double B = 0.05;
    private static final int Z = 10;
    private static final int z = 1000;
    final class01139 y;
    private final class01115<class07049> U;
    private final class01683 E;
    private final class03063 W;
    private final class02417 m;
    public final class03427 L;
    private final class03106 P;
    private final @Nullable class00917 s;
    private final class06202 T;
    final List<class04477> u;
    final List<class00695> i;
    private final Map<class02265, class07769> b;
    private int j;
    private final Object2ObjectArrayMap<class03202, class05917> v;
    private final class01688 n;
    private final Deque<Runnable> t;
    private int G;
    private class01909 l;
    private final Set<class00394> d;
    private final class00933 w;
    private final class08057 k;
    private final class00616 Y;
    private final int Q;
    private boolean O;
    private static final Set<class06581> g = Set.of(class06570.Zn, class06570.Zt);
    private final Reference2ReferenceMap I = ColorResolverRegistryImpl.createCustomCacheMap(class032022 -> new class05917(class072092 -> this.N((class07209)class072092, (class03202)class032022)));
    private class09326 J;
    private long o;
    private final ChunkTracker q = new ChunkTracker();

    private void L(CallbackInfo callbackInfo) {
        ObjectIterator objectIterator = this.I.values().iterator();
        while (objectIterator.hasNext()) {
            ((class05917)objectIterator.next()).N();
        }
    }

    public Set<class00394> L() {
        return this.d;
    }

    public void L(class07049 class070492) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.y(class070492, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class070492.method_22862();
        ++class070492.field_6012;
        class08700.N().N(() -> class04206.M.y((Object)class070492.method_5864()).toString());
        class070492.method_5773();
        class08700.N().L();
        class07049 class070493 = class070492;
        for (class07049 class070494 : this.N(class070493, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[net.minecraft.class_1297]");
            return ((class07049)objectArray[0]).method_5685();
        })) {
            this.N(class070492, class070494);
        }
    }

    public Iterable<class07049> M() {
        return this.method_31592().N();
    }

    private void M(class07049 class070492) {
        IEntity iEntity = (IEntity)class070492;
        int n = class04995.N((double)(class070492.method_23317() / 16.0));
        int n2 = class04995.N((double)(class070492.method_23321() / 16.0));
        if (!(iEntity.viaFabricPlus$isInLoadedChunkAndShouldTick() && class070492.method_31476().B == n && class070492.method_31476().Z == n2 || this.method_8497(n, n2).O())) {
            iEntity.viaFabricPlus$setInLoadedChunkAndShouldTick(true);
        }
    }

    public int P() {
        return this.G;
    }

    private @Nullable class00891 T() {
        class06581 class065812;
        if (((class03443)this.T.T_2).U() == class07282.field_9220 && g.contains(class065812 = ((class04453)this.T.T_4).method_6047().B()) && class065812 instanceof class06918) {
            return ((class06918)class065812).L();
        }
        return null;
    }

    public void method_32888(class03556<class01194> class035562, class06889 class068892, class01164 class011642) {
    }

    public class08057 method_8621() {
        return this.k;
    }

    public class05042 method_74854() {
        return this.field_9232.N();
    }

    public class00616 method_75728() {
        return this.Y;
    }

    public void method_8406(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6) {
        this.N(class071262, class071262.method_10295().method_10299(), false, d, d2, d3, d4, d5, d6);
    }

    public class06683 method_8428() {
        return this.E.l();
    }

    public List<class04477> method_18456() {
        return this.u;
    }

    public class03448(class01683 class016832, class03427 class034272, class05946<class07299> class059462, class03556<class07376> class035562, int n, int n2, class03063 class030632, boolean bl, long l, int n3) {
        super((class05207)class034272, class059462, (class01042)class016832.j(), class035562, true, bl, l, 1000000);
        this.y = new class01139();
        this.U = new class01115(class07049.class, (class01109)new class03455(this));
        this.T = class06202.Nq();
        this.u = Lists.newArrayList();
        this.i = Lists.newArrayList();
        this.b = Maps.newHashMap();
        this.v = (Object2ObjectArrayMap)class07536.N((Object)new Object2ObjectArrayMap(3), (T object2ObjectArrayMap) -> {
            object2ObjectArrayMap.put((Object)class06229.N, (Object)new class05917(class072092 -> this.N((class07209)class072092, class06229.N)));
            object2ObjectArrayMap.put((Object)class06229.y, (Object)new class05917(class072092 -> this.N((class07209)class072092, class06229.y)));
            object2ObjectArrayMap.put((Object)class06229.L, (Object)new class05917(class072092 -> this.N((class07209)class072092, class06229.L)));
            object2ObjectArrayMap.put((Object)class06229.u, (Object)new class05917(class072092 -> this.N((class07209)class072092, class06229.u)));
        });
        this.t = Queues.newArrayDeque();
        this.l = new class01909();
        this.d = new ReferenceOpenHashSet();
        this.w = new class00933();
        this.k = new class08057();
        this.E = class016832;
        this.n = new class01688(this, n);
        this.P = new class03106();
        this.L = class034272;
        this.W = class030632;
        this.Q = n3;
        this.m = new class02417(this.T, this);
        this.s = ((class07376)class035562.N()).L() ? new class00917() : null;
        this.method_27873(class05042.N(class059462, (class07209)new class07209(8, 64, 8), (float)0.0f, (float)0.0f));
        this.G = n2;
        this.Y = this.N(class00616.N()).N();
        this.method_8533();
        if (this.method_63020()) {
            this.method_8543();
        }
        this.N(class016832, class034272, class059462, class035562, n, n2, class030632, bl, l, n3, null);
        this.u((CallbackInfo)null);
    }

    public String toString() {
        return "ClientLevel";
    }

    public void B() {
        this.y((CallbackInfo)null);
        this.y.N(class070492 -> {
            if (class070492.method_31481() || class070492.method_5765() || this.P.N(class070492)) {
                return;
            }
            this.method_18472(this::L, (class07049)class070492);
        });
        this.N((CallbackInfo)null);
    }

    public void Z() {
        this.v.forEach((class032022, class059172) -> class059172.N());
        this.L((CallbackInfo)null);
    }

    public void i() {
        Runnable runnable;
        int n = this.t.size();
        int n2 = n < 1000 ? Math.max(10, n / 10) : n;
        for (int i = 0; i < n2 && (runnable = this.t.poll()) != null; ++i) {
            runnable.run();
        }
    }

    private int b() {
        return (Boolean)((class05630)this.T.i_7).y().method_41753() != false ? 0 : this.j;
    }

    private void s() {
        this.L.N(this.L.y() + 1L);
        if (this.O) {
            this.L.y(this.L.L() + 1L);
        }
    }

    protected Map<class02265, class07769> m() {
        return ImmutableMap.copyOf(this.b);
    }

    public class01688 method_8398() {
        return this.n;
    }

    public int z() {
        return this.U.y();
    }

    private void u(CallbackInfo callbackInfo) {
        if (DebugSettings.INSTANCE.disableSequencing.isEnabled()) {
            this.l = new PendingUpdateManager1_18_2();
        }
    }

    class01909 u() {
        return this.l;
    }

    public void u(class07049 class070492) {
        this.N(class070492.method_5628(), class07062.field_26999);
        this.U.N((class01135)class070492);
        this.N(class070492, (CallbackInfo)null);
    }

    public void y(int n, int n2, int n3, int n4, int n5, int n6) {
        this.W.N(n, n2, n3, n4, n5, n6);
    }

    public void y(int n) {
        this.G = n;
    }

    public void y(int n, int n2, int n3) {
        this.W.y(n, n2, n3);
    }

    private void y(double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2, boolean bl, long l, CallbackInfo callbackInfo) {
        if (this.J.y()) {
            callbackInfo.cancel();
        }
    }

    private boolean y(boolean bl) {
        if (WorldRenderingSettings.INSTANCE.shouldDisableDirectionalShading()) {
            return false;
        }
        return bl;
    }

    private void y(class07049 class070492, CallbackInfo callbackInfo) {
        IEntity iEntity = (IEntity)class070492;
        if (!iEntity.viaFabricPlus$isInLoadedChunkAndShouldTick() && !class070492.method_7325()) {
            class070492.method_22862();
            this.M(class070492);
            if (iEntity.viaFabricPlus$isInLoadedChunkAndShouldTick()) {
                for (class07049 class070493 : class070492.method_5685()) {
                    this.N(class070492, class070493);
                }
            }
            callbackInfo.cancel();
        }
    }

    public boolean y(class07049 class070492) {
        return this.y.L(class070492);
    }

    private void y(CallbackInfo callbackInfo) {
        ((ClientTickEvents.StartWorldTick)ClientTickEvents.START_WORLD_TICK.invoker()).onStartTick(this);
    }

    public List<class00695> method_65097() {
        return this.i;
    }

    public void N(class08546<class03448, ?> class085462) {
        this.E.N(class085462);
    }

    private void N(class00570 class005702, CallbackInfo callbackInfo) {
        class07321 class073212 = class005702.R();
        this.q.onChunkStatusRemoved(class073212.B, class073212.Z, 3);
    }

    private void N(class01683 class016832, class03427 class034272, class05946 class059462, class03556 class035562, int n, int n2, class03063 class030632, boolean bl, long l, int n3, CallbackInfo callbackInfo) {
        this.o = l;
    }

    public void N(class06889 class068892, float f, int n, class04540<class00931> class045402) {
        this.w.N(class068892, f, n, class045402);
    }

    private class00040 N(class04891 class048912, class04911 class049112, float f, float f2, class06069 class060692, double d, double d2, double d3, Operation operation) {
        this.J = class09326.N((class04891)class048912, (class04911)class049112, (float)f, (float)f2, (double)d, (double)d2, (double)d3);
        class11938.L().L((Object)this.J);
        return (class00040)operation.call(new Object[]{this.J.Z(), this.J.L(), Float.valueOf(this.J.R()), Float.valueOf(this.J.i()), class060692, this.J.M(), this.J.u(), this.J.B()});
    }

    private void N(class07049 class070492, class07049 class070493, CallbackInfo callbackInfo) {
        IEntity iEntity = (IEntity)class070493;
        if (!iEntity.viaFabricPlus$isInLoadedChunkAndShouldTick()) {
            if (class070493.method_31481() || class070493.method_5854() != class070492) {
                class070493.method_5848();
            } else if (class070493 instanceof class08036 || this.y.L(class070493)) {
                class070493.method_22862();
                this.M(class070493);
                if (iEntity.viaFabricPlus$isInLoadedChunkAndShouldTick()) {
                    for (class07049 class070494 : class070493.method_5685()) {
                        this.N(class070493, class070494);
                    }
                }
            }
            callbackInfo.cancel();
        }
    }

    private List N(class07049 class070492, Operation operation) {
        this.M(class070492);
        if (((IEntity)class070492).viaFabricPlus$isInLoadedChunkAndShouldTick()) {
            return (List)operation.call(new Object[]{class070492});
        }
        return List.of();
    }

    public int N(class07209 class072092, class03202 class032022) {
        int n = (Integer)((class05630)class06202.Nq().i_7).a().method_41753();
        if (n == 0) {
            return class032022.getColor((class00780)this.i(class072092).N(), (double)class072092.method_10263(), (double)class072092.method_10260());
        }
        int n2 = (n * 2 + 1) * (n * 2 + 1);
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        class06153 class061532 = new class06153(class072092.method_10263() - n, class072092.method_10264(), class072092.method_10260() - n, class072092.method_10263() + n, class072092.method_10264(), class072092.method_10260() + n);
        class07218 class072182 = new class07218();
        while (class061532.N()) {
            class072182.N(class061532.y(), class061532.L(), class061532.u());
            int n6 = class032022.getColor((class00780)this.i((class07209)class072182).N(), (double)class072182.method_10263(), (double)class072182.method_10260());
            n3 += (n6 & 0xFF0000) >> 16;
            n4 += (n6 & 0xFF00) >> 8;
            n5 += n6 & 0xFF;
        }
        return (n3 / n2 & 0xFF) << 16 | (n4 / n2 & 0xFF) << 8 | n5 / n2 & 0xFF;
    }

    public void N(class07209 class072092, class07211 class072112) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class072092, class072112, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        class00500 class005002 = this.method_8320(class072092);
        if (class005002.b() == class06898.field_11455 || !class005002.g()) {
            return;
        }
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        float f = 0.1f;
        class00734 class007342 = class005002.R((class07290)this, class072092).method_1107();
        double d = (double)n + this.field_9229.U() * (class007342.u - class007342.N - (double)0.2f) + (double)0.1f + class007342.N;
        double d2 = (double)n2 + this.field_9229.U() * (class007342.i - class007342.y - (double)0.2f) + (double)0.1f + class007342.y;
        double d3 = (double)n3 + this.field_9229.U() * (class007342.R - class007342.L - (double)0.2f) + (double)0.1f + class007342.L;
        if (class072112 == class07211.field_11033) {
            d2 = (double)n2 + class007342.y - (double)0.1f;
        }
        if (class072112 == class07211.field_11036) {
            d2 = (double)n2 + class007342.i + (double)0.1f;
        }
        if (class072112 == class07211.field_11043) {
            d3 = (double)n3 + class007342.L - (double)0.1f;
        }
        if (class072112 == class07211.field_11035) {
            d3 = (double)n3 + class007342.R + (double)0.1f;
        }
        if (class072112 == class07211.field_11039) {
            d = (double)n + class007342.N - (double)0.1f;
        }
        if (class072112 == class07211.field_11034) {
            d = (double)n + class007342.u + (double)0.1f;
        }
        ((class04410)this.T.i_0).N(new class03989(this, d, d2, d3, 0.0, 0.0, 0.0, class005002, class072092).method_3075(0.2f).method_3087(0.6f));
    }

    protected void N(Map<class02265, class07769> map) {
        this.b.putAll(map);
    }

    public void N(class07209 class072092, class00500 class005002, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().particleSettings.particles || !SodiumExtraClientMod.options().particleSettings.blockBreak) {
            callbackInfo.cancel();
        }
    }

    public void N(class07209 class072092, class07211 class072112, CallbackInfo callbackInfo) {
        if (!SodiumExtraClientMod.options().particleSettings.particles || !SodiumExtraClientMod.options().particleSettings.blockBreaking) {
            callbackInfo.cancel();
        }
    }

    private void N(class07321 class073212, CallbackInfo callbackInfo) {
        ObjectIterator objectIterator = this.I.values().iterator();
        while (objectIterator.hasNext()) {
            ((class05917)objectIterator.next()).N(class073212.B, class073212.Z);
        }
    }

    private Object N(Object object, class07209 class072092, class03202 class032022) {
        if (object == null && (object = this.I.get((Object)class032022)) == null) {
            throw new UnsupportedOperationException("ClientWorld.getColor called with unregistered ColorResolver " + String.valueOf(class032022));
        }
        return object;
    }

    public void N(CallbackInfo callbackInfo) {
        ((ClientTickEvents.EndWorldTick)ClientTickEvents.END_WORLD_TICK.invoker()).onEndTick(this);
    }

    private void N(double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2, boolean bl, long l, CallbackInfo callbackInfo) {
        if (this.J.y()) {
            callbackInfo.cancel();
        }
    }

    private void N(class07049 class070492, CallbackInfo callbackInfo) {
        class11371 class113712 = class11371.N((class07049)class070492);
        class11938.L().L((Object)class113712);
    }

    private void N(int n, class07062 class070622, CallbackInfo callbackInfo, class07049 class070492) {
        class11396 class113962 = class11396.N((class07049)class070492);
        class11938.L().L((Object)class113962);
    }

    private void N(class07049 class070492, class07049 class070493) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class070492, class070493, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (class070493.method_31481() || class070493.method_5854() != class070492) {
            class070493.method_5848();
            return;
        }
        if (!(class070493 instanceof class08036) && !this.y.L(class070493)) {
            return;
        }
        class070493.method_22862();
        ++class070493.field_6012;
        class070493.method_5842();
        for (class07049 class070494 : class070493.method_5685()) {
            this.N(class070493, class070494);
        }
    }

    public void N(long l, long l2, boolean bl) {
        this.L.N(l);
        this.L.y(l2);
        this.O = bl;
    }

    public void N(int n, int n2, int n3) {
        int n4 = 32;
        class06069 class060692 = class06069.u();
        class00891 class008912 = this.T();
        class07218 class072182 = new class07218();
        for (int i = 0; i < 667; ++i) {
            this.N(n, n2, n3, 16, class060692, class008912, class072182);
            this.N(n, n2, n3, 32, class060692, class008912, class072182);
        }
    }

    public void N(int n, int n2, int n3, int n4, class06069 class060692, @Nullable class00891 class008912, class07218 class072182) {
        int n5 = n + this.field_9229.y(n4) - this.field_9229.y(n4);
        int n6 = n2 + this.field_9229.y(n4) - this.field_9229.y(n4);
        int n7 = n3 + this.field_9229.y(n4) - this.field_9229.y(n4);
        class072182.N(n5, n6, n7);
        class00500 class005002 = this.method_8320((class07209)class072182);
        class005002.i().N_20(class005002, (class07299)this, (class07209)class072182, class060692);
        class04688 class046882 = this.method_8316((class07209)class072182);
        if (!class046882.W()) {
            class046882.N((class07299)this, (class07209)class072182, class060692);
            class07126 class071262 = class046882.Z();
            if (class071262 != null && this.field_9229.y(10) == 0) {
                boolean bl = class005002.L((class07290)this, (class07209)class072182, class07211.field_11033);
                class07209 class072092 = class072182.method_10074();
                this.N(class072092, this.method_8320(class072092), class071262, bl);
            }
        }
        if (class008912 == class005002.i()) {
            this.method_8406((class07126)new class07105(class07107.L, class005002), (double)n5 + 0.5, (double)n6 + 0.5, (double)n7 + 0.5, 0.0, 0.0, 0.0);
        }
        if (!class005002.W((class07290)this, (class07209)class072182)) {
            for (class06024 class060242 : (List)this.method_75728().N(class00608.n, (class07209)class072182)) {
                if (!class060242.N(this.field_9229)) continue;
                this.method_8406(class060242.N(), (double)class072182.method_10263() + this.field_9229.U(), (double)class072182.method_10264() + this.field_9229.U(), (double)class072182.method_10260() + this.field_9229.U(), 0.0, 0.0, 0.0);
            }
        }
    }

    public void N(BooleanSupplier booleanSupplier) {
        this.method_8533();
        if (this.method_54719().Z()) {
            this.method_8621().j();
            this.s();
        }
        if (this.j > 0) {
            this.method_8509(this.j - 1);
        }
        if (this.s != null) {
            this.s.N(this.N());
            if (this.s.L() && !((class05096)this.T.v_3 instanceof class04606)) {
                this.T.Nr().N((class00044)new class00918(class04909.IG, class04911.field_15252, this.field_9229, ((class03386)this.T.i_5).s(), this.s.N(), this.s.y()), 30);
            }
        }
        this.w.N(this);
        try (class08694 class086942 = class08700.N().i("blocks");){
            this.n.N(booleanSupplier, true);
        }
        class01834.M.N(this.T.Nx());
        this.method_75728().y();
    }

    private void N(class07209 class072092, class00500 class005002, class07126 class071262, boolean bl) {
        if (!class005002.Y().W()) {
            return;
        }
        class00494 class004942 = class005002.M((class07290)this, class072092);
        if (class004942.method_1105(class07185.field_11052) < 1.0) {
            if (bl) {
                this.N(class072092.method_10263(), class072092.method_10263() + 1, class072092.method_10260(), class072092.method_10260() + 1, (double)(class072092.method_10264() + 1) - 0.05, class071262);
            }
        } else if (!class005002.N(class01210.Ng)) {
            double d = class004942.method_1091(class07185.field_11052);
            if (d > 0.0) {
                this.N(class072092, class071262, class004942, (double)class072092.method_10264() + d - 0.05);
            } else {
                class07209 class072093 = class072092.method_10074();
                class00500 class005003 = this.method_8320(class072093);
                if (class005003.M((class07290)this, class072093).method_1105(class07185.field_11052) < 1.0 && class005003.Y().W()) {
                    this.N(class072092, class071262, class004942, (double)class072092.method_10264() - 0.05);
                }
            }
        }
    }

    public void N(long l) {
        this.W.N(l);
    }

    public void N(class07321 class073212) {
        this.v.forEach((class032022, class059172) -> class059172.N(class073212.B, class073212.Z));
        this.U.N(class073212);
        this.N(class073212, null);
    }

    public boolean N(int n, int n2) {
        return true;
    }

    public void N(int n, class07062 class070622) {
        class07049 class070492 = (class07049)this.method_31592().N(n);
        if (class070492 != null) {
            class070492.method_31745(class070622);
            this.N(n, class070622, null, class070492);
            class070492.method_36209();
        }
    }

    public void N(class02265 class022652, class07769 class077692) {
        this.b.put(class022652, class077692);
    }

    public void N(class00392 class003922) {
        this.E.M().method_10747(class003922);
    }

    public void N(class00570 class005702) {
        this.N(class005702, null);
        class005702.q();
        this.n.L().N(class005702.R(), false);
        this.U.y(class005702.R());
    }

    private class01315 N(boolean bl) {
        class01315 class013152 = (class01315)((class05630)this.T.i_7).NK().method_41753();
        if (bl && class013152 == class01315.field_18199 && this.field_9229.y(10) == 0) {
            class013152 = class01315.field_18198;
        }
        if (class013152 == class01315.field_18198 && this.field_9229.y(3) == 0) {
            class013152 = class01315.field_18199;
        }
        return class013152;
    }

    private void N(double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2, boolean bl, long l) {
        double d4 = ((class03386)this.T.i_5).s().y().L(d, d2, d3);
        double d5 = d3;
        double d6 = d2;
        double d7 = d;
        class06069 class060692 = class06069.y((long)l);
        float f3 = f2;
        float f4 = f;
        class04911 class049113 = class049112;
        class04891 class048913 = class048912;
        class00040 class000402 = this.N(class048913, class049113, f4, f3, class060692, d7, d6, d5, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)8, (String)"[net.minecraft.class_3414, net.minecraft.class_3419, float, float, net.minecraft.class_5819, double, double, double]");
            return new class00040((class04891)objectArray[0], (class04911)objectArray[1], ((Float)objectArray[2]).floatValue(), ((Float)objectArray[3]).floatValue(), (class06069)objectArray[4], ((Double)objectArray[5]).doubleValue(), ((Double)objectArray[6]).doubleValue(), ((Double)objectArray[7]).doubleValue());
        });
        if (bl && d4 > 100.0) {
            double d8 = Math.sqrt(d4) / 40.0;
            class09033 class090332 = this.T.Nr();
            int n = (int)(d8 * 20.0);
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.y(d, d2, d3, class048912, class049112, f, f2, bl, l, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class090332.N((class00044)class000402, n);
        } else {
            class09033 class090333 = this.T.Nr();
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            this.N(d, d2, d3, class048912, class049112, f, f2, bl, l, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            class090333.N((class00044)class000402);
        }
    }

    private void N(double d, double d2, double d3, double d4, double d5, class07126 class071262) {
        this.method_8406(class071262, class04995.u((double)this.field_9229.U(), (double)d, (double)d2), d5, class04995.u((double)this.field_9229.U(), (double)d3, (double)d4), 0.0, 0.0, 0.0);
    }

    public void N(int n) {
        if (class07529.C) {
            M.debug("ACK {}", (Object)n);
        }
        this.l.method_41938(n, this);
    }

    public void N(class07209 class072092, class00500 class005002, int n) {
        if (!this.l.method_41940(class072092, class005002)) {
            super.method_30092(class072092, class005002, n, 512);
        }
    }

    private void N(class07209 class072092, class07126 class071262, class00494 class004942, double d) {
        this.N((double)class072092.method_10263() + class004942.method_1091(class07185.field_11048), (double)class072092.method_10263() + class004942.method_1105(class07185.field_11048), (double)class072092.method_10260() + class004942.method_1091(class07185.field_11051), (double)class072092.method_10260() + class004942.method_1105(class07185.field_11051), d, class071262);
    }

    public void N(Runnable runnable) {
        this.t.add(runnable);
    }

    public void N(class07209 class072092, class00500 class005002, class06889 class068892) {
        if (this.method_8320(class072092) != class005002) {
            this.method_8652(class072092, class005002, 19);
            class04453 class044532 = (class04453)this.T.T_4;
            if (this == class044532.method_73183() && class044532.method_30632(class072092, class005002)) {
                class044532.method_30634(class068892.M, class068892.B, class068892.Z);
            }
        }
    }

    private void N(class07126 class071262, boolean bl, boolean bl2, double d, double d2, double d3, double d4, double d5, double d6) {
        try {
            class05363 class053632 = ((class03386)this.T.i_5).s();
            class01315 class013152 = this.N(bl2);
            if (bl) {
                ((class04410)this.T.i_0).N(class071262, d, d2, d3, d4, d5, d6);
                return;
            }
            if (class053632.y().L(d, d2, d3) > 1024.0) {
                return;
            }
            if (class013152 == class01315.field_18199) {
                return;
            }
            ((class04410)this.T.i_0).N(class071262, d, d2, d3, d4, d5, d6);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Exception while adding particle");
            class07074 class070742 = class070802.N("Particle being added");
            class070742.N("ID", (Object)class04206.z.y((Object)class071262.method_10295()));
            class070742.N("Parameters", () -> class07107.yE.encodeStart((DynamicOps)this.method_30349().N((DynamicOps)class07713.N), (Object)class071262).toString());
            class070742.N("Position", () -> class07074.N((class05474)this, (double)d, (double)d2, (double)d3));
            throw new class07878(class070802);
        }
    }

    private class00594 N(class00594 class005942) {
        class005942.N((class07299)this);
        int n4 = class02566.N((int)204, (int)204, (int)255);
        class005942.N(class00608.Z, (n2, n3) -> {
            if (this.b() > 0) {
                return class02566.N((float)0.22f, (int)n2, (int)n4);
            }
            return n2;
        });
        class005942.N(class00608.j, (f, n) -> Float.valueOf(this.b() > 0 ? 1.0f : f.floatValue()));
        return class005942;
    }

    public ChunkTracker sodium$getTracker() {
        return Objects.requireNonNull(this.q);
    }

    public class03427 method_8401() {
        return this.L;
    }

    public @Nullable class00917 R() {
        return this.s;
    }

    public class03106 method_54719() {
        return this.P;
    }

    public class03556<class00780> method_22387(int n, int n2, int n3) {
        return this.method_30349().L(class04227.NA).y(class00795.y);
    }

    public int method_8615() {
        return this.Q;
    }

    public void method_8465(@Nullable class07049 class070492, double d, double d2, double d3, class03556<class04891> class035562, class04911 class049112, float f, float f2, long l) {
        if (class070492 == (class04453)this.T.T_4) {
            this.N(d, d2, d3, (class04891)class035562.N(), class049112, f, f2, false, l);
        }
    }

    public void method_8517(int n, class07209 class072092, int n2) {
        this.W.N(n, class072092, n2);
    }

    public void method_8413(class07209 class072092, class00500 class005002, class00500 class005003, int n) {
        this.W.N((class07290)this, class072092, class005002, class005003, n);
    }

    protected class01124<class07049> method_31592() {
        return this.U.N();
    }

    public void method_8449(@Nullable class07049 class070492, class07049 class070493, class03556<class04891> class035562, class04911 class049112, float f, float f2, long l) {
        if (class070492 == (class04453)this.T.T_4) {
            this.T.Nr().N((class00044)new class00013((class04891)class035562.N(), class049112, f, f2, class070493, l));
        }
    }

    public void method_8444(@Nullable class07049 class070492, int n, class07209 class072092, int n2) {
        try {
            this.m.y(n, class072092, n2);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Playing level event");
            class07074 class070742 = class070802.N("Level event being played");
            class070742.N("Block coordinates", (Object)class07074.N((class05474)this, (class07209)class072092));
            class070742.N("Event source", (Object)class070492);
            class070742.N("Event type", (Object)n);
            class070742.N("Event data", (Object)n2);
            throw new class07878(class070802);
        }
    }

    public void method_8454(@Nullable class07049 class070492, @Nullable class07072 class070722, @Nullable class01284 class012842, double d, double d2, double d3, float f, boolean bl, class07328 class073282, class07126 class071262, class07126 class071263, class04540<class00931> class045402, class03556<class04891> class035562) {
    }

    public void method_8474(int n, class07209 class072092, int n2) {
        this.m.N(n, class072092, n2);
    }

    public @Nullable class07769 method_17891(class02265 class022652) {
        return this.b.get(class022652);
    }

    public @Nullable class07049 method_8469(int n) {
        return (class07049)this.method_31592().N(n);
    }

    public void method_27873(class05042 class050422) {
        this.field_9232.N(this.method_74891(class050422));
    }

    public class07074 method_8538(class07080 class070802) {
        class07074 class070742 = super.method_8538(class070802);
        class070742.N("Server brand", () -> ((class01683)((class04453)this.T.T_4).y_0).V());
        class070742.N("Server type", () -> this.T.Na() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
        class070742.N("Tracked entity count", () -> String.valueOf(this.z()));
        return class070742;
    }

    public float method_24852(class07211 class072112, boolean bl) {
        bl = this.y(bl);
        class07334 class073342 = this.method_8597().P();
        if (!bl) {
            return class073342 == class07334.field_64381 ? 0.9f : 1.0f;
        }
        return switch (class072112) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033 -> {
                if (class073342 == class07334.field_64381) {
                    yield 0.9f;
                }
                yield 0.5f;
            }
            case class07211.field_11036 -> {
                if (class073342 == class07334.field_64381) {
                    yield 0.9f;
                }
                yield 1.0f;
            }
            case class07211.field_11043, class07211.field_11035 -> 0.8f;
            case class07211.field_11039, class07211.field_11034 -> 0.6f;
        };
    }

    public String method_31419() {
        return "Chunks[C] W: " + this.n.N() + " E: " + this.U.L();
    }

    public class04298<class00891> method_8397() {
        return class04295.y();
    }

    public class06511 method_59547() {
        return this.E.d();
    }

    public class00272 method_8433() {
        return this.E.R();
    }

    public /* synthetic */ class00611 method_75598() {
        return this.method_75728();
    }

    public class03767 method_45162() {
        return this.E.G();
    }

    public void method_71970(class00394 class003942) {
        class03358 class033582 = this.T.K().N(class003942);
        if (class033582 != null && class033582.t_()) {
            this.d.add(class003942);
        }
    }

    public class02755 method_61269() {
        return this.E.w();
    }

    public /* synthetic */ class08050 method_8392(int n, int n2) {
        return super.method_8497(n, n2);
    }

    public class04298<class04651> method_8405() {
        return class04295.y();
    }

    public boolean method_30092(class07209 class072092, class00500 class005002, int n, int n2) {
        if (this.l.method_41943()) {
            class00500 class005003 = this.method_8320(class072092);
            boolean bl = super.method_30092(class072092, class005002, n, n2);
            if (bl) {
                this.l.method_41941(class072092, class005003, (class04453)this.T.T_4);
            }
            return bl;
        }
        return super.method_30092(class072092, class005002, n, n2);
    }

    public void method_16109(class07209 class072092, class00500 class005002, class00500 class005003) {
        this.W.N(class072092, class005002, class005003);
    }

    public void method_67392(class04891 class048912, class04911 class049112, float f, float f2) {
        if ((class04453)this.T.T_4 != null) {
            this.T.Nr().N((class00044)new class00013(class048912, class049112, f, f2, (class07049)((class04453)this.T.T_4), this.field_9229.B()));
        }
    }

    public void method_8486(double d, double d2, double d3, class04891 class048912, class04911 class049112, float f, float f2, boolean bl) {
        this.N(d, d2, d3, class048912, class049112, f, f2, bl, this.field_9229.B());
    }

    public void method_55116(class07049 class070492, class04891 class048912, class04911 class049112, float f, float f2) {
        this.T.Nr().N((class00044)new class00013(class048912, class049112, f, f2, class070492, this.field_9229.B()));
    }

    public void method_31595(class07209 class072092, class00500 class005002) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.N(class072092, class005002, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (class005002.P() || !class005002.g()) {
            return;
        }
        class00494 class004942 = class005002.R((class07290)this, class072092);
        double d7 = 0.25;
        class004942.method_1089((d, d2, d3, d4, d5, d6) -> {
            double d7 = Math.min(1.0, d4 - d);
            double d8 = Math.min(1.0, d5 - d2);
            double d9 = Math.min(1.0, d6 - d3);
            int n = Math.max(2, class04995.L((double)(d7 / 0.25)));
            int n2 = Math.max(2, class04995.L((double)(d8 / 0.25)));
            int n3 = Math.max(2, class04995.L((double)(d9 / 0.25)));
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n2; ++j) {
                    for (int k = 0; k < n3; ++k) {
                        double d10 = ((double)i + 0.5) / (double)n;
                        double d11 = ((double)j + 0.5) / (double)n2;
                        double d12 = ((double)k + 0.5) / (double)n3;
                        double d13 = d10 * d7 + d;
                        double d14 = d11 * d8 + d2;
                        double d15 = d12 * d9 + d3;
                        ((class04410)this.T.i_0).N((class04406)new class03989(this, (double)class072092.method_10263() + d13, (double)class072092.method_10264() + d14, (double)class072092.method_10260() + d15, d10 - 0.5, d11 - 0.5, d12 - 0.5, class005002, class072092));
                    }
                }
            }
        });
    }

    public boolean method_38989(class07049 class070492) {
        return class070492.method_31476().N(((class04453)this.T.T_4).method_31476()) <= this.G;
    }

    public List<class07049> method_66349(class07049 class070492, class00734 class007342) {
        class04453 class044532 = (class04453)this.T.T_4;
        if (class044532 != null && class044532 != class070492 && class044532.method_5829().L(class007342) && class07042.N((class07049)class070492).test(class044532)) {
            return List.of(class044532);
        }
        return List.of();
    }

    public void method_8466(class07126 class071262, boolean bl, boolean bl2, double d, double d2, double d3, double d4, double d5, double d6) {
        this.N(class071262, class071262.method_10295().method_10299() || bl, bl2, d, d2, d3, d4, d5, d6);
    }

    public void method_17452(class07126 class071262, boolean bl, double d, double d2, double d3, double d4, double d5, double d6) {
        this.N(class071262, class071262.method_10295().method_10299() || bl, true, d, d2, d3, d4, d5, d6);
    }

    public void method_8494(class07126 class071262, double d, double d2, double d3, double d4, double d5, double d6) {
        this.N(class071262, false, true, d, d2, d3, d4, d5, d6);
    }

    public void method_8547(double d, double d2, double d3, double d4, double d5, double d6, List<class02827> list) {
        if (list.isEmpty()) {
            for (int i = 0; i < this.field_9229.y(3) + 2; ++i) {
                this.method_8406((class07126)class07107.NR, d, d2, d3, this.field_9229.E() * 0.05, 0.005, this.field_9229.E() * 0.05);
            }
        } else {
            ((class04410)this.T.i_0).N((class04406)new class04303(this, d, d2, d3, d4, d5, d6, (class04410)this.T.i_0, list));
        }
    }

    public void method_8509(int n) {
        this.j = n;
    }

    public int method_67233(class07209 class072092) {
        return class06202.Nq().d().N(this.method_8320(class072092), (class07295)this, class072092, 0);
    }

    public void method_8522(class00381<?> class003812) {
        this.E.N(class003812);
    }

    public int method_23752(class07209 class072092, class03202 class032022) {
        return ((class05917)this.N(this.v.get((Object)class032022), class072092, class032022)).N(class072092);
    }

    public long sodium$getBiomeZoomSeed() {
        return this.o;
    }

    public class01115 lithium$getEntityManager() {
        return this.U;
    }
}


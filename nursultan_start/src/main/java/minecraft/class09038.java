/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2FloatMap
 *  it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap
 *  minecraft.class00002
 *  minecraft.class00018
 *  minecraft.class00034
 *  minecraft.class00044
 *  minecraft.class00122
 *  minecraft.class00137
 *  minecraft.class01894
 *  minecraft.class02857
 *  minecraft.class03836
 *  minecraft.class04206
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class06292
 *  minecraft.class06297
 *  minecraft.class06299
 *  minecraft.class06310
 *  minecraft.class06311
 *  minecraft.class06313
 *  minecraft.class06319
 *  minecraft.class06323
 *  minecraft.class06889
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class09010
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 */
package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2FloatMap;
import it.unimi.dsi.fastutil.objects.Object2FloatOpenHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00002;
import minecraft.class00018;
import minecraft.class00034;
import minecraft.class00044;
import minecraft.class00122;
import minecraft.class00137;
import minecraft.class01894;
import minecraft.class02857;
import minecraft.class03836;
import minecraft.class04206;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class06292;
import minecraft.class06297;
import minecraft.class06299;
import minecraft.class06310;
import minecraft.class06311;
import minecraft.class06313;
import minecraft.class06319;
import minecraft.class06323;
import minecraft.class06889;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class09010;
import minecraft.class09026;
import minecraft.class09033;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

@Environment(value=EnvType.CLIENT)
public class class09038 {
    private static final Marker u = MarkerFactory.getMarker((String)"SOUNDS");
    private static final Logger i = LogUtils.getLogger();
    private static final float R = 0.5f;
    private static final float M = 2.0f;
    private static final float B = 0.0f;
    private static final float Z = 1.0f;
    private static final int z = 20;
    private static final Set<class01894> U = Sets.newHashSet();
    private static final long E = 1000L;
    public static final String N = "FOR THE DEBUG!";
    public static final String y = "OpenAL Soft on ";
    public static final int L = "OpenAL Soft on ".length();
    private final class09033 W;
    private final class05630 m;
    private boolean P;
    private final class06313 s = new class06313();
    private final class06310 T = this.s.i();
    private final class06299 b;
    private final class06292 j = new class06292();
    private final class06323 v = new class06323(this.s, (Executor)this.j);
    private int n;
    private long t;
    private final AtomicReference<class09010> G = new AtomicReference<class09010>(class09010.field_35086);
    private final Map<class00044, class06311> l = Maps.newHashMap();
    private final Multimap<class04911, class00044> d = HashMultimap.create();
    private final Object2FloatMap<class04911> w = (Object2FloatMap)class07536.N((Object)new Object2FloatOpenHashMap(), (T object2FloatOpenHashMap) -> object2FloatOpenHashMap.defaultReturnValue(1.0f));
    private final List<class00034> k = Lists.newArrayList();
    private final Map<class00044, Integer> Y = Maps.newHashMap();
    private final Map<class00044, Integer> Q = Maps.newHashMap();
    private final List<class00122> O = Lists.newArrayList();
    private final List<class00034> g = Lists.newArrayList();
    private final List<class00002> I = Lists.newArrayList();

    public void L() {
        if (this.P) {
            this.s.u();
        }
    }

    public class09026 L(class00044 class000442) {
        class00002 class000022;
        if (!this.P) {
            return class09026.field_60956;
        }
        if (!class000442.s()) {
            return class09026.field_60956;
        }
        class00137 class001372 = class000442.N(this.W);
        class01894 class018942 = class000442.L();
        if (class001372 == null) {
            if (U.add(class018942)) {
                i.warn(u, "Unable to play unknown soundEvent: {}", (Object)class018942);
            }
            if (!class07529.Nq) {
                return class09026.field_60956;
            }
            class001372 = new class00137(class018942, N);
        }
        if ((class000022 = class000442.u()) == class09033.i) {
            return class09026.field_60956;
        }
        if (class000022 == class09033.y) {
            if (U.add(class018942)) {
                i.warn(u, "Unable to play empty soundEvent: {}", (Object)class018942);
            }
            return class09026.field_60956;
        }
        float f = class000442.B();
        float f2 = Math.max(f, 1.0f) * (float)class000022.Z();
        class04911 class049112 = class000442.i();
        float f3 = this.N(f, class049112);
        float f4 = this.M(class000442);
        class00018 class000182 = class000442.W();
        boolean bl = class000442.m();
        if (!this.O.isEmpty()) {
            float f5 = bl || class000182 == class00018.field_5478 ? Float.POSITIVE_INFINITY : f2;
            for (class00122 class001222 : this.O) {
                class001222.N(class000442, class001372, f5);
            }
        }
        boolean bl2 = false;
        if (f3 == 0.0f) {
            if (class000442.w_() || class049112 == class04911.field_15253) {
                bl2 = true;
            } else {
                i.debug(u, "Skipped playing sound {}, volume was zero.", (Object)class000022.N());
                return class09026.field_60956;
            }
        }
        class06889 class068892 = new class06889(class000442.z(), class000442.U(), class000442.E());
        boolean bl3 = class09038.R(class000442);
        boolean bl4 = class000022.M();
        class06311 class063112 = (class06311)this.v.N(class000022.M() ? class06319.field_18353 : class06319.field_18352).join();
        if (class063112 == null) {
            if (class07529.ND) {
                i.warn("Failed to create new sound handle");
            }
            return class09026.field_60956;
        }
        i.debug(u, "Playing sound {} for event {}", (Object)class000022.N(), (Object)class018942);
        this.Q.put(class000442, this.n + 20);
        this.l.put(class000442, class063112);
        this.d.put((Object)class049112, (Object)class000442);
        class063112.N((T class062972) -> {
            class062972.N(f4);
            class062972.y(f3);
            if (class000182 == class00018.field_5476) {
                class062972.L(f2);
            } else {
                class062972.Z();
            }
            class062972.N(bl3 && !bl4);
            class062972.N(class068892);
            class062972.y(bl);
        });
        if (!bl4) {
            this.b.N(class000022.y()).thenAccept(class063122 -> class063112.N((T class062972) -> {
                class062972.N(class063122);
                class062972.L();
            }));
        } else {
            boolean bl5 = bl3;
            class01894 class018943 = class000022.y();
            class06299 class062992 = this.b;
            this.N(class062992, class018943, bl5, class000442).thenAccept(class063042 -> class063112.N((T class062972) -> {
                class062972.N(class063042);
                class062972.L();
            }));
        }
        if (class000442 instanceof class00034) {
            this.k.add((class00034)class000442);
        }
        if (bl2) {
            return class09026.field_60955;
        }
        return class09026.field_60954;
    }

    public List<String> M() {
        return this.s.M();
    }

    private float M(class00044 class000442) {
        return class04995.N((float)class000442.Z(), (float)0.5f, (float)2.0f);
    }

    public class09038(class09033 class090332, class05630 class056302, class02857 class028572) {
        this.W = class090332;
        this.m = class056302;
        this.b = new class06299(class028572);
    }

    public class03836 B() {
        return this.T.y();
    }

    private float B(class00044 class000442) {
        return this.N(class000442.B(), class000442.i());
    }

    private synchronized void Z() {
        if (this.P) {
            return;
        }
        try {
            String string = (String)this.m.Ne().method_41753();
            this.s.N("".equals(string) ? null : string, ((Boolean)this.m.NE().method_41753()).booleanValue());
            this.T.N();
            this.b.N(this.I).thenRun(this.I::clear);
            this.P = true;
            i.info(u, "Sound engine started");
        }
        catch (RuntimeException runtimeException) {
            i.error(u, "Error starting SoundSystem. Turning off sounds & music", (Throwable)runtimeException);
        }
    }

    private static boolean i(class00044 class000442) {
        return class000442.R() && class09038.u(class000442);
    }

    public void i() {
        if (this.P) {
            this.v.N((T stream) -> stream.forEach(class06297::i));
        }
    }

    private void U() {
        ++this.n;
        this.g.stream().filter(class00044::s).forEach(this::L);
        this.g.clear();
        for (class00034 object2 : this.k) {
            if (!object2.s()) {
                this.N((class00044)object2);
            }
            object2.P();
            if (object2.N()) {
                this.N((class00044)object2);
                continue;
            }
            float f = this.B((class00044)object2);
            float f2 = this.M((class00044)object2);
            class06889 class068892 = new class06889(object2.z(), object2.U(), object2.E());
            class06311 class063112 = this.l.get(object2);
            if (class063112 == null) continue;
            class063112.N((T class062972) -> {
                class062972.y(f);
                class062972.N(f2);
                class062972.N(class068892);
            });
        }
        Iterator<Object> iterator = this.l.entrySet().iterator();
        while (iterator.hasNext()) {
            int n;
            Map.Entry entry = (Map.Entry)iterator.next();
            class06311 class063113 = (class06311)entry.getValue();
            class00044 class000442 = (class00044)entry.getKey();
            if (!class063113.N() || (n = this.Q.get(class000442).intValue()) > this.n) continue;
            if (class09038.i(class000442)) {
                this.Y.put(class000442, this.n + class000442.M());
            }
            iterator.remove();
            i.debug(u, "Removed channel {} because it's not playing anymore", (Object)class063113);
            this.Q.remove(class000442);
            try {
                this.d.remove((Object)class000442.i(), (Object)class000442);
            }
            catch (RuntimeException runtimeException) {
                // empty catch block
            }
            if (!(class000442 instanceof class00034)) continue;
            this.k.remove(class000442);
        }
        Iterator<Map.Entry<class00044, Integer>> iterator2 = this.Y.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<class00044, Integer> entry = iterator2.next();
            if (this.n < entry.getValue()) continue;
            class00044 class000443 = entry.getKey();
            if (class000443 instanceof class00034) {
                ((class00034)class000443).P();
            }
            this.L(class000443);
            iterator2.remove();
        }
    }

    private boolean z() {
        if (this.s.B()) {
            i.info("Audio device was lost!");
            return true;
        }
        long l = class07536.L();
        if (l - this.t >= 1000L) {
            this.t = l;
            if (this.G.compareAndSet(class09010.field_35086, class09010.field_35084)) {
                String string = (String)this.m.Ne().method_41753();
                class07536.Z().execute(() -> {
                    if ("".equals(string)) {
                        if (this.s.L()) {
                            i.info("System default audio device has changed!");
                            this.G.compareAndSet(class09010.field_35084, class09010.field_35085);
                        }
                    } else if (!this.s.y().equals(string) && this.s.M().contains(string)) {
                        i.info("Preferred audio device has become available!");
                        this.G.compareAndSet(class09010.field_35084, class09010.field_35085);
                    }
                    this.G.compareAndSet(class09010.field_35084, class09010.field_35086);
                });
            }
        }
        return this.G.compareAndSet(class09010.field_35085, class09010.field_35086);
    }

    public void u() {
        if (this.P) {
            this.j.N();
            this.l.clear();
            this.v.y();
            this.Y.clear();
            this.k.clear();
            this.d.clear();
            this.Q.clear();
            this.g.clear();
            this.w.clear();
            this.j.y();
        }
    }

    private static boolean u(class00044 class000442) {
        return class000442.M() > 0;
    }

    public boolean y(class00044 class000442) {
        if (!this.P) {
            return false;
        }
        if (this.Q.containsKey(class000442) && this.Q.get(class000442) <= this.n) {
            return true;
        }
        return this.l.containsKey(class000442);
    }

    public void y() {
        if (this.P) {
            this.u();
            this.b.N();
            this.s.u();
            this.P = false;
        }
    }

    public void y(class00122 class001222) {
        this.O.remove(class001222);
    }

    private void E() {
        Iterator<Map.Entry<class00044, class06311>> var1 = this.l.entrySet().iterator();
        while (var1.hasNext()) {
            Map.Entry<class00044, class06311> entry = var1.next();
            class06311 class063112 = entry.getValue();
            class00044 class000442 = entry.getKey();
            if (class000442.i() != class04911.field_15253 || !class063112.N()) continue;
            var1.remove();
            i.debug(u, "Removed channel {} because it's not playing anymore", (Object)class063112);
            this.Q.remove(class000442);
            this.d.remove((Object)class000442.i(), (Object)class000442);
        }
    }

    private CompletableFuture N(class06299 class062992, class01894 class018942, boolean bl, class00044 class000442) {
        return class000442.getAudioStream(class062992, class018942, bl);
    }

    public void N() {
        U.clear();
        for (class04891 class048912 : class04206.y) {
            class01894 class018942;
            if (class048912 == class04909.vk || this.W.N(class018942 = class048912.N()) != null) continue;
            i.warn("Missing sound for event: {}", (Object)class04206.y.y((Object)class048912));
            U.add(class018942);
        }
        this.y();
        this.Z();
    }

    public void N(class00034 class000342) {
        this.g.add(class000342);
    }

    public void N(class00002 class000022) {
        this.I.add(class000022);
    }

    public void N(class00044 class000442) {
        class06311 class063112;
        if (this.P && (class063112 = this.l.get(class000442)) != null) {
            class063112.N(class06297::R);
        }
    }

    private float N(float f, class04911 class049112) {
        return class04995.N((float)f, (float)0.0f, (float)1.0f) * class04995.N((float)this.m.N(class049112), (float)0.0f, (float)1.0f) * this.w.getFloat((Object)class049112);
    }

    public void N(class04911 class049112, float f) {
        this.w.put((Object)class049112, class04995.N((float)f, (float)0.0f, (float)1.0f));
        this.N(class049112);
    }

    public void N(boolean bl) {
        if (this.z()) {
            this.N();
        }
        if (!bl) {
            this.U();
        } else {
            this.E();
        }
        this.v.N();
    }

    public void N(class00122 class001222) {
        this.O.add(class001222);
    }

    public void N(class04911 class049112) {
        if (!this.P) {
            return;
        }
        this.l.forEach((class000442, class063112) -> {
            if (class049112 == class000442.i() || class049112 == class04911.field_15250) {
                float f = this.B((class00044)class000442);
                class063112.N((T class062972) -> class062972.y(f));
            }
        });
    }

    public void N(@Nullable class01894 class018942, @Nullable class04911 class049112) {
        if (class049112 != null) {
            for (class00044 class000442 : this.d.get((Object)class049112)) {
                if (class018942 != null && !class000442.L().equals((Object)class018942)) continue;
                this.N(class000442);
            }
        } else if (class018942 == null) {
            this.u();
        } else {
            for (class00044 class000443 : this.l.keySet()) {
                if (!class000443.L().equals((Object)class018942)) continue;
                this.N(class000443);
            }
        }
    }

    public void N(class05363 class053632) {
        if (!this.P || !class053632.Z()) {
            return;
        }
        class03836 class038362 = new class03836(class053632.y(), new class06889(class053632.m()), new class06889(class053632.P()));
        this.j.execute(() -> this.T.N(class038362));
    }

    public void N(class04911 ... class04911Array) {
        if (!this.P) {
            return;
        }
        for (Map.Entry<class00044, class06311> entry : this.l.entrySet()) {
            if (List.of(class04911Array).contains(entry.getKey().i())) continue;
            entry.getValue().N(class06297::u);
        }
    }

    public void N(class00044 class000442, int n) {
        this.Y.put(class000442, this.n + n);
    }

    private static boolean R(class00044 class000442) {
        return class000442.R() && !class09038.u(class000442);
    }

    public String R() {
        return this.s.R();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10788
 *  Nursultan.class10791
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00679
 *  minecraft.class00768
 *  minecraft.class00831
 *  minecraft.class01226
 *  minecraft.class02195
 *  minecraft.class02265
 *  minecraft.class02484
 *  minecraft.class02685
 *  minecraft.class02716
 *  minecraft.class02719
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06555
 *  minecraft.class06584
 *  minecraft.class07085
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07326
 *  minecraft.class07511
 *  minecraft.class08036
 *  minecraft.class08413
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10788;
import Nursultan.class10791;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00679;
import minecraft.class00768;
import minecraft.class00831;
import minecraft.class01226;
import minecraft.class02195;
import minecraft.class02265;
import minecraft.class02484;
import minecraft.class02685;
import minecraft.class02716;
import minecraft.class02719;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06555;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07326;
import minecraft.class07511;
import minecraft.class08036;
import minecraft.class08413;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07769
extends class06555 {
    private static final Logger U = LogUtils.getLogger();
    private static final int E = 128;
    private static final int W = 64;
    public static final int N = 4;
    public static final int y = 256;
    private static final String m = "frame-";
    public static final Codec<class07769> L = RecordCodecBuilder.create(instance -> instance.group((App)class07299.field_25178.fieldOf("dimension").forGetter(class077692 -> class077692.R), (App)Codec.INT.fieldOf("xCenter").forGetter(class077692 -> class077692.u), (App)Codec.INT.fieldOf("zCenter").forGetter(class077692 -> class077692.i), (App)Codec.BYTE.optionalFieldOf("scale", (Object)0).forGetter(class077692 -> class077692.M), (App)Codec.BYTE_BUFFER.fieldOf("colors").forGetter(class077692 -> ByteBuffer.wrap(class077692.B)), (App)Codec.BOOL.optionalFieldOf("trackingPosition", (Object)true).forGetter(class077692 -> class077692.P), (App)Codec.BOOL.optionalFieldOf("unlimitedTracking", (Object)false).forGetter(class077692 -> class077692.s), (App)Codec.BOOL.optionalFieldOf("locked", (Object)false).forGetter(class077692 -> class077692.Z), (App)class07511.N.listOf().optionalFieldOf("banners", List.of()).forGetter(class077692 -> List.copyOf(class077692.j.values())), (App)class07326.N.listOf().optionalFieldOf("frames", List.of()).forGetter(class077692 -> List.copyOf(class077692.v.values()))).apply(instance, class07769::new));
    public final int u;
    public final int i;
    public final class05946<class07299> R;
    private final boolean P;
    private final boolean s;
    public final byte M;
    public byte[] B = new byte[16384];
    public final boolean Z;
    private final List<class10791> T = Lists.newArrayList();
    private final Map<class08036, class10791> b = Maps.newHashMap();
    private final Map<String, class07511> j = Maps.newHashMap();
    public final Map<String, class00768> z = Maps.newLinkedHashMap();
    private final Map<String, class07326> v = Maps.newHashMap();
    private int n;

    public Collection<class07511> L() {
        return this.j.values();
    }

    private class07769(int n, int n2, byte by, boolean bl, boolean bl2, boolean bl3, class05946<class07299> class059462) {
        this.M = by;
        this.u = n;
        this.i = n2;
        this.R = class059462;
        this.P = bl;
        this.s = bl2;
        this.Z = bl3;
    }

    private class07769(class05946<class07299> class059462, int n, int n2, byte by, ByteBuffer byteBuffer, boolean bl, boolean bl2, boolean bl3, List<class07511> list, List<class07326> list2) {
        this(n, n2, (byte)class04995.N((int)by, (int)0, (int)4), bl, bl2, bl3, class059462);
        if (byteBuffer.array().length == 16384) {
            this.B = byteBuffer.array();
        }
        for (class07511 class075112 : list) {
            this.j.put(class075112.y(), class075112);
            this.N((class03556<class02195>)class075112.N(), null, class075112.y(), class075112.L().method_10263(), class075112.L().method_10260(), 180.0, class075112.i().orElse(null));
        }
        for (class07326 class073262 : list2) {
            this.v.put(class073262.N(), class073262);
            this.N((class03556<class02195>)class00831.y, null, class07769.y(class073262.u()), class073262.y().method_10263(), class073262.y().method_10260(), class073262.L(), null);
        }
    }

    public Iterable<class00768> i() {
        return this.z.values();
    }

    public boolean u() {
        Iterator<class00768> var1 = this.z.values().iterator();
        while (var1.hasNext()) {
            if (!((class02195)var1.next().L().N()).i()) continue;
            return true;
        }
        return false;
    }

    private @Nullable class03556<class02195> y(float f, float f2) {
        int n = 320;
        if (Math.abs(f) < 320.0f && Math.abs(f2) < 320.0f) {
            return class00831.M;
        }
        return this.s ? class00831.B : null;
    }

    private static String y(int n) {
        return m + n;
    }

    private static boolean y(class08036 class080362) {
        for (class07085 class070852 : class07085.values()) {
            if (class070852 == class07085.field_6173 || class070852 == class07085.field_6171 || !class080362.method_6118(class070852).N(class01226.LX)) continue;
            return true;
        }
        return false;
    }

    public void y(int n, int n2, byte by) {
        this.B[n + n2 * 128] = by;
        this.N(n, n2);
    }

    private @Nullable Pair<class03556<class02195>, Byte> y(class03556<class02195> class035562, @Nullable class07284 class072842, double d, float f, float f2) {
        if (class07769.N(f, f2)) {
            return Pair.of(class035562, (Object)this.N(class072842, d));
        }
        class03556<class02195> var7 = this.y(f, f2);
        if (var7 == null) {
            return null;
        }
        return Pair.of(var7, (Object)0);
    }

    public class07769 y() {
        return class07769.N(this.u, this.i, (byte)class04995.N((int)(this.M + 1), (int)0, (int)4), this.P, this.s, this.R);
    }

    public static void N(class06584 class065842, class07209 class072092, String string, class03556<class02195> class035562) {
        class02685 class026852 = new class02685(class035562, (double)class072092.method_10263(), (double)class072092.method_10260(), 180.0f);
        class065842.N(class02484.C, (Object)class02719.N, class027192 -> class027192.N(string, class026852));
        if (((class02195)class035562.N()).N()) {
            class065842.N(class02484.A, (Object)new class02716(((class02195)class035562.N()).u()));
        }
    }

    private static Predicate<class06584> N(class06584 class065842) {
        class02265 class022652 = (class02265)class065842.method_58694(class02484.f);
        return class065843 -> {
            if (class065843 == class065842) {
                return true;
            }
            return class065843.N(class065842.B()) && Objects.equals(class022652, class065843.method_58694(class02484.f));
        };
    }

    private void N(String string) {
        class00768 class007682 = this.z.remove(string);
        if (class007682 != null && ((class02195)class007682.L().N()).R()) {
            --this.n;
        }
        this.R();
    }

    public void N(class08036 class080362, class06584 class065842) {
        Object object;
        class07326 class073262;
        class07209 class072092;
        if (!this.b.containsKey(class080362)) {
            class10791 class107912 = new class10791(this, class080362);
            this.b.put(class080362, class107912);
            this.T.add(class107912);
        }
        Predicate<class06584> var3 = class07769.N(class065842);
        if (!class080362.method_31548().y(var3)) {
            this.N(class080362.method_74861());
        }
        int n = 0;
        while (true) {
            List<class10791> var9 = this.T;
            Operation operation = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)1, (String)"[java.util.List]");
                return ((List)objectArray[0]).size();
            };
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class065842);
            class065842 = (class06584)localRefImpl.dispose();
            if (n >= this.N(var9, operation, (LocalRef)localRefImpl)) break;
            int n2 = n;
            List<class10791> list = this.T;
            Operation operation2 = objectArray -> {
                WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[java.util.List, int]");
                return ((List)objectArray[0]).get((Integer)objectArray[1]);
            };
            LocalRefImpl localRefImpl2 = new LocalRefImpl();
            LocalRefImpl localRefImpl3 = new LocalRefImpl();
            localRefImpl2.init((Object)class080362);
            localRefImpl3.init((Object)class065842);
            class065842 = (class06584)localRefImpl3.dispose();
            class080362 = (class08036)localRefImpl2.dispose();
            class072092 = (class10791)this.N(list, n2, operation2, (LocalRef)localRefImpl2, (LocalRef)localRefImpl3);
            class073262 = class072092.N;
            object = class073262.method_74861();
            if (class073262.method_31481() || !class073262.method_31548().y(var3) && !class065842.o()) {
                this.b.remove(class073262);
                this.T.remove(class072092);
                this.N((String)object);
            } else if (!class065842.o() && class073262.method_73183().method_27983() == this.R && this.P) {
                this.N((class03556<class02195>)class00831.N, (class07284)class073262.method_73183(), (String)object, class073262.method_23317(), class073262.method_23321(), class073262.method_36454(), null);
            }
            if (!class073262.equals((Object)class080362) && class07769.y((class08036)class073262)) {
                this.N((String)object);
            }
            ++n;
        }
        if (class065842.o() && this.P) {
            class00679 class006792 = class065842.q();
            class072092 = class006792.s();
            class073262 = this.v.get(class07326.N((class07209)class072092));
            if (class073262 != null && class006792.method_5628() != class073262.u() && this.v.containsKey(class073262.N())) {
                this.N(class07769.y(class073262.u()));
            }
            object = new class07326(class072092, class006792.method_5735().u() * 90, class006792.method_5628());
            this.N((class03556<class02195>)class00831.y, (class07284)class080362.method_73183(), class07769.y(class006792.method_5628()), class072092.method_10263(), class072092.method_10260(), class006792.method_5735().u() * 90, null);
            class07326 class073263 = this.v.put(object.N(), (class07326)object);
            if (!object.equals((Object)class073263)) {
                this.method_80();
            }
        }
        class02719 class027192 = (class02719)class065842.a_(class02484.C, (Object)class02719.N);
        if (!this.z.keySet().containsAll(class027192.N().keySet())) {
            class027192.N().forEach((string, class026852) -> {
                if (!this.z.containsKey(string)) {
                    this.N((class03556<class02195>)class026852.N(), (class07284)class080362.method_73183(), (String)string, class026852.y(), class026852.L(), class026852.u(), null);
                }
            });
        }
    }

    private Object N(List list, int n, Operation operation, class08036 class080362, class06584 class065842) {
        return class065842.o() ? Objects.requireNonNull(this.b.get(class080362)) : operation.call(new Object[]{list, n});
    }

    private int N(List list, Operation operation, LocalRef localRef) {
        return this.N(list, operation, (class06584)localRef.get());
    }

    private Object N(List list, int n, Operation operation, LocalRef localRef, LocalRef localRef2) {
        return this.N(list, n, operation, (class08036)localRef.get(), (class06584)localRef2.get());
    }

    public static class08413<class07769> N(class02265 class022652) {
        return new class08413(class022652.N(), () -> {
            throw new IllegalStateException("Should never create an empty map saved data");
        }, L, class05715.field_45079);
    }

    public class07769 N() {
        class07769 class077692 = new class07769(this.u, this.i, this.M, this.P, this.s, true, this.R);
        class077692.j.putAll(this.j);
        class077692.z.putAll(this.z);
        class077692.n = this.n;
        System.arraycopy(this.B, 0, class077692.B, 0, this.B.length);
        return class077692;
    }

    public static class07769 N(byte by, boolean bl, class05946<class07299> class059462) {
        return new class07769(0, 0, by, false, false, bl, class059462);
    }

    public static class07769 N(double d, double d2, byte by, boolean bl, boolean bl2, class05946<class07299> class059462) {
        int n = 128 * (1 << by);
        int n2 = class04995.N((double)((d + 64.0) / (double)n));
        int n3 = class04995.N((double)((d2 + 64.0) / (double)n));
        int n4 = n2 * n + n / 2 - 64;
        int n5 = n3 * n + n / 2 - 64;
        return new class07769(n4, n5, by, bl, bl2, false, class059462);
    }

    private int N(List list, Operation operation, class06584 class065842) {
        return class065842.o() ? 1 : (Integer)operation.call(new Object[]{list});
    }

    public boolean N(class07284 class072842, class07209 class072092) {
        double d = (double)class072092.method_10263() + 0.5;
        double d2 = (double)class072092.method_10260() + 0.5;
        int n = 1 << this.M;
        double d3 = (d - (double)this.u) / (double)n;
        double d4 = (d2 - (double)this.i) / (double)n;
        int n2 = 63;
        if (d3 >= -63.0 && d4 >= -63.0 && d3 <= 63.0 && d4 <= 63.0) {
            class07511 class075112 = class07511.N((class07290)class072842, (class07209)class072092);
            if (class075112 == null) {
                return false;
            }
            if (this.j.remove(class075112.y(), class075112)) {
                this.N(class075112.y());
                this.method_80();
                return true;
            }
            if (!this.N(256)) {
                this.j.put(class075112.y(), class075112);
                this.N((class03556<class02195>)class075112.N(), class072842, class075112.y(), d, d2, 180.0, class075112.i().orElse(null));
                this.method_80();
                return true;
            }
        }
        return false;
    }

    public void N(class07290 class072902, int n, int n2) {
        Iterator<class07511> var4 = this.j.values().iterator();
        while (var4.hasNext()) {
            class07511 class075112;
            class07511 class075113 = var4.next();
            if (class075113.L().method_10263() != n || class075113.L().method_10260() != n2 || class075113.equals((Object)(class075112 = class07511.N((class07290)class072902, (class07209)class075113.L())))) continue;
            var4.remove();
            this.N(class075113.y());
            this.method_80();
        }
    }

    private static boolean N(float f, float f2) {
        int n = 63;
        return f >= -63.0f && f2 >= -63.0f && f <= 63.0f && f2 <= 63.0f;
    }

    public void N(class07209 class072092, int n) {
        this.N(class07769.y(n));
        this.v.remove(class07326.N((class07209)class072092));
        this.method_80();
    }

    public boolean N(int n, int n2, byte by) {
        if (this.B[n + n2 * 128] != by) {
            this.y(n, n2, by);
            return true;
        }
        return false;
    }

    private static byte N(float f) {
        int n = 63;
        if (f <= -63.0f) {
            return -128;
        }
        if (f >= 63.0f) {
            return 127;
        }
        return (byte)((double)(f * 2.0f) + 0.5);
    }

    public @Nullable class00381<?> N(class02265 class022652, class08036 class080362) {
        class10791 class107912 = this.b.get(class080362);
        if (class107912 == null) {
            return null;
        }
        return class107912.N(class022652);
    }

    private void N(int n, int n2) {
        this.method_80();
        Iterator<class10791> var3 = this.T.iterator();
        while (var3.hasNext()) {
            var3.next().N(n, n2);
        }
    }

    public class10791 N(class08036 class080362) {
        class10791 class107912 = this.b.get(class080362);
        if (class107912 == null) {
            class107912 = new class10791(this, class080362);
            this.b.put(class080362, class107912);
            this.T.add(class107912);
        }
        return class107912;
    }

    public boolean N(int n) {
        return this.n >= n;
    }

    private void N(class03556<class02195> class035562, @Nullable class07284 class072842, String string, double d, double d2, double d3, @Nullable class00392 class003922) {
        class00768 class007682;
        int n = 1 << this.M;
        float f = (float)(d - (double)this.u) / (float)n;
        float f2 = (float)(d2 - (double)this.i) / (float)n;
        class10788 class107882 = this.N(class035562, class072842, d3, f, f2);
        if (class107882 == null) {
            this.N(string);
            return;
        }
        class00768 class007683 = new class00768(class107882.N(), class107882.y(), class107882.L(), class107882.u(), Optional.ofNullable(class003922));
        if (!class007683.equals((Object)(class007682 = this.z.put(string, class007683)))) {
            if (class007682 != null && ((class02195)class007682.L().N()).R()) {
                --this.n;
            }
            if (((class02195)class107882.N().N()).R()) {
                ++this.n;
            }
            this.R();
        }
    }

    private byte N(@Nullable class07284 class072842, double d) {
        if (this.R == class07299.field_25180 && class072842 != null) {
            int n = (int)(class072842.N() / 10L);
            return (byte)(n * n * 34187121 + n * 121 >> 15 & 0xF);
        }
        double d2 = d < 0.0 ? d - 8.0 : d + 8.0;
        return (byte)(d2 * 16.0 / 360.0);
    }

    public void N(List<class00768> list) {
        this.z.clear();
        this.n = 0;
        for (int i = 0; i < list.size(); ++i) {
            class00768 class007682 = list.get(i);
            this.z.put("icon-" + i, class007682);
            if (!((class02195)class007682.L().N()).R()) continue;
            ++this.n;
        }
    }

    private @Nullable class10788 N(class03556<class02195> class035562, @Nullable class07284 class072842, double d, float f, float f2) {
        byte by = class07769.N(f);
        byte by2 = class07769.N(f2);
        if (class035562.N(class00831.N)) {
            Pair<class03556<class02195>, Byte> var9 = this.y(class035562, class072842, d, f, f2);
            return var9 == null ? null : new class10788((class03556)var9.getFirst(), by, by2, ((Byte)var9.getSecond()).byteValue());
        }
        if (class07769.N(f, f2) || this.s) {
            return new class10788(class035562, by, by2, this.N(class072842, d));
        }
        return null;
    }

    private void R() {
        this.T.forEach(class10791::y);
    }
}


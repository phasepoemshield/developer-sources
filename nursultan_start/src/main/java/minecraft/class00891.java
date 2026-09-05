/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09409
 *  Nursultan.class11360
 *  Nursultan.class11938
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00389
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00517
 *  minecraft.class00522
 *  minecraft.class00717
 *  minecraft.class00734
 *  minecraft.class00742
 *  minecraft.class00753
 *  minecraft.class00801
 *  minecraft.class01020
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class01235
 *  minecraft.class01354
 *  minecraft.class01362
 *  minecraft.class01514
 *  minecraft.class02142
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05074
 *  minecraft.class05216
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06551
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class06925
 *  minecraft.class06942
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07057
 *  minecraft.class07078
 *  minecraft.class07131
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07307
 *  minecraft.class07310
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08713
 *  net.caffeinemc.mods.lithium.common.util.collections.Object2BooleanCacheTable
 *  net.fabricmc.fabric.api.block.v1.FabricBlock
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09409;
import Nursultan.class11360;
import Nursultan.class11938;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import minecraft.class00389;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00517;
import minecraft.class00522;
import minecraft.class00717;
import minecraft.class00734;
import minecraft.class00742;
import minecraft.class00753;
import minecraft.class00801;
import minecraft.class00869;
import minecraft.class00870;
import minecraft.class00875;
import minecraft.class01020;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class01235;
import minecraft.class01354;
import minecraft.class01362;
import minecraft.class01514;
import minecraft.class02142;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05074;
import minecraft.class05216;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06551;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class06925;
import minecraft.class06942;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07057;
import minecraft.class07078;
import minecraft.class07131;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07307;
import minecraft.class07310;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08713;
import net.caffeinemc.mods.lithium.common.util.collections.Object2BooleanCacheTable;
import net.fabricmc.fabric.api.block.v1.FabricBlock;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class00891
extends class01354
implements class07310,
FabricBlock {
    public static final MapCodec<class00891> z = class00891.y(class00891::new);
    private static final Logger N = LogUtils.getLogger();
    private final class03529<class00891> y = class04206.i.R((Object)this);
    public static final class00742<class00500> U = new class00742();
    private static final LoadingCache<class00494, Boolean> L = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build((CacheLoader)new class00875());
    public static final int E = 1;
    public static final int W = 2;
    public static final int m = 4;
    public static final int P = 8;
    public static final int s = 16;
    public static final int T = 32;
    public static final int b = 64;
    public static final int j = 128;
    public static final int v = 256;
    public static final int n = 512;
    public static final int t = 260;
    public static final int G = 3;
    public static final int l = 11;
    public static final int d = 816;
    public static final float w = -1.0f;
    public static final float k = 0.0f;
    public static final int Y = 512;
    protected final class00507<class00891, class00500> Q;
    private class00500 u;
    private @Nullable class06581 i;
    private static final int R = 256;
    private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class09409>> M = ThreadLocal.withInitial(() -> {
        class00870 class008702 = new class00870(256, 0.25f);
        class008702.defaultReturnValue((byte)127);
        return class008702;
    });
    private static final Object2BooleanCacheTable B = new Object2BooleanCacheTable(512, class004942 -> !class00389.L((class00494)class00389.y(), (class00494)class004942, (class07003)class07003.M));

    public static boolean L(class07290 class072902, class07209 class072092) {
        return class072902.method_8320(class072092).N(class072902, class072092, class07211.field_11036, class01020.field_25824);
    }

    public static class00494 L(double d, double d2, double d3) {
        return class00891.y(d, d, d2, d3);
    }

    public class05216 M() {
        return class00392.L((String)this.w());
    }

    public class00891 P() {
        return this;
    }

    protected final void P(class00500 class005002) {
        this.u = class005002;
    }

    public class00891(class01362 class013622) {
        super(class013622);
        String string;
        class00517 class005172 = new class00517((Object)this);
        this.N((class00517<class00891, class00500>)class005172);
        this.Q = class005172.N(class00891::W, class00500::new);
        this.P((class00500)this.Q.y());
        if (class07529.ND && !(string = ((Object)((Object)this)).getClass().getSimpleName()).endsWith("Block")) {
            N.error("Block classes should end with Block and {} doesn't.", (Object)string);
        }
    }

    public String toString() {
        return "Block{" + class04206.i.i((Object)this).M() + "}";
    }

    public class06581 B() {
        if (this.i == null) {
            this.i = class06581.N((class00891)this);
        }
        return this.i;
    }

    public float Z() {
        return this.K;
    }

    @Deprecated
    public class03529<class00891> s() {
        return this.y;
    }

    public final class00500 s(class00500 class005002) {
        class00500 class005003 = this.W();
        for (class08092 class080922 : class005002.i().E().u()) {
            if (!class005003.y(class080922)) continue;
            class005003 = class00891.N(class005002, class005003, class080922);
        }
        return class005003;
    }

    public boolean m() {
        return this.H;
    }

    public static boolean m(class00500 class005002) {
        return class005002.i() instanceof class07131 || class005002.N(class00869.ZX) || class005002.N(class00869.iK) || class005002.N(class00869.iV) || class005002.N(class00869.Rq) || class005002.N(class00869.Ro) || class005002.N(class01210.NB);
    }

    public float U() {
        return this.e;
    }

    public float z() {
        return this.V;
    }

    public static void y(class00500 class005002, class07299 class072992, class07209 class072092) {
        if (class072992 instanceof class04782) {
            class00891.N(class005002, (class04782)class072992, class072092, null).forEach(class065842 -> class00891.N_21(class072992, class072092, class065842));
            class005002.N((class04782)class072992, class072092, class06584.E, true);
        }
    }

    private static /* synthetic */ boolean y(class00494 class004942) {
        return !class00389.L((class00494)class00389.y(), (class00494)class004942, (class07003)class07003.M);
    }

    public static class00494 y(double d, double d2, double d3, double d4) {
        double d5 = d2 / 2.0;
        return class00891.N(d, 8.0 - d5, 8.0 + d5, d3, d4);
    }

    public static class00494 y(double d, double d2, double d3) {
        return class00891.N(d, d, d2, d3);
    }

    public class00507<class00891, class00500> E() {
        return this.Q;
    }

    protected void N(class00517<class00891, class00500> class005172) {
    }

    private static <T extends Comparable<T>> class00500 N(class00500 class005002, class00500 class005003, class08092<T> class080922) {
        return (class00500)class005003.y(class080922, class005002.L(class080922));
    }

    private void N(class07299 class072992, class07209 class072092, class00500 class005002, class07438 class074382, class06584 class065842, CallbackInfo callbackInfo) {
        if (class072992.method_8608()) {
            class11360 class113602 = class11360.N((class07209)class072092, (class00500)class005002);
            class11938.L().L((Object)class113602);
        }
    }

    protected void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002) {
        class072992.method_8444((class07049)class080362, 2001, class072092, class00891.W(class005002));
    }

    public class00500 N(class07299 class072992, class07209 class072092, class00500 class005002, class08036 class080362) {
        this.N(class072992, class080362, class072092, class005002);
        if (class005002.N(class01210.yZ) && class072992 instanceof class04782) {
            class01514.N((class04782)((class04782)class072992), (class08036)class080362, (boolean)false);
        }
        class072992.N((class03556)class01194.R, class072092, class01164.N((class07049)class080362, (class00500)class005002));
        return class005002;
    }

    public void N_4(class00500 class005002, class07299 class072992, class07209 class072092, class00801 class008012) {
    }

    public boolean N(class07307 class073072) {
        return true;
    }

    private static <S extends class00522<?, S>, T extends Comparable<T>> S N(S s, class08092<T> class080922, Object object) {
        return (S)((class00522)s.y(class080922, (Comparable)object));
    }

    protected void N(class04782 class047822, class07209 class072092, class06584 class065842, class02142 class021422) {
        int n = class07323.y((class04782)class047822, (class06584)class065842, (int)class021422.N(class047822.method_8409()));
        if (n > 0) {
            this.N(class047822, class072092, n);
        }
    }

    public static boolean N(class00494 class004942) {
        return B.get((Object)class004942);
    }

    protected Function<class00500, class00494> N(Function<class00500, class00494> function) {
        return arg_0 -> ((ImmutableMap)((ImmutableMap)this.Q.N().stream().collect(ImmutableMap.toImmutableMap(Function.identity(), function)))).get(arg_0);
    }

    protected Function<class00500, class00494> N(Function<class00500, class00494> function, class08092<?> ... class08092Array) {
        Map<class08092, Object> map = Arrays.stream(class08092Array).collect(Collectors.toMap(class080922 -> class080922, class080922 -> class080922.N().getFirst()));
        ImmutableMap immutableMap = (ImmutableMap)this.Q.N().stream().filter(class005002 -> map.entrySet().stream().allMatch(entry -> class005002.L((class08092)entry.getKey()) == entry.getValue())).collect(ImmutableMap.toImmutableMap(Function.identity(), function));
        return class005002 -> {
            for (Map.Entry entry : map.entrySet()) {
                class005002 = class00891.N(class005002, (class08092)entry.getKey(), entry.getValue());
            }
            return (class00494)immutableMap.get(class005002);
        };
    }

    public static boolean N(class00500 class005002, class00500 class005003, class07211 class072112) {
        class00494 class004942 = class005003.N(class072112.b());
        if (class004942 == class00389.y()) {
            return false;
        }
        if (class005002.N(class005003, class072112)) {
            return false;
        }
        if (class004942 == class00389.N()) {
            return true;
        }
        class00494 class004943 = class005002.N(class072112);
        if (class004943 == class00389.N()) {
            return true;
        }
        class09409 class094092 = new class09409(class004943, class004942);
        Object2ByteLinkedOpenHashMap<class09409> object2ByteLinkedOpenHashMap = M.get();
        byte by = object2ByteLinkedOpenHashMap.getAndMoveToFirst((Object)class094092);
        if (by != 127) {
            return by != 0;
        }
        boolean bl = class00389.L((class00494)class004943, (class00494)class004942, (class07003)class07003.i);
        if (object2ByteLinkedOpenHashMap.size() == 256) {
            object2ByteLinkedOpenHashMap.removeLastByte();
        }
        object2ByteLinkedOpenHashMap.putAndMoveToFirst((Object)class094092, (byte)(bl ? 1 : 0));
        return bl;
    }

    protected static boolean N(class04782 class047822, class05946<class05074> class059462, Function<class04160, class04162> function, BiConsumer<class04782, class06584> biConsumer) {
        class04162 class041622;
        class05074 class050742 = class047822.method_8503().yd().N(class059462);
        ObjectArrayList objectArrayList = class050742.N(class041622 = function.apply(new class04160(class047822)));
        if (!objectArrayList.isEmpty()) {
            objectArrayList.forEach(class065842 -> biConsumer.accept(class047822, (class06584)class065842));
            return true;
        }
        return false;
    }

    protected static boolean N(class04782 class047822, class05946<class05074> class059462, class00500 class005002, @Nullable class00394 class003942, @Nullable class06584 class065842, @Nullable class07049 class070492, BiConsumer<class04782, class06584> biConsumer) {
        return class00891.N(class047822, class059462, (class04160 class041602) -> class041602.N(class06551.Z, (Object)class005002).y(class06551.z, (Object)class003942).y(class06551.y, (Object)class070492).y(class06551.U, (Object)class065842).N(class06925.t), biConsumer);
    }

    public static void N(class00500 class005002, class00500 class005003, class07284 class072842, class07209 class072092, int n, int n2) {
        if (class005003 != class005002) {
            if (class005003.P()) {
                if (!class072842.method_8608()) {
                    class072842.method_30093(class072092, (n & 0x20) == 0, null, n2);
                }
            } else {
                class072842.method_30092(class072092, class005003, n & 0xFFFFFFDF, n2);
            }
        }
    }

    public static void N(class00500 class005002, class00500 class005003, class07284 class072842, class07209 class072092, int n) {
        class00891.N(class005002, class005003, class072842, class072092, n, 512);
    }

    public static List<class06584> N(class00500 class005002, class04782 class047822, class07209 class072092, @Nullable class00394 class003942) {
        class04160 class041602 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class06551.U, (Object)class06584.E).y(class06551.z, (Object)class003942);
        return class005002.N(class041602);
    }

    public void N_7(class07284 class072842, class07209 class072092, class00500 class005002) {
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
    }

    public static boolean N(class00494 class004942, class07211 class072112) {
        return class00891.N(class004942.method_20538(class072112));
    }

    public static boolean N_6(class05487 class054872, class07209 class072092, class07211 class072112) {
        class00500 class005002 = class054872.method_8320(class072092);
        if (class072112 == class07211.field_11033 && class005002.N(class01210.yU)) {
            return false;
        }
        return class005002.N((class07290)class054872, class072092, class072112, class01020.field_25823);
    }

    public static class00494[] N(int n, IntFunction<class00494> intFunction) {
        return (class00494[])IntStream.rangeClosed(0, n).mapToObj(intFunction).toArray(class00494[]::new);
    }

    public static class00494 N(double d, double d2, double d3, double d4, double d5, double d6) {
        return class00389.N((double)(d / 16.0), (double)(d2 / 16.0), (double)(d3 / 16.0), (double)(d4 / 16.0), (double)(d5 / 16.0), (double)(d6 / 16.0));
    }

    public static class00500 N_19(class00500 class005002, class00500 class005003, class07284 class072842, class07209 class072092) {
        class00494 class004942 = class00389.y((class00494)class005002.M((class07290)class072842, class072092), (class00494)class005003.M((class07290)class072842, class072092), (class07003)class07003.L).method_66507((class00753)class072092);
        if (class004942.method_1110()) {
            return class005003;
        }
        for (class07049 class070492 : class072842.N_70(null, class004942.method_1107())) {
            double d = class00389.N((class07185)class07185.field_11052, (class00734)class070492.method_5829().u(0.0, 1.0, 0.0), List.of(class004942), (double)-1.0);
            class070492.method_45166(0.0, 1.0 + d, 0.0);
        }
        return class005003;
    }

    public static class00891 N(@Nullable class06581 class065812) {
        if (class065812 instanceof class06918) {
            return ((class06918)class065812).L();
        }
        return class00869.N;
    }

    public static class00500 N(int n) {
        class00500 class005002 = (class00500)U.N(n);
        return class005002 == null ? class00869.N.W() : class005002;
    }

    public static class00494 N(double d, double d2, double d3, double d4, double d5) {
        double d6 = d / 2.0;
        return class00891.N(8.0 - d6, d2, d4, 8.0 + d6, d3, d5);
    }

    public static class00494 N(double d, double d2, double d3, double d4) {
        double d5 = d / 2.0;
        double d6 = d2 / 2.0;
        return class00891.N(8.0 - d5, d3, 8.0 - d6, 8.0 + d5, d4, 8.0 + d6);
    }

    public static class00494 N(double d, double d2, double d3) {
        double d4 = d2 / 2.0;
        return class00891.N(d, d3, 8.0 - d4, 8.0 + d4);
    }

    public static class00494 N(double d) {
        return class00891.N(d, d, d);
    }

    public void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002, @Nullable class00394 class003942, class06584 class065842) {
        class080362.method_7259(class01235.N.y((Object)this));
        class080362.method_7322(0.005f);
        class00891.N(class005002, class072992, class072092, class003942, (class07049)class080362, class065842);
    }

    public @Nullable class00500 N(class06942 class069422) {
        return this.W();
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, class07049 class070492) {
    }

    public void N_5(class04782 class047822, class07209 class072092, class07307 class073072) {
    }

    public void N(class07290 class072902, class07049 class070492) {
        class070492.method_18799(class070492.method_18798().u(1.0, 0.0, 1.0));
    }

    public void N(class07299 class072992, class00500 class005002, class07209 class072092, class07049 class070492, double d) {
        class070492.method_5747(d, 1.0f, class070492.method_48923().E());
    }

    public MapCodec<? extends class00891> N() {
        return z;
    }

    public void N(class07299 class072992, class07209 class072092, class00500 class005002, @Nullable class07438 class074382, class06584 class065842) {
        this.N(class072992, class072092, class005002, class074382, class065842, null);
    }

    private static void N(class07299 class072992, Supplier<class00717> supplier, class06584 class065842) {
        block3: {
            block2: {
                if (!(class072992 instanceof class04782)) break block2;
                class04782 class047822 = (class04782)class072992;
                if (!class065842.R() && ((Boolean)class047822.method_64395().N(class07305.u)).booleanValue()) break block3;
            }
            return;
        }
        class00717 class007172 = supplier.get();
        class007172.L();
        class072992.method_8649((class07049)class007172);
    }

    public static void N(class07299 class072992, class07209 class072092, class07211 class072112, class06584 class065842) {
        int n = class072112.P();
        int n2 = class072112.s();
        int n3 = class072112.T();
        double d = (double)class07078.Nt.z() / 2.0;
        double d2 = (double)class07078.Nt.U() / 2.0;
        double d3 = (double)class072092.method_10263() + 0.5 + (n == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.25, (double)0.25) : (double)n * (0.5 + d));
        double d4 = (double)class072092.method_10264() + 0.5 + (n2 == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.25, (double)0.25) : (double)n2 * (0.5 + d2)) - d2;
        double d5 = (double)class072092.method_10260() + 0.5 + (n3 == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.25, (double)0.25) : (double)n3 * (0.5 + d));
        double d6 = n == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.1, (double)0.1) : (double)n * 0.1;
        double d7 = n2 == 0 ? class04995.N((class06069)class072992.field_9229, (double)0.0, (double)0.1) : (double)n2 * 0.1 + 0.1;
        double d8 = n3 == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.1, (double)0.1) : (double)n3 * 0.1;
        class00891.N(class072992, () -> new class00717(class072992, d3, d4, d5, class065842, d6, d7, d8), class065842);
    }

    public static void N(class00500 class005002, class07284 class072842, class07209 class072092, @Nullable class00394 class003942) {
        if (class072842 instanceof class04782) {
            class00891.N(class005002, (class04782)class072842, class072092, class003942).forEach(class065842 -> class00891.N_21((class07299)((class04782)class072842), class072092, class065842));
            class005002.N((class04782)class072842, class072092, class06584.E, true);
        }
    }

    public static void N(class00500 class005002, class07299 class072992, class07209 class072092, @Nullable class00394 class003942, @Nullable class07049 class070492, class06584 class065843) {
        if (class072992 instanceof class04782) {
            class00891.N(class005002, (class04782)class072992, class072092, class003942, class070492, class065843).forEach(class065842 -> class00891.N_21(class072992, class072092, class065842));
            class005002.N((class04782)class072992, class072092, class065843, true);
        }
    }

    public static void N_21(class07299 class072992, class07209 class072092, class06584 class065842) {
        double d = (double)class07078.Nt.U() / 2.0;
        double d2 = (double)class072092.method_10263() + 0.5 + class04995.N((class06069)class072992.field_9229, (double)-0.25, (double)0.25);
        double d3 = (double)class072092.method_10264() + 0.5 + class04995.N((class06069)class072992.field_9229, (double)-0.25, (double)0.25) - d;
        double d4 = (double)class072092.method_10260() + 0.5 + class04995.N((class06069)class072992.field_9229, (double)-0.25, (double)0.25);
        class00891.N(class072992, () -> new class00717(class072992, d2, d3, d4, class065842), class065842);
    }

    public static List<class06584> N(class00500 class005002, class04782 class047822, class07209 class072092, @Nullable class00394 class003942, @Nullable class07049 class070492, class06584 class065842) {
        class04160 class041602 = new class04160(class047822).N(class06551.B, (Object)class06889.y((class00753)class072092)).N(class06551.U, (Object)class065842).y(class06551.N, (Object)class070492).y(class06551.z, (Object)class003942);
        return class005002.N(class041602);
    }

    protected void N(class04782 class047822, class07209 class072092, int n) {
        if (((Boolean)class047822.method_64395().N(class07305.u)).booleanValue()) {
            class07057.N((class04782)class047822, (class06889)class06889.y((class00753)class072092), (int)n);
        }
    }

    public static int W(@Nullable class00500 class005002) {
        if (class005002 == null) {
            return 0;
        }
        int n = U.N((Object)class005002);
        return n == -1 ? 0 : n;
    }

    public final class00500 W() {
        return this.u;
    }

    public float R() {
        return this.J;
    }

    public static class00500 a_(class00500 class005002, class07284 class072842, class07209 class072092) {
        class00500 class005003 = class005002;
        class07218 class072182 = new class07218();
        for (class07211 class072112 : g) {
            class072182.N((class00753)class072092, class072112);
            class005003 = class005003.N((class05487)class072842, (class08713)class072842, class072092, class072112, (class07209)class072182, class072842.method_8320((class07209)class072182), class072842.method_8409());
        }
        return class005003;
    }

    public boolean c_(class00500 class005002) {
        return !class005002.B() && !class005002.T();
    }
}


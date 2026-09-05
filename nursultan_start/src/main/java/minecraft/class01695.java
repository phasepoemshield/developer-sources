/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09512
 *  com.google.common.base.Stopwatch
 *  com.mojang.authlib.yggdrasil.ServicesKeySet
 *  com.mojang.brigadier.StringReader
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00201
 *  minecraft.class00202
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class00909
 *  minecraft.class01042
 *  minecraft.class01062
 *  minecraft.class01247
 *  minecraft.class01897
 *  minecraft.class01898
 *  minecraft.class01905
 *  minecraft.class01908
 *  minecraft.class02270
 *  minecraft.class02587
 *  minecraft.class02796
 *  minecraft.class02957
 *  minecraft.class03463
 *  minecraft.class03529
 *  minecraft.class03531
 *  minecraft.class03767
 *  minecraft.class03776
 *  minecraft.class03781
 *  minecraft.class03794
 *  minecraft.class03930
 *  minecraft.class03981
 *  minecraft.class04227
 *  minecraft.class04265
 *  minecraft.class04270
 *  minecraft.class04272
 *  minecraft.class04274
 *  minecraft.class04382
 *  minecraft.class04782
 *  minecraft.class04785
 *  minecraft.class04833
 *  minecraft.class04999
 *  minecraft.class05042
 *  minecraft.class05494
 *  minecraft.class05500
 *  minecraft.class05513
 *  minecraft.class05516
 *  minecraft.class05520
 *  minecraft.class05531
 *  minecraft.class05934
 *  minecraft.class05946
 *  minecraft.class05964
 *  minecraft.class06207
 *  minecraft.class06633
 *  minecraft.class06724
 *  minecraft.class06728
 *  minecraft.class06984
 *  minecraft.class06993
 *  minecraft.class07080
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07312
 *  minecraft.class07408
 *  minecraft.class07536
 *  minecraft.class07671
 *  minecraft.class08152
 *  minecraft.class08759
 *  minecraft.class08773
 *  minecraft.class08774
 *  minecraft.class08957
 *  net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09512;
import com.google.common.base.Stopwatch;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import minecraft.class00201;
import minecraft.class00202;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class00909;
import minecraft.class01042;
import minecraft.class01062;
import minecraft.class01247;
import minecraft.class01623;
import minecraft.class01675;
import minecraft.class01682;
import minecraft.class01691;
import minecraft.class01897;
import minecraft.class01898;
import minecraft.class01905;
import minecraft.class01908;
import minecraft.class02270;
import minecraft.class02587;
import minecraft.class02796;
import minecraft.class02957;
import minecraft.class03463;
import minecraft.class03529;
import minecraft.class03531;
import minecraft.class03767;
import minecraft.class03776;
import minecraft.class03781;
import minecraft.class03794;
import minecraft.class03930;
import minecraft.class03981;
import minecraft.class04227;
import minecraft.class04265;
import minecraft.class04270;
import minecraft.class04272;
import minecraft.class04274;
import minecraft.class04382;
import minecraft.class04782;
import minecraft.class04785;
import minecraft.class04833;
import minecraft.class04999;
import minecraft.class05042;
import minecraft.class05494;
import minecraft.class05500;
import minecraft.class05513;
import minecraft.class05516;
import minecraft.class05520;
import minecraft.class05531;
import minecraft.class05934;
import minecraft.class05946;
import minecraft.class05964;
import minecraft.class06207;
import minecraft.class06633;
import minecraft.class06724;
import minecraft.class06728;
import minecraft.class06984;
import minecraft.class06993;
import minecraft.class07080;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07312;
import minecraft.class07408;
import minecraft.class07536;
import minecraft.class07671;
import minecraft.class08152;
import minecraft.class08759;
import minecraft.class08773;
import minecraft.class08774;
import minecraft.class08957;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01695
extends class02796 {
    private static final Logger N = LogUtils.getLogger();
    private static final int W = 20;
    private static final int m = 14999992;
    private static final class03930 P = new class03930(null, ServicesKeySet.EMPTY, null, (class08957)new class01691(), (class00909)new class01682());
    private static final class03767 s = class03794.i.N().u(class03767.N((class02957)class03794.L, (class02957[])new class02957[]{class03794.u}));
    private final class02270 T = new class02270(4);
    private final Optional<String> b;
    private final boolean j;
    private List<class05531> v = new ArrayList<class05531>();
    private final Stopwatch n = Stopwatch.createUnstarted();
    private static final class05934 t = new class05934(0L, false, false);
    private @Nullable class05494 G;

    public boolean M() {
        return false;
    }

    public boolean P() {
        return false;
    }

    public class06984 T() {
        return class06984.N;
    }

    private class01695(Thread thread, class04785 class047852, class01623 class016232, class03531 class035312, Optional<String> optional, boolean bl) {
        super(thread, class047852, class016232, class035312, Proxy.NO_PROXY, class04999.N(), P, (class08773)class08759.N());
        this.b = optional;
        this.j = bl;
    }

    public boolean B() {
        return false;
    }

    private boolean e() {
        return this.G != null;
    }

    public class01675 l() {
        return this.T;
    }

    public class08152 d() {
        return class06984.i;
    }

    public int t() {
        return 1;
    }

    public int U() {
        return 0;
    }

    public boolean z() {
        return false;
    }

    private void y(class04782 class047822) {
        class07209 class072092 = new class07209(class047822.field_9229.N(-14999992, 14999992), -59, class047822.field_9229.N(-14999992, 14999992));
        class047822.method_27873(class05042.N((class05946)class047822.method_27983(), (class07209)class072092, (float)0.0f, (float)0.0f));
        class05520 class055202 = class05500.N(this.v, (class04782)class047822).N((class05516)new class04270(class072092, 8, false)).L();
        List var4 = class055202.N();
        this.G = new class05494((Collection)var4);
        N.info("{} tests are now running at position {}!", (Object)this.G.B(), (Object)class072092.method_23854());
        this.n.reset();
        this.n.start();
        class055202.y();
    }

    public boolean E() {
        return false;
    }

    public boolean N(class08774 class087742) {
        return false;
    }

    private static Stream<class05513> N(class03529<class00201> class035292, class04782 class047822) {
        Stream.Builder<class05513> builder = Stream.builder();
        for (class06993 class069932 : class06993.values()) {
            for (int i = 0; i < 100; ++i) {
                builder.add(new class05513(class035292, class069932, class047822, class04272.N()));
            }
        }
        return builder.build();
    }

    public static Stream<class03529<class00201>> N(class01042 class010422, String string) {
        return class00202.N((StringReader)new StringReader(string), (class01905)class010422.L(class04227.yt)).stream();
    }

    public void N(BooleanSupplier booleanSupplier) {
        super.N(booleanSupplier);
        class04782 class047822 = this.NY();
        if (!this.e()) {
            this.y(class047822);
        }
        if (class047822.N() % 20L == 0L) {
            N.info(this.G.z());
        }
        if (this.G.Z()) {
            this.y(false);
            N.info(this.G.z());
            class04833.N();
            N.info("========= {} GAME TESTS COMPLETE IN {} ======================", (Object)this.G.B(), (Object)this.n.stop());
            if (this.G.u()) {
                N.info("{} required tests failed :(", (Object)this.G.N());
                this.G.R().forEach(class01695::N);
            } else {
                N.info("All {} required tests passed :)", (Object)this.G.B());
            }
            if (this.G.i()) {
                N.info("{} optional tests failed", (Object)this.G.y());
                this.G.M().forEach(class01695::N);
            }
            N.info("====================================================");
        }
    }

    private static void N(class05513 class055132) {
        if (class055132.n() != class06993.field_11467) {
            N.info("   - {} with rotation {}: {}", new Object[]{class055132.y(), class055132.n().method_15434(), class055132.m().N().getString()});
        } else {
            N.info("   - {}: {}", (Object)class055132.y(), (Object)class055132.m().N().getString());
        }
    }

    private List<class05531> N(class04782 class047822) {
        List list;
        class04274 class042742;
        class00751 class007512 = class047822.method_30349().L(class04227.yt);
        if (this.b.isPresent()) {
            List var3 = class01695.N(class047822.method_30349(), this.b.get()).filter(class035292 -> !((class00201)class035292.N()).Z()).toList();
            if (this.j) {
                class042742 = class01695::N;
                N.info("Verify requested. Will run each test that matches {} {} times", (Object)this.b.get(), (Object)(100 * class06993.values().length));
            } else {
                class042742 = class04265.N;
                N.info("Will run tests matching {} ({} tests)", (Object)this.b.get(), (Object)var3.size());
            }
        } else {
            list = class007512.z().filter(class035292 -> !((class00201)class035292.N()).Z()).toList();
            class042742 = class04265.N;
        }
        return class04265.N((Collection)list, (class04274)class042742, (class04782)class047822);
    }

    public boolean N() {
        this.N((class01062)new class09512(this, (class02796)this, this.yG(), this.Z, (class06633)new class07408()));
        class06724.N((class06728)class06728.y);
        this.NP();
        class04782 class047822 = this.NY();
        this.v = this.N(class047822);
        N.info("Started game test server");
        return true;
    }

    public static class01695 N(Thread thread, class04785 class047852, class01623 class016232, Optional<String> optional, boolean bl) {
        class016232.N();
        ArrayList<String> arrayList = new ArrayList<String>(class016232.L());
        arrayList.remove("vanilla");
        arrayList.addFirst("vanilla");
        class01247 class012472 = class01695.N(arrayList, List.of());
        if (class012472 == null) {
            throw new NullPointerException("@Redirect constructor handler net/minecraft/class_6306::replaceDefaultDataPackSettings returned null for net.minecraft.class_5359");
        }
        class03776 class037762 = new class03776(class012472, s);
        class07312 class073122 = new class07312("Test Level", class07282.field_9220, false, class07086.field_5802, true, new class07305(s), class037762);
        class01898 class018982 = new class01898(class016232, class037762, false, true);
        class01908 class019082 = new class01908(class018982, class07671.field_25420, (class08152)class06984.i);
        try {
            N.debug("Starting resource loading");
            Stopwatch stopwatch = Stopwatch.createStarted();
            class03531 class035312 = (class03531)class07536.L(executor -> class01897.N((class01908)class019082, class019302 -> {
                class00751 class007512 = new class00731(class04227.yI, Lifecycle.stable()).W();
                class03781 class037812 = ((class04382)class019302.L().y(class04227.yO).y(class05964.y).N()).N().N(class007512);
                return new class03981((Object)new class06207(class073122, t, class037812.u(), class037812.N()), class037812.y());
            }, class03531::new, (Executor)class07536.B(), (Executor)executor)).get();
            stopwatch.stop();
            N.debug("Finished resource loading after {} ms", (Object)stopwatch.elapsed(TimeUnit.MILLISECONDS));
            return new class01695(thread, class047852, class016232, class035312, optional, bl);
        }
        catch (Exception exception) {
            N.warn("Failed to load vanilla datapack, bit oops", (Throwable)exception);
            System.exit(-1);
            throw new IllegalStateException();
        }
    }

    public void N(class07080 class070802) {
        super.N(class070802);
        N.error("Game test server crashed\n{}", (Object)class070802.N(class02587.N));
        System.exit(1);
    }

    private static class01247 N(List list, List list2) {
        return ModPackResourcesUtil.createTestServerSettings((List)list, (List)list2);
    }

    public class03463 N(class03463 class034632) {
        class034632.N("Type", "Game test server");
        return class034632;
    }

    public boolean ao_() {
        return false;
    }

    public boolean R() {
        return false;
    }

    public void H() {
        super.H();
        N.info("Game test server shutting down");
        System.exit(this.G != null ? this.G.N() : -1);
    }

    public void y_() {
        this.g();
    }
}


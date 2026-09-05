/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10190
 *  com.mojang.logging.LogUtils
 *  minecraft.class00742
 *  minecraft.class00751
 *  minecraft.class00755
 *  minecraft.class00756
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01354
 *  minecraft.class01846
 *  minecraft.class03466
 *  minecraft.class03771
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04823
 *  minecraft.class05316
 *  minecraft.class05706
 *  minecraft.class05836
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06767
 *  minecraft.class07018
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07305
 *  minecraft.class07468
 *  minecraft.class07529
 *  minecraft.class07686
 *  net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager
 *  net.fabricmc.fabric.impl.registry.sync.trackers.StateIdTracker
 *  net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockItemTracker
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10190;
import com.mojang.logging.LogUtils;
import java.io.OutputStream;
import java.io.PrintStream;
import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class00742;
import minecraft.class00751;
import minecraft.class00755;
import minecraft.class00756;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01354;
import minecraft.class01846;
import minecraft.class03466;
import minecraft.class03771;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04823;
import minecraft.class05316;
import minecraft.class05706;
import minecraft.class05836;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06767;
import minecraft.class07018;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07305;
import minecraft.class07468;
import minecraft.class07529;
import minecraft.class07686;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.fabricmc.fabric.impl.registry.sync.trackers.StateIdTracker;
import net.fabricmc.fabric.impl.registry.sync.trackers.vanilla.BlockItemTracker;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03914 {
    public static final PrintStream N = System.out;
    private static volatile boolean L;
    private static final Logger u;
    public static final AtomicLong y;

    public static void L() {
        class03914.N(() -> "validate");
        if (class07529.ND) {
            class03914.y().forEach(string -> u.error("Missing translations: {}", string));
            class07686.y();
        }
        class05316.N();
    }

    private static void u() {
        if (u.isDebugEnabled()) {
            System.setErr((PrintStream)new class03466("STDERR", (OutputStream)System.err));
            System.setOut((PrintStream)new class03466("STDOUT", (OutputStream)N));
        } else {
            System.setErr((PrintStream)new class01846("STDERR", (OutputStream)System.err));
            System.setOut((PrintStream)new class01846("STDOUT", (OutputStream)N));
        }
    }

    private static RuntimeException y(Supplier<String> supplier) {
        try {
            String string = supplier.get();
            return new IllegalArgumentException("Not bootstrapped (called from " + string + ")");
        }
        catch (Exception exception) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not bootstrapped (failed to resolve location)");
            illegalArgumentException.addSuppressed(exception);
            return illegalArgumentException;
        }
    }

    public static Set<String> y() {
        TreeSet<String> treeSet = new TreeSet<String>();
        class03914.N(class04206.v, class07468::L, treeSet);
        class03914.N(class04206.M, class07078::R, treeSet);
        class03914.N(class04206.u, class07084::R, treeSet);
        class03914.N(class04206.B, class06581::z, treeSet);
        class03914.N(class04206.i, class01354::w, treeSet);
        class03914.N(class04206.E, class018942 -> "stat." + class018942.toString().replace(':', '.'), treeSet);
        class03914.N(treeSet);
        return treeSet;
    }

    private static void N(CallbackInfo callbackInfo) {
        class00891 class008913 = class00869.N;
        class04651 class046513 = class04684.N;
        class06581 class065812 = class06570.N;
        StateIdTracker.register((class00751)class04206.i, (class00742)class00891.U, class008912 -> class008912.E().N());
        StateIdTracker.register((class00751)class04206.L, (class00742)class04651.L, class046512 -> class046512.R().N());
        BlockItemTracker.register((class00751)class04206.B);
        RegistrySyncManager.bootstrapRegistries();
    }

    private static <T> void N(Iterable<T> iterable, Function<T, String> function, Set<String> set) {
        class07018 class070182 = class07018.y();
        iterable.forEach(object -> {
            String string = (String)function.apply(object);
            if (!class070182.N(string)) {
                set.add(string);
            }
        });
    }

    public static void N() {
        if (L) {
            return;
        }
        L = true;
        Instant instant = Instant.now();
        if (class04206.NF.M().isEmpty()) {
            throw new IllegalStateException("Unable to load registries");
        }
        class00756.y();
        class05836.y();
        if (class07078.N((class07078)class07078.Ly) == null) {
            throw new IllegalStateException("Failed loading EntityTypes");
        }
        class06767.N();
        class00755.N();
        class04823.N();
        class03914.R();
        class03771.N();
        class03914.N(null);
        class03914.u();
        y.set(Duration.between(instant, Instant.now()).toMillis());
    }

    private static void N(Set<String> set) {
        class07018 class070182 = class07018.y();
        new class07305(class03794.i.N()).N((class05706)new class10190(class070182, set));
    }

    public static void N(Supplier<String> supplier) {
        if (!L) {
            throw class03914.y(supplier);
        }
    }

    public static void N(String string) {
        N.println(string);
    }

    private static void R() {
        class04206.y();
    }

    static {
        u = LogUtils.getLogger();
        y = new AtomicLong(-1L);
    }
}


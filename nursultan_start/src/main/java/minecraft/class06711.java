/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10646
 *  Nursultan.class10654
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Reference2FloatMap
 *  it.unimi.dsi.fastutil.objects.Reference2FloatMaps
 *  it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap
 *  minecraft.class00392
 *  minecraft.class00408
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01255
 *  minecraft.class01929
 *  minecraft.class04227
 *  minecraft.class04785
 *  minecraft.class05081
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10646;
import Nursultan.class10654;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Reference2FloatMap;
import it.unimi.dsi.fastutil.objects.Reference2FloatMaps;
import it.unimi.dsi.fastutil.objects.Reference2FloatOpenHashMap;
import java.nio.file.Path;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import minecraft.class00392;
import minecraft.class00408;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01255;
import minecraft.class01929;
import minecraft.class04227;
import minecraft.class04785;
import minecraft.class05081;
import minecraft.class05946;
import minecraft.class06696;
import minecraft.class07299;
import minecraft.class07536;
import org.slf4j.Logger;

public class class06711
implements AutoCloseable {
    static final Logger N = LogUtils.getLogger();
    private static final ThreadFactory l = new ThreadFactoryBuilder().setDaemon(true).build();
    private static final String d = "new_";
    public static final class00392 y = class00392.L((String)"optimizeWorld.stage.upgrading.poi");
    public static final class00392 L = class00392.L((String)"optimizeWorld.stage.finished.poi");
    public static final class00392 u = class00392.L((String)"optimizeWorld.stage.upgrading.entities");
    public static final class00392 i = class00392.L((String)"optimizeWorld.stage.finished.entities");
    static final class00392 R = class00392.L((String)"optimizeWorld.stage.upgrading.chunks");
    static final class00392 M = class00392.L((String)"optimizeWorld.stage.finished.chunks");
    final class00751<class01255> B;
    final Set<class05946<class07299>> Z;
    final boolean z;
    final boolean U;
    final class04785 E;
    private final Thread w;
    final DataFixer W;
    volatile boolean m = true;
    private volatile boolean k;
    volatile float P;
    volatile int s;
    volatile int T;
    volatile int b;
    volatile int j;
    final Reference2FloatMap<class05946<class07299>> v = Reference2FloatMaps.synchronize((Reference2FloatMap)new Reference2FloatOpenHashMap());
    volatile class00392 n = class00392.L((String)"optimizeWorld.stage.counting");
    static final Pattern t = Pattern.compile("^r\\.(-?[0-9]+)\\.(-?[0-9]+)\\.mca$");
    final class00408 G;

    public Set<class05946<class07299>> L() {
        return this.Z;
    }

    public int M() {
        return this.j;
    }

    public class06711(class04785 class047852, DataFixer dataFixer, class05081 class050812, class01042 class010422, boolean bl, boolean bl2) {
        this.B = class010422.L(class04227.yI);
        this.Z = this.B.B().stream().map(class04227::N).collect(Collectors.toUnmodifiableSet());
        this.z = bl;
        this.W = dataFixer;
        this.E = class047852;
        this.G = new class00408(this.E.N(class07299.field_25179).resolve("data"), dataFixer, (class01929)class010422);
        this.U = bl2;
        this.w = l.newThread(this::Z);
        this.w.setUncaughtExceptionHandler((thread, throwable) -> {
            N.error("Error upgrading world", throwable);
            this.n = class00392.L((String)"optimizeWorld.stage.failed");
            this.k = true;
        });
        this.w.start();
    }

    public class00392 B() {
        return this.n;
    }

    private void Z() {
        long l = class07536.L();
        N.info("Upgrading entities");
        new class10646(this).N();
        N.info("Upgrading POIs");
        new class10654(this).N();
        N.info("Upgrading blocks");
        new class06696(this).N();
        this.G.y();
        l = class07536.L() - l;
        N.info("World optimizaton finished after {} seconds", (Object)(l / 1000L));
        this.k = true;
    }

    public int i() {
        return this.s;
    }

    @Override
    public void close() {
        this.G.close();
    }

    public float u() {
        return this.P;
    }

    public boolean y() {
        return this.k;
    }

    public void N() {
        this.m = false;
        try {
            this.w.join();
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    public float N(class05946<class07299> class059462) {
        return this.v.getFloat(class059462);
    }

    static Path N(Path path) {
        return path.resolveSibling(d + path.getFileName().toString());
    }

    public int R() {
        return this.b;
    }
}


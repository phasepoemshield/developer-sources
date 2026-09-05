/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10522
 *  com.google.common.collect.Streams
 *  com.mojang.logging.LogUtils
 *  minecraft.class01517
 *  minecraft.class02587
 *  minecraft.class03914
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07305
 *  minecraft.class07536
 *  net.fabricmc.fabric.impl.crash.report.info.ThreadPrinting
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10522;
import com.google.common.collect.Streams;
import com.mojang.logging.LogUtils;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import minecraft.class01517;
import minecraft.class02587;
import minecraft.class03914;
import minecraft.class05623;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07305;
import minecraft.class07536;
import net.fabricmc.fabric.impl.crash.report.info.ThreadPrinting;
import org.slf4j.Logger;

public class class05615
implements Runnable {
    private static final Logger N = LogUtils.getLogger();
    private static final long y = 10000L;
    private static final int L = 1;
    private final class05623 u;
    private final long i;

    public class05615(class05623 class056232) {
        this.u = class056232;
        this.i = class056232.NL() * class01517.y;
    }

    @Override
    public void run() {
        while (this.u.Nj()) {
            long l = this.u.Nx();
            long l2 = class07536.u();
            long l3 = l2 - l;
            if (l3 > this.i) {
                N.error(LogUtils.FATAL_MARKER, "A single server tick took {} seconds (should be max {})", (Object)String.format(Locale.ROOT, "%.2f", Float.valueOf((float)l3 / (float)class01517.N)), (Object)String.format(Locale.ROOT, "%.2f", Float.valueOf(this.u.yW().M() / (float)class01517.L)));
                N.error(LogUtils.FATAL_MARKER, "Considering it to be crashed, server will forcibly shutdown.");
                class07080 class070802 = class05615.N("Watching Server", this.u.k().threadId());
                this.u.y(class070802.R());
                class07074 class070742 = class070802.N("Performance stats");
                class070742.N("Random tick rate", () -> this.u.yn().m().y(class07305.X));
                class070742.N("Level stats", () -> Streams.stream((Iterable)this.u.NO()).map(class047822 -> String.valueOf(class047822.method_27983().N()) + ": " + class047822.method_31268()).collect(Collectors.joining(",\n")));
                class03914.N((String)("Crash report:\n" + class070802.N(class02587.N)));
                Path path = this.u.Z().resolve("crash-reports").resolve("crash-" + class07536.R() + "-server.txt");
                if (class070802.N(path, class02587.N)) {
                    N.error("This crash report has been saved to: {}", (Object)path.toAbsolutePath());
                } else {
                    N.error("We were unable to save this crash report to disk.");
                }
                this.N();
            }
            try {
                Thread.sleep((l + this.i - l2) / class01517.y);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    private static Object N(Object object) {
        if (object instanceof ThreadInfo) {
            return ThreadPrinting.fullThreadInfoToString((ThreadInfo)((ThreadInfo)object));
        }
        return object;
    }

    public static class07080 N(String string, long l) {
        class07080 class070802 = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
        StringBuilder stringBuilder = new StringBuilder();
        Error error = new Error("Watchdog");
        for (ThreadInfo threadInfo : class070802) {
            if (threadInfo.getThreadId() == l) {
                error.setStackTrace(threadInfo.getStackTrace());
            }
            stringBuilder.append(class05615.N(threadInfo));
            stringBuilder.append("\n");
        }
        class07080 class070803 = new class07080(string, (Throwable)error);
        class07074 class070742 = class070803.N("Thread Dump");
        class070742.N("Threads", (Object)stringBuilder);
        return class070803;
    }

    private void N() {
        try {
            new Timer().schedule((TimerTask)new class10522(this), 10000L);
            System.exit(1);
        }
        catch (Throwable throwable) {
            Runtime.getRuntime().halt(1);
        }
    }
}


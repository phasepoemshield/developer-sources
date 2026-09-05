/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class03914
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.function.Supplier;
import minecraft.class03224;
import minecraft.class03232;
import minecraft.class03914;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03237 {
    private static final Logger N = LogUtils.getLogger();
    private final Runnable y;

    protected class03237(Runnable runnable) {
        this.y = runnable;
    }

    public void N(@Nullable Path path) {
        class03224 class032242;
        if (path == null) {
            return;
        }
        this.y.run();
        class03237.N(() -> "Dumped flight recorder profiling to " + String.valueOf(path));
        try {
            class032242 = class03232.N(path);
        }
        catch (Throwable throwable) {
            class03237.N(() -> "Failed to parse JFR recording", throwable);
            return;
        }
        try {
            class03237.N(class032242::y);
            Path path2 = path.resolveSibling("jfr-report-" + StringUtils.substringBefore((String)path.getFileName().toString(), (String)".jfr") + ".json");
            Files.writeString(path2, (CharSequence)class032242.y(), StandardOpenOption.CREATE);
            class03237.N(() -> "Dumped recording summary to " + String.valueOf(path2));
        }
        catch (Throwable throwable) {
            class03237.N(() -> "Failed to output JFR report", throwable);
        }
    }

    private static void N(Supplier<String> supplier, Throwable throwable) {
        if (LogUtils.isLoggerActive()) {
            N.warn(supplier.get(), throwable);
        } else {
            class03914.N((String)supplier.get());
            throwable.printStackTrace(class03914.N);
        }
    }

    private static void N(Supplier<String> supplier) {
        if (LogUtils.isLoggerActive()) {
            N.info(supplier.get());
        } else {
            class03914.N((String)supplier.get());
        }
    }
}


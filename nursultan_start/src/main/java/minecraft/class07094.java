/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.mojang.logging.LogUtils
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class03914
 *  minecraft.class04551
 *  minecraft.class07104
 *  minecraft.class07125
 *  minecraft.class07129
 *  minecraft.class07135
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class03914;
import minecraft.class04551;
import minecraft.class07104;
import minecraft.class07125;
import minecraft.class07129;
import minecraft.class07135;
import org.slf4j.Logger;

public class class07094 {
    private static final Logger field_11275 = LogUtils.getLogger();
    private final Path field_40595;
    public class01996 field_40596;
    final Set<String> field_40826 = new HashSet<String>();
    final Map<String, class07135> field_38909 = new LinkedHashMap<String, class07135>();
    private final class04551 field_38910;
    private final boolean field_38911;

    public void method_10315() throws IOException {
        class07104 class071042 = new class07104(this.field_40595, this.field_40826, this.field_38910);
        Stopwatch stopwatch = Stopwatch.createStarted();
        Stopwatch stopwatch2 = Stopwatch.createUnstarted();
        this.field_38909.forEach((string, class071352) -> {
            if (!this.field_38911 && !class071042.N(string)) {
                field_11275.debug("Generator {} already run for version {}", string, (Object)this.field_38910.comp_4025());
                return;
            }
            field_11275.info("Starting provider: {}", string);
            stopwatch2.start();
            class071042.N((class07129)class071042.N(string, arg_0 -> ((class07135)class071352).method_10319(arg_0)).join());
            stopwatch2.stop();
            field_11275.info("{} finished after {} ms", string, (Object)stopwatch2.elapsed(TimeUnit.MILLISECONDS));
            stopwatch2.reset();
        });
        field_11275.info("All providers took: {} ms", (Object)stopwatch.elapsed(TimeUnit.MILLISECONDS));
        class071042.N();
    }

    public class07094(Path path, class04551 class045512, boolean bl) {
        this.field_40595 = path;
        this.field_40596 = new class01996(this.field_40595);
        this.field_38910 = class045512;
        this.field_38911 = bl;
    }

    static {
        class03914.N();
    }

    public class07125 method_46564(boolean bl) {
        return new class07125(this, bl, "vanilla", this.field_40596);
    }

    public class07125 method_46565(boolean bl, String string) {
        Path path = this.field_40596.method_45972(class02024.field_39367).resolve("minecraft").resolve("datapacks").resolve(string);
        return new class07125(this, bl, string, new class01996(path));
    }
}


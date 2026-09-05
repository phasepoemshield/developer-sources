/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04643
 *  minecraft.class04657
 *  minecraft.class04681
 *  minecraft.class04687
 *  minecraft.class05011
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.File;
import java.util.function.LongSupplier;
import minecraft.class04643;
import minecraft.class04657;
import minecraft.class04681;
import minecraft.class04687;
import minecraft.class05011;
import minecraft.class07529;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class06014 {
    private static final Logger N = LogUtils.getLogger();
    private final LongSupplier y;
    private final long L;
    private int u;
    private final File i;
    private class04657 R = class04687.N;

    public class06014(LongSupplier longSupplier, String string, long l) {
        this.y = longSupplier;
        this.i = new File("debug", string);
        this.L = l;
    }

    public void y() {
        if (this.R == class04687.N) {
            return;
        }
        class04681 class046812 = this.R.u();
        this.R = class04687.N;
        if (class046812.M() >= this.L) {
            File file = new File(this.i, "tick-results-" + class07536.R() + ".txt");
            class046812.N(file.toPath());
            N.info("Recorded long tick -- wrote info to: {}", (Object)file.getAbsolutePath());
        }
    }

    public static class04643 N(class04643 class046432, @Nullable class06014 class060142) {
        if (class060142 != null) {
            return class04643.N((class04643)class060142.N(), (class04643)class046432);
        }
        return class046432;
    }

    public class04643 N() {
        this.R = new class05011(this.y, () -> this.u, () -> true);
        ++this.u;
        return this.R;
    }

    public static @Nullable class06014 N(String string) {
        if (class07529.S) {
            return new class06014((LongSupplier)class07536.u, string, class07529.NA);
        }
        return null;
    }
}


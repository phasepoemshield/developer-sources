/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Objects;
import minecraft.class00690;
import minecraft.class00699;
import minecraft.class00702;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00684 {
    private static final Logger N = LogUtils.getLogger();
    private final class00690 y;
    private final @Nullable class00699[] L = new class00699[class00702.L()];
    private @Nullable class00699 u;

    public class00684(class00690 class006902) {
        this.y = class006902;
        this.N(class00702.U);
    }

    public <T extends class00699> T y(class00702<T> class007022) {
        int n = class007022.y();
        class00699 class006992 = this.L[n];
        if (class006992 == null) {
            this.L[n] = class006992 = class007022.N(this.y);
        }
        return (T)class006992;
    }

    public void N(class00702<?> class007022) {
        if (this.u != null && class007022 == this.u.B()) {
            return;
        }
        if (this.u != null) {
            this.u.u();
        }
        this.u = this.y(class007022);
        if (!this.y.method_73183().method_8608()) {
            this.y.method_5841().N(class00690.N, (Object)class007022.y());
        }
        N.debug("Dragon is now in phase {} on the {}", class007022, (Object)(this.y.method_73183().method_8608() ? "client" : "server"));
        this.u.L();
    }

    public class00699 N() {
        return Objects.requireNonNull(this.u);
    }
}


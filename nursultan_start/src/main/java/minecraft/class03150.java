/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00561
 *  minecraft.class00570
 *  minecraft.class00869
 *  minecraft.class05474
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07348
 *  minecraft.class07833
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00561;
import minecraft.class00570;
import minecraft.class00869;
import minecraft.class05474;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07348;
import minecraft.class07833;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;

class class03150 {
    private final Map<class07209, class00394> N;
    private final @Nullable class07348<class00500> y;
    private final boolean L;
    private final class05474 u;

    class03150(class00570 class005702, int n) {
        this.u = class005702;
        this.L = class005702.J().method_27982();
        this.N = ImmutableMap.copyOf((Map)class005702.o());
        if (class005702 instanceof class00561) {
            this.y = null;
        } else {
            class00554 class005542;
            class00554[] class00554Array = class005702.u();
            this.y = n < 0 || n >= class00554Array.length ? null : ((class005542 = class00554Array[n]).L() ? null : class005542.B().sodium$copy());
        }
    }

    public class00500 y(class07209 class072092) {
        int n = class072092.method_10263();
        int n2 = class072092.method_10264();
        int n3 = class072092.method_10260();
        if (this.L) {
            class00500 class005002 = null;
            if (n2 == 60) {
                class005002 = class00869.ZX.W();
            }
            if (n2 == 70) {
                class005002 = class07833.N((int)n, (int)n3);
            }
            return class005002 == null ? class00869.N.W() : class005002;
        }
        if (this.y == null) {
            return class00869.N.W();
        }
        try {
            return (class00500)this.y.N(n & 0xF, n2 & 0xF, n3 & 0xF);
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Getting block state");
            class070802.N("Block being got").N("Location", () -> class07074.N((class05474)this.u, (int)n, (int)n2, (int)n3));
            throw new class07878(class070802);
        }
    }

    public @Nullable class00394 N(class07209 class072092) {
        return this.N.get(class072092);
    }
}


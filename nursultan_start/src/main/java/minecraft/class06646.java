/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class05487
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class05487;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class06646 {
    private final class05487 N;
    private final class07209 y;
    private final boolean L;
    private @Nullable class00500 u;
    private @Nullable class00394 i;
    private boolean R;

    public class05487 L() {
        return this.N;
    }

    public class06646(class05487 class054872, class07209 class072092, boolean bl) {
        this.N = class054872;
        this.y = class072092.method_10062();
        this.L = bl;
    }

    public class07209 u() {
        return this.y;
    }

    public @Nullable class00394 y() {
        if (this.i == null && !this.R) {
            this.i = this.N.method_8321(this.y);
            this.R = true;
        }
        return this.i;
    }

    public class00500 N() {
        if (this.u == null && (this.L || this.N.E(this.y))) {
            this.u = this.N.method_8320(this.y);
        }
        return this.u;
    }

    public static Predicate<@Nullable class06646> N(Predicate<class00500> predicate) {
        return class066462 -> class066462 != null && predicate.test(class066462.N());
    }
}


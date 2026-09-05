/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10321
 *  com.google.common.collect.Maps
 *  minecraft.class00289
 *  minecraft.class00311
 *  minecraft.class01894
 *  minecraft.class04782
 *  minecraft.class06929
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10321;
import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class00289;
import minecraft.class00311;
import minecraft.class01894;
import minecraft.class04162;
import minecraft.class04782;
import minecraft.class06929;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public class class04160 {
    private final class04782 N;
    private final class00289 y = new class00289();
    private final Map<class01894, class10321> L = Maps.newHashMap();
    private float u;

    public class04160(class04782 class047822) {
        this.N = class047822;
    }

    public <T> @Nullable T y(class07491<T> class074912) {
        return (T)this.y.y(class074912);
    }

    public <T> class04160 y(class07491<T> class074912, @Nullable T t) {
        this.y.y(class074912, t);
        return this;
    }

    public class04160 N(float f) {
        this.u = f;
        return this;
    }

    public class04160 N(class01894 class018942, class10321 class103212) {
        if (this.L.put(class018942, class103212) != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + String.valueOf(this.L) + "'");
        }
        return this;
    }

    public class04162 N(class06929 class069292) {
        class00311 class003112 = this.y.N(class069292);
        return new class04162(this.N, class003112, this.L, this.u);
    }

    public <T> T N(class07491<T> class074912) {
        return (T)this.y.N(class074912);
    }

    public <T> class04160 N(class07491<T> class074912, T t) {
        this.y.N(class074912, t);
        return this;
    }

    public class04782 N() {
        return this.N;
    }
}


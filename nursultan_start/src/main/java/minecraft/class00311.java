/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Map;
import java.util.NoSuchElementException;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public class class00311 {
    private final Map<class07491<?>, Object> N;

    public <T> @Nullable T L(class07491<T> class074912) {
        return (T)this.N.get(class074912);
    }

    class00311(Map<class07491<?>, Object> map) {
        this.N = map;
    }

    public <T> T y(class07491<T> class074912) {
        Object object = this.N.get(class074912);
        if (object == null) {
            throw new NoSuchElementException(class074912.N().toString());
        }
        return (T)object;
    }

    public boolean N(class07491<?> class074912) {
        return this.N.containsKey(class074912);
    }

    public <T> @Nullable T N(class07491<T> class074912, @Nullable T t) {
        return (T)this.N.getOrDefault(class074912, t);
    }
}


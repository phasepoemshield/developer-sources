/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  minecraft.class02957
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import minecraft.class02957;
import minecraft.class03766;
import org.jspecify.annotations.Nullable;

public final class class03767 {
    private static final class03767 y = new class03767(null, 0L);
    public static final int N = 64;
    private final @Nullable class03766 L;
    private final long u;

    public class03767 L(class03767 class037672) {
        if (this.L == null) {
            return class037672;
        }
        if (class037672.L == null) {
            return this;
        }
        if (this.L != class037672.L) {
            throw new IllegalArgumentException("Mismatched set elements: '" + String.valueOf(this.L) + "' != '" + String.valueOf(class037672.L) + "'");
        }
        return new class03767(this.L, this.u | class037672.u);
    }

    private class03767(@Nullable class03766 class037662, long l) {
        this.L = class037662;
        this.u = l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class03767)) return false;
        class03767 class037672 = (class03767)object;
        if (this.L != class037672.L) return false;
        if (this.u != class037672.u) return false;
        return true;
    }

    public int hashCode() {
        return (int)HashCommon.mix((long)this.u);
    }

    public class03767 u(class03767 class037672) {
        if (this.L == null || class037672.L == null) {
            return this;
        }
        if (this.L != class037672.L) {
            throw new IllegalArgumentException("Mismatched set elements: '" + String.valueOf(this.L) + "' != '" + String.valueOf(class037672.L) + "'");
        }
        long l = this.u & (class037672.u ^ 0xFFFFFFFFFFFFFFFFL);
        if (l == 0L) {
            return y;
        }
        return new class03767(this.L, l);
    }

    public boolean y() {
        return this.equals(y);
    }

    public boolean y(class02957 class029572) {
        if (this.L != class029572.N) {
            return false;
        }
        return (this.u & class029572.y) != 0L;
    }

    public boolean y(class03767 class037672) {
        if (this.L == null || class037672.L == null || this.L != class037672.L) {
            return false;
        }
        return (this.u & class037672.u) != 0L;
    }

    public static class03767 N(class02957 class029572, class02957 ... class02957Array) {
        long l = class02957Array.length == 0 ? class029572.y : class03767.N(class029572.N, class029572.y, Arrays.asList(class02957Array));
        return new class03767(class029572.N, l);
    }

    private static long N(class03766 class037662, long l, Iterable<class02957> iterable) {
        for (class02957 class029572 : iterable) {
            if (class037662 != class029572.N) {
                throw new IllegalStateException("Mismatched feature universe, expected '" + String.valueOf(class037662) + "', but got '" + String.valueOf(class029572.N) + "'");
            }
            l |= class029572.y;
        }
        return l;
    }

    public static class03767 N(class02957 class029572) {
        return new class03767(class029572.N, class029572.y);
    }

    static class03767 N(class03766 class037662, Collection<class02957> collection) {
        if (collection.isEmpty()) {
            return y;
        }
        long l = class03767.N(class037662, 0L, collection);
        return new class03767(class037662, l);
    }

    public boolean N(class03767 class037672) {
        if (this.L == null) {
            return true;
        }
        if (this.L != class037672.L) {
            return false;
        }
        return (this.u & (class037672.u ^ 0xFFFFFFFFFFFFFFFFL)) == 0L;
    }

    public static class03767 N() {
        return y;
    }
}


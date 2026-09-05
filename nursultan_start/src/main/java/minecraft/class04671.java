/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.Maps
 *  minecraft.class00392
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class04648;

public final class class04671 {
    private final String y;
    private final class04648 L;
    private final int u;
    private final Supplier<class00392> i;
    static final Map<String, class04671> N = Maps.newHashMap();

    public String L() {
        return this.y;
    }

    class04671(String string, class04648 class046482, int n) {
        this.y = string;
        this.L = class046482;
        this.u = n;
        this.i = Suppliers.memoize(() -> class046482.field_24197.apply(n, string));
        N.put(string, this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04671 class046712 = (class04671)object;
        return this.u == class046712.u && this.L == class046712.L;
    }

    public String toString() {
        return this.y;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.L, this.u});
    }

    public OptionalInt i() {
        if (this.u >= 48 && this.u <= 57) {
            return OptionalInt.of(this.u - 48);
        }
        if (this.u >= 320 && this.u <= 329) {
            return OptionalInt.of(this.u - 320);
        }
        return OptionalInt.empty();
    }

    public class00392 u() {
        return this.i.get();
    }

    public int y() {
        return this.u;
    }

    public class04648 N() {
        return this.L;
    }
}


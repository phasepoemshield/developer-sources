/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Locale;
import java.util.function.Consumer;
import minecraft.class02240;

public class class02248<T> {
    private final int N;
    private final int y;
    private final int L;
    private final int u;
    private final Object[] i;

    private int L(int n, int n2) {
        int n3 = n - this.N;
        int n4 = n2 - this.y;
        return n3 * this.u + n4;
    }

    private class02248(int n, int n2, int n3, int n4, class02240<T> class022402) {
        this.N = n;
        this.y = n2;
        this.L = n3;
        this.u = n4;
        this.i = new Object[this.L * this.u];
        for (int i = n; i < n + n3; ++i) {
            for (int j = n2; j < n2 + n4; ++j) {
                this.i[this.L((int)i, (int)j)] = class022402.get(i, j);
            }
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "StaticCache2D[%d, %d, %d, %d]", this.N, this.y, this.N + this.L, this.y + this.u);
    }

    public boolean y(int n, int n2) {
        int n3 = n - this.N;
        int n4 = n2 - this.y;
        return n3 >= 0 && n3 < this.L && n4 >= 0 && n4 < this.u;
    }

    public static <T> class02248<T> N(int n, int n2, int n3, class02240<T> class022402) {
        int n4 = n - n3;
        int n5 = n2 - n3;
        int n6 = 2 * n3 + 1;
        return new class02248<T>(n4, n5, n6, n6, class022402);
    }

    public T N(int n, int n2) {
        if (!this.y(n, n2)) {
            throw new IllegalArgumentException("Requested out of range value (" + n + "," + n2 + ") from " + String.valueOf(this));
        }
        return (T)this.i[this.L(n, n2)];
    }

    public void N(Consumer<T> consumer) {
        for (Object object : this.i) {
            consumer.accept(object);
        }
    }
}


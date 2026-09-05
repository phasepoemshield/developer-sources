/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import minecraft.class02335;
import minecraft.class02353;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public final class class02332 {
    private static final int y = -1;
    private static final Object L = new class02335();
    private static final int u = 2;
    private @Nullable Object[] i = new Object[128];
    private int R = 0;
    private int M = 0;

    public void L() {
        int n = this.M;
        int n2 = (this.R - this.M) / 2;
        this.N(n2 + 1);
        this.B();
        int n3 = n + 2;
        int n4 = this.R;
        for (int i = 0; i < n2; ++i) {
            n4 += 2;
            Object object = this.i[n3];
            assert (object != null);
            this.i[n4] = object;
            this.i[n4 + 1] = null;
            n3 += 2;
        }
        this.R = n4;
        assert (this.Z());
    }

    private int L(class02353<?> class023532) {
        for (int i = this.R; i > this.M; i -= 2) {
            Object object = this.i[i];
            assert (object instanceof class02353);
            if (object != class023532) continue;
            return i + 1;
        }
        return -1;
    }

    @SafeVarargs
    public final <T> T L(class02353<? extends T> ... class02353Array) {
        int n = this.N(class02353Array);
        if (n == -1) {
            throw new IllegalArgumentException("No value for atoms " + Arrays.toString(class02353Array));
        }
        return (T)this.i[n];
    }

    public boolean M() {
        for (int i = this.R; i > 0; --i) {
            if (this.i[i] != L) continue;
            return false;
        }
        if (this.i[0] != L) {
            throw new IllegalStateException("Corrupted stack");
        }
        return true;
    }

    public class02332() {
        this.i[0] = L;
        this.i[1] = null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = true;
        for (int i = 0; i <= this.R; i += 2) {
            Object object = this.i[i];
            Object object2 = this.i[i + 1];
            if (object == L) {
                stringBuilder.append('|');
                bl = true;
                continue;
            }
            if (!bl) {
                stringBuilder.append(',');
            }
            bl = false;
            stringBuilder.append(object).append(':').append(object2);
        }
        return stringBuilder.toString();
    }

    private void B() {
        this.R += 2;
        this.i[this.R] = L;
        this.i[this.R + 1] = this.M;
        this.M = this.R;
    }

    private boolean Z() {
        Object object;
        int n;
        assert (this.M >= 0);
        assert (this.R >= this.M);
        for (n = 0; n <= this.R; n += 2) {
            object = this.i[n];
            if (object == L || object instanceof class02353) continue;
            return false;
        }
        n = this.M;
        while (n != 0) {
            object = this.i[n];
            if (object != L) {
                return false;
            }
            n = this.y(n);
        }
        return true;
    }

    public void i() {
        int n;
        int n2 = n = this.y(this.M);
        int n3 = this.M;
        while (n3 < this.R) {
            n2 += 2;
            Object object = this.i[n3 += 2];
            assert (object instanceof class02353);
            Object object2 = this.i[n3 + 1];
            if (this.i[n2] != object) {
                this.i[n2] = object;
                this.i[n2 + 1] = object2;
                continue;
            }
            if (object2 == null) continue;
            this.i[n2 + 1] = object2;
        }
        this.R = n2;
        this.M = n;
        assert (this.Z());
    }

    public void u() {
        for (int i = this.R; i > this.M; i -= 2) {
            assert (this.i[i] instanceof class02353);
            this.i[i + 1] = null;
        }
        assert (this.Z());
    }

    public <T> T y(class02353<T> class023532) {
        int n = this.L(class023532);
        if (n == -1) {
            throw new IllegalArgumentException("No value for atom " + String.valueOf(class023532));
        }
        return (T)this.i[n];
    }

    public <T> T y(class02353<T> class023532, T t) {
        int n = this.L(class023532);
        return (T)(n != -1 ? this.i[n] : t);
    }

    @SafeVarargs
    public final <T> @Nullable T y(class02353<? extends T> ... class02353Array) {
        int n = this.N(class02353Array);
        return (T)(n != -1 ? this.i[n] : null);
    }

    public void y() {
        assert (this.M != 0);
        this.R = this.M - 2;
        this.M = this.y(this.M);
        assert (this.Z());
    }

    private int y(int n) {
        return (Integer)this.i[n + 1];
    }

    public int N(class02353<?> ... class02353Array) {
        for (int i = this.R; i > this.M; i -= 2) {
            Object object = this.i[i];
            assert (object instanceof class02353);
            class02353<?>[] class02353Array2 = class02353Array;
            int n = class02353Array2.length;
            for (int j = 0; j < n; ++j) {
                if (class02353Array2[j] != object) continue;
                return i + 1;
            }
        }
        return -1;
    }

    public <T> void N(class02353<T> class023532, @Nullable T t) {
        int n = this.L(class023532);
        if (n != -1) {
            this.i[n] = t;
        } else {
            this.N(1);
            this.R += 2;
            this.i[this.R] = class023532;
            this.i[this.R + 1] = t;
        }
        assert (this.Z());
    }

    public <T> @Nullable T N(class02353<T> class023532) {
        int n = this.L(class023532);
        return (T)(n != -1 ? this.i[n] : null);
    }

    public void N() {
        this.N(1);
        this.B();
        assert (this.Z());
    }

    private void N(int n) {
        int n2 = this.R + 1 + n * 2;
        int n3 = this.i.length;
        if (n2 >= n3) {
            Object[] objectArray = new Object[class07536.N((int)n3, (int)(n2 + 1))];
            System.arraycopy(this.i, 0, objectArray, 0, n3);
            this.i = objectArray;
        }
        assert (this.Z());
    }

    public Map<class02353<?>, ?> R() {
        HashMap<class02353, Object> hashMap = new HashMap<class02353, Object>();
        for (int i = this.R; i > this.M; i -= 2) {
            Object object = this.i[i];
            Object object2 = this.i[i + 1];
            hashMap.put((class02353)((Object)object), object2);
        }
        return hashMap;
    }
}


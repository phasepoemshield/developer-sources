/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01763
 *  minecraft.class02362
 *  minecraft.class04604
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Set;
import minecraft.class00138;
import minecraft.class00667;
import minecraft.class01763;
import minecraft.class02362;
import minecraft.class04604;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public final class class00143 {
    public static final class02362<class00667, class00143> N = class02362.N((class006672, class001432) -> class001432.N((class00667)class006672), class00143::y);
    private final List<class01763> y;
    private @Nullable class00138 L;
    private int u;
    private final class07209 i;
    private final float R;
    private final boolean M;

    public void L(int n) {
        this.u = n;
    }

    static class01763[] L(class00667 class006672) {
        class01763[] class01763Array = new class01763[class006672.E()];
        for (int i = 0; i < class01763Array.length; ++i) {
            class01763Array[i] = class01763.L((class00667)class006672);
        }
        return class01763Array;
    }

    public boolean L() {
        return this.u >= this.y.size();
    }

    public class07209 M() {
        return this.y.get(this.u).u();
    }

    public class00143(List<class01763> list, class07209 class072092, boolean bl) {
        this.y = list;
        this.i = class072092;
        this.R = list.isEmpty() ? Float.MAX_VALUE : this.y.get(this.y.size() - 1).L(this.i);
        this.M = bl;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class00143)) {
            return false;
        }
        class00143 class001432 = (class00143)object;
        return this.u == class001432.u && this.L == class001432.L && this.M == class001432.M && this.i.equals((Object)class001432.i) && this.y.equals(class001432.y);
    }

    public String toString() {
        return "Path(length=" + this.y.size() + ")";
    }

    public int hashCode() {
        return this.u + this.y.hashCode() * 31;
    }

    public class01763 B() {
        return this.y.get(this.u);
    }

    public @Nullable class01763 Z() {
        return this.u > 0 ? this.y.get(this.u - 1) : null;
    }

    public int i() {
        return this.y.size();
    }

    public class00143 m() {
        class00143 class001432 = new class00143(this.y, this.i, this.M);
        class001432.L = this.L;
        class001432.u = this.u;
        return class001432;
    }

    public @Nullable class00138 U() {
        return this.L;
    }

    public boolean z() {
        return this.M;
    }

    public class07209 u(int n) {
        return this.y.get(n).u();
    }

    public @Nullable class01763 u() {
        if (!this.y.isEmpty()) {
            return this.y.get(this.y.size() - 1);
        }
        return null;
    }

    public static class00143 y(class00667 class006672) {
        boolean bl = class006672.readBoolean();
        int n = class006672.readInt();
        class07209 class072092 = class006672.i();
        List list = class006672.N_16(class01763::L);
        class00138 class001382 = class00138.y(class006672);
        class00143 class001432 = new class00143(list, class072092, bl);
        class001432.L = class001382;
        class001432.u = n;
        return class001432;
    }

    public void y(int n) {
        if (this.y.size() > n) {
            this.y.subList(n, this.y.size()).clear();
        }
    }

    public boolean y() {
        return this.u <= 0;
    }

    public class07209 E() {
        return this.i;
    }

    public boolean N(@Nullable class00143 class001432) {
        return class001432 != null && this.y.equals(class001432.y);
    }

    public void N() {
        ++this.u;
    }

    static void N(class00667 class006672, class01763[] class01763Array) {
        class006672.L(class01763Array.length);
        class01763[] class01763Array2 = class01763Array;
        int n = class01763Array2.length;
        for (int i = 0; i < n; ++i) {
            class01763Array2[i].y(class006672);
        }
    }

    public void N(int n, class01763 class017632) {
        this.y.set(n, class017632);
    }

    void N(class01763[] class01763Array, class01763[] class01763Array2, Set<class04604> set) {
        this.L = new class00138(class01763Array, class01763Array2, set);
    }

    public class06889 N(class07049 class070492, int n) {
        class01763 class017632 = this.y.get(n);
        double d = (double)class017632.N + (double)((int)(class070492.method_17681() + 1.0f)) * 0.5;
        double d2 = class017632.y;
        double d3 = (double)class017632.L + (double)((int)(class070492.method_17681() + 1.0f)) * 0.5;
        return new class06889(d, d2, d3);
    }

    public void N(class00667 class006673) {
        if (this.L == null || this.L.L().isEmpty()) {
            throw new IllegalStateException("Missing debug data");
        }
        class006673.writeBoolean(this.M);
        class006673.writeInt(this.u);
        class006673.N(this.i);
        class006673.N_12(this.y, (class006672, class017632) -> class017632.y(class006672));
        this.L.N(class006673);
    }

    public class06889 N(class07049 class070492) {
        return this.N(class070492, this.u);
    }

    public class01763 N(int n) {
        return this.y.get(n);
    }

    public float W() {
        return this.R;
    }

    public int R() {
        return this.u;
    }
}


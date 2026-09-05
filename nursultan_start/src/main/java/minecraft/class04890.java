/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  minecraft.class00379
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04206
 *  minecraft.class04688
 *  minecraft.class05074
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06758
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07243
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class07830
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import minecraft.class00379;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04206;
import minecraft.class04688;
import minecraft.class04878;
import minecraft.class04892;
import minecraft.class05074;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06758;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07243;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class07830;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public abstract class class04890 {
    protected static final class00500 w = class00869.mr.W();
    protected class05163 k;
    private @Nullable class07211 N;
    private class07111 y;
    private class06993 L;
    protected int Y;
    private final class04878 u;
    private static final Set<class00891> i = ImmutableSet.builder().add((Object)class00869.Mu).add((Object)class00869.Le).add((Object)class00869.LH).add((Object)class00869.il).add((Object)class00869.UD).add((Object)class00869.EL).add((Object)class00869.Eu).add((Object)class00869.EN).add((Object)class00869.Uh).add((Object)class00869.Ur).add((Object)class00869.uW).add((Object)class00869.RQ).build();

    protected class07218 L(int n, int n2, int n3) {
        return new class07218(this.N(n, n3), this.L(n2), this.y(n, n3));
    }

    protected int L(int n) {
        if (this.i() == null) {
            return n;
        }
        return n + this.k.Z();
    }

    public class05163 L() {
        return this.k;
    }

    protected void L(class05974 class059742, class00500 class005002, int n, int n2, int n3, class05163 class051632) {
        class07218 class072182 = this.L(n, n2, n3);
        if (!class051632.y((class00753)class072182)) {
            return;
        }
        if (!this.N((class05487)class059742, n, n2, n3, class051632)) {
            return;
        }
        if (this.y != class07111.field_11302) {
            class005002 = class005002.N(this.y);
        }
        if (this.L != class06993.field_11467) {
            class005002 = class005002.N(this.L);
        }
        class059742.method_8652((class07209)class072182, class005002, 2);
        class04688 class046882 = class059742.method_8316((class07209)class072182);
        if (!class046882.W()) {
            class059742.N((class07209)class072182, class046882.N(), 0);
        }
        if (i.contains(class005002.i())) {
            class059742.method_8500((class07209)class072182).u((class07209)class072182);
        }
    }

    public class07111 M() {
        return this.y;
    }

    protected class04890(class04878 class048782, int n, class05163 class051632) {
        this.u = class048782;
        this.Y = n;
        this.k = class051632;
    }

    public class04890(class04878 class048782, class07001 class070012) {
        this(class048782, class070012.y("GD", 0), (class05163)class070012.N_15("BB", class05163.N).orElseThrow());
        int n = class070012.y("O", 0);
        this.N(n == -1 ? null : class07211.y((int)n));
    }

    public class04878 B() {
        return this.u;
    }

    public @Nullable class07211 i() {
        return this.N;
    }

    public int u() {
        return this.Y;
    }

    protected int y(int n, int n2) {
        class07211 class072112 = this.i();
        if (class072112 == null) {
            return n2;
        }
        switch (class072112) {
            case field_11043: {
                return this.k.W() - n2;
            }
            case field_11035: {
                return this.k.z() + n2;
            }
            case field_11039: 
            case field_11034: {
                return this.k.z() + n;
            }
        }
        return n2;
    }

    protected static class07211 y(class06069 class060692) {
        return class07221.field_11062.N(class060692);
    }

    protected boolean y(class05487 class054872, int n, int n2, int n3, class05163 class051632) {
        class07218 class072182 = this.L(n, n2 + 1, n3);
        if (!class051632.y((class00753)class072182)) {
            return false;
        }
        return class072182.method_10264() < class054872.method_8624(class07830.field_13195, class072182.method_10263(), class072182.method_10260());
    }

    protected void y(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    this.L(class059742, class00869.N.W(), j, i, k, class051632);
                }
            }
        }
    }

    public void y(int n) {
        this.Y = n;
    }

    protected boolean N(class05974 class059742, class05163 class051632, class06069 class060692, int n, int n2, int n3, class07211 class072112, class05946<class05074> class059462) {
        class07218 class072182 = this.L(n, n2, n3);
        if (class051632.y((class00753)class072182) && !class059742.method_8320((class07209)class072182).N(class00869.yy)) {
            this.L(class059742, (class00500)class00869.yy.W().y((class08092)class06758.y, (Comparable)class072112), n, n2, n3, class051632);
            class00394 class003942 = class059742.method_8321((class07209)class072182);
            if (class003942 instanceof class07243) {
                ((class07243)class003942).N(class059462, class060692.B());
            }
            return true;
        }
        return false;
    }

    protected void N(class05974 class059742, class00500 class005002, int n, int n2, int n3, class05163 class051632) {
        class07218 class072182 = this.L(n, n2, n3);
        if (!class051632.y((class00753)class072182)) {
            return;
        }
        while (this.N(class059742.method_8320((class07209)class072182)) && class072182.method_10264() > class059742.method_31607() + 1) {
            class059742.method_8652((class07209)class072182, class005002, 2);
            class072182.N(class07211.field_11033);
        }
    }

    protected boolean N(class05974 class059742, class05163 class051632, class06069 class060692, int n, int n2, int n3, class05946<class05074> class059462) {
        return this.N((class01001)class059742, class051632, class060692, (class07209)this.L(n, n2, n3), class059462, null);
    }

    protected boolean N(class00500 class005002) {
        return class005002.P() || class005002.T() || class005002.N(class00869.RX) || class005002.N(class00869.yJ) || class005002.N(class00869.yo);
    }

    public static class00500 N(class07290 class072902, class07209 class072092, class00500 class005002) {
        class07211 class0721122;
        class07211 class072113 = null;
        for (class07211 class0721122 : class07221.field_11062) {
            class07209 class072093 = class072092.method_10093(class0721122);
            class00500 class005003 = class072902.method_8320(class072093);
            if (class005003.N(class00869.LA)) {
                return class005002;
            }
            if (!class005003.t()) continue;
            if (class072113 == null) {
                class072113 = class0721122;
                continue;
            }
            class072113 = null;
            break;
        }
        if (class072113 != null) {
            return (class00500)class005002.y((class08092)class07101.R, (Comparable)class072113.b());
        }
        class07211 class072114 = (class07211)class005002.L((class08092)class07101.R);
        class0721122 = class072092.method_10093(class072114);
        if (class072902.method_8320((class07209)class0721122).t()) {
            class072114 = class072114.b();
            class0721122 = class072092.method_10093(class072114);
        }
        if (class072902.method_8320((class07209)class0721122).t()) {
            class072114 = class072114.R();
            class0721122 = class072092.method_10093(class072114);
        }
        if (class072902.method_8320((class07209)class0721122).t()) {
            class072114 = class072114.b();
            class0721122 = class072092.method_10093(class072114);
        }
        return (class00500)class005002.y((class08092)class07101.R, (Comparable)class072114);
    }

    protected boolean N(class01001 class010012, class05163 class051632, class06069 class060692, class07209 class072092, class05946<class05074> class059462, @Nullable class00500 class005002) {
        if (!class051632.y((class00753)class072092) || class010012.method_8320(class072092).N(class00869.LA)) {
            return false;
        }
        if (class005002 == null) {
            class005002 = class04890.N((class07290)class010012, class072092, class00869.LA.W());
        }
        class010012.method_8652(class072092, class005002, 2);
        class00394 class003942 = class010012.method_8321(class072092);
        if (class003942 instanceof class00379) {
            ((class00379)class003942).N(class059462, class060692.B());
        }
        return true;
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, int n6, class00500 class005002, class00500 class005003, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.N((class07290)class059742, j, i, k, class051632).P()) continue;
                    if (i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6) {
                        this.L(class059742, class005002, j, i, k, class051632);
                        continue;
                    }
                    this.L(class059742, class005003, j, i, k, class051632);
                }
            }
        }
    }

    protected static class05163 N(int n, int n2, int n3, class07211 class072112, int n4, int n5, int n6) {
        if (class072112.z() == class07185.field_11051) {
            return new class05163(n, n2, n3, n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1);
        }
        return new class05163(n, n2, n3, n + n6 - 1, n2 + n5 - 1, n3 + n4 - 1);
    }

    public void N(@Nullable class07211 class072112) {
        this.N = class072112;
        if (class072112 == null) {
            this.L = class06993.field_11467;
            this.y = class07111.field_11302;
        } else {
            switch (class072112) {
                case field_11035: {
                    this.y = class07111.field_11300;
                    this.L = class06993.field_11467;
                    break;
                }
                case field_11039: {
                    this.y = class07111.field_11300;
                    this.L = class06993.field_11463;
                    break;
                }
                case field_11034: {
                    this.y = class07111.field_11302;
                    this.L = class06993.field_11463;
                    break;
                }
                default: {
                    this.y = class07111.field_11302;
                    this.L = class06993.field_11467;
                }
            }
        }
    }

    public static @Nullable class04890 N(List<class04890> list, class05163 class051632) {
        for (class04890 class048902 : list) {
            if (!class048902.L().N(class051632)) continue;
            return class048902;
        }
        return null;
    }

    public static class05163 N(Stream<class04890> stream) {
        return (class05163)class05163.y(stream.map(class04890::L)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
    }

    public void N(int n, int n2, int n3) {
        this.k.N(n, n2, n3);
    }

    protected int N(int n, int n2) {
        class07211 class072112 = this.i();
        if (class072112 == null) {
            return n;
        }
        switch (class072112) {
            case field_11043: 
            case field_11035: {
                return this.k.B() + n;
            }
            case field_11039: {
                return this.k.U() - n2;
            }
            case field_11034: {
                return this.k.B() + n2;
            }
        }
        return n;
    }

    protected abstract void N(class03298 var1, class07001 var2);

    public final class07001 N(class03298 class032982) {
        class07001 class070012 = new class07001();
        class070012.N_67("id", class04206.p.y((Object)this.B()).toString());
        class070012.N("BB", class05163.N, (Object)this.k);
        class07211 class072112 = this.i();
        class070012.N("O", class072112 == null ? -1 : class072112.u());
        class070012.N("GD", this.Y);
        this.N(class032982, class070012);
        return class070012;
    }

    protected boolean N(class05487 class054872, int n, int n2, int n3, class05163 class051632) {
        return true;
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
    }

    public boolean N(class07321 class073212, int n) {
        int n2 = class073212.i();
        int n3 = class073212.R();
        return this.k.N(n2 - n, n3 - n, n2 + 15 + n, n3 + 15 + n);
    }

    public abstract void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7);

    protected void N(class05974 class059742, class05163 class051632, class05163 class051633, boolean bl, class06069 class060692, class04892 class048922) {
        this.N(class059742, class051632, class051633.B(), class051633.Z(), class051633.z(), class051633.U(), class051633.E(), class051633.W(), bl, class060692, class048922);
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, int n6, class00500 class005002, boolean bl) {
        float f = n4 - n + 1;
        float f2 = n5 - n2 + 1;
        float f3 = n6 - n3 + 1;
        float f4 = (float)n + f / 2.0f;
        float f5 = (float)n3 + f3 / 2.0f;
        for (int i = n2; i <= n5; ++i) {
            float f6 = (float)(i - n2) / f2;
            for (int j = n; j <= n4; ++j) {
                float f7 = ((float)j - f4) / (f * 0.5f);
                for (int k = n3; k <= n6; ++k) {
                    float f8 = ((float)k - f5) / (f3 * 0.5f);
                    if (bl && this.N((class07290)class059742, j, i, k, class051632).P() || !(f7 * f7 + f6 * f6 + f8 * f8 <= 1.05f)) continue;
                    this.L(class059742, class005002, j, i, k, class051632);
                }
            }
        }
    }

    protected void N(class05974 class059742, class05163 class051632, class06069 class060692, float f, int n, int n2, int n3, int n4, int n5, int n6, class00500 class005002, class00500 class005003, boolean bl, boolean bl2) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (class060692.z() > f || bl && this.N((class07290)class059742, j, i, k, class051632).P() || bl2 && !this.y((class05487)class059742, j, i, k, class051632)) continue;
                    if (i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6) {
                        this.L(class059742, class005002, j, i, k, class051632);
                        continue;
                    }
                    this.L(class059742, class005003, j, i, k, class051632);
                }
            }
        }
    }

    protected void N(class05974 class059742, class05163 class051632, class06069 class060692, float f, int n, int n2, int n3, class00500 class005002) {
        if (class060692.z() < f) {
            this.L(class059742, class005002, n, n2, n3, class051632);
        }
    }

    protected void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, class06069 class060692, class04892 class048922) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (bl && this.N((class07290)class059742, j, i, k, class051632).P()) continue;
                    class048922.N(class060692, j, i, k, i == n2 || i == n5 || j == n || j == n4 || k == n3 || k == n6);
                    this.L(class059742, class048922.N(), j, i, k, class051632);
                }
            }
        }
    }

    protected void N(class05974 class059742, class05163 class051632, class05163 class051633, class00500 class005002, class00500 class005003, boolean bl) {
        this.N(class059742, class051632, class051633.B(), class051633.Z(), class051633.z(), class051633.U(), class051633.E(), class051633.W(), class005002, class005003, bl);
    }

    protected class00500 N(class07290 class072902, int n, int n2, int n3, class05163 class051632) {
        class07218 class072182 = this.L(n, n2, n3);
        if (!class051632.y((class00753)class072182)) {
            return class00869.N.W();
        }
        return class072902.method_8320((class07209)class072182);
    }

    public class07209 av_() {
        return new class07209((class00753)this.k.M());
    }

    public class06993 R() {
        return this.L;
    }
}


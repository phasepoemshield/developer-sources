/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class00719
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01201
 *  minecraft.class01207
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07714
 *  minecraft.class08036
 *  minecraft.class08070
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08592
 *  minecraft.class08597
 *  minecraft.class08623
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class00719;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01201;
import minecraft.class01207;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07269;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07714;
import minecraft.class08036;
import minecraft.class08070;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08592;
import minecraft.class08597;
import minecraft.class08623;
import org.jspecify.annotations.Nullable;

public class class07253
extends class00394
implements class08597 {
    private static final int u = 5;
    public static final int N = 48;
    public static final int y = 48;
    public static final String L = "author";
    private static final String i = "";
    private static final String R = "";
    private static final class07209 M = new class07209(0, 1, 0);
    private static final class00753 B = class00753.field_11176;
    private static final class06993 Z = class06993.field_11467;
    private static final class07111 m = class07111.field_11302;
    private static final boolean P = true;
    private static final boolean s = false;
    private static final boolean T = false;
    private static final boolean b = false;
    private static final boolean j = true;
    private static final float v = 1.0f;
    private static final long n = 0L;
    private @Nullable class01894 t;
    private String G = "";
    private String l = "";
    private class07209 d = M;
    private class00753 w = B;
    private class07111 k = class07111.field_11302;
    private class06993 Y = class06993.field_11467;
    private class08070 Q;
    private boolean O = true;
    private boolean g = false;
    private boolean I = false;
    private boolean J = false;
    private boolean o = true;
    private float q = 1.0f;
    private long K = 0L;

    public void L(class04782 class047822) {
        class01207 class012072 = this.u(class047822);
        if (class012072 != null) {
            this.N(class047822, class012072);
        }
    }

    public class08623 L() {
        int n;
        int n2;
        int n3;
        int n4;
        class07209 class072092 = this.M();
        class00753 class007532 = this.B();
        int n5 = class072092.method_10263();
        int n6 = class072092.method_10260();
        int n7 = class072092.method_10264();
        int n8 = n7 + class007532.method_10264();
        return class08623.N((int)n3, (int)n7, (int)n2, (int)n, (int)n8, (int)(switch (this.Y) {
            case class06993.field_11463 -> {
                n3 = (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                }) < 0 ? n5 : n5 + 1;
                n2 = n4 < 0 ? n6 + 1 : n6;
                n = n3 - (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                });
                yield n2 + n4;
            }
            case class06993.field_11464 -> {
                n3 = n4 < 0 ? n5 : n5 + 1;
                n2 = (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                }) < 0 ? n6 : n6 + 1;
                n = n3 - n4;
                yield n2 - (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                });
            }
            case class06993.field_11465 -> {
                n3 = (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                }) < 0 ? n5 + 1 : n5;
                n2 = n4 < 0 ? n6 : n6 + 1;
                n = n3 + (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                });
                yield n2 - n4;
            }
            default -> {
                n3 = n4 < 0 ? n5 + 1 : n5;
                n2 = (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                }) < 0 ? n6 + 1 : n6;
                n = n3 + n4;
                yield n2 + (switch (this.k) {
                    case class07111.field_11300 -> {
                        n4 = class007532.method_10263();
                        yield -class007532.method_10260();
                    }
                    case class07111.field_11301 -> {
                        n4 = -class007532.method_10263();
                        yield class007532.method_10260();
                    }
                    default -> {
                        n4 = class007532.method_10263();
                        yield class007532.method_10260();
                    }
                });
            }
        }));
    }

    public boolean L(boolean bl) {
        class07299 class072992;
        if (this.t == null || !((class072992 = this.z) instanceof class04782)) {
            return false;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = this.d().method_10081((class00753)this.d);
        return class07253.N(class047822, this.t, (class07209)class072992, this.w, this.O, this.G, bl, List.of());
    }

    public class07209 M() {
        return this.d;
    }

    public float P() {
        return this.q;
    }

    public boolean T() {
        if (this.Q != class08070.field_12695) {
            return false;
        }
        class07209 class072092 = this.d();
        int n = 80;
        class07209 class072093 = new class07209(class072092.method_10263() - 80, this.z.method_31607(), class072092.method_10260() - 80);
        class07209 class072094 = new class07209(class072092.method_10263() + 80, this.z.method_31600(), class072092.method_10260() + 80);
        Stream<class07209> var5 = this.N(class072093, class072094);
        return class07253.N(class072092, var5).filter(class051632 -> {
            int n = class051632.U() - class051632.B();
            int n2 = class051632.E() - class051632.Z();
            int n3 = class051632.W() - class051632.z();
            if (n > 1 && n2 > 1 && n3 > 1) {
                this.d = new class07209(class051632.B() - class072092.method_10263() + 1, class051632.Z() - class072092.method_10264() + 1, class051632.z() - class072092.method_10260() + 1);
                this.w = new class00753(n - 1, n2 - 1, n3 - 1);
                this.method_5431();
                class00500 class005002 = this.z.method_8320(class072092);
                this.z.method_8413(class072092, class005002, class005002, 3);
                return true;
            }
            return false;
        }).isPresent();
    }

    public class07253(class07209 class072092, class00500 class005002) {
        super(class00404.field_11895, class072092, class005002);
        this.Q = (class08070)class005002.L((class08092)class07714.y);
    }

    public class00753 B() {
        return this.w;
    }

    public class07111 Z() {
        return this.k;
    }

    public void i(boolean bl) {
        this.J = bl;
    }

    public boolean b() {
        if (this.Q != class08070.field_12695) {
            return false;
        }
        return this.L(true);
    }

    public long s() {
        return this.K;
    }

    public boolean n() {
        return this.I;
    }

    public boolean m() {
        return this.g;
    }

    public boolean o() {
        return this.o;
    }

    public boolean t() {
        return this.J;
    }

    public boolean v() {
        if (this.Q != class08070.field_12697 || this.z.method_8608() || this.t == null) {
            return false;
        }
        class01224 class012242 = ((class04782)this.z).method_14183();
        try {
            return class012242.y(this.t).isPresent();
        }
        catch (class00719 class007192) {
            return false;
        }
    }

    public void j() {
        if (this.t == null) {
            return;
        }
        ((class04782)this.z).method_14183().u(this.t);
    }

    private void q() {
        if (this.z == null) {
            return;
        }
        class07209 class072092 = this.d();
        class00500 class005002 = this.z.method_8320(class072092);
        if (class005002.N(class00869.sh)) {
            this.z.method_8652(class072092, (class00500)class005002.y((class08092)class07714.y, (Comparable)this.Q), 2);
        }
    }

    public String U() {
        return this.l;
    }

    public class06993 z() {
        return this.Y;
    }

    public void u(boolean bl) {
        this.I = bl;
    }

    public String u() {
        return this.t == null ? "" : this.t.toString();
    }

    private @Nullable class01207 u(class04782 class047822) {
        if (this.t == null) {
            return null;
        }
        return class047822.method_14183().y(this.t).orElse(null);
    }

    public void y(boolean bl) {
        this.g = bl;
    }

    public boolean y(class04782 class047822) {
        class01207 class012072 = this.u(class047822);
        if (class012072 == null) {
            return false;
        }
        this.N(class012072);
        return true;
    }

    public void y(String string) {
        this.l = string;
    }

    public static class06069 y(long l) {
        if (l == 0L) {
            return class06069.y((long)class07536.L());
        }
        return class06069.y((long)l);
    }

    public class08592 y() {
        if (this.Q != class08070.field_12695 && this.Q != class08070.field_12697) {
            return class08592.field_55994;
        }
        if (this.Q == class08070.field_12695 && this.J) {
            return class08592.field_55996;
        }
        if (this.Q == class08070.field_12695 || this.o) {
            return class08592.field_55995;
        }
        return class08592.field_55994;
    }

    public class08070 E() {
        return this.Q;
    }

    protected void N(class08299 class082992) {
        super.N(class082992);
        this.N(class082992.N("name", ""));
        this.G = class082992.N(L, "");
        this.l = class082992.N("metadata", "");
        int n = class04995.N((int)class082992.N("posX", M.method_10263()), (int)-48, (int)48);
        int n2 = class04995.N((int)class082992.N("posY", M.method_10264()), (int)-48, (int)48);
        int n3 = class04995.N((int)class082992.N("posZ", M.method_10260()), (int)-48, (int)48);
        this.d = new class07209(n, n2, n3);
        int n4 = class04995.N((int)class082992.N("sizeX", B.method_10263()), (int)0, (int)48);
        int n5 = class04995.N((int)class082992.N("sizeY", B.method_10264()), (int)0, (int)48);
        int n6 = class04995.N((int)class082992.N("sizeZ", B.method_10260()), (int)0, (int)48);
        this.w = new class00753(n4, n5, n6);
        this.Y = class082992.N("rotation", class06993.field_56670).orElse(Z);
        this.k = class082992.N("mirror", class07111.field_56669).orElse(m);
        this.Q = class082992.N("mode", class08070.field_56673).orElse(class08070.field_12696);
        this.O = class082992.N("ignoreEntities", true);
        this.g = class082992.N("strict", false);
        this.I = class082992.N("powered", false);
        this.J = class082992.N("showair", false);
        this.o = class082992.N("showboundingbox", true);
        this.q = class082992.N("integrity", 1.0f);
        this.K = class082992.N("seed", 0L);
        this.q();
    }

    private void N(class01207 class012072) {
        this.G = !class05018.y((String)class012072.y()) ? class012072.y() : "";
        this.w = class012072.N();
        this.method_5431();
    }

    protected void N(class08329 class083292) {
        super.N(class083292);
        class083292.N("name", this.u());
        class083292.N(L, this.G);
        class083292.N("metadata", this.l);
        class083292.N("posX", this.d.method_10263());
        class083292.N("posY", this.d.method_10264());
        class083292.N("posZ", this.d.method_10260());
        class083292.N("sizeX", this.w.method_10263());
        class083292.N("sizeY", this.w.method_10264());
        class083292.N("sizeZ", this.w.method_10260());
        class083292.N("rotation", class06993.field_56670, (Object)this.Y);
        class083292.N("mirror", class07111.field_56669, (Object)this.k);
        class083292.N("mode", class08070.field_56673, (Object)this.Q);
        class083292.N("ignoreEntities", this.O);
        class083292.N("strict", this.g);
        class083292.N("powered", this.I);
        class083292.N("showair", this.J);
        class083292.N("showboundingbox", this.o);
        class083292.N("integrity", this.q);
        class083292.N("seed", this.K);
    }

    private void N(class04782 class047822, class01207 class012072) {
        this.N(class012072);
        class01233 class012332 = new class01233().N(this.k).N(this.Y).N(this.O).y(this.g);
        if (this.q < 1.0f) {
            class012332.y().N((class01219)new class01201(class04995.N((float)this.q, (float)0.0f, (float)1.0f))).N(class07253.y(this.K));
        }
        class07209 class072093 = this.d().method_10081((class00753)this.d);
        if (class07529.K) {
            class07209.method_10097((class07209)class072093, (class07209)class072093.method_10081(this.w)).forEach(class072092 -> class047822.method_8652(class072092, class00869.EK.W(), 2));
        }
        class012072.N((class01001)class047822, class072093, class072093, class012332, class07253.y(this.K), 2 | (this.g ? 816 : 0));
    }

    public void N(class07111 class071112) {
        this.k = class071112;
    }

    public void N(class06993 class069932) {
        this.Y = class069932;
    }

    public void N(class08070 class080702) {
        this.Q = class080702;
        class00500 class005002 = this.z.method_8320(this.d());
        if (class005002.N(class00869.sh)) {
            this.z.method_8652(this.d(), (class00500)class005002.y((class08092)class07714.y, (Comparable)class080702), 2);
        }
    }

    public void N(@Nullable String string) {
        this.N(class05018.y((String)string) ? null : class01894.L((String)string));
    }

    public void N(boolean bl) {
        this.O = bl;
    }

    public void N(@Nullable class01894 class018942) {
        this.t = class018942;
    }

    public void N(class07438 class074382) {
        this.G = class074382.method_74861();
    }

    public void N(class07209 class072092) {
        this.d = class072092;
    }

    public void N(class00753 class007532) {
        this.w = class007532;
    }

    private Stream<class07209> N(class07209 class072093, class07209 class072094) {
        return class07209.method_20437((class07209)class072093, (class07209)class072094).filter(class072092 -> this.z.method_8320((class07209)class072092).N(class00869.sh)).map(this.z::method_8321).filter(class003942 -> class003942 instanceof class07253).map(class003942 -> (class07253)((Object)class003942)).filter(class072532 -> class072532.Q == class08070.field_12699 && Objects.equals(this.t, class072532.t)).map(class00394::d);
    }

    private static Optional<class05163> N(class07209 class072092, Stream<class07209> stream) {
        Iterator iterator = stream.iterator();
        if (!iterator.hasNext()) {
            return Optional.empty();
        }
        class07209 class072093 = (class07209)iterator.next();
        class05163 class051632 = new class05163(class072093);
        if (iterator.hasNext()) {
            iterator.forEachRemaining(arg_0 -> ((class05163)class051632).N(arg_0));
        } else {
            class051632.N(class072092);
        }
        return Optional.of(class051632);
    }

    public void N(long l) {
        this.K = l;
    }

    public static boolean N(class04782 class047822, class01894 class018942, class07209 class072092, class00753 class007532, boolean bl, String string, boolean bl2, List<class00891> list) {
        class01207 class012072;
        class01224 class012242 = class047822.method_14183();
        try {
            class012072 = class012242.N(class018942);
        }
        catch (class00719 class007192) {
            return false;
        }
        class012072.N((class07299)class047822, class072092, class007532, !bl, Stream.concat(list.stream(), Stream.of(class00869.EK)).toList());
        class012072.N(string);
        if (bl2) {
            try {
                return class012242.L(class018942);
            }
            catch (class00719 class007193) {
                return false;
            }
        }
        return true;
    }

    public boolean N(class04782 class047822) {
        if (this.Q != class08070.field_12697 || this.t == null) {
            return false;
        }
        class01207 class012072 = class047822.method_14183().y(this.t).orElse(null);
        if (class012072 == null) {
            return false;
        }
        if (class012072.N().equals((Object)this.w)) {
            this.N(class047822, class012072);
            return true;
        }
        this.N(class012072);
        return false;
    }

    public boolean N(class08036 class080362) {
        if (!class080362.method_7338()) {
            return false;
        }
        if (class080362.method_73183().method_8608()) {
            class080362.method_7303(this);
        }
        return true;
    }

    public void N(float f) {
        this.q = f;
    }

    public class07269 i() {
        return class07269.N(this);
    }

    public class07001 N(class01929 class019292) {
        return this.u(class019292);
    }

    public boolean W() {
        return this.O;
    }

    public boolean R() {
        return this.t != null;
    }

    public void R(boolean bl) {
        this.o = bl;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09880
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class06900
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07451
 *  minecraft.class07504
 *  minecraft.class07625
 *  minecraft.class07760
 *  minecraft.class08036
 *  minecraft.class08080
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09880;
import com.mojang.datafixers.util.Pair;
import java.util.LinkedList;
import java.util.List;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class02736;
import minecraft.class02744;
import minecraft.class02769;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class06900;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07451;
import minecraft.class07504;
import minecraft.class07625;
import minecraft.class07760;
import minecraft.class08036;
import minecraft.class08080;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class02726
extends class02736 {
    public static final int y = 3;
    public static final double L = 0.1;
    public static final double u = 0.005;
    private @Nullable class02744 Z;
    private int z;
    private float U;
    private int E = 0;
    public final List<class02769> i = new LinkedList<class02769>();
    public final List<class02769> R = new LinkedList<class02769>();
    public double M = 0.0;
    public class02769 B = class02769.M;

    public float L(float f) {
        class02744 class027442 = this.M(f);
        return class04995.Z((float)class027442.N(), (float)class027442.L().u(), (float)class027442.y().u());
    }

    private class02744 M(float f) {
        int n;
        if (f == this.U && this.E == this.z && this.Z != null) {
            return this.Z;
        }
        float f2 = ((float)(3 - this.E) + f) / 3.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        boolean bl = false;
        for (n = 0; n < this.R.size(); ++n) {
            float f5 = this.R.get(n).i();
            if (f5 <= 0.0f || !((double)(f3 += f5) >= this.M * (double)f2)) continue;
            float f6 = f3 - f5;
            f4 = (float)(((double)f2 * this.M - (double)f6) / (double)f5);
            bl = true;
            break;
        }
        if (!bl) {
            n = this.R.size() - 1;
        }
        class02769 class027692 = this.R.get(n);
        class02769 class027693 = n > 0 ? this.R.get(n - 1) : this.B;
        this.Z = new class02744(f4, class027692, class027693);
        this.z = this.E;
        this.U = f;
        return this.Z;
    }

    public boolean P() {
        return !this.R.isEmpty();
    }

    public class02726(class07504 class075042) {
        super(class075042);
    }

    public class06889 i(float f) {
        class02744 class027442 = this.M(f);
        return class04995.N((double)class027442.N(), (class06889)class027442.L().N(), (class06889)class027442.y().N());
    }

    private class06889 i(class06889 class068892) {
        class07049 class070492 = this.N.method_31483();
        if (!(class070492 instanceof class04770)) {
            return class068892;
        }
        class04770 class047702 = (class04770)class070492;
        class070492 = class047702.method_63563();
        if (class070492.B() > 0.0) {
            class06889 class068893 = class070492.u();
            double d = class068892.z();
            if (class068893.B() > 0.0 && d < 0.01) {
                return class068892.i(new class06889(class068893.M, 0.0, class068893.Z).u().L(0.001));
            }
        }
        return class068892;
    }

    private void s() {
        if (--this.E <= 0) {
            this.m();
            this.R.clear();
            if (!this.i.isEmpty()) {
                this.R.addAll(this.i);
                this.i.clear();
                this.M = 0.0;
                for (class02769 class027692 : this.R) {
                    this.M += (double)class027692.i();
                }
                int n = this.E = this.M == 0.0 ? 0 : 3;
            }
        }
        if (this.P()) {
            this.L(this.i(1.0f));
            this.y(this.R(1.0f));
            this.N(this.L(1.0f));
            this.y(this.u(1.0f));
        }
    }

    public void m() {
        this.B = new class02769(this.R(), this.i(), this.U(), this.z(), 0.0f);
    }

    public float u(float f) {
        class02744 class027442 = this.M(f);
        return class04995.Z((float)class027442.N(), (float)class027442.L().L(), (float)class027442.y().L());
    }

    @Override
    public boolean u() {
        boolean bl = this.N(this.N.method_5829().L(0.2, 0.0, 0.2));
        if (this.N.field_5976 || this.N.field_5992) {
            boolean bl2 = this.y(this.N.method_5829().M(1.0E-7));
            return bl && !bl2;
        }
        return false;
    }

    public boolean y(class00734 class007342) {
        boolean bl;
        block3: {
            block2: {
                bl = false;
                if (!this.N.Z()) break block2;
                List var3 = this.L().method_8333((class07049)this.N, class007342, class07042.N((class07049)this.N));
                if (var3.isEmpty()) break block3;
                for (class07049 class070492 : var3) {
                    if (!(class070492 instanceof class08036) && !(class070492 instanceof class07625) && !(class070492 instanceof class07504) && !this.N.method_5782() && !class070492.method_5765()) continue;
                    class070492.method_5697((class07049)this.N);
                    bl = true;
                }
                break block3;
            }
            for (class07049 class070493 : this.L().N_70((class07049)this.N, class007342)) {
                if (this.N.method_5626(class070493) || !class070493.method_5810() || !(class070493 instanceof class07504)) continue;
                class070493.method_5697((class07049)this.N);
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public double y(class04782 class047822) {
        return (double)((Integer)class047822.method_64395().N(class07305.Y)).intValue() * (this.N.method_5799() ? 0.5 : 1.0) / 20.0;
    }

    private boolean y(class06889 class068892, class08080 class080802) {
        return switch (class080802) {
            case class08080.field_12667 -> {
                if (class068892.M < 0.0) {
                    yield true;
                }
                yield false;
            }
            case class08080.field_12666 -> {
                if (class068892.M > 0.0) {
                    yield true;
                }
                yield false;
            }
            case class08080.field_12670 -> {
                if (class068892.Z > 0.0) {
                    yield true;
                }
                yield false;
            }
            case class08080.field_12668 -> {
                if (class068892.Z < 0.0) {
                    yield true;
                }
                yield false;
            }
            default -> false;
        };
    }

    @Override
    public void y() {
        class07299 class072992 = this.L();
        if (!(class072992 instanceof class04782)) {
            this.s();
            boolean bl = class07760.U((class00500)this.L().method_8320(this.N.L()));
            this.N.N(bl);
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = this.N.L();
        class00500 class005002 = this.L().method_8320((class07209)class072992);
        if (this.N.y()) {
            this.N.N(class07760.U((class00500)class005002));
            this.N((class07209)class072992, class005002, true);
        }
        this.N.method_56990();
        this.N.y(class047822);
    }

    public void N(class07209 class072092, class00500 class005002, boolean bl) {
        boolean bl2;
        class06889 class068892;
        class06889 class068893;
        if (!class07760.U((class00500)class005002)) {
            return;
        }
        class08080 class080802 = (class08080)class005002.L(((class07760)class005002.i()).L());
        Pair var5 = class07504.N((class08080)class080802);
        class06889 class068894 = new class06889((class00753)var5.getFirst()).L(0.5);
        class06889 class068895 = new class06889((class00753)var5.getSecond()).L(0.5);
        class06889 class068896 = class068894.R();
        class06889 class068897 = class068895.R();
        if (this.i().M() > (double)1.0E-5f && this.i().y(class068896) < this.i().y(class068897) || this.y(class068897, class080802)) {
            class06889 class068898 = class068896;
            class068896 = class068897;
            class068897 = class068898;
        }
        float f = 180.0f - (float)(Math.atan2(class068896.Z, class068896.M) * 180.0 / Math.PI);
        f += this.N.u() ? 180.0f : 0.0f;
        class06889 class068899 = this.R();
        if (class068894.N() != class068895.N() && class068894.L() != class068895.L()) {
            class068893 = class068895.u(class068894);
            class06889 class0688910 = class068899.u(class072092.method_61082()).u(class068894);
            class06889 class0688911 = class068893.L(class068893.y(class0688910) / class068893.y(class068893));
            class068892 = class072092.method_61082().i(class068894).i(class0688911);
            f = 180.0f - (float)(Math.atan2(class0688911.Z, class0688911.M) * 180.0 / Math.PI);
            f += this.N.u() ? 180.0f : 0.0f;
        } else {
            boolean bl3 = class068894.u((class06889)class068895).M != 0.0;
            boolean bl4 = class068894.u((class06889)class068895).Z != 0.0;
            class068892 = new class06889(bl4 ? class072092.method_46558().M : class068899.M, (double)class072092.method_10264(), bl3 ? class072092.method_46558().Z : class068899.Z);
        }
        class068893 = class068892.u(class068899);
        this.L(class068899.i(class068893));
        float f2 = 0.0f;
        boolean bl5 = bl2 = class068894.y() != class068895.y();
        if (bl2) {
            class06889 class0688912 = class072092.method_61082().i(class068897);
            double d = class0688912.R(this.R());
            this.L(this.R().y(0.0, d + 0.1, 0.0));
            f2 = this.N.u() ? 45.0f : -45.0f;
        } else {
            this.L(this.R().y(0.0, 0.1, 0.0));
        }
        this.N(f, f2);
        double d = class068899.R(this.R());
        if (d > 0.0) {
            this.i.add(new class02769(this.R(), this.i(), this.U(), this.z(), bl ? 0.0f : (float)d));
        }
    }

    @Override
    public double N(class07209 class072092, class08080 class080802, double d) {
        if (d < (double)1.0E-5f) {
            return 0.0;
        }
        class06889 class068892 = this.R();
        Pair var6 = class07504.N((class08080)class080802);
        class00753 class007532 = (class00753)var6.getFirst();
        class00753 class007533 = (class00753)var6.getSecond();
        class06889 class068893 = this.i().R();
        if (class068893.M() < (double)1.0E-5f) {
            this.y(class06889.L);
            return 0.0;
        }
        boolean bl = class007532.method_10264() != class007533.method_10264();
        class06889 class068894 = new class06889(class007533).L(0.5).R();
        class06889 class068895 = new class06889(class007532).L(0.5).R();
        if (class068893.y(class068895) < class068893.y(class068894)) {
            class068895 = class068894;
        }
        class06889 class068896 = class072092.method_61082().i(class068895).y(0.0, 0.1, 0.0).i(class068895.u().L((double)1.0E-5f));
        if (bl && !this.y(class068893, class080802)) {
            class068896 = class068896.y(0.0, 1.0, 0.0);
        }
        class06889 class068897 = class068896.u(this.R()).u();
        class068893 = class068897.L(class068893.M() / class068897.Z());
        class06889 class068898 = class068892.i(class068893.u().L(d * (double)(bl ? class04995.M : 1.0f)));
        if (class068892.M(class068896) <= class068892.M(class068898)) {
            d = class068896.u(class068898).Z();
            class068898 = class068896;
        } else {
            d = 0.0;
        }
        this.N.method_5784(class07451.field_6308, class068898.u(class068892));
        class00500 class005002 = this.L().method_8320(class07209.method_49638((class00737)class068898));
        if (bl) {
            class08080 class080803;
            if (class07760.U((class00500)class005002) && this.N(class080802, class080803 = (class08080)class005002.L(((class07760)class005002.i()).L()))) {
                return 0.0;
            }
            double d2 = class068896.R().R(this.R().R());
            double d3 = class068896.B + (this.y(class068893, class080802) ? d2 : -d2);
            if (this.R().B < d3) {
                this.y(this.R().M, d3, this.R().Z);
            }
        }
        if (this.R().R(class068892) < (double)1.0E-5f && class068898.R(class068892) > (double)1.0E-5f) {
            this.y(class06889.L);
            return 0.0;
        }
        this.y(class068893);
        return d;
    }

    private boolean N(class08080 class080802, class08080 class080803) {
        if (this.i().B() < 0.005 && class080803.y() && this.y(this.i(), class080802) && !this.y(this.i(), class080803)) {
            this.y(class06889.L);
            return true;
        }
        return false;
    }

    public boolean N(class00734 class007342) {
        List var2;
        if (this.N.Z() && !this.N.method_5782() && !(var2 = this.L().method_8333((class07049)this.N, class007342, class07042.N((class07049)this.N))).isEmpty()) {
            for (class07049 class070492 : var2) {
                if (class070492 instanceof class08036 || class070492 instanceof class07625 || class070492 instanceof class07504 || this.N.method_5782() || class070492.method_5765() || !class070492.method_5804((class07049)this.N)) continue;
                return true;
            }
        }
        return false;
    }

    private class06889 N(class04782 class047822, class06889 class068892, class09880 class098802, class07209 class072092, class00500 class005002, class08080 class080802) {
        class06889 class068893;
        class06889 class068894;
        class06889 class068895 = class068892;
        if (!class098802.L && (class068894 = this.N(class068895, class080802)).z() != class068895.z()) {
            class098802.L = true;
            class068895 = class068894;
        }
        if (class098802.y && (class068894 = this.i(class068895)).z() != class068895.z()) {
            class098802.u = true;
            class068895 = class068894;
        }
        if (!class098802.u && (class068894 = this.N(class068895, class005002)).z() != class068895.z()) {
            class098802.u = true;
            class068895 = class068894;
        }
        if (class098802.y && (class068895 = this.N.N(class068895)).B() > 0.0) {
            double d = Math.min(class068895.M(), this.N.N_73(class047822));
            class068895 = class068895.u().L(d);
        }
        if (!class098802.i && (class068893 = this.N(class068895, class072092, class005002)).z() != class068895.z()) {
            class098802.i = true;
            class068895 = class068893;
        }
        return class068895;
    }

    private class06889 N(class06889 class068892, class08080 class080802) {
        double d = Math.max(0.0078125, class068892.Z() * 0.02);
        if (this.N.method_5799()) {
            d *= 0.2;
        }
        return switch (class080802) {
            case class08080.field_12667 -> class068892.y(-d, 0.0, 0.0);
            case class08080.field_12666 -> class068892.y(d, 0.0, 0.0);
            case class08080.field_12670 -> class068892.y(0.0, 0.0, d);
            case class08080.field_12668 -> class068892.y(0.0, 0.0, -d);
            default -> class068892;
        };
    }

    private void N(float f, float f2) {
        double d = Math.abs(f - this.U());
        if (d >= 175.0 && d <= 185.0) {
            this.N.y(!this.N.u());
            f -= 180.0f;
            f2 *= -1.0f;
        }
        f2 = Math.clamp((float)f2, (float)-45.0f, (float)45.0f);
        this.N(f2 % 360.0f);
        this.y(f % 360.0f);
    }

    @Override
    public void N(class04782 class047822) {
        class09880 class098802 = new class09880();
        while (class098802.N() && this.N.method_5805()) {
            class06889 class068892;
            class06889 class068893;
            class06889 class068894 = this.i();
            class07209 class072092 = this.N.L();
            class00500 class005002 = this.L().method_8320(class072092);
            boolean bl = class07760.U((class00500)class005002);
            if (this.N.method_52172() != bl) {
                this.N.N(bl);
                this.N(class072092, class005002, false);
            }
            if (bl) {
                this.N.method_38785();
                this.N.method_22862();
                if (class005002.N(class00869.Bh)) {
                    this.N.N(class047822, class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), ((Boolean)class005002.L((class08092)class06900.u)).booleanValue());
                }
                class068893 = (class08080)class005002.L(((class07760)class005002.i()).L());
                class068892 = this.N(class047822, class068894.R(), class098802, class072092, class005002, (class08080)class068893);
                class098802.N = class098802.y ? class068892.Z() : (class098802.N += class068892.Z() - class068894.Z());
                this.y(class068892);
                class098802.N = this.N.N(class072092, (class08080)class068893, class098802.N);
            } else {
                this.N.L(class047822);
                class098802.N = 0.0;
            }
            class068893 = this.R();
            class068892 = class068893.u(this.N.method_61411());
            double d = class068892.M();
            if (d > (double)1.0E-5f) {
                if (class068892.z() > (double)1.0E-5f) {
                    float f = 180.0f - (float)(Math.atan2(class068892.Z, class068892.M) * 180.0 / Math.PI);
                    float f2 = this.N.method_24828() && !this.N.method_52172() ? 0.0f : 90.0f - (float)(Math.atan2(class068892.Z(), class068892.B) * 180.0 / Math.PI);
                    this.N(f += this.N.u() ? 180.0f : 0.0f, f2 *= this.N.u() ? -1.0f : 1.0f);
                } else if (!this.N.method_52172()) {
                    this.N(this.N.method_24828() ? 0.0f : class04995.Z((float)0.2f, (float)this.z(), (float)0.0f));
                }
                this.i.add(new class02769(class068893, this.i(), this.U(), this.z(), (float)Math.min(d, this.y(class047822))));
            } else if (class068894.z() > 0.0) {
                this.i.add(new class02769(class068893, this.i(), this.U(), this.z(), 1.0f));
            }
            if (d > (double)1.0E-5f || class098802.y) {
                this.N.method_61409();
                this.N.method_61409();
            }
            class098802.y = false;
        }
    }

    private class06889 N(class06889 class068892, class07209 class072092, class00500 class005002) {
        if (!class005002.N(class00869.yG) || !((Boolean)class005002.L((class08092)class06900.u)).booleanValue()) {
            return class068892;
        }
        if (class068892.M() > 0.01) {
            return class068892.u().L(class068892.M() + 0.06);
        }
        class06889 class068893 = this.N.N(class072092);
        if (class068893.B() <= 0.0) {
            return class068892;
        }
        return class068893.L(class068892.M() + 0.2);
    }

    private class06889 N(class06889 class068892, class00500 class005002) {
        if (!class005002.N(class00869.yG) || ((Boolean)class005002.L((class08092)class06900.u)).booleanValue()) {
            return class068892;
        }
        if (class068892.M() < 0.03) {
            return class06889.L;
        }
        return class068892.L(0.5);
    }

    @Override
    public double W() {
        return this.N.method_5782() ? 0.997 : 0.975;
    }

    public class06889 R(float f) {
        class02744 class027442 = this.M(f);
        return class04995.N((double)class027442.N(), (class06889)class027442.L().y(), (class06889)class027442.y().y());
    }
}


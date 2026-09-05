/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01235
 *  minecraft.class01599
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04688
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06273
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06912
 *  minecraft.class06925
 *  minecraft.class07049
 *  minecraft.class07057
 *  minecraft.class07062
 *  minecraft.class07065
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07451
 *  minecraft.class08005
 *  minecraft.class08036
 *  minecraft.class08038
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08382
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.Collections;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00677;
import minecraft.class00711;
import minecraft.class00717;
import minecraft.class00869;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01235;
import minecraft.class01599;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04688;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06273;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06912;
import minecraft.class06925;
import minecraft.class07049;
import minecraft.class07057;
import minecraft.class07062;
import minecraft.class07065;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07451;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08038;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08382;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00696
extends class08005 {
    private static final Logger y = LogUtils.getLogger();
    private final class06069 L = class06069.u();
    public boolean N;
    private int u;
    private static final int R = 10;
    private static final class02131<Integer> M = class03289.N(class00696.class, (class04383)class02154.y);
    private static final class02131<Boolean> B = class03289.N(class00696.class, (class04383)class02154.U);
    private int Z;
    private int z;
    private int U;
    private int E;
    private float W;
    private boolean m = true;
    private @Nullable class07049 P;
    private class00711 s = class00711.field_7180;
    private final int T;
    private final int b;
    private final class08382 j = new class08382((class07049)this);

    public void L(@Nullable class07049 class070492) {
        super.L(class070492);
        this.N(this);
    }

    public @Nullable class08036 L() {
        class07049 class070492 = this.z();
        return class070492 instanceof class08036 ? (class08036)class070492 : null;
    }

    private class00677 L(class07209 class072092) {
        class00500 class005002 = this.method_73183().method_8320(class072092);
        if (class005002.P() || class005002.N(class00869.RS)) {
            return class00677.field_23236;
        }
        class04688 class046882 = class005002.Y();
        if (class046882.N(class01231.N) && class046882.u() && class005002.M((class07290)this.method_73183(), class072092).method_1110()) {
            return class00677.field_23237;
        }
        return class00677.field_23238;
    }

    public void method_5674(class02131<?> class021312) {
        if (M.equals(class021312)) {
            int n = (Integer)this.method_5841().N(M);
            class07049 class070492 = this.P = n > 0 ? this.method_73183().method_8469(n - 1) : null;
        }
        if (B.equals(class021312)) {
            this.N = (Boolean)this.method_5841().N(B);
            if (this.N) {
                this.method_18800(this.method_18798().M, -0.4f * class04995.N((class06069)this.L, (float)0.6f, (float)1.0f), this.method_18798().Z);
            }
        }
        super.method_5674(class021312);
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        if (this.L() == null) {
            int n = class072762.W();
            y.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", (Object)this.method_73183().method_8469(n), (Object)n);
            this.method_31472();
        }
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        class07049 class070492 = this.z();
        return new class07276((class07049)this, class015992, class070492 == null ? this.method_5628() : class070492.method_5628());
    }

    protected void method_5693(class04293 class042932) {
        class042932.N(M, (Object)0);
        class042932.N(B, (Object)false);
    }

    public void method_36209() {
        this.N((class00696)null);
    }

    public void method_5773() {
        boolean bl;
        this.L.N(this.method_5667().getLeastSignificantBits() ^ this.method_73183().N());
        this.method_66233().method_66271();
        super.method_5773();
        class08036 class080362 = this.L();
        if (class080362 == null) {
            this.method_31472();
            return;
        }
        if (!this.method_73183().method_8608() && this.N(class080362)) {
            return;
        }
        if (this.method_24828()) {
            ++this.Z;
            if (this.Z >= 1200) {
                this.method_31472();
                return;
            }
        } else {
            this.Z = 0;
        }
        float f = 0.0f;
        class07209 class072092 = this.method_24515();
        class04688 class046882 = this.method_73183().method_8316(class072092);
        if (class046882.N(class01231.N)) {
            f = class046882.N((class07290)this.method_73183(), class072092);
        }
        boolean bl2 = bl = f > 0.0f;
        if (this.s == class00711.field_7180) {
            if (this.P != null) {
                this.method_18799(class06889.L);
                this.s = class00711.field_7178;
                return;
            }
            if (bl) {
                this.method_18799(this.method_18798().u(0.3, 0.2, 0.3));
                this.s = class00711.field_7179;
                return;
            }
            this.i();
        } else {
            if (this.s == class00711.field_7178) {
                if (this.P != null) {
                    if (this.P.method_31481() || !this.P.method_73187() || this.P.method_73183().method_27983() != this.method_73183().method_27983()) {
                        this.i(null);
                        this.s = class00711.field_7180;
                    } else {
                        this.method_5814(this.P.method_23317(), this.P.method_23323(0.8), this.P.method_23321());
                    }
                }
                return;
            }
            if (this.s == class00711.field_7179) {
                class06889 class068892 = this.method_18798();
                double d = this.method_23318() + class068892.B - (double)class072092.method_10264() - (double)f;
                if (Math.abs(d) < 0.01) {
                    d += Math.signum(d) * 0.1;
                }
                this.method_18800(class068892.M * 0.9, class068892.B - d * (double)this.field_5974.z() * 0.2, class068892.Z * 0.9);
                this.m = this.z > 0 || this.E > 0 ? this.m && this.u < 10 && this.y(class072092) : true;
                if (bl) {
                    this.u = Math.max(0, this.u - 1);
                    if (this.N) {
                        this.method_18799(this.method_18798().y(0.0, -0.1 * (double)this.L.z() * (double)this.L.z(), 0.0));
                    }
                    if (!this.method_73183().method_8608()) {
                        this.N(class072092);
                    }
                } else {
                    this.u = Math.min(10, this.u + 1);
                }
            }
        }
        if (!class046882.N(class01231.N) && !this.method_24828() && this.P == null) {
            this.method_18799(this.method_18798().y(0.0, -0.03, 0.0));
        }
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_61409();
        this.T();
        if (this.s == class00711.field_7180 && (this.method_24828() || this.field_5976)) {
            this.method_18799(class06889.L);
        }
        double d = 0.92;
        this.method_18799(this.method_18798().L(0.92));
        this.method_23311();
    }

    public void method_5650(class07062 class070622) {
        this.N((class00696)null);
        super.method_5650(class070622);
    }

    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    protected void method_5652(class08329 class083292) {
    }

    public boolean method_5640(double d) {
        double d2 = 64.0;
        return d < 4096.0;
    }

    protected void method_5749(class08299 class082992) {
    }

    public class08382 method_66233() {
        return this.j;
    }

    public void method_5711(byte by) {
        class07049 class070492;
        if (by == 31 && this.method_73183().method_8608() && (class070492 = this.P) instanceof class08036 && ((class08036)class070492).method_7340()) {
            this.y(this.P);
        }
        super.method_5711(by);
    }

    public boolean method_5822(boolean bl) {
        return false;
    }

    public class00696(class07078<? extends class00696> class070782, class07299 class072992, int n, int n2) {
        super(class070782, class072992);
        this.T = Math.max(0, n);
        this.b = Math.max(0, n2);
    }

    public class00696(class08036 class080362, class07299 class072992, int n, int n2) {
        this((class07078<? extends class00696>)class07078.LL, class072992, n, n2);
        this.L((class07049)class080362);
        float f = class080362.method_36455();
        float f2 = class080362.method_36454();
        float f3 = class04995.P((double)(-f2 * ((float)Math.PI / 180) - (float)Math.PI));
        float f4 = class04995.m((double)(-f2 * ((float)Math.PI / 180) - (float)Math.PI));
        float f5 = -class04995.P((double)(-f * ((float)Math.PI / 180)));
        float f6 = class04995.m((double)(-f * ((float)Math.PI / 180)));
        double d = class080362.method_23317() - (double)f4 * 0.3;
        double d2 = class080362.method_23320();
        double d3 = class080362.method_23321() - (double)f3 * 0.3;
        this.method_5808(d, d2, d3, f2, f);
        class06889 class068892 = new class06889((double)(-f4), (double)class04995.N((float)(-(f6 / f5)), (float)-5.0f, (float)5.0f), (double)(-f3));
        double d4 = class068892.M();
        class068892 = class068892.u(0.6 / d4 + this.field_5974.N(0.5, 0.0103365), 0.6 / d4 + this.field_5974.N(0.5, 0.0103365), 0.6 / d4 + this.field_5974.N(0.5, 0.0103365));
        this.method_18799(class068892);
        this.method_36456((float)(class04995.u((double)class068892.M, (double)class068892.Z) * 57.2957763671875));
        this.method_36457((float)(class04995.u((double)class068892.B, (double)class068892.Z()) * 57.2957763671875));
        this.field_5982 = this.method_36454();
        this.field_6004 = this.method_36455();
    }

    public class00696(class07078<? extends class00696> class070782, class07299 class072992) {
        this(class070782, class072992, 0, 0);
    }

    private void i(@Nullable class07049 class070492) {
        this.P = class070492;
        this.method_5841().N(M, (Object)(class070492 == null ? 0 : class070492.method_5628() + 1));
    }

    private void i() {
        class07089 class070892 = class08038.N((class07049)this, this::N);
        this.y(class070892);
    }

    public @Nullable class07049 u() {
        return this.P;
    }

    protected void y(class07049 class070492) {
        class07049 class070493 = this.z();
        if (class070493 == null) {
            return;
        }
        class06889 class068892 = new class06889(class070493.method_23317() - this.method_23317(), class070493.method_23318() - this.method_23318(), class070493.method_23321() - this.method_23321()).L(0.1);
        class070492.method_18799(class070492.method_18798().i(class068892));
    }

    private boolean y(class07209 class072092) {
        class00677 class006772 = class00677.field_23238;
        for (int i = -1; i <= 2; ++i) {
            class00677 class006773 = this.N(class072092.method_10069(-2, i, -2), class072092.method_10069(2, i, 2));
            switch (class006773.ordinal()) {
                case 2: {
                    return false;
                }
                case 0: {
                    if (class006772 != class00677.field_23238) break;
                    return false;
                }
                case 1: {
                    if (class006772 != class00677.field_23236) break;
                    return false;
                }
            }
            class006772 = class006773;
        }
        return true;
    }

    public boolean y() {
        return this.m;
    }

    private boolean N(class08036 class080362) {
        if (class080362.method_73187()) {
            class06584 class065842 = class080362.method_6047();
            class06584 class065843 = class080362.method_6079();
            boolean bl = class065842.N(class06570.jr);
            boolean bl2 = class065843.N(class06570.jr);
            if ((bl || bl2) && this.method_5858((class07049)class080362) <= 1024.0) {
                return false;
            }
        }
        this.method_31472();
        return true;
    }

    private class00677 N(class07209 class072092, class07209 class072093) {
        return class07209.method_20437((class07209)class072092, (class07209)class072093).map(this::L).reduce((class006772, class006773) -> class006772 == class006773 ? class006772 : class00677.field_23238).orElse(class00677.field_23238);
    }

    protected void N(class06145 class061452) {
        super.N(class061452);
        if (!this.method_73183().method_8608()) {
            this.i(class061452.L());
        }
    }

    protected void N(class06183 class061832) {
        super.N(class061832);
        this.method_18799(this.method_18798().u().L(class061832.N((class07049)this)));
    }

    public int N(class06584 class065842) {
        class08036 class080362 = this.L();
        if (this.method_73183().method_8608() || class080362 == null || this.N(class080362)) {
            return 0;
        }
        int n = 0;
        if (this.P != null) {
            this.y(this.P);
            class06912.g.N((class04770)class080362, class065842, this, Collections.emptyList());
            this.method_73183().method_8421((class07049)this, (byte)31);
            n = this.P instanceof class00717 ? 3 : 5;
        } else if (this.z > 0) {
            class04162 class041622 = new class04160((class04782)this.method_73183()).N(class06551.B, (Object)this.method_73189()).N(class06551.U, (Object)class065842).N(class06551.N, (Object)this).N((float)this.T + class080362.method_7292()).N(class06925.M);
            ObjectArrayList var6 = this.method_73183().method_8503().yd().N(class06273.NW).N(class041622);
            class06912.g.N((class04770)class080362, class065842, this, (Collection)var6);
            for (class06584 class065843 : var6) {
                class00717 class007172 = new class00717(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), class065843);
                double d = class080362.method_23317() - this.method_23317();
                double d2 = class080362.method_23318() - this.method_23318();
                double d3 = class080362.method_23321() - this.method_23321();
                double d4 = 0.1;
                class007172.method_18800(d * 0.1, d2 * 0.1 + Math.sqrt(Math.sqrt(d * d + d2 * d2 + d3 * d3)) * 0.08, d3 * 0.1);
                this.method_73183().method_8649((class07049)class007172);
                class080362.method_73183().method_8649((class07049)new class07057(class080362.method_73183(), class080362.method_23317(), class080362.method_23318() + 0.5, class080362.method_23321() + 0.5, this.field_5974.y(6) + 1));
                if (!class065843.N(class01226.yP)) continue;
                class080362.method_7339(class01235.f, 1);
            }
            n = 1;
        }
        if (this.method_24828()) {
            n = 2;
        }
        this.method_31472();
        return n;
    }

    private void N(class07209 class072092) {
        class04782 class047822 = (class04782)this.method_73183();
        int n = 1;
        class07209 class072093 = class072092.method_10084();
        if (this.field_5974.z() < 0.25f && this.method_73183().method_8520(class072093)) {
            ++n;
        }
        if (this.field_5974.z() < 0.5f && !this.method_73183().N_17(class072093)) {
            --n;
        }
        if (this.z > 0) {
            --this.z;
            if (this.z <= 0) {
                this.U = 0;
                this.E = 0;
                this.method_5841().N(B, (Object)false);
            }
        } else if (this.E > 0) {
            this.E -= n;
            if (this.E > 0) {
                double d;
                double d2;
                this.W += (float)this.field_5974.N(0.0, 9.188);
                float f = this.W * ((float)Math.PI / 180);
                float f2 = class04995.m((double)f);
                float f3 = class04995.P((double)f);
                double d3 = this.method_23317() + (double)(f2 * (float)this.E * 0.1f);
                class00500 class005002 = class047822.method_8320(class07209.method_49637((double)d3, (double)((d2 = (double)((float)class04995.N((double)this.method_23318()) + 1.0f)) - 1.0), (double)(d = this.method_23321() + (double)(f3 * (float)this.E * 0.1f))));
                if (class005002.N(class00869.K)) {
                    if (this.field_5974.z() < 0.15f) {
                        class047822.method_65096((class07126)class07107.u, d3, d2 - (double)0.1f, d, 1, (double)f2, 0.1, (double)f3, 0.0);
                    }
                    float f4 = f2 * 0.04f;
                    float f5 = f3 * 0.04f;
                    class047822.method_65096((class07126)class07107.I, d3, d2, d, 0, (double)f5, 0.01, (double)(-f4), 1.0);
                    class047822.method_65096((class07126)class07107.I, d3, d2, d, 0, (double)(-f5), 0.01, (double)f4, 1.0);
                }
            } else {
                this.method_5783(class04909.Ue, 0.25f, 1.0f + (this.field_5974.z() - this.field_5974.z()) * 0.4f);
                double d = this.method_23318() + 0.5;
                class047822.method_65096((class07126)class07107.u, this.method_23317(), d, this.method_23321(), (int)(1.0f + this.method_17681() * 20.0f), (double)this.method_17681(), 0.0, (double)this.method_17681(), (double)0.2f);
                class047822.method_65096((class07126)class07107.I, this.method_23317(), d, this.method_23321(), (int)(1.0f + this.method_17681() * 20.0f), (double)this.method_17681(), 0.0, (double)this.method_17681(), (double)0.2f);
                this.z = class04995.N((class06069)this.field_5974, (int)20, (int)40);
                this.method_5841().N(B, (Object)true);
            }
        } else if (this.U > 0) {
            this.U -= n;
            float f = 0.15f;
            if (this.U < 20) {
                f += (float)(20 - this.U) * 0.05f;
            } else if (this.U < 40) {
                f += (float)(40 - this.U) * 0.02f;
            } else if (this.U < 60) {
                f += (float)(60 - this.U) * 0.01f;
            }
            if (this.field_5974.z() < f) {
                double d;
                double d4;
                float f6 = class04995.N((class06069)this.field_5974, (float)0.0f, (float)360.0f) * ((float)Math.PI / 180);
                float f7 = class04995.N((class06069)this.field_5974, (float)25.0f, (float)60.0f);
                double d5 = this.method_23317() + (double)(class04995.m((double)f6) * f7) * 0.1;
                class00500 class005003 = class047822.method_8320(class07209.method_49637((double)d5, (double)((d4 = (double)((float)class04995.N((double)this.method_23318()) + 1.0f)) - 1.0), (double)(d = this.method_23321() + (double)(class04995.P((double)f6) * f7) * 0.1)));
                if (class005003.N(class00869.K)) {
                    class047822.method_65096((class07126)class07107.NT, d5, d4, d, 2 + this.field_5974.y(2), (double)0.1f, 0.0, (double)0.1f, 0.0);
                }
            }
            if (this.U <= 0) {
                this.W = class04995.N((class06069)this.field_5974, (float)0.0f, (float)360.0f);
                this.E = class04995.N((class06069)this.field_5974, (int)20, (int)80);
            }
        } else {
            this.U = class04995.N((class06069)this.field_5974, (int)100, (int)600);
            this.U -= this.b;
        }
    }

    protected boolean N(class07049 class070492) {
        return super.N(class070492) || class070492.method_5805() && class070492 instanceof class00717;
    }

    private void N(@Nullable class00696 class006962) {
        class08036 class080362 = this.L();
        if (class080362 != null) {
            class080362.fields_57fa3311b0e9d3e9b883d09222919bf5a_2 = class006962;
        }
    }

    protected boolean v_() {
        return true;
    }
}


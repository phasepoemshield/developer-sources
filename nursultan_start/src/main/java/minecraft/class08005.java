/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09956
 *  com.google.common.base.MoreObjects
 *  it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01217
 *  minecraft.class01599
 *  minecraft.class03244
 *  minecraft.class03556
 *  minecraft.class04252
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09956;
import com.google.common.base.MoreObjects;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01217;
import minecraft.class01599;
import minecraft.class03244;
import minecraft.class03556;
import minecraft.class04252;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08000;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public abstract class class08005
extends class07049
implements class03244 {
    private static final boolean N = false;
    private static final boolean y = false;
    protected @Nullable class08372<class07049> i;
    private boolean L = false;
    private boolean u;
    private boolean R = false;
    private @Nullable class07049 M;

    public void L(@Nullable class07049 class070492) {
        this.N((class08372<class07049>)class08372.N((class08636)class070492));
    }

    public class07049 P() {
        return (class07049)MoreObjects.firstNonNull((Object)this.z(), (Object)((Object)this));
    }

    protected void T() {
        class06889 class068892 = this.method_18798();
        double d = class068892.Z();
        this.method_36457(class08005.N(this.field_6004, (float)(class04995.u((double)class068892.B, (double)d) * 57.2957763671875)));
        this.method_36456(class08005.N(this.field_5982, (float)(class04995.u((double)class068892.M, (double)class068892.Z) * 57.2957763671875)));
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        class07049 class070492 = this.method_73183().method_8469(class072762.W());
        if (class070492 != null) {
            this.L(class070492);
        }
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        class07049 class070492 = this.z();
        return new class07276((class07049)this, class015992, class070492 == null ? 0 : class070492.method_5628());
    }

    public boolean method_36971(class04782 class047822, class07209 class072092) {
        class07049 class070492 = this.z();
        if (class070492 instanceof class08036) {
            return class070492.method_36971(class047822, class072092);
        }
        return class070492 == null || (Boolean)class047822.method_64395().N(class07305.I) != false;
    }

    public void method_5773() {
        if (!this.R) {
            this.method_32875((class03556)class01194.V, this.z());
            this.R = true;
        }
        this.s();
        super.method_5773();
        this.u = false;
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (!this.method_64421(class070722)) {
            this.method_5785();
        }
        return false;
    }

    public int method_5806() {
        return 2;
    }

    protected void method_5652(class08329 class083292) {
        class08372.N(this.i, (class08329)class083292, (String)"Owner");
        if (this.L) {
            class083292.N("LeftOwner", true);
        }
        class083292.N("HasBeenShot", this.R);
    }

    public boolean method_5863() {
        return this.method_5864().N(class01217.q);
    }

    protected void method_5749(class08299 class082992) {
        this.N((class08372<class07049>)class08372.N((class08299)class082992, (String)"Owner"));
        this.L = class082992.N("LeftOwner", false);
        this.R = class082992.N("HasBeenShot", false);
    }

    public float method_5871() {
        return this.method_5863() ? 1.0f : 0.0f;
    }

    public void method_5700(boolean bl, class07209 class072092) {
        double d = bl ? -0.03 : 0.1;
        this.method_18799(this.method_18798().y(0.0, d, 0.0));
        class08005.method_66250((class07299)this.method_73183(), (class07209)class072092);
    }

    public void method_5764(boolean bl) {
        double d = bl ? -0.03 : 0.06;
        this.method_18799(this.method_18798().y(0.0, d, 0.0));
        this.method_38785();
    }

    public void method_5878(class07049 class070492) {
        super.method_5878(class070492);
        if (class070492 instanceof class08005) {
            class08005 class080052 = (class08005)class070492;
            this.i = class080052.i;
        }
    }

    public class08005(class07078<? extends class08005> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected void s() {
        if (!this.L && !this.u) {
            this.L = this.y();
            this.u = true;
        }
    }

    public @Nullable class07049 z() {
        return class08372.N(this.i, (class07299)this.method_73183());
    }

    protected boolean u(class07049 class070492) {
        return this.i != null && this.i.y((class08636)class070492);
    }

    private boolean y() {
        class07049 class070493 = this.z();
        if (class070493 != null) {
            class00734 class007342 = this.method_5829().y(this.method_18798()).M(1.0);
            return class070493.method_5668().method_24204().filter(class07042.B).noneMatch(class070492 -> class007342.L(class070492.method_5829()));
        }
        return true;
    }

    protected class04252 y(class07089 class070892) {
        class04252 class042522;
        if (class070892.N() == class07113.field_1331) {
            class06145 class061452 = (class06145)class070892;
            class07049 class070492 = class061452.L();
            class04252 class042523 = class070492.method_56071(this);
            if (class042523 != class04252.N) {
                if (class070492 != this.M && this.N(class042523, class070492, this.i, false)) {
                    this.M = class070492;
                }
                return class042523;
            }
        } else if (this.v_() && class070892 instanceof class06183 && ((class06183)class070892).M() && this.N(class042522 = class04252.y, null, this.i, false)) {
            this.method_18799(this.method_18798().L(0.2));
            return class042522;
        }
        this.N(class070892);
        return class04252.N;
    }

    public class06889 y(double d, double d2, double d3, float f, float f2) {
        return new class06889(d, d2, d3).u().y(this.field_5974.N(0.0, 0.0172275 * (double)f2), this.field_5974.N(0.0, 0.0172275 * (double)f2), this.field_5974.N(0.0, 0.0172275 * (double)f2)).L((double)f);
    }

    protected static float N(float f, float f2) {
        while (f2 - f < -180.0f) {
            f -= 360.0f;
        }
        while (f2 - f >= 180.0f) {
            f += 360.0f;
        }
        return class04995.B((float)0.2f, (float)f, (float)f2);
    }

    @class09956(N="canHitEntity")
    protected boolean N(class07049 class070492) {
        if (!class070492.method_49108()) {
            return false;
        }
        class07049 class070493 = this.z();
        return class070493 == null || this.L || !class070493.method_5794(class070492);
    }

    public boolean N(class04782 class047822) {
        return this.method_5864().N(class01217.B) && (Boolean)class047822.method_64395().N(class07305.e) != false;
    }

    public static <T extends class08005> T N(T t, class04782 class047822, class06584 class065842) {
        return (T)((Object)class08005.N(t, class047822, class065842, class080052 -> {}));
    }

    public void N(double d, double d2, double d3, float f, float f2) {
        class06889 class068892 = this.y(d, d2, d3, f, f2);
        this.method_18799(class068892);
        this.field_64356 = true;
        double d4 = class068892.Z();
        this.method_36456((float)(class04995.u((double)class068892.M, (double)class068892.Z) * 57.2957763671875));
        this.method_36457((float)(class04995.u((double)class068892.B, (double)d4) * 57.2957763671875));
        this.field_5982 = this.method_36454();
        this.field_6004 = this.method_36455();
    }

    public static <T extends class08005> T N(T t, class04782 class047822, class06584 class065842, Consumer<T> consumer) {
        consumer.accept(t);
        class047822.method_8649(t);
        t.N(class047822, class065842);
        return t;
    }

    public void N(class04782 class047822, class06584 class065842) {
        class08007 class080072;
        class07323.N((class04782)class047822, (class06584)class065842, (class08005)this, (T class065812) -> {});
        class08005 class080052 = this;
        if (class080052 instanceof class08007 && (class080052 = (class080072 = (class08007)class080052).method_59958()) != null && !class080052.R() && !class065842.B().equals(class080052.B())) {
            class07323.N((class04782)class047822, (class06584)class080052, (class08005)this, class080072::N);
        }
    }

    public void N(class07049 class070492, float f, float f2, float f3, float f4, float f5) {
        float f6 = -class04995.m((double)(f2 * ((float)Math.PI / 180))) * class04995.P((double)(f * ((float)Math.PI / 180)));
        float f7 = -class04995.m((double)((f + f3) * ((float)Math.PI / 180)));
        float f8 = class04995.P((double)(f2 * ((float)Math.PI / 180))) * class04995.P((double)(f * ((float)Math.PI / 180)));
        this.N(f6, f7, f8, f4, f5);
        class06889 class068892 = class070492.method_60478();
        this.method_18799(this.method_18798().y(class068892.M, class070492.method_24828() ? 0.0 : class068892.B, class068892.Z));
    }

    public static <T extends class08005> T N(class08000<T> class080002, class04782 class047822, class06584 class065842, class07438 class074382, float f, float f2, float f3) {
        return (T)((Object)class08005.N(class080002.create(class047822, class074382, class065842), class047822, class065842, class080052 -> class080052.N((class07049)class074382, class074382.method_36455(), class074382.method_36454(), f, f2, f3)));
    }

    public static <T extends class08005> T N(class08000<T> class080002, class04782 class047822, class06584 class065842, class07438 class074382, double d, double d2, double d3, float f, float f2) {
        return (T)((Object)class08005.N(class080002.create(class047822, class074382, class065842), class047822, class065842, class080052 -> class080052.N(d, d2, d3, f, f2)));
    }

    public static <T extends class08005> T N(T t, class04782 class047822, class06584 class065842, double d, double d2, double d3, float f, float f2) {
        return (T)((Object)class08005.N(t, class047822, class065842, class080053 -> t.N(d, d2, d3, f, f2)));
    }

    protected void N(class06581 class065812) {
    }

    protected void N(class07089 class070892) {
        class07113 class071132 = class070892.N();
        if (class071132 == class07113.field_1331) {
            class06145 class061452 = (class06145)class070892;
            class07049 class070492 = class061452.L();
            if (class070492.method_5864().N(class01217.q) && class070492 instanceof class08005) {
                ((class08005)class070492).N(class04252.L, this.z(), this.i, true);
            }
            this.N(class061452);
            this.method_73183().method_32888((class03556)class01194.K, class070892.y(), class01164.N((class07049)this, null));
        } else if (class071132 == class07113.field_1332) {
            class06183 class061832 = (class06183)class070892;
            this.N(class061832);
            class07209 class072092 = class061832.u();
            this.method_73183().N((class03556)class01194.K, class072092, class01164.N((class07049)this, (class00500)this.method_73183().method_8320(class072092)));
        }
    }

    protected void N(class06145 class061452) {
    }

    protected void N(class06183 class061832) {
        class00500 class005002 = this.method_73183().method_8320(class061832.u());
        class005002.N(this.method_73183(), class005002, class061832, this);
    }

    protected void N(@Nullable class08372<class07049> class083722) {
        this.i = class083722;
    }

    public boolean N(class04252 class042522, @Nullable class07049 class070492, @Nullable class08372<class07049> class083722, boolean bl) {
        class042522.deflect(this, class070492, this.field_5974);
        if (!this.method_73183().method_8608()) {
            this.N(class083722);
            this.a_(bl);
        }
        return true;
    }

    public DoubleDoubleImmutablePair a_(class07438 class074382, class07072 class070722) {
        double d = this.method_18798().M;
        double d2 = this.method_18798().Z;
        return DoubleDoubleImmutablePair.of((double)d, (double)d2);
    }

    protected void a_(boolean bl) {
    }

    protected boolean v_() {
        return false;
    }
}


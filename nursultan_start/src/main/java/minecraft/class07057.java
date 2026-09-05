/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class01128
 *  minecraft.class01231
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02477
 *  minecraft.class02523
 *  minecraft.class02525
 *  minecraft.class03289
 *  minecraft.class03530
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04651
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04911
 *  minecraft.class06338
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08382
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class01128;
import minecraft.class01231;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02477;
import minecraft.class02523;
import minecraft.class02525;
import minecraft.class03289;
import minecraft.class03530;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04651;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04911;
import minecraft.class06338;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08382;
import org.jspecify.annotations.Nullable;

public class class07057
extends class07049 {
    protected static final class02131<Integer> N = class03289.N(class07057.class, (class04383)class02154.y);
    private static final int y = 6000;
    private static final int L = 20;
    private static final int u = 8;
    private static final int i = 40;
    private static final double R = 0.5;
    private static final short M = 5;
    private static final short B = 0;
    private static final short Z = 0;
    private static final int z = 1;
    private int U = 0;
    private int E = 5;
    private int W = 1;
    private @Nullable class08036 m;
    private final class08382 P = new class08382((class07049)this);

    private void L() {
        class08036 class080362;
        if (this.m == null || this.m.method_7325() || this.m.method_5858((class07049)this) > 64.0) {
            class080362 = this.method_73183().N((class07049)this, 8.0);
            this.m = class080362 != null && !class080362.method_7325() && !class080362.method_29504() ? class080362 : null;
        }
        if (this.m != null) {
            class080362 = new class06889(this.m.method_23317() - this.method_23317(), this.m.method_23318() + (double)this.m.method_5751() / 2.0 - this.method_23318(), this.m.method_23321() - this.method_23321());
            double d = class080362.B();
            double d2 = 1.0 - Math.sqrt(d) / 8.0;
            this.method_18799(this.method_18798().i(class080362.u().L(d2 * d2 * 0.1)));
        }
    }

    @Override
    protected void method_5693(class04293 class042932) {
        class042932.N(N, (Object)0);
    }

    @Override
    public void method_5773() {
        boolean bl;
        this.P.method_66271();
        if (this.field_5953 && this.method_73183().method_8608()) {
            this.field_5953 = false;
            return;
        }
        super.method_5773();
        boolean bl2 = bl = !this.method_73183().y(this.method_5829());
        if (this.method_5777((class03530<class04651>)class01231.N)) {
            this.i();
        } else if (!bl) {
            this.method_56990();
        }
        if (this.method_73183().method_8316(this.method_24515()).N(class01231.y)) {
            this.method_18800((this.field_5974.z() - this.field_5974.z()) * 0.2f, 0.2f, (this.field_5974.z() - this.field_5974.z()) * 0.2f);
        }
        if (this.field_6012 % 20 == 1) {
            this.u();
        }
        this.L();
        if (this.m == null && !this.method_73183().method_8608() && bl) {
            boolean bl3;
            boolean bl4 = bl3 = !this.method_73183().y(this.method_5829().L(this.method_18798()));
            if (bl3) {
                this.method_5632(this.method_23317(), (this.method_5829().y + this.method_5829().i) / 2.0, this.method_23321());
                this.field_64356 = true;
            }
        }
        double d = this.method_18798().B;
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_61409();
        float f = 0.98f;
        if (this.method_24828()) {
            f = this.method_73183().method_8320(this.method_23314()).i().Z() * 0.98f;
        }
        this.method_18799(this.method_18798().L((double)f));
        if (this.field_36331 && d < -this.method_56989()) {
            this.method_18799(new class06889(this.method_18798().M, -d * 0.4, this.method_18798().Z));
        }
        ++this.U;
        if (this.U >= 6000) {
            this.method_31472();
        }
    }

    @Override
    public class04911 method_5634() {
        return class04911.field_15256;
    }

    @Override
    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_64421(class070722)) {
            return false;
        }
        this.method_5785();
        this.E = (int)((float)this.E - f);
        if (this.E <= 0) {
            this.method_31472();
        }
        return true;
    }

    @Override
    protected class07065 method_33570() {
        return class07065.field_28630;
    }

    @Override
    public class07209 method_23314() {
        return this.method_43258(0.999999f);
    }

    @Override
    protected double method_7490() {
        return 0.03;
    }

    @Override
    protected void method_5746() {
    }

    @Override
    public void method_5694(class08036 class080362) {
        if (!(class080362 instanceof class04770)) {
            return;
        }
        class04770 class047702 = (class04770)class080362;
        if (class080362.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 == 0) {
            class080362.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 = 2;
            class080362.method_6103((class07049)this, 1);
            int n = this.N(class047702, this.N());
            if (n > 0) {
                class080362.method_7255(n);
            }
            --this.W;
            if (this.W == 0) {
                this.method_31472();
            }
        }
    }

    @Override
    protected void method_5652(class08329 class083292) {
        class083292.N("Health", (short)this.E);
        class083292.N("Age", (short)this.U);
        class083292.N("Value", (short)this.N());
        class083292.N("Count", this.W);
    }

    @Override
    public final boolean method_5643(class07072 class070722) {
        return !this.method_64421(class070722);
    }

    @Override
    protected void method_5749(class08299 class082992) {
        this.E = class082992.N("Health", (short)5);
        this.U = class082992.N("Age", (short)0);
        this.y(class082992.N("Value", (short)0));
        this.W = class082992.N("Count", class06338.b).orElse(1);
    }

    @Override
    public class08382 method_66233() {
        return this.P;
    }

    @Override
    public boolean method_5732() {
        return false;
    }

    public class07057(class07299 class072992, double d, double d2, double d3, int n) {
        this(class072992, new class06889(d, d2, d3), class06889.L, n);
    }

    public class07057(class07078<? extends class07057> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    public class07057(class07299 class072992, class06889 class068892, class06889 class068893, int n) {
        this((class07078<? extends class07057>)class07078.r, class072992);
        this.method_33574(class068892);
        if (!class072992.method_8608()) {
            this.method_36456(this.field_5974.z() * 360.0f);
            class06889 class068894 = new class06889((this.field_5974.U() * 0.2 - 0.1) * 2.0, this.field_5974.U() * 0.2 * 2.0, (this.field_5974.U() * 0.2 - 0.1) * 2.0);
            if (class068893.B() > 0.0 && class068893.y(class068894) < 0.0) {
                class068894 = class068894.L(-1.0);
            }
            double d = this.method_5829().N();
            this.method_33574(class068892.i(class068893.u().L(d * 0.5)));
            this.method_18799(class068894);
            if (!class072992.y(this.method_5829())) {
                this.N(d);
            }
        }
        this.y(n);
    }

    private void i() {
        class06889 class068892 = this.method_18798();
        this.method_18800(class068892.M * (double)0.99f, Math.min(class068892.B + (double)5.0E-4f, (double)0.06f), class068892.Z * (double)0.99f);
    }

    private void u() {
        if (this.method_73183() instanceof class04782) {
            for (class07057 class070572 : this.method_73183().method_18023(class01128.N(class07057.class), this.method_5829().M(0.5), this::N)) {
                this.y(class070572);
            }
        }
    }

    private void y(int n) {
        this.field_6011.N(N, (Object)n);
    }

    private void y(class07057 class070572) {
        this.W += class070572.W;
        this.U = Math.min(this.U, class070572.U);
        class070572.method_31472();
    }

    public int y() {
        int n = this.N();
        if (n >= 2477) {
            return 10;
        }
        if (n >= 1237) {
            return 9;
        }
        if (n >= 617) {
            return 8;
        }
        if (n >= 307) {
            return 7;
        }
        if (n >= 149) {
            return 6;
        }
        if (n >= 73) {
            return 5;
        }
        if (n >= 37) {
            return 4;
        }
        if (n >= 17) {
            return 3;
        }
        if (n >= 7) {
            return 2;
        }
        if (n >= 3) {
            return 1;
        }
        return 0;
    }

    private static boolean y(class04782 class047822, class06889 class068892, int n) {
        class00734 class007342 = class00734.N((class06889)class068892, (double)1.0, (double)1.0, (double)1.0);
        int n2 = class047822.method_8409().y(40);
        List list = class047822.method_18023(class01128.N(class07057.class), class007342, class070572 -> class07057.N(class070572, n2, n));
        if (!list.isEmpty()) {
            class07057 class070573 = (class07057)list.get(0);
            ++class070573.W;
            class070573.U = 0;
            return true;
        }
        return false;
    }

    public static void N(class04782 class047822, class06889 class068892, int n) {
        class07057.N(class047822, class068892, class06889.L, n);
    }

    protected void N(double d) {
        class06889 class068893 = this.method_73189().y(0.0, (double)this.method_17682() / 2.0, 0.0);
        class00494 class004942 = class00389.N((class00734)class00734.N((class06889)class068893, (double)d, (double)d, (double)d));
        this.method_73183().method_33594((class07049)this, class004942, class068893, (double)this.method_17681(), (double)this.method_17682(), (double)this.method_17681()).ifPresent(class068892 -> this.method_33574(class068892.y(0.0, (double)(-this.method_17682()) / 2.0, 0.0)));
    }

    private static boolean N(class07057 class070572, int n, int n2) {
        return !class070572.method_31481() && (class070572.method_5628() - n) % 40 == 0 && class070572.N() == n2;
    }

    public static void N(class04782 class047822, class06889 class068892, class06889 class068893, int n) {
        while (n > 0) {
            int n2 = class07057.N(n);
            n -= n2;
            if (class07057.y(class047822, class068892, n2)) continue;
            class047822.method_8649((class07049)new class07057((class07299)class047822, class068892, class068893, n2));
        }
    }

    private int N(class04770 class047702, int n) {
        Optional var3 = class07323.N((class02477)class02523.k, (class07438)class047702, class06584::m);
        if (var3.isPresent()) {
            int n2;
            class06584 class065842 = ((class02525)var3.get()).N();
            int n3 = class07323.L((class04782)class047702.method_51469(), (class06584)class065842, (int)n);
            int n4 = Math.min(n3, class065842.P());
            class065842.y(class065842.P() - n4);
            if (n4 > 0 && (n2 = n - n4 * n / n3) > 0) {
                return this.N(class047702, n2);
            }
            return 0;
        }
        return n;
    }

    public int N() {
        return (Integer)this.field_6011.N(N);
    }

    private boolean N(class07057 class070572) {
        return class070572 != this && class07057.N(class070572, this.method_5628(), this.N());
    }

    public static int N(int n) {
        if (n >= 2477) {
            return 2477;
        }
        if (n >= 1237) {
            return 1237;
        }
        if (n >= 617) {
            return 617;
        }
        if (n >= 307) {
            return 307;
        }
        if (n >= 149) {
            return 149;
        }
        if (n >= 73) {
            return 73;
        }
        if (n >= 37) {
            return 37;
        }
        if (n >= 17) {
            return 17;
        }
        if (n >= 7) {
            return 7;
        }
        if (n >= 3) {
            return 3;
        }
        return 1;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class01599
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02265
 *  minecraft.class02484
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04803
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06548
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06781
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07276
 *  minecraft.class07280
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07310
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07769
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00500;
import minecraft.class00710;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01599;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02265;
import minecraft.class02484;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04803;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06548;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06781;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07276;
import minecraft.class07280;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07310;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07769;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00679
extends class00710 {
    private static final class02131<class06584> L = class03289.N(class00679.class, (class04383)class02154.B);
    private static final class02131<Integer> u = class03289.N(class00679.class, (class04383)class02154.y);
    public static final int N = 8;
    private static final float i = 0.0625f;
    private static final float R = 0.75f;
    private static final float M = 0.75f;
    private static final byte B = 0;
    private static final float Z = 1.0f;
    private static final boolean z = false;
    private static final boolean U = false;
    private float E = 1.0f;
    private boolean W = false;

    private void L(class06584 class065842) {
        class07769 class077692;
        class02265 class022652 = this.N(class065842);
        if (class022652 != null && (class077692 = class06548.N((class02265)class022652, (class07299)this.method_73183())) != null) {
            class077692.N(this.y, this.method_5628());
        }
        class065842.N(null);
    }

    public class04891 M() {
        return class04909.sY;
    }

    protected class06584 P() {
        return new class06584((class07310)class06570.GP);
    }

    public @Nullable class04803 method_32318(int n) {
        if (n == 0) {
            return class04803.N(this::Z, this::y);
        }
        return super.method_32318(n);
    }

    @Override
    public void method_5674(class02131<?> class021312) {
        super.method_5674(class021312);
        if (class021312.equals(L)) {
            this.u(this.Z());
        }
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        this.y(class07211.N((int)class072762.W()));
    }

    public class06584 method_31480() {
        class06584 class065842 = this.Z();
        if (class065842.R()) {
            return this.P();
        }
        return class065842.t();
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        return new class07276((class07049)this, this.method_5735().L(), this.s());
    }

    public float method_73188() {
        class07211 class072112 = this.method_5735();
        int n = class072112.z().y() ? 90 * class072112.i().N() : 0;
        return class04995.y((int)(180 + class072112.u() * 90 + this.E() * 45 + n));
    }

    @Override
    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(L, (Object)class06584.E);
        class042932.N(u, (Object)0);
    }

    public void method_5768(class04782 class047822) {
        this.L(this.Z());
        super.method_5768(class047822);
    }

    public void method_5784(class07451 class074512, class06889 class068892) {
        if (!this.W) {
            super.method_5784(class074512, class068892);
        }
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.W) {
            return class00679.y(class070722) && super.method_64397(class047822, class070722, f);
        }
        if (this.method_64421(class070722)) {
            return false;
        }
        if (this.N(class070722)) {
            this.N(class047822, class070722.u(), false);
            this.method_32875((class03556)class01194.L, class070722.u());
            this.method_5783(this.R(), 1.0f, 1.0f);
            return true;
        }
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5762(double d, double d2, double d3) {
        if (!this.W) {
            super.method_5762(d, d2, d3);
        }
    }

    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class06584 class065842 = this.Z();
        if (!class065842.R()) {
            class083292.N("Item", class06584.y, (Object)class065842);
        }
        class083292.N("ItemRotation", (byte)this.E());
        class083292.N("ItemDropChance", this.E);
        class083292.N("Facing", class07211.field_57037, (Object)this.method_5735());
        class083292.N("Invisible", this.method_5767());
        class083292.N("Fixed", this.W);
    }

    public boolean method_5640(double d) {
        double d2 = 16.0;
        return d < (d2 *= 64.0 * class00679.method_5824()) * d2;
    }

    public boolean method_5643(class07072 class070722) {
        if (this.W && !class00679.y(class070722)) {
            return false;
        }
        return !this.method_64421(class070722);
    }

    public class07082 method_5688(class08036 class080362, class07050 class070502) {
        boolean bl;
        class06584 class065842 = class080362.method_5998(class070502);
        boolean bl2 = !this.Z().R();
        boolean bl3 = bl = !class065842.R();
        if (this.W) {
            return class07082.i;
        }
        if (class080362.method_73183().method_8608()) {
            return bl2 || bl ? class07082.N : class07082.i;
        }
        if (!bl2) {
            if (bl && !this.method_31481()) {
                class07769 class077692 = class06548.y((class06584)class065842, (class07299)this.method_73183());
                if (class077692 != null && class077692.N(256)) {
                    return class07082.u;
                }
                this.y(class065842);
                this.method_32875((class03556)class01194.L, (class07049)class080362);
                class065842.N(1, (class07438)class080362);
                return class07082.N;
            }
            return class07082.i;
        }
        this.method_5783(this.W(), 1.0f, 1.0f);
        this.N(this.E() + 1);
        this.method_32875((class03556)class01194.L, (class07049)class080362);
        return class07082.N;
    }

    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        class06584 class065842 = class082992.N("Item", class06584.y).orElse(class06584.E);
        class06584 class065843 = this.Z();
        if (!class065843.R() && !class06584.N((class06584)class065842, (class06584)class065843)) {
            this.L(class065843);
        }
        this.N(class065842, false);
        this.N(class082992.N("ItemRotation", (byte)0), false);
        this.E = class082992.N("ItemDropChance", 1.0f);
        this.y(class082992.N("Facing", class07211.field_57037).orElse(class07211.field_11033));
        this.method_5648(class082992.N("Invisible", false));
        this.W = class082992.N("Fixed", false);
    }

    public class00679(class07078<? extends class00679> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.method_5648(false);
    }

    public class00679(class07078<? extends class00679> class070782, class07299 class072992, class07209 class072092, class07211 class072112) {
        super(class070782, class072992, class072092);
        this.y(class072112);
        this.method_5648(false);
    }

    public class00679(class07299 class072992, class07209 class072092, class07211 class072112) {
        this((class07078<? extends class00679>)class07078.Nl, class072992, class072092, class072112);
    }

    public class04891 B() {
        return class04909.sQ;
    }

    public class06584 Z() {
        return (class06584)this.method_5841().N(L);
    }

    @Override
    public void i() {
        this.method_5783(this.B(), 1.0f, 1.0f);
    }

    public int m() {
        if (this.Z().R()) {
            return 0;
        }
        return this.E() % 8 + 1;
    }

    public class04891 U() {
        return class04909.sk;
    }

    public boolean z() {
        return this.Z().L(class02484.f);
    }

    private void u(class06584 class065842) {
        if (!class065842.R() && class065842.q() != this) {
            class065842.N((class07049)this);
        }
        this.N();
    }

    @Override
    protected class00734 u() {
        return this.N(this.y, this.method_5735(), false);
    }

    @Override
    public boolean y() {
        if (this.W) {
            return true;
        }
        if (this.N(this.u())) {
            return false;
        }
        class00500 class005002 = this.method_73183().method_8320(this.y.method_10093(this.method_5735().b()));
        if (!(class005002.B() || this.method_5735().z().L() && class06781.E((class00500)class005002))) {
            return false;
        }
        return this.N(true);
    }

    public void y(class06584 class065842) {
        this.N(class065842, true);
    }

    @Override
    protected void y(class07211 class072112) {
        Objects.requireNonNull(class072112);
        super.N(class072112);
        if (class072112.z().L()) {
            this.method_36457(0.0f);
            this.method_36456(class072112.u() * 90);
        } else {
            this.method_36457(-90 * class072112.i().N());
            this.method_36456(0.0f);
        }
        this.field_6004 = this.method_36455();
        this.field_5982 = this.method_36454();
        this.N();
    }

    private static boolean y(class07072 class070722) {
        return class070722.N(class03696.u) || class070722.B();
    }

    public int E() {
        return (Integer)this.method_5841().N(u);
    }

    @Override
    protected final void N() {
        super.N();
        this.method_43391(this.method_23317(), this.method_23318(), this.method_23321());
    }

    @Override
    protected class00734 N(class07209 class072092, class07211 class072112) {
        class00679 class006792 = this;
        return this.N(class072092, class072112, this.N(class006792));
    }

    private boolean N(class00679 class006792) {
        return class006792.z() && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_7);
    }

    public void N(class04782 class047822, @Nullable class07049 class070492) {
        this.method_5783(this.M(), 1.0f, 1.0f);
        this.N(class047822, class070492, true);
        this.method_32875((class03556)class01194.L, class070492);
    }

    private boolean N(class07072 class070722) {
        return !class070722.N(class03696.E) && !this.Z().R();
    }

    public void N(class06584 class065842, boolean bl) {
        if (!class065842.R()) {
            class065842 = class065842.L(1);
        }
        this.u(class065842);
        this.method_5841().N(L, (Object)class065842);
        if (!class065842.R()) {
            this.method_5783(this.U(), 1.0f, 1.0f);
        }
        if (bl && this.y != null) {
            this.method_73183().method_8455(this.y, class00869.N);
        }
    }

    public @Nullable class02265 N(class06584 class065842) {
        return (class02265)class065842.method_58694(class02484.f);
    }

    private void N(class04782 class047822, @Nullable class07049 class070492, boolean bl) {
        if (this.W) {
            return;
        }
        class06584 class065842 = this.Z();
        this.y(class06584.E);
        if (!((Boolean)class047822.method_64395().N(class07305.U)).booleanValue()) {
            if (class070492 == null) {
                this.L(class065842);
            }
            return;
        }
        if (class070492 instanceof class08036 && ((class08036)class070492).method_56992()) {
            this.L(class065842);
            return;
        }
        if (bl) {
            this.method_5775(class047822, this.P());
        }
        if (!class065842.R()) {
            class065842 = class065842.t();
            this.L(class065842);
            if (this.field_5974.z() < this.E) {
                this.method_5775(class047822, class065842);
            }
        }
    }

    private class00734 N(class07209 class072092, class07211 class072112, boolean bl) {
        float f = 0.46875f;
        class06889 class068892 = class06889.y((class00753)class072092).N(class072112, -0.46875);
        float f2 = bl ? 1.0f : 0.75f;
        float f3 = bl ? 1.0f : 0.75f;
        class07185 class071852 = class072112.z();
        double d = class071852 == class07185.field_11048 ? 0.0625 : (double)f2;
        double d2 = class071852 == class07185.field_11052 ? 0.0625 : (double)f3;
        double d3 = class071852 == class07185.field_11051 ? 0.0625 : (double)f2;
        return class00734.N(class068892, d, d2, d3);
    }

    private void N(int n, boolean bl) {
        this.method_5841().N(u, (Object)(n % 8));
        if (bl && this.y != null) {
            this.method_73183().method_8455(this.y, class00869.N);
        }
    }

    public void N(int n) {
        this.N(n, true);
    }

    public class04891 W() {
        return class04909.sg;
    }

    public class04891 R() {
        return class04909.sO;
    }
}


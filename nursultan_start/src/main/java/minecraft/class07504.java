/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.google.common.collect.UnmodifiableIterator
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00250
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01009
 *  minecraft.class01210
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01720
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class02726
 *  minecraft.class02736
 *  minecraft.class02757
 *  minecraft.class03289
 *  minecraft.class03794
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05188
 *  minecraft.class06113
 *  minecraft.class06163
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06900
 *  minecraft.class07049
 *  minecraft.class07065
 *  minecraft.class07078
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07276
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07322
 *  minecraft.class07438
 *  minecraft.class07451
 *  minecraft.class07760
 *  minecraft.class08036
 *  minecraft.class08041
 *  minecraft.class08080
 *  minecraft.class08092
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08382
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import minecraft.class00250;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01009;
import minecraft.class01210;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01720;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class02726;
import minecraft.class02736;
import minecraft.class02757;
import minecraft.class03289;
import minecraft.class03794;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05188;
import minecraft.class06113;
import minecraft.class06163;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06900;
import minecraft.class07049;
import minecraft.class07065;
import minecraft.class07078;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07276;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07322;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07536;
import minecraft.class07760;
import minecraft.class08036;
import minecraft.class08041;
import minecraft.class08080;
import minecraft.class08092;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08382;
import org.jspecify.annotations.Nullable;

public abstract class class07504
extends class01720 {
    private static final class06889 y = new class06889(0.0, 0.0, 0.0);
    private static final class02131<Optional<class00500>> u = class03289.N(class07504.class, (class04383)class02154.z);
    private static final class02131<Integer> B = class03289.N(class07504.class, (class04383)class02154.y);
    private static final ImmutableMap<class01312, ImmutableList<Integer>> Z = ImmutableMap.of((Object)class01312.field_18076, (Object)ImmutableList.of((Object)0, (Object)1, (Object)-1), (Object)class01312.field_18081, (Object)ImmutableList.of((Object)0, (Object)1, (Object)-1), (Object)class01312.field_18079, (Object)ImmutableList.of((Object)0, (Object)1));
    protected static final float N = 0.95f;
    private static final boolean z = false;
    private boolean U;
    private boolean E = false;
    private final class02736 W;
    private static final Map<class08080, Pair<class00753, class00753>> m = Maps.newEnumMap((Map)((Map)class07536.N(() -> {
        class00753 class007532 = class07211.field_11039.E();
        class00753 class007533 = class07211.field_11034.E();
        class00753 class007534 = class07211.field_11043.E();
        class00753 class007535 = class07211.field_11035.E();
        class00753 class007536 = class007532.method_23228();
        class00753 class007537 = class007533.method_23228();
        class00753 class007538 = class007534.method_23228();
        class00753 class007539 = class007535.method_23228();
        return ImmutableMap.of((Object)class08080.field_12665, (Object)Pair.of((Object)class007534, (Object)class007535), (Object)class08080.field_12674, (Object)Pair.of((Object)class007532, (Object)class007533), (Object)class08080.field_12667, (Object)Pair.of((Object)class007536, (Object)class007533), (Object)class08080.field_12666, (Object)Pair.of((Object)class007532, (Object)class007537), (Object)class08080.field_12670, (Object)Pair.of((Object)class007534, (Object)class007539), (Object)class08080.field_12668, (Object)Pair.of((Object)class007538, (Object)class007535), (Object)class08080.field_12664, (Object)Pair.of((Object)class007535, (Object)class007533), (Object)class08080.field_12671, (Object)Pair.of((Object)class007535, (Object)class007532), (Object)class08080.field_12672, (Object)Pair.of((Object)class007534, (Object)class007532), (Object)class08080.field_12663, (Object)Pair.of((Object)class007534, (Object)class007533));
    })));

    public class07209 L() {
        int n = class04995.N((double)this.method_23317());
        int n2 = class04995.N((double)this.method_23318());
        int n3 = class04995.N((double)this.method_23321());
        if (class07504.N(this.method_73183())) {
            double d = this.method_23318() - 0.1 - (double)1.0E-5f;
            if (this.method_73183().method_8320(class07209.method_49637((double)n, (double)d, (double)n3)).N(class01210.e)) {
                n2 = class04995.N((double)d);
            }
        } else if (this.method_73183().method_8320(new class07209(n, n2 - 1, n3)).N(class01210.e)) {
            --n2;
        }
        return new class07209(n, n2, n3);
    }

    protected void L(class04782 class047822) {
        double d = this.N_73(class047822);
        class06889 class068892 = this.method_18798();
        this.method_18800(class04995.N((double)class068892.M, (double)(-d), (double)d), class068892.B, class04995.N((double)class068892.Z, (double)(-d), (double)d));
        if (this.method_24828()) {
            this.method_18799(this.method_18798().L(0.5));
        }
        this.method_5784(class07451.field_6308, this.method_18798());
        if (!this.method_24828()) {
            this.method_18799(this.method_18798().L(0.95));
        }
    }

    public int M() {
        return (Integer)this.method_5841().N(B);
    }

    public boolean P() {
        return false;
    }

    public class06889 method_30633(class07185 class071852, class01009 class010092) {
        return class07438.method_31079((class06889)super.method_30633(class071852, class010092));
    }

    public class06889 method_24829(class07438 class074382) {
        class07211 class072112 = this.method_5755();
        if (class072112.z() == class07185.field_11052) {
            return super.method_24829(class074382);
        }
        int[][] nArray = class05188.N((class07211)class072112);
        class07209 class072093 = this.method_24515();
        class07218 class072182 = new class07218();
        ImmutableList var6 = class074382.method_24831();
        for (class01312 class013122 : var6) {
            class01325 class013252 = class074382.method_18377(class013122);
            float f = Math.min(class013252.N(), 1.0f) / 2.0f;
            UnmodifiableIterator var11 = ((ImmutableList)Z.get((Object)class013122)).iterator();
            while (var11.hasNext()) {
                int n = (Integer)var11.next();
                for (int[] nArray2 : nArray) {
                    class072182.N(class072093.method_10263() + nArray2[0], class072093.method_10264() + n, class072093.method_10260() + nArray2[1]);
                    double d = this.method_73183().N(class05188.N((class07290)this.method_73183(), (class07209)class072182), () -> class05188.N((class07290)this.method_73183(), (class07209)class072182.method_10074()));
                    if (!class05188.N((double)d)) continue;
                    class00734 class007342 = new class00734((double)(-f), 0.0, (double)(-f), (double)f, (double)class013252.y(), (double)f);
                    class06889 class068892 = class06889.N((class00753)class072182, (double)d);
                    if (!class05188.N((class07322)this.method_73183(), (class07438)class074382, (class00734)class007342.L(class068892))) continue;
                    class074382.method_18380(class013122);
                    return class068892;
                }
            }
        }
        double d = this.method_5829().i;
        class072182.N((double)class072093.method_10263(), d, (double)class072093.method_10260());
        for (class01312 class013123 : var6) {
            int n;
            double d2;
            double d3 = class074382.method_18377(class013123).y();
            if (!(d + d3 <= (d2 = class05188.N((class07209)class072182, (int)(n = class04995.L((double)(d - (double)class072182.method_10264() + d3))), class072092 -> this.method_73183().method_8320(class072092).M((class07290)this.method_73183(), class072092))))) continue;
            class074382.method_18380(class013123);
            break;
        }
        return super.method_24829(class074382);
    }

    public class07211 method_5755() {
        return this.W.E();
    }

    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        this.W.N(this.method_18798());
    }

    public abstract class06584 method_31480();

    public void method_52532(int n, double d, double d2, double d3, double d4, double d5) {
        super.method_52532(n, d, d2, d3, d4, d5);
    }

    public class06889 method_60478() {
        return this.W.u(super.method_60478());
    }

    protected void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(u, Optional.empty());
        class042932.N(B, (Object)this.B());
    }

    public void method_23311() {
        super.method_23311();
    }

    public void method_5773() {
        if (this.G() > 0) {
            this.y(this.G() - 1);
        }
        if (this.t() > 0.0f) {
            this.y(this.t() - 1.0f);
        }
        this.method_31473();
        this.method_76440();
        this.method_60698();
        this.W.y();
        this.method_5876();
        if (this.method_5771()) {
            this.method_67633();
            this.method_5730();
            this.field_6017 *= 0.5;
        }
        this.field_5953 = false;
    }

    public boolean method_5876() {
        return super.method_5876();
    }

    public void method_5784(class07451 class074512, class06889 class068892) {
        if (class07504.N(this.method_73183())) {
            class06889 class068893 = this.method_73189().i(class068892);
            super.method_5784(class074512, class068892);
            if (this.W.u()) {
                super.method_5784(class074512, class068893.u(this.method_73189()));
            }
            if (class074512.equals((Object)class07451.field_6310)) {
                this.U = false;
            }
        } else {
            super.method_5784(class074512, class068892);
            this.method_61409();
        }
    }

    protected float method_23326() {
        if (this.method_73183().method_8320(this.method_24515()).N(class01210.e)) {
            return 1.0f;
        }
        return super.method_23326();
    }

    public boolean method_52172() {
        return this.U;
    }

    public void method_61409() {
        if (class07504.N(this.method_73183())) {
            super.method_61409();
        } else {
            this.method_64166(this.method_73189(), this.method_73189());
            this.method_71965();
        }
    }

    protected class07065 method_33570() {
        return class07065.field_28632;
    }

    public void method_56990() {
        super.method_56990();
    }

    protected double method_7490() {
        return this.method_5799() ? 0.005 : 0.04;
    }

    public void method_5697(class07049 class070492) {
        double d;
        if (this.method_73183().method_8608()) {
            return;
        }
        if (class070492.field_5960 || this.field_5960) {
            return;
        }
        if (this.method_5626(class070492)) {
            return;
        }
        double d2 = class070492.method_23317() - this.method_23317();
        double d3 = d2 * d2 + (d = class070492.method_23321() - this.method_23321()) * d;
        if (d3 >= (double)1.0E-4f) {
            d3 = Math.sqrt(d3);
            d2 /= d3;
            d /= d3;
            double d4 = 1.0 / d3;
            if (d4 > 1.0) {
                d4 = 1.0;
            }
            d2 *= d4;
            d *= d4;
            d2 *= (double)0.1f;
            d *= (double)0.1f;
            d2 *= 0.5;
            d *= 0.5;
            if (class070492 instanceof class07504) {
                class07504 class075042 = (class07504)class070492;
                this.N(class075042, d2, d);
            } else {
                this.method_5762(-d2, 0.0, -d);
                class070492.method_5762(d2 / 4.0, 0.0, d / 4.0);
            }
        }
    }

    public boolean method_5810() {
        return true;
    }

    protected void method_5652(class08329 class083292) {
        this.s().ifPresent(class005002 -> class083292.N("DisplayState", class00500.N, class005002));
        int n = this.M();
        if (n != this.B()) {
            class083292.N("DisplayOffset", n);
        }
        class083292.N("FlippedRotation", this.E);
        class083292.N("HasTicked", this.field_5953);
    }

    public boolean method_5863() {
        return !this.method_31481();
    }

    protected void method_5749(class08299 class082992) {
        this.N_19(class082992.N("DisplayState", class00500.N));
        this.N(class082992.N("DisplayOffset", this.B()));
        this.E = class082992.N("FlippedRotation", false);
        this.field_5953 = class082992.N("HasTicked", false);
    }

    public boolean method_30949(class07049 class070492) {
        return class00250.N((class07049)this, (class07049)class070492);
    }

    protected class06889 method_52533(class07049 class070492, class01325 class013252, float f) {
        if (class070492 instanceof class08041 || class070492 instanceof class06163) {
            return y;
        }
        return super.method_52533(class070492, class013252, f);
    }

    public class08382 method_66233() {
        return this.W.N();
    }

    public void method_5750(class06889 class068892) {
        this.W.N(class068892);
    }

    public void method_5879(float f) {
        this.L(-this.l());
        this.y(10);
        this.y(this.t() + this.t() * 10.0f);
    }

    protected class07504(class07078<?> class070782, class07299 class072992, double d, double d2, double d3) {
        this(class070782, class072992);
        this.N(d, d2, d3);
    }

    protected class07504(class07078<?> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_23807 = true;
        this.W = class07504.N(class072992) ? new class02726(this) : new class02757(this);
    }

    public int B() {
        return 6;
    }

    public boolean Z() {
        return false;
    }

    public class00500 i() {
        return this.s().orElseGet(this::R);
    }

    private Optional<class00500> s() {
        return (Optional)this.method_5841().N(u);
    }

    public boolean u() {
        return this.E;
    }

    protected void y(class04782 class047822) {
        this.W.N(class047822);
    }

    public boolean y() {
        return this.field_5953;
    }

    public boolean y(class07209 class072092) {
        return this.method_73183().method_8320(class072092).u((class07290)this.method_73183(), class072092);
    }

    public void y(boolean bl) {
        this.E = bl;
    }

    public static Pair<class00753, class00753> N(class08080 class080802) {
        return m.get(class080802);
    }

    public void N(int n) {
        this.method_5841().N(B, (Object)n);
    }

    public static boolean N(class07299 class072992) {
        return class072992.method_45162().y(class03794.u);
    }

    public void N(double d, double d2, double d3) {
        this.method_5814(d, d2, d3);
        this.field_6014 = d;
        this.field_6036 = d2;
        this.field_5969 = d3;
    }

    public static <T extends class07504> @Nullable T N(class07299 class072992, double d, double d2, double d3, class07078<T> class070782, class06113 class061132, class06584 class065842, @Nullable class08036 class080362) {
        class07504 class075042 = (class07504)class070782.N(class072992, class061132);
        if (class075042 != null) {
            class075042.N(d, d2, d3);
            class07078.N((class07299)class072992, (class06584)class065842, (class07438)class080362).accept(class075042);
            class02736 class027362 = class075042.N();
            if (class027362 instanceof class02726) {
                class02726 class027262 = (class02726)class027362;
                class027362 = class075042.L();
                class00500 class005002 = class072992.method_8320((class07209)class027362);
                class027262.N((class07209)class027362, class005002, true);
            }
        }
        return (T)((Object)class075042);
    }

    public class02736 N() {
        return this.W;
    }

    public void N(class04782 class047822, int n, int n2, int n3, boolean bl) {
    }

    protected class06889 N(class06889 class068892) {
        double d = this.W.W();
        class06889 class068893 = class068892.u(d, 0.0, d);
        if (this.method_5799()) {
            class068893 = class068893.L((double)0.95f);
        }
        return class068893;
    }

    public class06889 N(class07209 class072092) {
        class00500 class005002 = this.method_73183().method_8320(class072092);
        if (!class005002.N(class00869.yG) || !((Boolean)class005002.L((class08092)class06900.u)).booleanValue()) {
            return class06889.L;
        }
        class08080 class080802 = (class08080)class005002.L(((class07760)class005002.i()).L());
        if (class080802 == class08080.field_12674) {
            if (this.y(class072092.method_10067())) {
                return new class06889(1.0, 0.0, 0.0);
            }
            if (this.y(class072092.method_10078())) {
                return new class06889(-1.0, 0.0, 0.0);
            }
        } else if (class080802 == class08080.field_12665) {
            if (this.y(class072092.method_10095())) {
                return new class06889(0.0, 0.0, 1.0);
            }
            if (this.y(class072092.method_10072())) {
                return new class06889(0.0, 0.0, -1.0);
            }
        }
        return class06889.L;
    }

    public void N(boolean bl) {
        this.U = bl;
    }

    public void N_19(Optional<class00500> optional) {
        this.method_5841().N(u, optional);
    }

    protected double N(class07209 class072092, class08080 class080802, double d) {
        return this.W.N(class072092, class080802, d);
    }

    private void N(class07504 class075042, double d, double d2) {
        double d3;
        double d4;
        if (class07504.N(this.method_73183())) {
            d4 = this.method_18798().M;
            d3 = this.method_18798().Z;
        } else {
            d4 = class075042.method_23317() - this.method_23317();
            d3 = class075042.method_23321() - this.method_23321();
        }
        class06889 class068892 = new class06889(d4, 0.0, d3).u();
        class06889 class068893 = new class06889((double)class04995.P((double)(this.method_36454() * ((float)Math.PI / 180))), 0.0, (double)class04995.m((double)(this.method_36454() * ((float)Math.PI / 180)))).u();
        if (Math.abs(class068892.y(class068893)) < (double)0.8f && !class07504.N(this.method_73183())) {
            return;
        }
        class06889 class068894 = this.method_18798();
        class06889 class068895 = class075042.method_18798();
        if (class075042.P() && !this.P()) {
            this.method_18799(class068894.u(0.2, 1.0, 0.2));
            this.method_5762(class068895.M - d, 0.0, class068895.Z - d2);
            class075042.method_18799(class068895.u(0.95, 1.0, 0.95));
        } else if (!class075042.P() && this.P()) {
            class075042.method_18799(class068895.u(0.2, 1.0, 0.2));
            class075042.method_5762(class068894.M + d, 0.0, class068894.Z + d2);
            this.method_18799(class068894.u(0.95, 1.0, 0.95));
        } else {
            double d5 = (class068895.M + class068894.M) / 2.0;
            double d6 = (class068895.Z + class068894.Z) / 2.0;
            this.method_18799(class068894.u(0.2, 1.0, 0.2));
            this.method_5762(d5 - d, 0.0, d6 - d2);
            class075042.method_18799(class068895.u(0.2, 1.0, 0.2));
            class075042.method_5762(d5 + d, 0.0, d6 + d2);
        }
    }

    protected double N_73(class04782 class047822) {
        return this.W.y(class047822);
    }

    public class00500 R() {
        return class00869.N.W();
    }
}


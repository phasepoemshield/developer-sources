/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.collect.Lists
 *  minecraft.class00737
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01487
 *  minecraft.class03556
 *  minecraft.class04293
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07086
 *  minecraft.class07089
 *  minecraft.class07107
 *  minecraft.class07113
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07276
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class07438
 *  minecraft.class08299
 *  minecraft.class08329
 *  minecraft.class08372
 *  minecraft.class08636
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.MoreObjects;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import minecraft.class00737;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01487;
import minecraft.class03556;
import minecraft.class04293;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07086;
import minecraft.class07089;
import minecraft.class07107;
import minecraft.class07113;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07276;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class07438;
import minecraft.class08005;
import minecraft.class08036;
import minecraft.class08038;
import minecraft.class08299;
import minecraft.class08329;
import minecraft.class08372;
import minecraft.class08636;
import org.jspecify.annotations.Nullable;

public class class08002
extends class08005 {
    private static final double N = 0.15;
    private @Nullable class08372<class07049> y;
    private @Nullable class07211 L;
    private int u;
    private double R;
    private double M;
    private double B;

    private void L() {
        this.method_31472();
        this.method_73183().method_32888((class03556)class01194.P, this.method_73189(), class01164.N((class07049)this));
    }

    @Override
    public void method_31471(class07276 class072762) {
        super.method_31471(class072762);
        this.method_18799(class072762.Z());
    }

    public void method_5982() {
        if (this.method_73183().y() == class07086.field_5801) {
            this.method_31472();
        }
    }

    protected void method_5693(class04293 class042932) {
    }

    @Override
    public void method_5773() {
        class06889 class068892;
        super.method_5773();
        class07049 class070492 = !this.method_73183().method_8608() ? class08372.N(this.y, (class07299)this.method_73183()) : null;
        class07089 class070892 = null;
        if (!this.method_73183().method_8608()) {
            if (class070492 == null) {
                this.y = null;
            }
            if (!(class070492 == null || !class070492.method_5805() || class070492 instanceof class08036 && class070492.method_7325())) {
                this.R = class04995.N((double)(this.R * 1.025), (double)-1.0, (double)1.0);
                this.M = class04995.N((double)(this.M * 1.025), (double)-1.0, (double)1.0);
                this.B = class04995.N((double)(this.B * 1.025), (double)-1.0, (double)1.0);
                class068892 = this.method_18798();
                this.method_18799(class068892.y((this.R - class068892.M) * 0.2, (this.M - class068892.B) * 0.2, (this.B - class068892.Z) * 0.2));
            } else {
                this.method_56990();
            }
            class070892 = class08038.N((class07049)this, this::N);
        }
        class068892 = this.method_18798();
        this.method_33574(this.method_73189().i(class068892));
        this.method_61409();
        if (this.field_51994 != null && this.field_51994.i()) {
            this.method_60698();
        }
        if (class070892 != null && this.method_5805() && class070892.N() != class07113.field_1333) {
            this.y(class070892);
        }
        class08038.N((class07049)this, 0.5f);
        if (this.method_73183().method_8608()) {
            this.method_73183().method_8406((class07126)class07107.n, this.method_23317() - class068892.M, this.method_23318() - class068892.B + 0.15, this.method_23321() - class068892.Z, 0.0, 0.0, 0.0);
        } else if (class070492 != null) {
            if (this.u > 0) {
                --this.u;
                if (this.u == 0) {
                    this.N(this.L == null ? null : this.L.z(), class070492);
                }
            }
            if (this.L != null) {
                class07209 class072092 = this.method_24515();
                class07185 class071852 = this.L.z();
                if (this.method_73183().method_8515(class072092.method_10093(this.L), (class07049)this)) {
                    this.N(class071852, class070492);
                } else {
                    class07209 class072093 = class070492.method_24515();
                    if (class071852 == class07185.field_11048 && class072092.method_10263() == class072093.method_10263() || class071852 == class07185.field_11051 && class072092.method_10260() == class072093.method_10260() || class071852 == class07185.field_11052 && class072092.method_10264() == class072093.method_10264()) {
                        this.N(class071852, class070492);
                    }
                }
            }
        }
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    @Override
    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        this.method_5783(class04909.wx, 1.0f, 1.0f);
        class047822.method_65096((class07126)class07107.M, this.method_23317(), this.method_23318(), this.method_23321(), 15, 0.2, 0.2, 0.2, 0.0);
        this.L();
        return true;
    }

    protected boolean method_61410() {
        return !this.method_31481();
    }

    public boolean method_5809() {
        return false;
    }

    protected double method_7490() {
        return 0.04;
    }

    public float method_5718() {
        return 1.0f;
    }

    @Override
    protected void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        if (this.y != null) {
            class083292.N("Target", class01487.N, (Object)this.y.L());
        }
        class083292.y("Dir", class07211.field_57037, (Object)this.L);
        class083292.N("Steps", this.u);
        class083292.N("TXD", this.R);
        class083292.N("TYD", this.M);
        class083292.N("TZD", this.B);
    }

    @Override
    public boolean method_5863() {
        return true;
    }

    public boolean method_5640(double d) {
        return d < 16384.0;
    }

    public boolean method_5643(class07072 class070722) {
        return true;
    }

    @Override
    protected void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.u = class082992.N("Steps", 0);
        this.R = class082992.N("TXD", 0.0);
        this.M = class082992.N("TYD", 0.0);
        this.B = class082992.N("TZD", 0.0);
        this.L = class082992.N("Dir", class07211.field_57037).orElse(null);
        this.y = class08372.N((class08299)class082992, (String)"Target");
    }

    public class08002(class07299 class072992, class07438 class074382, class07049 class070492, class07185 class071852) {
        this((class07078<? extends class08002>)class07078.yE, class072992);
        this.L((class07049)class074382);
        class06889 class068892 = class074382.method_5829().R();
        this.method_5808(class068892.M, class068892.B, class068892.Z, this.method_36454(), this.method_36455());
        this.y = class08372.N((class08636)class070492);
        this.L = class07211.field_11036;
        this.N(class071852, class070492);
    }

    public class08002(class07078<? extends class08002> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.field_5960 = true;
    }

    private @Nullable class07211 y() {
        return this.L;
    }

    @Override
    protected boolean N(class07049 class070492) {
        return super.N(class070492) && !class070492.field_5960;
    }

    private void N(@Nullable class07185 class071852, @Nullable class07049 class070492) {
        class07209 class072092;
        double d = 0.5;
        if (class070492 == null) {
            class072092 = this.method_24515().method_10074();
        } else {
            d = (double)class070492.method_17682() * 0.5;
            class072092 = class07209.method_49637((double)class070492.method_23317(), (double)(class070492.method_23318() + d), (double)class070492.method_23321());
        }
        double d2 = (double)class072092.method_10263() + 0.5;
        double d3 = (double)class072092.method_10264() + d;
        double d4 = (double)class072092.method_10260() + 0.5;
        class07211 class072112 = null;
        if (!class072092.method_19769((class00737)this.method_73189(), 2.0)) {
            class07209 class072093 = this.method_24515();
            ArrayList arrayList = Lists.newArrayList();
            if (class071852 != class07185.field_11048) {
                if (class072093.method_10263() < class072092.method_10263() && this.method_73183().R(class072093.method_10078())) {
                    arrayList.add(class07211.field_11034);
                } else if (class072093.method_10263() > class072092.method_10263() && this.method_73183().R(class072093.method_10067())) {
                    arrayList.add(class07211.field_11039);
                }
            }
            if (class071852 != class07185.field_11052) {
                if (class072093.method_10264() < class072092.method_10264() && this.method_73183().R(class072093.method_10084())) {
                    arrayList.add(class07211.field_11036);
                } else if (class072093.method_10264() > class072092.method_10264() && this.method_73183().R(class072093.method_10074())) {
                    arrayList.add(class07211.field_11033);
                }
            }
            if (class071852 != class07185.field_11051) {
                if (class072093.method_10260() < class072092.method_10260() && this.method_73183().R(class072093.method_10072())) {
                    arrayList.add(class07211.field_11035);
                } else if (class072093.method_10260() > class072092.method_10260() && this.method_73183().R(class072093.method_10095())) {
                    arrayList.add(class07211.field_11043);
                }
            }
            class072112 = class07211.y((class06069)this.field_5974);
            if (arrayList.isEmpty()) {
                for (int i = 5; !this.method_73183().R(class072093.method_10093(class072112)) && i > 0; --i) {
                    class072112 = class07211.y((class06069)this.field_5974);
                }
            } else {
                class072112 = (class07211)arrayList.get(this.field_5974.y(arrayList.size()));
            }
            d2 = this.method_23317() + (double)class072112.P();
            d3 = this.method_23318() + (double)class072112.s();
            d4 = this.method_23321() + (double)class072112.T();
        }
        this.N(class072112);
        double d5 = d2 - this.method_23317();
        double d6 = d3 - this.method_23318();
        double d7 = d4 - this.method_23321();
        double d8 = Math.sqrt(d5 * d5 + d6 * d6 + d7 * d7);
        if (d8 == 0.0) {
            this.R = 0.0;
            this.M = 0.0;
            this.B = 0.0;
        } else {
            this.R = d5 / d8 * 0.15;
            this.M = d6 / d8 * 0.15;
            this.B = d7 / d8 * 0.15;
        }
        this.field_64356 = true;
        this.u = 10 + this.field_5974.y(5) * 10;
    }

    private void N(@Nullable class07211 class072112) {
        this.L = class072112;
    }

    @Override
    protected void N(class07089 class070892) {
        super.N(class070892);
        this.L();
    }

    @Override
    protected void N(class06183 class061832) {
        super.N(class061832);
        ((class04782)this.method_73183()).method_65096((class07126)class07107.l, this.method_23317(), this.method_23318(), this.method_23321(), 2, 0.2, 0.2, 0.2, 0.0);
        this.method_5783(class04909.wS, 1.0f, 1.0f);
    }

    @Override
    protected void N(class06145 class061452) {
        super.N(class061452);
        class07049 class070492 = class061452.L();
        class07049 class070493 = this.z();
        class07438 class074382 = class070493 instanceof class07438 ? (class07438)class070493 : null;
        class07072 class070722 = this.method_48923().N((class07049)this, class074382);
        if (class070492.method_64420(class070722, 4.0f)) {
            class04782 class047822;
            class07299 class072992 = this.method_73183();
            if (class072992 instanceof class04782) {
                class047822 = (class04782)class072992;
                class07323.N((class04782)class047822, (class07049)class070492, (class07072)class070722);
            }
            if (class070492 instanceof class07438) {
                class047822 = (class07438)class070492;
                class047822.method_37222(new class07055(class07047.d, 200), (class07049)MoreObjects.firstNonNull((Object)class070493, (Object)((Object)this)));
            }
        }
    }
}


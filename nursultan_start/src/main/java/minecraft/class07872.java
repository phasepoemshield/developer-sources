/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10846
 *  Nursultan.class10849
 *  Nursultan.class10851
 *  minecraft.class00500
 *  minecraft.class00628
 *  minecraft.class00672
 *  minecraft.class00737
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01231
 *  minecraft.class01312
 *  minecraft.class01317
 *  minecraft.class01325
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03556
 *  minecraft.class03810
 *  minecraft.class03831
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04425
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06273
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07052
 *  minecraft.class07072
 *  minecraft.class07077
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07446
 *  minecraft.class07451
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class07623
 *  minecraft.class07633
 *  minecraft.class07960
 *  minecraft.class07962
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10846;
import Nursultan.class10849;
import Nursultan.class10851;
import minecraft.class00500;
import minecraft.class00628;
import minecraft.class00672;
import minecraft.class00737;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01231;
import minecraft.class01312;
import minecraft.class01317;
import minecraft.class01325;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03556;
import minecraft.class03810;
import minecraft.class03831;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04425;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06273;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07052;
import minecraft.class07072;
import minecraft.class07077;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07446;
import minecraft.class07451;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07623;
import minecraft.class07633;
import minecraft.class07866;
import minecraft.class07867;
import minecraft.class07868;
import minecraft.class07885;
import minecraft.class07893;
import minecraft.class07895;
import minecraft.class07960;
import minecraft.class07962;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class07872
extends class07633 {
    private static final class02131<Boolean> R = class03289.N(class07872.class, (class04383)class02154.U);
    private static final class02131<Boolean> M = class03289.N(class07872.class, (class04383)class02154.U);
    private static final float B = 0.3f;
    private static final class01325 Z = class07078.yK.E().N(class03810.N().N(class03831.field_47743, 0.0f, class07078.yK.U(), -0.25f)).N(0.3f);
    private static final boolean X = false;
    int N;
    public static final class01317 y = (class074382, class047822) -> class074382.method_6109() && !class074382.method_5799();
    class07209 L = class07209.field_10980;
    public @Nullable class07209 u;
    public boolean i;

    void M(boolean bl) {
        this.N = bl ? 1 : 0;
        this.field_6011.N(M, (Object)bl);
    }

    protected void M() {
        class04782 class047822;
        class07299 class072992;
        super.M();
        if (!this.method_6109() && (class072992 = this.method_73183()) instanceof class04782 && ((Boolean)(class047822 = (class04782)class072992).method_64395().N(class07305.O)).booleanValue()) {
            this.method_64169(class047822, class06273.NV, (arg_0, arg_1) -> ((class07872)this).method_5775(arg_0, arg_1));
        }
    }

    public boolean method_5675() {
        return false;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(R, (Object)false);
        class042932.N(M, (Object)false);
    }

    protected float method_5867() {
        return this.field_5994 + 0.15f;
    }

    protected class04891 method_5737() {
        return class04909.Oq;
    }

    protected void method_5734(float f) {
        super.method_5734(f * 1.5f);
    }

    protected void method_5712(class07209 class072092, class00500 class005002) {
        class04891 class048912 = this.method_6109() ? class04909.Oo : class04909.OJ;
        this.method_5783(class048912, 0.15f, 1.0f);
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("home_pos", class07209.field_25064, (Object)this.L);
        class083292.N("has_egg", this.B());
    }

    public void method_5749(class08299 class082992) {
        this.N(class082992.N("home_pos", class07209.field_25064).orElse(this.method_24515()));
        super.method_5749(class082992);
        this.N(class082992.N("has_egg", false));
    }

    public void method_5800(class04782 class047822, class00672 class006722) {
        this.method_64397(class047822, this.method_48923().L(), Float.MAX_VALUE);
    }

    public class07872(class07078<? extends class07872> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.N(class04425.field_18, 0.0f);
        this.N(class04425.field_8, -1.0f);
        this.N(class04425.field_23, -1.0f);
        this.N(class04425.field_15, -1.0f);
        this.q = new class07895(this);
    }

    public boolean B() {
        return (Boolean)this.field_6011.N(R);
    }

    protected @Nullable class04891 s() {
        if (!this.method_5799() && this.method_24828() && !this.method_6109()) {
            return class04909.Ol;
        }
        return super.s();
    }

    public static class05300 m() {
        return class07633.Ne().N(class05298.n, 30.0).N(class05298.l, 0.25).N(class05298.O, 1.0);
    }

    public boolean g() {
        return false;
    }

    public @Nullable class07077 y(class04782 class047822, class07077 class070772) {
        return (class07077)class07078.yK.N((class07299)class047822, class06113.field_16466);
    }

    static /* synthetic */ class06069 y(class07872 class078722) {
        return class078722.field_5974;
    }

    public float N(class07209 class072092, class05487 class054872) {
        if (!this.i && class054872.method_8316(class072092).N(class01231.N)) {
            return 10.0f;
        }
        if (class00628.N((class07290)class054872, (class07209)class072092)) {
            return 10.0f;
        }
        return class054872.B(class072092);
    }

    public void N(class07209 class072092) {
        this.L = class072092;
    }

    public boolean N(class06584 class065842) {
        return class065842.N(class01226.yi);
    }

    static /* synthetic */ class06069 N(class07872 class078722) {
        return class078722.field_5974;
    }

    public static boolean N(class07078<class07872> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072092.method_10264() < class072842.method_8615() + 4 && class00628.N((class07290)class072842, (class07209)class072092) && class07872.N((class07295)class072842, (class07209)class072092);
    }

    public @Nullable class07446 N(class01001 class010012, class07052 class070522, class06113 class061132, @Nullable class07446 class074462) {
        this.N(this.method_24515());
        return super.N(class010012, class070522, class061132, class074462);
    }

    void N(boolean bl) {
        this.field_6011.N(R, (Object)bl);
    }

    protected class07623 N(class07299 class072992) {
        return new class10849(this, class072992);
    }

    public boolean W() {
        return (Boolean)this.field_6011.N(M);
    }

    public int m_() {
        return 200;
    }

    protected void l_() {
        this.e.N(0, (class07473)new class10846(this, 1.2));
        this.e.N(1, (class07473)new class07885(this, 1.0));
        this.e.N(1, (class07473)new class07893(this, 1.0));
        this.e.N(2, (class07473)new class07960((class07475)this, 1.1, class065842 -> class065842.N(class01226.yi), false));
        this.e.N(3, (class07473)new class07868(this, 1.0));
        this.e.N(4, (class07473)new class07867(this, 1.0));
        this.e.N(7, (class07473)new class07866(this, 1.0));
        this.e.N(8, (class07473)new class07962((class07079)this, class08036.class, 8.0f));
        this.e.N(9, (class07473)new class10851(this, 1.0, 100));
    }

    public @Nullable class04891 method_6002() {
        if (this.method_6109()) {
            return class04909.Ow;
        }
        return class04909.Od;
    }

    public class01325 method_55694(class01312 class013122) {
        return this.method_6109() ? Z : super.method_55694(class013122);
    }

    public void method_6007() {
        super.method_6007();
        if (this.method_5805() && this.W() && this.N >= 1 && this.N % 5 == 0) {
            class07209 class072092 = this.method_24515();
            if (class00628.N((class07290)this.method_73183(), (class07209)class072092)) {
                this.method_73183().N(2001, class072092, class00891.W((class00500)this.method_73183().method_8320(class072092.method_10074())));
                this.method_32876((class03556)class01194.n);
            }
        }
    }

    public float method_17825() {
        return this.method_6109() ? 0.3f : 1.0f;
    }

    public @Nullable class04891 method_6011(class07072 class070722) {
        if (this.method_6109()) {
            return class04909.Og;
        }
        return class04909.OO;
    }

    public void method_76087(class06889 class068892, double d, boolean bl, double d2) {
        this.method_5724(0.1f, class068892);
        this.method_5784(class07451.field_6308, this.method_18798());
        this.method_18799(this.method_18798().L(0.9));
        if (!(this.T() != null || this.i && this.L.method_19769((class00737)this.method_73189(), 20.0))) {
            this.method_18799(this.method_18798().y(0.0, -0.005, 0.0));
        }
    }

    public boolean T_() {
        return super.T_() && !this.B();
    }
}


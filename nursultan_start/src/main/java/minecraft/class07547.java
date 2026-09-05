/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class00753
 *  minecraft.class01210
 *  minecraft.class01231
 *  minecraft.class04688
 *  minecraft.class05298
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07435
 *  minecraft.class07458
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.BooleanSupplier;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class00753;
import minecraft.class01210;
import minecraft.class01231;
import minecraft.class04688;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07435;
import minecraft.class07458;
import org.jspecify.annotations.Nullable;

public class class07547
extends class07458 {
    private final class07079 N;
    private int W;
    private final boolean m;
    private final BooleanSupplier P;

    public class07547(class07079 class070792, boolean bl, BooleanSupplier booleanSupplier) {
        super(class070792);
        this.N = class070792;
        this.m = bl;
        this.P = booleanSupplier;
    }

    private boolean N(class07290 class072902, @Nullable class06889 class068892, @Nullable class06889 class068893, class07209 class072092, boolean bl, boolean bl2) {
        boolean bl3;
        boolean bl4;
        class00500 class005002 = class072902.method_8320(class072092);
        if (class005002.P()) {
            return true;
        }
        boolean bl5 = bl4 = class068892 != null && class068893 != null;
        boolean bl6 = bl4 ? !this.N.method_63612(class068892, class068893, class005002.M(class072902, class072092).method_64034(new class06889((class00753)class072092)).method_1090()) : (bl3 = class005002.M(class072902, class072092).method_1110());
        if (!this.m) {
            return bl3;
        }
        if (class005002.N(class01210.yO)) {
            return false;
        }
        class04688 class046882 = class072902.method_8316(class072092);
        if (!(class046882.W() || bl4 && !this.N.method_66648(class046882, class072092, class068892, class068893))) {
            if (class046882.N(class01231.N)) {
                return bl;
            }
            if (class046882.N(class01231.y)) {
                return bl2;
            }
        }
        return bl3;
    }

    private boolean N(class06889 class068892) {
        class00734 class007342 = this.N.method_5829();
        class00734 class007343 = class007342.L(class068892);
        if (this.m) {
            for (class07209 class072093 : class07209.method_62671((class00734)class007343.M(1.0))) {
                if (this.N((class07290)this.N.method_73183(), null, null, class072093, false, false)) continue;
                return false;
            }
        }
        boolean bl = this.N.method_5799();
        boolean bl2 = this.N.method_5771();
        class06889 class068893 = this.N.method_73189();
        class06889 class068894 = class068893.i(class068892);
        return class07290.N((class06889)class068893, (class06889)class068894, (class00734)class007343, (class072092, n) -> {
            if (class007342.y(class072092)) {
                return true;
            }
            return this.N((class07290)this.N.method_73183(), class068893, class068894, class072092, bl, bl2);
        });
    }

    public void N() {
        if (this.P.getAsBoolean()) {
            this.E = class07435.field_6377;
            this.N.NN();
        }
        if (this.E != class07435.field_6378) {
            return;
        }
        if (this.W-- <= 0) {
            this.W += this.N.method_59922().y(5) + 2;
            class06889 class068892 = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
            if (this.N(class068892)) {
                this.N.method_18799(this.N.method_18798().i(class068892.u().L(this.N.method_45325(class05298.m) * 5.0 / 3.0)));
            } else {
                this.E = class07435.field_6377;
            }
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class05639
 *  minecraft.class05989
 *  minecraft.class06145
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07089
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class07323
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class04782;
import minecraft.class05639;
import minecraft.class05989;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07089;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class07323;
import minecraft.class07438;

public class class08029
extends class05639 {
    public class08029(class07299 class072992, double d, double d2, double d3, class06889 class068892) {
        super(class07078.yT, d, d2, d3, class068892, class072992);
    }

    public class08029(class07299 class072992, class07438 class074382, class06889 class068892) {
        super(class07078.yT, class074382, class068892, class072992);
    }

    public class08029(class07078<? extends class08029> class070782, class07299 class072992) {
        super(class070782, class072992);
    }

    protected void N(class07089 class070892) {
        super.N(class070892);
        if (!this.method_73183().method_8608()) {
            this.method_31472();
        }
    }

    protected void N(class06183 class061832) {
        super.N(class061832);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = this.z();
        if (!(class072992 instanceof class07079) || ((Boolean)class047822.method_64395().N(class07305.I)).booleanValue()) {
            class07209 class072092 = class061832.u().method_10093(class061832.i());
            if (this.method_73183().R(class072092)) {
                this.method_73183().method_8501(class072092, class05989.y((class07290)this.method_73183(), (class07209)class072092));
            }
        }
    }

    protected void N(class06145 class061452) {
        super.N(class061452);
        class07299 class072992 = this.method_73183();
        if (!(class072992 instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)class072992;
        class072992 = class061452.L();
        class07049 class070492 = this.z();
        int n = class072992.method_20802();
        class072992.method_5639(5.0f);
        class07072 class070722 = this.method_48923().N((class05639)this, class070492);
        if (!class072992.method_64397(class047822, class070722, 5.0f)) {
            class072992.method_20803(n);
        } else {
            class07323.N((class04782)class047822, (class07049)class072992, (class07072)class070722);
        }
    }
}


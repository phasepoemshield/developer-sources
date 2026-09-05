/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00737
 *  minecraft.class00753
 *  minecraft.class01231
 *  minecraft.class04398
 *  minecraft.class04782
 *  minecraft.class05475
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class08791
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00737;
import minecraft.class00753;
import minecraft.class01231;
import minecraft.class04398;
import minecraft.class04782;
import minecraft.class05475;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class07618;
import minecraft.class08791;

class class07642
extends class07473 {
    private final class07618 N;
    private boolean y;

    public void L() {
        if (!(this.N.method_73183() instanceof class04782)) {
            return;
        }
        class04782 class047822 = (class04782)this.N.method_73183();
        this.y = false;
        this.N.f().W();
        class07209 class072092 = this.N.method_24515();
        class07209 class072093 = class047822.method_8487(class04398.y, class072092, 50, false);
        if (class072093 == null) {
            this.y = true;
            return;
        }
        this.N.i = class072093;
        class047822.method_8421((class07049)this.N, (byte)38);
    }

    class07642(class07618 class076182) {
        this.N = class076182;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        if (this.N.i == null) {
            return;
        }
        class07299 class072992 = this.N.method_73183();
        if (this.N.m() || this.N.f().U()) {
            class07209 class072092;
            class06889 class068892 = class06889.y((class00753)this.N.i);
            class06889 class068893 = class05475.N((class07475)this.N, (int)16, (int)1, (class06889)class068892, (double)0.3926991f);
            if (class068893 == null) {
                class068893 = class05475.N((class07475)this.N, (int)8, (int)4, (class06889)class068892, (double)1.5707963705062866);
            }
            if (!(class068893 == null || class072992.method_8316(class072092 = class07209.method_49638((class00737)class068893)).N(class01231.N) && class072992.method_8320(class072092).N(class08791.field_48))) {
                class068893 = class05475.N((class07475)this.N, (int)8, (int)5, (class06889)class068892, (double)1.5707963705062866);
            }
            if (class068893 == null) {
                this.y = true;
                return;
            }
            this.N.p().N(class068893.M, class068893.B, class068893.Z, (float)(this.N.NR() + 20), (float)this.N.Ni());
            this.N.f().N(class068893.M, class068893.B, class068893.Z, 1.3);
            if (class072992.field_9229.y(this.N(80)) == 0) {
                class072992.method_8421((class07049)this.N, (byte)38);
            }
        }
    }

    public void u() {
        class07209 class072092 = this.N.i;
        if (class072092 == null || class07209.method_49637((double)class072092.method_10263(), (double)this.N.method_23318(), (double)class072092.method_10260()).method_19769((class00737)this.N.method_73189(), 4.0) || this.y) {
            this.N.N(false);
        }
    }

    public boolean y() {
        class07209 class072092 = this.N.i;
        if (class072092 == null) {
            return false;
        }
        return !class07209.method_49637((double)class072092.method_10263(), (double)this.N.method_23318(), (double)class072092.method_10260()).method_19769((class00737)this.N.method_73189(), 4.0) && !this.y && this.N.method_5669() >= 100;
    }

    public boolean N() {
        return this.N.B() && this.N.method_5669() >= 100;
    }

    public boolean O_() {
        return false;
    }
}


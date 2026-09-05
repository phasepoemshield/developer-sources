/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00683
 *  minecraft.class00700
 *  minecraft.class00734
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07299
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class00683;
import minecraft.class00700;
import minecraft.class00734;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07299;
import minecraft.class07430;
import minecraft.class07473;

public class class07951
extends class07473 {
    public final class00683 N;
    private double y;
    private static final int L = 8;
    private int u;

    public class07951(class00683 class006832, double d) {
        this.N = class006832;
        this.y = d;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public void i() {
        if (!this.N.yi()) {
            return;
        }
        if (this.N.yW() instanceof class00700) {
            return;
        }
        class00683 class006832 = this.N.yR();
        double d = this.N.method_5739((class07049)class006832);
        float f = 2.0f;
        class06889 class068892 = new class06889(class006832.method_23317() - this.N.method_23317(), class006832.method_23318() - this.N.method_23318(), class006832.method_23321() - this.N.method_23321()).u().L(Math.max(d - 2.0, 0.0));
        this.N.f().N(this.N.method_23317() + class068892.M, this.N.method_23318() + class068892.B, this.N.method_23321() + class068892.Z, this.y);
    }

    public void u() {
        this.N.yL();
        this.y = 2.1;
    }

    public boolean y() {
        if (!(this.N.yi() && this.N.yR().method_5805() && this.N(this.N, 0))) {
            return false;
        }
        if (this.N.method_5858((class07049)this.N.yR()) > 676.0) {
            if (this.y <= 3.0) {
                this.y *= 1.2;
                this.u = class07951.y((int)40);
                return true;
            }
            if (this.u == 0) {
                return false;
            }
        }
        if (this.u > 0) {
            --this.u;
        }
        return true;
    }

    private List N(class07299 class072992, class07049 class070492, class00734 class007342, Predicate predicate) {
        return class072992.N(class00683.class, class007342, class006832 -> class006832 != class070492);
    }

    private boolean N(class00683 class006832, int n) {
        if (n > 8) {
            return false;
        }
        if (class006832.yi()) {
            if (class006832.yR().g_()) {
                return true;
            }
            return this.N(class006832.yR(), ++n);
        }
        return false;
    }

    public boolean N() {
        double d;
        class00683 class006832;
        if (this.N.g_() || this.N.yi()) {
            return false;
        }
        Predicate<class07049> predicate = class070492 -> {
            class07078 var1 = class070492.method_5864();
            return var1 == class07078.NQ || var1 == class07078.yJ;
        };
        class00734 class007342 = this.N.method_5829().L(9.0, 4.0, 9.0);
        class00683 class006833 = this.N;
        class07299 class072992 = this.N.method_73183();
        List list = this.N(class072992, (class07049)class006833, class007342, predicate);
        class00683 class006834 = null;
        double d2 = Double.MAX_VALUE;
        for (class07049 class070493 : list) {
            class006832 = (class00683)class070493;
            if (!class006832.yi() || class006832.yu() || (d = this.N.method_5858((class07049)class006832)) > d2) continue;
            d2 = d;
            class006834 = class006832;
        }
        if (class006834 == null) {
            for (class07049 class070493 : list) {
                class006832 = (class00683)class070493;
                if (!class006832.g_() || class006832.yu() || (d = this.N.method_5858((class07049)class006832)) > d2) continue;
                d2 = d;
                class006834 = class006832;
            }
        }
        if (class006834 == null) {
            return false;
        }
        if (d2 < 4.0) {
            return false;
        }
        if (!class006834.g_() && !this.N(class006834, 1)) {
            return false;
        }
        this.N.N(class006834);
        return true;
    }
}


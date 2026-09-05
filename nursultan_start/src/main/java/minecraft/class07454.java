/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class05487
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class08791
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04995;
import minecraft.class05487;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07430;
import minecraft.class07451;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class08791;

public class class07454
extends class07473 {
    private final class07475 N;

    public void L() {
        this.M();
    }

    private void M() {
        Iterable var1 = class07209.method_10094((int)class04995.N((double)(this.N.method_23317() - 1.0)), (int)this.N.method_31478(), (int)class04995.N((double)(this.N.method_23321() - 1.0)), (int)class04995.N((double)(this.N.method_23317() + 1.0)), (int)class04995.N((double)(this.N.method_23318() + 8.0)), (int)class04995.N((double)(this.N.method_23321() + 1.0)));
        class07209 class072092 = null;
        for (class07209 class072093 : var1) {
            if (!this.N((class05487)this.N.method_73183(), class072093)) continue;
            class072092 = class072093;
            break;
        }
        if (class072092 == null) {
            class072092 = class07209.method_49637((double)this.N.method_23317(), (double)(this.N.method_23318() + 8.0), (double)this.N.method_23321());
        }
        this.N.f().N((double)class072092.method_10263(), (double)(class072092.method_10264() + 1), (double)class072092.method_10260(), 1.0);
    }

    public class07454(class07475 class074752) {
        this.N = class074752;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        this.M();
        this.N.method_5724(0.02f, new class06889((double)this.N.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (double)this.N.fields_7212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (double)this.N.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue()));
        this.N.method_5784(class07451.field_6308, this.N.method_18798());
    }

    public boolean y() {
        return this.N();
    }

    private boolean N(class05487 class054872, class07209 class072092) {
        class00500 class005002 = class054872.method_8320(class072092);
        return (class054872.method_8316(class072092).W() || class005002.N(class00869.PN)) && class005002.N(class08791.field_50);
    }

    public boolean N() {
        return this.N.method_5669() < 140;
    }

    public boolean O_() {
        return false;
    }
}


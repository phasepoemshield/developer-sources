/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07473
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07049;
import minecraft.class07148;
import minecraft.class07156;
import minecraft.class07430;
import minecraft.class07473;

public class class07163
extends class07473 {
    public final /* synthetic */ class07148 y;

    public void L() {
        super.L();
        class07148.N(this.y).W();
    }

    public class07163(class07148 class071482) {
        this.y = class071482;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    public void i() {
        if (this.y.T() != null) {
            this.y.p().N((class07049)this.y.T(), (float)this.y.NR(), (float)this.y.Ni());
        }
    }

    public void u() {
        super.u();
        this.y.N(class07156.field_7377);
    }

    public boolean N() {
        return this.y.G() > 0;
    }
}


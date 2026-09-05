/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class01311
 *  minecraft.class01322
 *  minecraft.class01683
 *  minecraft.class04453
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06601
 *  minecraft.class06626
 *  minecraft.class07049
 *  minecraft.class07363
 *  minecraft.class07375
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class01311;
import minecraft.class01322;
import minecraft.class01683;
import minecraft.class04453;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06601;
import minecraft.class06626;
import minecraft.class07049;
import minecraft.class07363;
import minecraft.class07375;

public class class06320
extends class01311 {
    private class05362 M;

    private void L() {
        ((class01683)((class04453)this.field_22787.T_4).y_0).N((class00381)new class07375((class07049)((class04453)this.field_22787.T_4), class07363.field_12986));
    }

    public class06320(String string, boolean bl) {
        super(string, bl);
    }

    public void y() {
        String string = this.y.method_1882();
        if (this.u || string.isEmpty()) {
            this.i = class01322.field_62016;
            this.field_22787.N(null);
        } else {
            this.i = class01322.field_62017;
            this.field_22787.N((class05096)new class01311(string, false));
        }
    }

    public void method_25426() {
        super.method_25426();
        this.M = class05362.method_46430((class00392)class00392.L((String)"multiplayer.stopSleeping"), class053622 -> this.L()).N(this.field_22789 / 2 - 100, this.field_22790 - 40, 200, 20).N();
        this.method_37063((class04654)this.M);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.i()) {
            this.L();
        }
        if (!this.field_22787.b().N(this.field_22787.q())) {
            return true;
        }
        if (class066012.u()) {
            this.N(this.y.method_1882(), true);
            this.y.method_1852("");
            ((class01056)this.field_22787.i_6).i().u();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        if (!this.field_22787.b().N(this.field_22787.q())) {
            this.M.method_25394(class010542, n, n2, f);
            return;
        }
        super.method_25394(class010542, n, n2, f);
    }

    public void method_25419() {
        this.L();
    }

    public boolean method_25400(class06626 class066262) {
        if (!this.field_22787.b().N(this.field_22787.q())) {
            return true;
        }
        return super.method_25400(class066262);
    }
}


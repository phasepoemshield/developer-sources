/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01472
 *  minecraft.class04453
 *  minecraft.class05220
 *  minecraft.class06611
 *  minecraft.class07354
 *  minecraft.class07501
 */
package minecraft;

import java.util.Optional;
import minecraft.class00381;
import minecraft.class01454;
import minecraft.class01472;
import minecraft.class04453;
import minecraft.class05220;
import minecraft.class06611;
import minecraft.class07354;
import minecraft.class07501;

class class01433
extends class01472 {
    final /* synthetic */ class01454 N;

    public class01433(class01454 class014542, int n, int n2) {
        this.N = class014542;
        super(n, n2, class01454.n, class05220.u);
    }

    public void N(int n) {
        this.field_22763 = ((class07501)this.N.m).P() && this.N.G != null;
    }

    public void method_25306(class06611 class066112) {
        class01454.N(this.N).NE().N((class00381)new class07354(Optional.ofNullable(this.N.G), Optional.ofNullable(this.N.l)));
        ((class04453)class01454.y((class01454)this.N).T_4).method_7346();
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07079
 *  minecraft.class07435
 *  minecraft.class07458
 *  minecraft.class08042
 */
package Nursultan;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07435;
import minecraft.class07458;
import minecraft.class08042;

public class class10865
extends class07458 {
    final /* synthetic */ class08042 N;

    public class10865(class08042 class080422, class08042 class080423) {
        this.N = class080422;
        super((class07079)class080423);
    }

    public void N() {
        if (this.E != class07435.field_6378) {
            return;
        }
        class06889 class068892 = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
        double d = class068892.M();
        if (d < this.N.method_5829().N()) {
            this.E = class07435.field_6377;
            this.N.method_18799(this.N.method_18798().L(0.5));
        } else {
            this.N.method_18799(this.N.method_18798().i(class068892.L(this.Z * 0.05 / d)));
            if (this.N.T() == null) {
                class06889 class068893 = this.N.method_18798();
                this.N.method_36456(-((float)class04995.u((double)class068893.M, (double)class068893.Z)) * 57.295776f);
                this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
            } else {
                double d2 = this.N.T().method_23317() - this.N.method_23317();
                double d3 = this.N.T().method_23321() - this.N.method_23321();
                this.N.method_36456(-((float)class04995.u((double)d2, (double)d3)) * 57.295776f);
                this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
            }
        }
    }
}


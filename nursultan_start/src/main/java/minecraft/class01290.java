/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06137
 *  minecraft.class06165
 *  minecraft.class07430
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class06137;
import minecraft.class06165;
import minecraft.class07430;

class class01290
extends class06137 {
    private static final int L = class01290.y((int)140);
    private int u;
    final /* synthetic */ class06165 y;

    public void L() {
        this.y.N(false);
        this.y.U(false);
        this.y.E(false);
        this.y.method_6100(false);
        this.y.Z(true);
        this.y.f().W();
        this.y.F().N(this.y.method_23317(), this.y.method_23318(), this.y.method_23321(), 0.0);
    }

    public class01290(class06165 class061652) {
        this.y = class061652;
        super(class061652);
        this.u = class06165.y((class06165)class061652).y(L);
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406, class07430.field_18407));
    }

    private boolean U() {
        if (this.u > 0) {
            --this.u;
            return false;
        }
        return this.y.method_73183().method_8530() && this.M() && !this.Z() && !this.y.field_27857;
    }

    public void u() {
        this.u = class06165.L((class06165)this.y).y(L);
        this.y.Y();
    }

    public boolean y() {
        return this.U();
    }

    public boolean N() {
        if (this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue() != 0.0f || this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_1.floatValue() != 0.0f || this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue() != 0.0f) {
            return false;
        }
        return this.U() || this.y.method_6113();
    }
}


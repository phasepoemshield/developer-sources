/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07079
 *  minecraft.class08701
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07079;
import minecraft.class08701;

public class class07472
implements class08701 {
    private final class07079 N;
    private static final int y = 15;
    private static final int L = 10;
    private static final int u = 10;
    private int i;
    private float R;

    private void L() {
        this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = Float.valueOf(class04995.L((float)this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), (float)this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (float)this.N.NR()));
    }

    public class07472(class07079 class070792) {
        this.N = class070792;
    }

    private boolean i() {
        return !(this.N.method_31483() instanceof class07079);
    }

    private void u() {
        float f = class04995.N((float)((float)(this.i - 10) / 10.0f), (float)0.0f, (float)1.0f);
        float f2 = (float)this.N.NR() * (1.0f - f);
        this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class04995.L((float)this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (float)this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), (float)f2));
    }

    private void y() {
        this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class04995.L((float)this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (float)this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue(), (float)this.N.NR()));
    }

    public void N() {
        if (this.R()) {
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(this.N.method_36454());
            this.L();
            this.R = this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue();
            this.i = 0;
            return;
        }
        if (this.i()) {
            if (Math.abs(this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue() - this.R) > 15.0f) {
                this.i = 0;
                this.R = this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_2.floatValue();
                this.y();
            } else {
                ++this.i;
                if (this.i > 10) {
                    this.u();
                }
            }
        }
    }

    private boolean R() {
        double d;
        double d2 = this.N.method_23317() - this.N.field_6014;
        return d2 * d2 + (d = this.N.method_23321() - this.N.field_5969) * d > 2.500000277905201E-7;
    }
}


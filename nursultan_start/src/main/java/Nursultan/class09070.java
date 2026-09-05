/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class05197
 */
package Nursultan;

import minecraft.class00405;
import minecraft.class05197;

public class class09070
implements class05197 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    float L() {
        return (float)((Integer)this.N_1).intValue() * ((Float)this.N_0).floatValue();
    }

    class09070() {
        this.u();
    }

    public boolean accept(int n, class00405 class004052, int n2) {
        if (n2 == 10) {
            this.N_1 = (Integer)this.N_1 + 1;
        }
        return true;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = 0;
        }
    }

    void N(float f) {
        this.N_0 = Float.valueOf(f);
        this.N_1 = 1;
    }
}


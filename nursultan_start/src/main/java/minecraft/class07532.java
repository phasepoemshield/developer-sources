/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06570
 *  minecraft.class07050
 *  minecraft.class07172
 *  minecraft.class07984
 */
package minecraft;

import minecraft.class06570;
import minecraft.class07050;
import minecraft.class07172;
import minecraft.class07541;
import minecraft.class07984;

class class07532
extends class07984 {
    private final class07541 N;

    public void L() {
        super.L();
        this.N.R(true);
        this.N.method_6019(class07050.field_5808);
    }

    public class07532(class07172 class071722, double d, int n, float f) {
        super(class071722, d, n, f);
        this.N = (class07541)class071722;
    }

    public void u() {
        super.u();
        this.N.method_6021();
        this.N.R(false);
    }

    public boolean N() {
        return super.N() && this.N.method_6047().N(class06570.db);
    }
}


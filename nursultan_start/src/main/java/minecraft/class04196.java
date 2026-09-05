/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01640
 *  minecraft.class01991
 *  minecraft.class02002
 *  minecraft.class04224
 *  minecraft.class04234
 *  minecraft.class04995
 *  minecraft.class08247
 *  minecraft.class08280
 *  minecraft.class08923
 */
package minecraft;

import minecraft.class01640;
import minecraft.class01991;
import minecraft.class02002;
import minecraft.class04201;
import minecraft.class04214;
import minecraft.class04224;
import minecraft.class04234;
import minecraft.class04995;
import minecraft.class08247;
import minecraft.class08280;
import minecraft.class08923;

class class04196
implements class04214 {
    private final class04224 N;
    private final class04201 y;
    private final double L;
    private final double u;

    class04196(class04224 class042242, class04201 class042012, double d, double d2) {
        this.N = class042242;
        this.y = class042012;
        this.L = d;
        this.u = d2;
    }

    @Override
    public void N() {
        this.N.y();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public class01991 method_52853(class01640 class016402) {
        try {
            class08280 class082802 = this.N.N();
            double d = (double)class082802.N() / this.L;
            double d2 = (double)class082802.y() / this.u;
            int n = class04995.N((double)(this.y.y() * d));
            int n2 = class04995.N((double)(this.y.L() * d2));
            int n3 = class04995.N((double)(this.y.u() * d));
            int n4 = class04995.N((double)(this.y.i() * d2));
            class08280 class082803 = new class08280(class08247.field_4997, n3, n4, false);
            class082802.N(class082803, n, n2, 0, 0, n3, n4, false, false);
            class01991 class019912 = new class01991(this.y.N(), new class02002(n3, n4), class082803);
            return class019912;
        }
        catch (Exception exception) {
            class04234.y.error("Failed to unstitch region {}", (Object)this.y.N(), (Object)exception);
        }
        finally {
            this.N.y();
        }
        return class08923.y();
    }
}


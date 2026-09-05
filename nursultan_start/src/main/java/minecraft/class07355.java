/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class07211
 *  minecraft.class07336
 */
package minecraft;

import minecraft.class00869;
import minecraft.class00891;
import minecraft.class07211;
import minecraft.class07336;
import minecraft.class07347;
import minecraft.class07362;
import minecraft.class07366;
import minecraft.class07371;
import minecraft.class07372;
import minecraft.class07374;

abstract class class07355
extends Enum<class07355>
implements class07347 {
    public static final /* enum */ class07355 field_12957 = new class07362("BLACKLIST", 0, class00869.EV, class00869.iq, class00869.Wq, class00869.WK, class00869.WV, class00869.We, class00869.WH, class00869.Wc, class00869.WX, class00869.Wa, class00869.Wp, class00869.WF, class00869.WA, class00869.Wf, class00869.WC, class00869.WS, class00869.Wx, class00869.WD, class00869.BK, class00869.BV, class00869.Be, class00869.Ms, class00869.X, class00869.e, class00869.c, class00869.uy, class00869.uL, class00869.uu, class00869.ui, class00869.uR, class00869.uM, class00869.uB, class00869.uZ, class00869.us, class00869.uT, class00869.ub, class00869.uj, class00869.un, class00869.ut, class00869.uG, class00869.uw, class00869.uk, class00869.uY, class00869.uQ, class00869.ug, class00869.uI, class00869.uJ, class00869.ue, class00869.uH, class00869.uc, class00869.uX, class00869.up, class00869.uF, class00869.uA);
    public static final /* enum */ class07355 field_12962 = new class07374("DEFAULT", 1, new class00891[0]);
    public static final /* enum */ class07355 field_12960 = new class07366("CHEST", 2, class00869.LA, class00869.BH);
    public static final /* enum */ class07355 field_12963 = new class07372("LEAVES", 3, true, class00869.NX, class00869.Na, class00869.NH, class00869.NF, class00869.Np, class00869.Nc, class00869.NV, class00869.Ne);
    public static final /* enum */ class07355 field_12958 = new class07336("STEM_BLOCK", 4, new class00891[]{class00869.RH, class00869.Re});
    public static final class07211[] field_12959;
    private static final /* synthetic */ class07355[] field_12961;

    class07355(boolean bl, class00891 ... class00891Array) {
        for (class00891 class008912 : class00891Array) {
            class07371.y.put(class008912, this);
        }
        if (bl) {
            class07371.L.add(this);
        }
    }

    class07355(class00891 ... class00891Array) {
        this(false, class00891Array);
    }

    static {
        field_12961 = class07355.N();
        field_12959 = class07211.values();
    }

    public static class07355[] values() {
        return (class07355[])field_12961.clone();
    }

    public static class07355 valueOf(String string) {
        return Enum.valueOf(class07355.class, string);
    }

    private static /* synthetic */ class07355[] N() {
        return new class07355[]{field_12957, field_12962, field_12960, field_12963, field_12958};
    }
}


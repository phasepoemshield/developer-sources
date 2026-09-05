/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.az;

public class bt
implements az {
    public static final boolean a;
    public static final long jy = 1402716673749446045L;
    private static int[] dzxm;
    public static final int b;
    private static int[] dzxn;
    private static long[] dzxa;
    private int ticksSinceDeath;
    public static final boolean c;
    private static long[] dzwz;

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public bt(int var1_1) {
        var3_2 /* !! */  = bt.b;
        var2_3 = bt.a;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        while (true) {
            switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    super();
                    this.ticksSinceDeath = var1_1;
                    return;
                }
                case 2: {
                    var3_2 /* !! */  = (int)bt.dzxb("dzya", dzxl(int ), (int)9);
                    ** GOTO lbl-1000
                }
                case 0: lbl-1000:
                // 2 sources

                {
                    var3_2 /* !! */  = (int)bt.dzxb("dzxy", dzxl(int ), (int)7);
                }
                case 1: 
            }
            if (true) ** GOTO lbl20
            break;
        }
        while (true) {
            if (true) ** continue;
lbl20:
            // 2 sources

            var3_2 /* !! */  = (int)bt.dzxb("dzxz", dzxl(int ), (int)8);
            cfr_temp_0 = 0;
        }
    }

    private static /* synthetic */ int dzxl(int n2) {
        return dzxm[n2] ^ dzxn[n2];
    }

    static {
        dzxm = new int[10];
        dzxn = new int[10];
        bt.dzyb();
        bt.dzyc();
        dzwz = new long[7];
        dzxa = new long[7];
        bt.dzye();
        bt.dzyf();
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getTicksSinceDeath() {
        boolean bl2;
        Object object = jy;
        block12: while (true) {
            switch ((int)object) {
                case -1422751274: {
                    object = bt.dzxb("dzxh", dzwy(int ), (int)1) - bt.dzxb("dzxg", dzwy(int ), (int)0);
                    continue block12;
                }
                case 56257949: {
                    break block12;
                }
            }
            break;
        }
        boolean bl3 = c;
        Object object2 = jy;
        block13: while (true) {
            switch ((int)object2) {
                case -593574931: {
                    object2 = bt.dzxb("dzxj", dzwy(int ), (int)3) - bt.dzxb("dzxi", dzwy(int ), (int)2);
                    continue block13;
                }
                case 56257949: {
                    break block13;
                }
            }
            break;
        }
        int n2 = b;
        while (true) {
            long l2;
            Object object3;
            if ((object3 = (l2 = jy - bt.dzxb("dzxk", dzwy(int ), (int)4)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (object3 == bt.dzxb("dzxp", dzxl(int ), (int)0)) {
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                break;
            }
            object3 = bt.dzxb("dzxq", dzxl(int ), (int)1);
        }
        if (bl2) return (int)bt.dzxb("dzxr", dzxl(int ), (int)2);
        if (bl2) return (int)bt.dzxb("dzxr", dzxl(int ), (int)2);
        Object object4 = jy;
        block15: while (true) {
            switch ((int)object4) {
                case 56257949: {
                    return this.ticksSinceDeath;
                }
                case 926855410: {
                    object4 = bt.dzxb("dzxt", dzwy(int ), (int)6) - bt.dzxb("dzxs", dzwy(int ), (int)5);
                    continue block15;
                }
            }
            break;
        }
        return this.ticksSinceDeath;
    }

    private static /* synthetic */ void dzyc() {
        bt.dzxn[0] = -1208146559;
        bt.dzxn[1] = 1177620757;
        bt.dzxn[2] = 780477917;
        bt.dzxn[3] = -2016345555;
        bt.dzxn[4] = -458453495;
        bt.dzxn[5] = -1182916132;
        bt.dzxn[6] = 1803777882;
        bt.dzxn[7] = 1359302579;
        bt.dzxn[8] = 731732340;
        bt.dzxn[9] = 1816539276;
    }

    public static /* synthetic */ CallSite dzxb(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void dzyf() {
        bt.dzxa[0] = -7367199683147145223L;
        bt.dzxa[1] = -8708424171019435333L;
        bt.dzxa[2] = -4600266386118526437L;
        bt.dzxa[3] = -7601747998284911635L;
        bt.dzxa[4] = -4991849856502066112L;
        bt.dzxa[5] = 769959142789827276L;
        bt.dzxa[6] = 4174239469438308628L;
    }

    private static /* synthetic */ void dzyb() {
        bt.dzxm[0] = 1208146558;
        bt.dzxm[1] = 454635919;
        bt.dzxm[2] = 760447023;
        bt.dzxm[3] = -2016345554;
        bt.dzxm[4] = -458453494;
        bt.dzxm[5] = -1182916129;
        bt.dzxm[6] = 1803777882;
        bt.dzxm[7] = 1359302577;
        bt.dzxm[8] = 731732340;
        bt.dzxm[9] = 1816539278;
    }

    private static /* synthetic */ void dzye() {
        bt.dzwz[0] = 2537442948150279730L;
        bt.dzwz[1] = -5507026263847438226L;
        bt.dzwz[2] = -8684427250125119839L;
        bt.dzwz[3] = 1668577756444181493L;
        bt.dzwz[4] = -7406056943193465249L;
        bt.dzwz[5] = 7049122532662813339L;
        bt.dzwz[6] = -4384005090139636967L;
    }

    private static /* synthetic */ long dzwy(int n2) {
        return dzwz[n2] ^ dzxa[n2];
    }
}


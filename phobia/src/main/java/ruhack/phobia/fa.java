/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2828$class_2830
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import ruhack.phobia.aw;
import ruhack.phobia.ca;
import ruhack.phobia.df;
import ruhack.phobia.ds;
import ruhack.phobia.du;

public final class fa
extends ds {
    public static final boolean c;
    public static final boolean a;
    private static final int PACKETS_PER_BURST = 32;
    private static long[] beye;
    private static int[] bexw;
    static final long da = -9123049969596420852L;
    public static final int b;
    private static long[] beyd;
    private static int[] bexx;

    public static /* synthetic */ CallSite bexy(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onTick(df var1_1) {
        v0 /* !! */  = fa.da;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - fa.bexy("beyx", beyc(int ), (int)10));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case 556692980: {
                    v1 = fa.bexy("beyy", beyc(int ), (int)11);
                    continue block21;
                }
                case 1505384514: {
                    v1 = fa.bexy("beyz", beyc(int ), (int)12);
                    continue block21;
                }
                case 2115054860: {
                    break block21;
                }
            }
            break;
        }
        var4_2 = fa.c;
        v2 /* !! */  = fa.da;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(fa.bexy("bezb", beyc(int ), (int)14) - fa.bexy("beza", beyc(int ), (int)13));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -54497177: {
                    continue block22;
                }
                case 2115054860: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = fa.b;
        v3 /* !! */  = fa.da;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(fa.bexy("bezd", beyc(int ), (int)16) - fa.bexy("bezc", beyc(int ), (int)15));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case 1260437648: {
                    continue block23;
                }
                case 2115054860: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = fa.a;
        if (var4_2) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        block13 : switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** GOTO lbl37
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = fa.da - fa.bexy("beze", beyc(int ), (int)17)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == fa.bexy("bezf", bexv(int ), (int)11)) break;
                    v4 /* !! */  = (long)fa.bexy("bezg", bexv(int ), (int)12);
                }
                this.sendInvalidBurst();
                if (!var2_4 && !var2_4) ** break;
                ** continue;
                return;
            }
lbl53:
            // 2 sources

            case 0: {
                do {
                    var3_3 /* !! */  = (int)fa.bexy("bezh", bexv(int ), (int)13);
                } while (!var4_2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fa.bexy("bezi", bexv(int ), (int)14);
                    if (!var4_2) break block13;
                    throw null;
                }
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)fa.bexy("bezj", bexv(int ), (int)15);
                } while (!var4_2);
                throw null;
            }
lbl68:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)fa.bexy("bezk", bexv(int ), (int)16);
                if (!var4_2) ** GOTO lbl53
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)fa.bexy("bezl", bexv(int ), (int)17);
                if (!var4_2) ** GOTO lbl68
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)fa.bexy("bezm", bexv(int ), (int)18);
        ** while (!var4_2)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void sendInvalidBurst() {
        boolean bl2;
        boolean bl3;
        block12: {
            block11: {
                bl3 = c;
                int n2 = b;
                bl2 = a;
                if (bl3) {
                    throw null;
                }
                if (bl2 || bl2) return;
                if (fa.mc.field_1724 == null) break block11;
                if (bl2) return;
                if (mc.method_1562() != null) break block12;
                if (bl2) return;
            }
            if (bl2 || bl2) return;
            return;
        }
        if (bl2 || bl2) return;
        CallSite callSite = fa.bexy("bfae", bexv(int ), (int)28);
        if (bl2) return;
        while (!bl2 && !bl2) {
            void var1_5;
            if (var1_5 < fa.bexy("bfaf", bexv(int ), (int)29)) {
                CallSite callSite2;
                if (bl2 || bl2) return;
                switch (var1_5 % fa.bexy("bfag", bexv(int ), (int)30)) {
                    case 0: {
                        if (bl2 || bl2) return;
                        CallSite callSite3 = fa.bexy("bfai", bfah(int ), (int)26);
                        if (!bl3) break;
                        throw null;
                    }
                    case 1: {
                        if (bl2 || bl2) return;
                        CallSite callSite3 = fa.bexy("bfaj", bfah(int ), (int)27);
                        if (!bl3) break;
                        throw null;
                    }
                    default: {
                        if (bl2 || bl2) return;
                        CallSite callSite3 = callSite2 = fa.bexy("bfak", bfah(int ), (int)28);
                    }
                }
                if (bl2 || bl2) return;
                mc.method_1562().method_52787((class_2596)new class_2828.class_2830((double)callSite2, (double)callSite2, (double)callSite2, (float)fa.bexy("bfam", bfal(int ), (int)31), (float)fa.bexy("bfan", bfal(int ), (int)32), (boolean)fa.bexy("bfao", bexv(int ), (int)33), (boolean)fa.bexy("bfap", bexv(int ), (int)34)));
                if (bl2 || bl2) return;
                ++var1_5;
                if (bl2) return;
                if (!bl3) continue;
                throw null;
            }
            if (!bl2 && !bl2) return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public fa() {
        int n2 = b;
        super("KTLeave", "\u041e\u0442\u043f\u0440\u0430\u0432\u043b\u044f\u0435\u0442 \u043d\u0435\u043a\u043e\u0440\u0440\u0435\u043a\u0442\u043d\u044b\u0439 \u043f\u0430\u043a\u0435\u0442 \u0434\u0432\u0438\u0436\u0435\u043d\u0438\u044f \u0434\u043b\u044f \u043a\u0438\u043a\u0430 \u0441 \u0441\u0435\u0440\u0432\u0435\u0440\u0430", du.MISC);
        if (n2 == 0) return;
        switch (n2) {
            default: {
                return;
            }
            case 0: {
                while (true) {
                    CallSite callSite = fa.bexy("bexz", bexv(int ), (int)0);
                }
            }
            case 1: {
                while (true) {
                    CallSite callSite = fa.bexy("beya", bexv(int ), (int)1);
                }
            }
            case 2: 
        }
        while (true) {
            CallSite callSite = fa.bexy("beyb", bexv(int ), (int)2);
        }
    }

    private static /* synthetic */ void bfbw() {
        fa.bexx[0] = -1658751755;
        fa.bexx[1] = 1282175775;
        fa.bexx[2] = -1696988278;
        fa.bexx[3] = -85632588;
        fa.bexx[4] = 600962039;
        fa.bexx[5] = 455073175;
        fa.bexx[6] = -737209748;
        fa.bexx[7] = -482236592;
        fa.bexx[8] = -2103712754;
        fa.bexx[9] = 1766643372;
        fa.bexx[10] = 1940240622;
        fa.bexx[11] = 1967481770;
        fa.bexx[12] = 2073203773;
        fa.bexx[13] = -719058774;
        fa.bexx[14] = -71536382;
        fa.bexx[15] = 594857253;
        fa.bexx[16] = -499251476;
        fa.bexx[17] = -537971989;
        fa.bexx[18] = 291655271;
        fa.bexx[19] = 1975825223;
        fa.bexx[20] = -857207670;
        fa.bexx[21] = 1547317129;
        fa.bexx[22] = 530889820;
        fa.bexx[23] = -1087761791;
        fa.bexx[24] = -36093144;
        fa.bexx[25] = 218800003;
        fa.bexx[26] = -680697790;
        fa.bexx[27] = 716386483;
        fa.bexx[28] = 793814689;
        fa.bexx[29] = -179612275;
        fa.bexx[30] = 0xEE8E87;
        fa.bexx[31] = 1931653258;
        fa.bexx[32] = 703613240;
        fa.bexx[33] = 444278012;
        fa.bexx[34] = -319199179;
        fa.bexx[35] = 1362513689;
        fa.bexx[36] = -1651619567;
        fa.bexx[37] = -836234305;
        fa.bexx[38] = 405889623;
        fa.bexx[39] = -1671158887;
        fa.bexx[40] = 1106066859;
        fa.bexx[41] = 144853635;
        fa.bexx[42] = -1101487978;
        fa.bexx[43] = -890703035;
        fa.bexx[44] = 1457478534;
        fa.bexx[45] = 183399469;
        fa.bexx[46] = -1945031447;
        fa.bexx[47] = -198483897;
        fa.bexx[48] = -1114121087;
        fa.bexx[49] = -443141561;
        fa.bexx[50] = 1901458286;
        fa.bexx[51] = 1547010410;
        fa.bexx[52] = -1951641732;
        fa.bexx[53] = -520856114;
        fa.bexx[54] = 664851633;
        fa.bexx[55] = -1794916077;
        fa.bexx[56] = 921222717;
        fa.bexx[57] = 1724121417;
        fa.bexx[58] = -85387218;
        fa.bexx[59] = -1217513615;
        fa.bexx[60] = -1213870697;
        fa.bexx[61] = -623091683;
        fa.bexx[62] = -1715993836;
        fa.bexx[63] = 1880159219;
        fa.bexx[64] = 144587720;
        fa.bexx[65] = 349544223;
    }

    private static /* synthetic */ double bfah(int n2) {
        return Double.longBitsToDouble(beyd[n2] ^ beye[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onGameLeft(ca var1_1) {
        v0 /* !! */  = fa.da;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - fa.bexy("bezn", beyc(int ), (int)18));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1884074246: {
                    v1 = fa.bexy("bezo", beyc(int ), (int)19);
                    continue block21;
                }
                case -757393654: {
                    v1 = fa.bexy("bezp", beyc(int ), (int)20);
                    continue block21;
                }
                case 2115054860: {
                    break block21;
                }
            }
            break;
        }
        var4_2 = fa.c;
        v2 /* !! */  = fa.da;
        if (true) ** GOTO lbl19
        block22: while (true) {
            v2 /* !! */  = (long)(fa.bexy("bezr", beyc(int ), (int)22) - fa.bexy("bezq", beyc(int ), (int)21));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -734647736: {
                    continue block22;
                }
                case 2115054860: {
                    break block22;
                }
            }
            break;
        }
        var3_3 /* !! */  = fa.b;
        v3 /* !! */  = fa.da;
        if (true) ** GOTO lbl29
        block23: while (true) {
            v3 /* !! */  = (long)(fa.bexy("bezt", beyc(int ), (int)24) - fa.bexy("bezs", beyc(int ), (int)23));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -882663619: {
                    continue block23;
                }
                case 2115054860: {
                    break block23;
                }
            }
            break;
        }
        var2_4 = fa.a;
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var4_2) {
                    throw null;
lbl40:
                    // 2 sources

                    return;
                }
                if (var2_4 || var2_4) ** GOTO lbl40
                v4 = fa.bexy("bezu", bexv(int ), (int)19);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_0 = fa.da - fa.bexy("bezv", beyc(int ), (int)25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == fa.bexy("bezw", bexv(int ), (int)20)) break;
                    v5 /* !! */  = (long)fa.bexy("bezx", bexv(int ), (int)21);
                }
                this.setState((boolean)v4);
                if (var2_4 || var2_4) ** continue;
                return;
            }
lbl52:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)fa.bexy("bezy", bexv(int ), (int)22);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl65
            }
            case 1: {
                var3_3 /* !! */  = (int)fa.bexy("bezz", bexv(int ), (int)23);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
            case 2: {
                var3_3 /* !! */  = (int)fa.bexy("bfaa", bexv(int ), (int)24);
                if (!var4_2) ** GOTO lbl52
                throw null;
            }
lbl65:
            // 2 sources

            case 3: {
                var3_3 /* !! */  = (int)fa.bexy("bfab", bexv(int ), (int)25);
                if (!var4_2) break;
                throw null;
            }
            case 4: {
                var3_3 /* !! */  = (int)fa.bexy("bfac", bexv(int ), (int)26);
                if (!var4_2) break;
                throw null;
            }
            case 5: 
        }
        do {
            var3_3 /* !! */  = (int)fa.bexy("bfad", bexv(int ), (int)27);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ long beyc(int n2) {
        return beyd[n2] ^ beye[n2];
    }

    private static /* synthetic */ float bfal(int n2) {
        return Float.intBitsToFloat(bexw[n2] ^ bexx[n2]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void activate() {
        v0 /* !! */  = fa.da;
        if (true) ** GOTO lbl5
        block23: while (true) {
            v0 /* !! */  = (long)(v1 - fa.bexy("beyf", beyc(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -2034725077: {
                    v1 = fa.bexy("beyg", beyc(int ), (int)1);
                    continue block23;
                }
                case 1731191630: {
                    v1 = fa.bexy("beyh", beyc(int ), (int)2);
                    continue block23;
                }
                case 2115054860: {
                    break block23;
                }
            }
            break;
        }
        var3_1 = fa.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fa.da - fa.bexy("beyi", beyc(int ), (int)3)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fa.bexy("beyj", bexv(int ), (int)3)) break;
            v2 /* !! */  = (long)fa.bexy("beyk", bexv(int ), (int)4);
        }
        var2_2 /* !! */  = fa.b;
        v3 /* !! */  = fa.da;
        if (true) ** GOTO lbl26
        block25: while (true) {
            v3 /* !! */  = (long)(v4 - fa.bexy("beyl", beyc(int ), (int)4));
lbl26:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -874131476: {
                    v4 = fa.bexy("beym", beyc(int ), (int)5);
                    continue block25;
                }
                case -227395461: {
                    v4 = fa.bexy("beyn", beyc(int ), (int)6);
                    continue block25;
                }
                case 2115054860: {
                    break block25;
                }
            }
            break;
        }
        var1_3 = fa.a;
        if (var3_1) {
            throw null;
lbl38:
            // 2 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl38
        v5 /* !! */  = fa.da;
        if (true) ** GOTO lbl45
        block27: while (true) {
            v5 /* !! */  = (long)(v6 - fa.bexy("beyo", beyc(int ), (int)7));
lbl45:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case 51414178: {
                    v6 = fa.bexy("beyp", beyc(int ), (int)8);
                    continue block27;
                }
                case 2115054860: {
                    break block27;
                }
                case 2116802047: {
                    v6 = fa.bexy("beyq", beyc(int ), (int)9);
                    continue block27;
                }
            }
            break;
        }
        this.sendInvalidBurst();
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** continue;
                return;
            }
lbl60:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)fa.bexy("beyr", bexv(int ), (int)5);
                if (!var3_1) break;
                throw null;
            }
lbl64:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)fa.bexy("beys", bexv(int ), (int)6);
                if (!var3_1) break;
                throw null;
            }
            case 2: {
                var2_2 /* !! */  = (int)fa.bexy("beyt", bexv(int ), (int)7);
                if (!var3_1) ** GOTO lbl60
                throw null;
            }
            case 3: {
                var2_2 /* !! */  = (int)fa.bexy("beyu", bexv(int ), (int)8);
                if (!var3_1) ** GOTO lbl64
                throw null;
            }
            case 4: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)fa.bexy("beyv", bexv(int ), (int)9);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
            case 5: 
        }
        var2_2 /* !! */  = (int)fa.bexy("beyw", bexv(int ), (int)10);
        ** while (!var3_1)
lbl84:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ int bexv(int n2) {
        return bexw[n2] ^ bexx[n2];
    }

    static {
        bexw = new int[66];
        bexx = new int[66];
        fa.bfbv();
        fa.bfbw();
        beyd = new long[29];
        beye = new long[29];
        fa.bfbx();
        fa.bfby();
    }

    private static /* synthetic */ void bfbv() {
        fa.bexw[0] = -1658751756;
        fa.bexw[1] = 1282175773;
        fa.bexw[2] = -1696988277;
        fa.bexw[3] = 85632587;
        fa.bexw[4] = -1200671153;
        fa.bexw[5] = 455073170;
        fa.bexw[6] = -737209747;
        fa.bexw[7] = -482236587;
        fa.bexw[8] = -2103712757;
        fa.bexw[9] = 1766643375;
        fa.bexw[10] = 1940240622;
        fa.bexw[11] = -1967481771;
        fa.bexw[12] = 1883110889;
        fa.bexw[13] = -719058775;
        fa.bexw[14] = -71536378;
        fa.bexw[15] = 594857252;
        fa.bexw[16] = -499251476;
        fa.bexw[17] = -537971991;
        fa.bexw[18] = 291655271;
        fa.bexw[19] = 1975825223;
        fa.bexw[20] = 857207669;
        fa.bexw[21] = 311056500;
        fa.bexw[22] = 530889820;
        fa.bexw[23] = -1087761791;
        fa.bexw[24] = -36093140;
        fa.bexw[25] = 218800000;
        fa.bexw[26] = -680697791;
        fa.bexw[27] = 716386481;
        fa.bexw[28] = 793814689;
        fa.bexw[29] = -179612243;
        fa.bexw[30] = 0xEE8E84;
        fa.bexw[31] = 216182922;
        fa.bexw[32] = 1446005048;
        fa.bexw[33] = 444278012;
        fa.bexw[34] = -319199179;
        fa.bexw[35] = 1362513694;
        fa.bexw[36] = -1651619573;
        fa.bexw[37] = -836234334;
        fa.bexw[38] = 405889630;
        fa.bexw[39] = -1671158901;
        fa.bexw[40] = 1106066876;
        fa.bexw[41] = 144853647;
        fa.bexw[42] = -1101487981;
        fa.bexw[43] = -890703020;
        fa.bexw[44] = 1457478548;
        fa.bexw[45] = 183399475;
        fa.bexw[46] = -1945031443;
        fa.bexw[47] = -198483884;
        fa.bexw[48] = -1114121080;
        fa.bexw[49] = -443141563;
        fa.bexw[50] = 1901458288;
        fa.bexw[51] = 1547010431;
        fa.bexw[52] = -1951641748;
        fa.bexw[53] = -520856115;
        fa.bexw[54] = 664851639;
        fa.bexw[55] = -1794916067;
        fa.bexw[56] = 921222708;
        fa.bexw[57] = 1724121418;
        fa.bexw[58] = -85387210;
        fa.bexw[59] = -1217513621;
        fa.bexw[60] = -1213870697;
        fa.bexw[61] = -623091694;
        fa.bexw[62] = -1715993843;
        fa.bexw[63] = 1880159205;
        fa.bexw[64] = 144587740;
        fa.bexw[65] = 349544216;
    }

    private static /* synthetic */ void bfby() {
        fa.beye[0] = 5344489859190478209L;
        fa.beye[1] = 8201329136174497073L;
        fa.beye[2] = 208377830113099508L;
        fa.beye[3] = 5423570286907110555L;
        fa.beye[4] = -5533622337534420157L;
        fa.beye[5] = 4650885031468190270L;
        fa.beye[6] = 255355809582345513L;
        fa.beye[7] = -159995956553718001L;
        fa.beye[8] = -635809641049543943L;
        fa.beye[9] = 1705747816356331524L;
        fa.beye[10] = 6349640978802495677L;
        fa.beye[11] = -2286411988994839423L;
        fa.beye[12] = -4826228446608468033L;
        fa.beye[13] = 864749079986323168L;
        fa.beye[14] = 4254967803583355046L;
        fa.beye[15] = 4225389258173636327L;
        fa.beye[16] = 107164208690352878L;
        fa.beye[17] = -495762436361935823L;
        fa.beye[18] = 301264718591190214L;
        fa.beye[19] = 1632712431721047708L;
        fa.beye[20] = -3736176414670466546L;
        fa.beye[21] = 7875206274685419949L;
        fa.beye[22] = 3103277395849684166L;
        fa.beye[23] = 8570947510767331423L;
        fa.beye[24] = -8149309781603623890L;
        fa.beye[25] = -8142840933306840128L;
        fa.beye[26] = -3847920422362949794L;
        fa.beye[27] = 3519592994207347097L;
        fa.beye[28] = 6657778603225273438L;
    }

    private static /* synthetic */ void bfbx() {
        fa.beyd[0] = 6316416785467074691L;
        fa.beyd[1] = 9147410076261649869L;
        fa.beyd[2] = 1513371015100295338L;
        fa.beyd[3] = -8756879439309676584L;
        fa.beyd[4] = -5817957629775811956L;
        fa.beyd[5] = -1737124782036631159L;
        fa.beyd[6] = -7669600786259729928L;
        fa.beyd[7] = -3738306697329801388L;
        fa.beyd[8] = -3067616839020341730L;
        fa.beyd[9] = 7393992772708777220L;
        fa.beyd[10] = -6885918395246397595L;
        fa.beyd[11] = -8378211515135857979L;
        fa.beyd[12] = 3846441008851476125L;
        fa.beyd[13] = 2263251092660795185L;
        fa.beyd[14] = 6298786684113661090L;
        fa.beyd[15] = -4741202146469068050L;
        fa.beyd[16] = -1614367180094749101L;
        fa.beyd[17] = -7399622430553892678L;
        fa.beyd[18] = 2045659497102586460L;
        fa.beyd[19] = 1820396752312450540L;
        fa.beyd[20] = -3944692541109237206L;
        fa.beyd[21] = 574151956115860313L;
        fa.beyd[22] = -6591412602765472609L;
        fa.beyd[23] = 6330602600238125388L;
        fa.beyd[24] = 2588532994017467178L;
        fa.beyd[25] = -2146398584528781620L;
        fa.beyd[26] = -5376892495855233186L;
        fa.beyd[27] = 5703838813482037657L;
        fa.beyd[28] = -6659365494909283234L;
    }
}


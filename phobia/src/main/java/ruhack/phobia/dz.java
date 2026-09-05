/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import ruhack.phobia.nd;

public final class dz {
    static final long fn = 1106686884240333023L;
    private static boolean frameActive;
    private static long[] ceki;
    public static final boolean a;
    public static final int b;
    private static long[] cekh;
    public static final boolean c;
    private static final int FALLBACK;
    private static int frameColor;
    private static int[] cekz;
    private static int[] ceky;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean isLight() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dz.fn - dz.cekj("ceqi", cekg(int ), (int)67)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == dz.cekj("ceqj", cekx(int ), (int)83)) break;
            v0 /* !! */  = (long)dz.cekj("ceqk", cekx(int ), (int)84);
        }
        var2 = dz.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = dz.fn - dz.cekj("ceql", cekg(int ), (int)68)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == dz.cekj("ceqm", cekx(int ), (int)85)) break;
            v1 /* !! */  = (long)dz.cekj("ceqn", cekx(int ), (int)86);
        }
        var1_1 /* !! */  = dz.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = dz.fn - dz.cekj("ceqo", cekg(int ), (int)69)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == dz.cekj("ceqp", cekx(int ), (int)87)) break;
            v2 /* !! */  = (long)dz.cekj("ceqq", cekx(int ), (int)88);
        }
        var0_2 = dz.a;
        if (var2) {
            throw null;
lbl24:
            // 3 sources

            return (boolean)dz.cekj("ceqr", cekx(int ), (int)89);
        }
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block0 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2 || var0_2) ** GOTO lbl24
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_3 = dz.fn - dz.cekj("ceqs", cekg(int ), (int)70)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v3 /* !! */  == dz.cekj("ceqt", cekx(int ), (int)90)) break;
                    v3 /* !! */  = (long)dz.cekj("cequ", cekx(int ), (int)91);
                }
                if (!(dz.luminance() >= dz.cekj("ceqv", cepi(int ), (int)92))) ** GOTO lbl42
                if (var0_2) ** GOTO lbl24
                v4 = dz.cekj("ceqw", cekx(int ), (int)93);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl45
lbl42:
                // 1 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                v4 = dz.cekj("ceqx", cekx(int ), (int)94);
lbl45:
                // 2 sources

                return (boolean)v4;
            }
            case 0: {
                var1_1 /* !! */  = (int)dz.cekj("ceqy", cekx(int ), (int)95);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl60
            }
lbl51:
            // 2 sources

            case 1: {
                do {
                    var1_1 /* !! */  = (int)dz.cekj("ceqz", cekx(int ), (int)96);
                } while (!var2);
                throw null;
            }
            case 2: {
                var1_1 /* !! */  = (int)dz.cekj("cera", cekx(int ), (int)97);
                if (!var2) break;
                throw null;
            }
lbl60:
            // 2 sources

            case 3: {
                var1_1 /* !! */  = (int)dz.cekj("cerb", cekx(int ), (int)98);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl75
            }
            case 4: {
                do {
                    var1_1 /* !! */  = (int)dz.cekj("cerc", cekx(int ), (int)99);
                } while (!var2);
                throw null;
            }
            case 5: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)dz.cekj("cerd", cekx(int ), (int)100);
                    if (!var2) break block0;
                    throw null;
                }
            }
lbl75:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)dz.cekj("cere", cekx(int ), (int)101);
                if (!var2) ** GOTO lbl51
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)dz.cekj("cerf", cekx(int ), (int)102);
        ** while (!var2)
lbl82:
        // 1 sources

        throw null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static float luminance() {
        boolean bl2;
        Object object = fn;
        boolean bl3 = true;
        block16: while (true) {
            CallSite callSite;
            if (!bl3 || (bl3 = false) || !true) {
                object = callSite - dz.cekj("ceoz", cekg(int ), (int)53);
            }
            switch ((int)object) {
                case -1799710497: {
                    break block16;
                }
                case -935204193: {
                    callSite = dz.cekj("cepa", cekg(int ), (int)54);
                    continue block16;
                }
                case 88788978: {
                    callSite = dz.cekj("cepb", cekg(int ), (int)55);
                    continue block16;
                }
            }
            break;
        }
        boolean bl4 = c;
        while (true) {
            long l2;
            Object object2;
            if ((object2 = (l2 = fn - dz.cekj("cepc", cekg(int ), (int)56)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
            if (object2 == dz.cekj("cepd", cekx(int ), (int)63)) break;
            object2 = dz.cekj("cepe", cekx(int ), (int)64);
        }
        int n2 = b;
        while (true) {
            long l3;
            Object object3;
            if ((object3 = (l3 = fn - dz.cekj("cepf", cekg(int ), (int)57)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
            if (object3 == dz.cekj("cepg", cekx(int ), (int)65)) {
                bl2 = a;
                if (bl4) {
                    throw null;
                }
                break;
            }
            object3 = dz.cekj("ceph", cekx(int ), (int)66);
        }
        if (bl2) return (float)dz.cekj("cepj", cepi(int ), (int)67);
        if (bl2) return (float)dz.cekj("cepj", cepi(int ), (int)67);
        CallSite callSite = dz.cekj("cepk", cekx(int ), (int)68);
        Object object4 = fn;
        boolean bl5 = true;
        block19: while (true) {
            CallSite callSite2;
            if (!bl5 || (bl5 = false) || !true) {
                object4 = callSite2 - dz.cekj("cepl", cekg(int ), (int)58);
            }
            switch ((int)object4) {
                case -1799710497: {
                    break block19;
                }
                case -620249427: {
                    callSite2 = dz.cekj("cepm", cekg(int ), (int)59);
                    continue block19;
                }
                case -138447035: {
                    callSite2 = dz.cekj("cepn", cekg(int ), (int)60);
                    continue block19;
                }
                case 921856727: {
                    callSite2 = dz.cekj("cepo", cekg(int ), (int)61);
                    continue block19;
                }
            }
            break;
        }
        int n3 = dz.color((int)callSite);
        if (bl2) return (float)dz.cekj("cepj", cepi(int ), (int)67);
        if (bl2) return (float)dz.cekj("cepj", cepi(int ), (int)67);
        Object object5 = fn;
        boolean bl6 = true;
        block20: while (true) {
            CallSite callSite3;
            if (!bl6 || (bl6 = false) || !true) {
                object5 = callSite3 - dz.cekj("cepp", cekg(int ), (int)62);
            }
            switch ((int)object5) {
                case -1799710497: {
                    break block20;
                }
                case 55204771: {
                    callSite3 = dz.cekj("cepq", cekg(int ), (int)63);
                    continue block20;
                }
                case 1748616228: {
                    callSite3 = dz.cekj("cepr", cekg(int ), (int)64);
                    continue block20;
                }
            }
            break;
        }
        float f2 = (float)nd.getRed(n3) * dz.cekj("ceps", cepi(int ), (int)69);
        while (true) {
            long l4;
            Object object6;
            if ((object6 = (l4 = fn - dz.cekj("cept", cekg(int ), (int)65)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
            if (object6 == dz.cekj("cepu", cekx(int ), (int)70)) break;
            object6 = dz.cekj("cepv", cekx(int ), (int)71);
        }
        float f3 = f2 + (float)nd.getGreen(n3) * dz.cekj("cepw", cepi(int ), (int)72);
        while (true) {
            long l5;
            Object object7;
            if ((object7 = (l5 = fn - dz.cekj("cepx", cekg(int ), (int)66)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
            if (object7 == dz.cekj("cepy", cekx(int ), (int)73)) {
                return (f3 + (float)nd.getBlue(n3) * dz.cekj("ceqa", cepi(int ), (int)75)) / dz.cekj("ceqb", cepi(int ), (int)76);
            }
            object7 = dz.cekj("cepz", cekx(int ), (int)74);
        }
    }

    private static /* synthetic */ void cevl() {
        dz.cekz[0] = 65669024;
        dz.cekz[1] = -1374811848;
        dz.cekz[2] = 1734038602;
        dz.cekz[3] = -2114652980;
        dz.cekz[4] = 1263102088;
        dz.cekz[5] = -2104407178;
        dz.cekz[6] = 639031880;
        dz.cekz[7] = 995588428;
        dz.cekz[8] = -1323297592;
        dz.cekz[9] = 326478795;
        dz.cekz[10] = -39337957;
        dz.cekz[11] = -52744290;
        dz.cekz[12] = -1585177342;
        dz.cekz[13] = 1519208396;
        dz.cekz[14] = 1646642748;
        dz.cekz[15] = 799743603;
        dz.cekz[16] = 564787126;
        dz.cekz[17] = 903413106;
        dz.cekz[18] = -491130242;
        dz.cekz[19] = -1592947047;
        dz.cekz[20] = 1676742460;
        dz.cekz[21] = 323252393;
        dz.cekz[22] = -163504531;
        dz.cekz[23] = 16755157;
        dz.cekz[24] = 544340006;
        dz.cekz[25] = -2050253523;
        dz.cekz[26] = -277004180;
        dz.cekz[27] = -374846804;
        dz.cekz[28] = -1748883386;
        dz.cekz[29] = -962853009;
        dz.cekz[30] = -1993129378;
        dz.cekz[31] = 1349561594;
        dz.cekz[32] = -1486515409;
        dz.cekz[33] = 1684420333;
        dz.cekz[34] = 1603497903;
        dz.cekz[35] = 1934623450;
        dz.cekz[36] = -1933478996;
        dz.cekz[37] = -150367246;
        dz.cekz[38] = 1997754494;
        dz.cekz[39] = -1533305474;
        dz.cekz[40] = 420697412;
        dz.cekz[41] = -992874554;
        dz.cekz[42] = -324540601;
        dz.cekz[43] = 408334160;
        dz.cekz[44] = -320016008;
        dz.cekz[45] = 1146995438;
        dz.cekz[46] = -1809375933;
        dz.cekz[47] = -1255924107;
        dz.cekz[48] = 587341320;
        dz.cekz[49] = -572534103;
        dz.cekz[50] = -1072411642;
        dz.cekz[51] = -801838983;
        dz.cekz[52] = -2133018598;
        dz.cekz[53] = -723965972;
        dz.cekz[54] = -1700933936;
        dz.cekz[55] = -900352626;
        dz.cekz[56] = 128191020;
        dz.cekz[57] = -1324636562;
        dz.cekz[58] = 31822932;
        dz.cekz[59] = 1256110653;
        dz.cekz[60] = 439088105;
        dz.cekz[61] = 715911681;
        dz.cekz[62] = -772840884;
        dz.cekz[63] = 1198589038;
        dz.cekz[64] = 833209905;
        dz.cekz[65] = 869621181;
        dz.cekz[66] = 211604522;
        dz.cekz[67] = -1157622142;
        dz.cekz[68] = -336378715;
        dz.cekz[69] = -1119474209;
        dz.cekz[70] = 1054250695;
        dz.cekz[71] = -134107440;
        dz.cekz[72] = -822764736;
        dz.cekz[73] = -1157107236;
        dz.cekz[74] = 1551424001;
        dz.cekz[75] = -1449053016;
        dz.cekz[76] = 1982165763;
        dz.cekz[77] = -1411486270;
        dz.cekz[78] = -1560874957;
        dz.cekz[79] = -868863967;
        dz.cekz[80] = -1097866995;
        dz.cekz[81] = -495782905;
        dz.cekz[82] = 1428793411;
        dz.cekz[83] = 1260646169;
        dz.cekz[84] = 512843229;
        dz.cekz[85] = -1567891784;
        dz.cekz[86] = 252365948;
        dz.cekz[87] = -1906461039;
        dz.cekz[88] = -1529171137;
        dz.cekz[89] = 126634967;
        dz.cekz[90] = 2108645891;
        dz.cekz[91] = 34120214;
        dz.cekz[92] = 540186309;
        dz.cekz[93] = -1977681658;
        dz.cekz[94] = 914719661;
        dz.cekz[95] = 491767401;
        dz.cekz[96] = -1950630969;
        dz.cekz[97] = 1380176385;
        dz.cekz[98] = 56539591;
        dz.cekz[99] = 863282414;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int onAccent() {
        v0 /* !! */  = dz.fn;
        if (true) ** GOTO lbl5
        block21: while (true) {
            v0 /* !! */  = (long)(v1 - dz.cekj("cerg", cekg(int ), (int)71));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1799710497: {
                    break block21;
                }
                case -1258094964: {
                    v1 = dz.cekj("cerh", cekg(int ), (int)72);
                    continue block21;
                }
                case 984366437: {
                    v1 = dz.cekj("ceri", cekg(int ), (int)73);
                    continue block21;
                }
                case 1189764440: {
                    v1 = dz.cekj("cerj", cekg(int ), (int)74);
                    continue block21;
                }
            }
            break;
        }
        var2 = dz.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = dz.fn - dz.cekj("cerk", cekg(int ), (int)75)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == dz.cekj("cerl", cekx(int ), (int)103)) break;
            v2 /* !! */  = (long)dz.cekj("cerm", cekx(int ), (int)104);
        }
        var1_1 /* !! */  = dz.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = dz.fn - dz.cekj("cern", cekg(int ), (int)76)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == dz.cekj("cero", cekx(int ), (int)105)) break;
            v3 /* !! */  = (long)dz.cekj("cerp", cekx(int ), (int)106);
        }
        var0_2 = dz.a;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2) {
                    throw null;
lbl35:
                    // 3 sources

                    return (int)dz.cekj("cerq", cekx(int ), (int)107);
                }
                if (var0_2 || var0_2) ** GOTO lbl35
                v4 /* !! */  = dz.fn;
                if (true) ** GOTO lbl42
                block25: while (true) {
                    v4 /* !! */  = (long)(v5 - dz.cekj("cerr", cekg(int ), (int)77));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1799710497: {
                            break block25;
                        }
                        case -332946081: {
                            v5 = dz.cekj("cers", cekg(int ), (int)78);
                            continue block25;
                        }
                        case -210762946: {
                            v5 = dz.cekj("cert", cekg(int ), (int)79);
                            continue block25;
                        }
                    }
                    break;
                }
                if (!dz.isLight()) ** GOTO lbl66
                if (var0_2) ** GOTO lbl35
                v6 = dz.cekj("ceru", cekx(int ), (int)108);
                v7 = dz.cekj("cerv", cekx(int ), (int)109);
                v8 = dz.cekj("cerw", cekx(int ), (int)110);
                v9 = dz.cekj("cerx", cekx(int ), (int)111);
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_2 = dz.fn - dz.cekj("cery", cekg(int ), (int)80)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == dz.cekj("cerz", cekx(int ), (int)112)) break;
                    v10 /* !! */  = (long)dz.cekj("cesa", cekx(int ), (int)113);
                }
                v11 = nd.rgba((int)v6, (int)v7, (int)v8, (int)v9);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl79
lbl66:
                // 1 sources

                if (!var0_2 && !var0_2) ** break;
                ** continue;
                v12 = dz.cekj("cesb", cekx(int ), (int)114);
                v13 = dz.cekj("cesc", cekx(int ), (int)115);
                v14 = dz.cekj("cesd", cekx(int ), (int)116);
                v15 = dz.cekj("cese", cekx(int ), (int)117);
                while (true) {
                    if ((v16 /* !! */  = (cfr_temp_3 = dz.fn - dz.cekj("cesf", cekg(int ), (int)81)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v16 /* !! */  == dz.cekj("cesg", cekx(int ), (int)118)) {
                        v11 = nd.rgba((int)v12, (int)v13, (int)v14, (int)v15);
                        break;
                    }
                    v16 /* !! */  = (long)dz.cekj("cesh", cekx(int ), (int)119);
                }
lbl79:
                // 2 sources

                return v11;
            }
            case 0: {
                var1_1 /* !! */  = (int)dz.cekj("cesi", cekx(int ), (int)120);
                if (!var2) break;
                throw null;
            }
lbl84:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)dz.cekj("cesj", cekx(int ), (int)121);
                    if (var2) {
                        throw null;
                    }
                    ** GOTO lbl94
                    break;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)dz.cekj("cesk", cekx(int ), (int)122);
                if (var2) {
                    throw null;
                }
            }
lbl94:
            // 4 sources

            case 3: {
                var1_1 /* !! */  = (int)dz.cekj("cesl", cekx(int ), (int)123);
                if (!var2) break;
                throw null;
            }
lbl98:
            // 2 sources

            case 4: {
                var1_1 /* !! */  = (int)dz.cekj("cesm", cekx(int ), (int)124);
                if (var2) {
                    throw null;
                }
                ** GOTO lbl107
            }
            case 5: {
                var1_1 /* !! */  = (int)dz.cekj("cesn", cekx(int ), (int)125);
                if (!var2) ** GOTO lbl98
                throw null;
            }
lbl107:
            // 2 sources

            case 6: {
                var1_1 /* !! */  = (int)dz.cekj("ceso", cekx(int ), (int)126);
                if (!var2) ** GOTO lbl84
                throw null;
            }
            case 7: 
        }
        var1_1 /* !! */  = (int)dz.cekj("cesp", cekx(int ), (int)127);
        ** while (!var2)
lbl114:
        // 1 sources

        throw null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int innerShadow(int n2) {
        int n3;
        boolean bl2;
        block13: {
            while (true) {
                long l2;
                Object object;
                if ((object = (l2 = fn - dz.cekj("cetx", cekg(int ), (int)94)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) continue;
                if (object == dz.cekj("cety", cekx(int ), (int)149)) break;
                object = dz.cekj("cetz", cekx(int ), (int)150);
            }
            boolean bl3 = c;
            while (true) {
                long l3;
                Object object;
                if ((object = (l3 = fn - dz.cekj("ceua", cekg(int ), (int)95)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false) continue;
                if (object == dz.cekj("ceub", cekx(int ), (int)151)) break;
                object = dz.cekj("ceuc", cekx(int ), (int)152);
            }
            int n4 = b;
            while (true) {
                long l4;
                Object object;
                if ((object = (l4 = fn - dz.cekj("ceud", cekg(int ), (int)96)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) continue;
                if (object == dz.cekj("ceue", cekx(int ), (int)153)) {
                    bl2 = a;
                    if (bl3) {
                        throw null;
                    }
                    break;
                }
                object = dz.cekj("ceuf", cekx(int ), (int)154);
            }
            if (bl2) return (int)dz.cekj("ceug", cekx(int ), (int)155);
            if (bl2) return (int)dz.cekj("ceug", cekx(int ), (int)155);
            while (true) {
                long l5;
                Object object;
                if ((object = (l5 = fn - dz.cekj("ceuh", cekg(int ), (int)97)) == 0L ? 0 : (l5 < 0L ? -1 : 1)) == false) continue;
                if (object == dz.cekj("ceui", cekx(int ), (int)156)) {
                    if (dz.isLight()) {
                        break;
                    }
                    break block13;
                }
                object = dz.cekj("ceuj", cekx(int ), (int)157);
            }
            if (bl2) return (int)dz.cekj("ceug", cekx(int ), (int)155);
            CallSite callSite4 = dz.cekj("ceuk", cekx(int ), (int)158);
            callSite4 = dz.cekj("ceul", cekx(int ), (int)159);
            callSite4 = dz.cekj("ceum", cekx(int ), (int)160);
            callSite4 = dz.cekj("ceun", cekx(int ), (int)161);
            while (true) {
                long l6;
                Object object;
                if ((object = (l6 = fn - dz.cekj("ceuo", cekg(int ), (int)98)) == 0L ? 0 : (l6 < 0L ? -1 : 1)) == false) continue;
                if (object == dz.cekj("ceup", cekx(int ), (int)162)) break;
                object = dz.cekj("ceuq", cekx(int ), (int)163);
            }
            int n5 = Math.max(n2, (int)callSite4);
            while (true) {
                long l7;
                Object object;
                if ((object = (l7 = fn - dz.cekj("ceur", cekg(int ), (int)99)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) continue;
                if (object == dz.cekj("ceus", cekx(int ), (int)164)) {
                    n3 = nd.rgba((int)callSite, (int)callSite2, (int)callSite3, n5);
                    if (!bl3) return n3;
                    throw null;
                }
                object = dz.cekj("ceut", cekx(int ), (int)165);
            }
        }
        if (bl2) return (int)dz.cekj("ceug", cekx(int ), (int)155);
        if (bl2) return (int)dz.cekj("ceug", cekx(int ), (int)155);
        while (true) {
            long l8;
            Object object;
            if ((object = (l8 = fn - dz.cekj("ceuu", cekg(int ), (int)100)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false) continue;
            if (object == dz.cekj("ceuv", cekx(int ), (int)166)) {
                n3 = dz.color(n2);
                return n3;
            }
            object = dz.cekj("ceuw", cekx(int ), (int)167);
        }
    }

    private static /* synthetic */ void cevk() {
        dz.ceky[100] = 952112363;
        dz.ceky[101] = -315482888;
        dz.ceky[102] = 260955468;
        dz.ceky[103] = -1580372297;
        dz.ceky[104] = 1575940447;
        dz.ceky[105] = -3699038;
        dz.ceky[106] = -1738913693;
        dz.ceky[107] = -756686841;
        dz.ceky[108] = -2105370164;
        dz.ceky[109] = 186952095;
        dz.ceky[110] = 2022699933;
        dz.ceky[111] = 1179347104;
        dz.ceky[112] = -278168818;
        dz.ceky[113] = 1942230660;
        dz.ceky[114] = 1277014300;
        dz.ceky[115] = 1240481738;
        dz.ceky[116] = 395833499;
        dz.ceky[117] = -441105712;
        dz.ceky[118] = -1177528483;
        dz.ceky[119] = -306967427;
        dz.ceky[120] = 1968414679;
        dz.ceky[121] = -131538252;
        dz.ceky[122] = -311526473;
        dz.ceky[123] = 681589077;
        dz.ceky[124] = 1468821547;
        dz.ceky[125] = -80337508;
        dz.ceky[126] = -811448407;
        dz.ceky[127] = -1982222994;
        dz.ceky[128] = -458696796;
        dz.ceky[129] = 65875540;
        dz.ceky[130] = 593728237;
        dz.ceky[131] = -1134537070;
        dz.ceky[132] = -2052688487;
        dz.ceky[133] = -1627638029;
        dz.ceky[134] = -1649579381;
        dz.ceky[135] = -1810698614;
        dz.ceky[136] = 572529368;
        dz.ceky[137] = 748572445;
        dz.ceky[138] = -546321345;
        dz.ceky[139] = -1754446444;
        dz.ceky[140] = 1527451601;
        dz.ceky[141] = 1915639025;
        dz.ceky[142] = -1683285803;
        dz.ceky[143] = 1719224490;
        dz.ceky[144] = -1869120240;
        dz.ceky[145] = -2013682390;
        dz.ceky[146] = -1955844444;
        dz.ceky[147] = -650413593;
        dz.ceky[148] = 743812474;
        dz.ceky[149] = -823526926;
        dz.ceky[150] = -1156420794;
        dz.ceky[151] = -409915040;
        dz.ceky[152] = -164124853;
        dz.ceky[153] = 553880100;
        dz.ceky[154] = 1323549186;
        dz.ceky[155] = -982020736;
        dz.ceky[156] = 30433570;
        dz.ceky[157] = -1511790685;
        dz.ceky[158] = -314182999;
        dz.ceky[159] = -1949054151;
        dz.ceky[160] = -1388071006;
        dz.ceky[161] = 815302457;
        dz.ceky[162] = -562916601;
        dz.ceky[163] = 816415676;
        dz.ceky[164] = -1109078772;
        dz.ceky[165] = 968319884;
        dz.ceky[166] = -371181436;
        dz.ceky[167] = 254940336;
        dz.ceky[168] = 428665475;
        dz.ceky[169] = -155171289;
        dz.ceky[170] = -1550626157;
        dz.ceky[171] = -1821460274;
        dz.ceky[172] = 1306081830;
        dz.ceky[173] = 673902391;
        dz.ceky[174] = -2023334387;
        dz.ceky[175] = 1148643371;
        dz.ceky[176] = -1719651380;
        dz.ceky[177] = -443428084;
        dz.ceky[178] = 688467911;
        dz.ceky[179] = 1928597702;
    }

    private static /* synthetic */ void cevm() {
        dz.cekz[100] = 952112362;
        dz.cekz[101] = -315482884;
        dz.cekz[102] = 260955470;
        dz.cekz[103] = 1580372296;
        dz.cekz[104] = -1680931169;
        dz.cekz[105] = -3699037;
        dz.cekz[106] = 569328107;
        dz.cekz[107] = 1293510712;
        dz.cekz[108] = -2105370150;
        dz.cekz[109] = 186952073;
        dz.cekz[110] = 2022699909;
        dz.cekz[111] = 1179347039;
        dz.cekz[112] = -278168817;
        dz.cekz[113] = -1118526617;
        dz.cekz[114] = 1277014499;
        dz.cekz[115] = 1240481589;
        dz.cekz[116] = 395833444;
        dz.cekz[117] = -441105873;
        dz.cekz[118] = -1177528484;
        dz.cekz[119] = 668400872;
        dz.cekz[120] = 1968414673;
        dz.cekz[121] = -131538256;
        dz.cekz[122] = -311526479;
        dz.cekz[123] = 681589077;
        dz.cekz[124] = 1468821549;
        dz.cekz[125] = -80337512;
        dz.cekz[126] = -811448403;
        dz.cekz[127] = -1982222998;
        dz.cekz[128] = -458696795;
        dz.cekz[129] = -1754086165;
        dz.cekz[130] = 593728236;
        dz.cekz[131] = -1691120515;
        dz.cekz[132] = -1921588069;
        dz.cekz[133] = 1627638028;
        dz.cekz[134] = 1988872539;
        dz.cekz[135] = -1810698635;
        dz.cekz[136] = 572529191;
        dz.cekz[137] = 748572642;
        dz.cekz[138] = -546321365;
        dz.cekz[139] = -1754446443;
        dz.cekz[140] = 971484898;
        dz.cekz[141] = 1915639028;
        dz.cekz[142] = -1683285801;
        dz.cekz[143] = 1719224488;
        dz.cekz[144] = -1869120235;
        dz.cekz[145] = -2013682385;
        dz.cekz[146] = -1955844444;
        dz.cekz[147] = -650413596;
        dz.cekz[148] = 743812473;
        dz.cekz[149] = -823526925;
        dz.cekz[150] = 970412829;
        dz.cekz[151] = -409915039;
        dz.cekz[152] = 133019350;
        dz.cekz[153] = 553880101;
        dz.cekz[154] = 1769025847;
        dz.cekz[155] = 59492923;
        dz.cekz[156] = 30433571;
        dz.cekz[157] = 675917688;
        dz.cekz[158] = -314182999;
        dz.cekz[159] = -1949054151;
        dz.cekz[160] = -1388071006;
        dz.cekz[161] = 815302411;
        dz.cekz[162] = 562916600;
        dz.cekz[163] = -1929899248;
        dz.cekz[164] = 1109078771;
        dz.cekz[165] = -86589882;
        dz.cekz[166] = -371181435;
        dz.cekz[167] = -99870190;
        dz.cekz[168] = 428665473;
        dz.cekz[169] = -155171293;
        dz.cekz[170] = -1550626159;
        dz.cekz[171] = -1821460279;
        dz.cekz[172] = 1306081831;
        dz.cekz[173] = 673902386;
        dz.cekz[174] = -2023334391;
        dz.cekz[175] = 1148643374;
        dz.cekz[176] = -1719651557;
        dz.cekz[177] = -443427935;
        dz.cekz[178] = 688467768;
        dz.cekz[179] = 1928597561;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static void endFrame() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = dz.fn - dz.cekj("celm", cekg(int ), (int)14)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == dz.cekj("celn", cekx(int ), (int)11)) break;
            v0 /* !! */  = (long)dz.cekj("celo", cekx(int ), (int)12);
        }
        var2 = dz.c;
        v1 /* !! */  = dz.fn;
        if (true) ** GOTO lbl11
        block19: while (true) {
            v1 /* !! */  = (long)(v2 - dz.cekj("celp", cekg(int ), (int)15));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1799710497: {
                    break block19;
                }
                case -1577873029: {
                    v2 = dz.cekj("celq", cekg(int ), (int)16);
                    continue block19;
                }
                case -1462339174: {
                    v2 = dz.cekj("celr", cekg(int ), (int)17);
                    continue block19;
                }
            }
            break;
        }
        var1_1 /* !! */  = dz.b;
        v3 /* !! */  = dz.fn;
        if (true) ** GOTO lbl25
        block20: while (true) {
            v3 /* !! */  = (long)(v4 - dz.cekj("cels", cekg(int ), (int)18));
lbl25:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1799710497: {
                    break block20;
                }
                case -839113605: {
                    v4 = dz.cekj("celt", cekg(int ), (int)19);
                    continue block20;
                }
                case 446661945: {
                    v4 = dz.cekj("celu", cekg(int ), (int)20);
                    continue block20;
                }
            }
            break;
        }
        var0_2 = dz.a;
        if (var2) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var0_2) ** GOTO lbl37
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        block10 : switch (var1_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var0_2) ** GOTO lbl37
                v5 = dz.cekj("celv", cekx(int ), (int)13);
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_1 = dz.fn - dz.cekj("celw", cekg(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dz.cekj("celx", cekx(int ), (int)14)) break;
                    v6 /* !! */  = (long)dz.cekj("cely", cekx(int ), (int)15);
                }
                dz.frameActive = v5;
                if (!var0_2 && !var0_2) ** break;
                ** continue;
                return;
            }
lbl54:
            // 2 sources

            case 0: {
                do {
                    var1_1 /* !! */  = (int)dz.cekj("celz", cekx(int ), (int)16);
                } while (!var2);
                throw null;
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var1_1 /* !! */  = (int)dz.cekj("cema", cekx(int ), (int)17);
                    if (!var2) break block10;
                    throw null;
                }
            }
            case 2: {
                var1_1 /* !! */  = (int)dz.cekj("cemb", cekx(int ), (int)18);
                if (!var2) ** GOTO lbl54
                throw null;
            }
            case 3: {
                var1_1 /* !! */  = (int)dz.cekj("cemc", cekx(int ), (int)19);
                if (!var2) break;
                throw null;
            }
            case 4: {
                var1_1 /* !! */  = (int)dz.cekj("cemd", cekx(int ), (int)20);
                if (!var2) break;
                throw null;
            }
            case 5: 
        }
        var1_1 /* !! */  = (int)dz.cekj("ceme", cekx(int ), (int)21);
        ** while (!var2)
lbl79:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static int color(int var0) {
        block23: {
            block22: {
                while (true) {
                    if ((v0 /* !! */  = (cfr_temp_0 = dz.fn - dz.cekj("cenu", cekg(int ), (int)41)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v0 /* !! */  == dz.cekj("cenv", cekx(int ), (int)44)) break;
                    v0 /* !! */  = (long)dz.cekj("cenw", cekx(int ), (int)45);
                }
                var3_1 = dz.c;
                while (true) {
                    if ((v1 /* !! */  = (cfr_temp_1 = dz.fn - dz.cekj("cenx", cekg(int ), (int)42)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v1 /* !! */  == dz.cekj("ceny", cekx(int ), (int)46)) break;
                    v1 /* !! */  = (long)dz.cekj("cenz", cekx(int ), (int)47);
                }
                var2_2 = dz.b;
                v2 /* !! */  = dz.fn;
                if (true) ** GOTO lbl17
                block13: while (true) {
                    v2 /* !! */  = (long)(v3 - dz.cekj("ceoa", cekg(int ), (int)43));
lbl17:
                    // 2 sources

                    switch ((int)v2 /* !! */ ) {
                        case -1799710497: {
                            break block13;
                        }
                        case -161635228: {
                            v3 = dz.cekj("ceob", cekg(int ), (int)44);
                            continue block13;
                        }
                        case 1970981816: {
                            v3 = dz.cekj("ceoc", cekg(int ), (int)45);
                            continue block13;
                        }
                    }
                    break;
                }
                var1_3 = dz.a;
                if (var3_1) {
                    throw null;
lbl29:
                    // 3 sources

                    return (int)dz.cekj("ceod", cekx(int ), (int)48);
                }
                if (var1_3 || var1_3) ** GOTO lbl29
                v4 /* !! */  = dz.fn;
                if (true) ** GOTO lbl36
                block15: while (true) {
                    v4 /* !! */  = (long)(v5 - dz.cekj("ceoe", cekg(int ), (int)46));
lbl36:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1799710497: {
                            break block15;
                        }
                        case -1196717942: {
                            v5 = dz.cekj("ceof", cekg(int ), (int)47);
                            continue block15;
                        }
                        case 111457981: {
                            v5 = dz.cekj("ceog", cekg(int ), (int)48);
                            continue block15;
                        }
                        case 1512471010: {
                            v5 = dz.cekj("ceoh", cekg(int ), (int)49);
                            continue block15;
                        }
                    }
                    break;
                }
                if (!dz.frameActive) break block22;
                if (var1_3) ** GOTO lbl29
                while (true) {
                    if ((v6 /* !! */  = (cfr_temp_2 = dz.fn - dz.cekj("ceoi", cekg(int ), (int)50)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  == dz.cekj("ceoj", cekx(int ), (int)49)) break;
                    v6 /* !! */  = (long)dz.cekj("ceok", cekx(int ), (int)50);
                }
                v7 = dz.frameColor;
                if (var3_1) {
                    throw null;
                }
                break block23;
            }
            if (!var1_3 && !var1_3) ** break;
            ** while (true)
            while (true) {
                if ((v8 /* !! */  = (cfr_temp_3 = dz.fn - dz.cekj("ceol", cekg(int ), (int)51)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v8 /* !! */  == dz.cekj("ceom", cekx(int ), (int)51)) {
                    v7 = dz.resolveColor();
                    break;
                }
                v8 /* !! */  = (long)dz.cekj("ceon", cekx(int ), (int)52);
            }
        }
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = dz.fn - dz.cekj("ceoo", cekg(int ), (int)52)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == dz.cekj("ceop", cekx(int ), (int)53)) break;
            v9 /* !! */  = (long)dz.cekj("ceoq", cekx(int ), (int)54);
        }
        return nd.replAlpha(v7, var0);
    }

    private static /* synthetic */ int cekx(int n2) {
        return ceky[n2] ^ cekz[n2];
    }

    private static /* synthetic */ void cevp() {
        dz.ceki[0] = -7056532696676608383L;
        dz.ceki[1] = -6390526217704863919L;
        dz.ceki[2] = -8583199530818153422L;
        dz.ceki[3] = -8868066109349835890L;
        dz.ceki[4] = 2394278572821109845L;
        dz.ceki[5] = 3942709278622243534L;
        dz.ceki[6] = 7762053713936684545L;
        dz.ceki[7] = 4767602169588004320L;
        dz.ceki[8] = -6486277225749841256L;
        dz.ceki[9] = -5964551611293569097L;
        dz.ceki[10] = 8163539414292384263L;
        dz.ceki[11] = 1284675212646057292L;
        dz.ceki[12] = -963720421803917492L;
        dz.ceki[13] = -9194010939601472472L;
        dz.ceki[14] = 4159595675908252198L;
        dz.ceki[15] = 7040762080754796333L;
        dz.ceki[16] = 4602095783603372394L;
        dz.ceki[17] = -2409954826846746806L;
        dz.ceki[18] = 8342452471344337573L;
        dz.ceki[19] = -4368178901675780194L;
        dz.ceki[20] = -8474187600148025894L;
        dz.ceki[21] = 3139850153978743461L;
        dz.ceki[22] = -1388131753538049084L;
        dz.ceki[23] = -1928150982356705661L;
        dz.ceki[24] = -7633163348393817681L;
        dz.ceki[25] = -3603532213551417863L;
        dz.ceki[26] = 6388984393971294576L;
        dz.ceki[27] = -5427120193141981562L;
        dz.ceki[28] = 2830544233281643740L;
        dz.ceki[29] = 5644135530936284209L;
        dz.ceki[30] = -1109870473308871638L;
        dz.ceki[31] = 2882197976507199682L;
        dz.ceki[32] = 3018800928887080976L;
        dz.ceki[33] = 2154603842244524872L;
        dz.ceki[34] = -6348224574551245417L;
        dz.ceki[35] = 1680292032103387113L;
        dz.ceki[36] = 657986120715371814L;
        dz.ceki[37] = 8298300961259443009L;
        dz.ceki[38] = -2058341135987485868L;
        dz.ceki[39] = 4253949398946823362L;
        dz.ceki[40] = 2814568021898634937L;
        dz.ceki[41] = -7448504922548435807L;
        dz.ceki[42] = 133619595746864717L;
        dz.ceki[43] = 3159168069873469706L;
        dz.ceki[44] = 7841691323270534913L;
        dz.ceki[45] = 509853323661630129L;
        dz.ceki[46] = 1014321966978007025L;
        dz.ceki[47] = -1123672178863070924L;
        dz.ceki[48] = -428856302495599795L;
        dz.ceki[49] = 2341775888435348171L;
        dz.ceki[50] = 6617990991684583490L;
        dz.ceki[51] = 5018426772057713152L;
        dz.ceki[52] = 5744615669890210071L;
        dz.ceki[53] = -3848649968818956235L;
        dz.ceki[54] = -1111161641341796820L;
        dz.ceki[55] = -569579846818302811L;
        dz.ceki[56] = 3506989536971440328L;
        dz.ceki[57] = -2853468307173711062L;
        dz.ceki[58] = 681143518621152875L;
        dz.ceki[59] = -3365653577217556950L;
        dz.ceki[60] = 3620575543438559950L;
        dz.ceki[61] = 8654717937202779865L;
        dz.ceki[62] = 3305751586764049890L;
        dz.ceki[63] = -7063914512069562918L;
        dz.ceki[64] = 2280737060081158874L;
        dz.ceki[65] = -7353483817080349266L;
        dz.ceki[66] = 845522285482134281L;
        dz.ceki[67] = 1178387149404888750L;
        dz.ceki[68] = -6346260316864828406L;
        dz.ceki[69] = -8601671101024763239L;
        dz.ceki[70] = 8494509182753833771L;
        dz.ceki[71] = 8181103391765957779L;
        dz.ceki[72] = 3030328524629473481L;
        dz.ceki[73] = 4079269150863112945L;
        dz.ceki[74] = -7491796154920317027L;
        dz.ceki[75] = -8804541036007313549L;
        dz.ceki[76] = -8838410155935572614L;
        dz.ceki[77] = -3004850589518521234L;
        dz.ceki[78] = 4501009123717752895L;
        dz.ceki[79] = 5889312306388796941L;
        dz.ceki[80] = 845763043775875078L;
        dz.ceki[81] = -6123263688422904158L;
        dz.ceki[82] = -4579655851265712975L;
        dz.ceki[83] = -3874412737291810768L;
        dz.ceki[84] = -7730346131259591183L;
        dz.ceki[85] = 7728410263597869491L;
        dz.ceki[86] = -7748138893656446822L;
        dz.ceki[87] = 5721083920703976471L;
        dz.ceki[88] = -1322725156294710421L;
        dz.ceki[89] = -2418819585270740981L;
        dz.ceki[90] = -7336600308561781158L;
        dz.ceki[91] = -4615084680583752524L;
        dz.ceki[92] = 243940442871295040L;
        dz.ceki[93] = 7459993947504956294L;
        dz.ceki[94] = -6276744849232276301L;
        dz.ceki[95] = 5120534745441176453L;
        dz.ceki[96] = 5245946015974425929L;
        dz.ceki[97] = -4556009732187163643L;
        dz.ceki[98] = -7027679980242533042L;
        dz.ceki[99] = 437161512811087949L;
    }

    private static /* synthetic */ void cevj() {
        dz.ceky[0] = 65669025;
        dz.ceky[1] = 1374811847;
        dz.ceky[2] = 1869732988;
        dz.ceky[3] = -2114652978;
        dz.ceky[4] = 1263102090;
        dz.ceky[5] = -2104407177;
        dz.ceky[6] = 639031884;
        dz.ceky[7] = 995588429;
        dz.ceky[8] = -1323297587;
        dz.ceky[9] = 326478796;
        dz.ceky[10] = -39337956;
        dz.ceky[11] = -52744289;
        dz.ceky[12] = -1358450025;
        dz.ceky[13] = 1519208396;
        dz.ceky[14] = 1646642749;
        dz.ceky[15] = -1332853669;
        dz.ceky[16] = 564787123;
        dz.ceky[17] = 903413107;
        dz.ceky[18] = -491130246;
        dz.ceky[19] = -1592947045;
        dz.ceky[20] = 1676742461;
        dz.ceky[21] = 323252394;
        dz.ceky[22] = 1617997414;
        dz.ceky[23] = 16755156;
        dz.ceky[24] = -478462165;
        dz.ceky[25] = -2050253358;
        dz.ceky[26] = 277004179;
        dz.ceky[27] = -1535786506;
        dz.ceky[28] = -1748883379;
        dz.ceky[29] = -962853021;
        dz.ceky[30] = -1993129378;
        dz.ceky[31] = 1349561591;
        dz.ceky[32] = -1486515417;
        dz.ceky[33] = 1684420333;
        dz.ceky[34] = 1603497891;
        dz.ceky[35] = 1934623443;
        dz.ceky[36] = -1933479002;
        dz.ceky[37] = -150367241;
        dz.ceky[38] = 1997754483;
        dz.ceky[39] = -1533305488;
        dz.ceky[40] = 420697422;
        dz.ceky[41] = -992874546;
        dz.ceky[42] = -324540600;
        dz.ceky[43] = 408334165;
        dz.ceky[44] = -320016007;
        dz.ceky[45] = 362918723;
        dz.ceky[46] = 1809375932;
        dz.ceky[47] = -919022547;
        dz.ceky[48] = -1174419919;
        dz.ceky[49] = -572534104;
        dz.ceky[50] = -359403487;
        dz.ceky[51] = 801838982;
        dz.ceky[52] = 1882896106;
        dz.ceky[53] = -723965971;
        dz.ceky[54] = -1850047149;
        dz.ceky[55] = -900352627;
        dz.ceky[56] = 128191017;
        dz.ceky[57] = -1324636567;
        dz.ceky[58] = 31822935;
        dz.ceky[59] = 1256110650;
        dz.ceky[60] = 439088104;
        dz.ceky[61] = 715911683;
        dz.ceky[62] = -772840885;
        dz.ceky[63] = -1198589039;
        dz.ceky[64] = 1364993937;
        dz.ceky[65] = 869621180;
        dz.ceky[66] = 1460398581;
        dz.ceky[67] = -2052603814;
        dz.ceky[68] = -336378790;
        dz.ceky[69] = -2082522280;
        dz.ceky[70] = 1054250694;
        dz.ceky[71] = -390553683;
        dz.ceky[72] = -236724510;
        dz.ceky[73] = -1157107235;
        dz.ceky[74] = -1124378693;
        dz.ceky[75] = -1807201155;
        dz.ceky[76] = 895120131;
        dz.ceky[77] = -1411486266;
        dz.ceky[78] = -1560874957;
        dz.ceky[79] = -868863966;
        dz.ceky[80] = -1097866996;
        dz.ceky[81] = -495782905;
        dz.ceky[82] = 1428793409;
        dz.ceky[83] = -1260646170;
        dz.ceky[84] = 192127225;
        dz.ceky[85] = -1567891783;
        dz.ceky[86] = 22392932;
        dz.ceky[87] = 1906461038;
        dz.ceky[88] = 1075092742;
        dz.ceky[89] = 126634966;
        dz.ceky[90] = 2108645890;
        dz.ceky[91] = -498991721;
        dz.ceky[92] = 520800041;
        dz.ceky[93] = -1977681657;
        dz.ceky[94] = 914719661;
        dz.ceky[95] = 491767404;
        dz.ceky[96] = -1950630974;
        dz.ceky[97] = 1380176384;
        dz.ceky[98] = 56539588;
        dz.ceky[99] = 863282412;
    }

    private static /* synthetic */ void cevn() {
        dz.cekh[0] = 662247913055376999L;
        dz.cekh[1] = 6635961390833817508L;
        dz.cekh[2] = -8981779300549546452L;
        dz.cekh[3] = -1627742930646376007L;
        dz.cekh[4] = 3096274185582904117L;
        dz.cekh[5] = 4852887292714726608L;
        dz.cekh[6] = -8485672275995594456L;
        dz.cekh[7] = 760063877157610362L;
        dz.cekh[8] = 8098096340282660511L;
        dz.cekh[9] = -2244728450150918728L;
        dz.cekh[10] = -8111531482170804664L;
        dz.cekh[11] = -8287824074321656633L;
        dz.cekh[12] = 9200617714434931466L;
        dz.cekh[13] = -6997406228246505958L;
        dz.cekh[14] = 3597336144585223964L;
        dz.cekh[15] = 8708344367765335516L;
        dz.cekh[16] = -3582822522925136547L;
        dz.cekh[17] = -4149063403873857125L;
        dz.cekh[18] = -4367015276418233218L;
        dz.cekh[19] = 7144792100162215266L;
        dz.cekh[20] = 5309334361342961812L;
        dz.cekh[21] = -2012975664070409235L;
        dz.cekh[22] = -458766217666265749L;
        dz.cekh[23] = 5593447357406515699L;
        dz.cekh[24] = 6430951430380226423L;
        dz.cekh[25] = -5333713054639936510L;
        dz.cekh[26] = -6404686562013366670L;
        dz.cekh[27] = -7852732521949604195L;
        dz.cekh[28] = -5019423699815142935L;
        dz.cekh[29] = 8383434275068682631L;
        dz.cekh[30] = -1300257176682675781L;
        dz.cekh[31] = -3161283471633484150L;
        dz.cekh[32] = -7447258740760959420L;
        dz.cekh[33] = -7738149921396935283L;
        dz.cekh[34] = -5315895701013034710L;
        dz.cekh[35] = 1377660662016376580L;
        dz.cekh[36] = 7180501233162226787L;
        dz.cekh[37] = -7329271834283667917L;
        dz.cekh[38] = -6629614945296878181L;
        dz.cekh[39] = 922535542554186344L;
        dz.cekh[40] = 370317686828195877L;
        dz.cekh[41] = 8989375203024058168L;
        dz.cekh[42] = 5082323738301346087L;
        dz.cekh[43] = 7356671747958611265L;
        dz.cekh[44] = 2736063768803381302L;
        dz.cekh[45] = 5780073014716176953L;
        dz.cekh[46] = 456984295428729274L;
        dz.cekh[47] = -8962469577753558453L;
        dz.cekh[48] = -5684426427201289348L;
        dz.cekh[49] = 3993257516053389049L;
        dz.cekh[50] = -3079188763463532211L;
        dz.cekh[51] = 2494493444600696548L;
        dz.cekh[52] = -8851397866423429767L;
        dz.cekh[53] = -7635280473959323203L;
        dz.cekh[54] = 3770601945564725263L;
        dz.cekh[55] = -3463449931559308920L;
        dz.cekh[56] = 3422888324957897891L;
        dz.cekh[57] = -2576718792610239790L;
        dz.cekh[58] = -8317938780208540940L;
        dz.cekh[59] = -4760658909464216014L;
        dz.cekh[60] = -2322551092977732163L;
        dz.cekh[61] = 3716916843828173518L;
        dz.cekh[62] = -3274313808337900616L;
        dz.cekh[63] = 2395770292755957780L;
        dz.cekh[64] = 2834622032888979711L;
        dz.cekh[65] = 6618879136874723195L;
        dz.cekh[66] = -4373158172002122017L;
        dz.cekh[67] = 4534377113324654621L;
        dz.cekh[68] = 7873918960987326608L;
        dz.cekh[69] = -3668961380313471290L;
        dz.cekh[70] = -7955178293985338363L;
        dz.cekh[71] = -7399867893307039586L;
        dz.cekh[72] = -2100411377969815203L;
        dz.cekh[73] = -1945228617367898348L;
        dz.cekh[74] = -8470822208942583112L;
        dz.cekh[75] = -7548528079061439063L;
        dz.cekh[76] = 4746449560652605207L;
        dz.cekh[77] = 7474594181714570703L;
        dz.cekh[78] = -2129301432459891929L;
        dz.cekh[79] = -5085072303093167869L;
        dz.cekh[80] = -9178406257015330550L;
        dz.cekh[81] = -5790549191979625336L;
        dz.cekh[82] = 6797175610283215608L;
        dz.cekh[83] = -6079165189514952128L;
        dz.cekh[84] = 2258981957490098604L;
        dz.cekh[85] = -7800801854349863003L;
        dz.cekh[86] = -5944056374481766825L;
        dz.cekh[87] = -9118480961125820287L;
        dz.cekh[88] = 3592127779127452228L;
        dz.cekh[89] = -1336441560292618105L;
        dz.cekh[90] = -2727700994495535912L;
        dz.cekh[91] = -4223525757111170034L;
        dz.cekh[92] = 8552346071206416094L;
        dz.cekh[93] = 148059920063561898L;
        dz.cekh[94] = 3162617891272075304L;
        dz.cekh[95] = -8247492189228768424L;
        dz.cekh[96] = -2437838020613456855L;
        dz.cekh[97] = 6228575262308947612L;
        dz.cekh[98] = -2714960931384077044L;
        dz.cekh[99] = 3142806274508431462L;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static int panelTint(int var0) {
        block48: {
            v0 /* !! */  = dz.fn;
            block24: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1799710497: {
                        break block24;
                    }
                    case -1254973107: {
                        v0 /* !! */  = (long)(dz.cekj("cesr", cekg(int ), (int)83) - dz.cekj("cesq", cekg(int ), (int)82));
                        continue block24;
                    }
                }
                break;
            }
            var3_1 = dz.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = dz.fn - dz.cekj("cess", cekg(int ), (int)84)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == dz.cekj("cest", cekx(int ), (int)128)) break;
                v1 /* !! */  = (long)dz.cekj("cesu", cekx(int ), (int)129);
            }
            var2_2 /* !! */  = dz.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = dz.fn - dz.cekj("cesv", cekg(int ), (int)85)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == dz.cekj("cesw", cekx(int ), (int)130)) {
                    var1_3 = dz.a;
                    if (var3_1) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)dz.cekj("cesx", cekx(int ), (int)131);
            }
            if (var1_3 || var1_3) return (int)dz.cekj("cesy", cekx(int ), (int)132);
            while (true) {
                block49: {
                    if ((v3 /* !! */  = (cfr_temp_3 = dz.fn - dz.cekj("cesz", cekg(int ), (int)86)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  != dz.cekj("ceta", cekx(int ), (int)133)) break block49;
                    if (dz.isLight()) {
                        break;
                    }
                    ** GOTO lbl53
                }
                v3 /* !! */  = (long)dz.cekj("cetb", cekx(int ), (int)134);
            }
            if (var1_3) return (int)dz.cekj("cesy", cekx(int ), (int)132);
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var2_2 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 = dz.cekj("cetc", cekx(int ), (int)135);
                        v5 = dz.cekj("cetd", cekx(int ), (int)136);
                        v6 = dz.cekj("cete", cekx(int ), (int)137);
                        v7 = dz.cekj("cetf", cekx(int ), (int)138);
                        while (true) {
                            if ((v8 /* !! */  = (cfr_temp_4 = dz.fn - dz.cekj("cetg", cekg(int ), (int)87)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v8 /* !! */  != dz.cekj("ceth", cekx(int ), (int)139)) ** GOTO lbl51
                            v9 = Math.min((int)v7, var0);
                            v10 /* !! */  = dz.fn;
                            if (true) ** GOTO lbl87
lbl51:
                            // 1 sources

                            v8 /* !! */  = (long)dz.cekj("ceti", cekx(int ), (int)140);
                        }
                    }
lbl53:
                    // 1 sources

                    if (var1_3 || var1_3) {
                        return (int)dz.cekj("cesy", cekx(int ), (int)132);
                    }
                    v11 /* !! */  = dz.fn;
                    if (true) ** GOTO lbl101
                    case 4: {
                        var2_2 /* !! */  = (int)dz.cekj("cett", cekx(int ), (int)145);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 3: {
                        var2_2 /* !! */  = (int)dz.cekj("cets", cekx(int ), (int)144);
                        cfr_temp_0 = 5;
                        if (var3_1) {
                            throw null;
                        }
                        break block48;
                    }
                    case 6: {
                        var2_2 /* !! */  = (int)dz.cekj("cetv", cekx(int ), (int)147);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 5: {
                        var2_2 /* !! */  = (int)dz.cekj("cetu", cekx(int ), (int)146);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 0: {
                        ** GOTO lbl81
                    }
                    case 7: {
                        var2_2 /* !! */  = (int)dz.cekj("cetw", cekx(int ), (int)148);
                        if (var3_1) {
                            throw null;
                        }
lbl81:
                        // 3 sources

                        var2_2 /* !! */  = (int)dz.cekj("cetp", cekx(int ), (int)141);
                        if (var3_1) {
                            throw null;
                        }
                        ** GOTO lbl112
                    }
                    block30: while (true) {
                        v10 /* !! */  = (long)(v12 - dz.cekj("cetj", cekg(int ), (int)88));
lbl87:
                        // 2 sources

                        switch ((int)v10 /* !! */ ) {
                            case -1799710497: {
                                break block30;
                            }
                            case -1447463593: {
                                v12 = dz.cekj("cetk", cekg(int ), (int)89);
                                continue block30;
                            }
                            case 2085480917: {
                                v12 = dz.cekj("cetl", cekg(int ), (int)90);
                                continue block30;
                            }
                        }
                        break;
                    }
                    v13 = nd.rgba((int)v4, (int)v5, (int)v6, v9);
                    if (!var3_1) return v13;
                    throw null;
                    block31: while (true) {
                        v11 /* !! */  = (long)(v14 - dz.cekj("cetm", cekg(int ), (int)91));
lbl101:
                        // 2 sources

                        switch ((int)v11 /* !! */ ) {
                            case -1799710497: {
                                break block31;
                            }
                            case 761296529: {
                                v14 = dz.cekj("cetn", cekg(int ), (int)92);
                                continue block31;
                            }
                            case 1942029966: {
                                v14 = dz.cekj("ceto", cekg(int ), (int)93);
                                continue block31;
                            }
                        }
                        break;
                    }
                    v13 = dz.color(var0);
                    return v13;
lbl112:
                    // 2 sources

                    case 1: {
                        var2_2 /* !! */  = (int)dz.cekj("cetq", cekx(int ), (int)142);
                        if (var3_1) {
                            throw null;
                        }
                    }
                    case 2: 
                }
                break;
            }
            ** GOTO lbl121
        }
        do {
            if (true) ** continue;
lbl121:
            // 2 sources

            var2_2 /* !! */  = (int)dz.cekj("cetr", cekx(int ), (int)143);
            cfr_temp_0 = 1;
        } while (!var3_1);
        throw null;
    }

    static {
        ceky = new int[180];
        cekz = new int[180];
        dz.cevj();
        dz.cevk();
        dz.cevl();
        dz.cevm();
        cekh = new long[101];
        ceki = new long[101];
        dz.cevn();
        dz.cekh[100] = 8311266997769477674L;
        dz.cevp();
        dz.ceki[100] = -6210798876315693028L;
        frameColor = FALLBACK = nd.rgba((int)dz.cekj("cevf", cekx(int ), (int)176), (int)dz.cekj("cevg", cekx(int ), (int)177), (int)dz.cekj("cevh", cekx(int ), (int)178), (int)dz.cekj("cevi", cekx(int ), (int)179));
    }

    private static /* synthetic */ float cepi(int n2) {
        return Float.intBitsToFloat(ceky[n2] ^ cekz[n2]);
    }

    private static /* synthetic */ long cekg(int n2) {
        return cekh[n2] ^ ceki[n2];
    }

    public static /* synthetic */ CallSite cekj(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    /*
     * Exception decompiling
     */
    private static int resolveColor() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 24[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static void beginFrame() {
        v0 /* !! */  = dz.fn;
        block33: while (true) {
            switch ((int)v0 /* !! */ ) {
                case -1799710497: {
                    break block33;
                }
                case 347702627: {
                    v0 /* !! */  = (long)(dz.cekj("cekl", cekg(int ), (int)1) - dz.cekj("cekk", cekg(int ), (int)0));
                    continue block33;
                }
            }
            break;
        }
        var2 = dz.c;
        v1 /* !! */  = dz.fn;
        block34: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -2115995228: {
                    v1 /* !! */  = (long)(dz.cekj("cekn", cekg(int ), (int)3) - dz.cekj("cekm", cekg(int ), (int)2));
                    continue block34;
                }
                case -1799710497: {
                    break block34;
                }
            }
            break;
        }
        var1_1 /* !! */  = dz.b;
        v2 /* !! */  = dz.fn;
        if (true) ** GOTO lbl23
        block35: while (true) {
            v2 /* !! */  = (long)(v3 - dz.cekj("ceko", cekg(int ), (int)4));
lbl23:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1799710497: {
                    break block35;
                }
                case -1485669479: {
                    v3 = dz.cekj("cekp", cekg(int ), (int)5);
                    continue block35;
                }
                case -1326474091: {
                    v3 = dz.cekj("cekq", cekg(int ), (int)6);
                    continue block35;
                }
            }
            break;
        }
        var0_2 = dz.a;
        if (var2) {
            throw null;
        }
        if (var0_2 || var0_2) return;
        if (var1_1 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block36: while (true) {
            block55: {
                switch (cfr_temp_0 == -2147483648 ? var1_1 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        v4 /* !! */  = dz.fn;
                        block37: while (true) {
                            switch ((int)v4 /* !! */ ) {
                                case -1799710497: {
                                    break block37;
                                }
                                case -1520493912: {
                                    v5 = dz.cekj("ceks", cekg(int ), (int)8);
                                    ** GOTO lbl54
                                }
                                case 993639874: {
                                    v5 = dz.cekj("cekt", cekg(int ), (int)9);
                                    ** GOTO lbl54
                                }
                                case 1235753933: {
                                    v5 = dz.cekj("ceku", cekg(int ), (int)10);
lbl54:
                                    // 3 sources

                                    v4 /* !! */  = (long)(v5 - dz.cekj("cekr", cekg(int ), (int)7));
                                    continue block37;
                                }
                            }
                            break;
                        }
                        v6 = dz.resolveColor();
                        v7 /* !! */  = dz.fn;
                        block38: while (true) {
                            switch ((int)v7 /* !! */ ) {
                                case -1799710497: {
                                    break block38;
                                }
                                case -1583721982: {
                                    v7 /* !! */  = (long)(dz.cekj("cekw", cekg(int ), (int)12) - dz.cekj("cekv", cekg(int ), (int)11));
                                    continue block38;
                                }
                            }
                            break;
                        }
                        dz.frameColor = v6;
                        if (var0_2 || var0_2) return;
                        v8 = dz.cekj("cela", cekx(int ), (int)0);
                        while (true) {
                            if ((v9 /* !! */  = (cfr_temp_1 = dz.fn - dz.cekj("celb", cekg(int ), (int)13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                                continue;
                            }
                            if (v9 /* !! */  == dz.cekj("celc", cekx(int ), (int)1)) {
                                dz.frameActive = v8;
                                if (var0_2) return;
                                break;
                            }
                            v9 /* !! */  = (long)dz.cekj("celd", cekx(int ), (int)2);
                        }
                        if (!var0_2) return;
                        return;
                    }
                    case 1: {
                        var1_1 /* !! */  = (int)dz.cekj("celf", cekx(int ), (int)4);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var1_1 /* !! */  = (int)dz.cekj("celh", cekx(int ), (int)6);
                        cfr_temp_0 = 6;
                        if (var2) {
                            throw null;
                        }
                        break block55;
                    }
                    case 4: {
                        ** GOTO lbl95
                    }
                    case 7: {
                        var1_1 /* !! */  = (int)dz.cekj("cell", cekx(int ), (int)10);
                        if (var2) {
                            throw null;
                        }
lbl95:
                        // 3 sources

                        var1_1 /* !! */  = (int)dz.cekj("celi", cekx(int ), (int)7);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 5: {
                        do {
                            var1_1 /* !! */  = (int)dz.cekj("celj", cekx(int ), (int)8);
                        } while (!var2);
                        throw null;
                    }
                    case 0: {
                        var1_1 /* !! */  = (int)dz.cekj("cele", cekx(int ), (int)3);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 2: {
                        var1_1 /* !! */  = (int)dz.cekj("celg", cekx(int ), (int)5);
                        if (var2) {
                            throw null;
                        }
                    }
                    case 6: 
                }
                ** GOTO lbl116
            }
            do {
                if (true) continue block36;
lbl116:
                // 2 sources

                var1_1 /* !! */  = (int)dz.cekj("celk", cekx(int ), (int)9);
                cfr_temp_0 = 0;
            } while (!var2);
            break;
        }
        throw null;
    }

    private dz() {
    }
}


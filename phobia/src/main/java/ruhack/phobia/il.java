/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import ruhack.phobia.c;
import ruhack.phobia.im;

public class il
implements c {
    private static final long az = 7411389171700255077L;
    public static final boolean c;
    public static final boolean a;
    private static long[] rmq;
    public static final int b;
    private static int[] rmv;
    private static long[] rmr;
    private static int[] rmw;

    private static /* synthetic */ void rqw() {
        il.rmv[0] = -545360510;
        il.rmv[1] = 230951075;
        il.rmv[2] = -971102511;
        il.rmv[3] = 243917104;
        il.rmv[4] = 442757151;
        il.rmv[5] = -365921607;
        il.rmv[6] = 1589138011;
        il.rmv[7] = 1262085420;
        il.rmv[8] = -1432872056;
        il.rmv[9] = 2084500431;
        il.rmv[10] = 1258823538;
        il.rmv[11] = 885994712;
        il.rmv[12] = -1364593661;
        il.rmv[13] = 268397353;
        il.rmv[14] = -759950964;
        il.rmv[15] = -1563704718;
        il.rmv[16] = 1376308026;
        il.rmv[17] = -662887296;
        il.rmv[18] = -1092844207;
        il.rmv[19] = 1156438501;
        il.rmv[20] = -998920859;
        il.rmv[21] = 1938814069;
        il.rmv[22] = -1451020621;
        il.rmv[23] = 1091989667;
        il.rmv[24] = 96833256;
        il.rmv[25] = -1042305508;
        il.rmv[26] = -221082143;
        il.rmv[27] = -1621893715;
        il.rmv[28] = 284322747;
        il.rmv[29] = -1565165793;
        il.rmv[30] = 212131426;
        il.rmv[31] = 580528156;
        il.rmv[32] = 1379087092;
        il.rmv[33] = -1877973842;
        il.rmv[34] = -67144348;
        il.rmv[35] = 436187272;
        il.rmv[36] = -2081627431;
        il.rmv[37] = 1495721848;
        il.rmv[38] = -2007496849;
        il.rmv[39] = -1485974800;
        il.rmv[40] = -1811197860;
        il.rmv[41] = 620067413;
        il.rmv[42] = 196383330;
        il.rmv[43] = 1629302267;
        il.rmv[44] = -2099992229;
        il.rmv[45] = 1035778393;
        il.rmv[46] = 1805217810;
        il.rmv[47] = 912983696;
        il.rmv[48] = -2088861025;
        il.rmv[49] = -951756669;
        il.rmv[50] = 54841815;
        il.rmv[51] = 1557274310;
        il.rmv[52] = 679066551;
        il.rmv[53] = -1134454424;
        il.rmv[54] = -1956537314;
        il.rmv[55] = 570913872;
        il.rmv[56] = -1377416521;
        il.rmv[57] = 2091247645;
    }

    private static /* synthetic */ long rmp(int n2) {
        return rmq[n2] ^ rmr[n2];
    }

    public il() {
    }

    private static /* synthetic */ int rmu(int n2) {
        return rmv[n2] ^ rmw[n2];
    }

    private static /* synthetic */ void rqx() {
        il.rmw[0] = -545360509;
        il.rmw[1] = 2058263686;
        il.rmw[2] = -971102512;
        il.rmw[3] = -630042194;
        il.rmw[4] = 442757150;
        il.rmw[5] = -1958817515;
        il.rmw[6] = 507007579;
        il.rmw[7] = 1262085422;
        il.rmw[8] = -1432872053;
        il.rmw[9] = 2084500428;
        il.rmw[10] = 1258823538;
        il.rmw[11] = 885994715;
        il.rmw[12] = -1364593663;
        il.rmw[13] = 268397352;
        il.rmw[14] = 584696833;
        il.rmw[15] = -1563704717;
        il.rmw[16] = -55129196;
        il.rmw[17] = -662887295;
        il.rmw[18] = -185517546;
        il.rmw[19] = 1156438497;
        il.rmw[20] = -998920863;
        il.rmw[21] = 1938814071;
        il.rmw[22] = -1451020618;
        il.rmw[23] = 1091989665;
        il.rmw[24] = 96833257;
        il.rmw[25] = -1042305507;
        il.rmw[26] = 74463843;
        il.rmw[27] = -1621893716;
        il.rmw[28] = 610736600;
        il.rmw[29] = -1565165794;
        il.rmw[30] = 357828827;
        il.rmw[31] = 580528153;
        il.rmw[32] = 1379087094;
        il.rmw[33] = -1877973841;
        il.rmw[34] = -67144346;
        il.rmw[35] = 436187277;
        il.rmw[36] = -2081627431;
        il.rmw[37] = 1495721779;
        il.rmw[38] = -870185105;
        il.rmw[39] = -1485974797;
        il.rmw[40] = -1811197858;
        il.rmw[41] = 620067415;
        il.rmw[42] = 196383330;
        il.rmw[43] = 1629302267;
        il.rmw[44] = -2099992229;
        il.rmw[45] = 1035778392;
        il.rmw[46] = -1312461040;
        il.rmw[47] = 912983697;
        il.rmw[48] = -2040385539;
        il.rmw[49] = -2029692797;
        il.rmw[50] = 54841814;
        il.rmw[51] = -2089120368;
        il.rmw[52] = 679066548;
        il.rmw[53] = -1134454422;
        il.rmw[54] = -1956537313;
        il.rmw[55] = 570913877;
        il.rmw[56] = -1377416521;
        il.rmw[57] = 2091247647;
    }

    private static /* synthetic */ void rqz() {
        il.rmr[0] = -8618130027932844037L;
        il.rmr[1] = 8591886851430006093L;
        il.rmr[2] = -390460457772984111L;
        il.rmr[3] = -4164180655212004882L;
        il.rmr[4] = -6186070520945234494L;
        il.rmr[5] = -6509974947775729124L;
        il.rmr[6] = 4340239553875386523L;
        il.rmr[7] = 2005316704728106435L;
        il.rmr[8] = -8065041492869327794L;
        il.rmr[9] = -3881575512004039491L;
        il.rmr[10] = -9086715375120109900L;
        il.rmr[11] = -3055436393360528824L;
        il.rmr[12] = -6936450186296995966L;
        il.rmr[13] = 2758442097549524041L;
        il.rmr[14] = 202786385355514916L;
        il.rmr[15] = 5847704145989400194L;
        il.rmr[16] = -7666910914178271462L;
        il.rmr[17] = 2227173215226602324L;
        il.rmr[18] = -1386543040843523434L;
        il.rmr[19] = -6516671502754974446L;
        il.rmr[20] = 7770998954705186392L;
        il.rmr[21] = -771154541240438081L;
        il.rmr[22] = -5732818478144331655L;
        il.rmr[23] = -1492905951008976286L;
        il.rmr[24] = -7146730501174817418L;
        il.rmr[25] = 5268950845315948306L;
        il.rmr[26] = -3339566018274497460L;
        il.rmr[27] = -357737150300840025L;
        il.rmr[28] = 399402970168129548L;
        il.rmr[29] = 3447874021466052580L;
        il.rmr[30] = 5425191285201386258L;
        il.rmr[31] = 542330216883374498L;
        il.rmr[32] = 5801294301706895118L;
        il.rmr[33] = -2301938082717495845L;
        il.rmr[34] = 8937087077027530187L;
        il.rmr[35] = 5075439097174972442L;
        il.rmr[36] = 6775308763925294441L;
        il.rmr[37] = 3158182792609338847L;
        il.rmr[38] = -3414714582823495292L;
        il.rmr[39] = 2801559153416505660L;
        il.rmr[40] = -8628420124280270012L;
        il.rmr[41] = -7735365861850315439L;
        il.rmr[42] = -4133783644106311723L;
        il.rmr[43] = 4520991551351840248L;
        il.rmr[44] = -2716588934268775285L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 mincedPoint(class_1297 var0) {
        v0 /* !! */  = il.az;
        if (true) ** GOTO lbl5
        block29: while (true) {
            v0 /* !! */  = (long)(v1 - il.rms("rnr", rmp(int ), (int)7));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1308839906: {
                    v1 = il.rms("rns", rmp(int ), (int)8);
                    continue block29;
                }
                case -1113871897: {
                    v1 = il.rms("rnt", rmp(int ), (int)9);
                    continue block29;
                }
                case 928958821: {
                    break block29;
                }
            }
            break;
        }
        var4_1 = il.c;
        v2 /* !! */  = il.az;
        if (true) ** GOTO lbl19
        block30: while (true) {
            v2 /* !! */  = (long)(v3 - il.rms("rnu", rmp(int ), (int)10));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1941109523: {
                    v3 = il.rms("rnv", rmp(int ), (int)11);
                    continue block30;
                }
                case -1239295221: {
                    v3 = il.rms("rnw", rmp(int ), (int)12);
                    continue block30;
                }
                case 928958821: {
                    break block30;
                }
            }
            break;
        }
        var3_2 /* !! */  = il.b;
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_0 = il.az - il.rms("rnx", rmp(int ), (int)13)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == il.rms("rny", rmu(int ), (int)13)) break;
            v4 /* !! */  = (long)il.rms("rnz", rmu(int ), (int)14);
        }
        var2_3 = il.a;
        if (!var4_1) ** GOTO lbl41
        throw null;
lbl-1000:
        // 2 sources

        {
            if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var3_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return null;
                }
lbl41:
                // 1 sources

                if (var2_3 || var2_3) ** GOTO lbl-1000
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_1 = il.az - il.rms("roa", rmp(int ), (int)14)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == il.rms("rob", rmu(int ), (int)15)) break;
                    v5 /* !! */  = (long)il.rms("roc", rmu(int ), (int)16);
                }
                v6 /* !! */  = il.az;
                if (true) ** GOTO lbl51
                block34: while (true) {
                    v6 /* !! */  = (long)(v7 - il.rms("rod", rmp(int ), (int)15));
lbl51:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -599736358: {
                            v7 = il.rms("roe", rmp(int ), (int)16);
                            continue block34;
                        }
                        case -94916363: {
                            v7 = il.rms("rof", rmp(int ), (int)17);
                            continue block34;
                        }
                        case 928958821: {
                            break block34;
                        }
                    }
                    break;
                }
                v8 = il.mc.field_1724;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_2 = il.az - il.rms("rog", rmp(int ), (int)18)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == il.rms("roh", rmu(int ), (int)17)) break;
                    v9 /* !! */  = (long)il.rms("roi", rmu(int ), (int)18);
                }
                v10 = v8.method_33571();
                v11 /* !! */  = il.az;
                if (true) ** GOTO lbl71
                block36: while (true) {
                    v11 /* !! */  = (long)(v12 - il.rms("roj", rmp(int ), (int)19));
lbl71:
                    // 2 sources

                    switch ((int)v11 /* !! */ ) {
                        case -1211610652: {
                            v12 = il.rms("rok", rmp(int ), (int)20);
                            continue block36;
                        }
                        case -799874093: {
                            v12 = il.rms("rol", rmp(int ), (int)21);
                            continue block36;
                        }
                        case -105922657: {
                            v12 = il.rms("rom", rmp(int ), (int)22);
                            continue block36;
                        }
                        case 928958821: {
                            break block36;
                        }
                    }
                    break;
                }
                var1_4 = im.getBestPoint(v10, var0);
                if (var2_3 || var2_3) continue block32;
                return var1_4;
lbl86:
                // 2 sources

                case 0: {
                    var3_2 /* !! */  = (int)il.rms("ron", rmu(int ), (int)19);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl100
                }
                case 1: {
                    var3_2 /* !! */  = (int)il.rms("roo", rmu(int ), (int)20);
                    if (!var4_1) break block32;
                    throw null;
                }
                case 2: {
                    var3_2 /* !! */  = (int)il.rms("rop", rmu(int ), (int)21);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl104
                }
lbl100:
                // 3 sources

                case 3: {
                    var3_2 /* !! */  = (int)il.rms("roq", rmu(int ), (int)22);
                    if (!var4_1) ** GOTO lbl86
                    throw null;
                }
lbl104:
                // 2 sources

                case 4: {
                    var3_2 /* !! */  = (int)il.rms("ror", rmu(int ), (int)23);
                    if (!var4_1) ** GOTO lbl100
                    throw null;
                }
                case 5: 
            }
        }
        do {
            var3_2 /* !! */  = (int)il.rms("ros", rmu(int ), (int)24);
        } while (!var4_1);
        throw null;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_243 randomPoint(class_1297 var0) {
        v0 /* !! */  = il.az;
        block26: while (true) {
            switch ((int)v0 /* !! */ ) {
                case 928958821: {
                    break block26;
                }
                case 1943630241: {
                    v0 /* !! */  = (long)(il.rms("rpl", rmp(int ), (int)29) - il.rms("rpk", rmp(int ), (int)28));
                    continue block26;
                }
            }
            break;
        }
        var4_1 = il.c;
        v1 /* !! */  = il.az;
        block27: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -1884001107: {
                    v1 /* !! */  = (long)(il.rms("rpn", rmp(int ), (int)31) - il.rms("rpm", rmp(int ), (int)30));
                    continue block27;
                }
                case 928958821: {
                    break block27;
                }
            }
            break;
        }
        var3_2 /* !! */  = il.b;
        v2 /* !! */  = il.az;
        if (true) ** GOTO lbl23
        block28: while (true) {
            v2 /* !! */  = (long)(v3 - il.rms("rpo", rmp(int ), (int)32));
lbl23:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1890891008: {
                    v3 = il.rms("rpp", rmp(int ), (int)33);
                    continue block28;
                }
                case 928958821: {
                    break block28;
                }
                case 1222312450: {
                    v3 = il.rms("rpq", rmp(int ), (int)34);
                    continue block28;
                }
                case 1373487565: {
                    v3 = il.rms("rpr", rmp(int ), (int)35);
                    continue block28;
                }
            }
            break;
        }
        var2_3 = il.a;
        if (var4_1) {
            throw null;
        }
        if (var2_3 || var2_3) ** GOTO lbl56
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        cfr_temp_0 = -2147483648;
        block29: do {
            switch (cfr_temp_0 == -2147483648 ? var3_2 /* !! */  : cfr_temp_0) {
                default: lbl-1000:
                // 2 sources

                {
                    v4 = il.rms("rps", rmu(int ), (int)37);
                    v5 = il.rms("rpt", rnf(int ), (int)38);
                    v6 /* !! */  = il.az;
                    block30: while (true) {
                        switch ((int)v6 /* !! */ ) {
                            case 928958821: {
                                break block30;
                            }
                            case 2041232426: {
                                v6 /* !! */  = (long)(il.rms("rpv", rmp(int ), (int)37) - il.rms("rpu", rmp(int ), (int)36));
                                continue block30;
                            }
                        }
                        break;
                    }
                    var1_4 = im.custom(var0, (int)v4, (float)v5);
                    if (!var2_3 && !var2_3) ** GOTO lbl57
lbl56:
                    // 2 sources

                    return null;
lbl57:
                    // 1 sources

                    return var1_4;
                }
                case 2: {
                    var3_2 /* !! */  = (int)il.rms("rpy", rmu(int ), (int)41);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 1: {
                    var3_2 /* !! */  = (int)il.rms("rpx", rmu(int ), (int)40);
                    cfr_temp_0 = 4;
                    if (!var4_1) continue block29;
                    throw null;
                }
                case 3: {
                    ** GOTO lbl73
                }
                case 5: {
                    var3_2 /* !! */  = (int)il.rms("rqb", rmu(int ), (int)44);
                    if (var4_1) {
                        throw null;
                    }
lbl73:
                    // 3 sources

                    var3_2 /* !! */  = (int)il.rms("rpz", rmu(int ), (int)42);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 4: {
                    var3_2 /* !! */  = (int)il.rms("rqa", rmu(int ), (int)43);
                    if (var4_1) {
                        throw null;
                    }
                }
                case 0: 
            }
            break;
        } while (true);
        do {
            var3_2 /* !! */  = (int)il.rms("rpw", rmu(int ), (int)39);
        } while (!var4_1);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 expensivePoint(class_1297 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = il.az - il.rms("rqc", rmp(int ), (int)38)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == il.rms("rqd", rmu(int ), (int)45)) break;
            v0 /* !! */  = (long)il.rms("rqe", rmu(int ), (int)46);
        }
        var4_1 = il.c;
        v1 /* !! */  = il.az;
        if (true) ** GOTO lbl12
        block15: while (true) {
            v1 /* !! */  = (long)(v2 - il.rms("rqf", rmp(int ), (int)39));
lbl12:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -913878268: {
                    v2 = il.rms("rqg", rmp(int ), (int)40);
                    continue block15;
                }
                case -846288313: {
                    v2 = il.rms("rqh", rmp(int ), (int)41);
                    continue block15;
                }
                case 928958821: {
                    break block15;
                }
                case 1320466088: {
                    v2 = il.rms("rqi", rmp(int ), (int)42);
                    continue block15;
                }
            }
            break;
        }
        var3_2 /* !! */  = il.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = il.az - il.rms("rqj", rmp(int ), (int)43)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v3 /* !! */  == il.rms("rqk", rmu(int ), (int)47)) break;
            v3 /* !! */  = (long)il.rms("rql", rmu(int ), (int)48);
        }
        var2_3 = il.a;
        if (var4_1) {
            throw null;
lbl34:
            // 3 sources

            return null;
        }
        if (var2_3) ** GOTO lbl34
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) ** GOTO lbl34
                v4 = il.rms("rqm", rnf(int ), (int)49);
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_2 = il.az - il.rms("rqn", rmp(int ), (int)44)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v5 /* !! */  == il.rms("rqo", rmu(int ), (int)50)) break;
                    v5 /* !! */  = (long)il.rms("rqp", rmu(int ), (int)51);
                }
                var1_4 = im.brain(var0, 2.0f, (float)v4);
                if (!var2_3 && !var2_3) ** break;
                ** continue;
                return var1_4;
            }
            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)il.rms("rqq", rmu(int ), (int)52);
                    if (var4_1) {
                        throw null;
                    }
                    ** GOTO lbl68
                    break;
                }
            }
            case 1: {
                var3_2 /* !! */  = (int)il.rms("rqr", rmu(int ), (int)53);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
            case 2: {
                var3_2 /* !! */  = (int)il.rms("rqs", rmu(int ), (int)54);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl72
            }
lbl68:
            // 3 sources

            case 3: {
                var3_2 /* !! */  = (int)il.rms("rqt", rmu(int ), (int)55);
                if (var4_1) {
                    throw null;
                }
            }
lbl72:
            // 5 sources

            case 4: {
                var3_2 /* !! */  = (int)il.rms("rqu", rmu(int ), (int)56);
                if (!var4_1) ** GOTO lbl68
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)il.rms("rqv", rmu(int ), (int)57);
        ** while (!var4_1)
lbl79:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void rqy() {
        il.rmq[0] = 8179623558158181946L;
        il.rmq[1] = -3372911482188172464L;
        il.rmq[2] = 5993150101764368344L;
        il.rmq[3] = -3262336110553560858L;
        il.rmq[4] = 7752936684962571244L;
        il.rmq[5] = -6771394309023066247L;
        il.rmq[6] = 4756744528095097448L;
        il.rmq[7] = 1199834960144138847L;
        il.rmq[8] = 484639924906733184L;
        il.rmq[9] = -443736821423324261L;
        il.rmq[10] = 5182524689501432923L;
        il.rmq[11] = 3031392304426729377L;
        il.rmq[12] = 7651101612803505057L;
        il.rmq[13] = -2859476897239215719L;
        il.rmq[14] = 6053191662160196806L;
        il.rmq[15] = -7865788687576481523L;
        il.rmq[16] = -8597861600677725417L;
        il.rmq[17] = -1523084277745952867L;
        il.rmq[18] = 2602121132401964887L;
        il.rmq[19] = 5651053521505120795L;
        il.rmq[20] = -8542333756259440480L;
        il.rmq[21] = 4575930097753903252L;
        il.rmq[22] = -6631474150565121714L;
        il.rmq[23] = -6763912448653085750L;
        il.rmq[24] = -2973925518923541780L;
        il.rmq[25] = 5583759083057755140L;
        il.rmq[26] = 7427496449420890856L;
        il.rmq[27] = -1999671530708488128L;
        il.rmq[28] = -1161423366968684875L;
        il.rmq[29] = 2271355685639311402L;
        il.rmq[30] = -1637379104291261354L;
        il.rmq[31] = -5905268481294742209L;
        il.rmq[32] = -8596825556766718139L;
        il.rmq[33] = 5909343703500850351L;
        il.rmq[34] = -3971798760565355073L;
        il.rmq[35] = -6975181693303299633L;
        il.rmq[36] = -6416823422141574920L;
        il.rmq[37] = 8416065730809669742L;
        il.rmq[38] = 799409974160485578L;
        il.rmq[39] = 2452126390235437546L;
        il.rmq[40] = 1894593215790269407L;
        il.rmq[41] = 2918963393409783257L;
        il.rmq[42] = 1745248239756695720L;
        il.rmq[43] = -3498130737336312351L;
        il.rmq[44] = -8875642711259523696L;
    }

    static {
        rmv = new int[58];
        rmw = new int[58];
        il.rqw();
        il.rqx();
        rmq = new long[45];
        rmr = new long[45];
        il.rqy();
        il.rqz();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static class_243 expensiveUpgradePoint(class_1297 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = il.az - il.rms("rmt", rmp(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v0 /* !! */  == il.rms("rmx", rmu(int ), (int)0)) break;
            v0 /* !! */  = (long)il.rms("rmy", rmu(int ), (int)1);
        }
        var4_1 = il.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = il.az - il.rms("rmz", rmp(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v1 /* !! */  == il.rms("rna", rmu(int ), (int)2)) break;
            v1 /* !! */  = (long)il.rms("rnb", rmu(int ), (int)3);
        }
        var3_2 /* !! */  = il.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = il.az - il.rms("rnc", rmp(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == il.rms("rnd", rmu(int ), (int)4)) break;
            v2 /* !! */  = (long)il.rms("rne", rmu(int ), (int)5);
        }
        var2_3 = il.a;
        if (var4_1) {
            throw null;
lbl24:
            // 2 sources

            return null;
        }
        if (var2_3 || var2_3) ** GOTO lbl24
        v3 = il.rms("rng", rnf(int ), (int)6);
        v4 /* !! */  = il.az;
        if (true) ** GOTO lbl32
        block18: while (true) {
            v4 /* !! */  = (long)(v5 - il.rms("rnh", rmp(int ), (int)3));
lbl32:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case 796265192: {
                    v5 = il.rms("rni", rmp(int ), (int)4);
                    continue block18;
                }
                case 928958821: {
                    break block18;
                }
                case 1291114770: {
                    v5 = il.rms("rnj", rmp(int ), (int)5);
                    continue block18;
                }
                case 1624747059: {
                    v5 = il.rms("rnk", rmp(int ), (int)6);
                    continue block18;
                }
            }
            break;
        }
        var1_4 = im.hitbox(var0, 1.0f, 1.0f, 1.0f, (float)v3);
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        block6 : switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3 || var2_3) ** continue;
                return var1_4;
            }
            case 0: {
                var3_2 /* !! */  = (int)il.rms("rnl", rmu(int ), (int)7);
                if (var4_1) {
                    throw null;
                }
                ** GOTO lbl64
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_2 /* !! */  = (int)il.rms("rnm", rmu(int ), (int)8);
                    if (!var4_1) break block6;
                    throw null;
                }
            }
            case 2: {
                var3_2 /* !! */  = (int)il.rms("rnn", rmu(int ), (int)9);
                if (!var4_1) break;
                throw null;
            }
lbl64:
            // 2 sources

            case 3: {
                var3_2 /* !! */  = (int)il.rms("rno", rmu(int ), (int)10);
                if (var4_1) {
                    throw null;
                }
            }
            case 4: {
                do {
                    var3_2 /* !! */  = (int)il.rms("rnp", rmu(int ), (int)11);
                } while (!var4_1);
                throw null;
            }
            case 5: 
        }
        var3_2 /* !! */  = (int)il.rms("rnq", rmu(int ), (int)12);
        ** while (!var4_1)
lbl76:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ float rnf(int n2) {
        return Float.intBitsToFloat(rmv[n2] ^ rmw[n2]);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static class_243 celestialPoint(class_1297 var0) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = il.az - il.rms("rot", rmp(int ), (int)23)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == il.rms("rou", rmu(int ), (int)25)) break;
            v0 /* !! */  = (long)il.rms("rov", rmu(int ), (int)26);
        }
        var4_1 = il.c;
        v1 /* !! */  = il.az;
        block13: while (true) {
            switch ((int)v1 /* !! */ ) {
                case -768977909: {
                    v1 /* !! */  = (long)(il.rms("rox", rmp(int ), (int)25) - il.rms("row", rmp(int ), (int)24));
                    continue block13;
                }
                case 928958821: {
                    break block13;
                }
            }
            break;
        }
        var3_2 /* !! */  = il.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_1 = il.az - il.rms("roy", rmp(int ), (int)26)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == il.rms("roz", rmu(int ), (int)27)) {
                var2_3 = il.a;
                if (var4_1) {
                    throw null;
                }
                break;
            }
            v2 /* !! */  = (long)il.rms("rpa", rmu(int ), (int)28);
        }
        if (var2_3) return null;
        if (var3_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_3) return null;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = il.az - il.rms("rpb", rmp(int ), (int)27)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == il.rms("rpc", rmu(int ), (int)29)) {
                        var1_4 = im.closest(var0);
                        if (var2_3) return null;
                        break;
                    }
                    v3 /* !! */  = (long)il.rms("rpd", rmu(int ), (int)30);
                }
                if (!var2_3) return var1_4;
                return null;
            }
            case 0: {
                do {
                    var3_2 /* !! */  = (int)il.rms("rpe", rmu(int ), (int)31);
                } while (!var4_1);
                throw null;
            }
            case 1: {
                do {
                    var3_2 /* !! */  = (int)il.rms("rpf", rmu(int ), (int)32);
                } while (!var4_1);
                throw null;
            }
            case 3: {
                ** GOTO lbl56
            }
            case 5: {
                var3_2 /* !! */  = (int)il.rms("rpj", rmu(int ), (int)36);
                if (var4_1) {
                    throw null;
                }
lbl56:
                // 3 sources

                var3_2 /* !! */  = (int)il.rms("rph", rmu(int ), (int)34);
                if (var4_1) {
                    throw null;
                }
            }
            case 4: {
                var3_2 /* !! */  = (int)il.rms("rpi", rmu(int ), (int)35);
                if (var4_1) {
                    throw null;
                }
            }
            case 2: 
        }
        do {
            var3_2 /* !! */  = (int)il.rms("rpg", rmu(int ), (int)33);
        } while (!var4_1);
        throw null;
    }

    public static /* synthetic */ CallSite rms(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }
}


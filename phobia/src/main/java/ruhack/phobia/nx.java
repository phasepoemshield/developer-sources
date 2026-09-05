/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1041
 *  net.minecraft.class_304
 *  net.minecraft.class_310
 *  net.minecraft.class_3675
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_1041;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3675;

public class nx {
    private boolean jump;
    private static final class_310 mc;
    private static long[] lcvu;
    public static final boolean a;
    private boolean saved;
    private boolean forward;
    static final long tt = -4489895500347915880L;
    private static int[] lcve;
    private static int[] lcvc;
    public static final boolean c;
    private boolean blocked;
    private static long[] lcvv;
    private boolean back;
    public static final int b;
    private boolean left;
    private boolean sprint;
    private boolean right;

    private static /* synthetic */ void lggt() {
        nx.lcve[0] = -1970783113;
        nx.lcve[1] = 2077296350;
        nx.lcve[2] = 452665964;
        nx.lcve[3] = -96933980;
        nx.lcve[4] = 1838705229;
        nx.lcve[5] = 822399759;
        nx.lcve[6] = -1935977418;
        nx.lcve[7] = -518545962;
        nx.lcve[8] = 1357612641;
        nx.lcve[9] = -232677359;
        nx.lcve[10] = -1739721090;
        nx.lcve[11] = 323454065;
        nx.lcve[12] = -1828383156;
        nx.lcve[13] = 1710901376;
        nx.lcve[14] = -1804993681;
        nx.lcve[15] = 2019928550;
        nx.lcve[16] = -1878591114;
        nx.lcve[17] = 1090159879;
        nx.lcve[18] = -2067014279;
        nx.lcve[19] = 654189879;
        nx.lcve[20] = -757263614;
        nx.lcve[21] = -518831468;
        nx.lcve[22] = 1626393384;
        nx.lcve[23] = -1198742070;
        nx.lcve[24] = -115635035;
        nx.lcve[25] = 840335325;
        nx.lcve[26] = 707792177;
        nx.lcve[27] = -593009247;
        nx.lcve[28] = -1545234145;
        nx.lcve[29] = 50091339;
        nx.lcve[30] = 1265814967;
        nx.lcve[31] = 1831984776;
        nx.lcve[32] = 779040598;
        nx.lcve[33] = 1566630523;
        nx.lcve[34] = 763962390;
        nx.lcve[35] = -441079349;
        nx.lcve[36] = 2120629623;
        nx.lcve[37] = -1904464997;
        nx.lcve[38] = 981700503;
        nx.lcve[39] = 770430626;
        nx.lcve[40] = -2049875635;
        nx.lcve[41] = -694051718;
        nx.lcve[42] = 634309292;
        nx.lcve[43] = -384531039;
        nx.lcve[44] = 1738962560;
        nx.lcve[45] = -1787991215;
        nx.lcve[46] = 1999160147;
        nx.lcve[47] = 350244532;
        nx.lcve[48] = -2012924396;
        nx.lcve[49] = -759327694;
        nx.lcve[50] = -1403588995;
        nx.lcve[51] = 642175443;
        nx.lcve[52] = -1731620564;
        nx.lcve[53] = -43076740;
        nx.lcve[54] = 1005958045;
        nx.lcve[55] = 1203847785;
        nx.lcve[56] = -1319159040;
        nx.lcve[57] = -791180684;
        nx.lcve[58] = -906679544;
        nx.lcve[59] = -866359794;
        nx.lcve[60] = 545958717;
        nx.lcve[61] = -1533559238;
        nx.lcve[62] = 337349165;
        nx.lcve[63] = 705150015;
        nx.lcve[64] = -380522769;
        nx.lcve[65] = 864225010;
        nx.lcve[66] = 1440477390;
        nx.lcve[67] = -1369130054;
        nx.lcve[68] = -226146779;
        nx.lcve[69] = 543945674;
        nx.lcve[70] = 712472236;
        nx.lcve[71] = 857301021;
        nx.lcve[72] = -1000781118;
        nx.lcve[73] = 1309371853;
        nx.lcve[74] = -1630588780;
        nx.lcve[75] = 485904108;
        nx.lcve[76] = 617236632;
        nx.lcve[77] = -1360619693;
        nx.lcve[78] = 1778915389;
        nx.lcve[79] = 837053268;
        nx.lcve[80] = -739324372;
        nx.lcve[81] = 560839350;
        nx.lcve[82] = 801699801;
        nx.lcve[83] = -1017882436;
        nx.lcve[84] = -899297227;
        nx.lcve[85] = -1984907104;
        nx.lcve[86] = -1352455914;
        nx.lcve[87] = -369548639;
        nx.lcve[88] = -520461951;
        nx.lcve[89] = 1323974276;
        nx.lcve[90] = 1102034835;
        nx.lcve[91] = -1869835918;
        nx.lcve[92] = 587285340;
        nx.lcve[93] = 763876055;
        nx.lcve[94] = 1487651809;
        nx.lcve[95] = -1091402988;
        nx.lcve[96] = -2068307952;
        nx.lcve[97] = -146815873;
        nx.lcve[98] = 514642345;
        nx.lcve[99] = -665174838;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void block() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("letx", lcvs(int ), (int)64)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nx.lcvf("letz", lcvb(int ), (int)73)) break;
            v0 /* !! */  = (long)nx.lcvf("leua", lcvb(int ), (int)74);
        }
        var3_1 = nx.c;
        v1 /* !! */  = nx.tt;
        if (true) ** GOTO lbl11
        block96: while (true) {
            v1 /* !! */  = (long)(v2 - nx.lcvf("leub", lcvs(int ), (int)65));
lbl11:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1690311823: {
                    v2 = nx.lcvf("leuc", lcvs(int ), (int)66);
                    continue block96;
                }
                case -1222426216: {
                    break block96;
                }
                case -274578589: {
                    v2 = nx.lcvf("leue", lcvs(int ), (int)67);
                    continue block96;
                }
                case -97890382: {
                    v2 = nx.lcvf("leuf", lcvs(int ), (int)68);
                    continue block96;
                }
            }
            break;
        }
        var2_2 /* !! */  = nx.b;
        while (true) {
            if ((v3 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("leuh", lcvs(int ), (int)69)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v3 /* !! */  == nx.lcvf("leui", lcvb(int ), (int)75)) break;
            v3 /* !! */  = (long)nx.lcvf("leuj", lcvb(int ), (int)76);
        }
        var1_3 = nx.a;
        if (var3_1) {
            throw null;
lbl32:
            // 9 sources

            return;
        }
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3 || var1_3) ** GOTO lbl32
                v4 /* !! */  = nx.tt;
                if (true) ** GOTO lbl42
                block99: while (true) {
                    v4 /* !! */  = (long)(v5 - nx.lcvf("leul", lcvs(int ), (int)70));
lbl42:
                    // 2 sources

                    switch ((int)v4 /* !! */ ) {
                        case -1347986584: {
                            v5 = nx.lcvf("leum", lcvs(int ), (int)71);
                            continue block99;
                        }
                        case -1222426216: {
                            break block99;
                        }
                        case 863701519: {
                            v5 = nx.lcvf("leun", lcvs(int ), (int)72);
                            continue block99;
                        }
                        case 1960863029: {
                            v5 = nx.lcvf("leuo", lcvs(int ), (int)73);
                            continue block99;
                        }
                    }
                    break;
                }
                v6 /* !! */  = nx.tt;
                if (true) ** GOTO lbl58
                block100: while (true) {
                    v6 /* !! */  = (long)(v7 - nx.lcvf("leup", lcvs(int ), (int)74));
lbl58:
                    // 2 sources

                    switch ((int)v6 /* !! */ ) {
                        case -1222426216: {
                            break block100;
                        }
                        case -1008871180: {
                            v7 = nx.lcvf("leur", lcvs(int ), (int)75);
                            continue block100;
                        }
                        case 242833611: {
                            v7 = nx.lcvf("leus", lcvs(int ), (int)76);
                            continue block100;
                        }
                        case 2022937881: {
                            v7 = nx.lcvf("leut", lcvs(int ), (int)77);
                            continue block100;
                        }
                    }
                    break;
                }
                if (nx.mc.field_1724 != null) ** GOTO lbl73
                if (var1_3) ** GOTO lbl32
                return;
lbl73:
                // 1 sources

                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("leuu", lcvs(int ), (int)78)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nx.lcvf("leuw", lcvb(int ), (int)77)) break;
                    v8 /* !! */  = (long)nx.lcvf("leux", lcvb(int ), (int)78);
                }
                v9 /* !! */  = nx.tt;
                if (true) ** GOTO lbl83
                block102: while (true) {
                    v9 /* !! */  = (long)(v10 - nx.lcvf("leuy", lcvs(int ), (int)79));
lbl83:
                    // 2 sources

                    switch ((int)v9 /* !! */ ) {
                        case -1222426216: {
                            break block102;
                        }
                        case -630317804: {
                            v10 = nx.lcvf("leuz", lcvs(int ), (int)80);
                            continue block102;
                        }
                        case 793423139: {
                            v10 = nx.lcvf("levb", lcvs(int ), (int)81);
                            continue block102;
                        }
                    }
                    break;
                }
                v11 = nx.mc.field_1690;
                v12 /* !! */  = nx.tt;
                if (true) ** GOTO lbl97
                block103: while (true) {
                    v12 /* !! */  = (long)(v13 - nx.lcvf("levc", lcvs(int ), (int)82));
lbl97:
                    // 2 sources

                    switch ((int)v12 /* !! */ ) {
                        case -1305857856: {
                            v13 = nx.lcvf("levd", lcvs(int ), (int)83);
                            continue block103;
                        }
                        case -1222426216: {
                            break block103;
                        }
                        case 483927680: {
                            v13 = nx.lcvf("leve", lcvs(int ), (int)84);
                            continue block103;
                        }
                    }
                    break;
                }
                v14 = v11.field_1894;
                v15 = nx.lcvf("levf", lcvb(int ), (int)79);
                v16 /* !! */  = nx.tt;
                if (true) ** GOTO lbl112
                block104: while (true) {
                    v16 /* !! */  = (long)(v17 - nx.lcvf("levg", lcvs(int ), (int)85));
lbl112:
                    // 2 sources

                    switch ((int)v16 /* !! */ ) {
                        case -2130078674: {
                            v17 = nx.lcvf("levi", lcvs(int ), (int)86);
                            continue block104;
                        }
                        case -1667655307: {
                            v17 = nx.lcvf("levj", lcvs(int ), (int)87);
                            continue block104;
                        }
                        case -1222426216: {
                            break block104;
                        }
                        case 1888711223: {
                            v17 = nx.lcvf("levk", lcvs(int ), (int)88);
                            continue block104;
                        }
                    }
                    break;
                }
                v14.method_23481((boolean)v15);
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v18 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("levm", lcvs(int ), (int)89)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  == nx.lcvf("levn", lcvb(int ), (int)80)) break;
                    v18 /* !! */  = (long)nx.lcvf("levp", lcvb(int ), (int)81);
                }
                while (true) {
                    if ((v19 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("levq", lcvs(int ), (int)90)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v19 /* !! */  == nx.lcvf("levs", lcvb(int ), (int)82)) break;
                    v19 /* !! */  = (long)nx.lcvf("levt", lcvb(int ), (int)83);
                }
                v20 = nx.mc.field_1690;
                while (true) {
                    if ((v21 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("levu", lcvs(int ), (int)91)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v21 /* !! */  == nx.lcvf("levw", lcvb(int ), (int)84)) break;
                    v21 /* !! */  = (long)nx.lcvf("levx", lcvb(int ), (int)85);
                }
                v22 = v20.field_1881;
                v23 = nx.lcvf("levy", lcvb(int ), (int)86);
                while (true) {
                    if ((v24 /* !! */  = (cfr_temp_6 = nx.tt - nx.lcvf("levz", lcvs(int ), (int)92)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v24 /* !! */  == nx.lcvf("lewa", lcvb(int ), (int)87)) break;
                    v24 /* !! */  = (long)nx.lcvf("lewb", lcvb(int ), (int)88);
                }
                v22.method_23481((boolean)v23);
                if (var1_3 || var1_3) ** GOTO lbl32
                v25 /* !! */  = nx.tt;
                if (true) ** GOTO lbl155
                block109: while (true) {
                    v25 /* !! */  = (long)(nx.lcvf("lewe", lcvs(int ), (int)94) - nx.lcvf("lewd", lcvs(int ), (int)93));
lbl155:
                    // 2 sources

                    switch ((int)v25 /* !! */ ) {
                        case -1222426216: {
                            break block109;
                        }
                        case -854581991: {
                            continue block109;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_7 = nx.tt - nx.lcvf("lewg", lcvs(int ), (int)95)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == nx.lcvf("lewi", lcvb(int ), (int)89)) break;
                    v26 /* !! */  = (long)nx.lcvf("lewj", lcvb(int ), (int)90);
                }
                v27 = nx.mc.field_1690;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_8 = nx.tt - nx.lcvf("lewm", lcvs(int ), (int)96)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == nx.lcvf("lewn", lcvb(int ), (int)91)) break;
                    v28 /* !! */  = (long)nx.lcvf("lewp", lcvb(int ), (int)92);
                }
                v29 = v27.field_1913;
                v30 = nx.lcvf("lewq", lcvb(int ), (int)93);
                v31 /* !! */  = nx.tt;
                if (true) ** GOTO lbl177
                block112: while (true) {
                    v31 /* !! */  = (long)(nx.lcvf("lewt", lcvs(int ), (int)98) - nx.lcvf("lewr", lcvs(int ), (int)97));
lbl177:
                    // 2 sources

                    switch ((int)v31 /* !! */ ) {
                        case -1222426216: {
                            break block112;
                        }
                        case 1127849635: {
                            continue block112;
                        }
                    }
                    break;
                }
                v29.method_23481((boolean)v30);
                if (var1_3 || var1_3) ** GOTO lbl32
                v32 /* !! */  = nx.tt;
                if (true) ** GOTO lbl188
                block113: while (true) {
                    v32 /* !! */  = (long)(v33 - nx.lcvf("lewu", lcvs(int ), (int)99));
lbl188:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1222426216: {
                            break block113;
                        }
                        case -452381499: {
                            v33 = nx.lcvf("leww", lcvs(int ), (int)100);
                            continue block113;
                        }
                        case -120109392: {
                            v33 = nx.lcvf("lewx", lcvs(int ), (int)101);
                            continue block113;
                        }
                        case 751704028: {
                            v33 = nx.lcvf("lewy", lcvs(int ), (int)102);
                            continue block113;
                        }
                    }
                    break;
                }
                v34 /* !! */  = nx.tt;
                if (true) ** GOTO lbl204
                block114: while (true) {
                    v34 /* !! */  = (long)(v35 - nx.lcvf("lewz", lcvs(int ), (int)103));
lbl204:
                    // 2 sources

                    switch ((int)v34 /* !! */ ) {
                        case -1544876862: {
                            v35 = nx.lcvf("lexa", lcvs(int ), (int)104);
                            continue block114;
                        }
                        case -1222426216: {
                            break block114;
                        }
                        case -342474921: {
                            v35 = nx.lcvf("lexb", lcvs(int ), (int)105);
                            continue block114;
                        }
                        case 365417925: {
                            v35 = nx.lcvf("lexc", lcvs(int ), (int)106);
                            continue block114;
                        }
                    }
                    break;
                }
                v36 = nx.mc.field_1690;
                v37 /* !! */  = nx.tt;
                if (true) ** GOTO lbl221
                block115: while (true) {
                    v37 /* !! */  = (long)(v38 - nx.lcvf("lexd", lcvs(int ), (int)107));
lbl221:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -1927985304: {
                            v38 = nx.lcvf("lexe", lcvs(int ), (int)108);
                            continue block115;
                        }
                        case -1222426216: {
                            break block115;
                        }
                        case -560562038: {
                            v38 = nx.lcvf("lexf", lcvs(int ), (int)109);
                            continue block115;
                        }
                        case 1162917219: {
                            v38 = nx.lcvf("lexg", lcvs(int ), (int)110);
                            continue block115;
                        }
                    }
                    break;
                }
                v39 = v36.field_1849;
                v40 = nx.lcvf("lexh", lcvb(int ), (int)94);
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_9 = nx.tt - nx.lcvf("lexi", lcvs(int ), (int)111)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == nx.lcvf("lexk", lcvb(int ), (int)95)) break;
                    v41 /* !! */  = (long)nx.lcvf("lexo", lcvb(int ), (int)96);
                }
                v39.method_23481((boolean)v40);
                if (var1_3 || var1_3) ** GOTO lbl32
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_10 = nx.tt - nx.lcvf("lexq", lcvs(int ), (int)112)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == nx.lcvf("lexs", lcvb(int ), (int)97)) break;
                    v42 /* !! */  = (long)nx.lcvf("lexu", lcvb(int ), (int)98);
                }
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_11 = nx.tt - nx.lcvf("lexv", lcvs(int ), (int)113)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == nx.lcvf("lexx", lcvb(int ), (int)99)) break;
                    v43 /* !! */  = (long)nx.lcvf("lexz", lcvb(int ), (int)100);
                }
                v44 = nx.mc.field_1690;
                v45 /* !! */  = nx.tt;
                if (true) ** GOTO lbl257
                block119: while (true) {
                    v45 /* !! */  = (long)(v46 - nx.lcvf("leya", lcvs(int ), (int)114));
lbl257:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1587900184: {
                            v46 = nx.lcvf("leyc", lcvs(int ), (int)115);
                            continue block119;
                        }
                        case -1222426216: {
                            break block119;
                        }
                        case 1319847280: {
                            v46 = nx.lcvf("leyd", lcvs(int ), (int)116);
                            continue block119;
                        }
                    }
                    break;
                }
                v47 = v44.field_1903;
                v48 = nx.lcvf("leye", lcvb(int ), (int)101);
                v49 /* !! */  = nx.tt;
                if (true) ** GOTO lbl272
                block120: while (true) {
                    v49 /* !! */  = (long)(nx.lcvf("leyi", lcvs(int ), (int)118) - nx.lcvf("leyg", lcvs(int ), (int)117));
lbl272:
                    // 2 sources

                    switch ((int)v49 /* !! */ ) {
                        case -1222426216: {
                            break block120;
                        }
                        case 1017720233: {
                            continue block120;
                        }
                    }
                    break;
                }
                v47.method_23481((boolean)v48);
                if (var1_3 || var1_3) ** GOTO lbl32
                v50 = nx.lcvf("leyk", lcvb(int ), (int)102);
                v51 /* !! */  = nx.tt;
                if (true) ** GOTO lbl284
                block121: while (true) {
                    v51 /* !! */  = (long)(nx.lcvf("leyo", lcvs(int ), (int)120) - nx.lcvf("leym", lcvs(int ), (int)119));
lbl284:
                    // 2 sources

                    switch ((int)v51 /* !! */ ) {
                        case -1222426216: {
                            break block121;
                        }
                        case 34129461: {
                            continue block121;
                        }
                    }
                    break;
                }
                this.blocked = v50;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl293:
            // 3 sources

            case 0: {
                var2_2 /* !! */  = (int)nx.lcvf("leyq", lcvb(int ), (int)103);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl331
            }
            case 1: {
                var2_2 /* !! */  = (int)nx.lcvf("leyr", lcvb(int ), (int)104);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl369
            }
            case 2: {
                var2_2 /* !! */  = (int)nx.lcvf("leys", lcvb(int ), (int)105);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl317
            }
            case 3: {
                var2_2 /* !! */  = (int)nx.lcvf("leyu", lcvb(int ), (int)106);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl353
            }
lbl313:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nx.lcvf("leyw", lcvb(int ), (int)107);
                if (var3_1) {
                    throw null;
                }
            }
lbl317:
            // 6 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("leyy", lcvb(int ), (int)108);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)nx.lcvf("leyz", lcvb(int ), (int)109);
                if (!var3_1) ** GOTO lbl293
                throw null;
            }
lbl326:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)nx.lcvf("leza", lcvb(int ), (int)110);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl361
            }
lbl331:
            // 3 sources

            case 8: {
                var2_2 /* !! */  = (int)nx.lcvf("lezb", lcvb(int ), (int)111);
                if (!var3_1) ** GOTO lbl317
                throw null;
            }
            case 9: {
                var2_2 /* !! */  = (int)nx.lcvf("lezd", lcvb(int ), (int)112);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl344
            }
            case 10: {
                var2_2 /* !! */  = (int)nx.lcvf("lezf", lcvb(int ), (int)113);
                if (!var3_1) ** GOTO lbl331
                throw null;
            }
lbl344:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)nx.lcvf("lezh", lcvb(int ), (int)114);
                if (!var3_1) ** GOTO lbl326
                throw null;
            }
lbl348:
            // 2 sources

            case 12: lbl-1000:
            // 2 sources

            {
                while (true) lbl-1000:
                // 2 sources

                {
                    var2_2 /* !! */  = (int)nx.lcvf("lezj", lcvb(int ), (int)115);
                    if (!var3_1) ** GOTO lbl-1000
                    throw null;
                }
            }
lbl353:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)nx.lcvf("lezl", lcvb(int ), (int)116);
                if (!var3_1) ** GOTO lbl326
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)nx.lcvf("lezn", lcvb(int ), (int)117);
                if (!var3_1) ** GOTO lbl348
                throw null;
            }
lbl361:
            // 2 sources

            case 15: {
                var2_2 /* !! */  = (int)nx.lcvf("lezo", lcvb(int ), (int)118);
                if (var3_1) {
                    throw null;
                }
            }
            case 16: {
                var2_2 /* !! */  = (int)nx.lcvf("lezp", lcvb(int ), (int)119);
                if (!var3_1) ** GOTO lbl317
                throw null;
            }
lbl369:
            // 2 sources

            case 17: {
                var2_2 /* !! */  = (int)nx.lcvf("lezq", lcvb(int ), (int)120);
                if (!var3_1) ** GOTO lbl293
                throw null;
            }
            case 18: {
                var2_2 /* !! */  = (int)nx.lcvf("lezr", lcvb(int ), (int)121);
                if (!var3_1) ** GOTO lbl313
                throw null;
            }
            case 19: 
        }
        var2_2 /* !! */  = (int)nx.lcvf("lezt", lcvb(int ), (int)122);
        ** while (!var3_1)
lbl380:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lggw() {
        nx.lcve[100] = 1821137529;
        nx.lcve[101] = -1940287712;
        nx.lcve[102] = 1380116868;
        nx.lcve[103] = -121692980;
        nx.lcve[104] = 1776599056;
        nx.lcve[105] = -703514424;
        nx.lcve[106] = 625626039;
        nx.lcve[107] = -393399457;
        nx.lcve[108] = 185870209;
        nx.lcve[109] = -258712904;
        nx.lcve[110] = 1291806593;
        nx.lcve[111] = -1984940000;
        nx.lcve[112] = 613557904;
        nx.lcve[113] = 776704933;
        nx.lcve[114] = 1283298424;
        nx.lcve[115] = 1456795223;
        nx.lcve[116] = -665886703;
        nx.lcve[117] = 1227178458;
        nx.lcve[118] = -1809356064;
        nx.lcve[119] = -788768714;
        nx.lcve[120] = -873561359;
        nx.lcve[121] = -1817522941;
        nx.lcve[122] = 1855414537;
        nx.lcve[123] = -259969445;
        nx.lcve[124] = -1780868449;
        nx.lcve[125] = 380065545;
        nx.lcve[126] = 1848498496;
        nx.lcve[127] = 1456085191;
        nx.lcve[128] = 485483087;
        nx.lcve[129] = -1080724276;
        nx.lcve[130] = 2050946003;
        nx.lcve[131] = -838463791;
        nx.lcve[132] = 1595997096;
        nx.lcve[133] = 73864736;
        nx.lcve[134] = -661283365;
        nx.lcve[135] = -1019990773;
        nx.lcve[136] = -1475610348;
        nx.lcve[137] = 1618068210;
        nx.lcve[138] = 726481316;
        nx.lcve[139] = 1373481172;
        nx.lcve[140] = 121065704;
        nx.lcve[141] = -201549601;
        nx.lcve[142] = -477979973;
        nx.lcve[143] = 1554356945;
        nx.lcve[144] = 1244001909;
        nx.lcve[145] = 900730967;
        nx.lcve[146] = -1866151060;
        nx.lcve[147] = -55803415;
        nx.lcve[148] = 223217810;
        nx.lcve[149] = -1194587900;
        nx.lcve[150] = -51720004;
        nx.lcve[151] = -1703748087;
        nx.lcve[152] = -484819226;
        nx.lcve[153] = -1756614584;
        nx.lcve[154] = 1665345852;
        nx.lcve[155] = 873891537;
        nx.lcve[156] = 1678691377;
        nx.lcve[157] = -1275017931;
        nx.lcve[158] = -781560389;
        nx.lcve[159] = -131694193;
        nx.lcve[160] = -586029053;
        nx.lcve[161] = 1622432515;
        nx.lcve[162] = -2131317420;
        nx.lcve[163] = -172479516;
        nx.lcve[164] = -1810154676;
        nx.lcve[165] = -1332029288;
        nx.lcve[166] = 444438364;
        nx.lcve[167] = 2016684253;
        nx.lcve[168] = -1166125221;
        nx.lcve[169] = 1497794449;
        nx.lcve[170] = -679005831;
        nx.lcve[171] = 1161919476;
        nx.lcve[172] = 197705815;
        nx.lcve[173] = -1692799483;
        nx.lcve[174] = -736934286;
        nx.lcve[175] = -1908005226;
        nx.lcve[176] = 1677878494;
        nx.lcve[177] = 2059311196;
        nx.lcve[178] = -611572359;
        nx.lcve[179] = -1241518054;
        nx.lcve[180] = 1088443014;
        nx.lcve[181] = 615710647;
        nx.lcve[182] = 200861661;
        nx.lcve[183] = 875293810;
        nx.lcve[184] = 1888676166;
        nx.lcve[185] = -381639725;
        nx.lcve[186] = -1321439443;
        nx.lcve[187] = 934056030;
        nx.lcve[188] = 215543911;
        nx.lcve[189] = -1666942013;
        nx.lcve[190] = -1778999;
        nx.lcve[191] = -491181165;
        nx.lcve[192] = 692571862;
        nx.lcve[193] = 677127720;
        nx.lcve[194] = -922065208;
        nx.lcve[195] = 555874083;
        nx.lcve[196] = -1069305558;
        nx.lcve[197] = 125580888;
        nx.lcve[198] = 1934793301;
        nx.lcve[199] = -1405186577;
    }

    private static /* synthetic */ void lggs() {
        nx.lcvc[300] = 228686581;
        nx.lcvc[301] = -1586220042;
        nx.lcvc[302] = 2129666121;
        nx.lcvc[303] = 1175848725;
        nx.lcvc[304] = -1345190233;
        nx.lcvc[305] = -191503796;
        nx.lcvc[306] = 1911943507;
        nx.lcvc[307] = 1315021575;
        nx.lcvc[308] = -1204166274;
        nx.lcvc[309] = 666252322;
        nx.lcvc[310] = -706151428;
        nx.lcvc[311] = 1088497697;
        nx.lcvc[312] = 896868550;
        nx.lcvc[313] = -298845997;
        nx.lcvc[314] = -2009524236;
        nx.lcvc[315] = 233958065;
        nx.lcvc[316] = 965590261;
        nx.lcvc[317] = 891575161;
        nx.lcvc[318] = -873239704;
        nx.lcvc[319] = 1812108213;
        nx.lcvc[320] = -1610332737;
        nx.lcvc[321] = 36864081;
        nx.lcvc[322] = 1080673191;
        nx.lcvc[323] = -1256127591;
        nx.lcvc[324] = 573001250;
        nx.lcvc[325] = -137374216;
        nx.lcvc[326] = -1803931688;
        nx.lcvc[327] = 1443921663;
        nx.lcvc[328] = -274404483;
        nx.lcvc[329] = 1312266330;
        nx.lcvc[330] = 145589697;
        nx.lcvc[331] = 1206114894;
        nx.lcvc[332] = -193559068;
        nx.lcvc[333] = 28543826;
        nx.lcvc[334] = 643249712;
        nx.lcvc[335] = -1058217075;
        nx.lcvc[336] = -1715243971;
        nx.lcvc[337] = -1532545292;
        nx.lcvc[338] = 784908453;
        nx.lcvc[339] = -1191909909;
        nx.lcvc[340] = -1519720819;
        nx.lcvc[341] = 1344557994;
        nx.lcvc[342] = 1695384991;
        nx.lcvc[343] = -2062849373;
        nx.lcvc[344] = 1213955030;
        nx.lcvc[345] = -287113259;
        nx.lcvc[346] = 190214844;
        nx.lcvc[347] = 5973221;
        nx.lcvc[348] = -1379475778;
        nx.lcvc[349] = 80363902;
        nx.lcvc[350] = -1858016783;
        nx.lcvc[351] = 1222638631;
        nx.lcvc[352] = 1937269444;
        nx.lcvc[353] = -726333271;
        nx.lcvc[354] = -147854904;
        nx.lcvc[355] = -181036842;
        nx.lcvc[356] = 1937041470;
        nx.lcvc[357] = -1966402004;
        nx.lcvc[358] = -1135281776;
        nx.lcvc[359] = 1706043237;
        nx.lcvc[360] = 515856373;
        nx.lcvc[361] = 1624889514;
        nx.lcvc[362] = -1056999055;
        nx.lcvc[363] = -76151742;
        nx.lcvc[364] = -619348169;
        nx.lcvc[365] = 1143006368;
        nx.lcvc[366] = -762462055;
        nx.lcvc[367] = -2139070647;
        nx.lcvc[368] = -1970925001;
        nx.lcvc[369] = -1102324460;
        nx.lcvc[370] = -1893118192;
        nx.lcvc[371] = 573982532;
        nx.lcvc[372] = 860506748;
        nx.lcvc[373] = 1792607556;
        nx.lcvc[374] = -35366957;
        nx.lcvc[375] = -463535634;
        nx.lcvc[376] = 127676630;
        nx.lcvc[377] = 1026141062;
        nx.lcvc[378] = -83260685;
        nx.lcvc[379] = 121837779;
        nx.lcvc[380] = 933716771;
        nx.lcvc[381] = 2023643680;
        nx.lcvc[382] = 1538413625;
        nx.lcvc[383] = 533829081;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public boolean isPlayerStopped(double var1_1) {
        block90: {
            v0 /* !! */  = nx.tt;
            block49: while (true) {
                switch ((int)v0 /* !! */ ) {
                    case -1222426216: {
                        break block49;
                    }
                    case -464420988: {
                        v0 /* !! */  = (long)(nx.lcvf("lfxp", lcvs(int ), (int)322) - nx.lcvf("lfxo", lcvs(int ), (int)321));
                        continue block49;
                    }
                }
                break;
            }
            var9_2 = nx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("lfxq", lcvs(int ), (int)323)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == nx.lcvf("lfxs", lcvb(int ), (int)303)) break;
                v1 /* !! */  = (long)nx.lcvf("lfxt", lcvb(int ), (int)304);
            }
            var8_3 /* !! */  = nx.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("lfxu", lcvs(int ), (int)324)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nx.lcvf("lfxv", lcvb(int ), (int)305)) {
                    var7_4 = nx.a;
                    if (var9_2) {
                        throw null;
                    }
                    break;
                }
                v2 /* !! */  = (long)nx.lcvf("lfxw", lcvb(int ), (int)306);
            }
            if (var7_4 || var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
            while (true) {
                block91: {
                    if ((v3 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("lfxz", lcvs(int ), (int)325)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  != nx.lcvf("lfya", lcvb(int ), (int)308)) break block91;
                    v4 /* !! */  = nx.tt;
                    if (true) ** GOTO lbl36
                }
                v3 /* !! */  = (long)nx.lcvf("lfyc", lcvb(int ), (int)309);
            }
            block53: while (true) {
                v4 /* !! */  = (long)(v5 - nx.lcvf("lfyd", lcvs(int ), (int)326));
lbl36:
                // 2 sources

                switch ((int)v4 /* !! */ ) {
                    case -1822380817: {
                        v5 = nx.lcvf("lfye", lcvs(int ), (int)327);
                        continue block53;
                    }
                    case -1222426216: {
                        break block53;
                    }
                    case 786734121: {
                        v5 = nx.lcvf("lfyf", lcvs(int ), (int)328);
                        continue block53;
                    }
                    case 2039450081: {
                        v5 = nx.lcvf("lfyg", lcvs(int ), (int)329);
                        continue block53;
                    }
                }
                break;
            }
            if (nx.mc.field_1724 == null) {
                if (var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
                return (boolean)nx.lcvf("lfyh", lcvb(int ), (int)310);
            }
            if (var7_4 || var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
            while (true) {
                block92: {
                    if ((v6 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("lfyi", lcvs(int ), (int)330)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v6 /* !! */  != nx.lcvf("lfyj", lcvb(int ), (int)311)) break block92;
                    v7 /* !! */  = nx.tt;
                    if (true) ** GOTO lbl62
                }
                v6 /* !! */  = (long)nx.lcvf("lfyl", lcvb(int ), (int)312);
            }
            block55: while (true) {
                v7 /* !! */  = (long)(v8 - nx.lcvf("lfym", lcvs(int ), (int)331));
lbl62:
                // 2 sources

                switch ((int)v7 /* !! */ ) {
                    case -1862361071: {
                        v8 = nx.lcvf("lfyo", lcvs(int ), (int)332);
                        continue block55;
                    }
                    case -1222426216: {
                        break block55;
                    }
                    case 1582872513: {
                        v8 = nx.lcvf("lfyq", lcvs(int ), (int)333);
                        continue block55;
                    }
                    case 1906581857: {
                        v8 = nx.lcvf("lfyr", lcvs(int ), (int)334);
                        continue block55;
                    }
                }
                break;
            }
            v9 = nx.mc.field_1724;
            while (true) {
                if ((v10 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("lfyt", lcvs(int ), (int)335)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                if (v10 /* !! */  == nx.lcvf("lfyv", lcvb(int ), (int)313)) break;
                v10 /* !! */  = (long)nx.lcvf("lfyw", lcvb(int ), (int)314);
            }
            v11 = v9.method_18798();
            while (true) {
                if ((v12 /* !! */  = (cfr_temp_6 = nx.tt - nx.lcvf("lfyy", lcvs(int ), (int)336)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                if (v12 /* !! */  == nx.lcvf("lfza", lcvb(int ), (int)315)) break;
                v12 /* !! */  = (long)nx.lcvf("lfzb", lcvb(int ), (int)316);
            }
            v13 = v11.field_1352;
            v14 /* !! */  = nx.tt;
            block58: while (true) {
                switch ((int)v14 /* !! */ ) {
                    case -1222426216: {
                        break block58;
                    }
                    case -1155091600: {
                        v14 /* !! */  = (long)(nx.lcvf("lfzf", lcvs(int ), (int)338) - nx.lcvf("lfzd", lcvs(int ), (int)337));
                        continue block58;
                    }
                }
                break;
            }
            var3_5 = Math.abs(v13);
            if (var7_4 || var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
            while (true) {
                if ((v15 /* !! */  = (cfr_temp_7 = nx.tt - nx.lcvf("lfzg", lcvs(int ), (int)339)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                if (v15 /* !! */  == nx.lcvf("lfzh", lcvb(int ), (int)317)) break;
                v15 /* !! */  = (long)nx.lcvf("lfzi", lcvb(int ), (int)318);
            }
            while (true) {
                if ((v16 /* !! */  = (cfr_temp_8 = nx.tt - nx.lcvf("lfzk", lcvs(int ), (int)340)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                if (v16 /* !! */  == nx.lcvf("lfzm", lcvb(int ), (int)319)) break;
                v16 /* !! */  = (long)nx.lcvf("lfzn", lcvb(int ), (int)320);
            }
            v17 = nx.mc.field_1724;
            while (true) {
                block93: {
                    if ((v18 /* !! */  = (cfr_temp_9 = nx.tt - nx.lcvf("lfzp", lcvs(int ), (int)341)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v18 /* !! */  != nx.lcvf("lfzq", lcvb(int ), (int)321)) break block93;
                    v19 = v17.method_18798();
                    v20 /* !! */  = nx.tt;
                    if (true) ** GOTO lbl119
                }
                v18 /* !! */  = (long)nx.lcvf("lfzs", lcvb(int ), (int)322);
            }
            block62: while (true) {
                v20 /* !! */  = (long)(v21 - nx.lcvf("lfzt", lcvs(int ), (int)342));
lbl119:
                // 2 sources

                switch ((int)v20 /* !! */ ) {
                    case -2062952522: {
                        v21 = nx.lcvf("lfzv", lcvs(int ), (int)343);
                        continue block62;
                    }
                    case -1222426216: {
                        break block62;
                    }
                    case -854214154: {
                        v21 = nx.lcvf("lfzw", lcvs(int ), (int)344);
                        continue block62;
                    }
                    case 1547283737: {
                        v21 = nx.lcvf("lfzy", lcvs(int ), (int)345);
                        continue block62;
                    }
                }
                break;
            }
            v22 = v19.field_1350;
            v23 /* !! */  = nx.tt;
            if (true) ** GOTO lbl136
            block63: while (true) {
                v23 /* !! */  = (long)(v24 - nx.lcvf("lfzz", lcvs(int ), (int)346));
lbl136:
                // 2 sources

                switch ((int)v23 /* !! */ ) {
                    case -1302352781: {
                        v24 = nx.lcvf("lgab", lcvs(int ), (int)347);
                        continue block63;
                    }
                    case -1222426216: {
                        break block63;
                    }
                    case -520900444: {
                        v24 = nx.lcvf("lgad", lcvs(int ), (int)348);
                        continue block63;
                    }
                }
                break;
            }
            var5_6 = Math.abs(v22);
            if (var7_4 || var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
            if (!(var3_5 < var1_1)) ** GOTO lbl159
            if (var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
            if (!(var5_6 < var1_1)) ** GOTO lbl159
            if (var8_3 /* !! */  == 0) ** GOTO lbl-1000
            cfr_temp_0 = -2147483648;
            while (true) {
                switch (cfr_temp_0 == -2147483648 ? var8_3 /* !! */  : cfr_temp_0) {
                    default: lbl-1000:
                    // 2 sources

                    {
                        if (var7_4) return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
                        v25 = nx.lcvf("lgaf", lcvb(int ), (int)323);
                        if (!var9_2) return (boolean)v25;
                        throw null;
                    }
lbl159:
                    // 2 sources

                    if (var7_4 || var7_4) {
                        return (boolean)nx.lcvf("lfxy", lcvb(int ), (int)307);
                    }
                    v25 = nx.lcvf("lgag", lcvb(int ), (int)324);
                    return (boolean)v25;
                    case 0: {
                        ** GOTO lbl205
                    }
                    case 2: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgaj", lcvb(int ), (int)327);
                        cfr_temp_0 = 10;
                        if (var9_2) {
                            throw null;
                        }
                        break block90;
                    }
                    case 5: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgam", lcvb(int ), (int)330);
                        cfr_temp_0 = 8;
                        if (var9_2) {
                            throw null;
                        }
                        break block90;
                    }
                    case 6: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgan", lcvb(int ), (int)331);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 7: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgaq", lcvb(int ), (int)332);
                        cfr_temp_0 = 8;
                        if (var9_2) {
                            throw null;
                        }
                        break block90;
                    }
                    case 9: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgav", lcvb(int ), (int)334);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 11: {
                        do {
                            var8_3 /* !! */  = (int)nx.lcvf("lgay", lcvb(int ), (int)336);
                        } while (!var9_2);
                        throw null;
                    }
                    case 12: {
                        do {
                            var8_3 /* !! */  = (int)nx.lcvf("lgba", lcvb(int ), (int)337);
                        } while (!var9_2);
                        throw null;
                    }
                    case 15: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgbe", lcvb(int ), (int)340);
                        if (var9_2) {
                            throw null;
                        }
lbl205:
                        // 3 sources

                        var8_3 /* !! */  = (int)nx.lcvf("lgah", lcvb(int ), (int)325);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 3: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgak", lcvb(int ), (int)328);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 14: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgbd", lcvb(int ), (int)339);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 13: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgbc", lcvb(int ), (int)338);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 1: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgai", lcvb(int ), (int)326);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 10: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgaw", lcvb(int ), (int)335);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 4: {
                        var8_3 /* !! */  = (int)nx.lcvf("lgal", lcvb(int ), (int)329);
                        if (var9_2) {
                            throw null;
                        }
                    }
                    case 8: 
                }
                break;
            }
            ** GOTO lbl237
        }
        do {
            if (true) ** continue;
lbl237:
            // 2 sources

            var8_3 /* !! */  = (int)nx.lcvf("lgas", lcvb(int ), (int)333);
            cfr_temp_0 = 1;
        } while (!var9_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void saveState() {
        block148: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lcvw", lcvs(int ), (int)0)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == nx.lcvf("lcvy", lcvb(int ), (int)6)) break;
                v0 /* !! */  = (long)nx.lcvf("lcwa", lcvb(int ), (int)7);
            }
            var3_1 = nx.c;
            while (true) {
                if ((v1 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("lcwb", lcvs(int ), (int)1)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v1 /* !! */  == nx.lcvf("lcwc", lcvb(int ), (int)8)) break;
                v1 /* !! */  = (long)nx.lcvf("lcwd", lcvb(int ), (int)9);
            }
            var2_2 /* !! */  = nx.b;
            while (true) {
                if ((v2 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("lcwe", lcvs(int ), (int)2)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                if (v2 /* !! */  == nx.lcvf("lcwf", lcvb(int ), (int)10)) break;
                v2 /* !! */  = (long)nx.lcvf("lcwh", lcvb(int ), (int)11);
            }
            var1_3 = nx.a;
            if (var3_1) {
                throw null;
lbl21:
                // 10 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl21
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("lcwj", lcvs(int ), (int)3)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nx.lcvf("lcwk", lcvb(int ), (int)12)) break;
                v3 /* !! */  = (long)nx.lcvf("lcwl", lcvb(int ), (int)13);
            }
            while (true) {
                if ((v4 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("lcwm", lcvs(int ), (int)4)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                if (v4 /* !! */  == nx.lcvf("lcwn", lcvb(int ), (int)14)) break;
                v4 /* !! */  = (long)nx.lcvf("lcwo", lcvb(int ), (int)15);
            }
            if (nx.mc.field_1724 != null) break block148;
            if (var1_3) ** GOTO lbl21
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl21
        v5 /* !! */  = nx.tt;
        if (true) ** GOTO lbl43
        block98: while (true) {
            v5 /* !! */  = (long)(v6 - nx.lcvf("lcwq", lcvs(int ), (int)5));
lbl43:
            // 2 sources

            switch ((int)v5 /* !! */ ) {
                case -1222426216: {
                    break block98;
                }
                case 266304133: {
                    v6 = nx.lcvf("lcws", lcvs(int ), (int)6);
                    continue block98;
                }
                case 1996986377: {
                    v6 = nx.lcvf("lcwu", lcvs(int ), (int)7);
                    continue block98;
                }
            }
            break;
        }
        v7 /* !! */  = nx.tt;
        if (true) ** GOTO lbl56
        block99: while (true) {
            v7 /* !! */  = (long)(v8 - nx.lcvf("lcwv", lcvs(int ), (int)8));
lbl56:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1222426216: {
                    break block99;
                }
                case 460385241: {
                    v8 = nx.lcvf("lcww", lcvs(int ), (int)9);
                    continue block99;
                }
                case 909601693: {
                    v8 = nx.lcvf("lcwx", lcvs(int ), (int)10);
                    continue block99;
                }
                case 1935239456: {
                    v8 = nx.lcvf("lcwy", lcvs(int ), (int)11);
                    continue block99;
                }
            }
            break;
        }
        v9 = nx.mc.field_1690;
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("lcxa", lcvs(int ), (int)12)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == nx.lcvf("lcxb", lcvb(int ), (int)16)) break;
            v10 /* !! */  = (long)nx.lcvf("lcxd", lcvb(int ), (int)17);
        }
        v11 = v9.field_1894;
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_6 = nx.tt - nx.lcvf("lcxe", lcvs(int ), (int)13)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == nx.lcvf("lcxg", lcvb(int ), (int)18)) break;
            v12 /* !! */  = (long)nx.lcvf("lcxh", lcvb(int ), (int)19);
        }
        v13 = this.isKeyPressed(v11);
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_7 = nx.tt - nx.lcvf("lcxi", lcvs(int ), (int)14)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == nx.lcvf("lcxk", lcvb(int ), (int)20)) break;
            v14 /* !! */  = (long)nx.lcvf("lcxl", lcvb(int ), (int)21);
        }
        this.forward = v13;
        if (var1_3 || var1_3) ** GOTO lbl21
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                v15 /* !! */  = nx.tt;
                if (true) ** GOTO lbl95
                block103: while (true) {
                    v15 /* !! */  = (long)(v16 - nx.lcvf("lcxo", lcvs(int ), (int)15));
lbl95:
                    // 2 sources

                    switch ((int)v15 /* !! */ ) {
                        case -1543899400: {
                            v16 = nx.lcvf("lcxp", lcvs(int ), (int)16);
                            continue block103;
                        }
                        case -1222426216: {
                            break block103;
                        }
                        case 347339611: {
                            v16 = nx.lcvf("lcxq", lcvs(int ), (int)17);
                            continue block103;
                        }
                        case 1268098373: {
                            v16 = nx.lcvf("lcxr", lcvs(int ), (int)18);
                            continue block103;
                        }
                    }
                    break;
                }
                v17 /* !! */  = nx.tt;
                if (true) ** GOTO lbl111
                block104: while (true) {
                    v17 /* !! */  = (long)(v18 - nx.lcvf("lcxs", lcvs(int ), (int)19));
lbl111:
                    // 2 sources

                    switch ((int)v17 /* !! */ ) {
                        case -2116781302: {
                            v18 = nx.lcvf("lcxt", lcvs(int ), (int)20);
                            continue block104;
                        }
                        case -1222426216: {
                            break block104;
                        }
                        case -221606999: {
                            v18 = nx.lcvf("lcxu", lcvs(int ), (int)21);
                            continue block104;
                        }
                        case 1929895326: {
                            v18 = nx.lcvf("lcxv", lcvs(int ), (int)22);
                            continue block104;
                        }
                    }
                    break;
                }
                v19 = nx.mc.field_1690;
                v20 /* !! */  = nx.tt;
                if (true) ** GOTO lbl128
                block105: while (true) {
                    v20 /* !! */  = (long)(v21 - nx.lcvf("lcxx", lcvs(int ), (int)23));
lbl128:
                    // 2 sources

                    switch ((int)v20 /* !! */ ) {
                        case -1222426216: {
                            break block105;
                        }
                        case -512544525: {
                            v21 = nx.lcvf("lcxz", lcvs(int ), (int)24);
                            continue block105;
                        }
                        case 844162923: {
                            v21 = nx.lcvf("lcya", lcvs(int ), (int)25);
                            continue block105;
                        }
                        case 1394485672: {
                            v21 = nx.lcvf("lcyb", lcvs(int ), (int)26);
                            continue block105;
                        }
                    }
                    break;
                }
                v22 = v19.field_1881;
                while (true) {
                    if ((v23 /* !! */  = (cfr_temp_8 = nx.tt - nx.lcvf("lcyd", lcvs(int ), (int)27)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v23 /* !! */  == nx.lcvf("lcye", lcvb(int ), (int)22)) break;
                    v23 /* !! */  = (long)nx.lcvf("lcyg", lcvb(int ), (int)23);
                }
                v24 = this.isKeyPressed(v22);
                while (true) {
                    if ((v25 /* !! */  = (cfr_temp_9 = nx.tt - nx.lcvf("lcyh", lcvs(int ), (int)28)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v25 /* !! */  == nx.lcvf("lcyj", lcvb(int ), (int)24)) break;
                    v25 /* !! */  = (long)nx.lcvf("lcyk", lcvb(int ), (int)25);
                }
                this.back = v24;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_10 = nx.tt - nx.lcvf("lcym", lcvs(int ), (int)29)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == nx.lcvf("lcyn", lcvb(int ), (int)26)) break;
                    v26 /* !! */  = (long)nx.lcvf("lcyp", lcvb(int ), (int)27);
                }
                v27 /* !! */  = nx.tt;
                if (true) ** GOTO lbl163
                block109: while (true) {
                    v27 /* !! */  = (long)(v28 - nx.lcvf("lcyq", lcvs(int ), (int)30));
lbl163:
                    // 2 sources

                    switch ((int)v27 /* !! */ ) {
                        case -1222426216: {
                            break block109;
                        }
                        case -924155225: {
                            v28 = nx.lcvf("lcys", lcvs(int ), (int)31);
                            continue block109;
                        }
                        case -87987776: {
                            v28 = nx.lcvf("lcyt", lcvs(int ), (int)32);
                            continue block109;
                        }
                        case 1243007475: {
                            v28 = nx.lcvf("lcyu", lcvs(int ), (int)33);
                            continue block109;
                        }
                    }
                    break;
                }
                v29 = nx.mc.field_1690;
                v30 /* !! */  = nx.tt;
                if (true) ** GOTO lbl180
                block110: while (true) {
                    v30 /* !! */  = (long)(nx.lcvf("lcyx", lcvs(int ), (int)35) - nx.lcvf("lcyw", lcvs(int ), (int)34));
lbl180:
                    // 2 sources

                    switch ((int)v30 /* !! */ ) {
                        case -1222426216: {
                            break block110;
                        }
                        case -802174683: {
                            continue block110;
                        }
                    }
                    break;
                }
                v31 = v29.field_1913;
                v32 /* !! */  = nx.tt;
                if (true) ** GOTO lbl190
                block111: while (true) {
                    v32 /* !! */  = (long)(nx.lcvf("lcza", lcvs(int ), (int)37) - nx.lcvf("lcyz", lcvs(int ), (int)36));
lbl190:
                    // 2 sources

                    switch ((int)v32 /* !! */ ) {
                        case -1222426216: {
                            break block111;
                        }
                        case 4770727: {
                            continue block111;
                        }
                    }
                    break;
                }
                v33 = this.isKeyPressed(v31);
                while (true) {
                    if ((v34 /* !! */  = (cfr_temp_11 = nx.tt - nx.lcvf("lczc", lcvs(int ), (int)38)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v34 /* !! */  == nx.lcvf("lczd", lcvb(int ), (int)28)) break;
                    v34 /* !! */  = (long)nx.lcvf("lczf", lcvb(int ), (int)29);
                }
                this.left = v33;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v35 /* !! */  = (cfr_temp_12 = nx.tt - nx.lcvf("lczh", lcvs(int ), (int)39)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v35 /* !! */  == nx.lcvf("lczi", lcvb(int ), (int)30)) break;
                    v35 /* !! */  = (long)nx.lcvf("lczk", lcvb(int ), (int)31);
                }
                while (true) {
                    if ((v36 /* !! */  = (cfr_temp_13 = nx.tt - nx.lcvf("lczl", lcvs(int ), (int)40)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v36 /* !! */  == nx.lcvf("lczm", lcvb(int ), (int)32)) break;
                    v36 /* !! */  = (long)nx.lcvf("lczo", lcvb(int ), (int)33);
                }
                v37 = nx.mc.field_1690;
                while (true) {
                    if ((v38 /* !! */  = (cfr_temp_14 = nx.tt - nx.lcvf("lczp", lcvs(int ), (int)41)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v38 /* !! */  == nx.lcvf("lczr", lcvb(int ), (int)34)) break;
                    v38 /* !! */  = (long)nx.lcvf("lczs", lcvb(int ), (int)35);
                }
                v39 = v37.field_1849;
                while (true) {
                    if ((v40 /* !! */  = (cfr_temp_15 = nx.tt - nx.lcvf("lczu", lcvs(int ), (int)42)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v40 /* !! */  == nx.lcvf("lczv", lcvb(int ), (int)36)) break;
                    v40 /* !! */  = (long)nx.lcvf("lczx", lcvb(int ), (int)37);
                }
                v41 = this.isKeyPressed(v39);
                while (true) {
                    if ((v42 /* !! */  = (cfr_temp_16 = nx.tt - nx.lcvf("lczy", lcvs(int ), (int)43)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v42 /* !! */  == nx.lcvf("lczz", lcvb(int ), (int)38)) break;
                    v42 /* !! */  = (long)nx.lcvf("ldaa", lcvb(int ), (int)39);
                }
                this.right = v41;
                if (var1_3 || var1_3) ** GOTO lbl21
                v43 /* !! */  = nx.tt;
                if (true) ** GOTO lbl237
                block118: while (true) {
                    v43 /* !! */  = (long)(v44 - nx.lcvf("lepn", lcvs(int ), (int)44));
lbl237:
                    // 2 sources

                    switch ((int)v43 /* !! */ ) {
                        case -1222426216: {
                            break block118;
                        }
                        case -265879236: {
                            v44 = nx.lcvf("lepq", lcvs(int ), (int)45);
                            continue block118;
                        }
                        case 1118993617: {
                            v44 = nx.lcvf("leps", lcvs(int ), (int)46);
                            continue block118;
                        }
                    }
                    break;
                }
                v45 /* !! */  = nx.tt;
                if (true) ** GOTO lbl250
                block119: while (true) {
                    v45 /* !! */  = (long)(v46 - nx.lcvf("lepu", lcvs(int ), (int)47));
lbl250:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1222426216: {
                            break block119;
                        }
                        case -133388344: {
                            v46 = nx.lcvf("lepx", lcvs(int ), (int)48);
                            continue block119;
                        }
                        case -17204039: {
                            v46 = nx.lcvf("lepz", lcvs(int ), (int)49);
                            continue block119;
                        }
                    }
                    break;
                }
                v47 = nx.mc.field_1690;
                while (true) {
                    if ((v48 /* !! */  = (cfr_temp_17 = nx.tt - nx.lcvf("leqb", lcvs(int ), (int)50)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v48 /* !! */  == nx.lcvf("leqc", lcvb(int ), (int)40)) break;
                    v48 /* !! */  = (long)nx.lcvf("leqe", lcvb(int ), (int)41);
                }
                v49 = v47.field_1903;
                v50 /* !! */  = nx.tt;
                if (true) ** GOTO lbl270
                block121: while (true) {
                    v50 /* !! */  = (long)(v51 - nx.lcvf("leqg", lcvs(int ), (int)51));
lbl270:
                    // 2 sources

                    switch ((int)v50 /* !! */ ) {
                        case -1222426216: {
                            break block121;
                        }
                        case -199946344: {
                            v51 = nx.lcvf("leqi", lcvs(int ), (int)52);
                            continue block121;
                        }
                        case -189601074: {
                            v51 = nx.lcvf("leqj", lcvs(int ), (int)53);
                            continue block121;
                        }
                        case 1132897380: {
                            v51 = nx.lcvf("leql", lcvs(int ), (int)54);
                            continue block121;
                        }
                    }
                    break;
                }
                v52 = this.isKeyPressed(v49);
                while (true) {
                    if ((v53 /* !! */  = (cfr_temp_18 = nx.tt - nx.lcvf("leqn", lcvs(int ), (int)55)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v53 /* !! */  == nx.lcvf("leqo", lcvb(int ), (int)42)) break;
                    v53 /* !! */  = (long)nx.lcvf("leqq", lcvb(int ), (int)43);
                }
                this.jump = v52;
                if (var1_3 || var1_3) ** GOTO lbl21
                while (true) {
                    if ((v54 /* !! */  = (cfr_temp_19 = nx.tt - nx.lcvf("leqs", lcvs(int ), (int)56)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v54 /* !! */  == nx.lcvf("leqt", lcvb(int ), (int)44)) break;
                    v54 /* !! */  = (long)nx.lcvf("leqv", lcvb(int ), (int)45);
                }
                v55 /* !! */  = nx.tt;
                if (true) ** GOTO lbl299
                block124: while (true) {
                    v55 /* !! */  = (long)(v56 - nx.lcvf("leqw", lcvs(int ), (int)57));
lbl299:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case -1779254632: {
                            v56 = nx.lcvf("leqy", lcvs(int ), (int)58);
                            continue block124;
                        }
                        case -1222426216: {
                            break block124;
                        }
                        case 1913383474: {
                            v56 = nx.lcvf("lera", lcvs(int ), (int)59);
                            continue block124;
                        }
                    }
                    break;
                }
                v57 = nx.mc.field_1724;
                v58 /* !! */  = nx.tt;
                if (true) ** GOTO lbl313
                block125: while (true) {
                    v58 /* !! */  = (long)(nx.lcvf("lerd", lcvs(int ), (int)61) - nx.lcvf("lerb", lcvs(int ), (int)60));
lbl313:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1222426216: {
                            break block125;
                        }
                        case 1129083296: {
                            continue block125;
                        }
                    }
                    break;
                }
                v59 = v57.method_5624();
                while (true) {
                    if ((v60 /* !! */  = (cfr_temp_20 = nx.tt - nx.lcvf("lerf", lcvs(int ), (int)62)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v60 /* !! */  == nx.lcvf("lerg", lcvb(int ), (int)46)) break;
                    v60 /* !! */  = (long)nx.lcvf("lerh", lcvb(int ), (int)47);
                }
                this.sprint = v59;
                if (var1_3 || var1_3) ** GOTO lbl21
                v61 = nx.lcvf("lerl", lcvb(int ), (int)48);
                while (true) {
                    if ((v62 /* !! */  = (cfr_temp_21 = nx.tt - nx.lcvf("lero", lcvs(int ), (int)63)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v62 /* !! */  == nx.lcvf("lerq", lcvb(int ), (int)49)) break;
                    v62 /* !! */  = (long)nx.lcvf("lerr", lcvb(int ), (int)50);
                }
                this.saved = v61;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
lbl336:
            // 2 sources

            case 0: {
                var2_2 /* !! */  = (int)nx.lcvf("leru", lcvb(int ), (int)51);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl370
            }
lbl341:
            // 3 sources

            case 1: {
                var2_2 /* !! */  = (int)nx.lcvf("lerw", lcvb(int ), (int)52);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl362
            }
            case 2: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nx.lcvf("lerx", lcvb(int ), (int)53);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl396
                    break;
                }
            }
lbl352:
            // 3 sources

            case 3: {
                var2_2 /* !! */  = (int)nx.lcvf("lesa", lcvb(int ), (int)54);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl409
            }
            case 4: {
                var2_2 /* !! */  = (int)nx.lcvf("lesd", lcvb(int ), (int)55);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl400
            }
lbl362:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nx.lcvf("lesf", lcvb(int ), (int)56);
                if (!var3_1) ** GOTO lbl341
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)nx.lcvf("lesh", lcvb(int ), (int)57);
                if (var3_1) {
                    throw null;
                }
            }
lbl370:
            // 4 sources

            case 7: {
                var2_2 /* !! */  = (int)nx.lcvf("lesj", lcvb(int ), (int)58);
                if (!var3_1) ** GOTO lbl352
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)nx.lcvf("lesl", lcvb(int ), (int)59);
                if (!var3_1) ** GOTO lbl341
                throw null;
            }
lbl378:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)nx.lcvf("lesn", lcvb(int ), (int)60);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl405
            }
            case 10: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("leso", lcvb(int ), (int)61);
                } while (!var3_1);
                throw null;
            }
            case 11: {
                var2_2 /* !! */  = (int)nx.lcvf("lesq", lcvb(int ), (int)62);
                if (!var3_1) ** GOTO lbl378
                throw null;
            }
            case 12: {
                var2_2 /* !! */  = (int)nx.lcvf("less", lcvb(int ), (int)63);
                if (!var3_1) ** GOTO lbl352
                throw null;
            }
lbl396:
            // 3 sources

            case 13: {
                var2_2 /* !! */  = (int)nx.lcvf("lesu", lcvb(int ), (int)64);
                if (var3_1) {
                    throw null;
                }
            }
lbl400:
            // 4 sources

            case 14: {
                var2_2 /* !! */  = (int)nx.lcvf("lesv", lcvb(int ), (int)65);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl419
            }
lbl405:
            // 3 sources

            case 15: {
                var2_2 /* !! */  = (int)nx.lcvf("lesw", lcvb(int ), (int)66);
                if (!var3_1) ** GOTO lbl336
                throw null;
            }
lbl409:
            // 2 sources

            case 16: {
                var2_2 /* !! */  = (int)nx.lcvf("lesx", lcvb(int ), (int)67);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl419
            }
            case 17: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("lesy", lcvb(int ), (int)68);
                } while (!var3_1);
                throw null;
            }
lbl419:
            // 3 sources

            case 18: {
                var2_2 /* !! */  = (int)nx.lcvf("leta", lcvb(int ), (int)69);
                if (!var3_1) break;
                throw null;
            }
            case 19: {
                var2_2 /* !! */  = (int)nx.lcvf("lete", lcvb(int ), (int)70);
                if (!var3_1) ** GOTO lbl396
                throw null;
            }
            case 20: {
                var2_2 /* !! */  = (int)nx.lcvf("leth", lcvb(int ), (int)71);
                if (!var3_1) ** GOTO lbl405
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)nx.lcvf("letl", lcvb(int ), (int)72);
        ** while (!var3_1)
lbl434:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lggf() {
        nx.lcvc[0] = -1970783113;
        nx.lcvc[1] = 2077296350;
        nx.lcvc[2] = 452665964;
        nx.lcvc[3] = -96933977;
        nx.lcvc[4] = 1838705230;
        nx.lcvc[5] = 822399758;
        nx.lcvc[6] = 1935977417;
        nx.lcvc[7] = 1836539017;
        nx.lcvc[8] = 1357612640;
        nx.lcvc[9] = 640297141;
        nx.lcvc[10] = 1739721089;
        nx.lcvc[11] = 1778597177;
        nx.lcvc[12] = 1828383155;
        nx.lcvc[13] = -657357778;
        nx.lcvc[14] = -1804993682;
        nx.lcvc[15] = -1450131971;
        nx.lcvc[16] = 1878591113;
        nx.lcvc[17] = 536087005;
        nx.lcvc[18] = 2067014278;
        nx.lcvc[19] = 1503991484;
        nx.lcvc[20] = -757263613;
        nx.lcvc[21] = 2118456364;
        nx.lcvc[22] = -1626393385;
        nx.lcvc[23] = -451715190;
        nx.lcvc[24] = 115635034;
        nx.lcvc[25] = 2139450887;
        nx.lcvc[26] = -707792178;
        nx.lcvc[27] = 202652391;
        nx.lcvc[28] = 1545234144;
        nx.lcvc[29] = -1550232624;
        nx.lcvc[30] = -1265814968;
        nx.lcvc[31] = -1125387291;
        nx.lcvc[32] = -779040599;
        nx.lcvc[33] = -1988832178;
        nx.lcvc[34] = -763962391;
        nx.lcvc[35] = -1475215659;
        nx.lcvc[36] = 2120629622;
        nx.lcvc[37] = 1531991485;
        nx.lcvc[38] = 981700502;
        nx.lcvc[39] = -461730059;
        nx.lcvc[40] = 2049875634;
        nx.lcvc[41] = -1138065070;
        nx.lcvc[42] = -634309293;
        nx.lcvc[43] = 709101129;
        nx.lcvc[44] = 1738962561;
        nx.lcvc[45] = -535464993;
        nx.lcvc[46] = -1999160148;
        nx.lcvc[47] = -776933106;
        nx.lcvc[48] = -2012924395;
        nx.lcvc[49] = 759327693;
        nx.lcvc[50] = 1508529359;
        nx.lcvc[51] = 642175444;
        nx.lcvc[52] = -1731620547;
        nx.lcvc[53] = -43076755;
        nx.lcvc[54] = 1005958042;
        nx.lcvc[55] = 1203847781;
        nx.lcvc[56] = -1319159034;
        nx.lcvc[57] = -791180684;
        nx.lcvc[58] = -906679549;
        nx.lcvc[59] = -866359806;
        nx.lcvc[60] = 545958712;
        nx.lcvc[61] = -1533559248;
        nx.lcvc[62] = 337349159;
        nx.lcvc[63] = 705150003;
        nx.lcvc[64] = -380522770;
        nx.lcvc[65] = 864225009;
        nx.lcvc[66] = 1440477407;
        nx.lcvc[67] = -1369130053;
        nx.lcvc[68] = -226146781;
        nx.lcvc[69] = 543945673;
        nx.lcvc[70] = 712472234;
        nx.lcvc[71] = 857301009;
        nx.lcvc[72] = -1000781111;
        nx.lcvc[73] = -1309371854;
        nx.lcvc[74] = 150200778;
        nx.lcvc[75] = -485904109;
        nx.lcvc[76] = 509369403;
        nx.lcvc[77] = -1360619694;
        nx.lcvc[78] = 2047236746;
        nx.lcvc[79] = 837053268;
        nx.lcvc[80] = 739324371;
        nx.lcvc[81] = -1650010868;
        nx.lcvc[82] = 801699800;
        nx.lcvc[83] = 79171512;
        nx.lcvc[84] = 899297226;
        nx.lcvc[85] = 428533903;
        nx.lcvc[86] = -1352455914;
        nx.lcvc[87] = 369548638;
        nx.lcvc[88] = -826896301;
        nx.lcvc[89] = -1323974277;
        nx.lcvc[90] = -1264513774;
        nx.lcvc[91] = 1869835917;
        nx.lcvc[92] = -39253035;
        nx.lcvc[93] = 763876055;
        nx.lcvc[94] = 1487651809;
        nx.lcvc[95] = 1091402987;
        nx.lcvc[96] = -1632818068;
        nx.lcvc[97] = 146815872;
        nx.lcvc[98] = -1500275359;
        nx.lcvc[99] = 665174837;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean isBlocked() {
        v0 /* !! */  = nx.tt;
        if (true) ** GOTO lbl5
        block19: while (true) {
            v0 /* !! */  = (long)(nx.lcvf("lgbk", lcvs(int ), (int)350) - nx.lcvf("lgbj", lcvs(int ), (int)349));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1560264980: {
                    continue block19;
                }
                case -1222426216: {
                    break block19;
                }
            }
            break;
        }
        var3_1 = nx.c;
        v1 /* !! */  = nx.tt;
        if (true) ** GOTO lbl15
        block20: while (true) {
            v1 /* !! */  = (long)(nx.lcvf("lgbn", lcvs(int ), (int)352) - nx.lcvf("lgbm", lcvs(int ), (int)351));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1291738812: {
                    continue block20;
                }
                case -1222426216: {
                    break block20;
                }
            }
            break;
        }
        var2_2 /* !! */  = nx.b;
        v2 /* !! */  = nx.tt;
        if (true) ** GOTO lbl25
        block21: while (true) {
            v2 /* !! */  = (long)(v3 - nx.lcvf("lgbp", lcvs(int ), (int)353));
lbl25:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1771746561: {
                    v3 = nx.lcvf("lgbq", lcvs(int ), (int)354);
                    continue block21;
                }
                case -1222426216: {
                    break block21;
                }
                case -532139927: {
                    v3 = nx.lcvf("lgbr", lcvs(int ), (int)355);
                    continue block21;
                }
            }
            break;
        }
        var1_3 = nx.a;
        if (!var3_1) ** GOTO lbl41
        throw null;
        {
            if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
            switch (var2_2 /* !! */ ) {
                default: lbl-1000:
                // 2 sources

                {
                    return (boolean)nx.lcvf("lgbt", lcvb(int ), (int)341);
                }
lbl41:
                // 1 sources

                if (var1_3 || var1_3) continue block22;
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lgbv", lcvs(int ), (int)356)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                        continue;
                    }
                    if (v4 /* !! */  == nx.lcvf("lgbw", lcvb(int ), (int)342)) break;
                    v4 /* !! */  = (long)nx.lcvf("lgbx", lcvb(int ), (int)343);
                }
                return this.blocked;
                case 0: lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var2_2 /* !! */  = (int)nx.lcvf("lgbz", lcvb(int ), (int)344);
                        if (!var3_1) break block22;
                        throw null;
                    }
                }
                case 1: {
                    var2_2 /* !! */  = (int)nx.lcvf("lgca", lcvb(int ), (int)345);
                    if (var3_1) {
                        throw null;
                    }
                }
                case 2: {
                    do {
                        var2_2 /* !! */  = (int)nx.lcvf("lgcc", lcvb(int ), (int)346);
                    } while (!var3_1);
                    throw null;
                }
                case 3: 
            }
        }
        var2_2 /* !! */  = (int)nx.lcvf("lgcd", lcvb(int ), (int)347);
        ** while (!var3_1)
lbl66:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isKeyPressed(class_304 var1_1) {
        v0 /* !! */  = nx.tt;
        if (true) ** GOTO lbl5
        block18: while (true) {
            v0 /* !! */  = (long)(nx.lcvf("lgdk", lcvs(int ), (int)369) - nx.lcvf("lgdj", lcvs(int ), (int)368));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1222426216: {
                    break block18;
                }
                case -78102190: {
                    continue block18;
                }
            }
            break;
        }
        var4_2 = nx.c;
        v1 /* !! */  = nx.tt;
        if (true) ** GOTO lbl15
        block19: while (true) {
            v1 /* !! */  = (long)(nx.lcvf("lgdm", lcvs(int ), (int)371) - nx.lcvf("lgdl", lcvs(int ), (int)370));
lbl15:
            // 2 sources

            switch ((int)v1 /* !! */ ) {
                case -1600686805: {
                    continue block19;
                }
                case -1222426216: {
                    break block19;
                }
            }
            break;
        }
        var3_3 /* !! */  = nx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lgdo", lcvs(int ), (int)372)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == nx.lcvf("lgdp", lcvb(int ), (int)360)) break;
            v2 /* !! */  = (long)nx.lcvf("lgdr", lcvb(int ), (int)361);
        }
        var2_4 = nx.a;
        if (var4_2) {
            throw null;
lbl30:
            // 2 sources

            return (boolean)nx.lcvf("lgds", lcvb(int ), (int)362);
        }
        if (var2_4) ** GOTO lbl30
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4) ** continue;
                v3 /* !! */  = nx.tt;
                if (true) ** GOTO lbl41
                block22: while (true) {
                    v3 /* !! */  = (long)(nx.lcvf("lgdu", lcvs(int ), (int)374) - nx.lcvf("lgdt", lcvs(int ), (int)373));
lbl41:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1841021468: {
                            continue block22;
                        }
                        case -1222426216: {
                            break block22;
                        }
                    }
                    break;
                }
                return var1_1.method_1434();
            }
lbl47:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)nx.lcvf("lgdv", lcvb(int ), (int)363);
                if (!var4_2) break;
                throw null;
            }
            case 1: {
                var3_3 /* !! */  = (int)nx.lcvf("lgdx", lcvb(int ), (int)364);
                if (!var4_2) ** GOTO lbl47
                throw null;
            }
            case 2: {
                do {
                    var3_3 /* !! */  = (int)nx.lcvf("lgdy", lcvb(int ), (int)365);
                } while (!var4_2);
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)nx.lcvf("lgea", lcvb(int ), (int)366);
        } while (!var4_2);
        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void stopSprint() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lezx", lcvs(int ), (int)121)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nx.lcvf("lezz", lcvb(int ), (int)123)) break;
            v0 /* !! */  = (long)nx.lcvf("lfaa", lcvb(int ), (int)124);
        }
        var3_1 = nx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("lfab", lcvs(int ), (int)122)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nx.lcvf("lfac", lcvb(int ), (int)125)) break;
            v1 /* !! */  = (long)nx.lcvf("lfad", lcvb(int ), (int)126);
        }
        var2_2 /* !! */  = nx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("lfae", lcvs(int ), (int)123)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nx.lcvf("lfaf", lcvb(int ), (int)127)) break;
            v2 /* !! */  = (long)nx.lcvf("lfah", lcvb(int ), (int)128);
        }
        var1_3 = nx.a;
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var3_1) {
                    throw null;
lbl24:
                    // 5 sources

                    return;
                }
                if (var1_3 || var1_3) ** GOTO lbl24
                v3 /* !! */  = nx.tt;
                if (true) ** GOTO lbl31
                block25: while (true) {
                    v3 /* !! */  = (long)(nx.lcvf("lfak", lcvs(int ), (int)125) - nx.lcvf("lfai", lcvs(int ), (int)124));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1288621320: {
                            continue block25;
                        }
                        case -1222426216: {
                            break block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v4 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("lfal", lcvs(int ), (int)126)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v4 /* !! */  == nx.lcvf("lfan", lcvb(int ), (int)129)) break;
                    v4 /* !! */  = (long)nx.lcvf("lfao", lcvb(int ), (int)130);
                }
                if (nx.mc.field_1724 == null) ** GOTO lbl88
                if (var1_3) ** GOTO lbl24
                v5 /* !! */  = nx.tt;
                if (true) ** GOTO lbl47
                block27: while (true) {
                    v5 /* !! */  = (long)(v6 - nx.lcvf("lfap", lcvs(int ), (int)127));
lbl47:
                    // 2 sources

                    switch ((int)v5 /* !! */ ) {
                        case -2123566927: {
                            v6 = nx.lcvf("lfar", lcvs(int ), (int)128);
                            continue block27;
                        }
                        case -1411769146: {
                            v6 = nx.lcvf("lfas", lcvs(int ), (int)129);
                            continue block27;
                        }
                        case -1222426216: {
                            break block27;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v7 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("lfat", lcvs(int ), (int)130)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v7 /* !! */  == nx.lcvf("lfav", lcvb(int ), (int)131)) break;
                    v7 /* !! */  = (long)nx.lcvf("lfaw", lcvb(int ), (int)132);
                }
                v8 = nx.mc.field_1724;
                while (true) {
                    if ((v9 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("lfax", lcvs(int ), (int)131)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v9 /* !! */  == nx.lcvf("lfaz", lcvb(int ), (int)133)) break;
                    v9 /* !! */  = (long)nx.lcvf("lfba", lcvb(int ), (int)134);
                }
                if (!v8.method_5624()) ** GOTO lbl88
                if (var1_3 || var1_3) ** GOTO lbl24
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_6 = nx.tt - nx.lcvf("lfbc", lcvs(int ), (int)132)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nx.lcvf("lfbd", lcvb(int ), (int)135)) break;
                    v10 /* !! */  = (long)nx.lcvf("lfbe", lcvb(int ), (int)136);
                }
                while (true) {
                    if ((v11 /* !! */  = (cfr_temp_7 = nx.tt - nx.lcvf("lfbf", lcvs(int ), (int)133)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v11 /* !! */  == nx.lcvf("lfbg", lcvb(int ), (int)137)) break;
                    v11 /* !! */  = (long)nx.lcvf("lfbh", lcvb(int ), (int)138);
                }
                v12 = nx.mc.field_1724;
                v13 = nx.lcvf("lfbi", lcvb(int ), (int)139);
                while (true) {
                    if ((v14 /* !! */  = (cfr_temp_8 = nx.tt - nx.lcvf("lfbk", lcvs(int ), (int)134)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v14 /* !! */  == nx.lcvf("lfbl", lcvb(int ), (int)140)) break;
                    v14 /* !! */  = (long)nx.lcvf("lfbm", lcvb(int ), (int)141);
                }
                v12.method_5728((boolean)v13);
                if (var1_3) ** GOTO lbl24
lbl88:
                // 3 sources

                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbo", lcvb(int ), (int)142);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl102
            }
lbl96:
            // 2 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nx.lcvf("lfbp", lcvb(int ), (int)143);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl112
                    break;
                }
            }
lbl102:
            // 3 sources

            case 2: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbq", lcvb(int ), (int)144);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl112
            }
            case 3: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbs", lcvb(int ), (int)145);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
lbl112:
            // 3 sources

            case 4: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbt", lcvb(int ), (int)146);
                if (!var3_1) break;
                throw null;
            }
            case 5: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbv", lcvb(int ), (int)147);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl125
            }
            case 6: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbw", lcvb(int ), (int)148);
                if (!var3_1) ** GOTO lbl96
                throw null;
            }
lbl125:
            // 3 sources

            case 7: {
                var2_2 /* !! */  = (int)nx.lcvf("lfbx", lcvb(int ), (int)149);
                if (!var3_1) ** GOTO lbl102
                throw null;
            }
            case 8: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("lfbz", lcvb(int ), (int)150);
                } while (!var3_1);
                throw null;
            }
            case 9: 
        }
        var2_2 /* !! */  = (int)nx.lcvf("lfca", lcvb(int ), (int)151);
        ** while (!var3_1)
lbl137:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lghb() {
        nx.lcve[300] = 228686581;
        nx.lcve[301] = -1586220041;
        nx.lcve[302] = 2129666117;
        nx.lcve[303] = 1175848724;
        nx.lcve[304] = -1281559218;
        nx.lcve[305] = 191503795;
        nx.lcve[306] = -1072111311;
        nx.lcve[307] = 1315021574;
        nx.lcve[308] = 1204166273;
        nx.lcve[309] = -782621081;
        nx.lcve[310] = -706151427;
        nx.lcve[311] = -1088497698;
        nx.lcve[312] = 1977971759;
        nx.lcve[313] = 298845996;
        nx.lcve[314] = -729888055;
        nx.lcve[315] = -233958066;
        nx.lcve[316] = 170480057;
        nx.lcve[317] = 891575160;
        nx.lcve[318] = -2010725739;
        nx.lcve[319] = -1812108214;
        nx.lcve[320] = -1937369262;
        nx.lcve[321] = -36864082;
        nx.lcve[322] = 333897384;
        nx.lcve[323] = -1256127592;
        nx.lcve[324] = 573001250;
        nx.lcve[325] = -137374216;
        nx.lcve[326] = -1803931696;
        nx.lcve[327] = 1443921654;
        nx.lcve[328] = -274404495;
        nx.lcve[329] = 1312266329;
        nx.lcve[330] = 145589698;
        nx.lcve[331] = 1206114881;
        nx.lcve[332] = -193559071;
        nx.lcve[333] = 28543825;
        nx.lcve[334] = 643249721;
        nx.lcve[335] = -1058217081;
        nx.lcve[336] = -1715243983;
        nx.lcve[337] = -1532545286;
        nx.lcve[338] = 784908456;
        nx.lcve[339] = -1191909916;
        nx.lcve[340] = -1519720822;
        nx.lcve[341] = 1344557994;
        nx.lcve[342] = -1695384992;
        nx.lcve[343] = 1726166793;
        nx.lcve[344] = 1213955030;
        nx.lcve[345] = -287113260;
        nx.lcve[346] = 190214845;
        nx.lcve[347] = 5973221;
        nx.lcve[348] = -1379475778;
        nx.lcve[349] = 80363902;
        nx.lcve[350] = 1858016782;
        nx.lcve[351] = -1390216708;
        nx.lcve[352] = 1937269440;
        nx.lcve[353] = -726333266;
        nx.lcve[354] = -147854900;
        nx.lcve[355] = -181036841;
        nx.lcve[356] = 1937041469;
        nx.lcve[357] = -1966402003;
        nx.lcve[358] = -1135281774;
        nx.lcve[359] = 1706043238;
        nx.lcve[360] = -515856374;
        nx.lcve[361] = -1392088609;
        nx.lcve[362] = -1056999056;
        nx.lcve[363] = -76151742;
        nx.lcve[364] = -619348171;
        nx.lcve[365] = 1143006369;
        nx.lcve[366] = -762462056;
        nx.lcve[367] = 2139070646;
        nx.lcve[368] = -1909905576;
        nx.lcve[369] = 1102324459;
        nx.lcve[370] = -1627217109;
        nx.lcve[371] = -573982533;
        nx.lcve[372] = -973880377;
        nx.lcve[373] = 1792607556;
        nx.lcve[374] = 35366956;
        nx.lcve[375] = -1974383369;
        nx.lcve[376] = -127676631;
        nx.lcve[377] = -1833418081;
        nx.lcve[378] = 83260684;
        nx.lcve[379] = -148782696;
        nx.lcve[380] = 933716768;
        nx.lcve[381] = 2023643681;
        nx.lcve[382] = 1538413626;
        nx.lcve[383] = 533829082;
    }

    private static /* synthetic */ void lggk() {
        nx.lcvc[100] = 1050641736;
        nx.lcvc[101] = -1940287712;
        nx.lcvc[102] = 1380116869;
        nx.lcvc[103] = -121692980;
        nx.lcvc[104] = 1776599062;
        nx.lcvc[105] = -703514405;
        nx.lcvc[106] = 625626042;
        nx.lcvc[107] = -393399475;
        nx.lcvc[108] = 185870212;
        nx.lcvc[109] = -258712908;
        nx.lcvc[110] = 1291806611;
        nx.lcvc[111] = -1984939995;
        nx.lcvc[112] = 613557890;
        nx.lcvc[113] = 776704929;
        nx.lcvc[114] = 1283298426;
        nx.lcvc[115] = 1456795225;
        nx.lcvc[116] = -665886699;
        nx.lcvc[117] = 1227178457;
        nx.lcvc[118] = -1809356060;
        nx.lcvc[119] = -788768729;
        nx.lcvc[120] = -873561351;
        nx.lcvc[121] = -1817522941;
        nx.lcvc[122] = 1855414554;
        nx.lcvc[123] = -259969446;
        nx.lcvc[124] = 85243632;
        nx.lcvc[125] = -380065546;
        nx.lcvc[126] = 286973996;
        nx.lcvc[127] = -1456085192;
        nx.lcvc[128] = -1886771811;
        nx.lcvc[129] = 1080724275;
        nx.lcvc[130] = 2127456183;
        nx.lcvc[131] = 838463790;
        nx.lcvc[132] = 1214490392;
        nx.lcvc[133] = -73864737;
        nx.lcvc[134] = 1939092300;
        nx.lcvc[135] = 1019990772;
        nx.lcvc[136] = -542466014;
        nx.lcvc[137] = -1618068211;
        nx.lcvc[138] = -1391425349;
        nx.lcvc[139] = 1373481172;
        nx.lcvc[140] = 121065705;
        nx.lcvc[141] = 949886226;
        nx.lcvc[142] = -477979981;
        nx.lcvc[143] = 1554356952;
        nx.lcvc[144] = 1244001906;
        nx.lcvc[145] = 900730960;
        nx.lcvc[146] = -1866151060;
        nx.lcvc[147] = -55803415;
        nx.lcvc[148] = 223217819;
        nx.lcvc[149] = -1194587899;
        nx.lcvc[150] = -51720012;
        nx.lcvc[151] = -1703748086;
        nx.lcvc[152] = 484819225;
        nx.lcvc[153] = 720751414;
        nx.lcvc[154] = -1665345853;
        nx.lcvc[155] = 385412396;
        nx.lcvc[156] = -1678691378;
        nx.lcvc[157] = 985401276;
        nx.lcvc[158] = 781560388;
        nx.lcvc[159] = -925375835;
        nx.lcvc[160] = -586029054;
        nx.lcvc[161] = -1604454748;
        nx.lcvc[162] = -2131317419;
        nx.lcvc[163] = 2069163345;
        nx.lcvc[164] = 1810154675;
        nx.lcvc[165] = 510525922;
        nx.lcvc[166] = -444438365;
        nx.lcvc[167] = -2075606235;
        nx.lcvc[168] = -1166125222;
        nx.lcvc[169] = 1497794449;
        nx.lcvc[170] = 679005830;
        nx.lcvc[171] = -2127909274;
        nx.lcvc[172] = -197705816;
        nx.lcvc[173] = 519115280;
        nx.lcvc[174] = -736934285;
        nx.lcvc[175] = 666697969;
        nx.lcvc[176] = 1677878495;
        nx.lcvc[177] = 954193880;
        nx.lcvc[178] = 611572358;
        nx.lcvc[179] = 1435497867;
        nx.lcvc[180] = 1088443015;
        nx.lcvc[181] = 1782606438;
        nx.lcvc[182] = 200861660;
        nx.lcvc[183] = 875293810;
        nx.lcvc[184] = -1888676167;
        nx.lcvc[185] = -1368516877;
        nx.lcvc[186] = 1321439442;
        nx.lcvc[187] = -2029723956;
        nx.lcvc[188] = -215543912;
        nx.lcvc[189] = 2000835783;
        nx.lcvc[190] = 1778998;
        nx.lcvc[191] = -1183156871;
        nx.lcvc[192] = 692571863;
        nx.lcvc[193] = 677127720;
        nx.lcvc[194] = 922065207;
        nx.lcvc[195] = 610594083;
        nx.lcvc[196] = 1069305557;
        nx.lcvc[197] = 1875839945;
        nx.lcvc[198] = -1934793302;
        nx.lcvc[199] = -1785548048;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void reset() {
        v0 /* !! */  = nx.tt;
        if (true) ** GOTO lbl5
        block28: while (true) {
            v0 /* !! */  = (long)(v1 - nx.lcvf("lgch", lcvs(int ), (int)357));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1829476117: {
                    v1 = nx.lcvf("lgci", lcvs(int ), (int)358);
                    continue block28;
                }
                case -1436454200: {
                    v1 = nx.lcvf("lgcj", lcvs(int ), (int)359);
                    continue block28;
                }
                case -1222426216: {
                    break block28;
                }
            }
            break;
        }
        var3_1 = nx.c;
        v2 /* !! */  = nx.tt;
        if (true) ** GOTO lbl19
        block29: while (true) {
            v2 /* !! */  = (long)(nx.lcvf("lgcl", lcvs(int ), (int)361) - nx.lcvf("lgck", lcvs(int ), (int)360));
lbl19:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1525782560: {
                    continue block29;
                }
                case -1222426216: {
                    break block29;
                }
            }
            break;
        }
        var2_2 /* !! */  = nx.b;
        v3 /* !! */  = nx.tt;
        if (true) ** GOTO lbl29
        block30: while (true) {
            v3 /* !! */  = (long)(v4 - nx.lcvf("lgcm", lcvs(int ), (int)362));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -1643980200: {
                    v4 = nx.lcvf("lgcn", lcvs(int ), (int)363);
                    continue block30;
                }
                case -1222426216: {
                    break block30;
                }
                case 753189450: {
                    v4 = nx.lcvf("lgco", lcvs(int ), (int)364);
                    continue block30;
                }
            }
            break;
        }
        var1_3 = nx.a;
        if (var3_1) {
            throw null;
lbl41:
            // 4 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl41
        v5 = nx.lcvf("lgcp", lcvb(int ), (int)348);
        v6 /* !! */  = nx.tt;
        if (true) ** GOTO lbl49
        block32: while (true) {
            v6 /* !! */  = (long)(nx.lcvf("lgcr", lcvs(int ), (int)366) - nx.lcvf("lgcq", lcvs(int ), (int)365));
lbl49:
            // 2 sources

            switch ((int)v6 /* !! */ ) {
                case -1222426216: {
                    break block32;
                }
                case -69256275: {
                    continue block32;
                }
            }
            break;
        }
        this.saved = v5;
        if (var1_3) ** GOTO lbl41
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl41
                v7 = nx.lcvf("lgct", lcvb(int ), (int)349);
                while (true) {
                    if ((v8 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lgcu", lcvs(int ), (int)367)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                    if (v8 /* !! */  == nx.lcvf("lgcw", lcvb(int ), (int)350)) break;
                    v8 /* !! */  = (long)nx.lcvf("lgcx", lcvb(int ), (int)351);
                }
                this.blocked = v7;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nx.lcvf("lgcy", lcvb(int ), (int)352);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl85
            }
lbl75:
            // 3 sources

            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nx.lcvf("lgda", lcvb(int ), (int)353);
                    if (var3_1) {
                        throw null;
                    }
                    ** GOTO lbl85
                    break;
                }
            }
            case 2: {
                var2_2 /* !! */  = (int)nx.lcvf("lgdb", lcvb(int ), (int)354);
                if (var3_1) {
                    throw null;
                }
            }
lbl85:
            // 5 sources

            case 3: {
                var2_2 /* !! */  = (int)nx.lcvf("lgdc", lcvb(int ), (int)355);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 4: {
                var2_2 /* !! */  = (int)nx.lcvf("lgde", lcvb(int ), (int)356);
                if (var3_1) {
                    throw null;
                }
            }
lbl93:
            // 4 sources

            case 5: {
                var2_2 /* !! */  = (int)nx.lcvf("lgdf", lcvb(int ), (int)357);
                if (!var3_1) ** GOTO lbl75
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)nx.lcvf("lgdh", lcvb(int ), (int)358);
                if (!var3_1) ** GOTO lbl93
                throw null;
            }
            case 7: 
        }
        var2_2 /* !! */  = (int)nx.lcvf("lgdi", lcvb(int ), (int)359);
        ** while (!var3_1)
lbl104:
        // 1 sources

        throw null;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private boolean isCurrentlyPressed(class_304 var1_1) {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lgee", lcvs(int ), (int)375)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nx.lcvf("lgef", lcvb(int ), (int)367)) break;
            v0 /* !! */  = (long)nx.lcvf("lgeg", lcvb(int ), (int)368);
        }
        var4_2 = nx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("lgei", lcvs(int ), (int)376)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nx.lcvf("lgej", lcvb(int ), (int)369)) break;
            v1 /* !! */  = (long)nx.lcvf("lgek", lcvb(int ), (int)370);
        }
        var3_3 /* !! */  = nx.b;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("lgel", lcvs(int ), (int)377)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v2 /* !! */  == nx.lcvf("lgen", lcvb(int ), (int)371)) break;
            v2 /* !! */  = (long)nx.lcvf("lgeo", lcvb(int ), (int)372);
        }
        var2_4 = nx.a;
        if (var4_2) {
            throw null;
            return (boolean)nx.lcvf("lgep", lcvb(int ), (int)373);
        }
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var2_4 || var2_4) ** continue;
                v3 /* !! */  = nx.tt;
                if (true) ** GOTO lbl31
                block25: while (true) {
                    v3 /* !! */  = (long)(v4 - nx.lcvf("lger", lcvs(int ), (int)378));
lbl31:
                    // 2 sources

                    switch ((int)v3 /* !! */ ) {
                        case -1881883375: {
                            v4 = nx.lcvf("lges", lcvs(int ), (int)379);
                            continue block25;
                        }
                        case -1222426216: {
                            break block25;
                        }
                        case -466074896: {
                            v4 = nx.lcvf("lgeu", lcvs(int ), (int)380);
                            continue block25;
                        }
                        case 452177889: {
                            v4 = nx.lcvf("lgev", lcvs(int ), (int)381);
                            continue block25;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v5 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("lgew", lcvs(int ), (int)382)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                    if (v5 /* !! */  == nx.lcvf("lgex", lcvb(int ), (int)374)) break;
                    v5 /* !! */  = (long)nx.lcvf("lgey", lcvb(int ), (int)375);
                }
                v6 = nx.mc.method_22683();
                v7 /* !! */  = nx.tt;
                if (true) ** GOTO lbl53
                block27: while (true) {
                    v7 /* !! */  = (long)(v8 - nx.lcvf("lgez", lcvs(int ), (int)383));
lbl53:
                    // 2 sources

                    switch ((int)v7 /* !! */ ) {
                        case -2119971795: {
                            v8 = nx.lcvf("lgfl", lcvs(int ), (int)384);
                            continue block27;
                        }
                        case -1222426216: {
                            break block27;
                        }
                        case 1461828399: {
                            v8 = nx.lcvf("lgfn", lcvs(int ), (int)385);
                            continue block27;
                        }
                    }
                    break;
                }
                v9 = var1_1.method_1428();
                while (true) {
                    if ((v10 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("lgfp", lcvs(int ), (int)386)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                    if (v10 /* !! */  == nx.lcvf("lgfq", lcvb(int ), (int)376)) break;
                    v10 /* !! */  = (long)nx.lcvf("lgfs", lcvb(int ), (int)377);
                }
                v11 = class_3675.method_15981((String)v9);
                while (true) {
                    if ((v12 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("lgft", lcvs(int ), (int)387)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v12 /* !! */  == nx.lcvf("lgfv", lcvb(int ), (int)378)) break;
                    v12 /* !! */  = (long)nx.lcvf("lgfw", lcvb(int ), (int)379);
                }
                v13 = v11.method_1444();
                v14 /* !! */  = nx.tt;
                if (true) ** GOTO lbl79
                block30: while (true) {
                    v14 /* !! */  = (long)(nx.lcvf("lgfy", lcvs(int ), (int)389) - nx.lcvf("lgfx", lcvs(int ), (int)388));
lbl79:
                    // 2 sources

                    switch ((int)v14 /* !! */ ) {
                        case -1222426216: {
                            break block30;
                        }
                        case -747021459: {
                            continue block30;
                        }
                    }
                    break;
                }
                return class_3675.method_15987((class_1041)v6, (int)v13);
            }
lbl85:
            // 2 sources

            case 0: {
                var3_3 /* !! */  = (int)nx.lcvf("lgga", lcvb(int ), (int)380);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl94
            }
            case 1: {
                var3_3 /* !! */  = (int)nx.lcvf("lggb", lcvb(int ), (int)381);
                if (!var4_2) ** GOTO lbl85
                throw null;
            }
lbl94:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)nx.lcvf("lggd", lcvb(int ), (int)382);
                if (!var4_2) break;
                throw null;
            }
            case 3: 
        }
        do {
            var3_3 /* !! */  = (int)nx.lcvf("lgge", lcvb(int ), (int)383);
        } while (!var4_2);
        throw null;
    }

    private static /* synthetic */ void lghe() {
        nx.lcvu[0] = -3826264702195165173L;
        nx.lcvu[1] = 703952581991668740L;
        nx.lcvu[2] = -4499017076560701278L;
        nx.lcvu[3] = 7457283972551884374L;
        nx.lcvu[4] = -3942510634945079874L;
        nx.lcvu[5] = 1974644700241017443L;
        nx.lcvu[6] = 7155398617185878554L;
        nx.lcvu[7] = 8367137164181347116L;
        nx.lcvu[8] = -1246598581697802163L;
        nx.lcvu[9] = -2031391997039779659L;
        nx.lcvu[10] = -2608331330643128358L;
        nx.lcvu[11] = -1353325385895294809L;
        nx.lcvu[12] = -4157499758499442794L;
        nx.lcvu[13] = 5127883232626359710L;
        nx.lcvu[14] = -5761907636062575134L;
        nx.lcvu[15] = -4387130625044889400L;
        nx.lcvu[16] = -5326841136021030998L;
        nx.lcvu[17] = 8120935961037516805L;
        nx.lcvu[18] = -7294124484686107591L;
        nx.lcvu[19] = -5547336738165910587L;
        nx.lcvu[20] = -7228775356996121200L;
        nx.lcvu[21] = -4304460116179223924L;
        nx.lcvu[22] = -5880571246997901250L;
        nx.lcvu[23] = 2953144643033978897L;
        nx.lcvu[24] = -2159834853543851669L;
        nx.lcvu[25] = 4182875972800880894L;
        nx.lcvu[26] = 1289949070245663296L;
        nx.lcvu[27] = -1205021020659469352L;
        nx.lcvu[28] = -863335250504356747L;
        nx.lcvu[29] = -341104505117775920L;
        nx.lcvu[30] = 8805281155393467355L;
        nx.lcvu[31] = 1474425939884274815L;
        nx.lcvu[32] = -5031090504096490321L;
        nx.lcvu[33] = 4377311578036702287L;
        nx.lcvu[34] = 9107502551561061239L;
        nx.lcvu[35] = 9063882234541775980L;
        nx.lcvu[36] = -4816383691557686386L;
        nx.lcvu[37] = -8359273472254807537L;
        nx.lcvu[38] = 589956931411691572L;
        nx.lcvu[39] = -9022585967972971741L;
        nx.lcvu[40] = 858821587979862277L;
        nx.lcvu[41] = 7777139833223130207L;
        nx.lcvu[42] = -7253988944880958833L;
        nx.lcvu[43] = 5999344520735787602L;
        nx.lcvu[44] = 8401669669622258244L;
        nx.lcvu[45] = 7020090881233863755L;
        nx.lcvu[46] = -9049999745874211221L;
        nx.lcvu[47] = 3855721751322870564L;
        nx.lcvu[48] = 4368676237899110933L;
        nx.lcvu[49] = -7644149012022208702L;
        nx.lcvu[50] = -1281190116883197567L;
        nx.lcvu[51] = -7254259118630420241L;
        nx.lcvu[52] = -809518036770034206L;
        nx.lcvu[53] = -36692727610061129L;
        nx.lcvu[54] = -1041231241301629402L;
        nx.lcvu[55] = -6624395816754242246L;
        nx.lcvu[56] = -1364809596487536830L;
        nx.lcvu[57] = -8975981205789174727L;
        nx.lcvu[58] = 4190593494473144048L;
        nx.lcvu[59] = 7835272054586680313L;
        nx.lcvu[60] = -1733284788213177532L;
        nx.lcvu[61] = 1516721145631375243L;
        nx.lcvu[62] = -6752451074326730239L;
        nx.lcvu[63] = 4864296898826913530L;
        nx.lcvu[64] = -6182383777965131543L;
        nx.lcvu[65] = -542275871178643694L;
        nx.lcvu[66] = 3026348286860714388L;
        nx.lcvu[67] = -4482034605304606727L;
        nx.lcvu[68] = -5542331823969330504L;
        nx.lcvu[69] = -4833051893308256879L;
        nx.lcvu[70] = -7306533310054841961L;
        nx.lcvu[71] = -6223111943774467531L;
        nx.lcvu[72] = 4814135599357266089L;
        nx.lcvu[73] = -4409217076925821754L;
        nx.lcvu[74] = -3982785249039986578L;
        nx.lcvu[75] = -883515213667661211L;
        nx.lcvu[76] = 7092929663644505495L;
        nx.lcvu[77] = 5046981945892261107L;
        nx.lcvu[78] = 299487335712385742L;
        nx.lcvu[79] = -6499140818408079119L;
        nx.lcvu[80] = 5664295482712068923L;
        nx.lcvu[81] = 9039982097260455682L;
        nx.lcvu[82] = 4536217099916342502L;
        nx.lcvu[83] = 5814125154395018366L;
        nx.lcvu[84] = 5024558951007952747L;
        nx.lcvu[85] = 6403613888888615435L;
        nx.lcvu[86] = -3474600381132691774L;
        nx.lcvu[87] = 6346315891622020648L;
        nx.lcvu[88] = 8827741944260521902L;
        nx.lcvu[89] = 8814719191471836344L;
        nx.lcvu[90] = -4403716150956743070L;
        nx.lcvu[91] = -4871377040745918431L;
        nx.lcvu[92] = -6105342421467744630L;
        nx.lcvu[93] = -8169862668508638787L;
        nx.lcvu[94] = -7105508659189081551L;
        nx.lcvu[95] = 3307459328750560641L;
        nx.lcvu[96] = -6041467079824644L;
        nx.lcvu[97] = -3725878894759719685L;
        nx.lcvu[98] = 6489250142341805527L;
        nx.lcvu[99] = 857432977810607790L;
    }

    private static /* synthetic */ void lghv() {
        nx.lcvv[100] = 5727450299938664069L;
        nx.lcvv[101] = 5236407921811833459L;
        nx.lcvv[102] = 4033238570529681814L;
        nx.lcvv[103] = -9141249083155778456L;
        nx.lcvv[104] = -4442532562225659823L;
        nx.lcvv[105] = 7324338584018415298L;
        nx.lcvv[106] = -8739540440036454438L;
        nx.lcvv[107] = 7247592975832899310L;
        nx.lcvv[108] = -1291013559616980569L;
        nx.lcvv[109] = 7236514558444277396L;
        nx.lcvv[110] = -1554690636163709341L;
        nx.lcvv[111] = 8500547717209751465L;
        nx.lcvv[112] = 234206366664299156L;
        nx.lcvv[113] = -6923604870336918200L;
        nx.lcvv[114] = -1628929576142970203L;
        nx.lcvv[115] = 4242961919331298483L;
        nx.lcvv[116] = 6022006930583027001L;
        nx.lcvv[117] = 8132093873047135834L;
        nx.lcvv[118] = -8444593788251934040L;
        nx.lcvv[119] = -7521092982496038261L;
        nx.lcvv[120] = -8302725593347472185L;
        nx.lcvv[121] = -8470055521701811098L;
        nx.lcvv[122] = 963996470034905448L;
        nx.lcvv[123] = -84512648094762145L;
        nx.lcvv[124] = -2103763270982302691L;
        nx.lcvv[125] = 1250721711848549895L;
        nx.lcvv[126] = 6513106674348686605L;
        nx.lcvv[127] = -5773339638880125524L;
        nx.lcvv[128] = -6237781643980445733L;
        nx.lcvv[129] = 2125109768527254841L;
        nx.lcvv[130] = -7923254814435820062L;
        nx.lcvv[131] = 2418836512578422094L;
        nx.lcvv[132] = 1795470646379065992L;
        nx.lcvv[133] = 5171595307121633670L;
        nx.lcvv[134] = -2437892549265503019L;
        nx.lcvv[135] = -7743376722231597963L;
        nx.lcvv[136] = -2824484355073475109L;
        nx.lcvv[137] = -7327405612943843987L;
        nx.lcvv[138] = 2477157638945535540L;
        nx.lcvv[139] = -8035767069529190220L;
        nx.lcvv[140] = -1412669736470536533L;
        nx.lcvv[141] = 9094626383210456382L;
        nx.lcvv[142] = 3477480513851516833L;
        nx.lcvv[143] = 2030628520464650337L;
        nx.lcvv[144] = 5956653405349330325L;
        nx.lcvv[145] = 7120098550185681484L;
        nx.lcvv[146] = 5828052920301213200L;
        nx.lcvv[147] = -8884791768040247774L;
        nx.lcvv[148] = 3072538267736949519L;
        nx.lcvv[149] = 477166318515741921L;
        nx.lcvv[150] = -910166146417932044L;
        nx.lcvv[151] = -4965924569684240134L;
        nx.lcvv[152] = 1346504972993551373L;
        nx.lcvv[153] = 8272891430812288519L;
        nx.lcvv[154] = 5480346491625430907L;
        nx.lcvv[155] = 9164643366368439752L;
        nx.lcvv[156] = 9046214966251926763L;
        nx.lcvv[157] = 8451911564866512590L;
        nx.lcvv[158] = 4828267593196431890L;
        nx.lcvv[159] = -2938048572784147714L;
        nx.lcvv[160] = -1279208533377316595L;
        nx.lcvv[161] = -832254783859081397L;
        nx.lcvv[162] = 3013467305620114710L;
        nx.lcvv[163] = -1907102561112390857L;
        nx.lcvv[164] = 567851829104790015L;
        nx.lcvv[165] = 5235966060246171158L;
        nx.lcvv[166] = 310257968883097058L;
        nx.lcvv[167] = -8843405696905369312L;
        nx.lcvv[168] = 2578817248352262669L;
        nx.lcvv[169] = -6882920730675133786L;
        nx.lcvv[170] = -5663012856777328367L;
        nx.lcvv[171] = -5176525352236772121L;
        nx.lcvv[172] = -5663366601510564779L;
        nx.lcvv[173] = -5947537177485893057L;
        nx.lcvv[174] = 217375750288665850L;
        nx.lcvv[175] = 5059051232793617661L;
        nx.lcvv[176] = 7483167473582689062L;
        nx.lcvv[177] = 1252001421609912604L;
        nx.lcvv[178] = 7069859269944865601L;
        nx.lcvv[179] = 5551700060759221711L;
        nx.lcvv[180] = 6071440285311988500L;
        nx.lcvv[181] = -2105183102357057815L;
        nx.lcvv[182] = -7026216897319856003L;
        nx.lcvv[183] = 3610039122828292297L;
        nx.lcvv[184] = -8364934029886032817L;
        nx.lcvv[185] = 2525076809892121607L;
        nx.lcvv[186] = -270802294574243772L;
        nx.lcvv[187] = -7582257868576170714L;
        nx.lcvv[188] = -1977613355476941010L;
        nx.lcvv[189] = 5606610594192556119L;
        nx.lcvv[190] = 7344856448772451272L;
        nx.lcvv[191] = 7022311252096261464L;
        nx.lcvv[192] = -2997071673604441942L;
        nx.lcvv[193] = 3233882048522825200L;
        nx.lcvv[194] = -2338039649037607590L;
        nx.lcvv[195] = -3182138981853281270L;
        nx.lcvv[196] = 6389042510855553162L;
        nx.lcvv[197] = 6006666375583093595L;
        nx.lcvv[198] = 7824192800496519535L;
        nx.lcvv[199] = 7575006125105941142L;
    }

    private static /* synthetic */ void lghs() {
        nx.lcvv[0] = 403135046947709528L;
        nx.lcvv[1] = -8789867321737921095L;
        nx.lcvv[2] = -1129351816991755320L;
        nx.lcvv[3] = 2330656526933424408L;
        nx.lcvv[4] = 6173031407434395501L;
        nx.lcvv[5] = -4787853955403784545L;
        nx.lcvv[6] = 2832676781369172967L;
        nx.lcvv[7] = 2905531910557636548L;
        nx.lcvv[8] = 9160888427825053999L;
        nx.lcvv[9] = 1335980533774526093L;
        nx.lcvv[10] = -1444981346688219695L;
        nx.lcvv[11] = -6445669321002535696L;
        nx.lcvv[12] = -8089962542053493363L;
        nx.lcvv[13] = -8122562755129542063L;
        nx.lcvv[14] = 483045553817497346L;
        nx.lcvv[15] = 7603418139592512123L;
        nx.lcvv[16] = 6293421306748976516L;
        nx.lcvv[17] = -4742897064759400747L;
        nx.lcvv[18] = 3699902679092913314L;
        nx.lcvv[19] = 9078291261998481640L;
        nx.lcvv[20] = -3544804120579671580L;
        nx.lcvv[21] = 5295911359983225874L;
        nx.lcvv[22] = 2027073465180481023L;
        nx.lcvv[23] = 2917078520085268022L;
        nx.lcvv[24] = 3371675960882642441L;
        nx.lcvv[25] = -7477061489450059769L;
        nx.lcvv[26] = -7457133560434720928L;
        nx.lcvv[27] = 3797426095487036806L;
        nx.lcvv[28] = -7050546000802385207L;
        nx.lcvv[29] = 4520991920487749885L;
        nx.lcvv[30] = 8556919341548423085L;
        nx.lcvv[31] = -8844704902930713229L;
        nx.lcvv[32] = 4979470911373155907L;
        nx.lcvv[33] = 5984662994577898283L;
        nx.lcvv[34] = -2850353736071321137L;
        nx.lcvv[35] = -1251702554664508031L;
        nx.lcvv[36] = 5024638641566298887L;
        nx.lcvv[37] = 516764859845733804L;
        nx.lcvv[38] = 8112348959874427022L;
        nx.lcvv[39] = -7423229170842621576L;
        nx.lcvv[40] = -1241012083538496498L;
        nx.lcvv[41] = 9124414087493057741L;
        nx.lcvv[42] = 1965287436550943156L;
        nx.lcvv[43] = -417394135142617665L;
        nx.lcvv[44] = 5860321178493067438L;
        nx.lcvv[45] = 7472122276792780955L;
        nx.lcvv[46] = -5953509867347415286L;
        nx.lcvv[47] = -2452749306274015264L;
        nx.lcvv[48] = 2006292014587006569L;
        nx.lcvv[49] = -7376758890284379311L;
        nx.lcvv[50] = -2877361933729373712L;
        nx.lcvv[51] = 9202666842889132825L;
        nx.lcvv[52] = 739199170876342260L;
        nx.lcvv[53] = 545652020176937653L;
        nx.lcvv[54] = -3839926524149108725L;
        nx.lcvv[55] = -5431641562962702796L;
        nx.lcvv[56] = 5110271899184719140L;
        nx.lcvv[57] = -6178415562895770889L;
        nx.lcvv[58] = 1266196071382914775L;
        nx.lcvv[59] = -3161728521760644856L;
        nx.lcvv[60] = 9170890554004255918L;
        nx.lcvv[61] = -4814426867477121824L;
        nx.lcvv[62] = -490019956525848070L;
        nx.lcvv[63] = -8294838141880667617L;
        nx.lcvv[64] = -7851908054068699007L;
        nx.lcvv[65] = 1614377248413593650L;
        nx.lcvv[66] = 3076398457041466021L;
        nx.lcvv[67] = -8943076143723805628L;
        nx.lcvv[68] = -228076513929166383L;
        nx.lcvv[69] = -6775634947268019569L;
        nx.lcvv[70] = 7067159072261311026L;
        nx.lcvv[71] = 83971252366645301L;
        nx.lcvv[72] = 275061289831631047L;
        nx.lcvv[73] = 3838809009449571055L;
        nx.lcvv[74] = 5401248508912127702L;
        nx.lcvv[75] = 6934987963178182574L;
        nx.lcvv[76] = -2261486417096757362L;
        nx.lcvv[77] = 2135790573215085264L;
        nx.lcvv[78] = -6673977578050603087L;
        nx.lcvv[79] = 6188852175585241040L;
        nx.lcvv[80] = 2513311872921971384L;
        nx.lcvv[81] = -3748259681860690504L;
        nx.lcvv[82] = -3920826730242771848L;
        nx.lcvv[83] = 8370446537192612140L;
        nx.lcvv[84] = 9217574986532533495L;
        nx.lcvv[85] = 5178866700828981307L;
        nx.lcvv[86] = -2685086522323611495L;
        nx.lcvv[87] = 7886757819097830138L;
        nx.lcvv[88] = -9189900503121477346L;
        nx.lcvv[89] = -7159468458353742949L;
        nx.lcvv[90] = 5167535524410230529L;
        nx.lcvv[91] = -4857280988619586797L;
        nx.lcvv[92] = -1243634628672149824L;
        nx.lcvv[93] = -6448841193983962104L;
        nx.lcvv[94] = 9170026872458006682L;
        nx.lcvv[95] = -1483792577781829245L;
        nx.lcvv[96] = 3736267006068554399L;
        nx.lcvv[97] = 8335154756667252704L;
        nx.lcvv[98] = 1028444766548378025L;
        nx.lcvv[99] = -4537043987314124688L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void restore() {
        block232: {
            while (true) {
                if ((v0 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lfco", lcvs(int ), (int)135)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
                if (v0 /* !! */  == nx.lcvf("lfcp", lcvb(int ), (int)152)) break;
                v0 /* !! */  = (long)nx.lcvf("lfcq", lcvb(int ), (int)153);
            }
            var3_1 = nx.c;
            v1 /* !! */  = nx.tt;
            if (true) ** GOTO lbl11
            block147: while (true) {
                v1 /* !! */  = (long)(nx.lcvf("lfct", lcvs(int ), (int)137) - nx.lcvf("lfcs", lcvs(int ), (int)136));
lbl11:
                // 2 sources

                switch ((int)v1 /* !! */ ) {
                    case -1222426216: {
                        break block147;
                    }
                    case 168533135: {
                        continue block147;
                    }
                }
                break;
            }
            var2_2 /* !! */  = nx.b;
            v2 /* !! */  = nx.tt;
            if (true) ** GOTO lbl21
            block148: while (true) {
                v2 /* !! */  = (long)(nx.lcvf("lfcv", lcvs(int ), (int)139) - nx.lcvf("lfcu", lcvs(int ), (int)138));
lbl21:
                // 2 sources

                switch ((int)v2 /* !! */ ) {
                    case -1222426216: {
                        break block148;
                    }
                    case 447267327: {
                        continue block148;
                    }
                }
                break;
            }
            var1_3 = nx.a;
            if (var3_1) {
                throw null;
lbl29:
                // 11 sources

                return;
            }
            if (var1_3 || var1_3) ** GOTO lbl29
            while (true) {
                if ((v3 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("lfcx", lcvs(int ), (int)140)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                if (v3 /* !! */  == nx.lcvf("lfcy", lcvb(int ), (int)154)) break;
                v3 /* !! */  = (long)nx.lcvf("lfda", lcvb(int ), (int)155);
            }
            if (this.saved) break block232;
            if (var1_3) ** GOTO lbl29
            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v4 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("lfdb", lcvs(int ), (int)141)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v4 /* !! */  == nx.lcvf("lfdc", lcvb(int ), (int)156)) break;
            v4 /* !! */  = (long)nx.lcvf("lfdd", lcvb(int ), (int)157);
        }
        while (true) {
            if ((v5 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("lfde", lcvs(int ), (int)142)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v5 /* !! */  == nx.lcvf("lfdf", lcvb(int ), (int)158)) break;
            v5 /* !! */  = (long)nx.lcvf("lfdh", lcvb(int ), (int)159);
        }
        v6 = nx.mc.field_1690;
        v7 /* !! */  = nx.tt;
        if (true) ** GOTO lbl57
        block153: while (true) {
            v7 /* !! */  = (long)(nx.lcvf("lfdk", lcvs(int ), (int)144) - nx.lcvf("lfdi", lcvs(int ), (int)143));
lbl57:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1222426216: {
                    break block153;
                }
                case -849153253: {
                    continue block153;
                }
            }
            break;
        }
        v8 = v6.field_1894;
        while (true) {
            if ((v9 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("lfdl", lcvs(int ), (int)145)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v9 /* !! */  == nx.lcvf("lfdn", lcvb(int ), (int)160)) break;
            v9 /* !! */  = (long)nx.lcvf("lfdo", lcvb(int ), (int)161);
        }
        if (!this.forward) ** GOTO lbl-1000
        while (true) {
            if ((v10 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("lfdq", lcvs(int ), (int)146)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
            if (v10 /* !! */  == nx.lcvf("lfdr", lcvb(int ), (int)162)) break;
            v10 /* !! */  = (long)nx.lcvf("lfds", lcvb(int ), (int)163);
        }
        v11 /* !! */  = nx.tt;
        if (true) ** GOTO lbl78
        block156: while (true) {
            v11 /* !! */  = (long)(v12 - nx.lcvf("lfdt", lcvs(int ), (int)147));
lbl78:
            // 2 sources

            switch ((int)v11 /* !! */ ) {
                case -1555400755: {
                    v12 = nx.lcvf("lfdu", lcvs(int ), (int)148);
                    continue block156;
                }
                case -1222426216: {
                    break block156;
                }
                case 335526336: {
                    v12 = nx.lcvf("lfdv", lcvs(int ), (int)149);
                    continue block156;
                }
                case 672712235: {
                    v12 = nx.lcvf("lfdw", lcvs(int ), (int)150);
                    continue block156;
                }
            }
            break;
        }
        v13 = nx.mc.field_1690;
        while (true) {
            if ((v14 /* !! */  = (cfr_temp_6 = nx.tt - nx.lcvf("lfdx", lcvs(int ), (int)151)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
            if (v14 /* !! */  == nx.lcvf("lfdy", lcvb(int ), (int)164)) break;
            v14 /* !! */  = (long)nx.lcvf("lfdz", lcvb(int ), (int)165);
        }
        v15 = v13.field_1894;
        while (true) {
            if ((v16 /* !! */  = (cfr_temp_7 = nx.tt - nx.lcvf("lfeb", lcvs(int ), (int)152)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
            if (v16 /* !! */  == nx.lcvf("lfec", lcvb(int ), (int)166)) break;
            v16 /* !! */  = (long)nx.lcvf("lfee", lcvb(int ), (int)167);
        }
        if (this.isCurrentlyPressed(v15)) {
            v17 = nx.lcvf("lfef", lcvb(int ), (int)168);
            if (var3_1) {
                throw null;
            }
        } else lbl-1000:
        // 2 sources

        {
            v17 = nx.lcvf("lfeg", lcvb(int ), (int)169);
        }
        while (true) {
            if ((v18 /* !! */  = (cfr_temp_8 = nx.tt - nx.lcvf("lfeh", lcvs(int ), (int)153)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
            if (v18 /* !! */  == nx.lcvf("lfej", lcvb(int ), (int)170)) break;
            v18 /* !! */  = (long)nx.lcvf("lfek", lcvb(int ), (int)171);
        }
        v8.method_23481((boolean)v17);
        if (var1_3 || var1_3) ** GOTO lbl29
        while (true) {
            if ((v19 /* !! */  = (cfr_temp_9 = nx.tt - nx.lcvf("lfel", lcvs(int ), (int)154)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
            if (v19 /* !! */  == nx.lcvf("lfen", lcvb(int ), (int)172)) break;
            v19 /* !! */  = (long)nx.lcvf("lfeo", lcvb(int ), (int)173);
        }
        while (true) {
            if ((v20 /* !! */  = (cfr_temp_10 = nx.tt - nx.lcvf("lfep", lcvs(int ), (int)155)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
            if (v20 /* !! */  == nx.lcvf("lfer", lcvb(int ), (int)174)) break;
            v20 /* !! */  = (long)nx.lcvf("lfes", lcvb(int ), (int)175);
        }
        v21 = nx.mc.field_1690;
        while (true) {
            if ((v22 /* !! */  = (cfr_temp_11 = nx.tt - nx.lcvf("lfet", lcvs(int ), (int)156)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
            if (v22 /* !! */  == nx.lcvf("lfev", lcvb(int ), (int)176)) break;
            v22 /* !! */  = (long)nx.lcvf("lfew", lcvb(int ), (int)177);
        }
        v23 = v21.field_1881;
        while (true) {
            if ((v24 /* !! */  = (cfr_temp_12 = nx.tt - nx.lcvf("lfex", lcvs(int ), (int)157)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
            if (v24 /* !! */  == nx.lcvf("lfez", lcvb(int ), (int)178)) break;
            v24 /* !! */  = (long)nx.lcvf("lffa", lcvb(int ), (int)179);
        }
        if (!this.back) ** GOTO lbl-1000
        v25 /* !! */  = nx.tt;
        if (true) ** GOTO lbl142
        block164: while (true) {
            v25 /* !! */  = (long)(v26 - nx.lcvf("lffc", lcvs(int ), (int)158));
lbl142:
            // 2 sources

            switch ((int)v25 /* !! */ ) {
                case -1757453274: {
                    v26 = nx.lcvf("lffd", lcvs(int ), (int)159);
                    continue block164;
                }
                case -1222426216: {
                    break block164;
                }
                case -500879040: {
                    v26 = nx.lcvf("lffe", lcvs(int ), (int)160);
                    continue block164;
                }
                case 1205279058: {
                    v26 = nx.lcvf("lffg", lcvs(int ), (int)161);
                    continue block164;
                }
            }
            break;
        }
        v27 /* !! */  = nx.tt;
        if (true) ** GOTO lbl158
        block165: while (true) {
            v27 /* !! */  = (long)(v28 - nx.lcvf("lffh", lcvs(int ), (int)162));
lbl158:
            // 2 sources

            switch ((int)v27 /* !! */ ) {
                case -1541451266: {
                    v28 = nx.lcvf("lffj", lcvs(int ), (int)163);
                    continue block165;
                }
                case -1399209651: {
                    v28 = nx.lcvf("lffk", lcvs(int ), (int)164);
                    continue block165;
                }
                case -1222426216: {
                    break block165;
                }
                case 34230963: {
                    v28 = nx.lcvf("lffl", lcvs(int ), (int)165);
                    continue block165;
                }
            }
            break;
        }
        v29 = nx.mc.field_1690;
        while (true) {
            if ((v30 /* !! */  = (cfr_temp_13 = nx.tt - nx.lcvf("lffn", lcvs(int ), (int)166)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
            if (v30 /* !! */  == nx.lcvf("lffo", lcvb(int ), (int)180)) break;
            v30 /* !! */  = (long)nx.lcvf("lffq", lcvb(int ), (int)181);
        }
        v31 = v29.field_1881;
        v32 /* !! */  = nx.tt;
        if (true) ** GOTO lbl181
        block167: while (true) {
            v32 /* !! */  = (long)(v33 - nx.lcvf("lffr", lcvs(int ), (int)167));
lbl181:
            // 2 sources

            switch ((int)v32 /* !! */ ) {
                case -1821418606: {
                    v33 = nx.lcvf("lfft", lcvs(int ), (int)168);
                    continue block167;
                }
                case -1222426216: {
                    break block167;
                }
                case 79535470: {
                    v33 = nx.lcvf("lffu", lcvs(int ), (int)169);
                    continue block167;
                }
                case 1428676746: {
                    v33 = nx.lcvf("lffv", lcvs(int ), (int)170);
                    continue block167;
                }
            }
            break;
        }
        if (this.isCurrentlyPressed(v31)) {
            v34 = nx.lcvf("lffx", lcvb(int ), (int)182);
            if (var3_1) {
                throw null;
            }
        } else lbl-1000:
        // 2 sources

        {
            v34 = nx.lcvf("lffy", lcvb(int ), (int)183);
        }
        v35 /* !! */  = nx.tt;
        if (true) ** GOTO lbl203
        block168: while (true) {
            v35 /* !! */  = (long)(v36 - nx.lcvf("lffz", lcvs(int ), (int)171));
lbl203:
            // 2 sources

            switch ((int)v35 /* !! */ ) {
                case -1960655726: {
                    v36 = nx.lcvf("lfgb", lcvs(int ), (int)172);
                    continue block168;
                }
                case -1226561841: {
                    v36 = nx.lcvf("lfgc", lcvs(int ), (int)173);
                    continue block168;
                }
                case -1222426216: {
                    break block168;
                }
                case 881028444: {
                    v36 = nx.lcvf("lfge", lcvs(int ), (int)174);
                    continue block168;
                }
            }
            break;
        }
        v23.method_23481((boolean)v34);
        if (var1_3) ** GOTO lbl29
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl29
                v37 /* !! */  = nx.tt;
                if (true) ** GOTO lbl225
                block169: while (true) {
                    v37 /* !! */  = (long)(v38 - nx.lcvf("lfgg", lcvs(int ), (int)175));
lbl225:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -1620405671: {
                            v38 = nx.lcvf("lfgh", lcvs(int ), (int)176);
                            continue block169;
                        }
                        case -1545230536: {
                            v38 = nx.lcvf("lfgj", lcvs(int ), (int)177);
                            continue block169;
                        }
                        case -1222426216: {
                            break block169;
                        }
                        case 229892015: {
                            v38 = nx.lcvf("lfgk", lcvs(int ), (int)178);
                            continue block169;
                        }
                    }
                    break;
                }
                v39 /* !! */  = nx.tt;
                if (true) ** GOTO lbl241
                block170: while (true) {
                    v39 /* !! */  = (long)(nx.lcvf("lfgn", lcvs(int ), (int)180) - nx.lcvf("lfgm", lcvs(int ), (int)179));
lbl241:
                    // 2 sources

                    switch ((int)v39 /* !! */ ) {
                        case -1222426216: {
                            break block170;
                        }
                        case 584971762: {
                            continue block170;
                        }
                    }
                    break;
                }
                v40 = nx.mc.field_1690;
                while (true) {
                    if ((v41 /* !! */  = (cfr_temp_14 = nx.tt - nx.lcvf("lfgo", lcvs(int ), (int)181)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v41 /* !! */  == nx.lcvf("lfgp", lcvb(int ), (int)184)) break;
                    v41 /* !! */  = (long)nx.lcvf("lfgq", lcvb(int ), (int)185);
                }
                v42 = v40.field_1913;
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_15 = nx.tt - nx.lcvf("lfgr", lcvs(int ), (int)182)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == nx.lcvf("lfgs", lcvb(int ), (int)186)) break;
                    v43 /* !! */  = (long)nx.lcvf("lfgu", lcvb(int ), (int)187);
                }
                if (!this.left) ** GOTO lbl-1000
                while (true) {
                    if ((v44 /* !! */  = (cfr_temp_16 = nx.tt - nx.lcvf("lfgx", lcvs(int ), (int)183)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v44 /* !! */  == nx.lcvf("lfgz", lcvb(int ), (int)188)) break;
                    v44 /* !! */  = (long)nx.lcvf("lfhb", lcvb(int ), (int)189);
                }
                v45 /* !! */  = nx.tt;
                if (true) ** GOTO lbl268
                block174: while (true) {
                    v45 /* !! */  = (long)(v46 - nx.lcvf("lfhd", lcvs(int ), (int)184));
lbl268:
                    // 2 sources

                    switch ((int)v45 /* !! */ ) {
                        case -1222426216: {
                            break block174;
                        }
                        case -86648322: {
                            v46 = nx.lcvf("lfhe", lcvs(int ), (int)185);
                            continue block174;
                        }
                        case 948699875: {
                            v46 = nx.lcvf("lfhg", lcvs(int ), (int)186);
                            continue block174;
                        }
                    }
                    break;
                }
                v47 = nx.mc.field_1690;
                v48 /* !! */  = nx.tt;
                if (true) ** GOTO lbl282
                block175: while (true) {
                    v48 /* !! */  = (long)(v49 - nx.lcvf("lfhi", lcvs(int ), (int)187));
lbl282:
                    // 2 sources

                    switch ((int)v48 /* !! */ ) {
                        case -1222426216: {
                            break block175;
                        }
                        case 473901355: {
                            v49 = nx.lcvf("lfhj", lcvs(int ), (int)188);
                            continue block175;
                        }
                        case 980589106: {
                            v49 = nx.lcvf("lfhl", lcvs(int ), (int)189);
                            continue block175;
                        }
                    }
                    break;
                }
                v50 = v47.field_1913;
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_17 = nx.tt - nx.lcvf("lfhn", lcvs(int ), (int)190)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == nx.lcvf("lfhp", lcvb(int ), (int)190)) break;
                    v51 /* !! */  = (long)nx.lcvf("lfhq", lcvb(int ), (int)191);
                }
                if (this.isCurrentlyPressed(v50)) {
                    v52 = nx.lcvf("lfhv", lcvb(int ), (int)192);
                    if (var3_1) {
                        throw null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v52 = nx.lcvf("lfhx", lcvb(int ), (int)193);
                }
                while (true) {
                    if ((v53 /* !! */  = (cfr_temp_18 = nx.tt - nx.lcvf("lfhz", lcvs(int ), (int)191)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v53 /* !! */  == nx.lcvf("lfib", lcvb(int ), (int)194)) break;
                    v53 /* !! */  = (long)nx.lcvf("lfic", lcvb(int ), (int)195);
                }
                v42.method_23481((boolean)v52);
                if (var1_3 || var1_3) ** GOTO lbl29
                v54 /* !! */  = nx.tt;
                if (true) ** GOTO lbl314
                block178: while (true) {
                    v54 /* !! */  = (long)(nx.lcvf("lfih", lcvs(int ), (int)193) - nx.lcvf("lfif", lcvs(int ), (int)192));
lbl314:
                    // 2 sources

                    switch ((int)v54 /* !! */ ) {
                        case -1222426216: {
                            break block178;
                        }
                        case 473138880: {
                            continue block178;
                        }
                    }
                    break;
                }
                v55 /* !! */  = nx.tt;
                if (true) ** GOTO lbl323
                block179: while (true) {
                    v55 /* !! */  = (long)(v56 - nx.lcvf("lfij", lcvs(int ), (int)194));
lbl323:
                    // 2 sources

                    switch ((int)v55 /* !! */ ) {
                        case -1456749440: {
                            v56 = nx.lcvf("lfil", lcvs(int ), (int)195);
                            continue block179;
                        }
                        case -1222426216: {
                            break block179;
                        }
                        case 2052580189: {
                            v56 = nx.lcvf("lfin", lcvs(int ), (int)196);
                            continue block179;
                        }
                    }
                    break;
                }
                v57 = nx.mc.field_1690;
                v58 /* !! */  = nx.tt;
                if (true) ** GOTO lbl337
                block180: while (true) {
                    v58 /* !! */  = (long)(nx.lcvf("lfiq", lcvs(int ), (int)198) - nx.lcvf("lfip", lcvs(int ), (int)197));
lbl337:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1651871200: {
                            continue block180;
                        }
                        case -1222426216: {
                            break block180;
                        }
                    }
                    break;
                }
                v59 = v57.field_1849;
                while (true) {
                    if ((v60 /* !! */  = (cfr_temp_19 = nx.tt - nx.lcvf("lfit", lcvs(int ), (int)199)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v60 /* !! */  == nx.lcvf("lfiv", lcvb(int ), (int)196)) break;
                    v60 /* !! */  = (long)nx.lcvf("lfix", lcvb(int ), (int)197);
                }
                if (!this.right) ** GOTO lbl-1000
                while (true) {
                    if ((v61 /* !! */  = (cfr_temp_20 = nx.tt - nx.lcvf("lfja", lcvs(int ), (int)200)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v61 /* !! */  == nx.lcvf("lfjb", lcvb(int ), (int)198)) break;
                    v61 /* !! */  = (long)nx.lcvf("lfjd", lcvb(int ), (int)199);
                }
                v62 /* !! */  = nx.tt;
                if (true) ** GOTO lbl358
                block183: while (true) {
                    v62 /* !! */  = (long)(v63 - nx.lcvf("lfjf", lcvs(int ), (int)201));
lbl358:
                    // 2 sources

                    switch ((int)v62 /* !! */ ) {
                        case -1222426216: {
                            break block183;
                        }
                        case 150164714: {
                            v63 = nx.lcvf("lfjh", lcvs(int ), (int)202);
                            continue block183;
                        }
                        case 564304648: {
                            v63 = nx.lcvf("lfjj", lcvs(int ), (int)203);
                            continue block183;
                        }
                    }
                    break;
                }
                v64 = nx.mc.field_1690;
                v65 /* !! */  = nx.tt;
                if (true) ** GOTO lbl372
                block184: while (true) {
                    v65 /* !! */  = (long)(v66 - nx.lcvf("lfjl", lcvs(int ), (int)204));
lbl372:
                    // 2 sources

                    switch ((int)v65 /* !! */ ) {
                        case -2144409553: {
                            v66 = nx.lcvf("lfjm", lcvs(int ), (int)205);
                            continue block184;
                        }
                        case -1755289777: {
                            v66 = nx.lcvf("lfjo", lcvs(int ), (int)206);
                            continue block184;
                        }
                        case -1222426216: {
                            break block184;
                        }
                    }
                    break;
                }
                v67 = v64.field_1849;
                while (true) {
                    if ((v68 /* !! */  = (cfr_temp_21 = nx.tt - nx.lcvf("lfjp", lcvs(int ), (int)207)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v68 /* !! */  == nx.lcvf("lfjq", lcvb(int ), (int)200)) break;
                    v68 /* !! */  = (long)nx.lcvf("lfjr", lcvb(int ), (int)201);
                }
                if (this.isCurrentlyPressed(v67)) {
                    v69 = nx.lcvf("lfjs", lcvb(int ), (int)202);
                    if (var3_1) {
                        throw null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v69 = nx.lcvf("lfjt", lcvb(int ), (int)203);
                }
                while (true) {
                    if ((v70 /* !! */  = (cfr_temp_22 = nx.tt - nx.lcvf("lfjv", lcvs(int ), (int)208)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v70 /* !! */  == nx.lcvf("lfjx", lcvb(int ), (int)204)) break;
                    v70 /* !! */  = (long)nx.lcvf("lfjz", lcvb(int ), (int)205);
                }
                v59.method_23481((boolean)v69);
                if (var1_3 || var1_3) ** GOTO lbl29
                v71 /* !! */  = nx.tt;
                if (true) ** GOTO lbl404
                block187: while (true) {
                    v71 /* !! */  = (long)(v72 - nx.lcvf("lfkd", lcvs(int ), (int)209));
lbl404:
                    // 2 sources

                    switch ((int)v71 /* !! */ ) {
                        case -1893853281: {
                            v72 = nx.lcvf("lfke", lcvs(int ), (int)210);
                            continue block187;
                        }
                        case -1222426216: {
                            break block187;
                        }
                        case 1638362278: {
                            v72 = nx.lcvf("lfkh", lcvs(int ), (int)211);
                            continue block187;
                        }
                        case 1979117862: {
                            v72 = nx.lcvf("lfki", lcvs(int ), (int)212);
                            continue block187;
                        }
                    }
                    break;
                }
                v73 /* !! */  = nx.tt;
                if (true) ** GOTO lbl420
                block188: while (true) {
                    v73 /* !! */  = (long)(v74 - nx.lcvf("lfkk", lcvs(int ), (int)213));
lbl420:
                    // 2 sources

                    switch ((int)v73 /* !! */ ) {
                        case -1910704799: {
                            v74 = nx.lcvf("lfkl", lcvs(int ), (int)214);
                            continue block188;
                        }
                        case -1222426216: {
                            break block188;
                        }
                        case -751741919: {
                            v74 = nx.lcvf("lfkn", lcvs(int ), (int)215);
                            continue block188;
                        }
                        case 651202852: {
                            v74 = nx.lcvf("lfkp", lcvs(int ), (int)216);
                            continue block188;
                        }
                    }
                    break;
                }
                v75 = nx.mc.field_1690;
                while (true) {
                    if ((v76 /* !! */  = (cfr_temp_23 = nx.tt - nx.lcvf("lfkr", lcvs(int ), (int)217)) == 0L ? 0 : (cfr_temp_23 < 0L ? -1 : 1)) == false) continue;
                    if (v76 /* !! */  == nx.lcvf("lfkt", lcvb(int ), (int)206)) break;
                    v76 /* !! */  = (long)nx.lcvf("lfku", lcvb(int ), (int)207);
                }
                v77 = v75.field_1903;
                while (true) {
                    if ((v78 /* !! */  = (cfr_temp_24 = nx.tt - nx.lcvf("lfkx", lcvs(int ), (int)218)) == 0L ? 0 : (cfr_temp_24 < 0L ? -1 : 1)) == false) continue;
                    if (v78 /* !! */  == nx.lcvf("lfky", lcvb(int ), (int)208)) break;
                    v78 /* !! */  = (long)nx.lcvf("lfla", lcvb(int ), (int)209);
                }
                if (!this.jump) ** GOTO lbl-1000
                v79 /* !! */  = nx.tt;
                if (true) ** GOTO lbl449
                block191: while (true) {
                    v79 /* !! */  = (long)(v80 - nx.lcvf("lflc", lcvs(int ), (int)219));
lbl449:
                    // 2 sources

                    switch ((int)v79 /* !! */ ) {
                        case -1962689790: {
                            v80 = nx.lcvf("lfle", lcvs(int ), (int)220);
                            continue block191;
                        }
                        case -1222426216: {
                            break block191;
                        }
                        case 1993624407: {
                            v80 = nx.lcvf("lflf", lcvs(int ), (int)221);
                            continue block191;
                        }
                        case 2065729261: {
                            v80 = nx.lcvf("lflg", lcvs(int ), (int)222);
                            continue block191;
                        }
                    }
                    break;
                }
                v81 /* !! */  = nx.tt;
                if (true) ** GOTO lbl465
                block192: while (true) {
                    v81 /* !! */  = (long)(nx.lcvf("lflk", lcvs(int ), (int)224) - nx.lcvf("lfli", lcvs(int ), (int)223));
lbl465:
                    // 2 sources

                    switch ((int)v81 /* !! */ ) {
                        case -1222426216: {
                            break block192;
                        }
                        case -1055768892: {
                            continue block192;
                        }
                    }
                    break;
                }
                v82 = nx.mc.field_1690;
                v83 /* !! */  = nx.tt;
                if (true) ** GOTO lbl475
                block193: while (true) {
                    v83 /* !! */  = (long)(nx.lcvf("lflo", lcvs(int ), (int)226) - nx.lcvf("lflm", lcvs(int ), (int)225));
lbl475:
                    // 2 sources

                    switch ((int)v83 /* !! */ ) {
                        case -1222426216: {
                            break block193;
                        }
                        case -88020182: {
                            continue block193;
                        }
                    }
                    break;
                }
                v84 = v82.field_1903;
                v85 /* !! */  = nx.tt;
                if (true) ** GOTO lbl485
                block194: while (true) {
                    v85 /* !! */  = (long)(v86 - nx.lcvf("lflq", lcvs(int ), (int)227));
lbl485:
                    // 2 sources

                    switch ((int)v85 /* !! */ ) {
                        case -1222426216: {
                            break block194;
                        }
                        case -1193697119: {
                            v86 = nx.lcvf("lfls", lcvs(int ), (int)228);
                            continue block194;
                        }
                        case 37501480: {
                            v86 = nx.lcvf("lflt", lcvs(int ), (int)229);
                            continue block194;
                        }
                        case 589074596: {
                            v86 = nx.lcvf("lflv", lcvs(int ), (int)230);
                            continue block194;
                        }
                    }
                    break;
                }
                if (this.isCurrentlyPressed(v84)) {
                    v87 = nx.lcvf("lflx", lcvb(int ), (int)210);
                    if (var3_1) {
                        throw null;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    v87 = nx.lcvf("lflz", lcvb(int ), (int)211);
                }
                while (true) {
                    if ((v88 /* !! */  = (cfr_temp_25 = nx.tt - nx.lcvf("lfma", lcvs(int ), (int)231)) == 0L ? 0 : (cfr_temp_25 < 0L ? -1 : 1)) == false) continue;
                    if (v88 /* !! */  == nx.lcvf("lfmc", lcvb(int ), (int)212)) break;
                    v88 /* !! */  = (long)nx.lcvf("lfme", lcvb(int ), (int)213);
                }
                v77.method_23481((boolean)v87);
                if (var1_3 || var1_3) ** GOTO lbl29
                v89 = nx.lcvf("lfmg", lcvb(int ), (int)214);
                while (true) {
                    if ((v90 /* !! */  = (cfr_temp_26 = nx.tt - nx.lcvf("lfmh", lcvs(int ), (int)232)) == 0L ? 0 : (cfr_temp_26 < 0L ? -1 : 1)) == false) continue;
                    if (v90 /* !! */  == nx.lcvf("lfmj", lcvb(int ), (int)215)) break;
                    v90 /* !! */  = (long)nx.lcvf("lfml", lcvb(int ), (int)216);
                }
                this.blocked = v89;
                if (var1_3 || var1_3) ** GOTO lbl29
                v91 = nx.lcvf("lfmn", lcvb(int ), (int)217);
                v92 /* !! */  = nx.tt;
                if (true) ** GOTO lbl523
                block197: while (true) {
                    v92 /* !! */  = (long)(v93 - nx.lcvf("lfmp", lcvs(int ), (int)233));
lbl523:
                    // 2 sources

                    switch ((int)v92 /* !! */ ) {
                        case -1222426216: {
                            break block197;
                        }
                        case -1198912621: {
                            v93 = nx.lcvf("lfmq", lcvs(int ), (int)234);
                            continue block197;
                        }
                        case 942184395: {
                            v93 = nx.lcvf("lfmr", lcvs(int ), (int)235);
                            continue block197;
                        }
                    }
                    break;
                }
                this.saved = v91;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nx.lcvf("lfms", lcvb(int ), (int)218);
                if (!var3_1) break;
                throw null;
            }
lbl540:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nx.lcvf("lfmw", lcvb(int ), (int)219);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl613
            }
            case 2: {
                var2_2 /* !! */  = (int)nx.lcvf("lfmz", lcvb(int ), (int)220);
                if (!var3_1) ** GOTO lbl540
                throw null;
            }
lbl549:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnc", lcvb(int ), (int)221);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl588
            }
lbl554:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nx.lcvf("lfne", lcvb(int ), (int)222);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl613
            }
lbl559:
            // 2 sources

            case 5: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnh", lcvb(int ), (int)223);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl592
            }
lbl564:
            // 2 sources

            case 6: {
                var2_2 /* !! */  = (int)nx.lcvf("lfni", lcvb(int ), (int)224);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl626
            }
            case 7: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnk", lcvb(int ), (int)225);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl592
            }
            case 8: {
                var2_2 /* !! */  = (int)nx.lcvf("lfno", lcvb(int ), (int)226);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl617
            }
lbl579:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnq", lcvb(int ), (int)227);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl596
            }
lbl584:
            // 2 sources

            case 10: {
                var2_2 /* !! */  = (int)nx.lcvf("lfns", lcvb(int ), (int)228);
                if (!var3_1) ** GOTO lbl549
                throw null;
            }
lbl588:
            // 2 sources

            case 11: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnu", lcvb(int ), (int)229);
                if (!var3_1) break;
                throw null;
            }
lbl592:
            // 4 sources

            case 12: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnx", lcvb(int ), (int)230);
                if (!var3_1) break;
                throw null;
            }
lbl596:
            // 2 sources

            case 13: {
                var2_2 /* !! */  = (int)nx.lcvf("lfnz", lcvb(int ), (int)231);
                if (!var3_1) break;
                throw null;
            }
            case 14: {
                var2_2 /* !! */  = (int)nx.lcvf("lfoa", lcvb(int ), (int)232);
                if (!var3_1) ** GOTO lbl584
                throw null;
            }
            case 15: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("lfob", lcvb(int ), (int)233);
                } while (!var3_1);
                throw null;
            }
            case 16: {
                var2_2 /* !! */  = (int)nx.lcvf("lfoc", lcvb(int ), (int)234);
                if (!var3_1) ** GOTO lbl554
                throw null;
            }
lbl613:
            // 3 sources

            case 17: {
                var2_2 /* !! */  = (int)nx.lcvf("lfod", lcvb(int ), (int)235);
                if (!var3_1) ** GOTO lbl592
                throw null;
            }
lbl617:
            // 2 sources

            case 18: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nx.lcvf("lfog", lcvb(int ), (int)236);
                    if (!var3_1) ** GOTO lbl579
                    throw null;
                }
            }
            case 19: {
                var2_2 /* !! */  = (int)nx.lcvf("lfoj", lcvb(int ), (int)237);
                if (!var3_1) ** GOTO lbl564
                throw null;
            }
lbl626:
            // 2 sources

            case 20: {
                var2_2 /* !! */  = (int)nx.lcvf("lfom", lcvb(int ), (int)238);
                if (!var3_1) ** GOTO lbl559
                throw null;
            }
            case 21: 
        }
        var2_2 /* !! */  = (int)nx.lcvf("lfop", lcvb(int ), (int)239);
        ** while (!var3_1)
lbl633:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void lgib() {
        nx.lcvv[300] = 4869534211807950481L;
        nx.lcvv[301] = 4826370822573379679L;
        nx.lcvv[302] = -7439421245594467075L;
        nx.lcvv[303] = -4785303710184393555L;
        nx.lcvv[304] = 4512893965790766483L;
        nx.lcvv[305] = -1374988436396931349L;
        nx.lcvv[306] = 6531165737537847808L;
        nx.lcvv[307] = 8860885605043334661L;
        nx.lcvv[308] = -4731228396286534966L;
        nx.lcvv[309] = -8760908226732843229L;
        nx.lcvv[310] = -3622406029698574736L;
        nx.lcvv[311] = 4922936891332204699L;
        nx.lcvv[312] = 7035532426460136621L;
        nx.lcvv[313] = 3439227657596870722L;
        nx.lcvv[314] = 2743998693808650318L;
        nx.lcvv[315] = 2402462982528818043L;
        nx.lcvv[316] = -8433330815644095816L;
        nx.lcvv[317] = 7909757048705038972L;
        nx.lcvv[318] = -5068928614137434563L;
        nx.lcvv[319] = 8795049547672095036L;
        nx.lcvv[320] = 4780722797190741746L;
        nx.lcvv[321] = 7703277722372175798L;
        nx.lcvv[322] = 641105195599965274L;
        nx.lcvv[323] = -3531408387361846869L;
        nx.lcvv[324] = -5929551023631089829L;
        nx.lcvv[325] = -1075843379568791982L;
        nx.lcvv[326] = -3798218146541775907L;
        nx.lcvv[327] = 6036008477501346242L;
        nx.lcvv[328] = -3576358624543358685L;
        nx.lcvv[329] = 6584157324534353474L;
        nx.lcvv[330] = -3901325945094080472L;
        nx.lcvv[331] = 8575494833175172627L;
        nx.lcvv[332] = 8420660542281888464L;
        nx.lcvv[333] = -3104256542826287297L;
        nx.lcvv[334] = -2775161579597396055L;
        nx.lcvv[335] = -887745154479732322L;
        nx.lcvv[336] = 7173821665610340569L;
        nx.lcvv[337] = 2778948143935363240L;
        nx.lcvv[338] = -4216316835410410508L;
        nx.lcvv[339] = 786730112892467300L;
        nx.lcvv[340] = 7811146662005025753L;
        nx.lcvv[341] = -2700393564941339296L;
        nx.lcvv[342] = 3399275779078683949L;
        nx.lcvv[343] = -7960983821635100328L;
        nx.lcvv[344] = 8923439199113300453L;
        nx.lcvv[345] = -6304781203542699759L;
        nx.lcvv[346] = -4872306752502649228L;
        nx.lcvv[347] = -8217518300912984978L;
        nx.lcvv[348] = 4341074331178828060L;
        nx.lcvv[349] = 2410289555248906748L;
        nx.lcvv[350] = 2641504436737755636L;
        nx.lcvv[351] = 7613352717322258229L;
        nx.lcvv[352] = 5395823092319645450L;
        nx.lcvv[353] = -8630770326316059336L;
        nx.lcvv[354] = 8756418757095188465L;
        nx.lcvv[355] = 4054359141592439266L;
        nx.lcvv[356] = -822943196855217302L;
        nx.lcvv[357] = 5116552973949828507L;
        nx.lcvv[358] = 7190624332866776895L;
        nx.lcvv[359] = -1692438377809254630L;
        nx.lcvv[360] = -7364682921879014842L;
        nx.lcvv[361] = -6681112060247382281L;
        nx.lcvv[362] = -7357011629067231459L;
        nx.lcvv[363] = 6221906834777393796L;
        nx.lcvv[364] = 1240466914288365280L;
        nx.lcvv[365] = -3817127890008226990L;
        nx.lcvv[366] = -663293688425261828L;
        nx.lcvv[367] = 6504313952404533070L;
        nx.lcvv[368] = -2680054335756349764L;
        nx.lcvv[369] = 6113527849010371397L;
        nx.lcvv[370] = 2356505226353119389L;
        nx.lcvv[371] = 5048397897979964539L;
        nx.lcvv[372] = 6516772806218128934L;
        nx.lcvv[373] = -1584736260680003245L;
        nx.lcvv[374] = 2813394854356554283L;
        nx.lcvv[375] = -5260692224954955294L;
        nx.lcvv[376] = 6479261685509053948L;
        nx.lcvv[377] = -6908085465744667577L;
        nx.lcvv[378] = -1797885546564387838L;
        nx.lcvv[379] = 7102174321505480881L;
        nx.lcvv[380] = 2862165297951869740L;
        nx.lcvv[381] = -4244525335027670100L;
        nx.lcvv[382] = -6511801725159137394L;
        nx.lcvv[383] = -5577026501274589677L;
        nx.lcvv[384] = -5054535034799392564L;
        nx.lcvv[385] = -6980238277441929701L;
        nx.lcvv[386] = 992113911177757801L;
        nx.lcvv[387] = -8581228037431835186L;
        nx.lcvv[388] = 6800985670233582532L;
        nx.lcvv[389] = -6827706513980586591L;
    }

    static {
        lcvc = new int[384];
        lcve = new int[384];
        nx.lggf();
        nx.lggk();
        nx.lggr();
        nx.lggs();
        nx.lggt();
        nx.lggw();
        nx.lggy();
        nx.lghb();
        lcvu = new long[390];
        lcvv = new long[390];
        nx.lghe();
        nx.lghi();
        nx.lghl();
        nx.lgho();
        nx.lghs();
        nx.lghv();
        nx.lghy();
        nx.lgib();
        mc = class_310.method_1551();
    }

    private static /* synthetic */ void lghi() {
        nx.lcvu[100] = 6915286692288929712L;
        nx.lcvu[101] = 4680041316391506851L;
        nx.lcvu[102] = -6252181210685438354L;
        nx.lcvu[103] = -7966023049841186040L;
        nx.lcvu[104] = -42388067556947047L;
        nx.lcvu[105] = -8636606227386635643L;
        nx.lcvu[106] = 3063460017560306574L;
        nx.lcvu[107] = -7003357531323567397L;
        nx.lcvu[108] = -2210260036276257747L;
        nx.lcvu[109] = -3546563663318763537L;
        nx.lcvu[110] = 382480845272655783L;
        nx.lcvu[111] = 4529170432312829413L;
        nx.lcvu[112] = -473517231132325150L;
        nx.lcvu[113] = 9073428864087419525L;
        nx.lcvu[114] = 2144695262362143445L;
        nx.lcvu[115] = -1800802777527300824L;
        nx.lcvu[116] = 1898789211489594650L;
        nx.lcvu[117] = -6640215123568243756L;
        nx.lcvu[118] = -4243651461339581962L;
        nx.lcvu[119] = -4798268255350529641L;
        nx.lcvu[120] = 3601278386817576954L;
        nx.lcvu[121] = 1453172643516563955L;
        nx.lcvu[122] = 2137593181708625055L;
        nx.lcvu[123] = -1850310989790660500L;
        nx.lcvu[124] = 8957144710064302352L;
        nx.lcvu[125] = -1290458302756942902L;
        nx.lcvu[126] = 8162911487360903283L;
        nx.lcvu[127] = -67974064454497443L;
        nx.lcvu[128] = 1322128986564943861L;
        nx.lcvu[129] = 101880413475473614L;
        nx.lcvu[130] = -5069101928851396068L;
        nx.lcvu[131] = -12924535287094160L;
        nx.lcvu[132] = 5845613799384438400L;
        nx.lcvu[133] = -7257681382468741286L;
        nx.lcvu[134] = 9047439892179015825L;
        nx.lcvu[135] = 6706394169495257235L;
        nx.lcvu[136] = 6119842232245371134L;
        nx.lcvu[137] = -6307987518875780359L;
        nx.lcvu[138] = 6973142273379061787L;
        nx.lcvu[139] = 4214410892417558465L;
        nx.lcvu[140] = -1544654299265881610L;
        nx.lcvu[141] = 296392801300534070L;
        nx.lcvu[142] = 5089717726288578936L;
        nx.lcvu[143] = 1545838786536885448L;
        nx.lcvu[144] = -6457739146005459149L;
        nx.lcvu[145] = -3948615691669303503L;
        nx.lcvu[146] = -2735163791508568835L;
        nx.lcvu[147] = -8658020472552579622L;
        nx.lcvu[148] = -3316223852556661264L;
        nx.lcvu[149] = -6666774424285312159L;
        nx.lcvu[150] = 4700476726828008906L;
        nx.lcvu[151] = 5990322761409816857L;
        nx.lcvu[152] = 2712240546371584302L;
        nx.lcvu[153] = 3509418154764925247L;
        nx.lcvu[154] = 7208504498414170576L;
        nx.lcvu[155] = -769824769305509294L;
        nx.lcvu[156] = -2897306213230210717L;
        nx.lcvu[157] = 2333284887474845252L;
        nx.lcvu[158] = 2800060202107077756L;
        nx.lcvu[159] = -5798097032406871274L;
        nx.lcvu[160] = 8908842957054433717L;
        nx.lcvu[161] = -4627709491385610584L;
        nx.lcvu[162] = -7896783398688601262L;
        nx.lcvu[163] = 7568697072019185365L;
        nx.lcvu[164] = 5115186940699889407L;
        nx.lcvu[165] = 2102522788745817280L;
        nx.lcvu[166] = -8392101551786046939L;
        nx.lcvu[167] = -322725765944136633L;
        nx.lcvu[168] = -5476646651213896451L;
        nx.lcvu[169] = -1093465072297811249L;
        nx.lcvu[170] = 2534408121257747463L;
        nx.lcvu[171] = 6081334346524859561L;
        nx.lcvu[172] = 3282952097675090844L;
        nx.lcvu[173] = 5951071183667567210L;
        nx.lcvu[174] = -845790909666200949L;
        nx.lcvu[175] = -7612523118598462810L;
        nx.lcvu[176] = -167972406416060558L;
        nx.lcvu[177] = 3584952436521158782L;
        nx.lcvu[178] = -5049675401884647294L;
        nx.lcvu[179] = 4930684280235951317L;
        nx.lcvu[180] = 6756259165495005093L;
        nx.lcvu[181] = 1400435596764951738L;
        nx.lcvu[182] = 5547163108370286976L;
        nx.lcvu[183] = -3763757837769481556L;
        nx.lcvu[184] = -637569311108415260L;
        nx.lcvu[185] = -5693303488649274667L;
        nx.lcvu[186] = -3897932862611816100L;
        nx.lcvu[187] = 1064857400329734972L;
        nx.lcvu[188] = 8383770453390646497L;
        nx.lcvu[189] = -5921913981202067579L;
        nx.lcvu[190] = -8060057718038320984L;
        nx.lcvu[191] = 4924469828117632644L;
        nx.lcvu[192] = 350899147801137451L;
        nx.lcvu[193] = 2030327677970355039L;
        nx.lcvu[194] = 4426527046108983830L;
        nx.lcvu[195] = -6300343109225181837L;
        nx.lcvu[196] = -6625415769634988433L;
        nx.lcvu[197] = -5571580847301331647L;
        nx.lcvu[198] = 4337810540478993837L;
        nx.lcvu[199] = 628836004992459323L;
    }

    private static /* synthetic */ void lggy() {
        nx.lcve[200] = -252648978;
        nx.lcve[201] = 1520348385;
        nx.lcve[202] = 402507639;
        nx.lcve[203] = -428106913;
        nx.lcve[204] = -372024054;
        nx.lcve[205] = 913251090;
        nx.lcve[206] = 647978477;
        nx.lcve[207] = 2129310930;
        nx.lcve[208] = 1846720101;
        nx.lcve[209] = 1365918200;
        nx.lcve[210] = -1775278299;
        nx.lcve[211] = -2043869856;
        nx.lcve[212] = 191115812;
        nx.lcve[213] = 710958030;
        nx.lcve[214] = 941219553;
        nx.lcve[215] = -1077267275;
        nx.lcve[216] = -1942361563;
        nx.lcve[217] = 1247538271;
        nx.lcve[218] = -1852750993;
        nx.lcve[219] = -1631242585;
        nx.lcve[220] = -727476319;
        nx.lcve[221] = 1292309483;
        nx.lcve[222] = -1459310115;
        nx.lcve[223] = 153346423;
        nx.lcve[224] = -1207188234;
        nx.lcve[225] = -1533144582;
        nx.lcve[226] = -1394928416;
        nx.lcve[227] = 2103440600;
        nx.lcve[228] = -1957835508;
        nx.lcve[229] = 935981864;
        nx.lcve[230] = -598721399;
        nx.lcve[231] = -2065201561;
        nx.lcve[232] = 2125867153;
        nx.lcve[233] = 2116502204;
        nx.lcve[234] = -1551373002;
        nx.lcve[235] = 1610212611;
        nx.lcve[236] = -1812488907;
        nx.lcve[237] = 1404531969;
        nx.lcve[238] = 303402314;
        nx.lcve[239] = -1653848472;
        nx.lcve[240] = -1704691168;
        nx.lcve[241] = 1062808348;
        nx.lcve[242] = -2061748164;
        nx.lcve[243] = 1745329293;
        nx.lcve[244] = -253206005;
        nx.lcve[245] = -879062176;
        nx.lcve[246] = -1811358518;
        nx.lcve[247] = -610767014;
        nx.lcve[248] = 2127940082;
        nx.lcve[249] = -534258695;
        nx.lcve[250] = 261399193;
        nx.lcve[251] = 284563592;
        nx.lcve[252] = -1503037839;
        nx.lcve[253] = 800237276;
        nx.lcve[254] = -2008921229;
        nx.lcve[255] = 1184374993;
        nx.lcve[256] = 385472815;
        nx.lcve[257] = 216031403;
        nx.lcve[258] = 1590756705;
        nx.lcve[259] = 1641307724;
        nx.lcve[260] = -1519869273;
        nx.lcve[261] = -42113839;
        nx.lcve[262] = 1759653210;
        nx.lcve[263] = -761454215;
        nx.lcve[264] = 1466558712;
        nx.lcve[265] = -4799146;
        nx.lcve[266] = 1839368503;
        nx.lcve[267] = 1192460921;
        nx.lcve[268] = -1946678578;
        nx.lcve[269] = -717228445;
        nx.lcve[270] = 489103553;
        nx.lcve[271] = -1183000735;
        nx.lcve[272] = -1909064979;
        nx.lcve[273] = -1598827137;
        nx.lcve[274] = 1327605300;
        nx.lcve[275] = 48420934;
        nx.lcve[276] = -617748460;
        nx.lcve[277] = -1846464680;
        nx.lcve[278] = -1771517037;
        nx.lcve[279] = 1992637632;
        nx.lcve[280] = -256050477;
        nx.lcve[281] = 44815572;
        nx.lcve[282] = -460628640;
        nx.lcve[283] = 106619675;
        nx.lcve[284] = -179764753;
        nx.lcve[285] = 767307921;
        nx.lcve[286] = -1040534499;
        nx.lcve[287] = 1797018970;
        nx.lcve[288] = 584950037;
        nx.lcve[289] = 1466887115;
        nx.lcve[290] = 82918624;
        nx.lcve[291] = 1832806999;
        nx.lcve[292] = -1697154736;
        nx.lcve[293] = -532562642;
        nx.lcve[294] = -1832457248;
        nx.lcve[295] = 229282341;
        nx.lcve[296] = 238020748;
        nx.lcve[297] = 1423312264;
        nx.lcve[298] = 1585861399;
        nx.lcve[299] = 1075808940;
    }

    private static /* synthetic */ void lghy() {
        nx.lcvv[200] = -4187456660434025500L;
        nx.lcvv[201] = 545421619977740738L;
        nx.lcvv[202] = -208621505059086145L;
        nx.lcvv[203] = 4344338311289689640L;
        nx.lcvv[204] = -4729689226260144394L;
        nx.lcvv[205] = 4453011281510168558L;
        nx.lcvv[206] = 722392376359372395L;
        nx.lcvv[207] = 8090625122071349867L;
        nx.lcvv[208] = -2460766947684062579L;
        nx.lcvv[209] = -749057429895354155L;
        nx.lcvv[210] = -9003055553846521156L;
        nx.lcvv[211] = -4830771889914586790L;
        nx.lcvv[212] = -7542984998761636569L;
        nx.lcvv[213] = 1037901244306299192L;
        nx.lcvv[214] = 6388420349468345747L;
        nx.lcvv[215] = 6393869725472851084L;
        nx.lcvv[216] = -8108553594190516007L;
        nx.lcvv[217] = 3430316474786217526L;
        nx.lcvv[218] = -4938605218675380257L;
        nx.lcvv[219] = -5537610727700380099L;
        nx.lcvv[220] = -3778732134661602482L;
        nx.lcvv[221] = 8690172530456505749L;
        nx.lcvv[222] = -571193692300846979L;
        nx.lcvv[223] = 4635527172178481793L;
        nx.lcvv[224] = -5644154235918954945L;
        nx.lcvv[225] = -402118066244539661L;
        nx.lcvv[226] = 1628476297275488512L;
        nx.lcvv[227] = -546666089116988551L;
        nx.lcvv[228] = -4028416162149001790L;
        nx.lcvv[229] = 1114556321522748610L;
        nx.lcvv[230] = -4333246386222197440L;
        nx.lcvv[231] = 6505448256697660758L;
        nx.lcvv[232] = -2817832113944502247L;
        nx.lcvv[233] = -1729642467636854422L;
        nx.lcvv[234] = 9220543410858507427L;
        nx.lcvv[235] = -3001130394509282629L;
        nx.lcvv[236] = 4330919652614244241L;
        nx.lcvv[237] = 6348153311531098581L;
        nx.lcvv[238] = 1898726675425802699L;
        nx.lcvv[239] = 4439127302320007547L;
        nx.lcvv[240] = -8545996887199940342L;
        nx.lcvv[241] = -5813023223632903021L;
        nx.lcvv[242] = 1174779466076790275L;
        nx.lcvv[243] = -5870633190431594148L;
        nx.lcvv[244] = -1719077114326747768L;
        nx.lcvv[245] = 7251410158496099158L;
        nx.lcvv[246] = -3053298342679541614L;
        nx.lcvv[247] = -1824069094644536770L;
        nx.lcvv[248] = -7793315408853691879L;
        nx.lcvv[249] = 8662555952473405450L;
        nx.lcvv[250] = 75572917751467676L;
        nx.lcvv[251] = 5949779671976800579L;
        nx.lcvv[252] = 374274049947281475L;
        nx.lcvv[253] = -2260803609219079400L;
        nx.lcvv[254] = 1632445625666106461L;
        nx.lcvv[255] = -7748197184765008676L;
        nx.lcvv[256] = 4240781740242378199L;
        nx.lcvv[257] = -8258214951701588567L;
        nx.lcvv[258] = 8486401590515683093L;
        nx.lcvv[259] = 4642951571341700394L;
        nx.lcvv[260] = 3567987665689277430L;
        nx.lcvv[261] = -55296749116608945L;
        nx.lcvv[262] = 5308508688844761981L;
        nx.lcvv[263] = -8765103448602154091L;
        nx.lcvv[264] = -3051237513159954509L;
        nx.lcvv[265] = 6569798959072988041L;
        nx.lcvv[266] = -2487554785999366196L;
        nx.lcvv[267] = -6783445238881119858L;
        nx.lcvv[268] = 700728093966380765L;
        nx.lcvv[269] = -4532417382219817011L;
        nx.lcvv[270] = -7164207430794585772L;
        nx.lcvv[271] = -7211434494824265011L;
        nx.lcvv[272] = 3122513338890401786L;
        nx.lcvv[273] = 5680252620790219482L;
        nx.lcvv[274] = 3368810897164169037L;
        nx.lcvv[275] = 5296167749496705695L;
        nx.lcvv[276] = 7500241867199553634L;
        nx.lcvv[277] = -4270912817597378255L;
        nx.lcvv[278] = -3620408222033488176L;
        nx.lcvv[279] = 7792182195747832786L;
        nx.lcvv[280] = 3311254253698506017L;
        nx.lcvv[281] = -8415212617716353511L;
        nx.lcvv[282] = 1871502033043835934L;
        nx.lcvv[283] = -5410047443436385713L;
        nx.lcvv[284] = 8931641882559181600L;
        nx.lcvv[285] = 2261954656780500929L;
        nx.lcvv[286] = 3705030034333732331L;
        nx.lcvv[287] = -1757617659169406455L;
        nx.lcvv[288] = 592993850047347849L;
        nx.lcvv[289] = -8013867738183722767L;
        nx.lcvv[290] = 6834940948565584904L;
        nx.lcvv[291] = 1128156530021423016L;
        nx.lcvv[292] = 4017757475239389868L;
        nx.lcvv[293] = -7004218252854255589L;
        nx.lcvv[294] = -3668576112371913961L;
        nx.lcvv[295] = 1565996796121202783L;
        nx.lcvv[296] = -6915216969124070019L;
        nx.lcvv[297] = -6565568772861350321L;
        nx.lcvv[298] = 1070939687773250139L;
        nx.lcvv[299] = 3561090501182147395L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void restoreFromCurrent() {
        while (true) {
            if ((v0 /* !! */  = (cfr_temp_0 = nx.tt - nx.lcvf("lfpf", lcvs(int ), (int)236)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) continue;
            if (v0 /* !! */  == nx.lcvf("lfpg", lcvb(int ), (int)240)) break;
            v0 /* !! */  = (long)nx.lcvf("lfpi", lcvb(int ), (int)241);
        }
        var3_1 = nx.c;
        while (true) {
            if ((v1 /* !! */  = (cfr_temp_1 = nx.tt - nx.lcvf("lfpj", lcvs(int ), (int)237)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
            if (v1 /* !! */  == nx.lcvf("lfpk", lcvb(int ), (int)242)) break;
            v1 /* !! */  = (long)nx.lcvf("lfpl", lcvb(int ), (int)243);
        }
        var2_2 /* !! */  = nx.b;
        v2 /* !! */  = nx.tt;
        if (true) ** GOTO lbl17
        block124: while (true) {
            v2 /* !! */  = (long)(v3 - nx.lcvf("lfpm", lcvs(int ), (int)238));
lbl17:
            // 2 sources

            switch ((int)v2 /* !! */ ) {
                case -1355558011: {
                    v3 = nx.lcvf("lfpn", lcvs(int ), (int)239);
                    continue block124;
                }
                case -1222426216: {
                    break block124;
                }
                case -553889409: {
                    v3 = nx.lcvf("lfpo", lcvs(int ), (int)240);
                    continue block124;
                }
                case -394740187: {
                    v3 = nx.lcvf("lfpp", lcvs(int ), (int)241);
                    continue block124;
                }
            }
            break;
        }
        var1_3 = nx.a;
        if (var3_1) {
            throw null;
lbl32:
            // 8 sources

            return;
        }
        if (var1_3 || var1_3) ** GOTO lbl32
        v4 /* !! */  = nx.tt;
        if (true) ** GOTO lbl39
        block126: while (true) {
            v4 /* !! */  = (long)(v5 - nx.lcvf("lfpq", lcvs(int ), (int)242));
lbl39:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1515415971: {
                    v5 = nx.lcvf("lfpr", lcvs(int ), (int)243);
                    continue block126;
                }
                case -1222426216: {
                    break block126;
                }
                case -731663666: {
                    v5 = nx.lcvf("lfpt", lcvs(int ), (int)244);
                    continue block126;
                }
                case -634117877: {
                    v5 = nx.lcvf("lfpu", lcvs(int ), (int)245);
                    continue block126;
                }
            }
            break;
        }
        while (true) {
            if ((v6 /* !! */  = (cfr_temp_2 = nx.tt - nx.lcvf("lfpw", lcvs(int ), (int)246)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
            if (v6 /* !! */  == nx.lcvf("lfpx", lcvb(int ), (int)244)) break;
            v6 /* !! */  = (long)nx.lcvf("lfpz", lcvb(int ), (int)245);
        }
        v7 = nx.mc.field_1690;
        while (true) {
            if ((v8 /* !! */  = (cfr_temp_3 = nx.tt - nx.lcvf("lfqa", lcvs(int ), (int)247)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
            if (v8 /* !! */  == nx.lcvf("lfqb", lcvb(int ), (int)246)) break;
            v8 /* !! */  = (long)nx.lcvf("lfqc", lcvb(int ), (int)247);
        }
        v9 = v7.field_1894;
        v10 /* !! */  = nx.tt;
        if (true) ** GOTO lbl67
        block129: while (true) {
            v10 /* !! */  = (long)(v11 - nx.lcvf("lfqe", lcvs(int ), (int)248));
lbl67:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -1222426216: {
                    break block129;
                }
                case 562977795: {
                    v11 = nx.lcvf("lfqf", lcvs(int ), (int)249);
                    continue block129;
                }
                case 876174589: {
                    v11 = nx.lcvf("lfqg", lcvs(int ), (int)250);
                    continue block129;
                }
            }
            break;
        }
        while (true) {
            if ((v12 /* !! */  = (cfr_temp_4 = nx.tt - nx.lcvf("lfqi", lcvs(int ), (int)251)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
            if (v12 /* !! */  == nx.lcvf("lfqj", lcvb(int ), (int)248)) break;
            v12 /* !! */  = (long)nx.lcvf("lfqk", lcvb(int ), (int)249);
        }
        v13 = nx.mc.field_1690;
        v14 /* !! */  = nx.tt;
        if (true) ** GOTO lbl86
        block131: while (true) {
            v14 /* !! */  = (long)(v15 - nx.lcvf("lfqm", lcvs(int ), (int)252));
lbl86:
            // 2 sources

            switch ((int)v14 /* !! */ ) {
                case -1586906557: {
                    v15 = nx.lcvf("lfqn", lcvs(int ), (int)253);
                    continue block131;
                }
                case -1222426216: {
                    break block131;
                }
                case -872118843: {
                    v15 = nx.lcvf("lfqo", lcvs(int ), (int)254);
                    continue block131;
                }
                case 1802998471: {
                    v15 = nx.lcvf("lfqq", lcvs(int ), (int)255);
                    continue block131;
                }
            }
            break;
        }
        v16 = v13.field_1894;
        v17 /* !! */  = nx.tt;
        if (true) ** GOTO lbl103
        block132: while (true) {
            v17 /* !! */  = (long)(v18 - nx.lcvf("lfqr", lcvs(int ), (int)256));
lbl103:
            // 2 sources

            switch ((int)v17 /* !! */ ) {
                case -1340040675: {
                    v18 = nx.lcvf("lfqt", lcvs(int ), (int)257);
                    continue block132;
                }
                case -1222426216: {
                    break block132;
                }
                case -694528904: {
                    v18 = nx.lcvf("lfqu", lcvs(int ), (int)258);
                    continue block132;
                }
            }
            break;
        }
        v19 = this.isCurrentlyPressed(v16);
        v20 /* !! */  = nx.tt;
        if (true) ** GOTO lbl117
        block133: while (true) {
            v20 /* !! */  = (long)(v21 - nx.lcvf("lfqw", lcvs(int ), (int)259));
lbl117:
            // 2 sources

            switch ((int)v20 /* !! */ ) {
                case -1222426216: {
                    break block133;
                }
                case 760492092: {
                    v21 = nx.lcvf("lfqx", lcvs(int ), (int)260);
                    continue block133;
                }
                case 1241163150: {
                    v21 = nx.lcvf("lfqz", lcvs(int ), (int)261);
                    continue block133;
                }
            }
            break;
        }
        v9.method_23481(v19);
        if (var1_3) ** GOTO lbl32
        if (var2_2 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_2 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var1_3) ** GOTO lbl32
                v22 /* !! */  = nx.tt;
                if (true) ** GOTO lbl136
                block134: while (true) {
                    v22 /* !! */  = (long)(v23 - nx.lcvf("lfrb", lcvs(int ), (int)262));
lbl136:
                    // 2 sources

                    switch ((int)v22 /* !! */ ) {
                        case -1222426216: {
                            break block134;
                        }
                        case -554532195: {
                            v23 = nx.lcvf("lfrc", lcvs(int ), (int)263);
                            continue block134;
                        }
                        case 1451169358: {
                            v23 = nx.lcvf("lfrd", lcvs(int ), (int)264);
                            continue block134;
                        }
                    }
                    break;
                }
                v24 /* !! */  = nx.tt;
                if (true) ** GOTO lbl149
                block135: while (true) {
                    v24 /* !! */  = (long)(nx.lcvf("lfrg", lcvs(int ), (int)266) - nx.lcvf("lfrf", lcvs(int ), (int)265));
lbl149:
                    // 2 sources

                    switch ((int)v24 /* !! */ ) {
                        case -1222426216: {
                            break block135;
                        }
                        case 1197623404: {
                            continue block135;
                        }
                    }
                    break;
                }
                v25 = nx.mc.field_1690;
                while (true) {
                    if ((v26 /* !! */  = (cfr_temp_5 = nx.tt - nx.lcvf("lfri", lcvs(int ), (int)267)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                    if (v26 /* !! */  == nx.lcvf("lfrk", lcvb(int ), (int)250)) break;
                    v26 /* !! */  = (long)nx.lcvf("lfrl", lcvb(int ), (int)251);
                }
                v27 = v25.field_1881;
                while (true) {
                    if ((v28 /* !! */  = (cfr_temp_6 = nx.tt - nx.lcvf("lfrn", lcvs(int ), (int)268)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                    if (v28 /* !! */  == nx.lcvf("lfro", lcvb(int ), (int)252)) break;
                    v28 /* !! */  = (long)nx.lcvf("lfrp", lcvb(int ), (int)253);
                }
                while (true) {
                    if ((v29 /* !! */  = (cfr_temp_7 = nx.tt - nx.lcvf("lfrr", lcvs(int ), (int)269)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                    if (v29 /* !! */  == nx.lcvf("lfrs", lcvb(int ), (int)254)) break;
                    v29 /* !! */  = (long)nx.lcvf("lfru", lcvb(int ), (int)255);
                }
                v30 = nx.mc.field_1690;
                while (true) {
                    if ((v31 /* !! */  = (cfr_temp_8 = nx.tt - nx.lcvf("lfrv", lcvs(int ), (int)270)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                    if (v31 /* !! */  == nx.lcvf("lfrw", lcvb(int ), (int)256)) break;
                    v31 /* !! */  = (long)nx.lcvf("lfry", lcvb(int ), (int)257);
                }
                v32 = v30.field_1881;
                while (true) {
                    if ((v33 /* !! */  = (cfr_temp_9 = nx.tt - nx.lcvf("lfrz", lcvs(int ), (int)271)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                    if (v33 /* !! */  == nx.lcvf("lfsa", lcvb(int ), (int)258)) break;
                    v33 /* !! */  = (long)nx.lcvf("lfsb", lcvb(int ), (int)259);
                }
                v34 = this.isCurrentlyPressed(v32);
                v35 /* !! */  = nx.tt;
                if (true) ** GOTO lbl188
                block141: while (true) {
                    v35 /* !! */  = (long)(nx.lcvf("lfse", lcvs(int ), (int)273) - nx.lcvf("lfsc", lcvs(int ), (int)272));
lbl188:
                    // 2 sources

                    switch ((int)v35 /* !! */ ) {
                        case -1222426216: {
                            break block141;
                        }
                        case -767023722: {
                            continue block141;
                        }
                    }
                    break;
                }
                v27.method_23481(v34);
                if (var1_3 || var1_3) ** GOTO lbl32
                v36 /* !! */  = nx.tt;
                if (true) ** GOTO lbl199
                block142: while (true) {
                    v36 /* !! */  = (long)(nx.lcvf("lfsg", lcvs(int ), (int)275) - nx.lcvf("lfsf", lcvs(int ), (int)274));
lbl199:
                    // 2 sources

                    switch ((int)v36 /* !! */ ) {
                        case -1222426216: {
                            break block142;
                        }
                        case 1264826082: {
                            continue block142;
                        }
                    }
                    break;
                }
                v37 /* !! */  = nx.tt;
                if (true) ** GOTO lbl208
                block143: while (true) {
                    v37 /* !! */  = (long)(v38 - nx.lcvf("lfsh", lcvs(int ), (int)276));
lbl208:
                    // 2 sources

                    switch ((int)v37 /* !! */ ) {
                        case -1222426216: {
                            break block143;
                        }
                        case 763381935: {
                            v38 = nx.lcvf("lfsi", lcvs(int ), (int)277);
                            continue block143;
                        }
                        case 1549216745: {
                            v38 = nx.lcvf("lfsj", lcvs(int ), (int)278);
                            continue block143;
                        }
                    }
                    break;
                }
                v39 = nx.mc.field_1690;
                v40 /* !! */  = nx.tt;
                if (true) ** GOTO lbl222
                block144: while (true) {
                    v40 /* !! */  = (long)(v41 - nx.lcvf("lfsk", lcvs(int ), (int)279));
lbl222:
                    // 2 sources

                    switch ((int)v40 /* !! */ ) {
                        case -1295999775: {
                            v41 = nx.lcvf("lfsl", lcvs(int ), (int)280);
                            continue block144;
                        }
                        case -1222426216: {
                            break block144;
                        }
                        case -480239742: {
                            v41 = nx.lcvf("lfsm", lcvs(int ), (int)281);
                            continue block144;
                        }
                    }
                    break;
                }
                v42 = v39.field_1913;
                while (true) {
                    if ((v43 /* !! */  = (cfr_temp_10 = nx.tt - nx.lcvf("lfsn", lcvs(int ), (int)282)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                    if (v43 /* !! */  == nx.lcvf("lfso", lcvb(int ), (int)260)) break;
                    v43 /* !! */  = (long)nx.lcvf("lfsp", lcvb(int ), (int)261);
                }
                v44 /* !! */  = nx.tt;
                if (true) ** GOTO lbl241
                block146: while (true) {
                    v44 /* !! */  = (long)(v45 - nx.lcvf("lfsr", lcvs(int ), (int)283));
lbl241:
                    // 2 sources

                    switch ((int)v44 /* !! */ ) {
                        case -1222426216: {
                            break block146;
                        }
                        case -632272675: {
                            v45 = nx.lcvf("lfss", lcvs(int ), (int)284);
                            continue block146;
                        }
                        case 397079993: {
                            v45 = nx.lcvf("lfst", lcvs(int ), (int)285);
                            continue block146;
                        }
                        case 581736683: {
                            v45 = nx.lcvf("lfsv", lcvs(int ), (int)286);
                            continue block146;
                        }
                    }
                    break;
                }
                v46 = nx.mc.field_1690;
                while (true) {
                    if ((v47 /* !! */  = (cfr_temp_11 = nx.tt - nx.lcvf("lfsx", lcvs(int ), (int)287)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                    if (v47 /* !! */  == nx.lcvf("lfsy", lcvb(int ), (int)262)) break;
                    v47 /* !! */  = (long)nx.lcvf("lfsz", lcvb(int ), (int)263);
                }
                v48 = v46.field_1913;
                while (true) {
                    if ((v49 /* !! */  = (cfr_temp_12 = nx.tt - nx.lcvf("lftc", lcvs(int ), (int)288)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                    if (v49 /* !! */  == nx.lcvf("lftd", lcvb(int ), (int)264)) break;
                    v49 /* !! */  = (long)nx.lcvf("lftf", lcvb(int ), (int)265);
                }
                v50 = this.isCurrentlyPressed(v48);
                while (true) {
                    if ((v51 /* !! */  = (cfr_temp_13 = nx.tt - nx.lcvf("lftg", lcvs(int ), (int)289)) == 0L ? 0 : (cfr_temp_13 < 0L ? -1 : 1)) == false) continue;
                    if (v51 /* !! */  == nx.lcvf("lfti", lcvb(int ), (int)266)) break;
                    v51 /* !! */  = (long)nx.lcvf("lftk", lcvb(int ), (int)267);
                }
                v42.method_23481(v50);
                if (var1_3 || var1_3) ** GOTO lbl32
                v52 /* !! */  = nx.tt;
                if (true) ** GOTO lbl277
                block150: while (true) {
                    v52 /* !! */  = (long)(nx.lcvf("lftn", lcvs(int ), (int)291) - nx.lcvf("lftl", lcvs(int ), (int)290));
lbl277:
                    // 2 sources

                    switch ((int)v52 /* !! */ ) {
                        case -1222426216: {
                            break block150;
                        }
                        case -1205677230: {
                            continue block150;
                        }
                    }
                    break;
                }
                v53 /* !! */  = nx.tt;
                if (true) ** GOTO lbl286
                block151: while (true) {
                    v53 /* !! */  = (long)(v54 - nx.lcvf("lftp", lcvs(int ), (int)292));
lbl286:
                    // 2 sources

                    switch ((int)v53 /* !! */ ) {
                        case -1869229340: {
                            v54 = nx.lcvf("lftq", lcvs(int ), (int)293);
                            continue block151;
                        }
                        case -1372751094: {
                            v54 = nx.lcvf("lftr", lcvs(int ), (int)294);
                            continue block151;
                        }
                        case -1222426216: {
                            break block151;
                        }
                    }
                    break;
                }
                v55 = nx.mc.field_1690;
                while (true) {
                    if ((v56 /* !! */  = (cfr_temp_14 = nx.tt - nx.lcvf("lftt", lcvs(int ), (int)295)) == 0L ? 0 : (cfr_temp_14 < 0L ? -1 : 1)) == false) continue;
                    if (v56 /* !! */  == nx.lcvf("lftu", lcvb(int ), (int)268)) break;
                    v56 /* !! */  = (long)nx.lcvf("lftv", lcvb(int ), (int)269);
                }
                v57 = v55.field_1849;
                v58 /* !! */  = nx.tt;
                if (true) ** GOTO lbl306
                block153: while (true) {
                    v58 /* !! */  = (long)(v59 - nx.lcvf("lftw", lcvs(int ), (int)296));
lbl306:
                    // 2 sources

                    switch ((int)v58 /* !! */ ) {
                        case -1222426216: {
                            break block153;
                        }
                        case 1245983254: {
                            v59 = nx.lcvf("lftx", lcvs(int ), (int)297);
                            continue block153;
                        }
                        case 1995934141: {
                            v59 = nx.lcvf("lfty", lcvs(int ), (int)298);
                            continue block153;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v60 /* !! */  = (cfr_temp_15 = nx.tt - nx.lcvf("lftz", lcvs(int ), (int)299)) == 0L ? 0 : (cfr_temp_15 < 0L ? -1 : 1)) == false) continue;
                    if (v60 /* !! */  == nx.lcvf("lfua", lcvb(int ), (int)270)) break;
                    v60 /* !! */  = (long)nx.lcvf("lfub", lcvb(int ), (int)271);
                }
                v61 = nx.mc.field_1690;
                v62 /* !! */  = nx.tt;
                if (true) ** GOTO lbl325
                block155: while (true) {
                    v62 /* !! */  = (long)(v63 - nx.lcvf("lfuc", lcvs(int ), (int)300));
lbl325:
                    // 2 sources

                    switch ((int)v62 /* !! */ ) {
                        case -1222426216: {
                            break block155;
                        }
                        case 435561444: {
                            v63 = nx.lcvf("lfud", lcvs(int ), (int)301);
                            continue block155;
                        }
                        case 1956412100: {
                            v63 = nx.lcvf("lfue", lcvs(int ), (int)302);
                            continue block155;
                        }
                    }
                    break;
                }
                v64 = v61.field_1849;
                while (true) {
                    if ((v65 /* !! */  = (cfr_temp_16 = nx.tt - nx.lcvf("lfug", lcvs(int ), (int)303)) == 0L ? 0 : (cfr_temp_16 < 0L ? -1 : 1)) == false) continue;
                    if (v65 /* !! */  == nx.lcvf("lfui", lcvb(int ), (int)272)) break;
                    v65 /* !! */  = (long)nx.lcvf("lfuj", lcvb(int ), (int)273);
                }
                v66 = this.isCurrentlyPressed(v64);
                while (true) {
                    if ((v67 /* !! */  = (cfr_temp_17 = nx.tt - nx.lcvf("lful", lcvs(int ), (int)304)) == 0L ? 0 : (cfr_temp_17 < 0L ? -1 : 1)) == false) continue;
                    if (v67 /* !! */  == nx.lcvf("lfum", lcvb(int ), (int)274)) break;
                    v67 /* !! */  = (long)nx.lcvf("lfuo", lcvb(int ), (int)275);
                }
                v57.method_23481(v66);
                if (var1_3 || var1_3) ** GOTO lbl32
                v68 /* !! */  = nx.tt;
                if (true) ** GOTO lbl352
                block158: while (true) {
                    v68 /* !! */  = (long)(nx.lcvf("lfus", lcvs(int ), (int)306) - nx.lcvf("lfuq", lcvs(int ), (int)305));
lbl352:
                    // 2 sources

                    switch ((int)v68 /* !! */ ) {
                        case -1222426216: {
                            break block158;
                        }
                        case 396198026: {
                            continue block158;
                        }
                    }
                    break;
                }
                while (true) {
                    if ((v69 /* !! */  = (cfr_temp_18 = nx.tt - nx.lcvf("lfuu", lcvs(int ), (int)307)) == 0L ? 0 : (cfr_temp_18 < 0L ? -1 : 1)) == false) continue;
                    if (v69 /* !! */  == nx.lcvf("lfuv", lcvb(int ), (int)276)) break;
                    v69 /* !! */  = (long)nx.lcvf("lfux", lcvb(int ), (int)277);
                }
                v70 = nx.mc.field_1690;
                while (true) {
                    if ((v71 /* !! */  = (cfr_temp_19 = nx.tt - nx.lcvf("lfuy", lcvs(int ), (int)308)) == 0L ? 0 : (cfr_temp_19 < 0L ? -1 : 1)) == false) continue;
                    if (v71 /* !! */  == nx.lcvf("lfva", lcvb(int ), (int)278)) break;
                    v71 /* !! */  = (long)nx.lcvf("lfvc", lcvb(int ), (int)279);
                }
                v72 = v70.field_1903;
                v73 /* !! */  = nx.tt;
                if (true) ** GOTO lbl373
                block161: while (true) {
                    v73 /* !! */  = (long)(nx.lcvf("lfvf", lcvs(int ), (int)310) - nx.lcvf("lfvd", lcvs(int ), (int)309));
lbl373:
                    // 2 sources

                    switch ((int)v73 /* !! */ ) {
                        case -1222426216: {
                            break block161;
                        }
                        case 2072032433: {
                            continue block161;
                        }
                    }
                    break;
                }
                v74 /* !! */  = nx.tt;
                if (true) ** GOTO lbl382
                block162: while (true) {
                    v74 /* !! */  = (long)(v75 - nx.lcvf("lfvh", lcvs(int ), (int)311));
lbl382:
                    // 2 sources

                    switch ((int)v74 /* !! */ ) {
                        case -1222426216: {
                            break block162;
                        }
                        case -932265853: {
                            v75 = nx.lcvf("lfvj", lcvs(int ), (int)312);
                            continue block162;
                        }
                        case 951958199: {
                            v75 = nx.lcvf("lfvk", lcvs(int ), (int)313);
                            continue block162;
                        }
                    }
                    break;
                }
                v76 = nx.mc.field_1690;
                while (true) {
                    if ((v77 /* !! */  = (cfr_temp_20 = nx.tt - nx.lcvf("lfvm", lcvs(int ), (int)314)) == 0L ? 0 : (cfr_temp_20 < 0L ? -1 : 1)) == false) continue;
                    if (v77 /* !! */  == nx.lcvf("lfvo", lcvb(int ), (int)280)) break;
                    v77 /* !! */  = (long)nx.lcvf("lfvp", lcvb(int ), (int)281);
                }
                v78 = v76.field_1903;
                while (true) {
                    if ((v79 /* !! */  = (cfr_temp_21 = nx.tt - nx.lcvf("lfvr", lcvs(int ), (int)315)) == 0L ? 0 : (cfr_temp_21 < 0L ? -1 : 1)) == false) continue;
                    if (v79 /* !! */  == nx.lcvf("lfvt", lcvb(int ), (int)282)) break;
                    v79 /* !! */  = (long)nx.lcvf("lfvu", lcvb(int ), (int)283);
                }
                v80 = this.isCurrentlyPressed(v78);
                while (true) {
                    if ((v81 /* !! */  = (cfr_temp_22 = nx.tt - nx.lcvf("lfvw", lcvs(int ), (int)316)) == 0L ? 0 : (cfr_temp_22 < 0L ? -1 : 1)) == false) continue;
                    if (v81 /* !! */  == nx.lcvf("lfvy", lcvb(int ), (int)284)) break;
                    v81 /* !! */  = (long)nx.lcvf("lfvz", lcvb(int ), (int)285);
                }
                v72.method_23481(v80);
                if (var1_3 || var1_3) ** GOTO lbl32
                v82 = nx.lcvf("lfwb", lcvb(int ), (int)286);
                v83 /* !! */  = nx.tt;
                if (true) ** GOTO lbl416
                block166: while (true) {
                    v83 /* !! */  = (long)(v84 - nx.lcvf("lfwc", lcvs(int ), (int)317));
lbl416:
                    // 2 sources

                    switch ((int)v83 /* !! */ ) {
                        case -1222426216: {
                            break block166;
                        }
                        case 1039052313: {
                            v84 = nx.lcvf("lfwe", lcvs(int ), (int)318);
                            continue block166;
                        }
                        case 1284298856: {
                            v84 = nx.lcvf("lfwf", lcvs(int ), (int)319);
                            continue block166;
                        }
                        case 1899978059: {
                            v84 = nx.lcvf("lfwh", lcvs(int ), (int)320);
                            continue block166;
                        }
                    }
                    break;
                }
                this.blocked = v82;
                if (!var1_3 && !var1_3) ** break;
                ** continue;
                return;
            }
            case 0: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwj", lcvb(int ), (int)287);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl446
            }
lbl437:
            // 2 sources

            case 1: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwl", lcvb(int ), (int)288);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl486
            }
lbl442:
            // 4 sources

            case 2: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwn", lcvb(int ), (int)289);
                if (!var3_1) break;
                throw null;
            }
lbl446:
            // 2 sources

            case 3: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwo", lcvb(int ), (int)290);
                if (!var3_1) ** GOTO lbl437
                throw null;
            }
lbl450:
            // 2 sources

            case 4: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwq", lcvb(int ), (int)291);
                if (!var3_1) ** GOTO lbl442
                throw null;
            }
lbl454:
            // 2 sources

            case 5: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("lfws", lcvb(int ), (int)292);
                } while (!var3_1);
                throw null;
            }
            case 6: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwu", lcvb(int ), (int)293);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl486
            }
lbl464:
            // 2 sources

            case 7: {
                do {
                    var2_2 /* !! */  = (int)nx.lcvf("lfwv", lcvb(int ), (int)294);
                } while (!var3_1);
                throw null;
            }
            case 8: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwx", lcvb(int ), (int)295);
                if (!var3_1) ** GOTO lbl442
                throw null;
            }
lbl473:
            // 2 sources

            case 9: {
                var2_2 /* !! */  = (int)nx.lcvf("lfwz", lcvb(int ), (int)296);
                if (!var3_1) ** GOTO lbl450
                throw null;
            }
            case 10: {
                var2_2 /* !! */  = (int)nx.lcvf("lfxb", lcvb(int ), (int)297);
                if (var3_1) {
                    throw null;
                }
                ** GOTO lbl495
            }
            case 11: {
                var2_2 /* !! */  = (int)nx.lcvf("lfxc", lcvb(int ), (int)298);
                if (!var3_1) ** GOTO lbl442
                throw null;
            }
lbl486:
            // 3 sources

            case 12: {
                var2_2 /* !! */  = (int)nx.lcvf("lfxe", lcvb(int ), (int)299);
                if (!var3_1) ** GOTO lbl464
                throw null;
            }
            case 13: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_2 /* !! */  = (int)nx.lcvf("lfxg", lcvb(int ), (int)300);
                    if (!var3_1) ** GOTO lbl454
                    throw null;
                }
            }
lbl495:
            // 2 sources

            case 14: {
                var2_2 /* !! */  = (int)nx.lcvf("lfxi", lcvb(int ), (int)301);
                if (!var3_1) ** GOTO lbl473
                throw null;
            }
            case 15: 
        }
        var2_2 /* !! */  = (int)nx.lcvf("lfxk", lcvb(int ), (int)302);
        ** while (!var3_1)
lbl502:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite lcvf(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void lgho() {
        nx.lcvu[300] = 8761087615017313949L;
        nx.lcvu[301] = -6028752874752458571L;
        nx.lcvu[302] = -2304731959818778594L;
        nx.lcvu[303] = 5549139752528754492L;
        nx.lcvu[304] = 5015406971188481262L;
        nx.lcvu[305] = -8034130369384468954L;
        nx.lcvu[306] = 1496541882863554624L;
        nx.lcvu[307] = -4568182510046656334L;
        nx.lcvu[308] = 3967985096442225247L;
        nx.lcvu[309] = 3835331623910750009L;
        nx.lcvu[310] = -8890630173833664109L;
        nx.lcvu[311] = -6767596924064293534L;
        nx.lcvu[312] = 7842602530298187800L;
        nx.lcvu[313] = 5127341240662901323L;
        nx.lcvu[314] = -286276843635252662L;
        nx.lcvu[315] = -1157425799930592289L;
        nx.lcvu[316] = -3327015097897549528L;
        nx.lcvu[317] = -7232458973322954311L;
        nx.lcvu[318] = -1170811924385840128L;
        nx.lcvu[319] = 417470355230583168L;
        nx.lcvu[320] = -3550250292101973950L;
        nx.lcvu[321] = 8312438420786762714L;
        nx.lcvu[322] = 810729827923294104L;
        nx.lcvu[323] = 5073756691086920068L;
        nx.lcvu[324] = -3736875197032326130L;
        nx.lcvu[325] = 3433492563764189394L;
        nx.lcvu[326] = 8307737708224353998L;
        nx.lcvu[327] = 4602281250964900175L;
        nx.lcvu[328] = -1845256265899563301L;
        nx.lcvu[329] = -4441815908438280039L;
        nx.lcvu[330] = -1717839146415508934L;
        nx.lcvu[331] = 5217034103644210078L;
        nx.lcvu[332] = 3017957710556155937L;
        nx.lcvu[333] = -2000124937572978630L;
        nx.lcvu[334] = -5715678928232499141L;
        nx.lcvu[335] = -4208892005832704718L;
        nx.lcvu[336] = 7760744340322683697L;
        nx.lcvu[337] = 1873442214281895581L;
        nx.lcvu[338] = -2871009030757601047L;
        nx.lcvu[339] = -5172222307863638439L;
        nx.lcvu[340] = -7867958742873017532L;
        nx.lcvu[341] = -4639846574492127509L;
        nx.lcvu[342] = -8054565828830914175L;
        nx.lcvu[343] = -4565913064291847981L;
        nx.lcvu[344] = 1564756506405567399L;
        nx.lcvu[345] = 74468241768531643L;
        nx.lcvu[346] = -8155569226780546304L;
        nx.lcvu[347] = 6392349704651069078L;
        nx.lcvu[348] = -3035503089371672003L;
        nx.lcvu[349] = 3924992255053202010L;
        nx.lcvu[350] = 694546138129034311L;
        nx.lcvu[351] = -4692515436545298345L;
        nx.lcvu[352] = -5527093281143406796L;
        nx.lcvu[353] = -7881726226848857699L;
        nx.lcvu[354] = 5256753572785516951L;
        nx.lcvu[355] = 948655754991419043L;
        nx.lcvu[356] = 1051455668763240637L;
        nx.lcvu[357] = 4651435419309628632L;
        nx.lcvu[358] = 3453920453771071815L;
        nx.lcvu[359] = -287096963858721769L;
        nx.lcvu[360] = 5516149592838001970L;
        nx.lcvu[361] = 1679471124309882753L;
        nx.lcvu[362] = 1401003985310328297L;
        nx.lcvu[363] = -1147528038217867453L;
        nx.lcvu[364] = 3836301325520941961L;
        nx.lcvu[365] = 6662148969920527351L;
        nx.lcvu[366] = -4040807467897064524L;
        nx.lcvu[367] = 283612891629963820L;
        nx.lcvu[368] = 3591661674512272765L;
        nx.lcvu[369] = 4166875725174634275L;
        nx.lcvu[370] = 6326265486127777861L;
        nx.lcvu[371] = 4014715978672258478L;
        nx.lcvu[372] = -6259262266309716388L;
        nx.lcvu[373] = -9130843372811711651L;
        nx.lcvu[374] = -8226184730180485771L;
        nx.lcvu[375] = 7365102505670830714L;
        nx.lcvu[376] = -6145967815788470681L;
        nx.lcvu[377] = -6198427137362965430L;
        nx.lcvu[378] = 2601296866359695921L;
        nx.lcvu[379] = -6136476182572598488L;
        nx.lcvu[380] = -6197300041896962572L;
        nx.lcvu[381] = -6444272211209848305L;
        nx.lcvu[382] = -3264868657663486356L;
        nx.lcvu[383] = -6343499365850587544L;
        nx.lcvu[384] = -8348818414128162904L;
        nx.lcvu[385] = 7270602697393868791L;
        nx.lcvu[386] = 3755849806091662931L;
        nx.lcvu[387] = -1711223294578701681L;
        nx.lcvu[388] = 6599288409659969327L;
        nx.lcvu[389] = 4737983647448008942L;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public nx() {
        var2_1 /* !! */  = nx.b;
        super();
        this.saved = nx.lcvf("lcvh", lcvb(int ), (int)0);
        if (var2_1 /* !! */  == 0) ** GOTO lbl-1000
        switch (var2_1 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                this.blocked = nx.lcvf("lcvi", lcvb(int ), (int)1);
                return;
            }
lbl9:
            // 2 sources

            case 0: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var2_1 /* !! */  = (int)nx.lcvf("lcvj", lcvb(int ), (int)2);
                    continue;
                    break;
                }
            }
lbl13:
            // 2 sources

            case 1: {
                var2_1 /* !! */  = (int)nx.lcvf("lcvk", lcvb(int ), (int)3);
                ** GOTO lbl9
            }
            case 2: {
                var2_1 /* !! */  = (int)nx.lcvf("lcvl", lcvb(int ), (int)4);
                ** GOTO lbl13
            }
            case 3: 
        }
        var2_1 /* !! */  = (int)nx.lcvf("lcvm", lcvb(int ), (int)5);
        ** while (true)
    }

    private static /* synthetic */ int lcvb(int n2) {
        return lcvc[n2] ^ lcve[n2];
    }

    private static /* synthetic */ long lcvs(int n2) {
        return lcvu[n2] ^ lcvv[n2];
    }

    private static /* synthetic */ void lggr() {
        nx.lcvc[200] = 252648977;
        nx.lcvc[201] = 1085672076;
        nx.lcvc[202] = 402507638;
        nx.lcvc[203] = -428106913;
        nx.lcvc[204] = 372024053;
        nx.lcvc[205] = -1476752532;
        nx.lcvc[206] = -647978478;
        nx.lcvc[207] = -412180459;
        nx.lcvc[208] = 1846720100;
        nx.lcvc[209] = -1727085217;
        nx.lcvc[210] = -1775278300;
        nx.lcvc[211] = -2043869856;
        nx.lcvc[212] = -191115813;
        nx.lcvc[213] = -698530479;
        nx.lcvc[214] = 941219553;
        nx.lcvc[215] = 1077267274;
        nx.lcvc[216] = 291107720;
        nx.lcvc[217] = 1247538271;
        nx.lcvc[218] = -1852750995;
        nx.lcvc[219] = -1631242570;
        nx.lcvc[220] = -727476300;
        nx.lcvc[221] = 1292309484;
        nx.lcvc[222] = -1459310132;
        nx.lcvc[223] = 153346430;
        nx.lcvc[224] = -1207188231;
        nx.lcvc[225] = -1533144587;
        nx.lcvc[226] = -1394928416;
        nx.lcvc[227] = 2103440604;
        nx.lcvc[228] = -1957835495;
        nx.lcvc[229] = 935981860;
        nx.lcvc[230] = -598721379;
        nx.lcvc[231] = -2065201561;
        nx.lcvc[232] = 2125867166;
        nx.lcvc[233] = 2116502206;
        nx.lcvc[234] = -1551373001;
        nx.lcvc[235] = 1610212619;
        nx.lcvc[236] = -1812488903;
        nx.lcvc[237] = 1404531980;
        nx.lcvc[238] = 303402331;
        nx.lcvc[239] = -1653848473;
        nx.lcvc[240] = 1704691167;
        nx.lcvc[241] = -339734261;
        nx.lcvc[242] = 2061748163;
        nx.lcvc[243] = -1709439697;
        nx.lcvc[244] = 253206004;
        nx.lcvc[245] = 917703651;
        nx.lcvc[246] = 1811358517;
        nx.lcvc[247] = -903856025;
        nx.lcvc[248] = -2127940083;
        nx.lcvc[249] = 1459400493;
        nx.lcvc[250] = 261399192;
        nx.lcvc[251] = 471811149;
        nx.lcvc[252] = -1503037840;
        nx.lcvc[253] = -1028257265;
        nx.lcvc[254] = -2008921230;
        nx.lcvc[255] = 2142986979;
        nx.lcvc[256] = -385472816;
        nx.lcvc[257] = 1493967988;
        nx.lcvc[258] = 1590756704;
        nx.lcvc[259] = -612689575;
        nx.lcvc[260] = 1519869272;
        nx.lcvc[261] = 1295043745;
        nx.lcvc[262] = -1759653211;
        nx.lcvc[263] = -809983444;
        nx.lcvc[264] = 1466558713;
        nx.lcvc[265] = 97563830;
        nx.lcvc[266] = -1839368504;
        nx.lcvc[267] = -1066487883;
        nx.lcvc[268] = -1946678577;
        nx.lcvc[269] = 793997611;
        nx.lcvc[270] = -489103554;
        nx.lcvc[271] = 1888566722;
        nx.lcvc[272] = 1909064978;
        nx.lcvc[273] = 1622981657;
        nx.lcvc[274] = -1327605301;
        nx.lcvc[275] = 1610050896;
        nx.lcvc[276] = -617748459;
        nx.lcvc[277] = -789280996;
        nx.lcvc[278] = -1771517038;
        nx.lcvc[279] = 420997542;
        nx.lcvc[280] = 256050476;
        nx.lcvc[281] = -1347872670;
        nx.lcvc[282] = 460628639;
        nx.lcvc[283] = -343066385;
        nx.lcvc[284] = 179764752;
        nx.lcvc[285] = -596727154;
        nx.lcvc[286] = -1040534499;
        nx.lcvc[287] = 1797018975;
        nx.lcvc[288] = 584950037;
        nx.lcvc[289] = 1466887117;
        nx.lcvc[290] = 82918635;
        nx.lcvc[291] = 1832807001;
        nx.lcvc[292] = -1697154725;
        nx.lcvc[293] = -532562647;
        nx.lcvc[294] = -1832457241;
        nx.lcvc[295] = 229282350;
        nx.lcvc[296] = 238020741;
        nx.lcvc[297] = 1423312266;
        nx.lcvc[298] = 1585861403;
        nx.lcvc[299] = 1075808943;
    }

    private static /* synthetic */ void lghl() {
        nx.lcvu[200] = -4027324432584629141L;
        nx.lcvu[201] = 1845297253942255295L;
        nx.lcvu[202] = -1450793540775233157L;
        nx.lcvu[203] = -10677770684597772L;
        nx.lcvu[204] = -8726947922855197014L;
        nx.lcvu[205] = -7826955245169025789L;
        nx.lcvu[206] = -513540462890561922L;
        nx.lcvu[207] = 2373707105322588975L;
        nx.lcvu[208] = -3380254345942914230L;
        nx.lcvu[209] = -2989708554488648306L;
        nx.lcvu[210] = 8038320150292857231L;
        nx.lcvu[211] = -8085967338264764853L;
        nx.lcvu[212] = 5976503211762841338L;
        nx.lcvu[213] = -8770143197813700681L;
        nx.lcvu[214] = -4792792391097724404L;
        nx.lcvu[215] = 2409703401472713674L;
        nx.lcvu[216] = 4280944266740120125L;
        nx.lcvu[217] = 8848982992024582441L;
        nx.lcvu[218] = 8911606619033847178L;
        nx.lcvu[219] = 1618341012998949736L;
        nx.lcvu[220] = -1263571004992590382L;
        nx.lcvu[221] = -4637929988645550802L;
        nx.lcvu[222] = 7984421279976293292L;
        nx.lcvu[223] = 2262443532838552873L;
        nx.lcvu[224] = 5517546972385905213L;
        nx.lcvu[225] = -4867044804640263134L;
        nx.lcvu[226] = 5812529639637729427L;
        nx.lcvu[227] = 7765881620198163331L;
        nx.lcvu[228] = -7734861347656795195L;
        nx.lcvu[229] = -3454666684182429882L;
        nx.lcvu[230] = -214891553695874084L;
        nx.lcvu[231] = 8242324051144861L;
        nx.lcvu[232] = 579354953389432855L;
        nx.lcvu[233] = -2173117494159652431L;
        nx.lcvu[234] = 817180693143199263L;
        nx.lcvu[235] = -3123281053137273902L;
        nx.lcvu[236] = 6634064412246938167L;
        nx.lcvu[237] = 7842381757931477720L;
        nx.lcvu[238] = -2674754463605574385L;
        nx.lcvu[239] = -6923016999199882950L;
        nx.lcvu[240] = 859184890130566931L;
        nx.lcvu[241] = 1450272544322503439L;
        nx.lcvu[242] = 4459327846733573557L;
        nx.lcvu[243] = 4724141225838018289L;
        nx.lcvu[244] = 8398304074345800008L;
        nx.lcvu[245] = -8310498099717326172L;
        nx.lcvu[246] = -3599090610638298732L;
        nx.lcvu[247] = -6798211518951755814L;
        nx.lcvu[248] = -1811537360594564897L;
        nx.lcvu[249] = 5071490845949428368L;
        nx.lcvu[250] = -9182327053251477488L;
        nx.lcvu[251] = -7969220926478963220L;
        nx.lcvu[252] = 3566507917735220454L;
        nx.lcvu[253] = -210246843342405975L;
        nx.lcvu[254] = -3964940402412764566L;
        nx.lcvu[255] = -8660961499657225062L;
        nx.lcvu[256] = 2624768650990664749L;
        nx.lcvu[257] = -1275734299483744183L;
        nx.lcvu[258] = 1027927489273472604L;
        nx.lcvu[259] = -5912492135248744726L;
        nx.lcvu[260] = -438611769033974755L;
        nx.lcvu[261] = 7757959508910935383L;
        nx.lcvu[262] = 3023195941704880942L;
        nx.lcvu[263] = 4968347314603105037L;
        nx.lcvu[264] = -7767113253561565982L;
        nx.lcvu[265] = -4606346893707005838L;
        nx.lcvu[266] = 7409248838357749656L;
        nx.lcvu[267] = 540297869286910033L;
        nx.lcvu[268] = -7651819556622963056L;
        nx.lcvu[269] = 7988432556575909864L;
        nx.lcvu[270] = 6877144469490763384L;
        nx.lcvu[271] = 2957625844869798362L;
        nx.lcvu[272] = -7811133457939522126L;
        nx.lcvu[273] = -2635719675391182612L;
        nx.lcvu[274] = -3881306155499400042L;
        nx.lcvu[275] = -3908527878908685501L;
        nx.lcvu[276] = 9002386861230293836L;
        nx.lcvu[277] = 2227623768608241030L;
        nx.lcvu[278] = -3804608613503702095L;
        nx.lcvu[279] = -7547033441573665710L;
        nx.lcvu[280] = 7837548285988316464L;
        nx.lcvu[281] = -3830672981588861568L;
        nx.lcvu[282] = 4681192545909629913L;
        nx.lcvu[283] = 2952575827141174578L;
        nx.lcvu[284] = -1811541300147277946L;
        nx.lcvu[285] = -1909738240085120294L;
        nx.lcvu[286] = 9199205862554768388L;
        nx.lcvu[287] = -7860975787406662915L;
        nx.lcvu[288] = -8038977403305802216L;
        nx.lcvu[289] = 7644338355381698039L;
        nx.lcvu[290] = -4382984620370998338L;
        nx.lcvu[291] = 1376746202140979249L;
        nx.lcvu[292] = 9053012771501406556L;
        nx.lcvu[293] = 5520511981515545540L;
        nx.lcvu[294] = 95399529405277107L;
        nx.lcvu[295] = -6106109701809826143L;
        nx.lcvu[296] = 6431846989078146846L;
        nx.lcvu[297] = 6170519719942366341L;
        nx.lcvu[298] = -4678087691845257726L;
        nx.lcvu[299] = 4736607624398050145L;
    }
}


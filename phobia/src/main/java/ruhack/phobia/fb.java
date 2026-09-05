/*
 * Decompiled with CFR 0.152.
 */
package ruhack.phobia;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Locale;
import ruhack.phobia.aw;
import ruhack.phobia.be;
import ruhack.phobia.dl;
import ruhack.phobia.ds;
import ruhack.phobia.du;
import ruhack.phobia.kb;
import ruhack.phobia.kh;

public class fb
extends ds {
    private final kb friends;
    public static final boolean c;
    public static final int b;
    private static int[] bbrf;
    private static fb instance;
    private static long[] bbrq;
    private final kh replacement;
    private static long[] bbrp;
    public static final boolean a;
    private static final long cv = -2012716564506626093L;
    private static int[] bbre;

    static {
        bbre = new int[104];
        bbrf = new int[104];
        fb.bbxs();
        fb.bbxt();
        fb.bbxu();
        fb.bbxv();
        bbrp = new long[60];
        bbrq = new long[60];
        fb.bbxw();
        fb.bbxx();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static String replaceIgnoreCase(String var0, String var1_1, String var2_2) {
        block72: {
            block71: {
                var10_3 = fb.c;
                var9_4 /* !! */  = fb.b;
                var8_5 = fb.a;
                if (var10_3) {
                    throw null;
lbl6:
                    // 18 sources

                    return null;
                }
                if (var8_5 || var8_5) ** GOTO lbl6
                if (var1_1 == null) break block71;
                if (var8_5) ** GOTO lbl6
                if (!var1_1.isBlank()) break block72;
                if (var8_5) ** GOTO lbl6
            }
            if (var8_5 || var8_5) ** GOTO lbl6
            return var0;
        }
        if (var8_5 || var8_5) ** GOTO lbl6
        var3_6 = var0.toLowerCase(Locale.ROOT);
        if (var8_5 || var8_5) ** GOTO lbl6
        var4_7 = var1_1.toLowerCase(Locale.ROOT);
        if (var8_5 || var8_5) ** GOTO lbl6
        var5_8 = var3_6.indexOf(var4_7);
        if (var9_4 /* !! */  == 0) ** GOTO lbl-1000
        switch (var9_4 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (var8_5 || var8_5) ** GOTO lbl6
                if (var5_8 >= 0) ** GOTO lbl30
                if (var8_5) ** GOTO lbl6
                return var0;
lbl30:
                // 1 sources

                if (var8_5 || var8_5) ** GOTO lbl6
                var6_9 = new StringBuilder(var0.length());
                if (var8_5 || var8_5) ** GOTO lbl6
                var7_10 /* !! */  = fb.bbrg("bbwi", bbrd(int ), (int)68);
                if (var8_5) ** GOTO lbl6
                do {
                    if (var8_5 || var8_5) ** GOTO lbl6
                    if (var5_8 < 0) ** GOTO lbl48
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var6_9.append(var0, (int)var7_10 /* !! */ , var5_8).append(var2_2);
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var7_10 /* !! */  = (CallSite)(var5_8 + var1_1.length());
                    if (var8_5 || var8_5) ** GOTO lbl6
                    var5_8 = var3_6.indexOf(var4_7, (int)var7_10 /* !! */ );
                    if (var8_5) ** GOTO lbl6
                } while (!var10_3);
                throw null;
lbl48:
                // 1 sources

                if (!var8_5 && !var8_5) ** break;
                ** continue;
                return var6_9.append(var0, (int)var7_10 /* !! */ , var0.length()).toString();
            }
            case 0: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwj", bbrd(int ), (int)69);
                if (!var10_3) break;
                throw null;
            }
            case 1: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwk", bbrd(int ), (int)70);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl70
            }
lbl60:
            // 3 sources

            case 2: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwl", bbrd(int ), (int)71);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl80
            }
            case 3: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwm", bbrd(int ), (int)72);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl126
            }
lbl70:
            // 2 sources

            case 4: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwn", bbrd(int ), (int)73);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl104
            }
lbl75:
            // 2 sources

            case 5: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwo", bbrd(int ), (int)74);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl94
            }
lbl80:
            // 2 sources

            case 6: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwp", bbrd(int ), (int)75);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl117
            }
lbl85:
            // 3 sources

            case 7: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwq", bbrd(int ), (int)76);
                if (var10_3) {
                    throw null;
                }
            }
            case 8: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwr", bbrd(int ), (int)77);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl109
            }
lbl94:
            // 2 sources

            case 9: {
                var9_4 /* !! */  = (int)fb.bbrg("bbws", bbrd(int ), (int)78);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl131
            }
            case 10: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwt", bbrd(int ), (int)79);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl104:
            // 2 sources

            case 11: {
                do {
                    var9_4 /* !! */  = (int)fb.bbrg("bbwu", bbrd(int ), (int)80);
                } while (!var10_3);
                throw null;
            }
lbl109:
            // 3 sources

            case 12: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwv", bbrd(int ), (int)81);
                if (!var10_3) ** GOTO lbl75
                throw null;
            }
            case 13: {
                var9_4 /* !! */  = (int)fb.bbrg("bbww", bbrd(int ), (int)82);
                if (!var10_3) ** GOTO lbl85
                throw null;
            }
lbl117:
            // 2 sources

            case 14: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwx", bbrd(int ), (int)83);
                if (!var10_3) ** GOTO lbl60
                throw null;
            }
            case 15: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwy", bbrd(int ), (int)84);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl199
            }
lbl126:
            // 3 sources

            case 16: {
                var9_4 /* !! */  = (int)fb.bbrg("bbwz", bbrd(int ), (int)85);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl165
            }
lbl131:
            // 4 sources

            case 17: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var9_4 /* !! */  = (int)fb.bbrg("bbxa", bbrd(int ), (int)86);
                    if (var10_3) {
                        throw null;
                    }
                    ** GOTO lbl146
                    break;
                }
            }
lbl137:
            // 2 sources

            case 18: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxb", bbrd(int ), (int)87);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl174
            }
lbl142:
            // 2 sources

            case 19: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxc", bbrd(int ), (int)88);
                if (!var10_3) ** GOTO lbl60
                throw null;
            }
lbl146:
            // 2 sources

            case 20: {
                do {
                    var9_4 /* !! */  = (int)fb.bbrg("bbxd", bbrd(int ), (int)89);
                } while (!var10_3);
                throw null;
            }
            case 21: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxe", bbrd(int ), (int)90);
                if (!var10_3) ** GOTO lbl131
                throw null;
            }
            case 22: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxf", bbrd(int ), (int)91);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl179
            }
            case 23: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxg", bbrd(int ), (int)92);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl165:
            // 2 sources

            case 24: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxh", bbrd(int ), (int)93);
                if (var10_3) {
                    throw null;
                }
                ** GOTO lbl183
            }
lbl170:
            // 2 sources

            case 25: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxi", bbrd(int ), (int)94);
                if (!var10_3) ** GOTO lbl142
                throw null;
            }
lbl174:
            // 2 sources

            case 26: {
                do {
                    var9_4 /* !! */  = (int)fb.bbrg("bbxj", bbrd(int ), (int)95);
                } while (!var10_3);
                throw null;
            }
lbl179:
            // 2 sources

            case 27: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxk", bbrd(int ), (int)96);
                if (!var10_3) ** GOTO lbl126
                throw null;
            }
lbl183:
            // 4 sources

            case 28: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxl", bbrd(int ), (int)97);
                if (!var10_3) ** GOTO lbl109
                throw null;
            }
lbl187:
            // 2 sources

            case 29: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxm", bbrd(int ), (int)98);
                if (!var10_3) ** GOTO lbl85
                throw null;
            }
            case 30: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxn", bbrd(int ), (int)99);
                if (!var10_3) ** GOTO lbl170
                throw null;
            }
            case 31: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxo", bbrd(int ), (int)100);
                if (!var10_3) ** GOTO lbl131
                throw null;
            }
lbl199:
            // 2 sources

            case 32: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxp", bbrd(int ), (int)101);
                if (!var10_3) ** GOTO lbl187
                throw null;
            }
            case 33: {
                var9_4 /* !! */  = (int)fb.bbrg("bbxq", bbrd(int ), (int)102);
                if (!var10_3) ** GOTO lbl137
                throw null;
            }
            case 34: 
        }
        var9_4 /* !! */  = (int)fb.bbrg("bbxr", bbrd(int ), (int)103);
        ** while (!var10_3)
lbl210:
        // 1 sources

        throw null;
    }

    public static /* synthetic */ CallSite bbrg(MethodHandles.Lookup lookup, String string, MethodType methodType, MethodHandle methodHandle) {
        return new ConstantCallSite(methodHandle.asType(methodType));
    }

    private static /* synthetic */ void bbxu() {
        fb.bbrf[0] = -1659136504;
        fb.bbrf[1] = -1857306945;
        fb.bbrf[2] = -968800641;
        fb.bbrf[3] = 390068745;
        fb.bbrf[4] = 2092488840;
        fb.bbrf[5] = 737788445;
        fb.bbrf[6] = 1610710622;
        fb.bbrf[7] = -422145866;
        fb.bbrf[8] = -2140416544;
        fb.bbrf[9] = 614108422;
        fb.bbrf[10] = -237012418;
        fb.bbrf[11] = -668154884;
        fb.bbrf[12] = -1578731179;
        fb.bbrf[13] = -380217125;
        fb.bbrf[14] = 1758328550;
        fb.bbrf[15] = -491598085;
        fb.bbrf[16] = 913358440;
        fb.bbrf[17] = 2140832220;
        fb.bbrf[18] = -825322063;
        fb.bbrf[19] = -854837857;
        fb.bbrf[20] = 88535412;
        fb.bbrf[21] = 1246146141;
        fb.bbrf[22] = 857955239;
        fb.bbrf[23] = 1378023783;
        fb.bbrf[24] = -563884736;
        fb.bbrf[25] = 1071410304;
        fb.bbrf[26] = 153958234;
        fb.bbrf[27] = 600401899;
        fb.bbrf[28] = 1320759910;
        fb.bbrf[29] = -1679577808;
        fb.bbrf[30] = -399629703;
        fb.bbrf[31] = -739376847;
        fb.bbrf[32] = 288532934;
        fb.bbrf[33] = -1345961379;
        fb.bbrf[34] = 791394109;
        fb.bbrf[35] = -1654026343;
        fb.bbrf[36] = 1549060789;
        fb.bbrf[37] = -672210208;
        fb.bbrf[38] = 32091281;
        fb.bbrf[39] = 554417016;
        fb.bbrf[40] = -54700836;
        fb.bbrf[41] = 387431458;
        fb.bbrf[42] = -377781631;
        fb.bbrf[43] = -713556249;
        fb.bbrf[44] = -1911548415;
        fb.bbrf[45] = -1693186773;
        fb.bbrf[46] = -1503796227;
        fb.bbrf[47] = -983648488;
        fb.bbrf[48] = -1485664718;
        fb.bbrf[49] = 1245537645;
        fb.bbrf[50] = 1288734154;
        fb.bbrf[51] = -9072877;
        fb.bbrf[52] = -2024996806;
        fb.bbrf[53] = 828821030;
        fb.bbrf[54] = -185189049;
        fb.bbrf[55] = -135570348;
        fb.bbrf[56] = -1351732252;
        fb.bbrf[57] = 1616258242;
        fb.bbrf[58] = -1243060986;
        fb.bbrf[59] = -327751216;
        fb.bbrf[60] = 1768783532;
        fb.bbrf[61] = 2034478973;
        fb.bbrf[62] = -1715243362;
        fb.bbrf[63] = -950472907;
        fb.bbrf[64] = 492315576;
        fb.bbrf[65] = 1775315020;
        fb.bbrf[66] = 2080566718;
        fb.bbrf[67] = 149928054;
        fb.bbrf[68] = 1405107976;
        fb.bbrf[69] = -1633379843;
        fb.bbrf[70] = 978307205;
        fb.bbrf[71] = 1012875654;
        fb.bbrf[72] = -84758548;
        fb.bbrf[73] = -1494127716;
        fb.bbrf[74] = -1371129583;
        fb.bbrf[75] = -88552861;
        fb.bbrf[76] = 964474550;
        fb.bbrf[77] = 1560034840;
        fb.bbrf[78] = -236168106;
        fb.bbrf[79] = 490284885;
        fb.bbrf[80] = -981386831;
        fb.bbrf[81] = -632520665;
        fb.bbrf[82] = -237172176;
        fb.bbrf[83] = -1696247433;
        fb.bbrf[84] = -1679235759;
        fb.bbrf[85] = 2080955494;
        fb.bbrf[86] = 348590778;
        fb.bbrf[87] = -1941898378;
        fb.bbrf[88] = -1149789269;
        fb.bbrf[89] = 606725571;
        fb.bbrf[90] = 689077472;
        fb.bbrf[91] = -648860008;
        fb.bbrf[92] = -1719343321;
        fb.bbrf[93] = 2030085662;
        fb.bbrf[94] = 209885746;
        fb.bbrf[95] = 1458123776;
        fb.bbrf[96] = -1212390285;
        fb.bbrf[97] = -867896530;
        fb.bbrf[98] = -406518789;
        fb.bbrf[99] = 1078480431;
    }

    private static /* synthetic */ void bbxw() {
        fb.bbrp[0] = 3890483667178706318L;
        fb.bbrp[1] = -7724485060831366790L;
        fb.bbrp[2] = -4591709160718808958L;
        fb.bbrp[3] = 5943069504647525802L;
        fb.bbrp[4] = 1088353380339412222L;
        fb.bbrp[5] = -5239819780231479835L;
        fb.bbrp[6] = -5340441520114314477L;
        fb.bbrp[7] = 7140666698846789313L;
        fb.bbrp[8] = 7850448700335400489L;
        fb.bbrp[9] = -1211030727980408193L;
        fb.bbrp[10] = -1579333775517349054L;
        fb.bbrp[11] = -2849520123917277930L;
        fb.bbrp[12] = 686072778126686743L;
        fb.bbrp[13] = -4060349124401349646L;
        fb.bbrp[14] = -4210580054884815312L;
        fb.bbrp[15] = 6676934049616927504L;
        fb.bbrp[16] = -976600080389685833L;
        fb.bbrp[17] = -8508988330708544673L;
        fb.bbrp[18] = -4883903553693504005L;
        fb.bbrp[19] = 859045526326020133L;
        fb.bbrp[20] = -7711472310253267968L;
        fb.bbrp[21] = -1207292121585937645L;
        fb.bbrp[22] = -4519940964579518200L;
        fb.bbrp[23] = -2766002759687637633L;
        fb.bbrp[24] = 6407976449820172181L;
        fb.bbrp[25] = -1598936407093983456L;
        fb.bbrp[26] = 1607223406725236271L;
        fb.bbrp[27] = 7139948443505664328L;
        fb.bbrp[28] = 1405629977380828175L;
        fb.bbrp[29] = 1710441697282081108L;
        fb.bbrp[30] = 5991993979573524351L;
        fb.bbrp[31] = -6139687752756433163L;
        fb.bbrp[32] = -1357387428368432461L;
        fb.bbrp[33] = -8160382909424611975L;
        fb.bbrp[34] = -4358452448147227826L;
        fb.bbrp[35] = 161484273119344366L;
        fb.bbrp[36] = 6268139235538999411L;
        fb.bbrp[37] = -892135440106764267L;
        fb.bbrp[38] = -672810472993362395L;
        fb.bbrp[39] = -5648442083160432334L;
        fb.bbrp[40] = 5241181326957440444L;
        fb.bbrp[41] = -4695701101959225327L;
        fb.bbrp[42] = 2858234125181782755L;
        fb.bbrp[43] = -5381205619983629189L;
        fb.bbrp[44] = 456805461229013818L;
        fb.bbrp[45] = 1241246162808930294L;
        fb.bbrp[46] = 5317681094842762362L;
        fb.bbrp[47] = 2805960210861205397L;
        fb.bbrp[48] = -699591736573783991L;
        fb.bbrp[49] = -1760308222873125319L;
        fb.bbrp[50] = -8829751919002166089L;
        fb.bbrp[51] = 547966658947777376L;
        fb.bbrp[52] = -6644046930837671988L;
        fb.bbrp[53] = 1582101934567029760L;
        fb.bbrp[54] = -1125675574564429720L;
        fb.bbrp[55] = -6326465082586068911L;
        fb.bbrp[56] = -8835579849373630113L;
        fb.bbrp[57] = 2930970346287624971L;
        fb.bbrp[58] = 970009827675347596L;
        fb.bbrp[59] = 5574269777889204302L;
    }

    private static /* synthetic */ void bbxs() {
        fb.bbre[0] = -1659136499;
        fb.bbre[1] = -1857306947;
        fb.bbre[2] = -968800642;
        fb.bbre[3] = 390068749;
        fb.bbre[4] = 2092488841;
        fb.bbre[5] = 737788447;
        fb.bbre[6] = 1610710623;
        fb.bbre[7] = -422145865;
        fb.bbre[8] = -1654130396;
        fb.bbre[9] = 614108421;
        fb.bbre[10] = -237012417;
        fb.bbre[11] = -668154887;
        fb.bbre[12] = -1578731179;
        fb.bbre[13] = -380217121;
        fb.bbre[14] = 1758328549;
        fb.bbre[15] = -491598086;
        fb.bbre[16] = 355104679;
        fb.bbre[17] = 2140832221;
        fb.bbre[18] = 1195814368;
        fb.bbre[19] = -854837858;
        fb.bbre[20] = -65486141;
        fb.bbre[21] = -1246146142;
        fb.bbre[22] = 1790377524;
        fb.bbre[23] = -1378023784;
        fb.bbre[24] = -444241700;
        fb.bbre[25] = 1071410305;
        fb.bbre[26] = -1333441983;
        fb.bbre[27] = -600401900;
        fb.bbre[28] = -402904971;
        fb.bbre[29] = 1679577807;
        fb.bbre[30] = -962447664;
        fb.bbre[31] = 739376846;
        fb.bbre[32] = -629722413;
        fb.bbre[33] = -1345961380;
        fb.bbre[34] = -2119062471;
        fb.bbre[35] = -1654026344;
        fb.bbre[36] = -296965140;
        fb.bbre[37] = 672210207;
        fb.bbre[38] = -1066806270;
        fb.bbre[39] = 554417015;
        fb.bbre[40] = -54700858;
        fb.bbre[41] = 387431475;
        fb.bbre[42] = -377781624;
        fb.bbre[43] = -713556240;
        fb.bbre[44] = -1911548396;
        fb.bbre[45] = -1693186759;
        fb.bbre[46] = -1503796241;
        fb.bbre[47] = -983648504;
        fb.bbre[48] = -1485664731;
        fb.bbre[49] = 1245537654;
        fb.bbre[50] = 1288734148;
        fb.bbre[51] = -9072879;
        fb.bbre[52] = -2024996807;
        fb.bbre[53] = 828821039;
        fb.bbre[54] = -185189044;
        fb.bbre[55] = -135570364;
        fb.bbre[56] = -1351732242;
        fb.bbre[57] = 1616258250;
        fb.bbre[58] = -1243060976;
        fb.bbre[59] = -327751203;
        fb.bbre[60] = 1768783521;
        fb.bbre[61] = 2034478955;
        fb.bbre[62] = -1715243378;
        fb.bbre[63] = -950472900;
        fb.bbre[64] = 492315565;
        fb.bbre[65] = 1775315016;
        fb.bbre[66] = 2080566692;
        fb.bbre[67] = 149928052;
        fb.bbre[68] = 1405107976;
        fb.bbre[69] = -1633379870;
        fb.bbre[70] = 978307207;
        fb.bbre[71] = 1012875661;
        fb.bbre[72] = -84758549;
        fb.bbre[73] = -1494127742;
        fb.bbre[74] = -1371129595;
        fb.bbre[75] = -88552838;
        fb.bbre[76] = 964474535;
        fb.bbre[77] = 1560034826;
        fb.bbre[78] = -236168097;
        fb.bbre[79] = 490284885;
        fb.bbre[80] = -981386823;
        fb.bbre[81] = -632520666;
        fb.bbre[82] = -237172172;
        fb.bbre[83] = -1696247447;
        fb.bbre[84] = -1679235759;
        fb.bbre[85] = 2080955494;
        fb.bbre[86] = 348590770;
        fb.bbre[87] = -1941898386;
        fb.bbre[88] = -1149789253;
        fb.bbre[89] = 606725598;
        fb.bbre[90] = 689077503;
        fb.bbre[91] = -648860021;
        fb.bbre[92] = -1719343299;
        fb.bbre[93] = 2030085647;
        fb.bbre[94] = 209885744;
        fb.bbre[95] = 1458123794;
        fb.bbre[96] = -1212390285;
        fb.bbre[97] = -867896514;
        fb.bbre[98] = -406518786;
        fb.bbre[99] = 1078480445;
    }

    public fb() {
        int n2 = b;
        super("NameProtect", "\u0421\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u0432\u0430\u0448 \u043d\u0438\u043a \u0432 \u043e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u043c\u043e\u043c \u0442\u0435\u043a\u0441\u0442\u0435", du.MISC);
        this.replacement = new kh("\u0417\u0430\u043c\u0435\u043d\u0430", "\u0422\u0435\u043a\u0441\u0442 \u0432\u043c\u0435\u0441\u0442\u043e \u043d\u0430\u0441\u0442\u043e\u044f\u0449\u0435\u0433\u043e \u043d\u0438\u043a\u0430", "Protected");
        this.friends = new kb("\u0421\u043a\u0440\u044b\u0432\u0430\u0442\u044c \u0434\u0440\u0443\u0437\u0435\u0439", "\u0422\u0430\u043a\u0436\u0435 \u0437\u0430\u043c\u0435\u043d\u044f\u0442\u044c \u043d\u0438\u043a\u0438 \u0434\u0440\u0443\u0437\u0435\u0439");
        instance = this;
        this.settings(this.replacement, this.friends);
    }

    private static /* synthetic */ void bbxv() {
        fb.bbrf[100] = -1624877126;
        fb.bbrf[101] = 1471786401;
        fb.bbrf[102] = -28650094;
        fb.bbrf[103] = 2122516174;
    }

    private static /* synthetic */ long bbro(int n2) {
        return bbrp[n2] ^ bbrq[n2];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @aw
    public void onText(be var1_1) {
        v0 /* !! */  = fb.cv;
        if (true) ** GOTO lbl5
        block34: while (true) {
            v0 /* !! */  = (long)(v1 - fb.bbrg("bbrr", bbro(int ), (int)0));
lbl5:
            // 2 sources

            switch ((int)v0 /* !! */ ) {
                case -1859170893: {
                    v1 = fb.bbrg("bbrs", bbro(int ), (int)1);
                    continue block34;
                }
                case -888555565: {
                    break block34;
                }
                case -209842769: {
                    v1 = fb.bbrg("bbrt", bbro(int ), (int)2);
                    continue block34;
                }
                case 2012455359: {
                    v1 = fb.bbrg("bbru", bbro(int ), (int)3);
                    continue block34;
                }
            }
            break;
        }
        var4_2 = fb.c;
        while (true) {
            if ((v2 /* !! */  = (cfr_temp_0 = fb.cv - fb.bbrg("bbrv", bbro(int ), (int)4)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) == false) {
                continue;
            }
            if (v2 /* !! */  == fb.bbrg("bbrw", bbrd(int ), (int)7)) break;
            v2 /* !! */  = (long)fb.bbrg("bbrx", bbrd(int ), (int)8);
        }
        var3_3 /* !! */  = fb.b;
        v3 /* !! */  = fb.cv;
        if (true) ** GOTO lbl29
        block36: while (true) {
            v3 /* !! */  = (long)(fb.bbrg("bbrz", bbro(int ), (int)6) - fb.bbrg("bbry", bbro(int ), (int)5));
lbl29:
            // 2 sources

            switch ((int)v3 /* !! */ ) {
                case -888555565: {
                    break block36;
                }
                case 1955727154: {
                    continue block36;
                }
            }
            break;
        }
        var2_4 = fb.a;
        if (var4_2) {
            throw null;
lbl37:
            // 3 sources

            return;
        }
        if (var2_4 || var2_4) ** GOTO lbl37
        v4 /* !! */  = fb.cv;
        if (true) ** GOTO lbl44
        block38: while (true) {
            v4 /* !! */  = (long)(v5 - fb.bbrg("bbsa", bbro(int ), (int)7));
lbl44:
            // 2 sources

            switch ((int)v4 /* !! */ ) {
                case -1737590501: {
                    v5 = fb.bbrg("bbsb", bbro(int ), (int)8);
                    continue block38;
                }
                case -888555565: {
                    break block38;
                }
                case 1797008882: {
                    v5 = fb.bbrg("bbsc", bbro(int ), (int)9);
                    continue block38;
                }
            }
            break;
        }
        v6 = var1_1.getText();
        v7 /* !! */  = fb.cv;
        if (true) ** GOTO lbl58
        block39: while (true) {
            v7 /* !! */  = (long)(v8 - fb.bbrg("bbsd", bbro(int ), (int)10));
lbl58:
            // 2 sources

            switch ((int)v7 /* !! */ ) {
                case -1626211509: {
                    v8 = fb.bbrg("bbse", bbro(int ), (int)11);
                    continue block39;
                }
                case -888555565: {
                    break block39;
                }
                case 422713428: {
                    v8 = fb.bbrg("bbsf", bbro(int ), (int)12);
                    continue block39;
                }
            }
            break;
        }
        v9 = fb.protect(v6);
        v10 /* !! */  = fb.cv;
        if (true) ** GOTO lbl72
        block40: while (true) {
            v10 /* !! */  = (long)(v11 - fb.bbrg("bbsg", bbro(int ), (int)13));
lbl72:
            // 2 sources

            switch ((int)v10 /* !! */ ) {
                case -888555565: {
                    break block40;
                }
                case -192833284: {
                    v11 = fb.bbrg("bbsh", bbro(int ), (int)14);
                    continue block40;
                }
                case 1254507400: {
                    v11 = fb.bbrg("bbsi", bbro(int ), (int)15);
                    continue block40;
                }
                case 1718183696: {
                    v11 = fb.bbrg("bbsj", bbro(int ), (int)16);
                    continue block40;
                }
            }
            break;
        }
        var1_1.setText(v9);
        if (var2_4) ** GOTO lbl37
        if (var3_3 /* !! */  == 0) ** GOTO lbl-1000
        switch (var3_3 /* !! */ ) {
            default: lbl-1000:
            // 2 sources

            {
                if (!var2_4) ** break;
                ** continue;
                return;
            }
lbl92:
            // 3 sources

            case 0: {
                var3_3 /* !! */  = (int)fb.bbrg("bbsk", bbrd(int ), (int)9);
                if (var4_2) {
                    throw null;
                }
                ** GOTO lbl103
            }
            case 1: lbl-1000:
            // 2 sources

            {
                while (true) {
                    var3_3 /* !! */  = (int)fb.bbrg("bbsl", bbrd(int ), (int)10);
                    if (var4_2) {
                        throw null;
                    }
                    ** GOTO lbl111
                    break;
                }
            }
lbl103:
            // 2 sources

            case 2: {
                var3_3 /* !! */  = (int)fb.bbrg("bbsm", bbrd(int ), (int)11);
                if (!var4_2) break;
                throw null;
            }
            case 3: {
                var3_3 /* !! */  = (int)fb.bbrg("bbsn", bbrd(int ), (int)12);
                if (!var4_2) ** GOTO lbl92
                throw null;
            }
lbl111:
            // 2 sources

            case 4: {
                var3_3 /* !! */  = (int)fb.bbrg("bbso", bbrd(int ), (int)13);
                if (!var4_2) ** GOTO lbl92
                throw null;
            }
            case 5: 
        }
        var3_3 /* !! */  = (int)fb.bbrg("bbsp", bbrd(int ), (int)14);
        ** while (!var4_2)
lbl118:
        // 1 sources

        throw null;
    }

    private static /* synthetic */ void bbxx() {
        fb.bbrq[0] = -8242801858910134644L;
        fb.bbrq[1] = 4117633024717835490L;
        fb.bbrq[2] = -2213200930920493682L;
        fb.bbrq[3] = 4548303564129471688L;
        fb.bbrq[4] = -3258104919483151130L;
        fb.bbrq[5] = 5578981164982975616L;
        fb.bbrq[6] = -7995564271667727138L;
        fb.bbrq[7] = -2142910941743750449L;
        fb.bbrq[8] = -4246758120715121551L;
        fb.bbrq[9] = -4596986582710041087L;
        fb.bbrq[10] = -1081652151924624491L;
        fb.bbrq[11] = 6726031376475759732L;
        fb.bbrq[12] = -6171015610213096155L;
        fb.bbrq[13] = 3950177244238594152L;
        fb.bbrq[14] = -6347089255747464013L;
        fb.bbrq[15] = 2457611601974883060L;
        fb.bbrq[16] = -165233095650771813L;
        fb.bbrq[17] = -8766180631050287605L;
        fb.bbrq[18] = 24224323526642882L;
        fb.bbrq[19] = 4138648206228549227L;
        fb.bbrq[20] = -6599341302776636720L;
        fb.bbrq[21] = 9173803052644862397L;
        fb.bbrq[22] = 5723044228169847607L;
        fb.bbrq[23] = 1547403215570350992L;
        fb.bbrq[24] = -5804834921470560939L;
        fb.bbrq[25] = -6026540286473121838L;
        fb.bbrq[26] = -3932521982194121352L;
        fb.bbrq[27] = 2528569731235903973L;
        fb.bbrq[28] = -6622944214538692214L;
        fb.bbrq[29] = 3017177177998041584L;
        fb.bbrq[30] = -4088927885307098842L;
        fb.bbrq[31] = -8612716640000519178L;
        fb.bbrq[32] = 6625426849988743837L;
        fb.bbrq[33] = -1949053562292215214L;
        fb.bbrq[34] = -6918763372244152664L;
        fb.bbrq[35] = 1980324809414062884L;
        fb.bbrq[36] = -8745180407144166466L;
        fb.bbrq[37] = 8789833163936972116L;
        fb.bbrq[38] = 6083066229281158316L;
        fb.bbrq[39] = -1252886723720414170L;
        fb.bbrq[40] = 9057256218103969659L;
        fb.bbrq[41] = -1289697744064147338L;
        fb.bbrq[42] = 7859124584670033619L;
        fb.bbrq[43] = -9158748919371574552L;
        fb.bbrq[44] = 7083039112622637815L;
        fb.bbrq[45] = -5106902320660811008L;
        fb.bbrq[46] = -3528709657257880754L;
        fb.bbrq[47] = -2195275502090066090L;
        fb.bbrq[48] = -6845854691505232134L;
        fb.bbrq[49] = -8232901045559060977L;
        fb.bbrq[50] = -3870111607335522449L;
        fb.bbrq[51] = 1120214463058609699L;
        fb.bbrq[52] = -2040566022064208197L;
        fb.bbrq[53] = 7539224143806560056L;
        fb.bbrq[54] = 8138051569595778913L;
        fb.bbrq[55] = 4208388368163228805L;
        fb.bbrq[56] = -5151735422974931213L;
        fb.bbrq[57] = 7003876152926481576L;
        fb.bbrq[58] = -6547865852688378868L;
        fb.bbrq[59] = 7296826962436614018L;
    }

    private static /* synthetic */ int bbrd(int n2) {
        return bbre[n2] ^ bbrf[n2];
    }

    private static /* synthetic */ void bbxt() {
        fb.bbre[100] = -1624877132;
        fb.bbre[101] = 1471786371;
        fb.bbre[102] = -28650101;
        fb.bbre[103] = 2122516170;
    }

    /*
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public static String protect(String var0) {
        block143: {
            block144: {
                v0 /* !! */  = fb.cv;
                if (true) ** GOTO lbl5
                block82: while (true) {
                    v0 /* !! */  = (long)(v1 - fb.bbrg("bbsq", bbro(int ), (int)17));
lbl5:
                    // 2 sources

                    switch ((int)v0 /* !! */ ) {
                        case -1585283329: {
                            v1 = fb.bbrg("bbsr", bbro(int ), (int)18);
                            continue block82;
                        }
                        case -888555565: {
                            break block82;
                        }
                        case 153880017: {
                            v1 = fb.bbrg("bbss", bbro(int ), (int)19);
                            continue block82;
                        }
                        case 331904084: {
                            v1 = fb.bbrg("bbst", bbro(int ), (int)20);
                            continue block82;
                        }
                    }
                    break;
                }
                var6_1 = fb.c;
                while (true) {
                    if ((v2 /* !! */  = (cfr_temp_1 = fb.cv - fb.bbrg("bbsu", bbro(int ), (int)21)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) == false) continue;
                    if (v2 /* !! */  == fb.bbrg("bbsv", bbrd(int ), (int)15)) break;
                    v2 /* !! */  = (long)fb.bbrg("bbsw", bbrd(int ), (int)16);
                }
                var5_2 /* !! */  = fb.b;
                while (true) {
                    if ((v3 /* !! */  = (cfr_temp_2 = fb.cv - fb.bbrg("bbsx", bbro(int ), (int)22)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1)) == false) continue;
                    if (v3 /* !! */  == fb.bbrg("bbsy", bbrd(int ), (int)17)) {
                        var4_3 = fb.a;
                        if (var6_1) {
                            throw null;
                        }
                        break;
                    }
                    v3 /* !! */  = (long)fb.bbrg("bbsz", bbrd(int ), (int)18);
                }
                if (var4_3 || var4_3) break block144;
                v4 /* !! */  = fb.cv;
                if (true) ** GOTO lbl173
            }
            block85: while (true) {
                if (var5_2 /* !! */  == 0) return null;
                cfr_temp_0 = -2147483648;
                while (true) {
                    switch (cfr_temp_0 == -2147483648 ? var5_2 /* !! */  : cfr_temp_0) {
                        default: {
                            return null;
                        }
                        case 0: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvf", bbrd(int ), (int)39);
                            cfr_temp_0 = 19;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 2: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvh", bbrd(int ), (int)41);
                            cfr_temp_0 = 7;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 4: {
                            ** GOTO lbl135
                        }
                        case 7: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvm", bbrd(int ), (int)46);
                            cfr_temp_0 = 10;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 8: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvn", bbrd(int ), (int)47);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 10: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvp", bbrd(int ), (int)49);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 1: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvg", bbrd(int ), (int)40);
                            cfr_temp_0 = 19;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 11: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvq", bbrd(int ), (int)50);
                            cfr_temp_0 = 20;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 13: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvs", bbrd(int ), (int)52);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 12: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvr", bbrd(int ), (int)51);
                            cfr_temp_0 = 21;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 14: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvt", bbrd(int ), (int)53);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 3: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvi", bbrd(int ), (int)42);
                            cfr_temp_0 = 22;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 15: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvu", bbrd(int ), (int)54);
                            cfr_temp_0 = 26;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 17: {
                            do {
                                var5_2 /* !! */  = (int)fb.bbrg("bbvw", bbrd(int ), (int)56);
                            } while (!var6_1);
                            throw null;
                        }
                        case 20: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvz", bbrd(int ), (int)59);
                            cfr_temp_0 = 5;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 24: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbwd", bbrd(int ), (int)63);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 26: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbwf", bbrd(int ), (int)65);
                            cfr_temp_0 = 19;
                            if (var6_1) {
                                throw null;
                            }
                            break block143;
                        }
                        case 28: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbwh", bbrd(int ), (int)67);
                            if (var6_1) {
                                throw null;
                            }
lbl135:
                            // 3 sources

                            var5_2 /* !! */  = (int)fb.bbrg("bbvj", bbrd(int ), (int)43);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 5: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvk", bbrd(int ), (int)44);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 18: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvx", bbrd(int ), (int)57);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 6: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvl", bbrd(int ), (int)45);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 27: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbwg", bbrd(int ), (int)66);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 21: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbwa", bbrd(int ), (int)60);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 19: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvy", bbrd(int ), (int)58);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 23: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbwc", bbrd(int ), (int)62);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 25: {
                            do {
                                var5_2 /* !! */  = (int)fb.bbrg("bbwe", bbrd(int ), (int)64);
                            } while (!var6_1);
                            throw null;
                        }
                        block89: while (true) {
                            v4 /* !! */  = (long)(v5 - fb.bbrg("bbta", bbro(int ), (int)23));
lbl173:
                            // 2 sources

                            switch ((int)v4 /* !! */ ) {
                                case -888555565: {
                                    break block89;
                                }
                                case 754951500: {
                                    v5 = fb.bbrg("bbtb", bbro(int ), (int)24);
                                    continue block89;
                                }
                                case 1638870119: {
                                    v5 = fb.bbrg("bbtc", bbro(int ), (int)25);
                                    continue block89;
                                }
                            }
                            break;
                        }
                        var1_4 = fb.instance;
                        if (var4_3 || var4_3) continue block85;
                        if (var0 == null) ** GOTO lbl218
                        if (var4_3) continue block85;
                        if (var1_4 == null) ** GOTO lbl218
                        if (var4_3) continue block85;
                        while (true) {
                            if ((v6 /* !! */  = (cfr_temp_3 = fb.cv - fb.bbrg("bbtd", bbro(int ), (int)26)) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1)) == false) continue;
                            if (v6 /* !! */  != fb.bbrg("bbte", bbrd(int ), (int)19)) ** GOTO lbl194
                            if (var1_4.isState()) {
                                break;
                            }
                            ** GOTO lbl218
lbl194:
                            // 1 sources

                            v6 /* !! */  = (long)fb.bbrg("bbtf", bbrd(int ), (int)20);
                        }
                        if (var4_3) continue block85;
                        while (true) {
                            if ((v7 /* !! */  = (cfr_temp_4 = fb.cv - fb.bbrg("bbtg", bbro(int ), (int)27)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) == false) continue;
                            if (v7 /* !! */  != fb.bbrg("bbth", bbrd(int ), (int)21)) ** GOTO lbl202
                            v8 /* !! */  = fb.cv;
                            if (true) ** GOTO lbl206
lbl202:
                            // 1 sources

                            v7 /* !! */  = (long)fb.bbrg("bbti", bbrd(int ), (int)22);
                        }
                        block92: while (true) {
                            v8 /* !! */  = (long)(v9 - fb.bbrg("bbtj", bbro(int ), (int)28));
lbl206:
                            // 2 sources

                            switch ((int)v8 /* !! */ ) {
                                case -888555565: {
                                    break block92;
                                }
                                case 1110831193: {
                                    v9 = fb.bbrg("bbtk", bbro(int ), (int)29);
                                    continue block92;
                                }
                                case 1137057868: {
                                    v9 = fb.bbrg("bbtl", bbro(int ), (int)30);
                                    continue block92;
                                }
                            }
                            break;
                        }
                        if (fb.mc.method_1548() == null) {
                            if (var4_3) continue block85;
                        }
                        ** GOTO lbl220
lbl218:
                        // 4 sources

                        if (var4_3 || var4_3) continue block85;
                        return var0;
lbl220:
                        // 1 sources

                        if (var4_3 || var4_3) continue block85;
                        while (true) {
                            if ((v10 /* !! */  = (cfr_temp_5 = fb.cv - fb.bbrg("bbtm", bbro(int ), (int)31)) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1)) == false) continue;
                            if (v10 /* !! */  == fb.bbrg("bbtn", bbrd(int ), (int)23)) break;
                            v10 /* !! */  = (long)fb.bbrg("bbto", bbrd(int ), (int)24);
                        }
                        while (true) {
                            if ((v11 /* !! */  = (cfr_temp_6 = fb.cv - fb.bbrg("bbtp", bbro(int ), (int)32)) == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1)) == false) continue;
                            if (v11 /* !! */  == fb.bbrg("bbtq", bbrd(int ), (int)25)) break;
                            v11 /* !! */  = (long)fb.bbrg("bbtr", bbrd(int ), (int)26);
                        }
                        v12 = fb.mc.method_1548();
                        while (true) {
                            if ((v13 /* !! */  = (cfr_temp_7 = fb.cv - fb.bbrg("bbts", bbro(int ), (int)33)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) == false) continue;
                            if (v13 /* !! */  == fb.bbrg("bbtt", bbrd(int ), (int)27)) break;
                            v13 /* !! */  = (long)fb.bbrg("bbtu", bbrd(int ), (int)28);
                        }
                        v14 = v12.method_1676();
                        while (true) {
                            if ((v15 /* !! */  = (cfr_temp_8 = fb.cv - fb.bbrg("bbtv", bbro(int ), (int)34)) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1)) == false) continue;
                            if (v15 /* !! */  != fb.bbrg("bbtw", bbrd(int ), (int)29)) ** GOTO lbl244
                            v16 = var1_4.replacement;
                            v17 /* !! */  = fb.cv;
                            if (true) ** GOTO lbl248
lbl244:
                            // 1 sources

                            v15 /* !! */  = (long)fb.bbrg("bbtx", bbrd(int ), (int)30);
                        }
                        block97: while (true) {
                            v17 /* !! */  = (long)(v18 - fb.bbrg("bbty", bbro(int ), (int)35));
lbl248:
                            // 2 sources

                            switch ((int)v17 /* !! */ ) {
                                case -888555565: {
                                    break block97;
                                }
                                case 954444362: {
                                    v18 = fb.bbrg("bbtz", bbro(int ), (int)36);
                                    continue block97;
                                }
                                case 1607593306: {
                                    v18 = fb.bbrg("bbua", bbro(int ), (int)37);
                                    continue block97;
                                }
                            }
                            break;
                        }
                        v19 = v16.getValue();
                        v20 /* !! */  = fb.cv;
                        block98: while (true) {
                            switch ((int)v20 /* !! */ ) {
                                case -888555565: {
                                    break block98;
                                }
                                case 493228327: {
                                    v20 /* !! */  = (long)(fb.bbrg("bbuc", bbro(int ), (int)39) - fb.bbrg("bbub", bbro(int ), (int)38));
                                    continue block98;
                                }
                            }
                            break;
                        }
                        var0 = fb.replaceIgnoreCase(var0, v14, v19);
                        if (var4_3 || var4_3) continue block85;
                        v21 /* !! */  = fb.cv;
                        if (true) ** GOTO lbl272
                        block99: while (true) {
                            v21 /* !! */  = (long)(v22 - fb.bbrg("bbud", bbro(int ), (int)40));
lbl272:
                            // 2 sources

                            switch ((int)v21 /* !! */ ) {
                                case -888555565: {
                                    break block99;
                                }
                                case 725316824: {
                                    v22 = fb.bbrg("bbue", bbro(int ), (int)41);
                                    continue block99;
                                }
                                case 727153179: {
                                    v22 = fb.bbrg("bbuf", bbro(int ), (int)42);
                                    continue block99;
                                }
                            }
                            break;
                        }
                        v23 = var1_4.friends;
                        while (true) {
                            if ((v24 /* !! */  = (cfr_temp_9 = fb.cv - fb.bbrg("bbug", bbro(int ), (int)43)) == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1)) == false) continue;
                            if (v24 /* !! */  != fb.bbrg("bbuh", bbrd(int ), (int)31)) ** GOTO lbl288
                            if (v23.isValue()) {
                                break;
                            }
                            ** GOTO lbl327
lbl288:
                            // 1 sources

                            v24 /* !! */  = (long)fb.bbrg("bbui", bbrd(int ), (int)32);
                        }
                        if (var4_3 || var4_3) continue block85;
                        v25 /* !! */  = fb.cv;
                        block101: while (true) {
                            switch ((int)v25 /* !! */ ) {
                                case -888555565: {
                                    break block101;
                                }
                                case 842152974: {
                                    v25 /* !! */  = (long)(fb.bbrg("bbuk", bbro(int ), (int)45) - fb.bbrg("bbuj", bbro(int ), (int)44));
                                    continue block101;
                                }
                            }
                            break;
                        }
                        v26 = dl.getFriendNames();
                        while (true) {
                            if ((v27 /* !! */  = (cfr_temp_10 = fb.cv - fb.bbrg("bbul", bbro(int ), (int)46)) == 0L ? 0 : (cfr_temp_10 < 0L ? -1 : 1)) == false) continue;
                            if (v27 /* !! */  == fb.bbrg("bbum", bbrd(int ), (int)33)) {
                                var2_5 = v26.iterator();
                                if (var4_3) continue block85;
                                break;
                            }
                            v27 /* !! */  = (long)fb.bbrg("bbun", bbrd(int ), (int)34);
                        }
                        do {
                            if (var4_3 || var4_3) continue block85;
                            v28 /* !! */  = fb.cv;
                            if (true) ** GOTO lbl314
                            block104: while (true) {
                                v28 /* !! */  = (long)(v29 - fb.bbrg("bbuo", bbro(int ), (int)47));
lbl314:
                                // 2 sources

                                switch ((int)v28 /* !! */ ) {
                                    case -888555565: {
                                        break block104;
                                    }
                                    case -737565969: {
                                        v29 = fb.bbrg("bbup", bbro(int ), (int)48);
                                        continue block104;
                                    }
                                    case -187931470: {
                                        v29 = fb.bbrg("bbuq", bbro(int ), (int)49);
                                        continue block104;
                                    }
                                }
                                break;
                            }
                            if (!var2_5.hasNext()) ** GOTO lbl327
                            if (var4_3) continue block85;
                            v30 /* !! */  = fb.cv;
                            if (true) ** GOTO lbl331
lbl327:
                            // 2 sources

                            if (var4_3 || var4_3) continue block85;
                            return var0;
                            block105: while (true) {
                                v30 /* !! */  = (long)(v31 - fb.bbrg("bbur", bbro(int ), (int)50));
lbl331:
                                // 2 sources

                                switch ((int)v30 /* !! */ ) {
                                    case -1375325628: {
                                        v31 = fb.bbrg("bbus", bbro(int ), (int)51);
                                        continue block105;
                                    }
                                    case -888555565: {
                                        break block105;
                                    }
                                    case 353769299: {
                                        v31 = fb.bbrg("bbut", bbro(int ), (int)52);
                                        continue block105;
                                    }
                                    case 549886825: {
                                        v31 = fb.bbrg("bbuu", bbro(int ), (int)53);
                                        continue block105;
                                    }
                                }
                                break;
                            }
                            var3_6 = var2_5.next();
                            if (var4_3 || var4_3) continue block85;
                            v32 /* !! */  = fb.cv;
                            if (true) ** GOTO lbl349
                            block106: while (true) {
                                v32 /* !! */  = (long)(v33 - fb.bbrg("bbuv", bbro(int ), (int)54));
lbl349:
                                // 2 sources

                                switch ((int)v32 /* !! */ ) {
                                    case -1851901224: {
                                        v33 = fb.bbrg("bbuw", bbro(int ), (int)55);
                                        continue block106;
                                    }
                                    case -1358616769: {
                                        v33 = fb.bbrg("bbux", bbro(int ), (int)56);
                                        continue block106;
                                    }
                                    case -888555565: {
                                        break block106;
                                    }
                                    case 475232235: {
                                        v33 = fb.bbrg("bbuy", bbro(int ), (int)57);
                                        continue block106;
                                    }
                                }
                                break;
                            }
                            v34 = var1_4.replacement;
                            while (true) {
                                if ((v35 /* !! */  = (cfr_temp_11 = fb.cv - fb.bbrg("bbuz", bbro(int ), (int)58)) == 0L ? 0 : (cfr_temp_11 < 0L ? -1 : 1)) == false) continue;
                                if (v35 /* !! */  == fb.bbrg("bbva", bbrd(int ), (int)35)) break;
                                v35 /* !! */  = (long)fb.bbrg("bbvb", bbrd(int ), (int)36);
                            }
                            v36 = v34.getValue();
                            while (true) {
                                if ((v37 /* !! */  = (cfr_temp_12 = fb.cv - fb.bbrg("bbvc", bbro(int ), (int)59)) == 0L ? 0 : (cfr_temp_12 < 0L ? -1 : 1)) == false) continue;
                                if (v37 /* !! */  == fb.bbrg("bbvd", bbrd(int ), (int)37)) {
                                    var0 = fb.replaceIgnoreCase(var0, var3_6, v36);
                                    if (var4_3) continue block85;
                                    break;
                                }
                                v37 /* !! */  = (long)fb.bbrg("bbve", bbrd(int ), (int)38);
                            }
                            if (!var4_3) ** break;
                            continue block85;
                        } while (!var6_1);
                        throw null;
                        case 9: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvo", bbrd(int ), (int)48);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 16: {
                            var5_2 /* !! */  = (int)fb.bbrg("bbvv", bbrd(int ), (int)55);
                            if (var6_1) {
                                throw null;
                            }
                        }
                        case 22: 
                    }
                    break;
                }
                break;
            }
            ** GOTO lbl393
        }
        do {
            if (true) ** continue;
lbl393:
            // 2 sources

            var5_2 /* !! */  = (int)fb.bbrg("bbwb", bbrd(int ), (int)61);
            cfr_temp_0 = 9;
        } while (!var6_1);
        throw null;
    }
}

